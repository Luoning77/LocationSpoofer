package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fi implements er1 {
    public final ni a;
    public boolean b;

    public fi(ni niVar) {
        this.a = niVar;
    }

    @Override // defpackage.er1
    public final int b(g51 g51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = ((zq1) list.get(0)).w(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iW2 = ((zq1) list.get(i2)).w(i);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iW;
    }

    @Override // defpackage.er1
    public final int d(g51 g51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iS0 = ((zq1) list.get(0)).s0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iS1 = ((zq1) list.get(i2)).s0(i);
                if (iS1 > iS0) {
                    iS0 = iS1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iS0;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            h82 h82VarS = ((zq1) list.get(i)).s(j);
            iMax = Math.max(iMax, h82VarS.e);
            iMax2 = Math.max(iMax2, h82VarS.f);
            arrayList.add(h82VarS);
        }
        boolean zJ = gr1Var.J();
        ni niVar = this.a;
        if (zJ) {
            this.b = true;
            niVar.b.setValue(new p41((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            niVar.b.setValue(new p41((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return gr1Var.H0(iMax, iMax2, vj0.e, new kc(2, arrayList));
    }

    @Override // defpackage.er1
    public final int h(g51 g51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU0 = ((zq1) list.get(0)).u0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iU1 = ((zq1) list.get(i2)).u0(i);
                if (iU1 > iU0) {
                    iU0 = iU1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iU0;
    }

    @Override // defpackage.er1
    public final int j(g51 g51Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iJ0 = ((zq1) list.get(0)).j0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iJ1 = ((zq1) list.get(i2)).j0(i);
                if (iJ1 > iJ0) {
                    iJ0 = iJ1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iJ0;
    }
}
