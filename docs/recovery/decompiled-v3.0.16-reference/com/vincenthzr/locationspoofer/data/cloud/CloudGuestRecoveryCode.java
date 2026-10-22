package com.vincenthzr.locationspoofer.data.cloud;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudGuestRecoveryCode {
    private final String code;
    private final long createdAt;

    public CloudGuestRecoveryCode(String str, long j) {
        str.getClass();
        this.code = str;
        this.createdAt = j;
    }

    public final String getCode() {
        return this.code;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public String toString() {
        return "CloudGuestRecoveryCode(credentials=已隐藏)";
    }
}
