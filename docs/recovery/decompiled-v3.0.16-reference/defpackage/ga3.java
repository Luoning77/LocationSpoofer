package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ga3 {
    public final int a;
    public final up b;
    public final j c;
    public ga3 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ ha3 h;

    public ga3(ha3 ha3Var, int i, up upVar, j jVar) {
        this.h = ha3Var;
        this.a = i;
        this.b = upVar;
        this.c = jVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        kf2 kf2Var;
        kf2 kf2Var2;
        long j5 = this.h.f;
        up upVar = this.b;
        xz1 xz1VarL = xp1.L(upVar, 2);
        hb1 hb1VarO = xp1.O(upVar);
        boolean zH = hb1VarO.H();
        tz1 tz1Var = hb1VarO.K;
        if (zH) {
            if (tz1Var.d != xz1VarL) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = xz1VarL.g;
                xz1 xz1Var = tz1Var.d;
                xz1Var.getClass();
                long jO = gh0.O(xz1Var.i0(xz1VarL, jFloatToRawIntBits, true));
                kf2Var = new kf2(jO, (4294967295L & ((long) (((int) (jO & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jO >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, upVar);
            } else {
                kf2Var = new kf2(j, j2, j3, j4, j5, fArr, upVar);
            }
            kf2Var2 = kf2Var;
        } else {
            kf2Var2 = null;
        }
        if (kf2Var2 == null) {
            return;
        }
        this.c.invoke(kf2Var2);
    }

    public final void b() {
        ha3 ha3Var = this.h;
        gx1 gx1Var = ha3Var.a;
        int i = this.a;
        ga3 ga3Var = (ga3) gx1Var.g(i);
        if (ga3Var != null) {
            if (ga3Var == this) {
                ga3 ga3Var2 = this.d;
                this.d = null;
                if (ga3Var2 == null) {
                    hb1 hb1VarO = xp1.O(this.b.e);
                    if (hb1VarO.k) {
                        ((db) kb1.a(hb1VarO)).getRectManager().b.j(hb1VarO.f, false);
                        return;
                    }
                    return;
                }
                int iD = gx1Var.d(i);
                Object[] objArr = gx1Var.c;
                Object obj = objArr[iD];
                gx1Var.b[iD] = i;
                objArr[iD] = ga3Var2;
                return;
            }
            int iD2 = gx1Var.d(i);
            Object[] objArr2 = gx1Var.c;
            Object obj2 = objArr2[iD2];
            gx1Var.b[iD2] = i;
            objArr2[iD2] = ga3Var;
            while (true) {
                ga3 ga3Var3 = ga3Var.d;
                if (ga3Var3 == null) {
                    break;
                }
                if (ga3Var3 == this) {
                    ga3Var.d = this.d;
                    this.d = null;
                    return;
                }
                ga3Var = ga3Var3;
            }
        }
        ga3 ga3Var4 = ha3Var.b;
        if (ga3Var4 == this) {
            ha3Var.b = ga3Var4.d;
            this.d = null;
            return;
        }
        ga3 ga3Var5 = ga3Var4 != null ? ga3Var4.d : null;
        while (true) {
            ga3 ga3Var6 = ga3Var4;
            ga3Var4 = ga3Var5;
            if (ga3Var4 == null) {
                return;
            }
            if (ga3Var4 == this) {
                if (ga3Var6 != null) {
                    ga3Var6.d = ga3Var4.d;
                }
                this.d = null;
                return;
            }
            ga3Var5 = ga3Var4.d;
        }
    }
}
