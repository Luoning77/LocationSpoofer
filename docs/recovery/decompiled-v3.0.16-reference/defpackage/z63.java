package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class z63 extends xx1 implements w81 {
    @Override // defpackage.fv
    public final k81 computeReflected() {
        xe2.a.getClass();
        return this;
    }

    @Override // defpackage.w81
    public final Object get() {
        return ((ey1) this.receiver).getValue();
    }

    @Override // defpackage.w81
    public final Object getDelegate() {
        return ((z63) getReflected()).getDelegate();
    }

    @Override // defpackage.w81
    /* JADX INFO: renamed from: getGetter */
    public final v81 mo108getGetter() {
        ((z63) getReflected()).mo108getGetter();
        return null;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        return get();
    }
}
