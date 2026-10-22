package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wo2 {
    public qo2 a;
    public o42 b;
    public ka0 c;
    public x32 d;
    public boolean e;
    public dz1 f;
    public final po2 g;
    public final lo2 h;
    public boolean i;
    public int j = 1;
    public ao2 k = jo2.b;
    public final uo2 l = new uo2(this);
    public final ge2 m = new ge2(this, 7);

    public wo2(qo2 qo2Var, o42 o42Var, ka0 ka0Var, x32 x32Var, boolean z, dz1 dz1Var, po2 po2Var, lo2 lo2Var) {
        this.a = qo2Var;
        this.b = o42Var;
        this.c = ka0Var;
        this.d = x32Var;
        this.e = z;
        this.f = dz1Var;
        this.g = po2Var;
        this.h = lo2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, r60 r60Var) {
        so2 so2Var;
        wo2 wo2Var;
        Throwable th;
        ve2 ve2Var;
        if (r60Var instanceof so2) {
            so2Var = (so2) r60Var;
            int i = so2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                so2Var.h = i - Integer.MIN_VALUE;
            } else {
                so2Var = new so2(this, r60Var);
            }
        } else {
            so2Var = new so2(this, r60Var);
        }
        Object obj = so2Var.f;
        int i2 = so2Var.h;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ve2Var = so2Var.e;
            try {
                ee0.J(obj);
                wo2Var = this;
                wo2Var.i = false;
                return new yh3(ve2Var.e);
            } catch (Throwable th2) {
                th = th2;
                wo2Var = this;
                wo2Var.i = false;
                throw th;
            }
        }
        ee0.J(obj);
        ve2 ve2Var2 = new ve2();
        ve2Var2.e = j;
        this.i = true;
        try {
            jy1 jy1Var = jy1.e;
            wo2Var = this;
            try {
                to2 to2Var = new to2(wo2Var, ve2Var2, j, null);
                so2Var.e = ve2Var2;
                so2Var.h = 1;
                Object objF = wo2Var.f(jy1Var, to2Var, so2Var);
                z70 z70Var = z70.e;
                if (objF == z70Var) {
                    return z70Var;
                }
                ve2Var = ve2Var2;
                wo2Var.i = false;
                return new yh3(ve2Var.e);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                wo2Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            wo2Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object b(long j, boolean z, k33 k33Var) {
        int i;
        long jA;
        o42 o42Var;
        z70 z70Var;
        Object objInvokeSuspend;
        mf3 mf3Var = mf3.a;
        if (z) {
            ka0 ka0Var = this.c;
            ym2 ym2Var = jo2.a;
            if (!(ka0Var instanceof ka0)) {
                if (this.d == x32.f) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = yh3.a(0.0f, 0.0f, i, j);
                vo2 vo2Var = new vo2(this, null);
                o42Var = this.b;
                z70Var = z70.e;
                if (o42Var == null && (this.a.c() || this.a.a())) {
                    Object objD = o42Var.d(jA, vo2Var, k33Var);
                    if (objD == z70Var) {
                        return objD;
                    }
                } else {
                    vo2 vo2Var2 = new vo2(this, k33Var);
                    vo2Var2.g = jA;
                    objInvokeSuspend = vo2Var2.invokeSuspend(mf3Var);
                    if (objInvokeSuspend == z70Var) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.d == x32.f) {
                i = 1;
            } else {
                i = 2;
            }
            jA = yh3.a(0.0f, 0.0f, i, j);
            vo2 vo2Var3 = new vo2(this, null);
            o42Var = this.b;
            z70Var = z70.e;
            if (o42Var == null) {
                vo2 vo2Var4 = new vo2(this, k33Var);
                vo2Var4.g = jA;
                objInvokeSuspend = vo2Var4.invokeSuspend(mf3Var);
                if (objInvokeSuspend == z70Var) {
                    return objInvokeSuspend;
                }
            } else {
                vo2 vo2Var5 = new vo2(this, k33Var);
                vo2Var5.g = jA;
                objInvokeSuspend = vo2Var5.invokeSuspend(mf3Var);
                if (objInvokeSuspend == z70Var) {
                    return objInvokeSuspend;
                }
            }
        }
        return mf3Var;
    }

    public final long c(ao2 ao2Var, long j, int i) {
        hz1 hz1Var = this.f.a;
        hz1 hz1VarN1 = hz1Var != null ? hz1Var.n1() : null;
        long jR0 = hz1VarN1 != null ? hz1VarN1.R0(i, j) : 0L;
        long jD = c12.d(j, jR0);
        long jE = e(h(ao2Var.a(g(e(this.d == x32.f ? c12.a(0.0f, 1, jD) : c12.a(0.0f, 2, jD))))));
        po2 po2Var = this.g;
        if (po2Var.r) {
            ViewTreeObserver viewTreeObserver = ((db) xp1.P(po2Var)).getViewTreeObserver();
            try {
                Method declaredMethod = db.W0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    db.W0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jD2 = c12.d(jD, jE);
        hz1 hz1Var2 = this.f.a;
        hz1 hz1VarN2 = hz1Var2 != null ? hz1Var2.n1() : null;
        return c12.e(c12.e(jR0, jE), hz1VarN2 != null ? hz1VarN2.i0(i, jE, jD2) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? c12.f(-1.0f, j) : j;
    }

    public final Object f(jy1 jy1Var, pu0 pu0Var, r60 r60Var) {
        Object objD = this.a.d(jy1Var, new m(this, pu0Var, null, 24), r60Var);
        return objD == z70.e ? objD : mf3.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == x32.f ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == x32.f) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        x32 x32Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (x32Var == x32.e) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (x32Var == x32.f) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
