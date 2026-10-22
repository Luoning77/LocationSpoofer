package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.yf2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudMapAuthorization {
    private final String accessToken;
    private final CloudRuntimeBinding binding;
    private final boolean cachedOnly;
    private final long generation;
    private final yf2 signedRequest;
    private final boolean subscriberOnly;

    public CloudMapAuthorization(long j, String str, CloudRuntimeBinding cloudRuntimeBinding, yf2 yf2Var, boolean z, boolean z2) {
        str.getClass();
        cloudRuntimeBinding.getClass();
        this.generation = j;
        this.accessToken = str;
        this.binding = cloudRuntimeBinding;
        this.signedRequest = yf2Var;
        this.cachedOnly = z;
        this.subscriberOnly = z2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final CloudRuntimeBinding getBinding() {
        return this.binding;
    }

    public final boolean getCachedOnly() {
        return this.cachedOnly;
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final yf2 getSignedRequest() {
        return this.signedRequest;
    }

    public final boolean getSubscriberOnly() {
        return this.subscriberOnly;
    }

    public /* synthetic */ CloudMapAuthorization(long j, String str, CloudRuntimeBinding cloudRuntimeBinding, yf2 yf2Var, boolean z, boolean z2, int i, ca0 ca0Var) {
        this(j, str, cloudRuntimeBinding, yf2Var, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }
}
