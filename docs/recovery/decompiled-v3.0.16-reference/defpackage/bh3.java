package defpackage;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class bh3 {
    public static final byte[] a;
    public static final ox0 b = ld0.E(new String[0]);
    public static final ce2 c;
    public static final ag2 d;
    public static final v32 e;
    public static final TimeZone f;
    public static final if2 g;
    public static final String h;

    static {
        int i = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        tg2.Companion.getClass();
        c = sg2.b(bArr, null);
        d = bg2.c(cg2.Companion, bArr, null, 0, 7);
        uu uuVar = uu.h;
        uu[] uuVarArr = {u92.k("efbbbf"), u92.k("feff"), u92.k("fffe"), u92.k("0000ffff"), u92.k("ffff0000")};
        ArrayList arrayList = new ArrayList(new lo(uuVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            uu uuVar2 = uuVarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList arrayListI = am1.I(Arrays.copyOf(numArr, numArr.length));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            arrayListI.set(am1.e(arrayList, uuVarArr[i3]), Integer.valueOf(i4));
            i3++;
            i4++;
        }
        if (((uu) arrayList.get(0)).a() <= 0) {
            fo.i("the empty byte string is not a supported option");
            return;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            uu uuVar3 = (uu) arrayList.get(i5);
            int i6 = i5 + 1;
            int i7 = i6;
            while (i7 < arrayList.size()) {
                uu uuVar4 = (uu) arrayList.get(i7);
                uuVar4.getClass();
                uuVar3.getClass();
                if (!uuVar4.f(uuVar3, uuVar3.a())) {
                    break;
                }
                if (uuVar4.a() == uuVar3.a()) {
                    b81.z(uuVar4, "duplicate option: ");
                    return;
                } else if (((Number) arrayListI.get(i7)).intValue() > ((Number) arrayListI.get(i5)).intValue()) {
                    arrayList.remove(i7);
                    arrayListI.remove(i7);
                } else {
                    i7++;
                }
            }
            i5 = i6;
        }
        xt xtVar = new xt();
        ld0.k(0L, xtVar, 0, arrayList, 0, arrayList.size(), arrayListI);
        int[] iArr = new int[(int) (xtVar.f / 4)];
        while (!xtVar.F()) {
            iArr[i] = xtVar.readInt();
            i++;
        }
        e = new v32((uu[]) Arrays.copyOf(uuVarArr, 5), iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f = timeZone;
        g = new if2("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = l13.r0(l13.q0(k12.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(zz0 zz0Var, zz0 zz0Var2) {
        zz0Var.getClass();
        return o51.f(zz0Var.d, zz0Var2.d) && zz0Var.e == zz0Var2.e && o51.f(zz0Var.a, zz0Var2.a);
    }

    public static final int b(long j) {
        if (j < 0) {
            b81.g("timeout".concat(" < 0"));
            return 0;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (timeUnit == null) {
            fo.n("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            fo.f("timeout".concat(" too large."));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        fo.f("timeout".concat(" too small."));
        return 0;
    }

    public static final void c(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!o51.f(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (l13.d0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String g(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            b81.y(e2.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long i(qg2 qg2Var) {
        String strA = qg2Var.j.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List j(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(am1.G(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int k(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (o51.m(cCharAt, 31) <= 0 || o51.m(cCharAt, WorkQueueKt.MASK) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int l(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int m(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] n(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean o(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int p(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset q(du duVar, Charset charset) {
        duVar.getClass();
        charset.getClass();
        int iM = duVar.M(e);
        if (iM == -1) {
            return charset;
        }
        if (iM == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (iM == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (iM == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (iM == 3) {
            Charset charset5 = sw.a;
            Charset charset6 = sw.d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            sw.d = charsetForName;
            return charsetForName;
        }
        if (iM != 4) {
            throw new AssertionError();
        }
        Charset charset7 = sw.a;
        Charset charset8 = sw.c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        sw.c = charsetForName2;
        return charsetForName2;
    }

    public static final int r(du duVar) {
        return (duVar.readByte() & 255) | ((duVar.readByte() & 255) << 16) | ((duVar.readByte() & 255) << 8);
    }

    public static final boolean s(sy2 sy2Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = sy2Var.d().e() ? sy2Var.d().c() - jNanoTime : Long.MAX_VALUE;
        sy2Var.d().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            xt xtVar = new xt();
            while (sy2Var.C(xtVar, 8192L) != -1) {
                xtVar.skip(xtVar.f);
            }
            if (jC == Long.MAX_VALUE) {
                sy2Var.d().a();
                return true;
            }
            sy2Var.d().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                sy2Var.d().a();
                return false;
            }
            sy2Var.d().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                sy2Var.d().a();
            } else {
                sy2Var.d().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ox0 t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mx0 mx0Var = (mx0) it.next();
            uu uuVar = mx0Var.a;
            uu uuVar2 = mx0Var.b;
            String strH = uuVar.h();
            String strH2 = uuVar2.h();
            arrayList.add(strH);
            arrayList.add(l13.D0(strH2).toString());
        }
        return new ox0((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(zz0 zz0Var, boolean z) {
        int i;
        zz0Var.getClass();
        int i2 = zz0Var.e;
        String strP = zz0Var.d;
        if (l13.c0(strP, ":", false)) {
            strP = p91.p("[", strP, ']');
        }
        if (!z) {
            String str = zz0Var.a;
            str.getClass();
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strP;
            }
        }
        return strP + ':' + i2;
    }

    public static final List v(List list) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int w(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
