package defpackage;

import java.util.Arrays;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class oi0 {
    public static final ed0 a = new ed0();

    public static final void a(Object obj, lu0 lu0Var, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(obj);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new cd0(lu0Var);
            ov0Var.m0(objQ);
        }
    }

    public static final void b(Object obj, Object obj2, lu0 lu0Var, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(obj) | ov0Var.f(obj2);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new cd0(lu0Var);
            ov0Var.m0(objQ);
        }
    }

    public static final void c(Object obj, Object obj2, Object obj3, lu0 lu0Var, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(obj) | ov0Var.f(obj2) | ov0Var.f(obj3);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new cd0(lu0Var);
            ov0Var.m0(objQ);
        }
    }

    public static final void d(Object[] objArr, lu0 lu0Var, f30 f30Var) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((ov0) f30Var).f(obj);
        }
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            ov0Var.m0(new cd0(lu0Var));
        }
    }

    public static final void e(f30 f30Var, pu0 pu0Var, Object obj) {
        y70 y70Var = ((ov0) f30Var).R;
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(obj);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new ia1(y70Var, pu0Var);
            ov0Var.m0(objQ);
        }
    }

    public static final void f(Object obj, Object obj2, pu0 pu0Var, f30 f30Var) {
        y70 y70Var = ((ov0) f30Var).R;
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(obj) | ov0Var.f(obj2);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new ia1(y70Var, pu0Var);
            ov0Var.m0(objQ);
        }
    }

    public static final void g(Object obj, Object obj2, Object obj3, pu0 pu0Var, f30 f30Var) {
        y70 y70Var = ((ov0) f30Var).R;
        ov0 ov0Var = (ov0) f30Var;
        boolean zF = ov0Var.f(obj) | ov0Var.f(obj2) | ov0Var.f(obj3);
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            objQ = new ia1(y70Var, pu0Var);
            ov0Var.m0(objQ);
        }
    }

    public static final void h(Object[] objArr, pu0 pu0Var, f30 f30Var) {
        y70 y70Var = ((ov0) f30Var).R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((ov0) f30Var).f(obj);
        }
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (zF || objQ == d30.a) {
            ov0Var.m0(new ia1(y70Var, pu0Var));
        }
    }

    public static final void i(au0 au0Var, f30 f30Var) {
        u32 u32Var = ((ov0) f30Var).M.b.F0;
        u32Var.V(k32.c);
        wc0.h0(u32Var, 0, au0Var);
    }

    public static final CoroutineScope j(f30 f30Var) {
        Job.Key.getClass();
        return new of2(((ov0) f30Var).R);
    }
}
