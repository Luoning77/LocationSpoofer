package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class wx extends s {
    public x92 P;
    public s11 Q;

    public final void B1(boolean z) {
        if (z) {
            this.Q = null;
        } else {
            this.P = null;
        }
        s1(z);
    }

    @Override // defpackage.s, defpackage.ba2
    public final void K0() {
        super.K0();
        B1(false);
    }

    @Override // defpackage.a21
    public final void T(q01 q01Var, q92 q92Var) {
        ArrayList arrayList = (ArrayList) q01Var.c;
        w1();
        if (this.z && this.D == null) {
            zv0 zv0Var = new zv0(this);
            m1(zv0Var);
            this.D = zv0Var;
        }
        if (q92Var != q92.f) {
            if (q92Var != q92.g || this.Q == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                s11 s11Var = (s11) arrayList.get(i);
                if (s11Var.i && s11Var != this.Q) {
                    B1(true);
                    return;
                }
            }
            return;
        }
        if (this.Q == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ce0.i((s11) arrayList.get(i2))) {
                    s11 s11Var2 = (s11) arrayList.get(0);
                    s11Var2.i = true;
                    this.Q = s11Var2;
                    if (this.z) {
                        u1(s11Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            s11 s11Var3 = (s11) arrayList.get(i3);
            if (s11Var3.i || !s11Var3.h || s11Var3.d) {
                float fD = ((aj3) xq1.C(this, z30.u)).d();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    s11 s11Var4 = (s11) arrayList.get(i4);
                    long j = s11Var4.c;
                    s11 s11Var5 = this.Q;
                    s11Var5.getClass();
                    boolean z = Math.abs(c12.c(c12.d(j, s11Var5.c))) > fD;
                    if (s11Var4.i || z) {
                        B1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((s11) arrayList.get(0)).i = true;
        if (this.z) {
            s11 s11Var6 = this.Q;
            s11Var6.getClass();
            t1(s11Var6.c, true);
            this.A.invoke();
        }
        this.Q = null;
    }

    @Override // defpackage.a21
    public final void U() {
        B1(true);
    }

    @Override // defpackage.s, defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        super.d0(p92Var, q92Var, j);
        if (q92Var != q92.f) {
            if (q92Var != q92.g || this.P == null) {
                return;
            }
            List list = p92Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                x92 x92Var = (x92) list.get(i);
                if (x92Var.b() && x92Var != this.P) {
                    B1(false);
                    return;
                }
            }
            return;
        }
        if (this.P == null) {
            if (g53.f(p92Var, true, false)) {
                x92 x92Var2 = (x92) p92Var.a.get(0);
                x92Var2.a();
                this.P = x92Var2;
                if (this.z) {
                    v1(x92Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = p92Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!mh0.q((x92) list2.get(i2))) {
                long jR1 = r1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    x92 x92Var3 = (x92) list2.get(i3);
                    if (x92Var3.b() || mh0.N(x92Var3, j, jR1)) {
                        B1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((x92) list2.get(0)).a();
        if (this.z) {
            x92 x92Var4 = this.P;
            x92Var4.getClass();
            t1(x92Var4.c, false);
            this.A.invoke();
        }
        this.P = null;
    }

    @Override // defpackage.s
    public final boolean y1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.s
    public final void z1(KeyEvent keyEvent) {
        this.A.invoke();
    }
}
