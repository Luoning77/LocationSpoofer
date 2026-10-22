package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wv2 extends ig0 {
    public final w52 g;

    public wv2() {
        k91 k91Var = lu2.a;
        this.g = ke0.H(null);
    }

    @Override // defpackage.ig0
    public final boolean m(k91 k91Var) {
        return k91Var == lu2.a;
    }

    @Override // defpackage.ig0
    public final Object q(k91 k91Var) {
        if (k91Var != lu2.a) {
            p21.c("Check failed.");
        }
        Object value = this.g.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
