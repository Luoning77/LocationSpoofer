package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ve3 extends yb2 {
    public int[] a;
    public int b;

    @Override // defpackage.yb2
    public final Object a() {
        return new ue3(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.yb2
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.yb2
    public final int d() {
        return this.b;
    }
}
