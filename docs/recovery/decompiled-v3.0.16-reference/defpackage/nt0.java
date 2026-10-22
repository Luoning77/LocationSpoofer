package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class nt0 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ nt0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return FrameworkLocationDelivery.tick$lambda$30$lambda$29$lambda$28(obj);
            default:
                return FrameworkLocationDelivery.close$lambda$47$lambda$46$lambda$45(obj);
        }
    }
}
