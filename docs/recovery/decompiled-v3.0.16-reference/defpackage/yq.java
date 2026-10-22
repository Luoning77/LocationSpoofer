package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yq implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ er2 f;

    public /* synthetic */ yq(er2 er2Var, int i) {
        this.e = i;
        this.f = er2Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        er2 er2Var = this.f;
        switch (i) {
            case 0:
                AtomicLong atomicLong = er2Var.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = er2Var.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
