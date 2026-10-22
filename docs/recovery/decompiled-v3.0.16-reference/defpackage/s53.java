package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s53 extends cv1 implements ya1, hg0, hs2 {
    public List A;
    public lu0 B;
    public hq2 C;
    public lu0 D;
    public Map E;
    public uw1 F;
    public q53 G;
    public r53 H;
    public dj s;
    public q93 t;
    public lq0 u;
    public lu0 v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public s53(dj djVar, q93 q93Var, lq0 lq0Var, lu0 lu0Var, int i, boolean z, int i2, int i3, List list, lu0 lu0Var2, hq2 hq2Var, lu0 lu0Var3) {
        this.s = djVar;
        this.t = q93Var;
        this.u = lq0Var;
        this.v = lu0Var;
        this.w = i;
        this.x = z;
        this.y = i2;
        this.z = i3;
        this.A = list;
        this.B = lu0Var2;
        this.C = hq2Var;
        this.D = lu0Var3;
    }

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        return o1(ck1Var).a(i, ck1Var.getLayoutDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [lu0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [q53] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        q53 q53Var = this.G;
        ?? r0 = q53Var;
        if (q53Var == null) {
            final int i = 0;
            ?? r1 = new lu0(this) { // from class: q53
                public final /* synthetic */ s53 f;

                {
                    this.f = this;
                }

                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    x83 x83Var;
                    boolean z;
                    int i2 = i;
                    s53 s53Var = this.f;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            x83 x83Var2 = s53Var.n1().n;
                            if (x83Var2 != null) {
                                w83 w83Var = x83Var2.a;
                                x83Var = new x83(new w83(w83Var.a, q93.e(s53Var.t, hz.g, 0L, null, null, 0L, null, 0, 0L, 16777214), w83Var.c, w83Var.d, w83Var.e, w83Var.f, w83Var.g, w83Var.h, w83Var.i, w83Var.j), x83Var2.b, x83Var2.c);
                                list.add(x83Var);
                            } else {
                                x83Var = null;
                            }
                            return Boolean.valueOf(x83Var != null);
                        case 1:
                            dj djVar = (dj) obj;
                            r53 r53Var = s53Var.H;
                            uj0 uj0Var = uj0.e;
                            if (r53Var == null) {
                                r53 r53Var2 = new r53(s53Var.s, djVar);
                                uw1 uw1Var = new uw1(djVar, s53Var.t, s53Var.u, s53Var.w, s53Var.x, s53Var.y, s53Var.z, uj0Var);
                                uw1Var.d(s53Var.n1().j);
                                r53Var2.d = uw1Var;
                                s53Var.H = r53Var2;
                            } else if (!o51.f(djVar, r53Var.b)) {
                                r53Var.b = djVar;
                                uw1 uw1Var2 = r53Var.d;
                                if (uw1Var2 != null) {
                                    uw1Var2.g(djVar, s53Var.t, s53Var.u, s53Var.w, s53Var.x, s53Var.y, s53Var.z, uj0Var);
                                }
                            }
                            ee0.C(s53Var);
                            ld0.z(s53Var);
                            ig0.z(s53Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            r53 r53Var3 = s53Var.H;
                            if (r53Var3 == null) {
                                z = false;
                            } else {
                                lu0 lu0Var = s53Var.D;
                                if (lu0Var != null) {
                                    lu0Var.invoke(r53Var3);
                                }
                                r53 r53Var4 = s53Var.H;
                                if (r53Var4 != null) {
                                    r53Var4.c = zBooleanValue;
                                }
                                ee0.C(s53Var);
                                ld0.z(s53Var);
                                ig0.z(s53Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.G = r1;
            r0 = r1;
        }
        dj djVar = this.s;
        x81[] x81VarArr = qs2.a;
        ss2Var.a(os2.C, am1.F(djVar));
        r53 r53Var = this.H;
        if (r53Var != null) {
            dj djVar2 = r53Var.b;
            rs2 rs2Var = os2.D;
            x81[] x81VarArr2 = qs2.a;
            x81 x81Var = x81VarArr2[16];
            ss2Var.a(rs2Var, djVar2);
            boolean z = r53Var.c;
            rs2 rs2Var2 = os2.E;
            x81 x81Var2 = x81VarArr2[17];
            ss2Var.a(rs2Var2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        ss2Var.a(ds2.l, new z0(null, new lu0(this) { // from class: q53
            public final /* synthetic */ s53 f;

            {
                this.f = this;
            }

            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                x83 x83Var;
                boolean z2;
                int i3 = i2;
                s53 s53Var = this.f;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        x83 x83Var2 = s53Var.n1().n;
                        if (x83Var2 != null) {
                            w83 w83Var = x83Var2.a;
                            x83Var = new x83(new w83(w83Var.a, q93.e(s53Var.t, hz.g, 0L, null, null, 0L, null, 0, 0L, 16777214), w83Var.c, w83Var.d, w83Var.e, w83Var.f, w83Var.g, w83Var.h, w83Var.i, w83Var.j), x83Var2.b, x83Var2.c);
                            list.add(x83Var);
                        } else {
                            x83Var = null;
                        }
                        return Boolean.valueOf(x83Var != null);
                    case 1:
                        dj djVar3 = (dj) obj;
                        r53 r53Var2 = s53Var.H;
                        uj0 uj0Var = uj0.e;
                        if (r53Var2 == null) {
                            r53 r53Var3 = new r53(s53Var.s, djVar3);
                            uw1 uw1Var = new uw1(djVar3, s53Var.t, s53Var.u, s53Var.w, s53Var.x, s53Var.y, s53Var.z, uj0Var);
                            uw1Var.d(s53Var.n1().j);
                            r53Var3.d = uw1Var;
                            s53Var.H = r53Var3;
                        } else if (!o51.f(djVar3, r53Var2.b)) {
                            r53Var2.b = djVar3;
                            uw1 uw1Var2 = r53Var2.d;
                            if (uw1Var2 != null) {
                                uw1Var2.g(djVar3, s53Var.t, s53Var.u, s53Var.w, s53Var.x, s53Var.y, s53Var.z, uj0Var);
                            }
                        }
                        ee0.C(s53Var);
                        ld0.z(s53Var);
                        ig0.z(s53Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        r53 r53Var4 = s53Var.H;
                        if (r53Var4 == null) {
                            z2 = false;
                        } else {
                            lu0 lu0Var = s53Var.D;
                            if (lu0Var != null) {
                                lu0Var.invoke(r53Var4);
                            }
                            r53 r53Var5 = s53Var.H;
                            if (r53Var5 != null) {
                                r53Var5.c = zBooleanValue;
                            }
                            ee0.C(s53Var);
                            ld0.z(s53Var);
                            ig0.z(s53Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        ss2Var.a(ds2.m, new z0(null, new lu0(this) { // from class: q53
            public final /* synthetic */ s53 f;

            {
                this.f = this;
            }

            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                x83 x83Var;
                boolean z2;
                int i4 = i3;
                s53 s53Var = this.f;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        x83 x83Var2 = s53Var.n1().n;
                        if (x83Var2 != null) {
                            w83 w83Var = x83Var2.a;
                            x83Var = new x83(new w83(w83Var.a, q93.e(s53Var.t, hz.g, 0L, null, null, 0L, null, 0, 0L, 16777214), w83Var.c, w83Var.d, w83Var.e, w83Var.f, w83Var.g, w83Var.h, w83Var.i, w83Var.j), x83Var2.b, x83Var2.c);
                            list.add(x83Var);
                        } else {
                            x83Var = null;
                        }
                        return Boolean.valueOf(x83Var != null);
                    case 1:
                        dj djVar3 = (dj) obj;
                        r53 r53Var2 = s53Var.H;
                        uj0 uj0Var = uj0.e;
                        if (r53Var2 == null) {
                            r53 r53Var3 = new r53(s53Var.s, djVar3);
                            uw1 uw1Var = new uw1(djVar3, s53Var.t, s53Var.u, s53Var.w, s53Var.x, s53Var.y, s53Var.z, uj0Var);
                            uw1Var.d(s53Var.n1().j);
                            r53Var3.d = uw1Var;
                            s53Var.H = r53Var3;
                        } else if (!o51.f(djVar3, r53Var2.b)) {
                            r53Var2.b = djVar3;
                            uw1 uw1Var2 = r53Var2.d;
                            if (uw1Var2 != null) {
                                uw1Var2.g(djVar3, s53Var.t, s53Var.u, s53Var.w, s53Var.x, s53Var.y, s53Var.z, uj0Var);
                            }
                        }
                        ee0.C(s53Var);
                        ld0.z(s53Var);
                        ig0.z(s53Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        r53 r53Var4 = s53Var.H;
                        if (r53Var4 == null) {
                            z2 = false;
                        } else {
                            lu0 lu0Var = s53Var.D;
                            if (lu0Var != null) {
                                lu0Var.invoke(r53Var4);
                            }
                            r53 r53Var5 = s53Var.H;
                            if (r53Var5 != null) {
                                r53Var5.c = zBooleanValue;
                            }
                            ee0.C(s53Var);
                            ld0.z(s53Var);
                            ig0.z(s53Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        ss2Var.a(ds2.n, new z0(null, new ol2(this, 10)));
        qs2.a(ss2Var, r0);
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        return o1(ck1Var).a(i, ck1Var.getLayoutDirection());
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // defpackage.hg0
    public final void j0(defpackage.jb1 r27) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s53.j0(jb1):void");
    }

    public final void m1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            n1().g(this.s, this.t, this.u, this.w, this.x, this.y, this.z, this.A);
        }
        if (this.r) {
            if (z2 || (z && this.G != null)) {
                ee0.C(this);
            }
            if (z2 || z3 || z4) {
                ld0.z(this);
                ig0.z(this);
            }
            if (z) {
                ig0.z(this);
            }
        }
    }

    public final uw1 n1() {
        uw1 uw1Var = this.F;
        if (uw1Var != null) {
            return uw1Var;
        }
        uw1 uw1Var2 = new uw1(this.s, this.t, this.u, this.w, this.x, this.y, this.z, this.A);
        this.F = uw1Var2;
        return uw1Var2;
    }

    public final uw1 o1(xb0 xb0Var) {
        uw1 uw1Var;
        r53 r53Var = this.H;
        if (r53Var != null && r53Var.c && (uw1Var = r53Var.d) != null) {
            uw1Var.d(xb0Var);
            return uw1Var;
        }
        uw1 uw1VarN1 = n1();
        uw1VarN1.d(xb0Var);
        return uw1VarN1;
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        return gh0.p(o1(ck1Var).e(ck1Var.getLayoutDirection()).a());
    }

    public final boolean p1(lu0 lu0Var, lu0 lu0Var2, hq2 hq2Var, lu0 lu0Var3) {
        boolean z;
        if (this.v != lu0Var) {
            this.v = lu0Var;
            z = true;
        } else {
            z = false;
        }
        if (this.B != lu0Var2) {
            this.B = lu0Var2;
            z = true;
        }
        if (!o51.f(this.C, hq2Var)) {
            this.C = hq2Var;
            z = true;
        }
        if (this.D == lu0Var3) {
            return z;
        }
        this.D = lu0Var3;
        return true;
    }

    public final boolean q1(q93 q93Var, List list, int i, int i2, boolean z, lq0 lq0Var, int i3) {
        boolean z2 = !this.t.c(q93Var);
        this.t = q93Var;
        if (!o51.f(this.A, list)) {
            this.A = list;
            z2 = true;
        }
        if (this.z != i) {
            this.z = i;
            z2 = true;
        }
        if (this.y != i2) {
            this.y = i2;
            z2 = true;
        }
        if (this.x != z) {
            this.x = z;
            z2 = true;
        }
        if (!o51.f(this.u, lq0Var)) {
            this.u = lq0Var;
            z2 = true;
        }
        if (this.w == i3) {
            return z2;
        }
        this.w = i3;
        return true;
    }

    public final boolean r1(dj djVar) {
        boolean zF = o51.f(this.s.f, djVar.f);
        boolean z = (zF && o51.f(this.s.e, djVar.e)) ? false : true;
        if (z) {
            this.s = djVar;
        }
        if (!zF) {
            this.H = null;
        }
        return z;
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            uw1 uw1VarO1 = o1(gr1Var);
            boolean zC = uw1VarO1.c(j, gr1Var.getLayoutDirection());
            x83 x83Var = uw1VarO1.n;
            if (x83Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + uw1VarO1);
            }
            long j2 = x83Var.c;
            x83Var.b.a.b();
            if (zC) {
                xp1.L(this, 2).A1();
                lu0 lu0Var = this.v;
                if (lu0Var != null) {
                    lu0Var.invoke(x83Var);
                }
                hq2 hq2Var = this.C;
                if (hq2Var != null) {
                    hq2Var.d(x83Var);
                }
                Map linkedHashMap = this.E;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(p9.a, Integer.valueOf(Math.round(x83Var.d)));
                linkedHashMap.put(p9.b, Integer.valueOf(Math.round(x83Var.e)));
                this.E = linkedHashMap;
            }
            lu0 lu0Var2 = this.B;
            if (lu0Var2 != null) {
                lu0Var2.invoke(x83Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            h82 h82VarS = zq1Var.s(da0.t(i, i, i2, i2));
            Map map = this.E;
            map.getClass();
            fr1 fr1VarH0 = gr1Var.H0(i, i2, map, new gn0(h82VarS, 6));
            Trace.endSection();
            return fr1VarH0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        return gh0.p(o1(ck1Var).e(ck1Var.getLayoutDirection()).c());
    }
}
