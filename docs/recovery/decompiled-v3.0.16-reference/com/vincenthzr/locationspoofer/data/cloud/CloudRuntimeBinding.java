package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudRuntimeBinding {
    private final String deviceId;
    private final String publicKeyFingerprint;
    private final String sessionId;
    private final String userId;

    public CloudRuntimeBinding(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.userId = str;
        this.deviceId = str2;
        this.publicKeyFingerprint = str3;
        this.sessionId = str4;
    }

    public static /* synthetic */ CloudRuntimeBinding copy$default(CloudRuntimeBinding cloudRuntimeBinding, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudRuntimeBinding.userId;
        }
        if ((i & 2) != 0) {
            str2 = cloudRuntimeBinding.deviceId;
        }
        if ((i & 4) != 0) {
            str3 = cloudRuntimeBinding.publicKeyFingerprint;
        }
        if ((i & 8) != 0) {
            str4 = cloudRuntimeBinding.sessionId;
        }
        return cloudRuntimeBinding.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.publicKeyFingerprint;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final CloudRuntimeBinding copy(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new CloudRuntimeBinding(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudRuntimeBinding)) {
            return false;
        }
        CloudRuntimeBinding cloudRuntimeBinding = (CloudRuntimeBinding) obj;
        return o51.f(this.userId, cloudRuntimeBinding.userId) && o51.f(this.deviceId, cloudRuntimeBinding.deviceId) && o51.f(this.publicKeyFingerprint, cloudRuntimeBinding.publicKeyFingerprint) && o51.f(this.sessionId, cloudRuntimeBinding.sessionId);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPublicKeyFingerprint() {
        return this.publicKeyFingerprint;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + p91.d(p91.d(this.userId.hashCode() * 31, 31, this.deviceId), 31, this.publicKeyFingerprint);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.deviceId;
        String str3 = this.publicKeyFingerprint;
        String str4 = this.sessionId;
        StringBuilder sbT = p91.t("CloudRuntimeBinding(userId=", str, ", deviceId=", str2, ", publicKeyFingerprint=");
        sbT.append(str3);
        sbT.append(", sessionId=");
        sbT.append(str4);
        sbT.append(")");
        return sbT.toString();
    }
}
