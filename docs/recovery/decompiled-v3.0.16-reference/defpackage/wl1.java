package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wl1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public wl1(Comparator comparator) {
        this.a = 2;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                CompleteLocation completeLocation = (CompleteLocation) obj;
                z60 z60Var = (z60) obj3;
                CompleteLocation completeLocation2 = (CompleteLocation) obj2;
                return Double.valueOf(vd0.o(z60Var, new z60(completeLocation.getLocation().getLat(), completeLocation.getLocation().getLng()))).compareTo(Double.valueOf(vd0.o(z60Var, new z60(completeLocation2.getLocation().getLat(), completeLocation2.getLocation().getLng()))));
            case 1:
                jx1 jx1Var = (jx1) obj3;
                return Integer.valueOf(jx1Var.c(((Number) obj).longValue())).compareTo(Integer.valueOf(jx1Var.c(((Number) obj2).longValue())));
            case 2:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return hb1.Y.compare(((js2) obj).c, ((js2) obj2).c);
            default:
                int iCompare2 = ((wl1) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((js2) obj).f).compareTo(Integer.valueOf(((js2) obj2).f));
        }
    }

    public /* synthetic */ wl1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
