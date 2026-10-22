package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gj1 implements dd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey1 b;

    public /* synthetic */ gj1(ey1 ey1Var, int i) {
        this.a = i;
        this.b = ey1Var;
    }

    @Override // defpackage.dd0
    public final void dispose() {
        int i = this.a;
        ey1 ey1Var = this.b;
        switch (i) {
            case 0:
                Job job = (Job) ey1Var.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                break;
            default:
                Job job2 = (Job) ey1Var.getValue();
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                break;
        }
    }
}
