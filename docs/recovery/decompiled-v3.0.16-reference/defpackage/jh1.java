package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jh1 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ SimpleDateFormat f;
    public final /* synthetic */ HashSet g;
    public final /* synthetic */ HashSet h;
    public final /* synthetic */ lu0 i;
    public final /* synthetic */ au0 j;
    public final /* synthetic */ lu0 k;

    public jh1(List list, SimpleDateFormat simpleDateFormat, HashSet hashSet, HashSet hashSet2, lu0 lu0Var, au0 au0Var, lu0 lu0Var2) {
        this.e = list;
        this.f = simpleDateFormat;
        this.g = hashSet;
        this.h = hashSet2;
        this.i = lu0Var;
        this.j = au0Var;
        this.k = lu0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
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
            ov0Var.c0(-1378348664);
            String str = this.f.format(new Date(completeLocation.getLocation().getTimestamp()));
            str.getClass();
            if (this.g.contains(Long.valueOf(completeLocation.getLocation().getId()))) {
                z = true;
            } else {
                if (this.h.contains(new i52(Double.valueOf(completeLocation.getLocation().getLat()), Double.valueOf(completeLocation.getLocation().getLng())))) {
                    z = true;
                } else {
                    z = false;
                }
            }
            lu0 lu0Var = this.i;
            boolean zF = ov0Var.f(lu0Var) | ov0Var.h(completeLocation);
            au0 au0Var = this.j;
            boolean zF2 = zF | ov0Var.f(au0Var);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF2 || objQ == c30Var) {
                objQ = new hh1(lu0Var, completeLocation, au0Var, 0);
                ov0Var.m0(objQ);
            }
            au0 au0Var2 = (au0) objQ;
            lu0 lu0Var2 = this.k;
            boolean zF3 = ov0Var.f(lu0Var2) | ov0Var.h(completeLocation);
            Object objQ2 = ov0Var.Q();
            if (zF3 || objQ2 == c30Var) {
                objQ2 = new bn(4, lu0Var2, completeLocation);
                ov0Var.m0(objQ2);
            }
            mc0.c(completeLocation, str, z, au0Var2, (au0) objQ2, ov0Var, 0);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
