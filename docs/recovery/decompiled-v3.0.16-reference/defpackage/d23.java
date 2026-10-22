package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d23 implements us2, yg0 {
    public final us2 a;
    public final int b;
    public final int c;

    public d23(us2 us2Var, int i, int i2) {
        us2Var.getClass();
        this.a = us2Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            fo.f(p91.l(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            fo.f(p91.l(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        fo.f(p91.n("endIndex should be not less than startIndex, but was ", i2, i, " < "));
        throw null;
    }

    @Override // defpackage.yg0
    public final us2 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new d23(this.a, i3, i + i3);
    }

    @Override // defpackage.yg0
    public final us2 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? yj0.a : new d23(this.a, i3 + i, i2);
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        return new vv0(this);
    }
}
