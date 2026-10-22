package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jd0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;

    public /* synthetic */ jd0(float f, int i, long j) {
        this.e = i;
        this.f = f;
        this.g = j;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        float f = this.f;
        switch (i) {
            case 0:
                jg0 jg0Var = (jg0) obj;
                float fR = jg0Var.R(f);
                jg0.k0(jg0Var, this.g, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(jg0Var.R(f) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var.a() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(jg0Var.R(f) / 2.0f))), fR, 0, 496);
                break;
            default:
                jg0 jg0Var2 = (jg0) obj;
                float fR2 = jg0Var2.R(f);
                jg0.k0(jg0Var2, this.g, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(jg0Var2.R(f) / 2.0f) << 32), (((long) Float.floatToRawIntBits(jg0Var2.R(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var2.a() & 4294967295L))))), fR2, 0, 496);
                break;
        }
        return mf3Var;
    }
}
