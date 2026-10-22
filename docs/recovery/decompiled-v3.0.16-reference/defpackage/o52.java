package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o52 {
    public String a;
    public q93 b;
    public lq0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public xb0 i;
    public le j;
    public boolean k;
    public yt1 m;
    public n52 n;
    public qa1 o;
    public long s;
    public long h = t21.a;
    public long l = 0;
    public long p = m50.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public o52(String str, q93 q93Var, lq0 lq0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = q93Var;
        this.c = lq0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long f(o52 o52Var, long j, qa1 qa1Var) {
        q93 q93Var = o52Var.b;
        yt1 yt1Var = o52Var.m;
        xb0 xb0Var = o52Var.i;
        xb0Var.getClass();
        yt1 yt1VarT = vd0.t(yt1Var, qa1Var, q93Var, xb0Var, o52Var.c);
        o52Var.m = yt1VarT;
        return yt1VarT.a(o52Var.g, j);
    }

    public final int a(int i, qa1 qa1Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = m50.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, qa1Var);
        }
        n52 n52VarE = e(qa1Var);
        long jV = ee0.v(jA, this.e, this.d, n52VarE.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iP = gh0.p(new le((pe) n52VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jV).b());
        int i6 = l50.i(jA);
        if (iP < i6) {
            iP = i6;
        }
        this.q = i;
        this.r = iP;
        return iP;
    }

    public final boolean b(long j, qa1 qa1Var) {
        n52 n52Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, qa1Var) : j;
        le leVar = this.j;
        boolean z2 = false;
        if (leVar != null && (n52Var = this.n) != null && !n52Var.b() && qa1Var == this.o && (l50.b(jF, this.p) || (l50.h(jF) == l50.h(this.p) && l50.j(jF) == l50.j(this.p) && l50.g(jF) >= leVar.b() && !leVar.d.d))) {
            if (!l50.b(jF, this.p)) {
                le leVar2 = this.j;
                leVar2.getClass();
                long jD = m50.d(jF, (((long) gh0.p(Math.min(leVar2.a.i.c(), leVar2.d()))) << 32) | (((long) gh0.p(leVar2.b())) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= leVar2.d() && ((int) (4294967295L & jD)) >= leVar2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        n52 n52VarE = e(qa1Var);
        long jV = ee0.v(jF, this.e, this.d, n52VarE.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        le leVar3 = new le((pe) n52VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jV);
        this.p = jF;
        long jD2 = m50.d(jF, (((long) gh0.p(leVar3.b())) & 4294967295L) | (((long) gh0.p(leVar3.d())) << 32));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < leVar3.d() || ((int) (jD2 & 4294967295L)) < leVar3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = leVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = m50.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(xb0 xb0Var) {
        long jA;
        xb0 xb0Var2 = this.i;
        if (xb0Var != null) {
            int i = t21.b;
            jA = t21.a(xb0Var.g(), xb0Var.D());
        } else {
            jA = t21.a;
        }
        if (xb0Var2 == null) {
            this.i = xb0Var;
            this.h = jA;
        } else if (xb0Var == null || this.h != jA) {
            this.i = xb0Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final n52 e(qa1 qa1Var) {
        n52 peVar = this.n;
        if (peVar == null || qa1Var != this.o || peVar.b()) {
            this.o = qa1Var;
            String str = this.a;
            q93 q93VarC = r93.c(this.b, qa1Var);
            xb0 xb0Var = this.i;
            xb0Var.getClass();
            lq0 lq0Var = this.c;
            uj0 uj0Var = uj0.e;
            peVar = new pe(str, q93VarC, uj0Var, uj0Var, lq0Var, xb0Var);
        }
        this.n = peVar;
        return peVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) t21.b(this.h));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
