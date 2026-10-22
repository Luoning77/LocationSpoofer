package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hv0 {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    public final int d;
    public final int e;
    public final float[] f;

    public hv0(float[] fArr, float[] fArr2, float[] fArr3, int i, int i2) {
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr3;
        this.d = i;
        this.e = i2;
        if (fArr.length == 64 && fArr2.length == 64 && fArr3.length == 64) {
            this.f = new float[]{(float) yo.h0(fArr), (float) yo.h0(fArr2), (float) yo.h0(fArr3)};
        } else {
            fo.i("Failed requirement.");
            throw null;
        }
    }
}
