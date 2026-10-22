package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudRuntimePermit {
    private final String payload;
    private final String signature;

    public CloudRuntimePermit(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.payload = str;
        this.signature = str2;
    }

    public static /* synthetic */ CloudRuntimePermit copy$default(CloudRuntimePermit cloudRuntimePermit, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudRuntimePermit.payload;
        }
        if ((i & 2) != 0) {
            str2 = cloudRuntimePermit.signature;
        }
        return cloudRuntimePermit.copy(str, str2);
    }

    public final String component1() {
        return this.payload;
    }

    public final String component2() {
        return this.signature;
    }

    public final CloudRuntimePermit copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new CloudRuntimePermit(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudRuntimePermit)) {
            return false;
        }
        CloudRuntimePermit cloudRuntimePermit = (CloudRuntimePermit) obj;
        return o51.f(this.payload, cloudRuntimePermit.payload) && o51.f(this.signature, cloudRuntimePermit.signature);
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode() + (this.payload.hashCode() * 31);
    }

    public String toString() {
        return az2.l("CloudRuntimePermit(payload=", this.payload, ", signature=", this.signature, ")");
    }
}
