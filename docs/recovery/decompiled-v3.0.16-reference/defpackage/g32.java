package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g32 extends s32 {
    public static final g32 c = new g32(0, 1, 1);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        ee2 ee2Var = (ee2) jv0Var.c(0);
        Set set = (Set) ljVar.b;
        if (set == null) {
            return;
        }
        h72 h72Var = new h72(set);
        zx1 zx1Var = (zx1) ljVar.j;
        if (zx1Var == null) {
            long[] jArr = hn2.a;
            zx1Var = new zx1();
            ljVar.j = zx1Var;
        }
        zx1Var.m(ee2Var, h72Var);
        ((gy1) ljVar.f).b(new sv0(h72Var, -1));
    }
}
