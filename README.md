# LocationSpoofer

> 系统级虚拟定位与无线环境伪装框架：基于 KernelSU / LSPosed，为高风控 Android 应用提供自洽、可过深度检测的假环境。

🌐 [English](README_EN.md) | 简体中文

[![License: GPL-3.0](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](LICENSE)
[![Android](https://img.shields.io/badge/Android-8.0%2B-green.svg)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0%2B-purple.svg)](https://kotlinlang.org)
[![Compose](https://img.shields.io/badge/Jetpack-Compose-4285F4.svg)](https://developer.android.com/jetpack/compose)
[![KernelSU](https://img.shields.io/badge/Root-KernelSU-orange.svg)](https://kernelsu.org)
[![LSPosed](https://img.shields.io/badge/LSPosed-API%20101%2B-purple.svg)](https://github.com/LSPosed/LSPosed)
[![Version](https://img.shields.io/badge/version-3.1.0-brightgreen.svg)](https://github.com/Luoning77/LocationSpoofer)

---

## 📖 简介

传统「模拟位置」开发者选项已被高德风控、腾讯安全、百度定位、网易易盾等商业 SDK 标记为高风险特征。它们不仅检查 `isFromMockProvider` / `isMock`，还会交叉比对 Wi-Fi 指纹、蜂窝基站、BLE 信标、GNSS 卫星矩阵与传感器步态，并对坐标序列做 FFT / 离散度分析。

**LocationSpoofer** 通过 **KernelSU / APatch / Magisk** 获取 Root，用 **LSPosed（libxposed API 101+）** 在 Zygote 阶段注入目标进程，系统级拦截并伪造位置、卫星、基站、Wi-Fi、蓝牙、传感器等底层 API，输出物理上自洽的虚假环境指纹。

- 双方案：`scoped`（Hook 目标 App）/ `global`（Hook 系统进程）
- 版本：**3.1.0**

---

## ✨ 功能一览

### 🎯 空间定位与物理仿真

| 功能 | 说明 |
|------|------|
| 三地图引擎 | 高德 3D / 百度地图 / Google Maps 可切换（Google 需自填 Key） |
| 坐标系自适应 | 系统侧统一 WGS-84；地图 SDK 自动映射 GCJ-02 / BD-09 |
| GPS 物理抖动 | Ornstein-Uhlenbeck 均值回归噪声，3-Sigma 限幅约 4 m |
| 步态横向摇摆 | 步行/跑步时沿正交方向加高斯横向位移 |
| 高度与精度慢漂移 | 模拟对流层延迟与卫星几何变化 |
| 悬浮摇杆 | 阻尼转向，0 ~ 10 m/s 无级调速 |

### 📡 无线电与环境模拟

| 功能 | 说明 |
|------|------|
| Wi-Fi 伪装 | 扫描结果、连接信息、已配置网络、DHCP |
| 基站模拟 | GSM / WCDMA / CDMA / LTE / 5G NR 小区与信号强度 |
| BLE 信标 | 蓝牙扫描结果过滤与虚拟信标派发 |
| 实地扫描器 | EnvironmentScanner 采集真实 Wi-Fi / 基站 / BLE |
| IDW 插值 | 周边 50 m 历史点反距离加权，信号连续渐变 |
| 云端导入 | WiGLE / OpenCellID 拉取真实环境数据入库缓存 |

### 🛰️ GNSS 与传感器

| 功能 | 说明 |
|------|------|
| 卫星矩阵 | GnssStatus 注入 20+ 颗 GPS / 北斗 / GLONASS 卫星状态 |
| NMEA 语句流 | 动态拼装 `$GPGGA` / `$GPRMC` / `$GPGSA` / `$GPGSV` 并校验 |
| 计步联动 | `TYPE_STEP_COUNTER` / `TYPE_STEP_DETECTOR` 连续可复现 |
| 原生加速度引擎 | `liblocation_accel.so` + ShadowHook 本地传感器伪造 |

### 🛡️ 反检测套件

| 功能 | 说明 |
|------|------|
| Mock 标志抹除 | `isFromMockProvider` / `isMock` / 内部字段 / Bundle 标记 |
| AppOps 规避 | `OP_MOCK_LOCATION` 查询返回忽略 |
| Settings 覆写 | `mock_location` / `allow_mock_location` 读零 |
| 堆栈清洗 | 过滤 Xposed / LSPosed 特征调用帧 |
| ClassLoader 隔离 | 特征类探测返回 `ClassNotFoundException` |
| MultiDex | 动态捕获次级 Dex 中的定位组件 |

### 🗺️ 路线与打卡

| 功能 | 说明 |
|------|------|
| 真实路网拟合 | 多点路径规划，避免直线穿墙 |
| 红绿灯驻留 | 路口自动停约 15 s 再平滑起步 |
| 路线回放 | 步行 / 骑行 / 驾驶模式与步频联动 |

### 📱 界面

| 功能 | 说明 |
|------|------|
| Jetpack Compose | 模块化液态玻璃 UI、内阴影、阻尼手势 |
| Hook 运行状态 | 逐组件报告类是否找到、方法是否挂上 |
| 采集数据管理 | 手动指定 / 编辑 Wi-Fi、基站、蓝牙条目 |

---

## 🚀 快速开始

### 环境要求

| 项目 | 要求 |
|------|------|
| 设备 | ARM64 优先（传感器引擎仅提供 arm64-v8a） |
| 系统 | Android 8.0+（实测：HyperOS 4 完整；ColorOS 16 部分） |
| Root | KernelSU / APatch / Magisk |
| 框架 | LSPosed（libxposed API 101+，需支持远程配置） |

### 安装步骤

1. 从 [Releases](https://github.com/Luoning77/LocationSpoofer/releases) 下载对应变体 APK  
   - 全局伪装选 **global**，仅 Hook 目标 App 选 **scoped**
2. 安装 APK，在 LSPosed 中启用模块
3. `global`：按提示勾选系统相关作用域；`scoped`：只勾选目标应用
4. 重启作用域 / 重启设备
5. 打开 App → 在地图选点或输入坐标 → 开启模拟
6. `global` 可在「系统适配 → Hook 运行状态」确认各组件挂载

### 开发者构建

```bash
export JAVA_HOME=/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home
./gradlew -Dhttp.nonProxyHosts="*" :app:assembleGlobalDebug
# 产物: app/build/outputs/apk/global/debug/app-global-arm64-v8a-debug.apk
```

也可构建 scoped 变体：`:app:assembleScopedDebug`

---

## ⚙️ 配置

| 配置项 | 位置 | 说明 |
|--------|------|------|
| Google Maps Key | App 内「设置」 | 可选；不填则不启用 Google 地图 |
| 坐标系强制 | 「配置应用坐标系」 | 可为指定 App 强制 WGS-84 / GCJ-02 / BD-09 |
| WiGLE / OpenCellID | 数据源设置 | 可选，在线导入真实 Wi-Fi / 基站 |
| 模拟运动状态 | 主页模式选择 | 静止 / 步行 / 跑步 / 骑行 / 驾驶 / 自定义 |

配置通过 libxposed 远程偏好 / 远程文件下发到 Hook 进程；超大 JSON 走独立远程文件 + 文件指针，避免 Binder 事务超限。

---

## 🏗️ 系统架构

| 模块 | 类型 | 职责 |
|------|------|------|
| `app` | Android App | 宿主壳、签名打包、聚合 DI，打包 xposed 产物 |
| `app-ui` | Android Library | 全部 Compose UI 与 ViewModel |
| `service` | Android Library | 前台服务、悬浮摇杆、开机自启 |
| `xposed` | Android Library | LSPosed 注入与各类 Hook 实现 |
| `core-data` | Android Library | Room、Repository、ConfigManager、扫描器 |
| `core-geo` | 纯 Kotlin | 坐标系、路线几何、运动真实感、ROM 规则 |

数据流简述：`app` / `service` 发布配置快照 → 框架远程配置通道 → 目标进程 `LocationHooker` 内存缓存 → 各 Hook 只读生效。

---

## 📊 适配进度（摘要）

完整表见 [ADAPTATION_PROGRESS.md](ADAPTATION_PROGRESS.md)。

| 系统 | 适配器 | 状态 |
|------|--------|------|
| 小米 HyperOS / MIUI | `HyperOsVendor` | ✅ HyperOS 4 完整实测；HyperOS 3 定位可用 |
| OPPO ColorOS / 一加 | `ColorOs16Vendor` / `ColorOsVendor` | ⚠️ 部分实测 |
| 三星 One UI | `OneUiVendor` | ❔ 未验证 |
| 其他 / AOSP | `AospVendor` | ❔ 未验证 |

目标 App 兼容性（global）：高德地图、百度地图、微信、TIM ✅；淘宝 / 闲鱼 ⚠️（位置已模拟，发送位置仍可能因服务端 IP 校验失败）。

适配文档：

- [vendor/README.md](xposed/src/main/java/com/vincenthzr/locationspoofer/xposed/hooks/vendor/README.md) — 厂商适配框架与新增系统清单
- [ADAPTATION_GUIDE.md](xposed/ADAPTATION_GUIDE.md) — 真机定位系统类 / 排查 Hook 状态

---

## ⚠️ 注意事项

> 🚫 请只在你有权测试的环境与账号上使用本项目；滥用可能导致账号封禁或违反当地法律与服务条款。

- 传感器 native（`liblocation_accel.so`）**仅提供 arm64-v8a**，armeabi-v7a 包无此能力
- 升级 / 重装后请重启作用域或设备，再检查「Hook 运行状态」
- 地图瓦片与 POI 搜索会联网
- 项目不做 UI 与官方客户端 1:1 还原

---

## 📸 截图

（可在 Releases 或社区频道查看界面示意；欢迎补充 PR）

---

## 🙏 致谢

- [LSPosed](https://github.com/LSPosed/LSPosed) / [libxposed](https://github.com/libxposed) — 注入框架
- [KernelSU](https://kernelsu.org)、[APatch](https://apatch.dev)、[Magisk](https://github.com/topjohnwu/Magisk) — Root 方案
- ShadowHook — inline hook 库（打包为 `libshadowhook.so`，随 LSPosed 生态使用）
- 高德 / 百度 / Google 地图 SDK — 地图与搜索
- [WiGLE](https://wigle.net/)、[OpenCellID](https://opencellid.org/) — 可选环境数据源

---

## 📄 License

[GPL-3.0](LICENSE)
