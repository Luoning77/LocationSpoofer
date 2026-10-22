package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l21 extends n92 {
    public final boolean l;

    public l21(String str, m21 m21Var) {
        super(str, m21Var, 1);
        this.l = true;
    }

    @Override // defpackage.n92
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l21) {
            bt2 bt2Var = (bt2) obj;
            if (this.a.equals(bt2Var.b())) {
                l21 l21Var = (l21) obj;
                if (l21Var.l && Arrays.equals((bt2[]) this.j.getValue(), (bt2[]) l21Var.j.getValue())) {
                    int iD = bt2Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (o51.f(i(i2).b(), bt2Var.i(i2).b()) && o51.f(i(i2).c(), bt2Var.i(i2).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.n92
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.bt2
    public final boolean isInline() {
        return this.l;
    }
}
