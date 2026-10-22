package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eq2 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ s63 b;

    public /* synthetic */ eq2(s63 s63Var, int i) {
        this.a = i;
        this.b = s63Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        int i = this.a;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        s63 s63Var = this.b;
        switch (i) {
            case 0:
                Object objN = vd0.n(ca2Var, s63Var, q60Var);
                return objN == z70Var ? objN : mf3Var;
            default:
                Object objN2 = vd0.n(ca2Var, s63Var, q60Var);
                return objN2 == z70Var ? objN2 : mf3Var;
        }
    }
}
