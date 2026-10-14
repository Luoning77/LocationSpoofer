# 发布到自己的仓库

本项目通过 `TaoCultivator/LocationSpoofer` 的 GitHub Actions 构建 Release，应用也从该仓库检查更新。

## 持久发布签名

本地发布密钥保存在 `.signing/locationspoofer-release.jks`，签名配置保存在项目根目录的 `keystore.properties`。两者都已被 Git 忽略，不会随代码推送。请自行安全备份密钥、别名和密码；重新克隆仓库无法恢复这些文件。

后续版本必须继续使用同一发布密钥，以保持覆盖升级能力。本地签名配置和云端签名 Secrets 应对应同一份密钥，不要每次发布重新生成。

在仓库中启用 GitHub Actions，并设置以下四个 Repository Secrets：

| Secret 名称 | 内容 |
| --- | --- |
| `KEYSTORE_BASE64` | 持久发布密钥文件的 Base64 内容 |
| `KEYSTORE_PASSWORD` | 密钥库密码 |
| `KEY_ALIAS` | 签名密钥别名 |
| `KEY_PASSWORD` | 签名密钥密码 |

## 后续发版

1. 同步提高根目录 `gradle.properties` 的 `APP_VERSION_NAME` 和 `APP_VERSION_CODE`。版本名用于应用更新提示，版本 code 用于安装升级；均应高于已发布版本。
2. 版本名使用 `x.y.z`，或预发布格式 `x.y.z-beta-n` / `x.y.z-beta.n`。确认远端不存在对应的 `v<版本名>` Tag。
3. 提交修改并推送到 `main`。工作流会检查版本、分别构建两个方案，再创建 Tag 和 Release；不要提前手动创建 Tag，否则工作流会跳过该版本。也可以在 Actions 页面手动触发同一流程。
4. 确认工作流成功，Release 中有以下四个安装包：

```text
LocationSpoofer-scoped-arm64-v8a-v<版本名>.apk
LocationSpoofer-scoped-armeabi-v7a-v<版本名>.apk
LocationSpoofer-global-arm64-v8a-v<版本名>.apk
LocationSpoofer-global-armeabi-v7a-v<版本名>.apk
```

保留文件名中的方案和 ABI 标记，应用依靠这些标记选择安装包。两个方案二选一安装；同一次发布的四个 APK 使用同一发布签名。

## 首次切换签名

本仓库使用自己的独立发布签名。原作者版本或此前使用调试签名的 Debug 包，如果签名与本仓库发布包不同，就不能直接覆盖安装。

切换前先在旧版导出收藏位置、路线和采集数据等备份，在 LSPosed 中停用旧模块，卸载旧包后安装本仓库对应方案的 APK，再启用模块、设置作用域、重启设备并导入备份。完成首次迁移后，后续版本保持同一包名和签名即可继续覆盖升级。
