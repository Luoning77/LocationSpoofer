package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dq2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ar2 f;

    public /* synthetic */ dq2(ar2 ar2Var, int i) {
        this.e = i;
        this.f = ar2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        wp2 wp2Var;
        wp2 wp2Var2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ar2 ar2Var = this.f;
        switch (i) {
            case 0:
                return new h8(ar2Var, 13);
            case 1:
                pa1 pa1Var = (pa1) obj;
                pe2 pe2Var = (pe2) ar2Var.j.getValue();
                if (pe2Var == null) {
                    return null;
                }
                pa1 pa1Var2 = ar2Var.l;
                if (pa1Var2 != null) {
                    return zm3.V(pe2Var, pa1Var2, pa1Var);
                }
                s21.d("Required value was null.");
                fo.d();
                return null;
            case 2:
                if (ar2Var.a.a().b(((Long) obj).longValue())) {
                    ar2Var.i();
                    ar2Var.l(null);
                }
                return mf3Var;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                xp2 xp2VarF = ar2Var.f();
                if (xp2VarF != null && (wp2Var2 = xp2VarF.a) != null && jLongValue == wp2Var2.c) {
                    ar2Var.p.setValue(null);
                }
                xp2 xp2VarF2 = ar2Var.f();
                if (xp2VarF2 != null && (wp2Var = xp2VarF2.b) != null && jLongValue == wp2Var.c) {
                    ar2Var.q.setValue(null);
                }
                if (ar2Var.a.a().b(jLongValue)) {
                    ar2Var.o();
                }
                return mf3Var;
            case 4:
                pa1 pa1Var3 = (pa1) obj;
                ar2Var.l = pa1Var3;
                if (((Boolean) ar2Var.i.getValue()).booleanValue() && ar2Var.f() != null) {
                    c12 c12Var = pa1Var3 != null ? new c12(pa1Var3.z(0L)) : null;
                    if (!o51.f(ar2Var.k, c12Var)) {
                        ar2Var.k = c12Var;
                        ar2Var.m();
                        ar2Var.o();
                    }
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                w52 w52Var = ar2Var.i;
                zp0 zp0Var = (zp0) obj;
                if (!zp0Var.a() && ((Boolean) w52Var.getValue()).booleanValue()) {
                    ar2Var.i();
                }
                w52Var.setValue(Boolean.valueOf(zp0Var.a()));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ar2Var.k(((Boolean) obj).booleanValue());
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ar2Var.l((xp2) obj);
                return mf3Var;
            default:
                if (ar2Var.a.a().b(((Long) obj).longValue())) {
                    ar2Var.m.setValue(mf3Var);
                    ar2Var.m();
                    ar2Var.o();
                }
                return mf3Var;
        }
    }
}
