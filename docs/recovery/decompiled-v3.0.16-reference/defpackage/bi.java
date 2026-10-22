package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bi extends aa1 implements lu0 {
    public final /* synthetic */ di f;
    public final /* synthetic */ h82 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(di diVar, h82 h82Var, long j) {
        super(1);
        this.f = diVar;
        this.g = h82Var;
        this.h = j;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        this.f.v.getClass();
        h82 h82Var = this.g;
        long j = (((long) h82Var.e) << 32) | (((long) h82Var.f) & 4294967295L);
        long j2 = this.h;
        g82.A((g82) obj, h82Var, (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f))) << 32));
        return mf3.a;
    }
}
