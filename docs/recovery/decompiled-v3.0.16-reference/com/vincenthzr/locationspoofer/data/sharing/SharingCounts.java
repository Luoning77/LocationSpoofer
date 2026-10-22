package com.vincenthzr.locationspoofer.data.sharing;

import defpackage.ca0;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharingCounts {
    private final long bluetooth;
    private final long cells;
    private final long wifi;

    public /* synthetic */ SharingCounts(long j, long j2, long j3, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }

    public static /* synthetic */ SharingCounts copy$default(SharingCounts sharingCounts, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sharingCounts.wifi;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = sharingCounts.bluetooth;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = sharingCounts.cells;
        }
        return sharingCounts.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.wifi;
    }

    public final long component2() {
        return this.bluetooth;
    }

    public final long component3() {
        return this.cells;
    }

    public final SharingCounts copy(long j, long j2, long j3) {
        return new SharingCounts(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharingCounts)) {
            return false;
        }
        SharingCounts sharingCounts = (SharingCounts) obj;
        return this.wifi == sharingCounts.wifi && this.bluetooth == sharingCounts.bluetooth && this.cells == sharingCounts.cells;
    }

    public final long getBluetooth() {
        return this.bluetooth;
    }

    public final long getCells() {
        return this.cells;
    }

    public final long getWifi() {
        return this.wifi;
    }

    public int hashCode() {
        return Long.hashCode(this.cells) + p91.c(Long.hashCode(this.wifi) * 31, 31, this.bluetooth);
    }

    public String toString() {
        return "SharingCounts(wifi=" + this.wifi + ", bluetooth=" + this.bluetooth + ", cells=" + this.cells + ")";
    }

    public SharingCounts(long j, long j2, long j3) {
        this.wifi = j;
        this.bluetooth = j2;
        this.cells = j3;
    }

    public SharingCounts() {
        this(0L, 0L, 0L, 7, null);
    }
}
