# v3.0.16 源码恢复参考树

本目录存放 `LocationSpoofer_v3.0.16_base.apk` 的 jadx 反编译产物（40MB，5,098 个 .java），
作为源码恢复期间的**参考**，不参与编译。

## 来源
- APK：`/Users/luoning/Desktop/code/rea/LocationSpoofer_v3.0.16_base.apk`（global flavor，versionName 3.0.16 / versionCode 30041）
- 构建 commit：`303f46d7648d7a934ab92ffd124b4bc806e5b1fc`（上游已 GC，源码不可寻回）
- 工具：jadx 1.5.6

## 目录导航
- `com/vincenthzr/locationspoofer/` — 自有代码 319 文件（data/service/utils/xposed），**保留原名，可直接对照回填**
- `defpackage/` — 4,057 个文件，混有被 R8 改名的自有类（UI/viewmodel/vendor/utils），需语义定位
- `androidx/ io/ okhttp3/ kotlinx/ kotlin/` — 第三方库反编译，恢复时不需要

## 已知 bad-code（jadx 失败处，共 16 处/10 文件，在自有包内）
- xposed/hooks/network/CellStateAndSignalBuilderKt.java
- xposed/hooks/network/CellInfoListBuilderKt.java
- data/motion/MotionController.java
- data/cloud/CloudRepository.java（及内部类文件）
- data/cloud/RuntimeAuthorizationManager.java（及内部类文件）
- data/db/EnvironmentDao.java
- data/sync/AccountSyncManager.java、LocalSyncData.java

## 使用约定
1. 本目录内容只读，不做手工修改（保持与反编译产物一致以便 diff）。
2. 回填产出的 Kotlin 源码放回各正式模块（core-data/xposed/app-ui 等）。
3. 类名混淆对照锚点见 `../diff-v3.0.1-to-v3.0.16.md`（rea 仓库 analysis 目录同步有）。
