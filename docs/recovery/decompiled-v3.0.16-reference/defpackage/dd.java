package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dd implements au0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ dd(float f, lu0 lu0Var, s52 s52Var) {
        this.f = f;
        this.h = lu0Var;
        this.g = s52Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        float f = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                oh ohVar = (oh) obj;
                s52 s52Var = (s52) obj2;
                float fB = 0.0f;
                if (s52Var.g() != 0.0f) {
                    float fFloatValue = ((Number) ohVar.d()).floatValue() / s52Var.g();
                    if (fFloatValue < -1.0f) {
                        fFloatValue = -1.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    fB = kh0.a.b(Math.abs(fFloatValue)) * Math.signum(fFloatValue) * f;
                }
                return Float.valueOf(fB);
            case 1:
                s52 s52Var2 = (s52) obj2;
                float fU = mh0.u(s52Var2.g() + f, 0.2f, 45.0f);
                s52Var2.h(fU);
                ((lu0) obj).invoke(Double.valueOf(fU));
                return mf3Var;
            default:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, null, new p20((oh) obj, f, null), 3, null);
                return mf3Var;
        }
    }

    public /* synthetic */ dd(oh ohVar, float f, s52 s52Var) {
        this.h = ohVar;
        this.f = f;
        this.g = s52Var;
    }

    public /* synthetic */ dd(CoroutineScope coroutineScope, oh ohVar, float f) {
        this.g = coroutineScope;
        this.h = ohVar;
        this.f = f;
    }
}
