package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zo0 implements FlowCollector {
    public final /* synthetic */ FlowCollector e;
    public final /* synthetic */ ii2 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ lu0 h;

    public zo0(FlowCollector flowCollector, ii2 ii2Var, boolean z, lu0 lu0Var) {
        this.e = flowCollector;
        this.f = ii2Var;
        this.g = z;
        this.h = lu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.emit(r8, r0) == r5) goto L22;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, defpackage.q60 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yo0
            if (r0 == 0) goto L13
            r0 = r8
            yo0 r0 = (defpackage.yo0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            yo0 r0 = new yo0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.f
            r2 = 0
            r3 = 2
            r4 = 1
            z70 r5 = defpackage.z70.e
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ee0.J(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            return r2
        L31:
            kotlinx.coroutines.flow.FlowCollector r6 = r0.g
            defpackage.ee0.J(r8)
            goto L50
        L37:
            defpackage.ee0.J(r8)
            java.util.Set r7 = (java.util.Set) r7
            kotlinx.coroutines.flow.FlowCollector r7 = r6.e
            r0.g = r7
            r0.f = r4
            lu0 r8 = r6.h
            ii2 r1 = r6.f
            boolean r6 = r6.g
            java.lang.Object r8 = defpackage.ks.X(r0, r8, r1, r4, r6)
            if (r8 != r5) goto L4f
            goto L5a
        L4f:
            r6 = r7
        L50:
            r0.g = r2
            r0.f = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r5) goto L5b
        L5a:
            return r5
        L5b:
            mf3 r6 = defpackage.mf3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo0.emit(java.lang.Object, q60):java.lang.Object");
    }
}
