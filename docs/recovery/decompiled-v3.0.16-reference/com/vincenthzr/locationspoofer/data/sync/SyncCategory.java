package com.vincenthzr.locationspoofer.data.sync;

import defpackage.hd0;
import defpackage.vk0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum SyncCategory {
    SETTINGS("settings", "setting:"),
    FAVORITES("favorites", "favorite:"),
    ROUTES("routes", "route:"),
    COLLECTED_POINTS("collected_points", "location:"),
    COLLECTED_ROUTES("collected_routes", "collection:");

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());
    private final String id;
    private final String prefix;

    SyncCategory(String str, String str2) {
        this.id = str;
        this.prefix = str2;
    }

    public static vk0 getEntries() {
        return $ENTRIES;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPrefix() {
        return this.prefix;
    }
}
