package defpackage;

import java.util.UUID;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class h2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ h2(ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.f = ey1Var;
        this.g = ey1Var2;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        ey1 ey1Var2 = this.f;
        switch (i) {
            case 0:
                if (!xq1.p(ey1Var2)) {
                    ey1Var.setValue(null);
                }
                return mf3Var;
            case 1:
                ey1Var2.setValue(vj0.e);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case 2:
                ey1Var2.setValue("search");
                ey1Var.setValue(UUID.randomUUID().toString());
                return mf3Var;
            case 3:
                ey1Var2.setValue("coupon");
                ey1Var.setValue(UUID.randomUUID().toString());
                return mf3Var;
            case 4:
                ey1Var2.setValue(Boolean.FALSE);
                ey1Var.setValue("");
                return mf3Var;
            case Logger.WARN /* 5 */:
                ey1Var2.setValue("");
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ey1Var2.setValue(null);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ey1Var2.setValue(null);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case 8:
                ey1Var2.setValue(Boolean.TRUE);
                ey1Var.setValue(null);
                return mf3Var;
            case mc0.b /* 9 */:
                ey1Var2.setValue(Boolean.TRUE);
                ey1Var.setValue(null);
                return mf3Var;
            case mc0.c /* 10 */:
                ey1Var2.setValue(Boolean.TRUE);
                ey1Var.setValue(null);
                return mf3Var;
            case 11:
                ey1Var2.setValue(null);
                ey1Var.setValue(Boolean.FALSE);
                return mf3Var;
            case mc0.d /* 12 */:
                ey1Var2.setValue(Boolean.FALSE);
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
            case 13:
                ey1Var2.setValue(Boolean.FALSE);
                ey1Var.setValue(Boolean.TRUE);
                return mf3Var;
            default:
                return new i52((String) ey1Var2.getValue(), (o43) ey1Var.getValue());
        }
    }
}
