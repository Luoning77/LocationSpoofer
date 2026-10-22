package com.vincenthzr.locationspoofer.data.model;

import defpackage.hd0;
import defpackage.vk0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum RouteTravelMode {
    WALKING(2131625163, "walking"),
    CYCLING(2131624371, "cycling"),
    DRIVING(2131624400, "driving");

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());
    private final int labelResId;
    private final String wireValue;

    RouteTravelMode(int i, String str) {
        this.labelResId = i;
        this.wireValue = str;
    }

    public static vk0 getEntries() {
        return $ENTRIES;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final String getWireValue() {
        return this.wireValue;
    }
}
