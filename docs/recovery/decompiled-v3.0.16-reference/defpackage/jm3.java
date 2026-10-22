package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jm3 implements bf1 {
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ sg f;
    public final /* synthetic */ ke2 g;
    public final /* synthetic */ we2 h;

    public jm3(CoroutineScope coroutineScope, sg sgVar, ke2 ke2Var, we2 we2Var) {
        this.e = coroutineScope;
        this.f = sgVar;
        this.g = ke2Var;
        this.h = we2Var;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        CancellableContinuation cancellableContinuationY;
        boolean z;
        switch (im3.a[ve1Var.ordinal()]) {
            case 1:
                BuildersKt__Builders_commonKt.launch$default(this.e, null, CoroutineStart.UNDISPATCHED, new t3(this.h, this.g, df1Var, this, null, 19), 1, null);
                return;
            case 2:
                sg sgVar = this.f;
                if (sgVar != null) {
                    ha1 ha1Var = (ha1) sgVar.g;
                    synchronized (ha1Var.b) {
                        try {
                            synchronized (ha1Var.b) {
                                z = ha1Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) ha1Var.c;
                                ha1Var.c = (ArrayList) ha1Var.d;
                                ha1Var.d = arrayList;
                                ha1Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((q60) arrayList.get(i)).resumeWith(mf3.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ke2 ke2Var = this.g;
                synchronized (ke2Var.c) {
                    if (ke2Var.t) {
                        ke2Var.t = false;
                        cancellableContinuationY = ke2Var.y();
                    } else {
                        cancellableContinuationY = null;
                    }
                    break;
                }
                if (cancellableContinuationY != null) {
                    cancellableContinuationY.resumeWith(mf3.a);
                    return;
                }
                return;
            case 3:
                ke2 ke2Var2 = this.g;
                synchronized (ke2Var2.c) {
                    ke2Var2.t = true;
                }
                return;
            case 4:
                this.g.x();
                return;
            case Logger.WARN /* 5 */:
            case Logger.ERROR /* 6 */:
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return;
            default:
                b81.d();
                return;
        }
    }
}
