package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ae extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ae(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                context.getClass();
                intent.getClass();
                ((q2) obj).invoke();
                break;
            case 1:
                ((e1) obj).j();
                break;
            default:
                context.getClass();
                intent.getClass();
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj;
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(mf3.a);
                }
                break;
        }
    }
}
