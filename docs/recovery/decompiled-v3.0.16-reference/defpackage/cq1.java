package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cq1 implements bp0 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ k b;

    public cq1(k kVar) {
        this.b = kVar;
    }

    @Override // defpackage.bp0
    public final void a(PointF pointF) {
        this.b.s.m = pointF;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bp0) obj).a(pointF);
        }
    }
}
