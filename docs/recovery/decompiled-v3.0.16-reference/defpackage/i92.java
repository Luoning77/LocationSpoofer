package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class i92 {
    public static final hh0 a = new hh0(1, x30.B);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(ge1 ge1Var, t3 t3Var, r60 r60Var) {
        g92 g92Var;
        if (r60Var instanceof g92) {
            g92Var = (g92) r60Var;
            int i = g92Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g92Var.f = i - Integer.MIN_VALUE;
            } else {
                g92Var = new g92(r60Var);
            }
        } else {
            g92Var = new g92(r60Var);
        }
        Object obj = g92Var.e;
        int i2 = g92Var.f;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                ee0.J(obj);
                fo.d();
                return;
            }
        }
        ee0.J(obj);
        if (!ge1Var.e.r) {
            fo.i("establishTextInputSession called from an unattached node");
            return;
        }
        t42 t42VarP = xp1.P(ge1Var);
        l72 l72Var = (l72) xp1.O(ge1Var).G;
        l72Var.getClass();
        if (ji2.P(l72Var, a) != null) {
            b81.u();
        } else {
            g92Var.f = 1;
            b(t42VarP, t3Var, g92Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(t42 t42Var, pu0 pu0Var, r60 r60Var) {
        h92 h92Var;
        if (r60Var instanceof h92) {
            h92Var = (h92) r60Var;
            int i = h92Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h92Var.f = i - Integer.MIN_VALUE;
            } else {
                h92Var = new h92(r60Var);
            }
        } else {
            h92Var = new h92(r60Var);
        }
        Object obj = h92Var.e;
        int i2 = h92Var.f;
        if (i2 == 0) {
            ee0.J(obj);
            h92Var.f = 1;
            ((db) t42Var).I(pu0Var, h92Var);
        } else if (i2 == 1) {
            ee0.J(obj);
            fo.d();
        } else if (i2 != 2) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
        } else {
            ee0.J(obj);
            fo.d();
        }
    }
}
