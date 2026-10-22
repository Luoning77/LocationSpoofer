package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class gn0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h82 f;

    public /* synthetic */ gn0(h82 h82Var, int i) {
        this.e = i;
        this.f = h82Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        h82 h82Var = this.f;
        g82 g82Var = (g82) obj;
        switch (i) {
            case 0:
                g82.B(g82Var, h82Var, 0, 0);
                break;
            case 1:
                g82.B(g82Var, h82Var, 0, 0);
                break;
            case 2:
                if (g82Var.s() == qa1.e || g82Var.w() == 0) {
                    g82Var.x(h82Var);
                    h82Var.I0(h41.c(0L, h82Var.i), 0.0f, null);
                } else {
                    long jW = ((long) (g82Var.w() - h82Var.e)) << 32;
                    g82Var.x(h82Var);
                    h82Var.I0(h41.c(jW, h82Var.i), 0.0f, null);
                }
                break;
            case 3:
                g82.z(g82Var, h82Var, 0, 0);
                break;
            case 4:
                g82.B(g82Var, h82Var, 0, 0);
                break;
            case Logger.WARN /* 5 */:
                g82.z(g82Var, h82Var, 0, 0);
                break;
            case Logger.ERROR /* 6 */:
                g82.z(g82Var, h82Var, 0, 0);
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                g82.z(g82Var, h82Var, 0, 0);
                break;
            case 8:
                g82.B(g82Var, h82Var, 0, 0);
                break;
            case mc0.b /* 9 */:
                g82.z(g82Var, h82Var, 0, 0);
                break;
            default:
                g82.B(g82Var, h82Var, 0, 0);
                break;
        }
        return mf3Var;
    }
}
