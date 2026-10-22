package defpackage;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class qh {
    public static final yz2 a = o51.D(0.0f, 0.0f, null, 7);

    static {
        pe2 pe2Var = zj3.a;
        o51.D(0.0f, 0.0f, new td0(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final s03 a(float f, ln0 ln0Var, String str, f30 f30Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return b(new td0(f), o51.x0, ln0Var, null, str, f30Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final s03 b(Object obj, qd3 qd3Var, si siVar, Float f, String str, f30 f30Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = ke0.H(null);
            ov0Var.m0(objQ);
        }
        ey1 ey1Var = (ey1) objQ;
        Object objQ2 = ov0Var.Q();
        if (objQ2 == c30Var) {
            objQ2 = new oh(obj, qd3Var, f);
            ov0Var.m0(objQ2);
        }
        oh ohVar = (oh) objQ2;
        ey1 ey1VarL = ke0.L(null, ov0Var);
        if (f != null && (siVar instanceof yz2)) {
            yz2 yz2Var = (yz2) siVar;
            if (!o51.f(yz2Var.c, f)) {
                siVar = new yz2(yz2Var.a, yz2Var.b, f);
            }
        }
        ey1 ey1VarL2 = ke0.L(siVar, ov0Var);
        Object objQ3 = ov0Var.Q();
        if (objQ3 == c30Var) {
            objQ3 = ChannelKt.Channel$default(-1, null, null, 6, null);
            ov0Var.m0(objQ3);
        }
        Channel channel = (Channel) objQ3;
        boolean zH = ov0Var.h(channel) | ov0Var.h(obj);
        Object objQ4 = ov0Var.Q();
        if (zH || objQ4 == c30Var) {
            objQ4 = new m5(5, channel, obj);
            ov0Var.m0(objQ4);
        }
        oi0.i((au0) objQ4, ov0Var);
        boolean zH2 = ov0Var.h(channel) | ov0Var.h(ohVar) | ov0Var.f(ey1VarL2) | ov0Var.f(ey1VarL);
        Object objQ5 = ov0Var.Q();
        if (zH2 || objQ5 == c30Var) {
            ph phVar = new ph(channel, ohVar, ey1VarL2, ey1VarL, null);
            ov0Var.m0(phVar);
            objQ5 = phVar;
        }
        oi0.e(ov0Var, (pu0) objQ5, channel);
        s03 s03Var = (s03) ey1Var.getValue();
        return s03Var == null ? ohVar.c : s03Var;
    }
}
