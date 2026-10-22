package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k70 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ k70(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int[] r14, defpackage.q60 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.h
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.g
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r2 = r13.f
            we2 r2 = (defpackage.we2) r2
            boolean r3 = r15 instanceof defpackage.ed3
            if (r3 == 0) goto L1f
            r3 = r15
            ed3 r3 = (defpackage.ed3) r3
            int r4 = r3.h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.h = r4
            goto L24
        L1f:
            ed3 r3 = new ed3
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.f
            int r4 = r3.h
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L38
            if (r4 != r6) goto L32
            goto L38
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r13)
            return r5
        L38:
            int[] r14 = r3.e
            defpackage.ee0.J(r15)
            goto L98
        L3e:
            defpackage.ee0.J(r15)
            java.lang.Object r15 = r2.e
            z70 r4 = defpackage.z70.e
            if (r15 != 0) goto L56
            java.util.Set r13 = defpackage.yo.H0(r0)
            r3.e = r14
            r3.h = r7
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.i
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.e
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.fo.n(r13)
            return r5
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.zy.N0(r15)
            r3.e = r14
            r3.h = r6
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.e = r14
            mf3 r13 = defpackage.mf3.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k70.a(int[], q60):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.i;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                x73 x73Var = (x73) obj5;
                me1 me1Var = (me1) obj3;
                if (((Boolean) obj).booleanValue() && me1Var.b()) {
                    k22.H((l83) obj4, me1Var, x73Var.l(), (c11) obj2, x73Var.b);
                } else {
                    k22.q(me1Var);
                }
                return mf3Var;
            case 1:
                s41 s41Var = (s41) obj;
                ue2 ue2Var = (ue2) obj5;
                ue2 ue2Var2 = (ue2) obj4;
                ue2 ue2Var3 = (ue2) obj3;
                boolean z = true;
                if (s41Var instanceof vb2) {
                    ue2Var3.e++;
                } else if ((s41Var instanceof wb2) || (s41Var instanceof ub2)) {
                    ue2Var3.e--;
                } else if (s41Var instanceof ly0) {
                    ue2Var2.e++;
                } else if (s41Var instanceof my0) {
                    ue2Var2.e--;
                } else if (s41Var instanceof jp0) {
                    ue2Var.e++;
                } else if (s41Var instanceof kp0) {
                    ue2Var.e--;
                }
                boolean z2 = false;
                boolean z3 = ue2Var3.e > 0;
                boolean z4 = ue2Var2.e > 0;
                boolean z5 = ue2Var.e > 0;
                ea0 ea0Var = (ea0) obj2;
                if (ea0Var.t != z3) {
                    ea0Var.t = z3;
                    z2 = true;
                }
                if (ea0Var.u != z4) {
                    ea0Var.u = z4;
                    z2 = true;
                }
                if (ea0Var.v != z5) {
                    ea0Var.v = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    ig0.z(ea0Var);
                }
                return mf3Var;
            default:
                return a((int[]) obj, q60Var);
        }
    }
}
