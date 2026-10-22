package defpackage;

import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rl2 implements ql2 {
    public static final z92 i = new z92(2, new v70(16, 0), new yk1(26));
    public final Map e;
    public final zx1 f;
    public tl2 g;
    public final ge2 h;

    public rl2(Map map) {
        this.e = map;
        long[] jArr = hn2.a;
        this.f = new zx1();
        this.h = new ge2(this, 5);
    }

    @Override // defpackage.ql2
    public final void e(Object obj, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(533563200);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(this) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ov0Var.f0(obj);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                ge2 ge2Var = this.h;
                if (!((Boolean) ge2Var.invoke(obj)).booleanValue()) {
                    b81.r(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.e.get(obj);
                hh0 hh0Var = vl2.a;
                wl2 wl2Var = new wl2(new ul2(map, ge2Var));
                ov0Var.m0(wl2Var);
                objQ = wl2Var;
            }
            wl2 wl2Var2 = (wl2) objQ;
            k22.c(new kk[]{vl2.a.a(wl2Var2), oh1.a.a(wl2Var2)}, p10Var, ov0Var, (i3 & 112) | 8);
            boolean zH = ov0Var.h(this) | ov0Var.h(obj) | ov0Var.h(wl2Var2);
            Object objQ2 = ov0Var.Q();
            if (zH || objQ2 == c30Var) {
                objQ2 = new ji1(this, obj, wl2Var2, 15);
                ov0Var.m0(objQ2);
            }
            oi0.a(mf3.a, (lu0) objQ2, ov0Var);
            if (ov0Var.y && ov0Var.G.i == ov0Var.z) {
                ov0Var.z = -1;
                ov0Var.y = false;
            }
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(this, obj, p10Var, i2, 11);
        }
    }

    @Override // defpackage.ql2
    public final void f(Object obj) {
        if (this.f.k(obj) == null) {
            this.e.remove(obj);
        }
    }
}
