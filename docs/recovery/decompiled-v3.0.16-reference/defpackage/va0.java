package defpackage;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class va0 implements qo2 {
    public final lu0 a;
    public final ua0 b = new ua0(this);
    public final ry1 c = new ry1();
    public final w52 d;
    public final w52 e;
    public final w52 f;

    public va0(lu0 lu0Var) {
        this.a = lu0Var;
        Boolean bool = Boolean.FALSE;
        this.d = ke0.H(bool);
        this.e = ke0.H(bool);
        this.f = ke0.H(bool);
    }

    @Override // defpackage.qo2
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.qo2
    public final Object d(jy1 jy1Var, pu0 pu0Var, r60 r60Var) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new m(this, jy1Var, pu0Var, null, 7), r60Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }

    @Override // defpackage.qo2
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
