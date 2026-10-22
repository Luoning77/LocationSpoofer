package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ts2 {
    public static final Comparator[] a;
    public static final ns2 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new wl1(new wl1(i == 0 ? gq0.e : gq0.c), 3);
            i++;
        }
        a = comparatorArr;
        b = ns2.p;
    }

    public static final void a(js2 js2Var, ArrayList arrayList, q9 q9Var, q9 q9Var2, gx1 gx1Var) {
        es2 es2Var = js2Var.d;
        Object objG = es2Var.e.g(os2.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) q9Var2.invoke(js2Var)).booleanValue()) && ((Boolean) q9Var.invoke(js2Var)).booleanValue()) {
            arrayList.add(js2Var);
        }
        if (zBooleanValue) {
            gx1Var.h(js2Var.f, b(js2Var, q9Var, q9Var2, js2.j(7, js2Var)));
            return;
        }
        List listJ = js2.j(7, js2Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((js2) listJ.get(i), arrayList, q9Var, q9Var2, gx1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    public static final ArrayList b(js2 js2Var, q9 q9Var, q9 q9Var2, List list) {
        int i;
        gx1 gx1Var = g41.a;
        gx1 gx1Var2 = new gx1();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((js2) list.get(i2), arrayList, q9Var, q9Var2, gx1Var2);
        }
        int i3 = 1;
        char c = js2Var.c.E == qa1.f ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                js2 js2Var2 = (js2) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new i52(js2Var2.h(), am1.I(js2Var2)));
                    break;
                }
                float f = js2Var2.h().b;
                float f2 = js2Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        pe2 pe2Var = (pe2) ((i52) arrayList2.get(i6)).e;
                        i = i3;
                        float f3 = pe2Var.b;
                        float f4 = pe2Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new i52(new pe2(Math.max(pe2Var.a, 0.0f), Math.max(pe2Var.b, f), Math.min(pe2Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((i52) arrayList2.get(i6)).f));
                            ((List) ((i52) arrayList2.get(i6)).f).add(js2Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new i52(js2Var2.h(), am1.I(js2Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        ez.Z(arrayList2, gq0.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            i52 i52Var = (i52) arrayList2.get(i8);
            ez.Z((List) i52Var.f, comparator);
            arrayList3.addAll((Collection) i52Var.f);
        }
        ez.Z(arrayList3, new q00(b, 2));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) gx1Var2.b(((js2) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) q9Var2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
