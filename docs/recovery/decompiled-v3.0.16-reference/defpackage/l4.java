package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class l4 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ l4(l6 l6Var, ey1 ey1Var, int i) {
        this.e = i;
        this.f = l6Var;
        this.g = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        l6 l6Var = this.f;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                l6Var.e();
                ey1Var.setValue(l13.B0(32, str));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                l6Var.e();
                ey1Var.setValue(l13.B0(WorkQueueKt.BUFFER_CAPACITY, str2));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ey1Var.setValue(Boolean.valueOf(!zBooleanValue));
                if (zBooleanValue) {
                    l6Var.f();
                }
                break;
        }
        return mf3Var;
    }
}
