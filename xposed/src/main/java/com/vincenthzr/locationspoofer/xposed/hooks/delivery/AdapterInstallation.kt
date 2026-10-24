package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 适配器安装助手：安装成功则把适配器加入资源集，失败则先 close 再回调错误。
 */
object AdapterInstallation {

    fun acquire(resources: MutableCollection<AutoCloseable>, adapter: SystemDeliveryAdapter, onError: (Throwable) -> Unit): Boolean {
        try {
            if (adapter.install()) {
                resources.add(adapter)
                return true
            }
        } catch (t: Throwable) {
            onError(t)
        }
        try {
            adapter.close()
        } catch (t: Throwable) {
            onError(t)
            return false
        }
        return false
    }

    fun acquire(resources: MutableCollection<AutoCloseable>, factory: () -> SystemDeliveryAdapter, onError: (Throwable) -> Unit): Boolean =
        try {
            acquire(resources, factory(), onError)
        } catch (t: Throwable) {
            onError(t)
            false
        }
}
