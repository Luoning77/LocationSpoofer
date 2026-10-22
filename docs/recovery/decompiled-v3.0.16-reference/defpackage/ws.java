package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ws {
    public static final zx1 a = b(true);
    public static final zx1 b = b(false);
    public static final lc c = lc.e;

    public static final void a(dv1 dv1Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-211209833);
        int i2 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(ov0Var.T);
            dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
            l72 l72VarL = ov0Var.l();
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, c);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new l8(dv1Var, i, i3);
        }
    }

    public static final zx1 b(boolean z) {
        zx1 zx1Var = new zx1(9);
        pr prVar = j9.f;
        zx1Var.m(prVar, new ys(prVar, z));
        pr prVar2 = j9.g;
        zx1Var.m(prVar2, new ys(prVar2, z));
        pr prVar3 = j9.h;
        zx1Var.m(prVar3, new ys(prVar3, z));
        pr prVar4 = j9.i;
        zx1Var.m(prVar4, new ys(prVar4, z));
        pr prVar5 = j9.j;
        zx1Var.m(prVar5, new ys(prVar5, z));
        pr prVar6 = j9.k;
        zx1Var.m(prVar6, new ys(prVar6, z));
        pr prVar7 = j9.l;
        zx1Var.m(prVar7, new ys(prVar7, z));
        pr prVar8 = j9.m;
        zx1Var.m(prVar8, new ys(prVar8, z));
        pr prVar9 = j9.n;
        zx1Var.m(prVar9, new ys(prVar9, z));
        return zx1Var;
    }

    public static final er1 c(pr prVar, boolean z) {
        er1 er1Var = (er1) (z ? a : b).g(prVar);
        return er1Var == null ? new ys(prVar, z) : er1Var;
    }

    public static final void d(g82 g82Var, h82 h82Var, zq1 zq1Var, qa1 qa1Var, int i, int i2, pr prVar) {
        l9 l9Var;
        Object objA = zq1Var.A();
        vs vsVar = objA instanceof vs ? (vs) objA : null;
        g82.A(g82Var, h82Var, ((vsVar == null || (l9Var = vsVar.s) == null) ? prVar : l9Var).a((((long) h82Var.e) << 32) | (((long) h82Var.f) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), qa1Var));
    }
}
