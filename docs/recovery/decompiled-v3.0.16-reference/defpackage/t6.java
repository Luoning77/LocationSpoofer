package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t6 implements View.OnClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t6(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((l7) obj).a();
                break;
            case 1:
                w8 w8Var = (w8) obj;
                w8Var.v.obtainMessage(1, w8Var.b).sendToTarget();
                break;
            case 2:
                j21 j21Var = (j21) obj;
                g gVar = (g) j21Var.b.get();
                if (gVar != null) {
                    Object obj2 = gVar.j.d;
                    g gVar2 = (g) j21Var.b.get();
                    Marker marker = (Marker) j21Var.a.get();
                    if (marker != null && gVar2 != null) {
                        ArrayList arrayList = gVar2.j.a;
                        if (arrayList.contains(marker)) {
                            if (marker.k) {
                                j21 j21Var2 = marker.j;
                                if (j21Var2 != null) {
                                    j21Var2.a();
                                }
                                marker.k = false;
                            }
                            arrayList.remove(marker);
                        }
                    }
                    j21Var.a();
                }
                break;
            default:
                bb3 bb3Var = ((Toolbar) obj).Q;
                vs1 vs1Var = bb3Var == null ? null : bb3Var.f;
                if (vs1Var != null) {
                    vs1Var.collapseActionView();
                }
                break;
        }
    }
}
