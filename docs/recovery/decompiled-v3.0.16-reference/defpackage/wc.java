package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class wc implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ j90 f;

    public /* synthetic */ wc(j90 j90Var, int i) {
        this.e = i;
        this.f = j90Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        j90 j90Var = this.f;
        switch (i) {
            case 0:
                ag0 ag0Var = (ag0) obj;
                ag0Var.getClass();
                float fA = j90Var.a();
                float f = ag0Var.e;
                ke0.F(ag0Var, 10.0f * f * fA, f * 14.0f * fA, true, 0.5f);
                break;
            case 1:
                ow0 ow0Var = (ow0) obj;
                ow0Var.getClass();
                ow0Var.l(((Number) j90Var.o.d()).floatValue());
                ow0Var.r(((Number) j90Var.p.d()).floatValue());
                float fFloatValue = ((Number) j90Var.m.d()).floatValue() / 10.0f;
                float fE = ow0Var.e();
                float f2 = 0.75f * fFloatValue;
                if (f2 < -0.2f) {
                    f2 = -0.2f;
                }
                if (f2 > 0.2f) {
                    f2 = 0.2f;
                }
                ow0Var.l(fE / (1.0f - f2));
                float fV = ow0Var.v();
                float f3 = fFloatValue * 0.25f;
                float f4 = f3 >= -0.2f ? f3 : -0.2f;
                ow0Var.r((1.0f - (f4 <= 0.2f ? f4 : 0.2f)) * fV);
                break;
            case 2:
                ow0 ow0Var2 = (ow0) obj;
                ow0Var2.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ow0Var2.a() >> 32));
                if (fIntBitsToFloat < 1.0f) {
                    fIntBitsToFloat = 1.0f;
                }
                float fE2 = gh0.E(1.0f, ((ow0Var2.g() * 16.0f) / fIntBitsToFloat) + 1.0f, j90Var.a());
                ow0Var2.l(fE2);
                ow0Var2.r(fE2);
                break;
            case 3:
                ((x92) obj).getClass();
                j90Var.d.f.e = ((Number) j90Var.l.e.getValue()).floatValue();
                gb0 gb0Var = (gb0) j90Var.r.f;
                ai3 ai3Var = gb0Var.a;
                o90[] o90VarArr = ai3Var.d;
                yo.s0(0, o90VarArr.length, null, o90VarArr);
                ai3Var.e = 0;
                ai3 ai3Var2 = gb0Var.b;
                o90[] o90VarArr2 = ai3Var2.d;
                yo.s0(0, o90VarArr2.length, null, o90VarArr2);
                ai3Var2.e = 0;
                gb0Var.c = 0L;
                BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new l80(j90Var, q60Var, 3), 3, null);
                break;
            case 4:
                ((x92) obj).getClass();
                j90Var.e.invoke(j90Var);
                BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new k(j90Var, q60Var, 20), 3, null);
                break;
            default:
                us1 us1Var = j90Var.r;
                ((gb0) us1Var.f).a(System.currentTimeMillis(), (((long) Float.floatToRawIntBits(j90Var.b())) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))));
                float fB = yh3.b(us1Var.h(g93.c(Float.MAX_VALUE, Float.MAX_VALUE)));
                fy fyVar = j90Var.b;
                BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new c90(j90Var, fB / (Float.valueOf(fyVar.f).floatValue() - Float.valueOf(fyVar.e).floatValue()), q60Var, 2), 3, null);
                break;
        }
        return mf3Var;
    }
}
