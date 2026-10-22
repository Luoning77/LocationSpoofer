package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fw2 extends aa1 implements lu0 {
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ gr1 i;
    public final /* synthetic */ h82 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw2(gw2 gw2Var, long j, int i, int i2, gr1 gr1Var, h82 h82Var) {
        super(1);
        this.f = j;
        this.g = i;
        this.h = i2;
        this.i = gr1Var;
        this.j = h82Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        g82 g82Var = (g82) obj;
        long j = (((long) this.g) << 32) | (((long) this.h) & 4294967295L);
        qa1 layoutDirection = this.i.getLayoutDirection();
        long j2 = this.f;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == qa1.e ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        g82.A(g82Var, this.j, (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
        return mf3.a;
    }
}
