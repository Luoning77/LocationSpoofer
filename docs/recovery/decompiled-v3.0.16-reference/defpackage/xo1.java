package defpackage;

import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xo1 implements Comparator {
    public final /* synthetic */ Double a;
    public final /* synthetic */ Double b;

    public xo1(Double d, Double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LocationRecord locationRecord = (LocationRecord) obj;
        double lat = locationRecord.getLat();
        Double d = this.a;
        double dDoubleValue = lat - d.doubleValue();
        double lng = locationRecord.getLng();
        Double d2 = this.b;
        double dDoubleValue2 = lng - d2.doubleValue();
        Double dValueOf = Double.valueOf((dDoubleValue2 * dDoubleValue2) + (dDoubleValue * dDoubleValue));
        LocationRecord locationRecord2 = (LocationRecord) obj2;
        double lat2 = locationRecord2.getLat() - d.doubleValue();
        double lng2 = locationRecord2.getLng() - d2.doubleValue();
        return dValueOf.compareTo(Double.valueOf((lng2 * lng2) + (lat2 * lat2)));
    }
}
