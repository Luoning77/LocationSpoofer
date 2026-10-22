package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ea extends rp implements np0 {
    public final us1 e;
    public final ms2 f;
    public final db g;
    public final re2 h;
    public final String i;
    public final Rect j = new Rect();
    public final AutofillId k;
    public final hx1 l;
    public boolean m;

    public ea(us1 us1Var, ms2 ms2Var, db dbVar, re2 re2Var, String str) {
        this.e = us1Var;
        this.f = ms2Var;
        this.g = dbVar;
        this.h = re2Var;
        this.i = str;
        dbVar.setImportantForAutofill(1);
        AutofillId autofillId = dbVar.getAutofillId();
        if (autofillId == null) {
            throw az2.e("Required value was null.");
        }
        this.k = autofillId;
        this.l = new hx1();
    }

    @Override // defpackage.np0
    public final void a(dq0 dq0Var, dq0 dq0Var2) {
        hb1 hb1VarO;
        es2 es2VarW;
        hb1 hb1VarO2;
        es2 es2VarW2;
        if (dq0Var != null && (hb1VarO2 = xp1.O(dq0Var)) != null && (es2VarW2 = hb1VarO2.w()) != null) {
            zx1 zx1Var = es2VarW2.e;
            if (zx1Var.b(ds2.g) || zx1Var.b(ds2.h)) {
                ((AutofillManager) this.e.f).notifyViewExited(this.g, hb1VarO2.f);
            }
        }
        if (dq0Var2 == null || (hb1VarO = xp1.O(dq0Var2)) == null || (es2VarW = hb1VarO.w()) == null) {
            return;
        }
        zx1 zx1Var2 = es2VarW.e;
        if (zx1Var2.b(ds2.g) || zx1Var2.b(ds2.h)) {
            int i = hb1VarO.f;
            this.h.b.l(i, new ca(this, i));
        }
    }
}
