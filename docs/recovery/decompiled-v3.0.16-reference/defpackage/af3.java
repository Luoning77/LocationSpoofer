package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class af3 extends yb2 {
    public long[] a;
    public int b;

    @Override // defpackage.yb2
    public final Object a() {
        return new ze3(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.yb2
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.yb2
    public final int d() {
        return this.b;
    }
}
