package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ff3 extends yb2 {
    public short[] a;
    public int b;

    @Override // defpackage.yb2
    public final Object a() {
        return new ef3(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.yb2
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.yb2
    public final int d() {
        return this.b;
    }
}
