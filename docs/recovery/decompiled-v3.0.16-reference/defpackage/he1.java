package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class he1 {
    public final xd a;
    public final d31 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public f83 j;
    public x83 k;
    public e12 l;
    public pe2 m;
    public pe2 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = yq1.a();
    public final Matrix q = new Matrix();

    public he1(xd xdVar, d31 d31Var) {
        this.a = xdVar;
        this.b = d31Var;
    }

    public final void a() {
        d31 d31Var = this.b;
        InputMethodManager inputMethodManagerT = d31Var.t();
        View view = (View) d31Var.f;
        if (!inputMethodManagerT.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        yq1.d(fArr);
        pa1 pa1Var = (pa1) this.a.e.v.getValue();
        if (pa1Var != null) {
            if (!pa1Var.U()) {
                pa1Var = null;
            }
            if (pa1Var != null) {
                pa1Var.W(fArr);
            }
        }
        pe2 pe2Var = this.n;
        pe2Var.getClass();
        float f = -pe2Var.a;
        pe2 pe2Var2 = this.n;
        pe2Var2.getClass();
        yq1.f(fArr, f, -pe2Var2.b);
        Matrix matrix = this.q;
        am1.S(matrix, fArr);
        f83 f83Var = this.j;
        f83Var.getClass();
        long j = f83Var.b;
        e12 e12Var = this.l;
        e12Var.getClass();
        x83 x83Var = this.k;
        x83Var.getClass();
        sw1 sw1Var = x83Var.b;
        pe2 pe2Var3 = this.m;
        pe2Var3.getClass();
        float f2 = pe2Var3.d;
        float f3 = pe2Var3.b;
        pe2 pe2Var4 = this.n;
        pe2Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        f93 f93Var = f83Var.c;
        int iF = f93.f(j);
        builder.setSelectionRange(iF, f93.e(j));
        hg2 hg2Var = hg2.f;
        if (z && iF >= 0) {
            int iR = e12Var.r(iF);
            pe2 pe2VarC = x83Var.c(iR);
            float fU = mh0.u(pe2VarC.a, 0.0f, (int) (x83Var.c >> 32));
            boolean zM = ce0.m(pe2Var3, fU, pe2VarC.b);
            boolean zM2 = ce0.m(pe2Var3, fU, pe2VarC.d);
            boolean z5 = x83Var.a(iR) == hg2Var;
            int i = (zM || zM2) ? 1 : 0;
            if (!zM || !zM2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = pe2VarC.b;
            float f5 = pe2VarC.d;
            builder.setInsertionMarkerLocation(fU, f4, f5, f5, i);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z2) {
            int iF2 = f93Var != null ? f93.f(f93Var.a) : -1;
            int iE = f93Var != null ? f93.e(f93Var.a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder2.setComposingText(iF2, f83Var.a.f.subSequence(iF2, iE));
                int iR2 = e12Var.r(iF2);
                int iR3 = e12Var.r(iE);
                float[] fArr2 = new float[(iR3 - iR2) * 4];
                sw1Var.a(g93.a(iR2, iR3), fArr2);
                while (iF2 < iE) {
                    int iR4 = e12Var.r(iF2);
                    int i2 = (iR4 - iR2) * 4;
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iR2;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (pe2Var3.a < f8 ? 1 : 0) & (f6 < pe2Var3.c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!ce0.m(pe2Var3, f6, f7) || !ce0.m(pe2Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (x83Var.a(iR4) == hg2Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder2 = builder3;
                    iF2 = i6 + 1;
                    iR2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            q1.j(builder2, pe2Var4);
        }
        if (i7 >= 34 && z4 && !pe2Var3.g()) {
            int i8 = sw1Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iV = mh0.v(sw1Var.e(f3), 0, i8);
            int iV2 = mh0.v(sw1Var.e(f2), 0, i8);
            if (iV <= iV2) {
                while (true) {
                    builder2.addVisibleLineBounds(x83Var.e(iV), sw1Var.f(iV), x83Var.f(iV), sw1Var.b(iV));
                    if (iV == iV2) {
                        break;
                    } else {
                        iV++;
                    }
                }
            }
        }
        d31Var.t().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
