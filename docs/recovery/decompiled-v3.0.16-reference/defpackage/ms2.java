package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ms2 {
    public final hb1 a;
    public final xj0 b;
    public final f41 c;
    public final sx1 d = new sx1(2);

    public ms2(hb1 hb1Var, xj0 xj0Var, gx1 gx1Var) {
        this.a = hb1Var;
        this.b = xj0Var;
        this.c = gx1Var;
    }

    public final js2 a() {
        return new js2(this.b, false, this.a, new es2());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    public final void b(hb1 hb1Var, es2 es2Var) {
        String str;
        String strB0;
        xa3 xa3Var;
        xa3 xa3Var2;
        tc tcVar;
        tc tcVar2;
        sx1 sx1Var = this.d;
        Object[] objArr = sx1Var.a;
        int i = sx1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ea eaVar = (ea) objArr[i2];
            us1 us1Var = eaVar.e;
            AutofillManager autofillManager = (AutofillManager) us1Var.f;
            db dbVar = eaVar.g;
            es2 es2VarW = hb1Var.w();
            int i3 = hb1Var.f;
            if (es2Var != null) {
                Object objG = es2Var.e.g(os2.F);
                if (objG == null) {
                    objG = null;
                }
                dj djVar = (dj) objG;
                if (djVar != null) {
                    str = djVar.f;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (es2VarW != null) {
                Object objG2 = es2VarW.e.g(os2.F);
                if (objG2 == null) {
                    objG2 = null;
                }
                dj djVar2 = (dj) objG2;
                if (djVar2 != null) {
                    strB0 = djVar2.f;
                } else {
                    strB0 = null;
                }
            } else {
                strB0 = null;
            }
            if (str != strB0) {
                if (str == null) {
                    us1Var.r(dbVar, i3, true);
                } else if (strB0 == null) {
                    us1Var.r(dbVar, i3, false);
                } else if (o51.f((zb) ce0.y(es2VarW, os2.s), j9.z)) {
                    if (strB0.length() >= 5000) {
                        strB0 = (Character.isHighSurrogate(strB0.charAt(4999)) && Character.isLowSurrogate(strB0.charAt(5000))) ? l13.B0(4999, strB0) : l13.B0(5000, strB0);
                    }
                    autofillManager.notifyValueChanged(dbVar, i3, AutofillValue.forText(strB0));
                }
            }
            if (es2Var != null) {
                Object objG3 = es2Var.e.g(os2.K);
                if (objG3 == null) {
                    objG3 = null;
                }
                xa3Var = (xa3) objG3;
            } else {
                xa3Var = null;
            }
            if (es2VarW != null) {
                Object objG4 = es2VarW.e.g(os2.K);
                if (objG4 == null) {
                    objG4 = null;
                }
                xa3Var2 = (xa3) objG4;
            } else {
                xa3Var2 = null;
            }
            if (xa3Var != xa3Var2) {
                if (xa3Var == null) {
                    us1Var.r(dbVar, i3, true);
                } else if (xa3Var2 == null) {
                    us1Var.r(dbVar, i3, false);
                } else if (o51.f((zb) ce0.y(es2VarW, os2.s), j9.A)) {
                    int iOrdinal = xa3Var2.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(dbVar, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (es2Var != null) {
                Object objG5 = es2Var.e.g(os2.t);
                if (objG5 == null) {
                    objG5 = null;
                }
                tcVar = (tc) objG5;
            } else {
                tcVar = null;
            }
            if (es2VarW != null) {
                Object objG6 = es2VarW.e.g(os2.t);
                if (objG6 == null) {
                    objG6 = null;
                }
                tcVar2 = (tc) objG6;
            } else {
                tcVar2 = null;
            }
            if (!o51.f(tcVar, tcVar2)) {
                if (tcVar == null) {
                    us1Var.r(dbVar, i3, true);
                } else if (tcVar2 == null) {
                    us1Var.r(dbVar, i3, false);
                } else {
                    autofillManager.notifyValueChanged(dbVar, i3, tcVar2.a);
                }
            }
            boolean z = es2Var != null && es2Var.e.b(os2.r);
            boolean z2 = es2VarW != null && es2VarW.e.b(os2.r);
            if (z != z2) {
                hx1 hx1Var = eaVar.l;
                if (z2) {
                    hx1Var.a(i3);
                } else {
                    hx1Var.e(i3);
                }
            }
        }
    }
}
