package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g1 extends e1 {
    public static g1 e;
    public static final hg2 f = hg2.f;
    public static final hg2 g = hg2.e;
    public x83 c;
    public js2 d;

    @Override // defpackage.e1
    public final int[] e(int i) {
        int iE;
        if (i().length() > 0 && i < i().length()) {
            try {
                js2 js2Var = this.d;
                if (js2Var == null) {
                    o51.F("node");
                    throw null;
                }
                pe2 pe2VarG = js2Var.g();
                int iRound = Math.round(pe2VarG.d - pe2VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                x83 x83Var = this.c;
                if (x83Var == null) {
                    o51.F("layoutResult");
                    throw null;
                }
                int iD = x83Var.b.d(i);
                x83 x83Var2 = this.c;
                if (x83Var2 == null) {
                    o51.F("layoutResult");
                    throw null;
                }
                float f2 = x83Var2.b.f(iD) + iRound;
                x83 x83Var3 = this.c;
                if (x83Var3 == null) {
                    o51.F("layoutResult");
                    throw null;
                }
                sw1 sw1Var = x83Var3.b;
                float f3 = sw1Var.f(sw1Var.f - 1);
                x83 x83Var4 = this.c;
                if (f2 < f3) {
                    if (x83Var4 == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    iE = x83Var4.b.e(f2);
                } else {
                    if (x83Var4 == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    iE = x83Var4.b.f;
                }
                return h(i, m(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.e1
    public final int[] k(int i) {
        int iE;
        if (i().length() > 0 && i > 0) {
            try {
                js2 js2Var = this.d;
                if (js2Var == null) {
                    o51.F("node");
                    throw null;
                }
                pe2 pe2VarG = js2Var.g();
                int iRound = Math.round(pe2VarG.d - pe2VarG.b);
                int length = i().length();
                if (length <= i) {
                    i = length;
                }
                x83 x83Var = this.c;
                if (x83Var == null) {
                    o51.F("layoutResult");
                    throw null;
                }
                int iD = x83Var.b.d(i);
                x83 x83Var2 = this.c;
                if (x83Var2 == null) {
                    o51.F("layoutResult");
                    throw null;
                }
                float f2 = x83Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    x83 x83Var3 = this.c;
                    if (x83Var3 == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    iE = x83Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == i().length() && iE < iD) {
                    iE++;
                }
                return h(m(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int m(int i, hg2 hg2Var) {
        x83 x83Var = this.c;
        if (x83Var == null) {
            o51.F("layoutResult");
            throw null;
        }
        int iG = x83Var.g(i);
        x83 x83Var2 = this.c;
        if (x83Var2 == null) {
            o51.F("layoutResult");
            throw null;
        }
        hg2 hg2VarH = x83Var2.h(iG);
        x83 x83Var3 = this.c;
        if (hg2Var != hg2VarH) {
            if (x83Var3 != null) {
                return x83Var3.g(i);
            }
            o51.F("layoutResult");
            throw null;
        }
        if (x83Var3 != null) {
            return x83Var3.b.c(i, false) - 1;
        }
        o51.F("layoutResult");
        throw null;
    }
}
