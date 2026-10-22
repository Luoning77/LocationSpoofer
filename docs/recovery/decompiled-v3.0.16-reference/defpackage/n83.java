package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n83 implements j92 {
    public final View a;
    public final gn b;
    public final o83 c;
    public boolean d;
    public lu0 e;
    public lu0 f;
    public f83 g;
    public c11 h;
    public final ArrayList i;
    public final zb1 j;
    public Rect k;
    public final k80 l;
    public final gy1 m;
    public w n;

    public n83(View view, db dbVar) {
        gn gnVar = new gn();
        gnVar.a = view;
        ye yeVar = new ye(gnVar, 12);
        ce1 ce1Var = ce1.g;
        gnVar.b = ig0.A(ce1Var, yeVar);
        gnVar.c = new us1(view);
        o83 o83Var = new o83(Choreographer.getInstance());
        this.a = view;
        this.b = gnVar;
        this.c = o83Var;
        this.e = ik0.E;
        this.f = ik0.F;
        this.g = new f83("", f93.b, 4);
        this.h = c11.g;
        this.i = new ArrayList();
        this.j = ig0.A(ce1Var, new ye(this, 25));
        this.l = new k80(dbVar, gnVar);
        this.m = new gy1(new m83[16]);
    }

    @Override // defpackage.j92
    public final void a(f83 f83Var, c11 c11Var, ji1 ji1Var, f70 f70Var) {
        this.d = true;
        this.g = f83Var;
        this.h = c11Var;
        this.e = ji1Var;
        this.f = f70Var;
        i(m83.e);
    }

    @Override // defpackage.j92
    public final void b() {
        i(m83.e);
    }

    @Override // defpackage.j92
    public final void c(f83 f83Var, f83 f83Var2) {
        boolean z = (f93.b(this.g.b, f83Var2.b) && o51.f(this.g.c, f83Var2.c)) ? false : true;
        this.g = f83Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            me2 me2Var = (me2) ((WeakReference) this.i.get(i)).get();
            if (me2Var != null) {
                me2Var.d = f83Var2;
            }
        }
        k80 k80Var = this.l;
        synchronized (k80Var.c) {
            k80Var.j = null;
            k80Var.l = null;
            k80Var.k = null;
            k80Var.m = wa.D;
            k80Var.n = null;
            k80Var.o = null;
        }
        if (o51.f(f83Var, f83Var2)) {
            if (z) {
                gn gnVar = this.b;
                int iF = f93.f(f83Var2.b);
                int iE = f93.e(f83Var2.b);
                f93 f93Var = this.g.c;
                int iF2 = f93Var != null ? f93.f(f93Var.a) : -1;
                f93 f93Var2 = this.g.c;
                ((InputMethodManager) ((zb1) gnVar.b).getValue()).updateSelection((View) gnVar.a, iF, iE, iF2, f93Var2 != null ? f93.e(f93Var2.a) : -1);
                return;
            }
            return;
        }
        if (f83Var != null && (!o51.f(f83Var.a.f, f83Var2.a.f) || (f93.b(f83Var.b, f83Var2.b) && !o51.f(f83Var.c, f83Var2.c)))) {
            gn gnVar2 = this.b;
            ((InputMethodManager) ((zb1) gnVar2.b).getValue()).restartInput((View) gnVar2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            me2 me2Var2 = (me2) ((WeakReference) this.i.get(i2)).get();
            if (me2Var2 != null) {
                f83 f83Var3 = this.g;
                gn gnVar3 = this.b;
                if (me2Var2.h) {
                    me2Var2.d = f83Var3;
                    if (me2Var2.f) {
                        ((InputMethodManager) ((zb1) gnVar3.b).getValue()).updateExtractedText((View) gnVar3.a, me2Var2.e, dh0.M(f83Var3));
                    }
                    f93 f93Var3 = f83Var3.c;
                    long j = f83Var3.b;
                    int iF3 = f93Var3 != null ? f93.f(f93Var3.a) : -1;
                    f93 f93Var4 = f83Var3.c;
                    ((InputMethodManager) ((zb1) gnVar3.b).getValue()).updateSelection((View) gnVar3.a, f93.f(j), f93.e(j), iF3, f93Var4 != null ? f93.e(f93Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.j92
    public final void d() {
        i(m83.g);
    }

    @Override // defpackage.j92
    public final void e() {
        i(m83.h);
    }

    @Override // defpackage.j92
    public final void f() {
        this.d = false;
        this.e = ik0.G;
        this.f = ik0.H;
        this.k = null;
        i(m83.f);
    }

    @Override // defpackage.j92
    public final void g(pe2 pe2Var) {
        Rect rect;
        this.k = new Rect(xq1.P(pe2Var.a), xq1.P(pe2Var.b), xq1.P(pe2Var.c), xq1.P(pe2Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.j92
    public final void h(f83 f83Var, e12 e12Var, x83 x83Var, w3 w3Var, pe2 pe2Var, pe2 pe2Var2) {
        k80 k80Var = this.l;
        synchronized (k80Var.c) {
            try {
                k80Var.j = f83Var;
                k80Var.l = e12Var;
                k80Var.k = x83Var;
                k80Var.m = w3Var;
                k80Var.n = pe2Var;
                k80Var.o = pe2Var2;
                if (k80Var.e || k80Var.d) {
                    k80Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(m83 m83Var) {
        this.m.b(m83Var);
        if (this.n == null) {
            w wVar = new w(this, 15);
            this.c.execute(wVar);
            this.n = wVar;
        }
    }
}
