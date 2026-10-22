package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f1 extends e1 {
    public static f1 e;
    public static f1 f;
    public static f1 g;
    public static final hg2 h = hg2.f;
    public static final hg2 i = hg2.e;
    public final /* synthetic */ int c;
    public Object d;

    @Override // defpackage.e1
    public final int[] e(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        o51.F("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            o51.F("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return h(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        o51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!p(i2) && (!p(i2) || (i2 != 0 && p(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        o51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    o51.F("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !o(iFollowing2)) {
                    return null;
                }
                return h(i2, iFollowing2);
            default:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                x83 x83Var = (x83) this.d;
                hg2 hg2Var = h;
                if (i2 < 0) {
                    if (x83Var == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    iD = x83Var.b.d(0);
                } else {
                    if (x83Var == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    int iD2 = x83Var.b.d(i2);
                    iD = m(iD2, hg2Var) == i2 ? iD2 : iD2 + 1;
                }
                x83 x83Var2 = (x83) this.d;
                if (x83Var2 == null) {
                    o51.F("layoutResult");
                    throw null;
                }
                if (iD >= x83Var2.b.f) {
                    return null;
                }
                return h(m(iD, hg2Var), m(iD, i) + 1);
        }
    }

    @Override // defpackage.e1
    public final int[] k(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        o51.F("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            o51.F("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return h(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        o51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = i().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !p(i2 - 1) && !o(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        o51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    o51.F("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !p(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !p(iPreceding2 - 1)) {
                    return h(iPreceding2, i2);
                }
                return null;
            default:
                if (i().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = i().length();
                x83 x83Var = (x83) this.d;
                hg2 hg2Var = i;
                if (i2 > length3) {
                    if (x83Var == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    iD = x83Var.b.d(i().length());
                } else {
                    if (x83Var == null) {
                        o51.F("layoutResult");
                        throw null;
                    }
                    int iD2 = x83Var.b.d(i2);
                    iD = m(iD2, hg2Var) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return h(m(iD, h), m(iD, hg2Var) + 1);
        }
    }

    public int m(int i2, hg2 hg2Var) {
        x83 x83Var = (x83) this.d;
        if (x83Var == null) {
            o51.F("layoutResult");
            throw null;
        }
        int iG = x83Var.g(i2);
        x83 x83Var2 = (x83) this.d;
        if (x83Var2 == null) {
            o51.F("layoutResult");
            throw null;
        }
        hg2 hg2VarH = x83Var2.h(iG);
        x83 x83Var3 = (x83) this.d;
        if (hg2Var != hg2VarH) {
            if (x83Var3 != null) {
                return x83Var3.g(i2);
            }
            o51.F("layoutResult");
            throw null;
        }
        if (x83Var3 != null) {
            return x83Var3.b.c(i2, false) - 1;
        }
        o51.F("layoutResult");
        throw null;
    }

    public void n(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    o51.F("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    o51.F("impl");
                    throw null;
                }
        }
    }

    public boolean o(int i2) {
        if (i2 <= 0 || !p(i2 - 1)) {
            return false;
        }
        return i2 == i().length() || !p(i2);
    }

    public boolean p(int i2) {
        if (i2 < 0 || i2 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i2));
    }
}
