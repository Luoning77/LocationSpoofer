package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class r33 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CoroutineScope f;
    public final /* synthetic */ au0 g;
    public final /* synthetic */ oh h;

    public /* synthetic */ r33(oh ohVar, CoroutineScope coroutineScope, au0 au0Var) {
        this.e = 3;
        this.h = ohVar;
        this.f = coroutineScope;
        this.g = au0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.g;
        oh ohVar = this.h;
        switch (i) {
            case 0:
                BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new md(ohVar, null, 1), 3, null);
                au0Var.invoke();
                break;
            case 1:
                BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new md(ohVar, null, 2), 3, null);
                au0Var.invoke();
                break;
            case 2:
                BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new md(ohVar, null, 3), 3, null);
                au0Var.invoke();
                break;
            default:
                if (((Number) ohVar.d()).floatValue() >= -10.0f) {
                    au0Var.invoke();
                } else {
                    BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new md(ohVar, null, 4), 3, null);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ r33(CoroutineScope coroutineScope, au0 au0Var, oh ohVar, int i) {
        this.e = i;
        this.f = coroutineScope;
        this.g = au0Var;
        this.h = ohVar;
    }
}
