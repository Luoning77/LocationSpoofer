package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j6 extends k33 implements lu0 {
    public int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(l6 l6Var, boolean z, q60 q60Var) {
        super(1, q60Var);
        this.f = l6Var;
        this.g = z;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new j6(this.f, this.g, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        return ((j6) create((q60) obj)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r7.refreshAccount(r6) == r5) goto L16;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.e
            boolean r1 = r6.g
            l6 r2 = r6.f
            r3 = 2
            r4 = 1
            z70 r5 = defpackage.z70.e
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            defpackage.ee0.J(r7)
            goto L3a
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.ee0.J(r7)
            goto L2d
        L1f:
            defpackage.ee0.J(r7)
            com.vincenthzr.locationspoofer.data.cloud.CloudRepository r7 = r2.b
            r6.e = r4
            java.lang.Object r7 = r7.selectCompanionMode(r1, r6)
            if (r7 != r5) goto L2d
            goto L39
        L2d:
            if (r1 != 0) goto L3a
            com.vincenthzr.locationspoofer.data.cloud.CloudRepository r7 = r2.b
            r6.e = r3
            java.lang.Object r6 = r7.refreshAccount(r6)
            if (r6 != r5) goto L3a
        L39:
            return r5
        L3a:
            mf3 r6 = defpackage.mf3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
