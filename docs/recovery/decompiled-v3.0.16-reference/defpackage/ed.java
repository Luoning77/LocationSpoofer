package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ed implements qu0 {
    public final /* synthetic */ te2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ CoroutineScope h;
    public final /* synthetic */ s52 i;
    public final /* synthetic */ oh j;

    public /* synthetic */ ed(te2 te2Var, boolean z, int i, CoroutineScope coroutineScope, s52 s52Var, oh ohVar) {
        this.e = te2Var;
        this.f = z;
        this.g = i;
        this.h = coroutineScope;
        this.i = s52Var;
        this.j = ohVar;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j90 j90Var = (j90) obj;
        c12 c12Var = (c12) obj3;
        j90Var.getClass();
        s52 s52Var = this.i;
        if (s52Var.g() > 0.0f) {
            te2 te2Var = this.e;
            float fIntBitsToFloat = ((Float.intBitsToFloat((int) (c12Var.a >> 32)) / s52Var.g()) * (this.f ? 1.0f : -1.0f)) + te2Var.e;
            te2Var.e = fIntBitsToFloat;
            float f = this.g - 1;
            float f2 = fIntBitsToFloat >= 0.0f ? fIntBitsToFloat : 0.0f;
            if (f2 <= f) {
                f = f2;
            }
            BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new i90(j90Var, ((Number) mh0.x(Float.valueOf(f), j90Var.b)).floatValue(), null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new k(this.j, c12Var, null, 4), 3, null);
        }
        return mf3.a;
    }
}
