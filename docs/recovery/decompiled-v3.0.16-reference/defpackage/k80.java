package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k80 {
    public final db a;
    public final gn b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public f83 j;
    public x83 k;
    public e12 l;
    public pe2 n;
    public pe2 o;
    public final Object c = new Object();
    public lu0 m = wa.E;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = yq1.a();
    public final Matrix r = new Matrix();

    public k80(db dbVar, gn gnVar) {
        this.a = dbVar;
        this.b = gnVar;
    }

    public final void a() {
        gn gnVar = this.b;
        zb1 zb1Var = (zb1) gnVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) zb1Var.getValue();
        View view = (View) gnVar.a;
        if (inputMethodManager.isActive(view)) {
            lu0 lu0Var = this.m;
            float[] fArr = this.q;
            lu0Var.invoke(new yq1(fArr));
            this.a.p(fArr);
            Matrix matrix = this.r;
            am1.S(matrix, fArr);
            f83 f83Var = this.j;
            f83Var.getClass();
            long j = f83Var.b;
            e12 e12Var = this.l;
            e12Var.getClass();
            x83 x83Var = this.k;
            x83Var.getClass();
            sw1 sw1Var = x83Var.b;
            pe2 pe2Var = this.n;
            pe2Var.getClass();
            float f = pe2Var.d;
            float f2 = pe2Var.b;
            pe2 pe2Var2 = this.o;
            pe2Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
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
                boolean zO = zm3.o(pe2Var, fU, pe2VarC.b);
                boolean zO2 = zm3.o(pe2Var, fU, pe2VarC.d);
                boolean z5 = x83Var.a(iR) == hg2Var;
                int i = (zO || zO2) ? 1 : 0;
                if (!zO || !zO2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = pe2VarC.b;
                float f4 = pe2VarC.d;
                builder.setInsertionMarkerLocation(fU, f3, f4, f4, i);
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
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (pe2Var.a < f7 ? 1 : 0) & (f5 < pe2Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!zm3.o(pe2Var, f5, f6) || !zm3.o(pe2Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (x83Var.a(iR4) == hg2Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                q1.i(builder2, pe2Var2);
            }
            if (i6 >= 34 && z4 && !pe2Var.g()) {
                int i7 = sw1Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iV = mh0.v(sw1Var.e(f2), 0, i7);
                int iV2 = mh0.v(sw1Var.e(f), 0, i7);
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
            ((InputMethodManager) zb1Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
