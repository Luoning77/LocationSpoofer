package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class nx2 {
    public rx2 a;
    public long b;
    public boolean c;
    public int d;

    public nx2(long j, rx2 rx2Var) {
        int iB;
        int iNumberOfTrailingZeros;
        this.a = rx2Var;
        this.b = j;
        ym2 ym2Var = tx2.a;
        if (j != 0) {
            rx2 rx2VarD = d();
            long j2 = rx2VarD.g;
            long[] jArr = rx2VarD.h;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = rx2VarD.f;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = rx2VarD.e;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (tx2.c) {
                iB = tx2.f.b(j);
            }
        } else {
            iB = -1;
        }
        this.d = iB;
    }

    public static void q(nx2 nx2Var) {
        tx2.b.B(nx2Var);
    }

    public final void a() {
        synchronized (tx2.c) {
            b();
            p();
        }
    }

    public void b() {
        tx2.d = tx2.d.b(g());
    }

    public abstract void c();

    public rx2 d() {
        return this.a;
    }

    public abstract lu0 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract lu0 i();

    public final nx2 j() {
        gn gnVar = tx2.b;
        nx2 nx2Var = (nx2) gnVar.h();
        gnVar.B(this);
        return nx2Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(x03 x03Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            tx2.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(rx2 rx2Var) {
        this.a = rx2Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract nx2 u(lu0 lu0Var);
}
