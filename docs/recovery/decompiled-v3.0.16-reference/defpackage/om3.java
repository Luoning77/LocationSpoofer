package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class om3 extends cv1 implements ya1 {
    public vc0 s;
    public pu0 t;

    @Override // defpackage.ya1
    public final fr1 s(final gr1 gr1Var, zq1 zq1Var, long j) {
        final h82 h82VarS = zq1Var.s(m50.a(this.s != vc0.e ? 0 : l50.j(j), l50.h(j), this.s == vc0.f ? l50.i(j) : 0, l50.g(j)));
        final int iV = mh0.v(h82VarS.e, l50.j(j), l50.h(j));
        final int iV2 = mh0.v(h82VarS.f, l50.i(j), l50.g(j));
        return gr1Var.H0(iV, iV2, vj0.e, new lu0() { // from class: nm3
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                pu0 pu0Var = this.e.t;
                h82 h82Var = h82VarS;
                g82.A((g82) obj, h82Var, ((h41) pu0Var.invoke(new p41((((long) (iV - h82Var.e)) << 32) | (((long) (iV2 - h82Var.f)) & 4294967295L)), gr1Var.getLayoutDirection())).a);
                return mf3.a;
            }
        });
    }
}
