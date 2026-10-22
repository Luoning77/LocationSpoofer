package defpackage;

import java.util.List;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class e02 {
    public final wo2 a;
    public final pu0 b;
    public xb0 c;
    public boolean d;
    public final d31 e = new d31(13);

    public e02(wo2 wo2Var, pu0 pu0Var, xb0 xb0Var) {
        this.a = wo2Var;
        this.b = pu0Var;
        this.c = xb0Var;
    }

    public static void a(p92 p92Var) {
        List list = p92Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((x92) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(pu0 pu0Var, r60 r60Var) {
        d02 d02Var;
        if (r60Var instanceof d02) {
            d02Var = (d02) r60Var;
            int i = d02Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                d02Var.g = i - Integer.MIN_VALUE;
            } else {
                d02Var = new d02(this, r60Var);
            }
        } else {
            d02Var = new d02(this, r60Var);
        }
        Object obj = d02Var.e;
        int i2 = d02Var.g;
        q60 q60Var = null;
        if (i2 == 0) {
            ee0.J(obj);
            this.d = true;
            wr1 wr1Var = new wr1(this, pu0Var, q60Var, 4);
            d02Var.g = 1;
            Object objSupervisorScope = SupervisorKt.supervisorScope(wr1Var, d02Var);
            z70 z70Var = z70.e;
            if (objSupervisorScope == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        this.d = false;
        return mf3.a;
    }
}
