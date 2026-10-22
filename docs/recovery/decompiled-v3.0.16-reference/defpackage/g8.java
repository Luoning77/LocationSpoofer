package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class g8 implements s7, yl0 {
    public final /* synthetic */ Object e;

    public /* synthetic */ g8(Object obj) {
        this.e = obj;
    }

    @Override // defpackage.yl0
    public zl0 a(xd2 xd2Var) {
        return (zl0) this.e;
    }

    @Override // defpackage.s7
    public void b(Object obj) {
        ((lu0) ((ey1) this.e).getValue()).invoke(obj);
    }

    public void c() {
        pu0 pu0Var = (pu0) this.e;
        synchronized (tx2.c) {
            tx2.h = zy.v0(pu0Var, tx2.h);
        }
    }
}
