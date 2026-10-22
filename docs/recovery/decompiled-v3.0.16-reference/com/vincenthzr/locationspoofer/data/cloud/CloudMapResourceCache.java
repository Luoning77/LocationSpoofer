package com.vincenthzr.locationspoofer.data.cloud;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CloudMapResourceCache {
    CloudMapCacheEntry read(String str, String str2, long j, boolean z);

    void remove(String str, String str2);

    void write(String str, String str2, CloudMapCacheEntry cloudMapCacheEntry);
}
