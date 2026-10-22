package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kc2 implements ey1, CoroutineScope {
    public final /* synthetic */ ey1 e;
    public final y70 f;

    public kc2(ey1 ey1Var, y70 y70Var) {
        this.e = ey1Var;
        this.f = y70Var;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final y70 getCoroutineContext() {
        return this.f;
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return this.e.getValue();
    }

    @Override // defpackage.ey1
    public final void setValue(Object obj) {
        this.e.setValue(obj);
    }
}
