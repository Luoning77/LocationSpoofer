package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class os1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ot1 {
    public ms1 e;
    public y8 f;
    public pg1 g;

    @Override // defpackage.ot1
    public final void b(ms1 ms1Var, boolean z) {
        y8 y8Var;
        if ((z || ms1Var == this.e) && (y8Var = this.f) != null) {
            y8Var.dismiss();
        }
    }

    @Override // defpackage.ot1
    public final boolean o(ms1 ms1Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ms1 ms1Var = this.e;
        pg1 pg1Var = this.g;
        og1 og1Var = pg1Var.j;
        if (og1Var == null) {
            og1Var = new og1(pg1Var);
            pg1Var.j = og1Var;
        }
        ms1Var.q(og1Var.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.g.b(this.e, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ms1 ms1Var = this.e;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                ms1Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return ms1Var.performShortcut(i, keyEvent, 0);
    }
}
