package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c51 implements xv1 {
    public boolean e;
    public Object f;
    public final Object g;

    public c51(x73 x73Var) {
        this.g = x73Var;
        this.e = true;
    }

    public boolean a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((z92) this.g).f;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (wc0.C(((aa2) obj).a, j)) {
                break;
            }
            i++;
        }
        aa2 aa2Var = (aa2) obj;
        if (aa2Var != null) {
            return aa2Var.h;
        }
        return false;
    }

    public long b(f83 f83Var, long j, boolean z, yp2 yp2Var) {
        x73 x73Var = (x73) this.g;
        long jV = x73Var.v(f83Var, j, z, false, yp2Var, false, null);
        if (!f93.a(jV, (f93) this.f)) {
            this.e = false;
        }
        x73Var.r(f93.c(jV) ? dx0.g : dx0.f);
        return jV;
    }

    @Override // defpackage.xv1
    public void c() {
        if (this.e) {
            ((x73) this.g).n((f93) this.f);
        }
    }

    @Override // defpackage.xv1
    public boolean d(long j) {
        me1 me1Var;
        x73 x73Var = (x73) this.g;
        if (!x73Var.i() || x73Var.l().a.f.length() == 0 || (me1Var = x73Var.d) == null || me1Var.d() == null) {
            return false;
        }
        b(x73Var.l(), j, false, u92.l);
        return true;
    }

    @Override // defpackage.xv1
    public boolean e(long j, yp2 yp2Var, int i) {
        me1 me1Var;
        x73 x73Var = (x73) this.g;
        if (!x73Var.i() || x73Var.l().a.f.length() == 0 || (me1Var = x73Var.d) == null || me1Var.d() == null) {
            return false;
        }
        vp0 vp0Var = x73Var.l;
        if (vp0Var != null) {
            vp0.a(vp0Var);
        }
        x73Var.o = j;
        x73Var.t = -1;
        x73Var.e(true);
        long jB = b(x73Var.l(), x73Var.o, true, yp2Var);
        if (i >= 2) {
            this.e = true;
            this.f = new f93(jB);
        }
        return true;
    }

    @Override // defpackage.xv1
    public boolean f(long j, yp2 yp2Var) {
        me1 me1Var;
        x73 x73Var = (x73) this.g;
        if (!x73Var.i() || x73Var.l().a.f.length() == 0 || (me1Var = x73Var.d) == null || me1Var.d() == null) {
            return false;
        }
        b(x73Var.l(), j, false, yp2Var);
        return true;
    }

    @Override // defpackage.xv1
    public boolean g(long j) {
        x73 x73Var = (x73) this.g;
        me1 me1Var = x73Var.d;
        if (me1Var == null || me1Var.d() == null || !x73Var.i()) {
            return false;
        }
        x73Var.t = -1;
        vp0 vp0Var = x73Var.l;
        if (vp0Var != null) {
            vp0.a(vp0Var);
        }
        b(x73Var.l(), j, false, u92.l);
        return true;
    }

    public c51(zj1 zj1Var, z92 z92Var) {
        this.f = zj1Var;
        this.g = z92Var;
    }
}
