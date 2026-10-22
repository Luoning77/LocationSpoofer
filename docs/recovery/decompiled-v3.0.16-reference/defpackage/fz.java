package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class fz extends ez {
    public static void a0(ArrayList arrayList, Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
    }

    public static void b0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void c0(ArrayList arrayList, lu0 lu0Var) {
        int size;
        int size2 = arrayList.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) lu0Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (size = arrayList.size() - 1)) {
            return;
        }
        while (true) {
            arrayList.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static Object d0(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        b81.y("List is empty.");
        return null;
    }
}
