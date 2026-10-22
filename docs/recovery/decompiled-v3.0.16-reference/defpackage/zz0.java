package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zz0 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    public final boolean i;

    public zz0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(l13.h0(str, ':', length, 4) + 1, l13.h0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iH0 = l13.h0(str, '/', length, 4);
        return str.substring(iH0, bh3.f(str, iH0, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iH0 = l13.h0(str, '/', length, 4);
        int iF = bh3.f(str, iH0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iH0 < iF) {
            int i = iH0 + 1;
            int iE = bh3.e(str, '/', i, iF);
            arrayList.add(str.substring(i, iE));
            iH0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iH0 = l13.h0(str, '?', 0, 6) + 1;
        return str.substring(iH0, bh3.e(str, '#', iH0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, bh3.f(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zz0) && ((zz0) obj).h.equals(this.h);
    }

    public final yz0 f() {
        int i;
        String strSubstring;
        yz0 yz0Var = new yz0();
        String str = this.a;
        yz0Var.d = str;
        yz0Var.e = e();
        yz0Var.f = a();
        yz0Var.g = this.d;
        str.getClass();
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? 443 : -1;
        }
        int i2 = this.e;
        yz0Var.b = i2 != i ? i2 : -1;
        ArrayList arrayList = yz0Var.c;
        arrayList.clear();
        arrayList.addAll(c());
        yz0Var.d(d());
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(l13.h0(str2, '#', 0, 6) + 1);
        }
        yz0Var.h = strSubstring;
        return yz0Var;
    }

    public final String g() {
        List list = this.f;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        c30.g(list, sb);
        return sb.toString();
    }

    public final Set h() {
        List list = this.f;
        if (list == null) {
            return zj0.e;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i41 i41VarC0 = mh0.c0(mh0.f0(0, list.size()), 2);
        int i = i41VarC0.e;
        int i2 = i41VarC0.f;
        int i3 = i41VarC0.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                Object obj = list.get(i);
                obj.getClass();
                linkedHashSet.add(obj);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final List i() {
        List list = this.f;
        if (list == null) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList();
        i41 i41VarC0 = mh0.c0(mh0.f0(0, list.size()), 2);
        int i = i41VarC0.e;
        int i2 = i41VarC0.f;
        int i3 = i41VarC0.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if ("t".equals(list.get(i))) {
                    arrayList.add(list.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public final String j() {
        yz0 yz0Var;
        try {
            yz0Var = new yz0();
            yz0Var.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            yz0Var = null;
        }
        yz0Var.getClass();
        yz0Var.e = c30.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        yz0Var.f = c30.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return yz0Var.a().h;
    }

    public final URI k() {
        String strReplaceAll;
        yz0 yz0VarF = f();
        ArrayList arrayList = yz0VarF.c;
        String str = (String) yz0VarF.g;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        yz0VarF.g = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, c30.a((String) arrayList.get(i), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = (ArrayList) yz0VarF.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? c30.a(str2, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str3 = (String) yz0VarF.h;
        yz0VarF.h = str3 != null ? c30.a(str3, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = yz0VarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.h;
    }
}
