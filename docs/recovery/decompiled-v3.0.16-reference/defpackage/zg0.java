package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zg0 implements cb2 {
    public final long e;
    public final xb0 f;
    public final int g;
    public final i3 h;
    public final w9 i;
    public final w9 j;
    public final ik3 k;
    public final ik3 l;
    public final x9 m;
    public final x9 n;
    public final x9 o;
    public final jk3 p;
    public final jk3 q;

    public zg0(long j, xb0 xb0Var, i3 i3Var) {
        int iN0 = xb0Var.n0(48.0f);
        this.e = j;
        this.f = xb0Var;
        this.g = iN0;
        this.h = i3Var;
        int iN1 = xb0Var.n0(Float.intBitsToFloat((int) (j >> 32)));
        nr nrVar = j9.r;
        this.i = new w9(nrVar, nrVar, iN1);
        nr nrVar2 = j9.t;
        this.j = new w9(nrVar2, nrVar2, iN1);
        this.k = new ik3(n51.c);
        this.l = new ik3(n51.d);
        int iN2 = xb0Var.n0(Float.intBitsToFloat((int) (j & 4294967295L)));
        or orVar = j9.o;
        or orVar2 = j9.q;
        this.m = new x9(orVar, orVar2, iN2);
        this.n = new x9(orVar2, orVar, iN2);
        this.o = new x9(j9.p, orVar, iN2);
        this.p = new jk3(orVar, iN0);
        this.q = new jk3(orVar2, iN0);
    }

    @Override // defpackage.cb2
    public final long c(l41 l41Var, long j, qa1 qa1Var, long j2) {
        l41 l41Var2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listG = am1.G(this.i, this.j, ((int) (l41Var.a() >> 32)) < i3 / 2 ? this.k : this.l);
        int size = listG.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                l41Var2 = l41Var;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            mt1 mt1Var = (mt1) listG.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            l41Var2 = l41Var;
            iA = mt1Var.a(l41Var2, j3, i5, qa1Var);
            if (i7 == listG.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listG2 = am1.G(this.m, this.n, this.o, ((int) (l41Var2.a() & 4294967295L)) < i8 / 2 ? this.p : this.q);
        int size2 = listG2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((nt1) listG2.get(i9)).a(l41Var2, j3, i10);
            if (i9 == listG2.size() - 1 || (iA2 >= (i2 = this.g) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.h.invoke(l41Var2, mh0.b(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.h.invoke(l41Var2, mh0.b(j5, j2));
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zg0) {
            zg0 zg0Var = (zg0) obj;
            return this.e == zg0Var.e && o51.f(this.f, zg0Var.f) && this.g == zg0Var.g && this.h == zg0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + p91.b(this.g, (this.f.hashCode() + (Long.hashCode(this.e) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) wd0.a(this.e)) + ", density=" + this.f + ", verticalMargin=" + this.g + ", onPositionCalculated=" + this.h + ')';
    }
}
