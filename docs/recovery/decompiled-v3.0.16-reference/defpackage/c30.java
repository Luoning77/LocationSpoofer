package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class c30 implements x70, q02, md0 {
    public final /* synthetic */ int e;

    public /* synthetic */ c30(int i) {
        this.e = i;
    }

    public static String a(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = WorkQueueKt.BUFFER_CAPACITY;
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || l13.d0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                xt xtVar = new xt();
                xtVar.l0(i4, iCharCount, str);
                xt xtVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            xtVar.m0(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || l13.d0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !d(iCharCount, length, str)))))) {
                            if (xtVar2 == null) {
                                xtVar2 = new xt();
                            }
                            xtVar2.n0(iCodePointAt2);
                            while (!xtVar2.F()) {
                                byte b = xtVar2.readByte();
                                xtVar.h0(37);
                                char[] cArr = zz0.j;
                                xtVar.h0(cArr[((b & 255) >> 4) & 15]);
                                xtVar.h0(cArr[b & 15]);
                            }
                        } else {
                            xtVar.n0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = WorkQueueKt.BUFFER_CAPACITY;
                    i6 = 32;
                }
                return xtVar.y();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static boolean d(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && bh3.p(str.charAt(i + 1)) != -1 && bh3.p(str.charAt(i3)) != -1;
    }

    public static String e(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                xt xtVar = new xt();
                xtVar.l0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iP = bh3.p(str.charAt(iCharCount + 1));
                        int iP2 = bh3.p(str.charAt(i4));
                        if (iP == -1 || iP2 == -1) {
                            xtVar.n0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            xtVar.h0((iP << 4) + iP2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        xtVar.h0(32);
                        iCharCount++;
                    } else {
                        xtVar.n0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return xtVar.y();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iH0 = l13.h0(str, '&', i, 4);
            if (iH0 == -1) {
                iH0 = str.length();
            }
            int iH1 = l13.h0(str, '=', i, 4);
            if (iH1 == -1 || iH1 > iH0) {
                arrayList.add(str.substring(i, iH0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iH1));
                arrayList.add(str.substring(iH1 + 1, iH0));
            }
            i = iH0 + 1;
        }
        return arrayList;
    }

    public static void g(List list, StringBuilder sb) {
        list.getClass();
        i41 i41VarC0 = mh0.c0(mh0.f0(0, list.size()), 2);
        int i = i41VarC0.e;
        int i2 = i41VarC0.f;
        int i3 = i41VarC0.g;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public long b(long j, long j2) {
        switch (this.e) {
            case mc0.d /* 12 */:
                float fW = ym3.w(j, j2);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(fW)) & 4294967295L);
                int i = gn2.a;
                return jFloatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i2 = gn2.a;
                    return jFloatToRawIntBits2;
                }
                float fW2 = ym3.w(j, j2);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fW2)) << 32) | (((long) Float.floatToRawIntBits(fW2)) & 4294967295L);
                int i3 = gn2.a;
                return jFloatToRawIntBits3;
        }
    }

    public Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.md0
    public List lookup(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return yo.F0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // defpackage.q02
    public Object n() {
        switch (this.e) {
            case 3:
                return new TreeSet();
            case 4:
                return new LinkedHashSet();
            case Logger.WARN /* 5 */:
                return new ArrayDeque();
            case Logger.ERROR /* 6 */:
                return new ArrayList();
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return new ConcurrentSkipListMap();
            case 8:
                return new ConcurrentHashMap();
            case mc0.b /* 9 */:
                return new TreeMap();
            case mc0.c /* 10 */:
                return new LinkedHashMap();
            default:
                return new ig1(true);
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "Empty";
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
