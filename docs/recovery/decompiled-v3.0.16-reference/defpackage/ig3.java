package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ig3 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xg3 f;

    public /* synthetic */ ig3(xg3 xg3Var, int i) {
        this.e = i;
        this.f = xg3Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        i52 i52Var;
        Object value;
        int i = this.e;
        xg3 xg3Var = this.f;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                xg3Var.g();
                break;
            case 1:
                xg3 xg3Var2 = this.f;
                MutableStateFlow mutableStateFlow = xg3Var2.c;
                Job job = xg3Var2.o;
                if ((job == null || !job.isActive()) && !((og3) mutableStateFlow.getValue()).k && ((og3) mutableStateFlow.getValue()).j && (i52Var = xg3Var2.q) != null) {
                    xg3Var2.o = BuildersKt__Builders_commonKt.launch$default(am1.y(xg3Var2), Dispatchers.getIO(), null, new tf0(xg3Var2, i52Var, xg3Var2.h.get(), (q60) null), 2, null);
                }
                break;
            case 2:
                xg3Var.e();
                break;
            default:
                MutableStateFlow mutableStateFlow2 = xg3Var.c;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, og3.a((og3) value, false, null, null, null, null, 0, 0, 0L, null, false, false, true, null, false, null, 29695)));
                break;
        }
        return mf3Var;
    }
}
