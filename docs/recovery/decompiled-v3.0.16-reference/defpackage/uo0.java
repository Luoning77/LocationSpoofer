package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class uo0 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ uo0(float f, pu0 pu0Var, ey1 ey1Var) {
        this.f = f;
        this.g = pu0Var;
        this.h = ey1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                pu0 pu0Var = (pu0) obj4;
                ey1 ey1Var = (ey1) obj3;
                x92 x92Var = (x92) obj;
                x92Var.getClass();
                x92Var.a();
                j52 j52Var = wo0.a;
                long jE = c12.e(((c12) ey1Var.getValue()).a, ((c12) obj2).a);
                int i2 = (int) (jE >> 32);
                int i3 = (int) (jE & 4294967295L);
                float fSqrt = (float) Math.sqrt((Float.intBitsToFloat(i3) * Float.intBitsToFloat(i3)) + (Float.intBitsToFloat(i2) * Float.intBitsToFloat(i2)));
                float f = this.f;
                if (fSqrt > f) {
                    jE = c12.f(f / fSqrt, jE);
                }
                ey1Var.setValue(new c12(jE));
                pu0Var.invoke(Double.valueOf(((Math.toDegrees(Math.atan2(Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a & 4294967295L)), Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a >> 32)))) + 90.0d) + 360.0d) % 360.0d), Float.valueOf(mh0.u(((float) Math.sqrt((Float.intBitsToFloat((int) (4294967295L & ((c12) ey1Var.getValue()).a)) * Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a & 4294967295L))) + (Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a >> 32)) * Float.intBitsToFloat((int) (((c12) ey1Var.getValue()).a >> 32))))) / f, 0.0f, 1.0f)));
                break;
            default:
                float fFloatValue = ((Float) obj2).floatValue();
                ((x92) obj).getClass();
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj4, null, null, new oo2((oh) obj3, fFloatValue, this.f, null, 1), 3, null);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ uo0(CoroutineScope coroutineScope, oh ohVar, float f) {
        this.g = coroutineScope;
        this.h = ohVar;
        this.f = f;
    }
}
