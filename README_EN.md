# LocationSpoofer

> System-level location spoofing and wireless environment simulation framework: KernelSU / LSPosed based fake environment that stands up to deep risk-control checks.

🌐 English | [简体中文](README.md)

[![License: GPL-3.0](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](LICENSE)
[![Android](https://img.shields.io/badge/Android-8.0%2B-green.svg)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0%2B-purple.svg)](https://kotlinlang.org)
[![Compose](https://img.shields.io/badge/Jetpack-Compose-4285F4.svg)](https://developer.android.com/jetpack/compose)
[![KernelSU](https://img.shields.io/badge/Root-KernelSU-orange.svg)](https://kernelsu.org)
[![LSPosed](https://img.shields.io/badge/LSPosed-API%20101%2B-purple.svg)](https://github.com/LSPosed/LSPosed)
[![Version](https://img.shields.io/badge/version-3.1.0-brightgreen.svg)](https://github.com/Luoning77/LocationSpoofer)

---

## 📖 Introduction

Standard Android "Mock Location" is already a high-risk signal for commercial SDKs (AMap Security, Tencent, Baidu, NetEase EasyShield, attendance systems). They do not only check `isFromMockProvider` / `isMock` — they cross-check Wi-Fi fingerprints, cellular cells, BLE beacons, GNSS satellite matrices, sensor gait, and run FFT / dispersion analysis on coordinate streams.

**LocationSpoofer** obtains root via **KernelSU / APatch / Magisk** and injects the target process at Zygote with **LSPosed (libxposed API 101+)**. It spoofs location, satellites, cells, Wi-Fi, Bluetooth, and sensors at the system layer so apps see a physically consistent fake environment.

- Two flavors: `scoped` (hook target apps) / `global` (hook system processes)
- Version: **3.1.0**

---

## ✨ Features

### 🎯 Location & physical simulation

| Feature | Description |
|---------|-------------|
| Triple map engine | AMap 3D / Baidu Maps / Google Maps (Google needs your own key) |
| CRS auto-mapping | WGS-84 at system APIs; GCJ-02 / BD-09 for map SDKs |
| GPS noise | Ornstein-Uhlenbeck jitter, ~4 m 3-sigma bound |
| Gait lateral sway | Gaussian lateral offset while walking / running |
| Altitude / accuracy drift | Simulates tropospheric delay and geometry changes |
| Floating joystick | Damped steering, 0–10 m/s continuous speed |

### 📡 Radio & environment

| Feature | Description |
|---------|-------------|
| Wi-Fi spoof | Scan results, connection info, configured networks, DHCP |
| Cell spoof | GSM / WCDMA / CDMA / LTE / 5G NR cells and signal |
| BLE beacons | Scan filtering and virtual beacon delivery |
| Field scanner | Capture real Wi-Fi / cells / BLE while walking |
| IDW interpolation | Inverse-distance weighting over nearby samples |
| Cloud import | Optional WiGLE / OpenCellID pull into local cache |

### 🛰️ GNSS & sensors

| Feature | Description |
|---------|-------------|
| Satellite matrix | 20+ GPS / BeiDou / GLONASS entries via `GnssStatus` |
| NMEA stream | Live `$GPGGA` / `$GPRMC` / `$GPGSA` / `$GPGSV` with checksums |
| Step counters | Continuous, reproducible `TYPE_STEP_COUNTER` / `DETECTOR` |
| Native accel engine | `liblocation_accel.so` + ShadowHook local sensor spoof |

### 🛡️ Anti-detection

| Feature | Description |
|---------|-------------|
| Mock flag scrub | `isFromMockProvider` / `isMock` / internal fields / extras |
| AppOps bypass | `OP_MOCK_LOCATION` returns ignore |
| Settings override | `mock_location` / `allow_mock_location` read as 0 |
| Stack scrubbing | Strip Xposed / LSPosed frames from traces |
| ClassLoader isolation | Feature-class probes get `ClassNotFoundException` |
| MultiDex | Capture location components in secondary dex files |

### 🗺️ Routes & check-in

| Feature | Description |
|---------|-------------|
| Road-network fit | Multi-waypoint routing that follows real roads |
| Traffic-light dwell | Auto stop ~15 s at lights, then smooth accel |
| Route playback | Walking / cycling / driving with step cadence |

### 📱 UI

| Feature | Description |
|---------|-------------|
| Jetpack Compose | Liquid-glass UI, inner shadows, damped gestures |
| Hook status page | Per-component “class found / method hooked” report |
| Data manager | Pin or edit Wi-Fi / cell / BLE samples |

---

## 🚀 Getting started

### Requirements

| Item | Requirement |
|------|-------------|
| Device | ARM64 preferred (sensor engine is arm64-v8a only) |
| OS | Android 8.0+ (fully tested: HyperOS 4; partial: ColorOS 16) |
| Root | KernelSU / APatch / Magisk |
| Framework | LSPosed (libxposed API 101+, remote config required) |

### Install

1. Download the flavor from [Releases](https://github.com/Luoning77/LocationSpoofer/releases)  
   - **global** for system-wide spoofing, **scoped** for target apps only
2. Install the APK and enable the module in LSPosed
3. Grant scopes (system processes for global; target apps for scoped)
4. Reboot the scope / device
5. Open the app → pick a point or enter coordinates → start spoofing
6. For global, check **System adaptation → Hook status** after reboot

### Build from source

```bash
export JAVA_HOME=/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home
./gradlew -Dhttp.nonProxyHosts="*" :app:assembleGlobalDebug
# Output: app/build/outputs/apk/global/debug/app-global-arm64-v8a-debug.apk
```

Scoped flavor: `:app:assembleScopedDebug`

---

## ⚙️ Configuration

| Setting | Where | Notes |
|---------|-------|-------|
| Google Maps key | In-app Settings | Optional |
| Force CRS | Per-app CRS | WGS-84 / GCJ-02 / BD-09 |
| WiGLE / OpenCellID | Data sources | Optional online import |
| Motion mode | Home screen | Still / walk / run / cycle / drive / custom |

Config is published over libxposed remote preferences / remote files into the hook process memory cache. Large JSON goes to a remote file + pointer to avoid Binder transaction limits.

---

## 🏗️ Architecture

| Module | Type | Role |
|--------|------|------|
| `app` | Android App | Host shell, packaging, DI aggregation |
| `app-ui` | Android Library | Compose UI and ViewModels |
| `service` | Android Library | Foreground service, joystick, boot receiver |
| `xposed` | Android Library | LSPosed entry and hooks |
| `core-data` | Android Library | Room, repositories, config, scanner |
| `core-geo` | Pure Kotlin | Coordinates, routes, motion realism, ROM rules |

Data flow: `app` / `service` publish a config snapshot → framework remote-config channel → `LocationHooker` memory cache in the target process → hooks read the cache.

---

## 📊 Adaptation status (summary)

Full tables: [ADAPTATION_PROGRESS.md](ADAPTATION_PROGRESS.md)

| System | Adapter | Status |
|--------|---------|--------|
| Xiaomi HyperOS / MIUI | `HyperOsVendor` | ✅ HyperOS 4 fully tested; HyperOS 3 location OK |
| OPPO ColorOS / OnePlus | `ColorOs16Vendor` / `ColorOsVendor` | ⚠️ Partially tested |
| Samsung One UI | `OneUiVendor` | ❔ Unverified |
| Other / AOSP | `AospVendor` | ❔ Unverified |

Target app compatibility (global): AMap, Baidu Maps, WeChat, TIM ✅; Taobao / Xianyu ⚠️ (location spoofed, but sending location may still fail server-side IP checks).

Docs:

- [vendor/README.md](xposed/src/main/java/com/vincenthzr/locationspoofer/xposed/hooks/vendor/README.md) — vendor adapter framework and checklist
- [ADAPTATION_GUIDE.md](xposed/ADAPTATION_GUIDE.md) — locate system classes / debug hook status

---

## ⚠️ Notes

> 🚫 Only use this project on environments and accounts you are allowed to test. Misuse may ban accounts or violate local law and ToS.

- `liblocation_accel.so` ships **arm64-v8a only**
- After upgrade / reinstall, reboot scope or device and re-check hook status
- Map tiles and POI search use the network
- This project does not aim for a 1:1 UI clone of any official client

---

## 📸 Screenshots

(See Releases or community channels; PRs welcome)

---

## 🙏 Credits

- [LSPosed](https://github.com/LSPosed/LSPosed) / [libxposed](https://github.com/libxposed) — injection framework
- [KernelSU](https://kernelsu.org), [APatch](https://apatch.dev), [Magisk](https://github.com/topjohnwu/Magisk) — root solutions
- ShadowHook — native inline hook (shipped as `libshadowhook.so`, LSPosed ecosystem)
- AMap / Baidu / Google Maps SDKs
- [WiGLE](https://wigle.net/), [OpenCellID](https://opencellid.org/) — optional environment data sources

---

## 📄 License

[GPL-3.0](LICENSE)
