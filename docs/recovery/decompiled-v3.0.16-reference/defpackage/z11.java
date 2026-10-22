package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z11 {
    public final kf0 a;
    public u11 b;
    public x11 c;
    public w11 d;
    public v11 e;
    public vd0 f;
    public us1 g;
    public long h = 9205357640488583168L;
    public px0 i;
    public final x8 j;
    public final x8 k;
    public long l;

    public z11(kf0 kf0Var) {
        this.a = kf0Var;
        x8 x8Var = new x8(3, (byte) 0);
        x8Var.c = new sx1();
        this.j = x8Var;
        x8 x8Var2 = new x8(5, (byte) 0);
        x8Var2.c = new kx1();
        this.k = x8Var2;
        this.l = 0L;
    }

    public static void c(z11 z11Var, s11 s11Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        kf0 kf0Var = z11Var.a;
        w11 w11Var = z11Var.d;
        if (w11Var == null) {
            w11Var = new w11();
            w11Var.i = null;
            w11Var.j = Long.MAX_VALUE;
            w11Var.k = false;
            z11Var.d = w11Var;
        }
        w11Var.i = s11Var;
        w11Var.j = j;
        px0 px0Var = z11Var.i;
        x32 x32Var = kf0Var.u;
        if (px0Var == null) {
            z11Var.i = new px0(x32Var, 2);
        } else {
            px0Var.b = x32Var;
            px0Var.a = j2;
        }
        w11Var.k = false;
        z11Var.f = w11Var;
    }

    public final void a() {
        u11 u11Var = this.b;
        t11 t11Var = t11.g;
        if (u11Var == null) {
            u11Var = new u11();
            u11Var.i = t11Var;
            u11Var.j = false;
            this.b = u11Var;
        }
        u11Var.i = t11Var;
        u11Var.j = false;
        this.f = u11Var;
    }

    public final void b(s11 s11Var, long j, px0 px0Var) {
        v11 v11Var = this.e;
        if (v11Var == null) {
            v11Var = new v11();
            v11Var.i = null;
            v11Var.j = Long.MAX_VALUE;
            this.e = v11Var;
        }
        v11Var.i = s11Var;
        v11Var.j = j;
        px0Var.a = 0L;
        this.f = v11Var;
    }

    public final us1 d() {
        us1 us1Var = this.g;
        if (us1Var != null) {
            return us1Var;
        }
        fo.i("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(s11 s11Var, r11 r11Var, long j) {
        kf0 kf0Var = this.a;
        long jH = xp1.N(kf0Var).h(0L);
        if (!c12.b(this.h, 9205357640488583168L) && !c12.b(jH, this.h)) {
            this.l = c12.e(this.l, c12.d(jH, this.h));
        }
        this.h = jH;
        x32 x32Var = kf0Var.u;
        x32Var.getClass();
        rf0 rf0Var = sf0.a;
        if (Math.abs(Float.intBitsToFloat((int) (x32Var == x32.e ? j & 4294967295L : j >> 32))) > 2.0f) {
            ce0.g(d(), s11Var, kf0Var.u, r11Var, this.j, this.l);
            x8 x8Var = this.k;
            kx1 kx1Var = (kx1) x8Var.c;
            int i = kx1Var.b;
            if (i == 3) {
                int i2 = x8Var.b;
                x8Var.b = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    fo.p("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = kx1Var.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                kx1Var.a(j);
            }
            if (x8Var.b == 3) {
                x8Var.b = 0;
            }
            long[] jArr2 = kx1Var.a;
            int i3 = kx1Var.b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = kx1Var.b;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = kx1Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            kf0Var.u1(new me0((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / kx1Var.b)) & 4294967295L), true));
        }
    }

    public final void f(s11 s11Var, s11 s11Var2, r11 r11Var, long j) {
        if (this.g == null) {
            this.g = new us1(26, (byte) 0);
        }
        this.l = 0L;
        us1 us1VarD = d();
        kf0 kf0Var = this.a;
        ce0.g(us1VarD, s11Var, kf0Var.u, r11Var, this.j, this.l);
        long jD = c12.d(ce0.Q(s11Var2, kf0Var.u, r11Var), j);
        if (((Boolean) kf0Var.v.invoke(new ga2(1))).booleanValue()) {
            this.h = xp1.N(kf0Var).h(0L);
            kf0Var.u1(new ne0(jD));
        }
        x8 x8Var = this.k;
        x8Var.b = 0;
        ((kx1) x8Var.c).b = 0;
    }
}
