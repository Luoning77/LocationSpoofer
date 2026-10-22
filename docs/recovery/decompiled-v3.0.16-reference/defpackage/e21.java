package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e21 implements s03 {
    public Float e;
    public Float f;
    public final w52 g;
    public h53 h;
    public boolean i;
    public boolean j;
    public long k;
    public final /* synthetic */ g21 l;

    public e21(g21 g21Var, Float f, Float f2, d21 d21Var) {
        this.l = g21Var;
        this.e = f;
        this.f = f2;
        this.g = ke0.H(f);
        this.h = new h53(d21Var, o51.v0, this.e, this.f, null);
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return this.g.getValue();
    }
}
