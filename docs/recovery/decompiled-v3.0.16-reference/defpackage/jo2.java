package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class jo2 {
    public static final ym2 a = new ym2(9);
    public static final go2 b = new go2();
    public static final xc0 c = new xc0(1);
    public static final ho2 d = new ho2();

    public static dv1 a(p73 p73Var, x32 x32Var, boolean z, boolean z2, ix1 ix1Var) {
        return new fo2(p73Var, x32Var, z, z2, ix1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(wo2 wo2Var, long j, r60 r60Var) {
        io2 io2Var;
        te2 te2Var;
        wo2 wo2Var2;
        if (r60Var instanceof io2) {
            io2Var = (io2) r60Var;
            int i = io2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                io2Var.h = i - Integer.MIN_VALUE;
            } else {
                io2Var = new io2(r60Var);
            }
        } else {
            io2Var = new io2(r60Var);
        }
        Object obj = io2Var.g;
        int i2 = io2Var.h;
        if (i2 == 0) {
            ee0.J(obj);
            te2Var = new te2();
            n nVar = new n(wo2Var, j, te2Var, (q60) null, 4);
            io2Var.e = wo2Var;
            io2Var.f = te2Var;
            io2Var.h = 1;
            Object objF = wo2Var.f(jy1.e, nVar, io2Var);
            z70 z70Var = z70.e;
            if (objF == z70Var) {
                return z70Var;
            }
            wo2Var2 = wo2Var;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            te2 te2Var2 = io2Var.f;
            wo2 wo2Var3 = io2Var.e;
            ee0.J(obj);
            te2Var = te2Var2;
            wo2Var2 = wo2Var3;
        }
        return new c12(wo2Var2.h(te2Var.e));
    }
}
