package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class l13 extends s13 {
    public static String A0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iI0 = i0(str, str2, 0, false, 6);
        return iI0 == -1 ? str : str.substring(0, iI0);
    }

    public static String B0(int i, String str) {
        str.getClass();
        if (i < 0) {
            fo.f(p91.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String C0(int i, String str) {
        str.getClass();
        if (i < 0) {
            fo.f(p91.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static CharSequence D0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zC = xp1.C(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String E0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!yo.i0(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean c0(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return i0(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean d0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return h0(charSequence, c, 0, 2) >= 0;
    }

    public static String e0(int i, String str) {
        str.getClass();
        if (i < 0) {
            fo.f(p91.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean f0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : p0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int g0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        k41 k41Var = new k41(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = k41Var.g;
        int i3 = k41Var.f;
        int i4 = k41Var.e;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z4 = z3;
                    int i5 = i4;
                    if (p0(str, 0, charSequence2, i5, str.length(), z4)) {
                        return i5;
                    }
                    if (i5 != i3) {
                        i4 = i5 + i2;
                        charSequence = charSequence2;
                        z3 = z4;
                    }
                }
            }
        } else if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            int i6 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (s13.V(0, i6, str.length(), str2, (String) charSequence, z5)) {
                    return i6;
                }
                if (i6 != i3) {
                    i6 += i2;
                    str = str2;
                    z = z5;
                }
            }
        }
        return -1;
    }

    public static int h0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? j0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return g0(charSequence, str, i, z);
    }

    public static final int j0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(yo.D0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (xp1.x(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean k0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!xp1.C(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int l0(int i, String str, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static int m0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }

    public static List n0(CharSequence charSequence) {
        yf1 yf1Var = new yf1(charSequence);
        if (!yf1Var.hasNext()) {
            return uj0.e;
        }
        Object next = yf1Var.next();
        if (!yf1Var.hasNext()) {
            return am1.F(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (yf1Var.hasNext()) {
            arrayList.add(yf1Var.next());
        }
        return arrayList;
    }

    public static String o0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            fo.i(p91.m(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean p0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!xp1.x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String q0(String str, String str2) {
        str.getClass();
        return s13.Z(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String r0(String str, String str2) {
        return f0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static final void s0(int i) {
        if (i >= 0) {
            return;
        }
        fo.f(p91.l(i, "Limit must be non-negative, but was "));
    }

    public static final List t0(CharSequence charSequence, String str, int i) {
        s0(i);
        int iG0 = g0(charSequence, str, 0, false);
        if (iG0 == -1 || i == 1) {
            return am1.F(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iG0).toString());
            length = str.length() + iG0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iG0 = g0(charSequence, str, length, false);
        } while (iG0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List u0(String str, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 3;
        str.getClass();
        int i3 = 1;
        if (cArr.length == 1) {
            return t0(str, String.valueOf(cArr[0]), i2);
        }
        s0(i2);
        zo zoVar = new zo(new vb0(str, i2, new iy2(cArr, i3)), 2);
        ArrayList arrayList = new ArrayList(az.Y(zoVar, 10));
        Iterator it = zoVar.iterator();
        while (true) {
            ub0 ub0Var = (ub0) it;
            if (!ub0Var.hasNext()) {
                return arrayList;
            }
            k41 k41Var = (k41) ub0Var.next();
            k41Var.getClass();
            arrayList.add(str.subSequence(k41Var.e, k41Var.f + 1).toString());
        }
    }

    public static List v0(String str, String[] strArr) {
        str.getClass();
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() > 0) {
                return t0(str, str2, 0);
            }
        }
        s0(0);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        int i = 2;
        zo zoVar = new zo(new vb0(str, 0, new iy2(listAsList, i)), i);
        ArrayList arrayList = new ArrayList(az.Y(zoVar, 10));
        Iterator it = zoVar.iterator();
        while (true) {
            ub0 ub0Var = (ub0) it;
            if (!ub0Var.hasNext()) {
                return arrayList;
            }
            k41 k41Var = (k41) ub0Var.next();
            k41Var.getClass();
            arrayList.add(str.subSequence(k41Var.e, k41Var.f + 1).toString());
        }
    }

    public static String w0(String str, String str2, String str3) {
        int iI0 = i0(str, str2, 0, false, 6);
        return iI0 == -1 ? str3 : str.substring(str2.length() + iI0, str.length());
    }

    public static String x0(String str, char c) {
        str.getClass();
        str.getClass();
        int iH0 = h0(str, c, 0, 6);
        return iH0 == -1 ? str : str.substring(iH0 + 1, str.length());
    }

    public static String y0(String str) {
        str.getClass();
        str.getClass();
        int iM0 = m0(str, '/', 0, 6);
        return iM0 == -1 ? str : str.substring(iM0 + 1, str.length());
    }

    public static String z0(String str, char c) {
        str.getClass();
        str.getClass();
        int iH0 = h0(str, c, 0, 6);
        return iH0 == -1 ? str : str.substring(0, iH0);
    }
}
