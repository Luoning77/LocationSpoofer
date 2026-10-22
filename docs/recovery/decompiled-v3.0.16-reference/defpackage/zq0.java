package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class zq0 {
    public static final mk1 a = new mk1(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final tv2 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new dg2());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new tv2(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((tq0) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static yq0 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceC;
        mk1 mk1Var = a;
        r93.a("getFontSync");
        try {
            Typeface typeface = (Typeface) mk1Var.c(str);
            if (typeface != null) {
                yq0 yq0Var = new yq0(typeface);
                Trace.endSection();
                return yq0Var;
            }
            try {
                x8 x8VarA = sq0.a(context, list);
                List list2 = (List) x8VarA.c;
                int i3 = x8VarA.b;
                if (i3 == 0) {
                    lr0[] lr0VarArr = (lr0[]) list2.get(0);
                    if (lr0VarArr == null || lr0VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = lr0VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = lr0VarArr[i4].e;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    yq0 yq0Var2 = new yq0(i2);
                    Trace.endSection();
                    return yq0Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    lr0[] lr0VarArr2 = (lr0[]) list2.get(0);
                    k93 k93Var = ae3.a;
                    r93.a("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceC = ae3.a.c(context, lr0VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    k93 k93Var2 = ae3.a;
                    r93.a("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceC = ae3.a.d(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceC == null) {
                    yq0 yq0Var3 = new yq0(-3);
                    Trace.endSection();
                    return yq0Var3;
                }
                mk1Var.d(str, typefaceC);
                yq0 yq0Var4 = new yq0(typefaceC);
                Trace.endSection();
                return yq0Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                yq0 yq0Var5 = new yq0(-1);
                Trace.endSection();
                return yq0Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
