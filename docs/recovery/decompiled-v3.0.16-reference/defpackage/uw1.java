package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uw1 {
    public dj a;
    public lq0 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public yt1 h;
    public xb0 j;
    public q93 k;
    public xp l;
    public qa1 m;
    public x83 n;
    public long q;
    public long i = t21.a;
    public int o = -1;
    public int p = -1;

    public uw1(dj djVar, q93 q93Var, lq0 lq0Var, int i, boolean z, int i2, int i3, List list) {
        this.a = djVar;
        this.b = lq0Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = q93Var;
    }

    public final int a(int i, qa1 qa1Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = m50.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            yt1 yt1Var = this.h;
            q93 q93Var = this.k;
            xb0 xb0Var = this.j;
            xb0Var.getClass();
            yt1 yt1VarT = vd0.t(yt1Var, qa1Var, q93Var, xb0Var, this.b);
            this.h = yt1VarT;
            jA = yt1VarT.a(this.f, jA);
        }
        int iP = gh0.p(b(jA, qa1Var).e);
        int i4 = l50.i(jA);
        if (iP < i4) {
            iP = i4;
        }
        this.o = i;
        this.p = iP;
        return iP;
    }

    public final sw1 b(long j, qa1 qa1Var) {
        xp xpVarE = e(qa1Var);
        long jV = ee0.v(j, this.d, this.c, xpVarE.c());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new sw1(xpVarE, jV, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, qa1 qa1Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            yt1 yt1Var = this.h;
            q93 q93Var = this.k;
            xb0 xb0Var = this.j;
            xb0Var.getClass();
            yt1 yt1VarT = vd0.t(yt1Var, qa1Var, q93Var, xb0Var, this.b);
            this.h = yt1VarT;
            j = yt1VarT.a(this.f, j);
        }
        x83 x83Var = this.n;
        if (x83Var != null) {
            sw1 sw1Var = x83Var.b;
            w83 w83Var = x83Var.a;
            if (!sw1Var.a.b()) {
                qa1 qa1Var2 = w83Var.h;
                long j2 = w83Var.j;
                if (qa1Var == qa1Var2 && (l50.b(j, j2) || (l50.h(j) == l50.h(j2) && l50.j(j) == l50.j(j2) && l50.g(j) >= sw1Var.e && !sw1Var.c))) {
                    x83 x83Var2 = this.n;
                    x83Var2.getClass();
                    if (l50.b(j, x83Var2.a.j)) {
                        return false;
                    }
                    x83 x83Var3 = this.n;
                    x83Var3.getClass();
                    this.n = f(qa1Var, j, x83Var3.b);
                    return true;
                }
            }
        }
        this.n = f(qa1Var, j, b(j, qa1Var));
        return true;
    }

    public final void d(xb0 xb0Var) {
        long jA;
        xb0 xb0Var2 = this.j;
        if (xb0Var != null) {
            int i = t21.b;
            jA = t21.a(xb0Var.g(), xb0Var.D());
        } else {
            jA = t21.a;
        }
        if (xb0Var2 == null) {
            this.j = xb0Var;
            this.i = jA;
        } else if (xb0Var == null || this.i != jA) {
            this.j = xb0Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final xp e(qa1 qa1Var) {
        xp xpVar = this.l;
        if (xpVar == null || qa1Var != this.m || xpVar.b()) {
            this.m = qa1Var;
            dj djVar = this.a;
            q93 q93VarC = r93.c(this.k, qa1Var);
            xb0 xb0Var = this.j;
            xb0Var.getClass();
            lq0 lq0Var = this.b;
            List list = this.g;
            if (list == null) {
                list = uj0.e;
            }
            xpVar = new xp(djVar, q93VarC, list, xb0Var, lq0Var);
        }
        this.l = xpVar;
        return xpVar;
    }

    public final x83 f(qa1 qa1Var, long j, sw1 sw1Var) {
        float fMin = Math.min(sw1Var.a.c(), sw1Var.d);
        dj djVar = this.a;
        q93 q93Var = this.k;
        List list = this.g;
        if (list == null) {
            list = uj0.e;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        xb0 xb0Var = this.j;
        xb0Var.getClass();
        return new x83(new w83(djVar, q93Var, list, i, z, i2, xb0Var, qa1Var, this.b, j), sw1Var, m50.d(j, (((long) gh0.p(fMin)) << 32) | (((long) gh0.p(sw1Var.e)) & 4294967295L)));
    }

    public final void g(dj djVar, q93 q93Var, lq0 lq0Var, int i, boolean z, int i2, int i3, List list) {
        this.a = djVar;
        boolean zC = q93Var.c(this.k);
        this.k = q93Var;
        if (!zC) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = lq0Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final String toString() {
        w83 w83Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object l50Var = "null";
        sb.append(this.n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) t21.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        x83 x83Var = this.n;
        if (x83Var != null && (w83Var = x83Var.a) != null) {
            l50Var = new l50(w83Var.j);
        }
        sb.append(l50Var);
        sb.append(')');
        return sb.toString();
    }
}
