package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lo1 extends hj3 {
    public final EnvironmentDao b;
    public final MutableStateFlow c;
    public final StateFlow d;
    public Job e;

    public lo1(EnvironmentDao environmentDao) {
        this.b = environmentDao;
        uj0 uj0Var = uj0.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new fo1(uj0Var, uj0Var, false));
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
        e();
    }

    public final void e() {
        MutableStateFlow mutableStateFlow;
        Object value;
        List list;
        List list2;
        Job job = this.e;
        q60 q60Var = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        do {
            mutableStateFlow = this.c;
            value = mutableStateFlow.getValue();
            fo1 fo1Var = (fo1) value;
            list = fo1Var.a;
            list2 = fo1Var.b;
            list.getClass();
            list2.getClass();
        } while (!mutableStateFlow.compareAndSet(value, new fo1(list, list2, true)));
        this.e = BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new d6(this, q60Var, 10), 3, null);
    }
}
