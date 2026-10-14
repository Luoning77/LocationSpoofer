# Compatible with Windows PowerShell 5.1; all arguments belong to Gradle.
$gradleArguments = @($args)
$ErrorActionPreference = 'Stop'
$projectRoot = Split-Path -Parent $PSScriptRoot
$environmentNames = @('JAVA_HOME', 'GRADLE_USER_HOME', 'ANDROID_HOME', 'ANDROID_SDK_ROOT', 'ANDROID_USER_HOME', 'JAVA_TOOL_OPTIONS')
$savedEnvironment = @{}
foreach ($name in $environmentNames) {
    $savedEnvironment[$name] = [Environment]::GetEnvironmentVariable($name, 'Process')
}

$locationChanged = $false
$gradleExitCode = 1

try {
    $javaCandidates = @((Join-Path $projectRoot '.tools\jdk-17'))
    if ($env:JAVA_HOME) {
        $javaCandidates += $env:JAVA_HOME.Trim('"')
    }
    $pathJava = Get-Command java.exe -CommandType Application -ErrorAction SilentlyContinue |
        Select-Object -First 1
    if ($pathJava) {
        $javaCandidates += Split-Path -Parent (Split-Path -Parent $pathJava.Source)
    }

    $javaHome = $null
    foreach ($candidate in $javaCandidates) {
        if ((Test-Path -LiteralPath (Join-Path $candidate 'bin\java.exe') -PathType Leaf) -and
            (Test-Path -LiteralPath (Join-Path $candidate 'bin\javac.exe') -PathType Leaf)) {
            $javaHome = (Resolve-Path -LiteralPath $candidate).Path
            break
        }
    }
    if (-not $javaHome) {
        throw 'JDK not found. Put JDK 17 in .tools\jdk-17 (bin\java.exe and bin\javac.exe), or set JAVA_HOME / PATH to an installed JDK. See docs\development-windows.md.'
    }
    $env:JAVA_HOME = $javaHome

    if (-not $env:GRADLE_USER_HOME) {
        $env:GRADLE_USER_HOME = Join-Path $projectRoot '.gradle-home'
    }
    if (-not $env:ANDROID_USER_HOME) {
        $env:ANDROID_USER_HOME = Join-Path $projectRoot '.android'
    }

    $sdkCandidates = @((Join-Path $projectRoot '.android-sdk'), $env:ANDROID_HOME, $env:ANDROID_SDK_ROOT)
    $sdkHome = $null
    foreach ($candidate in $sdkCandidates) {
        if ($candidate -and (Test-Path -LiteralPath $candidate -PathType Container)) {
            $sdkHome = (Resolve-Path -LiteralPath $candidate).Path
            break
        }
    }
    if ($sdkHome) {
        $env:ANDROID_HOME = $sdkHome
        $env:ANDROID_SDK_ROOT = $sdkHome
    } elseif (-not (Test-Path -LiteralPath (Join-Path $projectRoot 'local.properties') -PathType Leaf)) {
        throw 'Android SDK not found. Prepare .android-sdk, set ANDROID_HOME, or configure sdk.dir in local.properties. See docs\development-windows.md.'
    }

    $wrapper = Join-Path $projectRoot 'gradlew.bat'
    if (-not (Test-Path -LiteralPath $wrapper -PathType Leaf)) {
        throw 'gradlew.bat was not found in the project root.'
    }

    if ($env:JAVA_TOOL_OPTIONS -notmatch '(?:^|[\s"''])-Djdk\.net\.unixdomain\.tmpdir(?:=|$|[\s"''])') {
        # A project-local socket directory avoids Windows AF_UNIX loopback failures.
        $socketTemp = Join-Path $projectRoot '.gradle-home\tmp'
        [IO.Directory]::CreateDirectory($socketTemp) | Out-Null
        $socketOption = '"-Djdk.net.unixdomain.tmpdir=' + $socketTemp + '"'
        if ($env:JAVA_TOOL_OPTIONS) {
            $env:JAVA_TOOL_OPTIONS += ' ' + $socketOption
        } else {
            $env:JAVA_TOOL_OPTIONS = $socketOption
        }
    }

    Push-Location -LiteralPath $projectRoot
    $locationChanged = $true
    # The daemon uses JDK 21; explicitly expose the launcher JDK to toolchain detection.
    & $wrapper "-Porg.gradle.java.installations.paths=$javaHome" @gradleArguments
    $gradleExitCode = $LASTEXITCODE
} catch {
    [Console]::Error.WriteLine('[gradle.ps1] ' + $_.Exception.Message)
} finally {
    if ($locationChanged) {
        Pop-Location
    }
    foreach ($name in $environmentNames) {
        [Environment]::SetEnvironmentVariable($name, $savedEnvironment[$name], 'Process')
    }
}

exit $gradleExitCode
