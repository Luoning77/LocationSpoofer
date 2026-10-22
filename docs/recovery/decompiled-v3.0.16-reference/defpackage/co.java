package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class co implements Executor {
    public final /* synthetic */ int e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                eo.L().g.h.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
