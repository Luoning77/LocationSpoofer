package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ci1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s52 f;

    public /* synthetic */ ci1(s52 s52Var, int i) {
        this.e = i;
        this.f = s52Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        s52 s52Var = this.f;
        switch (i) {
            case 0:
                s52Var.h(0.0f);
                break;
            case 1:
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                s52Var.h(Float.intBitsToFloat((int) (pa1Var.h0(0L) & 4294967295L)));
                break;
            default:
                s52Var.h(((Float) obj).floatValue());
                break;
        }
        return mf3Var;
    }
}
