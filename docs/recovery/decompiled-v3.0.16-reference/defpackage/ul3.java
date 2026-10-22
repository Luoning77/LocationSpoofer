package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ul3 {
    public static final WeakHashMap w = new WeakHashMap();
    public final kh a;
    public final kh b;
    public final kh c;
    public final kh d;
    public final kh e;
    public final kh f;
    public final kh g;
    public final kh h;
    public final kh i;
    public final hh3 j;
    public final w52 k;
    public final lf3 l;
    public final hh3 m;
    public final hh3 n;
    public final hh3 o;
    public final hh3 p;
    public final hh3 q;
    public final hh3 r;
    public final hh3 s;
    public final boolean t;
    public int u;
    public final n31 v;

    public ul3(View view) {
        kh khVar = new kh(4, "captionBar");
        this.a = khVar;
        kh khVar2 = new kh(WorkQueueKt.BUFFER_CAPACITY, "displayCutout");
        this.b = khVar2;
        kh khVar3 = new kh(8, "ime");
        this.c = khVar3;
        kh khVar4 = new kh(32, "mandatorySystemGestures");
        this.d = khVar4;
        kh khVar5 = new kh(2, "navigationBars");
        this.e = khVar5;
        kh khVar6 = new kh(1, "statusBars");
        this.f = khVar6;
        kh khVar7 = new kh(519, "systemBars");
        this.g = khVar7;
        kh khVar8 = new kh(16, "systemGestures");
        this.h = khVar8;
        kh khVar9 = new kh(64, "tappableElement");
        this.i = khVar9;
        hh3 hh3Var = new hh3(new s31(0, 0, 0, 0), "waterfall");
        this.j = hh3Var;
        this.k = ke0.H(null);
        lf3 lf3Var = new lf3(new lf3(khVar7, khVar3), khVar2);
        this.l = lf3Var;
        new lf3(lf3Var, new lf3(new lf3(new lf3(khVar9, khVar4), khVar8), hh3Var));
        this.m = q73.m(4, "captionBarIgnoringVisibility");
        this.n = q73.m(2, "navigationBarsIgnoringVisibility");
        this.o = q73.m(1, "statusBarsIgnoringVisibility");
        this.p = q73.m(519, "systemBarsIgnoringVisibility");
        this.q = q73.m(64, "tappableElementIgnoringVisibility");
        this.r = new hh3(new s31(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new hh3(new s31(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(2131230805) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new n31(this);
        WeakHashMap weakHashMap = yi3.a;
        ql3 ql3VarA = si3.a(view);
        if (ql3VarA != null) {
            nl3 nl3Var = ql3VarA.a;
            khVar.f(nl3Var.q(4));
            khVar2.f(nl3Var.q(WorkQueueKt.BUFFER_CAPACITY));
            khVar3.f(nl3Var.q(8));
            khVar4.f(nl3Var.q(32));
            khVar5.f(nl3Var.q(2));
            khVar6.f(nl3Var.q(1));
            khVar7.f(nl3Var.q(519));
            khVar8.f(nl3Var.q(16));
            khVar9.f(nl3Var.q(64));
        }
    }

    public static void b(ul3 ul3Var, ql3 ql3Var) {
        boolean z = false;
        ul3Var.a.g(ql3Var, 0);
        ul3Var.c.g(ql3Var, 0);
        ul3Var.b.g(ql3Var, 0);
        ul3Var.e.g(ql3Var, 0);
        ul3Var.f.g(ql3Var, 0);
        ul3Var.g.g(ql3Var, 0);
        ul3Var.h.g(ql3Var, 0);
        ul3Var.i.g(ql3Var, 0);
        ul3Var.d.g(ql3Var, 0);
        ul3Var.m.f(g83.h(ql3Var.a.h(4)));
        ul3Var.n.f(g83.h(ql3Var.a.h(2)));
        ul3Var.o.f(g83.h(ql3Var.a.h(1)));
        ul3Var.p.f(g83.h(ql3Var.a.h(519)));
        ul3Var.q.f(g83.h(ql3Var.a.h(64)));
        bd0 bd0VarF = ql3Var.a.f();
        ul3Var.j.f(g83.h(bd0VarF != null ? bd0VarF.a() : j31.e));
        re reVar = null;
        if (bd0VarF != null) {
            Path pathC = Build.VERSION.SDK_INT >= 31 ? vb.c(bd0VarF.a) : null;
            if (pathC != null) {
                reVar = new re(pathC);
            }
        }
        ul3Var.k.setValue(reVar);
        synchronized (tx2.c) {
            ay1 ay1Var = tx2.j.h;
            if (ay1Var != null && ay1Var.h()) {
                z = true;
            }
        }
        if (z) {
            tx2.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap weakHashMap = yi3.a;
            n31 n31Var = this.v;
            ri3.h(view, n31Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(n31Var);
            al3.a(view, n31Var);
        }
        this.u++;
    }
}
