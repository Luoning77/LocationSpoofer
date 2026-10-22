package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hj {
    public static final i52 a;

    static {
        uj0 uj0Var = uj0.e;
        a = new i52(uj0Var, uj0Var);
    }

    public static final void a(dj djVar, List list, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1794596951);
        int i3 = (i & 6) == 0 ? (ov0Var.f(djVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= ov0Var.h(list) ? 32 : 16;
        }
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                cj cjVar = (cj) list.get(i4);
                qu0 qu0Var = (qu0) cjVar.a;
                int i5 = cjVar.b;
                int i6 = cjVar.c;
                Object objQ = ov0Var.Q();
                if (objQ == d30.a) {
                    objQ = lc.d;
                    ov0Var.m0(objQ);
                }
                er1 er1Var = (er1) objQ;
                int iHashCode = Long.hashCode(ov0Var.T);
                l72 l72VarL = ov0Var.l();
                dv1 dv1VarH = xp1.H(ov0Var, av1.a);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, v20.e, er1Var);
                q73.h(ov0Var, v20.d, l72VarL);
                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                q73.g(ov0Var, v20.g);
                q73.h(ov0Var, v20.c, dv1VarH);
                qu0Var.invoke(djVar.subSequence(i5, i6).f, ov0Var, 0);
                ov0Var.p(true);
            }
            i2 = 0;
        } else {
            i2 = 0;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj(i, i2, djVar, list);
        }
    }
}
