package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class up2 extends lb0 implements ya1, hg0, aw0 {
    public hq2 u;
    public final s53 v;

    public up2(dj djVar, q93 q93Var, lq0 lq0Var, lu0 lu0Var, int i, boolean z, int i2, int i3, List list, lu0 lu0Var2, hq2 hq2Var) {
        this.u = hq2Var;
        s53 s53Var = new s53(djVar, q93Var, lq0Var, lu0Var, i, z, i2, i3, list, lu0Var2, hq2Var, null);
        m1(s53Var);
        this.v = s53Var;
        if (this.u == null) {
            throw p91.h("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.v.F(ck1Var, zq1Var, i);
    }

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        hq2 hq2Var = this.u;
        if (hq2Var != null) {
            hq2Var.h = d31.o(hq2Var.h, xz1Var, null, 2);
            er2 er2Var = hq2Var.f;
            long j = hq2Var.e;
            er2Var.a = false;
            dq2 dq2Var = er2Var.e;
            if (dq2Var != null) {
                dq2Var.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.v.W(ck1Var, zq1Var, i);
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) throws Throwable {
        this.v.j0(jb1Var);
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.v.p0(ck1Var, zq1Var, i);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        return this.v.s(gr1Var, zq1Var, j);
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.v.x(ck1Var, zq1Var, i);
    }
}
