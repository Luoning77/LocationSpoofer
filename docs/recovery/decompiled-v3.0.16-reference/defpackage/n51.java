package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.model.AppMapType;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import com.vincenthzr.locationspoofer.data.update.UpdatePackagePolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class n51 {
    public static final p10 E;
    public static final lz J;
    public static final lz K;
    public static final float L;
    public static final lz M;
    public static final lz N;
    public static final pe2 O;
    public static final yd0 P;
    public static x01 Q;
    public static x01 R;
    public static x01 S;
    public static final p10 g;
    public static final p10 l;
    public static final p10 o;
    public static final p10 p;
    public static final p10 q;
    public static final p10 t;
    public static final p10 u;
    public static final p10 v;
    public static final p10 w;
    public static final p10 x;
    public static final p10 y;
    public static final mr a = new mr(-1.0f);
    public static final mr b = new mr(1.0f);
    public static final lr c = new lr(-1.0f);
    public static final lr d = new lr(1.0f);
    public static final float[] e = new float[91];
    public static final p10 f = new p10(new u1(26), false, 143746634);
    public static final p10 h = new p10(new u1(29), false, 1521045858);
    public static final p10 i = new p10(new e00(8), false, -315878403);
    public static final p10 j = new p10(new e00(9), false, -61488996);
    public static final p10 k = new p10(new e00(10), false, -1623072374);
    public static final p10 m = new p10(new e00(3), false, 2025773488);
    public static final p10 n = new p10(new e00(4), false, -967924969);
    public static final p10 r = new p10(new u1(27), false, -329374664);
    public static final p10 s = new p10(new s10(20), false, 1110221248);
    public static final p10 z = new p10(new c20(22), false, -1656017800);
    public static final p10 A = new p10(new c20(23), false, -619189578);
    public static final p10 B = new p10(new c20(24), false, 2041913532);
    public static final p10 C = new p10(new g20(0), false, 1554677359);
    public static final p10 D = new p10(new g20(1), false, -347734257);
    public static final p10 F = new p10(new d20(12), false, -338493874);
    public static final p10 G = new p10(new d20(13), false, 867420201);
    public static final float H = 1.0f;
    public static final StackTraceElement[] I = new StackTraceElement[0];

    static {
        int i2 = 28;
        g = new p10(new u1(i2), false, 1012267044);
        int i3 = 11;
        l = new p10(new e00(i3), false, 1988919982);
        int i4 = 5;
        o = new p10(new e00(i4), false, 88555929);
        int i5 = 6;
        p = new p10(new e00(i5), false, 1704107932);
        int i6 = 7;
        q = new p10(new e00(i6), false, 285246366);
        int i7 = 21;
        t = new p10(new s10(i7), false, -18482455);
        u = new p10(new a20(i4), false, -918295464);
        v = new p10(new a20(i5), false, 1374560090);
        w = new p10(new r10(i2), false, 280873823);
        x = new p10(new a20(i6), false, 141330245);
        y = new p10(new c20(i7), false, 340510865);
        E = new p10(new d20(i3), false, -1720635060);
        lz lzVar = lz.i;
        J = lzVar;
        K = lzVar;
        L = 20.0f;
        M = lz.m;
        N = lz.j;
        O = new pe2(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        P = new yd0();
    }

    public static final pe2 A(pa1 pa1Var) {
        pe2 pe2VarX = wc0.x(pa1Var, true);
        long jX = pa1Var.x(pe2VarX.e());
        float f2 = pe2VarX.c;
        float f3 = pe2VarX.d;
        long jX2 = pa1Var.x((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new pe2(Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)), Float.intBitsToFloat((int) (jX2 >> 32)), Float.intBitsToFloat((int) (jX2 & 4294967295L)));
    }

    public static final int B(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:124:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0166  */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:128:0x016d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:132:0x017e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0183  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x0201  */
    /* JADX WARN: Code duplicated, block: B:161:0x0216  */
    /* JADX WARN: Code duplicated, block: B:164:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0232  */
    /* JADX WARN: Code duplicated, block: B:170:0x024b  */
    /* JADX WARN: Code duplicated, block: B:171:0x024d  */
    /* JADX WARN: Code duplicated, block: B:179:0x025e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0275  */
    /* JADX WARN: Code duplicated, block: B:183:0x0290  */
    /* JADX WARN: Code duplicated, block: B:185:0x0296  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:199:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:206:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:209:0x0304  */
    /* JADX WARN: Code duplicated, block: B:211:0x0356  */
    /* JADX WARN: Code duplicated, block: B:214:0x036a  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    public static final void a(au0 au0Var, dv1 dv1Var, boolean z2, au2 au2Var, gu guVar, lu luVar, is isVar, z42 z42Var, qu0 qu0Var, f30 f30Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        au2 au2Var2;
        gu guVar2;
        lu luVar2;
        int i7;
        is isVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        ov0 ov0Var;
        dv1 dv1Var2;
        boolean z6;
        au2 au2Var3;
        gu guVar3;
        lu luVar3;
        is isVar3;
        z42 z42Var2;
        ee2 ee2VarT;
        au2 au2VarA;
        gu guVarB;
        z42 z42Var3;
        int i14;
        is isVar4;
        au2 au2Var4;
        boolean z7;
        Object objQ;
        c30 c30Var;
        ix1 ix1Var;
        long j2;
        long j3;
        int i15;
        Object objQ2;
        fy2 fy2Var;
        boolean zF;
        Object objQ3;
        s41 s41Var;
        float f2;
        Object objQ4;
        oh ohVar;
        boolean zH;
        Object objQ5;
        boolean z8;
        lu luVar4;
        ti tiVar;
        float f3;
        Object objQ6;
        int i16;
        int i17;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (ov0Var2.h(au0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i18 = i3 & 2;
        if (i18 == 0) {
            if ((i2 & 48) == 0) {
                i4 |= ov0Var2.f(dv1Var) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z3 = z2;
                    if (ov0Var2.g(z3)) {
                        i6 = 256;
                    } else {
                        i6 = WorkQueueKt.BUFFER_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        au2Var2 = au2Var;
                        if (ov0Var2.f(au2Var2)) {
                            i17 = 2048;
                        }
                        i4 |= i17;
                    } else {
                        au2Var2 = au2Var;
                    }
                    i17 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    i4 |= i17;
                } else {
                    au2Var2 = au2Var;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        guVar2 = guVar;
                        int i19 = ov0Var2.f(guVar2) ? 16384 : 8192;
                        i4 |= i19;
                    } else {
                        guVar2 = guVar;
                    }
                    i4 |= i19;
                } else {
                    guVar2 = guVar;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        luVar2 = luVar;
                        int i20 = ov0Var2.f(luVar2) ? 131072 : 65536;
                        i4 |= i20;
                    } else {
                        luVar2 = luVar;
                    }
                    i4 |= i20;
                } else {
                    luVar2 = luVar;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((1572864 & i2) == 0) {
                        isVar2 = isVar;
                        if (ov0Var2.f(isVar2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                    if (i9 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (ov0Var2.f(z42Var)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    i11 = i4;
                    if ((i3 & 256) != 0) {
                        i11 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (ov0Var2.f(null)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i11 |= i12;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (ov0Var2.h(qu0Var)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    i13 = i11;
                    z4 = true;
                    if ((i13 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z5)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0 || ov0Var2.B()) {
                            if (i18 != 0) {
                                dv1Var2 = av1.a;
                            } else {
                                dv1Var2 = dv1Var;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var = hu.a;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                                i13 &= -7169;
                            } else {
                                au2VarA = au2Var2;
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var2 = hu.a;
                                guVarB = hu.b((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            } else {
                                guVarB = guVar2;
                            }
                            if ((i3 & 32) != 0) {
                                b52 b52Var3 = hu.a;
                                luVar2 = new lu(da0.I);
                                i13 &= -458753;
                            }
                            if (i7 != 0) {
                                isVar2 = null;
                            }
                            if (i9 != 0) {
                                z42Var3 = hu.a;
                            } else {
                                z42Var3 = z42Var;
                            }
                            au2 au2Var5 = au2VarA;
                            i14 = i13;
                            isVar4 = isVar2;
                            au2Var4 = au2Var5;
                            z7 = z3;
                            guVar2 = guVarB;
                        } else {
                            ov0Var2.W();
                            if ((i3 & 8) != 0) {
                                i13 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i13 &= -458753;
                            }
                            dv1Var2 = dv1Var;
                            z42Var3 = z42Var;
                            i14 = i13;
                            z7 = z3;
                            isVar4 = isVar2;
                            au2Var4 = au2Var2;
                        }
                        ov0Var2.q();
                        ov0Var2.c0(1691738187);
                        objQ = ov0Var2.Q();
                        c30Var = d30.a;
                        if (objQ == c30Var) {
                            objQ = new ix1();
                            ov0Var2.m0(objQ);
                        }
                        ix1Var = (ix1) objQ;
                        ov0Var2.p(false);
                        if (z7) {
                            j2 = guVar2.a;
                        } else {
                            j2 = guVar2.c;
                        }
                        z42 z42Var4 = z42Var3;
                        long j4 = j2;
                        if (z7) {
                            j3 = guVar2.b;
                        } else {
                            j3 = guVar2.d;
                        }
                        if (luVar2 == null) {
                            ov0Var2.c0(1691921830);
                            ov0Var2.p(false);
                            j3 = j3;
                            ix1Var = ix1Var;
                            guVar2 = guVar2;
                            luVar4 = luVar2;
                            z8 = z7;
                            tiVar = null;
                        } else {
                            ov0Var2.c0(-499611205);
                            i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                            objQ2 = ov0Var2.Q();
                            if (objQ2 == c30Var) {
                                objQ2 = new fy2();
                                ov0Var2.m0(objQ2);
                            }
                            fy2Var = (fy2) objQ2;
                            zF = ov0Var2.f(ix1Var);
                            objQ3 = ov0Var2.Q();
                            if (zF || objQ3 == c30Var) {
                                objQ3 = new ju(ix1Var, fy2Var, null, 0);
                                ov0Var2.m0(objQ3);
                            }
                            oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                            s41Var = (s41) zy.u0(fy2Var);
                            if (z7 || (s41Var instanceof vb2) || !(s41Var instanceof ly0)) {
                                f2 = 0.0f;
                            } else {
                                f2 = luVar2.a;
                            }
                            objQ4 = ov0Var2.Q();
                            if (objQ4 == c30Var) {
                                objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                                ov0Var2.m0(objQ4);
                            }
                            ohVar = (oh) objQ4;
                            td0 td0Var = new td0(f2);
                            boolean zH2 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                            if ((((i15 & 896) ^ 384) > 256 || !ov0Var2.f(luVar2)) && (i15 & 384) != 256) {
                            }
                            zH = zH2 | z4 | ov0Var2.h(s41Var);
                            objQ5 = ov0Var2.Q();
                            if (!zH || objQ5 == c30Var) {
                                lu luVar5 = luVar2;
                                z8 = z7;
                                objQ5 = new ku(ohVar, f2, z8, luVar5, s41Var, null, 0);
                                luVar4 = luVar5;
                                ov0Var2.m0(objQ5);
                            } else {
                                luVar4 = luVar2;
                                z8 = z7;
                            }
                            oi0.e(ov0Var2, (pu0) objQ5, td0Var);
                            tiVar = ohVar.c;
                            ov0Var2.p(false);
                        }
                        if (tiVar != null) {
                            f3 = ((td0) tiVar.f.getValue()).e;
                        } else {
                            f3 = 0.0f;
                        }
                        objQ6 = ov0Var2.Q();
                        if (objQ6 == c30Var) {
                            objQ6 = new v1(22);
                            ov0Var2.m0(objQ6);
                        }
                        int i21 = i14;
                        ov0Var = ov0Var2;
                        boolean z9 = z8;
                        is isVar5 = isVar4;
                        e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z9, au2Var4, j4, j3, f3, isVar5, ix1Var, sb.a0(-535639973, new qu(j3, z42Var4, qu0Var, 0), ov0Var2), ov0Var, (i21 & 8078) | ((i21 << 6) & 234881024), 64);
                        luVar3 = luVar4;
                        z42Var2 = z42Var4;
                        au2Var3 = au2Var4;
                        isVar3 = isVar5;
                        z6 = z9;
                        guVar3 = guVar2;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        dv1Var2 = dv1Var;
                        z6 = z3;
                        au2Var3 = au2Var2;
                        guVar3 = guVar2;
                        luVar3 = luVar2;
                        isVar3 = isVar2;
                        z42Var2 = z42Var;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                isVar2 = isVar;
                i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (ov0Var2.f(z42Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i4;
                if ((i3 & 256) != 0) {
                    i11 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (ov0Var2.f(null)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i11 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (ov0Var2.h(qu0Var)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                i13 = i11;
                z4 = true;
                if ((i13 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ov0Var2.T(i13 & 1, z5)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            dv1Var2 = av1.a;
                        } else {
                            dv1Var2 = dv1Var;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var4 = hu.a;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                            i13 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var5 = hu.a;
                            guVarB = hu.b((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        } else {
                            guVarB = guVar2;
                        }
                        if ((i3 & 32) != 0) {
                            b52 b52Var6 = hu.a;
                            luVar2 = new lu(da0.I);
                            i13 &= -458753;
                        }
                        if (i7 != 0) {
                            isVar2 = null;
                        }
                        if (i9 != 0) {
                            z42Var3 = hu.a;
                        } else {
                            z42Var3 = z42Var;
                        }
                        au2 au2Var6 = au2VarA;
                        i14 = i13;
                        isVar4 = isVar2;
                        au2Var4 = au2Var6;
                        z7 = z3;
                        guVar2 = guVarB;
                    } else {
                        if (i18 != 0) {
                            dv1Var2 = av1.a;
                        } else {
                            dv1Var2 = dv1Var;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var7 = hu.a;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                            i13 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var8 = hu.a;
                            guVarB = hu.b((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        } else {
                            guVarB = guVar2;
                        }
                        if ((i3 & 32) != 0) {
                            b52 b52Var9 = hu.a;
                            luVar2 = new lu(da0.I);
                            i13 &= -458753;
                        }
                        if (i7 != 0) {
                            isVar2 = null;
                        }
                        if (i9 != 0) {
                            z42Var3 = hu.a;
                        } else {
                            z42Var3 = z42Var;
                        }
                        au2 au2Var7 = au2VarA;
                        i14 = i13;
                        isVar4 = isVar2;
                        au2Var4 = au2Var7;
                        z7 = z3;
                        guVar2 = guVarB;
                    }
                    ov0Var2.q();
                    ov0Var2.c0(1691738187);
                    objQ = ov0Var2.Q();
                    c30Var = d30.a;
                    if (objQ == c30Var) {
                        objQ = new ix1();
                        ov0Var2.m0(objQ);
                    }
                    ix1Var = (ix1) objQ;
                    ov0Var2.p(false);
                    if (z7) {
                        j2 = guVar2.a;
                    } else {
                        j2 = guVar2.c;
                    }
                    z42 z42Var5 = z42Var3;
                    long j5 = j2;
                    if (z7) {
                        j3 = guVar2.b;
                    } else {
                        j3 = guVar2.d;
                    }
                    if (luVar2 == null) {
                        ov0Var2.c0(1691921830);
                        ov0Var2.p(false);
                        j3 = j3;
                        ix1Var = ix1Var;
                        guVar2 = guVar2;
                        luVar4 = luVar2;
                        z8 = z7;
                        tiVar = null;
                    } else {
                        ov0Var2.c0(-499611205);
                        i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                        objQ2 = ov0Var2.Q();
                        if (objQ2 == c30Var) {
                            objQ2 = new fy2();
                            ov0Var2.m0(objQ2);
                        }
                        fy2Var = (fy2) objQ2;
                        zF = ov0Var2.f(ix1Var);
                        objQ3 = ov0Var2.Q();
                        if (zF) {
                            objQ3 = new ju(ix1Var, fy2Var, null, 0);
                            ov0Var2.m0(objQ3);
                        } else {
                            objQ3 = new ju(ix1Var, fy2Var, null, 0);
                            ov0Var2.m0(objQ3);
                        }
                        oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                        s41Var = (s41) zy.u0(fy2Var);
                        if (z7) {
                            f2 = 0.0f;
                        } else {
                            f2 = luVar2.a;
                        }
                        objQ4 = ov0Var2.Q();
                        if (objQ4 == c30Var) {
                            objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                            ov0Var2.m0(objQ4);
                        }
                        ohVar = (oh) objQ4;
                        td0 td0Var2 = new td0(f2);
                        boolean zH3 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                        z4 = ((i15 & 896) ^ 384) > 256 ? false : false;
                        zH = zH3 | z4 | ov0Var2.h(s41Var);
                        objQ5 = ov0Var2.Q();
                        if (zH) {
                            lu luVar6 = luVar2;
                            z8 = z7;
                            objQ5 = new ku(ohVar, f2, z8, luVar6, s41Var, null, 0);
                            luVar4 = luVar6;
                            ov0Var2.m0(objQ5);
                        } else {
                            lu luVar7 = luVar2;
                            z8 = z7;
                            objQ5 = new ku(ohVar, f2, z8, luVar7, s41Var, null, 0);
                            luVar4 = luVar7;
                            ov0Var2.m0(objQ5);
                        }
                        oi0.e(ov0Var2, (pu0) objQ5, td0Var2);
                        tiVar = ohVar.c;
                        ov0Var2.p(false);
                    }
                    if (tiVar != null) {
                        f3 = ((td0) tiVar.f.getValue()).e;
                    } else {
                        f3 = 0.0f;
                    }
                    objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = new v1(22);
                        ov0Var2.m0(objQ6);
                    }
                    int i22 = i14;
                    ov0Var = ov0Var2;
                    boolean z10 = z8;
                    is isVar6 = isVar4;
                    e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z10, au2Var4, j5, j3, f3, isVar6, ix1Var, sb.a0(-535639973, new qu(j3, z42Var5, qu0Var, 0), ov0Var2), ov0Var, (i22 & 8078) | ((i22 << 6) & 234881024), 64);
                    luVar3 = luVar4;
                    z42Var2 = z42Var5;
                    au2Var3 = au2Var4;
                    isVar3 = isVar6;
                    z6 = z10;
                    guVar3 = guVar2;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var2 = dv1Var;
                    z6 = z3;
                    au2Var3 = au2Var2;
                    guVar3 = guVar2;
                    luVar3 = luVar2;
                    isVar3 = isVar2;
                    z42Var2 = z42Var;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
                }
            }
            i4 |= 384;
            z3 = z2;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    au2Var2 = au2Var;
                    if (ov0Var2.f(au2Var2)) {
                        i17 = 2048;
                    }
                    i4 |= i17;
                } else {
                    au2Var2 = au2Var;
                }
                i17 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i4 |= i17;
            } else {
                au2Var2 = au2Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    guVar2 = guVar;
                    if (ov0Var2.f(guVar2)) {
                    }
                    i4 |= i19;
                } else {
                    guVar2 = guVar;
                }
                i4 |= i19;
            } else {
                guVar2 = guVar;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    luVar2 = luVar;
                    if (ov0Var2.f(luVar2)) {
                    }
                    i4 |= i20;
                } else {
                    luVar2 = luVar;
                }
                i4 |= i20;
            } else {
                luVar2 = luVar;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    isVar2 = isVar;
                    if (ov0Var2.f(isVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (ov0Var2.f(z42Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i4;
                if ((i3 & 256) != 0) {
                    i11 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (ov0Var2.f(null)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i11 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (ov0Var2.h(qu0Var)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                i13 = i11;
                z4 = true;
                if ((i13 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ov0Var2.T(i13 & 1, z5)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            dv1Var2 = av1.a;
                        } else {
                            dv1Var2 = dv1Var;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var10 = hu.a;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                            i13 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var11 = hu.a;
                            guVarB = hu.b((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        } else {
                            guVarB = guVar2;
                        }
                        if ((i3 & 32) != 0) {
                            b52 b52Var12 = hu.a;
                            luVar2 = new lu(da0.I);
                            i13 &= -458753;
                        }
                        if (i7 != 0) {
                            isVar2 = null;
                        }
                        if (i9 != 0) {
                            z42Var3 = hu.a;
                        } else {
                            z42Var3 = z42Var;
                        }
                        au2 au2Var8 = au2VarA;
                        i14 = i13;
                        isVar4 = isVar2;
                        au2Var4 = au2Var8;
                        z7 = z3;
                        guVar2 = guVarB;
                    } else {
                        if (i18 != 0) {
                            dv1Var2 = av1.a;
                        } else {
                            dv1Var2 = dv1Var;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var13 = hu.a;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                            i13 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var14 = hu.a;
                            guVarB = hu.b((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        } else {
                            guVarB = guVar2;
                        }
                        if ((i3 & 32) != 0) {
                            b52 b52Var15 = hu.a;
                            luVar2 = new lu(da0.I);
                            i13 &= -458753;
                        }
                        if (i7 != 0) {
                            isVar2 = null;
                        }
                        if (i9 != 0) {
                            z42Var3 = hu.a;
                        } else {
                            z42Var3 = z42Var;
                        }
                        au2 au2Var9 = au2VarA;
                        i14 = i13;
                        isVar4 = isVar2;
                        au2Var4 = au2Var9;
                        z7 = z3;
                        guVar2 = guVarB;
                    }
                    ov0Var2.q();
                    ov0Var2.c0(1691738187);
                    objQ = ov0Var2.Q();
                    c30Var = d30.a;
                    if (objQ == c30Var) {
                        objQ = new ix1();
                        ov0Var2.m0(objQ);
                    }
                    ix1Var = (ix1) objQ;
                    ov0Var2.p(false);
                    if (z7) {
                        j2 = guVar2.a;
                    } else {
                        j2 = guVar2.c;
                    }
                    z42 z42Var6 = z42Var3;
                    long j6 = j2;
                    if (z7) {
                        j3 = guVar2.b;
                    } else {
                        j3 = guVar2.d;
                    }
                    if (luVar2 == null) {
                        ov0Var2.c0(1691921830);
                        ov0Var2.p(false);
                        j3 = j3;
                        ix1Var = ix1Var;
                        guVar2 = guVar2;
                        luVar4 = luVar2;
                        z8 = z7;
                        tiVar = null;
                    } else {
                        ov0Var2.c0(-499611205);
                        i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                        objQ2 = ov0Var2.Q();
                        if (objQ2 == c30Var) {
                            objQ2 = new fy2();
                            ov0Var2.m0(objQ2);
                        }
                        fy2Var = (fy2) objQ2;
                        zF = ov0Var2.f(ix1Var);
                        objQ3 = ov0Var2.Q();
                        if (zF) {
                            objQ3 = new ju(ix1Var, fy2Var, null, 0);
                            ov0Var2.m0(objQ3);
                        } else {
                            objQ3 = new ju(ix1Var, fy2Var, null, 0);
                            ov0Var2.m0(objQ3);
                        }
                        oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                        s41Var = (s41) zy.u0(fy2Var);
                        if (z7) {
                            f2 = 0.0f;
                        } else {
                            f2 = luVar2.a;
                        }
                        objQ4 = ov0Var2.Q();
                        if (objQ4 == c30Var) {
                            objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                            ov0Var2.m0(objQ4);
                        }
                        ohVar = (oh) objQ4;
                        td0 td0Var3 = new td0(f2);
                        boolean zH4 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zH = zH4 | z4 | ov0Var2.h(s41Var);
                        objQ5 = ov0Var2.Q();
                        if (zH) {
                            lu luVar8 = luVar2;
                            z8 = z7;
                            objQ5 = new ku(ohVar, f2, z8, luVar8, s41Var, null, 0);
                            luVar4 = luVar8;
                            ov0Var2.m0(objQ5);
                        } else {
                            lu luVar9 = luVar2;
                            z8 = z7;
                            objQ5 = new ku(ohVar, f2, z8, luVar9, s41Var, null, 0);
                            luVar4 = luVar9;
                            ov0Var2.m0(objQ5);
                        }
                        oi0.e(ov0Var2, (pu0) objQ5, td0Var3);
                        tiVar = ohVar.c;
                        ov0Var2.p(false);
                    }
                    if (tiVar != null) {
                        f3 = ((td0) tiVar.f.getValue()).e;
                    } else {
                        f3 = 0.0f;
                    }
                    objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = new v1(22);
                        ov0Var2.m0(objQ6);
                    }
                    int i23 = i14;
                    ov0Var = ov0Var2;
                    boolean z11 = z8;
                    is isVar7 = isVar4;
                    e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z11, au2Var4, j6, j3, f3, isVar7, ix1Var, sb.a0(-535639973, new qu(j3, z42Var6, qu0Var, 0), ov0Var2), ov0Var, (i23 & 8078) | ((i23 << 6) & 234881024), 64);
                    luVar3 = luVar4;
                    z42Var2 = z42Var6;
                    au2Var3 = au2Var4;
                    isVar3 = isVar7;
                    z6 = z11;
                    guVar3 = guVar2;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var2 = dv1Var;
                    z6 = z3;
                    au2Var3 = au2Var2;
                    guVar3 = guVar2;
                    luVar3 = luVar2;
                    isVar3 = isVar2;
                    z42Var2 = z42Var;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
                }
            }
            i4 |= 1572864;
            isVar2 = isVar;
            i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (ov0Var2.f(z42Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i4;
            if ((i3 & 256) != 0) {
                i11 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ov0Var2.f(null)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i11 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (ov0Var2.h(qu0Var)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i11 |= i16;
            }
            i13 = i11;
            z4 = true;
            if ((i13 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ov0Var2.T(i13 & 1, z5)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        dv1Var2 = av1.a;
                    } else {
                        dv1Var2 = dv1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var16 = hu.a;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                        i13 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var17 = hu.a;
                        guVarB = hu.b((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    } else {
                        guVarB = guVar2;
                    }
                    if ((i3 & 32) != 0) {
                        b52 b52Var18 = hu.a;
                        luVar2 = new lu(da0.I);
                        i13 &= -458753;
                    }
                    if (i7 != 0) {
                        isVar2 = null;
                    }
                    if (i9 != 0) {
                        z42Var3 = hu.a;
                    } else {
                        z42Var3 = z42Var;
                    }
                    au2 au2Var10 = au2VarA;
                    i14 = i13;
                    isVar4 = isVar2;
                    au2Var4 = au2Var10;
                    z7 = z3;
                    guVar2 = guVarB;
                } else {
                    if (i18 != 0) {
                        dv1Var2 = av1.a;
                    } else {
                        dv1Var2 = dv1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var19 = hu.a;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                        i13 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var110 = hu.a;
                        guVarB = hu.b((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    } else {
                        guVarB = guVar2;
                    }
                    if ((i3 & 32) != 0) {
                        b52 b52Var111 = hu.a;
                        luVar2 = new lu(da0.I);
                        i13 &= -458753;
                    }
                    if (i7 != 0) {
                        isVar2 = null;
                    }
                    if (i9 != 0) {
                        z42Var3 = hu.a;
                    } else {
                        z42Var3 = z42Var;
                    }
                    au2 au2Var11 = au2VarA;
                    i14 = i13;
                    isVar4 = isVar2;
                    au2Var4 = au2Var11;
                    z7 = z3;
                    guVar2 = guVarB;
                }
                ov0Var2.q();
                ov0Var2.c0(1691738187);
                objQ = ov0Var2.Q();
                c30Var = d30.a;
                if (objQ == c30Var) {
                    objQ = new ix1();
                    ov0Var2.m0(objQ);
                }
                ix1Var = (ix1) objQ;
                ov0Var2.p(false);
                if (z7) {
                    j2 = guVar2.a;
                } else {
                    j2 = guVar2.c;
                }
                z42 z42Var7 = z42Var3;
                long j7 = j2;
                if (z7) {
                    j3 = guVar2.b;
                } else {
                    j3 = guVar2.d;
                }
                if (luVar2 == null) {
                    ov0Var2.c0(1691921830);
                    ov0Var2.p(false);
                    j3 = j3;
                    ix1Var = ix1Var;
                    guVar2 = guVar2;
                    luVar4 = luVar2;
                    z8 = z7;
                    tiVar = null;
                } else {
                    ov0Var2.c0(-499611205);
                    i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                    objQ2 = ov0Var2.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new fy2();
                        ov0Var2.m0(objQ2);
                    }
                    fy2Var = (fy2) objQ2;
                    zF = ov0Var2.f(ix1Var);
                    objQ3 = ov0Var2.Q();
                    if (zF) {
                        objQ3 = new ju(ix1Var, fy2Var, null, 0);
                        ov0Var2.m0(objQ3);
                    } else {
                        objQ3 = new ju(ix1Var, fy2Var, null, 0);
                        ov0Var2.m0(objQ3);
                    }
                    oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                    s41Var = (s41) zy.u0(fy2Var);
                    if (z7) {
                        f2 = 0.0f;
                    } else {
                        f2 = luVar2.a;
                    }
                    objQ4 = ov0Var2.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                        ov0Var2.m0(objQ4);
                    }
                    ohVar = (oh) objQ4;
                    td0 td0Var4 = new td0(f2);
                    boolean zH5 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zH = zH5 | z4 | ov0Var2.h(s41Var);
                    objQ5 = ov0Var2.Q();
                    if (zH) {
                        lu luVar10 = luVar2;
                        z8 = z7;
                        objQ5 = new ku(ohVar, f2, z8, luVar10, s41Var, null, 0);
                        luVar4 = luVar10;
                        ov0Var2.m0(objQ5);
                    } else {
                        lu luVar11 = luVar2;
                        z8 = z7;
                        objQ5 = new ku(ohVar, f2, z8, luVar11, s41Var, null, 0);
                        luVar4 = luVar11;
                        ov0Var2.m0(objQ5);
                    }
                    oi0.e(ov0Var2, (pu0) objQ5, td0Var4);
                    tiVar = ohVar.c;
                    ov0Var2.p(false);
                }
                if (tiVar != null) {
                    f3 = ((td0) tiVar.f.getValue()).e;
                } else {
                    f3 = 0.0f;
                }
                objQ6 = ov0Var2.Q();
                if (objQ6 == c30Var) {
                    objQ6 = new v1(22);
                    ov0Var2.m0(objQ6);
                }
                int i24 = i14;
                ov0Var = ov0Var2;
                boolean z12 = z8;
                is isVar8 = isVar4;
                e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z12, au2Var4, j7, j3, f3, isVar8, ix1Var, sb.a0(-535639973, new qu(j3, z42Var7, qu0Var, 0), ov0Var2), ov0Var, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                luVar3 = luVar4;
                z42Var2 = z42Var7;
                au2Var3 = au2Var4;
                isVar3 = isVar8;
                z6 = z12;
                guVar3 = guVar2;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var2 = dv1Var;
                z6 = z3;
                au2Var3 = au2Var2;
                guVar3 = guVar2;
                luVar3 = luVar2;
                isVar3 = isVar2;
                z42Var2 = z42Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
            }
        }
        i4 |= 48;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z3 = z2;
                if (ov0Var2.g(z3)) {
                    i6 = 256;
                } else {
                    i6 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    au2Var2 = au2Var;
                    if (ov0Var2.f(au2Var2)) {
                        i17 = 2048;
                    }
                    i4 |= i17;
                } else {
                    au2Var2 = au2Var;
                }
                i17 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i4 |= i17;
            } else {
                au2Var2 = au2Var;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    guVar2 = guVar;
                    if (ov0Var2.f(guVar2)) {
                    }
                    i4 |= i19;
                } else {
                    guVar2 = guVar;
                }
                i4 |= i19;
            } else {
                guVar2 = guVar;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    luVar2 = luVar;
                    if (ov0Var2.f(luVar2)) {
                    }
                    i4 |= i20;
                } else {
                    luVar2 = luVar;
                }
                i4 |= i20;
            } else {
                luVar2 = luVar;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    isVar2 = isVar;
                    if (ov0Var2.f(isVar2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (ov0Var2.f(z42Var)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i4;
                if ((i3 & 256) != 0) {
                    i11 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (ov0Var2.f(null)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i11 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (ov0Var2.h(qu0Var)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                i13 = i11;
                z4 = true;
                if ((i13 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ov0Var2.T(i13 & 1, z5)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i18 != 0) {
                            dv1Var2 = av1.a;
                        } else {
                            dv1Var2 = dv1Var;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var112 = hu.a;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                            i13 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var113 = hu.a;
                            guVarB = hu.b((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        } else {
                            guVarB = guVar2;
                        }
                        if ((i3 & 32) != 0) {
                            b52 b52Var114 = hu.a;
                            luVar2 = new lu(da0.I);
                            i13 &= -458753;
                        }
                        if (i7 != 0) {
                            isVar2 = null;
                        }
                        if (i9 != 0) {
                            z42Var3 = hu.a;
                        } else {
                            z42Var3 = z42Var;
                        }
                        au2 au2Var12 = au2VarA;
                        i14 = i13;
                        isVar4 = isVar2;
                        au2Var4 = au2Var12;
                        z7 = z3;
                        guVar2 = guVarB;
                    } else {
                        if (i18 != 0) {
                            dv1Var2 = av1.a;
                        } else {
                            dv1Var2 = dv1Var;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var115 = hu.a;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                            i13 &= -7169;
                        } else {
                            au2VarA = au2Var2;
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var116 = hu.a;
                            guVarB = hu.b((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        } else {
                            guVarB = guVar2;
                        }
                        if ((i3 & 32) != 0) {
                            b52 b52Var117 = hu.a;
                            luVar2 = new lu(da0.I);
                            i13 &= -458753;
                        }
                        if (i7 != 0) {
                            isVar2 = null;
                        }
                        if (i9 != 0) {
                            z42Var3 = hu.a;
                        } else {
                            z42Var3 = z42Var;
                        }
                        au2 au2Var13 = au2VarA;
                        i14 = i13;
                        isVar4 = isVar2;
                        au2Var4 = au2Var13;
                        z7 = z3;
                        guVar2 = guVarB;
                    }
                    ov0Var2.q();
                    ov0Var2.c0(1691738187);
                    objQ = ov0Var2.Q();
                    c30Var = d30.a;
                    if (objQ == c30Var) {
                        objQ = new ix1();
                        ov0Var2.m0(objQ);
                    }
                    ix1Var = (ix1) objQ;
                    ov0Var2.p(false);
                    if (z7) {
                        j2 = guVar2.a;
                    } else {
                        j2 = guVar2.c;
                    }
                    z42 z42Var8 = z42Var3;
                    long j8 = j2;
                    if (z7) {
                        j3 = guVar2.b;
                    } else {
                        j3 = guVar2.d;
                    }
                    if (luVar2 == null) {
                        ov0Var2.c0(1691921830);
                        ov0Var2.p(false);
                        j3 = j3;
                        ix1Var = ix1Var;
                        guVar2 = guVar2;
                        luVar4 = luVar2;
                        z8 = z7;
                        tiVar = null;
                    } else {
                        ov0Var2.c0(-499611205);
                        i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                        objQ2 = ov0Var2.Q();
                        if (objQ2 == c30Var) {
                            objQ2 = new fy2();
                            ov0Var2.m0(objQ2);
                        }
                        fy2Var = (fy2) objQ2;
                        zF = ov0Var2.f(ix1Var);
                        objQ3 = ov0Var2.Q();
                        if (zF) {
                            objQ3 = new ju(ix1Var, fy2Var, null, 0);
                            ov0Var2.m0(objQ3);
                        } else {
                            objQ3 = new ju(ix1Var, fy2Var, null, 0);
                            ov0Var2.m0(objQ3);
                        }
                        oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                        s41Var = (s41) zy.u0(fy2Var);
                        if (z7) {
                            f2 = 0.0f;
                        } else {
                            f2 = luVar2.a;
                        }
                        objQ4 = ov0Var2.Q();
                        if (objQ4 == c30Var) {
                            objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                            ov0Var2.m0(objQ4);
                        }
                        ohVar = (oh) objQ4;
                        td0 td0Var5 = new td0(f2);
                        boolean zH6 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zH = zH6 | z4 | ov0Var2.h(s41Var);
                        objQ5 = ov0Var2.Q();
                        if (zH) {
                            lu luVar12 = luVar2;
                            z8 = z7;
                            objQ5 = new ku(ohVar, f2, z8, luVar12, s41Var, null, 0);
                            luVar4 = luVar12;
                            ov0Var2.m0(objQ5);
                        } else {
                            lu luVar13 = luVar2;
                            z8 = z7;
                            objQ5 = new ku(ohVar, f2, z8, luVar13, s41Var, null, 0);
                            luVar4 = luVar13;
                            ov0Var2.m0(objQ5);
                        }
                        oi0.e(ov0Var2, (pu0) objQ5, td0Var5);
                        tiVar = ohVar.c;
                        ov0Var2.p(false);
                    }
                    if (tiVar != null) {
                        f3 = ((td0) tiVar.f.getValue()).e;
                    } else {
                        f3 = 0.0f;
                    }
                    objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = new v1(22);
                        ov0Var2.m0(objQ6);
                    }
                    int i25 = i14;
                    ov0Var = ov0Var2;
                    boolean z13 = z8;
                    is isVar9 = isVar4;
                    e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z13, au2Var4, j8, j3, f3, isVar9, ix1Var, sb.a0(-535639973, new qu(j3, z42Var8, qu0Var, 0), ov0Var2), ov0Var, (i25 & 8078) | ((i25 << 6) & 234881024), 64);
                    luVar3 = luVar4;
                    z42Var2 = z42Var8;
                    au2Var3 = au2Var4;
                    isVar3 = isVar9;
                    z6 = z13;
                    guVar3 = guVar2;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var2 = dv1Var;
                    z6 = z3;
                    au2Var3 = au2Var2;
                    guVar3 = guVar2;
                    luVar3 = luVar2;
                    isVar3 = isVar2;
                    z42Var2 = z42Var;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
                }
            }
            i4 |= 1572864;
            isVar2 = isVar;
            i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (ov0Var2.f(z42Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i4;
            if ((i3 & 256) != 0) {
                i11 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ov0Var2.f(null)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i11 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (ov0Var2.h(qu0Var)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i11 |= i16;
            }
            i13 = i11;
            z4 = true;
            if ((i13 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ov0Var2.T(i13 & 1, z5)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        dv1Var2 = av1.a;
                    } else {
                        dv1Var2 = dv1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var118 = hu.a;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                        i13 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var119 = hu.a;
                        guVarB = hu.b((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    } else {
                        guVarB = guVar2;
                    }
                    if ((i3 & 32) != 0) {
                        b52 b52Var1110 = hu.a;
                        luVar2 = new lu(da0.I);
                        i13 &= -458753;
                    }
                    if (i7 != 0) {
                        isVar2 = null;
                    }
                    if (i9 != 0) {
                        z42Var3 = hu.a;
                    } else {
                        z42Var3 = z42Var;
                    }
                    au2 au2Var14 = au2VarA;
                    i14 = i13;
                    isVar4 = isVar2;
                    au2Var4 = au2Var14;
                    z7 = z3;
                    guVar2 = guVarB;
                } else {
                    if (i18 != 0) {
                        dv1Var2 = av1.a;
                    } else {
                        dv1Var2 = dv1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var1111 = hu.a;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                        i13 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var1112 = hu.a;
                        guVarB = hu.b((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    } else {
                        guVarB = guVar2;
                    }
                    if ((i3 & 32) != 0) {
                        b52 b52Var1113 = hu.a;
                        luVar2 = new lu(da0.I);
                        i13 &= -458753;
                    }
                    if (i7 != 0) {
                        isVar2 = null;
                    }
                    if (i9 != 0) {
                        z42Var3 = hu.a;
                    } else {
                        z42Var3 = z42Var;
                    }
                    au2 au2Var15 = au2VarA;
                    i14 = i13;
                    isVar4 = isVar2;
                    au2Var4 = au2Var15;
                    z7 = z3;
                    guVar2 = guVarB;
                }
                ov0Var2.q();
                ov0Var2.c0(1691738187);
                objQ = ov0Var2.Q();
                c30Var = d30.a;
                if (objQ == c30Var) {
                    objQ = new ix1();
                    ov0Var2.m0(objQ);
                }
                ix1Var = (ix1) objQ;
                ov0Var2.p(false);
                if (z7) {
                    j2 = guVar2.a;
                } else {
                    j2 = guVar2.c;
                }
                z42 z42Var9 = z42Var3;
                long j9 = j2;
                if (z7) {
                    j3 = guVar2.b;
                } else {
                    j3 = guVar2.d;
                }
                if (luVar2 == null) {
                    ov0Var2.c0(1691921830);
                    ov0Var2.p(false);
                    j3 = j3;
                    ix1Var = ix1Var;
                    guVar2 = guVar2;
                    luVar4 = luVar2;
                    z8 = z7;
                    tiVar = null;
                } else {
                    ov0Var2.c0(-499611205);
                    i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                    objQ2 = ov0Var2.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new fy2();
                        ov0Var2.m0(objQ2);
                    }
                    fy2Var = (fy2) objQ2;
                    zF = ov0Var2.f(ix1Var);
                    objQ3 = ov0Var2.Q();
                    if (zF) {
                        objQ3 = new ju(ix1Var, fy2Var, null, 0);
                        ov0Var2.m0(objQ3);
                    } else {
                        objQ3 = new ju(ix1Var, fy2Var, null, 0);
                        ov0Var2.m0(objQ3);
                    }
                    oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                    s41Var = (s41) zy.u0(fy2Var);
                    if (z7) {
                        f2 = 0.0f;
                    } else {
                        f2 = luVar2.a;
                    }
                    objQ4 = ov0Var2.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                        ov0Var2.m0(objQ4);
                    }
                    ohVar = (oh) objQ4;
                    td0 td0Var6 = new td0(f2);
                    boolean zH7 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zH = zH7 | z4 | ov0Var2.h(s41Var);
                    objQ5 = ov0Var2.Q();
                    if (zH) {
                        lu luVar14 = luVar2;
                        z8 = z7;
                        objQ5 = new ku(ohVar, f2, z8, luVar14, s41Var, null, 0);
                        luVar4 = luVar14;
                        ov0Var2.m0(objQ5);
                    } else {
                        lu luVar15 = luVar2;
                        z8 = z7;
                        objQ5 = new ku(ohVar, f2, z8, luVar15, s41Var, null, 0);
                        luVar4 = luVar15;
                        ov0Var2.m0(objQ5);
                    }
                    oi0.e(ov0Var2, (pu0) objQ5, td0Var6);
                    tiVar = ohVar.c;
                    ov0Var2.p(false);
                }
                if (tiVar != null) {
                    f3 = ((td0) tiVar.f.getValue()).e;
                } else {
                    f3 = 0.0f;
                }
                objQ6 = ov0Var2.Q();
                if (objQ6 == c30Var) {
                    objQ6 = new v1(22);
                    ov0Var2.m0(objQ6);
                }
                int i26 = i14;
                ov0Var = ov0Var2;
                boolean z14 = z8;
                is isVar10 = isVar4;
                e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z14, au2Var4, j9, j3, f3, isVar10, ix1Var, sb.a0(-535639973, new qu(j3, z42Var9, qu0Var, 0), ov0Var2), ov0Var, (i26 & 8078) | ((i26 << 6) & 234881024), 64);
                luVar3 = luVar4;
                z42Var2 = z42Var9;
                au2Var3 = au2Var4;
                isVar3 = isVar10;
                z6 = z14;
                guVar3 = guVar2;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var2 = dv1Var;
                z6 = z3;
                au2Var3 = au2Var2;
                guVar3 = guVar2;
                luVar3 = luVar2;
                isVar3 = isVar2;
                z42Var2 = z42Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
            }
        }
        i4 |= 384;
        z3 = z2;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                au2Var2 = au2Var;
                if (ov0Var2.f(au2Var2)) {
                    i17 = 2048;
                }
                i4 |= i17;
            } else {
                au2Var2 = au2Var;
            }
            i17 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i4 |= i17;
        } else {
            au2Var2 = au2Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                guVar2 = guVar;
                if (ov0Var2.f(guVar2)) {
                }
                i4 |= i19;
            } else {
                guVar2 = guVar;
            }
            i4 |= i19;
        } else {
            guVar2 = guVar;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                luVar2 = luVar;
                if (ov0Var2.f(luVar2)) {
                }
                i4 |= i20;
            } else {
                luVar2 = luVar;
            }
            i4 |= i20;
        } else {
            luVar2 = luVar;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                isVar2 = isVar;
                if (ov0Var2.f(isVar2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (ov0Var2.f(z42Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i4;
            if ((i3 & 256) != 0) {
                i11 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (ov0Var2.f(null)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i11 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (ov0Var2.h(qu0Var)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i11 |= i16;
            }
            i13 = i11;
            z4 = true;
            if ((i13 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ov0Var2.T(i13 & 1, z5)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i18 != 0) {
                        dv1Var2 = av1.a;
                    } else {
                        dv1Var2 = dv1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var1114 = hu.a;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                        i13 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var1115 = hu.a;
                        guVarB = hu.b((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    } else {
                        guVarB = guVar2;
                    }
                    if ((i3 & 32) != 0) {
                        b52 b52Var1116 = hu.a;
                        luVar2 = new lu(da0.I);
                        i13 &= -458753;
                    }
                    if (i7 != 0) {
                        isVar2 = null;
                    }
                    if (i9 != 0) {
                        z42Var3 = hu.a;
                    } else {
                        z42Var3 = z42Var;
                    }
                    au2 au2Var16 = au2VarA;
                    i14 = i13;
                    isVar4 = isVar2;
                    au2Var4 = au2Var16;
                    z7 = z3;
                    guVar2 = guVarB;
                } else {
                    if (i18 != 0) {
                        dv1Var2 = av1.a;
                    } else {
                        dv1Var2 = dv1Var;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var1117 = hu.a;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                        i13 &= -7169;
                    } else {
                        au2VarA = au2Var2;
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var1118 = hu.a;
                        guVarB = hu.b((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    } else {
                        guVarB = guVar2;
                    }
                    if ((i3 & 32) != 0) {
                        b52 b52Var1119 = hu.a;
                        luVar2 = new lu(da0.I);
                        i13 &= -458753;
                    }
                    if (i7 != 0) {
                        isVar2 = null;
                    }
                    if (i9 != 0) {
                        z42Var3 = hu.a;
                    } else {
                        z42Var3 = z42Var;
                    }
                    au2 au2Var17 = au2VarA;
                    i14 = i13;
                    isVar4 = isVar2;
                    au2Var4 = au2Var17;
                    z7 = z3;
                    guVar2 = guVarB;
                }
                ov0Var2.q();
                ov0Var2.c0(1691738187);
                objQ = ov0Var2.Q();
                c30Var = d30.a;
                if (objQ == c30Var) {
                    objQ = new ix1();
                    ov0Var2.m0(objQ);
                }
                ix1Var = (ix1) objQ;
                ov0Var2.p(false);
                if (z7) {
                    j2 = guVar2.a;
                } else {
                    j2 = guVar2.c;
                }
                z42 z42Var10 = z42Var3;
                long j10 = j2;
                if (z7) {
                    j3 = guVar2.b;
                } else {
                    j3 = guVar2.d;
                }
                if (luVar2 == null) {
                    ov0Var2.c0(1691921830);
                    ov0Var2.p(false);
                    j3 = j3;
                    ix1Var = ix1Var;
                    guVar2 = guVar2;
                    luVar4 = luVar2;
                    z8 = z7;
                    tiVar = null;
                } else {
                    ov0Var2.c0(-499611205);
                    i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                    objQ2 = ov0Var2.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new fy2();
                        ov0Var2.m0(objQ2);
                    }
                    fy2Var = (fy2) objQ2;
                    zF = ov0Var2.f(ix1Var);
                    objQ3 = ov0Var2.Q();
                    if (zF) {
                        objQ3 = new ju(ix1Var, fy2Var, null, 0);
                        ov0Var2.m0(objQ3);
                    } else {
                        objQ3 = new ju(ix1Var, fy2Var, null, 0);
                        ov0Var2.m0(objQ3);
                    }
                    oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                    s41Var = (s41) zy.u0(fy2Var);
                    if (z7) {
                        f2 = 0.0f;
                    } else {
                        f2 = luVar2.a;
                    }
                    objQ4 = ov0Var2.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                        ov0Var2.m0(objQ4);
                    }
                    ohVar = (oh) objQ4;
                    td0 td0Var7 = new td0(f2);
                    boolean zH8 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zH = zH8 | z4 | ov0Var2.h(s41Var);
                    objQ5 = ov0Var2.Q();
                    if (zH) {
                        lu luVar16 = luVar2;
                        z8 = z7;
                        objQ5 = new ku(ohVar, f2, z8, luVar16, s41Var, null, 0);
                        luVar4 = luVar16;
                        ov0Var2.m0(objQ5);
                    } else {
                        lu luVar17 = luVar2;
                        z8 = z7;
                        objQ5 = new ku(ohVar, f2, z8, luVar17, s41Var, null, 0);
                        luVar4 = luVar17;
                        ov0Var2.m0(objQ5);
                    }
                    oi0.e(ov0Var2, (pu0) objQ5, td0Var7);
                    tiVar = ohVar.c;
                    ov0Var2.p(false);
                }
                if (tiVar != null) {
                    f3 = ((td0) tiVar.f.getValue()).e;
                } else {
                    f3 = 0.0f;
                }
                objQ6 = ov0Var2.Q();
                if (objQ6 == c30Var) {
                    objQ6 = new v1(22);
                    ov0Var2.m0(objQ6);
                }
                int i27 = i14;
                ov0Var = ov0Var2;
                boolean z15 = z8;
                is isVar11 = isVar4;
                e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z15, au2Var4, j10, j3, f3, isVar11, ix1Var, sb.a0(-535639973, new qu(j3, z42Var10, qu0Var, 0), ov0Var2), ov0Var, (i27 & 8078) | ((i27 << 6) & 234881024), 64);
                luVar3 = luVar4;
                z42Var2 = z42Var10;
                au2Var3 = au2Var4;
                isVar3 = isVar11;
                z6 = z15;
                guVar3 = guVar2;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var2 = dv1Var;
                z6 = z3;
                au2Var3 = au2Var2;
                guVar3 = guVar2;
                luVar3 = luVar2;
                isVar3 = isVar2;
                z42Var2 = z42Var;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
            }
        }
        i4 |= 1572864;
        isVar2 = isVar;
        i9 = i3 & WorkQueueKt.BUFFER_CAPACITY;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (ov0Var2.f(z42Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i11 = i4;
        if ((i3 & 256) != 0) {
            i11 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (ov0Var2.f(null)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        if ((i2 & 805306368) == 0) {
            if (ov0Var2.h(qu0Var)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i11 |= i16;
        }
        i13 = i11;
        z4 = true;
        if ((i13 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (ov0Var2.T(i13 & 1, z5)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0) {
                if (i18 != 0) {
                    dv1Var2 = av1.a;
                } else {
                    dv1Var2 = dv1Var;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    b52 b52Var11110 = hu.a;
                    au2VarA = hu2.a(da0.a, ov0Var2);
                    i13 &= -7169;
                } else {
                    au2VarA = au2Var2;
                }
                if ((i3 & 16) != 0) {
                    b52 b52Var11111 = hu.a;
                    guVarB = hu.b((kz) ov0Var2.j(mz.a));
                    i13 &= -57345;
                } else {
                    guVarB = guVar2;
                }
                if ((i3 & 32) != 0) {
                    b52 b52Var11112 = hu.a;
                    luVar2 = new lu(da0.I);
                    i13 &= -458753;
                }
                if (i7 != 0) {
                    isVar2 = null;
                }
                if (i9 != 0) {
                    z42Var3 = hu.a;
                } else {
                    z42Var3 = z42Var;
                }
                au2 au2Var18 = au2VarA;
                i14 = i13;
                isVar4 = isVar2;
                au2Var4 = au2Var18;
                z7 = z3;
                guVar2 = guVarB;
            } else {
                if (i18 != 0) {
                    dv1Var2 = av1.a;
                } else {
                    dv1Var2 = dv1Var;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    b52 b52Var11113 = hu.a;
                    au2VarA = hu2.a(da0.a, ov0Var2);
                    i13 &= -7169;
                } else {
                    au2VarA = au2Var2;
                }
                if ((i3 & 16) != 0) {
                    b52 b52Var11114 = hu.a;
                    guVarB = hu.b((kz) ov0Var2.j(mz.a));
                    i13 &= -57345;
                } else {
                    guVarB = guVar2;
                }
                if ((i3 & 32) != 0) {
                    b52 b52Var11115 = hu.a;
                    luVar2 = new lu(da0.I);
                    i13 &= -458753;
                }
                if (i7 != 0) {
                    isVar2 = null;
                }
                if (i9 != 0) {
                    z42Var3 = hu.a;
                } else {
                    z42Var3 = z42Var;
                }
                au2 au2Var19 = au2VarA;
                i14 = i13;
                isVar4 = isVar2;
                au2Var4 = au2Var19;
                z7 = z3;
                guVar2 = guVarB;
            }
            ov0Var2.q();
            ov0Var2.c0(1691738187);
            objQ = ov0Var2.Q();
            c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new ix1();
                ov0Var2.m0(objQ);
            }
            ix1Var = (ix1) objQ;
            ov0Var2.p(false);
            if (z7) {
                j2 = guVar2.a;
            } else {
                j2 = guVar2.c;
            }
            z42 z42Var11 = z42Var3;
            long j11 = j2;
            if (z7) {
                j3 = guVar2.b;
            } else {
                j3 = guVar2.d;
            }
            if (luVar2 == null) {
                ov0Var2.c0(1691921830);
                ov0Var2.p(false);
                j3 = j3;
                ix1Var = ix1Var;
                guVar2 = guVar2;
                luVar4 = luVar2;
                z8 = z7;
                tiVar = null;
            } else {
                ov0Var2.c0(-499611205);
                i15 = ((i14 >> 9) & 896) | ((i14 >> 6) & 14);
                objQ2 = ov0Var2.Q();
                if (objQ2 == c30Var) {
                    objQ2 = new fy2();
                    ov0Var2.m0(objQ2);
                }
                fy2Var = (fy2) objQ2;
                zF = ov0Var2.f(ix1Var);
                objQ3 = ov0Var2.Q();
                if (zF) {
                    objQ3 = new ju(ix1Var, fy2Var, null, 0);
                    ov0Var2.m0(objQ3);
                } else {
                    objQ3 = new ju(ix1Var, fy2Var, null, 0);
                    ov0Var2.m0(objQ3);
                }
                oi0.e(ov0Var2, (pu0) objQ3, ix1Var);
                s41Var = (s41) zy.u0(fy2Var);
                if (z7) {
                    f2 = 0.0f;
                } else {
                    f2 = luVar2.a;
                }
                objQ4 = ov0Var2.Q();
                if (objQ4 == c30Var) {
                    objQ4 = new oh(new td0(f2), o51.x0, null, 12);
                    ov0Var2.m0(objQ4);
                }
                ohVar = (oh) objQ4;
                td0 td0Var8 = new td0(f2);
                boolean zH9 = ov0Var2.h(ohVar) | ov0Var2.c(f2) | ((((i15 & 14) ^ 6) <= 4 && ov0Var2.g(z7)) || (i15 & 6) == 4);
                if (((i15 & 896) ^ 384) > 256) {
                }
                zH = zH9 | z4 | ov0Var2.h(s41Var);
                objQ5 = ov0Var2.Q();
                if (zH) {
                    lu luVar18 = luVar2;
                    z8 = z7;
                    objQ5 = new ku(ohVar, f2, z8, luVar18, s41Var, null, 0);
                    luVar4 = luVar18;
                    ov0Var2.m0(objQ5);
                } else {
                    lu luVar19 = luVar2;
                    z8 = z7;
                    objQ5 = new ku(ohVar, f2, z8, luVar19, s41Var, null, 0);
                    luVar4 = luVar19;
                    ov0Var2.m0(objQ5);
                }
                oi0.e(ov0Var2, (pu0) objQ5, td0Var8);
                tiVar = ohVar.c;
                ov0Var2.p(false);
            }
            if (tiVar != null) {
                f3 = ((td0) tiVar.f.getValue()).e;
            } else {
                f3 = 0.0f;
            }
            objQ6 = ov0Var2.Q();
            if (objQ6 == c30Var) {
                objQ6 = new v1(22);
                ov0Var2.m0(objQ6);
            }
            int i28 = i14;
            ov0Var = ov0Var2;
            boolean z16 = z8;
            is isVar12 = isVar4;
            e33.b(au0Var, gs2.a(dv1Var2, false, (lu0) objQ6), z16, au2Var4, j11, j3, f3, isVar12, ix1Var, sb.a0(-535639973, new qu(j3, z42Var11, qu0Var, 0), ov0Var2), ov0Var, (i28 & 8078) | ((i28 << 6) & 234881024), 64);
            luVar3 = luVar4;
            z42Var2 = z42Var11;
            au2Var3 = au2Var4;
            isVar3 = isVar12;
            z6 = z16;
            guVar3 = guVar2;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            dv1Var2 = dv1Var;
            z6 = z3;
            au2Var3 = au2Var2;
            guVar3 = guVar2;
            luVar3 = luVar2;
            isVar3 = isVar2;
            z42Var2 = z42Var;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new mu(au0Var, dv1Var2, z6, au2Var3, guVar3, luVar3, isVar3, z42Var2, qu0Var, i2, i3);
        }
    }

    public static final void b(CompleteCollectionRoute completeCollectionRoute, au0 au0Var, au0 au0Var2, au0 au0Var3, f30 f30Var, int i2, int i3) {
        int i4;
        au0 au0Var4;
        int i5;
        au0 au0Var5;
        completeCollectionRoute.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1512672773);
        int i6 = i2 | (ov0Var.h(completeCollectionRoute) ? 4 : 2) | (ov0Var.h(au0Var) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
        } else {
            i4 = i6 | (ov0Var.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
            au0Var4 = au0Var3;
        } else {
            au0Var4 = au0Var3;
            i5 = i4 | (ov0Var.h(au0Var4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        int i9 = 1;
        if (ov0Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            au0 au0Var6 = i7 != 0 ? null : au0Var2;
            au0 au0Var7 = i8 != 0 ? null : au0Var4;
            sb.B(au0Var, iw2.e(av1.a, 1.0f), false, null, null, null, null, sb.a0(-530288848, new zt(au0Var6, au0Var7, completeCollectionRoute, i9), ov0Var), ov0Var, ((i5 >> 3) & 14) | 100663344, 252);
            au0Var5 = au0Var6;
            au0Var4 = au0Var7;
        } else {
            ov0Var.W();
            au0Var5 = au0Var2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(completeCollectionRoute, au0Var, au0Var5, au0Var4, i2, i3);
        }
    }

    public static final void c(ar2 ar2Var, p10 p10Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-954926513);
        int i3 = (ov0Var.h(ar2Var) ? 4 : 2) | i2;
        int i4 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            ji2.p(ar2Var, p10Var, ov0Var, i3 & 126);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j00(ar2Var, p10Var, i2, i4);
        }
    }

    public static final void d(x73 x73Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(x73Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        int i4 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            ji2.q(x73Var, p10Var, ov0Var, i3 & 126);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new i00(x73Var, p10Var, i2, i4);
        }
    }

    public static final void e(final og3 og3Var, final boolean z2, final GithubRelease githubRelease, final boolean z3, final au0 au0Var, final pu0 pu0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, final lu0 lu0Var, f30 f30Var, final int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(868995147);
        int i3 = i2 | (ov0Var.h(og3Var) ? 4 : 2) | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.h(githubRelease) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.g(z3) ? 16384 : 8192) | (ov0Var.h(au0Var) ? 131072 : 65536) | (ov0Var.h(pu0Var) ? 1048576 : 524288) | (ov0Var.h(au0Var2) ? 8388608 : 4194304) | (ov0Var.h(au0Var3) ? 67108864 : 33554432) | (ov0Var.h(au0Var4) ? 536870912 : 268435456);
        if (ov0Var.T(i3 & 1, ((306783379 & i3) == 306783378 && ((ov0Var.h(lu0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(20.0f, 18.0f, 20.0f, 18.0f), sb.a0(-586418886, new qu0() { // from class: kg3
                /* JADX WARN: Code duplicated, block: B:117:0x094a  */
                /* JADX WARN: Code duplicated, block: B:119:0x0957  */
                /* JADX WARN: Code duplicated, block: B:121:0x09df  */
                /* JADX WARN: Code duplicated, block: B:122:0x09e1  */
                /* JADX WARN: Code duplicated, block: B:125:0x09ee  */
                /* JADX WARN: Code duplicated, block: B:126:0x09f1  */
                /* JADX WARN: Code duplicated, block: B:130:0x0a04  */
                /* JADX WARN: Code duplicated, block: B:132:0x0a45  */
                /* JADX WARN: Code duplicated, block: B:134:0x0a4b  */
                /* JADX WARN: Code duplicated, block: B:137:0x0a74  */
                /* JADX WARN: Code duplicated, block: B:138:0x0a77  */
                /* JADX WARN: Code duplicated, block: B:141:0x0b26  */
                /* JADX WARN: Code duplicated, block: B:142:0x0b2a  */
                /* JADX WARN: Code duplicated, block: B:146:0x0b51  */
                /* JADX WARN: Code duplicated, block: B:149:0x0b6b  */
                /* JADX WARN: Code duplicated, block: B:160:0x0ba6 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:162:0x0baa  */
                /* JADX WARN: Code duplicated, block: B:165:0x0bc1  */
                /* JADX WARN: Code duplicated, block: B:167:0x0bcb  */
                /* JADX WARN: Code duplicated, block: B:169:0x0bd7  */
                /* JADX WARN: Code duplicated, block: B:173:0x0c17  */
                /* JADX WARN: Code duplicated, block: B:176:0x0c1e  */
                /* JADX WARN: Code duplicated, block: B:177:0x0c22  */
                /* JADX WARN: Code duplicated, block: B:183:0x0cd9  */
                /* JADX WARN: Code duplicated, block: B:184:0x0cdd  */
                /* JADX WARN: Code duplicated, block: B:187:0x0cff A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:189:0x0d03  */
                /* JADX WARN: Code duplicated, block: B:192:0x0d1d  */
                /* JADX WARN: Code duplicated, block: B:194:0x0d60 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:195:0x0d62  */
                /* JADX WARN: Code duplicated, block: B:198:0x0d9b  */
                /* JADX WARN: Code duplicated, block: B:200:0x0daa  */
                /* JADX WARN: Code duplicated, block: B:207:0x0b92 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:208:0x0b8e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:212:0x0b87 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:213:0x0b7c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:216:0x0b65 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j2;
                    float f2;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    GithubRelease githubRelease2;
                    boolean z8;
                    GithubRelease githubRelease3;
                    or orVar;
                    int i4;
                    float f3;
                    ov0 ov0Var2;
                    boolean z9;
                    boolean z10;
                    Long l2;
                    c30 c30Var;
                    kg3 kg3Var;
                    c30 c30Var2;
                    nr nrVar;
                    au0 au0Var5;
                    ov0 ov0Var3;
                    u92 u92Var;
                    String str;
                    ov0 ov0Var4;
                    Set<String> setH0;
                    String str2;
                    Object obj4;
                    String str3;
                    av1 av1Var;
                    GithubRelease githubRelease4;
                    x30 x30Var;
                    boolean z11;
                    ov0 ov0Var5;
                    lu0 lu0Var2;
                    boolean zF;
                    Object objQ;
                    Set<String> set;
                    Object obj5;
                    x30 x30Var2;
                    int i5;
                    c30 c30Var3;
                    String str4;
                    og3 og3Var2;
                    char c2;
                    Iterator it;
                    String str5;
                    Iterator<T> it2;
                    Object next;
                    UpdateArtifact updateArtifact;
                    boolean z12;
                    String str6;
                    Object obj6;
                    long jC;
                    boolean zF2;
                    Object objQ2;
                    boolean z13;
                    c30 c30Var4;
                    UpdateArtifact updateArtifact2;
                    c30 c30Var5;
                    int i6;
                    int i7;
                    kg3 kg3Var2;
                    boolean z14;
                    boolean z15;
                    boolean z16;
                    or orVar2 = j9.o;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    u92 u92Var2 = am1.i;
                    or orVar3 = j9.p;
                    nr nrVar2 = j9.r;
                    ((zz) obj).getClass();
                    ov0 ov0Var6 = (ov0) f30Var2;
                    if (ov0Var6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        av1 av1Var2 = av1.a;
                        dv1 dv1VarE = iw2.e(av1Var2, 1.0f);
                        yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), nrVar2, ov0Var6, 6);
                        int iHashCode = Long.hashCode(ov0Var6.T);
                        l72 l72VarL = ov0Var6.l();
                        dv1 dv1VarH = xp1.H(ov0Var6, dv1VarE);
                        w20.b.getClass();
                        x30 x30Var3 = v20.b;
                        ov0Var6.g0();
                        if (ov0Var6.S) {
                            ov0Var6.k(x30Var3);
                        } else {
                            ov0Var6.p0();
                        }
                        gh ghVar = v20.e;
                        q73.h(ov0Var6, ghVar, yzVarA);
                        gh ghVar2 = v20.d;
                        q73.h(ov0Var6, ghVar2, l72VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        gh ghVar3 = v20.f;
                        q73.h(ov0Var6, ghVar3, numValueOf);
                        wa waVar = v20.g;
                        q73.g(ov0Var6, waVar);
                        gh ghVar4 = v20.c;
                        q73.h(ov0Var6, ghVar4, dv1VarH);
                        dv1 dv1VarE2 = iw2.e(av1Var2, 1.0f);
                        kk2 kk2VarA = jk2.a(u92Var2, orVar3, ov0Var6, 54);
                        int iHashCode2 = Long.hashCode(ov0Var6.T);
                        l72 l72VarL2 = ov0Var6.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var6, dv1VarE2);
                        ov0Var6.g0();
                        if (ov0Var6.S) {
                            ov0Var6.k(x30Var3);
                        } else {
                            ov0Var6.p0();
                        }
                        q73.h(ov0Var6, ghVar, kk2VarA);
                        q73.h(ov0Var6, ghVar2, l72VarL2);
                        az2.s(iHashCode2, ov0Var6, ghVar3, ov0Var6, waVar);
                        q73.h(ov0Var6, ghVar4, dv1VarH2);
                        yz yzVarA2 = wz.a(am1.g, nrVar2, ov0Var6, 0);
                        int iHashCode3 = Long.hashCode(ov0Var6.T);
                        l72 l72VarL3 = ov0Var6.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var6, av1Var2);
                        ov0Var6.g0();
                        if (ov0Var6.S) {
                            ov0Var6.k(x30Var3);
                        } else {
                            ov0Var6.p0();
                        }
                        q73.h(ov0Var6, ghVar, yzVarA2);
                        q73.h(ov0Var6, ghVar2, l72VarL3);
                        az2.s(iHashCode3, ov0Var6, ghVar3, ov0Var6, waVar);
                        q73.h(ov0Var6, ghVar4, dv1VarH3);
                        String strN = ke0.N(2131624028, ov0Var6);
                        long jC2 = v63.c(18);
                        jr0 jr0Var = jr0.j;
                        s83.b(strN, null, dh0.p(ov0Var6).q, jC2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                        gh0.h(ov0Var6, iw2.g(av1Var2, 2.0f));
                        s83.b("Location Spoofer", null, hz.c(0.5f, dh0.p(ov0Var6).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24582, 0, 262122);
                        ov0Var6.p(true);
                        String strQ0 = l13.q0(l13.q0(l13.D0("3.0.16").toString(), "v"), "V");
                        kk2 kk2VarA2 = jk2.a(new jo(6.0f, true, new fo(0)), orVar3, ov0Var6, 54);
                        int iHashCode4 = Long.hashCode(ov0Var6.T);
                        l72 l72VarL4 = ov0Var6.l();
                        dv1 dv1VarH4 = xp1.H(ov0Var6, av1Var2);
                        ov0Var6.g0();
                        if (ov0Var6.S) {
                            ov0Var6.k(x30Var3);
                        } else {
                            ov0Var6.p0();
                        }
                        q73.h(ov0Var6, ghVar, kk2VarA2);
                        q73.h(ov0Var6, ghVar2, l72VarL4);
                        az2.s(iHashCode4, ov0Var6, ghVar3, ov0Var6, waVar);
                        q73.h(ov0Var6, ghVar4, dv1VarH4);
                        ks.H(null, ov0Var6, 0);
                        dv1 dv1VarN = xp1.n(av1Var2, cj2.a(8.0f));
                        if (z3) {
                            j2 = hz.c;
                            f2 = 0.08f;
                        } else {
                            j2 = hz.b;
                            f2 = 0.05f;
                        }
                        long jC3 = hz.c(f2, j2);
                        iy0 iy0Var = o51.p0;
                        dv1 dv1VarE3 = zm3.E(xp1.k(dv1VarN, jC3, iy0Var), 8.0f, 4.0f);
                        pr prVar = j9.f;
                        er1 er1VarC = ws.c(prVar, false);
                        int iHashCode5 = Long.hashCode(ov0Var6.T);
                        l72 l72VarL5 = ov0Var6.l();
                        dv1 dv1VarH5 = xp1.H(ov0Var6, dv1VarE3);
                        ov0Var6.g0();
                        if (ov0Var6.S) {
                            ov0Var6.k(x30Var3);
                        } else {
                            ov0Var6.p0();
                        }
                        q73.h(ov0Var6, ghVar, er1VarC);
                        q73.h(ov0Var6, ghVar2, l72VarL5);
                        az2.s(iHashCode5, ov0Var6, ghVar3, ov0Var6, waVar);
                        q73.h(ov0Var6, ghVar4, dv1VarH5);
                        String strConcat = "v".concat(strQ0);
                        long jC4 = v63.c(12);
                        jr0 jr0Var2 = jr0.i;
                        s83.b(strConcat, null, hz.c(0.8f, dh0.p(ov0Var6).q), jC4, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                        ov0Var6.p(true);
                        ov0Var6.p(true);
                        ov0Var6.p(true);
                        ld0.g(null, 0.0f, hz.c(0.06f, dh0.p(ov0Var6).q), ov0Var6, 0);
                        kk2 kk2VarA3 = jk2.a(new jo(8.0f, true, new fo(0)), orVar3, ov0Var6, 54);
                        int iHashCode6 = Long.hashCode(ov0Var6.T);
                        l72 l72VarL6 = ov0Var6.l();
                        dv1 dv1VarH6 = xp1.H(ov0Var6, av1Var2);
                        ov0Var6.g0();
                        if (ov0Var6.S) {
                            ov0Var6.k(x30Var3);
                        } else {
                            ov0Var6.p0();
                        }
                        q73.h(ov0Var6, ghVar, kk2VarA3);
                        q73.h(ov0Var6, ghVar2, l72VarL6);
                        az2.s(iHashCode6, ov0Var6, ghVar3, ov0Var6, waVar);
                        q73.h(ov0Var6, ghVar4, dv1VarH6);
                        og3 og3Var3 = og3Var;
                        boolean z17 = og3Var3.a;
                        boolean z18 = og3Var3.n;
                        boolean z19 = og3Var3.k;
                        boolean z20 = og3Var3.j;
                        int i8 = og3Var3.g;
                        String str7 = og3Var3.b;
                        GithubRelease githubRelease5 = githubRelease;
                        boolean z21 = z2;
                        if (z17) {
                            ov0Var6.c0(1176719183);
                            z4 = z18;
                            z5 = z19;
                            z6 = z21;
                            githubRelease2 = githubRelease5;
                            orVar = orVar3;
                            z7 = z20;
                            z8 = z17;
                            vc2.a(iw2.k(av1Var2, 13.0f), bk.g, 2.0f, 0L, 0, 0.0f, ov0Var6, 438, 56);
                            s83.b(ke0.N(2131624110, ov0Var6), null, hz.c(0.7f, dh0.p(ov0Var6).q), v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                            ov0Var2 = ov0Var6;
                            ov0Var2.p(false);
                        } else {
                            z4 = z18;
                            z5 = z19;
                            z6 = z21;
                            z7 = z20;
                            githubRelease2 = githubRelease5;
                            z8 = z17;
                            if (str7 != null) {
                                ov0Var6.c0(1177240045);
                                ws.a(xp1.k(xp1.n(iw2.k(av1Var2, 7.0f), cj2.a), dh0.p(ov0Var6).w, iy0Var), ov0Var6, 0);
                                orVar = orVar3;
                                s83.b(ke0.N(ji2.A(str7), ov0Var6), null, dh0.p(ov0Var6).w, v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                                ov0Var2 = ov0Var6;
                                ov0Var2.p(false);
                            } else {
                                if (!z6 || githubRelease2 == null) {
                                    githubRelease3 = githubRelease2;
                                    orVar = orVar3;
                                    i4 = i8;
                                    f3 = 4.0f;
                                    ov0Var6.c0(1179328019);
                                    dv1 dv1VarN2 = xp1.n(iw2.k(av1Var2, 7.0f), cj2.a);
                                    long j3 = bk.h;
                                    ws.a(xp1.k(dv1VarN2, j3, iy0Var), ov0Var6, 0);
                                    s83.b(ke0.N(githubRelease3 == null ? 2131624808 : 2131624005, ov0Var6), null, j3, v63.c(13), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597824, 0, 262058);
                                    ov0Var2 = ov0Var6;
                                    ov0Var2.p(false);
                                } else {
                                    ov0Var6.c0(1177870213);
                                    String strQ1 = l13.q0(l13.q0(l13.D0(githubRelease2.getVersionName()).toString(), "v"), "V");
                                    ws.a(xp1.k(xp1.n(iw2.k(av1Var2, 8.0f), cj2.a), xp1.d(4293212469L), iy0Var), ov0Var6, 0);
                                    githubRelease3 = githubRelease2;
                                    orVar = orVar3;
                                    i4 = i8;
                                    s83.b(ke0.O(2131624789, new Object[]{strQ1}, ov0Var6), null, xp1.d(4293212469L), v63.c(13), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597824, 0, 262058);
                                    if (githubRelease3.isPrerelease()) {
                                        ov0Var2.c0(1178566380);
                                        gh0.h(ov0Var2, iw2.o(av1Var2, 4.0f));
                                        dv1 dv1VarE4 = zm3.E(xp1.k(xp1.n(av1Var2, cj2.a(4.0f)), hz.c(0.15f, xp1.d(4294940672L)), iy0Var), 6.0f, 2.0f);
                                        er1 er1VarC2 = ws.c(prVar, false);
                                        int iHashCode7 = Long.hashCode(ov0Var2.T);
                                        l72 l72VarL7 = ov0Var2.l();
                                        dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarE4);
                                        ov0Var2.g0();
                                        if (ov0Var2.S) {
                                            ov0Var2 = ov0Var6;
                                            ov0Var2.k(x30Var3);
                                        } else {
                                            ov0Var2 = ov0Var6;
                                            ov0Var2.p0();
                                        }
                                        q73.h(ov0Var2, ghVar, er1VarC2);
                                        q73.h(ov0Var2, ghVar2, l72VarL7);
                                        az2.s(iHashCode7, ov0Var2, ghVar3, ov0Var2, waVar);
                                        q73.h(ov0Var2, ghVar4, dv1VarH7);
                                        f3 = 4.0f;
                                        s83.b(ke0.N(2131624821, ov0Var2), null, xp1.d(4294940672L), v63.b(10.5d), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597824, 0, 262058);
                                        ov0Var2 = ov0Var2;
                                        ov0Var2.p(true);
                                        z10 = false;
                                    } else {
                                        ov0Var2 = ov0Var6;
                                        z10 = false;
                                        f3 = 4.0f;
                                        ov0Var2.c0(1161629561);
                                    }
                                    ov0Var2.p(z10);
                                    ov0Var2.p(z10);
                                }
                                z9 = true;
                            }
                            ov0Var2.p(z9);
                            l2 = og3Var3.d;
                            c30Var = d30.a;
                            if (l2 == null && yo.H0(new Integer[]{2, 8}).contains(Integer.valueOf(i4))) {
                                ov0Var2.c0(-2021094323);
                                UpdateArtifact updateArtifact3 = og3Var3.i;
                                if (updateArtifact3 == null) {
                                    ov0Var2.c0(-2021146497);
                                    i6 = 0;
                                    ov0Var2.p(false);
                                    c30Var5 = c30Var;
                                    i7 = 8;
                                } else {
                                    ov0Var2.c0(-2021146496);
                                    ov0 ov0Var7 = ov0Var2;
                                    c30Var5 = c30Var;
                                    s83.b(ke0.O(2131625150, new Object[]{updateArtifact3.getVersionName(), ke0.N(o51.f(updateArtifact3.getScheme(), "global") ? 2131624954 : 2131624955, ov0Var2), ke0.N(o51.f(updateArtifact3.getAbi(), "arm64-v8a") ? 2131625136 : 2131625135, ov0Var2)}, ov0Var2), null, dh0.p(ov0Var2).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var2).l, ov0Var7, 0, 0, 131066);
                                    ov0Var2 = ov0Var7;
                                    i6 = 0;
                                    ov0Var2.p(false);
                                    i7 = 8;
                                }
                                if (i4 == i7) {
                                    ov0Var2.c0(-2020536323);
                                    kk2 kk2VarA4 = jk2.a(new jo(10.0f, true, new fo(i6)), orVar2, ov0Var2, 6);
                                    int iHashCode8 = Long.hashCode(ov0Var2.T);
                                    l72 l72VarL8 = ov0Var2.l();
                                    dv1 dv1VarH8 = xp1.H(ov0Var2, av1Var2);
                                    ov0Var2.g0();
                                    if (ov0Var2.S) {
                                        ov0Var2.k(x30Var3);
                                    } else {
                                        ov0Var2.p0();
                                    }
                                    q73.h(ov0Var2, ghVar, kk2VarA4);
                                    q73.h(ov0Var2, ghVar2, l72VarL8);
                                    az2.s(iHashCode8, ov0Var2, ghVar3, ov0Var2, waVar);
                                    q73.h(ov0Var2, ghVar4, dv1VarH8);
                                    if (z7) {
                                        ov0Var2.c0(1354101835);
                                        bj2 bj2VarA = cj2.a(12.0f);
                                        b52 b52Var = hu.a;
                                        ov0 ov0Var8 = ov0Var2;
                                        kg3Var2 = this;
                                        n51.a(au0Var2, null, !z5, bj2VarA, hu.a(bk.h, 0L, 0L, 0L, ov0Var8, 14), null, null, null, am1.y, ov0Var8, 805306368, 482);
                                        ov0Var2 = ov0Var8;
                                        z14 = false;
                                    } else {
                                        kg3Var2 = this;
                                        z14 = false;
                                        ov0Var2.c0(1334808024);
                                    }
                                    ov0Var2.p(z14);
                                    ov0 ov0Var9 = ov0Var2;
                                    n51.h(au0Var3, null, !z5, cj2.a(12.0f), null, null, null, sb.a0(1882358456, new au(og3Var3, 15), ov0Var2), ov0Var9, 805306368, 498);
                                    ov0Var5 = ov0Var9;
                                    ov0Var5.p(true);
                                    if (z7) {
                                        z15 = false;
                                        ov0Var5.c0(-2039721634);
                                    } else {
                                        ov0Var5.c0(-2019712405);
                                        s83.b(ke0.N(2131625146, ov0Var5), null, dh0.p(ov0Var5).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var5).l, ov0Var5, 0, 0, 131066);
                                        ov0Var5 = ov0Var5;
                                        z15 = false;
                                    }
                                    ov0Var5.p(z15);
                                    if (og3Var3.l) {
                                        ov0Var5.c0(-2019488430);
                                        ov0 ov0Var10 = ov0Var5;
                                        s83.b(ke0.N(2131625144, ov0Var5), null, bk.h, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var5).l, ov0Var10, 384, 0, 131066);
                                        ov0Var5 = ov0Var10;
                                        z16 = false;
                                    } else {
                                        z16 = false;
                                        ov0Var5.c0(-2039721634);
                                    }
                                    ov0Var5.p(z16);
                                    ov0Var5.p(z16);
                                } else {
                                    ov0Var2.c0(-2019277506);
                                    dv1 dv1VarE5 = iw2.e(av1Var2, 1.0f);
                                    c30 c30Var6 = c30Var5;
                                    yz yzVarA3 = wz.a(new jo(6.0f, true, new fo(i6)), nrVar2, ov0Var2, 6);
                                    int iHashCode9 = Long.hashCode(ov0Var2.T);
                                    l72 l72VarL9 = ov0Var2.l();
                                    dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarE5);
                                    ov0Var2.g0();
                                    if (ov0Var2.S) {
                                        ov0Var2.k(x30Var3);
                                    } else {
                                        ov0Var2.p0();
                                    }
                                    q73.h(ov0Var2, ghVar, yzVarA3);
                                    q73.h(ov0Var2, ghVar2, l72VarL9);
                                    az2.s(iHashCode9, ov0Var2, ghVar3, ov0Var2, waVar);
                                    q73.h(ov0Var2, ghVar4, dv1VarH9);
                                    dv1 dv1VarE6 = iw2.e(av1Var2, 1.0f);
                                    kk2 kk2VarA5 = jk2.a(u92Var2, orVar, ov0Var2, 54);
                                    int iHashCode10 = Long.hashCode(ks.U(ov0Var2));
                                    l72 l72VarZ = ov0Var2.z();
                                    dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE6);
                                    ov0Var2.g0();
                                    if (ov0Var2.D()) {
                                        ov0Var2.k(x30Var3);
                                    } else {
                                        ov0Var2.p0();
                                    }
                                    q73.h(ov0Var2, ghVar, kk2VarA5);
                                    q73.h(ov0Var2, ghVar2, l72VarZ);
                                    az2.s(iHashCode10, ov0Var2, ghVar3, ov0Var2, waVar);
                                    q73.h(ov0Var2, ghVar4, dv1VarH10);
                                    ov0 ov0Var11 = ov0Var2;
                                    s83.b(ke0.O(2131624399, new Object[]{Integer.valueOf(og3Var3.f)}, ov0Var2), null, hz.c(0.8f, dh0.p(ov0Var11).q), v63.b(12.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 24576, 0, 262122);
                                    s83.b(ke0.N(2131624085, ov0Var11), bk.a(av1Var2, au0Var4), dh0.p(ov0Var11).w, v63.b(12.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 24576, 0, 262120);
                                    ov0Var11.r();
                                    boolean zH = ov0Var11.h(og3Var3);
                                    Object objQ3 = ov0Var11.Q();
                                    if (zH || objQ3 == c30Var6) {
                                        objQ3 = new ol2(og3Var3, 16);
                                        ov0Var11.m0(objQ3);
                                    }
                                    vc2.b((au0) objQ3, xp1.n(iw2.g(iw2.e(av1Var2, 1.0f), 6.0f), cj2.a(3.0f)), bk.g, dh0.p(ov0Var11).r, 0, 0.0f, null, ov0Var11, 384, 112);
                                    ov0Var5 = ov0Var11;
                                    ov0Var5.r();
                                    ov0Var5.s();
                                }
                                ov0Var5.s();
                            } else {
                                kg3Var = this;
                                c30Var2 = c30Var;
                                nrVar = nrVar2;
                                au0Var5 = au0Var;
                                if (githubRelease3 != null) {
                                    ov0Var2.c0(-2017478421);
                                    ov0 ov0Var12 = ov0Var2;
                                    u92Var = u92Var2;
                                    str = "global";
                                    s83.b(ke0.O(2131625139, new Object[]{githubRelease3.getVersionName()}, ov0Var2), null, dh0.p(ov0Var2).q, 0L, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 1572864, 0, 262074);
                                    s83.b(ke0.N(2131625140, ov0Var12), null, dh0.p(ov0Var12).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var12).l, ov0Var12, 0, 0, 131066);
                                    ov0Var4 = ov0Var12;
                                    String[] strArr = Build.SUPPORTED_ABIS;
                                    strArr.getClass();
                                    setH0 = yo.H0(strArr);
                                    str2 = "armeabi-v7a";
                                    if (setH0.contains("arm64-v8a")) {
                                        obj4 = "arm64-v8a";
                                    } else {
                                        obj4 = "armeabi-v7a";
                                    }
                                    ov0Var4.c0(73487119);
                                    if (o51.f(str, str)) {
                                        str3 = "scoped";
                                    } else {
                                        str3 = str;
                                    }
                                    for (String str8 : am1.G(str, str3)) {
                                        set = setH0;
                                        obj5 = obj4;
                                        or orVar4 = orVar;
                                        yz yzVarA4 = wz.a(new jo(6.0f, true, new fo(0)), nrVar, ov0Var4, 6);
                                        int iHashCode11 = Long.hashCode(ks.U(ov0Var4));
                                        l72 l72VarZ2 = ov0Var4.z();
                                        dv1 dv1VarH11 = xp1.H(ov0Var4, av1Var2);
                                        w20.b.getClass();
                                        nr nrVar3 = nrVar;
                                        x30Var2 = v20.b;
                                        ov0Var4.g0();
                                        if (ov0Var4.D()) {
                                            ov0Var4.k(x30Var2);
                                        } else {
                                            ov0Var4.p0();
                                        }
                                        av1 av1Var3 = av1Var2;
                                        gh ghVar5 = v20.e;
                                        q73.h(ov0Var4, ghVar5, yzVarA4);
                                        gh ghVar6 = v20.d;
                                        q73.h(ov0Var4, ghVar6, l72VarZ2);
                                        Integer numValueOf2 = Integer.valueOf(iHashCode11);
                                        gh ghVar7 = v20.f;
                                        q73.h(ov0Var4, ghVar7, numValueOf2);
                                        wa waVar2 = v20.g;
                                        q73.g(ov0Var4, waVar2);
                                        gh ghVar8 = v20.c;
                                        q73.h(ov0Var4, ghVar8, dv1VarH11);
                                        if (o51.f(str8, str)) {
                                            i5 = 2131624954;
                                        } else {
                                            i5 = 2131624955;
                                        }
                                        String str9 = str2;
                                        ov0 ov0Var13 = ov0Var4;
                                        u92 u92Var3 = u92Var;
                                        c30Var3 = c30Var2;
                                        str4 = str;
                                        s83.b(ke0.N(i5, ov0Var4), null, ((kz) ov0Var4.j(mz.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(le3.a)).m, ov0Var13, 0, 0, 131066);
                                        ov0Var4 = ov0Var13;
                                        dv1 dv1VarE7 = iw2.e(av1Var3, 1.0f);
                                        og3Var2 = og3Var3;
                                        c2 = 0;
                                        kk2 kk2VarA6 = jk2.a(new jo(10.0f, true, new fo(0)), orVar2, ov0Var4, 6);
                                        int iHashCode12 = Long.hashCode(ks.U(ov0Var4));
                                        l72 l72VarZ3 = ov0Var4.z();
                                        dv1 dv1VarH12 = xp1.H(ov0Var4, dv1VarE7);
                                        ov0Var4.g0();
                                        if (ov0Var4.D()) {
                                            ov0Var4.k(x30Var2);
                                        } else {
                                            ov0Var4.p0();
                                        }
                                        q73.h(ov0Var4, ghVar5, kk2VarA6);
                                        q73.h(ov0Var4, ghVar6, l72VarZ3);
                                        az2.s(iHashCode12, ov0Var4, ghVar7, ov0Var4, waVar2);
                                        q73.h(ov0Var4, ghVar8, dv1VarH12);
                                        ov0Var4.c0(-1193467192);
                                        it = am1.G("arm64-v8a", str9).iterator();
                                        while (it.hasNext()) {
                                            str5 = (String) it.next();
                                            ov0Var4.c0(1657268842);
                                            it2 = githubRelease3.getUpdateArtifacts().iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it2.next();
                                                updateArtifact2 = (UpdateArtifact) next;
                                                if (!o51.f(updateArtifact2.getScheme(), str8) && o51.f(updateArtifact2.getAbi(), str5)) {
                                                    break;
                                                }
                                            }
                                            updateArtifact = (UpdateArtifact) next;
                                            if (updateArtifact == null) {
                                                ov0Var4.s();
                                            } else {
                                                og3 og3Var4 = og3Var2;
                                                boolean zCanInstall = UpdatePackagePolicy.INSTANCE.canInstall(updateArtifact, og3Var4.h, set, true);
                                                if (!z8 || z4) {
                                                    z12 = false;
                                                } else {
                                                    z12 = true;
                                                }
                                                wb1 wb1Var = new wb1(1.0f, true);
                                                bj2 bj2VarA2 = cj2.a(12.0f);
                                                b52 b52Var2 = hu.a;
                                                str6 = str4;
                                                if (o51.f(str8, str6)) {
                                                    obj6 = obj5;
                                                    str4 = str6;
                                                    if (o51.f(str5, obj6)) {
                                                        jC = hz.c(0.1f, bk.g);
                                                    }
                                                    Object obj7 = obj6;
                                                    gu guVarE = hu.e(jC, bk.g, ov0Var4, 12);
                                                    b52 b52Var3 = new b52(8.0f, 8.0f, 8.0f, 8.0f);
                                                    pu0 pu0Var2 = pu0Var;
                                                    Iterator it3 = it;
                                                    GithubRelease githubRelease6 = githubRelease3;
                                                    zF2 = ov0Var4.f(pu0Var2) | ov0Var4.h(updateArtifact) | ov0Var4.h(githubRelease6);
                                                    objQ2 = ov0Var4.Q();
                                                    if (zF2) {
                                                        z13 = z12;
                                                        c30Var4 = c30Var3;
                                                    } else {
                                                        z13 = z12;
                                                        c30Var4 = c30Var3;
                                                        if (objQ2 == c30Var4) {
                                                        }
                                                        ov0 ov0Var14 = ov0Var4;
                                                        n51.h((au0) objQ2, wb1Var, z13, bj2VarA2, guVarE, null, b52Var3, sb.a0(-377021840, new da1(str5, zCanInstall, 2), ov0Var4), ov0Var14, 817889280, 352);
                                                        ov0Var4 = ov0Var14;
                                                        ov0Var4.s();
                                                        githubRelease3 = githubRelease6;
                                                        c30Var3 = c30Var4;
                                                        c2 = 0;
                                                        it = it3;
                                                        obj5 = obj7;
                                                        og3Var2 = og3Var4;
                                                    }
                                                    objQ2 = new gg3(pu0Var2, updateArtifact, githubRelease6, 1);
                                                    ov0Var4.m0(objQ2);
                                                    ov0 ov0Var15 = ov0Var4;
                                                    n51.h((au0) objQ2, wb1Var, z13, bj2VarA2, guVarE, null, b52Var3, sb.a0(-377021840, new da1(str5, zCanInstall, 2), ov0Var4), ov0Var15, 817889280, 352);
                                                    ov0Var4 = ov0Var15;
                                                    ov0Var4.s();
                                                    githubRelease3 = githubRelease6;
                                                    c30Var3 = c30Var4;
                                                    c2 = 0;
                                                    it = it3;
                                                    obj5 = obj7;
                                                    og3Var2 = og3Var4;
                                                } else {
                                                    obj6 = obj5;
                                                    str4 = str6;
                                                }
                                                jC = hz.f;
                                                Object obj8 = obj6;
                                                gu guVarE2 = hu.e(jC, bk.g, ov0Var4, 12);
                                                b52 b52Var4 = new b52(8.0f, 8.0f, 8.0f, 8.0f);
                                                pu0 pu0Var3 = pu0Var;
                                                Iterator it4 = it;
                                                GithubRelease githubRelease7 = githubRelease3;
                                                zF2 = ov0Var4.f(pu0Var3) | ov0Var4.h(updateArtifact) | ov0Var4.h(githubRelease7);
                                                objQ2 = ov0Var4.Q();
                                                if (zF2) {
                                                    z13 = z12;
                                                    c30Var4 = c30Var3;
                                                    if (objQ2 == c30Var4) {
                                                    }
                                                    ov0 ov0Var16 = ov0Var4;
                                                    n51.h((au0) objQ2, wb1Var, z13, bj2VarA2, guVarE2, null, b52Var4, sb.a0(-377021840, new da1(str5, zCanInstall, 2), ov0Var4), ov0Var16, 817889280, 352);
                                                    ov0Var4 = ov0Var16;
                                                    ov0Var4.s();
                                                    githubRelease3 = githubRelease7;
                                                    c30Var3 = c30Var4;
                                                    c2 = 0;
                                                    it = it4;
                                                    obj5 = obj8;
                                                    og3Var2 = og3Var4;
                                                } else {
                                                    z13 = z12;
                                                    c30Var4 = c30Var3;
                                                }
                                                objQ2 = new gg3(pu0Var3, updateArtifact, githubRelease7, 1);
                                                ov0Var4.m0(objQ2);
                                                ov0 ov0Var17 = ov0Var4;
                                                n51.h((au0) objQ2, wb1Var, z13, bj2VarA2, guVarE2, null, b52Var4, sb.a0(-377021840, new da1(str5, zCanInstall, 2), ov0Var4), ov0Var17, 817889280, 352);
                                                ov0Var4 = ov0Var17;
                                                ov0Var4.s();
                                                githubRelease3 = githubRelease7;
                                                c30Var3 = c30Var4;
                                                c2 = 0;
                                                it = it4;
                                                obj5 = obj8;
                                                og3Var2 = og3Var4;
                                            }
                                        }
                                        kg3Var = this;
                                        ov0Var4.s();
                                        ov0Var4.r();
                                        ov0Var4.r();
                                        c30Var2 = c30Var3;
                                        str2 = str9;
                                        obj4 = obj5;
                                        og3Var3 = og3Var2;
                                        orVar = orVar4;
                                        nrVar = nrVar3;
                                        av1Var2 = av1Var3;
                                        u92Var = u92Var3;
                                        str = str4;
                                        setH0 = set;
                                    }
                                    av1Var = av1Var2;
                                    c30 c30Var7 = c30Var2;
                                    githubRelease4 = githubRelease3;
                                    ov0Var4.s();
                                    dv1 dv1VarE8 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA7 = jk2.a(u92Var, orVar, ov0Var4, 54);
                                    int iHashCode13 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ4 = ov0Var4.z();
                                    dv1 dv1VarH13 = xp1.H(ov0Var4, dv1VarE8);
                                    w20.b.getClass();
                                    x30Var = v20.b;
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, v20.e, kk2VarA7);
                                    q73.h(ov0Var4, v20.d, l72VarZ4);
                                    q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode13));
                                    q73.g(ov0Var4, v20.g);
                                    q73.h(ov0Var4, v20.c, dv1VarH13);
                                    if (!z8 || z4) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    ov0 ov0Var18 = ov0Var4;
                                    n51.j(au0Var5, null, z11, null, null, null, am1.z, ov0Var18, 805306368, 506);
                                    ov0Var5 = ov0Var18;
                                    if (z6) {
                                        ov0Var5.c0(-2053205755);
                                        String strN2 = ke0.N(2131624549, ov0Var5);
                                        long jB = v63.b(12.5d);
                                        long jC5 = hz.c(0.45f, ((kz) ov0Var5.j(mz.a)).q);
                                        dv1 dv1VarG = zm3.G(av1Var, 0.0f, 0.0f, f3, 0.0f, 11);
                                        lu0Var2 = lu0Var;
                                        zF = ov0Var5.f(lu0Var2) | ov0Var5.h(githubRelease4);
                                        objQ = ov0Var5.Q();
                                        if (zF || objQ == c30Var7) {
                                            objQ = new qi2(18, lu0Var2, githubRelease4);
                                            ov0Var5.m0(objQ);
                                        }
                                        s83.b(strN2, bk.a(dv1VarG, (au0) objQ), jC5, jB, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262120);
                                        ov0Var5 = ov0Var5;
                                    } else {
                                        ov0Var5.c0(-2078817242);
                                    }
                                    ov0Var5.s();
                                    ov0Var5.r();
                                    ov0Var5.s();
                                } else {
                                    ov0Var2.c0(-2013659190);
                                    ov0Var3 = ov0Var2;
                                    n51.h(au0Var5, iw2.g(av1Var2, 38.0f), false, cj2.a(12.0f), null, null, new b52(20.0f, 8.0f, 20.0f, 8.0f), am1.A, ov0Var3, 817889328, 372);
                                    ov0Var3.s();
                                }
                                ov0Var3.r();
                            }
                            ov0Var3 = ov0Var5;
                            ov0Var3.r();
                        }
                        githubRelease3 = githubRelease2;
                        i4 = i8;
                        z9 = true;
                        f3 = 4.0f;
                        ov0Var2.p(z9);
                        l2 = og3Var3.d;
                        c30Var = d30.a;
                        if (l2 == null) {
                            kg3Var = this;
                            c30Var2 = c30Var;
                            nrVar = nrVar2;
                            au0Var5 = au0Var;
                            if (githubRelease3 != null) {
                                ov0Var2.c0(-2017478421);
                                ov0 ov0Var19 = ov0Var2;
                                u92Var = u92Var2;
                                str = "global";
                                s83.b(ke0.O(2131625139, new Object[]{githubRelease3.getVersionName()}, ov0Var2), null, dh0.p(ov0Var2).q, 0L, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var19, 1572864, 0, 262074);
                                s83.b(ke0.N(2131625140, ov0Var19), null, dh0.p(ov0Var19).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var19).l, ov0Var19, 0, 0, 131066);
                                ov0Var4 = ov0Var19;
                                String[] strArr2 = Build.SUPPORTED_ABIS;
                                strArr2.getClass();
                                setH0 = yo.H0(strArr2);
                                str2 = "armeabi-v7a";
                                if (setH0.contains("arm64-v8a")) {
                                    obj4 = "arm64-v8a";
                                } else {
                                    obj4 = "armeabi-v7a";
                                }
                                ov0Var4.c0(73487119);
                                if (o51.f(str, str)) {
                                    str3 = "scoped";
                                } else {
                                    str3 = str;
                                }
                                while (r38.hasNext()) {
                                    set = setH0;
                                    obj5 = obj4;
                                    or orVar5 = orVar;
                                    yz yzVarA5 = wz.a(new jo(6.0f, true, new fo(0)), nrVar, ov0Var4, 6);
                                    int iHashCode14 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ5 = ov0Var4.z();
                                    dv1 dv1VarH14 = xp1.H(ov0Var4, av1Var2);
                                    w20.b.getClass();
                                    nr nrVar4 = nrVar;
                                    x30Var2 = v20.b;
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    av1 av1Var4 = av1Var2;
                                    gh ghVar9 = v20.e;
                                    q73.h(ov0Var4, ghVar9, yzVarA5);
                                    gh ghVar10 = v20.d;
                                    q73.h(ov0Var4, ghVar10, l72VarZ5);
                                    Integer numValueOf3 = Integer.valueOf(iHashCode14);
                                    gh ghVar11 = v20.f;
                                    q73.h(ov0Var4, ghVar11, numValueOf3);
                                    wa waVar3 = v20.g;
                                    q73.g(ov0Var4, waVar3);
                                    gh ghVar12 = v20.c;
                                    q73.h(ov0Var4, ghVar12, dv1VarH14);
                                    if (o51.f(str8, str)) {
                                        i5 = 2131624954;
                                    } else {
                                        i5 = 2131624955;
                                    }
                                    String str10 = str2;
                                    ov0 ov0Var110 = ov0Var4;
                                    u92 u92Var4 = u92Var;
                                    c30Var3 = c30Var2;
                                    str4 = str;
                                    s83.b(ke0.N(i5, ov0Var4), null, ((kz) ov0Var4.j(mz.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(le3.a)).m, ov0Var110, 0, 0, 131066);
                                    ov0Var4 = ov0Var110;
                                    dv1 dv1VarE9 = iw2.e(av1Var4, 1.0f);
                                    og3Var2 = og3Var3;
                                    c2 = 0;
                                    kk2 kk2VarA8 = jk2.a(new jo(10.0f, true, new fo(0)), orVar2, ov0Var4, 6);
                                    int iHashCode15 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ6 = ov0Var4.z();
                                    dv1 dv1VarH15 = xp1.H(ov0Var4, dv1VarE9);
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar9, kk2VarA8);
                                    q73.h(ov0Var4, ghVar10, l72VarZ6);
                                    az2.s(iHashCode15, ov0Var4, ghVar11, ov0Var4, waVar3);
                                    q73.h(ov0Var4, ghVar12, dv1VarH15);
                                    ov0Var4.c0(-1193467192);
                                    it = am1.G("arm64-v8a", str10).iterator();
                                    while (it.hasNext()) {
                                        str5 = (String) it.next();
                                        ov0Var4.c0(1657268842);
                                        it2 = githubRelease3.getUpdateArtifacts().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                            updateArtifact2 = (UpdateArtifact) next;
                                            if (!o51.f(updateArtifact2.getScheme(), str8)) {
                                            }
                                        }
                                        updateArtifact = (UpdateArtifact) next;
                                        if (updateArtifact == null) {
                                            ov0Var4.s();
                                        } else {
                                            og3 og3Var5 = og3Var2;
                                            boolean zCanInstall2 = UpdatePackagePolicy.INSTANCE.canInstall(updateArtifact, og3Var5.h, set, true);
                                            if (z8) {
                                                z12 = false;
                                            } else {
                                                z12 = false;
                                            }
                                            wb1 wb1Var2 = new wb1(1.0f, true);
                                            bj2 bj2VarA3 = cj2.a(12.0f);
                                            b52 b52Var5 = hu.a;
                                            str6 = str4;
                                            if (o51.f(str8, str6)) {
                                                obj6 = obj5;
                                                str4 = str6;
                                                if (o51.f(str5, obj6)) {
                                                    jC = hz.c(0.1f, bk.g);
                                                }
                                                Object obj9 = obj6;
                                                gu guVarE3 = hu.e(jC, bk.g, ov0Var4, 12);
                                                b52 b52Var6 = new b52(8.0f, 8.0f, 8.0f, 8.0f);
                                                pu0 pu0Var4 = pu0Var;
                                                Iterator it5 = it;
                                                GithubRelease githubRelease8 = githubRelease3;
                                                zF2 = ov0Var4.f(pu0Var4) | ov0Var4.h(updateArtifact) | ov0Var4.h(githubRelease8);
                                                objQ2 = ov0Var4.Q();
                                                if (zF2) {
                                                    z13 = z12;
                                                    c30Var4 = c30Var3;
                                                    if (objQ2 == c30Var4) {
                                                    }
                                                    ov0 ov0Var111 = ov0Var4;
                                                    n51.h((au0) objQ2, wb1Var2, z13, bj2VarA3, guVarE3, null, b52Var6, sb.a0(-377021840, new da1(str5, zCanInstall2, 2), ov0Var4), ov0Var111, 817889280, 352);
                                                    ov0Var4 = ov0Var111;
                                                    ov0Var4.s();
                                                    githubRelease3 = githubRelease8;
                                                    c30Var3 = c30Var4;
                                                    c2 = 0;
                                                    it = it5;
                                                    obj5 = obj9;
                                                    og3Var2 = og3Var5;
                                                } else {
                                                    z13 = z12;
                                                    c30Var4 = c30Var3;
                                                }
                                                objQ2 = new gg3(pu0Var4, updateArtifact, githubRelease8, 1);
                                                ov0Var4.m0(objQ2);
                                                ov0 ov0Var112 = ov0Var4;
                                                n51.h((au0) objQ2, wb1Var2, z13, bj2VarA3, guVarE3, null, b52Var6, sb.a0(-377021840, new da1(str5, zCanInstall2, 2), ov0Var4), ov0Var112, 817889280, 352);
                                                ov0Var4 = ov0Var112;
                                                ov0Var4.s();
                                                githubRelease3 = githubRelease8;
                                                c30Var3 = c30Var4;
                                                c2 = 0;
                                                it = it5;
                                                obj5 = obj9;
                                                og3Var2 = og3Var5;
                                            } else {
                                                obj6 = obj5;
                                                str4 = str6;
                                            }
                                            jC = hz.f;
                                            Object obj10 = obj6;
                                            gu guVarE4 = hu.e(jC, bk.g, ov0Var4, 12);
                                            b52 b52Var7 = new b52(8.0f, 8.0f, 8.0f, 8.0f);
                                            pu0 pu0Var5 = pu0Var;
                                            Iterator it6 = it;
                                            GithubRelease githubRelease9 = githubRelease3;
                                            zF2 = ov0Var4.f(pu0Var5) | ov0Var4.h(updateArtifact) | ov0Var4.h(githubRelease9);
                                            objQ2 = ov0Var4.Q();
                                            if (zF2) {
                                                z13 = z12;
                                                c30Var4 = c30Var3;
                                                if (objQ2 == c30Var4) {
                                                }
                                                ov0 ov0Var113 = ov0Var4;
                                                n51.h((au0) objQ2, wb1Var2, z13, bj2VarA3, guVarE4, null, b52Var7, sb.a0(-377021840, new da1(str5, zCanInstall2, 2), ov0Var4), ov0Var113, 817889280, 352);
                                                ov0Var4 = ov0Var113;
                                                ov0Var4.s();
                                                githubRelease3 = githubRelease9;
                                                c30Var3 = c30Var4;
                                                c2 = 0;
                                                it = it6;
                                                obj5 = obj10;
                                                og3Var2 = og3Var5;
                                            } else {
                                                z13 = z12;
                                                c30Var4 = c30Var3;
                                            }
                                            objQ2 = new gg3(pu0Var5, updateArtifact, githubRelease9, 1);
                                            ov0Var4.m0(objQ2);
                                            ov0 ov0Var114 = ov0Var4;
                                            n51.h((au0) objQ2, wb1Var2, z13, bj2VarA3, guVarE4, null, b52Var7, sb.a0(-377021840, new da1(str5, zCanInstall2, 2), ov0Var4), ov0Var114, 817889280, 352);
                                            ov0Var4 = ov0Var114;
                                            ov0Var4.s();
                                            githubRelease3 = githubRelease9;
                                            c30Var3 = c30Var4;
                                            c2 = 0;
                                            it = it6;
                                            obj5 = obj10;
                                            og3Var2 = og3Var5;
                                        }
                                    }
                                    kg3Var = this;
                                    ov0Var4.s();
                                    ov0Var4.r();
                                    ov0Var4.r();
                                    c30Var2 = c30Var3;
                                    str2 = str10;
                                    obj4 = obj5;
                                    og3Var3 = og3Var2;
                                    orVar = orVar5;
                                    nrVar = nrVar4;
                                    av1Var2 = av1Var4;
                                    u92Var = u92Var4;
                                    str = str4;
                                    setH0 = set;
                                }
                                av1Var = av1Var2;
                                c30 c30Var8 = c30Var2;
                                githubRelease4 = githubRelease3;
                                ov0Var4.s();
                                dv1 dv1VarE10 = iw2.e(av1Var, 1.0f);
                                kk2 kk2VarA9 = jk2.a(u92Var, orVar, ov0Var4, 54);
                                int iHashCode16 = Long.hashCode(ks.U(ov0Var4));
                                l72 l72VarZ7 = ov0Var4.z();
                                dv1 dv1VarH16 = xp1.H(ov0Var4, dv1VarE10);
                                w20.b.getClass();
                                x30Var = v20.b;
                                ov0Var4.g0();
                                if (ov0Var4.D()) {
                                    ov0Var4.k(x30Var);
                                } else {
                                    ov0Var4.p0();
                                }
                                q73.h(ov0Var4, v20.e, kk2VarA9);
                                q73.h(ov0Var4, v20.d, l72VarZ7);
                                q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode16));
                                q73.g(ov0Var4, v20.g);
                                q73.h(ov0Var4, v20.c, dv1VarH16);
                                if (z8) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                ov0 ov0Var115 = ov0Var4;
                                n51.j(au0Var5, null, z11, null, null, null, am1.z, ov0Var115, 805306368, 506);
                                ov0Var5 = ov0Var115;
                                if (z6) {
                                    ov0Var5.c0(-2053205755);
                                    String strN3 = ke0.N(2131624549, ov0Var5);
                                    long jB2 = v63.b(12.5d);
                                    long jC6 = hz.c(0.45f, ((kz) ov0Var5.j(mz.a)).q);
                                    dv1 dv1VarG2 = zm3.G(av1Var, 0.0f, 0.0f, f3, 0.0f, 11);
                                    lu0Var2 = lu0Var;
                                    zF = ov0Var5.f(lu0Var2) | ov0Var5.h(githubRelease4);
                                    objQ = ov0Var5.Q();
                                    if (zF) {
                                        objQ = new qi2(18, lu0Var2, githubRelease4);
                                        ov0Var5.m0(objQ);
                                    } else {
                                        objQ = new qi2(18, lu0Var2, githubRelease4);
                                        ov0Var5.m0(objQ);
                                    }
                                    s83.b(strN3, bk.a(dv1VarG2, (au0) objQ), jC6, jB2, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262120);
                                    ov0Var5 = ov0Var5;
                                } else {
                                    ov0Var5.c0(-2078817242);
                                }
                                ov0Var5.s();
                                ov0Var5.r();
                                ov0Var5.s();
                                ov0Var3 = ov0Var5;
                            } else {
                                ov0Var2.c0(-2013659190);
                                ov0Var3 = ov0Var2;
                                n51.h(au0Var5, iw2.g(av1Var2, 38.0f), false, cj2.a(12.0f), null, null, new b52(20.0f, 8.0f, 20.0f, 8.0f), am1.A, ov0Var3, 817889328, 372);
                                ov0Var3.s();
                            }
                        } else {
                            kg3Var = this;
                            c30Var2 = c30Var;
                            nrVar = nrVar2;
                            au0Var5 = au0Var;
                            if (githubRelease3 != null) {
                                ov0Var2.c0(-2017478421);
                                ov0 ov0Var116 = ov0Var2;
                                u92Var = u92Var2;
                                str = "global";
                                s83.b(ke0.O(2131625139, new Object[]{githubRelease3.getVersionName()}, ov0Var2), null, dh0.p(ov0Var2).q, 0L, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var116, 1572864, 0, 262074);
                                s83.b(ke0.N(2131625140, ov0Var116), null, dh0.p(ov0Var116).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var116).l, ov0Var116, 0, 0, 131066);
                                ov0Var4 = ov0Var116;
                                String[] strArr3 = Build.SUPPORTED_ABIS;
                                strArr3.getClass();
                                setH0 = yo.H0(strArr3);
                                str2 = "armeabi-v7a";
                                if (setH0.contains("arm64-v8a")) {
                                    obj4 = "arm64-v8a";
                                } else {
                                    obj4 = "armeabi-v7a";
                                }
                                ov0Var4.c0(73487119);
                                if (o51.f(str, str)) {
                                    str3 = "scoped";
                                } else {
                                    str3 = str;
                                }
                                while (r38.hasNext()) {
                                    set = setH0;
                                    obj5 = obj4;
                                    or orVar6 = orVar;
                                    yz yzVarA6 = wz.a(new jo(6.0f, true, new fo(0)), nrVar, ov0Var4, 6);
                                    int iHashCode17 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ8 = ov0Var4.z();
                                    dv1 dv1VarH17 = xp1.H(ov0Var4, av1Var2);
                                    w20.b.getClass();
                                    nr nrVar5 = nrVar;
                                    x30Var2 = v20.b;
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    av1 av1Var5 = av1Var2;
                                    gh ghVar13 = v20.e;
                                    q73.h(ov0Var4, ghVar13, yzVarA6);
                                    gh ghVar14 = v20.d;
                                    q73.h(ov0Var4, ghVar14, l72VarZ8);
                                    Integer numValueOf4 = Integer.valueOf(iHashCode17);
                                    gh ghVar15 = v20.f;
                                    q73.h(ov0Var4, ghVar15, numValueOf4);
                                    wa waVar4 = v20.g;
                                    q73.g(ov0Var4, waVar4);
                                    gh ghVar16 = v20.c;
                                    q73.h(ov0Var4, ghVar16, dv1VarH17);
                                    if (o51.f(str8, str)) {
                                        i5 = 2131624954;
                                    } else {
                                        i5 = 2131624955;
                                    }
                                    String str11 = str2;
                                    ov0 ov0Var117 = ov0Var4;
                                    u92 u92Var5 = u92Var;
                                    c30Var3 = c30Var2;
                                    str4 = str;
                                    s83.b(ke0.N(i5, ov0Var4), null, ((kz) ov0Var4.j(mz.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(le3.a)).m, ov0Var117, 0, 0, 131066);
                                    ov0Var4 = ov0Var117;
                                    dv1 dv1VarE11 = iw2.e(av1Var5, 1.0f);
                                    og3Var2 = og3Var3;
                                    c2 = 0;
                                    kk2 kk2VarA10 = jk2.a(new jo(10.0f, true, new fo(0)), orVar2, ov0Var4, 6);
                                    int iHashCode18 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ9 = ov0Var4.z();
                                    dv1 dv1VarH18 = xp1.H(ov0Var4, dv1VarE11);
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar13, kk2VarA10);
                                    q73.h(ov0Var4, ghVar14, l72VarZ9);
                                    az2.s(iHashCode18, ov0Var4, ghVar15, ov0Var4, waVar4);
                                    q73.h(ov0Var4, ghVar16, dv1VarH18);
                                    ov0Var4.c0(-1193467192);
                                    it = am1.G("arm64-v8a", str11).iterator();
                                    while (it.hasNext()) {
                                        str5 = (String) it.next();
                                        ov0Var4.c0(1657268842);
                                        it2 = githubRelease3.getUpdateArtifacts().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                            updateArtifact2 = (UpdateArtifact) next;
                                            if (!o51.f(updateArtifact2.getScheme(), str8)) {
                                            }
                                        }
                                        updateArtifact = (UpdateArtifact) next;
                                        if (updateArtifact == null) {
                                            ov0Var4.s();
                                        } else {
                                            og3 og3Var6 = og3Var2;
                                            boolean zCanInstall3 = UpdatePackagePolicy.INSTANCE.canInstall(updateArtifact, og3Var6.h, set, true);
                                            if (z8) {
                                                z12 = false;
                                            } else {
                                                z12 = false;
                                            }
                                            wb1 wb1Var3 = new wb1(1.0f, true);
                                            bj2 bj2VarA4 = cj2.a(12.0f);
                                            b52 b52Var8 = hu.a;
                                            str6 = str4;
                                            if (o51.f(str8, str6)) {
                                                obj6 = obj5;
                                                str4 = str6;
                                                if (o51.f(str5, obj6)) {
                                                    jC = hz.c(0.1f, bk.g);
                                                }
                                                Object obj11 = obj6;
                                                gu guVarE5 = hu.e(jC, bk.g, ov0Var4, 12);
                                                b52 b52Var9 = new b52(8.0f, 8.0f, 8.0f, 8.0f);
                                                pu0 pu0Var6 = pu0Var;
                                                Iterator it7 = it;
                                                GithubRelease githubRelease10 = githubRelease3;
                                                zF2 = ov0Var4.f(pu0Var6) | ov0Var4.h(updateArtifact) | ov0Var4.h(githubRelease10);
                                                objQ2 = ov0Var4.Q();
                                                if (zF2) {
                                                    z13 = z12;
                                                    c30Var4 = c30Var3;
                                                    if (objQ2 == c30Var4) {
                                                    }
                                                    ov0 ov0Var118 = ov0Var4;
                                                    n51.h((au0) objQ2, wb1Var3, z13, bj2VarA4, guVarE5, null, b52Var9, sb.a0(-377021840, new da1(str5, zCanInstall3, 2), ov0Var4), ov0Var118, 817889280, 352);
                                                    ov0Var4 = ov0Var118;
                                                    ov0Var4.s();
                                                    githubRelease3 = githubRelease10;
                                                    c30Var3 = c30Var4;
                                                    c2 = 0;
                                                    it = it7;
                                                    obj5 = obj11;
                                                    og3Var2 = og3Var6;
                                                } else {
                                                    z13 = z12;
                                                    c30Var4 = c30Var3;
                                                }
                                                objQ2 = new gg3(pu0Var6, updateArtifact, githubRelease10, 1);
                                                ov0Var4.m0(objQ2);
                                                ov0 ov0Var119 = ov0Var4;
                                                n51.h((au0) objQ2, wb1Var3, z13, bj2VarA4, guVarE5, null, b52Var9, sb.a0(-377021840, new da1(str5, zCanInstall3, 2), ov0Var4), ov0Var119, 817889280, 352);
                                                ov0Var4 = ov0Var119;
                                                ov0Var4.s();
                                                githubRelease3 = githubRelease10;
                                                c30Var3 = c30Var4;
                                                c2 = 0;
                                                it = it7;
                                                obj5 = obj11;
                                                og3Var2 = og3Var6;
                                            } else {
                                                obj6 = obj5;
                                                str4 = str6;
                                            }
                                            jC = hz.f;
                                            Object obj12 = obj6;
                                            gu guVarE6 = hu.e(jC, bk.g, ov0Var4, 12);
                                            b52 b52Var10 = new b52(8.0f, 8.0f, 8.0f, 8.0f);
                                            pu0 pu0Var7 = pu0Var;
                                            Iterator it8 = it;
                                            GithubRelease githubRelease11 = githubRelease3;
                                            zF2 = ov0Var4.f(pu0Var7) | ov0Var4.h(updateArtifact) | ov0Var4.h(githubRelease11);
                                            objQ2 = ov0Var4.Q();
                                            if (zF2) {
                                                z13 = z12;
                                                c30Var4 = c30Var3;
                                                if (objQ2 == c30Var4) {
                                                }
                                                ov0 ov0Var1110 = ov0Var4;
                                                n51.h((au0) objQ2, wb1Var3, z13, bj2VarA4, guVarE6, null, b52Var10, sb.a0(-377021840, new da1(str5, zCanInstall3, 2), ov0Var4), ov0Var1110, 817889280, 352);
                                                ov0Var4 = ov0Var1110;
                                                ov0Var4.s();
                                                githubRelease3 = githubRelease11;
                                                c30Var3 = c30Var4;
                                                c2 = 0;
                                                it = it8;
                                                obj5 = obj12;
                                                og3Var2 = og3Var6;
                                            } else {
                                                z13 = z12;
                                                c30Var4 = c30Var3;
                                            }
                                            objQ2 = new gg3(pu0Var7, updateArtifact, githubRelease11, 1);
                                            ov0Var4.m0(objQ2);
                                            ov0 ov0Var1111 = ov0Var4;
                                            n51.h((au0) objQ2, wb1Var3, z13, bj2VarA4, guVarE6, null, b52Var10, sb.a0(-377021840, new da1(str5, zCanInstall3, 2), ov0Var4), ov0Var1111, 817889280, 352);
                                            ov0Var4 = ov0Var1111;
                                            ov0Var4.s();
                                            githubRelease3 = githubRelease11;
                                            c30Var3 = c30Var4;
                                            c2 = 0;
                                            it = it8;
                                            obj5 = obj12;
                                            og3Var2 = og3Var6;
                                        }
                                    }
                                    kg3Var = this;
                                    ov0Var4.s();
                                    ov0Var4.r();
                                    ov0Var4.r();
                                    c30Var2 = c30Var3;
                                    str2 = str11;
                                    obj4 = obj5;
                                    og3Var3 = og3Var2;
                                    orVar = orVar6;
                                    nrVar = nrVar5;
                                    av1Var2 = av1Var5;
                                    u92Var = u92Var5;
                                    str = str4;
                                    setH0 = set;
                                }
                                av1Var = av1Var2;
                                c30 c30Var9 = c30Var2;
                                githubRelease4 = githubRelease3;
                                ov0Var4.s();
                                dv1 dv1VarE12 = iw2.e(av1Var, 1.0f);
                                kk2 kk2VarA11 = jk2.a(u92Var, orVar, ov0Var4, 54);
                                int iHashCode19 = Long.hashCode(ks.U(ov0Var4));
                                l72 l72VarZ10 = ov0Var4.z();
                                dv1 dv1VarH19 = xp1.H(ov0Var4, dv1VarE12);
                                w20.b.getClass();
                                x30Var = v20.b;
                                ov0Var4.g0();
                                if (ov0Var4.D()) {
                                    ov0Var4.k(x30Var);
                                } else {
                                    ov0Var4.p0();
                                }
                                q73.h(ov0Var4, v20.e, kk2VarA11);
                                q73.h(ov0Var4, v20.d, l72VarZ10);
                                q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode19));
                                q73.g(ov0Var4, v20.g);
                                q73.h(ov0Var4, v20.c, dv1VarH19);
                                if (z8) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                ov0 ov0Var1112 = ov0Var4;
                                n51.j(au0Var5, null, z11, null, null, null, am1.z, ov0Var1112, 805306368, 506);
                                ov0Var5 = ov0Var1112;
                                if (z6) {
                                    ov0Var5.c0(-2053205755);
                                    String strN4 = ke0.N(2131624549, ov0Var5);
                                    long jB3 = v63.b(12.5d);
                                    long jC7 = hz.c(0.45f, ((kz) ov0Var5.j(mz.a)).q);
                                    dv1 dv1VarG3 = zm3.G(av1Var, 0.0f, 0.0f, f3, 0.0f, 11);
                                    lu0Var2 = lu0Var;
                                    zF = ov0Var5.f(lu0Var2) | ov0Var5.h(githubRelease4);
                                    objQ = ov0Var5.Q();
                                    if (zF) {
                                        objQ = new qi2(18, lu0Var2, githubRelease4);
                                        ov0Var5.m0(objQ);
                                    } else {
                                        objQ = new qi2(18, lu0Var2, githubRelease4);
                                        ov0Var5.m0(objQ);
                                    }
                                    s83.b(strN4, bk.a(dv1VarG3, (au0) objQ), jC7, jB3, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262120);
                                    ov0Var5 = ov0Var5;
                                } else {
                                    ov0Var5.c0(-2078817242);
                                }
                                ov0Var5.s();
                                ov0Var5.r();
                                ov0Var5.s();
                                ov0Var3 = ov0Var5;
                            } else {
                                ov0Var2.c0(-2013659190);
                                ov0Var3 = ov0Var2;
                                n51.h(au0Var5, iw2.g(av1Var2, 38.0f), false, cj2.a(12.0f), null, null, new b52(20.0f, 8.0f, 20.0f, 8.0f), am1.A, ov0Var3, 817889328, 372);
                                ov0Var3.s();
                            }
                        }
                        ov0Var3.r();
                    } else {
                        ov0Var6.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(z2, githubRelease, z3, au0Var, pu0Var, au0Var2, au0Var3, au0Var4, lu0Var, i2) { // from class: lg3
                public final /* synthetic */ boolean f;
                public final /* synthetic */ GithubRelease g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ au0 i;
                public final /* synthetic */ pu0 j;
                public final /* synthetic */ au0 k;
                public final /* synthetic */ au0 l;
                public final /* synthetic */ au0 m;
                public final /* synthetic */ lu0 n;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(385);
                    n51.e(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void f(ul1 ul1Var, AppState appState, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        ul1 ul1Var2;
        boolean z3;
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1647912801);
        int i3 = i2 | (ov0Var.h(ul1Var) ? 4 : 2) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1155) != 1154)) {
            ov0Var.Y();
            if ((i2 & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            xq1.g(false, au0Var, ov0Var, (i3 >> 6) & 112, 1);
            fn0 fn0Var = iw2.c;
            long j2 = z2 ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j2, iy0Var);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarU = ji2.U(fn0Var);
            ho hoVar = am1.g;
            nr nrVar = j9.r;
            yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarU);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 16.0f, 10.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            dv1 dv1VarK2 = iw2.k(av1Var, 44.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarA = bk.a(ji2.w(xp1.k(xp1.n(hd0.O(dv1VarK2, 6.0f, bj2Var, 0L, 0L, 24), bj2Var), z2 ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, z2 ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), bj2Var), au0Var);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iHashCode4 = Long.hashCode(ov0Var.T);
            l72 l72VarL4 = ov0Var.l();
            dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarA);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH4);
            t01.a(u(), ke0.N(2131624056, ov0Var), iw2.k(av1Var, 21.0f), z2 ? hz.c : xp1.d(4279901472L), ov0Var, 384, 0);
            az2.t(ov0Var, true, av1Var, 14.0f, ov0Var);
            yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var, 0);
            int iHashCode5 = Long.hashCode(ov0Var.T);
            l72 l72VarL5 = ov0Var.l();
            dv1 dv1VarH5 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA2);
            q73.h(ov0Var, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH5);
            String strN = ke0.N(2131624971, ov0Var);
            long jC = v63.c(18);
            jr0 jr0Var = jr0.j;
            hh0 hh0Var = mz.a;
            s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).o, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
            s83.b(ke0.N(2131625064, ov0Var), null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
            ov0Var.p(true);
            ov0Var.p(true);
            dv1 dv1VarE2 = iw2.e(new wb1(1.0f, true), 1.0f);
            er1 er1VarC3 = ws.c(prVar, false);
            int iHashCode6 = Long.hashCode(ov0Var.T);
            l72 l72VarL6 = ov0Var.l();
            dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarE2);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC3);
            q73.h(ov0Var, ghVar2, l72VarL6);
            az2.s(iHashCode6, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH6);
            dv1 dv1VarE3 = zm3.E(zm3.P(fn0Var, zm3.O(ov0Var), true), 16.0f, 8.0f);
            yz yzVarA3 = wz.a(new jo(14.0f, true, new fo(0)), nrVar, ov0Var, 6);
            int iHashCode7 = Long.hashCode(ov0Var.T);
            l72 l72VarL7 = ov0Var.l();
            dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarE3);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA3);
            q73.h(ov0Var, ghVar2, l72VarL7);
            az2.s(iHashCode7, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH7);
            ul1Var2 = ul1Var;
            z3 = z2;
            zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(1776517962, new da1(ul1Var2, z3, 0), ov0Var), ov0Var, 25014, 8);
            ov0Var = ov0Var;
            gh0.h(ov0Var, iw2.g(av1Var, 16.0f));
            ov0Var.p(true);
            ws.a(xp1.j(k22.k(iw2.g(iw2.e(av1Var, 1.0f), 18.0f), j9.g), u92.p(am1.G(new hz(z3 ? bk.a : bk.d), new hz(hz.c(0.85f, z3 ? bk.a : bk.d)), new hz(hz.c(0.4f, z3 ? bk.a : bk.d)), new hz(hz.f)))), ov0Var, 0);
            ov0Var.p(true);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ul1Var2 = ul1Var;
            z3 = z2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ea1(ul1Var2, appState, z3, au0Var, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final ul1 ul1Var, final AppState appState, final l6 l6Var, f30 f30Var, final int i2) {
        int i3;
        ul1 ul1Var2;
        ml1 ml1Var;
        q60 q60Var;
        ov0 ov0Var;
        List list;
        ey1 ey1Var;
        ey1 ey1Var2;
        au0 au0Var;
        ml1 ml1Var2;
        ey1 ey1Var3;
        int i4;
        boolean z2;
        ey1 ey1Var4;
        CloudAccount account;
        ul1Var.getClass();
        appState.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(610703951);
        int i5 = 4;
        int i6 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ov0Var2.h(ul1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var2.h(appState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var2.h(l6Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        byte b2 = 0;
        if (ov0Var2.T(i3 & 1, (i3 & 147) != 146)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0 && !ov0Var2.B()) {
                ov0Var2.W();
            }
            ov0Var2.q();
            ov0Var2.d0(-1614864554);
            pj3 pj3VarA = qh1.a(ov0Var2);
            if (pj3VarA == null) {
                fo.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            hj3 hj3VarG = ee0.G(xe2.a(is1.class), pj3VarA.getViewModelStore(), x63.b(pj3VarA, ov0Var2), v91.a(ov0Var2));
            ov0Var2.p(false);
            final is1 is1Var = (is1) hj3VarG;
            final ey1 ey1VarS = ee0.s(l6Var.c, ov0Var2);
            int i7 = 6;
            int i8 = (i3 >> 6) & 14;
            gh0.a(l6Var, ov0Var2, i8);
            if (l6Var.e && (!((CloudAccountState) ey1VarS.getValue()).getValidated() || (account = ((CloudAccountState) ey1VarS.getValue()).getAccount()) == null || account.isGuest())) {
                ov0Var2.c0(514491);
                o51.b(l6Var, ov0Var2, i8);
                ov0Var2.p(false);
                ee2 ee2VarT = ov0Var2.t();
                if (ee2VarT != null) {
                    final int i9 = 0;
                    ee2VarT.d = new pu0() { // from class: xk1
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = i9;
                            mf3 mf3Var = mf3.a;
                            int i11 = i2;
                            l6 l6Var2 = l6Var;
                            AppState appState2 = appState;
                            ul1 ul1Var3 = ul1Var;
                            f30 f30Var2 = (f30) obj;
                            ((Integer) obj2).getClass();
                            switch (i10) {
                                case 0:
                                    n51.g(ul1Var3, appState2, l6Var2, f30Var2, wc0.m0(i11 | 1));
                                    break;
                                default:
                                    n51.g(ul1Var3, appState2, l6Var2, f30Var2, wc0.m0(i11 | 1));
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    return;
                }
                return;
            }
            ov0Var2.c0(-3018765);
            ov0Var2.p(false);
            final ey1 ey1VarS2 = ee0.s(l6Var.i, ov0Var2);
            int length = js.values().length;
            Object[] objArr = new Object[0];
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new oi1(i5);
                ov0Var2.m0(objQ);
            }
            final t52 t52Var = (t52) wc0.c0(objArr, (au0) objQ, ov0Var2, 48);
            Integer numValueOf = Integer.valueOf(t52Var.g());
            boolean zF = ov0Var2.f(t52Var) | ov0Var2.h(l6Var);
            Object objQ2 = ov0Var2.Q();
            q60 q60Var2 = null;
            if (zF || objQ2 == c30Var) {
                objQ2 = new l80(l6Var, t52Var, q60Var2, i7);
                ov0Var2.m0(objQ2);
            }
            oi0.e(ov0Var2, (pu0) objQ2, numValueOf);
            Object[] objArr2 = new Object[0];
            Object objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                objQ3 = new v70(10, b2);
                ov0Var2.m0(objQ3);
            }
            pu0 pu0Var = (pu0) objQ3;
            Object objQ4 = ov0Var2.Q();
            if (objQ4 == c30Var) {
                objQ4 = new yk1(b2);
                ov0Var2.m0(objQ4);
            }
            z92 z92VarP = mh0.P(pu0Var, (lu0) objQ4);
            Object objQ5 = ov0Var2.Q();
            int i10 = 3;
            if (objQ5 == c30Var) {
                objQ5 = new oi1(i10);
                ov0Var2.m0(objQ5);
            }
            ey1 ey1Var5 = (ey1) wc0.e0(Arrays.copyOf(objArr2, 0), new z92(i6, new s5(z92VarP, 21), new ge2(z92VarP, i6)), (au0) objQ5, ov0Var2, 3456, 0);
            ml1 ml1Var3 = (ml1) zy.u0((List) ey1Var5.getValue());
            ml1 ml1Var4 = ml1.e;
            if (ml1Var3 == null) {
                ml1Var3 = ml1Var4;
            }
            final rl2 rl2VarF = ee0.F(ov0Var2);
            boolean zF2 = ov0Var2.f(ey1Var5);
            Object objQ6 = ov0Var2.Q();
            if (zF2 || objQ6 == c30Var) {
                objQ6 = new di0(ey1Var5, 23);
                ov0Var2.m0(objQ6);
            }
            final lu0 lu0Var = (lu0) objQ6;
            boolean zD = ov0Var2.d(ml1Var3.ordinal()) | ov0Var2.h(is1Var) | ov0Var2.f(ey1Var5);
            Object objQ7 = ov0Var2.Q();
            if (zD || objQ7 == c30Var) {
                objQ7 = new a6(ml1Var3, is1Var, ey1Var5, 12);
                ov0Var2.m0(objQ7);
            }
            au0 au0Var2 = (au0) objQ7;
            Object objQ8 = ov0Var2.Q();
            if (objQ8 == c30Var) {
                objQ8 = ke0.H(ml1Var4);
                ov0Var2.m0(objQ8);
            }
            final ey1 ey1Var6 = (ey1) objQ8;
            Object objQ9 = ov0Var2.Q();
            if (objQ9 == c30Var) {
                objQ9 = ke0.H(null);
                ov0Var2.m0(objQ9);
            }
            ey1 ey1Var7 = (ey1) objQ9;
            final ey1 ey1VarL = ke0.L(Integer.valueOf(t52Var.g()), ov0Var2);
            final ey1 ey1VarL2 = ke0.L(Boolean.valueOf(appState.isSpoofingActive()), ov0Var2);
            lr2 lr2Var = (lr2) ey1Var7.getValue();
            Integer numValueOf2 = Integer.valueOf(t52Var.g());
            Boolean boolValueOf = Boolean.valueOf(appState.isSpoofingActive());
            boolean zF3 = ov0Var2.f(t52Var) | ov0Var2.h(appState);
            ml1 ml1Var5 = ml1Var3;
            Object objQ10 = ov0Var2.Q();
            if (zF3 || objQ10 == c30Var) {
                objQ10 = new ll1(appState, ey1Var7, t52Var, (q60) null);
                ov0Var2.m0(objQ10);
            }
            oi0.g(lr2Var, numValueOf2, boolValueOf, (pu0) objQ10, ov0Var2);
            final boolean zW = w(ov0Var2);
            ov0Var2.d0(-1614864554);
            pj3 pj3VarA2 = qh1.a(ov0Var2);
            if (pj3VarA2 == null) {
                fo.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            hj3 hj3VarG2 = ee0.G(xe2.a(xg3.class), pj3VarA2.getViewModelStore(), x63.b(pj3VarA2, ov0Var2), v91.a(ov0Var2));
            ov0Var2.p(false);
            final xg3 xg3Var = (xg3) hj3VarG2;
            final ja1 ja1VarX = o51.x(ov0Var2);
            ey1 ey1VarS3 = ee0.s(xg3Var.d, ov0Var2);
            Object objQ11 = ov0Var2.Q();
            if (objQ11 == c30Var) {
                objQ11 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ11);
            }
            ey1 ey1Var8 = (ey1) objQ11;
            Object objQ12 = ov0Var2.Q();
            if (objQ12 == c30Var) {
                objQ12 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ12);
            }
            ey1 ey1Var9 = (ey1) objQ12;
            List list2 = ((og3) ey1VarS3.getValue()).c;
            GithubRelease githubRelease = (GithubRelease) zy.o0(list2);
            Boolean boolValueOf2 = Boolean.valueOf(((og3) ey1VarS3.getValue()).a);
            boolean zF4 = ov0Var2.f(ey1VarS3) | ov0Var2.h(list2) | ov0Var2.h(githubRelease) | ov0Var2.h(ul1Var);
            Object objQ13 = ov0Var2.Q();
            if (zF4 || objQ13 == c30Var) {
                ml1Var = ml1Var4;
                q60Var = null;
                ov0Var = ov0Var2;
                list = list2;
                ey1Var = ey1VarS3;
                ey1Var2 = ey1Var9;
                au0Var = au0Var2;
                objQ13 = new a4(list, githubRelease, ul1Var, ey1Var8, ey1Var, ey1Var2, (q60) null);
                ov0Var.m0(objQ13);
            } else {
                ml1Var = ml1Var4;
                ov0Var = ov0Var2;
                list = list2;
                q60Var = null;
                ey1Var = ey1VarS3;
                ey1Var2 = ey1Var9;
                au0Var = au0Var2;
            }
            oi0.f(list, boolValueOf2, (pu0) objQ13, ov0Var);
            boolean zD2 = ov0Var.d(ml1Var5.ordinal());
            Object objQ14 = ov0Var.Q();
            if (zD2 || objQ14 == c30Var) {
                ml1Var2 = ml1Var5;
                objQ14 = new l80(ml1Var2, r27, q60Var, 7);
                ov0Var.m0(objQ14);
            } else {
                ml1Var2 = ml1Var5;
            }
            oi0.e(ov0Var, (pu0) objQ14, ml1Var2);
            boolean z3 = ml1Var2 == ml1Var && t52Var.g() != js.Location.ordinal();
            boolean zF5 = ov0Var.f(t52Var);
            Object objQ15 = ov0Var.Q();
            if (zF5 || objQ15 == c30Var) {
                objQ15 = new id(t52Var, 1);
                ov0Var.m0(objQ15);
            }
            xq1.g(z3, (au0) objQ15, ov0Var, 0, 0);
            xq1.g(ml1Var2 != ml1Var, au0Var, ov0Var, 0, 0);
            Integer numValueOf3 = Integer.valueOf(t52Var.g());
            lr2 lr2Var2 = (lr2) ey1Var7.getValue();
            AppMapType mapType = appState.getMapType();
            boolean zF6 = ov0Var.f(t52Var) | ov0Var.h(appState);
            Object objQ16 = ov0Var.Q();
            if (zF6 || objQ16 == c30Var) {
                ey1Var3 = ey1Var7;
                objQ16 = new ll1(appState, t52Var, ey1Var3, q60Var);
                ov0Var.m0(objQ16);
            } else {
                ey1Var3 = ey1Var7;
            }
            oi0.g(numValueOf3, lr2Var2, mapType, (pu0) objQ16, ov0Var);
            boolean zF7 = ov0Var.f(t52Var) | ov0Var.d(length);
            Object objQ17 = ov0Var.Q();
            if (zF7 || objQ17 == c30Var) {
                objQ17 = new xf0(length, 1, t52Var);
                ov0Var.m0(objQ17);
            }
            lu0 lu0Var2 = (lu0) objQ17;
            fn0 fn0Var = iw2.c;
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, fn0Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            long j2 = ((kz) ov0Var.j(mz.a)).n;
            final ml1 ml1Var6 = ml1Var2;
            p10 p10VarA0 = sb.a0(-52520550, new zk1(ml1Var6, t52Var, lu0Var2, ja1VarX, length, zW), ov0Var);
            ml1 ml1Var7 = ml1Var;
            final au0 au0Var3 = au0Var;
            ey1 ey1Var10 = ey1Var2;
            ov0 ov0Var3 = ov0Var;
            final ey1 ey1Var11 = ey1Var3;
            final ey1 ey1Var12 = ey1Var;
            wc0.n(null, null, p10VarA0, null, null, 0, j2, 0L, null, sb.a0(-1036008348, new qu0() { // from class: cl1
                /* JADX WARN: Code duplicated, block: B:48:0x019d  */
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    ov0 ov0Var4;
                    ul1 ul1Var3;
                    final ey1 ey1Var13;
                    AppState appState2;
                    int i11;
                    Object objQ18;
                    final z42 z42Var = (z42) obj;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z42Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((ov0) f30Var2).f(z42Var) ? 4 : 2;
                    }
                    ov0 ov0Var5 = (ov0) f30Var2;
                    if (ov0Var5.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        fn0 fn0Var2 = iw2.c;
                        dv1 dv1VarE = am1.E(fn0Var2, ja1VarX);
                        pr prVar = j9.f;
                        er1 er1VarC2 = ws.c(prVar, false);
                        int iHashCode2 = Long.hashCode(ov0Var5.T);
                        l72 l72VarL2 = ov0Var5.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var5, dv1VarE);
                        w20.b.getClass();
                        x30 x30Var2 = v20.b;
                        ov0Var5.g0();
                        if (ov0Var5.S) {
                            ov0Var5.k(x30Var2);
                        } else {
                            ov0Var5.p0();
                        }
                        gh ghVar = v20.e;
                        q73.h(ov0Var5, ghVar, er1VarC2);
                        gh ghVar2 = v20.d;
                        q73.h(ov0Var5, ghVar2, l72VarL2);
                        Integer numValueOf4 = Integer.valueOf(iHashCode2);
                        gh ghVar3 = v20.f;
                        q73.h(ov0Var5, ghVar3, numValueOf4);
                        wa waVar = v20.g;
                        q73.g(ov0Var5, waVar);
                        gh ghVar4 = v20.c;
                        q73.h(ov0Var5, ghVar4, dv1VarH2);
                        AppState appState3 = appState;
                        boolean zIsInitializing = appState3.isInitializing();
                        ul1 ul1Var4 = ul1Var;
                        ey1 ey1Var14 = ey1Var11;
                        t52 t52Var2 = t52Var;
                        c30 c30Var2 = d30.a;
                        if (zIsInitializing) {
                            z4 = false;
                        } else {
                            if (appState3.getHasRootAccess() && appState3.isLSPosedActive()) {
                                z4 = false;
                            } else {
                                ov0Var5.c0(-1965342332);
                                ov0Var5.p(false);
                                t52Var2 = t52Var2;
                                ey1Var13 = ey1Var14;
                                ul1Var3 = ul1Var4;
                                appState2 = appState3;
                                ov0Var4 = ov0Var5;
                                i11 = 1;
                            }
                            Integer numValueOf5 = Integer.valueOf(t52Var2.g());
                            objQ18 = ov0Var4.Q();
                            if (objQ18 == c30Var2) {
                                objQ18 = new yk1(i11);
                                ov0Var4.m0(objQ18);
                            }
                            lu0 lu0Var3 = (lu0) objQ18;
                            final boolean z5 = zW;
                            final AppState appState4 = appState2;
                            final lu0 lu0Var4 = lu0Var;
                            final is1 is1Var2 = is1Var;
                            final ul1 ul1Var5 = ul1Var3;
                            final s03 s03Var = ey1VarS;
                            final s03 s03Var2 = ey1VarS2;
                            final ey1 ey1Var15 = ey1Var12;
                            final t52 t52Var3 = t52Var2;
                            ji2.n(numValueOf5, null, lu0Var3, null, "main_tabs_transition", null, sb.a0(2094542868, new ru0() { // from class: dl1
                                @Override // defpackage.ru0
                                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    ov0 ov0Var6;
                                    ov0 ov0Var7;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    f30 f30Var3 = (f30) obj6;
                                    ((Integer) obj7).getClass();
                                    ((yh) obj4).getClass();
                                    int iOrdinal = js.Location.ordinal();
                                    AppState appState5 = appState4;
                                    z42 z42Var2 = z42Var;
                                    boolean z6 = z5;
                                    ul1 ul1Var6 = ul1Var5;
                                    ey1 ey1Var16 = ey1Var13;
                                    c30 c30Var3 = d30.a;
                                    if (iIntValue2 == iOrdinal) {
                                        ov0 ov0Var8 = (ov0) f30Var3;
                                        ov0Var8.c0(-1483961207);
                                        if (!appState5.isInitializing() && !appState5.getHasRootAccess()) {
                                            ov0Var8.c0(1241873593);
                                            dv1 dv1VarG = zm3.G(av1.a, 0.0f, 0.0f, 0.0f, z42Var2.c(), 7);
                                            er1 er1VarC3 = ws.c(j9.f, false);
                                            int iHashCode3 = Long.hashCode(ov0Var8.T);
                                            l72 l72VarL3 = ov0Var8.l();
                                            dv1 dv1VarH3 = xp1.H(ov0Var8, dv1VarG);
                                            w20.b.getClass();
                                            x30 x30Var3 = v20.b;
                                            ov0Var8.g0();
                                            if (ov0Var8.S) {
                                                ov0Var8.k(x30Var3);
                                            } else {
                                                ov0Var8.p0();
                                            }
                                            q73.h(ov0Var8, v20.e, er1VarC3);
                                            q73.h(ov0Var8, v20.d, l72VarL3);
                                            q73.h(ov0Var8, v20.f, Integer.valueOf(iHashCode3));
                                            q73.g(ov0Var8, v20.g);
                                            q73.h(ov0Var8, v20.c, dv1VarH3);
                                            k22.f(ul1Var6, appState5, z6, ov0Var8, 0);
                                            ov0Var8.p(true);
                                            ov0Var8.p(false);
                                            ov0Var7 = ov0Var8;
                                        } else if (appState5.isInitializing() || appState5.isLSPosedActive()) {
                                            ov0Var7 = ov0Var8;
                                            ov0Var7.c0(1242454998);
                                            lr2 lr2Var3 = (lr2) ey1Var16.getValue();
                                            float fC = z42Var2.c();
                                            t52 t52Var4 = t52Var3;
                                            boolean zF8 = ov0Var7.f(t52Var4);
                                            Object objQ19 = ov0Var7.Q();
                                            if (zF8 || objQ19 == c30Var3) {
                                                objQ19 = new id(t52Var4, 3);
                                                ov0Var7.m0(objQ19);
                                            }
                                            hj1.a(ul1Var6, appState5, lr2Var3, fC, null, (au0) objQ19, ov0Var7, 0);
                                            ov0Var7.p(false);
                                        } else {
                                            ov0Var8.c0(1242178416);
                                            ov0Var7 = ov0Var8;
                                            xq1.i(ke0.x(), ke0.N(2131624597, ov0Var8), ke0.N(2131624596, ov0Var8), z6, ov0Var7, 0);
                                            ov0Var7.p(false);
                                        }
                                        ov0Var7.p(false);
                                    } else if (iIntValue2 == js.Route.ordinal()) {
                                        ov0 ov0Var9 = (ov0) f30Var3;
                                        ov0Var9.c0(-1483927284);
                                        if (appState5.isInitializing() || (appState5.getHasRootAccess() && appState5.isLSPosedActive())) {
                                            ov0Var6 = ov0Var9;
                                            ov0Var6.c0(-1483911722);
                                            gk2.a(ul1Var6, appState5, (lr2) ey1Var16.getValue(), z42Var2.c(), null, ov0Var6, 3072);
                                            ov0Var6.p(false);
                                        } else {
                                            ov0Var9.c0(1242964545);
                                            xq1.i(ke0.x(), ke0.N(appState5.getHasRootAccess() ? 2131624597 : 2131624882, ov0Var9), ke0.N(appState5.getHasRootAccess() ? 2131624596 : 2131624881, ov0Var9), z6, ov0Var9, 0);
                                            ov0Var6 = ov0Var9;
                                            ov0Var6.p(false);
                                        }
                                        ov0Var6.p(false);
                                    } else {
                                        int iOrdinal2 = js.Features.ordinal();
                                        lu0 lu0Var5 = lu0Var4;
                                        if (iIntValue2 == iOrdinal2) {
                                            ov0 ov0Var10 = (ov0) f30Var3;
                                            ov0Var10.c0(-1483897686);
                                            float fC2 = z42Var2.c();
                                            boolean zF9 = ov0Var10.f(lu0Var5);
                                            Object objQ20 = ov0Var10.Q();
                                            if (zF9 || objQ20 == c30Var3) {
                                                objQ20 = new vi1(25, lu0Var5);
                                                ov0Var10.m0(objQ20);
                                            }
                                            au0 au0Var4 = (au0) objQ20;
                                            boolean zF10 = ov0Var10.f(lu0Var5);
                                            Object objQ21 = ov0Var10.Q();
                                            if (zF10 || objQ21 == c30Var3) {
                                                objQ21 = new vi1(26, lu0Var5);
                                                ov0Var10.m0(objQ21);
                                            }
                                            au0 au0Var5 = (au0) objQ21;
                                            boolean zF11 = ov0Var10.f(lu0Var5);
                                            Object objQ22 = ov0Var10.Q();
                                            if (zF11 || objQ22 == c30Var3) {
                                                objQ22 = new vi1(27, lu0Var5);
                                                ov0Var10.m0(objQ22);
                                            }
                                            au0 au0Var6 = (au0) objQ22;
                                            boolean zF12 = ov0Var10.f(lu0Var5);
                                            Object objQ23 = ov0Var10.Q();
                                            if (zF12 || objQ23 == c30Var3) {
                                                objQ23 = new vi1(28, lu0Var5);
                                                ov0Var10.m0(objQ23);
                                            }
                                            au0 au0Var7 = (au0) objQ23;
                                            boolean zF13 = ov0Var10.f(lu0Var5);
                                            Object objQ24 = ov0Var10.Q();
                                            if (zF13 || objQ24 == c30Var3) {
                                                objQ24 = new vi1(29, lu0Var5);
                                                ov0Var10.m0(objQ24);
                                            }
                                            ji2.r(ul1Var6, appState5, fC2, au0Var4, au0Var5, au0Var6, au0Var7, (au0) objQ24, ov0Var10, 0);
                                            ov0Var10.p(false);
                                        } else {
                                            boolean z7 = false;
                                            ov0 ov0Var11 = (ov0) f30Var3;
                                            if (iIntValue2 == js.Personal.ordinal()) {
                                                ov0Var11.c0(1244717905);
                                                CloudAccountState cloudAccountState = (CloudAccountState) s03Var.getValue();
                                                boolean zBooleanValue = ((Boolean) s03Var2.getValue()).booleanValue();
                                                og3 og3Var = (og3) ey1Var15.getValue();
                                                float fC3 = z42Var2.c();
                                                boolean zF14 = ov0Var11.f(lu0Var5);
                                                Object objQ25 = ov0Var11.Q();
                                                if (zF14 || objQ25 == c30Var3) {
                                                    objQ25 = new hl1(0, lu0Var5);
                                                    ov0Var11.m0(objQ25);
                                                }
                                                au0 au0Var8 = (au0) objQ25;
                                                boolean zF15 = ov0Var11.f(lu0Var5);
                                                Object objQ26 = ov0Var11.Q();
                                                if (zF15 || objQ26 == c30Var3) {
                                                    objQ26 = new hl1(1, lu0Var5);
                                                    ov0Var11.m0(objQ26);
                                                }
                                                au0 au0Var9 = (au0) objQ26;
                                                boolean zF16 = ov0Var11.f(lu0Var5);
                                                Object objQ27 = ov0Var11.Q();
                                                if (zF16 || objQ27 == c30Var3) {
                                                    objQ27 = new hl1(2, lu0Var5);
                                                    ov0Var11.m0(objQ27);
                                                }
                                                au0 au0Var10 = (au0) objQ27;
                                                boolean zF17 = ov0Var11.f(lu0Var5);
                                                Object objQ28 = ov0Var11.Q();
                                                if (zF17 || objQ28 == c30Var3) {
                                                    objQ28 = new hl1(3, lu0Var5);
                                                    ov0Var11.m0(objQ28);
                                                }
                                                au0 au0Var11 = (au0) objQ28;
                                                boolean zF18 = ov0Var11.f(lu0Var5);
                                                Object objQ29 = ov0Var11.Q();
                                                if (zF18 || objQ29 == c30Var3) {
                                                    objQ29 = new vi1(19, lu0Var5);
                                                    ov0Var11.m0(objQ29);
                                                }
                                                au0 au0Var12 = (au0) objQ29;
                                                boolean zF19 = ov0Var11.f(lu0Var5);
                                                Object objQ30 = ov0Var11.Q();
                                                if (zF19 || objQ30 == c30Var3) {
                                                    objQ30 = new vi1(20, lu0Var5);
                                                    ov0Var11.m0(objQ30);
                                                }
                                                au0 au0Var13 = (au0) objQ30;
                                                boolean zF20 = ov0Var11.f(lu0Var5);
                                                Object objQ31 = ov0Var11.Q();
                                                if (zF20 || objQ31 == c30Var3) {
                                                    objQ31 = new vi1(21, lu0Var5);
                                                    ov0Var11.m0(objQ31);
                                                }
                                                au0 au0Var14 = (au0) objQ31;
                                                boolean zF21 = ov0Var11.f(lu0Var5);
                                                Object objQ32 = ov0Var11.Q();
                                                if (zF21 || objQ32 == c30Var3) {
                                                    objQ32 = new vi1(22, lu0Var5);
                                                    ov0Var11.m0(objQ32);
                                                }
                                                au0 au0Var15 = (au0) objQ32;
                                                boolean zF22 = ov0Var11.f(lu0Var5);
                                                Object objQ33 = ov0Var11.Q();
                                                if (zF22 || objQ33 == c30Var3) {
                                                    objQ33 = new vi1(23, lu0Var5);
                                                    ov0Var11.m0(objQ33);
                                                }
                                                au0 au0Var16 = (au0) objQ33;
                                                is1 is1Var3 = is1Var2;
                                                boolean zH = ov0Var11.h(is1Var3) | ov0Var11.f(lu0Var5);
                                                Object objQ34 = ov0Var11.Q();
                                                if (zH || objQ34 == c30Var3) {
                                                    objQ34 = new m5(21, is1Var3, lu0Var5);
                                                    ov0Var11.m0(objQ34);
                                                }
                                                au0 au0Var17 = (au0) objQ34;
                                                boolean zF23 = ov0Var11.f(lu0Var5);
                                                Object objQ35 = ov0Var11.Q();
                                                if (zF23 || objQ35 == c30Var3) {
                                                    objQ35 = new vi1(24, lu0Var5);
                                                    ov0Var11.m0(objQ35);
                                                }
                                                ks.G(appState5, cloudAccountState, zBooleanValue, og3Var, fC3, au0Var8, au0Var9, au0Var10, au0Var11, au0Var12, au0Var13, au0Var14, au0Var15, au0Var16, au0Var17, (au0) objQ35, ov0Var11, 0);
                                                z7 = false;
                                            } else {
                                                ov0Var11.c0(1226860014);
                                            }
                                            ov0Var11.p(z7);
                                        }
                                    }
                                    return mf3.a;
                                }
                            }, ov0Var4), ov0Var4, 1597824);
                            ov0Var4.p(true);
                        }
                        ov0Var5.c0(1876610560);
                        er1 er1VarC3 = ws.c(prVar, z4);
                        int iHashCode3 = Long.hashCode(ov0Var5.T);
                        l72 l72VarL3 = ov0Var5.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var5, fn0Var2);
                        ov0Var5.g0();
                        if (ov0Var5.S) {
                            ov0Var5.k(x30Var2);
                        } else {
                            ov0Var5.p0();
                        }
                        q73.h(ov0Var5, ghVar, er1VarC3);
                        q73.h(ov0Var5, ghVar2, l72VarL3);
                        az2.s(iHashCode3, ov0Var5, ghVar3, ov0Var5, waVar);
                        q73.h(ov0Var5, ghVar4, dv1VarH3);
                        Double dR = r13.R(appState3.getLatitudeInput());
                        Double dR2 = r13.R(appState3.getLongitudeInput());
                        Object objQ19 = ov0Var5.Q();
                        if (objQ19 == c30Var2) {
                            objQ19 = new mo0(ey1Var14, 7);
                            ov0Var5.m0(objQ19);
                        }
                        au0 au0Var4 = (au0) objQ19;
                        appState2 = appState3;
                        boolean zH = ov0Var5.h(appState2);
                        ey1 ey1Var16 = ey1VarL;
                        boolean zF8 = zH | ov0Var5.f(ey1Var16);
                        ey1 ey1Var17 = ey1VarL2;
                        ul1Var3 = ul1Var4;
                        boolean zF9 = zF8 | ov0Var5.f(ey1Var17) | ov0Var5.h(ul1Var3);
                        Object objQ20 = ov0Var5.Q();
                        if (zF9 || objQ20 == c30Var2) {
                            e5 e5Var = new e5(appState2, ey1Var14, ul1Var3, ey1Var16, ey1Var17);
                            ey1Var13 = ey1Var14;
                            ov0Var5.m0(e5Var);
                            objQ20 = e5Var;
                        } else {
                            ey1Var13 = ey1Var14;
                        }
                        da0.g(fn0Var2, au0Var4, dR, dR2, (lu0) objQ20, ov0Var5, 54, 0);
                        da0.d(t52Var2.g() == 0, k22.k(av1.a, j9.j), null, null, null, ks.D, ov0Var5, 196608, 28);
                        ov0Var4 = ov0Var5;
                        i11 = 1;
                        ov0Var4.p(true);
                        ov0Var4.p(false);
                        Integer numValueOf6 = Integer.valueOf(t52Var2.g());
                        objQ18 = ov0Var4.Q();
                        if (objQ18 == c30Var2) {
                            objQ18 = new yk1(i11);
                            ov0Var4.m0(objQ18);
                        }
                        lu0 lu0Var5 = (lu0) objQ18;
                        final boolean z6 = zW;
                        final AppState appState5 = appState2;
                        final lu0 lu0Var6 = lu0Var;
                        final is1 is1Var3 = is1Var;
                        final ul1 ul1Var6 = ul1Var3;
                        final s03 s03Var3 = ey1VarS;
                        final s03 s03Var4 = ey1VarS2;
                        final ey1 ey1Var18 = ey1Var12;
                        final t52 t52Var4 = t52Var2;
                        ji2.n(numValueOf6, null, lu0Var5, null, "main_tabs_transition", null, sb.a0(2094542868, new ru0() { // from class: dl1
                            @Override // defpackage.ru0
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                ov0 ov0Var6;
                                ov0 ov0Var7;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                f30 f30Var3 = (f30) obj6;
                                ((Integer) obj7).getClass();
                                ((yh) obj4).getClass();
                                int iOrdinal = js.Location.ordinal();
                                AppState appState6 = appState5;
                                z42 z42Var2 = z42Var;
                                boolean z7 = z6;
                                ul1 ul1Var7 = ul1Var6;
                                ey1 ey1Var19 = ey1Var13;
                                c30 c30Var3 = d30.a;
                                if (iIntValue2 == iOrdinal) {
                                    ov0 ov0Var8 = (ov0) f30Var3;
                                    ov0Var8.c0(-1483961207);
                                    if (!appState6.isInitializing() && !appState6.getHasRootAccess()) {
                                        ov0Var8.c0(1241873593);
                                        dv1 dv1VarG = zm3.G(av1.a, 0.0f, 0.0f, 0.0f, z42Var2.c(), 7);
                                        er1 er1VarC4 = ws.c(j9.f, false);
                                        int iHashCode4 = Long.hashCode(ov0Var8.T);
                                        l72 l72VarL4 = ov0Var8.l();
                                        dv1 dv1VarH4 = xp1.H(ov0Var8, dv1VarG);
                                        w20.b.getClass();
                                        x30 x30Var3 = v20.b;
                                        ov0Var8.g0();
                                        if (ov0Var8.S) {
                                            ov0Var8.k(x30Var3);
                                        } else {
                                            ov0Var8.p0();
                                        }
                                        q73.h(ov0Var8, v20.e, er1VarC4);
                                        q73.h(ov0Var8, v20.d, l72VarL4);
                                        q73.h(ov0Var8, v20.f, Integer.valueOf(iHashCode4));
                                        q73.g(ov0Var8, v20.g);
                                        q73.h(ov0Var8, v20.c, dv1VarH4);
                                        k22.f(ul1Var7, appState6, z7, ov0Var8, 0);
                                        ov0Var8.p(true);
                                        ov0Var8.p(false);
                                        ov0Var7 = ov0Var8;
                                    } else if (appState6.isInitializing() || appState6.isLSPosedActive()) {
                                        ov0Var7 = ov0Var8;
                                        ov0Var7.c0(1242454998);
                                        lr2 lr2Var3 = (lr2) ey1Var19.getValue();
                                        float fC = z42Var2.c();
                                        t52 t52Var5 = t52Var4;
                                        boolean zF10 = ov0Var7.f(t52Var5);
                                        Object objQ110 = ov0Var7.Q();
                                        if (zF10 || objQ110 == c30Var3) {
                                            objQ110 = new id(t52Var5, 3);
                                            ov0Var7.m0(objQ110);
                                        }
                                        hj1.a(ul1Var7, appState6, lr2Var3, fC, null, (au0) objQ110, ov0Var7, 0);
                                        ov0Var7.p(false);
                                    } else {
                                        ov0Var8.c0(1242178416);
                                        ov0Var7 = ov0Var8;
                                        xq1.i(ke0.x(), ke0.N(2131624597, ov0Var8), ke0.N(2131624596, ov0Var8), z7, ov0Var7, 0);
                                        ov0Var7.p(false);
                                    }
                                    ov0Var7.p(false);
                                } else if (iIntValue2 == js.Route.ordinal()) {
                                    ov0 ov0Var9 = (ov0) f30Var3;
                                    ov0Var9.c0(-1483927284);
                                    if (appState6.isInitializing() || (appState6.getHasRootAccess() && appState6.isLSPosedActive())) {
                                        ov0Var6 = ov0Var9;
                                        ov0Var6.c0(-1483911722);
                                        gk2.a(ul1Var7, appState6, (lr2) ey1Var19.getValue(), z42Var2.c(), null, ov0Var6, 3072);
                                        ov0Var6.p(false);
                                    } else {
                                        ov0Var9.c0(1242964545);
                                        xq1.i(ke0.x(), ke0.N(appState6.getHasRootAccess() ? 2131624597 : 2131624882, ov0Var9), ke0.N(appState6.getHasRootAccess() ? 2131624596 : 2131624881, ov0Var9), z7, ov0Var9, 0);
                                        ov0Var6 = ov0Var9;
                                        ov0Var6.p(false);
                                    }
                                    ov0Var6.p(false);
                                } else {
                                    int iOrdinal2 = js.Features.ordinal();
                                    lu0 lu0Var7 = lu0Var6;
                                    if (iIntValue2 == iOrdinal2) {
                                        ov0 ov0Var10 = (ov0) f30Var3;
                                        ov0Var10.c0(-1483897686);
                                        float fC2 = z42Var2.c();
                                        boolean zF11 = ov0Var10.f(lu0Var7);
                                        Object objQ21 = ov0Var10.Q();
                                        if (zF11 || objQ21 == c30Var3) {
                                            objQ21 = new vi1(25, lu0Var7);
                                            ov0Var10.m0(objQ21);
                                        }
                                        au0 au0Var5 = (au0) objQ21;
                                        boolean zF12 = ov0Var10.f(lu0Var7);
                                        Object objQ22 = ov0Var10.Q();
                                        if (zF12 || objQ22 == c30Var3) {
                                            objQ22 = new vi1(26, lu0Var7);
                                            ov0Var10.m0(objQ22);
                                        }
                                        au0 au0Var6 = (au0) objQ22;
                                        boolean zF13 = ov0Var10.f(lu0Var7);
                                        Object objQ23 = ov0Var10.Q();
                                        if (zF13 || objQ23 == c30Var3) {
                                            objQ23 = new vi1(27, lu0Var7);
                                            ov0Var10.m0(objQ23);
                                        }
                                        au0 au0Var7 = (au0) objQ23;
                                        boolean zF14 = ov0Var10.f(lu0Var7);
                                        Object objQ24 = ov0Var10.Q();
                                        if (zF14 || objQ24 == c30Var3) {
                                            objQ24 = new vi1(28, lu0Var7);
                                            ov0Var10.m0(objQ24);
                                        }
                                        au0 au0Var8 = (au0) objQ24;
                                        boolean zF15 = ov0Var10.f(lu0Var7);
                                        Object objQ25 = ov0Var10.Q();
                                        if (zF15 || objQ25 == c30Var3) {
                                            objQ25 = new vi1(29, lu0Var7);
                                            ov0Var10.m0(objQ25);
                                        }
                                        ji2.r(ul1Var7, appState6, fC2, au0Var5, au0Var6, au0Var7, au0Var8, (au0) objQ25, ov0Var10, 0);
                                        ov0Var10.p(false);
                                    } else {
                                        boolean z8 = false;
                                        ov0 ov0Var11 = (ov0) f30Var3;
                                        if (iIntValue2 == js.Personal.ordinal()) {
                                            ov0Var11.c0(1244717905);
                                            CloudAccountState cloudAccountState = (CloudAccountState) s03Var3.getValue();
                                            boolean zBooleanValue = ((Boolean) s03Var4.getValue()).booleanValue();
                                            og3 og3Var = (og3) ey1Var18.getValue();
                                            float fC3 = z42Var2.c();
                                            boolean zF16 = ov0Var11.f(lu0Var7);
                                            Object objQ26 = ov0Var11.Q();
                                            if (zF16 || objQ26 == c30Var3) {
                                                objQ26 = new hl1(0, lu0Var7);
                                                ov0Var11.m0(objQ26);
                                            }
                                            au0 au0Var9 = (au0) objQ26;
                                            boolean zF17 = ov0Var11.f(lu0Var7);
                                            Object objQ27 = ov0Var11.Q();
                                            if (zF17 || objQ27 == c30Var3) {
                                                objQ27 = new hl1(1, lu0Var7);
                                                ov0Var11.m0(objQ27);
                                            }
                                            au0 au0Var10 = (au0) objQ27;
                                            boolean zF18 = ov0Var11.f(lu0Var7);
                                            Object objQ28 = ov0Var11.Q();
                                            if (zF18 || objQ28 == c30Var3) {
                                                objQ28 = new hl1(2, lu0Var7);
                                                ov0Var11.m0(objQ28);
                                            }
                                            au0 au0Var11 = (au0) objQ28;
                                            boolean zF19 = ov0Var11.f(lu0Var7);
                                            Object objQ29 = ov0Var11.Q();
                                            if (zF19 || objQ29 == c30Var3) {
                                                objQ29 = new hl1(3, lu0Var7);
                                                ov0Var11.m0(objQ29);
                                            }
                                            au0 au0Var12 = (au0) objQ29;
                                            boolean zF110 = ov0Var11.f(lu0Var7);
                                            Object objQ210 = ov0Var11.Q();
                                            if (zF110 || objQ210 == c30Var3) {
                                                objQ210 = new vi1(19, lu0Var7);
                                                ov0Var11.m0(objQ210);
                                            }
                                            au0 au0Var13 = (au0) objQ210;
                                            boolean zF111 = ov0Var11.f(lu0Var7);
                                            Object objQ30 = ov0Var11.Q();
                                            if (zF111 || objQ30 == c30Var3) {
                                                objQ30 = new vi1(20, lu0Var7);
                                                ov0Var11.m0(objQ30);
                                            }
                                            au0 au0Var14 = (au0) objQ30;
                                            boolean zF20 = ov0Var11.f(lu0Var7);
                                            Object objQ31 = ov0Var11.Q();
                                            if (zF20 || objQ31 == c30Var3) {
                                                objQ31 = new vi1(21, lu0Var7);
                                                ov0Var11.m0(objQ31);
                                            }
                                            au0 au0Var15 = (au0) objQ31;
                                            boolean zF21 = ov0Var11.f(lu0Var7);
                                            Object objQ32 = ov0Var11.Q();
                                            if (zF21 || objQ32 == c30Var3) {
                                                objQ32 = new vi1(22, lu0Var7);
                                                ov0Var11.m0(objQ32);
                                            }
                                            au0 au0Var16 = (au0) objQ32;
                                            boolean zF22 = ov0Var11.f(lu0Var7);
                                            Object objQ33 = ov0Var11.Q();
                                            if (zF22 || objQ33 == c30Var3) {
                                                objQ33 = new vi1(23, lu0Var7);
                                                ov0Var11.m0(objQ33);
                                            }
                                            au0 au0Var17 = (au0) objQ33;
                                            is1 is1Var4 = is1Var3;
                                            boolean zH2 = ov0Var11.h(is1Var4) | ov0Var11.f(lu0Var7);
                                            Object objQ34 = ov0Var11.Q();
                                            if (zH2 || objQ34 == c30Var3) {
                                                objQ34 = new m5(21, is1Var4, lu0Var7);
                                                ov0Var11.m0(objQ34);
                                            }
                                            au0 au0Var18 = (au0) objQ34;
                                            boolean zF23 = ov0Var11.f(lu0Var7);
                                            Object objQ35 = ov0Var11.Q();
                                            if (zF23 || objQ35 == c30Var3) {
                                                objQ35 = new vi1(24, lu0Var7);
                                                ov0Var11.m0(objQ35);
                                            }
                                            ks.G(appState6, cloudAccountState, zBooleanValue, og3Var, fC3, au0Var9, au0Var10, au0Var11, au0Var12, au0Var13, au0Var14, au0Var15, au0Var16, au0Var17, au0Var18, (au0) objQ35, ov0Var11, 0);
                                            z8 = false;
                                        } else {
                                            ov0Var11.c0(1226860014);
                                        }
                                        ov0Var11.p(z8);
                                    }
                                }
                                return mf3.a;
                            }
                        }, ov0Var4), ov0Var4, 1597824);
                        ov0Var4.p(true);
                    } else {
                        ov0Var5.W();
                    }
                    return mf3.a;
                }
            }, ov0Var3), ov0Var3, 805306752, 443);
            boolean z4 = ml1Var6 != ml1Var7;
            f80 f80Var = lh0.a;
            od3 od3VarI = o51.I(300, 2, f80Var);
            Object objQ18 = ov0Var3.Q();
            if (objQ18 == c30Var) {
                i4 = 4;
                objQ18 = new yk1(i4);
                ov0Var3.m0(objQ18);
            } else {
                i4 = 4;
            }
            pk0 pk0VarI = kk0.i((lu0) objQ18, od3VarI);
            od3 od3VarI2 = o51.I(300, 2, f80Var);
            Object objQ19 = ov0Var3.Q();
            if (objQ19 == c30Var) {
                objQ19 = new yk1(i4);
                ov0Var3.m0(objQ19);
            }
            ul1Var2 = ul1Var;
            da0.d(z4, null, pk0VarI, kk0.j((lu0) objQ19, od3VarI2), null, sb.a0(-1648933203, new qu0() { // from class: fl1
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    f30 f30Var2 = (f30) obj2;
                    ((Integer) obj3).getClass();
                    ((mi) obj).getClass();
                    ml1 ml1Var8 = ml1.e;
                    ml1 ml1Var9 = ml1Var6;
                    if (ml1Var9 == ml1Var8) {
                        ml1Var9 = (ml1) ey1Var6.getValue();
                    }
                    final ml1 ml1Var10 = ml1Var9;
                    ov0 ov0Var4 = (ov0) f30Var2;
                    dv1 dv1VarK = xp1.k(iw2.c, ((kz) ov0Var4.j(mz.a)).n, o51.p0);
                    er1 er1VarC2 = ws.c(j9.f, false);
                    int iHashCode2 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL2 = ov0Var4.l();
                    dv1 dv1VarH2 = xp1.H(f30Var2, dv1VarK);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0 ov0Var5 = (ov0) f30Var2;
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var2);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(f30Var2, v20.e, er1VarC2);
                    q73.h(f30Var2, v20.d, l72VarL2);
                    q73.h(f30Var2, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(f30Var2, v20.g);
                    q73.h(f30Var2, v20.c, dv1VarH2);
                    String strName = ml1Var10.name();
                    final au0 au0Var4 = au0Var3;
                    final is1 is1Var2 = is1Var;
                    final lu0 lu0Var3 = lu0Var;
                    final l6 l6Var2 = l6Var;
                    final ul1 ul1Var3 = ul1Var;
                    final AppState appState2 = appState;
                    final boolean z5 = zW;
                    final xg3 xg3Var2 = xg3Var;
                    final s03 s03Var = ey1VarS;
                    rl2VarF.e(strName, sb.a0(-1273988878, new pu0() { // from class: al1
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj4, Object obj5) throws Throwable {
                            f30 f30Var3 = (f30) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            ov0 ov0Var6 = (ov0) f30Var3;
                            if (ov0Var6.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                int iOrdinal = ml1Var10.ordinal();
                                au0 au0Var5 = au0Var4;
                                is1 is1Var3 = is1Var2;
                                lu0 lu0Var4 = lu0Var3;
                                ul1 ul1Var4 = ul1Var3;
                                AppState appState3 = appState2;
                                boolean z6 = z5;
                                s03 s03Var2 = s03Var;
                                c30 c30Var2 = d30.a;
                                switch (iOrdinal) {
                                    case 0:
                                        ov0Var6.c0(-237494986);
                                        ov0Var6.p(false);
                                        break;
                                    case 1:
                                        ov0Var6.c0(-237597874);
                                        boolean zF8 = ov0Var6.f(au0Var5);
                                        Object objQ20 = ov0Var6.Q();
                                        if (zF8 || objQ20 == c30Var2) {
                                            objQ20 = new o6(15, au0Var5);
                                            ov0Var6.m0(objQ20);
                                        }
                                        au0 au0Var6 = (au0) objQ20;
                                        boolean zF9 = ov0Var6.f(lu0Var4);
                                        Object objQ21 = ov0Var6.Q();
                                        if (zF9 || objQ21 == c30Var2) {
                                            objQ21 = new vi1(18, lu0Var4);
                                            ov0Var6.m0(objQ21);
                                        }
                                        ji2.a(0, l6Var2, ov0Var6, au0Var6, (au0) objQ21);
                                        ov0Var6.p(false);
                                        break;
                                    case 2:
                                        ov0Var6.c0(-237616210);
                                        boolean zF10 = ov0Var6.f(au0Var5);
                                        Object objQ22 = ov0Var6.Q();
                                        if (zF10 || objQ22 == c30Var2) {
                                            objQ22 = new o6(13, au0Var5);
                                            ov0Var6.m0(objQ22);
                                        }
                                        au0 au0Var7 = (au0) objQ22;
                                        boolean zF11 = ov0Var6.f(lu0Var4);
                                        Object objQ23 = ov0Var6.Q();
                                        if (zF11 || objQ23 == c30Var2) {
                                            objQ23 = new vi1(15, lu0Var4);
                                            ov0Var6.m0(objQ23);
                                        }
                                        au0 au0Var8 = (au0) objQ23;
                                        boolean zF12 = ov0Var6.f(lu0Var4);
                                        Object objQ24 = ov0Var6.Q();
                                        if (zF12 || objQ24 == c30Var2) {
                                            objQ24 = new vi1(16, lu0Var4);
                                            ov0Var6.m0(objQ24);
                                        }
                                        wc0.d(is1Var3, au0Var7, au0Var8, (au0) objQ24, false, ov0Var6, 0, 16);
                                        ov0Var6.p(false);
                                        break;
                                    case 3:
                                        ov0Var6.c0(-237606405);
                                        boolean zF13 = ov0Var6.f(au0Var5);
                                        Object objQ25 = ov0Var6.Q();
                                        if (zF13 || objQ25 == c30Var2) {
                                            objQ25 = new o6(14, au0Var5);
                                            ov0Var6.m0(objQ25);
                                        }
                                        au0 au0Var9 = (au0) objQ25;
                                        boolean zF14 = ov0Var6.f(lu0Var4);
                                        Object objQ26 = ov0Var6.Q();
                                        if (zF14 || objQ26 == c30Var2) {
                                            objQ26 = new vi1(17, lu0Var4);
                                            ov0Var6.m0(objQ26);
                                        }
                                        wc0.b(is1Var3, au0Var9, (au0) objQ26, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case 4:
                                        ov0Var6.c0(-237626431);
                                        boolean zF15 = ov0Var6.f(au0Var5);
                                        Object objQ27 = ov0Var6.Q();
                                        if (zF15 || objQ27 == c30Var2) {
                                            objQ27 = new o6(1, au0Var5);
                                            ov0Var6.m0(objQ27);
                                        }
                                        au0 au0Var10 = (au0) objQ27;
                                        boolean zF16 = ov0Var6.f(lu0Var4);
                                        Object objQ28 = ov0Var6.Q();
                                        if (zF16 || objQ28 == c30Var2) {
                                            objQ28 = new vi1(12, lu0Var4);
                                            ov0Var6.m0(objQ28);
                                        }
                                        au0 au0Var11 = (au0) objQ28;
                                        boolean zF17 = ov0Var6.f(lu0Var4);
                                        Object objQ29 = ov0Var6.Q();
                                        if (zF17 || objQ29 == c30Var2) {
                                            objQ29 = new vi1(14, lu0Var4);
                                            ov0Var6.m0(objQ29);
                                        }
                                        wc0.d(is1Var3, au0Var10, au0Var11, (au0) objQ29, true, ov0Var6, 24576, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case Logger.WARN /* 5 */:
                                        ov0Var6.c0(-237629389);
                                        ee0.g(au0Var5, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case Logger.ERROR /* 6 */:
                                        ov0Var6.c0(-237589116);
                                        boolean zF18 = ov0Var6.f(au0Var5);
                                        Object objQ30 = ov0Var6.Q();
                                        if (zF18 || objQ30 == c30Var2) {
                                            objQ30 = new o6(2, au0Var5);
                                            ov0Var6.m0(objQ30);
                                        }
                                        ks.B(ul1Var4, appState3, (au0) objQ30, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                                        ov0Var6.c0(-237581781);
                                        boolean zF19 = ov0Var6.f(au0Var5);
                                        Object objQ31 = ov0Var6.Q();
                                        if (zF19 || objQ31 == c30Var2) {
                                            objQ31 = new o6(3, au0Var5);
                                            ov0Var6.m0(objQ31);
                                        }
                                        ym3.m(ul1Var4, appState3, z6, (au0) objQ31, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case 8:
                                        ov0Var6.c0(-237573237);
                                        boolean zF20 = ov0Var6.f(au0Var5);
                                        Object objQ32 = ov0Var6.Q();
                                        if (zF20 || objQ32 == c30Var2) {
                                            objQ32 = new o6(4, au0Var5);
                                            ov0Var6.m0(objQ32);
                                        }
                                        mh0.d(ul1Var4, appState3, z6, (au0) objQ32, null, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case mc0.b /* 9 */:
                                        ov0Var6.c0(-237564810);
                                        boolean zF21 = ov0Var6.f(au0Var5);
                                        Object objQ33 = ov0Var6.Q();
                                        if (zF21 || objQ33 == c30Var2) {
                                            objQ33 = new o6(5, au0Var5);
                                            ov0Var6.m0(objQ33);
                                        }
                                        n51.k(xg3Var2, ul1Var4, z6, (au0) objQ33, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case mc0.c /* 10 */:
                                        ov0Var6.c0(-237554127);
                                        boolean zF22 = ov0Var6.f(au0Var5);
                                        Object objQ34 = ov0Var6.Q();
                                        if (zF22 || objQ34 == c30Var2) {
                                            objQ34 = new o6(6, au0Var5);
                                            ov0Var6.m0(objQ34);
                                        }
                                        n51.f(ul1Var4, appState3, z6, (au0) objQ34, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case 11:
                                        ov0Var6.c0(-237534584);
                                        CloudAccountState cloudAccountState = (CloudAccountState) s03Var2.getValue();
                                        boolean zF23 = ov0Var6.f(au0Var5);
                                        Object objQ35 = ov0Var6.Q();
                                        if (zF23 || objQ35 == c30Var2) {
                                            objQ35 = new o6(8, au0Var5);
                                            ov0Var6.m0(objQ35);
                                        }
                                        xq1.j(cloudAccountState, z6, (au0) objQ35, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case mc0.d /* 12 */:
                                        ov0Var6.c0(-237529348);
                                        CloudAccountState cloudAccountState2 = (CloudAccountState) s03Var2.getValue();
                                        boolean zF24 = ov0Var6.f(au0Var5);
                                        Object objQ36 = ov0Var6.Q();
                                        if (zF24 || objQ36 == c30Var2) {
                                            objQ36 = new o6(9, au0Var5);
                                            ov0Var6.m0(objQ36);
                                        }
                                        au0 au0Var12 = (au0) objQ36;
                                        boolean zF25 = ov0Var6.f(lu0Var4);
                                        Object objQ37 = ov0Var6.Q();
                                        if (zF25 || objQ37 == c30Var2) {
                                            objQ37 = new vi1(11, lu0Var4);
                                            ov0Var6.m0(objQ37);
                                        }
                                        xq1.k(cloudAccountState2, z6, au0Var12, (au0) objQ37, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case 13:
                                        ov0Var6.c0(-237522564);
                                        CloudAccountState cloudAccountState3 = (CloudAccountState) s03Var2.getValue();
                                        boolean zF26 = ov0Var6.f(au0Var5);
                                        Object objQ38 = ov0Var6.Q();
                                        if (zF26 || objQ38 == c30Var2) {
                                            objQ38 = new o6(10, au0Var5);
                                            ov0Var6.m0(objQ38);
                                        }
                                        au0 au0Var13 = (au0) objQ38;
                                        boolean zF27 = ov0Var6.f(lu0Var4);
                                        Object objQ39 = ov0Var6.Q();
                                        if (zF27 || objQ39 == c30Var2) {
                                            objQ39 = new vi1(13, lu0Var4);
                                            ov0Var6.m0(objQ39);
                                        }
                                        hd0.l(cloudAccountState3, z6, au0Var13, (au0) objQ39, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case 14:
                                        ov0Var6.c0(-237543669);
                                        CloudAccountState cloudAccountState4 = (CloudAccountState) s03Var2.getValue();
                                        boolean zF28 = ov0Var6.f(au0Var5);
                                        Object objQ40 = ov0Var6.Q();
                                        if (zF28 || objQ40 == c30Var2) {
                                            objQ40 = new o6(7, au0Var5);
                                            ov0Var6.m0(objQ40);
                                        }
                                        ee0.m(cloudAccountState4, z6, (au0) objQ40, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case a83.e /* 15 */:
                                        ov0Var6.c0(-237510736);
                                        boolean zF29 = ov0Var6.f(au0Var5);
                                        Object objQ41 = ov0Var6.Q();
                                        if (zF29 || objQ41 == c30Var2) {
                                            objQ41 = new o6(11, au0Var5);
                                            ov0Var6.m0(objQ41);
                                        }
                                        xq1.r(ul1Var4, appState3, z6, (au0) objQ41, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    case 16:
                                        ov0Var6.c0(-237501947);
                                        boolean zF30 = ov0Var6.f(au0Var5);
                                        Object objQ42 = ov0Var6.Q();
                                        if (zF30 || objQ42 == c30Var2) {
                                            objQ42 = new o6(12, au0Var5);
                                            ov0Var6.m0(objQ42);
                                        }
                                        xq1.t(ul1Var4, appState3, (au0) objQ42, ov0Var6, 0);
                                        ov0Var6.p(false);
                                        break;
                                    default:
                                        ov0Var6.c0(-237627524);
                                        ov0Var6.p(false);
                                        b81.d();
                                        return null;
                                }
                            } else {
                                ov0Var6.W();
                            }
                            return mf3.a;
                        }
                    }, f30Var2), f30Var2, 48);
                    ov0Var5.p(true);
                    return mf3.a;
                }
            }, ov0Var3), ov0Var3, 196608, 18);
            ov0Var2 = ov0Var3;
            if (!((Boolean) ey1Var10.getValue()).booleanValue() || githubRelease == 0) {
                z2 = false;
                ov0Var2.c0(-177873331);
            } else {
                ov0Var2.c0(-153275978);
                Object objQ20 = ov0Var2.Q();
                if (objQ20 == c30Var) {
                    ey1Var4 = ey1Var10;
                    objQ20 = new mo0(ey1Var4, 8);
                    ov0Var2.m0(objQ20);
                } else {
                    ey1Var4 = ey1Var10;
                }
                au0 au0Var4 = (au0) objQ20;
                boolean zF8 = ov0Var2.f(lu0Var);
                Object objQ21 = ov0Var2.Q();
                if (zF8 || objQ21 == c30Var) {
                    objQ21 = new y60(lu0Var, ey1Var4, 3);
                    ov0Var2.m0(objQ21);
                }
                au0 au0Var5 = (au0) objQ21;
                boolean zH = ov0Var2.h(ul1Var2);
                Object objQ22 = ov0Var2.Q();
                if (zH || objQ22 == c30Var) {
                    z2 = false;
                    objQ22 = new jl1(0 == true ? 1 : 0, ul1Var2, ey1Var4);
                    ov0Var2.m0(objQ22);
                } else {
                    z2 = false;
                }
                gh0.i(githubRelease, au0Var4, au0Var5, (lu0) objQ22, ov0Var2, 48);
            }
            ov0Var2.p(z2);
            ov0Var2.p(true);
        } else {
            ul1Var2 = ul1Var;
            ov0Var2.W();
        }
        ee2 ee2VarT2 = ov0Var2.t();
        if (ee2VarT2 != null) {
            final int i11 = 1;
            final ul1 ul1Var3 = ul1Var2;
            ee2VarT2.d = new pu0() { // from class: xk1
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i12 = i11;
                    mf3 mf3Var = mf3.a;
                    int i13 = i2;
                    l6 l6Var2 = l6Var;
                    AppState appState2 = appState;
                    ul1 ul1Var4 = ul1Var3;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).getClass();
                    switch (i12) {
                        case 0:
                            n51.g(ul1Var4, appState2, l6Var2, f30Var2, wc0.m0(i13 | 1));
                            break;
                        default:
                            n51.g(ul1Var4, appState2, l6Var2, f30Var2, wc0.m0(i13 | 1));
                            break;
                    }
                    return mf3Var;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x014b  */
    /* JADX WARN: Code duplicated, block: B:94:0x016e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void h(au0 au0Var, dv1 dv1Var, boolean z2, au2 au2Var, gu guVar, is isVar, z42 z42Var, qu0 qu0Var, f30 f30Var, int i2, int i3) {
        int i4;
        dv1 dv1Var2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        au2 au2VarA;
        int i8;
        gu guVarC;
        int i9;
        int i10;
        int i11;
        z42 z42Var2;
        int i12;
        int i13;
        boolean z4;
        ov0 ov0Var;
        z42 z42Var3;
        dv1 dv1Var3;
        au2 au2Var2;
        boolean z5;
        gu guVar2;
        is isVar2;
        ee2 ee2VarT;
        dv1 dv1Var4;
        long jC;
        is isVar3;
        dv1 dv1Var5;
        int i14;
        lz lzVar = da0.O;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(399974542);
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var2.h(au0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                dv1Var2 = dv1Var;
                i4 |= ov0Var2.f(dv1Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i7 = i4 | 384;
                z3 = z2;
            } else {
                z3 = z2;
                if (ov0Var2.g(z3)) {
                    i6 = 256;
                } else {
                    i6 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i7 = i4 | i6;
            }
            if ((i3 & 8) == 0) {
                au2VarA = au2Var;
                if (ov0Var2.f(au2VarA)) {
                    i8 = 2048;
                }
                int i16 = i7 | i8;
                if ((i3 & 16) == 0) {
                    guVarC = guVar;
                    int i17 = ov0Var2.f(guVarC) ? 16384 : 8192;
                    i9 = i16 | i17;
                    i10 = 720896 | i9;
                    i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                    if (i11 != 0) {
                        if ((i2 & 12582912) == 0) {
                            z42Var2 = z42Var;
                            if (ov0Var2.f(z42Var2)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i10 |= i12;
                        }
                        i13 = i10 | 100663296;
                        if ((306783379 & i13) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ov0Var2.T(i13 & 1, z4)) {
                            ov0Var2.Y();
                            if ((i2 & 1) != 0 || ov0Var2.B()) {
                                if (i15 != 0) {
                                    dv1Var4 = av1.a;
                                } else {
                                    dv1Var4 = dv1Var2;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 8) != 0) {
                                    b52 b52Var = hu.a;
                                    i13 &= -7169;
                                    au2VarA = hu2.a(da0.a, ov0Var2);
                                }
                                if ((i3 & 16) != 0) {
                                    b52 b52Var2 = hu.a;
                                    i13 &= -57345;
                                    guVarC = hu.c((kz) ov0Var2.j(mz.a));
                                }
                                b52 b52Var3 = hu.a;
                                float f2 = da0.b;
                                if (z3) {
                                    ov0Var2.c0(-112346942);
                                    jC = mz.d(lzVar, ov0Var2);
                                    ov0Var2.p(false);
                                } else {
                                    ov0Var2.c0(-112259336);
                                    jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                    ov0Var2.p(false);
                                }
                                is isVarH = da0.h(f2, jC);
                                int i18 = i13 & (-3670017);
                                if (i11 != 0) {
                                    z42Var2 = hu.a;
                                }
                                isVar3 = isVarH;
                                dv1Var5 = dv1Var4;
                                i14 = i18;
                            } else {
                                ov0Var2.W();
                                if ((i3 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                i14 = i13 & (-3670017);
                                isVar3 = isVar;
                                dv1Var5 = dv1Var2;
                            }
                            z42 z42Var4 = z42Var2;
                            boolean z6 = z3;
                            au2 au2Var3 = au2VarA;
                            gu guVar3 = guVarC;
                            ov0Var2.q();
                            ov0Var = ov0Var2;
                            a(au0Var, dv1Var5, z6, au2Var3, guVar3, null, isVar3, z42Var4, qu0Var, ov0Var, i14 & 2147483646, 0);
                            dv1Var3 = dv1Var5;
                            z5 = z6;
                            au2Var2 = au2Var3;
                            guVar2 = guVar3;
                            isVar2 = isVar3;
                            z42Var3 = z42Var4;
                        } else {
                            ov0Var = ov0Var2;
                            ov0Var.W();
                            au2 au2Var4 = au2VarA;
                            z42Var3 = z42Var2;
                            dv1Var3 = dv1Var2;
                            au2Var2 = au2Var4;
                            z5 = z3;
                            guVar2 = guVarC;
                            isVar2 = isVar;
                        }
                        ee2VarT = ov0Var.t();
                        if (ee2VarT != null) {
                            ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                        }
                    }
                    i10 = 13303808 | i9;
                    z42Var2 = z42Var;
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var4 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var5 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var6 = hu.a;
                            float f3 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH2 = da0.h(f3, jC);
                            int i19 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH2;
                            dv1Var5 = dv1Var4;
                            i14 = i19;
                        } else {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var7 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var8 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var9 = hu.a;
                            float f4 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH3 = da0.h(f4, jC);
                            int i110 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH3;
                            dv1Var5 = dv1Var4;
                            i14 = i110;
                        }
                        z42 z42Var5 = z42Var2;
                        boolean z7 = z3;
                        au2 au2Var5 = au2VarA;
                        gu guVar4 = guVarC;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z7, au2Var5, guVar4, null, isVar3, z42Var5, qu0Var, ov0Var, i14 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z7;
                        au2Var2 = au2Var5;
                        guVar2 = guVar4;
                        isVar2 = isVar3;
                        z42Var3 = z42Var5;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        au2 au2Var6 = au2VarA;
                        z42Var3 = z42Var2;
                        dv1Var3 = dv1Var2;
                        au2Var2 = au2Var6;
                        z5 = z3;
                        guVar2 = guVarC;
                        isVar2 = isVar;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                    }
                }
                guVarC = guVar;
                i9 = i16 | i17;
                i10 = 720896 | i9;
                i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        z42Var2 = z42Var;
                        if (ov0Var2.f(z42Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var10 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var11 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var12 = hu.a;
                            float f5 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH4 = da0.h(f5, jC);
                            int i111 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH4;
                            dv1Var5 = dv1Var4;
                            i14 = i111;
                        } else {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var13 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var14 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var15 = hu.a;
                            float f6 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH5 = da0.h(f6, jC);
                            int i112 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH5;
                            dv1Var5 = dv1Var4;
                            i14 = i112;
                        }
                        z42 z42Var6 = z42Var2;
                        boolean z8 = z3;
                        au2 au2Var7 = au2VarA;
                        gu guVar5 = guVarC;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z8, au2Var7, guVar5, null, isVar3, z42Var6, qu0Var, ov0Var, i14 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z8;
                        au2Var2 = au2Var7;
                        guVar2 = guVar5;
                        isVar2 = isVar3;
                        z42Var3 = z42Var6;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        au2 au2Var8 = au2VarA;
                        z42Var3 = z42Var2;
                        dv1Var3 = dv1Var2;
                        au2Var2 = au2Var8;
                        z5 = z3;
                        guVar2 = guVarC;
                        isVar2 = isVar;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                    }
                }
                i10 = 13303808 | i9;
                z42Var2 = z42Var;
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var16 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var17 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var18 = hu.a;
                        float f7 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH6 = da0.h(f7, jC);
                        int i113 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH6;
                        dv1Var5 = dv1Var4;
                        i14 = i113;
                    } else {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var19 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var110 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var111 = hu.a;
                        float f8 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH7 = da0.h(f8, jC);
                        int i114 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH7;
                        dv1Var5 = dv1Var4;
                        i14 = i114;
                    }
                    z42 z42Var7 = z42Var2;
                    boolean z9 = z3;
                    au2 au2Var9 = au2VarA;
                    gu guVar6 = guVarC;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z9, au2Var9, guVar6, null, isVar3, z42Var7, qu0Var, ov0Var, i14 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z9;
                    au2Var2 = au2Var9;
                    guVar2 = guVar6;
                    isVar2 = isVar3;
                    z42Var3 = z42Var7;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    au2 au2Var10 = au2VarA;
                    z42Var3 = z42Var2;
                    dv1Var3 = dv1Var2;
                    au2Var2 = au2Var10;
                    z5 = z3;
                    guVar2 = guVarC;
                    isVar2 = isVar;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                }
            }
            au2VarA = au2Var;
            i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            int i115 = i7 | i8;
            if ((i3 & 16) == 0) {
                guVarC = guVar;
                if (ov0Var2.f(guVarC)) {
                }
                i9 = i115 | i17;
                i10 = 720896 | i9;
                i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        z42Var2 = z42Var;
                        if (ov0Var2.f(z42Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var112 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var113 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var114 = hu.a;
                            float f9 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH8 = da0.h(f9, jC);
                            int i116 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH8;
                            dv1Var5 = dv1Var4;
                            i14 = i116;
                        } else {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var115 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var116 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var117 = hu.a;
                            float f10 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH9 = da0.h(f10, jC);
                            int i117 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH9;
                            dv1Var5 = dv1Var4;
                            i14 = i117;
                        }
                        z42 z42Var8 = z42Var2;
                        boolean z10 = z3;
                        au2 au2Var11 = au2VarA;
                        gu guVar7 = guVarC;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z10, au2Var11, guVar7, null, isVar3, z42Var8, qu0Var, ov0Var, i14 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z10;
                        au2Var2 = au2Var11;
                        guVar2 = guVar7;
                        isVar2 = isVar3;
                        z42Var3 = z42Var8;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        au2 au2Var12 = au2VarA;
                        z42Var3 = z42Var2;
                        dv1Var3 = dv1Var2;
                        au2Var2 = au2Var12;
                        z5 = z3;
                        guVar2 = guVarC;
                        isVar2 = isVar;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                    }
                }
                i10 = 13303808 | i9;
                z42Var2 = z42Var;
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var118 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var119 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var1110 = hu.a;
                        float f11 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH10 = da0.h(f11, jC);
                        int i118 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH10;
                        dv1Var5 = dv1Var4;
                        i14 = i118;
                    } else {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1111 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var1112 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var1113 = hu.a;
                        float f12 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH11 = da0.h(f12, jC);
                        int i119 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH11;
                        dv1Var5 = dv1Var4;
                        i14 = i119;
                    }
                    z42 z42Var9 = z42Var2;
                    boolean z11 = z3;
                    au2 au2Var13 = au2VarA;
                    gu guVar8 = guVarC;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z11, au2Var13, guVar8, null, isVar3, z42Var9, qu0Var, ov0Var, i14 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z11;
                    au2Var2 = au2Var13;
                    guVar2 = guVar8;
                    isVar2 = isVar3;
                    z42Var3 = z42Var9;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    au2 au2Var14 = au2VarA;
                    z42Var3 = z42Var2;
                    dv1Var3 = dv1Var2;
                    au2Var2 = au2Var14;
                    z5 = z3;
                    guVar2 = guVarC;
                    isVar2 = isVar;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                }
            }
            guVarC = guVar;
            i9 = i115 | i17;
            i10 = 720896 | i9;
            i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    z42Var2 = z42Var;
                    if (ov0Var2.f(z42Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1114 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var1115 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var1116 = hu.a;
                        float f13 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH12 = da0.h(f13, jC);
                        int i1110 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH12;
                        dv1Var5 = dv1Var4;
                        i14 = i1110;
                    } else {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1117 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var1118 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var1119 = hu.a;
                        float f14 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH13 = da0.h(f14, jC);
                        int i1111 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH13;
                        dv1Var5 = dv1Var4;
                        i14 = i1111;
                    }
                    z42 z42Var10 = z42Var2;
                    boolean z12 = z3;
                    au2 au2Var15 = au2VarA;
                    gu guVar9 = guVarC;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z12, au2Var15, guVar9, null, isVar3, z42Var10, qu0Var, ov0Var, i14 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z12;
                    au2Var2 = au2Var15;
                    guVar2 = guVar9;
                    isVar2 = isVar3;
                    z42Var3 = z42Var10;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    au2 au2Var16 = au2VarA;
                    z42Var3 = z42Var2;
                    dv1Var3 = dv1Var2;
                    au2Var2 = au2Var16;
                    z5 = z3;
                    guVar2 = guVarC;
                    isVar2 = isVar;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                }
            }
            i10 = 13303808 | i9;
            z42Var2 = z42Var;
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var11110 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var11111 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var11112 = hu.a;
                    float f15 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH14 = da0.h(f15, jC);
                    int i1112 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH14;
                    dv1Var5 = dv1Var4;
                    i14 = i1112;
                } else {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var11113 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var11114 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var11115 = hu.a;
                    float f16 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH15 = da0.h(f16, jC);
                    int i1113 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH15;
                    dv1Var5 = dv1Var4;
                    i14 = i1113;
                }
                z42 z42Var11 = z42Var2;
                boolean z13 = z3;
                au2 au2Var17 = au2VarA;
                gu guVar10 = guVarC;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z13, au2Var17, guVar10, null, isVar3, z42Var11, qu0Var, ov0Var, i14 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z13;
                au2Var2 = au2Var17;
                guVar2 = guVar10;
                isVar2 = isVar3;
                z42Var3 = z42Var11;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                au2 au2Var18 = au2VarA;
                z42Var3 = z42Var2;
                dv1Var3 = dv1Var2;
                au2Var2 = au2Var18;
                z5 = z3;
                guVar2 = guVarC;
                isVar2 = isVar;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
            }
        }
        i4 |= 48;
        dv1Var2 = dv1Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            i7 = i4 | 384;
            z3 = z2;
        } else {
            z3 = z2;
            if (ov0Var2.g(z3)) {
                i6 = 256;
            } else {
                i6 = WorkQueueKt.BUFFER_CAPACITY;
            }
            i7 = i4 | i6;
        }
        if ((i3 & 8) == 0) {
            au2VarA = au2Var;
            if (ov0Var2.f(au2VarA)) {
                i8 = 2048;
            }
            int i1114 = i7 | i8;
            if ((i3 & 16) == 0) {
                guVarC = guVar;
                if (ov0Var2.f(guVarC)) {
                }
                i9 = i1114 | i17;
                i10 = 720896 | i9;
                i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        z42Var2 = z42Var;
                        if (ov0Var2.f(z42Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var11116 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var11117 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var11118 = hu.a;
                            float f17 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH16 = da0.h(f17, jC);
                            int i1115 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH16;
                            dv1Var5 = dv1Var4;
                            i14 = i1115;
                        } else {
                            if (i15 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var11119 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var111110 = hu.a;
                                i13 &= -57345;
                                guVarC = hu.c((kz) ov0Var2.j(mz.a));
                            }
                            b52 b52Var111111 = hu.a;
                            float f18 = da0.b;
                            if (z3) {
                                ov0Var2.c0(-112346942);
                                jC = mz.d(lzVar, ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-112259336);
                                jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                                ov0Var2.p(false);
                            }
                            is isVarH17 = da0.h(f18, jC);
                            int i1116 = i13 & (-3670017);
                            if (i11 != 0) {
                                z42Var2 = hu.a;
                            }
                            isVar3 = isVarH17;
                            dv1Var5 = dv1Var4;
                            i14 = i1116;
                        }
                        z42 z42Var12 = z42Var2;
                        boolean z14 = z3;
                        au2 au2Var19 = au2VarA;
                        gu guVar11 = guVarC;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z14, au2Var19, guVar11, null, isVar3, z42Var12, qu0Var, ov0Var, i14 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z14;
                        au2Var2 = au2Var19;
                        guVar2 = guVar11;
                        isVar2 = isVar3;
                        z42Var3 = z42Var12;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        au2 au2Var110 = au2VarA;
                        z42Var3 = z42Var2;
                        dv1Var3 = dv1Var2;
                        au2Var2 = au2Var110;
                        z5 = z3;
                        guVar2 = guVarC;
                        isVar2 = isVar;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                    }
                }
                i10 = 13303808 | i9;
                z42Var2 = z42Var;
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var111112 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var111113 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var111114 = hu.a;
                        float f19 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH18 = da0.h(f19, jC);
                        int i1117 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH18;
                        dv1Var5 = dv1Var4;
                        i14 = i1117;
                    } else {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var111115 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var111116 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var111117 = hu.a;
                        float f110 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH19 = da0.h(f110, jC);
                        int i1118 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH19;
                        dv1Var5 = dv1Var4;
                        i14 = i1118;
                    }
                    z42 z42Var13 = z42Var2;
                    boolean z15 = z3;
                    au2 au2Var111 = au2VarA;
                    gu guVar12 = guVarC;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z15, au2Var111, guVar12, null, isVar3, z42Var13, qu0Var, ov0Var, i14 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z15;
                    au2Var2 = au2Var111;
                    guVar2 = guVar12;
                    isVar2 = isVar3;
                    z42Var3 = z42Var13;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    au2 au2Var112 = au2VarA;
                    z42Var3 = z42Var2;
                    dv1Var3 = dv1Var2;
                    au2Var2 = au2Var112;
                    z5 = z3;
                    guVar2 = guVarC;
                    isVar2 = isVar;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                }
            }
            guVarC = guVar;
            i9 = i1114 | i17;
            i10 = 720896 | i9;
            i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    z42Var2 = z42Var;
                    if (ov0Var2.f(z42Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var111118 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var111119 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var1111110 = hu.a;
                        float f111 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH110 = da0.h(f111, jC);
                        int i1119 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH110;
                        dv1Var5 = dv1Var4;
                        i14 = i1119;
                    } else {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1111111 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var1111112 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var1111113 = hu.a;
                        float f112 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH111 = da0.h(f112, jC);
                        int i11110 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH111;
                        dv1Var5 = dv1Var4;
                        i14 = i11110;
                    }
                    z42 z42Var14 = z42Var2;
                    boolean z16 = z3;
                    au2 au2Var113 = au2VarA;
                    gu guVar13 = guVarC;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z16, au2Var113, guVar13, null, isVar3, z42Var14, qu0Var, ov0Var, i14 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z16;
                    au2Var2 = au2Var113;
                    guVar2 = guVar13;
                    isVar2 = isVar3;
                    z42Var3 = z42Var14;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    au2 au2Var114 = au2VarA;
                    z42Var3 = z42Var2;
                    dv1Var3 = dv1Var2;
                    au2Var2 = au2Var114;
                    z5 = z3;
                    guVar2 = guVarC;
                    isVar2 = isVar;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                }
            }
            i10 = 13303808 | i9;
            z42Var2 = z42Var;
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var1111114 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var1111115 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var1111116 = hu.a;
                    float f113 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH112 = da0.h(f113, jC);
                    int i11111 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH112;
                    dv1Var5 = dv1Var4;
                    i14 = i11111;
                } else {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var1111117 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var1111118 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var1111119 = hu.a;
                    float f114 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH113 = da0.h(f114, jC);
                    int i11112 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH113;
                    dv1Var5 = dv1Var4;
                    i14 = i11112;
                }
                z42 z42Var15 = z42Var2;
                boolean z17 = z3;
                au2 au2Var115 = au2VarA;
                gu guVar14 = guVarC;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z17, au2Var115, guVar14, null, isVar3, z42Var15, qu0Var, ov0Var, i14 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z17;
                au2Var2 = au2Var115;
                guVar2 = guVar14;
                isVar2 = isVar3;
                z42Var3 = z42Var15;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                au2 au2Var116 = au2VarA;
                z42Var3 = z42Var2;
                dv1Var3 = dv1Var2;
                au2Var2 = au2Var116;
                z5 = z3;
                guVar2 = guVarC;
                isVar2 = isVar;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
            }
        }
        au2VarA = au2Var;
        i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        int i11113 = i7 | i8;
        if ((i3 & 16) == 0) {
            guVarC = guVar;
            if (ov0Var2.f(guVarC)) {
            }
            i9 = i11113 | i17;
            i10 = 720896 | i9;
            i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    z42Var2 = z42Var;
                    if (ov0Var2.f(z42Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var11111110 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var11111111 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var11111112 = hu.a;
                        float f115 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH114 = da0.h(f115, jC);
                        int i11114 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH114;
                        dv1Var5 = dv1Var4;
                        i14 = i11114;
                    } else {
                        if (i15 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var11111113 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var11111114 = hu.a;
                            i13 &= -57345;
                            guVarC = hu.c((kz) ov0Var2.j(mz.a));
                        }
                        b52 b52Var11111115 = hu.a;
                        float f116 = da0.b;
                        if (z3) {
                            ov0Var2.c0(-112346942);
                            jC = mz.d(lzVar, ov0Var2);
                            ov0Var2.p(false);
                        } else {
                            ov0Var2.c0(-112259336);
                            jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                            ov0Var2.p(false);
                        }
                        is isVarH115 = da0.h(f116, jC);
                        int i11115 = i13 & (-3670017);
                        if (i11 != 0) {
                            z42Var2 = hu.a;
                        }
                        isVar3 = isVarH115;
                        dv1Var5 = dv1Var4;
                        i14 = i11115;
                    }
                    z42 z42Var16 = z42Var2;
                    boolean z18 = z3;
                    au2 au2Var117 = au2VarA;
                    gu guVar15 = guVarC;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z18, au2Var117, guVar15, null, isVar3, z42Var16, qu0Var, ov0Var, i14 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z18;
                    au2Var2 = au2Var117;
                    guVar2 = guVar15;
                    isVar2 = isVar3;
                    z42Var3 = z42Var16;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    au2 au2Var118 = au2VarA;
                    z42Var3 = z42Var2;
                    dv1Var3 = dv1Var2;
                    au2Var2 = au2Var118;
                    z5 = z3;
                    guVar2 = guVarC;
                    isVar2 = isVar;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
                }
            }
            i10 = 13303808 | i9;
            z42Var2 = z42Var;
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var11111116 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var11111117 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var11111118 = hu.a;
                    float f117 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH116 = da0.h(f117, jC);
                    int i11116 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH116;
                    dv1Var5 = dv1Var4;
                    i14 = i11116;
                } else {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var11111119 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111111110 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var111111111 = hu.a;
                    float f118 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH117 = da0.h(f118, jC);
                    int i11117 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH117;
                    dv1Var5 = dv1Var4;
                    i14 = i11117;
                }
                z42 z42Var17 = z42Var2;
                boolean z19 = z3;
                au2 au2Var119 = au2VarA;
                gu guVar16 = guVarC;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z19, au2Var119, guVar16, null, isVar3, z42Var17, qu0Var, ov0Var, i14 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z19;
                au2Var2 = au2Var119;
                guVar2 = guVar16;
                isVar2 = isVar3;
                z42Var3 = z42Var17;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                au2 au2Var1110 = au2VarA;
                z42Var3 = z42Var2;
                dv1Var3 = dv1Var2;
                au2Var2 = au2Var1110;
                z5 = z3;
                guVar2 = guVarC;
                isVar2 = isVar;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
            }
        }
        guVarC = guVar;
        i9 = i11113 | i17;
        i10 = 720896 | i9;
        i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
        if (i11 != 0) {
            if ((i2 & 12582912) == 0) {
                z42Var2 = z42Var;
                if (ov0Var2.f(z42Var2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var111111112 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111111113 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var111111114 = hu.a;
                    float f119 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH118 = da0.h(f119, jC);
                    int i11118 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH118;
                    dv1Var5 = dv1Var4;
                    i14 = i11118;
                } else {
                    if (i15 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var111111115 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111111116 = hu.a;
                        i13 &= -57345;
                        guVarC = hu.c((kz) ov0Var2.j(mz.a));
                    }
                    b52 b52Var111111117 = hu.a;
                    float f1110 = da0.b;
                    if (z3) {
                        ov0Var2.c0(-112346942);
                        jC = mz.d(lzVar, ov0Var2);
                        ov0Var2.p(false);
                    } else {
                        ov0Var2.c0(-112259336);
                        jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                        ov0Var2.p(false);
                    }
                    is isVarH119 = da0.h(f1110, jC);
                    int i11119 = i13 & (-3670017);
                    if (i11 != 0) {
                        z42Var2 = hu.a;
                    }
                    isVar3 = isVarH119;
                    dv1Var5 = dv1Var4;
                    i14 = i11119;
                }
                z42 z42Var18 = z42Var2;
                boolean z110 = z3;
                au2 au2Var1111 = au2VarA;
                gu guVar17 = guVarC;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z110, au2Var1111, guVar17, null, isVar3, z42Var18, qu0Var, ov0Var, i14 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z110;
                au2Var2 = au2Var1111;
                guVar2 = guVar17;
                isVar2 = isVar3;
                z42Var3 = z42Var18;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                au2 au2Var1112 = au2VarA;
                z42Var3 = z42Var2;
                dv1Var3 = dv1Var2;
                au2Var2 = au2Var1112;
                z5 = z3;
                guVar2 = guVarC;
                isVar2 = isVar;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
            }
        }
        i10 = 13303808 | i9;
        z42Var2 = z42Var;
        i13 = i10 | 100663296;
        if ((306783379 & i13) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ov0Var2.T(i13 & 1, z4)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    b52 b52Var111111118 = hu.a;
                    i13 &= -7169;
                    au2VarA = hu2.a(da0.a, ov0Var2);
                }
                if ((i3 & 16) != 0) {
                    b52 b52Var111111119 = hu.a;
                    i13 &= -57345;
                    guVarC = hu.c((kz) ov0Var2.j(mz.a));
                }
                b52 b52Var1111111110 = hu.a;
                float f1111 = da0.b;
                if (z3) {
                    ov0Var2.c0(-112346942);
                    jC = mz.d(lzVar, ov0Var2);
                    ov0Var2.p(false);
                } else {
                    ov0Var2.c0(-112259336);
                    jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                    ov0Var2.p(false);
                }
                is isVarH1110 = da0.h(f1111, jC);
                int i111110 = i13 & (-3670017);
                if (i11 != 0) {
                    z42Var2 = hu.a;
                }
                isVar3 = isVarH1110;
                dv1Var5 = dv1Var4;
                i14 = i111110;
            } else {
                if (i15 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i3 & 8) != 0) {
                    b52 b52Var1111111111 = hu.a;
                    i13 &= -7169;
                    au2VarA = hu2.a(da0.a, ov0Var2);
                }
                if ((i3 & 16) != 0) {
                    b52 b52Var1111111112 = hu.a;
                    i13 &= -57345;
                    guVarC = hu.c((kz) ov0Var2.j(mz.a));
                }
                b52 b52Var1111111113 = hu.a;
                float f1112 = da0.b;
                if (z3) {
                    ov0Var2.c0(-112346942);
                    jC = mz.d(lzVar, ov0Var2);
                    ov0Var2.p(false);
                } else {
                    ov0Var2.c0(-112259336);
                    jC = hz.c(0.1f, mz.d(lzVar, ov0Var2));
                    ov0Var2.p(false);
                }
                is isVarH1111 = da0.h(f1112, jC);
                int i111111 = i13 & (-3670017);
                if (i11 != 0) {
                    z42Var2 = hu.a;
                }
                isVar3 = isVarH1111;
                dv1Var5 = dv1Var4;
                i14 = i111111;
            }
            z42 z42Var19 = z42Var2;
            boolean z111 = z3;
            au2 au2Var1113 = au2VarA;
            gu guVar18 = guVarC;
            ov0Var2.q();
            ov0Var = ov0Var2;
            a(au0Var, dv1Var5, z111, au2Var1113, guVar18, null, isVar3, z42Var19, qu0Var, ov0Var, i14 & 2147483646, 0);
            dv1Var3 = dv1Var5;
            z5 = z111;
            au2Var2 = au2Var1113;
            guVar2 = guVar18;
            isVar2 = isVar3;
            z42Var3 = z42Var19;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            au2 au2Var1114 = au2VarA;
            z42Var3 = z42Var2;
            dv1Var3 = dv1Var2;
            au2Var2 = au2Var1114;
            z5 = z3;
            guVar2 = guVarC;
            isVar2 = isVar;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ou(au0Var, dv1Var3, z5, au2Var2, guVar2, isVar2, z42Var3, qu0Var, i2, i3);
        }
    }

    public static final void i(GithubRelease githubRelease, boolean z2, og3 og3Var, au0 au0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(619516417);
        int i3 = i2 | (ov0Var.h(githubRelease) ? 4 : 2) | (ov0Var.g(z2) ? 32 : 16) | (ov0Var.h(og3Var) ? 16384 : 8192) | (ov0Var.h(au0Var) ? 131072 : 65536);
        if (ov0Var.T(i3 & 1, (74899 & i3) != 74898)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(260448112, new j5(5, githubRelease, au0Var, og3Var, z2), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(githubRelease, z2, og3Var, au0Var, i2, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x013d  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void j(final au0 au0Var, dv1 dv1Var, boolean z2, au2 au2Var, gu guVar, z42 z42Var, final qu0 qu0Var, f30 f30Var, final int i2, final int i3) {
        int i4;
        dv1 dv1Var2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        au2 au2VarA;
        int i8;
        gu guVarD;
        int i9;
        int i10;
        int i11;
        z42 z42Var2;
        int i12;
        int i13;
        boolean z4;
        ov0 ov0Var;
        final dv1 dv1Var3;
        final boolean z5;
        final au2 au2Var2;
        final gu guVar2;
        final z42 z42Var3;
        ee2 ee2VarT;
        dv1 dv1Var4;
        z42 z42Var4;
        dv1 dv1Var5;
        au2 au2Var3;
        boolean z6;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1061374109);
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var2.h(au0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 48) == 0) {
                dv1Var2 = dv1Var;
                i4 |= ov0Var2.f(dv1Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i7 = i4 | 384;
                z3 = z2;
            } else {
                z3 = z2;
                if (ov0Var2.g(z3)) {
                    i6 = 256;
                } else {
                    i6 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i7 = i4 | i6;
            }
            if ((i3 & 8) == 0) {
                au2VarA = au2Var;
                if (ov0Var2.f(au2VarA)) {
                    i8 = 2048;
                }
                int i15 = i7 | i8;
                if ((i3 & 16) == 0) {
                    guVarD = guVar;
                    int i16 = ov0Var2.f(guVarD) ? 16384 : 8192;
                    i9 = i15 | i16;
                    i10 = 1769472 | i9;
                    i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                    if (i11 != 0) {
                        if ((i2 & 12582912) == 0) {
                            z42Var2 = z42Var;
                            if (ov0Var2.f(z42Var2)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i10 |= i12;
                        }
                        i13 = i10 | 100663296;
                        if ((306783379 & i13) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ov0Var2.T(i13 & 1, z4)) {
                            ov0Var2.Y();
                            if ((i2 & 1) != 0 || ov0Var2.B()) {
                                if (i14 != 0) {
                                    dv1Var4 = av1.a;
                                } else {
                                    dv1Var4 = dv1Var2;
                                }
                                boolean z7 = i5 == 0 ? z3 : true;
                                if ((i3 & 8) != 0) {
                                    b52 b52Var = hu.a;
                                    i13 &= -7169;
                                    au2VarA = hu2.a(da0.a, ov0Var2);
                                }
                                if ((i3 & 16) != 0) {
                                    b52 b52Var2 = hu.a;
                                    guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                    i13 &= -57345;
                                }
                                if (i11 != 0) {
                                    z42Var2 = hu.b;
                                }
                                z42Var4 = z42Var2;
                                dv1Var5 = dv1Var4;
                                au2Var3 = au2VarA;
                                z6 = z7;
                            } else {
                                ov0Var2.W();
                                if ((i3 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                z42Var4 = z42Var2;
                                dv1Var5 = dv1Var2;
                                z6 = z3;
                                au2Var3 = au2VarA;
                            }
                            gu guVar3 = guVarD;
                            ov0Var2.q();
                            ov0Var = ov0Var2;
                            a(au0Var, dv1Var5, z6, au2Var3, guVar3, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                            dv1Var3 = dv1Var5;
                            z5 = z6;
                            au2Var2 = au2Var3;
                            guVar2 = guVar3;
                            z42Var3 = z42Var4;
                        } else {
                            ov0Var = ov0Var2;
                            ov0Var.W();
                            dv1Var3 = dv1Var2;
                            z5 = z3;
                            au2Var2 = au2VarA;
                            guVar2 = guVarD;
                            z42Var3 = z42Var2;
                        }
                        ee2VarT = ov0Var.t();
                        if (ee2VarT != null) {
                            ee2VarT.d = new pu0() { // from class: nu
                                @Override // defpackage.pu0
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                                    return mf3.a;
                                }
                            };
                        }
                    }
                    i10 = 14352384 | i9;
                    z42Var2 = z42Var;
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var3 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var4 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        } else {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var5 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var6 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        }
                        gu guVar4 = guVarD;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z6, au2Var3, guVar4, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z6;
                        au2Var2 = au2Var3;
                        guVar2 = guVar4;
                        z42Var3 = z42Var4;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        dv1Var3 = dv1Var2;
                        z5 = z3;
                        au2Var2 = au2VarA;
                        guVar2 = guVarD;
                        z42Var3 = z42Var2;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new pu0() { // from class: nu
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                                return mf3.a;
                            }
                        };
                    }
                }
                guVarD = guVar;
                i9 = i15 | i16;
                i10 = 1769472 | i9;
                i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        z42Var2 = z42Var;
                        if (ov0Var2.f(z42Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var7 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var8 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        } else {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var9 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var10 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        }
                        gu guVar5 = guVarD;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z6, au2Var3, guVar5, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z6;
                        au2Var2 = au2Var3;
                        guVar2 = guVar5;
                        z42Var3 = z42Var4;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        dv1Var3 = dv1Var2;
                        z5 = z3;
                        au2Var2 = au2VarA;
                        guVar2 = guVarD;
                        z42Var3 = z42Var2;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new pu0() { // from class: nu
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                                return mf3.a;
                            }
                        };
                    }
                }
                i10 = 14352384 | i9;
                z42Var2 = z42Var;
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var11 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var12 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    } else {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var13 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var14 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    }
                    gu guVar6 = guVarD;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z6, au2Var3, guVar6, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z6;
                    au2Var2 = au2Var3;
                    guVar2 = guVar6;
                    z42Var3 = z42Var4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    z5 = z3;
                    au2Var2 = au2VarA;
                    guVar2 = guVarD;
                    z42Var3 = z42Var2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: nu
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                            return mf3.a;
                        }
                    };
                }
            }
            au2VarA = au2Var;
            i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            int i17 = i7 | i8;
            if ((i3 & 16) == 0) {
                guVarD = guVar;
                if (ov0Var2.f(guVarD)) {
                }
                i9 = i17 | i16;
                i10 = 1769472 | i9;
                i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        z42Var2 = z42Var;
                        if (ov0Var2.f(z42Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var15 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var16 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        } else {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var17 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var18 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        }
                        gu guVar7 = guVarD;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z6, au2Var3, guVar7, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z6;
                        au2Var2 = au2Var3;
                        guVar2 = guVar7;
                        z42Var3 = z42Var4;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        dv1Var3 = dv1Var2;
                        z5 = z3;
                        au2Var2 = au2VarA;
                        guVar2 = guVarD;
                        z42Var3 = z42Var2;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new pu0() { // from class: nu
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                                return mf3.a;
                            }
                        };
                    }
                }
                i10 = 14352384 | i9;
                z42Var2 = z42Var;
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var19 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var110 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    } else {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var111 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var112 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    }
                    gu guVar8 = guVarD;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z6, au2Var3, guVar8, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z6;
                    au2Var2 = au2Var3;
                    guVar2 = guVar8;
                    z42Var3 = z42Var4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    z5 = z3;
                    au2Var2 = au2VarA;
                    guVar2 = guVarD;
                    z42Var3 = z42Var2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: nu
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                            return mf3.a;
                        }
                    };
                }
            }
            guVarD = guVar;
            i9 = i17 | i16;
            i10 = 1769472 | i9;
            i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    z42Var2 = z42Var;
                    if (ov0Var2.f(z42Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var113 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var114 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    } else {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var115 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var116 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    }
                    gu guVar9 = guVarD;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z6, au2Var3, guVar9, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z6;
                    au2Var2 = au2Var3;
                    guVar2 = guVar9;
                    z42Var3 = z42Var4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    z5 = z3;
                    au2Var2 = au2VarA;
                    guVar2 = guVarD;
                    z42Var3 = z42Var2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: nu
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                            return mf3.a;
                        }
                    };
                }
            }
            i10 = 14352384 | i9;
            z42Var2 = z42Var;
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var117 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var118 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                } else {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var119 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var1110 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                }
                gu guVar10 = guVarD;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z6, au2Var3, guVar10, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z6;
                au2Var2 = au2Var3;
                guVar2 = guVar10;
                z42Var3 = z42Var4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var3 = dv1Var2;
                z5 = z3;
                au2Var2 = au2VarA;
                guVar2 = guVarD;
                z42Var3 = z42Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: nu
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        i4 |= 48;
        dv1Var2 = dv1Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            i7 = i4 | 384;
            z3 = z2;
        } else {
            z3 = z2;
            if (ov0Var2.g(z3)) {
                i6 = 256;
            } else {
                i6 = WorkQueueKt.BUFFER_CAPACITY;
            }
            i7 = i4 | i6;
        }
        if ((i3 & 8) == 0) {
            au2VarA = au2Var;
            if (ov0Var2.f(au2VarA)) {
                i8 = 2048;
            }
            int i18 = i7 | i8;
            if ((i3 & 16) == 0) {
                guVarD = guVar;
                if (ov0Var2.f(guVarD)) {
                }
                i9 = i18 | i16;
                i10 = 1769472 | i9;
                i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        z42Var2 = z42Var;
                        if (ov0Var2.f(z42Var2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i10 | 100663296;
                    if ((306783379 & i13) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ov0Var2.T(i13 & 1, z4)) {
                        ov0Var2.Y();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var1111 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var1112 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        } else {
                            if (i14 != 0) {
                                dv1Var4 = av1.a;
                            } else {
                                dv1Var4 = dv1Var2;
                            }
                            if (i5 == 0) {
                            }
                            if ((i3 & 8) != 0) {
                                b52 b52Var1113 = hu.a;
                                i13 &= -7169;
                                au2VarA = hu2.a(da0.a, ov0Var2);
                            }
                            if ((i3 & 16) != 0) {
                                b52 b52Var1114 = hu.a;
                                guVarD = hu.d((kz) ov0Var2.j(mz.a));
                                i13 &= -57345;
                            }
                            if (i11 != 0) {
                                z42Var2 = hu.b;
                            }
                            z42Var4 = z42Var2;
                            dv1Var5 = dv1Var4;
                            au2Var3 = au2VarA;
                            z6 = z7;
                        }
                        gu guVar11 = guVarD;
                        ov0Var2.q();
                        ov0Var = ov0Var2;
                        a(au0Var, dv1Var5, z6, au2Var3, guVar11, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                        dv1Var3 = dv1Var5;
                        z5 = z6;
                        au2Var2 = au2Var3;
                        guVar2 = guVar11;
                        z42Var3 = z42Var4;
                    } else {
                        ov0Var = ov0Var2;
                        ov0Var.W();
                        dv1Var3 = dv1Var2;
                        z5 = z3;
                        au2Var2 = au2VarA;
                        guVar2 = guVarD;
                        z42Var3 = z42Var2;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new pu0() { // from class: nu
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                                return mf3.a;
                            }
                        };
                    }
                }
                i10 = 14352384 | i9;
                z42Var2 = z42Var;
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1115 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var1116 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    } else {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1117 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var1118 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    }
                    gu guVar12 = guVarD;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z6, au2Var3, guVar12, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z6;
                    au2Var2 = au2Var3;
                    guVar2 = guVar12;
                    z42Var3 = z42Var4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    z5 = z3;
                    au2Var2 = au2VarA;
                    guVar2 = guVarD;
                    z42Var3 = z42Var2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: nu
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                            return mf3.a;
                        }
                    };
                }
            }
            guVarD = guVar;
            i9 = i18 | i16;
            i10 = 1769472 | i9;
            i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    z42Var2 = z42Var;
                    if (ov0Var2.f(z42Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var1119 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var11110 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    } else {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var11111 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var11112 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    }
                    gu guVar13 = guVarD;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z6, au2Var3, guVar13, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z6;
                    au2Var2 = au2Var3;
                    guVar2 = guVar13;
                    z42Var3 = z42Var4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    z5 = z3;
                    au2Var2 = au2VarA;
                    guVar2 = guVarD;
                    z42Var3 = z42Var2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: nu
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                            return mf3.a;
                        }
                    };
                }
            }
            i10 = 14352384 | i9;
            z42Var2 = z42Var;
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var11113 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var11114 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                } else {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var11115 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var11116 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                }
                gu guVar14 = guVarD;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z6, au2Var3, guVar14, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z6;
                au2Var2 = au2Var3;
                guVar2 = guVar14;
                z42Var3 = z42Var4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var3 = dv1Var2;
                z5 = z3;
                au2Var2 = au2VarA;
                guVar2 = guVarD;
                z42Var3 = z42Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: nu
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        au2VarA = au2Var;
        i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        int i19 = i7 | i8;
        if ((i3 & 16) == 0) {
            guVarD = guVar;
            if (ov0Var2.f(guVarD)) {
            }
            i9 = i19 | i16;
            i10 = 1769472 | i9;
            i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((i2 & 12582912) == 0) {
                    z42Var2 = z42Var;
                    if (ov0Var2.f(z42Var2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i10 | 100663296;
                if ((306783379 & i13) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ov0Var2.T(i13 & 1, z4)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var11117 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var11118 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    } else {
                        if (i14 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            b52 b52Var11119 = hu.a;
                            i13 &= -7169;
                            au2VarA = hu2.a(da0.a, ov0Var2);
                        }
                        if ((i3 & 16) != 0) {
                            b52 b52Var111110 = hu.a;
                            guVarD = hu.d((kz) ov0Var2.j(mz.a));
                            i13 &= -57345;
                        }
                        if (i11 != 0) {
                            z42Var2 = hu.b;
                        }
                        z42Var4 = z42Var2;
                        dv1Var5 = dv1Var4;
                        au2Var3 = au2VarA;
                        z6 = z7;
                    }
                    gu guVar15 = guVarD;
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    a(au0Var, dv1Var5, z6, au2Var3, guVar15, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                    dv1Var3 = dv1Var5;
                    z5 = z6;
                    au2Var2 = au2Var3;
                    guVar2 = guVar15;
                    z42Var3 = z42Var4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    dv1Var3 = dv1Var2;
                    z5 = z3;
                    au2Var2 = au2VarA;
                    guVar2 = guVarD;
                    z42Var3 = z42Var2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: nu
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                            return mf3.a;
                        }
                    };
                }
            }
            i10 = 14352384 | i9;
            z42Var2 = z42Var;
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var111111 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111112 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                } else {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var111113 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111114 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                }
                gu guVar16 = guVarD;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z6, au2Var3, guVar16, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z6;
                au2Var2 = au2Var3;
                guVar2 = guVar16;
                z42Var3 = z42Var4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var3 = dv1Var2;
                z5 = z3;
                au2Var2 = au2VarA;
                guVar2 = guVarD;
                z42Var3 = z42Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: nu
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        guVarD = guVar;
        i9 = i19 | i16;
        i10 = 1769472 | i9;
        i11 = i3 & WorkQueueKt.BUFFER_CAPACITY;
        if (i11 != 0) {
            if ((i2 & 12582912) == 0) {
                z42Var2 = z42Var;
                if (ov0Var2.f(z42Var2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
            i13 = i10 | 100663296;
            if ((306783379 & i13) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i13 & 1, z4)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var111115 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111116 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                } else {
                    if (i14 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        b52 b52Var111117 = hu.a;
                        i13 &= -7169;
                        au2VarA = hu2.a(da0.a, ov0Var2);
                    }
                    if ((i3 & 16) != 0) {
                        b52 b52Var111118 = hu.a;
                        guVarD = hu.d((kz) ov0Var2.j(mz.a));
                        i13 &= -57345;
                    }
                    if (i11 != 0) {
                        z42Var2 = hu.b;
                    }
                    z42Var4 = z42Var2;
                    dv1Var5 = dv1Var4;
                    au2Var3 = au2VarA;
                    z6 = z7;
                }
                gu guVar17 = guVarD;
                ov0Var2.q();
                ov0Var = ov0Var2;
                a(au0Var, dv1Var5, z6, au2Var3, guVar17, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
                dv1Var3 = dv1Var5;
                z5 = z6;
                au2Var2 = au2Var3;
                guVar2 = guVar17;
                z42Var3 = z42Var4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                dv1Var3 = dv1Var2;
                z5 = z3;
                au2Var2 = au2VarA;
                guVar2 = guVarD;
                z42Var3 = z42Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: nu
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        i10 = 14352384 | i9;
        z42Var2 = z42Var;
        i13 = i10 | 100663296;
        if ((306783379 & i13) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ov0Var2.T(i13 & 1, z4)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) != 0) {
                    b52 b52Var111119 = hu.a;
                    i13 &= -7169;
                    au2VarA = hu2.a(da0.a, ov0Var2);
                }
                if ((i3 & 16) != 0) {
                    b52 b52Var1111110 = hu.a;
                    guVarD = hu.d((kz) ov0Var2.j(mz.a));
                    i13 &= -57345;
                }
                if (i11 != 0) {
                    z42Var2 = hu.b;
                }
                z42Var4 = z42Var2;
                dv1Var5 = dv1Var4;
                au2Var3 = au2VarA;
                z6 = z7;
            } else {
                if (i14 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) != 0) {
                    b52 b52Var1111111 = hu.a;
                    i13 &= -7169;
                    au2VarA = hu2.a(da0.a, ov0Var2);
                }
                if ((i3 & 16) != 0) {
                    b52 b52Var1111112 = hu.a;
                    guVarD = hu.d((kz) ov0Var2.j(mz.a));
                    i13 &= -57345;
                }
                if (i11 != 0) {
                    z42Var2 = hu.b;
                }
                z42Var4 = z42Var2;
                dv1Var5 = dv1Var4;
                au2Var3 = au2VarA;
                z6 = z7;
            }
            gu guVar18 = guVarD;
            ov0Var2.q();
            ov0Var = ov0Var2;
            a(au0Var, dv1Var5, z6, au2Var3, guVar18, null, null, z42Var4, qu0Var, ov0Var, i13 & 2147483646, 0);
            dv1Var3 = dv1Var5;
            z5 = z6;
            au2Var2 = au2Var3;
            guVar2 = guVar18;
            z42Var3 = z42Var4;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            dv1Var3 = dv1Var2;
            z5 = z3;
            au2Var2 = au2VarA;
            guVar2 = guVarD;
            z42Var3 = z42Var2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: nu
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n51.j(au0Var, dv1Var3, z5, au2Var2, guVar2, z42Var3, qu0Var, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public static final void k(final xg3 xg3Var, final ul1 ul1Var, final boolean z2, final au0 au0Var, f30 f30Var, int i2) {
        au0 au0Var2;
        ov0 ov0Var;
        c30 c30Var;
        Object obj;
        final yd1 yd1Var;
        x30 x30Var;
        ul1Var.getClass();
        au0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(818977579);
        int i3 = i2 | (ov0Var2.h(xg3Var) ? 4 : 2) | (ov0Var2.h(ul1Var) ? 32 : 16) | (ov0Var2.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0 && !ov0Var2.B()) {
                ov0Var2.W();
            }
            ov0Var2.q();
            final ey1 ey1VarS = ee0.s(xg3Var.d, ov0Var2);
            yd1 yd1VarA = ae1.a(ov0Var2);
            ja1 ja1VarX = o51.x(ov0Var2);
            Object objQ = ov0Var2.Q();
            c30 c30Var2 = d30.a;
            if (objQ == c30Var2) {
                objQ = oi0.j(ov0Var2);
                ov0Var2.m0(objQ);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var2) {
                objQ2 = new h63(9);
                ov0Var2.m0(objQ2);
            }
            final ey1 ey1Var = (ey1) wc0.c0(objArr, (au0) objQ2, ov0Var2, 48);
            v7 v7Var = new v7("application/vnd.android.package-archive");
            boolean zH = ov0Var2.h(xg3Var);
            Object objQ3 = ov0Var2.Q();
            if (zH || objQ3 == c30Var2) {
                objQ3 = new ge2(xg3Var, 23);
                ov0Var2.m0(objQ3);
            }
            final no1 no1VarB0 = sb.b0(v7Var, (lu0) objQ3, ov0Var2);
            xq1.g(false, au0Var, ov0Var2, (i3 >> 6) & 112, 1);
            boolean zF = ov0Var2.f(ey1VarS) | ov0Var2.h(xg3Var);
            Object objQ4 = ov0Var2.Q();
            q60 q60Var = null;
            if (zF || objQ4 == c30Var2) {
                objQ4 = new l80(xg3Var, ey1VarS, q60Var, 17);
                ov0Var2.m0(objQ4);
            }
            oi0.e(ov0Var2, (pu0) objQ4, mf3.a);
            final List list = ((og3) ey1VarS.getValue()).c;
            boolean zF2 = ov0Var2.f(list);
            Object objQ5 = ov0Var2.Q();
            Object obj2 = objQ5;
            if (zF2 || objQ5 == c30Var2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (mc0.y(((GithubRelease) obj3).getVersionName())) {
                        arrayList.add(obj3);
                    }
                }
                ov0Var2.m0(arrayList);
                obj2 = arrayList;
            }
            final boolean z3 = !((List) obj2).isEmpty();
            final GithubRelease githubRelease = (GithubRelease) zy.o0(list);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c30Var = c30Var2;
                    obj = null;
                    break;
                }
                Object next = it.next();
                Iterator it2 = it;
                int versionCode = ((GithubRelease) next).getVersionCode();
                Integer num = (Integer) ey1Var.getValue();
                c30Var = c30Var2;
                if (num != null && versionCode == num.intValue()) {
                    obj = next;
                    break;
                } else {
                    it = it2;
                    c30Var2 = c30Var;
                }
            }
            GithubRelease githubRelease2 = (GithubRelease) obj;
            if (githubRelease2 == null) {
                githubRelease2 = githubRelease;
            }
            fn0 fn0Var = iw2.c;
            long j2 = z2 ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j2, iy0Var);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarK);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var2, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var2, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var2, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH);
            dv1 dv1VarF = zm3.F(am1.E(fn0Var, ja1VarX), 16.0f, 0.0f, 2);
            b52 b52VarF = zm3.f(5, 36.0f);
            jo joVar = new jo(16.0f, true, new fo(0));
            boolean zF3 = ((i3 & 7168) == 2048) | ov0Var2.f(ey1VarS) | ov0Var2.g(z3) | ov0Var2.h(githubRelease) | ((((i3 & 896) ^ 384) > 256 && ov0Var2.g(z2)) || (i3 & 384) == 256) | ov0Var2.h(xg3Var) | ov0Var2.h(no1VarB0) | ov0Var2.h(ul1Var) | ov0Var2.h(githubRelease2) | ov0Var2.h(list) | ov0Var2.f(ey1Var) | ov0Var2.h(list) | ov0Var2.h(coroutineScope) | ov0Var2.f(yd1VarA);
            Object objQ6 = ov0Var2.Q();
            if (zF3 || objQ6 == c30Var) {
                final GithubRelease githubRelease3 = githubRelease2;
                yd1Var = yd1VarA;
                objQ6 = new lu0() { // from class: mg3
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj4) {
                        ey1 ey1Var2;
                        kd1 kd1Var = (kd1) obj4;
                        kd1Var.getClass();
                        kd1Var.a(null, null, am1.x);
                        final boolean z4 = z3;
                        final GithubRelease githubRelease4 = githubRelease;
                        final boolean z5 = z2;
                        final xg3 xg3Var2 = xg3Var;
                        final no1 no1Var = no1VarB0;
                        final ul1 ul1Var2 = ul1Var;
                        final au0 au0Var3 = au0Var;
                        final ey1 ey1Var3 = ey1VarS;
                        qu0 qu0Var = new qu0() { // from class: ng3
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                f30 f30Var2 = (f30) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                ((bc1) obj5).getClass();
                                int i4 = 0;
                                int i5 = 1;
                                ov0 ov0Var3 = (ov0) f30Var2;
                                if (ov0Var3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    og3 og3Var = (og3) ey1Var3.getValue();
                                    xg3 xg3Var3 = xg3Var2;
                                    boolean zH2 = ov0Var3.h(xg3Var3);
                                    Object objQ7 = ov0Var3.Q();
                                    c30 c30Var3 = d30.a;
                                    if (zH2 || objQ7 == c30Var3) {
                                        objQ7 = new ig3(xg3Var3, i4);
                                        ov0Var3.m0(objQ7);
                                    }
                                    au0 au0Var4 = (au0) objQ7;
                                    boolean zH3 = ov0Var3.h(xg3Var3);
                                    Object objQ8 = ov0Var3.Q();
                                    if (zH3 || objQ8 == c30Var3) {
                                        objQ8 = new jg3(xg3Var3, 0);
                                        ov0Var3.m0(objQ8);
                                    }
                                    pu0 pu0Var = (pu0) objQ8;
                                    boolean zH4 = ov0Var3.h(xg3Var3);
                                    Object objQ9 = ov0Var3.Q();
                                    if (zH4 || objQ9 == c30Var3) {
                                        objQ9 = new ig3(xg3Var3, i5);
                                        ov0Var3.m0(objQ9);
                                    }
                                    au0 au0Var5 = (au0) objQ9;
                                    boolean zH5 = ov0Var3.h(xg3Var3);
                                    no1 no1Var2 = no1Var;
                                    boolean zH6 = zH5 | ov0Var3.h(no1Var2);
                                    Object objQ10 = ov0Var3.Q();
                                    if (zH6 || objQ10 == c30Var3) {
                                        objQ10 = new qi2(17, xg3Var3, no1Var2);
                                        ov0Var3.m0(objQ10);
                                    }
                                    au0 au0Var6 = (au0) objQ10;
                                    boolean zH7 = ov0Var3.h(xg3Var3);
                                    Object objQ11 = ov0Var3.Q();
                                    if (zH7 || objQ11 == c30Var3) {
                                        objQ11 = new ig3(xg3Var3, 2);
                                        ov0Var3.m0(objQ11);
                                    }
                                    au0 au0Var7 = (au0) objQ11;
                                    ul1 ul1Var3 = ul1Var2;
                                    boolean zH8 = ov0Var3.h(ul1Var3);
                                    au0 au0Var8 = au0Var3;
                                    boolean zF4 = zH8 | ov0Var3.f(au0Var8);
                                    Object objQ12 = ov0Var3.Q();
                                    if (zF4 || objQ12 == c30Var3) {
                                        objQ12 = new fc3(5, ul1Var3, au0Var8);
                                        ov0Var3.m0(objQ12);
                                    }
                                    n51.e(og3Var, z4, githubRelease4, z5, au0Var4, pu0Var, au0Var5, au0Var6, au0Var7, (lu0) objQ12, ov0Var3, 384);
                                } else {
                                    ov0Var3.W();
                                }
                                return mf3.a;
                            }
                        };
                        int i4 = 1;
                        kd1Var.a(null, null, new p10(qu0Var, true, 642116797));
                        GithubRelease githubRelease5 = githubRelease3;
                        ey1 ey1Var4 = ey1Var;
                        if (githubRelease5 != null) {
                            ey1Var2 = ey1Var3;
                            kd1Var.a(null, null, new p10(new b3(githubRelease5, list, ey1Var4, xg3Var2, ey1Var2), true, 1144601605));
                        } else {
                            ey1Var2 = ey1Var3;
                        }
                        kd1Var.a(null, null, new p10(new hg3(xg3Var2, ey1Var2, i4), true, -1705120066));
                        ey1 ey1Var5 = ey1Var2;
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            kd1Var.a(null, null, new p10(new z5(8, z4), true, -1154261279));
                            kd1Var.c(list2.size(), null, new u3(list2, 14), new p10(new do1(list2, ey1Var4, coroutineScope, yd1Var, ey1Var5), true, 802480018));
                        }
                        return mf3.a;
                    }
                };
                au0Var2 = au0Var;
                ov0Var2.m0(objQ6);
            } else {
                yd1Var = yd1VarA;
                au0Var2 = au0Var;
            }
            ke0.d(dv1VarF, yd1Var, b52VarF, joVar, null, null, false, null, (lu0) objQ6, ov0Var2, 24960, 488);
            ov0 ov0Var3 = ov0Var2;
            av1 av1Var = av1.a;
            ws.a(xp1.j(k22.k(iw2.g(iw2.e(av1Var, 1.0f), 96.0f), j9.g), u92.p(am1.G(new hz(z2 ? bk.a : bk.d), new hz(hz.c(0.92f, z2 ? bk.a : bk.d)), new hz(hz.c(0.45f, z2 ? bk.a : bk.d)), new hz(hz.f)))), ov0Var3, 0);
            dv1 dv1VarK2 = k22.k(zm3.E(ji2.U(iw2.e(av1Var, 1.0f)), 16.0f, 12.0f), prVar);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var3, 48);
            int iHashCode2 = Long.hashCode(ov0Var3.T);
            l72 l72VarL2 = ov0Var3.l();
            dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarK2);
            ov0Var3.g0();
            if (ov0Var3.S) {
                x30Var = x30Var2;
                ov0Var3.k(x30Var);
            } else {
                x30Var = x30Var2;
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar, kk2VarA);
            q73.h(ov0Var3, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var3, ghVar3, ov0Var3, waVar);
            q73.h(ov0Var3, ghVar4, dv1VarH2);
            dv1 dv1VarK3 = iw2.k(av1Var, 44.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarA = bk.a(ji2.w(xp1.k(xp1.n(hd0.O(dv1VarK3, 6.0f, bj2Var, 0L, 0L, 24), bj2Var), z2 ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, z2 ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), bj2Var), au0Var2);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iHashCode3 = Long.hashCode(ov0Var3.T);
            l72 l72VarL3 = ov0Var3.l();
            dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarA);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar, er1VarC2);
            q73.h(ov0Var3, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var3, ghVar3, ov0Var3, waVar);
            q73.h(ov0Var3, ghVar4, dv1VarH3);
            t01.a(u(), ke0.N(2131624056, ov0Var3), iw2.k(av1Var, 21.0f), z2 ? hz.c : xp1.d(4279901472L), ov0Var3, 384, 0);
            ov0Var3.p(true);
            ov0Var3.p(true);
            ov0Var3.p(true);
            ov0Var = ov0Var3;
        } else {
            au0Var2 = au0Var;
            ov0 ov0Var4 = ov0Var2;
            ov0Var4.W();
            ov0Var = ov0Var4;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(xg3Var, ul1Var, z2, au0Var2, i2);
        }
    }

    public static final Bitmap l(td tdVar) {
        if (tdVar instanceof td) {
            return tdVar.a;
        }
        b81.s("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [qd2, t20] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [iv0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List m(kx2 kx2Var, Integer num, int i2, Integer num2) {
        int iD;
        int iR;
        sx1 sx1Var;
        if (kx2Var.w || kx2Var.o() == 0) {
            return uj0.e;
        }
        ?? qd2Var = new qd2(kx2Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = kx2Var.v;
            if (iD < 0) {
                iD = kx2Var.D(kx2Var.b, i2);
            }
        }
        if (num == 0) {
            int iM = kx2Var.i - kx2Var.M(kx2Var.b, kx2Var.q(i2));
            gx1 gx1Var = kx2Var.s;
            num = Integer.valueOf(iM + ((gx1Var == null || (sx1Var = (sx1) gx1Var.b(i2)) == null) ? 0 : sx1Var.b));
        }
        int iQ = kx2Var.q(i2) * 5;
        int[] iArr = kx2Var.b;
        if (iQ < iArr.length) {
            iR = kx2Var.r(i2);
        } else {
            int iD2 = iD >= 0 ? kx2Var.D(iArr, iD) : iD;
            iR = kx2Var.r(iD);
            int i3 = iD;
            iD = iD2;
            i2 = i3;
        }
        while (i2 >= 0) {
            qd2Var.k(iR, (kx2Var.b[(kx2Var.q(i2) * 5) + 1] & 536870912) != 0 ? kx2Var.s(i2) : d30.a, kx2Var.N(i2), num);
            num = kx2Var.b(i2);
            if (iD >= 0) {
                int iD3 = kx2Var.D(kx2Var.b, iD);
                iR = kx2Var.r(iD);
                int i4 = iD;
                iD = iD3;
                i2 = i4;
            } else {
                i2 = iD;
            }
        }
        return (ArrayList) qd2Var.a;
    }

    public static final dc0 n(View view) {
        dm3 dm3Var;
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            bc0 bc0VarD = zm3.d(context);
            long jA = vd0.a(configuration.screenWidthDp, configuration.screenHeightDp);
            return new dc0(mc0.I(bc0VarD.A0(jA)), jA);
        }
        bm3.a.getClass();
        am3 am3Var = am3.a;
        cm3 cm3Var = am3.b;
        cm3Var.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            dm3Var = zb0.f;
        } else {
            dm3Var = i2 >= 30 ? ts.f : u92.x;
        }
        zl3 zl3VarE = dm3Var.e(contextWrapper2, cm3Var.b);
        long jWidth = (((long) zl3VarE.a().width()) << 32) | (((long) zl3VarE.a().height()) & 4294967295L);
        return new dc0(jWidth, zm3.d(baseContext).P(mc0.J(jWidth)));
    }

    public static final byte o(char c2) {
        if (c2 < '~') {
            return pw.b[c2];
        }
        return (byte) 0;
    }

    public static dv1 p(dv1 dv1Var) {
        return dv1Var.d(new cx(new v1(24)));
    }

    public static final boolean q(pe2 pe2Var, long j2) {
        float f2 = pe2Var.a;
        float f3 = pe2Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = pe2Var.b;
        float f5 = pe2Var.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final Integer r(gx2 gx2Var, o30 o30Var, int i2, int i3) {
        Integer numR;
        int[] iArr = gx2Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (gx2Var.j(i2) && gx2Var.i(i2) == 206 && o51.f(gx2Var.p(iArr, i2), j30.e)) {
                Object objH = gx2Var.h(i2, 0);
                sv0 sv0Var = objH instanceof sv0 ? (sv0) objH : null;
                mf2 mf2Var = sv0Var != null ? sv0Var.a : null;
                lv0 lv0Var = mf2Var instanceof lv0 ? (lv0) mf2Var : null;
                if (lv0Var != null && lv0Var.e == o30Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (gx2Var.d(i2) && (numR = r(gx2Var, o30Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numR.intValue());
            }
            i2 = i4;
        }
    }

    public static final dv1 s(dv1 dv1Var, ix1 ix1Var, boolean z2) {
        return dv1Var.d(z2 ? new hq0(ix1Var) : av1.a);
    }

    public static final x01 t() {
        x01 x01Var = Q;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(18.0f, 13.0f);
        nx0Var.i(-5.0f);
        nx0Var.s(5.0f);
        nx0Var.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        nx0Var.o(-1.0f, -0.45f, -1.0f, -1.0f);
        nx0Var.s(-5.0f);
        nx0Var.h(6.0f);
        nx0Var.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0Var.o(0.45f, -1.0f, 1.0f, -1.0f);
        nx0Var.i(5.0f);
        nx0Var.r(6.0f);
        nx0Var.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        nx0Var.o(1.0f, 0.45f, 1.0f, 1.0f);
        nx0Var.s(5.0f);
        nx0Var.i(5.0f);
        nx0Var.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        nx0Var.o(-0.45f, 1.0f, -1.0f, 1.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        Q = x01VarB;
        return x01VarB;
    }

    public static final x01 u() {
        x01 x01Var = R;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("AutoMirrored.Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(19.0f, 11.0f);
        nx0Var.h(7.83f);
        nx0Var.l(4.88f, -4.88f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        nx0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0Var.l(-6.59f, 6.59f);
        nx0Var.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0Var.l(6.59f, 6.59f);
        nx0Var.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0Var.k(7.83f, 13.0f);
        nx0Var.h(19.0f);
        nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0Var.o(-0.45f, -1.0f, -1.0f, -1.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        R = x01VarB;
        return x01VarB;
    }

    public static final long v(ar2 ar2Var, long j2, wp2 wp2Var) {
        pa1 pa1VarC;
        long jA;
        long j3;
        sw1 sw1Var;
        int iD;
        float fU;
        sw1 sw1Var2;
        int iD2;
        sw1 sw1Var3;
        int iD3;
        float fB;
        sw1 sw1Var4;
        int iD4;
        bx1 bx1VarC = ar2Var.c(wp2Var);
        if (bx1VarC == null) {
            return 9205357640488583168L;
        }
        gq2 gq2Var = bx1VarC.c;
        pa1 pa1Var = ar2Var.l;
        if (pa1Var == null || (pa1VarC = bx1VarC.c()) == null) {
            return 9205357640488583168L;
        }
        int i2 = wp2Var.b;
        x83 x83Var = (x83) gq2Var.invoke();
        if (i2 > (x83Var == null ? 0 : bx1VarC.b(x83Var))) {
            return 9205357640488583168L;
        }
        c12 c12Var = (c12) ar2Var.s.getValue();
        c12Var.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pa1VarC.L(pa1Var, c12Var.a) >> 32));
        x83 x83Var2 = (x83) gq2Var.invoke();
        if (x83Var2 == null) {
            jA = f93.b;
        } else {
            sw1 sw1Var5 = x83Var2.b;
            int iB = bx1VarC.b(x83Var2);
            if (iB < 1) {
                jA = f93.b;
            } else {
                int iD5 = sw1Var5.d(mh0.v(i2, 0, iB - 1));
                jA = g93.a(x83Var2.g(iD5), sw1Var5.c(iD5, true));
            }
        }
        if (f93.c(jA)) {
            x83 x83Var3 = (x83) gq2Var.invoke();
            fU = (x83Var3 != null && (iD4 = (sw1Var4 = x83Var3.b).d(i2)) < sw1Var4.f) ? x83Var3.e(iD4) : -1.0f;
            j3 = 4294967295L;
        } else {
            j3 = 4294967295L;
            int i3 = (int) (jA >> 32);
            x83 x83Var4 = (x83) gq2Var.invoke();
            float fE = (x83Var4 != null && (iD2 = (sw1Var2 = x83Var4.b).d(i3)) < sw1Var2.f) ? x83Var4.e(iD2) : -1.0f;
            int i4 = ((int) (jA & 4294967295L)) - 1;
            x83 x83Var5 = (x83) gq2Var.invoke();
            float f2 = (x83Var5 != null && (iD = (sw1Var = x83Var5.b).d(i4)) < sw1Var.f) ? x83Var5.f(iD) : -1.0f;
            fU = mh0.u(fIntBitsToFloat, Math.min(fE, f2), Math.max(fE, f2));
        }
        if (fU == -1.0f) {
            return 9205357640488583168L;
        }
        if (!p41.b(j2, 0L) && Math.abs(fIntBitsToFloat - fU) > ((int) (j2 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        x83 x83Var6 = (x83) gq2Var.invoke();
        if (x83Var6 != null && (iD3 = (sw1Var3 = x83Var6.b).d(i2)) < sw1Var3.f) {
            float f3 = sw1Var3.f(iD3);
            fB = ((sw1Var3.b(iD3) - f3) / 2.0f) + f3;
        } else {
            fB = -1.0f;
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        return pa1Var.L(pa1VarC, (((long) Float.floatToRawIntBits(fU)) << 32) | (((long) Float.floatToRawIntBits(fB)) & j3));
    }

    public static final boolean w(f30 f30Var) {
        return (((Configuration) ((ov0) f30Var).j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
    }

    public static final Bitmap.Config x(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final String y(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qd2, t20] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList z(gx2 gx2Var, int i2, Integer num) {
        ?? qd2Var = new qd2(gx2Var);
        i2 = gx2Var.q(i2);
        iv0 iv0VarA = gx2Var.a(i2);
        while (i2 >= 0) {
            qd2Var.k(gx2Var.i(i2), gx2Var.k(i2) ? gx2Var.p(gx2Var.b, i2) : d30.a, gx2Var.a.f(i2), num);
            if (i2 >= 0) {
                iv0 iv0Var = iv0VarA;
                iv0VarA = gx2Var.a(i2);
                i2 = gx2Var.q(i2);
                num = iv0Var;
            } else {
                num = iv0VarA;
            }
        }
        return (ArrayList) qd2Var.a;
    }
}
