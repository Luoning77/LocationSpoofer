package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class as0 extends o12 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(hc hcVar) {
        super(true);
        this.e = hcVar;
    }

    @Override // defpackage.o12
    public void a() {
        switch (this.d) {
            case 0:
                gs0 gs0Var = (gs0) this.e;
                if (gs0.l(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + gs0Var);
                }
                if (gs0.l(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + gs0Var.g);
                }
                cq cqVar = gs0Var.g;
                if (cqVar != null) {
                    cqVar.r = false;
                    cqVar.c();
                    cq cqVar2 = gs0Var.g;
                    w wVar = new w(gs0Var, 8);
                    ArrayList arrayList = cqVar2.p;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        cqVar2.p = arrayList;
                    }
                    arrayList.add(wVar);
                    gs0Var.g.d(true);
                    gs0Var.h = true;
                    gs0Var.h(true);
                    Iterator it = gs0Var.b().iterator();
                    while (it.hasNext()) {
                        ((bz2) it.next()).getClass();
                    }
                    gs0Var.h = false;
                    gs0Var.g = null;
                }
                break;
        }
    }

    @Override // defpackage.o12
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                gs0 gs0Var = (gs0) obj;
                if (gs0.l(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + gs0Var);
                }
                as0 as0Var = gs0Var.i;
                ArrayList arrayList = gs0Var.m;
                gs0Var.h = true;
                gs0Var.h(true);
                int i2 = 0;
                gs0Var.h = false;
                if (gs0Var.g == null) {
                    if (!as0Var.a) {
                        if (gs0.l(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        gs0Var.f.c();
                        return;
                    }
                    if (gs0.l(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    gs0Var.h(false);
                    gs0Var.g(true);
                    if (gs0Var.n(gs0Var.E, gs0Var.F)) {
                        gs0Var.b = true;
                        try {
                            gs0Var.o(gs0Var.E, gs0Var.F);
                            gs0Var.a();
                        } catch (Throwable th) {
                            gs0Var.a();
                            throw th;
                        }
                    }
                    gs0Var.q();
                    ((HashMap) gs0Var.c.f).values().removeAll(Collections.singleton(null));
                    return;
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(gs0.k(gs0Var.g));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (obj2 != null) {
                            b81.u();
                            return;
                        } else {
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                throw az2.g(it);
                            }
                        }
                    }
                }
                ArrayList arrayList2 = gs0Var.g.a;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    ((ms0) obj3).getClass();
                }
                Iterator it2 = gs0.c(new ArrayList(Collections.singletonList(gs0Var.g)), 0, 1).iterator();
                if (it2.hasNext()) {
                    ((bz2) it2.next()).getClass();
                    if (!gs0.l(3)) {
                        throw null;
                    }
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    throw null;
                }
                ArrayList arrayList3 = gs0Var.g.a;
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    Object obj4 = arrayList3.get(i2);
                    i2++;
                    ((ms0) obj4).getClass();
                }
                gs0Var.g = null;
                gs0Var.q();
                if (gs0.l(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + as0Var.a + " for  FragmentManager " + gs0Var);
                    return;
                }
                return;
            default:
                ((hc) obj).invoke(this);
                return;
        }
    }

    @Override // defpackage.o12
    public void c(yp ypVar) {
        switch (this.d) {
            case 0:
                gs0 gs0Var = (gs0) this.e;
                if (gs0.l(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + gs0Var);
                }
                if (gs0Var.g != null) {
                    Iterator it = gs0.c(new ArrayList(Collections.singletonList(gs0Var.g)), 0, 1).iterator();
                    if (!it.hasNext()) {
                        Iterator it2 = gs0Var.m.iterator();
                        if (it2.hasNext()) {
                            throw az2.g(it2);
                        }
                        return;
                    } else {
                        ((bz2) it.next()).getClass();
                        if (gs0.l(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + ypVar.c);
                        }
                        new ArrayList();
                        throw null;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.o12
    public void d(yp ypVar) {
        switch (this.d) {
            case 0:
                gs0 gs0Var = (gs0) this.e;
                if (gs0.l(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + gs0Var);
                }
                gs0Var.e();
                gs0Var.f(new fs0(gs0Var));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(gs0 gs0Var) {
        super(false);
        this.e = gs0Var;
    }
}
