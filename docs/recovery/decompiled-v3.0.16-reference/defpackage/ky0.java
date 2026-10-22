package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ky0 extends cv1 implements tc3, ba2, u30 {
    public yd0 s;
    public bf t;
    public boolean u;

    public ky0(bf bfVar, yd0 yd0Var) {
        this.s = yd0Var;
        this.t = bfVar;
    }

    @Override // defpackage.ba2
    public final long I() {
        if (this.s == null) {
            return ob3.a;
        }
        xb0 xb0Var = xp1.O(this).D;
        int i = ob3.b;
        return l93.e(xb0Var.n0(10.0f), xb0Var.n0(40.0f), xb0Var.n0(10.0f), xb0Var.n0(40.0f));
    }

    @Override // defpackage.ba2
    public final void K0() {
        q1();
    }

    @Override // defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        if (q92Var == q92.f) {
            List list = p92Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (p1(((x92) list.get(i)).i)) {
                    int i2 = p92Var.f;
                    if (i2 == 4) {
                        this.u = true;
                        o1();
                        return;
                    } else {
                        if (i2 == 5) {
                            q1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        q1();
    }

    public final void m1() {
        bf bfVar;
        we2 we2Var = new we2();
        q73.j(this, new hk0(we2Var));
        ky0 ky0Var = (ky0) we2Var.e;
        if (ky0Var == null || (bfVar = ky0Var.t) == null) {
            bfVar = this.t;
        }
        n1(bfVar);
    }

    public abstract void n1(v92 v92Var);

    public final void o1() {
        se2 se2Var = new se2();
        se2Var.e = true;
        q73.l(this, new ae0(se2Var));
        if (se2Var.e) {
            m1();
        }
    }

    public abstract boolean p1(int i);

    public final void q1() {
        if (this.u) {
            this.u = false;
            if (this.r) {
                we2 we2Var = new we2();
                q73.j(this, new va(1, we2Var));
                ky0 ky0Var = (ky0) we2Var.e;
                if (ky0Var != null) {
                    ky0Var.m1();
                } else {
                    n1(null);
                }
            }
        }
    }
}
