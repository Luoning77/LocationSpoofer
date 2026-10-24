package com.vincenthzr.locationspoofer.data.cloud

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object MembershipQrLoader {
    private val source = MembershipQrSource()

    suspend fun load(url: String): Bitmap? = withContext(Dispatchers.IO) {
        val bytes = source.read(url)
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeByteArray(bytes, 0, bytes.size, options)
        val width = options.outWidth
        val height = options.outHeight
        if (width <= 0 || width >= 2049 || height <= 0 || height >= 2049) {
            throw CloudException("payment_qr_unavailable")
        }
        val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
        if (bitmap != null) return@withContext bitmap
        throw CloudException("payment_qr_unavailable")
    }
}
