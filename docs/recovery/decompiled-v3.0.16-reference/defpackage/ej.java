package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ej {
    public static final dj a = new dj("");

    public static final List a(dj djVar, int i, int i2, v1 v1Var) {
        List list;
        if (i == i2 || (list = djVar.e) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= djVar.f.length()) {
            if (v1Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) v1Var.invoke(((cj) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            cj cjVar = (cj) list.get(i3);
            if (v1Var != null ? ((Boolean) v1Var.invoke(cjVar.a)).booleanValue() : true) {
                int i4 = cjVar.b;
                int i5 = cjVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new cj(mh0.v(cjVar.b, i, i2) - i, mh0.v(i5, i, i2) - i, (zi) cjVar.a, cjVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
