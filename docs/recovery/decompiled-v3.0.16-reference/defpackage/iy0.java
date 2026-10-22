package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iy0 implements au2 {
    public static final iy0 b = new iy0(0);
    public static final iy0 c = new iy0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ iy0(int i) {
        this.a = i;
    }

    @Override // defpackage.au2
    public final vd0 a(long j, qa1 qa1Var, xb0 xb0Var) {
        switch (this.a) {
            case 0:
                float fN0 = xb0Var.n0(30.0f);
                return new a42(new pe2(0.0f, -fN0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fN0));
            case 1:
                float fN1 = xb0Var.n0(30.0f);
                return new a42(new pe2(-fN1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fN1, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new a42(ce0.d(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
