package defpackage;

import android.content.res.Resources;
import android.view.View;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ik0 extends aa1 implements lu0 {
    public static final ik0 A;
    public static final ik0 B;
    public static final ik0 C;
    public static final ik0 D;
    public static final ik0 E;
    public static final ik0 F;
    public static final ik0 G;
    public static final ik0 H;
    public static final ik0 I;
    public static final ik0 J;
    public static final ik0 g;
    public static final ik0 h;
    public static final ik0 i;
    public static final ik0 j;
    public static final ik0 k;
    public static final ik0 l;
    public static final ik0 m;
    public static final ik0 n;
    public static final ik0 o;
    public static final ik0 p;
    public static final ik0 q;
    public static final ik0 r;
    public static final ik0 s;
    public static final ik0 t;
    public static final ik0 u;
    public static final ik0 v;
    public static final ik0 w;
    public static final ik0 x;
    public static final ik0 y;
    public static final ik0 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new ik0(i2, 0);
        h = new ik0(i2, 1);
        i = new ik0(i2, 2);
        j = new ik0(i2, 3);
        k = new ik0(i2, 4);
        l = new ik0(i2, 5);
        m = new ik0(i2, 6);
        n = new ik0(i2, 7);
        o = new ik0(i2, 8);
        p = new ik0(i2, 9);
        q = new ik0(i2, 10);
        r = new ik0(i2, 11);
        s = new ik0(i2, 12);
        t = new ik0(i2, 13);
        u = new ik0(i2, 14);
        v = new ik0(i2, 15);
        w = new ik0(i2, 16);
        x = new ik0(i2, 17);
        y = new ik0(i2, 18);
        z = new ik0(i2, 19);
        A = new ik0(i2, 20);
        B = new ik0(i2, 21);
        C = new ik0(i2, 22);
        D = new ik0(i2, 23);
        E = new ik0(i2, 24);
        F = new ik0(i2, 25);
        G = new ik0(i2, 26);
        H = new ik0(i2, 27);
        I = new ik0(i2, 28);
        J = new ik0(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik0(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x019d A[LOOP:0: B:101:0x0167->B:111:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x01a0 A[SYNTHETIC] */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) throws Throwable {
        int i2 = this.f;
        mf3 mf3Var = mf3.a;
        switch (i2) {
            case 0:
                long j2 = ((p41) obj).a;
                return new p41(0L);
            case 1:
                return kk0.c;
            case 2:
                return mf3Var;
            case 3:
                return mf3Var;
            case 4:
                return mf3Var;
            case Logger.WARN /* 5 */:
                jg0.c0((jg0) obj, hz.f, 0L, 0L, 0.0f, null, 0, 126);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                j82 j82Var = (j82) obj;
                if (j82Var.S()) {
                    ck1 ck1Var = j82Var.f;
                    if (!ck1Var.o) {
                        lu0 lu0VarD = j82Var.e.d();
                        zx1 zx1Var = ck1Var.r;
                        if (lu0VarD != null) {
                            ck1Var.R0(j82Var, 9223372034707292159L, 0L);
                            ck1Var.k = lu0VarD;
                        } else if (zx1Var != null) {
                            Object[] objArr = zx1Var.c;
                            long[] jArr = zx1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j3 = jArr[i3];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j3) < 128) {
                                                ck1Var.g1((ay1) objArr[(i3 << 3) + i5]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i4 == 8) {
                                            if (i3 != length) {
                                                i3++;
                                            }
                                        }
                                    } else if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                            zx1Var.a();
                        }
                    }
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                s42 s42Var = ((xz1) obj).R;
                if (s42Var != null) {
                    ((nw0) s42Var).c();
                }
                return mf3Var;
            case 8:
                xz1 xz1Var = (xz1) obj;
                hb1 hb1Var = xz1Var.s;
                try {
                    if (xz1Var.S()) {
                        xz1Var.T1(true);
                        break;
                    }
                    return mf3Var;
                } catch (Throwable th) {
                    hb1Var.Y(th);
                    throw null;
                }
            case mc0.b /* 9 */:
                a12 a12Var = (a12) obj;
                if (a12Var.S()) {
                    a12Var.e.f0();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                hb1 hb1Var2 = (hb1) obj;
                if (hb1Var2.G()) {
                    hb1Var2.U(false);
                }
                return mf3Var;
            case 11:
                hb1 hb1Var3 = (hb1) obj;
                if (hb1Var3.G()) {
                    hb1Var3.U(false);
                }
                return mf3Var;
            case mc0.d /* 12 */:
                hb1 hb1Var4 = (hb1) obj;
                if (hb1Var4.G()) {
                    hb1Var4.R(false);
                }
                return mf3Var;
            case 13:
                hb1 hb1Var5 = (hb1) obj;
                if (hb1Var5.G()) {
                    hb1Var5.R(false);
                }
                return mf3Var;
            case 14:
                hb1 hb1Var6 = (hb1) obj;
                if (hb1Var6.G()) {
                    hb1.T(hb1Var6, false, 7);
                }
                return mf3Var;
            case a83.e /* 15 */:
                hb1 hb1Var7 = (hb1) obj;
                if (hb1Var7.G()) {
                    hb1.V(hb1Var7, false, 7);
                }
                return mf3Var;
            case 16:
                hb1 hb1Var8 = (hb1) obj;
                if (hb1Var8.G()) {
                    hb1Var8.E();
                }
                return mf3Var;
            case 17:
                return mf3Var;
            case 18:
                ya2 ya2Var = (ya2) obj;
                if (ya2Var.isAttachedToWindow()) {
                    ya2Var.r();
                }
                return mf3Var;
            case 19:
                return mf3Var;
            case 20:
                return Integer.valueOf(((rn2) obj).b);
            case 21:
                return Integer.valueOf(((rn2) obj).c.b());
            case 22:
                return Boolean.valueOf(((ck0) obj) == ck0.f);
            case 23:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 24:
                return mf3Var;
            case 25:
                int i6 = ((b11) obj).a;
                return mf3Var;
            case 26:
                return mf3Var;
            case 27:
                int i7 = ((b11) obj).a;
                return mf3Var;
            case 28:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(2131230947);
                if (tag instanceof y12) {
                    return (y12) tag;
                }
                return null;
        }
    }
}
