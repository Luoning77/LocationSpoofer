package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iq0 extends lb0 implements hs2, aw0, u30, z02, tc3 {
    public static final c30 A = new c30(22);
    public ix1 u;
    public final lu0 v;
    public jp0 w;
    public rc1 x;
    public xz1 y;
    public final dq0 z;

    public iq0(ix1 ix1Var, int i, l lVar) {
        this.u = ix1Var;
        this.v = lVar;
        dq0 dq0Var = new dq0(i, new t5(2, this, iq0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 3), 10);
        m1(dq0Var);
        this.z = dq0Var;
    }

    @Override // defpackage.tc3
    public final Object H() {
        return A;
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        boolean zB = this.z.r1().b();
        x81[] x81VarArr = qs2.a;
        rs2 rs2Var = os2.l;
        x81 x81Var = qs2.a[4];
        ss2Var.a(rs2Var, Boolean.valueOf(zB));
        ss2Var.a(ds2.w, new z0(null, new t4(0, this, iq0.class, "requestFocus", "requestFocus()Z", 0, 21)));
    }

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        this.y = xz1Var;
        if (this.z.r1().b()) {
            boolean z = xz1Var.t1().r;
            c30 c30Var = jq0.s;
            if (!z) {
                if (this.r) {
                    q73.c(this, c30Var);
                }
            } else {
                xz1 xz1Var2 = this.y;
                if (xz1Var2 != null && xz1Var2.t1().r && this.r) {
                    q73.c(this, c30Var);
                }
            }
        }
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.z02
    public final void f0() {
        we2 we2Var = new we2();
        gh0.H(this, new m5(15, we2Var, this));
        rc1 rc1Var = (rc1) we2Var.e;
        if (this.z.r1().b()) {
            rc1 rc1Var2 = this.x;
            if (rc1Var2 != null) {
                rc1Var2.b();
            }
            if (rc1Var != null) {
                rc1Var.a();
            } else {
                rc1Var = null;
            }
            this.x = rc1Var;
        }
    }

    @Override // defpackage.cv1
    public final void g1() {
        rc1 rc1Var = this.x;
        if (rc1Var != null) {
            rc1Var.b();
        }
        this.x = null;
    }

    public final void p1(ix1 ix1Var, s41 s41Var) {
        if (!this.r) {
            ix1Var.a.tryEmit(s41Var);
            return;
        }
        Job job = (Job) a1().getCoroutineContext().get(Job.Key);
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new m(ix1Var, s41Var, job != null ? job.invokeOnCompletion(new j(21, ix1Var, s41Var)) : null, null, 11), 3, null);
    }

    public final void q1(ix1 ix1Var) {
        jp0 jp0Var;
        if (o51.f(this.u, ix1Var)) {
            return;
        }
        ix1 ix1Var2 = this.u;
        if (ix1Var2 != null && (jp0Var = this.w) != null) {
            ix1Var2.b(new kp0(jp0Var));
        }
        this.w = null;
        this.u = ix1Var;
    }
}
