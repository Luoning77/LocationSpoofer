package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class e10 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e10(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = i;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.h;
        int i2 = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                f10 f10Var = (f10) obj2;
                Object obj3 = ((t7) obj).a;
                String str = (String) f10Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    a8 a8Var = (a8) f10Var.e.get(str);
                    if ((a8Var != null ? a8Var.a : null) != null) {
                        s7 s7Var = a8Var.a;
                        if (f10Var.d.remove(str)) {
                            s7Var.b(obj3);
                        }
                    } else {
                        f10Var.g.remove(str);
                        f10Var.f.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((f10) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((lc2) ((gc0) obj2).c).g(i2, obj);
                break;
        }
    }
}
