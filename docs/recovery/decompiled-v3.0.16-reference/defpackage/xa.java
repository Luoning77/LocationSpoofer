package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xa extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ db g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa(db dbVar, int i) {
        super(1);
        this.f = i;
        this.g = dbVar;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        db dbVar = this.g;
        switch (i) {
            case 0:
                ((rp0) dbVar.getFocusOwner()).h(((ep0) obj).a, false);
                return mf3Var;
            case 1:
                au0 au0Var = (au0) obj;
                dbVar.getUncaughtExceptionHandler$ui();
                Handler handler = dbVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    au0Var.invoke();
                } else {
                    Handler handler2 = dbVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ma(1, au0Var));
                    }
                }
                return mf3Var;
            default:
                return new af(dbVar, dbVar.getTextInputService(), (CoroutineScope) obj);
        }
    }
}
