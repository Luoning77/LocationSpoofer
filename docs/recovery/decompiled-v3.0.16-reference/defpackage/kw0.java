package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kw0 {
    public final mw0 a;
    public Outline f;
    public float j;
    public vd0 k;
    public re l;
    public re m;
    public boolean n;
    public xv o;
    public je p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public xb0 b = am1.C;
    public qa1 c = qa1.e;
    public lu0 d = ik0.k;
    public final q9 e = new q9(this, 15);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ax r = new ax();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public kw0(mw0 mw0Var) {
        this.a = mw0Var;
        mw0Var.n(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            mw0 mw0Var = this.a;
            if (z || mw0Var.N() > 0.0f) {
                re reVar = this.l;
                if (reVar != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = reVar instanceof re;
                    if (!z2) {
                        b81.s("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = reVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                b81.s("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                b81.s("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = reVar;
                    if (outline != null) {
                        outline.setAlpha(mw0Var.s());
                        outline2 = outline;
                    }
                    mw0Var.z(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        mw0Var.n(false);
                        mw0Var.B();
                    } else {
                        mw0Var.n(this.w);
                    }
                } else {
                    mw0Var.n(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long J = mc0.J(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? J : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(mw0Var.s());
                    mw0Var.z(outline5, mc0.E(j3));
                }
            } else {
                mw0Var.n(false);
                mw0Var.z(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            ax axVar = this.r;
            kw0 kw0Var = (kw0) axVar.b;
            if (kw0Var != null) {
                kw0Var.q--;
                kw0Var.b();
                axVar.b = null;
            }
            ay1 ay1Var = (ay1) axVar.d;
            if (ay1Var != null) {
                Object[] objArr = ay1Var.b;
                long[] jArr = ay1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    kw0 kw0Var2 = (kw0) objArr[(i << 3) + i3];
                                    kw0Var2.q--;
                                    kw0Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                ay1Var.b();
            }
            this.a.B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(jg0 jg0Var) {
        ax axVar = this.r;
        axVar.c = (kw0) axVar.b;
        ay1 ay1Var = (ay1) axVar.d;
        if (ay1Var != null && ay1Var.h()) {
            ay1 ay1Var2 = (ay1) axVar.e;
            if (ay1Var2 == null) {
                ay1 ay1Var3 = in2.a;
                ay1Var2 = new ay1();
                axVar.e = ay1Var2;
            }
            ay1Var2.j(ay1Var);
            ay1Var.b();
        }
        axVar.a = true;
        this.d.invoke(jg0Var);
        axVar.a = false;
        kw0 kw0Var = (kw0) axVar.c;
        if (kw0Var != null) {
            kw0Var.q--;
            kw0Var.b();
        }
        ay1 ay1Var4 = (ay1) axVar.e;
        if (ay1Var4 == null || !ay1Var4.h()) {
            return;
        }
        Object[] objArr = ay1Var4.b;
        long[] jArr = ay1Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            kw0 kw0Var2 = (kw0) objArr[(i << 3) + i3];
                            kw0Var2.q--;
                            kw0Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ay1Var4.b();
    }

    public final vd0 d() {
        vd0 a42Var;
        vd0 vd0Var = this.k;
        re reVar = this.l;
        if (vd0Var != null) {
            return vd0Var;
        }
        if (reVar != null) {
            z32 z32Var = new z32(reVar);
            this.k = z32Var;
            return z32Var;
        }
        long J = mc0.J(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            J = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (J >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (J & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            a42Var = new b42(mh0.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            a42Var = new a42(new pe2(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = a42Var;
        return a42Var;
    }

    public final void e(xb0 xb0Var, qa1 qa1Var, long j, lu0 lu0Var) {
        boolean zB = p41.b(this.u, j);
        mw0 mw0Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            mw0Var.L((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = xb0Var;
        this.c = qa1Var;
        this.d = lu0Var;
        mw0Var.G(xb0Var, qa1Var, this, this.e);
    }

    public final void f(float f) {
        mw0 mw0Var = this.a;
        if (mw0Var.s() == f) {
            return;
        }
        mw0Var.d(f);
    }

    public final void g(t20 t20Var) {
        mw0 mw0Var = this.a;
        if (o51.f(mw0Var.x(), t20Var)) {
            return;
        }
        mw0Var.J(t20Var);
    }

    public final void h(long j, long j2, float f) {
        if (c12.b(this.h, j) && cw2.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
