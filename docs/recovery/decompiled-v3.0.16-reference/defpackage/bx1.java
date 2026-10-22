package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bx1 {
    public final long a;
    public final gq2 b;
    public final gq2 c;
    public x83 e;
    public final bx1 d = this;
    public int f = -1;

    public bx1(long j, gq2 gq2Var, gq2 gq2Var2) {
        this.a = j;
        this.b = gq2Var;
        this.c = gq2Var2;
    }

    public final long a(xp2 xp2Var, boolean z) {
        x83 x83Var;
        wp2 wp2Var = xp2Var.b;
        wp2 wp2Var2 = xp2Var.a;
        long j = this.a;
        if (z && wp2Var2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && wp2Var.c != j) || c() == null || (x83Var = (x83) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return k93.h(x83Var, mh0.v(z ? wp2Var2.b : wp2Var.b, 0, b(x83Var)), z, xp2Var.c);
    }

    public final int b(x83 x83Var) {
        int i;
        synchronized (this.d) {
            try {
                if (this.e != x83Var) {
                    sw1 sw1Var = x83Var.b;
                    boolean z = sw1Var.c;
                    int i2 = 0;
                    if (!(z || ((float) ((int) (x83Var.c & 4294967295L))) < sw1Var.e) || z) {
                        i2 = sw1Var.f - 1;
                    } else {
                        int iE = sw1Var.e((int) (x83Var.c & 4294967295L));
                        int i3 = x83Var.b.f - 1;
                        if (iE > i3) {
                            iE = i3;
                        }
                        while (iE >= 0 && x83Var.b.f(iE) >= ((int) (x83Var.c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i2 = iE;
                        }
                    }
                    this.f = x83Var.b.c(i2, true);
                    this.e = x83Var;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final pa1 c() {
        pa1 pa1Var = (pa1) this.b.invoke();
        if (pa1Var == null || !pa1Var.U()) {
            return null;
        }
        return pa1Var;
    }

    public final dj d() {
        x83 x83Var = (x83) this.c.invoke();
        return x83Var == null ? new dj("") : x83Var.a.a;
    }
}
