package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class u63 implements jz, yu0 {
    public final /* synthetic */ md1 a;

    public u63(md1 md1Var) {
        this.a = md1Var;
    }

    @Override // defpackage.yu0
    public final xu0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jz) || !(obj instanceof yu0)) {
            return false;
        }
        return this.a.equals(((yu0) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
