package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class yo extends ks {
    public static String A0(Object[] objArr, lu0 lu0Var, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        if ((i & 32) != 0) {
            lu0Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            dh0.j(sb, obj, lu0Var);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static Float B0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static byte[] C0(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static char D0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            b81.y("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        fo.i("Array has more than one element.");
        return (char) 0;
    }

    public static List E0(int i, byte[] bArr) {
        if (i < 0) {
            fo.f(p91.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i != 0) {
            int i2 = 0;
            if (i < bArr.length) {
                if (i == 1) {
                    return am1.F(Byte.valueOf(bArr[0]));
                }
                ArrayList arrayList = new ArrayList(i);
                int length = bArr.length;
                int i3 = 0;
                while (i2 < length) {
                    arrayList.add(Byte.valueOf(bArr[i2]));
                    i3++;
                    if (i3 == i) {
                        break;
                    }
                    i2++;
                }
                return arrayList;
            }
            int length2 = bArr.length;
            if (length2 != 0) {
                if (length2 == 1) {
                    return am1.F(Byte.valueOf(bArr[0]));
                }
                ArrayList arrayList2 = new ArrayList(bArr.length);
                int length3 = bArr.length;
                while (i2 < length3) {
                    arrayList2.add(Byte.valueOf(bArr[i2]));
                    i2++;
                }
                return arrayList2;
            }
        }
        return uj0.e;
    }

    public static List F0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return uj0.e;
        }
        if (length == 1) {
            return am1.F(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static Set G0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return zj0.e;
        }
        if (length == 1) {
            return mc0.H(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(jq1.M(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    public static Set H0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return zj0.e;
        }
        if (length == 1) {
            return mc0.H(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(jq1.M(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static us2 g0(Object[] objArr) {
        return objArr.length == 0 ? yj0.a : new ap(objArr, 0);
    }

    public static double h0(float[] fArr) {
        fArr.getClass();
        double d = 0.0d;
        int i = 0;
        for (float f : fArr) {
            d += (double) f;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean i0(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean j0(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static void k0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void l0(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void m0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void n0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void o0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        k0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void p0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        n0(objArr, objArr2, 0, i, i2);
    }

    public static byte[] q0(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ks.L(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] r0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        ks.L(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static void s0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void t0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList v0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int w0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object x0(Object[] objArr, int i) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int y0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String z0(byte[] bArr, lu0 lu0Var) {
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            if (lu0Var != null) {
                sb.append((CharSequence) lu0Var.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
