package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class p91 {
    public static int a(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int f(q93 q93Var, int i, int i2) {
        return (q93Var.hashCode() + i) * i2;
    }

    public static int g(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static iv h(String str) {
        s21.b(str);
        return new iv();
    }

    public static nx0 i(float f, float f2) {
        nx0 nx0Var = new nx0(3);
        nx0Var.m(f, f2);
        return nx0Var;
    }

    public static we2 j(Object obj) {
        ee0.J(obj);
        return new we2();
    }

    public static ClassCastException k(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String l(int i, String str) {
        return str + i;
    }

    public static String m(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String n(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String o(String str, long j) {
        return str + j;
    }

    public static String p(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static String q(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder r(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder s(String str, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void u(long j, StringBuilder sb, String str) {
        sb.append((Object) hz.i(j));
        sb.append(str);
    }

    public static void v(gn gnVar, long j) {
        gnVar.i().i();
        gnVar.F(j);
    }

    public static /* synthetic */ void w(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj == null) {
            return;
        }
        b81.u();
    }

    public static void y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean z(Object obj, String str, boolean z) {
        return l13.c0(obj.getClass().getName(), str, z);
    }
}
