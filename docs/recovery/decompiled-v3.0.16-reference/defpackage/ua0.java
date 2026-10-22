package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ua0 implements ao2 {
    public final /* synthetic */ va0 a;

    public ua0(va0 va0Var) {
        this.a = va0Var;
    }

    @Override // defpackage.ao2
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        va0 va0Var = this.a;
        float fFloatValue = ((Number) va0Var.a.invoke(Float.valueOf(f))).floatValue();
        va0Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        va0Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
