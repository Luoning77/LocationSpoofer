package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a30 {
    public final View a;
    public final o30 b;
    public final df1 c;
    public final tm2 d;
    public final pj3 e;
    public final a11 f;
    public final ig2 g;
    public final Configuration h;
    public final ey1 i;
    public final ba j;
    public final tg k;
    public final ka l;
    public final ja m;
    public final kq0 n;
    public final ey1 o;
    public final jx0 p;
    public final vg q;
    public final jb1 r;
    public final ee1 s;
    public final yv t;
    public int u;
    public final ye v;
    public final z20 w;

    public a30(a30 a30Var, View view, o30 o30Var, df1 df1Var, tm2 tm2Var, pj3 pj3Var) {
        a11 a11Var;
        Configuration configuration;
        ey1 ey1VarH;
        ba baVar;
        tg tgVar;
        ka kaVar;
        ja jaVar;
        kq0 u92Var;
        ey1 w52Var;
        vg vgVar;
        boolean zF = o51.f(a30Var != null ? a30Var.a.getContext() : null, view.getContext());
        this.a = view;
        this.b = o30Var;
        this.c = df1Var;
        this.d = tm2Var;
        this.e = pj3Var;
        if (zF) {
            a30Var.getClass();
            a11Var = a30Var.f;
        } else {
            a11Var = new a11();
        }
        this.f = a11Var;
        this.g = a30Var != null ? a30Var.g : new ig2();
        if (zF) {
            a30Var.getClass();
            configuration = a30Var.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (zF) {
            a30Var.getClass();
            ey1VarH = a30Var.i;
        } else {
            ey1VarH = ke0.H(new Configuration(configuration));
        }
        this.i = ey1VarH;
        if (zF) {
            a30Var.getClass();
            baVar = a30Var.j;
        } else {
            Context context = view.getContext();
            baVar = new ba();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.j = baVar;
        if (zF) {
            a30Var.getClass();
            tgVar = a30Var.k;
        } else {
            tgVar = new tg(view.getContext());
        }
        this.k = tgVar;
        if (zF) {
            a30Var.getClass();
            kaVar = a30Var.l;
        } else {
            kaVar = new ka(view.getContext());
        }
        this.l = kaVar;
        if (zF) {
            a30Var.getClass();
            jaVar = a30Var.m;
        } else {
            jaVar = new ja(kaVar);
        }
        this.m = jaVar;
        if (zF) {
            a30Var.getClass();
            u92Var = a30Var.n;
        } else {
            view.getContext();
            u92Var = new u92(19);
        }
        this.n = u92Var;
        if (zF) {
            a30Var.getClass();
            w52Var = a30Var.o;
        } else {
            w52Var = new w52(ig0.n(view.getContext()), u92.h);
        }
        this.o = w52Var;
        this.p = view == (a30Var != null ? a30Var.a : null) ? a30Var.p : new m82(view);
        if (zF) {
            a30Var.getClass();
            vgVar = a30Var.q;
        } else {
            vgVar = new vg(ViewConfiguration.get(view.getContext()));
        }
        this.q = vgVar;
        this.r = a30Var != null ? a30Var.r : new jb1();
        this.s = new ee1();
        this.t = a30Var != null ? a30Var.t : new yv();
        this.v = new ye(this, 8);
        this.w = new z20(this);
    }

    public final void a(db dbVar, p10 p10Var, f30 f30Var, int i) {
        boolean z;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(123858079);
        int i2 = (ov0Var.h(dbVar) ? 4 : 2) | i | (ov0Var.h(p10Var) ? 32 : 16) | (ov0Var.h(this) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object tag = dbVar.getTag(2131230841);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof p81) && !(tag instanceof t81))) ? null : (Set) tag;
            if (set == null) {
                Object parent = dbVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(2131230841) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof p81) && !(tag2 instanceof t81))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(ov0Var.y());
                ov0Var.q = true;
                ov0Var.C = true;
                ov0Var.c.b();
                ov0Var.H.b();
                kx2 kx2Var = ov0Var.I;
                hx2 hx2Var = kx2Var.a;
                kx2Var.e = hx2Var.n;
                kx2Var.f = hx2Var.o;
            }
            Object objQ = ov0Var.Q();
            tm2 tm2Var = this.d;
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                Object parent2 = dbVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(2131230804);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strJ = az2.j("SaveableStateRegistry:", strValueOf);
                qm2 savedStateRegistry = tm2Var.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strJ);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                wa waVar = wa.F;
                hh0 hh0Var = vl2.a;
                ul2 ul2Var = new ul2(linkedHashMap, waVar);
                if (savedStateRegistry.b(strJ) != null) {
                    z = false;
                } else {
                    try {
                        savedStateRegistry.c(strJ, new v00(ul2Var, i3));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                }
                fd0 fd0Var = new fd0(ul2Var, new gd0(z, savedStateRegistry, strJ));
                ov0Var.m0(fd0Var);
                objQ = fd0Var;
            }
            fd0 fd0Var2 = (fd0) objQ;
            boolean zH = ov0Var.h(fd0Var2);
            Object objQ2 = ov0Var.Q();
            if (zH || objQ2 == c30Var) {
                objQ2 = new q9(fd0Var2, 12);
                ov0Var.m0(objQ2);
            }
            oi0.a(mf3.a, (lu0) objQ2, ov0Var);
            hh0 hh0Var2 = z30.x;
            boolean zBooleanValue = ((Boolean) ov0Var.j(hh0Var2)).booleanValue() | dbVar.getScrollCaptureInProgress$ui();
            boolean zF = ov0Var.f(dbVar.getView());
            Object objQ3 = ov0Var.Q();
            if (zF || objQ3 == c30Var) {
                objQ3 = new wj3(dbVar.getView());
                ov0Var.m0(objQ3);
            }
            k22.c(new kk[]{kh1.a.a(this.c), oh1.a.a(tm2Var), AndroidCompositionLocals_androidKt.d.a(this.f), AndroidCompositionLocals_androidKt.e.a(this.g), AndroidCompositionLocals_androidKt.b.a(dbVar.getContext()), u31.a.a(set), AndroidCompositionLocals_androidKt.a.a(dbVar.getConfiguration()), vl2.a.a(fd0Var2), AndroidCompositionLocals_androidKt.f.a(dbVar.getView()), hh0Var2.a(Boolean.valueOf(zBooleanValue)), z30.u.a(dbVar.getViewConfiguration()), jy0.a.a((wj3) objQ3)}, sb.a0(1317454175, new y20(dbVar, this, p10Var), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new y20(this, dbVar, p10Var, i);
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.u = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            z20 z20Var = this.w;
            context.unregisterComponentCallbacks(z20Var);
            ee1 ee1Var = this.s;
            if (ee1Var.b == null) {
                ee1Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(z20Var);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            z20 z20Var = this.w;
            context.registerComponentCallbacks(z20Var);
            d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            ee1 ee1Var = this.s;
            ee1Var.c.setValue(Boolean.valueOf(zHasWindowFocus));
            w52 w52Var = ee1Var.b;
            ye yeVar = this.v;
            if (w52Var == null) {
                ee1Var.a = yeVar;
            }
            if (w52Var != null) {
                w52Var.setValue(yeVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(z20Var);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                y01 y01Var = (y01) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (y01Var == null || Configuration.needNewResources(iUpdateFrom, y01Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            ig2 ig2Var = this.g;
            synchronized (ig2Var) {
                ig2Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.o.setValue(ig0.n(this.a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                ee1 ee1Var = this.s;
                ye yeVar = this.v;
                w52 w52Var = ee1Var.b;
                if (w52Var != null) {
                    w52Var.setValue(yeVar.invoke());
                }
            }
        }
    }
}
