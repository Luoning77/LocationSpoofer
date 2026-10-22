package defpackage;

import android.view.View;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i21 implements View.OnLongClickListener {
    public final /* synthetic */ j21 a;

    public i21(j21 j21Var) {
        this.a = j21Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        g gVar = (g) this.a.b.get();
        if (gVar == null) {
            return true;
        }
        Object obj = gVar.j.d;
        return true;
    }
}
