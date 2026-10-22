package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.mh0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudSigningFailurePolicy {
    private final long cooldownUntil;
    private final int failures;

    public /* synthetic */ CloudSigningFailurePolicy(int i, long j, int i2, ca0 ca0Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }

    public static /* synthetic */ CloudSigningFailurePolicy copy$default(CloudSigningFailurePolicy cloudSigningFailurePolicy, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cloudSigningFailurePolicy.failures;
        }
        if ((i2 & 2) != 0) {
            j = cloudSigningFailurePolicy.cooldownUntil;
        }
        return cloudSigningFailurePolicy.copy(i, j);
    }

    public final CloudSigningFailurePolicy bufferFailure(long j) {
        int iV = mh0.v(this.failures, 0, 3) + 1;
        return new CloudSigningFailurePolicy(iV <= 3 ? iV : 3, j + 30000);
    }

    public final int component1() {
        return this.failures;
    }

    public final long component2() {
        return this.cooldownUntil;
    }

    public final boolean coolingDown(long j) {
        long j2 = this.cooldownUntil - j;
        return 1 <= j2 && j2 < 60001;
    }

    public final CloudSigningFailurePolicy copy(int i, long j) {
        return new CloudSigningFailurePolicy(i, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudSigningFailurePolicy)) {
            return false;
        }
        CloudSigningFailurePolicy cloudSigningFailurePolicy = (CloudSigningFailurePolicy) obj;
        return this.failures == cloudSigningFailurePolicy.failures && this.cooldownUntil == cloudSigningFailurePolicy.cooldownUntil;
    }

    public final long getCooldownUntil() {
        return this.cooldownUntil;
    }

    public final int getFailures() {
        return this.failures;
    }

    public int hashCode() {
        return Long.hashCode(this.cooldownUntil) + (Integer.hashCode(this.failures) * 31);
    }

    public String toString() {
        return "CloudSigningFailurePolicy(failures=" + this.failures + ", cooldownUntil=" + this.cooldownUntil + ")";
    }

    public CloudSigningFailurePolicy(int i, long j) {
        this.failures = i;
        this.cooldownUntil = j;
    }

    public CloudSigningFailurePolicy() {
        this(0, 0L, 3, null);
    }
}
