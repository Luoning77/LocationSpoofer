package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.au0;
import defpackage.bv0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class CloudRepository$passwordSignIn$access$1 extends bv0 implements au0 {
    public CloudRepository$passwordSignIn$access$1(Object obj) {
        super(0, 0, CloudSessionStore.class, obj, "monotonicTimeNanos", "monotonicTimeNanos()J");
    }

    @Override // defpackage.au0
    public final Long invoke() {
        return Long.valueOf(((CloudSessionStore) this.receiver).monotonicTimeNanos());
    }
}
