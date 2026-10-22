package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ac2 extends uy {
    public final zb2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac2(y81 y81Var) {
        super(y81Var);
        y81Var.getClass();
        this.b = new zb2(y81Var.getDescriptor());
    }

    @Override // defpackage.v
    public final Object a() {
        return (yb2) g(j());
    }

    @Override // defpackage.v
    public final int b(Object obj) {
        yb2 yb2Var = (yb2) obj;
        yb2Var.getClass();
        return yb2Var.d();
    }

    @Override // defpackage.v
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.v, defpackage.y81
    public final Object deserialize(w90 w90Var) {
        return e(w90Var);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.v
    public final Object h(Object obj) {
        yb2 yb2Var = (yb2) obj;
        yb2Var.getClass();
        return yb2Var.a();
    }

    @Override // defpackage.uy
    public final void i(int i, Object obj, Object obj2) {
        ((yb2) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(m30 m30Var, Object obj, int i);

    @Override // defpackage.uy, defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        int iD = d(obj);
        zb2 zb2Var = this.b;
        m30 m30VarB = ak0Var.b(zb2Var);
        k(m30VarB, obj, iD);
        m30VarB.a(zb2Var);
    }
}
