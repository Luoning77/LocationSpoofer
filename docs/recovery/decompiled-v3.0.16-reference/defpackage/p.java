package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ix1 g;
    public final /* synthetic */ vb2 h;
    public final /* synthetic */ s i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(ix1 ix1Var, vb2 vb2Var, s sVar, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ix1Var;
        this.h = vb2Var;
        this.i = sVar;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new p(this.g, this.h, this.i, q60Var, 0);
            default:
                return new p(this.g, this.h, this.i, q60Var, 1);
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
        return ((p) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.e
            mf3 r1 = defpackage.mf3.a
            s r2 = r10.i
            ix1 r3 = r10.g
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            z70 r6 = defpackage.z70.e
            r7 = 1
            r8 = 2
            vb2 r9 = r10.h
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            int r0 = r10.f
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.ee0.J(r11)
            goto L41
        L20:
            defpackage.fo.n(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.ee0.J(r11)
            goto L37
        L29:
            defpackage.ee0.J(r11)
            long r4 = defpackage.xx.a
            r10.f = r7
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.f = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.F = r9
        L43:
            return r1
        L44:
            int r0 = r10.f
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.ee0.J(r11)
            goto L71
        L50:
            defpackage.fo.n(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.ee0.J(r11)
            goto L67
        L59:
            defpackage.ee0.J(r11)
            long r4 = defpackage.xx.a
            r10.f = r7
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.f = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.J = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
