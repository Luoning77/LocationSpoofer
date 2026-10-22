package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o22 extends s32 {
    public static final o22 c = new o22(0, 2, 1);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) throws IllegalAccessException, InvocationTargetException {
        m41 m41Var = (m41) jv0Var.c(1);
        int i = m41Var != null ? m41Var.a : 0;
        kw kwVar = (kw) jv0Var.c(0);
        if (i > 0) {
            unVar = new a01(unVar, i);
        }
        kwVar.J(unVar, kx2Var, ljVar, t32Var != null ? new d31(29, t32Var, kx2Var) : null);
    }
}
