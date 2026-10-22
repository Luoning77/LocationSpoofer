package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xh implements er1 {
    public final ei a;

    public xh(ei eiVar) {
        this.a = eiVar;
    }

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
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zq1) list.get(0)).s0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zq1) list.get(i2)).s0(i));
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
    public final fr1 g(gr1 gr1Var, List list, long j) {
        h82 h82Var;
        int i;
        h82 h82Var2;
        int i2;
        int i3;
        int size = list.size();
        h82[] h82VarArr = new h82[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            h82Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            zq1 zq1Var = (zq1) list.get(i4);
            Object objA = zq1Var.A();
            zh zhVar = objA instanceof zh ? (zh) objA : null;
            if (zhVar != null && ((Boolean) zhVar.a.getValue()).booleanValue()) {
                h82 h82VarS = zq1Var.s(j);
                long j3 = (((long) h82VarS.f) & 4294967295L) | (((long) h82VarS.e) << 32);
                h82VarArr[i4] = h82VarS;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            zq1 zq1Var2 = (zq1) list.get(i5);
            if (h82VarArr[i5] == null) {
                h82VarArr[i5] = zq1Var2.s(j);
            }
        }
        if (gr1Var.J()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                h82Var2 = h82VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = h82Var2 != null ? h82Var2.e : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            h82 h82Var3 = h82VarArr[i8];
                            int i9 = h82Var3 != null ? h82Var3.e : 0;
                            if (i7 < i9) {
                                h82Var2 = h82Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                h82Var2 = null;
            }
            i2 = h82Var2 != null ? h82Var2.e : 0;
        }
        if (gr1Var.J()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                h82Var = h82VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = h82Var != null ? h82Var.f : 0;
                    if (1 <= i10) {
                        while (true) {
                            h82 h82Var4 = h82VarArr[i];
                            int i12 = h82Var4 != null ? h82Var4.f : 0;
                            if (i11 < i12) {
                                h82Var = h82Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = h82Var != null ? h82Var.f : 0;
        }
        if (!gr1Var.J()) {
            this.a.b.setValue(new p41((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return gr1Var.H0(i2, i3, vj0.e, new wh(h82VarArr, this, i2, i3));
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
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zq1) list.get(0)).j0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zq1) list.get(i2)).j0(i));
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
}
