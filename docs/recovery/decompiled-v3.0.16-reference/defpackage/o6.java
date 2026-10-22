package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class o6 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ au0 f;

    public /* synthetic */ o6(int i, au0 au0Var) {
        this.e = i;
        this.f = au0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.f;
        switch (i) {
            case 0:
                au0Var.invoke();
                return mf3Var;
            case 1:
                au0Var.invoke();
                return mf3Var;
            case 2:
                au0Var.invoke();
                return mf3Var;
            case 3:
                au0Var.invoke();
                return mf3Var;
            case 4:
                au0Var.invoke();
                return mf3Var;
            case Logger.WARN /* 5 */:
                au0Var.invoke();
                return mf3Var;
            case Logger.ERROR /* 6 */:
                au0Var.invoke();
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                au0Var.invoke();
                return mf3Var;
            case 8:
                au0Var.invoke();
                return mf3Var;
            case mc0.b /* 9 */:
                au0Var.invoke();
                return mf3Var;
            case mc0.c /* 10 */:
                au0Var.invoke();
                return mf3Var;
            case 11:
                au0Var.invoke();
                return mf3Var;
            case mc0.d /* 12 */:
                au0Var.invoke();
                return mf3Var;
            case 13:
                au0Var.invoke();
                return mf3Var;
            case 14:
                au0Var.invoke();
                return mf3Var;
            case a83.e /* 15 */:
                au0Var.invoke();
                return mf3Var;
            case 16:
                au0Var.invoke();
                return mf3Var;
            case 17:
                au0Var.invoke();
                return mf3Var;
            case 18:
                au0Var.invoke();
                return mf3Var;
            case 19:
                float fFloatValue = ((Number) au0Var.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            default:
                au0Var.invoke();
                return mf3Var;
        }
    }
}
