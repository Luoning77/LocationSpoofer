package defpackage;

import android.os.Build;
import android.os.Process;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class h73 implements uj3 {
    /* JADX WARN: Code duplicated, block: B:214:0x031c  */
    /* JADX WARN: Code duplicated, block: B:216:0x031f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0326  */
    /* JADX WARN: Code duplicated, block: B:222:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x032d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0349  */
    /* JADX WARN: Code duplicated, block: B:229:0x034c  */
    /* JADX WARN: Code duplicated, block: B:236:0x037a  */
    /* JADX WARN: Code duplicated, block: B:238:0x037d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0380  */
    /* JADX WARN: Code duplicated, block: B:242:0x0384  */
    /* JADX WARN: Code duplicated, block: B:244:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x038a  */
    /* JADX WARN: Code duplicated, block: B:248:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:250:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:259:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:264:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:267:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x040d  */
    /* JADX WARN: Code duplicated, block: B:273:0x043a  */
    /* JADX WARN: Code duplicated, block: B:275:0x043d  */
    /* JADX WARN: Code duplicated, block: B:279:0x045c  */
    /* JADX WARN: Code duplicated, block: B:282:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x049c  */
    /* JADX WARN: Code duplicated, block: B:286:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:289:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:290:0x0514  */
    /* JADX WARN: Code duplicated, block: B:292:0x0541  */
    /* JADX WARN: Code duplicated, block: B:293:0x0544 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:294:0x0546  */
    /* JADX WARN: Code duplicated, block: B:295:0x0549 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:296:0x054b  */
    /* JADX WARN: Code duplicated, block: B:297:0x054e  */
    /* JADX WARN: Code duplicated, block: B:300:0x0556  */
    /* JADX WARN: Code duplicated, block: B:303:0x056d  */
    /* JADX WARN: Code duplicated, block: B:308:0x059a  */
    /* JADX WARN: Code duplicated, block: B:311:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:314:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:315:0x05d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x05db  */
    /* JADX WARN: Code duplicated, block: B:317:0x05de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:319:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:321:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:322:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:324:0x060d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0610 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x0612  */
    /* JADX WARN: Code duplicated, block: B:327:0x0615 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x0617  */
    /* JADX WARN: Code duplicated, block: B:329:0x061a  */
    /* JADX WARN: Code duplicated, block: B:331:0x061e  */
    /* JADX WARN: Code duplicated, block: B:332:0x062e  */
    /* JADX WARN: Code duplicated, block: B:334:0x064b  */
    /* JADX WARN: Code duplicated, block: B:336:0x064f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:337:0x0651  */
    /* JADX WARN: Code duplicated, block: B:338:0x0654 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0656  */
    /* JADX WARN: Code duplicated, block: B:340:0x0659  */
    /* JADX WARN: Code duplicated, block: B:342:0x065e  */
    /* JADX WARN: Code duplicated, block: B:343:0x066e  */
    /* JADX WARN: Code duplicated, block: B:346:0x069b  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:350:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:353:0x06f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:354:0x06f5  */
    public static final void d(final CharSequence charSequence, final pu0 pu0Var, final l73 l73Var, final qu0 qu0Var, final pu0 pu0Var2, final pu0 pu0Var3, final pu0 pu0Var4, final pu0 pu0Var5, final boolean z, final boolean z2, final boolean z3, final ix1 ix1Var, final z42 z42Var, final t63 t63Var, final p10 p10Var, f30 f30Var, final int i, final int i2) {
        int i3;
        int i4;
        ov0 ov0Var;
        i31 i31Var;
        long j;
        float f;
        float f2;
        kc3 kc3Var;
        float f3;
        int iOrdinal;
        float f4;
        ic3 ic3VarF;
        yz2 yz2Var;
        kc3 kc3VarK;
        int iOrdinal2;
        float f5;
        int iOrdinal3;
        kc3 kc3VarK2;
        i31 i31Var2;
        int[] iArr;
        long j2;
        oz ozVarF;
        boolean zF;
        Object objQ;
        c30 c30Var;
        i31 i31Var3;
        long j3;
        i31 i31Var4;
        kc3 kc3VarK3;
        oz ozVarF2;
        boolean zF2;
        Object objQ2;
        kc3 kc3VarK4;
        Object objQ3;
        e73 e73Var;
        p10 p10Var2;
        q93 q93Var;
        p10 p10Var3;
        long j4;
        Object objQ4;
        p10 p10VarA0;
        Object objQ5;
        int i5;
        long j5;
        p10 p10Var4;
        long j6;
        int i6;
        p10 p10Var5;
        long j7;
        long j8;
        p10 p10VarA1;
        Object objQ6;
        ey1 ey1Var;
        kc3 kc3Var2;
        boolean z4;
        boolean zF3;
        Object objQ7;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(546805032);
        if ((i & 6) == 0) {
            i3 = i | (ov0Var2.d(1) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ov0Var2.h(charSequence) ? 32 : 16;
        }
        int i7 = i & 384;
        int i8 = WorkQueueKt.BUFFER_CAPACITY;
        if (i7 == 0) {
            i3 |= ov0Var2.h(pu0Var) ? 256 : 128;
        }
        int i9 = i & 3072;
        int i10 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i9 == 0) {
            i3 |= ov0Var2.f(l73Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ov0Var2.h(qu0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ov0Var2.h(pu0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ov0Var2.h(pu0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ov0Var2.h(pu0Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ov0Var2.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ov0Var2.h(null) ? 536870912 : 268435456;
        }
        int i11 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var2.h(pu0Var5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (ov0Var2.g(z2)) {
                i8 = 256;
            }
            i4 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (ov0Var2.g(z3)) {
                i10 = 2048;
            }
            i4 |= i10;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ov0Var2.f(ix1Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ov0Var2.f(z42Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ov0Var2.f(t63Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ov0Var2.h(p10Var) ? 8388608 : 4194304;
        }
        int i12 = i4;
        if (ov0Var2.T(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var2, (i12 >> 12) & 14).getValue()).booleanValue();
            i31 i31Var5 = i31.g;
            i31 i31Var6 = i31.f;
            i31 i31Var7 = i31.e;
            if (zBooleanValue) {
                i31Var = i31Var7;
            } else {
                i31Var = charSequence.length() == 0 ? i31Var6 : i31Var5;
            }
            if (!z2) {
                j = t63Var.z;
            } else if (z3) {
                j = t63Var.A;
            } else {
                j = zBooleanValue ? t63Var.x : t63Var.y;
            }
            je3 je3Var = (je3) ov0Var2.j(le3.a);
            q93 q93Var2 = je3Var.j;
            q93 q93Var3 = je3Var.l;
            long jB = q93Var2.b();
            long j9 = hz.g;
            boolean z5 = (ye3.a(jB, j9) && !ye3.a(q93Var3.b(), j9)) || (!ye3.a(q93Var2.b(), j9) && ye3.a(q93Var3.b(), j9));
            long jB2 = q93Var3.b();
            if (z5 && jB2 == 16) {
                jB2 = j;
            }
            long jB3 = q93Var2.b();
            long j10 = (z5 && jB3 == 16) ? j : jB3;
            boolean z6 = z5;
            boolean z7 = qu0Var != null;
            mc3 mc3VarQ = q(i31Var, "TextFieldInputState", ov0Var2, 48, 0);
            w52 w52Var = mc3VarQ.d;
            yz2 yz2VarK = mc0.K(vv1.f, ov0Var2);
            qd3 qd3Var = o51.v0;
            i31 i31Var8 = (i31) mc3VarQ.c();
            ov0Var2.c0(-1436405362);
            int iOrdinal4 = i31Var8.ordinal();
            float f6 = 0.0f;
            if (iOrdinal4 == 0) {
                f = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        b81.d();
                        return;
                    }
                } else if (z7) {
                    f = 0.0f;
                }
                f = 1.0f;
            }
            ov0Var2.p(false);
            Float fValueOf = Float.valueOf(f);
            i31 i31Var9 = (i31) w52Var.getValue();
            ov0Var2.c0(-1436405362);
            int iOrdinal5 = i31Var9.ordinal();
            if (iOrdinal5 == 0) {
                f2 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        b81.d();
                        return;
                    }
                } else if (z7) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            ov0Var2.p(false);
            Float fValueOf2 = Float.valueOf(f2);
            mc3VarQ.f();
            ov0Var2.c0(-709912974);
            ov0Var2.p(false);
            kc3 kc3VarK5 = k(mc3VarQ, fValueOf, fValueOf2, yz2VarK, qd3Var, ov0Var2, 196608);
            vv1 vv1Var = vv1.h;
            yz2 yz2VarK2 = mc0.K(vv1Var, ov0Var2);
            yz2 yz2VarK3 = mc0.K(vv1.i, ov0Var2);
            i31 i31Var10 = (i31) mc3VarQ.c();
            ov0Var2.c0(-1093194547);
            int iOrdinal6 = i31Var10.ordinal();
            if (iOrdinal6 != 0) {
                kc3Var = kc3VarK5;
                if (iOrdinal6 == 1) {
                    if (z7) {
                    }
                    ov0Var2.p(false);
                    Float fValueOf3 = Float.valueOf(f3);
                    i31 i31Var11 = (i31) w52Var.getValue();
                    ov0Var2.c0(-1093194547);
                    iOrdinal = i31Var11.ordinal();
                    if (iOrdinal == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                b81.d();
                                return;
                            }
                        } else if (!z7) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    ov0Var2.p(false);
                    Float fValueOf4 = Float.valueOf(f4);
                    ic3VarF = mc3VarQ.f();
                    ov0Var2.c0(-984009111);
                    if (ic3VarF.b(i31Var7, i31Var6) && (ic3VarF.b(i31Var6, i31Var7) || ic3VarF.b(i31Var5, i31Var6))) {
                        yz2Var = yz2VarK3;
                    } else {
                        yz2Var = yz2VarK2;
                    }
                    ov0Var2.p(false);
                    kc3VarK = k(mc3VarQ, fValueOf3, fValueOf4, yz2Var, qd3Var, ov0Var2, 196608);
                    i31 i31Var12 = (i31) mc3VarQ.c();
                    ov0Var2.c0(-1258455321);
                    iOrdinal2 = i31Var12.ordinal();
                    if (iOrdinal2 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                b81.d();
                                return;
                            }
                        } else if (z7) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    ov0Var2.p(false);
                    Float fValueOf5 = Float.valueOf(f5);
                    i31 i31Var13 = (i31) w52Var.getValue();
                    ov0Var2.c0(-1258455321);
                    iOrdinal3 = i31Var13.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 == 1) {
                            if (!z7) {
                            }
                            ov0Var2.p(false);
                            Float fValueOf6 = Float.valueOf(f6);
                            mc3VarQ.f();
                            ov0Var2.c0(2126293195);
                            ov0Var2.p(false);
                            kc3VarK2 = k(mc3VarQ, fValueOf5, fValueOf6, yz2VarK2, qd3Var, ov0Var2, 196608);
                            yz2 yz2VarK4 = mc0.K(vv1Var, ov0Var2);
                            i31Var2 = (i31) w52Var.getValue();
                            ov0Var2.c0(-12973394);
                            iArr = f73.a;
                            if (iArr[i31Var2.ordinal()] == 1) {
                                j2 = jB2;
                            } else {
                                j2 = j10;
                            }
                            ov0Var2.p(false);
                            ozVarF = hz.f(j2);
                            zF = ov0Var2.f(ozVarF);
                            objQ = ov0Var2.Q();
                            c30Var = d30.a;
                            if (zF || objQ == c30Var) {
                                qd3 qd3Var2 = new qd3(wa.y, new q9(ozVarF, 10));
                                ov0Var2.m0(qd3Var2);
                                objQ = qd3Var2;
                            }
                            qd3 qd3Var3 = (qd3) objQ;
                            i31Var3 = (i31) mc3VarQ.c();
                            ov0Var2.c0(-12973394);
                            if (iArr[i31Var3.ordinal()] == 1) {
                                j3 = jB2;
                            } else {
                                j3 = j10;
                            }
                            ov0Var2.p(false);
                            hz hzVar = new hz(j3);
                            i31Var4 = (i31) w52Var.getValue();
                            ov0Var2.c0(-12973394);
                            if (iArr[i31Var4.ordinal()] != 1) {
                                jB2 = j10;
                            }
                            ov0Var2.p(false);
                            hz hzVar2 = new hz(jB2);
                            mc3VarQ.f();
                            ov0Var2.c0(1954111929);
                            ov0Var2.p(false);
                            kc3VarK3 = k(mc3VarQ, hzVar, hzVar2, yz2VarK4, qd3Var3, ov0Var2, 196608);
                            ov0Var2.c0(-464752477);
                            ov0Var2.p(false);
                            ozVarF2 = hz.f(j);
                            zF2 = ov0Var2.f(ozVarF2);
                            objQ2 = ov0Var2.Q();
                            if (zF2 || objQ2 == c30Var) {
                                qd3 qd3Var4 = new qd3(wa.y, new q9(ozVarF2, 10));
                                ov0Var2.m0(qd3Var4);
                                objQ2 = qd3Var4;
                            }
                            ov0Var2.c0(-464752477);
                            ov0Var2.p(false);
                            hz hzVar3 = new hz(j);
                            ov0Var2.c0(-464752477);
                            ov0Var2.p(false);
                            hz hzVar4 = new hz(j);
                            mc3VarQ.f();
                            ov0Var2.c0(1190923886);
                            ov0Var2.p(false);
                            kc3VarK4 = k(mc3VarQ, hzVar3, hzVar4, yz2VarK4, (qd3) objQ2, ov0Var2, 196608);
                            objQ3 = ov0Var2.Q();
                            if (objQ3 == c30Var) {
                                objQ3 = new e73();
                                ov0Var2.m0(objQ3);
                            }
                            e73Var = (e73) objQ3;
                            if (qu0Var == null) {
                                ov0Var2.c0(-1891724857);
                                ov0Var2.p(false);
                                q93Var = q93Var2;
                                p10Var3 = null;
                                p10Var2 = null;
                            } else {
                                ov0Var2.c0(-1891724856);
                                p10Var2 = null;
                                q93Var = q93Var2;
                                p10 p10VarA2 = sb.a0(-1076580032, new b73(q93Var, q93Var3, kc3Var, kc3VarK4, z6, kc3VarK3, qu0Var, e73Var), ov0Var2);
                                ov0Var2.p(false);
                                p10Var3 = p10VarA2;
                            }
                            if (!z2) {
                                j4 = t63Var.D;
                            } else if (z3) {
                                j4 = t63Var.E;
                            } else if (zBooleanValue) {
                                j4 = t63Var.B;
                            } else {
                                j4 = t63Var.C;
                            }
                            objQ4 = ov0Var2.Q();
                            if (objQ4 == c30Var) {
                                u92 u92Var = u92.q;
                                wq2 wq2Var = new wq2(kc3VarK, 2);
                                gn gnVar = by2.a;
                                fc0 fc0Var = new fc0(wq2Var, u92Var);
                                ov0Var2.m0(fc0Var);
                                objQ4 = fc0Var;
                            }
                            s03 s03Var = (s03) objQ4;
                            if (pu0Var2 == null && charSequence.length() == 0 && ((Boolean) s03Var.getValue()).booleanValue()) {
                                ov0Var2.c0(-1890614312);
                                p10VarA0 = sb.a0(1405547205, new d73(kc3VarK, j4, q93Var, pu0Var2), ov0Var2);
                                ov0Var2.p(false);
                            } else {
                                ov0Var2.c0(-1890217110);
                                ov0Var2.p(false);
                                p10VarA0 = p10Var2;
                            }
                            objQ5 = ov0Var2.Q();
                            i5 = 3;
                            if (objQ5 == c30Var) {
                                u92 u92Var2 = u92.q;
                                wq2 wq2Var2 = new wq2(kc3VarK2, i5);
                                gn gnVar2 = by2.a;
                                fc0 fc0Var2 = new fc0(wq2Var2, u92Var2);
                                ov0Var2.m0(fc0Var2);
                                objQ5 = fc0Var2;
                            }
                            ov0Var2.c0(-1889500886);
                            ov0Var2.p(false);
                            ov0Var2.c0(-1888924534);
                            ov0Var2.p(false);
                            if (!z2) {
                                j5 = t63Var.r;
                            } else if (z3) {
                                j5 = t63Var.s;
                            } else if (zBooleanValue) {
                                j5 = t63Var.p;
                            } else {
                                j5 = t63Var.q;
                            }
                            if (pu0Var3 == null) {
                                ov0Var2.c0(-1888749663);
                                ov0Var2.p(false);
                                p10Var4 = p10Var2;
                            } else {
                                ov0Var2.c0(-1888749662);
                                p10 p10VarA3 = sb.a0(-1736293487, new c73(j5, pu0Var3, 0), ov0Var2);
                                ov0Var2.p(false);
                                p10Var4 = p10VarA3;
                            }
                            if (!z2) {
                                j6 = t63Var.v;
                            } else if (z3) {
                                j6 = t63Var.w;
                            } else if (zBooleanValue) {
                                j6 = t63Var.t;
                            } else {
                                j6 = t63Var.u;
                            }
                            if (pu0Var4 == null) {
                                ov0Var2.c0(-1888469888);
                                ov0Var2.p(false);
                                p10Var5 = p10Var2;
                                i6 = 1;
                            } else {
                                ov0Var2.c0(-1888469887);
                                i6 = 1;
                                p10 p10VarA4 = sb.a0(1334518521, new c73(j6, pu0Var4, i6), ov0Var2);
                                ov0Var2.p(false);
                                p10Var5 = p10VarA4;
                            }
                            if (!z2) {
                                j7 = t63Var.H;
                            } else if (z3) {
                                j7 = t63Var.I;
                            } else if (zBooleanValue) {
                                j7 = t63Var.F;
                            } else {
                                j7 = t63Var.G;
                            }
                            j8 = j7;
                            if (pu0Var5 == null) {
                                ov0Var2.c0(-1888176380);
                                ov0Var2.p(false);
                                p10VarA1 = p10Var2;
                            } else {
                                ov0Var2.c0(-1888176379);
                                p10VarA1 = sb.a0(837168720, new qu(j8, q93Var3, pu0Var5, 1), ov0Var2);
                                ov0Var2.p(false);
                            }
                            ov0Var2.c0(-1886778186);
                            objQ6 = ov0Var2.Q();
                            if (objQ6 == c30Var) {
                                objQ6 = ke0.H(new cw2(0L));
                                ov0Var2.m0(objQ6);
                            }
                            ey1Var = (ey1) objQ6;
                            p10 p10VarA5 = sb.a0(528115858, new a73(ey1Var, l73Var, z42Var, p10Var), ov0Var2);
                            p10 p10Var6 = p10VarA0;
                            kc3Var2 = kc3Var;
                            g73 g73Var = new g73(new md1(0, 2, s03.class, kc3Var, "value", "getValue()Ljava/lang/Object;"));
                            if ((i11 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zF3 = z4 | ov0Var2.f(kc3Var2);
                            objQ7 = ov0Var2.Q();
                            if (zF3 || objQ7 == c30Var) {
                                objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                                ov0Var2.m0(objQ7);
                            }
                            p10 p10Var7 = p10Var2;
                            ee0.j(pu0Var, p10Var6, p10Var3, p10Var4, p10Var5, p10Var7, p10Var7, z, l73Var, g73Var, (lu0) objQ7, p10VarA5, p10VarA1, z42Var, ov0Var2, ((i11 >> 3) & 112) | 6 | ((i12 << 21) & 234881024) | ((i11 << 18) & 1879048192), (57344 & (i12 >> 3)) | 384);
                            ov0Var = ov0Var2;
                            ov0Var.p(false);
                        } else if (iOrdinal3 != 2) {
                            b81.d();
                            return;
                        }
                    }
                    f6 = 1.0f;
                    ov0Var2.p(false);
                    Float fValueOf7 = Float.valueOf(f6);
                    mc3VarQ.f();
                    ov0Var2.c0(2126293195);
                    ov0Var2.p(false);
                    kc3VarK2 = k(mc3VarQ, fValueOf5, fValueOf7, yz2VarK2, qd3Var, ov0Var2, 196608);
                    yz2 yz2VarK5 = mc0.K(vv1Var, ov0Var2);
                    i31Var2 = (i31) w52Var.getValue();
                    ov0Var2.c0(-12973394);
                    iArr = f73.a;
                    if (iArr[i31Var2.ordinal()] == 1) {
                        j2 = jB2;
                    } else {
                        j2 = j10;
                    }
                    ov0Var2.p(false);
                    ozVarF = hz.f(j2);
                    zF = ov0Var2.f(ozVarF);
                    objQ = ov0Var2.Q();
                    c30Var = d30.a;
                    if (zF) {
                        qd3 qd3Var5 = new qd3(wa.y, new q9(ozVarF, 10));
                        ov0Var2.m0(qd3Var5);
                        objQ = qd3Var5;
                    } else {
                        qd3 qd3Var6 = new qd3(wa.y, new q9(ozVarF, 10));
                        ov0Var2.m0(qd3Var6);
                        objQ = qd3Var6;
                    }
                    qd3 qd3Var7 = (qd3) objQ;
                    i31Var3 = (i31) mc3VarQ.c();
                    ov0Var2.c0(-12973394);
                    if (iArr[i31Var3.ordinal()] == 1) {
                        j3 = jB2;
                    } else {
                        j3 = j10;
                    }
                    ov0Var2.p(false);
                    hz hzVar5 = new hz(j3);
                    i31Var4 = (i31) w52Var.getValue();
                    ov0Var2.c0(-12973394);
                    if (iArr[i31Var4.ordinal()] != 1) {
                        jB2 = j10;
                    }
                    ov0Var2.p(false);
                    hz hzVar6 = new hz(jB2);
                    mc3VarQ.f();
                    ov0Var2.c0(1954111929);
                    ov0Var2.p(false);
                    kc3VarK3 = k(mc3VarQ, hzVar5, hzVar6, yz2VarK5, qd3Var7, ov0Var2, 196608);
                    ov0Var2.c0(-464752477);
                    ov0Var2.p(false);
                    ozVarF2 = hz.f(j);
                    zF2 = ov0Var2.f(ozVarF2);
                    objQ2 = ov0Var2.Q();
                    if (zF2) {
                        qd3 qd3Var8 = new qd3(wa.y, new q9(ozVarF2, 10));
                        ov0Var2.m0(qd3Var8);
                        objQ2 = qd3Var8;
                    } else {
                        qd3 qd3Var9 = new qd3(wa.y, new q9(ozVarF2, 10));
                        ov0Var2.m0(qd3Var9);
                        objQ2 = qd3Var9;
                    }
                    ov0Var2.c0(-464752477);
                    ov0Var2.p(false);
                    hz hzVar7 = new hz(j);
                    ov0Var2.c0(-464752477);
                    ov0Var2.p(false);
                    hz hzVar8 = new hz(j);
                    mc3VarQ.f();
                    ov0Var2.c0(1190923886);
                    ov0Var2.p(false);
                    kc3VarK4 = k(mc3VarQ, hzVar7, hzVar8, yz2VarK5, (qd3) objQ2, ov0Var2, 196608);
                    objQ3 = ov0Var2.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = new e73();
                        ov0Var2.m0(objQ3);
                    }
                    e73Var = (e73) objQ3;
                    if (qu0Var == null) {
                        ov0Var2.c0(-1891724857);
                        ov0Var2.p(false);
                        q93Var = q93Var2;
                        p10Var3 = null;
                        p10Var2 = null;
                    } else {
                        ov0Var2.c0(-1891724856);
                        p10Var2 = null;
                        q93Var = q93Var2;
                        p10 p10VarA6 = sb.a0(-1076580032, new b73(q93Var, q93Var3, kc3Var, kc3VarK4, z6, kc3VarK3, qu0Var, e73Var), ov0Var2);
                        ov0Var2.p(false);
                        p10Var3 = p10VarA6;
                    }
                    if (!z2) {
                        j4 = t63Var.D;
                    } else if (z3) {
                        j4 = t63Var.E;
                    } else if (zBooleanValue) {
                        j4 = t63Var.B;
                    } else {
                        j4 = t63Var.C;
                    }
                    objQ4 = ov0Var2.Q();
                    if (objQ4 == c30Var) {
                        u92 u92Var3 = u92.q;
                        wq2 wq2Var3 = new wq2(kc3VarK, 2);
                        gn gnVar3 = by2.a;
                        fc0 fc0Var3 = new fc0(wq2Var3, u92Var3);
                        ov0Var2.m0(fc0Var3);
                        objQ4 = fc0Var3;
                    }
                    s03 s03Var2 = (s03) objQ4;
                    if (pu0Var2 == null) {
                        ov0Var2.c0(-1890217110);
                        ov0Var2.p(false);
                        p10VarA0 = p10Var2;
                    } else {
                        ov0Var2.c0(-1890217110);
                        ov0Var2.p(false);
                        p10VarA0 = p10Var2;
                    }
                    objQ5 = ov0Var2.Q();
                    i5 = 3;
                    if (objQ5 == c30Var) {
                        u92 u92Var4 = u92.q;
                        wq2 wq2Var4 = new wq2(kc3VarK2, i5);
                        gn gnVar4 = by2.a;
                        fc0 fc0Var4 = new fc0(wq2Var4, u92Var4);
                        ov0Var2.m0(fc0Var4);
                        objQ5 = fc0Var4;
                    }
                    ov0Var2.c0(-1889500886);
                    ov0Var2.p(false);
                    ov0Var2.c0(-1888924534);
                    ov0Var2.p(false);
                    if (!z2) {
                        j5 = t63Var.r;
                    } else if (z3) {
                        j5 = t63Var.s;
                    } else if (zBooleanValue) {
                        j5 = t63Var.p;
                    } else {
                        j5 = t63Var.q;
                    }
                    if (pu0Var3 == null) {
                        ov0Var2.c0(-1888749663);
                        ov0Var2.p(false);
                        p10Var4 = p10Var2;
                    } else {
                        ov0Var2.c0(-1888749662);
                        p10 p10VarA7 = sb.a0(-1736293487, new c73(j5, pu0Var3, 0), ov0Var2);
                        ov0Var2.p(false);
                        p10Var4 = p10VarA7;
                    }
                    if (!z2) {
                        j6 = t63Var.v;
                    } else if (z3) {
                        j6 = t63Var.w;
                    } else if (zBooleanValue) {
                        j6 = t63Var.t;
                    } else {
                        j6 = t63Var.u;
                    }
                    if (pu0Var4 == null) {
                        ov0Var2.c0(-1888469888);
                        ov0Var2.p(false);
                        p10Var5 = p10Var2;
                        i6 = 1;
                    } else {
                        ov0Var2.c0(-1888469887);
                        i6 = 1;
                        p10 p10VarA8 = sb.a0(1334518521, new c73(j6, pu0Var4, i6), ov0Var2);
                        ov0Var2.p(false);
                        p10Var5 = p10VarA8;
                    }
                    if (!z2) {
                        j7 = t63Var.H;
                    } else if (z3) {
                        j7 = t63Var.I;
                    } else if (zBooleanValue) {
                        j7 = t63Var.F;
                    } else {
                        j7 = t63Var.G;
                    }
                    j8 = j7;
                    if (pu0Var5 == null) {
                        ov0Var2.c0(-1888176380);
                        ov0Var2.p(false);
                        p10VarA1 = p10Var2;
                    } else {
                        ov0Var2.c0(-1888176379);
                        p10VarA1 = sb.a0(837168720, new qu(j8, q93Var3, pu0Var5, 1), ov0Var2);
                        ov0Var2.p(false);
                    }
                    ov0Var2.c0(-1886778186);
                    objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = ke0.H(new cw2(0L));
                        ov0Var2.m0(objQ6);
                    }
                    ey1Var = (ey1) objQ6;
                    p10 p10VarA9 = sb.a0(528115858, new a73(ey1Var, l73Var, z42Var, p10Var), ov0Var2);
                    p10 p10Var8 = p10VarA0;
                    kc3Var2 = kc3Var;
                    g73 g73Var2 = new g73(new md1(0, 2, s03.class, kc3Var, "value", "getValue()Ljava/lang/Object;"));
                    if ((i11 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zF3 = z4 | ov0Var2.f(kc3Var2);
                    objQ7 = ov0Var2.Q();
                    if (zF3) {
                        objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                        ov0Var2.m0(objQ7);
                    } else {
                        objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                        ov0Var2.m0(objQ7);
                    }
                    p10 p10Var9 = p10Var2;
                    ee0.j(pu0Var, p10Var8, p10Var3, p10Var4, p10Var5, p10Var9, p10Var9, z, l73Var, g73Var2, (lu0) objQ7, p10VarA9, p10VarA1, z42Var, ov0Var2, ((i11 >> 3) & 112) | 6 | ((i12 << 21) & 234881024) | ((i11 << 18) & 1879048192), (57344 & (i12 >> 3)) | 384);
                    ov0Var = ov0Var2;
                    ov0Var.p(false);
                } else if (iOrdinal6 != 2) {
                    b81.d();
                    return;
                }
                f3 = 0.0f;
                ov0Var2.p(false);
                Float fValueOf8 = Float.valueOf(f3);
                i31 i31Var14 = (i31) w52Var.getValue();
                ov0Var2.c0(-1093194547);
                iOrdinal = i31Var14.ordinal();
                if (iOrdinal == 0) {
                    f4 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            b81.d();
                            return;
                        }
                    } else if (!z7) {
                        f4 = 1.0f;
                    }
                    f4 = 0.0f;
                }
                ov0Var2.p(false);
                Float fValueOf9 = Float.valueOf(f4);
                ic3VarF = mc3VarQ.f();
                ov0Var2.c0(-984009111);
                if (ic3VarF.b(i31Var7, i31Var6)) {
                    yz2Var = yz2VarK2;
                } else {
                    yz2Var = yz2VarK3;
                }
                ov0Var2.p(false);
                kc3VarK = k(mc3VarQ, fValueOf8, fValueOf9, yz2Var, qd3Var, ov0Var2, 196608);
                i31 i31Var15 = (i31) mc3VarQ.c();
                ov0Var2.c0(-1258455321);
                iOrdinal2 = i31Var15.ordinal();
                if (iOrdinal2 == 0) {
                    f5 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            b81.d();
                            return;
                        }
                    } else if (z7) {
                        f5 = 0.0f;
                    }
                    f5 = 1.0f;
                }
                ov0Var2.p(false);
                Float fValueOf10 = Float.valueOf(f5);
                i31 i31Var16 = (i31) w52Var.getValue();
                ov0Var2.c0(-1258455321);
                iOrdinal3 = i31Var16.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        if (!z7) {
                        }
                        ov0Var2.p(false);
                        Float fValueOf11 = Float.valueOf(f6);
                        mc3VarQ.f();
                        ov0Var2.c0(2126293195);
                        ov0Var2.p(false);
                        kc3VarK2 = k(mc3VarQ, fValueOf10, fValueOf11, yz2VarK2, qd3Var, ov0Var2, 196608);
                        yz2 yz2VarK6 = mc0.K(vv1Var, ov0Var2);
                        i31Var2 = (i31) w52Var.getValue();
                        ov0Var2.c0(-12973394);
                        iArr = f73.a;
                        if (iArr[i31Var2.ordinal()] == 1) {
                            j2 = jB2;
                        } else {
                            j2 = j10;
                        }
                        ov0Var2.p(false);
                        ozVarF = hz.f(j2);
                        zF = ov0Var2.f(ozVarF);
                        objQ = ov0Var2.Q();
                        c30Var = d30.a;
                        if (zF) {
                            qd3 qd3Var10 = new qd3(wa.y, new q9(ozVarF, 10));
                            ov0Var2.m0(qd3Var10);
                            objQ = qd3Var10;
                        } else {
                            qd3 qd3Var11 = new qd3(wa.y, new q9(ozVarF, 10));
                            ov0Var2.m0(qd3Var11);
                            objQ = qd3Var11;
                        }
                        qd3 qd3Var12 = (qd3) objQ;
                        i31Var3 = (i31) mc3VarQ.c();
                        ov0Var2.c0(-12973394);
                        if (iArr[i31Var3.ordinal()] == 1) {
                            j3 = jB2;
                        } else {
                            j3 = j10;
                        }
                        ov0Var2.p(false);
                        hz hzVar9 = new hz(j3);
                        i31Var4 = (i31) w52Var.getValue();
                        ov0Var2.c0(-12973394);
                        if (iArr[i31Var4.ordinal()] != 1) {
                            jB2 = j10;
                        }
                        ov0Var2.p(false);
                        hz hzVar10 = new hz(jB2);
                        mc3VarQ.f();
                        ov0Var2.c0(1954111929);
                        ov0Var2.p(false);
                        kc3VarK3 = k(mc3VarQ, hzVar9, hzVar10, yz2VarK6, qd3Var12, ov0Var2, 196608);
                        ov0Var2.c0(-464752477);
                        ov0Var2.p(false);
                        ozVarF2 = hz.f(j);
                        zF2 = ov0Var2.f(ozVarF2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            qd3 qd3Var13 = new qd3(wa.y, new q9(ozVarF2, 10));
                            ov0Var2.m0(qd3Var13);
                            objQ2 = qd3Var13;
                        } else {
                            qd3 qd3Var14 = new qd3(wa.y, new q9(ozVarF2, 10));
                            ov0Var2.m0(qd3Var14);
                            objQ2 = qd3Var14;
                        }
                        ov0Var2.c0(-464752477);
                        ov0Var2.p(false);
                        hz hzVar11 = new hz(j);
                        ov0Var2.c0(-464752477);
                        ov0Var2.p(false);
                        hz hzVar12 = new hz(j);
                        mc3VarQ.f();
                        ov0Var2.c0(1190923886);
                        ov0Var2.p(false);
                        kc3VarK4 = k(mc3VarQ, hzVar11, hzVar12, yz2VarK6, (qd3) objQ2, ov0Var2, 196608);
                        objQ3 = ov0Var2.Q();
                        if (objQ3 == c30Var) {
                            objQ3 = new e73();
                            ov0Var2.m0(objQ3);
                        }
                        e73Var = (e73) objQ3;
                        if (qu0Var == null) {
                            ov0Var2.c0(-1891724857);
                            ov0Var2.p(false);
                            q93Var = q93Var2;
                            p10Var3 = null;
                            p10Var2 = null;
                        } else {
                            ov0Var2.c0(-1891724856);
                            p10Var2 = null;
                            q93Var = q93Var2;
                            p10 p10VarA10 = sb.a0(-1076580032, new b73(q93Var, q93Var3, kc3Var, kc3VarK4, z6, kc3VarK3, qu0Var, e73Var), ov0Var2);
                            ov0Var2.p(false);
                            p10Var3 = p10VarA10;
                        }
                        if (!z2) {
                            j4 = t63Var.D;
                        } else if (z3) {
                            j4 = t63Var.E;
                        } else if (zBooleanValue) {
                            j4 = t63Var.B;
                        } else {
                            j4 = t63Var.C;
                        }
                        objQ4 = ov0Var2.Q();
                        if (objQ4 == c30Var) {
                            u92 u92Var5 = u92.q;
                            wq2 wq2Var5 = new wq2(kc3VarK, 2);
                            gn gnVar5 = by2.a;
                            fc0 fc0Var5 = new fc0(wq2Var5, u92Var5);
                            ov0Var2.m0(fc0Var5);
                            objQ4 = fc0Var5;
                        }
                        s03 s03Var3 = (s03) objQ4;
                        if (pu0Var2 == null) {
                            ov0Var2.c0(-1890217110);
                            ov0Var2.p(false);
                            p10VarA0 = p10Var2;
                        } else {
                            ov0Var2.c0(-1890217110);
                            ov0Var2.p(false);
                            p10VarA0 = p10Var2;
                        }
                        objQ5 = ov0Var2.Q();
                        i5 = 3;
                        if (objQ5 == c30Var) {
                            u92 u92Var6 = u92.q;
                            wq2 wq2Var6 = new wq2(kc3VarK2, i5);
                            gn gnVar6 = by2.a;
                            fc0 fc0Var6 = new fc0(wq2Var6, u92Var6);
                            ov0Var2.m0(fc0Var6);
                            objQ5 = fc0Var6;
                        }
                        ov0Var2.c0(-1889500886);
                        ov0Var2.p(false);
                        ov0Var2.c0(-1888924534);
                        ov0Var2.p(false);
                        if (!z2) {
                            j5 = t63Var.r;
                        } else if (z3) {
                            j5 = t63Var.s;
                        } else if (zBooleanValue) {
                            j5 = t63Var.p;
                        } else {
                            j5 = t63Var.q;
                        }
                        if (pu0Var3 == null) {
                            ov0Var2.c0(-1888749663);
                            ov0Var2.p(false);
                            p10Var4 = p10Var2;
                        } else {
                            ov0Var2.c0(-1888749662);
                            p10 p10VarA11 = sb.a0(-1736293487, new c73(j5, pu0Var3, 0), ov0Var2);
                            ov0Var2.p(false);
                            p10Var4 = p10VarA11;
                        }
                        if (!z2) {
                            j6 = t63Var.v;
                        } else if (z3) {
                            j6 = t63Var.w;
                        } else if (zBooleanValue) {
                            j6 = t63Var.t;
                        } else {
                            j6 = t63Var.u;
                        }
                        if (pu0Var4 == null) {
                            ov0Var2.c0(-1888469888);
                            ov0Var2.p(false);
                            p10Var5 = p10Var2;
                            i6 = 1;
                        } else {
                            ov0Var2.c0(-1888469887);
                            i6 = 1;
                            p10 p10VarA12 = sb.a0(1334518521, new c73(j6, pu0Var4, i6), ov0Var2);
                            ov0Var2.p(false);
                            p10Var5 = p10VarA12;
                        }
                        if (!z2) {
                            j7 = t63Var.H;
                        } else if (z3) {
                            j7 = t63Var.I;
                        } else if (zBooleanValue) {
                            j7 = t63Var.F;
                        } else {
                            j7 = t63Var.G;
                        }
                        j8 = j7;
                        if (pu0Var5 == null) {
                            ov0Var2.c0(-1888176380);
                            ov0Var2.p(false);
                            p10VarA1 = p10Var2;
                        } else {
                            ov0Var2.c0(-1888176379);
                            p10VarA1 = sb.a0(837168720, new qu(j8, q93Var3, pu0Var5, 1), ov0Var2);
                            ov0Var2.p(false);
                        }
                        ov0Var2.c0(-1886778186);
                        objQ6 = ov0Var2.Q();
                        if (objQ6 == c30Var) {
                            objQ6 = ke0.H(new cw2(0L));
                            ov0Var2.m0(objQ6);
                        }
                        ey1Var = (ey1) objQ6;
                        p10 p10VarA13 = sb.a0(528115858, new a73(ey1Var, l73Var, z42Var, p10Var), ov0Var2);
                        p10 p10Var10 = p10VarA0;
                        kc3Var2 = kc3Var;
                        g73 g73Var3 = new g73(new md1(0, 2, s03.class, kc3Var, "value", "getValue()Ljava/lang/Object;"));
                        if ((i11 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zF3 = z4 | ov0Var2.f(kc3Var2);
                        objQ7 = ov0Var2.Q();
                        if (zF3) {
                            objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                            ov0Var2.m0(objQ7);
                        } else {
                            objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                            ov0Var2.m0(objQ7);
                        }
                        p10 p10Var11 = p10Var2;
                        ee0.j(pu0Var, p10Var10, p10Var3, p10Var4, p10Var5, p10Var11, p10Var11, z, l73Var, g73Var3, (lu0) objQ7, p10VarA13, p10VarA1, z42Var, ov0Var2, ((i11 >> 3) & 112) | 6 | ((i12 << 21) & 234881024) | ((i11 << 18) & 1879048192), (57344 & (i12 >> 3)) | 384);
                        ov0Var = ov0Var2;
                        ov0Var.p(false);
                    } else if (iOrdinal3 != 2) {
                        b81.d();
                        return;
                    }
                }
                f6 = 1.0f;
                ov0Var2.p(false);
                Float fValueOf12 = Float.valueOf(f6);
                mc3VarQ.f();
                ov0Var2.c0(2126293195);
                ov0Var2.p(false);
                kc3VarK2 = k(mc3VarQ, fValueOf10, fValueOf12, yz2VarK2, qd3Var, ov0Var2, 196608);
                yz2 yz2VarK7 = mc0.K(vv1Var, ov0Var2);
                i31Var2 = (i31) w52Var.getValue();
                ov0Var2.c0(-12973394);
                iArr = f73.a;
                if (iArr[i31Var2.ordinal()] == 1) {
                    j2 = jB2;
                } else {
                    j2 = j10;
                }
                ov0Var2.p(false);
                ozVarF = hz.f(j2);
                zF = ov0Var2.f(ozVarF);
                objQ = ov0Var2.Q();
                c30Var = d30.a;
                if (zF) {
                    qd3 qd3Var15 = new qd3(wa.y, new q9(ozVarF, 10));
                    ov0Var2.m0(qd3Var15);
                    objQ = qd3Var15;
                } else {
                    qd3 qd3Var16 = new qd3(wa.y, new q9(ozVarF, 10));
                    ov0Var2.m0(qd3Var16);
                    objQ = qd3Var16;
                }
                qd3 qd3Var17 = (qd3) objQ;
                i31Var3 = (i31) mc3VarQ.c();
                ov0Var2.c0(-12973394);
                if (iArr[i31Var3.ordinal()] == 1) {
                    j3 = jB2;
                } else {
                    j3 = j10;
                }
                ov0Var2.p(false);
                hz hzVar13 = new hz(j3);
                i31Var4 = (i31) w52Var.getValue();
                ov0Var2.c0(-12973394);
                if (iArr[i31Var4.ordinal()] != 1) {
                    jB2 = j10;
                }
                ov0Var2.p(false);
                hz hzVar14 = new hz(jB2);
                mc3VarQ.f();
                ov0Var2.c0(1954111929);
                ov0Var2.p(false);
                kc3VarK3 = k(mc3VarQ, hzVar13, hzVar14, yz2VarK7, qd3Var17, ov0Var2, 196608);
                ov0Var2.c0(-464752477);
                ov0Var2.p(false);
                ozVarF2 = hz.f(j);
                zF2 = ov0Var2.f(ozVarF2);
                objQ2 = ov0Var2.Q();
                if (zF2) {
                    qd3 qd3Var18 = new qd3(wa.y, new q9(ozVarF2, 10));
                    ov0Var2.m0(qd3Var18);
                    objQ2 = qd3Var18;
                } else {
                    qd3 qd3Var19 = new qd3(wa.y, new q9(ozVarF2, 10));
                    ov0Var2.m0(qd3Var19);
                    objQ2 = qd3Var19;
                }
                ov0Var2.c0(-464752477);
                ov0Var2.p(false);
                hz hzVar15 = new hz(j);
                ov0Var2.c0(-464752477);
                ov0Var2.p(false);
                hz hzVar16 = new hz(j);
                mc3VarQ.f();
                ov0Var2.c0(1190923886);
                ov0Var2.p(false);
                kc3VarK4 = k(mc3VarQ, hzVar15, hzVar16, yz2VarK7, (qd3) objQ2, ov0Var2, 196608);
                objQ3 = ov0Var2.Q();
                if (objQ3 == c30Var) {
                    objQ3 = new e73();
                    ov0Var2.m0(objQ3);
                }
                e73Var = (e73) objQ3;
                if (qu0Var == null) {
                    ov0Var2.c0(-1891724857);
                    ov0Var2.p(false);
                    q93Var = q93Var2;
                    p10Var3 = null;
                    p10Var2 = null;
                } else {
                    ov0Var2.c0(-1891724856);
                    p10Var2 = null;
                    q93Var = q93Var2;
                    p10 p10VarA14 = sb.a0(-1076580032, new b73(q93Var, q93Var3, kc3Var, kc3VarK4, z6, kc3VarK3, qu0Var, e73Var), ov0Var2);
                    ov0Var2.p(false);
                    p10Var3 = p10VarA14;
                }
                if (!z2) {
                    j4 = t63Var.D;
                } else if (z3) {
                    j4 = t63Var.E;
                } else if (zBooleanValue) {
                    j4 = t63Var.B;
                } else {
                    j4 = t63Var.C;
                }
                objQ4 = ov0Var2.Q();
                if (objQ4 == c30Var) {
                    u92 u92Var7 = u92.q;
                    wq2 wq2Var7 = new wq2(kc3VarK, 2);
                    gn gnVar7 = by2.a;
                    fc0 fc0Var7 = new fc0(wq2Var7, u92Var7);
                    ov0Var2.m0(fc0Var7);
                    objQ4 = fc0Var7;
                }
                s03 s03Var4 = (s03) objQ4;
                if (pu0Var2 == null) {
                    ov0Var2.c0(-1890217110);
                    ov0Var2.p(false);
                    p10VarA0 = p10Var2;
                } else {
                    ov0Var2.c0(-1890217110);
                    ov0Var2.p(false);
                    p10VarA0 = p10Var2;
                }
                objQ5 = ov0Var2.Q();
                i5 = 3;
                if (objQ5 == c30Var) {
                    u92 u92Var8 = u92.q;
                    wq2 wq2Var8 = new wq2(kc3VarK2, i5);
                    gn gnVar8 = by2.a;
                    fc0 fc0Var8 = new fc0(wq2Var8, u92Var8);
                    ov0Var2.m0(fc0Var8);
                    objQ5 = fc0Var8;
                }
                ov0Var2.c0(-1889500886);
                ov0Var2.p(false);
                ov0Var2.c0(-1888924534);
                ov0Var2.p(false);
                if (!z2) {
                    j5 = t63Var.r;
                } else if (z3) {
                    j5 = t63Var.s;
                } else if (zBooleanValue) {
                    j5 = t63Var.p;
                } else {
                    j5 = t63Var.q;
                }
                if (pu0Var3 == null) {
                    ov0Var2.c0(-1888749663);
                    ov0Var2.p(false);
                    p10Var4 = p10Var2;
                } else {
                    ov0Var2.c0(-1888749662);
                    p10 p10VarA15 = sb.a0(-1736293487, new c73(j5, pu0Var3, 0), ov0Var2);
                    ov0Var2.p(false);
                    p10Var4 = p10VarA15;
                }
                if (!z2) {
                    j6 = t63Var.v;
                } else if (z3) {
                    j6 = t63Var.w;
                } else if (zBooleanValue) {
                    j6 = t63Var.t;
                } else {
                    j6 = t63Var.u;
                }
                if (pu0Var4 == null) {
                    ov0Var2.c0(-1888469888);
                    ov0Var2.p(false);
                    p10Var5 = p10Var2;
                    i6 = 1;
                } else {
                    ov0Var2.c0(-1888469887);
                    i6 = 1;
                    p10 p10VarA16 = sb.a0(1334518521, new c73(j6, pu0Var4, i6), ov0Var2);
                    ov0Var2.p(false);
                    p10Var5 = p10VarA16;
                }
                if (!z2) {
                    j7 = t63Var.H;
                } else if (z3) {
                    j7 = t63Var.I;
                } else if (zBooleanValue) {
                    j7 = t63Var.F;
                } else {
                    j7 = t63Var.G;
                }
                j8 = j7;
                if (pu0Var5 == null) {
                    ov0Var2.c0(-1888176380);
                    ov0Var2.p(false);
                    p10VarA1 = p10Var2;
                } else {
                    ov0Var2.c0(-1888176379);
                    p10VarA1 = sb.a0(837168720, new qu(j8, q93Var3, pu0Var5, 1), ov0Var2);
                    ov0Var2.p(false);
                }
                ov0Var2.c0(-1886778186);
                objQ6 = ov0Var2.Q();
                if (objQ6 == c30Var) {
                    objQ6 = ke0.H(new cw2(0L));
                    ov0Var2.m0(objQ6);
                }
                ey1Var = (ey1) objQ6;
                p10 p10VarA17 = sb.a0(528115858, new a73(ey1Var, l73Var, z42Var, p10Var), ov0Var2);
                p10 p10Var12 = p10VarA0;
                kc3Var2 = kc3Var;
                g73 g73Var4 = new g73(new md1(0, 2, s03.class, kc3Var, "value", "getValue()Ljava/lang/Object;"));
                if ((i11 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zF3 = z4 | ov0Var2.f(kc3Var2);
                objQ7 = ov0Var2.Q();
                if (zF3) {
                    objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                    ov0Var2.m0(objQ7);
                } else {
                    objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                    ov0Var2.m0(objQ7);
                }
                p10 p10Var13 = p10Var2;
                ee0.j(pu0Var, p10Var12, p10Var3, p10Var4, p10Var5, p10Var13, p10Var13, z, l73Var, g73Var4, (lu0) objQ7, p10VarA17, p10VarA1, z42Var, ov0Var2, ((i11 >> 3) & 112) | 6 | ((i12 << 21) & 234881024) | ((i11 << 18) & 1879048192), (57344 & (i12 >> 3)) | 384);
                ov0Var = ov0Var2;
                ov0Var.p(false);
            } else {
                kc3Var = kc3VarK5;
            }
            f3 = 1.0f;
            ov0Var2.p(false);
            Float fValueOf13 = Float.valueOf(f3);
            i31 i31Var17 = (i31) w52Var.getValue();
            ov0Var2.c0(-1093194547);
            iOrdinal = i31Var17.ordinal();
            if (iOrdinal == 0) {
                f4 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b81.d();
                        return;
                    }
                } else if (!z7) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            ov0Var2.p(false);
            Float fValueOf14 = Float.valueOf(f4);
            ic3VarF = mc3VarQ.f();
            ov0Var2.c0(-984009111);
            if (ic3VarF.b(i31Var7, i31Var6)) {
                yz2Var = yz2VarK2;
            } else {
                yz2Var = yz2VarK3;
            }
            ov0Var2.p(false);
            kc3VarK = k(mc3VarQ, fValueOf13, fValueOf14, yz2Var, qd3Var, ov0Var2, 196608);
            i31 i31Var18 = (i31) mc3VarQ.c();
            ov0Var2.c0(-1258455321);
            iOrdinal2 = i31Var18.ordinal();
            if (iOrdinal2 == 0) {
                f5 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        b81.d();
                        return;
                    }
                } else if (z7) {
                    f5 = 0.0f;
                }
                f5 = 1.0f;
            }
            ov0Var2.p(false);
            Float fValueOf15 = Float.valueOf(f5);
            i31 i31Var19 = (i31) w52Var.getValue();
            ov0Var2.c0(-1258455321);
            iOrdinal3 = i31Var19.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 == 1) {
                    if (!z7) {
                    }
                    ov0Var2.p(false);
                    Float fValueOf16 = Float.valueOf(f6);
                    mc3VarQ.f();
                    ov0Var2.c0(2126293195);
                    ov0Var2.p(false);
                    kc3VarK2 = k(mc3VarQ, fValueOf15, fValueOf16, yz2VarK2, qd3Var, ov0Var2, 196608);
                    yz2 yz2VarK8 = mc0.K(vv1Var, ov0Var2);
                    i31Var2 = (i31) w52Var.getValue();
                    ov0Var2.c0(-12973394);
                    iArr = f73.a;
                    if (iArr[i31Var2.ordinal()] == 1) {
                        j2 = jB2;
                    } else {
                        j2 = j10;
                    }
                    ov0Var2.p(false);
                    ozVarF = hz.f(j2);
                    zF = ov0Var2.f(ozVarF);
                    objQ = ov0Var2.Q();
                    c30Var = d30.a;
                    if (zF) {
                        qd3 qd3Var110 = new qd3(wa.y, new q9(ozVarF, 10));
                        ov0Var2.m0(qd3Var110);
                        objQ = qd3Var110;
                    } else {
                        qd3 qd3Var111 = new qd3(wa.y, new q9(ozVarF, 10));
                        ov0Var2.m0(qd3Var111);
                        objQ = qd3Var111;
                    }
                    qd3 qd3Var112 = (qd3) objQ;
                    i31Var3 = (i31) mc3VarQ.c();
                    ov0Var2.c0(-12973394);
                    if (iArr[i31Var3.ordinal()] == 1) {
                        j3 = jB2;
                    } else {
                        j3 = j10;
                    }
                    ov0Var2.p(false);
                    hz hzVar17 = new hz(j3);
                    i31Var4 = (i31) w52Var.getValue();
                    ov0Var2.c0(-12973394);
                    if (iArr[i31Var4.ordinal()] != 1) {
                        jB2 = j10;
                    }
                    ov0Var2.p(false);
                    hz hzVar18 = new hz(jB2);
                    mc3VarQ.f();
                    ov0Var2.c0(1954111929);
                    ov0Var2.p(false);
                    kc3VarK3 = k(mc3VarQ, hzVar17, hzVar18, yz2VarK8, qd3Var112, ov0Var2, 196608);
                    ov0Var2.c0(-464752477);
                    ov0Var2.p(false);
                    ozVarF2 = hz.f(j);
                    zF2 = ov0Var2.f(ozVarF2);
                    objQ2 = ov0Var2.Q();
                    if (zF2) {
                        qd3 qd3Var113 = new qd3(wa.y, new q9(ozVarF2, 10));
                        ov0Var2.m0(qd3Var113);
                        objQ2 = qd3Var113;
                    } else {
                        qd3 qd3Var114 = new qd3(wa.y, new q9(ozVarF2, 10));
                        ov0Var2.m0(qd3Var114);
                        objQ2 = qd3Var114;
                    }
                    ov0Var2.c0(-464752477);
                    ov0Var2.p(false);
                    hz hzVar19 = new hz(j);
                    ov0Var2.c0(-464752477);
                    ov0Var2.p(false);
                    hz hzVar110 = new hz(j);
                    mc3VarQ.f();
                    ov0Var2.c0(1190923886);
                    ov0Var2.p(false);
                    kc3VarK4 = k(mc3VarQ, hzVar19, hzVar110, yz2VarK8, (qd3) objQ2, ov0Var2, 196608);
                    objQ3 = ov0Var2.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = new e73();
                        ov0Var2.m0(objQ3);
                    }
                    e73Var = (e73) objQ3;
                    if (qu0Var == null) {
                        ov0Var2.c0(-1891724857);
                        ov0Var2.p(false);
                        q93Var = q93Var2;
                        p10Var3 = null;
                        p10Var2 = null;
                    } else {
                        ov0Var2.c0(-1891724856);
                        p10Var2 = null;
                        q93Var = q93Var2;
                        p10 p10VarA18 = sb.a0(-1076580032, new b73(q93Var, q93Var3, kc3Var, kc3VarK4, z6, kc3VarK3, qu0Var, e73Var), ov0Var2);
                        ov0Var2.p(false);
                        p10Var3 = p10VarA18;
                    }
                    if (!z2) {
                        j4 = t63Var.D;
                    } else if (z3) {
                        j4 = t63Var.E;
                    } else if (zBooleanValue) {
                        j4 = t63Var.B;
                    } else {
                        j4 = t63Var.C;
                    }
                    objQ4 = ov0Var2.Q();
                    if (objQ4 == c30Var) {
                        u92 u92Var9 = u92.q;
                        wq2 wq2Var9 = new wq2(kc3VarK, 2);
                        gn gnVar9 = by2.a;
                        fc0 fc0Var9 = new fc0(wq2Var9, u92Var9);
                        ov0Var2.m0(fc0Var9);
                        objQ4 = fc0Var9;
                    }
                    s03 s03Var5 = (s03) objQ4;
                    if (pu0Var2 == null) {
                        ov0Var2.c0(-1890217110);
                        ov0Var2.p(false);
                        p10VarA0 = p10Var2;
                    } else {
                        ov0Var2.c0(-1890217110);
                        ov0Var2.p(false);
                        p10VarA0 = p10Var2;
                    }
                    objQ5 = ov0Var2.Q();
                    i5 = 3;
                    if (objQ5 == c30Var) {
                        u92 u92Var10 = u92.q;
                        wq2 wq2Var10 = new wq2(kc3VarK2, i5);
                        gn gnVar10 = by2.a;
                        fc0 fc0Var10 = new fc0(wq2Var10, u92Var10);
                        ov0Var2.m0(fc0Var10);
                        objQ5 = fc0Var10;
                    }
                    ov0Var2.c0(-1889500886);
                    ov0Var2.p(false);
                    ov0Var2.c0(-1888924534);
                    ov0Var2.p(false);
                    if (!z2) {
                        j5 = t63Var.r;
                    } else if (z3) {
                        j5 = t63Var.s;
                    } else if (zBooleanValue) {
                        j5 = t63Var.p;
                    } else {
                        j5 = t63Var.q;
                    }
                    if (pu0Var3 == null) {
                        ov0Var2.c0(-1888749663);
                        ov0Var2.p(false);
                        p10Var4 = p10Var2;
                    } else {
                        ov0Var2.c0(-1888749662);
                        p10 p10VarA19 = sb.a0(-1736293487, new c73(j5, pu0Var3, 0), ov0Var2);
                        ov0Var2.p(false);
                        p10Var4 = p10VarA19;
                    }
                    if (!z2) {
                        j6 = t63Var.v;
                    } else if (z3) {
                        j6 = t63Var.w;
                    } else if (zBooleanValue) {
                        j6 = t63Var.t;
                    } else {
                        j6 = t63Var.u;
                    }
                    if (pu0Var4 == null) {
                        ov0Var2.c0(-1888469888);
                        ov0Var2.p(false);
                        p10Var5 = p10Var2;
                        i6 = 1;
                    } else {
                        ov0Var2.c0(-1888469887);
                        i6 = 1;
                        p10 p10VarA110 = sb.a0(1334518521, new c73(j6, pu0Var4, i6), ov0Var2);
                        ov0Var2.p(false);
                        p10Var5 = p10VarA110;
                    }
                    if (!z2) {
                        j7 = t63Var.H;
                    } else if (z3) {
                        j7 = t63Var.I;
                    } else if (zBooleanValue) {
                        j7 = t63Var.F;
                    } else {
                        j7 = t63Var.G;
                    }
                    j8 = j7;
                    if (pu0Var5 == null) {
                        ov0Var2.c0(-1888176380);
                        ov0Var2.p(false);
                        p10VarA1 = p10Var2;
                    } else {
                        ov0Var2.c0(-1888176379);
                        p10VarA1 = sb.a0(837168720, new qu(j8, q93Var3, pu0Var5, 1), ov0Var2);
                        ov0Var2.p(false);
                    }
                    ov0Var2.c0(-1886778186);
                    objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = ke0.H(new cw2(0L));
                        ov0Var2.m0(objQ6);
                    }
                    ey1Var = (ey1) objQ6;
                    p10 p10VarA111 = sb.a0(528115858, new a73(ey1Var, l73Var, z42Var, p10Var), ov0Var2);
                    p10 p10Var14 = p10VarA0;
                    kc3Var2 = kc3Var;
                    g73 g73Var5 = new g73(new md1(0, 2, s03.class, kc3Var, "value", "getValue()Ljava/lang/Object;"));
                    if ((i11 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zF3 = z4 | ov0Var2.f(kc3Var2);
                    objQ7 = ov0Var2.Q();
                    if (zF3) {
                        objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                        ov0Var2.m0(objQ7);
                    } else {
                        objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                        ov0Var2.m0(objQ7);
                    }
                    p10 p10Var15 = p10Var2;
                    ee0.j(pu0Var, p10Var14, p10Var3, p10Var4, p10Var5, p10Var15, p10Var15, z, l73Var, g73Var5, (lu0) objQ7, p10VarA111, p10VarA1, z42Var, ov0Var2, ((i11 >> 3) & 112) | 6 | ((i12 << 21) & 234881024) | ((i11 << 18) & 1879048192), (57344 & (i12 >> 3)) | 384);
                    ov0Var = ov0Var2;
                    ov0Var.p(false);
                } else if (iOrdinal3 != 2) {
                    b81.d();
                    return;
                }
            }
            f6 = 1.0f;
            ov0Var2.p(false);
            Float fValueOf17 = Float.valueOf(f6);
            mc3VarQ.f();
            ov0Var2.c0(2126293195);
            ov0Var2.p(false);
            kc3VarK2 = k(mc3VarQ, fValueOf15, fValueOf17, yz2VarK2, qd3Var, ov0Var2, 196608);
            yz2 yz2VarK9 = mc0.K(vv1Var, ov0Var2);
            i31Var2 = (i31) w52Var.getValue();
            ov0Var2.c0(-12973394);
            iArr = f73.a;
            if (iArr[i31Var2.ordinal()] == 1) {
                j2 = jB2;
            } else {
                j2 = j10;
            }
            ov0Var2.p(false);
            ozVarF = hz.f(j2);
            zF = ov0Var2.f(ozVarF);
            objQ = ov0Var2.Q();
            c30Var = d30.a;
            if (zF) {
                qd3 qd3Var115 = new qd3(wa.y, new q9(ozVarF, 10));
                ov0Var2.m0(qd3Var115);
                objQ = qd3Var115;
            } else {
                qd3 qd3Var116 = new qd3(wa.y, new q9(ozVarF, 10));
                ov0Var2.m0(qd3Var116);
                objQ = qd3Var116;
            }
            qd3 qd3Var117 = (qd3) objQ;
            i31Var3 = (i31) mc3VarQ.c();
            ov0Var2.c0(-12973394);
            if (iArr[i31Var3.ordinal()] == 1) {
                j3 = jB2;
            } else {
                j3 = j10;
            }
            ov0Var2.p(false);
            hz hzVar111 = new hz(j3);
            i31Var4 = (i31) w52Var.getValue();
            ov0Var2.c0(-12973394);
            if (iArr[i31Var4.ordinal()] != 1) {
                jB2 = j10;
            }
            ov0Var2.p(false);
            hz hzVar112 = new hz(jB2);
            mc3VarQ.f();
            ov0Var2.c0(1954111929);
            ov0Var2.p(false);
            kc3VarK3 = k(mc3VarQ, hzVar111, hzVar112, yz2VarK9, qd3Var117, ov0Var2, 196608);
            ov0Var2.c0(-464752477);
            ov0Var2.p(false);
            ozVarF2 = hz.f(j);
            zF2 = ov0Var2.f(ozVarF2);
            objQ2 = ov0Var2.Q();
            if (zF2) {
                qd3 qd3Var118 = new qd3(wa.y, new q9(ozVarF2, 10));
                ov0Var2.m0(qd3Var118);
                objQ2 = qd3Var118;
            } else {
                qd3 qd3Var119 = new qd3(wa.y, new q9(ozVarF2, 10));
                ov0Var2.m0(qd3Var119);
                objQ2 = qd3Var119;
            }
            ov0Var2.c0(-464752477);
            ov0Var2.p(false);
            hz hzVar113 = new hz(j);
            ov0Var2.c0(-464752477);
            ov0Var2.p(false);
            hz hzVar114 = new hz(j);
            mc3VarQ.f();
            ov0Var2.c0(1190923886);
            ov0Var2.p(false);
            kc3VarK4 = k(mc3VarQ, hzVar113, hzVar114, yz2VarK9, (qd3) objQ2, ov0Var2, 196608);
            objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                objQ3 = new e73();
                ov0Var2.m0(objQ3);
            }
            e73Var = (e73) objQ3;
            if (qu0Var == null) {
                ov0Var2.c0(-1891724857);
                ov0Var2.p(false);
                q93Var = q93Var2;
                p10Var3 = null;
                p10Var2 = null;
            } else {
                ov0Var2.c0(-1891724856);
                p10Var2 = null;
                q93Var = q93Var2;
                p10 p10VarA112 = sb.a0(-1076580032, new b73(q93Var, q93Var3, kc3Var, kc3VarK4, z6, kc3VarK3, qu0Var, e73Var), ov0Var2);
                ov0Var2.p(false);
                p10Var3 = p10VarA112;
            }
            if (!z2) {
                j4 = t63Var.D;
            } else if (z3) {
                j4 = t63Var.E;
            } else if (zBooleanValue) {
                j4 = t63Var.B;
            } else {
                j4 = t63Var.C;
            }
            objQ4 = ov0Var2.Q();
            if (objQ4 == c30Var) {
                u92 u92Var11 = u92.q;
                wq2 wq2Var11 = new wq2(kc3VarK, 2);
                gn gnVar11 = by2.a;
                fc0 fc0Var11 = new fc0(wq2Var11, u92Var11);
                ov0Var2.m0(fc0Var11);
                objQ4 = fc0Var11;
            }
            s03 s03Var6 = (s03) objQ4;
            if (pu0Var2 == null) {
                ov0Var2.c0(-1890217110);
                ov0Var2.p(false);
                p10VarA0 = p10Var2;
            } else {
                ov0Var2.c0(-1890217110);
                ov0Var2.p(false);
                p10VarA0 = p10Var2;
            }
            objQ5 = ov0Var2.Q();
            i5 = 3;
            if (objQ5 == c30Var) {
                u92 u92Var12 = u92.q;
                wq2 wq2Var12 = new wq2(kc3VarK2, i5);
                gn gnVar12 = by2.a;
                fc0 fc0Var12 = new fc0(wq2Var12, u92Var12);
                ov0Var2.m0(fc0Var12);
                objQ5 = fc0Var12;
            }
            ov0Var2.c0(-1889500886);
            ov0Var2.p(false);
            ov0Var2.c0(-1888924534);
            ov0Var2.p(false);
            if (!z2) {
                j5 = t63Var.r;
            } else if (z3) {
                j5 = t63Var.s;
            } else if (zBooleanValue) {
                j5 = t63Var.p;
            } else {
                j5 = t63Var.q;
            }
            if (pu0Var3 == null) {
                ov0Var2.c0(-1888749663);
                ov0Var2.p(false);
                p10Var4 = p10Var2;
            } else {
                ov0Var2.c0(-1888749662);
                p10 p10VarA113 = sb.a0(-1736293487, new c73(j5, pu0Var3, 0), ov0Var2);
                ov0Var2.p(false);
                p10Var4 = p10VarA113;
            }
            if (!z2) {
                j6 = t63Var.v;
            } else if (z3) {
                j6 = t63Var.w;
            } else if (zBooleanValue) {
                j6 = t63Var.t;
            } else {
                j6 = t63Var.u;
            }
            if (pu0Var4 == null) {
                ov0Var2.c0(-1888469888);
                ov0Var2.p(false);
                p10Var5 = p10Var2;
                i6 = 1;
            } else {
                ov0Var2.c0(-1888469887);
                i6 = 1;
                p10 p10VarA114 = sb.a0(1334518521, new c73(j6, pu0Var4, i6), ov0Var2);
                ov0Var2.p(false);
                p10Var5 = p10VarA114;
            }
            if (!z2) {
                j7 = t63Var.H;
            } else if (z3) {
                j7 = t63Var.I;
            } else if (zBooleanValue) {
                j7 = t63Var.F;
            } else {
                j7 = t63Var.G;
            }
            j8 = j7;
            if (pu0Var5 == null) {
                ov0Var2.c0(-1888176380);
                ov0Var2.p(false);
                p10VarA1 = p10Var2;
            } else {
                ov0Var2.c0(-1888176379);
                p10VarA1 = sb.a0(837168720, new qu(j8, q93Var3, pu0Var5, 1), ov0Var2);
                ov0Var2.p(false);
            }
            ov0Var2.c0(-1886778186);
            objQ6 = ov0Var2.Q();
            if (objQ6 == c30Var) {
                objQ6 = ke0.H(new cw2(0L));
                ov0Var2.m0(objQ6);
            }
            ey1Var = (ey1) objQ6;
            p10 p10VarA115 = sb.a0(528115858, new a73(ey1Var, l73Var, z42Var, p10Var), ov0Var2);
            p10 p10Var16 = p10VarA0;
            kc3Var2 = kc3Var;
            g73 g73Var6 = new g73(new md1(0, 2, s03.class, kc3Var, "value", "getValue()Ljava/lang/Object;"));
            if ((i11 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zF3 = z4 | ov0Var2.f(kc3Var2);
            objQ7 = ov0Var2.Q();
            if (zF3) {
                objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                ov0Var2.m0(objQ7);
            } else {
                objQ7 = new jl1(l73Var, kc3Var2, ey1Var, 23);
                ov0Var2.m0(objQ7);
            }
            p10 p10Var17 = p10Var2;
            ee0.j(pu0Var, p10Var16, p10Var3, p10Var4, p10Var5, p10Var17, p10Var17, z, l73Var, g73Var6, (lu0) objQ7, p10VarA115, p10VarA1, z42Var, ov0Var2, ((i11 >> 3) & 112) | 6 | ((i12 << 21) & 234881024) | ((i11 << 18) & 1879048192), (57344 & (i12 >> 3)) | 384);
            ov0Var = ov0Var2;
            ov0Var.p(false);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: y63
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    int iM1 = wc0.m0(i2);
                    h73.d(charSequence, pu0Var, l73Var, qu0Var, pu0Var2, pu0Var3, pu0Var4, pu0Var5, z, z2, z3, ix1Var, z42Var, t63Var, p10Var, (f30) obj, iM0, iM1);
                    return mf3.a;
                }
            };
        }
    }

    public static final void e(long j, q93 q93Var, pu0 pu0Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(396611577);
        int i2 = (ov0Var.e(j) ? 4 : 2) | i | (ov0Var.f(q93Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(pu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            hd0.i(j, q93Var, pu0Var, ov0Var, i2 & 1022);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new dd2(j, q93Var, pu0Var, i, 1);
        }
    }

    public static final void f(long j, pu0 pu0Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(590397809);
        int i2 = (ov0Var.e(j) ? 4 : 2) | i | (ov0Var.h(pu0Var) ? 32 : 16);
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            k22.b(v50.a.a(new hz(j)), pu0Var, ov0Var, (i2 & 112) | 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new bc(j, pu0Var, i);
        }
    }

    public static final void g(mc3 mc3Var, kc3 kc3Var, Object obj, Object obj2, ln0 ln0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(867041821);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(mc3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(kc3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ov0Var.f(obj) : ov0Var.h(obj) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? ov0Var.f(obj2) : ov0Var.h(obj2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? ov0Var.f(ln0Var) : ov0Var.h(ln0Var) ? 16384 : 8192;
        }
        if (!ov0Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            ov0Var.W();
        } else if (mc3Var.g()) {
            kc3Var.e(obj, obj2, ln0Var);
        } else {
            kc3Var.f(obj2, ln0Var);
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new v9(mc3Var, kc3Var, obj, obj2, ln0Var, i, 3);
        }
    }

    public static final void h(GithubRelease githubRelease, List list, long j, boolean z, lu0 lu0Var, pu0 pu0Var, f30 f30Var, int i) {
        githubRelease.getClass();
        list.getClass();
        lu0Var.getClass();
        pu0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1428645476);
        int i2 = i | (ov0Var.h(githubRelease) ? 4 : 2) | (ov0Var.h(list) ? 32 : 16) | (ov0Var.e(j) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(lu0Var) ? 16384 : 8192) | (ov0Var.h(pu0Var) ? 131072 : 65536);
        if (ov0Var.T(i2 & 1, (74899 & i2) != 74898)) {
            String str = Process.is64Bit() ? "arm64-v8a" : "armeabi-v7a";
            String[] strArr = Build.SUPPORTED_ABIS;
            strArr.getClass();
            String str2 = yo.y0(strArr, "arm64-v8a") >= 0 ? "arm64-v8a" : "armeabi-v7a";
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ);
            }
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(18.0f, 18.0f, 18.0f, 18.0f), sb.a0(-871800499, new xl2(githubRelease, z, (ey1) objQ, list, lu0Var, j, str, str2, pu0Var), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pw2(githubRelease, list, j, z, lu0Var, pu0Var, i);
        }
    }

    public static final mc3 i(mc3 mc3Var, Object obj, Object obj2, String str, f30 f30Var, int i) {
        int i2 = (i & 14) ^ 6;
        int i3 = 1;
        boolean z = (i2 > 4 && ((ov0) f30Var).f(mc3Var)) || (i & 6) == 4;
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (z || objQ == c30Var) {
            objQ = new mc3(new fy1(obj), mc3Var, mc3Var.c + " > " + str);
            ov0Var.m0(objQ);
        }
        mc3 mc3Var2 = (mc3) objQ;
        boolean zF = ov0Var.f(mc3Var2) | ((i2 > 4 && ov0Var.f(mc3Var)) || (i & 6) == 4);
        Object objQ2 = ov0Var.Q();
        if (zF || objQ2 == c30Var) {
            objQ2 = new fc3(mc3Var, mc3Var2, i3);
            ov0Var.m0(objQ2);
        }
        oi0.a(mc3Var2, (lu0) objQ2, ov0Var);
        if (mc3Var.g()) {
            mc3Var2.j(obj, obj2);
            return mc3Var2;
        }
        mc3Var2.k(obj2);
        mc3Var2.k.setValue(Boolean.FALSE);
        return mc3Var2;
    }

    public static final hc3 j(mc3 mc3Var, qd3 qd3Var, String str, f30 f30Var, int i, int i2) {
        gc3 gc3Var;
        int i3 = 2;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ((ov0) f30Var).f(mc3Var);
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (zF || objQ == c30Var) {
            objQ = new hc3(mc3Var, qd3Var, str);
            ov0Var.m0(objQ);
        }
        hc3 hc3Var = (hc3) objQ;
        boolean zF2 = ov0Var.f(mc3Var) | ov0Var.h(hc3Var);
        Object objQ2 = ov0Var.Q();
        if (zF2 || objQ2 == c30Var) {
            objQ2 = new fc3(mc3Var, hc3Var, i3);
            ov0Var.m0(objQ2);
        }
        oi0.a(hc3Var, (lu0) objQ2, ov0Var);
        if (mc3Var.g() && (gc3Var = (gc3) hc3Var.b.getValue()) != null) {
            mc3 mc3Var2 = hc3Var.c;
            gc3Var.e.e(gc3Var.g.invoke(mc3Var2.f().a()), gc3Var.g.invoke(mc3Var2.f().c()), (ln0) gc3Var.f.invoke(mc3Var2.f()));
        }
        return hc3Var;
    }

    public static final kc3 k(mc3 mc3Var, Object obj, Object obj2, ln0 ln0Var, qd3 qd3Var, f30 f30Var, int i) {
        boolean zF = ((ov0) f30Var).f(mc3Var);
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (zF || objQ == c30Var) {
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                yi yiVar = (yi) qd3Var.a.invoke(obj2);
                yiVar.d();
                kc3 kc3Var = new kc3(mc3Var, obj, yiVar, qd3Var);
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                ov0Var.m0(kc3Var);
                objQ = kc3Var;
            } catch (Throwable th) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                throw th;
            }
        }
        kc3 kc3Var2 = (kc3) objQ;
        g(mc3Var, kc3Var2, obj, obj2, ln0Var, ov0Var, 0);
        boolean zF2 = ov0Var.f(mc3Var) | ov0Var.f(kc3Var2);
        Object objQ2 = ov0Var.Q();
        if (zF2 || objQ2 == c30Var) {
            objQ2 = new fc3(mc3Var, kc3Var2, 3);
            ov0Var.m0(objQ2);
        }
        oi0.a(kc3Var2, (lu0) objQ2, ov0Var);
        return kc3Var2;
    }

    public static final long l() {
        return Thread.currentThread().getId();
    }

    public static final k9 m(l73 l73Var) {
        if (l73Var instanceof l73) {
            return j9.r;
        }
        fo.q(l73Var, "Unknown position: ");
        return null;
    }

    public static final mc3 n(fy1 fy1Var, f30 f30Var, int i, int i2) {
        String str = (i2 & 2) != 0 ? null : "DropDownMenu";
        int i3 = 1;
        boolean z = (((i & 14) ^ 6) > 4 && ((ov0) f30Var).f(fy1Var)) || (i & 6) == 4;
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        Object obj = d30.a;
        if (z || objQ == obj) {
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                Object mc3Var = new mc3(fy1Var, null, str);
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                ov0Var.m0(mc3Var);
                objQ = mc3Var;
            } catch (Throwable th) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                throw th;
            }
        }
        mc3 mc3Var2 = (mc3) objQ;
        ov0Var.c0(-1356604288);
        mc3Var2.a(fy1Var.c.getValue(), ov0Var, 0);
        ov0Var.p(false);
        boolean zF = ov0Var.f(mc3Var2);
        Object objQ2 = ov0Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new oc3(mc3Var2, i3);
            ov0Var.m0(objQ2);
        }
        oi0.a(mc3Var2, (lu0) objQ2, ov0Var);
        return mc3Var2;
    }

    public static final mc3 q(Object obj, String str, f30 f30Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = new mc3(new fy1(obj), null, str);
            ov0Var.m0(objQ);
        }
        mc3 mc3Var = (mc3) objQ;
        mc3Var.a(obj, ov0Var, (i & 8) | 48 | (i & 14));
        Object objQ2 = ov0Var.Q();
        if (objQ2 == c30Var) {
            objQ2 = new oc3(mc3Var, 0);
            ov0Var.m0(objQ2);
        }
        oi0.a(mc3Var, (lu0) objQ2, ov0Var);
        return mc3Var;
    }

    public abstract void o(boolean z);

    public abstract void p(boolean z);

    @Override // defpackage.uj3
    public void b() {
    }

    @Override // defpackage.uj3
    public void c() {
    }
}
