package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ro0 implements PointerInputEventHandler {
    public final /* synthetic */ pu0 a;

    public ro0(pu0 pu0Var) {
        this.a = pu0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        Object objH = df0.h(ca2Var, null, null, new qo0(0, this.a), q60Var, 7);
        return objH == z70.e ? objH : mf3.a;
    }
}
