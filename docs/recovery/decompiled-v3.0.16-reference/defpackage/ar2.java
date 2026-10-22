package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ar2 {
    public final er2 a;
    public jx0 e;
    public lu0 f;
    public c12 k;
    public pa1 l;
    public uq2 t;
    public boolean u;
    public CoroutineScope v;
    public z82 w;
    public boolean x;
    public final w52 b = ke0.H(null);
    public final w52 c = ke0.H(Boolean.TRUE);
    public lu0 d = new dq2(this, 7);
    public final z92 g = new z92(4);
    public final vp0 h = new vp0();
    public final w52 i = ke0.H(Boolean.FALSE);
    public final fc0 j = by2.b(new bq2(this, 4));
    public final w52 m = new w52(mf3.a, j9.W);
    public final w52 n = ke0.H(new c12(0));
    public final w52 o = ke0.H(new c12(0));
    public final w52 p = ke0.H(null);
    public final w52 q = ke0.H(null);
    public final w52 r = ke0.H(null);
    public final w52 s = ke0.H(null);

    public ar2(er2 er2Var) {
        this.a = er2Var;
        er2Var.e = new dq2(this, 8);
        int i = 3;
        er2Var.f = new oe(this, i);
        er2Var.g = new yq2(this);
        int i2 = 2;
        er2Var.h = new bq2(this, i2);
        er2Var.i = new dq2(this, i2);
        er2Var.j = new dq2(this, i);
    }

    public final long a(pa1 pa1Var, long j) {
        pa1 pa1Var2 = this.l;
        if (pa1Var2 == null || !pa1Var2.U()) {
            return 9205357640488583168L;
        }
        return j().L(pa1Var, j);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    public final void b() {
        dj djVarG;
        lu0 lu0Var;
        int iNextIndex;
        if (f() != null) {
            er2 er2Var = this.a;
            if (er2Var.a().e == 0) {
                djVarG = null;
            } else {
                bj bjVar = new bj();
                ArrayList arrayListC = er2Var.c(j());
                ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    xp2 xp2Var = (xp2) er2Var.a().e(((bx1) listIterator.previous()).a);
                    if (xp2Var != null && xp2Var.a.b != xp2Var.b.b) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListC.size();
                    int i = 0;
                    while (i < size) {
                        bx1 bx1Var = (bx1) arrayListC.get(i);
                        xp2 xp2Var2 = (xp2) er2Var.a().e(bx1Var.a);
                        if (xp2Var2 != null) {
                            dj djVarD = bx1Var.d();
                            long jA = g93.a(xp2Var2.a.b, xp2Var2.b.b);
                            boolean z = i >= iNextIndex;
                            bjVar.b(djVarD, f93.f(jA), f93.e(jA));
                            if (!z) {
                                bjVar.e.append('\n');
                            }
                        }
                        i++;
                    }
                }
                djVarG = bjVar.g();
            }
        } else {
            djVarG = null;
        }
        if (djVarG != null) {
            dj djVar = djVarG.f.length() > 0 ? djVarG : null;
            if (djVar == null || (lu0Var = this.f) == null) {
                return;
            }
            lu0Var.invoke(djVar);
        }
    }

    public final bx1 c(wp2 wp2Var) {
        return (bx1) this.a.c.e(wp2Var.c);
    }

    public final i52 d() {
        int iNextIndex;
        int iF;
        int length;
        if (f() == null) {
            return null;
        }
        er2 er2Var = this.a;
        if (er2Var.b.isEmpty()) {
            return null;
        }
        bj bjVar = new bj();
        ArrayList arrayListC = er2Var.c(j());
        ListIterator listIterator = arrayListC.listIterator(arrayListC.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            xp2 xp2Var = (xp2) er2Var.a().e(((bx1) listIterator.previous()).a);
            if (xp2Var != null && xp2Var.a.b != xp2Var.b.b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListC.size();
            iF = -1;
            length = -1;
            int i = 0;
            while (i < size) {
                bx1 bx1Var = (bx1) arrayListC.get(i);
                xp2 xp2Var2 = (xp2) er2Var.a().e(bx1Var.a);
                if (xp2Var2 != null) {
                    dj djVarD = bx1Var.d();
                    long jA = g93.a(xp2Var2.a.b, xp2Var2.b.b);
                    boolean z = i >= iNextIndex;
                    if (iF == -1) {
                        iF = f93.f(jA);
                        bjVar.b(djVarD, 0, f93.f(jA));
                    }
                    bjVar.b(djVarD, f93.f(jA), f93.e(jA));
                    StringBuilder sb = bjVar.e;
                    if (z) {
                        length = sb.length();
                        bjVar.b(djVarD, f93.e(jA), djVarD.f.length());
                    } else {
                        sb.append('\n');
                    }
                }
                i++;
            }
        } else {
            iF = -1;
            length = -1;
        }
        dj djVarG = bjVar.g();
        if (iF == -1 || length == -1) {
            return null;
        }
        return new i52(djVarG, new f93(g93.a(iF, length)));
    }

    public final bx0 e() {
        return (bx0) this.r.getValue();
    }

    public final xp2 f() {
        return (xp2) this.b.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean h() {
        xp2 xp2VarF = f();
        if (xp2VarF != null) {
            wp2 wp2Var = xp2VarF.b;
            wp2 wp2Var2 = xp2VarF.a;
            if (!o51.f(wp2Var2, wp2Var)) {
                if (wp2Var2.c == wp2Var.c) {
                    return true;
                }
                pa1 pa1VarJ = j();
                er2 er2Var = this.a;
                ArrayList arrayListC = er2Var.c(pa1VarJ);
                int size = arrayListC.size();
                for (int i = 0; i < size; i++) {
                    xp2 xp2Var = (xp2) er2Var.a().e(((bx1) arrayListC.get(i)).a);
                    if (xp2Var != null && xp2Var.a.b != xp2Var.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        jx0 jx0Var;
        lx1 lx1Var = nj1.a;
        lx1Var.getClass();
        this.a.k.setValue(lx1Var);
        this.x = false;
        o();
        if (f() != null) {
            this.d.invoke(null);
            if (!g() || (jx0Var = this.e) == null) {
                return;
            }
            ((m82) jx0Var).a(9);
        }
    }

    public final pa1 j() {
        pa1 pa1Var = this.l;
        if (pa1Var == null) {
            throw p91.h("null coordinates");
        }
        if (!pa1Var.U()) {
            s21.a("unattached coordinates");
        }
        return pa1Var;
    }

    public final void k(boolean z) {
        w52 w52Var = this.c;
        if (((Boolean) w52Var.getValue()).booleanValue() != z) {
            w52Var.setValue(Boolean.valueOf(z));
            o();
        }
    }

    public final void l(xp2 xp2Var) {
        this.b.setValue(xp2Var);
        if (xp2Var != null) {
            m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    public final void m() {
        long j;
        c12 c12Var;
        long jA;
        c12 c12Var2;
        wp2 wp2Var;
        wp2 wp2Var2;
        xp2 xp2VarF = f();
        pa1 pa1Var = this.l;
        c12 c12Var3 = null;
        bx1 bx1VarC = (xp2VarF == null || (wp2Var2 = xp2VarF.a) == null) ? null : c(wp2Var2);
        bx1 bx1VarC2 = (xp2VarF == null || (wp2Var = xp2VarF.b) == null) ? null : c(wp2Var);
        pa1 pa1VarC = bx1VarC != null ? bx1VarC.c() : null;
        pa1 pa1VarC2 = bx1VarC2 != null ? bx1VarC2.c() : null;
        w52 w52Var = this.q;
        w52 w52Var2 = this.p;
        if (xp2VarF == null || pa1Var == null || !pa1Var.U() || (pa1VarC == null && pa1VarC2 == null)) {
            w52Var2.setValue(null);
            w52Var.setValue(null);
            return;
        }
        pe2 pe2VarA = n51.A(pa1Var);
        if (pa1VarC != null) {
            j = 9205357640488583168L;
            long jA2 = bx1VarC.a(xp2VarF, true);
            if ((jA2 & 9223372034707292159L) != 9205357640488583168L) {
                long jL = pa1Var.L(pa1VarC, jA2);
                c12Var = new c12(jL);
                if (e() != bx0.f && !n51.q(pe2VarA, jL)) {
                }
            }
            w52Var2.setValue(c12Var);
            if (pa1VarC2 != null) {
                jA = bx1VarC2.a(xp2VarF, false);
                if ((jA & 9223372034707292159L) != j) {
                    long jL2 = pa1Var.L(pa1VarC2, jA);
                    c12Var2 = new c12(jL2);
                    if (e() != bx0.g || n51.q(pe2VarA, jL2)) {
                        c12Var3 = c12Var2;
                    }
                }
            }
            w52Var.setValue(c12Var3);
        }
        j = 9205357640488583168L;
        c12Var = null;
        w52Var2.setValue(c12Var);
        if (pa1VarC2 != null) {
            jA = bx1VarC2.a(xp2VarF, false);
            if ((jA & 9223372034707292159L) != j) {
                long jL3 = pa1Var.L(pa1VarC2, jA);
                c12Var2 = new c12(jL3);
                if (e() != bx0.g) {
                    c12Var3 = c12Var2;
                } else {
                    c12Var3 = c12Var2;
                }
            }
        }
        w52Var.setValue(c12Var3);
    }

    public final boolean n(long j, long j2, boolean z, yp2 yp2Var) {
        jx1 jx1Var;
        ArrayList arrayList;
        uq2 yv2Var;
        er2 er2Var;
        x83 x83Var;
        long j3;
        int i;
        vq2 vq2Var;
        uc0 uc0Var;
        uc0 uc0Var2;
        uc0 uc0VarI;
        uc0 uc0Var3;
        uc0 uc0Var4;
        uc0 uc0Var5;
        uc0 uc0Var6;
        int i2;
        int iV;
        wp2 wp2Var;
        wp2 wp2Var2;
        this.r.setValue(z ? bx0.f : bx0.g);
        this.s.setValue(new c12(j));
        pa1 pa1VarJ = j();
        er2 er2Var2 = this.a;
        ArrayList arrayListC = er2Var2.c(pa1VarJ);
        int i3 = mj1.a;
        jx1 jx1Var2 = new jx1(6);
        int size = arrayListC.size();
        for (int i4 = 0; i4 < size; i4++) {
            jx1Var2.e(i4, ((bx1) arrayListC.get(i4)).a);
        }
        int i5 = 1;
        long j4 = 9223372034707292159L;
        vq2 vq2Var2 = new vq2(j, j2, pa1VarJ, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : f(), new wl1(jx1Var2, i5));
        int size2 = arrayListC.size();
        int i6 = 0;
        while (true) {
            jx1Var = vq2Var2.g;
            arrayList = vq2Var2.h;
            if (i6 >= size2) {
                break;
            }
            bx1 bx1Var = (bx1) arrayListC.get(i6);
            pa1 pa1VarC = bx1Var.c();
            if (pa1VarC == null || (x83Var = (x83) bx1Var.c.invoke()) == null) {
                er2Var2 = er2Var2;
                size2 = size2;
                i6 = i6;
                arrayListC = arrayListC;
                i = i5;
                j3 = j4;
            } else {
                j3 = j4;
                long jL = vq2Var2.c.L(pa1VarC, 0L);
                long jD = c12.d(vq2Var2.a, jL);
                int i7 = i5;
                long j5 = vq2Var2.b;
                long jD2 = (j5 & j3) == 9205357640488583168L ? 9205357640488583168L : c12.d(j5, jL);
                long j6 = bx1Var.a;
                i = i7;
                long j7 = x83Var.c;
                float f = (int) (j7 >> 32);
                float f2 = (int) (j7 & 4294967295L);
                int i8 = (int) (jD >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i8);
                uc0 uc0Var7 = uc0.g;
                uc0 uc0Var8 = uc0.e;
                uc0 uc0Var9 = uc0.f;
                uc0 uc0Var10 = fIntBitsToFloat < 0.0f ? uc0Var8 : Float.intBitsToFloat(i8) > f ? uc0Var7 : uc0Var9;
                int i9 = (int) (4294967295L & jD);
                uc0 uc0Var11 = Float.intBitsToFloat(i9) < 0.0f ? uc0Var8 : Float.intBitsToFloat(i9) > f2 ? uc0Var7 : uc0Var9;
                boolean z2 = vq2Var2.d;
                xp2 xp2Var = vq2Var2.e;
                if (z2) {
                    vq2Var = vq2Var2;
                    uc0VarI = ld0.i(uc0Var10, uc0Var11, vq2Var, j6, xp2Var != null ? xp2Var.b : null);
                    uc0Var5 = uc0Var10;
                    uc0Var = uc0Var5;
                    uc0Var3 = uc0Var11;
                    uc0Var2 = uc0Var3;
                    uc0Var6 = uc0VarI;
                    uc0Var4 = uc0Var6;
                } else {
                    vq2Var = vq2Var2;
                    uc0 uc0VarI2 = ld0.i(uc0Var10, uc0Var11, vq2Var, j6, xp2Var != null ? xp2Var.a : null);
                    uc0Var = uc0Var10;
                    uc0Var2 = uc0Var11;
                    uc0VarI = uc0Var2;
                    uc0Var3 = uc0VarI2;
                    uc0Var4 = uc0Var3;
                    uc0Var5 = uc0Var4;
                    uc0Var6 = uc0Var;
                }
                vq2Var2 = vq2Var;
                uc0 uc0VarK = ld0.K(uc0Var, uc0Var2);
                if (uc0VarK == uc0Var9 || uc0VarK != uc0Var4) {
                    int length = x83Var.a.a.f.length();
                    wl1 wl1Var = vq2Var2.f;
                    if (z2) {
                        iV = ld0.v(jD, x83Var);
                        if (xp2Var == null || (wp2Var2 = xp2Var.b) == null) {
                            length = iV;
                        } else {
                            int iCompare = wl1Var.compare(Long.valueOf(wp2Var2.c), Long.valueOf(j6));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = wp2Var2.b;
                            }
                        }
                        i2 = length;
                    } else {
                        int iV2 = ld0.v(jD, x83Var);
                        if (xp2Var == null || (wp2Var = xp2Var.a) == null) {
                            length = iV2;
                        } else {
                            int iCompare2 = wl1Var.compare(Long.valueOf(wp2Var.c), Long.valueOf(j6));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = wp2Var.b;
                            }
                        }
                        i2 = iV2;
                        iV = length;
                    }
                    int iV3 = (jD2 & j3) == 9205357640488583168L ? -1 : ld0.v(jD2, x83Var);
                    int i10 = vq2Var2.k + 2;
                    vq2Var2.k = i10;
                    qp2 qp2Var = new qp2(j6, i10, iV, i2, iV3, x83Var);
                    vq2Var2.i = vq2Var2.a(vq2Var2.i, uc0Var5, uc0Var3);
                    vq2Var2.j = vq2Var2.a(vq2Var2.j, uc0Var6, uc0VarI);
                    jx1Var.e(arrayList.size(), j6);
                    arrayList.add(qp2Var);
                }
            }
            i6++;
            size2 = size2;
            i5 = i;
            j4 = j3;
            arrayListC = arrayListC;
            er2Var2 = er2Var2;
        }
        er2 er2Var3 = er2Var2;
        int i11 = i5;
        int i12 = vq2Var2.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            yv2Var = null;
        } else if (size3 != i11) {
            int i13 = vq2Var2.i;
            int i14 = i13 == -1 ? i12 : i13;
            int i15 = vq2Var2.j;
            yv2Var = new vw1(jx1Var, arrayList, i14, i15 == -1 ? i12 : i15, vq2Var2.d, vq2Var2.e);
        } else {
            qp2 qp2Var2 = (qp2) zy.A0(arrayList);
            int i16 = vq2Var2.i;
            int i17 = i16 == -1 ? i12 : i16;
            int i18 = vq2Var2.j;
            yv2Var = new yv2(vq2Var2.d, i17, i18 == -1 ? i12 : i18, vq2Var2.e, qp2Var2);
        }
        if (yv2Var == null || !yv2Var.g(this.t)) {
            return false;
        }
        xp2 xp2VarA = yp2Var.a(yv2Var);
        if (!o51.f(xp2VarA, f())) {
            if (g()) {
                er2Var = er2Var3;
                ArrayList arrayList2 = er2Var.b;
                int size4 = arrayList2.size();
                for (int i19 = 0; i19 < size4; i19++) {
                    if (((bx1) arrayList2.get(i19)).d().f.length() > 0) {
                        jx0 jx0Var = this.e;
                        if (jx0Var == null) {
                            break;
                        }
                        ((m82) jx0Var).a(9);
                        break;
                    }
                }
            } else {
                er2Var = er2Var3;
            }
            er2Var.k.setValue(yv2Var.h(xp2VarA));
            this.d.invoke(xp2VarA);
            this.u = false;
        }
        this.t = yv2Var;
        return true;
    }

    public final void o() {
        Job job;
        if (((Boolean) this.i.getValue()).booleanValue()) {
            boolean z = this.x;
            z92 z92Var = this.g;
            if (z && g()) {
                if (((pe2) this.j.getValue()) == null) {
                    return;
                }
                z92Var.j();
            } else {
                o63 o63Var = (o63) z92Var.f;
                if (o63Var == null || (job = o63Var.y) == null) {
                    return;
                }
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                o63Var.y = null;
            }
        }
    }
}
