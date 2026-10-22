package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class uz0 {
    static {
        uu uuVar = uu.h;
        u92.l("\"\\");
        u92.l("\t ,=");
    }

    public static final boolean a(qg2 qg2Var) {
        if (o51.f(qg2Var.e.b, "HEAD")) {
            return false;
        }
        int i = qg2Var.h;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && bh3.i(qg2Var) == -1 && !"chunked".equalsIgnoreCase(qg2.A(qg2Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0209  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    public static final void b(j9 j9Var, zz0 zz0Var, ox0 ox0Var) {
        List list;
        t60 t60Var;
        t60 t60Var2;
        String strSubstring;
        j9Var.getClass();
        zz0Var.getClass();
        ox0Var.getClass();
        if (j9Var == j9.C) {
            return;
        }
        Pattern pattern = t60.j;
        int size = ox0Var.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(ox0Var.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(ox0Var.d(i));
            }
        }
        List listUnmodifiableList = uj0.e;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            listUnmodifiableList2.getClass();
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) list.get(i2);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = bh3.a;
            char c = ';';
            int iE = bh3.e(str, ';', 0, str.length());
            char c2 = '=';
            int iE2 = bh3.e(str, '=', 0, iE);
            if (iE2 == iE) {
                t60Var = null;
            } else {
                int iL = bh3.l(0, iE2, str);
                String strSubstring2 = str.substring(iL, bh3.m(iL, iE2, str));
                if (strSubstring2.length() != 0 && bh3.k(strSubstring2) == -1) {
                    int iL2 = bh3.l(iE2 + 1, iE, str);
                    String strSubstring3 = str.substring(iL2, bh3.m(iL2, iE, str));
                    if (bh3.k(strSubstring3) == -1) {
                        int i3 = iE + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jV = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        while (true) {
                            if (i3 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                        j = j3;
                                    }
                                } else {
                                    j = jV;
                                }
                                String str3 = zz0Var.d;
                                if (str2 != null) {
                                    if (!o51.f(str3, str2) && (!s13.S(str3, str2) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || bh3.g.b(str3))) {
                                        t60Var2 = null;
                                    }
                                    t60Var = t60Var2;
                                    break;
                                }
                                str2 = str3;
                                if (str3.length() == str2.length() || PublicSuffixDatabase.g.a(str2) != null) {
                                    if (strSubstring4 == null || !s13.Z(strSubstring4, "/", false)) {
                                        String strB = zz0Var.b();
                                        int iM0 = l13.m0(strB, '/', 0, 6);
                                        strSubstring4 = iM0 != 0 ? strB.substring(0, iM0) : "/";
                                    }
                                    t60Var2 = new t60(strSubstring2, strSubstring3, j, str2, strSubstring4, z, z2, z3, z4);
                                } else {
                                    t60Var2 = null;
                                }
                                t60Var = t60Var2;
                                break;
                            }
                            int iE3 = bh3.e(str, c, i3, length);
                            int iE4 = bh3.e(str, c2, i3, iE3);
                            int iL3 = bh3.l(i3, iE4, str);
                            String strSubstring5 = str.substring(iL3, bh3.m(iL3, iE4, str));
                            if (iE4 < iE3) {
                                int iL4 = bh3.l(iE4 + 1, iE3, str);
                                strSubstring = str.substring(iL4, bh3.m(iL4, iE3, str));
                            } else {
                                strSubstring = "";
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jV = o51.v(strSubstring.length(), strSubstring);
                                    z3 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    long j4 = Long.parseLong(strSubstring);
                                    j2 = j4 <= 0 ? Long.MIN_VALUE : j4;
                                } catch (NumberFormatException e) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    patternCompile.getClass();
                                    if (!patternCompile.matcher(strSubstring).matches()) {
                                        throw e;
                                    }
                                    j2 = s13.Z(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z3 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (strSubstring.endsWith(".")) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strP = ke0.P(l13.q0(strSubstring, "."));
                                if (strP == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strP;
                                z4 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                strSubstring4 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z2 = true;
                            }
                            i3 = iE3 + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        t60Var = null;
                    }
                } else {
                    t60Var = null;
                }
            }
            if (t60Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(t60Var);
            }
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList.getClass();
        }
        listUnmodifiableList.isEmpty();
    }
}
