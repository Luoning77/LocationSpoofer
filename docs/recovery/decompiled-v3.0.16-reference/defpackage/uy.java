package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class uy extends v {
    public final y81 a;

    public uy(y81 y81Var) {
        this.a = y81Var;
    }

    @Override // defpackage.v
    public void f(l30 l30Var, int i, Object obj) {
        i(i, obj, l30Var.u(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // defpackage.y81
    public void serialize(ak0 ak0Var, Object obj) {
        int iD = d(obj);
        bt2 descriptor = getDescriptor();
        descriptor.getClass();
        m30 m30VarB = ak0Var.b(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            m30VarB.r(getDescriptor(), i, this.a, itC.next());
        }
        m30VarB.a(descriptor);
    }
}
