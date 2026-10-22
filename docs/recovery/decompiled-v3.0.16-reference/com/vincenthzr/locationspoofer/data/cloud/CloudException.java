package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudException extends Exception {
    private final String code;
    private final String diagnosticReason;
    private final Integer httpStatus;
    private final String operation;

    public /* synthetic */ CloudException(String str, Integer num, String str2, String str3, int i, ca0 ca0Var) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDiagnosticReason() {
        return this.diagnosticReason;
    }

    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    public final String getOperation() {
        return this.operation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudException(String str, Integer num, String str2, String str3) {
        super(str);
        str.getClass();
        this.code = str;
        this.httpStatus = num;
        this.operation = str2;
        this.diagnosticReason = str3;
    }
}
