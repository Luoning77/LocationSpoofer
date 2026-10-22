package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qg3 implements FlowCollector {
    public final /* synthetic */ xg3 e;

    public qg3(xg3 xg3Var) {
        this.e = xg3Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        Object value;
        String str = (String) obj;
        xg3 xg3Var = this.e;
        Job job = xg3Var.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = xg3Var.m;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        xg3Var.e();
        MutableStateFlow mutableStateFlow = xg3Var.c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, og3.a((og3) value, false, null, uj0.e, null, null, 0, 0, 0L, null, false, false, false, null, false, null, 4089)));
        if (str != null) {
            boolean z = xg3Var.l;
            xg3Var.l = false;
            if (z) {
                xg3Var.g();
            } else {
                xg3Var.k = BuildersKt__Builders_commonKt.launch$default(am1.y(xg3Var), null, null, new pg3(xg3Var, str, null), 3, null);
            }
        }
        return mf3.a;
    }
}
