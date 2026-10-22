package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zc implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ j90 f;

    public /* synthetic */ zc(j90 j90Var, int i) {
        this.e = i;
        this.f = j90Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        j90 j90Var = this.f;
        switch (i) {
            case 0:
                return new x21(8.0f * j90Var.a(), j90Var.a(), 18, hz.c(0.15f, hz.b));
            case 1:
                return Float.valueOf(gh0.E(1.0f, 1.2f, j90Var.a()));
            case 2:
                return Float.valueOf(j90Var.b());
            case 3:
                j90Var.e.invoke(j90Var);
                BuildersKt__Builders_commonKt.launch$default(j90Var.a, null, null, new k(j90Var, (q60) null, 20), 3, null);
                return mf3.a;
            default:
                return Float.valueOf(((Number) j90Var.l.d()).floatValue());
        }
    }
}
