package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class if3 implements un {
    public final Object e;
    public final ArrayList f = new ArrayList();
    public Object g;

    public if3(hb1 hb1Var) {
        this.e = hb1Var;
        this.g = hb1Var;
    }

    public final void a() {
        this.f.clear();
        this.g = this.e;
        ((hb1) this.e).O();
    }

    @Override // defpackage.un
    public final void c(int i, Object obj) {
        ((hb1) this.g).A(i, (hb1) obj);
    }

    @Override // defpackage.un
    public final void d(Object obj) {
        this.f.add(this.g);
        this.g = obj;
    }

    @Override // defpackage.un
    public final void e() {
        re2 rectManager;
        ea eaVar;
        re2 rectManager2;
        hb1 hb1Var = (hb1) this.g;
        tz1 tz1Var = hb1Var.K;
        if (!hb1Var.G()) {
            p21.a("onReuse is only expected on attached node");
        }
        bj3 bj3Var = hb1Var.t;
        if (bj3Var != null) {
            View view = bj3Var.f;
            if (view.getParent() != bj3Var) {
                bj3Var.addView(view);
            } else {
                bj3Var.j.invoke();
            }
        }
        vb1 vb1Var = hb1Var.M;
        if (vb1Var != null) {
            vb1Var.i(false);
        }
        hb1Var.y = false;
        if (hb1Var.V) {
            hb1Var.V = false;
        } else {
            cv1 cv1Var = hb1Var.K.e;
            for (cv1 cv1Var2 = cv1Var; cv1Var2 != null; cv1Var2 = cv1Var2.i) {
                if (cv1Var2.r) {
                    cv1Var2.h1();
                }
            }
            for (cv1 cv1Var3 = cv1Var; cv1Var3 != null; cv1Var3 = cv1Var3.i) {
                if (cv1Var3.r) {
                    cv1Var3.j1();
                }
            }
            while (cv1Var != null) {
                if (cv1Var.r) {
                    cv1Var.d1();
                }
                cv1Var = cv1Var.i;
            }
        }
        int i = hb1Var.f;
        t42 t42Var = hb1Var.s;
        if (t42Var != null && (rectManager2 = ((db) t42Var).getRectManager()) != null) {
            rectManager2.g(hb1Var);
        }
        hb1Var.f = gs2.a.addAndGet(1);
        t42 t42Var2 = hb1Var.s;
        if (t42Var2 != null) {
            db dbVar = (db) t42Var2;
            dbVar.getLayoutNodes().g(i);
            dbVar.getLayoutNodes().h(hb1Var.f, hb1Var);
        }
        for (cv1 cv1Var4 = tz1Var.f; cv1Var4 != null; cv1Var4 = cv1Var4.j) {
            cv1Var4.c1();
        }
        tz1Var.e();
        if (tz1Var.c(8)) {
            hb1Var.E();
        }
        hb1.W(hb1Var);
        t42 t42Var3 = hb1Var.s;
        if (t42Var3 != null && (eaVar = ((db) t42Var3).R) != null) {
            db dbVar2 = eaVar.g;
            us1 us1Var = eaVar.e;
            hx1 hx1Var = eaVar.l;
            if (hx1Var.e(i)) {
                us1Var.r(dbVar2, i, false);
            }
            es2 es2VarW = hb1Var.w();
            if (es2VarW != null && es2VarW.e.b(os2.r)) {
                hx1Var.a(hb1Var.f);
                us1Var.r(dbVar2, hb1Var.f, true);
            }
        }
        t42 t42Var4 = hb1Var.s;
        if (t42Var4 == null || (rectManager = ((db) t42Var4).getRectManager()) == null) {
            return;
        }
        rectManager.f(hb1Var);
    }

    @Override // defpackage.un
    public final void f(int i, Object obj) {
    }

    @Override // defpackage.un
    public final void g() {
        t42 t42Var = ((hb1) this.e).s;
        if (t42Var != null) {
            ((db) t42Var).u();
        }
    }

    @Override // defpackage.un
    public final void h(int i, int i2, int i3) {
        ((hb1) this.g).K(i, i2, i3);
    }

    @Override // defpackage.un
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.un
    public final void k(int i, int i2) {
        ((hb1) this.g).P(i, i2);
    }

    @Override // defpackage.un
    public final void s() {
        ArrayList arrayList = this.f;
        this.g = arrayList.remove(arrayList.size() - 1);
    }
}
