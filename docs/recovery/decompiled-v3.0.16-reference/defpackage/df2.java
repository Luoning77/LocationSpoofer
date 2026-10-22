package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class df2 extends rd3 {
    public final LinkedHashMap a;

    public df2(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, z71 z71Var, cf2 cf2Var);

    @Override // defpackage.rd3
    public final Object read(z71 z71Var) throws IOException {
        if (z71Var.u0() == 9) {
            z71Var.q0();
            return null;
        }
        Object objA = a();
        try {
            z71Var.F();
            while (z71Var.h0()) {
                cf2 cf2Var = (cf2) this.a.get(z71Var.o0());
                if (cf2Var == null || !cf2Var.e) {
                    z71Var.A0();
                } else {
                    c(objA, z71Var, cf2Var);
                }
            }
            z71Var.c0();
            return b(objA);
        } catch (IllegalAccessException e) {
            ke0 ke0Var = bf2.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new l71(e2);
        }
    }

    @Override // defpackage.rd3
    public final void write(i81 i81Var, Object obj) throws IOException {
        if (obj == null) {
            i81Var.f0();
            return;
        }
        i81Var.O();
        try {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((cf2) it.next()).a(i81Var, obj);
            }
            i81Var.c0();
        } catch (IllegalAccessException e) {
            ke0 ke0Var = bf2.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}
