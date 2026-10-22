package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.bv0;
import defpackage.lu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class CloudRepository$passwordSignIn$response$1 extends bv0 implements lu0 {
    public CloudRepository$passwordSignIn$response$1(Object obj) {
        super(1, 0, CloudPasswordAccess.class, obj, "sign", "sign(Ljava/lang/String;)Ljava/lang/String;");
    }

    @Override // defpackage.lu0
    public final String invoke(String str) {
        str.getClass();
        return ((CloudPasswordAccess) this.receiver).sign(str);
    }
}
