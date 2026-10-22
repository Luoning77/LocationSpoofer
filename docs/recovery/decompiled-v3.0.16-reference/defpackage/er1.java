package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface er1 {
    default int b(g51 g51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new oa0((zq1) list.get(i3), h51.f, l51.f, i2));
        }
        return g(new v51(g51Var, g51Var.getLayoutDirection()), arrayList, m50.b(0, i, 0, 0, 13)).b();
    }

    default int d(g51 g51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new oa0((zq1) list.get(i3), h51.f, l51.e, i2));
        }
        return g(new v51(g51Var, g51Var.getLayoutDirection()), arrayList, m50.b(0, 0, 0, i, 7)).e();
    }

    fr1 g(gr1 gr1Var, List list, long j);

    default int h(g51 g51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new oa0((zq1) list.get(i3), h51.e, l51.f, i2));
        }
        return g(new v51(g51Var, g51Var.getLayoutDirection()), arrayList, m50.b(0, i, 0, 0, 13)).b();
    }

    default int j(g51 g51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new oa0((zq1) list.get(i3), h51.e, l51.e, i2));
        }
        return g(new v51(g51Var, g51Var.getLayoutDirection()), arrayList, m50.b(0, 0, 0, i, 7)).e();
    }
}
