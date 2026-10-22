package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ov0 implements f30 {
    public int A;
    public int B;
    public boolean C;
    public final nv0 D;
    public final ArrayList E;
    public boolean F;
    public gx2 G;
    public hx2 H;
    public kx2 I;
    public boolean J;
    public l72 K;
    public kw L;
    public final g30 M;
    public iv0 N;
    public pn0 O;
    public pv2 P;
    public final r30 Q;
    public final y70 R;
    public boolean S;
    public long T;
    public pv0 U;
    public final if3 a;
    public final o30 b;
    public final hx2 c;
    public final cy1 d;
    public final kw e;
    public final kw f;
    public final t1 g;
    public final t30 h;
    public rv0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public ex1 p;
    public boolean q;
    public boolean r;
    public gx1 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final q41 n = new q41();
    public final ArrayList s = new ArrayList();
    public final q41 t = new q41();
    public l72 u = l72.h;
    public final q41 x = new q41();
    public int z = -1;

    public ov0(if3 if3Var, o30 o30Var, hx2 hx2Var, cy1 cy1Var, kw kwVar, kw kwVar2, t1 t1Var, t30 t30Var) {
        this.a = if3Var;
        this.b = o30Var;
        this.c = hx2Var;
        this.d = cy1Var;
        this.e = kwVar;
        this.f = kwVar2;
        this.g = t1Var;
        this.h = t30Var;
        this.C = o30Var.f() || o30Var.d();
        this.D = new nv0(this, 0);
        this.E = new ArrayList();
        gx2 gx2VarC = hx2Var.c();
        gx2VarC.c();
        this.G = gx2VarC;
        hx2 hx2Var2 = new hx2();
        if (o30Var.f()) {
            hx2Var2.b();
        }
        if (o30Var.d()) {
            hx2Var2.o = new gx1();
        }
        this.H = hx2Var2;
        kx2 kx2VarD = hx2Var2.d();
        kx2VarD.e(true);
        this.I = kx2VarD;
        this.M = new g30(this, kwVar);
        gx2 gx2VarC2 = this.H.c();
        try {
            iv0 iv0VarA = gx2VarC2.a(0);
            gx2VarC2.c();
            this.N = iv0VarA;
            this.O = new pn0();
            this.Q = new r30(this);
            y70 y70VarJ = o30Var.j();
            y70 y70VarC = C();
            this.R = y70VarJ.plus(y70VarC == null ? sj0.e : y70VarC);
        } catch (Throwable th) {
            gx2VarC2.c();
            throw th;
        }
    }

    public static final int S(ov0 ov0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        gx2 gx2Var;
        gx2 gx2Var2 = ov0Var.G;
        int i6 = 0;
        if (gx2Var2.j(i)) {
            int i7 = gx2Var2.i(i);
            Object objP = gx2Var2.p(gx2Var2.b, i);
            if (i7 == 206 && o51.f(objP, j30.e)) {
                Object objH = gx2Var2.h(i, 0);
                sv0 sv0Var = objH instanceof sv0 ? (sv0) objH : null;
                mf2 mf2Var = sv0Var != null ? sv0Var.a : null;
                lv0 lv0Var = mf2Var instanceof lv0 ? (lv0) mf2Var : null;
                if (lv0Var != null) {
                    ay1 ay1Var = lv0Var.e.e;
                    Object[] objArr = ay1Var.b;
                    long[] jArr2 = ay1Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i6;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        ov0 ov0Var2 = (ov0) objArr[(i8 << 3) + i11];
                                        hx2 hx2Var = ov0Var2.c;
                                        if (hx2Var.f <= 0 || (hx2Var.e[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            t30 t30Var = ov0Var2.h;
                                            synchronized (t30Var.h) {
                                                t30Var.p();
                                                zx1 zx1Var = t30Var.r;
                                                t30Var.r = ce0.k();
                                                try {
                                                    t30Var.z.j0(zx1Var);
                                                } catch (Throwable th) {
                                                    t30Var.r = zx1Var;
                                                    throw th;
                                                }
                                            }
                                            kw kwVar = new kw();
                                            ov0Var2.L = kwVar;
                                            gx2 gx2VarC = ov0Var2.c.c();
                                            try {
                                                ov0Var2.G = gx2VarC;
                                                g30 g30Var = ov0Var2.M;
                                                kw kwVar2 = g30Var.b;
                                                try {
                                                    g30Var.b = kwVar;
                                                    ov0Var2.R(0);
                                                    g30 g30Var2 = ov0Var2.M;
                                                    g30Var2.b();
                                                    try {
                                                        if (g30Var2.c) {
                                                            gx2Var = gx2VarC;
                                                            try {
                                                                g30Var2.b.F0.V(l32.c);
                                                                if (g30Var2.c) {
                                                                    g30Var2.d(false);
                                                                    g30Var2.d(false);
                                                                    g30Var2.b.F0.V(v22.c);
                                                                    i5 = 0;
                                                                    g30Var2.c = false;
                                                                }
                                                                g30Var.b = kwVar2;
                                                                gx2Var.c();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                g30Var.b = kwVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            gx2Var = gx2VarC;
                                                        }
                                                        g30Var.b = kwVar2;
                                                        gx2Var.c();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        gx2Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    gx2Var = gx2VarC;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                gx2Var = gx2VarC;
                                            }
                                        }
                                        ov0Var.b.r(ov0Var2.h);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i9 = i9;
                                    }
                                    j >>= i9;
                                    i11++;
                                    i9 = i9;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return gx2Var2.o(i);
            }
            i3 = 1;
            if (!gx2Var2.l(i)) {
                return gx2Var2.o(i);
            }
        } else {
            i3 = 1;
            if (gx2Var2.d(i)) {
                int i12 = gx2Var2.b[(i * 5) + 3] + i;
                int iS = 0;
                for (int i13 = i + 1; i13 < i12; i13 += gx2Var2.b[(i13 * 5) + 3]) {
                    boolean zL = gx2Var2.l(i13);
                    if (zL) {
                        ov0Var.M.c();
                        g30 g30Var3 = ov0Var.M;
                        Object objN = gx2Var2.n(i13);
                        g30Var3.c();
                        g30Var3.h.add(objN);
                    }
                    iS += S(ov0Var, i13, zL || z, zL ? 0 : i2 + iS);
                    if (zL) {
                        ov0Var.M.c();
                        ov0Var.M.a();
                    }
                }
                if (!gx2Var2.l(i)) {
                    return iS;
                }
            } else if (!gx2Var2.l(i)) {
                return gx2Var2.o(i);
            }
        }
        return i3;
    }

    public final ee2 A() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ee2) arrayList.get(arrayList.size() - 1);
    }

    public final boolean B() {
        if (!E() || this.w) {
            return true;
        }
        ee2 ee2VarA = A();
        return (ee2VarA == null || (ee2VarA.b & 4) == 0) ? false : true;
    }

    public final r30 C() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean D() {
        return this.S;
    }

    public final boolean E() {
        ee2 ee2VarA;
        return (this.S || this.y || this.w || (ee2VarA = A()) == null || (ee2VarA.b & 8) != 0) ? false : true;
    }

    public final void F(ArrayList arrayList) {
        ov0 ov0Var = this;
        kw kwVar = ov0Var.f;
        g30 g30Var = ov0Var.M;
        kw kwVar2 = g30Var.b;
        try {
            g30Var.b = kwVar;
            kwVar.F0.V(j32.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                i52 i52Var = (i52) arrayList.get(i);
                fw1 fw1Var = (fw1) i52Var.e;
                fw1Var.getClass();
                iv0 iv0VarJ = ld0.j(null);
                hx2 hx2VarA = jx2.a(null);
                int iA = hx2VarA.a(iv0VarJ);
                m41 m41Var = new m41();
                g30Var.b();
                u32 u32Var = g30Var.b.F0;
                u32Var.V(s22.c);
                wc0.i0(u32Var, 0, m41Var, 1, iv0VarJ);
                if (hx2VarA == ov0Var.H) {
                    if (!ov0Var.I.w) {
                        j30.a("Check failed");
                    }
                    ov0Var.x();
                }
                gx2 gx2VarC = hx2VarA.c();
                try {
                    gx2VarC.r(iA);
                    g30Var.f = iA;
                    kw kwVar3 = new kw();
                    ov0Var.L(null, null, null, uj0.e, new a6(ov0Var, kwVar3, gx2VarC, fw1Var));
                    kw kwVar4 = g30Var.b;
                    kwVar4.getClass();
                    if (!kwVar3.F0.U()) {
                        u32 u32Var2 = kwVar4.F0;
                        u32Var2.V(o22.c);
                        wc0.i0(u32Var2, 0, kwVar3, 1, m41Var);
                    }
                    gx2VarC.c();
                    g30Var.b.F0.V(l32.c);
                    i++;
                    ov0Var = this;
                } catch (Throwable th) {
                    gx2VarC.c();
                    throw th;
                }
            }
            g30Var.b();
            g30Var.b.F0.V(w22.c);
            g30Var.f = 0;
            g30Var.b = kwVar2;
        } catch (Throwable th2) {
            g30Var.b = kwVar2;
            throw th2;
        }
    }

    public final void G(l72 l72Var, Object obj) {
        a0(126665345, null);
        I();
        n0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                kx2.y(this.I);
            }
            boolean z = (this.S || o51.f(this.G.f(), l72Var)) ? false : true;
            if (z) {
                O(l72Var);
            }
            X(202, 0, j30.c, l72Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            ce0.G(this, new p10(new s5(obj, 8), true, -59194059));
            this.w = z2;
            p(false);
            this.K = null;
            this.T = j;
            p(false);
        } catch (Throwable th) {
            try {
                o51.H(th, new kv0(this, 2));
                throw th;
            } catch (Throwable th2) {
                p(false);
                this.K = null;
                this.T = j;
                p(false);
                throw th2;
            }
        }
    }

    public final Object H(Object obj, Object obj2) {
        gx2 gx2Var = this.G;
        int i = gx2Var.g;
        Object objS = o51.s(i < gx2Var.h ? gx2Var.p(gx2Var.b, i) : null, obj, obj2);
        return objS == null ? new r61(obj, obj2) : objS;
    }

    public final Object I() {
        boolean z = this.S;
        c30 c30Var = d30.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof zg2)) {
                return objM;
            }
        } else if (this.r) {
            j30.a("A call to createNode(), emitNode() or useNode() expected");
            return c30Var;
        }
        return c30Var;
    }

    public final List J() {
        o30 o30Var = this.b;
        n30 n30VarH = o30Var.h();
        t30 t30Var = n30VarH != null ? (t30) n30VarH : null;
        if (t30Var != null) {
            hx2 hx2Var = t30Var.j;
            gx2 gx2VarC = jx2.a(hx2Var).c();
            try {
                Integer numR = n51.r(gx2VarC, o30Var, 0, gx2VarC.c);
                gx2VarC.c();
                if (numR != null) {
                    gx2 gx2VarC2 = jx2.a(hx2Var).c();
                    try {
                        return zy.x0(n51.z(gx2VarC2, numR.intValue(), 0), t30Var.z.J());
                    } finally {
                        gx2VarC2.c();
                    }
                }
            } catch (Throwable th) {
                gx2VarC.c();
                throw th;
            }
        }
        return uj0.e;
    }

    public final int K(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object L(t30 t30Var, t30 t30Var2, Integer num, List list, au0 au0Var) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                i52 i52Var = (i52) list.get(i2);
                ee2 ee2Var = (ee2) i52Var.e;
                Object obj = i52Var.f;
                if (obj != null) {
                    i0(ee2Var, obj);
                } else {
                    i0(ee2Var, null);
                }
            }
            if (t30Var == null) {
                objInvoke = au0Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (t30Var2 == null || t30Var2 == t30Var || iIntValue < 0) {
                    objInvoke = au0Var.invoke();
                } else {
                    t30Var.v = t30Var2;
                    t30Var.w = iIntValue;
                    try {
                        objInvoke = au0Var.invoke();
                        t30Var.v = null;
                        t30Var.w = 0;
                    } catch (Throwable th) {
                        t30Var.v = null;
                        t30Var.w = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = au0Var.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
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
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void M() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov0.M():void");
    }

    public final void N() throws Throwable {
        int i;
        R(this.G.g);
        g30 g30Var = this.M;
        g30Var.d(false);
        q41 q41Var = g30Var.d;
        ov0 ov0Var = g30Var.a;
        gx2 gx2Var = ov0Var.G;
        if (gx2Var.c > 0 && q41Var.a(-2) != (i = gx2Var.i)) {
            if (!g30Var.c && g30Var.e) {
                g30Var.d(false);
                g30Var.b.F0.V(z22.c);
                g30Var.c = true;
            }
            if (i > 0) {
                iv0 iv0VarA = gx2Var.a(i);
                q41Var.c(i);
                g30Var.d(false);
                u32 u32Var = g30Var.b.F0;
                u32Var.V(y22.c);
                wc0.h0(u32Var, 0, iv0VarA);
                g30Var.c = true;
            }
        }
        g30Var.b.F0.V(h32.c);
        int i2 = g30Var.f;
        gx2 gx2Var2 = ov0Var.G;
        g30Var.f = gx2Var2.b[(gx2Var2.g * 5) + 3] + i2;
    }

    public final void O(l72 l72Var) {
        gx1 gx1Var = this.v;
        if (gx1Var == null) {
            gx1Var = new gx1();
            this.v = gx1Var;
        }
        gx1Var.h(this.G.g, l72Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void P(int i, int i2, int i3) {
        gx2 gx2Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (gx2Var.q(i) == i2) {
                i3 = i2;
            } else if (gx2Var.q(i2) == i) {
                i3 = i;
            } else if (gx2Var.q(i) == gx2Var.q(i2)) {
                i3 = gx2Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = gx2Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = gx2Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = gx2Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = gx2Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = gx2Var.q(iQ5)) {
                    i3 = gx2Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (gx2Var.l(i)) {
                this.M.a();
            }
            i = gx2Var.q(i);
        }
        o(i2, i3);
    }

    public final Object Q() {
        boolean z = this.S;
        c30 c30Var = d30.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof zg2)) {
                return objM instanceof sv0 ? ((sv0) objM).a : objM;
            }
        } else if (this.r) {
            j30.a("A call to createNode(), emitNode() or useNode() expected");
            return c30Var;
        }
        return c30Var;
    }

    public final void R(int i) throws Throwable {
        boolean zL = this.G.l(i);
        g30 g30Var = this.M;
        if (zL) {
            g30Var.c();
            Object objN = this.G.n(i);
            g30Var.c();
            g30Var.h.add(objN);
        }
        S(this, i, zL, 0);
        g30Var.c();
        if (zL) {
            g30Var.a();
        }
    }

    public final boolean T(int i, boolean z) {
        ee2 ee2VarA;
        if ((i & 1) == 0 && (this.S || this.y)) {
            pv2 pv2Var = this.P;
            if (pv2Var != null && (ee2VarA = A()) != null && pv2Var.b()) {
                int i2 = ee2VarA.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                ee2VarA.b = i3;
                ee2VarA.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                u32 u32Var = this.M.b.F0;
                u32Var.V(g32.c);
                wc0.h0(u32Var, 0, ee2VarA);
                this.b.q(ee2VarA);
                return false;
            }
        } else if (!z && E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void U() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        gx2 gx2Var = this.G;
        int iG = gx2Var.g();
        int[] iArr = gx2Var.b;
        int i = gx2Var.g;
        Object objP = i < gx2Var.h ? gx2Var.p(iArr, i) : null;
        Object objF = gx2Var.f();
        int i2 = this.m;
        c30 c30Var = d30.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(c30Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            b0(null, (iArr[(gx2Var.g * 5) + 1] & 1073741824) != 0);
            M();
            gx2Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(c30Var)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        b0(null, (iArr[(gx2Var.g * 5) + 1] & 1073741824) != 0);
        M();
        gx2Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void V() {
        gx2 gx2Var = this.G;
        int i = gx2Var.i;
        this.l = i >= 0 ? gx2Var.b[(i * 5) + 1] & 67108863 : 0;
        gx2Var.t();
    }

    public final void W() {
        if (this.l != 0) {
            j30.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        ee2 ee2VarA = A();
        if (ee2VarA != null) {
            int i = ee2VarA.b;
            if ((i & WorkQueueKt.BUFFER_CAPACITY) == 0) {
                ee2VarA.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            V();
        } else {
            M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0357  */
    /* JADX WARN: Code duplicated, block: B:180:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:185:0x036a  */
    /* JADX WARN: Code duplicated, block: B:187:0x036d  */
    /* JADX WARN: Code duplicated, block: B:188:0x036f  */
    /* JADX WARN: Code duplicated, block: B:192:0x039d  */
    /* JADX WARN: Code duplicated, block: B:193:0x039f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void X(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        rv0 rv0Var;
        rv0 rv0Var2;
        ArrayList arrayList;
        gx1 gx1Var;
        int i3;
        Object objValueOf;
        zx1 zx1Var;
        Object objG;
        sx1 sx1Var;
        kx2 kx2Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        gx2 gx2Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        gx2 gx2Var2;
        int i13;
        Object objP;
        kx2 kx2Var2;
        int i14;
        rv0 rv0Var3;
        Object obj4 = obj;
        if (this.r) {
            j30.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = d30.a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i15);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                kx2Var2 = this.I;
                i14 = kx2Var2.t;
                if (z) {
                    kx2Var2.P(i, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    kx2Var2.P(i, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    kx2Var2.P(i, obj4, obj5, false);
                }
                rv0Var3 = this.j;
                if (rv0Var3 != null) {
                    int i16 = (-2) - i14;
                    g91 g91Var = new g91(i, i16, -1, -1);
                    rv0Var3.e.h(i16, new ww0(-1, this.k - rv0Var3.b, 0));
                    rv0Var3.d.add(g91Var);
                }
                w(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    gx2Var2 = this.G;
                    i13 = gx2Var2.g;
                    if (i13 < gx2Var2.h) {
                        objP = gx2Var2.p(gx2Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (o51.f(obj4, objP)) {
                        b0(obj2, z);
                        z3 = z2;
                    }
                }
                gx2Var = this.G;
                iArr = gx2Var.b;
                arrayList2 = new ArrayList();
                if (gx2Var.k <= 0) {
                    i10 = gx2Var.g;
                    while (i10 < gx2Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = gx2Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new g91(i18, i10, i12, objP2));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new rv0(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            rv0Var = this.j;
            if (rv0Var != null) {
                arrayList = rv0Var.d;
                gx1Var = rv0Var.e;
                i3 = rv0Var.b;
                if (obj4 != null) {
                    objValueOf = new r61(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                zx1Var = ((ax1) rv0Var.f.getValue()).a;
                objG = zx1Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof sx1) {
                    sx1Var = (sx1) objG;
                    Object objK = sx1Var.k(0);
                    if (sx1Var.h()) {
                        zx1Var.k(objValueOf);
                    }
                    if (sx1Var.b == 1) {
                        zx1Var.m(objValueOf, sx1Var.e());
                    }
                    objG = objK;
                } else {
                    zx1Var.k(objValueOf);
                }
                g91 g91Var2 = (g91) objG;
                if (!z3 || g91Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        kx2 kx2VarD = this.H.d();
                        this.I = kx2VarD;
                        kx2VarD.L();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    kx2Var = this.I;
                    int i19 = kx2Var.t;
                    if (z) {
                        kx2Var.P(i, obj5, obj5, true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        kx2Var.P(i, obj5, obj2, false);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        kx2Var.P(i, obj3, obj5, false);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    g91 g91Var3 = new g91(i, i20, -1, -1);
                    gx1Var.h(i20, new ww0(-1, this.k - i3, i4));
                    arrayList.add(g91Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    rv0Var2 = new rv0(i5, arrayList3);
                } else {
                    int i21 = g91Var2.c;
                    arrayList.add(g91Var2);
                    ww0 ww0Var = (ww0) gx1Var.b(i21);
                    this.k = (ww0Var != null ? ww0Var.b : -1) + i3;
                    ww0 ww0Var2 = (ww0) gx1Var.b(i21);
                    int i22 = ww0Var2 != null ? ww0Var2.a : -1;
                    int i23 = rv0Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = gx1Var.c;
                            long[] jArr = gx1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                ww0 ww0Var3 = (ww0) objArr3[(i26 << 3) + i28];
                                                int i29 = ww0Var3.a;
                                                if (i29 == i22) {
                                                    ww0Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        ww0Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = gx1Var.c;
                        long[] jArr2 = gx1Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            ww0 ww0Var4 = (ww0) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = ww0Var4.a;
                                            if (i33 == i22) {
                                                ww0Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                ww0Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    g30 g30Var = this.M;
                    int i34 = g30Var.f;
                    ov0 ov0Var = g30Var.a;
                    g30Var.f = (i21 - ov0Var.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        g30Var.d(false);
                        q41 q41Var = g30Var.d;
                        gx2 gx2Var3 = ov0Var.G;
                        if (gx2Var3.c > 0 && q41Var.a(-2) != (i7 = gx2Var3.i)) {
                            if (!g30Var.c && g30Var.e) {
                                g30Var.d(false);
                                g30Var.b.F0.V(z22.c);
                                g30Var.c = true;
                            }
                            if (i7 > 0) {
                                iv0 iv0VarA = gx2Var3.a(i7);
                                q41Var.c(i7);
                                g30Var.d(false);
                                u32 u32Var = g30Var.b.F0;
                                u32Var.V(y22.c);
                                wc0.h0(u32Var, 0, iv0VarA);
                                g30Var.c = true;
                            }
                        }
                        u32 u32Var2 = g30Var.b.F0;
                        u32Var2.V(d32.c);
                        u32Var2.h[u32Var2.i - u32Var2.f[u32Var2.g - 1].a] = i6;
                    }
                    b0(obj2, z);
                    rv0Var2 = null;
                }
            } else {
                rv0Var2 = null;
            }
            w(z, rv0Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            kx2Var2 = this.I;
            i14 = kx2Var2.t;
            if (z) {
                kx2Var2.P(i, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                kx2Var2.P(i, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                kx2Var2.P(i, obj4, obj5, false);
            }
            rv0Var3 = this.j;
            if (rv0Var3 != null) {
                int i110 = (-2) - i14;
                g91 g91Var4 = new g91(i, i110, -1, -1);
                rv0Var3.e.h(i110, new ww0(-1, this.k - rv0Var3.b, 0));
                rv0Var3.d.add(g91Var4);
            }
            w(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                gx2Var2 = this.G;
                i13 = gx2Var2.g;
                if (i13 < gx2Var2.h) {
                    objP = gx2Var2.p(gx2Var2.b, i13);
                } else {
                    objP = null;
                }
                if (o51.f(obj4, objP)) {
                    b0(obj2, z);
                    z3 = z2;
                }
            }
            gx2Var = this.G;
            iArr = gx2Var.b;
            arrayList2 = new ArrayList();
            if (gx2Var.k <= 0) {
                i10 = gx2Var.g;
                while (i10 < gx2Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = gx2Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new g91(i112, i10, i12, objP3));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new rv0(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        rv0Var = this.j;
        if (rv0Var != null) {
            arrayList = rv0Var.d;
            gx1Var = rv0Var.e;
            i3 = rv0Var.b;
            if (obj4 != null) {
                objValueOf = new r61(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            zx1Var = ((ax1) rv0Var.f.getValue()).a;
            objG = zx1Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof sx1) {
                sx1Var = (sx1) objG;
                Object objK2 = sx1Var.k(0);
                if (sx1Var.h()) {
                    zx1Var.k(objValueOf);
                }
                if (sx1Var.b == 1) {
                    zx1Var.m(objValueOf, sx1Var.e());
                }
                objG = objK2;
            } else {
                zx1Var.k(objValueOf);
            }
            g91 g91Var5 = (g91) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                kx2 kx2VarD2 = this.H.d();
                this.I = kx2VarD2;
                kx2VarD2.L();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            kx2Var = this.I;
            int i113 = kx2Var.t;
            if (z) {
                kx2Var.P(i, obj5, obj5, true);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                kx2Var.P(i, obj5, obj2, false);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                kx2Var.P(i, obj3, obj5, false);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            g91 g91Var6 = new g91(i, i210, -1, -1);
            gx1Var.h(i210, new ww0(-1, this.k - i3, i4));
            arrayList.add(g91Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            rv0Var2 = new rv0(i5, arrayList4);
        } else {
            rv0Var2 = null;
        }
        w(z, rv0Var2);
    }

    public final void Y() {
        X(-127, 0, null, null);
    }

    public final void Z(int i, i22 i22Var) {
        X(i, 0, i22Var, null);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        pn0 pn0Var = this.O;
        pn0Var.g.S();
        pn0Var.f.S();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        gx2 gx2Var = this.G;
        if (!gx2Var.f) {
            gx2Var.c();
        }
        if (this.I.w) {
            return;
        }
        x();
    }

    public final void a0(int i, Object obj) {
        X(i, 0, obj, null);
    }

    public final void b(Object obj, pu0 pu0Var) {
        if (this.S) {
            u32 u32Var = this.O.f;
            u32Var.V(p32.c);
            wc0.h0(u32Var, 0, obj);
            pu0Var.getClass();
            da0.o(2, pu0Var);
            wc0.h0(u32Var, 1, pu0Var);
            return;
        }
        g30 g30Var = this.M;
        g30Var.b();
        u32 u32Var2 = g30Var.b.F0;
        u32Var2.V(p32.c);
        pu0Var.getClass();
        da0.o(2, pu0Var);
        wc0.i0(u32Var2, 0, obj, 1, pu0Var);
    }

    public final void b0(Object obj, boolean z) {
        if (z) {
            gx2 gx2Var = this.G;
            if (gx2Var.k <= 0) {
                if ((gx2Var.b[(gx2Var.g * 5) + 1] & 1073741824) == 0) {
                    hb2.a("Expected a node group");
                }
                gx2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            g30 g30Var = this.M;
            g30Var.getClass();
            g30Var.d(false);
            u32 u32Var = g30Var.b.F0;
            u32Var.V(o32.c);
            wc0.h0(u32Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean c(float f) {
        Object objI = I();
        if ((objI instanceof Float) && f == ((Number) objI).floatValue()) {
            return false;
        }
        n0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            X(i, 0, null, null);
            return;
        }
        if (this.r) {
            j30.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        gx2 gx2Var = this.G;
        boolean z = this.S;
        c30 c30Var = d30.a;
        if (z) {
            gx2Var.k++;
            this.I.P(i, c30Var, c30Var, false);
            w(false, null);
            return;
        }
        if (gx2Var.g() == i && ((i3 = gx2Var.g) >= gx2Var.h || (gx2Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            gx2Var.u();
            w(false, null);
            return;
        }
        if (gx2Var.k <= 0 && (i2 = gx2Var.g) != gx2Var.h) {
            int i4 = this.k;
            N();
            this.M.e(i4, gx2Var.s());
            o51.z(this.s, i2, gx2Var.g);
        }
        gx2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            kx2 kx2VarD = this.H.d();
            this.I = kx2VarD;
            kx2VarD.L();
            this.J = false;
            this.K = null;
        }
        kx2 kx2Var = this.I;
        kx2Var.d();
        int i5 = kx2Var.t;
        kx2Var.P(i, c30Var, c30Var, false);
        this.N = kx2Var.b(i5);
        w(false, null);
    }

    public final boolean d(int i) {
        Object objI = I();
        if ((objI instanceof Integer) && i == ((Number) objI).intValue()) {
            return false;
        }
        n0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i) {
        X(i, 0, null, null);
    }

    public final boolean e(long j) {
        Object objI = I();
        if ((objI instanceof Long) && j == ((Number) objI).longValue()) {
            return false;
        }
        n0(Long.valueOf(j));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final ov0 e0(int i) {
        ee2 ee2Var;
        boolean z;
        c0(i);
        boolean z2 = this.S;
        t1 t1Var = this.g;
        ArrayList arrayList = this.E;
        t30 t30Var = this.h;
        if (z2) {
            ee2 ee2Var2 = new ee2(t30Var);
            arrayList.add(ee2Var2);
            n0(ee2Var2);
            ee2Var2.e = this.B;
            ee2Var2.b &= -17;
            t1Var.u();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iR = o51.r(arrayList2, i2);
        x51 x51Var = iR >= 0 ? (x51) arrayList2.remove(iR) : null;
        Object objM = this.G.m();
        if (o51.f(objM, d30.a)) {
            ee2Var = new ee2(t30Var);
            n0(ee2Var);
        } else {
            objM.getClass();
            ee2Var = (ee2) objM;
        }
        if (x51Var == null) {
            int i3 = ee2Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                ee2Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = ee2Var.b;
        ee2Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(ee2Var);
        ee2Var.e = this.B;
        ee2Var.b &= -17;
        t1Var.u();
        int i5 = ee2Var.b;
        if ((i5 & 256) != 0) {
            ee2Var.b = (i5 & (-257)) | 512;
            u32 u32Var = this.M.b.F0;
            u32Var.V(m32.c);
            wc0.h0(u32Var, 0, ee2Var);
            if (!this.y) {
                int i6 = ee2Var.b;
                if ((i6 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    ee2Var.b = i6 | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
            }
        }
        return this;
    }

    public final boolean f(Object obj) {
        if (o51.f(I(), obj)) {
            return false;
        }
        n0(obj);
        return true;
    }

    public final void f0(Object obj) {
        if (!this.S && this.G.g() == 207 && !o51.f(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        X(207, 0, null, obj);
    }

    public final boolean g(boolean z) {
        Object objI = I();
        if ((objI instanceof Boolean) && z == ((Boolean) objI).booleanValue()) {
            return false;
        }
        n0(Boolean.valueOf(z));
        return true;
    }

    public final void g0() {
        X(125, 2, null, null);
        this.r = true;
    }

    public final boolean h(Object obj) {
        if (I() == obj) {
            return false;
        }
        n0(obj);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h0() {
        this.m = 0;
        this.G = this.c.c();
        X(100, 0, null, null);
        o30 o30Var = this.b;
        o30Var.t();
        l72 l72VarI = o30Var.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(l72VarI);
        this.K = null;
        if (!this.q) {
            this.q = o30Var.e();
        }
        boolean zF = this.C;
        if (!zF) {
            zF = o30Var.f();
            this.C = zF;
        }
        if (zF) {
            hh0 hh0Var = s30.a;
            hh0Var.getClass();
            l72VarI = l72VarI.d(hh0Var, new b13(C()));
        }
        this.u = l72VarI;
        Set set = (Set) ji2.P(l72VarI, u31.a);
        if (set != null) {
            set.add(y());
            o30Var.o(set);
        }
        X(Long.hashCode(o30Var.g()), 0, null, null);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        g30 g30Var = this.M;
        g30Var.c = false;
        g30Var.d.b = 0;
        g30Var.f = 0;
        g30Var.e = true;
        g30Var.g = 0;
        g30Var.h.clear();
        g30Var.i = -1;
        g30Var.j = -1;
        g30Var.k = -1;
        g30Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final boolean i0(ee2 ee2Var, Object obj) {
        iv0 iv0Var = ee2Var.c;
        if (iv0Var == null) {
            return false;
        }
        int iA = this.G.a.a(ld0.j(iv0Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iR = o51.r(arrayList, iA);
        if (iR < 0) {
            int i = -(iR + 1);
            if (!(obj instanceof fc0)) {
                obj = null;
            }
            arrayList.add(i, new x51(ee2Var, iA, obj));
            return true;
        }
        x51 x51Var = (x51) arrayList.get(iR);
        if (!(obj instanceof fc0)) {
            x51Var.c = null;
            return true;
        }
        Object obj2 = x51Var.c;
        if (obj2 == null) {
            x51Var.c = obj;
            return true;
        }
        if (obj2 instanceof ay1) {
            ((ay1) obj2).a(obj);
            return true;
        }
        ay1 ay1Var = in2.a;
        ay1 ay1Var2 = new ay1(2);
        ay1Var2.k(obj2);
        ay1Var2.k(obj);
        x51Var.c = ay1Var2;
        return true;
    }

    public final Object j(cd2 cd2Var) {
        return ji2.P(l(), cd2Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void j0(zx1 zx1Var) {
        ArrayList arrayList = this.s;
        for (int iX = am1.x(arrayList); -1 < iX; iX--) {
            x51 x51Var = (x51) arrayList.get(iX);
            iv0 iv0Var = x51Var.a.c;
            iv0 iv0VarJ = iv0Var != null ? ld0.j(iv0Var) : null;
            if (iv0VarJ == null || !iv0VarJ.a()) {
                arrayList.remove(iX);
            } else {
                int i = x51Var.b;
                int i2 = iv0VarJ.a;
                if (i != i2) {
                    x51Var.b = i2;
                }
            }
        }
        Object[] objArr = zx1Var.b;
        Object[] objArr2 = zx1Var.c;
        long[] jArr = zx1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            ee2 ee2Var = (ee2) obj;
                            iv0 iv0Var2 = ee2Var.c;
                            if (iv0Var2 != null) {
                                int i7 = ld0.j(iv0Var2).a;
                                if (obj2 == u92.i) {
                                    obj2 = null;
                                }
                                arrayList.add(new x51(ee2Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        ez.Z(arrayList, o51.j0);
    }

    public final void k(au0 au0Var) {
        if (!this.r) {
            j30.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            j30.a("createNode() can only be called when inserting");
        }
        q41 q41Var = this.n;
        int i = q41Var.a[q41Var.b - 1];
        kx2 kx2Var = this.I;
        iv0 iv0VarB = kx2Var.b(kx2Var.v);
        this.l++;
        pn0 pn0Var = this.O;
        u32 u32Var = pn0Var.f;
        u32Var.V(a32.d);
        wc0.h0(u32Var, 0, au0Var);
        u32Var.h[u32Var.i - u32Var.f[u32Var.g - 1].a] = i;
        wc0.h0(u32Var, 1, iv0VarB);
        u32 u32Var2 = pn0Var.g;
        u32Var2.V(a32.e);
        u32Var2.h[u32Var2.i - u32Var2.f[u32Var2.g - 1].a] = i;
        wc0.h0(u32Var2, 0, iv0VarB);
    }

    public final void k0(int i, int i2) {
        if (o0(i) != i2) {
            if (i < 0) {
                ex1 ex1Var = this.p;
                if (ex1Var == null) {
                    ex1Var = new ex1();
                    this.p = ex1Var;
                }
                ex1Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final l72 l() {
        l72 l72Var;
        l72 l72Var2 = this.K;
        if (l72Var2 != null) {
            return l72Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        i22 i22Var = j30.c;
        if (z && this.J) {
            int iD = this.I.v;
            while (iD > 0) {
                if (this.I.r(iD) == 202 && o51.f(this.I.s(iD), i22Var)) {
                    Object objP = this.I.p(iD);
                    objP.getClass();
                    l72 l72Var3 = (l72) objP;
                    this.K = l72Var3;
                    return l72Var3;
                }
                kx2 kx2Var = this.I;
                iD = kx2Var.D(kx2Var.b, iD);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    gx2 gx2Var = this.G;
                    if (o51.f(gx2Var.p(gx2Var.b, iQ), i22Var)) {
                        gx1 gx1Var = this.v;
                        if (gx1Var == null || (l72Var = (l72) gx1Var.b(iQ)) == null) {
                            gx2 gx2Var2 = this.G;
                            Object objB = gx2Var2.b(gx2Var2.b, iQ);
                            objB.getClass();
                            l72Var = (l72) objB;
                        }
                        this.K = l72Var;
                        return l72Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        l72 l72Var4 = this.u;
        this.K = l72Var4;
        return l72Var4;
    }

    public final void l0(int i, int i2) {
        int iO0 = o0(i);
        if (iO0 != i2) {
            int i3 = i2 - iO0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iO1 = o0(i) + i3;
                k0(i, iO1);
                for (int i4 = size; -1 < i4; i4--) {
                    rv0 rv0Var = (rv0) arrayList.get(i4);
                    if (rv0Var != null && rv0Var.a(i, iO1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                gx2 gx2Var = this.G;
                if (i < 0) {
                    i = gx2Var.i;
                } else if (gx2Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final s20 m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        mg1 mg1VarN = am1.n();
        kx2 kx2Var = this.I;
        mg1VarN.addAll(n51.m(kx2Var, null, kx2Var.t, null));
        gx2 gx2Var = this.G;
        boolean z = gx2Var.f;
        int[] iArr = gx2Var.b;
        if (z || gx2Var.c == 0) {
            collection = uj0.e;
        } else {
            qd2 qd2Var = new qd2(gx2Var);
            int iQ = gx2Var.i;
            Object objValueOf = Integer.valueOf(gx2Var.l - jx2.d(iArr, iQ));
            while (iQ >= 0) {
                qd2Var.k(gx2Var.i(iQ), gx2Var.k(iQ) ? gx2Var.p(iArr, iQ) : d30.a, gx2Var.a.f(iQ), objValueOf);
                objValueOf = gx2Var.a(iQ);
                iQ = gx2Var.q(iQ);
            }
            collection = (ArrayList) qd2Var.a;
        }
        mg1VarN.addAll(collection);
        mg1VarN.addAll(J());
        return new s20(am1.f(mg1VarN), this.C);
    }

    public final void m0(Object obj) {
        if (obj instanceof mf2) {
            sv0 sv0Var = new sv0((mf2) obj, this.m - 1);
            if (this.S) {
                u32 u32Var = this.M.b.F0;
                u32Var.V(f32.c);
                wc0.h0(u32Var, 0, sv0Var);
            }
            this.d.add(obj);
            obj = sv0Var;
        }
        n0(obj);
    }

    public final void n(zx1 zx1Var, pu0 pu0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            j30.a("Reentrant composition is not supported");
        }
        this.g.u();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(tx2.h().g());
            this.v = null;
            j0(zx1Var);
            this.k = 0;
            this.F = true;
            try {
                h0();
                Object objI = I();
                if (objI != pu0Var && pu0Var != null) {
                    n0(pu0Var);
                }
                nv0 nv0Var = this.D;
                gy1 gy1VarA = by2.a();
                try {
                    gy1VarA.b(nv0Var);
                    i22 i22Var = j30.a;
                    if (pu0Var != null) {
                        Z(200, i22Var);
                        ce0.G(this, pu0Var);
                        p(false);
                    } else if (!this.w || objI == null || objI.equals(d30.a)) {
                        U();
                    } else {
                        Z(200, i22Var);
                        da0.o(2, objI);
                        ce0.G(this, (pu0) objI);
                        p(false);
                    }
                    gy1VarA.k(gy1VarA.g - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        j30.a("Check failed");
                    }
                    x();
                    Trace.endSection();
                } catch (Throwable th) {
                    gy1VarA.k(gy1VarA.g - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    o51.H(th2, new kv0(this, 1));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        j30.a("Check failed");
                    }
                    x();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void n0(Object obj) {
        if (this.S) {
            kx2 kx2Var = this.I;
            if (kx2Var.n <= 0 || kx2Var.i == kx2Var.k) {
                kx2Var.E(obj);
                return;
            }
            gx1 gx1Var = kx2Var.s;
            if (gx1Var == null) {
                gx1Var = new gx1();
            }
            kx2Var.s = gx1Var;
            int i = kx2Var.v;
            Object objB = gx1Var.b(i);
            if (objB == null) {
                objB = new sx1();
                gx1Var.h(i, objB);
            }
            ((sx1) objB).a(obj);
            return;
        }
        gx2 gx2Var = this.G;
        boolean z = gx2Var.n;
        g30 g30Var = this.M;
        if (!z) {
            iv0 iv0VarA = gx2Var.a(gx2Var.i);
            u32 u32Var = g30Var.b.F0;
            u32Var.V(n22.c);
            wc0.i0(u32Var, 0, iv0VarA, 1, obj);
            return;
        }
        int iD = (gx2Var.l - jx2.d(gx2Var.b, gx2Var.i)) - 1;
        if (g30Var.a.G.i - g30Var.f >= 0) {
            g30Var.d(true);
            u32 u32Var2 = g30Var.b.F0;
            u32Var2.V(a32.g);
            wc0.h0(u32Var2, 0, obj);
            u32Var2.h[u32Var2.i - u32Var2.f[u32Var2.g - 1].a] = iD;
            return;
        }
        gx2 gx2Var2 = this.G;
        iv0 iv0VarA2 = gx2Var2.a(gx2Var2.i);
        u32 u32Var3 = g30Var.b.F0;
        u32Var3.V(a32.f);
        wc0.i0(u32Var3, 0, obj, 1, iv0VarA2);
        u32Var3.h[u32Var3.i - u32Var3.f[u32Var3.g - 1].a] = iD;
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            g30 g30Var = this.M;
            g30Var.c();
            g30Var.h.add(objN);
        }
    }

    public final int o0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        ex1 ex1Var = this.p;
        if (ex1Var != null && ex1Var.c(i) >= 0) {
            int iC = ex1Var.c(i);
            if (iC >= 0) {
                return ex1Var.c[iC];
            }
            b81.y(p91.l(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void p(boolean z) {
        long jRotateRight;
        q41 q41Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        q41 q41Var2;
        int i7;
        ay1 ay1Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        q41 q41Var3 = this.n;
        int i15 = q41Var3.a[q41Var3.b - 2] - 1;
        boolean z2 = this.S;
        c30 c30Var = d30.a;
        if (z2) {
            kx2 kx2Var = this.I;
            int i16 = kx2Var.v;
            int iR = kx2Var.r(i16);
            Object objS = this.I.s(i16);
            Object objP = this.I.p(i16);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(c30Var)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iR);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            gx2 gx2Var = this.G;
            int i17 = gx2Var.i;
            int i18 = gx2Var.i(i17);
            gx2 gx2Var2 = this.G;
            Object objP2 = gx2Var2.p(gx2Var2.b, i17);
            gx2 gx2Var3 = this.G;
            Object objB = gx2Var3.b(gx2Var3.b, i17);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(c30Var)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        rv0 rv0Var = this.j;
        ArrayList arrayList4 = this.s;
        g30 g30Var = this.M;
        if (rv0Var != null) {
            gx1 gx1Var = rv0Var.e;
            int i20 = rv0Var.b;
            ArrayList arrayList5 = rv0Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = rv0Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                ay1 ay1Var2 = in2.a;
                ay1 ay1Var3 = new ay1();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    g91 g91Var = (g91) arrayList5.get(i22);
                    if (hashSet2.contains(g91Var)) {
                        q41Var2 = q41Var3;
                        i7 = i22;
                        if (!ay1Var3.c(g91Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                g91 g91Var2 = (g91) arrayList6.get(i25);
                                if (g91Var2 != g91Var) {
                                    ww0 ww0Var = (ww0) gx1Var.b(g91Var2.c);
                                    int i26 = ww0Var != null ? ww0Var.b : -1;
                                    ay1Var3.a(g91Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        ww0 ww0Var2 = (ww0) gx1Var.b(g91Var2.c);
                                        int i27 = ww0Var2 != null ? ww0Var2.c : g91Var2.d;
                                        ay1Var = ay1Var3;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = g30Var.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (g30Var.j == i28 - i30 && g30Var.k == i29 - i30) {
                                                    g30Var.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            g30Var.c();
                                            g30Var.j = i28;
                                            g30Var.k = i29;
                                            g30Var.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            g30Var.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = gx1Var.c;
                                                long[] jArr5 = gx1Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    ww0 ww0Var3 = (ww0) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = ww0Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        ww0Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        ww0Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = gx1Var.c;
                                            long[] jArr6 = gx1Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                ww0 ww0Var4 = (ww0) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = ww0Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    ww0Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    ww0Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        ay1Var = ay1Var3;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    ay1Var = ay1Var3;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                ww0 ww0Var5 = (ww0) gx1Var.b(g91Var2.c);
                                int i41 = i10 + (ww0Var5 != null ? ww0Var5.c : g91Var2.d);
                                i22 = i11;
                                rv0Var = rv0Var;
                                ay1Var3 = ay1Var;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                q41Var3 = q41Var2;
                            } else {
                                i23 = i25;
                                q41Var3 = q41Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        q41Var2 = q41Var3;
                        ww0 ww0Var6 = (ww0) gx1Var.b(g91Var.c);
                        int i42 = ww0Var6 != null ? ww0Var6.b : -1;
                        int i43 = g91Var.c;
                        i7 = i22;
                        g30Var.e(i42 + i20, g91Var.d);
                        rv0Var.a(i43, 0);
                        g30Var.f = (i43 - g30Var.a.G.g) + g30Var.f;
                        this.G.r(i43);
                        N();
                        this.G.s();
                        o51.z(arrayList4, i43, this.G.b[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    q41Var3 = q41Var2;
                }
                q41Var = q41Var3;
                arrayList = arrayList4;
                g30Var.c();
                if (arrayList5.size() > 0) {
                    gx2 gx2Var4 = this.G;
                    g30Var.f = (gx2Var4.h - g30Var.a.G.g) + g30Var.f;
                    gx2Var4.t();
                }
            } else {
                q41Var = q41Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            q41Var = q41Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            gx2 gx2Var5 = this.G;
            int i44 = gx2Var5.m - gx2Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    g30Var.d(false);
                    q41 q41Var4 = g30Var.d;
                    gx2 gx2Var6 = g30Var.a.G;
                    if (gx2Var6.c > 0 && q41Var4.a(-2) != (i6 = gx2Var6.i)) {
                        if (!g30Var.c && g30Var.e) {
                            g30Var.d(false);
                            g30Var.b.F0.V(z22.c);
                            g30Var.c = true;
                        }
                        if (i6 > 0) {
                            iv0 iv0VarA = gx2Var6.a(i6);
                            q41Var4.c(i6);
                            g30Var.d(false);
                            u32 u32Var = g30Var.b.F0;
                            u32Var.V(y22.c);
                            wc0.h0(u32Var, 0, iv0VarA);
                            g30Var.c = true;
                        }
                    }
                    u32 u32Var2 = g30Var.b.F0;
                    u32Var2.V(n32.c);
                    u32Var2.h[u32Var2.i - u32Var2.f[u32Var2.g - 1].a] = i44;
                } else {
                    g30Var.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            gx2 gx2Var7 = this.G;
            if (gx2Var7.k > 0 || (i5 = gx2Var7.g) == gx2Var7.h) {
                break;
            }
            N();
            g30Var.e(i45, this.G.s());
            o51.z(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                pn0 pn0Var = this.O;
                u32 u32Var3 = pn0Var.g;
                if (u32Var3.g == 0) {
                    j30.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                u32 u32Var4 = pn0Var.f;
                s32[] s32VarArr = u32Var3.f;
                int i46 = u32Var3.g - 1;
                u32Var3.g = i46;
                s32 s32Var = s32VarArr[i46];
                s32VarArr[i46] = null;
                u32Var4.V(s32Var);
                Object[] objArr7 = u32Var3.j;
                Object[] objArr8 = u32Var4.j;
                int i47 = u32Var4.k;
                int i48 = s32Var.b;
                int i49 = u32Var3.k;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = u32Var3.j;
                int i51 = u32Var3.k;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = u32Var3.h;
                int[] iArr2 = u32Var4.h;
                int i52 = u32Var4.i;
                int i53 = s32Var.a;
                int i54 = u32Var3.i;
                yo.k0(i52 - i53, i54 - i53, i54, iArr, iArr2);
                u32Var3.k -= i48;
                u32Var3.i -= i53;
                i19 = 1;
            }
            gx2 gx2Var8 = this.G;
            if (gx2Var8.k <= 0) {
                hb2.a("Unbalanced begin/end empty");
            }
            gx2Var8.k--;
            kx2 kx2Var2 = this.I;
            int i55 = kx2Var2.v;
            kx2Var2.i();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.j();
                this.I.e(true);
                iv0 iv0Var = this.N;
                boolean zU = this.O.f.U();
                hx2 hx2Var = this.H;
                if (zU) {
                    g30Var.b();
                    g30Var.d(false);
                    q41 q41Var5 = g30Var.d;
                    gx2 gx2Var9 = g30Var.a.G;
                    if (gx2Var9.c <= 0 || q41Var5.a(-2) == (i4 = gx2Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!g30Var.c && g30Var.e) {
                            g30Var.d(false);
                            g30Var.b.F0.V(z22.c);
                            g30Var.c = true;
                        }
                        if (i4 > 0) {
                            iv0 iv0VarA2 = gx2Var9.a(i4);
                            q41Var5.c(i4);
                            g30Var.d(false);
                            u32 u32Var5 = g30Var.b.F0;
                            u32Var5.V(y22.c);
                            wc0.h0(u32Var5, 0, iv0VarA2);
                            i3 = 1;
                            g30Var.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    g30Var.c();
                    u32 u32Var6 = g30Var.b.F0;
                    u32Var6.V(b32.c);
                    wc0.i0(u32Var6, 0, iv0Var, i3, hx2Var);
                    r3 = 0;
                } else {
                    pn0 pn0Var2 = this.O;
                    g30Var.b();
                    g30Var.d(false);
                    q41 q41Var6 = g30Var.d;
                    gx2 gx2Var10 = g30Var.a.G;
                    if (gx2Var10.c > 0 && q41Var6.a(-2) != (i2 = gx2Var10.i)) {
                        if (!g30Var.c && g30Var.e) {
                            g30Var.d(false);
                            g30Var.b.F0.V(z22.c);
                            g30Var.c = true;
                        }
                        if (i2 > 0) {
                            iv0 iv0VarA3 = gx2Var10.a(i2);
                            q41Var6.c(i2);
                            g30Var.d(false);
                            u32 u32Var7 = g30Var.b.F0;
                            u32Var7.V(y22.c);
                            wc0.h0(u32Var7, 0, iv0VarA3);
                            g30Var.c = true;
                        }
                    }
                    g30Var.c();
                    u32 u32Var8 = g30Var.b.F0;
                    u32Var8.V(c32.c);
                    int i57 = u32Var8.k - u32Var8.f[u32Var8.g - 1].b;
                    Object[] objArr10 = u32Var8.j;
                    objArr10[i57] = iv0Var;
                    objArr10[i57 + 1] = hx2Var;
                    objArr10[i57 + 2] = pn0Var2;
                    this.O = new pn0();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.f != 0) {
                    k0(i56, r3);
                    l0(i56, i19);
                }
            }
        } else {
            if (z) {
                g30Var.a();
            }
            int i58 = g30Var.a.G.i;
            q41 q41Var7 = g30Var.d;
            int i59 = i;
            if (q41Var7.a(i59) > i58) {
                j30.a("Missed recording an endGroup");
            }
            if (q41Var7.a(i59) == i58) {
                g30Var.d(false);
                q41Var7.b();
                g30Var.b.F0.V(v22.c);
            }
            int i60 = this.G.i;
            if (i19 != o0(i60)) {
                l0(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            g30Var.c();
        }
        ArrayList arrayList7 = this.i;
        rv0 rv0Var2 = (rv0) arrayList7.remove(arrayList7.size() - 1);
        if (rv0Var2 != null && !z3) {
            rv0Var2.c++;
        }
        this.j = rv0Var2;
        this.k = q41Var.b() + i19;
        this.m = q41Var.b();
        this.l = q41Var.b() + i19;
    }

    public final void p0() {
        if (!this.r) {
            j30.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            j30.a("useNode() called while inserting");
        }
        gx2 gx2Var = this.G;
        Object objN = gx2Var.n(gx2Var.i);
        g30 g30Var = this.M;
        g30Var.c();
        g30Var.h.add(objN);
        if (this.y && (objN instanceof k20)) {
            g30Var.b();
            g30Var.b.F0.V(r32.c);
        }
    }

    public final void q() {
        p(false);
        ee2 ee2VarA = A();
        if (ee2VarA != null) {
            int i = ee2VarA.b;
            if ((i & 1) != 0) {
                ee2VarA.b = i | 2;
            }
        }
    }

    public final void r() {
        p(true);
    }

    public final void s() {
        p(false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[LOOP:0: B:16:0x003f->B:28:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[EDGE_INSN: B:29:0x0085->B:30:0x0086 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0085 A[SYNTHETIC] */
    public final ee2 t() {
        ee2 ee2Var;
        iv0 iv0VarA;
        de2 de2Var;
        ArrayList arrayList = this.E;
        ee2 ee2Var2 = !arrayList.isEmpty() ? (ee2) arrayList.remove(arrayList.size() - 1) : null;
        int i = 0;
        if (ee2Var2 != null) {
            ee2Var2.b &= -9;
            this.g.u();
            int i2 = this.B;
            ox1 ox1Var = ee2Var2.f;
            if (ox1Var == null || (ee2Var2.b & 16) != 0) {
                de2Var = null;
                break;
            }
            Object[] objArr = ox1Var.b;
            int[] iArr = ox1Var.c;
            long[] jArr = ox1Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                de2Var = null;
                break;
            }
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            if (iArr[i6] != i2) {
                                de2Var = new de2(i2, i, ee2Var2, ox1Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 == 8) {
                        if (i3 == length) {
                            i3++;
                        }
                    }
                    de2Var = null;
                    break;
                }
                if (i3 == length) {
                    de2Var = null;
                    break;
                }
                i3++;
            }
            g30 g30Var = this.M;
            if (de2Var != null) {
                u32 u32Var = g30Var.b.F0;
                u32Var.V(u22.c);
                wc0.i0(u32Var, 0, de2Var, 1, this.h);
            }
            int i7 = ee2Var2.b;
            if ((i7 & 512) != 0) {
                ee2Var2.b = i7 & (-513);
                u32 u32Var2 = g30Var.b.F0;
                u32Var2.V(x22.c);
                wc0.h0(u32Var2, 0, ee2Var2);
                int i8 = ee2Var2.b;
                ee2Var2.b = i8 & (-129);
                if ((i8 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    ee2Var2.b = i8 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (ee2Var2 != null) {
            int i9 = ee2Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (ee2Var2.c == null) {
                    if (this.S) {
                        kx2 kx2Var = this.I;
                        iv0VarA = kx2Var.b(kx2Var.v);
                    } else {
                        gx2 gx2Var = this.G;
                        iv0VarA = gx2Var.a(gx2Var.i);
                    }
                    ee2Var2.c = iv0VarA;
                }
                ee2Var2.b &= -5;
                ee2Var = ee2Var2;
            } else {
                ee2Var = null;
            }
        } else {
            ee2Var = null;
        }
        p(false);
        return ee2Var;
    }

    public final void u() {
        if (this.F || this.z != 0) {
            hb2.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void v() {
        p(false);
        this.b.c();
        p(false);
        g30 g30Var = this.M;
        if (g30Var.c) {
            g30Var.d(false);
            g30Var.d(false);
            g30Var.b.F0.V(v22.c);
            g30Var.c = false;
        }
        g30Var.b();
        if (g30Var.d.b != 0) {
            j30.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            j30.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void w(boolean z, rv0 rv0Var) {
        this.i.add(this.j);
        this.j = rv0Var;
        int i = this.l;
        q41 q41Var = this.n;
        q41Var.c(i);
        q41Var.c(this.m);
        q41Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        hx2 hx2Var = new hx2();
        if (this.C) {
            hx2Var.b();
        }
        if (this.b.d()) {
            hx2Var.o = new gx1();
        }
        this.H = hx2Var;
        kx2 kx2VarD = hx2Var.d();
        kx2VarD.e(true);
        this.I = kx2VarD;
    }

    public final q30 y() {
        pv0 pv0Var = this.U;
        if (pv0Var != null) {
            return pv0Var;
        }
        pv0 pv0Var2 = new pv0(this.h);
        this.U = pv0Var2;
        return pv0Var2;
    }

    public final l72 z() {
        return l();
    }
}
