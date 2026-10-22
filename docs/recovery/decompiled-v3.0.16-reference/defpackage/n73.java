package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n73 implements PointerInputEventHandler {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ ey1 b;
    public final /* synthetic */ ix1 c;
    public final /* synthetic */ ey1 d;

    public n73(CoroutineScope coroutineScope, ey1 ey1Var, ix1 ix1Var, ey1 ey1Var2) {
        this.a = coroutineScope;
        this.b = ey1Var;
        this.c = ix1Var;
        this.d = ey1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        ds1 ds1Var = new ds1(this.a, this.b, this.c, null);
        vu1 vu1Var = new vu1(this.d, 20);
        rf0 rf0Var = g53.a;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new yd(ca2Var, ds1Var, vu1Var, new tb2(ca2Var), (q60) null, 10), q60Var);
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (objCoroutineScope != z70Var) {
            objCoroutineScope = mf3Var;
        }
        return objCoroutineScope == z70Var ? objCoroutineScope : mf3Var;
    }
}
