package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tz1 {
    public final hb1 a;
    public final sz1 b;
    public final v21 c;
    public xz1 d;
    public final v43 e;
    public cv1 f;
    public gy1 g;
    public gy1 h;
    public final gy1 i;
    public rz1 j;

    public tz1(hb1 hb1Var) {
        this.a = hb1Var;
        sz1 sz1Var = new sz1();
        sz1Var.h = -1;
        this.b = sz1Var;
        v21 v21Var = new v21(hb1Var);
        this.c = v21Var;
        this.d = v21Var;
        v43 v43Var = v21Var.X;
        this.e = v43Var;
        this.f = v43Var;
        this.i = new gy1(new dv1[16]);
    }

    public static cv1 a(bv1 bv1Var, cv1 cv1Var) {
        cv1 cv1VarF;
        if (bv1Var instanceof hv1) {
            cv1VarF = ((hv1) bv1Var).f();
            cv1VarF.g = yz1.f(cv1VarF);
        } else {
            iq iqVar = new iq();
            iqVar.g = yz1.d(bv1Var);
            iqVar.s = bv1Var;
            new HashSet();
            cv1VarF = iqVar;
        }
        if (cv1VarF.r) {
            p21.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cv1VarF.m = true;
        cv1 cv1Var2 = cv1Var.j;
        if (cv1Var2 != null) {
            cv1Var2.i = cv1VarF;
            cv1VarF.j = cv1Var2;
        }
        cv1Var.j = cv1VarF;
        cv1VarF.i = cv1Var;
        return cv1VarF;
    }

    public static cv1 b(cv1 cv1Var) {
        boolean z = cv1Var.r;
        if (z) {
            ox1 ox1Var = yz1.a;
            if (!z) {
                p21.c("autoInvalidateRemovedNode called on unattached node");
            }
            yz1.a(cv1Var, -1, 2);
            cv1Var.j1();
            cv1Var.d1();
        }
        cv1 cv1Var2 = cv1Var.j;
        cv1 cv1Var3 = cv1Var.i;
        if (cv1Var2 != null) {
            cv1Var2.i = cv1Var3;
            cv1Var.j = null;
        }
        if (cv1Var3 != null) {
            cv1Var3.j = cv1Var2;
            cv1Var.i = null;
        }
        cv1Var3.getClass();
        return cv1Var3;
    }

    public static void h(bv1 bv1Var, bv1 bv1Var2, cv1 cv1Var) {
        if ((bv1Var instanceof hv1) && (bv1Var2 instanceof hv1)) {
            cv1Var.getClass();
            ((hv1) bv1Var2).g(cv1Var);
            if (cv1Var.r) {
                yz1.c(cv1Var);
                return;
            } else {
                cv1Var.n = true;
                return;
            }
        }
        if (!(cv1Var instanceof iq)) {
            p21.c("Unknown Modifier.Node type");
            return;
        }
        iq iqVar = (iq) cv1Var;
        boolean z = iqVar.r;
        if (z) {
            if (!z) {
                p21.c("unInitializeModifier called on unattached node");
            }
            if ((iqVar.g & 8) != 0) {
                ((db) xp1.P(iqVar)).y();
            }
        }
        iqVar.s = bv1Var2;
        iqVar.g = yz1.d(bv1Var2);
        if (iqVar.r) {
            iqVar.m1(false);
        }
        if (cv1Var.r) {
            yz1.c(cv1Var);
        } else {
            cv1Var.n = true;
        }
    }

    public final boolean c(int i) {
        return (this.f.h & i) != 0;
    }

    public final void d(cv1 cv1Var, xz1 xz1Var) {
        for (cv1 cv1Var2 = cv1Var.i; cv1Var2 != null; cv1Var2 = cv1Var2.i) {
            if (cv1Var2 == this.b) {
                hb1 hb1VarU = this.a.u();
                xz1Var.w = hb1VarU != null ? hb1VarU.K.c : null;
                this.d = xz1Var;
                return;
            } else {
                if ((cv1Var2.g & 2) != 0) {
                    return;
                }
                cv1Var2.l1(xz1Var);
            }
        }
    }

    public final void e() {
        for (cv1 cv1Var = this.f; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.i1();
            if (cv1Var.m) {
                ox1 ox1Var = yz1.a;
                if (!cv1Var.r) {
                    p21.c("autoInvalidateInsertedNode called on unattached node");
                }
                yz1.a(cv1Var, -1, 1);
            }
            if (cv1Var.n) {
                yz1.c(cv1Var);
            }
            cv1Var.m = false;
            cv1Var.n = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, defpackage.gy1 r33, defpackage.gy1 r34, defpackage.cv1 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.f(int, gy1, gy1, cv1, boolean):void");
    }

    public final void g() {
        hb1 hb1Var;
        bb1 bb1Var;
        s42 s42Var;
        cv1 cv1Var = this.e.i;
        xz1 xz1Var = this.c;
        while (true) {
            hb1Var = this.a;
            if (cv1Var == null) {
                break;
            }
            ya1 ya1VarI = xp1.i(cv1Var);
            if (ya1VarI != null) {
                xz1 xz1Var2 = cv1Var.l;
                if (xz1Var2 != null) {
                    bb1Var = (bb1) xz1Var2;
                    ya1 ya1Var = bb1Var.X;
                    bb1Var.V1(ya1VarI);
                    if (ya1Var != cv1Var && (s42Var = bb1Var.R) != null) {
                        ((nw0) s42Var).c();
                    }
                } else {
                    bb1Var = new bb1(hb1Var, ya1VarI);
                    cv1Var.l1(bb1Var);
                }
                xz1Var.w = bb1Var;
                bb1Var.v = xz1Var;
                xz1Var = bb1Var;
            } else {
                cv1Var.l1(xz1Var);
            }
            cv1Var = cv1Var.i;
        }
        hb1 hb1VarU = hb1Var.u();
        xz1Var.w = hb1VarU != null ? hb1VarU.K.c : null;
        this.d = xz1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        cv1 cv1Var = this.f;
        v43 v43Var = this.e;
        if (cv1Var == v43Var) {
            sb.append("]");
        } else {
            while (cv1Var != null && cv1Var != v43Var) {
                sb.append(String.valueOf(cv1Var));
                if (cv1Var.j == v43Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cv1Var = cv1Var.j;
            }
        }
        return sb.toString();
    }
}
