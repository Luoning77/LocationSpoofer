package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qc1 implements s03 {
    public final w52 e;
    public int f;

    public qc1(int i) {
        int i2 = (i / 30) * 30;
        this.e = new w52(mh0.f0(Math.max(i2 - 100, 0), i2 + 130), u92.q);
        this.f = i;
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return (k41) this.e.getValue();
    }
}
