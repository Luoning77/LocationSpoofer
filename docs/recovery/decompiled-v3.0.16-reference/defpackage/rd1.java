package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rd1 {
    public final int a;
    public final List b;
    public final boolean c;
    public final k9 d;
    public final or e;
    public final qa1 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final kc1 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q = Integer.MIN_VALUE;
    public final int[] r;

    public rd1(int i, List list, boolean z, k9 k9Var, or orVar, qa1 qa1Var, int i2, int i3, int i4, long j, Object obj, Object obj2, kc1 kc1Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = k9Var;
        this.e = orVar;
        this.f = qa1Var;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = kc1Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            h82 h82Var = (h82) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? h82Var.f : h82Var.e;
            iMax = Math.max(iMax, !z2 ? h82Var.f : h82Var.e);
        }
        this.m = i5;
        int i7 = i5 + this.g;
        this.n = i7 >= 0 ? i7 : 0;
        this.o = iMax;
        this.r = new int[this.b.size() * 2];
    }

    public final long a(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.r;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    public final void b(g82 g82Var) {
        g82 g82Var2;
        if (this.q == Integer.MIN_VALUE) {
            s21.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            h82 h82Var = (h82) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = h82Var.f;
            } else {
                int i3 = h82Var.e;
            }
            long jA = a(i);
            p91.x(this.k.a.g(this.i));
            long jC = h41.c(jA, this.h);
            if (z) {
                g82Var2 = g82Var;
                g82.F(g82Var2, h82Var, jC, null, 6);
            } else {
                g82Var2 = g82Var;
                int i4 = i82.b;
                ik0 ik0Var = ik0.x;
                if (g82Var2.s() == qa1.e || g82Var2.w() == 0) {
                    g82Var2.x(h82Var);
                    h82Var.I0(h41.c(jC, h82Var.i), 0.0f, ik0Var);
                } else {
                    int iW = (g82Var2.w() - h82Var.e) - ((int) (jC >> 32));
                    g82Var2.x(h82Var);
                    h82Var.I0(h41.c((((long) iW) << 32) | (4294967295L & ((long) ((int) (jC & 4294967295L)))), h82Var.i), 0.0f, ik0Var);
                }
            }
            i++;
            g82Var = g82Var2;
        }
    }

    public final void c(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.c;
        this.q = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            h82 h82Var = (h82) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.r;
            if (z) {
                k9 k9Var = this.d;
                if (k9Var == null) {
                    throw p91.h("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = k9Var.a(h82Var.e, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = h82Var.f;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                or orVar = this.e;
                if (orVar == null) {
                    throw p91.h("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = orVar.a(h82Var.f, i3);
                i4 = h82Var.e;
            }
            i += i4;
        }
    }
}
