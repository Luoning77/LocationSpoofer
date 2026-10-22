package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class mo0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ mo0(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case 1:
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
            case 2:
                return (ld1) ((au0) ey1Var.getValue()).invoke();
            case 3:
                return new kd1((lu0) ey1Var.getValue());
            case 4:
                ey1Var.setValue("");
                return mf3Var;
            case Logger.WARN /* 5 */:
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ey1Var.setValue(null);
                return mf3Var;
            case 8:
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case mc0.b /* 9 */:
                ey1Var.setValue(null);
                return mf3Var;
            case mc0.c /* 10 */:
                ey1Var.setValue(null);
                return mf3Var;
            case 11:
                ey1Var.setValue(null);
                return mf3Var;
            case mc0.d /* 12 */:
                ey1Var.setValue(null);
                return mf3Var;
            case 13:
                ey1Var.setValue(null);
                return mf3Var;
            case 14:
                ey1Var.setValue(null);
                return mf3Var;
            case a83.e /* 15 */:
                ey1Var.setValue(null);
                return mf3Var;
            case 16:
                ey1Var.setValue(null);
                return mf3Var;
            case 17:
                ey1Var.setValue("qr");
                return mf3Var;
            case 18:
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case 19:
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
            case 20:
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case 21:
                ey1Var.setValue(null);
                return mf3Var;
            case 22:
                ey1Var.setValue("");
                return mf3Var;
            case 23:
                ey1Var.setValue("");
                return mf3Var;
            case 24:
                ey1Var.setValue(null);
                return mf3Var;
            case 25:
                ey1Var.setValue(null);
                return mf3Var;
            case 26:
                ey1Var.setValue(null);
                return mf3Var;
            case 27:
                ey1Var.setValue(null);
                return mf3Var;
            case 28:
                pa1 pa1Var = (pa1) ey1Var.getValue();
                if (pa1Var != null) {
                    return pa1Var;
                }
                s21.d("Required value was null.");
                fo.d();
                return null;
            default:
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
        }
    }
}
