package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudDiagnosticFrame {
    private final String className;
    private final Integer lineNumber;
    private final String methodName;

    public CloudDiagnosticFrame(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        this.className = str;
        this.methodName = str2;
        this.lineNumber = num;
    }

    public static /* synthetic */ CloudDiagnosticFrame copy$default(CloudDiagnosticFrame cloudDiagnosticFrame, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudDiagnosticFrame.className;
        }
        if ((i & 2) != 0) {
            str2 = cloudDiagnosticFrame.methodName;
        }
        if ((i & 4) != 0) {
            num = cloudDiagnosticFrame.lineNumber;
        }
        return cloudDiagnosticFrame.copy(str, str2, num);
    }

    public final String component1() {
        return this.className;
    }

    public final String component2() {
        return this.methodName;
    }

    public final Integer component3() {
        return this.lineNumber;
    }

    public final CloudDiagnosticFrame copy(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        return new CloudDiagnosticFrame(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudDiagnosticFrame)) {
            return false;
        }
        CloudDiagnosticFrame cloudDiagnosticFrame = (CloudDiagnosticFrame) obj;
        return o51.f(this.className, cloudDiagnosticFrame.className) && o51.f(this.methodName, cloudDiagnosticFrame.methodName) && o51.f(this.lineNumber, cloudDiagnosticFrame.lineNumber);
    }

    public final String getClassName() {
        return this.className;
    }

    public final Integer getLineNumber() {
        return this.lineNumber;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public int hashCode() {
        int iD = p91.d(this.className.hashCode() * 31, 31, this.methodName);
        Integer num = this.lineNumber;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("className", this.className).put("methodName", this.methodName);
        Integer num = this.lineNumber;
        if (num != null) {
            jSONObjectPut.put("lineNumber", num.intValue());
        }
        return jSONObjectPut;
    }

    public String toString() {
        String str = this.className;
        String str2 = this.methodName;
        Integer num = this.lineNumber;
        StringBuilder sbT = p91.t("CloudDiagnosticFrame(className=", str, ", methodName=", str2, ", lineNumber=");
        sbT.append(num);
        sbT.append(")");
        return sbT.toString();
    }

    public /* synthetic */ CloudDiagnosticFrame(String str, String str2, Integer num, int i, ca0 ca0Var) {
        this(str, str2, (i & 4) != 0 ? null : num);
    }
}
