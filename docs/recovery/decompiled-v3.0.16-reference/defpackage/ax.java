package defpackage;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ax {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentB;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentB = b(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = (int[]) this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentB instanceof mz1) {
                    ((mz1) viewParentB).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentB instanceof lz1) {
                        ((lz1) viewParentB).e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentB.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentB + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent b(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(z92 z92Var, db dbVar, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        wx0 wx0Var = (wx0) this.c;
        zx0 zx0Var = (zx0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            c51 c51VarS = ((us1) this.d).s(z92Var, dbVar);
            zj1 zj1Var = (zj1) c51VarS.f;
            int iJ = zj1Var.j();
            while (true) {
                if (i >= iJ) {
                    objArr = true;
                    break;
                }
                x92 x92Var = (x92) zj1Var.k(i);
                i = (x92Var.d || x92Var.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iJ2 = zj1Var.j();
            for (int i4 = 0; i4 < iJ2; i4++) {
                x92 x92Var2 = (x92) zj1Var.k(i4);
                if (objArr != false || mh0.p(x92Var2)) {
                    ((hb1) this.b).z(x92Var2.c, zx0Var, x92Var2.i, true);
                    if (!zx0Var.e.h()) {
                        wx0Var.a(x92Var2.a, zx0Var, mh0.p(x92Var2));
                        zx0Var.clear();
                    }
                }
            }
            boolean zB = wx0Var.b(c51VarS, z);
            if (c51VarS.e) {
                i2 = 0;
                break;
            }
            int iJ3 = zj1Var.j();
            int i5 = 0;
            while (true) {
                if (i5 >= iJ3) {
                    i2 = 0;
                    break;
                }
                x92 x92Var3 = (x92) zj1Var.k(i5);
                if (!c12.b(mh0.T(x92Var3, true), 0L) && x92Var3.b()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iJ4 = zj1Var.j();
            for (int i6 = 0; i6 < iJ4; i6++) {
                if (((x92) zj1Var.k(i6)).b()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }

    public void d(int i, int i2) {
        if (i < 0.0f) {
            s21.a("Index should be non-negative (" + i + ')');
        }
        ((t52) this.b).h(i);
        qc1 qc1Var = (qc1) this.e;
        if (i != qc1Var.f) {
            qc1Var.f = i;
            int i3 = (i / 30) * 30;
            qc1Var.e.setValue(mh0.f0(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((t52) this.c).h(i2);
    }
}
