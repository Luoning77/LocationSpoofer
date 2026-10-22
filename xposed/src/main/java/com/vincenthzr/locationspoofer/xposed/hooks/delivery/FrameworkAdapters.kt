package com.vincenthzr.locationspoofer.xposed.hooks.delivery

import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus

/**
 * 框架投递适配器装配：按进程类型安装定位投递 / 定位可用性 / BLE 投递三件适配器。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/FrameworkAdapters.java
 */
object FrameworkAdapters {

    private fun acquire(locationHooker: LocationHooker, name: String, factory: () -> SystemDeliveryAdapter): Boolean {
        val installed = AdapterInstallation.acquire(
            locationHooker.vendorExtraHooks,
            factory,
        ) { t -> HookStatus.error(name, t) }
        HookStatus.capability(name, installed, "runtime-signatures")
        return installed
    }

    /** 按当前进程安装对应适配器并返回能力集 */
    fun install(locationHooker: LocationHooker, classLoader: ClassLoader): SystemHookCapabilities {
        if (locationHooker.isSystemServerProcess) {
            return SystemHookCapabilities(
                locationDelivery = acquire(locationHooker, "FRAMEWORK_LOCATION") {
                    FrameworkLocationDelivery(locationHooker, classLoader)
                },
                bleDelivery = false,
                locationAvailability = acquire(locationHooker, "FRAMEWORK_LOCATION_AVAILABILITY") {
                    FrameworkLocationAvailability(locationHooker, classLoader)
                },
            )
        }
        if (locationHooker.isBluetoothProcessInstance) {
            return SystemHookCapabilities(
                locationDelivery = false,
                bleDelivery = acquire(locationHooker, "FRAMEWORK_BLE") {
                    FrameworkBleDelivery(locationHooker, classLoader)
                },
                locationAvailability = false,
            )
        }
        return SystemHookCapabilities()
    }
}
