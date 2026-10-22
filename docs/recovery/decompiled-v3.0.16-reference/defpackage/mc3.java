package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mc3 {
    public final fy1 a;
    public final mc3 b;
    public final String c;
    public final w52 d = ke0.H(c());
    public final w52 e = ke0.H(new jc3(c(), c()));
    public final u52 f = new u52(0);
    public final u52 g = new u52(Long.MIN_VALUE);
    public final w52 h;
    public final fy2 i;
    public final fy2 j;
    public final w52 k;

    public mc3(fy1 fy1Var, mc3 mc3Var, String str) {
        this.a = fy1Var;
        this.b = mc3Var;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.h = ke0.H(bool);
        this.i = new fy2();
        this.j = new fy2();
        this.k = ke0.H(bool);
        by2.b(new ec3(this, 1));
    }

    public final void a(Object obj, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ov0Var.f(obj) : ov0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            ov0Var.W();
        } else if (g()) {
            ov0Var.c0(467722849);
            ov0Var.p(false);
        } else {
            ov0Var.c0(466062241);
            k(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (z || objQ == c30Var) {
                objQ = by2.b(new ec3(this, i3));
                ov0Var.m0(objQ);
            }
            if (((Boolean) ((s03) objQ).getValue()).booleanValue()) {
                ov0Var.c0(466470356);
                Object objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    objQ2 = oi0.j(ov0Var);
                    ov0Var.m0(objQ2);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objQ2;
                boolean zH = ov0Var.h(coroutineScope) | (i4 == 32);
                Object objQ3 = ov0Var.Q();
                if (zH || objQ3 == c30Var) {
                    objQ3 = new fc3(i3, coroutineScope, this);
                    ov0Var.m0(objQ3);
                }
                oi0.b(coroutineScope, this, (lu0) objQ3, ov0Var);
                ov0Var.p(false);
            } else {
                ov0Var.c0(467712929);
                ov0Var.p(false);
            }
            ov0Var.p(false);
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj(i, 7, this, obj);
        }
    }

    public final long b() {
        fy2 fy2Var = this.i;
        int size = fy2Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((kc3) fy2Var.get(i)).n.g());
        }
        fy2 fy2Var2 = this.j;
        int size2 = fy2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((mc3) fy2Var2.get(i2)).b());
        }
        return jMax;
    }

    public final Object c() {
        return this.a.b.getValue();
    }

    public final boolean d() {
        fy2 fy2Var = this.i;
        int size = fy2Var.size();
        for (int i = 0; i < size; i++) {
            ((kc3) fy2Var.get(i)).getClass();
        }
        fy2 fy2Var2 = this.j;
        int size2 = fy2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((mc3) fy2Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        mc3 mc3Var = this.b;
        return mc3Var != null ? mc3Var.e() : this.f.g();
    }

    public final ic3 f() {
        return (ic3) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        fy1 fy1Var = this.a;
        w52 w52Var = fy1Var.a;
        u52 u52Var = this.g;
        if (u52Var.g() == Long.MIN_VALUE) {
            u52Var.h(j);
            fy1Var.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) w52Var.getValue()).booleanValue()) {
            w52Var.setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        fy2 fy2Var = this.i;
        int size = fy2Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            kc3 kc3Var = (kc3) fy2Var.get(i);
            w52 w52Var2 = kc3Var.i;
            w52 w52Var3 = kc3Var.i;
            if (!((Boolean) w52Var2.getValue()).booleanValue()) {
                long jC = z ? kc3Var.a().c() : j;
                kc3Var.l.setValue(kc3Var.a().b(jC));
                kc3Var.m = kc3Var.a().f(jC);
                if (kc3Var.a().g(jC)) {
                    w52Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) w52Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        fy2 fy2Var2 = this.j;
        int size2 = fy2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mc3 mc3Var = (mc3) fy2Var2.get(i2);
            if (!o51.f(mc3Var.d.getValue(), mc3Var.c())) {
                mc3Var.h(j, z);
            }
            if (!o51.f(mc3Var.d.getValue(), mc3Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.h(Long.MIN_VALUE);
        Object value = this.d.getValue();
        fy1 fy1Var = this.a;
        fy1Var.b.setValue(value);
        if (this.b == null) {
            this.f.h(0L);
        }
        fy1Var.a.setValue(Boolean.FALSE);
        fy2 fy2Var = this.j;
        int size = fy2Var.size();
        for (int i = 0; i < size; i++) {
            ((mc3) fy2Var.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        fy1 fy1Var = this.a;
        fy1Var.a.setValue(Boolean.FALSE);
        boolean zG = g();
        w52 w52Var = this.d;
        if (!zG || !o51.f(c(), obj) || !o51.f(w52Var.getValue(), obj2)) {
            if (!o51.f(c(), obj)) {
                fy1Var.b.setValue(obj);
            }
            w52Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new jc3(obj, obj2));
        }
        fy2 fy2Var = this.j;
        int size = fy2Var.size();
        for (int i = 0; i < size; i++) {
            mc3 mc3Var = (mc3) fy2Var.get(i);
            mc3Var.getClass();
            if (mc3Var.g()) {
                mc3Var.j(mc3Var.c(), mc3Var.d.getValue());
            }
        }
        fy2 fy2Var2 = this.i;
        int size2 = fy2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kc3) fy2Var2.get(i2)).b();
        }
    }

    public final void k(Object obj) {
        w52 w52Var = this.d;
        if (o51.f(w52Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new jc3(w52Var.getValue(), obj));
        if (!o51.f(c(), w52Var.getValue())) {
            this.a.b.setValue(w52Var.getValue());
        }
        w52Var.setValue(obj);
        if (this.g.g() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        fy2 fy2Var = this.i;
        int size = fy2Var.size();
        for (int i = 0; i < size; i++) {
            ((kc3) fy2Var.get(i)).j.h(-2.0f);
        }
    }

    public final String toString() {
        fy2 fy2Var = this.i;
        int size = fy2Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((kc3) fy2Var.get(i)) + ", ";
        }
        return str;
    }
}
