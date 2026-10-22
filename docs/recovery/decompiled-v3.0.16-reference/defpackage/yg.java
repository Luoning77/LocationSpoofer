package defpackage;

import android.view.MotionEvent;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yg extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ bj3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg(bj3 bj3Var, int i) {
        super(1);
        this.f = i;
        this.g = bj3Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.f;
        mf3 mf3Var = mf3.a;
        bj3 bj3Var = this.g;
        switch (i) {
            case 0:
                t42 t42Var = (t42) obj;
                db dbVar = t42Var instanceof db ? (db) t42Var : null;
                if (dbVar != null) {
                    dbVar.getAndroidViewsHandler$ui().removeViewInLayout(bj3Var);
                    da0.l(dbVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(dbVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(bj3Var));
                    bj3Var.setImportantForAccessibility(0);
                }
                bj3Var.removeAllViewsInLayout();
                return mf3Var;
            case 1:
                bj3Var.u = (lu0) obj;
                return mf3Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case Logger.WARN /* 5 */:
                    case Logger.ERROR /* 6 */:
                        zDispatchTouchEvent = bj3Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = bj3Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
