package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e11 extends g0 {
    public final n0 e;
    public final int f;
    public final int g;

    public e11(n0 n0Var, int i, int i2) {
        this.e = n0Var;
        this.f = i;
        gh0.s(i, i2, n0Var.a());
        this.g = i2 - i;
    }

    @Override // defpackage.u
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gh0.q(i, this.g);
        return this.e.get(this.f + i);
    }

    @Override // defpackage.g0, java.util.List
    public final List subList(int i, int i2) {
        gh0.s(i, i2, this.g);
        int i3 = this.f;
        return new e11(this.e, i + i3, i3 + i2);
    }
}
