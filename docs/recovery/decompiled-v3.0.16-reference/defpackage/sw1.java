package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sw1 {
    public final xp a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public sw1(xp xpVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = xpVar;
        this.b = i;
        if (l50.j(j) != 0 || l50.i(j) != 0) {
            q21.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) xpVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            m52 m52Var = (m52) arrayList2.get(i6);
            pe peVar = m52Var.a;
            int iH = l50.h(j);
            if (l50.c(j)) {
                i4 = i6;
                iG = l50.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = l50.g(j);
            }
            i3 = 0;
            le leVar = new le(peVar, this.b - i7, i2, m50.b(0, iH, 0, iG, 5));
            float fB = leVar.b() + f;
            t83 t83Var = leVar.d;
            int i8 = i7 + t83Var.g;
            arrayList.add(new l52(leVar, m52Var.b, m52Var.c, i7, i8, f, fB));
            if (!t83Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != am1.x((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fB;
            }
            z = true;
            i7 = i8;
            f = fB;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = l50.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            l52 l52Var = (l52) arrayList.get(i9);
            List list = l52Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                pe2 pe2Var = (pe2) list.get(i10);
                arrayList4.add(pe2Var != null ? l52Var.a(pe2Var) : null);
            }
            fz.b0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = zy.x0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public final void a(long j, float[] fArr) {
        j(f93.f(j));
        k(f93.e(j));
        ue2 ue2Var = new ue2();
        ue2Var.e = 0;
        hd0.w(this.h, j, new fs(j, fArr, ue2Var, new te2()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, i));
        le leVar = l52Var.a;
        return leVar.d.e(i - l52Var.d) + l52Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, i));
        le leVar = l52Var.a;
        int i2 = i - l52Var.d;
        t83 t83Var = leVar.d;
        if (z) {
            Layout layout = t83Var.f;
            ThreadLocal threadLocal = z83.a;
            if (layout.getEllipsisCount(i2) <= 0 || t83Var.b != TextUtils.TruncateAt.END) {
                xp xpVarC = t83Var.c();
                Layout layout2 = (Layout) xpVarC.a;
                iF = xpVarC.m(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = t83Var.f(i2);
        }
        return iF + l52Var.b;
    }

    public final int d(int i) {
        int iT;
        int length = ((dj) this.a.a).f.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iT = arrayList.size() - 1;
        } else {
            iT = i < 0 ? 0 : hd0.t(arrayList, i);
        }
        l52 l52Var = (l52) arrayList.get(iT);
        return l52Var.a.d.g(l52Var.d(i)) + l52Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        l52 l52Var = (l52) arrayList.get(hd0.v(arrayList, f));
        int i = l52Var.c - l52Var.b;
        int i2 = l52Var.d;
        if (i == 0) {
            return i2;
        }
        le leVar = l52Var.a;
        float f2 = f - l52Var.f;
        t83 t83Var = leVar.d;
        int i3 = (int) f2;
        int i4 = t83Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = t83Var.f.getLineForVertical(i3 - t83Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, i));
        le leVar = l52Var.a;
        return leVar.d.h(i - l52Var.d) + l52Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        l52 l52Var = (l52) arrayList.get(hd0.v(arrayList, fIntBitsToFloat));
        int i2 = l52Var.c;
        int i3 = l52Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        le leVar = l52Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - l52Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        t83 t83Var = leVar.d;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = t83Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - t83Var.h);
        if (lineForVertical >= t83Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (t83Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(pe2 pe2Var, int i, b81 b81Var) {
        long jB;
        long j;
        float f = pe2Var.b;
        ArrayList arrayList = this.h;
        int iV = hd0.v(arrayList, f);
        float f2 = ((l52) arrayList.get(iV)).g;
        float f3 = pe2Var.d;
        if (f2 >= f3 || iV == arrayList.size() - 1) {
            l52 l52Var = (l52) arrayList.get(iV);
            return l52Var.b(l52Var.a.c(l52Var.c(pe2Var), i, b81Var), true);
        }
        int iV2 = hd0.v(arrayList, f3);
        long jB2 = f93.b;
        while (true) {
            jB = f93.b;
            if (!f93.b(jB2, jB) || iV > iV2) {
                break;
            }
            l52 l52Var2 = (l52) arrayList.get(iV);
            jB2 = l52Var2.b(l52Var2.a.c(l52Var2.c(pe2Var), i, b81Var), true);
            iV++;
        }
        if (f93.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = f93.b;
            if (!f93.b(jB, j) || iV > iV2) {
                break;
            }
            l52 l52Var3 = (l52) arrayList.get(iV2);
            jB = l52Var3.b(l52Var3.a.c(l52Var3.c(pe2Var), i, b81Var), true);
            iV2--;
        }
        return f93.b(jB, j) ? jB2 : g93.a((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(vv vvVar, long j, xt2 xt2Var, p63 p63Var, kg0 kg0Var) {
        vvVar.l();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l52 l52Var = (l52) arrayList.get(i);
            l52Var.a.f(vvVar, j, xt2Var, p63Var, kg0Var);
            vvVar.g(0.0f, l52Var.a.b());
        }
        vvVar.i();
    }

    public final void j(int i) {
        dj djVar = (dj) this.a.a;
        if (i < 0 || i >= djVar.f.length()) {
            StringBuilder sbR = p91.r(i, "offset(", ") is out of bounds [0, ");
            sbR.append(djVar.f.length());
            sbR.append(')');
            q21.a(sbR.toString());
        }
    }

    public final void k(int i) {
        dj djVar = (dj) this.a.a;
        if (i < 0 || i > djVar.f.length()) {
            StringBuilder sbR = p91.r(i, "offset(", ") is out of bounds [0, ");
            sbR.append(djVar.f.length());
            sbR.append(']');
            q21.a(sbR.toString());
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        q21.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
