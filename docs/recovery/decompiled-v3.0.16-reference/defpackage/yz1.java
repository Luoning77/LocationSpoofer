package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class yz1 {
    public static final ox1 a;

    static {
        ox1 ox1Var = r02.a;
        a = new ox1();
    }

    public static final void a(cv1 cv1Var, int i, int i2) {
        if (!(cv1Var instanceof lb0)) {
            b(cv1Var, i & cv1Var.g, i2);
            return;
        }
        lb0 lb0Var = (lb0) cv1Var;
        int i3 = lb0Var.s;
        b(cv1Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (cv1 cv1Var2 = lb0Var.t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
            a(cv1Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(cv1 cv1Var, int i, int i2) {
        if (i2 != 0 || cv1Var.b1()) {
            if ((i & 2) != 0 && (cv1Var instanceof ya1)) {
                ld0.z((ya1) cv1Var);
                if (i2 == 2) {
                    xp1.L(cv1Var, 2).F1();
                }
            }
            if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0 && i2 != 2) {
                xp1.O(cv1Var).D();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                xp1.O(cv1Var).U(false);
            }
            if ((i & 256) != 0 && (cv1Var instanceof aw0)) {
                if (i2 == 1) {
                    hb1 hb1VarO = xp1.O(cv1Var);
                    hb1VarO.a0(hb1VarO.U + 1);
                } else if (i2 == 2) {
                    hb1 hb1VarO2 = xp1.O(cv1Var);
                    hb1VarO2.a0(hb1VarO2.U - 1);
                }
                if (i2 != 2) {
                    hb1 hb1VarO3 = xp1.O(cv1Var);
                    if (hb1VarO3.U != 0 && !hb1VarO3.p() && !hb1VarO3.q() && !hb1VarO3.T) {
                        db dbVar = (db) kb1.a(hb1VarO3);
                        d31 d31Var = dbVar.d0.e;
                        if (hb1VarO3.U > 0) {
                            ((gy1) d31Var.f).b(hb1VarO3);
                            hb1VarO3.T = true;
                        }
                        dbVar.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (cv1Var instanceof hg0)) {
                ig0.z((hg0) cv1Var);
            }
            if ((i & 8) != 0 && (cv1Var instanceof hs2)) {
                xp1.O(cv1Var).w = true;
            }
            if ((i & 64) != 0 && (cv1Var instanceof y52)) {
                lb1 lb1Var = xp1.O((y52) cv1Var).L;
                lb1Var.p.u = true;
                ik1 ik1Var = lb1Var.q;
                if (ik1Var != null) {
                    ik1Var.A = true;
                }
            }
            if ((i & 2048) != 0 && (cv1Var instanceof up0)) {
                up0 up0Var = (up0) cv1Var;
                ov.b = null;
                up0Var.r0(ov.a);
                if (ov.b != null) {
                    cv1 cv1Var2 = (cv1) up0Var;
                    if (!cv1Var2.e.r) {
                        p21.c("visitChildren called on an unattached node");
                    }
                    gy1 gy1Var = new gy1(new cv1[16]);
                    cv1 cv1Var3 = cv1Var2.e;
                    cv1 cv1Var4 = cv1Var3.j;
                    if (cv1Var4 == null) {
                        xp1.h(gy1Var, cv1Var3);
                    } else {
                        gy1Var.b(cv1Var4);
                    }
                    while (true) {
                        int i3 = gy1Var.g;
                        if (i3 == 0) {
                            break;
                        }
                        cv1 cv1VarJ = (cv1) gy1Var.k(i3 - 1);
                        if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                            xp1.h(gy1Var, cv1VarJ);
                        } else {
                            while (cv1VarJ != null) {
                                if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                    gy1 gy1Var2 = null;
                                    while (cv1VarJ != null) {
                                        if (cv1VarJ instanceof dq0) {
                                            dq0 dq0Var = (dq0) cv1VarJ;
                                            mp0 mp0Var = ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).d;
                                            if (mp0Var.c.a(dq0Var)) {
                                                mp0Var.a();
                                            }
                                        } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                            int i4 = 0;
                                            for (cv1 cv1Var5 = ((lb0) cv1VarJ).t; cv1Var5 != null; cv1Var5 = cv1Var5.j) {
                                                if ((cv1Var5.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cv1VarJ = cv1Var5;
                                                    } else {
                                                        if (gy1Var2 == null) {
                                                            gy1Var2 = new gy1(new cv1[16]);
                                                        }
                                                        if (cv1VarJ != null) {
                                                            gy1Var2.b(cv1VarJ);
                                                            cv1VarJ = null;
                                                        }
                                                        gy1Var2.b(cv1Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        cv1VarJ = xp1.J(gy1Var2);
                                    }
                                    break;
                                }
                                cv1VarJ = cv1VarJ.j;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (cv1Var instanceof fp0)) {
                fp0 fp0Var = (fp0) cv1Var;
                mp0 mp0Var2 = ((rp0) ((db) xp1.P(fp0Var)).getFocusOwner()).d;
                if (mp0Var2.d.a(fp0Var)) {
                    mp0Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (cv1Var instanceof a21) && i2 == 2) {
                ((a21) cv1Var).U();
            }
        }
    }

    public static final void c(cv1 cv1Var) {
        if (!cv1Var.r) {
            p21.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cv1Var, -1, 0);
    }

    public static final int d(bv1 bv1Var) {
        int i = bv1Var instanceof wa1 ? 3 : 1;
        if (bv1Var instanceof n11) {
            i |= 4;
        }
        if (bv1Var instanceof fs2) {
            i |= 8;
        }
        if (bv1Var instanceof ea2) {
            i |= 16;
        }
        if (bv1Var instanceof x52) {
            i |= 64;
        }
        return bv1Var instanceof bt ? 524288 | i : i;
    }

    public static final int e(cv1 cv1Var) {
        int i = cv1Var.g;
        if (i != 0) {
            return i;
        }
        Class<?> cls = cv1Var.getClass();
        ox1 ox1Var = a;
        int iD = ox1Var.d(cls);
        if (iD >= 0) {
            return ox1Var.c[iD];
        }
        int i2 = cv1Var instanceof ya1 ? 3 : 1;
        if (cv1Var instanceof hg0) {
            i2 |= 4;
        }
        if (cv1Var instanceof hs2) {
            i2 |= 8;
        }
        if (cv1Var instanceof ba2) {
            i2 |= 16;
        }
        if (cv1Var instanceof fv1) {
            i2 |= 32;
        }
        if (cv1Var instanceof y52) {
            i2 |= 64;
        }
        if (cv1Var instanceof na1) {
            i2 |= 4194432;
        } else if (cv1Var instanceof hr1) {
            i2 |= WorkQueueKt.BUFFER_CAPACITY;
        }
        if (cv1Var instanceof aw0) {
            i2 |= 256;
        }
        if (cv1Var instanceof ju2) {
            i2 |= 512;
        }
        if (cv1Var instanceof dq0) {
            i2 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (cv1Var instanceof up0) {
            i2 |= 2048;
        }
        if (cv1Var instanceof fp0) {
            i2 |= 4096;
        }
        if (cv1Var instanceof i91) {
            i2 |= 8192;
        }
        if (cv1Var instanceof pa) {
            i2 |= 16384;
        }
        if (cv1Var instanceof u30) {
            i2 |= 32768;
        }
        if (cv1Var instanceof tc3) {
            i2 |= 262144;
        }
        if (cv1Var instanceof bt) {
            i2 |= 524288;
        }
        if (cv1Var instanceof a21) {
            i2 |= 2097152;
        }
        if (cv1Var instanceof gc1) {
            i2 |= 8388608;
        }
        ox1Var.g(i2, cls);
        return i2;
    }

    public static final int f(cv1 cv1Var) {
        if (!(cv1Var instanceof lb0)) {
            return e(cv1Var);
        }
        lb0 lb0Var = (lb0) cv1Var;
        int iF = lb0Var.s;
        for (cv1 cv1Var2 = lb0Var.t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
            iF |= f(cv1Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) | ((i & 4194304) != 0);
    }
}
