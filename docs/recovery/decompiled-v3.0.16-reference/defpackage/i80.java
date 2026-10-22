package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i80 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i80(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                l23 l23Var = (l23) obj;
                l23Var.e = true;
                l23Var.notifyDataSetChanged();
                break;
            default:
                wg1 wg1Var = (wg1) obj;
                if (wg1Var.C.isShowing()) {
                    wg1Var.c();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                l23 l23Var = (l23) obj;
                l23Var.e = false;
                l23Var.notifyDataSetInvalidated();
                break;
            default:
                ((wg1) obj).dismiss();
                break;
        }
    }
}
