package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.SystemDeliveryAdapter;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class az2 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case Logger.WARN /* 5 */:
                return "NAME";
            case Logger.ERROR /* 6 */:
                return "STRING";
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case mc0.b /* 9 */:
                return "NULL";
            case mc0.c /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] B(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static String a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static int c(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static iv d() {
        FlowKt.noImpl();
        return new iv();
    }

    public static iv e(String str) {
        p21.d(str);
        return new iv();
    }

    public static rd3 f(zw0 zw0Var, Class cls) {
        zw0Var.getClass();
        return zw0Var.c(new zd3(cls));
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String h(ov0 ov0Var, int i, int i2, ov0 ov0Var2, boolean z) {
        ov0Var.c0(i);
        String strN = ke0.N(i2, ov0Var2);
        ov0Var.p(z);
        return strN;
    }

    public static String i(av1 av1Var, float f, ov0 ov0Var, int i, ov0 ov0Var2) {
        gh0.h(ov0Var, iw2.o(av1Var, f));
        return ke0.N(i, ov0Var2);
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(String str, JSONObject jSONObject, String str2) {
        str.getClass();
        String string = jSONObject.getString(str2);
        string.getClass();
        return string;
    }

    public static String n(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void r(int i, ov0 ov0Var, int i2, gh ghVar) {
        ov0Var.m0(Integer.valueOf(i));
        ov0Var.b(Integer.valueOf(i2), ghVar);
    }

    public static void s(int i, ov0 ov0Var, gh ghVar, ov0 ov0Var2, wa waVar) {
        q73.h(ov0Var, ghVar, Integer.valueOf(i));
        q73.g(ov0Var2, waVar);
    }

    public static void t(ov0 ov0Var, boolean z, av1 av1Var, float f, ov0 ov0Var2) {
        ov0Var.p(z);
        gh0.h(ov0Var2, iw2.o(av1Var, f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u(bl2 bl2Var) throws Exception {
        boolean zIsTerminated;
        if (bl2Var instanceof AutoCloseable) {
            bl2Var.close();
            return;
        }
        if (!(bl2Var instanceof ExecutorService)) {
            if (bl2Var instanceof TypedArray) {
                ((TypedArray) bl2Var).recycle();
                return;
            } else if (bl2Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) bl2Var).release();
                return;
            } else {
                if (!(bl2Var instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) bl2Var).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) bl2Var;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(SystemDeliveryAdapter systemDeliveryAdapter) throws Exception {
        boolean zIsTerminated;
        if (systemDeliveryAdapter instanceof AutoCloseable) {
            systemDeliveryAdapter.close();
            return;
        }
        if (!(systemDeliveryAdapter instanceof ExecutorService)) {
            if (systemDeliveryAdapter instanceof TypedArray) {
                ((TypedArray) systemDeliveryAdapter).recycle();
                return;
            } else if (systemDeliveryAdapter instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) systemDeliveryAdapter).release();
                return;
            } else {
                if (!(systemDeliveryAdapter instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) systemDeliveryAdapter).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) systemDeliveryAdapter;
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

    public static void w(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void x(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ int z(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
