package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.b81;
import defpackage.o51;
import defpackage.p91;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudTeeEnrollment {
    private final String fingerprint;
    private final String previousDeviceId;
    private final String previousFingerprint;
    private final String requestId;

    public CloudTeeEnrollment(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.requestId = str;
        this.previousDeviceId = str2;
        this.previousFingerprint = str3;
        this.fingerprint = str4;
    }

    public static /* synthetic */ CloudTeeEnrollment copy$default(CloudTeeEnrollment cloudTeeEnrollment, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudTeeEnrollment.requestId;
        }
        if ((i & 2) != 0) {
            str2 = cloudTeeEnrollment.previousDeviceId;
        }
        if ((i & 4) != 0) {
            str3 = cloudTeeEnrollment.previousFingerprint;
        }
        if ((i & 8) != 0) {
            str4 = cloudTeeEnrollment.fingerprint;
        }
        return cloudTeeEnrollment.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.previousDeviceId;
    }

    public final String component3() {
        return this.previousFingerprint;
    }

    public final String component4() {
        return this.fingerprint;
    }

    public final String confirmedDevice(JSONObject jSONObject) {
        jSONObject.getClass();
        String strOptString = jSONObject.optString("deviceId");
        strOptString.getClass();
        if (EncryptedCloudSessionStore.Companion.getUUID_PATTERN$core_data_globalRelease().b(strOptString) && ((this.previousDeviceId.length() <= 0 || strOptString.equals(this.previousDeviceId)) && o51.f(jSONObject.optString("teeEnrollmentId"), this.requestId) && o51.f(jSONObject.optString("signingProfile"), CloudTeeEnrollmentKt.TEE_SIGNING_PROFILE) && o51.f(jSONObject.optString("publicKeyFingerprint"), this.fingerprint))) {
            return strOptString;
        }
        b81.w("device_binding_mismatch");
        return null;
    }

    public final CloudTeeEnrollment copy(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new CloudTeeEnrollment(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudTeeEnrollment)) {
            return false;
        }
        CloudTeeEnrollment cloudTeeEnrollment = (CloudTeeEnrollment) obj;
        return o51.f(this.requestId, cloudTeeEnrollment.requestId) && o51.f(this.previousDeviceId, cloudTeeEnrollment.previousDeviceId) && o51.f(this.previousFingerprint, cloudTeeEnrollment.previousFingerprint) && o51.f(this.fingerprint, cloudTeeEnrollment.fingerprint);
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getPreviousDeviceId() {
        return this.previousDeviceId;
    }

    public final String getPreviousFingerprint() {
        return this.previousFingerprint;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.fingerprint.hashCode() + p91.d(p91.d(this.requestId.hashCode() * 31, 31, this.previousDeviceId), 31, this.previousFingerprint);
    }

    public String toString() {
        String str = this.requestId;
        String str2 = this.previousDeviceId;
        String str3 = this.previousFingerprint;
        String str4 = this.fingerprint;
        StringBuilder sbT = p91.t("CloudTeeEnrollment(requestId=", str, ", previousDeviceId=", str2, ", previousFingerprint=");
        sbT.append(str3);
        sbT.append(", fingerprint=");
        sbT.append(str4);
        sbT.append(")");
        return sbT.toString();
    }
}
