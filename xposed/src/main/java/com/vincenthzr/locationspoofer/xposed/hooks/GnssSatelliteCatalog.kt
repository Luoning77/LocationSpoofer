package com.vincenthzr.locationspoofer.xposed.hooks

/**
 * 卫星星历目录：32 颗固定卫星（GPS/Galileo/BeiDou/QZSS），按时间做微小漂移生成信号快照。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/GnssSatelliteCatalog.java
 *
 * 用固定星历而不是随机值，是因为定位类应用会把卫星编号、仰角、方位角与真实天空对照，
 * 随机数据一眼假；固定星历至少保证"编号合法、仰角随天顶移动"。
 */
object GnssSatelliteCatalog {

    const val MAX_SATELLITES = 32

    /** 载噪比微扰表：按 (秒 + 卫星下标) & 15 取值，制造自然的抖动 */
    private val jitter = floatArrayOf(
        -0.8f, 0.5f, 1.2f, -0.3f, 0.9f, -1.1f, 0.4f, -0.6f,
        1.1f, -0.9f, 0.7f, -0.4f, 1.3f, -1.2f, 0.3f, -0.2f,
    )

    private val satellites = arrayOf(
        Satellite(1, 1, 82.0f, 35.0f),
        Satellite(1, 3, 69.0f, 68.0f),
        Satellite(1, 6, 51.0f, 95.0f),
        Satellite(1, 7, 44.0f, 132.0f),
        Satellite(5, 1, 78.0f, 12.0f),
        Satellite(5, 2, 65.0f, 45.0f),
        Satellite(5, 3, 54.0f, 78.0f),
        Satellite(5, 5, 42.0f, 112.0f),
        Satellite(1, 8, 36.0f, 165.0f),
        Satellite(5, 6, 38.0f, 145.0f),
        Satellite(1, 9, 75.0f, 198.0f),
        Satellite(5, 7, 72.0f, 178.0f),
        Satellite(3, 1, 55.0f, 85.0f),
        Satellite(6, 1, 60.0f, 45.0f),
        Satellite(1, 11, 63.0f, 232.0f),
        Satellite(5, 8, 58.0f, 212.0f),
        Satellite(3, 2, 43.0f, 175.0f),
        Satellite(6, 2, 48.0f, 135.0f),
        Satellite(1, 14, 47.0f, 265.0f),
        Satellite(5, 9, 49.0f, 245.0f),
        Satellite(3, 3, 35.0f, 265.0f),
        Satellite(6, 3, 39.0f, 225.0f),
        Satellite(1, 17, 31.0f, 298.0f),
        Satellite(5, 10, 33.0f, 278.0f),
        Satellite(3, 4, 28.0f, 345.0f),
        Satellite(6, 5, 22.0f, 315.0f),
        Satellite(1, 19, 59.0f, 325.0f),
        Satellite(5, 11, 61.0f, 312.0f),
        Satellite(1, 21, 41.0f, 15.0f),
        Satellite(5, 13, 45.0f, 335.0f),
        Satellite(1, 22, 25.0f, 52.0f),
        Satellite(5, 14, 29.0f, 25.0f),
    )

    /** 星历条目：星座（1=GPS 3=BeiDou 5=Galileo 6=QZSS）、卫星号、基准仰角、基准方位角 */
    data class Satellite(
        val constellation: Int,
        val svid: Int,
        val elevation: Float,
        val azimuth: Float,
    ) {
        /** 旧 API（GpsStatus/GpsSatellite）用的 PRN 编号 */
        val legacyPrn: Int?
            get() = when (constellation) {
                1 -> svid
                3 -> svid + 64
                5 -> svid + 200
                else -> null
            }
    }

    /** 某一时刻的信号快照 */
    data class Signal(
        val satellite: Satellite,
        val elevation: Float,
        val azimuth: Float,
        val cn0: Float,
    ) {
        /** 各星座的载波频率（Hz） */
        val carrierFrequency: Float
            get() = when (satellite.constellation) {
                3 -> 1.602E9f
                5 -> 1.561098E9f
                else -> 1.57542E9f
            }

        /** 参与定位解算：仰角高于 18° */
        val usedInFix: Boolean
            get() = elevation > 18.0f
    }

    operator fun get(index: Int): Satellite = satellites[index]

    /**
     * 生成第 [index] 颗卫星在 [nowMillis] 时刻的信号。
     * 仰角按 (index*3 + 秒) 的周期在基准值附近摆动，并钳制到 16°..88°。
     */
    fun signal(index: Int, nowMillis: Long, jitterEnabled: Boolean): Signal {
        val satellite = satellites[index]
        val seconds = nowMillis / 1000L
        val phase = ((index * 3).toLong() + seconds) % 360L
        val elevation = (((phase % 10.0f) - 5.0f) + satellite.elevation).coerceIn(16.0f, 88.0f)
        val azimuth = ((phase * 0.1f) + satellite.azimuth) % 360.0f
        val cn0 = (
            (elevation / 90.0f) * 8.0f + 34.0f +
                (if (jitterEnabled) jitter[((seconds + index) and 15L).toInt()] else 0.0f)
            ).coerceIn(30.0f, 43.5f)
        return Signal(satellite, elevation, azimuth, cn0)
    }
}
