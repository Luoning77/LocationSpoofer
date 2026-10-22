package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ee1 implements qk3 {
    public au0 a;
    public w52 b;
    public final w52 c = ke0.H(Boolean.FALSE);

    public final long a() {
        dc0 dc0Var;
        w52 w52VarH = this.b;
        if (w52VarH == null) {
            au0 au0Var = this.a;
            if (au0Var == null || (dc0Var = (dc0) au0Var.invoke()) == null) {
                dc0Var = dc0.c;
            }
            w52VarH = ke0.H(dc0Var);
            this.b = w52VarH;
            this.a = null;
        }
        return ((dc0) w52VarH.getValue()).b;
    }
}
