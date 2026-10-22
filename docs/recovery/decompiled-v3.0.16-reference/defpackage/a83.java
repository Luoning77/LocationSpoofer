package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class a83 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static final void a(boolean z, hg2 hg2Var, x73 x73Var, f30 f30Var, int i) {
        int i2;
        boolean z2;
        hg2 hg2Var2;
        y83 y83VarD;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (ov0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.d(hg2Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(x73Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean zF = (i4 == 4) | ov0Var.f(x73Var);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = new zq2(x73Var, z);
                ov0Var.m0(objQ);
            }
            s63 s63Var = (s63) objQ;
            boolean zH = ov0Var.h(x73Var) | (i4 == 4);
            Object objQ2 = ov0Var.Q();
            if (zH || objQ2 == c30Var) {
                objQ2 = new y73(x73Var, z);
                ov0Var.m0(objQ2);
            }
            f12 f12Var = (f12) objQ2;
            boolean zG = f93.g(x73Var.l().b);
            f83 f83VarL = x73Var.l();
            int i5 = (int) (z ? f83VarL.b >> 32 : f83VarL.b & 4294967295L);
            me1 me1Var = x73Var.d;
            float fJ = (me1Var == null || (y83VarD = me1Var.d()) == null) ? 0.0f : v83.j(y83VarD.a, i5);
            boolean zH2 = ov0Var.h(s63Var);
            Object objQ3 = ov0Var.Q();
            if (zH2 || objQ3 == c30Var) {
                objQ3 = new eq2(s63Var, i3);
                ov0Var.m0(objQ3);
            }
            hg2Var2 = hg2Var;
            float f = fJ;
            z2 = z;
            ji2.u(f12Var, z2, hg2Var2, zG, 0L, f, m33.a(av1.a, s63Var, (PointerInputEventHandler) objQ3), ov0Var, (i2 << 3) & 1008);
        } else {
            z2 = z;
            hg2Var2 = hg2Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yf(z2, hg2Var2, x73Var, i);
        }
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final df1 c(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131230945);
            df1 df1Var = tag instanceof df1 ? (df1) tag : null;
            if (df1Var != null) {
                return df1Var;
            }
            Object objF = q73.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return null;
    }

    public static final int d(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int e(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        yo.p0(objArr, objArr2, 0, i, 6);
        yo.n0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean g(x73 x73Var, boolean z) {
        pa1 pa1VarC;
        me1 me1Var = x73Var.d;
        if (me1Var == null || (pa1VarC = me1Var.c()) == null) {
            return false;
        }
        return n51.q(n51.A(pa1VarC), x73Var.j(z));
    }

    public static final Object[] h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        yo.p0(objArr, objArr2, 0, i, 6);
        yo.n0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        yo.p0(objArr, objArr2, 0, i, 6);
        yo.n0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void j(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
