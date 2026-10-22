package defpackage;

import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import java.util.function.BiFunction;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cv0 implements BiFunction {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu0 f;

    public /* synthetic */ cv0(int i, pu0 pu0Var) {
        this.e = i;
        this.f = pu0Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.e;
        pu0 pu0Var = this.f;
        switch (i) {
            case 0:
                return ((s5) pu0Var).invoke(obj, (Throwable) obj2);
            case 1:
                return FutureKt.setupCancellation$lambda$3(pu0Var, obj, (Throwable) obj2);
            default:
                return HookStatus.methodHooked$lambda$5((v70) pu0Var, obj, obj2);
        }
    }
}
