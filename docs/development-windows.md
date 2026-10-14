# Windows 本地开发

仓库声明的版本为 Gradle 9.6.1、Android Gradle Plugin 9.3.1、Kotlin 2.1.10，Android SDK 平台为 API 37，最低支持 API 26。以下命令用于准备和验证开发环境。

## 环境布局

推荐把本机依赖放在项目根目录下：

```text
.tools/jdk-17/bin/java.exe
.tools/jdk-17/bin/javac.exe
.android-sdk/
.android/
.gradle-home/
local.properties
```

`local.properties` 的 `sdk.dir` 应指向实际 Android SDK 根目录，Windows 路径建议使用正斜杠。以下为纯 ASCII 路径示例，需替换成自己的路径：

```properties
sdk.dir=D:/dev/LocationSpoofer/.android-sdk
```

该文件使用 Java Properties 格式；如果实际路径含中文，应将非 ASCII 字符写成 `\uXXXX` 转义，避免不同读取方式导致乱码。

当前项目路径含中文，本机已在忽略的 `.gradle-home/gradle.properties` 中设置 `android.overridePathCheck=true`，允许 AGP 继续构建。其他机器如果遇到相同的非 ASCII 项目路径检查错误，可在各自 `GRADLE_USER_HOME/gradle.properties` 中添加此项；不需要修改仓库根目录的 `gradle.properties`，入口也不会自动覆盖该选项。

本机 Windows 的 Java 启动器按 GBK 读取参数文件。Gradle 以 UTF-8 写入含中文路径的参数文件时，测试进程会找不到 `GradleWorkerMain`；Kotlin 独立编译进程也会错误解析路径。本机 Gradle 用户配置因此使用以下设置，让参数文件编码一致，并在 Gradle 进程内编译 Kotlin：

```properties
android.overridePathCheck=true
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=GBK
kotlin.compiler.execution.strategy=in-process
```

这些设置只用于当前 Windows 环境，不改变源文件的 UTF-8 编码，也不覆盖仓库默认配置。其他操作系统或采用不同系统编码的机器不应直接照搬 `GBK` 设置。

SDK 37 的正式安装包名为 `platforms;android-37.0`；本地准备 `build-tools;37.0.0` 和设备调试需要的 `platform-tools`。Build Tools 最终由 AGP 选择。首次下载 Gradle、JDK 和 Maven 依赖需要网络。依赖下载或 SDK 安装报错时应先解决对应错误，再继续构建。

本项目有两个不同用途的 Java 版本：

- **JDK 17**：启动 Wrapper，并满足 `core-geo` 的 `jvmToolchain(17)`；各 Android 模块的 Java/Kotlin 字节码目标也是 17。
- **JDK 21**：`gradle/gradle-daemon-jvm.properties` 固定的 Gradle daemon 运行环境。Gradle 会按该文件的下载地址准备 JDK 21 并缓存，不能只凭 `JAVA_HOME` 是 17 就判断 daemon 版本错误。

## PowerShell 入口

从项目根目录运行：

```powershell
.\tools\gradle.ps1 --version
.\tools\gradle.ps1 :core-geo:javaToolchains
.\tools\gradle.ps1 :core-geo:test
```

入口兼容 Windows PowerShell 5.1，会优先使用 `.tools/jdk-17`，其次使用 `JAVA_HOME`，最后查找 `PATH` 中 `java.exe` 所在的 JDK。候选目录必须同时包含 `bin/java.exe` 与 `bin/javac.exe`。选中的 JDK 会显式提供给 Gradle 的 toolchain 检测；如果回退到了其他版本，仍需确保 JDK 17 可被 Gradle 找到。

没有设置 `GRADLE_USER_HOME` 时，入口使用项目内 `.gradle-home`；没有设置 `ANDROID_USER_HOME` 时，使用项目内 `.android` 保存 Android 用户配置与调试签名等文件。已有设置会保留。SDK 环境优先采用 `.android-sdk`，再尝试 `ANDROID_HOME` 和 `ANDROID_SDK_ROOT`；也支持只在 `local.properties` 中配置 `sdk.dir`。这些 SDK 路径应保持一致。

入口还会创建 `.gradle-home/tmp`，通过本次进程的 `JAVA_TOOL_OPTIONS` 将它设为 Java socket 临时目录，解决本机出现的 `Unable to establish loopback connection` / `Invalid argument: connect` 错误。已有 Java 选项会保留；如果已指定 `jdk.net.unixdomain.tmpdir`，入口尊重该设置。运行结束后恢复原来的 `JAVA_TOOL_OPTIONS`。

脚本以自身位置定位项目，切换到项目根目录后调用 `gradlew.bat`，不依赖调用时所在目录。参数与 Gradle 退出码会传递给调用者，运行结束后恢复调用者的工作目录和进程环境变量，不修改系统环境变量。

## 单元测试与打包

先检查 Java 版本与 SDK 配置，再按需运行单元测试：

```powershell
.\tools\gradle.ps1 :core-geo:test
.\tools\gradle.ps1 :core-data:testScopedDebugUnitTest :xposed:testScopedDebugUnitTest :app-ui:testScopedDebugUnitTest
.\tools\gradle.ps1 :core-data:testGlobalDebugUnitTest :xposed:testGlobalDebugUnitTest :app-ui:testGlobalDebugUnitTest
```

`scoped` 和 `global` 两种方案必须**分次调用**打包命令：

```powershell
.\tools\gradle.ps1 :app:assembleScopedDebug
.\tools\gradle.ps1 :app:assembleGlobalDebug
```

APK 分别输出到 `app/build/outputs/apk/scoped/debug/` 和 `app/build/outputs/apk/global/debug/`，按 `arm64-v8a`、`armeabi-v7a` 拆分。Debug 构建未配置发布密钥时自动使用调试签名，不需要为了本地初始化申请发布密钥。Google Maps Key 可留空，需要 Google 地图时再配置。

连接测试设备后，选择一种方案安装：

```powershell
.\tools\gradle.ps1 :app:installScopedDebug
# 或
.\tools\gradle.ps1 :app:installGlobalDebug
```

Root、LSPosed 及模块激活属于设备运行验证的前提，本地编译和单元测试不需要连接手机。`tools/test_framework_config.py` 与 `tools/test_environment_refresh.py` 会通过 ADB 调用设备测试入口，执行前需要安装对应 Debug APK 和测试 APK，并满足脚本注明的设备条件。
