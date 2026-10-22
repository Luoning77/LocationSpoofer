package defpackage;

import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vg3 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ y70 f;

    public /* synthetic */ vg3(y70 y70Var, int i) {
        this.e = i;
        this.f = y70Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        y70 y70Var = this.f;
        switch (i) {
            case 0:
                JobKt.ensureActive(y70Var);
                break;
            case 1:
                JobKt.ensureActive(y70Var);
                break;
            default:
                JobKt.ensureActive(y70Var);
                break;
        }
        return mf3Var;
    }
}
