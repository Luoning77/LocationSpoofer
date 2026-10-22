package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ta0 implements bf1 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public ta0(cf1 cf1Var) {
        this.e = 2;
        this.f = cf1Var;
        sx sxVar = sx.c;
        Class<?> cls = cf1Var.getClass();
        qx qxVar = (qx) sxVar.a.get(cls);
        this.g = qxVar == null ? sxVar.a(cls, null) : qxVar;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ra0 ra0Var = (ra0) obj;
                switch (sa0.a[ve1Var.ordinal()]) {
                    case 1:
                    case 4:
                        break;
                    case 2:
                        ra0Var.F(df1Var);
                        break;
                    case 3:
                        ra0Var.P(df1Var);
                        break;
                    case Logger.WARN /* 5 */:
                        ra0Var.A(df1Var);
                        break;
                    case Logger.ERROR /* 6 */:
                        ra0Var.O(df1Var);
                        break;
                    case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                        fo.i("ON_ANY must not been send by anybody");
                        break;
                    default:
                        b81.d();
                        break;
                }
                bf1 bf1Var = (bf1) obj2;
                if (bf1Var != null) {
                    bf1Var.U(df1Var, ve1Var);
                }
                break;
            case 1:
                if (ve1Var == ve1.ON_START) {
                    ((xe1) obj).b(this);
                    ((qm2) obj2).d();
                }
                break;
            default:
                cf1 cf1Var = (cf1) obj;
                HashMap map = ((qx) obj2).a;
                qx.a((List) map.get(ve1Var), df1Var, ve1Var, cf1Var);
                qx.a((List) map.get(ve1.ON_ANY), df1Var, ve1Var, cf1Var);
                break;
        }
    }

    public /* synthetic */ ta0(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
