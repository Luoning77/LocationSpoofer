package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sd1 implements ao2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sd1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public static int b(sd1 sd1Var, int i) {
        Object obj;
        qd1 qd1VarH = ((yd1) sd1Var.c).h();
        if (!qd1VarH.k.isEmpty()) {
            int iC = sd1Var.c();
            if (i > sd1Var.d() || iC > i) {
                return ((i - sd1Var.c()) * ld0.O(qd1VarH)) - ((t52) ((yd1) sd1Var.c).e.c).g();
            }
            List list = qd1VarH.k;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((rd1) obj).a == i) {
                    break;
                }
                i2++;
            }
            rd1 rd1Var = (rd1) obj;
            if (rd1Var != null) {
                return rd1Var.l;
            }
        }
        return 0;
    }

    @Override // defpackage.ao2
    public final float a(float f) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ao2) obj).a(f);
            default:
                wo2 wo2Var = (wo2) obj;
                if (Math.abs(f) == 0.0f || ((Boolean) wo2Var.h.invoke()).booleanValue()) {
                    return wo2Var.d(wo2Var.g(((uo2) this.c).a(2, wo2Var.e(wo2Var.h(f)))));
                }
                throw new un0("The fling animation was cancelled", 0);
        }
    }

    public int c() {
        return ((t52) ((yd1) this.c).e.b).g();
    }

    public int d() {
        rd1 rd1Var = (rd1) zy.u0(((yd1) this.c).h().k);
        if (rd1Var != null) {
            return rd1Var.a;
        }
        return 0;
    }
}
