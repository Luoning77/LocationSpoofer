package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ih1 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ lu0 f;

    public ih1(List list, lu0 lu0Var) {
        this.e = list;
        this.f = lu0Var;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) this.e.get(iIntValue);
            ov0Var.c0(2088889624);
            lu0 lu0Var = this.f;
            boolean zF = ov0Var.f(lu0Var) | ov0Var.h(completeCollectionRoute);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                objQ = new bn(3, lu0Var, completeCollectionRoute);
                ov0Var.m0(objQ);
            }
            n51.b(completeCollectionRoute, (au0) objQ, null, null, ov0Var, 0, 12);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
