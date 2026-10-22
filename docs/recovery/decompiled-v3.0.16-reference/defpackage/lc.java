package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lc implements er1 {
    public static final lc b = new lc(0);
    public static final lc c = new lc(1);
    public static final lc d = new lc(2);
    public static final lc e = new lc(3);
    public static final lc f = new lc(4);
    public static final my g = new my(15);
    public static final lc h = new lc(5);
    public static final lc i = new lc(6);
    public static final lc j = new lc(7);
    public final /* synthetic */ int a;

    public /* synthetic */ lc(int i2) {
        this.a = i2;
    }

    public static final void a(ArrayList arrayList, ue2 ue2Var, gr1 gr1Var, ArrayList arrayList2, ArrayList arrayList3, ue2 ue2Var2, ArrayList arrayList4, ue2 ue2Var3, ue2 ue2Var4) {
        if (!arrayList.isEmpty()) {
            ue2Var.e = gr1Var.n0(12.0f) + ue2Var.e;
        }
        arrayList.add(0, zy.J0(arrayList2));
        arrayList3.add(Integer.valueOf(ue2Var2.e));
        arrayList4.add(Integer.valueOf(ue2Var.e));
        ue2Var.e += ue2Var2.e;
        ue2Var3.e = Math.max(ue2Var3.e, ue2Var4.e);
        arrayList2.clear();
        ue2Var4.e = 0;
        ue2Var2.e = 0;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j2) {
        ArrayList arrayList;
        int i2 = this.a;
        int i3 = 19;
        final int i4 = 1;
        final int i5 = 0;
        vj0 vj0Var = vj0.e;
        switch (i2) {
            case 0:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    h82 h82VarS = ((zq1) list.get(i7)).s(j2);
                    iJ = Math.max(iJ, h82VarS.e);
                    i6 = Math.max(i6, h82VarS.f);
                    arrayList2.add(h82VarS);
                }
                if (list.isEmpty()) {
                    iJ = l50.j(j2);
                    i6 = l50.i(j2);
                }
                return gr1Var.H0(iJ, i6, vj0Var, new kc(0, arrayList2));
            case 1:
                int iMax = 0;
                int size2 = list.size();
                if (size2 == 0) {
                    return gr1Var.H0(0, 0, vj0Var, wa.o);
                }
                if (size2 == 1) {
                    h82 h82VarS2 = ((zq1) list.get(0)).s(j2);
                    return gr1Var.H0(h82VarS2.e, h82VarS2.f, vj0Var, new oa(h82VarS2, 1));
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                for (int i8 = 0; i8 < size3; i8++) {
                    h82 h82VarS3 = ((zq1) list.get(i8)).s(j2);
                    iMax = Math.max(iMax, h82VarS3.e);
                    iMax2 = Math.max(iMax2, h82VarS3.f);
                    arrayList3.add(h82VarS3);
                }
                return gr1Var.H0(iMax, iMax2, vj0Var, new kc(1, arrayList3));
            case 2:
                final ArrayList arrayList4 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    arrayList4.add(((zq1) list.get(i9)).s(j2));
                }
                return gr1Var.H0(l50.h(j2), l50.g(j2), vj0Var, new lu0() { // from class: gj
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        int i10 = i5;
                        mf3 mf3Var = mf3.a;
                        ArrayList arrayList5 = arrayList4;
                        g82 g82Var = (g82) obj;
                        switch (i10) {
                            case 0:
                                int size5 = arrayList5.size();
                                for (int i11 = 0; i11 < size5; i11++) {
                                    g82.B(g82Var, (h82) arrayList5.get(i11), 0, 0);
                                }
                                break;
                            default:
                                int size6 = arrayList5.size();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    g82.z(g82Var, (h82) arrayList5.get(i12), 0, 0);
                                }
                                break;
                        }
                        return mf3Var;
                    }
                });
            case 3:
                return gr1Var.H0(l50.j(j2), l50.i(j2), vj0Var, new v1(19));
            case 4:
                return gr1Var.H0(l50.h(j2), l50.g(j2), vj0Var, g);
            case Logger.WARN /* 5 */:
                return gr1Var.H0(l50.j(j2), l50.i(j2), vj0Var, new zs0(7));
            case Logger.ERROR /* 6 */:
                int iMax3 = 0;
                final ArrayList arrayList5 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax4 = 0;
                while (i5 < size5) {
                    h82 h82VarS4 = ((zq1) list.get(i5)).s(j2);
                    iMax3 = Math.max(iMax3, h82VarS4.e);
                    iMax4 = Math.max(iMax4, h82VarS4.f);
                    arrayList5.add(h82VarS4);
                    i5++;
                }
                return gr1Var.H0(iMax3, iMax4, vj0Var, new lu0() { // from class: gj
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        int i10 = i4;
                        mf3 mf3Var = mf3.a;
                        ArrayList arrayList6 = arrayList5;
                        g82 g82Var = (g82) obj;
                        switch (i10) {
                            case 0:
                                int size6 = arrayList6.size();
                                for (int i11 = 0; i11 < size6; i11++) {
                                    g82.B(g82Var, (h82) arrayList6.get(i11), 0, 0);
                                }
                                break;
                            default:
                                int size7 = arrayList6.size();
                                for (int i12 = 0; i12 < size7; i12++) {
                                    g82.z(g82Var, (h82) arrayList6.get(i12), 0, 0);
                                }
                                break;
                        }
                        return mf3Var;
                    }
                });
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return gr1Var.H0(l50.f(j2) ? l50.h(j2) : 0, l50.e(j2) ? l50.g(j2) : 0, vj0Var, new ym2(i3));
            default:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ue2 ue2Var = new ue2();
                ue2 ue2Var2 = new ue2();
                ArrayList arrayList9 = new ArrayList();
                ue2 ue2Var3 = new ue2();
                int i10 = 0;
                ue2 ue2Var4 = new ue2();
                int size6 = list.size();
                while (i10 < size6) {
                    h82 h82VarS5 = ((zq1) list.get(i10)).s(j2);
                    int i11 = i10;
                    if (!arrayList9.isEmpty()) {
                        ArrayList arrayList10 = arrayList6;
                        if (gr1Var.n0(8.0f) + ue2Var3.e + h82VarS5.e <= l50.h(j2)) {
                            arrayList6 = arrayList10;
                        } else {
                            arrayList6 = arrayList10;
                            a(arrayList6, ue2Var2, gr1Var, arrayList9, arrayList7, ue2Var4, arrayList8, ue2Var, ue2Var3);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        ue2Var3.e = gr1Var.n0(8.0f) + ue2Var3.e;
                    }
                    arrayList9.add(h82VarS5);
                    ue2Var3.e += h82VarS5.e;
                    ue2Var4.e = Math.max(ue2Var4.e, h82VarS5.f);
                    i10 = i11 + 1;
                    arrayList6 = arrayList6;
                }
                ArrayList arrayList11 = arrayList6;
                if (arrayList9.isEmpty()) {
                    arrayList = arrayList11;
                } else {
                    arrayList = arrayList11;
                    a(arrayList, ue2Var2, gr1Var, arrayList9, arrayList7, ue2Var4, arrayList8, ue2Var, ue2Var3);
                }
                int iMax5 = Math.max(ue2Var.e, l50.j(j2));
                return gr1Var.H0(iMax5, Math.max(ue2Var2.e, l50.i(j2)), vj0Var, new f9(arrayList, gr1Var, iMax5, arrayList8));
        }
    }
}
