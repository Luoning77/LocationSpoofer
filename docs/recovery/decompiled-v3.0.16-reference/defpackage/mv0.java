package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mv0 extends o30 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final ay1 e;
    public final w52 f;
    public final /* synthetic */ ov0 g;

    public mv0(ov0 ov0Var, long j, boolean z, boolean z2, t1 t1Var) {
        this.g = ov0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        ay1 ay1Var = in2.a;
        this.e = new ay1();
        this.f = new w52(l72.h, u92.h);
    }

    @Override // defpackage.o30
    public final void a(t30 t30Var, pu0 pu0Var) {
        this.g.b.a(t30Var, pu0Var);
    }

    @Override // defpackage.o30
    public final ay1 b(t30 t30Var, pv2 pv2Var, pu0 pu0Var) {
        return this.g.b.b(t30Var, pv2Var, pu0Var);
    }

    @Override // defpackage.o30
    public final void c() {
        this.g.A--;
    }

    @Override // defpackage.o30
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.o30
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.o30
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.o30
    public final long g() {
        return this.a;
    }

    @Override // defpackage.o30
    public final n30 h() {
        return this.g.h;
    }

    @Override // defpackage.o30
    public final l72 i() {
        return (l72) this.f.getValue();
    }

    @Override // defpackage.o30
    public final y70 j() {
        return this.g.b.j();
    }

    @Override // defpackage.o30
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.o30
    public final void l(t30 t30Var) {
        ov0 ov0Var = this.g;
        o30 o30Var = ov0Var.b;
        o30Var.l(ov0Var.h);
        o30Var.l(t30Var);
    }

    @Override // defpackage.o30
    public final ew1 m(fw1 fw1Var) {
        return this.g.b.m(fw1Var);
    }

    @Override // defpackage.o30
    public final ay1 n(t30 t30Var, pv2 pv2Var, ay1 ay1Var) {
        return this.g.b.n(t30Var, pv2Var, ay1Var);
    }

    @Override // defpackage.o30
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.o30
    public final void p(ov0 ov0Var) {
        this.e.a(ov0Var);
    }

    @Override // defpackage.o30
    public final void q(ee2 ee2Var) {
        this.g.b.q(ee2Var);
    }

    @Override // defpackage.o30
    public final void r(t30 t30Var) {
        this.g.b.r(t30Var);
    }

    @Override // defpackage.o30
    public final tv s(ye yeVar) {
        return this.g.b.s(yeVar);
    }

    @Override // defpackage.o30
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.o30
    public final void u(ov0 ov0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                ov0Var.getClass();
                set.remove(ov0Var.y());
            }
        }
        if (ov0Var != null) {
            this.e.l(ov0Var);
        }
    }

    @Override // defpackage.o30
    public final void v(t30 t30Var) {
        this.g.b.v(t30Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void w() {
        ay1 ay1Var = this.e;
        if (ay1Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
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
                                    ov0 ov0Var = (ov0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(ov0Var.y());
                                    }
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
            }
            ay1Var.b();
        }
    }
}
