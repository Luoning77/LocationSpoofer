package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vo0 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ pu0 b;
    public final /* synthetic */ ey1 c;
    public final /* synthetic */ float d;

    public vo0(boolean z, pu0 pu0Var, ey1 ey1Var, float f) {
        this.a = z;
        this.b = pu0Var;
        this.c = ey1Var;
        this.d = f;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [to0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [to0] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        if (this.a) {
            final int i = 0;
            final pu0 pu0Var = this.b;
            final ey1 ey1Var = this.c;
            final int i2 = 1;
            Object objH = df0.h(ca2Var, new au0() { // from class: to0
                @Override // defpackage.au0
                public final Object invoke() {
                    int i3 = i;
                    mf3 mf3Var = mf3.a;
                    ey1 ey1Var2 = ey1Var;
                    pu0 pu0Var2 = pu0Var;
                    switch (i3) {
                        case 0:
                            j52 j52Var = wo0.a;
                            ey1Var2.setValue(new c12(0L));
                            pu0Var2.invoke(Double.valueOf(0.0d), Float.valueOf(0.0f));
                            break;
                        default:
                            j52 j52Var2 = wo0.a;
                            ey1Var2.setValue(new c12(0L));
                            pu0Var2.invoke(Double.valueOf(0.0d), Float.valueOf(0.0f));
                            break;
                    }
                    return mf3Var;
                }
            }, new au0() { // from class: to0
                @Override // defpackage.au0
                public final Object invoke() {
                    int i3 = i2;
                    mf3 mf3Var = mf3.a;
                    ey1 ey1Var2 = ey1Var;
                    pu0 pu0Var2 = pu0Var;
                    switch (i3) {
                        case 0:
                            j52 j52Var = wo0.a;
                            ey1Var2.setValue(new c12(0L));
                            pu0Var2.invoke(Double.valueOf(0.0d), Float.valueOf(0.0f));
                            break;
                        default:
                            j52 j52Var2 = wo0.a;
                            ey1Var2.setValue(new c12(0L));
                            pu0Var2.invoke(Double.valueOf(0.0d), Float.valueOf(0.0f));
                            break;
                    }
                    return mf3Var;
                }
            }, new uo0(this.d, pu0Var, ey1Var), q60Var, 1);
            if (objH == z70.e) {
                return objH;
            }
        }
        return mf3.a;
    }
}
