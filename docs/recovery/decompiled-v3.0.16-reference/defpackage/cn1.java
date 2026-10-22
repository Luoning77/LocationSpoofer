package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cn1 extends k33 implements qu0 {
    public final /* synthetic */ int e;
    public /* synthetic */ List f;
    public /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn1(int i, q60 q60Var, int i2) {
        super(i, q60Var);
        this.e = i2;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = 3;
        List list = (List) obj;
        List list2 = (List) obj2;
        q60 q60Var = (q60) obj3;
        switch (i) {
            case 0:
                cn1 cn1Var = new cn1(i2, q60Var, 0);
                cn1Var.f = list;
                cn1Var.g = list2;
                return cn1Var.invokeSuspend(mf3Var);
            default:
                cn1 cn1Var2 = new cn1(i2, q60Var, 1);
                cn1Var2.f = list;
                cn1Var2.g = list2;
                return cn1Var2.invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                List list = this.f;
                List list2 = this.g;
                ee0.J(obj);
                return new i52(list, list2);
            default:
                List list3 = this.f;
                List list4 = this.g;
                ee0.J(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (((CompleteLocation) obj2).getLocation().getCollectionRouteId() == null) {
                        arrayList.add(obj2);
                    }
                }
                return new i52(arrayList, list4);
        }
    }
}
