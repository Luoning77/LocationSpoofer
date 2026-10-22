package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ij0 implements hj0 {
    public final int e;
    public int f = -1;
    public int g = -1;

    public ij0(int i) {
        this.e = i;
    }

    @Override // defpackage.hj0
    public final boolean j(CharSequence charSequence, int i, int i2, ee3 ee3Var) {
        int i3 = this.e;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f = i;
        this.g = i2;
        return false;
    }

    @Override // defpackage.hj0
    public final Object a() {
        return this;
    }
}
