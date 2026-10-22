package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eu1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ fu1 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ yz2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu1(fu1 fu1Var, float f, yz2 yz2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = fu1Var;
        this.h = f;
        this.i = yz2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new eu1(this.g, this.h, this.i, q60Var, 0);
            default:
                return new eu1(this.g, this.h, this.i, q60Var, 1);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((eu1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r15 == r6) goto L28;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.e
            mf3 r1 = defpackage.mf3.a
            float r2 = r14.h
            fu1 r3 = r14.g
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            z70 r6 = defpackage.z70.e
            r7 = 1
            switch(r0) {
                case 0: goto L3a;
                default: goto L11;
            }
        L11:
            int r0 = r14.f
            if (r0 == 0) goto L20
            if (r0 != r7) goto L1b
            defpackage.ee0.J(r15)
            goto L39
        L1b:
            defpackage.fo.n(r5)
            r1 = r4
            goto L39
        L20:
            defpackage.ee0.J(r15)
            oh r8 = r3.x
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r2)
            r14.f = r7
            yz2 r10 = r14.i
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = defpackage.oh.a(r8, r9, r10, r11, r12, r13)
            if (r14 != r6) goto L39
            r1 = r6
        L39:
            return r1
        L3a:
            r11 = r14
            int r14 = r11.f
            r0 = 2
            if (r14 == 0) goto L51
            if (r14 == r7) goto L4d
            if (r14 != r0) goto L48
            defpackage.ee0.J(r15)
            goto L78
        L48:
            defpackage.fo.n(r5)
            r1 = r4
            goto L78
        L4d:
            defpackage.ee0.J(r15)
            goto L61
        L51:
            defpackage.ee0.J(r15)
            kotlinx.coroutines.Job r14 = r3.y
            if (r14 == 0) goto L63
            r11.f = r7
            java.lang.Object r15 = r14.join(r11)
            if (r15 != r6) goto L61
            goto L77
        L61:
            mf3 r15 = (defpackage.mf3) r15
        L63:
            oh r7 = r3.x
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r2)
            r11.f = r0
            yz2 r9 = r11.i
            r10 = 0
            r12 = 12
            java.lang.Object r14 = defpackage.oh.a(r7, r8, r9, r10, r11, r12)
            if (r14 != r6) goto L78
        L77:
            r1 = r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
