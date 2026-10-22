package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m32 extends s32 {
    public static final m32 c = new m32(0, 1, 1);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        ee2 ee2Var = (ee2) jv0Var.c(0);
        zx1 zx1Var = (zx1) ljVar.j;
        h72 h72Var = zx1Var != null ? (h72) zx1Var.g(ee2Var) : null;
        if (h72Var != null) {
            ArrayList arrayList = ljVar.a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                ljVar.a = arrayList;
            }
            arrayList.add((gy1) ljVar.f);
            ljVar.f = h72Var.f;
        }
    }
}
