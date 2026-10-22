package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ok2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ RuntimeOperationCoordinator f;
    public final /* synthetic */ Job g;

    public /* synthetic */ ok2(RuntimeOperationCoordinator runtimeOperationCoordinator, Job job, int i) {
        this.e = i;
        this.f = runtimeOperationCoordinator;
        this.g = job;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        Job job = this.g;
        RuntimeOperationCoordinator runtimeOperationCoordinator = this.f;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                return RuntimeOperationCoordinator.launch$lambda$5(runtimeOperationCoordinator, job, th);
            default:
                return RuntimeOperationCoordinator.stop$lambda$10(runtimeOperationCoordinator, job, th);
        }
    }
}
