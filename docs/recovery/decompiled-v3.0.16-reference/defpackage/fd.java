package defpackage;

import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fd implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s03 f;

    public /* synthetic */ fd(s03 s03Var, int i) {
        this.e = i;
        this.f = s03Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        s03 s03Var = this.f;
        switch (i) {
            case 0:
                ow0 ow0Var = (ow0) obj;
                ow0Var.getClass();
                ow0Var.p(nd.b(s03Var));
                return mf3Var;
            case 1:
                ow0 ow0Var2 = (ow0) obj;
                ow0Var2.getClass();
                ow0Var2.p(nd.b(s03Var));
                return mf3Var;
            case 2:
                jg0 jg0Var = (jg0) obj;
                long j = ((hz) s03Var.getValue()).a;
                if (!ye3.a(j, hz.g)) {
                    jg0.c0(jg0Var, j, 0L, 0L, 0.0f, null, 0, 126);
                }
                return mf3Var;
            case 3:
                jg0 jg0Var2 = (jg0) obj;
                jg0Var2.getClass();
                jg0.c0(jg0Var2, ((hz) s03Var.getValue()).a, 0L, 0L, 0.0f, null, 0, 126);
                return mf3Var;
            case 4:
                xb0 xb0Var = (xb0) obj;
                xb0Var.getClass();
                return new h41(((long) xb0Var.n0(((td0) s03Var.getValue()).e)) << 32);
            case Logger.WARN /* 5 */:
                ow0 ow0Var3 = (ow0) obj;
                ow0Var3.getClass();
                ow0Var3.l(((Number) s03Var.getValue()).floatValue());
                ow0Var3.r(((Number) s03Var.getValue()).floatValue());
                return mf3Var;
            case Logger.ERROR /* 6 */:
                jg0 jg0Var3 = (jg0) obj;
                jg0Var3.getClass();
                jg0.Y(jg0Var3, ((hz) s03Var.getValue()).a, 0.0f, 0L, null, 126);
                return mf3Var;
            default:
                ((ow0) obj).d(((Number) s03Var.getValue()).floatValue());
                return mf3Var;
        }
    }
}
