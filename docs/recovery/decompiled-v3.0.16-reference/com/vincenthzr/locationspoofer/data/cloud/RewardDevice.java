package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RewardDevice {
    private final String id;
    private final String name;

    public RewardDevice(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
    }

    public static /* synthetic */ RewardDevice copy$default(RewardDevice rewardDevice, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardDevice.id;
        }
        if ((i & 2) != 0) {
            str2 = rewardDevice.name;
        }
        return rewardDevice.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final RewardDevice copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new RewardDevice(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardDevice)) {
            return false;
        }
        RewardDevice rewardDevice = (RewardDevice) obj;
        return o51.f(this.id, rewardDevice.id) && o51.f(this.name, rewardDevice.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return az2.l("RewardDevice(id=", this.id, ", name=", this.name, ")");
    }
}
