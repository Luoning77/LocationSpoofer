package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class m13 extends dh0 {
    public static String N(String str) {
        return xs2.R(new dc3(new ap(str, 5), new z90("    ", 4)), "\n");
    }

    public static String O(String str) {
        Comparable comparable;
        List listN0 = l13.n0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (!l13.k0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!xp1.C(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listN0.size();
        int size2 = listN0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listN0) {
            int i3 = i + 1;
            if (i < 0) {
                am1.X();
                throw null;
            }
            String str3 = (String) obj3;
            String strE0 = ((i == 0 || i == size2) && l13.k0(str3)) ? null : l13.e0(iIntValue, str3);
            if (strE0 != null) {
                arrayList3.add(strE0);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        zy.r0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String P(String str) {
        if (l13.k0("|")) {
            fo.i("marginPrefix must be non-blank string.");
            return null;
        }
        List listN0 = l13.n0(str);
        int length = str.length();
        listN0.size();
        int size = listN0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listN0) {
            int i2 = i + 1;
            if (i < 0) {
                am1.X();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && l13.k0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!xp1.C(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && s13.Y(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        zy.r0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
