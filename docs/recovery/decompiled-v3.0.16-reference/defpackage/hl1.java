package defpackage;

import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class hl1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;

    public /* synthetic */ hl1(int i, lu0 lu0Var) {
        this.e = i;
        this.f = lu0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                lu0Var.invoke(ml1.f);
                break;
            case 1:
                lu0Var.invoke(ml1.o);
                break;
            case 2:
                lu0Var.invoke(ml1.r);
                break;
            case 3:
                lu0Var.invoke(ml1.s);
                break;
            case 4:
                lu0Var.invoke(null);
                break;
            case Logger.WARN /* 5 */:
                lu0Var.invoke(null);
                break;
            case Logger.ERROR /* 6 */:
                lu0Var.invoke(null);
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                lu0Var.invoke(Boolean.FALSE);
                break;
            case 8:
                lu0Var.invoke(Boolean.TRUE);
                break;
            case mc0.b /* 9 */:
                lu0Var.invoke(Boolean.TRUE);
                break;
            case mc0.c /* 10 */:
                lu0Var.invoke(Boolean.FALSE);
                break;
            case 11:
                lu0Var.invoke(RouteRunMode.LOOP);
                break;
            case mc0.d /* 12 */:
                lu0Var.invoke(RouteRunMode.MANUAL);
                break;
            default:
                lu0Var.invoke("");
                break;
        }
        return mf3Var;
    }
}
