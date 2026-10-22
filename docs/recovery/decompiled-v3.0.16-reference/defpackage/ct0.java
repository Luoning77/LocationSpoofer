package defpackage;

import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.FrameworkConfigReceiver;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ct0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ct0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return FrameworkConfigReceiver.executor$lambda$1(runnable);
            default:
                return HookStatus.writerDelegate$lambda$2$lambda$1(runnable);
        }
    }
}
