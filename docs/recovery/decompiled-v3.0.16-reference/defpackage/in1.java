package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class in1 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in1(Object obj, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                return new in1((ul1) obj, q60Var, 0);
            case 1:
                return new in1((ar2) obj, q60Var, 1);
            default:
                return new in1((x73) obj, q60Var, 2);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((in1) create(q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r8 == r3) goto L23;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            z70 r3 = defpackage.z70.e
            java.lang.Object r4 = r8.g
            r5 = 1
            mf3 r6 = defpackage.mf3.a
            switch(r0) {
                case 0: goto L93;
                case 1: goto L5a;
                default: goto Lf;
            }
        Lf:
            x73 r4 = (defpackage.x73) r4
            int r0 = r8.f
            r7 = 2
            if (r0 == 0) goto L26
            if (r0 == r5) goto L22
            if (r0 != r7) goto L1e
            defpackage.ee0.J(r9)
            goto L56
        L1e:
            defpackage.fo.n(r2)
            goto L59
        L22:
            defpackage.ee0.J(r9)
            goto L32
        L26:
            defpackage.ee0.J(r9)
            r8.f = r5
            java.lang.Object r9 = r4.t(r8)
            if (r9 != r3) goto L32
            goto L54
        L32:
            i52 r9 = r4.f()
            if (r9 == 0) goto L56
            java.lang.Object r0 = r9.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r9.f
            f93 r9 = (defpackage.f93) r9
            long r1 = r9.a
            z82 r9 = r4.j
            if (r9 == 0) goto L56
            r8.f = r7
            d92 r9 = (defpackage.d92) r9
            java.lang.Object r8 = r9.c(r0, r1, r8)
            if (r8 != r3) goto L51
            goto L52
        L51:
            r8 = r6
        L52:
            if (r8 != r3) goto L56
        L54:
            r1 = r3
            goto L59
        L56:
            r4.B = r5
            r1 = r6
        L59:
            return r1
        L5a:
            ar2 r4 = (defpackage.ar2) r4
            int r0 = r8.f
            if (r0 == 0) goto L6a
            if (r0 != r5) goto L66
            defpackage.ee0.J(r9)
            goto L91
        L66:
            defpackage.fo.n(r2)
            goto L92
        L6a:
            defpackage.ee0.J(r9)
            i52 r9 = r4.d()
            if (r9 == 0) goto L91
            java.lang.Object r0 = r9.e
            dj r0 = (defpackage.dj) r0
            java.lang.Object r9 = r9.f
            f93 r9 = (defpackage.f93) r9
            long r1 = r9.a
            z82 r9 = r4.w
            if (r9 == 0) goto L91
            r8.f = r5
            d92 r9 = (defpackage.d92) r9
            java.lang.Object r8 = r9.c(r0, r1, r8)
            if (r8 != r3) goto L8c
            goto L8d
        L8c:
            r8 = r6
        L8d:
            if (r8 != r3) goto L91
            r1 = r3
            goto L92
        L91:
            r1 = r6
        L92:
            return r1
        L93:
            int r0 = r8.f
            if (r0 == 0) goto La1
            if (r0 != r5) goto L9d
            defpackage.ee0.J(r9)
            goto Lb0
        L9d:
            defpackage.fo.n(r2)
            goto Lb1
        La1:
            defpackage.ee0.J(r9)
            ul1 r4 = (defpackage.ul1) r4
            r8.f = r5
            java.lang.Object r8 = defpackage.on1.h(r4, r8)
            if (r8 != r3) goto Lb0
            r1 = r3
            goto Lb1
        Lb0:
            r1 = r6
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
