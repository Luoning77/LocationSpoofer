package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sb implements w90, l30 {
    public static final p10 A;
    public static final p10 B;
    public static final p10 C;
    public static final p10 D;
    public static final p10 E;
    public static final p10 F;
    public static final p10 G;
    public static final p10 H;
    public static final p10 I;
    public static final p10 J;
    public static final lz K;
    public static final ke3 L;
    public static final lz M;
    public static final cu2 N;
    public static final lz O;
    public static final ke3 P;
    public static final lz Q;
    public static final ke3 R;
    public static final lz S;
    public static final t1 T;
    public static final lz U;
    public static final float V;
    public static final lz W;
    public static final float X;
    public static final lz Y;
    public static final float Z;
    public static final lz a0;
    public static final lz b0;
    public static final lz c;
    public static final lz c0;
    public static final lz d;
    public static final byte[] d0;
    public static final lz e;
    public static final byte[] e0;
    public static final lz f;
    public static final byte[] f0;
    public static final lz g;
    public static final byte[] g0;
    public static final Object[] h;
    public static final byte[] h0;
    public static final p10 i;
    public static final byte[] i0;
    public static final p10 j;
    public static final byte[] j0;
    public static final p10 k;
    public static final Object k0;
    public static final p10 l;
    public static final bf l0;
    public static final p10 m;
    public static x01 m0;
    public static final p10 n;
    public static final p10 o;
    public static final p10 p;
    public static final p10 q;
    public static final p10 r;
    public static final p10 s;
    public static final p10 t;
    public static final p10 u;
    public static final p10 v;
    public static final p10 w;
    public static final p10 x;
    public static final p10 y;
    public static final p10 z;
    public static final Type[] a = new Type[0];
    public static final lz b = lz.p;

    static {
        lz lzVar = lz.i;
        c = lzVar;
        d = lz.q;
        lz lzVar2 = lz.j;
        e = lzVar2;
        f = lzVar;
        g = lzVar2;
        h = new Object[0];
        int i2 = 17;
        i = new p10(new r10(i2), false, 892265647);
        int i3 = 15;
        j = new p10(new s10(i3), false, -1546379387);
        int i4 = 16;
        k = new p10(new s10(i4), false, -1651102448);
        l = new p10(new s10(i2), false, -1762379365);
        int i5 = 18;
        m = new p10(new s10(i5), false, 1273198839);
        n = new p10(new s10(9), false, -1144982215);
        o = new p10(new s10(10), false, 479237623);
        p = new p10(new r10(i5), false, -1850676398);
        q = new p10(new s10(11), false, 105653320);
        r = new p10(new s10(12), false, -1397444986);
        int i6 = 19;
        s = new p10(new r10(i6), false, -460411999);
        t = new p10(new s10(13), false, 1865851391);
        u = new p10(new s10(14), false, 497390781);
        v = new p10(new r10(20), false, -957040872);
        w = new p10(new r10(21), false, -1641271177);
        int i7 = 26;
        x = new p10(new r10(i7), false, 287108483);
        y = new p10(new r10(27), false, -1177536633);
        z = new p10(new a20(1), false, 1444620484);
        A = new p10(new a20(2), false, 1945148497);
        B = new p10(new a20(3), false, 1690584570);
        C = new p10(new c20(i3), false, 1040319385);
        D = new p10(new c20(i4), false, -1761413235);
        E = new p10(new c20(i2), false, -247146684);
        F = new p10(new c20(i5), false, 1180579595);
        G = new p10(new c20(i6), false, 750233322);
        int i8 = 29;
        H = new p10(new b20(i8), false, 1466349287);
        I = new p10(new d20(7), false, 525531382);
        J = new p10(new d20(8), false, -2123918173);
        K = lz.m;
        L = ke3.g;
        M = lz.r;
        N = cu2.e;
        O = lzVar;
        P = ke3.f;
        Q = lzVar2;
        R = ke3.e;
        S = lz.n;
        T = new t1(new c30(i8), i7);
        U = lzVar;
        V = 0.38f;
        W = lzVar;
        X = 0.38f;
        Y = lzVar;
        Z = 0.38f;
        a0 = lzVar;
        b0 = lzVar2;
        c0 = lzVar2;
        d0 = new byte[]{48, 49, 53, 0};
        e0 = new byte[]{48, 49, 48, 0};
        f0 = new byte[]{48, 48, 57, 0};
        g0 = new byte[]{48, 48, 53, 0};
        h0 = new byte[]{48, 48, 49, 0};
        i0 = new byte[]{48, 48, 49, 0};
        j0 = new byte[]{48, 48, 50, 0};
        k0 = new Object();
        l0 = new bf(1022);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0142  */
    /* JADX WARN: Code duplicated, block: B:103:0x0145  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x018b  */
    /* JADX WARN: Code duplicated, block: B:112:0x019b  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0133  */
    public static final void B(au0 au0Var, dv1 dv1Var, boolean z2, au2 au2Var, aw awVar, cw cwVar, is isVar, p10 p10Var, f30 f30Var, int i2, int i3) {
        int i4;
        dv1 dv1Var2;
        int i5;
        au2 au2Var2;
        aw awVarY;
        int i6;
        is isVar2;
        int i7;
        int i8;
        boolean z3;
        ov0 ov0Var;
        cw cwVar2;
        dv1 dv1Var3;
        boolean z4;
        ee2 ee2VarT;
        dv1 dv1Var4;
        au2 au2VarA;
        cw cwVarU;
        int i9;
        is isVar3;
        dv1 dv1Var5;
        is isVar4;
        boolean z5;
        Object objQ;
        long j2;
        long j3;
        int i10;
        int i11;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(2136075085);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var2.h(au0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                dv1Var2 = dv1Var;
                i4 |= ov0Var2.f(dv1Var2) ? 32 : 16;
            }
            i5 = i4 | 384;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    au2Var2 = au2Var;
                    if (ov0Var2.f(au2Var2)) {
                        i11 = 2048;
                    }
                    i5 |= i11;
                } else {
                    au2Var2 = au2Var;
                }
                i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i5 |= i11;
            } else {
                au2Var2 = au2Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    awVarY = awVar;
                    int i13 = ov0Var2.f(awVarY) ? 16384 : 8192;
                    i5 |= i13;
                } else {
                    awVarY = awVar;
                }
                i5 |= i13;
            } else {
                awVarY = awVar;
            }
            if ((196608 & i2) == 0) {
                i5 |= 65536;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                if ((1572864 & i2) == 0) {
                    isVar2 = isVar;
                    if (ov0Var2.f(isVar2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 12582912;
                if ((100663296 & i2) == 0) {
                    if (ov0Var2.h(p10Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i8 |= i10;
                }
                if ((38347923 & i8) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ov0Var2.T(i8 & 1, z3)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0 || ov0Var2.B()) {
                        if (i12 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 8) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var2);
                            i8 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            i8 &= -57345;
                            awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                        }
                        cwVarU = ym3.u(63, 0.0f);
                        i9 = i8 & (-458753);
                        if (i6 != 0) {
                            isVar3 = null;
                        } else {
                            isVar3 = isVar2;
                        }
                        dv1Var5 = dv1Var4;
                        isVar4 = isVar3;
                        z5 = true;
                    } else {
                        ov0Var2.W();
                        if ((i3 & 8) != 0) {
                            i8 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i8 &= -57345;
                        }
                        i9 = i8 & (-458753);
                        z5 = z2;
                        dv1Var5 = dv1Var2;
                        au2VarA = au2Var2;
                        isVar4 = isVar2;
                        cwVarU = cwVar;
                    }
                    ov0Var2.q();
                    ov0Var2.c0(1577885006);
                    objQ = ov0Var2.Q();
                    if (objQ == d30.a) {
                        objQ = new ix1();
                        ov0Var2.m0(objQ);
                    }
                    ix1 ix1Var = (ix1) objQ;
                    ov0Var2.p(false);
                    if (z5) {
                        j2 = awVarY.a;
                    } else {
                        j2 = awVarY.c;
                    }
                    if (z5) {
                        j3 = awVarY.b;
                    } else {
                        j3 = awVarY.d;
                    }
                    ov0Var = ov0Var2;
                    au2 au2Var3 = au2VarA;
                    e33.b(au0Var, dv1Var5, z5, au2Var3, j2, j3, ((td0) cwVarU.a(z5, ix1Var, ov0Var2, (i9 >> 6) & 14).getValue()).e, isVar4, ix1Var, a0(-1347531112, new fw(p10Var, 1), ov0Var2), ov0Var, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                    cwVar2 = cwVarU;
                    dv1Var3 = dv1Var5;
                    z4 = z5;
                    au2Var2 = au2Var3;
                    isVar2 = isVar4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    cwVar2 = cwVar;
                    dv1Var3 = dv1Var2;
                    z4 = z2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z4, au2Var2, awVarY, cwVar2, isVar2, p10Var, i2, i3);
                }
            }
            i5 |= 1572864;
            isVar2 = isVar;
            i8 = i5 | 12582912;
            if ((100663296 & i2) == 0) {
                if (ov0Var2.h(p10Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((38347923 & i8) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var2.T(i8 & 1, z3)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 8) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var2);
                        i8 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i8 &= -57345;
                        awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                    }
                    cwVarU = ym3.u(63, 0.0f);
                    i9 = i8 & (-458753);
                    if (i6 != 0) {
                        isVar3 = null;
                    } else {
                        isVar3 = isVar2;
                    }
                    dv1Var5 = dv1Var4;
                    isVar4 = isVar3;
                    z5 = true;
                } else {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 8) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var2);
                        i8 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i8 &= -57345;
                        awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                    }
                    cwVarU = ym3.u(63, 0.0f);
                    i9 = i8 & (-458753);
                    if (i6 != 0) {
                        isVar3 = null;
                    } else {
                        isVar3 = isVar2;
                    }
                    dv1Var5 = dv1Var4;
                    isVar4 = isVar3;
                    z5 = true;
                }
                ov0Var2.q();
                ov0Var2.c0(1577885006);
                objQ = ov0Var2.Q();
                if (objQ == d30.a) {
                    objQ = new ix1();
                    ov0Var2.m0(objQ);
                }
                ix1 ix1Var2 = (ix1) objQ;
                ov0Var2.p(false);
                if (z5) {
                    j2 = awVarY.a;
                } else {
                    j2 = awVarY.c;
                }
                if (z5) {
                    j3 = awVarY.b;
                } else {
                    j3 = awVarY.d;
                }
                ov0Var = ov0Var2;
                au2 au2Var4 = au2VarA;
                e33.b(au0Var, dv1Var5, z5, au2Var4, j2, j3, ((td0) cwVarU.a(z5, ix1Var2, ov0Var2, (i9 >> 6) & 14).getValue()).e, isVar4, ix1Var2, a0(-1347531112, new fw(p10Var, 1), ov0Var2), ov0Var, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                cwVar2 = cwVarU;
                dv1Var3 = dv1Var5;
                z4 = z5;
                au2Var2 = au2Var4;
                isVar2 = isVar4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                cwVar2 = cwVar;
                dv1Var3 = dv1Var2;
                z4 = z2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ou(au0Var, dv1Var3, z4, au2Var2, awVarY, cwVar2, isVar2, p10Var, i2, i3);
            }
        }
        i4 |= 48;
        dv1Var2 = dv1Var;
        i5 = i4 | 384;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                au2Var2 = au2Var;
                if (ov0Var2.f(au2Var2)) {
                    i11 = 2048;
                }
                i5 |= i11;
            } else {
                au2Var2 = au2Var;
            }
            i11 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i5 |= i11;
        } else {
            au2Var2 = au2Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                awVarY = awVar;
                if (ov0Var2.f(awVarY)) {
                }
                i5 |= i13;
            } else {
                awVarY = awVar;
            }
            i5 |= i13;
        } else {
            awVarY = awVar;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        i6 = i3 & 64;
        if (i6 != 0) {
            if ((1572864 & i2) == 0) {
                isVar2 = isVar;
                if (ov0Var2.f(isVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            i8 = i5 | 12582912;
            if ((100663296 & i2) == 0) {
                if (ov0Var2.h(p10Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((38347923 & i8) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var2.T(i8 & 1, z3)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 8) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var2);
                        i8 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i8 &= -57345;
                        awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                    }
                    cwVarU = ym3.u(63, 0.0f);
                    i9 = i8 & (-458753);
                    if (i6 != 0) {
                        isVar3 = null;
                    } else {
                        isVar3 = isVar2;
                    }
                    dv1Var5 = dv1Var4;
                    isVar4 = isVar3;
                    z5 = true;
                } else {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 8) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var2);
                        i8 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        i8 &= -57345;
                        awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                    }
                    cwVarU = ym3.u(63, 0.0f);
                    i9 = i8 & (-458753);
                    if (i6 != 0) {
                        isVar3 = null;
                    } else {
                        isVar3 = isVar2;
                    }
                    dv1Var5 = dv1Var4;
                    isVar4 = isVar3;
                    z5 = true;
                }
                ov0Var2.q();
                ov0Var2.c0(1577885006);
                objQ = ov0Var2.Q();
                if (objQ == d30.a) {
                    objQ = new ix1();
                    ov0Var2.m0(objQ);
                }
                ix1 ix1Var3 = (ix1) objQ;
                ov0Var2.p(false);
                if (z5) {
                    j2 = awVarY.a;
                } else {
                    j2 = awVarY.c;
                }
                if (z5) {
                    j3 = awVarY.b;
                } else {
                    j3 = awVarY.d;
                }
                ov0Var = ov0Var2;
                au2 au2Var5 = au2VarA;
                e33.b(au0Var, dv1Var5, z5, au2Var5, j2, j3, ((td0) cwVarU.a(z5, ix1Var3, ov0Var2, (i9 >> 6) & 14).getValue()).e, isVar4, ix1Var3, a0(-1347531112, new fw(p10Var, 1), ov0Var2), ov0Var, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                cwVar2 = cwVarU;
                dv1Var3 = dv1Var5;
                z4 = z5;
                au2Var2 = au2Var5;
                isVar2 = isVar4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                cwVar2 = cwVar;
                dv1Var3 = dv1Var2;
                z4 = z2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ou(au0Var, dv1Var3, z4, au2Var2, awVarY, cwVar2, isVar2, p10Var, i2, i3);
            }
        }
        i5 |= 1572864;
        isVar2 = isVar;
        i8 = i5 | 12582912;
        if ((100663296 & i2) == 0) {
            if (ov0Var2.h(p10Var)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i8 |= i10;
        }
        if ((38347923 & i8) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ov0Var2.T(i8 & 1, z3)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if ((i3 & 8) != 0) {
                    au2VarA = hu2.a(ym3.s, ov0Var2);
                    i8 &= -7169;
                } else {
                    au2VarA = au2Var2;
                }
                if ((i3 & 16) != 0) {
                    i8 &= -57345;
                    awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                }
                cwVarU = ym3.u(63, 0.0f);
                i9 = i8 & (-458753);
                if (i6 != 0) {
                    isVar3 = null;
                } else {
                    isVar3 = isVar2;
                }
                dv1Var5 = dv1Var4;
                isVar4 = isVar3;
                z5 = true;
            } else {
                if (i12 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if ((i3 & 8) != 0) {
                    au2VarA = hu2.a(ym3.s, ov0Var2);
                    i8 &= -7169;
                } else {
                    au2VarA = au2Var2;
                }
                if ((i3 & 16) != 0) {
                    i8 &= -57345;
                    awVarY = ym3.y((kz) ov0Var2.j(mz.a));
                }
                cwVarU = ym3.u(63, 0.0f);
                i9 = i8 & (-458753);
                if (i6 != 0) {
                    isVar3 = null;
                } else {
                    isVar3 = isVar2;
                }
                dv1Var5 = dv1Var4;
                isVar4 = isVar3;
                z5 = true;
            }
            ov0Var2.q();
            ov0Var2.c0(1577885006);
            objQ = ov0Var2.Q();
            if (objQ == d30.a) {
                objQ = new ix1();
                ov0Var2.m0(objQ);
            }
            ix1 ix1Var4 = (ix1) objQ;
            ov0Var2.p(false);
            if (z5) {
                j2 = awVarY.a;
            } else {
                j2 = awVarY.c;
            }
            if (z5) {
                j3 = awVarY.b;
            } else {
                j3 = awVarY.d;
            }
            ov0Var = ov0Var2;
            au2 au2Var6 = au2VarA;
            e33.b(au0Var, dv1Var5, z5, au2Var6, j2, j3, ((td0) cwVarU.a(z5, ix1Var4, ov0Var2, (i9 >> 6) & 14).getValue()).e, isVar4, ix1Var4, a0(-1347531112, new fw(p10Var, 1), ov0Var2), ov0Var, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
            cwVar2 = cwVarU;
            dv1Var3 = dv1Var5;
            z4 = z5;
            au2Var2 = au2Var6;
            isVar2 = isVar4;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            cwVar2 = cwVar;
            dv1Var3 = dv1Var2;
            z4 = z2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ou(au0Var, dv1Var3, z4, au2Var2, awVarY, cwVar2, isVar2, p10Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0125  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void C(dv1 dv1Var, au2 au2Var, aw awVar, cw cwVar, p10 p10Var, f30 f30Var, int i2, int i3) {
        dv1 dv1Var2;
        int i4;
        au2 au2Var2;
        aw awVar2;
        int i5;
        cw cwVar2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        dv1 dv1Var3;
        au2 au2Var3;
        aw awVar3;
        cw cwVar3;
        ee2 ee2VarT;
        dv1 dv1Var4;
        au2 au2VarA;
        aw awVarY;
        cw cwVarU;
        aw awVar4;
        cw cwVar4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1359693790);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            dv1Var2 = dv1Var;
        } else if ((i2 & 6) == 0) {
            dv1Var2 = dv1Var;
            i4 = i2 | (ov0Var.f(dv1Var2) ? 4 : 2);
        } else {
            dv1Var2 = dv1Var;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            au2Var2 = au2Var;
            int i10 = ov0Var.f(au2Var2) ? 32 : 16;
            int i11 = i4 | i10;
            if ((i3 & 4) == 0) {
                awVar2 = awVar;
                if (ov0Var.f(awVar2)) {
                    i5 = 256;
                }
                int i12 = i11 | i5;
                if ((i3 & 8) == 0) {
                    cwVar2 = cwVar;
                    if (ov0Var.f(cwVar2)) {
                        i6 = 2048;
                    }
                    i7 = i12 | i6 | 24576;
                    i8 = 0;
                    if ((74899 & i7) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (ov0Var.T(i7 & 1, z2)) {
                        ov0Var.Y();
                        if ((i2 & 1) != 0 || ov0Var.B()) {
                            if (i9 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if ((i3 & 2) != 0) {
                                au2VarA = hu2.a(ym3.s, ov0Var);
                                i7 &= -113;
                            } else {
                                au2VarA = au2Var2;
                            }
                            if ((i3 & 4) != 0) {
                                awVarY = ym3.y((kz) ov0Var.j(mz.a));
                                i7 &= -897;
                            } else {
                                awVarY = awVar2;
                            }
                            if ((i3 & 8) != 0) {
                                cwVarU = ym3.u(63, 0.0f);
                                i7 &= -7169;
                            } else {
                                cwVarU = cwVar2;
                            }
                            awVar4 = awVarY;
                            cwVar4 = cwVarU;
                        } else {
                            ov0Var.W();
                            if ((i3 & 2) != 0) {
                                i7 &= -113;
                            }
                            if ((i3 & 4) != 0) {
                                i7 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i7 &= -7169;
                            }
                            dv1Var4 = dv1Var2;
                            au2VarA = au2Var2;
                            awVar4 = awVar2;
                            cwVar4 = cwVar2;
                        }
                        ov0Var.q();
                        int i13 = i7;
                        e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i13 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i13 & 112) | (i13 & 14) | 12582912 | 1572864, 16);
                        dv1Var3 = dv1Var4;
                        au2Var3 = au2VarA;
                        awVar3 = awVar4;
                        cwVar3 = cwVar4;
                    } else {
                        ov0Var.W();
                        dv1Var3 = dv1Var2;
                        au2Var3 = au2Var2;
                        awVar3 = awVar2;
                        cwVar3 = cwVar2;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
                    }
                }
                cwVar2 = cwVar;
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i7 = i12 | i6 | 24576;
                i8 = 0;
                if ((74899 & i7) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ov0Var.T(i7 & 1, z2)) {
                    ov0Var.Y();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var);
                            i7 &= -113;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 4) != 0) {
                            awVarY = ym3.y((kz) ov0Var.j(mz.a));
                            i7 &= -897;
                        } else {
                            awVarY = awVar2;
                        }
                        if ((i3 & 8) != 0) {
                            cwVarU = ym3.u(63, 0.0f);
                            i7 &= -7169;
                        } else {
                            cwVarU = cwVar2;
                        }
                        awVar4 = awVarY;
                        cwVar4 = cwVarU;
                    } else {
                        if (i9 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var);
                            i7 &= -113;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 4) != 0) {
                            awVarY = ym3.y((kz) ov0Var.j(mz.a));
                            i7 &= -897;
                        } else {
                            awVarY = awVar2;
                        }
                        if ((i3 & 8) != 0) {
                            cwVarU = ym3.u(63, 0.0f);
                            i7 &= -7169;
                        } else {
                            cwVarU = cwVar2;
                        }
                        awVar4 = awVarY;
                        cwVar4 = cwVarU;
                    }
                    ov0Var.q();
                    int i14 = i7;
                    e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i14 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i14 & 112) | (i14 & 14) | 12582912 | 1572864, 16);
                    dv1Var3 = dv1Var4;
                    au2Var3 = au2VarA;
                    awVar3 = awVar4;
                    cwVar3 = cwVar4;
                } else {
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    au2Var3 = au2Var2;
                    awVar3 = awVar2;
                    cwVar3 = cwVar2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
                }
            }
            awVar2 = awVar;
            i5 = WorkQueueKt.BUFFER_CAPACITY;
            int i15 = i11 | i5;
            if ((i3 & 8) == 0) {
                cwVar2 = cwVar;
                if (ov0Var.f(cwVar2)) {
                    i6 = 2048;
                }
                i7 = i15 | i6 | 24576;
                i8 = 0;
                if ((74899 & i7) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ov0Var.T(i7 & 1, z2)) {
                    ov0Var.Y();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var);
                            i7 &= -113;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 4) != 0) {
                            awVarY = ym3.y((kz) ov0Var.j(mz.a));
                            i7 &= -897;
                        } else {
                            awVarY = awVar2;
                        }
                        if ((i3 & 8) != 0) {
                            cwVarU = ym3.u(63, 0.0f);
                            i7 &= -7169;
                        } else {
                            cwVarU = cwVar2;
                        }
                        awVar4 = awVarY;
                        cwVar4 = cwVarU;
                    } else {
                        if (i9 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var);
                            i7 &= -113;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 4) != 0) {
                            awVarY = ym3.y((kz) ov0Var.j(mz.a));
                            i7 &= -897;
                        } else {
                            awVarY = awVar2;
                        }
                        if ((i3 & 8) != 0) {
                            cwVarU = ym3.u(63, 0.0f);
                            i7 &= -7169;
                        } else {
                            cwVarU = cwVar2;
                        }
                        awVar4 = awVarY;
                        cwVar4 = cwVarU;
                    }
                    ov0Var.q();
                    int i16 = i7;
                    e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i16 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i16 & 112) | (i16 & 14) | 12582912 | 1572864, 16);
                    dv1Var3 = dv1Var4;
                    au2Var3 = au2VarA;
                    awVar3 = awVar4;
                    cwVar3 = cwVar4;
                } else {
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    au2Var3 = au2Var2;
                    awVar3 = awVar2;
                    cwVar3 = cwVar2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
                }
            }
            cwVar2 = cwVar;
            i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i7 = i15 | i6 | 24576;
            i8 = 0;
            if ((74899 & i7) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var.T(i7 & 1, z2)) {
                ov0Var.Y();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var);
                        i7 &= -113;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 4) != 0) {
                        awVarY = ym3.y((kz) ov0Var.j(mz.a));
                        i7 &= -897;
                    } else {
                        awVarY = awVar2;
                    }
                    if ((i3 & 8) != 0) {
                        cwVarU = ym3.u(63, 0.0f);
                        i7 &= -7169;
                    } else {
                        cwVarU = cwVar2;
                    }
                    awVar4 = awVarY;
                    cwVar4 = cwVarU;
                } else {
                    if (i9 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var);
                        i7 &= -113;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 4) != 0) {
                        awVarY = ym3.y((kz) ov0Var.j(mz.a));
                        i7 &= -897;
                    } else {
                        awVarY = awVar2;
                    }
                    if ((i3 & 8) != 0) {
                        cwVarU = ym3.u(63, 0.0f);
                        i7 &= -7169;
                    } else {
                        cwVarU = cwVar2;
                    }
                    awVar4 = awVarY;
                    cwVar4 = cwVarU;
                }
                ov0Var.q();
                int i17 = i7;
                e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i17 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i17 & 112) | (i17 & 14) | 12582912 | 1572864, 16);
                dv1Var3 = dv1Var4;
                au2Var3 = au2VarA;
                awVar3 = awVar4;
                cwVar3 = cwVar4;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var2;
                au2Var3 = au2Var2;
                awVar3 = awVar2;
                cwVar3 = cwVar2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
            }
        }
        au2Var2 = au2Var;
        int i18 = i4 | i10;
        if ((i3 & 4) == 0) {
            awVar2 = awVar;
            if (ov0Var.f(awVar2)) {
                i5 = 256;
            }
            int i19 = i18 | i5;
            if ((i3 & 8) == 0) {
                cwVar2 = cwVar;
                if (ov0Var.f(cwVar2)) {
                    i6 = 2048;
                }
                i7 = i19 | i6 | 24576;
                i8 = 0;
                if ((74899 & i7) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ov0Var.T(i7 & 1, z2)) {
                    ov0Var.Y();
                    if ((i2 & 1) != 0) {
                        if (i9 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var);
                            i7 &= -113;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 4) != 0) {
                            awVarY = ym3.y((kz) ov0Var.j(mz.a));
                            i7 &= -897;
                        } else {
                            awVarY = awVar2;
                        }
                        if ((i3 & 8) != 0) {
                            cwVarU = ym3.u(63, 0.0f);
                            i7 &= -7169;
                        } else {
                            cwVarU = cwVar2;
                        }
                        awVar4 = awVarY;
                        cwVar4 = cwVarU;
                    } else {
                        if (i9 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            au2VarA = hu2.a(ym3.s, ov0Var);
                            i7 &= -113;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 4) != 0) {
                            awVarY = ym3.y((kz) ov0Var.j(mz.a));
                            i7 &= -897;
                        } else {
                            awVarY = awVar2;
                        }
                        if ((i3 & 8) != 0) {
                            cwVarU = ym3.u(63, 0.0f);
                            i7 &= -7169;
                        } else {
                            cwVarU = cwVar2;
                        }
                        awVar4 = awVarY;
                        cwVar4 = cwVarU;
                    }
                    ov0Var.q();
                    int i110 = i7;
                    e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i110 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i110 & 112) | (i110 & 14) | 12582912 | 1572864, 16);
                    dv1Var3 = dv1Var4;
                    au2Var3 = au2VarA;
                    awVar3 = awVar4;
                    cwVar3 = cwVar4;
                } else {
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    au2Var3 = au2Var2;
                    awVar3 = awVar2;
                    cwVar3 = cwVar2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
                }
            }
            cwVar2 = cwVar;
            i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i7 = i19 | i6 | 24576;
            i8 = 0;
            if ((74899 & i7) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var.T(i7 & 1, z2)) {
                ov0Var.Y();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var);
                        i7 &= -113;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 4) != 0) {
                        awVarY = ym3.y((kz) ov0Var.j(mz.a));
                        i7 &= -897;
                    } else {
                        awVarY = awVar2;
                    }
                    if ((i3 & 8) != 0) {
                        cwVarU = ym3.u(63, 0.0f);
                        i7 &= -7169;
                    } else {
                        cwVarU = cwVar2;
                    }
                    awVar4 = awVarY;
                    cwVar4 = cwVarU;
                } else {
                    if (i9 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var);
                        i7 &= -113;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 4) != 0) {
                        awVarY = ym3.y((kz) ov0Var.j(mz.a));
                        i7 &= -897;
                    } else {
                        awVarY = awVar2;
                    }
                    if ((i3 & 8) != 0) {
                        cwVarU = ym3.u(63, 0.0f);
                        i7 &= -7169;
                    } else {
                        cwVarU = cwVar2;
                    }
                    awVar4 = awVarY;
                    cwVar4 = cwVarU;
                }
                ov0Var.q();
                int i111 = i7;
                e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i111 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i111 & 112) | (i111 & 14) | 12582912 | 1572864, 16);
                dv1Var3 = dv1Var4;
                au2Var3 = au2VarA;
                awVar3 = awVar4;
                cwVar3 = cwVar4;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var2;
                au2Var3 = au2Var2;
                awVar3 = awVar2;
                cwVar3 = cwVar2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
            }
        }
        awVar2 = awVar;
        i5 = WorkQueueKt.BUFFER_CAPACITY;
        int i112 = i18 | i5;
        if ((i3 & 8) == 0) {
            cwVar2 = cwVar;
            if (ov0Var.f(cwVar2)) {
                i6 = 2048;
            }
            i7 = i112 | i6 | 24576;
            i8 = 0;
            if ((74899 & i7) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var.T(i7 & 1, z2)) {
                ov0Var.Y();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var);
                        i7 &= -113;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 4) != 0) {
                        awVarY = ym3.y((kz) ov0Var.j(mz.a));
                        i7 &= -897;
                    } else {
                        awVarY = awVar2;
                    }
                    if ((i3 & 8) != 0) {
                        cwVarU = ym3.u(63, 0.0f);
                        i7 &= -7169;
                    } else {
                        cwVarU = cwVar2;
                    }
                    awVar4 = awVarY;
                    cwVar4 = cwVarU;
                } else {
                    if (i9 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        au2VarA = hu2.a(ym3.s, ov0Var);
                        i7 &= -113;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 4) != 0) {
                        awVarY = ym3.y((kz) ov0Var.j(mz.a));
                        i7 &= -897;
                    } else {
                        awVarY = awVar2;
                    }
                    if ((i3 & 8) != 0) {
                        cwVarU = ym3.u(63, 0.0f);
                        i7 &= -7169;
                    } else {
                        cwVarU = cwVar2;
                    }
                    awVar4 = awVarY;
                    cwVar4 = cwVarU;
                }
                ov0Var.q();
                int i113 = i7;
                e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i113 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i113 & 112) | (i113 & 14) | 12582912 | 1572864, 16);
                dv1Var3 = dv1Var4;
                au2Var3 = au2VarA;
                awVar3 = awVar4;
                cwVar3 = cwVar4;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var2;
                au2Var3 = au2Var2;
                awVar3 = awVar2;
                cwVar3 = cwVar2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
            }
        }
        cwVar2 = cwVar;
        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        i7 = i112 | i6 | 24576;
        i8 = 0;
        if ((74899 & i7) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ov0Var.T(i7 & 1, z2)) {
            ov0Var.Y();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if ((i3 & 2) != 0) {
                    au2VarA = hu2.a(ym3.s, ov0Var);
                    i7 &= -113;
                } else {
                    au2VarA = au2Var2;
                }
                if ((i3 & 4) != 0) {
                    awVarY = ym3.y((kz) ov0Var.j(mz.a));
                    i7 &= -897;
                } else {
                    awVarY = awVar2;
                }
                if ((i3 & 8) != 0) {
                    cwVarU = ym3.u(63, 0.0f);
                    i7 &= -7169;
                } else {
                    cwVarU = cwVar2;
                }
                awVar4 = awVarY;
                cwVar4 = cwVarU;
            } else {
                if (i9 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if ((i3 & 2) != 0) {
                    au2VarA = hu2.a(ym3.s, ov0Var);
                    i7 &= -113;
                } else {
                    au2VarA = au2Var2;
                }
                if ((i3 & 4) != 0) {
                    awVarY = ym3.y((kz) ov0Var.j(mz.a));
                    i7 &= -897;
                } else {
                    awVarY = awVar2;
                }
                if ((i3 & 8) != 0) {
                    cwVarU = ym3.u(63, 0.0f);
                    i7 &= -7169;
                } else {
                    cwVarU = cwVar2;
                }
                awVar4 = awVarY;
                cwVar4 = cwVarU;
            }
            ov0Var.q();
            int i114 = i7;
            e33.a(dv1Var4, au2VarA, awVar4.a, awVar4.b, 0.0f, ((td0) cwVar4.a(true, null, ov0Var, ((i114 >> 3) & 896) | 54).getValue()).e, null, a0(-97109725, new fw(p10Var, i8), ov0Var), ov0Var, (i114 & 112) | (i114 & 14) | 12582912 | 1572864, 16);
            dv1Var3 = dv1Var4;
            au2Var3 = au2VarA;
            awVar3 = awVar4;
            cwVar3 = cwVar4;
        } else {
            ov0Var.W();
            dv1Var3 = dv1Var2;
            au2Var3 = au2Var2;
            awVar3 = awVar2;
            cwVar3 = cwVar2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ln(dv1Var3, au2Var3, awVar3, cwVar3, p10Var, i2, i3, 1);
        }
    }

    public static final void D(ul1 ul1Var, AppState appState, lr2 lr2Var, dv1 dv1Var, f30 f30Var, int i2) {
        ul1Var.getClass();
        appState.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(343511062);
        int i3 = i2 | (ov0Var.h(ul1Var) ? 4 : 2) | (ov0Var.h(appState) ? 32 : 16) | (ov0Var.f(lr2Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(dv1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            e33.a(iw2.e(dv1Var, 0.92f), cj2.a(20.0f), 0L, 0L, 6.0f, 0.0f, null, a0(323590107, new p2(4, appState, ul1Var, lr2Var, appState.isContinuousScanning() || appState.isStoppingCollection()), ov0Var), ov0Var, 12607488, 108);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lr1(ul1Var, appState, lr2Var, dv1Var, i2, 4);
        }
    }

    public static final void E(String str, String str2, boolean z2, au0 au0Var, pu0 pu0Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        str.getClass();
        str2.getClass();
        au0Var.getClass();
        pu0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-219877453);
        int i3 = i2 | (ov0Var2.f(str) ? 4 : 2) | (ov0Var2.f(str2) ? 32 : 16) | (ov0Var2.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.h(pu0Var) ? 16384 : 8192);
        if (ov0Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H(str);
                ov0Var2.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                objQ2 = ke0.H(str2);
                ov0Var2.m0(objQ2);
            }
            final ey1 ey1Var2 = (ey1) objQ2;
            long j2 = z2 ? bk.c : bk.f;
            final Context context = (Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b);
            final Configuration configuration = (Configuration) ov0Var2.j(AndroidCompositionLocals_androidKt.a);
            final long j3 = j2;
            ov0Var = ov0Var2;
            xq1.a(au0Var, a0(-1171767189, new j3(context, configuration, pu0Var, ey1Var, ey1Var2), ov0Var2), ji2.H(av1.a), a0(-1861598679, new q80(context, configuration, au0Var, j3), ov0Var2), a0(1743537127, new j2(8, context, configuration), ov0Var2), a0(1398621382, new pu0() { // from class: r80
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        k22.c(new kk[]{AndroidCompositionLocals_androidKt.b.a(context), AndroidCompositionLocals_androidKt.a.a(configuration)}, sb.a0(240756742, new cc(j3, ey1Var2, ey1Var), ov0Var3), ov0Var3, 56);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).p, 0L, 0L, 0L, null, ov0Var, ((i3 >> 9) & 14) | 1772592, 16016);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new w4(str, str2, z2, au0Var, pu0Var, i2, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void F(au0 au0Var, qc0 qc0Var, p10 p10Var, f30 f30Var, int i2, int i3) {
        int i4;
        qc0 qc0Var2;
        int i5;
        int i6;
        boolean z2;
        qc0 qc0Var3;
        ee2 ee2VarT;
        View view;
        xb0 xb0Var;
        qa1 qa1Var;
        mv0 mv0VarY;
        ey1 ey1VarL;
        Object objQ;
        c30 c30Var;
        Object obj;
        UUID uuid;
        boolean zD;
        Object objQ2;
        sc0 sc0Var;
        boolean zH;
        int i7;
        Object obj2;
        int i8;
        int i9;
        Object obj3;
        int i10;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(826668973);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var.h(au0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                qc0Var2 = qc0Var;
                i4 |= ov0Var.f(qc0Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (ov0Var.h(p10Var)) {
                    i10 = 256;
                } else {
                    i10 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i4 |= i10;
            }
            i5 = i4;
            i6 = 1;
            if ((i5 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var.T(i5 & 1, z2)) {
                if (i11 != 0) {
                    qc0Var3 = new qc0(7);
                } else {
                    qc0Var3 = qc0Var2;
                }
                view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
                xb0Var = (xb0) ov0Var.j(z30.h);
                qa1Var = (qa1) ov0Var.j(z30.n);
                mv0VarY = ks.Y(ov0Var);
                ey1VarL = ke0.L(p10Var, ov0Var);
                Object[] objArr = new Object[0];
                objQ = ov0Var.Q();
                c30Var = d30.a;
                obj = objQ;
                if (objQ == c30Var) {
                    c8 c8Var = c8.n;
                    ov0Var.m0(c8Var);
                    obj = c8Var;
                }
                uuid = (UUID) wc0.c0(objArr, (au0) obj, ov0Var, 48);
                zD = ov0Var.d(qc0Var3.g) | ov0Var.f(view) | ov0Var.f(xb0Var) | ov0Var.f(null);
                objQ2 = ov0Var.Q();
                if (zD || objQ2 == c30Var) {
                    sc0 sc0Var2 = new sc0(au0Var, qc0Var3, view, qa1Var, xb0Var, uuid);
                    p10 p10Var2 = new p10(new x(ey1VarL, i6), true, -1338939603);
                    pc0 pc0Var = sc0Var2.k;
                    pc0Var.setParentCompositionContext(mv0VarY);
                    pc0Var.o.setValue(p10Var2);
                    pc0Var.s = true;
                    pc0Var.d();
                    ov0Var.m0(sc0Var2);
                    objQ2 = sc0Var2;
                }
                sc0Var = (sc0) objQ2;
                zH = ov0Var.h(sc0Var);
                Object objQ3 = ov0Var.Q();
                if (!zH || objQ3 == c30Var) {
                    i7 = 0;
                    hc hcVar = new hc(sc0Var, i7);
                    ov0Var.m0(hcVar);
                    obj2 = hcVar;
                } else {
                    i7 = 0;
                    obj2 = objQ3;
                }
                oi0.a(sc0Var, (lu0) obj2, ov0Var);
                boolean zH2 = ov0Var.h(sc0Var);
                if ((i5 & 14) == 4) {
                    i8 = 1;
                } else {
                    i8 = i7;
                }
                i9 = (zH2 ? 1 : 0) | i8 | ((i5 & 112) != 32 ? i7 : 1) | (ov0Var.d(qa1Var.ordinal()) ? 1 : 0);
                Object objQ4 = ov0Var.Q();
                obj3 = objQ4;
                if (i9 == 0 || objQ4 == c30Var) {
                    ic icVar = new ic(sc0Var, au0Var, qc0Var3, qa1Var);
                    ov0Var.m0(icVar);
                    obj3 = icVar;
                }
                oi0.i((au0) obj3, ov0Var);
            } else {
                ov0Var.W();
                qc0Var3 = qc0Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new jc(au0Var, qc0Var3, p10Var, i2, i3, 0);
            }
        }
        i4 |= 48;
        qc0Var2 = qc0Var;
        if ((i2 & 384) == 0) {
            if (ov0Var.h(p10Var)) {
                i10 = 256;
            } else {
                i10 = WorkQueueKt.BUFFER_CAPACITY;
            }
            i4 |= i10;
        }
        i5 = i4;
        i6 = 1;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ov0Var.T(i5 & 1, z2)) {
            if (i11 != 0) {
                qc0Var3 = new qc0(7);
            } else {
                qc0Var3 = qc0Var2;
            }
            view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
            xb0Var = (xb0) ov0Var.j(z30.h);
            qa1Var = (qa1) ov0Var.j(z30.n);
            mv0VarY = ks.Y(ov0Var);
            ey1VarL = ke0.L(p10Var, ov0Var);
            Object[] objArr2 = new Object[0];
            objQ = ov0Var.Q();
            c30Var = d30.a;
            obj = objQ;
            if (objQ == c30Var) {
                c8 c8Var2 = c8.n;
                ov0Var.m0(c8Var2);
                obj = c8Var2;
            }
            uuid = (UUID) wc0.c0(objArr2, (au0) obj, ov0Var, 48);
            zD = ov0Var.d(qc0Var3.g) | ov0Var.f(view) | ov0Var.f(xb0Var) | ov0Var.f(null);
            objQ2 = ov0Var.Q();
            if (zD) {
                sc0 sc0Var3 = new sc0(au0Var, qc0Var3, view, qa1Var, xb0Var, uuid);
                p10 p10Var3 = new p10(new x(ey1VarL, i6), true, -1338939603);
                pc0 pc0Var2 = sc0Var3.k;
                pc0Var2.setParentCompositionContext(mv0VarY);
                pc0Var2.o.setValue(p10Var3);
                pc0Var2.s = true;
                pc0Var2.d();
                ov0Var.m0(sc0Var3);
                objQ2 = sc0Var3;
            } else {
                sc0 sc0Var4 = new sc0(au0Var, qc0Var3, view, qa1Var, xb0Var, uuid);
                p10 p10Var4 = new p10(new x(ey1VarL, i6), true, -1338939603);
                pc0 pc0Var3 = sc0Var4.k;
                pc0Var3.setParentCompositionContext(mv0VarY);
                pc0Var3.o.setValue(p10Var4);
                pc0Var3.s = true;
                pc0Var3.d();
                ov0Var.m0(sc0Var4);
                objQ2 = sc0Var4;
            }
            sc0Var = (sc0) objQ2;
            zH = ov0Var.h(sc0Var);
            Object objQ5 = ov0Var.Q();
            if (zH) {
                i7 = 0;
                hc hcVar2 = new hc(sc0Var, i7);
                ov0Var.m0(hcVar2);
                obj2 = hcVar2;
            } else {
                i7 = 0;
                hc hcVar3 = new hc(sc0Var, i7);
                ov0Var.m0(hcVar3);
                obj2 = hcVar3;
            }
            oi0.a(sc0Var, (lu0) obj2, ov0Var);
            boolean zH3 = ov0Var.h(sc0Var);
            if ((i5 & 14) == 4) {
                i8 = 1;
            } else {
                i8 = i7;
            }
            i9 = (zH3 ? 1 : 0) | i8 | ((i5 & 112) != 32 ? i7 : 1) | (ov0Var.d(qa1Var.ordinal()) ? 1 : 0);
            Object objQ6 = ov0Var.Q();
            obj3 = objQ6;
            if (i9 == 0) {
                ic icVar2 = new ic(sc0Var, au0Var, qc0Var3, qa1Var);
                ov0Var.m0(icVar2);
                obj3 = icVar2;
            } else {
                ic icVar3 = new ic(sc0Var, au0Var, qc0Var3, qa1Var);
                ov0Var.m0(icVar3);
                obj3 = icVar3;
            }
            oi0.i((au0) obj3, ov0Var);
        } else {
            ov0Var.W();
            qc0Var3 = qc0Var2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new jc(au0Var, qc0Var3, p10Var, i2, i3, 0);
        }
    }

    public static final void G(dv1 dv1Var, pu0 pu0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1090521195);
        int i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2 | (ov0Var.h(pu0Var) ? 32 : 16);
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = lc.b;
                ov0Var.m0(objQ);
            }
            er1 er1Var = (er1) objQ;
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1Var);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            pu0Var.invoke(ov0Var, Integer.valueOf((i5 >> 6) & 14));
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new mc(dv1Var, pu0Var, i2, i4);
        }
    }

    public static final void H(au0 au0Var, qc0 qc0Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1845867925);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(au0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.f(qc0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(p10Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            F(au0Var, qc0Var, a0(-1908750910, new f5((Context) ov0Var.j(AndroidCompositionLocals_androidKt.b), (Configuration) ov0Var.j(AndroidCompositionLocals_androidKt.a), p10Var, i4), ov0Var), ov0Var, (i3 & 14) | 384 | (i3 & 112), 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(au0Var, qc0Var, p10Var, i2, 5);
        }
    }

    public static final int I(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static Type J(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(J(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void K(Type type) {
        da0.p(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static final Object L(yy2 yy2Var, int i2) {
        Object obj;
        yy2Var.getClass();
        int iX = xq1.x(yy2Var.g, i2, yy2Var.e);
        if (iX < 0 || (obj = yy2Var.f[iX]) == k0) {
            return null;
        }
        return obj;
    }

    public static final boolean M(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = O(file2) && z2;
        }
        return z2;
    }

    public static final float P(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static boolean Q(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return Q(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final l81 R(bt2 bt2Var) {
        bt2Var.getClass();
        if (bt2Var instanceof ct2) {
            return R(((ct2) bt2Var).a);
        }
        return null;
    }

    public static final x01 S() {
        x01 x01Var = m0;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(9.29f, 6.71f);
        nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0VarI.k(13.17f, 12.0f);
        nx0VarI.l(-3.88f, 3.88f);
        nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0VarI.l(4.59f, -4.59f);
        nx0VarI.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0VarI.k(10.7f, 6.7f);
        nx0VarI.g(-0.38f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        m0 = x01VarB;
        return x01VarB;
    }

    public static Type T(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return T(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return T(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Object U(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return q1.c(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (r7.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Class V(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            da0.p(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) V(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return V(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static final int W(vo voVar, Object obj, int i2) {
        int i3 = voVar.g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iX = xq1.x(i3, i2, voVar.e);
            if (iX < 0 || o51.f(obj, voVar.f[iX])) {
                return iX;
            }
            int i4 = iX + 1;
            while (i4 < i3 && voVar.e[i4] == i2) {
                if (o51.f(obj, voVar.f[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iX - 1; i5 >= 0 && voVar.e[i5] == i2; i5--) {
                if (o51.f(obj, voVar.f[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final dv1 X(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new cp0(lu0Var));
    }

    public static dv1 Y(dv1 dv1Var, f52 f52Var, l9 l9Var, c30 c30Var, rr rrVar, int i2) {
        if ((i2 & 4) != 0) {
            l9Var = j9.j;
        }
        return dv1Var.d(new g52(f52Var, l9Var, c30Var, 1.0f, rrVar));
    }

    public static final void Z(float[] fArr, float[] fArr2) {
        float fP = P(fArr2, 0, fArr, 0);
        float fP2 = P(fArr2, 0, fArr, 1);
        float fP3 = P(fArr2, 0, fArr, 2);
        float fP4 = P(fArr2, 0, fArr, 3);
        float fP5 = P(fArr2, 1, fArr, 0);
        float fP6 = P(fArr2, 1, fArr, 1);
        float fP7 = P(fArr2, 1, fArr, 2);
        float fP8 = P(fArr2, 1, fArr, 3);
        float fP9 = P(fArr2, 2, fArr, 0);
        float fP10 = P(fArr2, 2, fArr, 1);
        float fP11 = P(fArr2, 2, fArr, 2);
        float fP12 = P(fArr2, 2, fArr, 3);
        float fP13 = P(fArr2, 3, fArr, 0);
        float fP14 = P(fArr2, 3, fArr, 1);
        float fP15 = P(fArr2, 3, fArr, 2);
        float fP16 = P(fArr2, 3, fArr, 3);
        fArr[0] = fP;
        fArr[1] = fP2;
        fArr[2] = fP3;
        fArr[3] = fP4;
        fArr[4] = fP5;
        fArr[5] = fP6;
        fArr[6] = fP7;
        fArr[7] = fP8;
        fArr[8] = fP9;
        fArr[9] = fP10;
        fArr[10] = fP11;
        fArr[11] = fP12;
        fArr[12] = fP13;
        fArr[13] = fP14;
        fArr[14] = fP15;
        fArr[15] = fP16;
    }

    public static final p10 a0(int i2, xu0 xu0Var, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (objQ == d30.a) {
            objQ = new p10(xu0Var, true, i2);
            ov0Var.m0(objQ);
        }
        p10 p10Var = (p10) objQ;
        if (!o51.f(p10Var.g, xu0Var)) {
            boolean z2 = p10Var.g == null;
            p10Var.g = xu0Var;
            if (!z2 && p10Var.f) {
                ee2 ee2Var = p10Var.h;
                if (ee2Var != null) {
                    t30 t30Var = ee2Var.a;
                    if (t30Var != null) {
                        t30Var.s(ee2Var, null);
                    }
                    p10Var.h = null;
                }
                ArrayList arrayList = p10Var.i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ee2 ee2Var2 = (ee2) arrayList.get(i3);
                        t30 t30Var2 = ee2Var2.a;
                        if (t30Var2 != null) {
                            t30Var2.s(ee2Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return p10Var;
    }

    public static final no1 b0(u7 u7Var, lu0 lu0Var, f30 f30Var) {
        u7 u7Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.d0(-1408504823);
        ke0.L(u7Var, ov0Var);
        ey1 ey1VarL = ke0.L(lu0Var, ov0Var);
        String str = (String) wc0.e0(new Object[0], null, c8.h, ov0Var, 3072, 6);
        hh0 hh0Var = ch1.a;
        ov0Var.d0(1418020823);
        j8 j8Var = (j8) ov0Var.j(ch1.a);
        if (j8Var == null) {
            Object baseContext = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof j8) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            j8Var = (j8) baseContext;
        }
        ov0Var.p(false);
        if (j8Var == null) {
            fo.n("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        f8 activityResultRegistry = j8Var.getActivityResultRegistry();
        ov0Var.d0(-1672765924);
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = new y7();
            ov0Var.m0(objQ);
        }
        y7 y7Var = (y7) objQ;
        ov0Var.p(false);
        ov0Var.d0(-1672765850);
        Object objQ2 = ov0Var.Q();
        if (objQ2 == c30Var) {
            objQ2 = new no1(y7Var);
            ov0Var.m0(objQ2);
        }
        no1 no1Var = (no1) objQ2;
        ov0Var.p(false);
        ov0Var.d0(-1672765582);
        boolean zF = ov0Var.f(y7Var) | ov0Var.f(activityResultRegistry) | ov0Var.f(str) | ov0Var.f(u7Var) | ov0Var.f(ey1VarL);
        Object objQ3 = ov0Var.Q();
        if (zF || objQ3 == c30Var) {
            u7Var2 = u7Var;
            i8 i8Var = new i8(y7Var, activityResultRegistry, str, u7Var2, ey1VarL);
            ov0Var.m0(i8Var);
            objQ3 = i8Var;
        } else {
            u7Var2 = u7Var;
        }
        ov0Var.p(false);
        oi0.c(activityResultRegistry, str, u7Var2, (lu0) objQ3, ov0Var);
        ov0Var.p(false);
        return no1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type c0(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeC0;
        Type[] upperBounds2;
        Type typeC1;
        Type[] lowerBounds2;
        Type typeC2;
        boolean z2;
        Type[] actualTypeArguments;
        int length;
        Type bVar;
        Type typeC3;
        Type genericComponentType;
        Type typeC4;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i2 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeC0 instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeC0).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeC0};
                                }
                                type2 = new c(upperBounds2, a);
                                break;
                            }
                            typeC1 = c0(type, cls, lowerBounds[0], map);
                            if (typeC1 != lowerBounds[0]) {
                                break;
                            }
                            if (typeC1 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeC1).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeC1};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeC2 = c0(type, cls, ownerType, map);
                        z2 = !Objects.equals(typeC2, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i2 < length) {
                            typeC3 = c0(type, cls, actualTypeArguments[i2], map);
                            if (Objects.equals(typeC3, actualTypeArguments[i2])) {
                                if (!z2) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z2 = true;
                                }
                                actualTypeArguments[i2] = typeC3;
                            }
                            i2++;
                        }
                        if (z2) {
                            break;
                        }
                        bVar = new b(typeC2, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeC4 = c0(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeC4)) {
                        bVar = new a(typeC4);
                        type2 = bVar;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeC0 = c0(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeC0 instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeC0).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeC0};
                                    }
                                    type2 = new c(upperBounds2, a);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeC1 = c0(type, cls, lowerBounds[0], map);
                            if (typeC1 != lowerBounds[0]) {
                                break;
                            }
                            if (typeC1 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeC1).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeC1};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeC2 = c0(type, cls, ownerType2, map);
                        z2 = !Objects.equals(typeC2, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i2 < length) {
                            typeC3 = c0(type, cls, actualTypeArguments[i2], map);
                            if (Objects.equals(typeC3, actualTypeArguments[i2])) {
                                if (!z2) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z2 = true;
                                }
                                actualTypeArguments[i2] = typeC3;
                            }
                            i2++;
                        }
                        if (z2) {
                            break;
                        }
                        bVar = new b(typeC2, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeC4 = c0(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeC4)) {
                        break;
                    }
                    bVar = new a(typeC4);
                    type2 = bVar;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeC5 = c0(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeC5)) {
                    bVar = new a(typeC5);
                    type2 = bVar;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeT = T(type, cls, cls4);
                if (typeT instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i2 >= length2) {
                            b81.p();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type2 = ((ParameterizedType) typeT).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static dv1 d0(dv1 dv1Var, qo2 qo2Var, x32 x32Var, o42 o42Var, boolean z2, ka0 ka0Var, ix1 ix1Var) {
        x32 x32Var2 = x32.e;
        av1 av1Var = av1.a;
        return dv1Var.d(x32Var == x32Var2 ? xp1.n(av1Var, iy0.c) : xp1.n(av1Var, iy0.b)).d(new do2(ka0Var, ix1Var, x32Var, o42Var, qo2Var, z2, false));
    }

    public static final Shader.TileMode e0(int i2) {
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 == 3) {
            return Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final Object[] f0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = h;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] g0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static String h0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    @Override // defpackage.w90
    public double A() {
        N();
        throw null;
    }

    public void N() {
        throw new x31(xe2.a(getClass()) + " can't retrieve untyped values");
    }

    public void a(bt2 bt2Var) {
        bt2Var.getClass();
    }

    @Override // defpackage.w90
    public l30 b(bt2 bt2Var) {
        bt2Var.getClass();
        return this;
    }

    @Override // defpackage.w90
    public abstract long d();

    @Override // defpackage.l30
    public w90 e(zb2 zb2Var, int i2) {
        return t(zb2Var.i(i2));
    }

    @Override // defpackage.w90
    public boolean f() {
        N();
        throw null;
    }

    @Override // defpackage.w90
    public boolean g() {
        return true;
    }

    @Override // defpackage.w90
    public char h() {
        N();
        throw null;
    }

    @Override // defpackage.l30
    public Object i(bt2 bt2Var, int i2, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        if (y81Var.getDescriptor().g() || g()) {
            return c(y81Var);
        }
        return null;
    }

    @Override // defpackage.l30
    public char k(zb2 zb2Var, int i2) {
        return h();
    }

    @Override // defpackage.l30
    public float l(zb2 zb2Var, int i2) {
        return y();
    }

    @Override // defpackage.l30
    public byte m(zb2 zb2Var, int i2) {
        return r();
    }

    @Override // defpackage.l30
    public String n(bt2 bt2Var, int i2) {
        bt2Var.getClass();
        return x();
    }

    @Override // defpackage.w90
    public abstract int o();

    @Override // defpackage.l30
    public short p(zb2 zb2Var, int i2) {
        return w();
    }

    @Override // defpackage.l30
    public boolean q(bt2 bt2Var, int i2) {
        bt2Var.getClass();
        return f();
    }

    @Override // defpackage.w90
    public abstract byte r();

    @Override // defpackage.l30
    public double s(bt2 bt2Var, int i2) {
        bt2Var.getClass();
        return A();
    }

    @Override // defpackage.w90
    public w90 t(bt2 bt2Var) {
        bt2Var.getClass();
        return this;
    }

    public Object u(bt2 bt2Var, int i2, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        return c(y81Var);
    }

    @Override // defpackage.l30
    public int v(bt2 bt2Var, int i2) {
        bt2Var.getClass();
        return o();
    }

    @Override // defpackage.w90
    public abstract short w();

    @Override // defpackage.w90
    public String x() {
        N();
        throw null;
    }

    @Override // defpackage.w90
    public float y() {
        N();
        throw null;
    }

    @Override // defpackage.l30
    public long z(bt2 bt2Var, int i2) {
        bt2Var.getClass();
        return d();
    }
}
