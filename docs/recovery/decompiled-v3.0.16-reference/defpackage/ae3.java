package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ae3 {
    public static final k93 a;
    public static final mk1 b;

    static {
        r93.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new de3();
        } else if (i >= 28) {
            a = new ce3();
        } else {
            a = new be3();
        }
        b = new mk1(16);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static Typeface a(Context context, ar0 ar0Var, Resources resources, int i, String str, int i2, int i3, dm dmVar, boolean z) {
        Typeface typefaceB;
        Typeface typefaceCreate;
        Typeface typeface;
        List listUnmodifiableList;
        Typeface typeface2;
        int i4 = 9;
        if (ar0Var instanceof dr0) {
            dr0 dr0Var = (dr0) ar0Var;
            String str2 = dr0Var.e;
            char c = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (dmVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ub(i4, dmVar, typefaceCreate));
                }
                return typefaceCreate;
            }
            int i5 = 1;
            boolean z2 = !z ? dmVar != null : dr0Var.d != 0;
            int i6 = z ? dr0Var.c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            us1 us1Var = new us1(c, 21);
            us1Var.f = dmVar;
            tq0 tq0Var = dr0Var.b;
            tq0 tq0Var2 = dr0Var.a;
            if (tq0Var != null) {
                Object[] objArr = {tq0Var2, tq0Var};
                ArrayList arrayList = new ArrayList(2);
                int i7 = 0;
                while (true) {
                    typeface = null;
                    if (i7 >= 2) {
                        break;
                    }
                    Object obj = objArr[i7];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    i7++;
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                typeface = null;
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{tq0Var2}[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            eg2 eg2Var = new eg2(handler);
            d31 d31Var = new d31(i4, us1Var, eg2Var);
            if (!z2) {
                String strA = zq0.a(listUnmodifiableList, i3);
                Typeface typeface3 = (Typeface) zq0.a.c(strA);
                if (typeface3 != null) {
                    eg2Var.execute(new e7(4, us1Var, typeface3));
                    typeface2 = typeface3;
                } else {
                    xq0 xq0Var = new xq0(d31Var, c);
                    synchronized (zq0.c) {
                        try {
                            tv2 tv2Var = zq0.d;
                            ArrayList arrayList3 = (ArrayList) tv2Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(xq0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(xq0Var);
                                tv2Var.put(strA, arrayList4);
                                wq0 wq0Var = new wq0(strA, context, listUnmodifiableList, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = zq0.b;
                                xq0 xq0Var2 = new xq0(strA, i5);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                fg2 fg2Var = new fg2();
                                fg2Var.f = wq0Var;
                                fg2Var.g = xq0Var2;
                                fg2Var.h = handler2;
                                threadPoolExecutor.execute(fg2Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    typeface2 = typeface;
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    fo.i("Fallbacks with blocking fetches are not supported for performance reasons");
                    return typeface;
                }
                tq0 tq0Var3 = (tq0) listUnmodifiableList.get(0);
                mk1 mk1Var = zq0.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{tq0Var3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = zq0.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface4 = (Typeface) zq0.a.c(strA2);
                if (typeface4 != null) {
                    eg2Var.execute(new e7(4, us1Var, typeface4));
                    typeface2 = typeface4;
                } else if (i6 == -1) {
                    Object[] objArr2 = {tq0Var3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr2[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    yq0 yq0VarB = zq0.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    d31Var.B(yq0VarB);
                    typeface2 = yq0VarB.a;
                } else {
                    try {
                        try {
                            try {
                                yq0 yq0Var = (yq0) zq0.b.submit(new wq0(strA2, context, tq0Var3, i3, 0)).get(i6, TimeUnit.MILLISECONDS);
                                d31Var.B(yq0Var);
                                typeface2 = yq0Var.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((eg2) d31Var.g).execute(new hv((us1) d31Var.f, -3));
                        typeface2 = typeface;
                    }
                }
            }
            typefaceB = typeface2;
        } else {
            typefaceB = a.b(context, (br0) ar0Var, resources, i3);
            if (dmVar != null) {
                if (typefaceB != null) {
                    new Handler(Looper.getMainLooper()).post(new ub(i4, dmVar, typefaceB));
                } else {
                    dmVar.a(-3);
                }
            }
        }
        if (typefaceB != null) {
            b.d(b(resources, i, str, i2, i3), typefaceB);
        }
        return typefaceB;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
