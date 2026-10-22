package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yi0 extends gh0 {
    public final /* synthetic */ gh0 i;
    public final /* synthetic */ ThreadPoolExecutor j;

    public yi0(gh0 gh0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.i = gh0Var;
        this.j = threadPoolExecutor;
    }

    @Override // defpackage.gh0
    public final void I(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.I(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.gh0
    public final void J(mn2 mn2Var) {
        ThreadPoolExecutor threadPoolExecutor = this.j;
        try {
            this.i.J(mn2Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
