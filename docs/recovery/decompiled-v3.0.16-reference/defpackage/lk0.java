package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lk0 extends aa1 implements lu0 {
    public final /* synthetic */ h82 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ ah i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(h82 h82Var, long j, long j2, ah ahVar) {
        super(1);
        this.f = h82Var;
        this.g = j;
        this.h = j2;
        this.i = ahVar;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        long j = this.g;
        long j2 = this.h;
        h82 h82Var = this.f;
        ((g82) obj).x(h82Var);
        h82Var.I0(h41.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), h82Var.i), 0.0f, this.i);
        return mf3.a;
    }
}
