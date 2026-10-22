package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.o51;
import defpackage.vj0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudHardwareIdentity {
    private final String collectionStatus;
    private final Map<String, String> hardwareInfo;
    private final Map<String, String> readStatus;
    private final Map<String, String> signals;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CloudHardwareIdentity(Map map, Map map2, Map map3, String str, int i, ca0 ca0Var) {
        int i2 = i & 1;
        vj0 vj0Var = vj0.e;
        this(i2 != 0 ? vj0Var : map, (i & 2) != 0 ? vj0Var : map2, (i & 4) != 0 ? vj0Var : map3, (i & 8) != 0 ? "unknown" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloudHardwareIdentity copy$default(CloudHardwareIdentity cloudHardwareIdentity, Map map, Map map2, Map map3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cloudHardwareIdentity.signals;
        }
        if ((i & 2) != 0) {
            map2 = cloudHardwareIdentity.hardwareInfo;
        }
        if ((i & 4) != 0) {
            map3 = cloudHardwareIdentity.readStatus;
        }
        if ((i & 8) != 0) {
            str = cloudHardwareIdentity.collectionStatus;
        }
        return cloudHardwareIdentity.copy(map, map2, map3, str);
    }

    public final Map<String, String> component1() {
        return this.signals;
    }

    public final Map<String, String> component2() {
        return this.hardwareInfo;
    }

    public final Map<String, String> component3() {
        return this.readStatus;
    }

    public final String component4() {
        return this.collectionStatus;
    }

    public final CloudHardwareIdentity copy(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        str.getClass();
        return new CloudHardwareIdentity(map, map2, map3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudHardwareIdentity)) {
            return false;
        }
        CloudHardwareIdentity cloudHardwareIdentity = (CloudHardwareIdentity) obj;
        return o51.f(this.signals, cloudHardwareIdentity.signals) && o51.f(this.hardwareInfo, cloudHardwareIdentity.hardwareInfo) && o51.f(this.readStatus, cloudHardwareIdentity.readStatus) && o51.f(this.collectionStatus, cloudHardwareIdentity.collectionStatus);
    }

    public final String getCollectionStatus() {
        return this.collectionStatus;
    }

    public final Map<String, String> getHardwareInfo() {
        return this.hardwareInfo;
    }

    public final Map<String, String> getReadStatus() {
        return this.readStatus;
    }

    public final Map<String, String> getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.collectionStatus.hashCode() + ((this.readStatus.hashCode() + ((this.hardwareInfo.hashCode() + (this.signals.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CloudHardwareIdentity(硬件字段已隐藏)";
    }

    public CloudHardwareIdentity(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        str.getClass();
        this.signals = map;
        this.hardwareInfo = map2;
        this.readStatus = map3;
        this.collectionStatus = str;
    }

    public CloudHardwareIdentity() {
        this(null, null, null, null, 15, null);
    }
}
