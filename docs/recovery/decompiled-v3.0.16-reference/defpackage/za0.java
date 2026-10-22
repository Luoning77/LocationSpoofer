package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class za0 {
    public static final za0 a = new za0();

    public final void a(xv2 xv2Var, f30 f30Var, int i) {
        float f = xv2Var.g;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2137486921);
        int i2 = i | (ov0Var.f(xv2Var) ? 4 : 2);
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            lb3 lb3Var = xv2Var.i;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                fo.i("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = ov0Var.f(lb3Var) | ov0Var.f(null);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = by2.b(new ya0(xv2Var, 0));
                ov0Var.m0(objQ);
            }
            s03 s03VarA = aw2.a(((hz) ((s03) objQ).getValue()).a, mc0.K(vv1.g, ov0Var), ov0Var, 0, 12);
            p10 p10VarA0 = sb.a0(-1658896622, new aa0(xv2Var, 1), ov0Var);
            ov0Var.c0(690108113);
            ov0Var.p(false);
            dv1 dv1VarD = xv2Var.a.d(av1.a);
            boolean zF2 = ov0Var.f(s03VarA);
            Object objQ2 = ov0Var.Q();
            if (zF2 || objQ2 == c30Var) {
                objQ2 = new fd(s03VarA, 2);
                ov0Var.m0(objQ2);
            }
            dv1 dv1VarS = xp1.s(dv1VarD, (lu0) objQ2);
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new my(10);
                ov0Var.m0(objQ3);
            }
            dv1 dv1VarA = gs2.a(dv1VarS, false, (lu0) objQ3);
            Object objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                objQ4 = xa0.b;
                ov0Var.m0(objQ4);
            }
            dv1 dv1VarA2 = m33.a(dv1VarA, mf3.a, (PointerInputEventHandler) objQ4);
            er1 er1VarC = ws.c(j9.f, false);
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarA2);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            gh ghVar = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar);
            }
            q73.h(ov0Var, v20.c, dv1VarH);
            dv1 dv1VarO = xp1.o(k22.L(xv2Var.h));
            hh0 hh0Var = zj.a;
            boolean z = (i2 & 14) == 4;
            Object objQ5 = ov0Var.Q();
            if (z || objQ5 == c30Var) {
                objQ5 = new wa0();
                ov0Var.m0(objQ5);
            }
            zn0 zn0Var = (zn0) objQ5;
            long j = lb3Var.c;
            long j2 = lb3Var.d;
            long j3 = lb3Var.e;
            long j4 = lb3Var.f;
            p10 p10Var = xv2Var.b;
            q93 q93Var = xv2Var.c;
            q93 q93Var2 = xv2Var.d;
            p10 p10Var2 = xv2Var.e;
            float f2 = xv2Var.g;
            Object objQ6 = ov0Var.Q();
            if (objQ6 == c30Var) {
                objQ6 = new p4(28);
                ov0Var.m0(objQ6);
            }
            zj.c(dv1VarO, zn0Var, j, j2, j4, j3, p10Var, q93Var, q93Var2, (au0) objQ6, p10Var2, p10VarA0, f2, ov0Var, 0);
            ov0Var = ov0Var;
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i, 11, this, xv2Var);
        }
    }
}
