package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ff implements er1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ff(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.er1
    public final fr1 g(gr1 gr1Var, List list, long j) {
        ArrayList arrayList;
        i52 i52Var;
        int i = this.a;
        vj0 vj0Var = vj0.e;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ya2) obj).setParentLayoutDirection((qa1) obj2);
                return gr1Var.H0(0, 0, vj0Var, wa.m);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (!(((zq1) obj3).A() instanceof h93)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((au0) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i3 = 0;
                    for (int size2 = list2.size(); i3 < size2; size2 = size2) {
                        pe2 pe2Var = (pe2) list2.get(i3);
                        if (pe2Var != null) {
                            float f = pe2Var.b;
                            float f2 = pe2Var.a;
                            i52Var = new i52(((zq1) arrayList2.get(i3)).s(m50.b(0, (int) Math.floor(pe2Var.c - f2), 0, (int) Math.floor(pe2Var.d - f), 5)), new h41((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            i52Var = null;
                        }
                        if (i52Var != null) {
                            arrayList3.add(i52Var);
                        }
                        i3++;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj4 = list.get(i4);
                    if (((zq1) obj4).A() instanceof h93) {
                        arrayList4.add(obj4);
                    }
                }
                return gr1Var.H0(l50.h(j), l50.g(j), vj0Var, new jl1(29, arrayList, ym3.I(arrayList4, (au0) obj)));
        }
    }
}
