package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudTokens {
    private final long accessExpiresAt;
    private final String accessToken;
    private final long refreshExpiresAt;
    private final String refreshToken;

    public CloudTokens(String str, String str2, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.accessExpiresAt = j;
        this.refreshExpiresAt = j2;
    }

    public final long getAccessExpiresAt() {
        return this.accessExpiresAt;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getRefreshExpiresAt() {
        return this.refreshExpiresAt;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public /* synthetic */ CloudTokens(String str, String str2, long j, long j2, int i, ca0 ca0Var) {
        this(str, str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2);
    }
}
