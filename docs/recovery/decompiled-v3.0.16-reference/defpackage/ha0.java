package defpackage;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ha0 implements vf0 {
    public final f4 a;
    public final ga0 b = new ga0(this, 0);
    public final ry1 c = new ry1();

    public ha0(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // defpackage.vf0
    public final Object a(m mVar, jf0 jf0Var) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new k(this, mVar, null, 21), jf0Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }
}
