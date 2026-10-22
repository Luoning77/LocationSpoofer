package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xp1 {
    public static final lz A;
    public static final float B;
    public static final lz C;
    public static final lz D;
    public static final float E;
    public static final float F;
    public static final float G;
    public static final cu2 H;
    public static final float I;
    public static final lz J;
    public static final lz K;
    public static final float L;
    public static final lz M;
    public static final lz N;
    public static final gt2 O;
    public static x01 P;
    public static x01 Q;
    public static volatile boolean a;
    public static final p10 g;
    public static final lz o;
    public static final float p;
    public static final lz q;
    public static final float r;
    public static final lz s;
    public static final float t;
    public static final lz u;
    public static final float v;
    public static final lz w;
    public static final lz x;
    public static final cu2 y;
    public static final float z;
    public static final u92 b = new u92(21);
    public static final p10 c = new p10(new s10(1), false, -231708773);
    public static final p10 d = new p10(new s10(24), false, 341054985);
    public static final p10 e = new p10(new s10(25), false, -1622050402);
    public static final p10 f = new p10(new s10(26), false, 1251108774);
    public static final p10 h = new p10(new c20(27), false, -250300778);
    public static final Object i = new Object();
    public static final StackTraceElement[] j = new StackTraceElement[0];
    public static final oh2 k = new oh2();
    public static final gt2 l = new gt2(0);
    public static final lz m = lz.p;
    public static final float n = 1.0f;

    static {
        int i2 = 12;
        g = new p10(new a20(i2), false, 1696572474);
        lz lzVar = lz.i;
        o = lzVar;
        p = 0.38f;
        q = lzVar;
        r = 0.12f;
        s = lzVar;
        t = 0.38f;
        lz lzVar2 = lz.s;
        u = lzVar2;
        v = 0.38f;
        w = lzVar2;
        x = lzVar;
        cu2 cu2Var = cu2.g;
        y = cu2Var;
        z = 28.0f;
        A = lz.f;
        B = 24.0f;
        C = lz.g;
        D = lz.m;
        E = 40.0f;
        F = 32.0f;
        G = 2.0f;
        H = cu2Var;
        I = 52.0f;
        lz lzVar3 = lz.k;
        J = lzVar3;
        K = lzVar3;
        L = 16.0f;
        M = lzVar2;
        N = lzVar2;
        O = new gt2(i2);
    }

    public static final dv1 A(dv1 dv1Var, ix1 ix1Var, boolean z2) {
        return dv1Var.d(z2 ? new ny0(ix1Var) : av1.a);
    }

    public static boolean B(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean C(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final void D(bj3 bj3Var, hb1 hb1Var) {
        long jH0 = hb1Var.K.c.h0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jH0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jH0 & 4294967295L)));
        bj3Var.layout(iRound, iRound2, bj3Var.getMeasuredWidth() + iRound, bj3Var.getMeasuredHeight() + iRound2);
    }

    public static final dv1 E(dv1 dv1Var, Object obj) {
        return dv1Var.d(new ta1(obj));
    }

    public static final long F(long j2, long j3, float f2) {
        m12 m12Var = qz.x;
        long jB = hz.b(j2, m12Var);
        long jB2 = hz.b(j3, m12Var);
        float fD = hz.d(jB);
        float fH = hz.h(jB);
        float fG = hz.g(jB);
        float fE = hz.e(jB);
        float fD2 = hz.d(jB2);
        float fH2 = hz.h(jB2);
        float fG2 = hz.g(jB2);
        float fE2 = hz.e(jB2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return hz.b(g(gh0.E(fH, fH2, f2), gh0.E(fG, fG2, f2), gh0.E(fE, fE2, f2), gh0.E(fD, fD2, f2), m12Var), hz.f(j3));
    }

    public static final dv1 G(f30 f30Var, dv1 dv1Var) {
        if (dv1Var.b(wa.B)) {
            return dv1Var;
        }
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.d0(1219399079);
        dv1 dv1Var2 = (dv1) dv1Var.a(av1.a, new x(ov0Var, 4));
        ov0Var.p(false);
        return dv1Var2;
    }

    public static final dv1 H(f30 f30Var, dv1 dv1Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.c0(439770924);
        dv1 dv1VarG = G(ov0Var, dv1Var);
        ov0Var.p(false);
        return dv1VarG;
    }

    public static final dv1 I(dz1 dz1Var) {
        return new ez1(dz1Var);
    }

    public static final cv1 J(gy1 gy1Var) {
        int i2;
        if (gy1Var == null || (i2 = gy1Var.g) == 0) {
            return null;
        }
        return (cv1) gy1Var.k(i2 - 1);
    }

    public static final void K(kb0 kb0Var) {
        ea eaVar;
        hb1 hb1VarO = O(kb0Var);
        if (hb1VarO.y || (eaVar = ((db) kb1.a(hb1VarO)).R) == null) {
            return;
        }
        eaVar.h.b.l(hb1VarO.f, new da(eaVar, hb1VarO));
    }

    public static final xz1 L(kb0 kb0Var, int i2) {
        xz1 xz1Var = ((cv1) kb0Var).e.l;
        xz1Var.getClass();
        if (xz1Var.t1() != kb0Var || !yz1.g(i2)) {
            return xz1Var;
        }
        xz1 xz1Var2 = xz1Var.v;
        xz1Var2.getClass();
        return xz1Var2;
    }

    public static final iw0 M(kb0 kb0Var) {
        return ((db) P(kb0Var)).getGraphicsContext();
    }

    public static final xz1 N(kb0 kb0Var) {
        if (!((cv1) kb0Var).e.r) {
            p21.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        xz1 xz1VarL = L(kb0Var, 2);
        if (!xz1VarL.t1().r) {
            p21.c("LayoutCoordinates is not attached.");
        }
        return xz1VarL;
    }

    public static final hb1 O(kb0 kb0Var) {
        xz1 xz1Var = ((cv1) kb0Var).e.l;
        if (xz1Var != null) {
            return xz1Var.s;
        }
        throw az2.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final t42 P(kb0 kb0Var) {
        t42 t42Var = O(kb0Var).s;
        if (t42Var != null) {
            return t42Var;
        }
        throw az2.e("This node does not have an owner.");
    }

    public static void Q(Exception exc) {
        if (a) {
            throw new iv(String.format("%s", exc));
        }
    }

    public static void R(String str, Throwable th) {
        if (a) {
            throw new iv(String.format("%s - %s", str, th));
        }
    }

    public static qg2 S(qg2 qg2Var) {
        if ((qg2Var != null ? qg2Var.k : null) == null) {
            return qg2Var;
        }
        pg2 pg2VarO = qg2Var.O();
        pg2VarO.g = null;
        return pg2VarO.a();
    }

    public static final int T(long j2) {
        float[] fArr = qz.a;
        return (int) (hz.b(j2, qz.e) >>> 32);
    }

    public static final void a(String str, int i2, lu0 lu0Var, lu0 lu0Var2, dv1 dv1Var, f30 f30Var, int i3) {
        dv1 dv1Var2;
        str.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2056608168);
        int i4 = i3 | (ov0Var.f(str) ? 4 : 2) | (ov0Var.d(i2) ? 32 : 16) | (ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(lu0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 24576;
        if (ov0Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z2 = (i4 & 112) == 32;
            Object objQ = ov0Var.Q();
            if (z2 || objQ == d30.a) {
                s52 s52Var = new s52(i2);
                ov0Var.m0(s52Var);
                objQ = s52Var;
            }
            s52 s52Var2 = (s52) objQ;
            int iG = (int) s52Var2.g();
            Double dR = r13.R(str);
            bj2 bj2VarA = cj2.a(16.0f);
            long jC = hz.c(0.35f, ((kz) ov0Var.j(mz.a)).r);
            av1 av1Var = av1.a;
            e33.a(iw2.e(av1Var, 1.0f), bj2VarA, jC, 0L, 0.0f, 0.0f, null, sb.a0(1008119091, new v9(str, lu0Var, s52Var2, lu0Var2, dR, iG), ov0Var), ov0Var, 12582912, 120);
            dv1Var2 = av1Var;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(str, i2, lu0Var, lu0Var2, dv1Var2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long b(float f2, float f3, float f4, float f5, oz ozVar) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (ozVar.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = hz.h;
            return j2;
        }
        if (((int) (ozVar.b >> 32)) != 3) {
            o21.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = ozVar.c;
        if (i25 == -1) {
            o21.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = ozVar.b(0);
        float fA3 = ozVar.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s2 = (short) i4;
                    fB = ozVar.b(1);
                    fA = ozVar.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                fB2 = ozVar.b(2);
                                fA2 = ozVar.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s4 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = hz.h;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s5 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s5)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = hz.h;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s6 = (short) i11;
                    fB2 = ozVar.b(2);
                    fA2 = ozVar.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s7 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = hz.h;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s8 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s8)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = hz.h;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s9 = (short) i4;
        fB = ozVar.b(1);
        fA = ozVar.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s10 = (short) i11;
                    fB2 = ozVar.b(2);
                    fA2 = ozVar.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s11 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = hz.h;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s12 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = hz.h;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s13 = (short) i11;
        fB2 = ozVar.b(2);
        fA2 = ozVar.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s14 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = hz.h;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s15 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = hz.h;
        return j10;
    }

    public static final long c(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = hz.h;
        return j2;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = hz.h;
        return j3;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final void f(AppInfoItem appInfoItem, String str, boolean z2, au0 au0Var, lu0 lu0Var, f30 f30Var, int i2) {
        au0Var.getClass();
        lu0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2097801663);
        int i3 = i2 | (ov0Var.h(appInfoItem) ? 4 : 2) | (ov0Var.f(str) ? 32 : 16) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(lu0Var) ? 16384 : 8192);
        if (ov0Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = ke0.H(str);
                ov0Var.m0(objQ);
            }
            sb.F(au0Var, new qc0(3), sb.a0(-1157049400, new w5(z2, au0Var, appInfoItem, am1.G(new w60("AUTO", ke0.N(2131624053, ov0Var), ke0.N(2131624378, ov0Var), ke0.N(2131624054, ov0Var)), new w60("WGS-84", ke0.N(2131625165, ov0Var), null, ke0.N(2131625164, ov0Var)), new w60("GCJ-02", ke0.N(2131624502, ov0Var), null, ke0.N(2131624501, ov0Var)), new w60("BD-09", ke0.N(2131624060, ov0Var), null, ke0.N(2131624059, ov0Var))), (ey1) objQ, lu0Var), ov0Var), ov0Var, 438, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new w4(appInfoItem, str, z2, au0Var, lu0Var, i2, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long g(float f2, float f3, float f4, float f5, oz ozVar) {
        int i2;
        int i3;
        int i4;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (ozVar.c()) {
            long j2 = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i19 = hz.h;
            return j2;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        int i20 = iFloatToRawIntBits3 >>> 31;
        int i21 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = 49;
        int i24 = 0;
        if (i21 == 255) {
            i3 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else {
                if (i2 > 0) {
                    int i25 = i22 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i25) + 1) | (i20 << 15);
                    } else {
                        i3 = i25;
                    }
                    short s2 = (short) i4;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i16 = i14 - 112;
                                    if (i16 < 31) {
                                        if (i16 <= 0) {
                                            i24 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                            } else {
                                                i23 = i16;
                                            }
                                        } else if (i16 >= -10) {
                                            i18 = (i15 | 8388608) >> (1 - i16);
                                            if ((i18 & 4096) != 0) {
                                                i18 += 8192;
                                            }
                                            i23 = 0;
                                            i24 = i18 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
                                    int i26 = hz.h;
                                    return jMax;
                                }
                                i24 = i15 == 0 ? 0 : 512;
                                i23 = 31;
                                i17 = (i13 << 15) | (i23 << 10) | i24;
                                long jMax2 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
                                int i27 = hz.h;
                                return jMax2;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s4 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
                        int i28 = hz.h;
                        return jMax3;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax4 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
                    int i29 = hz.h;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i30 = (i22 | 8388608) >> (1 - i2);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i3 = i30 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i20 << 15) | (i2 << 10);
        short s5 = (short) i4;
        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s6 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
                        int i210 = hz.h;
                        return jMax5;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax6 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
                    int i211 = hz.h;
                    return jMax6;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s7 = (short) i11;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i16 = i14 - 112;
            if (i16 < 31) {
                if (i16 <= 0) {
                    i24 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                    } else {
                        i23 = i16;
                    }
                } else if (i16 >= -10) {
                    i18 = (i15 | 8388608) >> (1 - i16);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i23 = 0;
                    i24 = i18 >> 13;
                } else {
                    i23 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
            int i212 = hz.h;
            return jMax7;
        }
        i24 = i15 == 0 ? 0 : 512;
        i23 = 31;
        i17 = (i13 << 15) | (i23 << 10) | i24;
        long jMax8 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ozVar.c) & 63);
        int i213 = hz.h;
        return jMax8;
    }

    public static final void h(gy1 gy1Var, cv1 cv1Var) {
        gy1 gy1VarY = O(cv1Var).y();
        int i2 = gy1VarY.g - 1;
        Object[] objArr = gy1VarY.e;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                gy1Var.b(((hb1) objArr[i2]).K.f);
                i2--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ya1 i(cv1 cv1Var) {
        if ((cv1Var.g & 2) != 0) {
            if (cv1Var instanceof ya1) {
                return (ya1) cv1Var;
            }
            if (cv1Var instanceof lb0) {
                cv1 cv1Var2 = ((lb0) cv1Var).t;
                while (cv1Var2 != 0) {
                    if (cv1Var2 instanceof ya1) {
                        return (ya1) cv1Var2;
                    }
                    cv1Var2 = (!(cv1Var2 instanceof lb0) || (cv1Var2.g & 2) == 0) ? cv1Var2.j : ((lb0) cv1Var2).t;
                }
            }
        }
        return null;
    }

    public static dv1 j(dv1 dv1Var, vf1 vf1Var) {
        return dv1Var.d(new gq(0L, vf1Var, o51.p0, 1));
    }

    public static final dv1 k(dv1 dv1Var, long j2, au2 au2Var) {
        return dv1Var.d(new gq(j2, null, au2Var, 2));
    }

    public static dv1 l(dv1 dv1Var, long j2) {
        return k(dv1Var, j2, o51.p0);
    }

    public static void m(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbR = p91.r(i2, "radix ", " was not in valid range ");
            sbR.append(new k41(2, 36, 1));
            throw new IllegalArgumentException(sbR.toString());
        }
    }

    public static final dv1 n(dv1 dv1Var, au2 au2Var) {
        return am1.B(dv1Var, 0.0f, au2Var, null, 518143);
    }

    public static final dv1 o(dv1 dv1Var) {
        return am1.B(dv1Var, 0.0f, null, null, 520191);
    }

    public static dv1 p(dv1 dv1Var, qu0 qu0Var) {
        return dv1Var.d(new b30(qu0Var));
    }

    public static final long q(long j2, long j3) {
        float f2;
        float f3;
        long jB = hz.b(j2, hz.f(j3));
        float fD = hz.d(j3);
        float fD2 = hz.d(jB);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = hz.h(jB);
        float fH2 = hz.h(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = hz.g(jB);
        float fG2 = hz.g(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = hz.e(jB);
        float fE2 = hz.e(j3);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return g(f2, f3, f6, f5, hz.f(j3));
    }

    public static final yi r(yi yiVar) {
        yi yiVarC = yiVar.c();
        int iB = yiVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            yiVarC.e(i2, yiVar.a(i2));
        }
        return yiVarC;
    }

    public static final dv1 s(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new eg0(lu0Var));
    }

    public static final void t(sw1 sw1Var, vv vvVar, st stVar, float f2, xt2 xt2Var, p63 p63Var, kg0 kg0Var) {
        vvVar.l();
        ArrayList arrayList = sw1Var.h;
        if (arrayList.size() <= 1 || (stVar instanceof qy2)) {
            u(sw1Var, vvVar, stVar, f2, xt2Var, p63Var, kg0Var);
        } else {
            if (!(stVar instanceof ut2)) {
                b81.d();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                l52 l52Var = (l52) arrayList.get(i2);
                fB += l52Var.a.b();
                fMax = Math.max(fMax, l52Var.a.d());
            }
            Shader shaderB = ((ut2) stVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                le leVar = ((l52) arrayList.get(i3)).a;
                leVar.g(vvVar, new tt(shaderB), f2, xt2Var, p63Var, kg0Var);
                vvVar.g(0.0f, leVar.b());
                matrix.setTranslate(0.0f, -leVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        vvVar.i();
    }

    public static final void u(sw1 sw1Var, vv vvVar, st stVar, float f2, xt2 xt2Var, p63 p63Var, kg0 kg0Var) {
        ArrayList arrayList = sw1Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l52 l52Var = (l52) arrayList.get(i2);
            l52Var.a.g(vvVar, stVar, f2, xt2Var, p63Var, kg0Var);
            vvVar.g(0.0f, l52Var.a.b());
        }
    }

    public static final dv1 v(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new mg0(lu0Var));
    }

    public static final dv1 w(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new ng0(lu0Var));
    }

    public static final boolean x(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final String y(double d2) {
        return d2 % 1.0d == 0.0d ? String.valueOf((long) d2) : String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
    }

    public static final Object z(zq1 zq1Var) {
        Object objA = zq1Var.A();
        ua1 ua1Var = objA instanceof ua1 ? (ua1) objA : null;
        if (ua1Var != null) {
            return ua1Var.s;
        }
        return null;
    }
}
