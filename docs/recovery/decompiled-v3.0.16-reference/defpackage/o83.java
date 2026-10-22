package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class o83 implements Executor {
    public final /* synthetic */ Choreographer e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.postFrameCallback(new fx0(runnable, 2));
    }
}
