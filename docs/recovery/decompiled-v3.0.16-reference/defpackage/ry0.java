package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ry0 extends cv1 implements ba2 {
    public ix1 s;
    public ly0 t;

    @Override // defpackage.ba2
    public final void K0() {
        o1();
    }

    @Override // defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        if (q92Var == q92.f) {
            int i = p92Var.f;
            q60 q60Var = null;
            if (i == 4) {
                BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new qy0(this, q60Var, 0), 3, null);
            } else if (i == 5) {
                BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new qy0(this, q60Var, 1), 3, null);
            }
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        o1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m1(r60 r60Var) {
        oy0 oy0Var;
        ly0 ly0Var;
        if (r60Var instanceof oy0) {
            oy0Var = (oy0) r60Var;
            int i = oy0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy0Var.h = i - Integer.MIN_VALUE;
            } else {
                oy0Var = new oy0(this, r60Var);
            }
        } else {
            oy0Var = new oy0(this, r60Var);
        }
        Object obj = oy0Var.f;
        int i2 = oy0Var.h;
        if (i2 == 0) {
            ee0.J(obj);
            if (this.t == null) {
                ly0 ly0Var2 = new ly0();
                ix1 ix1Var = this.s;
                oy0Var.e = ly0Var2;
                oy0Var.h = 1;
                Object objA = ix1Var.a(ly0Var2, oy0Var);
                z70 z70Var = z70.e;
                if (objA == z70Var) {
                    return z70Var;
                }
                ly0Var = ly0Var2;
            }
            return mf3.a;
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ly0Var = oy0Var.e;
        ee0.J(obj);
        this.t = ly0Var;
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n1(r60 r60Var) {
        py0 py0Var;
        if (r60Var instanceof py0) {
            py0Var = (py0) r60Var;
            int i = py0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                py0Var.g = i - Integer.MIN_VALUE;
            } else {
                py0Var = new py0(this, r60Var);
            }
        } else {
            py0Var = new py0(this, r60Var);
        }
        Object obj = py0Var.e;
        int i2 = py0Var.g;
        if (i2 == 0) {
            ee0.J(obj);
            ly0 ly0Var = this.t;
            if (ly0Var != null) {
                my0 my0Var = new my0(ly0Var);
                ix1 ix1Var = this.s;
                py0Var.g = 1;
                Object objA = ix1Var.a(my0Var, py0Var);
                z70 z70Var = z70.e;
                if (objA == z70Var) {
                    return z70Var;
                }
            }
            return mf3.a;
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        this.t = null;
        return mf3.a;
    }

    public final void o1() {
        ly0 ly0Var = this.t;
        if (ly0Var != null) {
            this.s.b(new my0(ly0Var));
            this.t = null;
        }
    }
}
