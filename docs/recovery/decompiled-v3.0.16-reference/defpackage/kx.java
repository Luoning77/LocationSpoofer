package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kx implements er1 {
    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
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
    public final fr1 g(gr1 gr1Var, List list, long j) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (o51.f(xp1.z((zq1) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        zq1 zq1Var = (zq1) obj;
        final h82 h82VarS = zq1Var != null ? zq1Var.s(l50.a(j, 0, 0, 0, 0, 10)) : null;
        int i2 = h82VarS != null ? h82VarS.e : 0;
        final int i3 = h82VarS != null ? h82VarS.f : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (o51.f(xp1.z((zq1) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        zq1 zq1Var2 = (zq1) obj2;
        final h82 h82VarS2 = zq1Var2 != null ? zq1Var2.s(l50.a(j, 0, 0, 0, 0, 10)) : null;
        int i5 = h82VarS2 != null ? h82VarS2.e : 0;
        final int i6 = h82VarS2 != null ? h82VarS2.f : 0;
        int size3 = list.size();
        int i7 = 0;
        while (i7 < size3) {
            zq1 zq1Var3 = (zq1) list.get(i7);
            if (o51.f(xp1.z(zq1Var3), "label")) {
                final h82 h82VarS3 = zq1Var3.s(m50.j(-(i2 + i5), 0, 2, j));
                int i8 = h82VarS3.e + i2 + i5;
                final int iMax = Math.max(i3, Math.max(h82VarS3.f, i6));
                final int i9 = i2;
                return gr1Var.H0(i8, iMax, vj0.e, new lu0() { // from class: jx
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj3) {
                        g82 g82Var = (g82) obj3;
                        h82 h82Var = h82VarS;
                        int i10 = iMax;
                        if (h82Var != null) {
                            g82.B(g82Var, h82Var, 0, Math.round(((i10 - i3) / 2.0f) * 1.0f));
                        }
                        h82 h82Var2 = h82VarS3;
                        int i11 = i9;
                        g82.B(g82Var, h82Var2, i11, 0);
                        h82 h82Var3 = h82VarS2;
                        if (h82Var3 != null) {
                            g82.B(g82Var, h82Var3, i11 + h82Var2.e, Math.round(((i10 - i6) / 2.0f) * 1.0f));
                        }
                        return mf3.a;
                    }
                });
            }
            i7++;
            h82VarS = h82VarS;
            i2 = i2;
        }
        xg1.b("Collection contains no element matching the predicate.");
        fo.d();
        return null;
    }

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
        Integer numValueOf;
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
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
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
