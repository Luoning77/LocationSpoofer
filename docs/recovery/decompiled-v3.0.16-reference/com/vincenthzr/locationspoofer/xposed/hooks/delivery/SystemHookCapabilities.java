package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import defpackage.ca0;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemHookCapabilities {
    private final boolean bleDelivery;
    private final boolean locationAvailability;
    private final boolean locationDelivery;

    public /* synthetic */ SystemHookCapabilities(boolean z, boolean z2, boolean z3, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public static /* synthetic */ SystemHookCapabilities copy$default(SystemHookCapabilities systemHookCapabilities, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = systemHookCapabilities.locationDelivery;
        }
        if ((i & 2) != 0) {
            z2 = systemHookCapabilities.bleDelivery;
        }
        if ((i & 4) != 0) {
            z3 = systemHookCapabilities.locationAvailability;
        }
        return systemHookCapabilities.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.locationDelivery;
    }

    public final boolean component2() {
        return this.bleDelivery;
    }

    public final boolean component3() {
        return this.locationAvailability;
    }

    public final SystemHookCapabilities copy(boolean z, boolean z2, boolean z3) {
        return new SystemHookCapabilities(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemHookCapabilities)) {
            return false;
        }
        SystemHookCapabilities systemHookCapabilities = (SystemHookCapabilities) obj;
        return this.locationDelivery == systemHookCapabilities.locationDelivery && this.bleDelivery == systemHookCapabilities.bleDelivery && this.locationAvailability == systemHookCapabilities.locationAvailability;
    }

    public final boolean getBleDelivery() {
        return this.bleDelivery;
    }

    public final boolean getLocationAvailability() {
        return this.locationAvailability;
    }

    public final boolean getLocationDelivery() {
        return this.locationDelivery;
    }

    public int hashCode() {
        return Boolean.hashCode(this.locationAvailability) + p91.e(Boolean.hashCode(this.locationDelivery) * 31, 31, this.bleDelivery);
    }

    public String toString() {
        return "SystemHookCapabilities(locationDelivery=" + this.locationDelivery + ", bleDelivery=" + this.bleDelivery + ", locationAvailability=" + this.locationAvailability + ")";
    }

    public SystemHookCapabilities(boolean z, boolean z2, boolean z3) {
        this.locationDelivery = z;
        this.bleDelivery = z2;
        this.locationAvailability = z3;
    }

    public SystemHookCapabilities() {
        this(false, false, false, 7, null);
    }
}
