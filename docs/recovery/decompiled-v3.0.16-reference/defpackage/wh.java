package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wh extends aa1 implements lu0 {
    public final /* synthetic */ h82[] f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(h82[] h82VarArr, xh xhVar, int i, int i2) {
        super(1);
        this.f = h82VarArr;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        g82 g82Var = (g82) obj;
        for (h82 h82Var : this.f) {
            if (h82Var != null) {
                long j = (((long) h82Var.e) << 32) | (((long) h82Var.f) & 4294967295L);
                long j2 = (((long) this.g) << 32) | (((long) this.h) & 4294967295L);
                long jRound = (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f))) << 32);
                g82.z(g82Var, h82Var, (int) (jRound >> 32), (int) (jRound & 4294967295L));
            }
        }
        return mf3.a;
    }
}
