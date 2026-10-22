package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class z23 implements bl2 {
    public final s23 e;
    public final String f;
    public boolean g;

    public z23(s23 s23Var, String str) {
        this.e = s23Var;
        this.f = str;
    }

    public final void A() {
        if (this.g) {
            mh0.d0(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public void f() {
        A();
    }

    @Override // defpackage.bl2
    public void reset() {
        A();
    }
}
