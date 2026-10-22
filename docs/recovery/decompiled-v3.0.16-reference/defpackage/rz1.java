package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rz1 {
    public cv1 a;
    public int b;
    public gy1 c;
    public gy1 d;
    public boolean e;
    public final /* synthetic */ tz1 f;

    public rz1(tz1 tz1Var, cv1 cv1Var, int i, gy1 gy1Var, gy1 gy1Var2, boolean z) {
        this.f = tz1Var;
        this.a = cv1Var;
        this.b = i;
        this.c = gy1Var;
        this.d = gy1Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        gy1 gy1Var = this.c;
        int i3 = this.b;
        bv1 bv1Var = (bv1) gy1Var.e[i + i3];
        bv1 bv1Var2 = (bv1) this.d.e[i3 + i2];
        return o51.f(bv1Var, bv1Var2) || bv1Var.getClass() == bv1Var2.getClass();
    }
}
