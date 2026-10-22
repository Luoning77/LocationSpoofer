package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudDeviceSlot {
    private final boolean active;
    private final String deviceId;
    private final boolean eligible;
    private final int extraRemaining;
    private final String id;
    private final String kind;
    private final int limit;
    private final String name;
    private final String origin;
    private final int position;
    private final Long purchasedUntil;
    private final long resetsAt;
    private final int used;

    public /* synthetic */ CloudDeviceSlot(String str, String str2, String str3, String str4, boolean z, Long l, int i, int i2, int i3, long j, boolean z2, String str5, int i4, int i5, ca0 ca0Var) {
        this(str, str2, str3, str4, z, l, i, i2, i3, j, (i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? true : z2, (i5 & 2048) != 0 ? "hardware" : str5, (i5 & 4096) != 0 ? 0 : i4);
    }

    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.resetsAt;
    }

    public final boolean component11() {
        return this.eligible;
    }

    public final String component12() {
        return this.origin;
    }

    public final int component13() {
        return this.position;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.name;
    }

    public final boolean component5() {
        return this.active;
    }

    public final Long component6() {
        return this.purchasedUntil;
    }

    public final int component7() {
        return this.limit;
    }

    public final int component8() {
        return this.used;
    }

    public final int component9() {
        return this.extraRemaining;
    }

    public final CloudDeviceSlot copy(String str, String str2, String str3, String str4, boolean z, Long l, int i, int i2, int i3, long j, boolean z2, String str5, int i4) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        return new CloudDeviceSlot(str, str2, str3, str4, z, l, i, i2, i3, j, z2, str5, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudDeviceSlot)) {
            return false;
        }
        CloudDeviceSlot cloudDeviceSlot = (CloudDeviceSlot) obj;
        return o51.f(this.id, cloudDeviceSlot.id) && o51.f(this.kind, cloudDeviceSlot.kind) && o51.f(this.deviceId, cloudDeviceSlot.deviceId) && o51.f(this.name, cloudDeviceSlot.name) && this.active == cloudDeviceSlot.active && o51.f(this.purchasedUntil, cloudDeviceSlot.purchasedUntil) && this.limit == cloudDeviceSlot.limit && this.used == cloudDeviceSlot.used && this.extraRemaining == cloudDeviceSlot.extraRemaining && this.resetsAt == cloudDeviceSlot.resetsAt && this.eligible == cloudDeviceSlot.eligible && o51.f(this.origin, cloudDeviceSlot.origin) && this.position == cloudDeviceSlot.position;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    public final int getExtraRemaining() {
        return this.extraRemaining;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final int getPosition() {
        return this.position;
    }

    public final Long getPurchasedUntil() {
        return this.purchasedUntil;
    }

    public final long getResetsAt() {
        return this.resetsAt;
    }

    public final int getUsed() {
        return this.used;
    }

    public int hashCode() {
        int iD = p91.d(this.id.hashCode() * 31, 31, this.kind);
        String str = this.deviceId;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iE = p91.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.active);
        Long l = this.purchasedUntil;
        return Integer.hashCode(this.position) + p91.d(p91.e(p91.c(p91.b(this.extraRemaining, p91.b(this.used, p91.b(this.limit, (iE + (l != null ? l.hashCode() : 0)) * 31, 31), 31), 31), 31, this.resetsAt), 31, this.eligible), 31, this.origin);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.kind;
        String str3 = this.deviceId;
        String str4 = this.name;
        boolean z = this.active;
        Long l = this.purchasedUntil;
        int i = this.limit;
        int i2 = this.used;
        int i3 = this.extraRemaining;
        long j = this.resetsAt;
        boolean z2 = this.eligible;
        String str5 = this.origin;
        int i4 = this.position;
        StringBuilder sbT = p91.t("CloudDeviceSlot(id=", str, ", kind=", str2, ", deviceId=");
        p91.y(sbT, str3, ", name=", str4, ", active=");
        sbT.append(z);
        sbT.append(", purchasedUntil=");
        sbT.append(l);
        sbT.append(", limit=");
        az2.w(sbT, i, ", used=", i2, ", extraRemaining=");
        sbT.append(i3);
        sbT.append(", resetsAt=");
        sbT.append(j);
        sbT.append(", eligible=");
        sbT.append(z2);
        sbT.append(", origin=");
        sbT.append(str5);
        sbT.append(", position=");
        sbT.append(i4);
        sbT.append(")");
        return sbT.toString();
    }

    public CloudDeviceSlot(String str, String str2, String str3, String str4, boolean z, Long l, int i, int i2, int i3, long j, boolean z2, String str5, int i4) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        this.id = str;
        this.kind = str2;
        this.deviceId = str3;
        this.name = str4;
        this.active = z;
        this.purchasedUntil = l;
        this.limit = i;
        this.used = i2;
        this.extraRemaining = i3;
        this.resetsAt = j;
        this.eligible = z2;
        this.origin = str5;
        this.position = i4;
    }
}
