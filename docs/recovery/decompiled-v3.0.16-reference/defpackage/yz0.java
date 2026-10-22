package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yz0 {
    public final /* synthetic */ int a;
    public int b;
    public final ArrayList c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public List i;

    public yz0(q8 q8Var, us1 us1Var, dv dvVar, zl0 zl0Var) {
        List<Proxy> listJ;
        this.a = 1;
        zl0Var.getClass();
        this.d = q8Var;
        this.e = us1Var;
        this.f = dvVar;
        this.g = zl0Var;
        uj0 uj0Var = uj0.e;
        this.h = uj0Var;
        this.i = uj0Var;
        this.c = new ArrayList();
        zz0 zz0Var = q8Var.i;
        Proxy proxy = q8Var.g;
        zl0Var.proxySelectStart(dvVar, zz0Var);
        if (proxy != null) {
            listJ = am1.F(proxy);
        } else {
            URI uriK = zz0Var.k();
            if (uriK.getHost() == null) {
                listJ = bh3.j(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = q8Var.h.select(uriK);
                listJ = (listSelect == null || listSelect.isEmpty()) ? bh3.j(Proxy.NO_PROXY) : bh3.v(listSelect);
            }
        }
        this.h = listJ;
        this.b = 0;
        zl0Var.proxySelectEnd(dvVar, zz0Var, listJ);
    }

    public zz0 a() {
        ArrayList arrayList;
        String str = (String) this.d;
        if (str == null) {
            fo.n("scheme == null");
            return null;
        }
        String strE = c30.e((String) this.e, 0, 0, 7);
        String strE2 = c30.e((String) this.f, 0, 0, 7);
        String str2 = (String) this.g;
        if (str2 == null) {
            fo.n("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(az.Y(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(c30.e((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            arrayList = new ArrayList(az.Y(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? c30.e(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.h;
        return new zz0(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? c30.e(str4, 0, 0, 7) : null, toString());
    }

    public int b() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.d;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public void c(String str) {
        str.getClass();
        if (s13.Z(str, "/", false)) {
            g(0, str.length(), str);
        } else {
            fo.f("unexpected encodedPath: ".concat(str));
        }
    }

    public void d(String str) {
        this.i = str != null ? c30.f(c30.a(str, 0, 0, " \"'<>#", 211)) : null;
    }

    public boolean e() {
        return this.b < ((List) this.h).size() || !this.c.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0023  */
    public void f(zz0 zz0Var, String str) {
        int i;
        char c;
        char c2;
        int i2;
        int iF;
        int i3;
        char cCharAt;
        byte[] bArr = bh3.a;
        int iL = bh3.l(0, str.length(), str);
        int iM = bh3.m(iL, str.length(), str);
        int i4 = -1;
        if (iM - iL >= 2) {
            char cCharAt2 = str.charAt(iL);
            if ((o51.m(cCharAt2, 97) >= 0 && o51.m(cCharAt2, 122) <= 0) || (o51.m(cCharAt2, 65) >= 0 && o51.m(cCharAt2, 90) <= 0)) {
                i = iL + 1;
                while (true) {
                    if (i < iM) {
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i5 = 1;
        if (i != -1) {
            if (s13.Y(str, "https:", iL, true)) {
                this.d = "https";
                iL += 6;
            } else {
                if (!s13.Y(str, "http:", iL, true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.d = "http";
                iL += 5;
            }
        } else {
            if (zz0Var == null) {
                fo.i("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? l13.B0(6, str).concat("...") : str));
                return;
            }
            this.d = zz0Var.a;
        }
        int i6 = iL;
        int i7 = 0;
        while (true) {
            c = '/';
            c2 = '\\';
            i2 = i5;
            if (i6 >= iM || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        char c3 = '#';
        if (i7 >= 2 || zz0Var == null || !o51.f(zz0Var.a, (String) this.d)) {
            int i8 = iL + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iF = bh3.f(str, i8, iM, "@/\\?#");
                byte bCharAt = iF != iM ? str.charAt(iF) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c3 || bCharAt == c || bCharAt == c2 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i10 == 0) {
                        int iE = bh3.e(str, ':', i8, iF);
                        String strA = c30.a(str, i8, iE, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (i9 != 0) {
                            strA = az2.p(new StringBuilder((String) this.e), "%40", strA);
                        }
                        this.e = strA;
                        if (iE != iF) {
                            this.f = c30.a(str, iE + 1, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                            i10 = i2;
                        }
                        i9 = i2;
                    } else {
                        this.f = ((String) this.f) + "%40" + c30.a(str, i8, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                    }
                    i8 = iF + 1;
                    c2 = '\\';
                    c3 = '#';
                    c = '/';
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 >= iF) {
                    i11 = iF;
                    break;
                }
                char cCharAt4 = str.charAt(i11);
                if (cCharAt4 == '[') {
                    do {
                        i11++;
                        if (i11 >= iF) {
                            break;
                        }
                    } while (str.charAt(i11) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i11++;
            }
            int i12 = i11 + 1;
            if (i12 < iF) {
                this.g = ke0.P(c30.e(str, i8, i11, 4));
                try {
                    i3 = Integer.parseInt(c30.a(str, i12, iF, "", 248));
                    if (i2 > i3 || i3 >= 65536) {
                        i3 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.b = i3;
                if (i3 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i12, iF) + '\"').toString());
                }
            } else {
                this.g = ke0.P(c30.e(str, i8, i11, 4));
                String str2 = (String) this.d;
                str2.getClass();
                if (str2.equals("http")) {
                    i4 = 80;
                } else if (str2.equals("https")) {
                    i4 = 443;
                }
                this.b = i4;
            }
            if (((String) this.g) == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i8, i11) + '\"').toString());
            }
            iL = iF;
        } else {
            this.e = zz0Var.e();
            this.f = zz0Var.a();
            this.g = zz0Var.d;
            this.b = zz0Var.e;
            ArrayList arrayList = this.c;
            arrayList.clear();
            arrayList.addAll(zz0Var.c());
            if (iL == iM || str.charAt(iL) == '#') {
                d(zz0Var.d());
            }
        }
        int iF2 = bh3.f(str, iL, iM, "?#");
        g(iL, iF2, str);
        if (iF2 < iM && str.charAt(iF2) == '?') {
            int iE2 = bh3.e(str, '#', iF2, iM);
            this.i = c30.f(c30.a(str, iF2 + 1, iE2, " \"'<>#", 208));
            iF2 = iE2;
        }
        if (iF2 >= iM || str.charAt(iF2) != '#') {
            return;
        }
        this.h = c30.a(str, iF2 + 1, iM, "", 176);
    }

    public void g(int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        char cCharAt = str.charAt(i);
        ArrayList arrayList = this.c;
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        while (i < i2) {
            int iF = bh3.f(str, i, i2, "/\\");
            boolean z = iF < i2;
            String strA = c30.a(str, i, iF, " \"<>^`{}|/\\?#", 240);
            if (!strA.equals(".") && !strA.equalsIgnoreCase("%2e")) {
                if (!strA.equals("..") && !strA.equalsIgnoreCase("%2e.") && !strA.equalsIgnoreCase(".%2e") && !strA.equalsIgnoreCase("%2e%2e")) {
                    if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                        arrayList.set(arrayList.size() - 1, strA);
                    } else {
                        arrayList.add(strA);
                    }
                    if (z) {
                        arrayList.add("");
                    }
                } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
            }
            i = z ? iF + 1 : iF;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.d;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.e).length() > 0 || ((String) this.f).length() > 0) {
                    sb.append((String) this.e);
                    if (((String) this.f).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.g;
                if (str2 != null) {
                    if (l13.d0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.g);
                        sb.append(']');
                    } else {
                        sb.append((String) this.g);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.d) != null) {
                    int iB = b();
                    String str3 = (String) this.d;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iB);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iB != i) {
                            sb.append(':');
                            sb.append(iB);
                        }
                    }
                }
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    arrayList2.getClass();
                    c30.g(arrayList2, sb);
                }
                if (((String) this.h) != null) {
                    sb.append('#');
                    sb.append((String) this.h);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public yz0() {
        this.a = 0;
        this.e = "";
        this.f = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}
