package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudDiagnosticKey {
    private final Boolean authenticationRequired;
    private final Integer authenticationType;
    private final Integer authenticationValiditySeconds;
    private final String inspectionException;
    private final Boolean invalidatedByBiometricEnrollment;
    private final String role;
    private final String securityLevel;
    private final String status;
    private final Boolean unlockedDeviceRequired;

    public /* synthetic */ CloudDiagnosticKey(String str, String str2, String str3, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str4, int i, ca0 ca0Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool2, (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? null : bool3, (i & 256) != 0 ? null : str4);
    }

    public static /* synthetic */ CloudDiagnosticKey copy$default(CloudDiagnosticKey cloudDiagnosticKey, String str, String str2, String str3, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudDiagnosticKey.role;
        }
        if ((i & 2) != 0) {
            str2 = cloudDiagnosticKey.status;
        }
        if ((i & 4) != 0) {
            str3 = cloudDiagnosticKey.securityLevel;
        }
        if ((i & 8) != 0) {
            bool = cloudDiagnosticKey.authenticationRequired;
        }
        if ((i & 16) != 0) {
            num = cloudDiagnosticKey.authenticationType;
        }
        if ((i & 32) != 0) {
            num2 = cloudDiagnosticKey.authenticationValiditySeconds;
        }
        if ((i & 64) != 0) {
            bool2 = cloudDiagnosticKey.invalidatedByBiometricEnrollment;
        }
        if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
            bool3 = cloudDiagnosticKey.unlockedDeviceRequired;
        }
        if ((i & 256) != 0) {
            str4 = cloudDiagnosticKey.inspectionException;
        }
        Boolean bool4 = bool3;
        String str5 = str4;
        Integer num3 = num2;
        Boolean bool5 = bool2;
        Integer num4 = num;
        String str6 = str3;
        return cloudDiagnosticKey.copy(str, str2, str6, bool, num4, num3, bool5, bool4, str5);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.securityLevel;
    }

    public final Boolean component4() {
        return this.authenticationRequired;
    }

    public final Integer component5() {
        return this.authenticationType;
    }

    public final Integer component6() {
        return this.authenticationValiditySeconds;
    }

    public final Boolean component7() {
        return this.invalidatedByBiometricEnrollment;
    }

    public final Boolean component8() {
        return this.unlockedDeviceRequired;
    }

    public final String component9() {
        return this.inspectionException;
    }

    public final CloudDiagnosticKey copy(String str, String str2, String str3, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str4) {
        str.getClass();
        str2.getClass();
        return new CloudDiagnosticKey(str, str2, str3, bool, num, num2, bool2, bool3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudDiagnosticKey)) {
            return false;
        }
        CloudDiagnosticKey cloudDiagnosticKey = (CloudDiagnosticKey) obj;
        return o51.f(this.role, cloudDiagnosticKey.role) && o51.f(this.status, cloudDiagnosticKey.status) && o51.f(this.securityLevel, cloudDiagnosticKey.securityLevel) && o51.f(this.authenticationRequired, cloudDiagnosticKey.authenticationRequired) && o51.f(this.authenticationType, cloudDiagnosticKey.authenticationType) && o51.f(this.authenticationValiditySeconds, cloudDiagnosticKey.authenticationValiditySeconds) && o51.f(this.invalidatedByBiometricEnrollment, cloudDiagnosticKey.invalidatedByBiometricEnrollment) && o51.f(this.unlockedDeviceRequired, cloudDiagnosticKey.unlockedDeviceRequired) && o51.f(this.inspectionException, cloudDiagnosticKey.inspectionException);
    }

    public final Boolean getAuthenticationRequired() {
        return this.authenticationRequired;
    }

    public final Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public final Integer getAuthenticationValiditySeconds() {
        return this.authenticationValiditySeconds;
    }

    public final String getInspectionException() {
        return this.inspectionException;
    }

    public final Boolean getInvalidatedByBiometricEnrollment() {
        return this.invalidatedByBiometricEnrollment;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getSecurityLevel() {
        return this.securityLevel;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Boolean getUnlockedDeviceRequired() {
        return this.unlockedDeviceRequired;
    }

    public int hashCode() {
        int iD = p91.d(this.role.hashCode() * 31, 31, this.status);
        String str = this.securityLevel;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.authenticationRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.authenticationType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.authenticationValiditySeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.invalidatedByBiometricEnrollment;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.unlockedDeviceRequired;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.inspectionException;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("role", this.role).put("status", this.status);
        String str = this.securityLevel;
        if (str != null) {
            jSONObjectPut.put("securityLevel", str);
        }
        Boolean bool = this.authenticationRequired;
        if (bool != null) {
            jSONObjectPut.put("authenticationRequired", bool.booleanValue());
        }
        Integer num = this.authenticationType;
        if (num != null) {
            jSONObjectPut.put("authenticationType", num.intValue());
        }
        Integer num2 = this.authenticationValiditySeconds;
        if (num2 != null) {
            jSONObjectPut.put("authenticationValiditySeconds", num2.intValue());
        }
        Boolean bool2 = this.invalidatedByBiometricEnrollment;
        if (bool2 != null) {
            jSONObjectPut.put("invalidatedByBiometricEnrollment", bool2.booleanValue());
        }
        Boolean bool3 = this.unlockedDeviceRequired;
        if (bool3 != null) {
            jSONObjectPut.put("unlockedDeviceRequired", bool3.booleanValue());
        }
        String str2 = this.inspectionException;
        if (str2 != null) {
            jSONObjectPut.put("inspectionException", str2);
        }
        return jSONObjectPut;
    }

    public String toString() {
        String str = this.role;
        String str2 = this.status;
        String str3 = this.securityLevel;
        Boolean bool = this.authenticationRequired;
        Integer num = this.authenticationType;
        Integer num2 = this.authenticationValiditySeconds;
        Boolean bool2 = this.invalidatedByBiometricEnrollment;
        Boolean bool3 = this.unlockedDeviceRequired;
        String str4 = this.inspectionException;
        StringBuilder sbT = p91.t("CloudDiagnosticKey(role=", str, ", status=", str2, ", securityLevel=");
        sbT.append(str3);
        sbT.append(", authenticationRequired=");
        sbT.append(bool);
        sbT.append(", authenticationType=");
        sbT.append(num);
        sbT.append(", authenticationValiditySeconds=");
        sbT.append(num2);
        sbT.append(", invalidatedByBiometricEnrollment=");
        sbT.append(bool2);
        sbT.append(", unlockedDeviceRequired=");
        sbT.append(bool3);
        sbT.append(", inspectionException=");
        return az2.p(sbT, str4, ")");
    }

    public CloudDiagnosticKey(String str, String str2, String str3, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, String str4) {
        str.getClass();
        str2.getClass();
        this.role = str;
        this.status = str2;
        this.securityLevel = str3;
        this.authenticationRequired = bool;
        this.authenticationType = num;
        this.authenticationValiditySeconds = num2;
        this.invalidatedByBiometricEnrollment = bool2;
        this.unlockedDeviceRequired = bool3;
        this.inspectionException = str4;
    }
}
