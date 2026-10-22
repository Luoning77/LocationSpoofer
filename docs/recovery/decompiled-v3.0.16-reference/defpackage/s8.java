package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ w8 e;
    public final /* synthetic */ t8 f;

    public s8(t8 t8Var, w8 w8Var) {
        this.f = t8Var;
        this.e = w8Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        t8 t8Var = this.f;
        DialogInterface.OnClickListener onClickListener = t8Var.h;
        w8 w8Var = this.e;
        onClickListener.onClick(w8Var.b, i);
        if (t8Var.i) {
            return;
        }
        w8Var.b.dismiss();
    }
}
