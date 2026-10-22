package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kg1 implements er1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kg1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        int i;
        Float fValueOf;
        int iMax;
        int iMax2;
        int i2;
        int i3;
        int iP;
        int i4 = this.a;
        vj0 vj0Var = vj0.e;
        switch (i4) {
            case 0:
                return gr1Var.H0(l50.h(j), l50.g(j), vj0Var, new j(27, list, this));
            default:
                ex2 ex2Var = (ex2) this.b;
                int i5 = ex2Var.a;
                float[] fArr = ex2Var.g;
                x32 x32Var = ex2Var.m;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    zq1 zq1Var = (zq1) list.get(i6);
                    if (xp1.z(zq1Var) == nw2.e) {
                        final h82 h82VarS = zq1Var.s(j);
                        int size2 = list.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            zq1 zq1Var2 = (zq1) list.get(i7);
                            if (xp1.z(zq1Var2) == nw2.f) {
                                int i8 = 1;
                                x32 x32Var2 = x32.e;
                                h82 h82VarS2 = x32Var == x32Var2 ? zq1Var2.s(l50.a(m50.j(0, -h82VarS.f, 1, j), 0, 0, 0, 0, 14)) : zq1Var2.s(l50.a(m50.j(-h82VarS.e, 0, 2, j), 0, 0, 0, 0, 11));
                                final ue2 ue2Var = new ue2();
                                float fC = ex2Var.c();
                                fArr.getClass();
                                if (fArr.length == 0) {
                                    fValueOf = null;
                                    i = 0;
                                } else {
                                    i = 0;
                                    fValueOf = Float.valueOf(fArr[0]);
                                }
                                if (!o51.e(fC, fValueOf) && !o51.e(fC, yo.B0(fArr))) {
                                    i8 = i;
                                }
                                int iX0 = h82VarS2.x0(dx2.f);
                                if (iX0 != Integer.MIN_VALUE) {
                                    i = iX0;
                                }
                                if (x32Var == x32Var2) {
                                    iMax = Math.max(h82VarS2.e, h82VarS.e);
                                    int i9 = h82VarS.f;
                                    int i10 = h82VarS2.f;
                                    iMax2 = i9 + i10;
                                    i2 = (iMax - h82VarS2.e) / 2;
                                    i3 = i9 / 2;
                                    iP = (iMax - h82VarS.e) / 2;
                                    ue2Var.e = (i5 <= 0 || i8 != 0) ? xq1.P(i10 * fC) : xq1.P((i10 - (i * 2)) * fC) + i;
                                } else {
                                    iMax = h82VarS.e + h82VarS2.e;
                                    iMax2 = Math.max(h82VarS2.f, h82VarS.f);
                                    i2 = h82VarS.e / 2;
                                    i3 = (iMax2 - h82VarS2.f) / 2;
                                    iP = (i5 <= 0 || i8 != 0) ? xq1.P(h82VarS2.e * fC) : xq1.P((h82VarS2.e - (i * 2)) * fC) + i;
                                    ue2Var.e = (iMax2 - h82VarS.f) / 2;
                                }
                                final int i11 = i3;
                                final int i12 = i2;
                                final int i13 = iP;
                                ex2Var.h.h(iMax);
                                ex2Var.i.h(iMax2);
                                final h82 h82Var = h82VarS2;
                                return gr1Var.H0(iMax, iMax2, vj0Var, new lu0() { // from class: zw2
                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj) {
                                        g82 g82Var = (g82) obj;
                                        g82.B(g82Var, h82Var, i12, i11);
                                        g82.B(g82Var, h82VarS, i13, ue2Var.e);
                                        return mf3.a;
                                    }
                                });
                            }
                        }
                        xg1.b("Collection contains no element matching the predicate.");
                        fo.d();
                        return null;
                    }
                }
                xg1.b("Collection contains no element matching the predicate.");
                fo.d();
                return null;
        }
    }
}
