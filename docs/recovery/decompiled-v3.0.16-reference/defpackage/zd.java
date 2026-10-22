package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zd extends ie1 {
    public Job b;
    public ne1 c;
    public MutableSharedFlow d;

    @Override // defpackage.j92
    public final void a(f83 f83Var, c11 c11Var, ji1 ji1Var, f70 f70Var) {
        k(new e5(f83Var, this, c11Var, ji1Var, f70Var, 1));
    }

    @Override // defpackage.j92
    public final void b() {
        k(null);
    }

    @Override // defpackage.j92
    public final void c(f83 f83Var, f83 f83Var2) {
        ne1 ne1Var = this.c;
        if (ne1Var != null) {
            boolean z = (f93.b(ne1Var.h.b, f83Var2.b) && o51.f(ne1Var.h.c, f83Var2.c)) ? false : true;
            ne1Var.h = f83Var2;
            int size = ne1Var.j.size();
            for (int i = 0; i < size; i++) {
                ne2 ne2Var = (ne2) ((WeakReference) ne1Var.j.get(i)).get();
                if (ne2Var != null) {
                    ne2Var.g = f83Var2;
                }
            }
            he1 he1Var = ne1Var.m;
            synchronized (he1Var.c) {
                he1Var.j = null;
                he1Var.l = null;
                he1Var.k = null;
                he1Var.m = null;
                he1Var.n = null;
            }
            if (o51.f(f83Var, f83Var2)) {
                if (z) {
                    d31 d31Var = ne1Var.b;
                    int iF = f93.f(f83Var2.b);
                    int iE = f93.e(f83Var2.b);
                    f93 f93Var = ne1Var.h.c;
                    int iF2 = f93Var != null ? f93.f(f93Var.a) : -1;
                    f93 f93Var2 = ne1Var.h.c;
                    d31Var.t().updateSelection((View) d31Var.f, iF, iE, iF2, f93Var2 != null ? f93.e(f93Var2.a) : -1);
                    return;
                }
                return;
            }
            if (f83Var != null && (!o51.f(f83Var.a.f, f83Var2.a.f) || (f93.b(f83Var.b, f83Var2.b) && !o51.f(f83Var.c, f83Var2.c)))) {
                d31 d31Var2 = ne1Var.b;
                d31Var2.t().restartInput((View) d31Var2.f);
                return;
            }
            int size2 = ne1Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ne2 ne2Var2 = (ne2) ((WeakReference) ne1Var.j.get(i2)).get();
                if (ne2Var2 != null) {
                    f83 f83Var3 = ne1Var.h;
                    d31 d31Var3 = ne1Var.b;
                    if (ne2Var2.k) {
                        ne2Var2.g = f83Var3;
                        if (ne2Var2.i) {
                            d31Var3.t().updateExtractedText((View) d31Var3.f, ne2Var2.h, ld0.N(f83Var3));
                        }
                        f93 f93Var3 = f83Var3.c;
                        long j = f83Var3.b;
                        int iF3 = f93Var3 != null ? f93.f(f93Var3.a) : -1;
                        f93 f93Var4 = f83Var3.c;
                        d31Var3.t().updateSelection((View) d31Var3.f, f93.f(j), f93.e(j), iF3, f93Var4 != null ? f93.e(f93Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.j92
    public final void f() {
        Job job = this.b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.b = null;
        MutableSharedFlow mutableSharedFlowJ = j();
        if (mutableSharedFlowJ != null) {
            mutableSharedFlowJ.resetReplayCache();
        }
    }

    @Override // defpackage.j92
    public final void g(pe2 pe2Var) {
        Rect rect;
        ne1 ne1Var = this.c;
        if (ne1Var != null) {
            ne1Var.l = new Rect(xq1.P(pe2Var.a), xq1.P(pe2Var.b), xq1.P(pe2Var.c), xq1.P(pe2Var.d));
            if (!ne1Var.j.isEmpty() || (rect = ne1Var.l) == null) {
                return;
            }
            ne1Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.j92
    public final void h(f83 f83Var, e12 e12Var, x83 x83Var, w3 w3Var, pe2 pe2Var, pe2 pe2Var2) {
        ne1 ne1Var = this.c;
        if (ne1Var != null) {
            he1 he1Var = ne1Var.m;
            synchronized (he1Var.c) {
                try {
                    he1Var.j = f83Var;
                    he1Var.l = e12Var;
                    he1Var.k = x83Var;
                    he1Var.m = pe2Var;
                    he1Var.n = pe2Var2;
                    if (he1Var.e || he1Var.d) {
                        he1Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final MutableSharedFlow j() {
        MutableSharedFlow mutableSharedFlow = this.d;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        if (!y13.a) {
            return null;
        }
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.d = mutableSharedFlowMutableSharedFlow$default;
        return mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(e5 e5Var) {
        ge1 ge1Var = this.a;
        if (ge1Var == null) {
            return;
        }
        Job jobLaunch$default = null;
        Object[] objArr = 0;
        t3 t3Var = new t3((Object) e5Var, (Object) this, (Object) ge1Var, (q60) (0 == true ? 1 : 0), 1);
        if (ge1Var.r) {
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(ge1Var.a1(), null, CoroutineStart.UNDISPATCHED, new k(ge1Var, t3Var, objArr == true ? 1 : 0, 26), 1, null);
        }
        this.b = jobLaunch$default;
    }
}
