package com.vincenthzr.locationspoofer.data.model;

import defpackage.hd0;
import defpackage.vk0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public enum SimMode {
    STILL(2131625055, 0.0d),
    WALKING(2131625163, 1.4d),
    RUNNING(2131624917, 3.0d),
    CYCLING(2131624371, 5.5d),
    DRIVING(2131624400, 15.0d),
    CUSTOM(2131624364, 0.0d);

    private static final /* synthetic */ vk0 $ENTRIES = hd0.s(values());
    private final int labelResId;
    private final double speedMs;

    SimMode(int i, double d) {
        this.labelResId = i;
        this.speedMs = d;
    }

    public static vk0 getEntries() {
        return $ENTRIES;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final double getSpeedMs() {
        return this.speedMs;
    }
}
