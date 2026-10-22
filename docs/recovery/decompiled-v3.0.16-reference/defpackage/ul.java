package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ul implements am, DialogInterface.OnClickListener {
    public y8 e;
    public vl f;
    public CharSequence g;
    public final /* synthetic */ bm h;

    public ul(bm bmVar) {
        this.h = bmVar;
    }

    @Override // defpackage.am
    public final boolean a() {
        y8 y8Var = this.e;
        if (y8Var != null) {
            return y8Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.am
    public final int b() {
        return 0;
    }

    @Override // defpackage.am
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.am
    public final void dismiss() {
        y8 y8Var = this.e;
        if (y8Var != null) {
            y8Var.dismiss();
            this.e = null;
        }
    }

    @Override // defpackage.am
    public final void e(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // defpackage.am
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.am
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.am
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.am
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.am
    public final void m(int i, int i2) {
        if (this.f == null) {
            return;
        }
        bm bmVar = this.h;
        x8 x8Var = new x8(bmVar.getPopupContext());
        t8 t8Var = (t8) x8Var.c;
        CharSequence charSequence = this.g;
        if (charSequence != null) {
            t8Var.d = charSequence;
        }
        vl vlVar = this.f;
        int selectedItemPosition = bmVar.getSelectedItemPosition();
        t8Var.g = vlVar;
        t8Var.h = this;
        t8Var.j = selectedItemPosition;
        t8Var.i = true;
        y8 y8VarC = x8Var.c();
        this.e = y8VarC;
        AlertController$RecycleListView alertController$RecycleListView = y8VarC.j.e;
        sl.d(alertController$RecycleListView, i);
        sl.c(alertController$RecycleListView, i2);
        this.e.show();
    }

    @Override // defpackage.am
    public final int n() {
        return 0;
    }

    @Override // defpackage.am
    public final CharSequence o() {
        return this.g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bm bmVar = this.h;
        bmVar.setSelection(i);
        if (bmVar.getOnItemClickListener() != null) {
            bmVar.performItemClick(null, i, this.f.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.am
    public final void p(ListAdapter listAdapter) {
        this.f = (vl) listAdapter;
    }
}
