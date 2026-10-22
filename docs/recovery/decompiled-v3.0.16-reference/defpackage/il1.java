package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class il1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ il1(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        Object value;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((lu0) obj).invoke(Integer.valueOf(i2));
                return mf3Var;
            case 1:
                return Integer.valueOf(((qp2) obj).f.b.d(i2));
            case 2:
                return SystemHookUtils.isTargetCaller$lambda$4(obj, i2);
            default:
                MutableStateFlow mutableStateFlow = ((xg3) obj).c;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, og3.a((og3) value, false, null, null, null, null, this.f, 0, 0L, null, false, false, false, null, false, null, 32735)));
                return mf3Var;
        }
    }
}
