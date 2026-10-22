package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f0 extends g0 implements RandomAccess {
    public final g0 e;
    public final int f;
    public final int g;

    public f0(g0 g0Var, int i, int i2) {
        this.e = g0Var;
        this.f = i;
        o51.i(i, i2, g0Var.a());
        this.g = i2 - i;
    }

    @Override // defpackage.u
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            fo.p(p91.n("index: ", i, i2, ", size: "));
            return null;
        }
        return this.e.get(this.f + i);
    }

    @Override // defpackage.g0, java.util.List
    public final List subList(int i, int i2) {
        o51.i(i, i2, this.g);
        int i3 = this.f;
        return new f0(this.e, i + i3, i3 + i2);
    }
}
