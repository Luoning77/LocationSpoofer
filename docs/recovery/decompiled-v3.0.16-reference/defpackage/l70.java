package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l70 implements er1 {
    public final /* synthetic */ me1 a;
    public final /* synthetic */ lu0 b;
    public final /* synthetic */ f83 c;
    public final /* synthetic */ e12 d;
    public final /* synthetic */ xb0 e;
    public final /* synthetic */ int f;

    public l70(me1 me1Var, lu0 lu0Var, f83 f83Var, e12 e12Var, xb0 xb0Var, int i) {
        this.a = me1Var;
        this.b = lu0Var;
        this.c = f83Var;
        this.d = e12Var;
        this.e = xb0Var;
        this.f = i;
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
        me1 me1Var = this.a;
        me1Var.a.a(g51Var.getLayoutDirection());
        xp xpVar = (xp) me1Var.a.g;
        if (xpVar != null) {
            return gh0.p(xpVar.c());
        }
        fo.n("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [pa1] */
    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        x83 x83Var;
        fr1 fr1Var;
        x83 x83Var2;
        x83 x83Var3;
        l70 l70Var;
        me1 me1Var;
        int i;
        int iP;
        ?? r14;
        me1 me1Var2 = this.a;
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            y83 y83VarD = me1Var2.d();
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            x83 x83Var4 = y83VarD != null ? y83VarD.a : null;
            gc0 gc0Var = me1Var2.a;
            qa1 layoutDirection = gr1Var.getLayoutDirection();
            boolean z = gc0Var.a;
            int iV = Integer.MAX_VALUE;
            if (x83Var4 != null) {
                sw1 sw1Var = x83Var4.b;
                w83 w83Var = x83Var4.a;
                dj djVar = (dj) gc0Var.b;
                q93 q93Var = (q93) gc0Var.c;
                List list2 = (List) gc0Var.f;
                xb0 xb0Var = (xb0) gc0Var.d;
                fr1Var = null;
                lq0 lq0Var = (lq0) gc0Var.e;
                if (!sw1Var.a.b()) {
                    dj djVar2 = w83Var.a;
                    x83 x83Var5 = x83Var4;
                    long j2 = w83Var.j;
                    if (o51.f(djVar2, djVar) && w83Var.b.c(q93Var) && o51.f(w83Var.c, list2) && w83Var.d == Integer.MAX_VALUE && w83Var.e == z && w83Var.f == 1 && o51.f(w83Var.g, xb0Var) && w83Var.h == layoutDirection && o51.f(w83Var.i, lq0Var) && l50.j(j) == l50.j(j2) && (!z || (l50.h(j) == l50.h(j2) && l50.g(j) == l50.g(j2)))) {
                        x83Var3 = new x83(new w83(w83Var.a, (q93) gc0Var.c, w83Var.c, w83Var.d, w83Var.e, w83Var.f, w83Var.g, w83Var.h, w83Var.i, j), sw1Var, m50.d(j, (((long) gh0.p(sw1Var.e)) & 4294967295L) | (((long) gh0.p(sw1Var.d)) << 32)));
                        x83Var2 = x83Var5;
                    } else {
                        x83Var = x83Var5;
                    }
                    long j3 = x83Var3.c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (o51.f(x83Var2, x83Var3)) {
                        l70Var = this;
                        me1Var = me1Var2;
                        i = 0;
                    } else {
                        if (y83VarD != 0) {
                            r14 = y83VarD.c;
                        } else {
                            r14 = fr1Var;
                        }
                        me1Var = me1Var2;
                        me1Var.i.setValue(new y83(x83Var3, r14));
                        i = 0;
                        me1Var.p = false;
                        l70Var = this;
                        l70Var.b.invoke(x83Var3);
                        k22.E(me1Var, l70Var.c, l70Var.d);
                    }
                    if (l70Var.f == 1) {
                        iP = gh0.p(x83Var3.b.b(i));
                    } else {
                        iP = i;
                    }
                    me1Var.g.setValue(new td0(l70Var.e.U0(iP)));
                    return gr1Var.H0(iIntValue, iIntValue2, jq1.N(new i52(p9.a, Integer.valueOf(Math.round(x83Var3.d))), new i52(p9.b, Integer.valueOf(Math.round(x83Var3.e)))), new my(6));
                }
                x83Var = x83Var4;
            } else {
                x83Var = x83Var4;
                fr1Var = null;
            }
            gc0Var.a(layoutDirection);
            int iJ = l50.j(j);
            if (z && l50.d(j)) {
                iV = l50.h(j);
            }
            if (iJ != iV) {
                xp xpVar = (xp) gc0Var.g;
                if (xpVar == null) {
                    fo.n("layoutIntrinsics must be called first");
                    return fr1Var;
                }
                iV = mh0.v(gh0.p(xpVar.c()), iJ, iV);
            }
            xp xpVar2 = (xp) gc0Var.g;
            if (xpVar2 == null) {
                fo.n("layoutIntrinsics must be called first");
                return fr1Var;
            }
            sw1 sw1Var2 = new sw1(xpVar2, da0.t(0, iV, 0, l50.g(j)), Integer.MAX_VALUE, 1);
            x83Var2 = x83Var;
            x83Var3 = new x83(new w83((dj) gc0Var.b, (q93) gc0Var.c, (List) gc0Var.f, Integer.MAX_VALUE, gc0Var.a, 1, (xb0) gc0Var.d, layoutDirection, (lq0) gc0Var.e, j), sw1Var2, m50.d(j, (((long) gh0.p(sw1Var2.d)) << 32) | (((long) gh0.p(sw1Var2.e)) & 4294967295L)));
            long j4 = x83Var3.c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (o51.f(x83Var2, x83Var3)) {
                if (y83VarD != 0) {
                    r14 = y83VarD.c;
                } else {
                    r14 = fr1Var;
                }
                me1Var = me1Var2;
                me1Var.i.setValue(new y83(x83Var3, r14));
                i = 0;
                me1Var.p = false;
                l70Var = this;
                l70Var.b.invoke(x83Var3);
                k22.E(me1Var, l70Var.c, l70Var.d);
            } else {
                l70Var = this;
                me1Var = me1Var2;
                i = 0;
            }
            if (l70Var.f == 1) {
                iP = gh0.p(x83Var3.b.b(i));
            } else {
                iP = i;
            }
            me1Var.g.setValue(new td0(l70Var.e.U0(iP)));
            return gr1Var.H0(iIntValue3, iIntValue4, jq1.N(new i52(p9.a, Integer.valueOf(Math.round(x83Var3.d))), new i52(p9.b, Integer.valueOf(Math.round(x83Var3.e)))), new my(6));
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }
}
