package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.mc0;
import defpackage.o51;
import defpackage.qk2;
import defpackage.rk2;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RuntimeAuthorization {
    private final qk2 claims;
    private final rk2 envelope;
    private final Set<String> requiredCapabilities;
    private final long runGeneration;

    public /* synthetic */ RuntimeAuthorization(rk2 rk2Var, qk2 qk2Var, Set set, long j, int i, ca0 ca0Var) {
        this(rk2Var, qk2Var, (i & 4) != 0 ? mc0.H("spoof") : set, (i & 8) != 0 ? 0L : j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuntimeAuthorization copy$default(RuntimeAuthorization runtimeAuthorization, rk2 rk2Var, qk2 qk2Var, Set set, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            rk2Var = runtimeAuthorization.envelope;
        }
        if ((i & 2) != 0) {
            qk2Var = runtimeAuthorization.claims;
        }
        if ((i & 4) != 0) {
            set = runtimeAuthorization.requiredCapabilities;
        }
        if ((i & 8) != 0) {
            j = runtimeAuthorization.runGeneration;
        }
        Set set2 = set;
        return runtimeAuthorization.copy(rk2Var, qk2Var, set2, j);
    }

    public final rk2 component1() {
        return this.envelope;
    }

    public final qk2 component2() {
        return this.claims;
    }

    public final Set<String> component3() {
        return this.requiredCapabilities;
    }

    public final long component4() {
        return this.runGeneration;
    }

    public final RuntimeAuthorization copy(rk2 rk2Var, qk2 qk2Var, Set<String> set, long j) {
        rk2Var.getClass();
        qk2Var.getClass();
        set.getClass();
        return new RuntimeAuthorization(rk2Var, qk2Var, set, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuntimeAuthorization)) {
            return false;
        }
        RuntimeAuthorization runtimeAuthorization = (RuntimeAuthorization) obj;
        return o51.f(this.envelope, runtimeAuthorization.envelope) && o51.f(this.claims, runtimeAuthorization.claims) && o51.f(this.requiredCapabilities, runtimeAuthorization.requiredCapabilities) && this.runGeneration == runtimeAuthorization.runGeneration;
    }

    public final qk2 getClaims() {
        return this.claims;
    }

    public final rk2 getEnvelope() {
        return this.envelope;
    }

    public final Set<String> getRequiredCapabilities() {
        return this.requiredCapabilities;
    }

    public final long getRunGeneration() {
        return this.runGeneration;
    }

    public int hashCode() {
        return Long.hashCode(this.runGeneration) + ((this.requiredCapabilities.hashCode() + ((this.claims.hashCode() + (this.envelope.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RuntimeAuthorization(envelope=" + this.envelope + ", claims=" + this.claims + ", requiredCapabilities=" + this.requiredCapabilities + ", runGeneration=" + this.runGeneration + ")";
    }

    public RuntimeAuthorization(rk2 rk2Var, qk2 qk2Var, Set<String> set, long j) {
        rk2Var.getClass();
        qk2Var.getClass();
        set.getClass();
        this.envelope = rk2Var;
        this.claims = qk2Var;
        this.requiredCapabilities = set;
        this.runGeneration = j;
    }
}
