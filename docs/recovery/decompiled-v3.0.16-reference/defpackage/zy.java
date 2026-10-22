package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class zy extends fz {
    public static Object A0(List list) {
        int size = list.size();
        if (size == 0) {
            b81.y("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        fo.i("List has more than one element.");
        return null;
    }

    public static List B0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listL0 = L0(iterable);
            if (((ArrayList) listL0).size() > 1) {
                Collections.sort(listL0);
            }
            return listL0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return J0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List C0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listL0 = L0(iterable);
            ez.Z(listL0, comparator);
            return listL0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return J0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List D0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            fo.f(p91.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return uj0.e;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return J0(iterable);
            }
            if (i == 1) {
                return am1.F(m0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return am1.J(arrayList);
    }

    public static List E0(List list, int i) {
        if (i < 0) {
            fo.f(p91.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return uj0.e;
        }
        int size = list.size();
        if (i >= size) {
            return J0(list);
        }
        if (i == 1) {
            return am1.F(t0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] F0(List list) {
        byte[] bArr = new byte[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void G0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] H0(ArrayList arrayList) {
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            fArr[i] = ((Number) obj).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] I0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List J0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return am1.J(L0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return uj0.e;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return am1.F(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList K0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List L0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        G0(iterable, arrayList);
        return arrayList;
    }

    public static Set M0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        G0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set N0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return mc0.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(jq1.M(collection.size()));
                G0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            G0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : mc0.H(linkedHashSet2.iterator().next());
            }
        }
        return zj0.e;
    }

    public static List O0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(new i52(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static double e0(ArrayList arrayList) {
        int size = arrayList.size();
        double dDoubleValue = 0.0d;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            dDoubleValue += ((Number) obj).doubleValue();
            i++;
            if (i < 0) {
                am1.W();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    public static ArrayList f0(List list, int i) {
        list.getClass();
        mh0.s(i, i);
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator itV = !it.hasNext() ? tj0.e : dh0.v(new fx2(i, i, it, null));
            while (itV.hasNext()) {
                arrayList.add((List) itV.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean g0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    am1.X();
                    throw null;
                }
                if (o51.f(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List h0(ArrayList arrayList) {
        return J0(M0(arrayList));
    }

    public static List i0(List list, int i) {
        list.getClass();
        if (i < 0) {
            fo.f(p91.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return J0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return uj0.e;
        }
        if (size == 1) {
            return am1.F(t0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List j0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return D0(list, size);
    }

    public static Object k0(int i, Collection collection) {
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        gz gzVar = new gz(i);
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            gzVar.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            gzVar.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        gzVar.invoke(Integer.valueOf(i));
        throw null;
    }

    public static ArrayList l0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object m0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return n0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        b81.y("Collection is empty.");
        return null;
    }

    public static Object n0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        b81.y("List is empty.");
        return null;
    }

    public static Object o0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object p0(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void q0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, lu0 lu0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            dh0.j(sb, obj, lu0Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void r0(List list, StringBuilder sb, t tVar, int i) {
        if ((i & 64) != 0) {
            tVar = null;
        }
        q0(list, sb, "\n", "", "", "...", tVar);
    }

    public static String s0(Iterable iterable, String str, String str2, String str3, lu0 lu0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lu0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        q0(iterable, sb, str4, str5, str6, "...", lu0Var);
        return sb.toString();
    }

    public static Object t0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        b81.y("List is empty.");
        return null;
    }

    public static Object u0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList v0(Object obj, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(az.Y(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && o51.f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList w0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList x0(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final int y0(List list, int i) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbR = p91.r(i, "Element index ", " must be in range [");
        sbR.append(new k41(0, list.size() - 1, 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static final int z0(List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbR = p91.r(i, "Position index ", " must be in range [");
        sbR.append(new k41(0, list.size(), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }
}
