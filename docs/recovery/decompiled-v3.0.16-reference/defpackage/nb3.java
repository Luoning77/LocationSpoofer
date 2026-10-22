package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nb3 implements er1 {
    public final zn0 a;
    public final float b;

    public nb3(zn0 zn0Var, float f) {
        this.a = zn0Var;
        this.b = f;
    }

    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
        Integer numValueOf;
        int iN0 = g51Var.n0(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zq1) list.get(0)).w(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zq1) list.get(i2)).w(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iN0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
        int size = list.size();
        int iS0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iS0 += ((zq1) list.get(i2)).s0(i);
        }
        return iS0;
    }

    @Override // defpackage.er1
    public final fr1 g(final gr1 gr1Var, List list, final long j) {
        int iH;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zq1 zq1Var = (zq1) list.get(i2);
            if (o51.f(xp1.z(zq1Var), "navigationIcon")) {
                final h82 h82VarS = zq1Var.s(l50.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    zq1 zq1Var2 = (zq1) list.get(i3);
                    if (o51.f(xp1.z(zq1Var2), "actionIcons")) {
                        final h82 h82VarS2 = zq1Var2.s(l50.a(j, 0, 0, 0, 0, 14));
                        if (l50.h(j) == Integer.MAX_VALUE) {
                            iH = l50.h(j);
                        } else {
                            iH = (l50.h(j) - h82VarS.e) - h82VarS2.e;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i4 = iH;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            zq1 zq1Var3 = (zq1) list.get(i5);
                            if (o51.f(xp1.z(zq1Var3), "title")) {
                                final h82 h82VarS3 = zq1Var3.s(l50.a(j, 0, i4, 0, 0, 12));
                                dy0 dy0Var = p9.b;
                                int iX0 = h82VarS3.x0(dy0Var) != Integer.MIN_VALUE ? h82VarS3.x0(dy0Var) : 0;
                                float fInvoke = this.a.invoke();
                                int iP = Float.isNaN(fInvoke) ? 0 : xq1.P(fInvoke);
                                final int iMax = Math.max(gr1Var.n0(this.b), h82VarS3.f);
                                if (l50.g(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iP + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iX0;
                                return gr1Var.H0(l50.h(j), i, vj0.e, new lu0(i, h82VarS3, h82VarS2, j, gr1Var, this, i7, iMax) { // from class: mb3
                                    public final /* synthetic */ int f;
                                    public final /* synthetic */ h82 g;
                                    public final /* synthetic */ h82 h;
                                    public final /* synthetic */ long i;
                                    public final /* synthetic */ gr1 j;

                                    @Override // defpackage.lu0
                                    public final Object invoke(Object obj) {
                                        int iH2;
                                        g82 g82Var = (g82) obj;
                                        h82 h82Var = this.e;
                                        int i8 = h82Var.f;
                                        int i9 = this.f;
                                        g82.B(g82Var, h82Var, 0, (i9 - i8) / 2);
                                        int iMax2 = Math.max(this.j.n0(zj.c), h82Var.e);
                                        h82 h82Var2 = this.h;
                                        int i10 = h82Var2.e;
                                        h82 h82Var3 = this.g;
                                        int i11 = h82Var3.e;
                                        long j2 = this.i;
                                        int iRound = Math.round((1.0f - 1.0f) * ((l50.h(j2) - i11) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (h82Var3.e + iRound > l50.h(j2) - i10) {
                                                iH2 = (l50.h(j2) - i10) - (h82Var3.e + iRound);
                                            }
                                            g82.B(g82Var, h82Var3, iRound, (i9 - h82Var3.f) / 2);
                                            g82.B(g82Var, h82Var2, l50.h(j2) - h82Var2.e, (i9 - h82Var2.f) / 2);
                                            return mf3.a;
                                        }
                                        iH2 = iMax2 - iRound;
                                        iRound += iH2;
                                        g82.B(g82Var, h82Var3, iRound, (i9 - h82Var3.f) / 2);
                                        g82.B(g82Var, h82Var2, l50.h(j2) - h82Var2.e, (i9 - h82Var2.f) / 2);
                                        return mf3.a;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        xg1.b("Collection contains no element matching the predicate.");
                        fo.d();
                        return null;
                    }
                    i3++;
                    this = this;
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

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
        Integer numValueOf;
        int iN0 = g51Var.n0(this.b);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zq1) list.get(0)).u0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zq1) list.get(i2)).u0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iN0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.er1
    public final int j(g51 g51Var, List list, int i) {
        int size = list.size();
        int iJ0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iJ0 += ((zq1) list.get(i2)).j0(i);
        }
        return iJ0;
    }
}
