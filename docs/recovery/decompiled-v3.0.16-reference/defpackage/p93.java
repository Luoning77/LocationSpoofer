package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p93 extends cv1 implements ya1, hg0, hs2 {
    public o52 A;
    public n93 B;
    public o93 C;
    public String s;
    public q93 t;
    public lq0 u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public HashMap z;

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        o52 o52VarM1;
        o93 o93Var = this.C;
        if (o93Var == null) {
            o52VarM1 = m1();
        } else {
            if (!o93Var.c) {
                o93Var = null;
            }
            if (o93Var == null || (o52VarM1 = o93Var.d) == null) {
                o52VarM1 = m1();
            }
        }
        o52VarM1.d(ck1Var);
        return o52VarM1.a(i, ck1Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [n93] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        n93 n93Var = this.B;
        ?? r0 = n93Var;
        if (n93Var == null) {
            final int i = 0;
            ?? r1 = new lu0(this) { // from class: n93
                public final /* synthetic */ p93 f;

                {
                    this.f = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    xb0 xb0Var;
                    x83 x83Var;
                    int i2 = i;
                    boolean z = true;
                    p93 p93Var = this.f;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            o52 o52VarM1 = p93Var.m1();
                            q93 q93VarE = q93.e(p93Var.t, hz.g, 0L, null, null, 0L, null, 0, 0L, 16777214);
                            qa1 qa1Var = o52VarM1.o;
                            x83 x83Var2 = null;
                            if (qa1Var == null || (xb0Var = o52VarM1.i) == null) {
                                x83Var = null;
                            } else {
                                dj djVar = new dj(o52VarM1.a);
                                if (o52VarM1.j == null || o52VarM1.n == null) {
                                    x83Var = null;
                                } else {
                                    long j = o52VarM1.p & (-8589934589L);
                                    int i3 = o52VarM1.f;
                                    boolean z2 = o52VarM1.e;
                                    int i4 = o52VarM1.d;
                                    lq0 lq0Var = o52VarM1.c;
                                    uj0 uj0Var = uj0.e;
                                    x83Var = new x83(new w83(djVar, q93VarE, uj0Var, i3, z2, i4, xb0Var, qa1Var, lq0Var, j), new sw1(new xp(djVar, q93VarE, uj0Var, xb0Var, lq0Var), j, o52VarM1.f, o52VarM1.d), o52VarM1.l);
                                }
                            }
                            if (x83Var != null) {
                                list.add(x83Var);
                                x83Var2 = x83Var;
                            }
                            return Boolean.valueOf(x83Var2 != null);
                        case 1:
                            String str = ((dj) obj).f;
                            o93 o93Var = p93Var.C;
                            if (o93Var == null) {
                                o93 o93Var2 = new o93(p93Var.s, str);
                                o52 o52Var = new o52(str, p93Var.t, p93Var.u, p93Var.v, p93Var.w, p93Var.x, p93Var.y);
                                o52Var.d(p93Var.m1().i);
                                o93Var2.d = o52Var;
                                p93Var.C = o93Var2;
                            } else if (!o51.f(str, o93Var.b)) {
                                o93Var.b = str;
                                o52 o52Var2 = o93Var.d;
                                if (o52Var2 != null) {
                                    q93 q93Var = p93Var.t;
                                    lq0 lq0Var2 = p93Var.u;
                                    int i5 = p93Var.v;
                                    boolean z3 = p93Var.w;
                                    int i6 = p93Var.x;
                                    int i7 = p93Var.y;
                                    o52Var2.a = str;
                                    o52Var2.b = q93Var;
                                    o52Var2.c = lq0Var2;
                                    o52Var2.d = i5;
                                    o52Var2.e = z3;
                                    o52Var2.f = i6;
                                    o52Var2.g = i7;
                                    o52Var2.s = (o52Var2.s << 2) | 2;
                                    o52Var2.c();
                                }
                            }
                            ee0.C(p93Var);
                            ld0.z(p93Var);
                            ig0.z(p93Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            o93 o93Var3 = p93Var.C;
                            if (o93Var3 == null) {
                                z = false;
                            } else {
                                o93Var3.c = zBooleanValue;
                                ee0.C(p93Var);
                                ld0.z(p93Var);
                                ig0.z(p93Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.B = r1;
            r0 = r1;
        }
        dj djVar = new dj(this.s);
        x81[] x81VarArr = qs2.a;
        ss2Var.a(os2.C, am1.F(djVar));
        o93 o93Var = this.C;
        if (o93Var != null) {
            boolean z = o93Var.c;
            rs2 rs2Var = os2.E;
            x81[] x81VarArr2 = qs2.a;
            x81 x81Var = x81VarArr2[17];
            ss2Var.a(rs2Var, Boolean.valueOf(z));
            dj djVar2 = new dj(o93Var.b);
            rs2 rs2Var2 = os2.D;
            x81 x81Var2 = x81VarArr2[16];
            ss2Var.a(rs2Var2, djVar2);
        }
        final int i2 = 1;
        ss2Var.a(ds2.l, new z0(null, new lu0(this) { // from class: n93
            public final /* synthetic */ p93 f;

            {
                this.f = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                xb0 xb0Var;
                x83 x83Var;
                int i3 = i2;
                boolean z2 = true;
                p93 p93Var = this.f;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        o52 o52VarM1 = p93Var.m1();
                        q93 q93VarE = q93.e(p93Var.t, hz.g, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        qa1 qa1Var = o52VarM1.o;
                        x83 x83Var2 = null;
                        if (qa1Var == null || (xb0Var = o52VarM1.i) == null) {
                            x83Var = null;
                        } else {
                            dj djVar3 = new dj(o52VarM1.a);
                            if (o52VarM1.j == null || o52VarM1.n == null) {
                                x83Var = null;
                            } else {
                                long j = o52VarM1.p & (-8589934589L);
                                int i4 = o52VarM1.f;
                                boolean z3 = o52VarM1.e;
                                int i5 = o52VarM1.d;
                                lq0 lq0Var = o52VarM1.c;
                                uj0 uj0Var = uj0.e;
                                x83Var = new x83(new w83(djVar3, q93VarE, uj0Var, i4, z3, i5, xb0Var, qa1Var, lq0Var, j), new sw1(new xp(djVar3, q93VarE, uj0Var, xb0Var, lq0Var), j, o52VarM1.f, o52VarM1.d), o52VarM1.l);
                            }
                        }
                        if (x83Var != null) {
                            list.add(x83Var);
                            x83Var2 = x83Var;
                        }
                        return Boolean.valueOf(x83Var2 != null);
                    case 1:
                        String str = ((dj) obj).f;
                        o93 o93Var2 = p93Var.C;
                        if (o93Var2 == null) {
                            o93 o93Var3 = new o93(p93Var.s, str);
                            o52 o52Var = new o52(str, p93Var.t, p93Var.u, p93Var.v, p93Var.w, p93Var.x, p93Var.y);
                            o52Var.d(p93Var.m1().i);
                            o93Var3.d = o52Var;
                            p93Var.C = o93Var3;
                        } else if (!o51.f(str, o93Var2.b)) {
                            o93Var2.b = str;
                            o52 o52Var2 = o93Var2.d;
                            if (o52Var2 != null) {
                                q93 q93Var = p93Var.t;
                                lq0 lq0Var2 = p93Var.u;
                                int i6 = p93Var.v;
                                boolean z4 = p93Var.w;
                                int i7 = p93Var.x;
                                int i8 = p93Var.y;
                                o52Var2.a = str;
                                o52Var2.b = q93Var;
                                o52Var2.c = lq0Var2;
                                o52Var2.d = i6;
                                o52Var2.e = z4;
                                o52Var2.f = i7;
                                o52Var2.g = i8;
                                o52Var2.s = (o52Var2.s << 2) | 2;
                                o52Var2.c();
                            }
                        }
                        ee0.C(p93Var);
                        ld0.z(p93Var);
                        ig0.z(p93Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        o93 o93Var4 = p93Var.C;
                        if (o93Var4 == null) {
                            z2 = false;
                        } else {
                            o93Var4.c = zBooleanValue;
                            ee0.C(p93Var);
                            ld0.z(p93Var);
                            ig0.z(p93Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        ss2Var.a(ds2.m, new z0(null, new lu0(this) { // from class: n93
            public final /* synthetic */ p93 f;

            {
                this.f = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00bc  */
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                xb0 xb0Var;
                x83 x83Var;
                int i4 = i3;
                boolean z2 = true;
                p93 p93Var = this.f;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        o52 o52VarM1 = p93Var.m1();
                        q93 q93VarE = q93.e(p93Var.t, hz.g, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        qa1 qa1Var = o52VarM1.o;
                        x83 x83Var2 = null;
                        if (qa1Var == null || (xb0Var = o52VarM1.i) == null) {
                            x83Var = null;
                        } else {
                            dj djVar3 = new dj(o52VarM1.a);
                            if (o52VarM1.j == null || o52VarM1.n == null) {
                                x83Var = null;
                            } else {
                                long j = o52VarM1.p & (-8589934589L);
                                int i5 = o52VarM1.f;
                                boolean z3 = o52VarM1.e;
                                int i6 = o52VarM1.d;
                                lq0 lq0Var = o52VarM1.c;
                                uj0 uj0Var = uj0.e;
                                x83Var = new x83(new w83(djVar3, q93VarE, uj0Var, i5, z3, i6, xb0Var, qa1Var, lq0Var, j), new sw1(new xp(djVar3, q93VarE, uj0Var, xb0Var, lq0Var), j, o52VarM1.f, o52VarM1.d), o52VarM1.l);
                            }
                        }
                        if (x83Var != null) {
                            list.add(x83Var);
                            x83Var2 = x83Var;
                        }
                        return Boolean.valueOf(x83Var2 != null);
                    case 1:
                        String str = ((dj) obj).f;
                        o93 o93Var2 = p93Var.C;
                        if (o93Var2 == null) {
                            o93 o93Var3 = new o93(p93Var.s, str);
                            o52 o52Var = new o52(str, p93Var.t, p93Var.u, p93Var.v, p93Var.w, p93Var.x, p93Var.y);
                            o52Var.d(p93Var.m1().i);
                            o93Var3.d = o52Var;
                            p93Var.C = o93Var3;
                        } else if (!o51.f(str, o93Var2.b)) {
                            o93Var2.b = str;
                            o52 o52Var2 = o93Var2.d;
                            if (o52Var2 != null) {
                                q93 q93Var = p93Var.t;
                                lq0 lq0Var2 = p93Var.u;
                                int i7 = p93Var.v;
                                boolean z4 = p93Var.w;
                                int i8 = p93Var.x;
                                int i9 = p93Var.y;
                                o52Var2.a = str;
                                o52Var2.b = q93Var;
                                o52Var2.c = lq0Var2;
                                o52Var2.d = i7;
                                o52Var2.e = z4;
                                o52Var2.f = i8;
                                o52Var2.g = i9;
                                o52Var2.s = (o52Var2.s << 2) | 2;
                                o52Var2.c();
                            }
                        }
                        ee0.C(p93Var);
                        ld0.z(p93Var);
                        ig0.z(p93Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        o93 o93Var4 = p93Var.C;
                        if (o93Var4 == null) {
                            z2 = false;
                        } else {
                            o93Var4.c = zBooleanValue;
                            ee0.C(p93Var);
                            ld0.z(p93Var);
                            ig0.z(p93Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        ss2Var.a(ds2.n, new z0(null, new ol2(this, 14)));
        qs2.a(ss2Var, r0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        o52 o52VarM1;
        o93 o93Var = this.C;
        if (o93Var == null) {
            o52VarM1 = m1();
        } else {
            if (!o93Var.c) {
                o93Var = null;
            }
            if (o93Var == null || (o52VarM1 = o93Var.d) == null) {
                o52VarM1 = m1();
            }
        }
        o52VarM1.d(ck1Var);
        return o52VarM1.a(i, ck1Var.getLayoutDirection());
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        o52 o52VarM1;
        if (this.r) {
            o93 o93Var = this.C;
            if (o93Var == null) {
                o52VarM1 = m1();
            } else {
                if (!o93Var.c) {
                    o93Var = null;
                }
                if (o93Var == null || (o52VarM1 = o93Var.d) == null) {
                    o52VarM1 = m1();
                }
            }
            le leVar = o52VarM1.j;
            if (leVar == null) {
                s21.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.A + ", textSubstitution=" + this.C + ')');
                fo.d();
                return;
            }
            vv vvVarI = jb1Var.e.f.i();
            boolean z = o52VarM1.k;
            if (z) {
                long j = o52VarM1.l;
                vvVarI.l();
                vvVarI.f(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                q93 q93Var = this.t;
                uy2 uy2Var = q93Var.a;
                p63 p63Var = uy2Var.m;
                if (p63Var == null) {
                    p63Var = p63.b;
                }
                p63 p63Var2 = p63Var;
                xt2 xt2Var = uy2Var.n;
                if (xt2Var == null) {
                    xt2Var = xt2.d;
                }
                xt2 xt2Var2 = xt2Var;
                kg0 kg0Var = uy2Var.p;
                if (kg0Var == null) {
                    kg0Var = en0.a;
                }
                kg0 kg0Var2 = kg0Var;
                st stVarB = uy2Var.a.b();
                if (stVarB != null) {
                    leVar.g(vvVarI, stVarB, q93Var.a.a.s(), xt2Var2, p63Var2, kg0Var2);
                } else {
                    long jB = hz.g;
                    if (jB == 16) {
                        jB = q93Var.b() != 16 ? q93Var.b() : hz.b;
                    }
                    leVar.f(vvVarI, jB, xt2Var2, p63Var2, kg0Var2);
                }
            } finally {
                if (z) {
                    vvVarI.i();
                }
            }
        }
    }

    public final o52 m1() {
        q93 q93Var = this.t;
        o52 o52Var = this.A;
        if (o52Var != null) {
            return o52Var;
        }
        o52 o52Var2 = new o52(this.s, q93Var, this.u, this.v, this.w, this.x, this.y);
        this.A = o52Var2;
        return o52Var2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        o52 o52VarM1;
        o93 o93Var = this.C;
        if (o93Var == null) {
            o52VarM1 = m1();
        } else {
            if (!o93Var.c) {
                o93Var = null;
            }
            if (o93Var == null || (o52VarM1 = o93Var.d) == null) {
                o52VarM1 = m1();
            }
        }
        o52VarM1.d(ck1Var);
        return gh0.p(o52VarM1.e(ck1Var.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0070, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        o52 o52VarM1;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            o93 o93Var = this.C;
            if (o93Var == null) {
                o52VarM1 = m1();
            } else {
                if (!o93Var.c) {
                    o93Var = null;
                }
                if (o93Var == null || (o52VarM1 = o93Var.d) == null) {
                    o52VarM1 = m1();
                }
            }
            o52VarM1.d(gr1Var);
            boolean zB = o52VarM1.b(j, gr1Var.getLayoutDirection());
            n52 n52Var = o52VarM1.n;
            if (n52Var != null) {
                n52Var.b();
            }
            le leVar = o52VarM1.j;
            leVar.getClass();
            t83 t83Var = leVar.d;
            long j2 = o52VarM1.l;
            if (zB) {
                xp1.L(this, 2).A1();
                HashMap map = this.z;
                if (map == null) {
                    map = new HashMap(2);
                    this.z = map;
                }
                map.put(p9.a, Integer.valueOf(Math.round(t83Var.d(0))));
                map.put(p9.b, Integer.valueOf(Math.round(t83Var.d(t83Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            h82 h82VarS = zq1Var.s(da0.t(i, i, i2, i2));
            HashMap map2 = this.z;
            map2.getClass();
            return gr1Var.H0(i, i2, map2, new gn0(h82VarS, 9));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        o52 o52VarM1;
        o93 o93Var = this.C;
        if (o93Var == null) {
            o52VarM1 = m1();
        } else {
            if (!o93Var.c) {
                o93Var = null;
            }
            if (o93Var == null || (o52VarM1 = o93Var.d) == null) {
                o52VarM1 = m1();
            }
        }
        o52VarM1.d(ck1Var);
        return gh0.p(o52VarM1.e(ck1Var.getLayoutDirection()).c());
    }
}
