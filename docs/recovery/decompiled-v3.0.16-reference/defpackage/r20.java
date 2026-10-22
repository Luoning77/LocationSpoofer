package defpackage;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class r20 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Job.DefaultImpls.cancel$default((Job) obj, (CancellationException) null, 1, (Object) null);
                break;
            default:
                x73 x73Var = (x73) obj;
                if (x73Var != null) {
                    me1 me1Var = x73Var.d;
                    if (me1Var != null) {
                        me1Var.e(f93.b);
                    }
                    me1 me1Var2 = x73Var.d;
                    if (me1Var2 != null) {
                        me1Var2.f(f93.b);
                    }
                }
                break;
        }
    }
}
