package com.vincenthzr.locationspoofer.data.cloud

/**
 * 地理编码数据源。
 */
enum class CloudGeoSource {
    FOLLOW_MAP,
    NOMINATIM;

    /** 查询引擎标识（两个来源都走 Nominatim 服务） */
    fun engine(language: String, worldwide: Boolean): String = "nominatim"

    companion object {
        fun fromStored(stored: String?): CloudGeoSource =
            entries.firstOrNull { it.name == stored } ?: FOLLOW_MAP
    }
}
