package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wl implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wl(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                yl ylVar = (yl) obj;
                bm bmVar = ylVar.J;
                bmVar.setSelection(i);
                if (bmVar.getOnItemClickListener() != null) {
                    bmVar.performItemClick(view, i, ylVar.G.getItemId(i));
                }
                ylVar.dismiss();
                break;
            default:
                ((SearchView) obj).m(i);
                break;
        }
    }
}
