package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class v implements y81 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // defpackage.y81
    public Object deserialize(w90 w90Var) {
        return e(w90Var);
    }

    public final Object e(w90 w90Var) {
        Object objA = a();
        int iB = b(objA);
        l30 l30VarB = w90Var.b(getDescriptor());
        while (true) {
            int iJ = l30VarB.j(getDescriptor());
            if (iJ == -1) {
                l30VarB.a(getDescriptor());
                return h(objA);
            }
            f(l30VarB, iJ + iB, objA);
        }
    }

    public abstract void f(l30 l30Var, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
