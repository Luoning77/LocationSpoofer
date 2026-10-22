package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qc implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ca2 ca2Var, q60 q60Var) {
        int i = this.a;
        int i2 = 1;
        int i3 = 3;
        int i4 = 2;
        q60 q60Var2 = null;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objL = mh0.l(ca2Var, new lh2((rc) obj, q60Var2, i4), q60Var);
                return objL == z70Var ? objL : mf3Var;
            case 1:
                j90 j90Var = (j90) obj;
                Object objL2 = mh0.l(ca2Var, new ef0(new wc(j90Var, i3), new j2(9, j90Var, ca2Var), new zc(j90Var, i3), new wc(j90Var, 4), null), q60Var);
                if (objL2 != z70Var) {
                    objL2 = mf3Var;
                }
                return objL2 == z70Var ? objL2 : mf3Var;
            case 2:
                z41 z41Var = (z41) obj;
                Object objL3 = mh0.l(ca2Var, new ef0(new w41(z41Var, i2), new s5(z41Var, 10), new hd(z41Var, 19), new w41(z41Var, i4), null), q60Var);
                if (objL3 != z70Var) {
                    objL3 = mf3Var;
                }
                return objL3 == z70Var ? objL3 : mf3Var;
            case 3:
                Object objM1 = ((q33) ca2Var).m1(new lh2((lu0) obj, q60Var2, i2), q60Var);
                return objM1 == z70Var ? objM1 : mf3Var;
            case 4:
                ex2 ex2Var = (ex2) obj;
                Object objE = g53.e(ca2Var, new cx2(ex2Var, null), new uw2(ex2Var, i4), q60Var, 3);
                return objE == z70Var ? objE : mf3Var;
            case Logger.WARN /* 5 */:
                Object objL4 = mh0.l(ca2Var, new lq2((x13) obj, null), q60Var);
                return objL4 == z70Var ? objL4 : mf3Var;
            case Logger.ERROR /* 6 */:
                Object objL5 = mh0.l(ca2Var, new lh2(new l(1, (c63) obj, c63.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 24), q60Var2, 0), q60Var);
                if (objL5 != z70Var) {
                    objL5 = mf3Var;
                }
                return objL5 == z70Var ? objL5 : mf3Var;
            default:
                x73 x73Var = (x73) obj;
                Object objU = wc0.u(ca2Var, x73Var.A, x73Var.z, q60Var);
                return objU == z70Var ? objU : mf3Var;
        }
    }
}
