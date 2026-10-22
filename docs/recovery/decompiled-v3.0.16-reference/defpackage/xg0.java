package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xg0 implements us2, yg0 {
    public final /* synthetic */ int a;
    public final us2 b;
    public final int c;

    public xg0(us2 us2Var, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = us2Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                fo.e(i, "count must be non-negative, but was ");
                throw null;
            default:
                us2Var.getClass();
                this.b = us2Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                fo.e(i, "count must be non-negative, but was ");
                throw null;
        }
    }

    @Override // defpackage.yg0
    public final us2 a(int i) {
        int i2 = this.a;
        us2 us2Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new xg0(this, i, 1) : new d23(us2Var, i3, i4);
            default:
                return i >= i3 ? this : new xg0(us2Var, i, 1);
        }
    }

    @Override // defpackage.yg0
    public final us2 b(int i) {
        int i2 = this.a;
        us2 us2Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new xg0(this, i, 0) : new xg0(us2Var, i4, 0);
            default:
                return i >= i3 ? yj0.a : new d23(us2Var, i, i3);
        }
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new wg0(this);
            default:
                return new wg0(this, (byte) 0);
        }
    }
}
