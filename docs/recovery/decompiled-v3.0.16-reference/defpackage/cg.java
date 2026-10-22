package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cg implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jg f;

    public /* synthetic */ cg(jg jgVar, int i) {
        this.e = i;
        this.f = jgVar;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        jg jgVar = this.f;
        switch (i) {
            case 0:
                au0 au0Var = (au0) obj;
                View view = jgVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    au0Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ma(2, au0Var));
                    }
                }
                return mf3Var;
            case 1:
                ActionMode actionMode = jgVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return mf3Var;
            case 2:
                ActionMode actionMode2 = jgVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return mf3Var;
            default:
                jgVar.e.d();
                return new h8(jgVar, 3);
        }
    }
}
