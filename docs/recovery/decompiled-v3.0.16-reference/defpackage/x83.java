package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x83 {
    public final w83 a;
    public final sw1 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public x83(w83 w83Var, sw1 sw1Var, long j) {
        this.a = w83Var;
        this.b = sw1Var;
        this.c = j;
        ArrayList arrayList = sw1Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((l52) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            l52 l52Var = (l52) zy.t0(arrayList);
            t83 t83Var = l52Var.a.d;
            fD = t83Var.d(t83Var.g - 1) + l52Var.f;
        }
        this.e = fD;
        this.f = sw1Var.g;
    }

    public final hg2 a(int i) {
        sw1 sw1Var = this.b;
        sw1Var.k(i);
        int length = ((dj) sw1Var.a.a).f.length();
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(i == length ? arrayList.size() - 1 : hd0.t(arrayList, i));
        return l52Var.a.d.f.isRtlCharAt(l52Var.d(i)) ? hg2.f : hg2.e;
    }

    public final pe2 b(int i) {
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        sw1 sw1Var = this.b;
        sw1Var.j(i);
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(hd0.t(arrayList, i));
        le leVar = l52Var.a;
        int iD = l52Var.d(i);
        CharSequence charSequence = leVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbR = p91.r(iD, "offset(", ") is out of bounds [0,");
            sbR.append(charSequence.length());
            sbR.append(')');
            q21.a(sbR.toString());
        }
        t83 t83Var = leVar.d;
        int iG = t83Var.g(iD);
        float fH = t83Var.h(iG);
        float fE = t83Var.e(iG);
        Layout layout = t83Var.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = t83Var.j(iD, false);
                fI2 = t83Var.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = t83Var.i(iD, false);
                fI2 = t83Var.i(iD + 1, true);
            } else {
                fJ = t83Var.j(iD, false);
                fJ2 = t83Var.j(iD + 1, true);
            }
            float f = fI;
            fJ = fI2;
            fJ2 = f;
        } else {
            fJ = t83Var.i(iD, false);
            fJ2 = t83Var.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, fE);
        return l52Var.a(new pe2(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final pe2 c(int i) {
        sw1 sw1Var = this.b;
        sw1Var.k(i);
        int length = ((dj) sw1Var.a.a).f.length();
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(i == length ? arrayList.size() - 1 : hd0.t(arrayList, i));
        le leVar = l52Var.a;
        int iD = l52Var.d(i);
        CharSequence charSequence = leVar.e;
        t83 t83Var = leVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbR = p91.r(iD, "offset(", ") is out of bounds [0,");
            sbR.append(charSequence.length());
            sbR.append(']');
            q21.a(sbR.toString());
        }
        float fI = t83Var.i(iD, false);
        int iG = t83Var.g(iD);
        return l52Var.a(new pe2(fI, t83Var.h(iG), fI, t83Var.e(iG)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        sw1 sw1Var = this.b;
        return f < sw1Var.d || sw1Var.c || ((float) ((int) (j & 4294967295L))) < sw1Var.e;
    }

    public final float e(int i) {
        sw1 sw1Var = this.b;
        sw1Var.l(i);
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, i));
        le leVar = l52Var.a;
        int i2 = i - l52Var.d;
        t83 t83Var = leVar.d;
        return t83Var.f.getLineLeft(i2) + (i2 == t83Var.g + (-1) ? t83Var.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x83) {
            x83 x83Var = (x83) obj;
            if (o51.f(this.a, x83Var.a) && this.b == x83Var.b && p41.b(this.c, x83Var.c) && this.d == x83Var.d && this.e == x83Var.e && this.f.equals(x83Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        sw1 sw1Var = this.b;
        sw1Var.l(i);
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, i));
        le leVar = l52Var.a;
        int i2 = i - l52Var.d;
        t83 t83Var = leVar.d;
        return t83Var.f.getLineRight(i2) + (i2 == t83Var.g + (-1) ? t83Var.k : 0.0f);
    }

    public final int g(int i) {
        sw1 sw1Var = this.b;
        sw1Var.l(i);
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, i));
        le leVar = l52Var.a;
        return leVar.d.f.getLineStart(i - l52Var.d) + l52Var.b;
    }

    public final hg2 h(int i) {
        sw1 sw1Var = this.b;
        sw1Var.k(i);
        int length = ((dj) sw1Var.a.a).f.length();
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(i == length ? arrayList.size() - 1 : hd0.t(arrayList, i));
        le leVar = l52Var.a;
        int iD = l52Var.d(i);
        t83 t83Var = leVar.d;
        return t83Var.f.getParagraphDirection(t83Var.g(iD)) == 1 ? hg2.e : hg2.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + az2.c(this.e, az2.c(this.d, p91.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final re i(int i, int i2) {
        sw1 sw1Var = this.b;
        dj djVar = (dj) sw1Var.a.a;
        if (i < 0 || i > i2 || i2 > djVar.f.length()) {
            StringBuilder sbS = p91.s("Start(", ") or End(", i, i2, ") is out of range [0..");
            sbS.append(djVar.f.length());
            sbS.append("), or start > end!");
            q21.a(sbS.toString());
        }
        if (i == i2) {
            return ue.a();
        }
        re reVarA = ue.a();
        hd0.w(sw1Var.h, g93.a(i, i2), new p31(i, i2, 3, reVarA));
        return reVarA;
    }

    public final long j(int i) {
        int iL;
        int iJ;
        int iJ2;
        sw1 sw1Var = this.b;
        sw1Var.k(i);
        int length = ((dj) sw1Var.a.a).f.length();
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(i == length ? arrayList.size() - 1 : hd0.t(arrayList, i));
        le leVar = l52Var.a;
        int iD = l52Var.d(i);
        dm dmVarK = leVar.d.k();
        if (dmVarK.i(dmVarK.l(iD))) {
            dmVarK.b(iD);
            iL = iD;
            while (iL != -1 && (!dmVarK.i(iL) || dmVarK.e(iL))) {
                iL = dmVarK.l(iL);
            }
        } else {
            dmVarK.b(iD);
            if (dmVarK.h(iD)) {
                iL = (!dmVarK.f(iD) || dmVarK.d(iD)) ? dmVarK.l(iD) : iD;
            } else {
                iL = dmVarK.d(iD) ? dmVarK.l(iD) : -1;
            }
        }
        if (iL == -1) {
            iL = iD;
        }
        if (dmVarK.e(dmVarK.j(iD))) {
            dmVarK.b(iD);
            iJ = iD;
            while (iJ != -1 && (dmVarK.i(iJ) || !dmVarK.e(iJ))) {
                iJ = dmVarK.j(iJ);
            }
        } else {
            dmVarK.b(iD);
            if (dmVarK.d(iD)) {
                if (!dmVarK.f(iD) || dmVarK.h(iD)) {
                    iJ2 = dmVarK.j(iD);
                    iJ = iJ2;
                } else {
                    iJ = iD;
                }
            } else if (dmVarK.h(iD)) {
                iJ2 = dmVarK.j(iD);
                iJ = iJ2;
            } else {
                iJ = -1;
            }
        }
        if (iJ != -1) {
            iD = iJ;
        }
        return l52Var.b(g93.a(iL, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) p41.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
