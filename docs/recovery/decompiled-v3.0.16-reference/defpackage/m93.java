package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m93 extends hv1 {
    public final String a;
    public final q93 b;
    public final lq0 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public m93(String str, q93 q93Var, lq0 lq0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = q93Var;
        this.c = lq0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m93)) {
            return false;
        }
        m93 m93Var = (m93) obj;
        return o51.f(this.a, m93Var.a) && o51.f(this.b, m93Var.b) && o51.f(this.c, m93Var.c) && this.d == m93Var.d && this.e == m93Var.e && this.f == m93Var.f && this.g == m93Var.g;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        p93 p93Var = new p93();
        p93Var.s = this.a;
        p93Var.t = this.b;
        p93Var.u = this.c;
        p93Var.v = this.d;
        p93Var.w = this.e;
        p93Var.x = this.f;
        p93Var.y = this.g;
        return p93Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        lq0 lq0Var;
        lq0 lq0Var2;
        int i5;
        int i6;
        p93 p93Var = (p93) cv1Var;
        p93Var.getClass();
        q93 q93Var = p93Var.t;
        boolean z5 = false;
        boolean z6 = true;
        q93 q93Var2 = this.b;
        if (q93Var2 != q93Var) {
            if (!q93Var2.a.b(q93Var.a)) {
                z = true;
            }
            str = p93Var.s;
            str2 = this.a;
            if (!o51.f(str, str2)) {
                p93Var.s = str2;
                p93Var.C = null;
                z5 = true;
            }
            z2 = !p93Var.t.c(q93Var2);
            p93Var.t = q93Var2;
            i = p93Var.y;
            i2 = this.g;
            if (i != i2) {
                p93Var.y = i2;
                z2 = true;
            }
            i3 = p93Var.x;
            i4 = this.f;
            if (i3 != i4) {
                p93Var.x = i4;
                z2 = true;
            }
            z3 = p93Var.w;
            z4 = this.e;
            if (z3 != z4) {
                p93Var.w = z4;
                z2 = true;
            }
            lq0Var = p93Var.u;
            lq0Var2 = this.c;
            if (!o51.f(lq0Var, lq0Var2)) {
                p93Var.u = lq0Var2;
                z2 = true;
            }
            i5 = p93Var.v;
            i6 = this.d;
            if (i5 == i6) {
                z6 = z2;
            } else {
                p93Var.v = i6;
            }
            if (z5 || z6) {
                o52 o52VarM1 = p93Var.m1();
                String str3 = p93Var.s;
                q93 q93Var3 = p93Var.t;
                lq0 lq0Var3 = p93Var.u;
                int i7 = p93Var.v;
                boolean z7 = p93Var.w;
                int i8 = p93Var.x;
                int i9 = p93Var.y;
                o52VarM1.a = str3;
                o52VarM1.b = q93Var3;
                o52VarM1.c = lq0Var3;
                o52VarM1.d = i7;
                o52VarM1.e = z7;
                o52VarM1.f = i8;
                o52VarM1.g = i9;
                o52VarM1.s = (o52VarM1.s << 2) | 2;
                o52VarM1.c();
            }
            if (p93Var.r) {
                if (z5 || (z && p93Var.B != null)) {
                    ee0.C(p93Var);
                }
                if (z5 || z6) {
                    ld0.z(p93Var);
                    ig0.z(p93Var);
                }
                if (z) {
                    ig0.z(p93Var);
                }
            }
            return;
        }
        q93Var2.getClass();
        z = false;
        str = p93Var.s;
        str2 = this.a;
        if (!o51.f(str, str2)) {
            p93Var.s = str2;
            p93Var.C = null;
            z5 = true;
        }
        z2 = !p93Var.t.c(q93Var2);
        p93Var.t = q93Var2;
        i = p93Var.y;
        i2 = this.g;
        if (i != i2) {
            p93Var.y = i2;
            z2 = true;
        }
        i3 = p93Var.x;
        i4 = this.f;
        if (i3 != i4) {
            p93Var.x = i4;
            z2 = true;
        }
        z3 = p93Var.w;
        z4 = this.e;
        if (z3 != z4) {
            p93Var.w = z4;
            z2 = true;
        }
        lq0Var = p93Var.u;
        lq0Var2 = this.c;
        if (!o51.f(lq0Var, lq0Var2)) {
            p93Var.u = lq0Var2;
            z2 = true;
        }
        i5 = p93Var.v;
        i6 = this.d;
        if (i5 == i6) {
            z6 = z2;
        } else {
            p93Var.v = i6;
        }
        if (z5) {
            o52 o52VarM2 = p93Var.m1();
            String str4 = p93Var.s;
            q93 q93Var4 = p93Var.t;
            lq0 lq0Var4 = p93Var.u;
            int i10 = p93Var.v;
            boolean z8 = p93Var.w;
            int i11 = p93Var.x;
            int i12 = p93Var.y;
            o52VarM2.a = str4;
            o52VarM2.b = q93Var4;
            o52VarM2.c = lq0Var4;
            o52VarM2.d = i10;
            o52VarM2.e = z8;
            o52VarM2.f = i11;
            o52VarM2.g = i12;
            o52VarM2.s = (o52VarM2.s << 2) | 2;
            o52VarM2.c();
        } else {
            o52 o52VarM3 = p93Var.m1();
            String str5 = p93Var.s;
            q93 q93Var5 = p93Var.t;
            lq0 lq0Var5 = p93Var.u;
            int i13 = p93Var.v;
            boolean z9 = p93Var.w;
            int i14 = p93Var.x;
            int i15 = p93Var.y;
            o52VarM3.a = str5;
            o52VarM3.b = q93Var5;
            o52VarM3.c = lq0Var5;
            o52VarM3.d = i13;
            o52VarM3.e = z9;
            o52VarM3.f = i14;
            o52VarM3.g = i15;
            o52VarM3.s = (o52VarM3.s << 2) | 2;
            o52VarM3.c();
        }
        if (p93Var.r) {
            return;
        }
        if (z5) {
            ee0.C(p93Var);
        } else {
            ee0.C(p93Var);
        }
        if (z5) {
            ld0.z(p93Var);
            ig0.z(p93Var);
        } else {
            ld0.z(p93Var);
            ig0.z(p93Var);
        }
        if (z) {
            ig0.z(p93Var);
        }
    }

    public final int hashCode() {
        return (((p91.e(p91.b(this.d, (this.c.hashCode() + p91.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
