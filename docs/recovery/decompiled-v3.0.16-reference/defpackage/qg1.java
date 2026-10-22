package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qg1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qg1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        vg0 vg0Var;
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                if (i != -1 && (vg0Var = ((wg1) obj).g) != null) {
                    vg0Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.e;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
