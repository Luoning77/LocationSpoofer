package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class l31 extends cv1 implements tc3 {
    public sk3 s;
    public sk3 t;

    public l31() {
        nn0 nn0Var = xq1.H;
        this.s = nn0Var;
        this.t = nn0Var;
    }

    @Override // defpackage.tc3
    public final Object H() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.cv1
    public void e1() {
        q73.i(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k31(this, 1));
        n1();
    }

    @Override // defpackage.cv1
    public void f1() {
        this.t = this.s;
        q73.k(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k31(this, 0));
    }

    @Override // defpackage.cv1
    public final void g1() {
        this.s = xq1.H;
    }

    public abstract sk3 m1(sk3 sk3Var);

    public void n1() {
        this.t = m1(this.s);
        q73.k(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k31(this, 0));
    }
}
