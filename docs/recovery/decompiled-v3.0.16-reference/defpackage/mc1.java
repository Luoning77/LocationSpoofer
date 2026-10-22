package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mc1 {
    public final ql2 a;
    public final mo0 b;
    public final zx1 c;

    public mc1(ql2 ql2Var, mo0 mo0Var) {
        this.a = ql2Var;
        this.b = mo0Var;
        long[] jArr = hn2.a;
        this.c = new zx1();
    }

    public final pu0 a(int i, Object obj, Object obj2) {
        zx1 zx1Var = this.c;
        lc1 lc1Var = (lc1) zx1Var.g(obj);
        int i2 = 15;
        if (lc1Var != null && lc1Var.c == i && o51.f(lc1Var.b, obj2)) {
            p10 p10Var = lc1Var.d;
            if (p10Var != null) {
                return p10Var;
            }
            p10 p10Var2 = new p10(new j2(i2, lc1Var.e, lc1Var), true, 818252804);
            lc1Var.d = p10Var2;
            return p10Var2;
        }
        lc1 lc1Var2 = new lc1(this, i, obj, obj2);
        zx1Var.m(obj, lc1Var2);
        p10 p10Var3 = lc1Var2.d;
        if (p10Var3 != null) {
            return p10Var3;
        }
        p10 p10Var4 = new p10(new j2(i2, this, lc1Var2), true, 818252804);
        lc1Var2.d = p10Var4;
        return p10Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        lc1 lc1Var = (lc1) this.c.g(obj);
        if (lc1Var != null) {
            return lc1Var.b;
        }
        ld1 ld1Var = (ld1) this.b.invoke();
        int iE = ld1Var.d.e(obj);
        if (iE != -1) {
            return ld1Var.b(iE);
        }
        return null;
    }
}
