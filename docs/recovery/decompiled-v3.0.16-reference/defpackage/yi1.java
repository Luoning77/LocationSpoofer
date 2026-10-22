package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yi1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ lr2 h;

    public /* synthetic */ yi1(int i, ul1 ul1Var, lr2 lr2Var, Context context) {
        this.e = i;
        this.f = ul1Var;
        this.g = context;
        this.h = lr2Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        final lr2 lr2Var = this.h;
        Context context = this.g;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                final int i2 = 0;
                rm1.d(ul1Var, context, new pu0() { // from class: aj1
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i3 = i2;
                        mf3 mf3Var2 = mf3.a;
                        lr2 lr2Var2 = lr2Var;
                        double dDoubleValue = ((Double) obj).doubleValue();
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        switch (i3) {
                            case 0:
                                if (lr2Var2 != null) {
                                    lr2Var2.d(dDoubleValue, dDoubleValue2, Float.valueOf(16.0f));
                                }
                                break;
                            default:
                                if (lr2Var2 != null) {
                                    lr2Var2.d(dDoubleValue, dDoubleValue2, Float.valueOf(16.0f));
                                }
                                break;
                        }
                        return mf3Var2;
                    }
                });
                break;
            default:
                final int i3 = 1;
                rm1.d(ul1Var, context, new pu0() { // from class: aj1
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        mf3 mf3Var2 = mf3.a;
                        lr2 lr2Var2 = lr2Var;
                        double dDoubleValue = ((Double) obj).doubleValue();
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        switch (i4) {
                            case 0:
                                if (lr2Var2 != null) {
                                    lr2Var2.d(dDoubleValue, dDoubleValue2, Float.valueOf(16.0f));
                                }
                                break;
                            default:
                                if (lr2Var2 != null) {
                                    lr2Var2.d(dDoubleValue, dDoubleValue2, Float.valueOf(16.0f));
                                }
                                break;
                        }
                        return mf3Var2;
                    }
                });
                break;
        }
        return mf3Var;
    }
}
