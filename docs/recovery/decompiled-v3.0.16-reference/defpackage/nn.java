package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nn implements dd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.dd0
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ey1) obj2).setValue(Boolean.TRUE);
                ((au0) ((ey1) obj).getValue()).invoke();
                break;
            case 1:
                ((g21) obj2).a.j((e21) obj);
                break;
            case 2:
                ((be1) obj2).g.k(obj);
                break;
            case 3:
                ey1 ey1Var = (ey1) obj2;
                vb2 vb2Var = (vb2) ey1Var.getValue();
                if (vb2Var != null) {
                    ub2 ub2Var = new ub2(vb2Var);
                    ix1 ix1Var = (ix1) obj;
                    if (ix1Var != null) {
                        ix1Var.b(ub2Var);
                    }
                    ey1Var.setValue(null);
                }
                break;
            case 4:
                ((a93) obj2).c.remove((lu0) obj);
                break;
            case Logger.WARN /* 5 */:
                ((mc3) obj2).j.remove((mc3) obj);
                break;
            case Logger.ERROR /* 6 */:
                mc3 mc3Var = (mc3) obj2;
                mc3Var.getClass();
                gc3 gc3Var = (gc3) ((hc3) obj).b.getValue();
                if (gc3Var != null) {
                    mc3Var.i.remove(gc3Var.e);
                }
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((mc3) obj2).i.remove((kc3) obj);
                break;
            default:
                ul3 ul3Var = (ul3) obj2;
                View view = (View) obj;
                int i2 = ul3Var.u - 1;
                ul3Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = yi3.a;
                    ri3.h(view, null);
                    al3.a(view, null);
                    view.removeOnAttachStateChangeListener(ul3Var.v);
                }
                break;
        }
    }
}
