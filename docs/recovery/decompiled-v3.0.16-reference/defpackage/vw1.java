package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vw1 implements uq2 {
    public final jx1 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final boolean e;
    public final xp2 f;

    public vw1(jx1 jx1Var, ArrayList arrayList, int i, int i2, boolean z, xp2 xp2Var) {
        this.a = jx1Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = xp2Var;
        if (arrayList.size() > 1) {
            return;
        }
        s21.c("MultiSelectionLayout requires an infoList size greater than 1, was " + arrayList.size() + '.');
    }

    public static void n(lx1 lx1Var, xp2 xp2Var, qp2 qp2Var, int i, int i2) {
        xp2 xp2Var2;
        if (xp2Var.c) {
            xp2Var2 = new xp2(qp2Var.a(i2), qp2Var.a(i), i2 > i);
        } else {
            xp2Var2 = new xp2(qp2Var.a(i), qp2Var.a(i2), i > i2);
        }
        if (i > i2) {
            s21.c("minOffset should be less than or equal to maxOffset: " + xp2Var2);
        }
        long j = qp2Var.a;
        int iC = lx1Var.c(j);
        Object[] objArr = lx1Var.c;
        Object obj = objArr[iC];
        lx1Var.b[iC] = j;
        objArr[iC] = xp2Var2;
    }

    @Override // defpackage.uq2
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.uq2
    public final qp2 b() {
        return this.e ? e() : j();
    }

    @Override // defpackage.uq2
    public final xp2 c() {
        return this.f;
    }

    @Override // defpackage.uq2
    public final qp2 d() {
        return k() == e80.e ? j() : e();
    }

    @Override // defpackage.uq2
    public final qp2 e() {
        return (qp2) this.b.get(p(this.c, true));
    }

    @Override // defpackage.uq2
    public final int f() {
        return this.c;
    }

    @Override // defpackage.uq2
    public final boolean g(uq2 uq2Var) {
        if (this.f != null && uq2Var != null && (uq2Var instanceof vw1)) {
            vw1 vw1Var = (vw1) uq2Var;
            ArrayList arrayList = vw1Var.b;
            if (this.e == vw1Var.e && this.c == vw1Var.c && this.d == vw1Var.d) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() == arrayList.size()) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        qp2 qp2Var = (qp2) arrayList2.get(i);
                        qp2 qp2Var2 = (qp2) arrayList.get(i);
                        if (qp2Var.a != qp2Var2.a || qp2Var.c != qp2Var2.c || qp2Var.d != qp2Var2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.uq2
    public final lx1 h(xp2 xp2Var) {
        wp2 wp2Var = xp2Var.a;
        boolean z = xp2Var.c;
        long j = wp2Var.c;
        int i = wp2Var.b;
        wp2 wp2Var2 = xp2Var.b;
        long j2 = wp2Var2.c;
        int i2 = wp2Var2.b;
        if (j != j2) {
            lx1 lx1Var = nj1.a;
            lx1 lx1Var2 = new lx1();
            n(lx1Var2, xp2Var, d(), (z ? wp2Var2 : wp2Var).b, d().f.a.a.f.length());
            l(new jl1(this, lx1Var2, xp2Var, 5));
            if (!z) {
                wp2Var = wp2Var2;
            }
            n(lx1Var2, xp2Var, k() == e80.e ? e() : j(), 0, wp2Var.b);
            return lx1Var2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            s21.c("unexpectedly miss-crossed selection: " + xp2Var);
        }
        long j3 = wp2Var.c;
        lx1 lx1Var3 = nj1.a;
        lx1 lx1Var4 = new lx1();
        lx1Var4.h(j3, xp2Var);
        return lx1Var4;
    }

    @Override // defpackage.uq2
    public final int i() {
        return this.d;
    }

    @Override // defpackage.uq2
    public final qp2 j() {
        return (qp2) this.b.get(p(this.d, false));
    }

    @Override // defpackage.uq2
    public final e80 k() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return e80.f;
        }
        if (i > i2) {
            return e80.e;
        }
        return ((qp2) this.b.get(i / 2)).b();
    }

    @Override // defpackage.uq2
    public final void l(lu0 lu0Var) {
        int iO = o(d().a);
        int iO2 = o((k() == e80.e ? e() : j()).a);
        int i = iO + 1;
        if (i >= iO2) {
            return;
        }
        while (i < iO2) {
            lu0Var.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.uq2
    public final int m() {
        return this.b.size();
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(p91.o("Invalid selectableId: ", j), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int iOrdinal = k().ordinal();
        boolean z2 = z;
        if (iOrdinal == 0) {
            z2 = !z ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                b81.d();
                return 0;
            }
        }
        return (i - (!z2)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(k());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            qp2 qp2Var = (qp2) arrayList.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(qp2Var);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
