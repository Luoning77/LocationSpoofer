package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oa0 implements zq1 {
    public final /* synthetic */ int e;
    public final zq1 f;
    public final Enum g;
    public final Enum h;

    public /* synthetic */ oa0(zq1 zq1Var, Enum r2, Enum r3, int i) {
        this.e = i;
        this.f = zq1Var;
        this.g = r2;
        this.h = r3;
    }

    @Override // defpackage.zq1
    public final Object A() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.A();
    }

    @Override // defpackage.zq1
    public final int j0(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.j0(i);
    }

    @Override // defpackage.zq1
    public final h82 s(long j) {
        int i = this.e;
        Enum r1 = this.g;
        Enum r2 = this.h;
        zq1 zq1Var = this.f;
        switch (i) {
            case 0:
                l51 l51Var = (l51) r2;
                h51 h51Var = (h51) r1;
                h51 h51Var2 = h51.f;
                if (l51Var == l51.e) {
                    return new on0(h51Var == h51Var2 ? zq1Var.s0(l50.g(j)) : zq1Var.j0(l50.g(j)), l50.c(j) ? l50.g(j) : 32767, 0);
                }
                return new on0(l50.d(j) ? l50.h(j) : 32767, h51Var == h51Var2 ? zq1Var.w(l50.h(j)) : zq1Var.u0(l50.h(j)), 0);
            case 1:
                jr1 jr1Var = (jr1) r2;
                ir1 ir1Var = (ir1) r1;
                ir1 ir1Var2 = ir1.f;
                if (jr1Var == jr1.e) {
                    return new on0(ir1Var == ir1Var2 ? zq1Var.s0(l50.g(j)) : zq1Var.j0(l50.g(j)), l50.c(j) ? l50.g(j) : 32767, 1);
                }
                return new on0(l50.d(j) ? l50.h(j) : 32767, ir1Var == ir1Var2 ? zq1Var.w(l50.h(j)) : zq1Var.u0(l50.h(j)), 1);
            default:
                a02 a02Var = (a02) r2;
                zz1 zz1Var = (zz1) r1;
                zz1 zz1Var2 = zz1.f;
                if (a02Var == a02.e) {
                    return new on0(zz1Var == zz1Var2 ? zq1Var.s0(l50.g(j)) : zq1Var.j0(l50.g(j)), l50.c(j) ? l50.g(j) : 32767, 2);
                }
                return new on0(l50.d(j) ? l50.h(j) : 32767, zz1Var == zz1Var2 ? zq1Var.w(l50.h(j)) : zq1Var.u0(l50.h(j)), 2);
        }
    }

    @Override // defpackage.zq1
    public final int s0(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.s0(i);
    }

    @Override // defpackage.zq1
    public final int u0(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.u0(i);
    }

    @Override // defpackage.zq1
    public final int w(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.w(i);
    }
}
