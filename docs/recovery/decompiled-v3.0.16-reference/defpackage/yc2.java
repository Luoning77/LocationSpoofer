package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class yc2 extends ad2 implements w81 {
    @Override // defpackage.fv
    public k81 computeReflected() {
        xe2.a.getClass();
        return this;
    }

    @Override // defpackage.w81
    public Object getDelegate() {
        return ((w81) getReflected()).getDelegate();
    }

    @Override // defpackage.w81
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public v81 mo108getGetter() {
        ((w81) getReflected()).mo108getGetter();
        return null;
    }

    @Override // defpackage.au0
    public Object invoke() {
        return get();
    }

    public /* bridge */ /* synthetic */ u81 getGetter() {
        mo108getGetter();
        return null;
    }
}
