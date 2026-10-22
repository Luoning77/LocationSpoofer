package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class me1 {
    public final w52 A;
    public final w52 B;
    public gc0 a;
    public final ee2 b;
    public final ny2 c;
    public final d31 d;
    public p83 e;
    public final w52 f;
    public final w52 g;
    public pa1 h;
    public final w52 i;
    public dj j;
    public final w52 k;
    public final w52 l;
    public final w52 m;
    public final w52 n;
    public final w52 o;
    public boolean p;
    public final w52 q;
    public final l91 r;
    public final w52 s;
    public final w52 t;
    public lu0 u;
    public final f70 v;
    public final f70 w;
    public final f70 x;
    public final je y;
    public long z;

    public me1(gc0 gc0Var, ee2 ee2Var, ny2 ny2Var) {
        this.a = gc0Var;
        this.b = ee2Var;
        this.c = ny2Var;
        d31 d31Var = new d31(14, false);
        dj djVar = ej.a;
        long j = f93.b;
        f83 f83Var = new f83(djVar, j, (f93) null);
        d31Var.f = f83Var;
        d31Var.g = new mi0(djVar, f83Var.b);
        this.d = d31Var;
        Boolean bool = Boolean.FALSE;
        this.f = ke0.H(bool);
        this.g = ke0.H(new td0(0.0f));
        this.i = ke0.H(null);
        this.k = ke0.H(dx0.e);
        this.l = ke0.H(bool);
        this.m = ke0.H(bool);
        this.n = ke0.H(bool);
        this.o = ke0.H(bool);
        this.p = true;
        this.q = ke0.H(Boolean.TRUE);
        this.r = new l91(ny2Var);
        this.s = ke0.H(bool);
        this.t = ke0.H(bool);
        this.u = new zs0(20);
        this.v = new f70(this, 1);
        this.w = new f70(this, 2);
        this.x = new f70(this, 3);
        this.y = xq1.n();
        this.z = hz.g;
        this.A = ke0.H(new f93(j));
        this.B = ke0.H(new f93(j));
    }

    public final dx0 a() {
        return (dx0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final pa1 c() {
        pa1 pa1Var = this.h;
        if (pa1Var == null || !pa1Var.U()) {
            return null;
        }
        return pa1Var;
    }

    public final y83 d() {
        return (y83) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new f93(j));
    }

    public final void f(long j) {
        this.A.setValue(new f93(j));
    }
}
