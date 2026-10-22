package defpackage;

import android.view.ActionMode;
import android.view.View;
import java.util.Iterator;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h8 implements dd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dd0
    public final void dispose() {
        int i = this.a;
        mf3 mf3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                e8 e8Var = ((y7) obj).a;
                if (e8Var != null) {
                    e8Var.a();
                    mf3Var = mf3.a;
                }
                if (mf3Var == null) {
                    fo.n("Launcher has not been initialized");
                    break;
                }
                break;
            case 1:
                sc0 sc0Var = (sc0) obj;
                sc0Var.dismiss();
                sc0Var.k.e();
                break;
            case 2:
                ya2 ya2Var = (ya2) obj;
                ya2Var.e();
                ya2Var.setTag(2131230945, null);
                ya2Var.t.removeViewImmediate(ya2Var);
                break;
            case 3:
                jg jgVar = (jg) obj;
                ky2 ky2Var = jgVar.e;
                g8 g8Var = ky2Var.h;
                if (g8Var != null) {
                    g8Var.c();
                }
                ky2Var.a();
                ActionMode actionMode = jgVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                jgVar.h = null;
                break;
            case 4:
                Iterator it = ((bq) obj).b.iterator();
                while (it.hasNext()) {
                    ((rv) it.next()).cancel();
                }
                break;
            case Logger.WARN /* 5 */:
                uq uqVar = (uq) ((vq) obj).c.getValue();
                if (uqVar != null) {
                    uqVar.close();
                }
                break;
            case Logger.ERROR /* 6 */:
                ((fd0) obj).f.invoke();
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((x73) obj).m();
                break;
            case 8:
                ((lc1) obj).d = null;
                break;
            case mc0.b /* 9 */:
                wc1 wc1Var = (wc1) obj;
                ha1 ha1Var = wc1Var.c;
                if (ha1Var != null) {
                    ha1Var.a = false;
                }
                wc1Var.c = null;
                break;
            case mc0.c /* 10 */:
                ((rc1) obj).f = true;
                break;
            case 11:
                ((View) obj).setKeepScreenOn(false);
                break;
            case mc0.d /* 12 */:
                vm1.a((ul1) obj);
                break;
            default:
                ar2 ar2Var = (ar2) obj;
                ar2Var.i();
                ar2Var.i.setValue(Boolean.FALSE);
                break;
        }
    }
}
