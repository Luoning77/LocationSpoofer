package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eo1 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ HashSet g;
    public final /* synthetic */ HashSet h;
    public final /* synthetic */ ul1 i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ ey1 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;

    public eo1(List list, boolean z, HashSet hashSet, HashSet hashSet2, ul1 ul1Var, Context context, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3) {
        this.e = list;
        this.f = z;
        this.g = hashSet;
        this.h = hashSet2;
        this.i = ul1Var;
        this.j = context;
        this.k = ey1Var;
        this.l = ey1Var2;
        this.m = ey1Var3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        bc1 bc1Var = (bc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        f30 f30Var = (f30) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((ov0) f30Var).f(bc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 147) != 146)) {
            CompleteLocation completeLocation = (CompleteLocation) this.e.get(iIntValue);
            ov0Var.c0(-1498777032);
            if (this.g.contains(Long.valueOf(completeLocation.getLocation().getId()))) {
                z = true;
            } else {
                if (this.h.contains(new i52(Double.valueOf(completeLocation.getLocation().getLat()), Double.valueOf(completeLocation.getLocation().getLng())))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            ul1 ul1Var = this.i;
            boolean zH = ov0Var.h(ul1Var) | ov0Var.h(completeLocation);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                objQ = new hh1(ul1Var, completeLocation, this.k, 2);
                ov0Var.m0(objQ);
            }
            au0 au0Var = (au0) objQ;
            boolean zH2 = ov0Var.h(completeLocation);
            Object objQ2 = ov0Var.Q();
            if (zH2 || objQ2 == c30Var) {
                objQ2 = new co1(completeLocation, this.l, 0);
                ov0Var.m0(objQ2);
            }
            au0 au0Var2 = (au0) objQ2;
            boolean zH3 = ov0Var.h(completeLocation);
            Object objQ3 = ov0Var.Q();
            if (zH3 || objQ3 == c30Var) {
                objQ3 = new co1(completeLocation, this.m, 1);
                ov0Var.m0(objQ3);
            }
            au0 au0Var3 = (au0) objQ3;
            boolean zH4 = ov0Var.h(ul1Var) | ov0Var.h(completeLocation);
            Context context = this.j;
            boolean zH5 = zH4 | ov0Var.h(context);
            Object objQ4 = ov0Var.Q();
            if (zH5 || objQ4 == c30Var) {
                objQ4 = new hh1(ul1Var, completeLocation, context, 3);
                ov0Var.m0(objQ4);
            }
            mh0.g(completeLocation, this.f, z, au0Var, au0Var2, au0Var3, (au0) objQ4, ov0Var, 0);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
