package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class di1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ey1 c;
    public final /* synthetic */ Object d;

    public di1(lu0 lu0Var, ey1 ey1Var, ey1 ey1Var2) {
        this.a = 1;
        this.b = lu0Var;
        this.c = ey1Var;
        this.d = ey1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        int i = this.a;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        Object obj = this.b;
        Object obj2 = this.d;
        ey1 ey1Var = this.c;
        switch (i) {
            case 0:
                s52 s52Var = (s52) ey1Var;
                ci1 ci1Var = new ci1(s52Var, 0);
                a6 a6Var = new a6((mi1) obj2, (lu0) obj, s52Var, 10);
                hd hdVar = new hd(s52Var, 23);
                s5 s5Var = new s5(s52Var, 11);
                float f = df0.a;
                Object objL = mh0.l(ca2Var, new ye0(ci1Var, s5Var, a6Var, hdVar, (q60) null, 2), q60Var);
                if (objL != z70Var) {
                    objL = mf3Var;
                }
                return objL == z70Var ? objL : mf3Var;
            case 1:
                Object objL2 = mh0.l(ca2Var, new dj1((lu0) obj, ey1Var, (ey1) obj2, (q60) null), q60Var);
                return objL2 == z70Var ? objL2 : mf3Var;
            default:
                Object objL3 = mh0.l(ca2Var, new dj1(ey1Var, (ey1) obj2, (ey1) obj, (q60) null), q60Var);
                return objL3 == z70Var ? objL3 : mf3Var;
        }
    }

    public /* synthetic */ di1(ey1 ey1Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = ey1Var;
        this.d = obj;
        this.b = obj2;
    }
}
