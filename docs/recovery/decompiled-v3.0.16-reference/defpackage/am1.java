package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteGeometryKt;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteMatcher;
import com.vincenthzr.locationspoofer.data.model.EnvironmentAvailabilityKt;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class am1 {
    public static final p10 B;
    public static ah2 D;
    public static dy F;
    public static Method I;
    public static boolean J;
    public static final gt2 M;
    public static x01 N;
    public static x01 O;
    public static final go e;
    public static final go f;
    public static final u92 h;
    public static final u92 i;
    public static final p10 j;
    public static final p10 k;
    public static final p10 l;
    public static final p10 m;
    public static final p10 n;
    public static final p10 o;
    public static final p10 p;
    public static final p10 q;
    public static final p10 r;
    public static final p10 s;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final ho g = new ho();
    public static final p10 t = new p10(new a20(9), false, 1152169123);
    public static final p10 u = new p10(new a20(10), false, -1551066474);
    public static final p10 v = new p10(new a20(11), false, 1385562920);
    public static final p10 w = new p10(new c20(26), false, 28700820);
    public static final p10 x = new p10(new d20(18), false, 793174918);
    public static final p10 y = new p10(new d20(19), false, 22252607);
    public static final p10 z = new p10(new d20(20), false, 1316850751);
    public static final p10 A = new p10(new d20(21), false, -962289618);
    public static final ac0 C = new ac0(1.0f, 1.0f);
    public static final dy E = new dy(null, null, null);
    public static final StackTraceElement[] G = new StackTraceElement[0];
    public static final Object H = new Object();
    public static final pe2 K = new pe2(0.0f, 0.0f, 10.0f, 10.0f);
    public static final StackTraceElement[] L = new StackTraceElement[0];

    static {
        int i2 = 3;
        e = new go(i2);
        int i3 = 2;
        f = new go(i3);
        int i4 = 23;
        h = new u92(i4);
        int i5 = 24;
        i = new u92(i5);
        int i6 = 0;
        j = new p10(new r10(i3), false, 891281943);
        k = new p10(new r10(i2), false, -1658536460);
        int i7 = 29;
        l = new p10(new q10(i7), false, 2039741170);
        m = new p10(new s10(i6), false, -781047202);
        n = new p10(new s10(i4), false, -1914344498);
        int i8 = 22;
        o = new p10(new r10(i8), false, 585672487);
        p = new p10(new r10(i4), false, 701977462);
        q = new p10(new r10(i5), false, -128779425);
        r = new p10(new r10(i7), false, 1115015247);
        s = new p10(new b20(i6), false, 866120623);
        B = new p10(new d20(i8), false, -1037496514);
        M = new gt2(i2);
    }

    public static final dv1 A(dv1 dv1Var, float f2, float f3, float f4, float f5, long j2, au2 au2Var, boolean z2, long j3, long j4, rr rrVar) {
        return dv1Var.d(new lw0(f2, f3, f4, f5, j2, au2Var, z2, j3, j4, rrVar));
    }

    public static dv1 B(dv1 dv1Var, float f2, au2 au2Var, rr rrVar, int i2) {
        float f3 = (i2 & 1) != 0 ? 1.0f : 0.0f;
        float f4 = (i2 & 2) != 0 ? 1.0f : 0.0f;
        float f5 = (i2 & 4) != 0 ? 1.0f : f2;
        long j2 = ac3.b;
        au2 au2Var2 = (i2 & 2048) != 0 ? o51.p0 : au2Var;
        boolean z2 = (i2 & 4096) == 0;
        long j3 = pw0.a;
        return A(dv1Var, f3, f4, f5, 0.0f, j2, au2Var2, z2, j3, j3, (i2 & 262144) != 0 ? null : rrVar);
    }

    public static final boolean C(js2 js2Var) {
        xz1 xz1VarD = js2Var.d();
        zx1 zx1Var = js2Var.d.e;
        return (xz1VarD != null ? xz1VarD.B1() : false) || zx1Var.c(os2.q) || zx1Var.c(os2.p);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean D(js2 js2Var) {
        if (!C(js2Var)) {
            es2 es2Var = js2Var.d;
            if (es2Var.g) {
                return true;
            }
            zx1 zx1Var = es2Var.e;
            Object[] objArr = zx1Var.b;
            Object[] objArr2 = zx1Var.c;
            long[] jArr = zx1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((rs2) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static final dv1 E(dv1 dv1Var, ja1 ja1Var) {
        dv1Var.getClass();
        ja1Var.getClass();
        return dv1Var.d(new ka1(ja1Var));
    }

    public static List F(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List G(Object... objArr) {
        if (objArr.length <= 0) {
            return uj0.e;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:68:0x0156 A[PHI: r0 r3
      0x0156: PHI (r0v6 com.vincenthzr.locationspoofer.data.model.RoutePoint) = 
      (r0v3 com.vincenthzr.locationspoofer.data.model.RoutePoint)
      (r0v3 com.vincenthzr.locationspoofer.data.model.RoutePoint)
      (r0v8 com.vincenthzr.locationspoofer.data.model.RoutePoint)
     binds: [B:60:0x012e, B:62:0x013a, B:67:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r3v6 ul1) = (r3v4 ul1), (r3v4 ul1), (r3v7 ul1) binds: [B:60:0x012e, B:62:0x013a, B:67:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object H(ul1 ul1Var, r60 r60Var) {
        xl1 xl1Var;
        CloudAccountState value;
        ul1 ul1Var2;
        RoutePoint routePoint;
        RoutePoint routePoint2;
        CloudAccountState cloudAccountState;
        MutableStateFlow mutableStateFlow;
        CloudAccountState value2;
        CloudAccount account;
        String id;
        CloudAccount account2;
        String id2;
        ul1 ul1Var3;
        if (r60Var instanceof xl1) {
            xl1Var = (xl1) r60Var;
            int i2 = xl1Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xl1Var.i = i2 - Integer.MIN_VALUE;
            } else {
                xl1Var = new xl1(r60Var);
            }
        } else {
            xl1Var = new xl1(r60Var);
        }
        xl1 xl1Var2 = xl1Var;
        Object obj = xl1Var2.h;
        int i3 = xl1Var2.i;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (i3 != 0) {
            if (i3 == 1) {
                cloudAccountState = xl1Var2.g;
                routePoint2 = xl1Var2.f;
                ul1Var2 = xl1Var2.e;
                ee0.J(obj);
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                routePoint = xl1Var2.f;
                ul1Var3 = xl1Var2.e;
                ee0.J(obj);
            }
            ul1Var2 = ul1Var3;
            double lat = routePoint.getLat();
            double lng = routePoint.getLng();
            xl1Var2.e = null;
            xl1Var2.f = null;
            xl1Var2.g = null;
            xl1Var2.i = 3;
            return rm1.b(ul1Var2, lat, lng, xl1Var2) == z70Var ? z70Var : mf3Var;
        }
        ee0.J(obj);
        MutableStateFlow mutableStateFlow2 = ul1Var.x;
        RoutePoint routePoint3 = (RoutePoint) zy.o0(((AppState) mutableStateFlow2.getValue()).getRoutePoints());
        if (routePoint3 != null) {
            value = ul1Var.k.getAccountState().getValue();
            if (value.getValidated() && EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) mutableStateFlow2.getValue(), routePoint3.getLat(), routePoint3.getLng())) {
                AppState appState = (AppState) mutableStateFlow2.getValue();
                if (appState.getCloudWifiConfigured()) {
                    CloudAccount account3 = value.getAccount();
                    if (o51.f(account3 != null ? account3.getPlan() : null, "pro") && !appState.getCanMockWifi()) {
                        double lat2 = routePoint3.getLat();
                        double lng2 = routePoint3.getLng();
                        xl1Var2.e = ul1Var;
                        xl1Var2.f = routePoint3;
                        xl1Var2.g = value;
                        xl1Var2.i = 1;
                        if (rm1.e(ul1Var, lat2, lng2, xl1Var2) != z70Var) {
                            ul1Var2 = ul1Var;
                            routePoint2 = routePoint3;
                            cloudAccountState = value;
                        }
                    }
                }
                ul1Var2 = ul1Var;
                routePoint = routePoint3;
                CloudGeoRepository cloudGeoRepository = ul1Var2.k;
                mutableStateFlow = ul1Var2.x;
                value2 = cloudGeoRepository.getAccountState().getValue();
                if (value2.getValidated()) {
                    account = value2.getAccount();
                    if (account != null) {
                        id = account.getId();
                    } else {
                        id = null;
                    }
                    account2 = value.getAccount();
                    if (account2 != null) {
                        id2 = account2.getId();
                    } else {
                        id2 = null;
                    }
                    if (o51.f(id, id2) && EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) mutableStateFlow.getValue(), routePoint.getLat(), routePoint.getLng())) {
                        if (((AppState) mutableStateFlow.getValue()).getCloudCellsConfigured() || ((AppState) mutableStateFlow.getValue()).getCanMockCell()) {
                            double lat3 = routePoint.getLat();
                            double lng3 = routePoint.getLng();
                            xl1Var2.e = null;
                            xl1Var2.f = null;
                            xl1Var2.g = null;
                            xl1Var2.i = 3;
                            if (rm1.b(ul1Var2, lat3, lng3, xl1Var2) == z70Var) {
                            }
                        } else {
                            double lat4 = routePoint.getLat();
                            double lng4 = routePoint.getLng();
                            xl1Var2.e = ul1Var2;
                            xl1Var2.f = routePoint;
                            xl1Var2.g = null;
                            xl1Var2.i = 2;
                            if (rm1.c(ul1Var2, lat4, lng4, xl1Var2) != z70Var) {
                                ul1Var3 = ul1Var2;
                                ul1Var2 = ul1Var3;
                                double lat5 = routePoint.getLat();
                                double lng5 = routePoint.getLng();
                                xl1Var2.e = null;
                                xl1Var2.f = null;
                                xl1Var2.g = null;
                                xl1Var2.i = 3;
                                if (rm1.b(ul1Var2, lat5, lng5, xl1Var2) == z70Var) {
                                }
                            }
                        }
                    }
                }
            }
        }
        value = cloudAccountState;
        routePoint = routePoint2;
        CloudGeoRepository cloudGeoRepository2 = ul1Var2.k;
        mutableStateFlow = ul1Var2.x;
        value2 = cloudGeoRepository2.getAccountState().getValue();
        if (value2.getValidated()) {
            account = value2.getAccount();
            if (account != null) {
                id = account.getId();
            } else {
                id = null;
            }
            account2 = value.getAccount();
            if (account2 != null) {
                id2 = account2.getId();
            } else {
                id2 = null;
            }
            if (o51.f(id, id2)) {
                if (((AppState) mutableStateFlow.getValue()).getCloudCellsConfigured()) {
                    double lat6 = routePoint.getLat();
                    double lng6 = routePoint.getLng();
                    xl1Var2.e = null;
                    xl1Var2.f = null;
                    xl1Var2.g = null;
                    xl1Var2.i = 3;
                    if (rm1.b(ul1Var2, lat6, lng6, xl1Var2) == z70Var) {
                    }
                } else {
                    double lat7 = routePoint.getLat();
                    double lng7 = routePoint.getLng();
                    xl1Var2.e = null;
                    xl1Var2.f = null;
                    xl1Var2.g = null;
                    xl1Var2.i = 3;
                    if (rm1.b(ul1Var2, lat7, lng7, xl1Var2) == z70Var) {
                    }
                }
            }
        }
    }

    public static ArrayList I(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lo(objArr, true));
    }

    public static final List J(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : F(list.get(0));
        }
        return uj0.e;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0067 A[EDGE_INSN: B:109:0x0067->B:22:0x0067 BREAK  A[LOOP:2: B:16:0x0049->B:20:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:2: B:16:0x0049->B:20:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    public static vu K(ox0 ox0Var) {
        int i2;
        int length;
        int length2;
        int i3;
        String string;
        String string2;
        ox0 ox0Var2 = ox0Var;
        int size = ox0Var2.size();
        int i4 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iW = -1;
        int iW2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iW3 = -1;
        int iW4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i4 < size) {
            String strB = ox0Var2.b(i4);
            String strD = ox0Var2.d(i4);
            if (s13.T(strB, "Cache-Control")) {
                if (str == null) {
                    str = strD;
                }
                i2 = 0;
                while (i2 < strD.length()) {
                    length = strD.length();
                    length2 = i2;
                    while (true) {
                        if (length2 < length) {
                            i3 = size;
                            length2 = strD.length();
                            break;
                        }
                        i3 = size;
                        if (l13.d0("=,;", strD.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i3;
                    }
                    string = l13.D0(strD.substring(i2, length2)).toString();
                    if (length2 != strD.length() || strD.charAt(length2) == ',' || strD.charAt(length2) == ';') {
                        i2 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = bh3.a;
                        int length4 = strD.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strD.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strD.length();
                                break;
                            }
                        }
                        if (length3 >= strD.length() || strD.charAt(length3) != '\"') {
                            int length5 = strD.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strD.length();
                                    break;
                                }
                                int i5 = length5;
                                if (l13.d0(",;", strD.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i5;
                            }
                            int i6 = length6;
                            string2 = l13.D0(strD.substring(length3, length6)).toString();
                            i2 = i6;
                        } else {
                            int i7 = length3 + 1;
                            int iH0 = l13.h0(strD, '\"', i7, 4);
                            string2 = strD.substring(i7, iH0);
                            i2 = iH0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iW = bh3.w(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iW2 = bh3.w(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iW3 = bh3.w(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iW4 = bh3.w(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z9 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z10 = true;
                    }
                    size = i3;
                }
                i4++;
                ox0Var2 = ox0Var;
                size = size;
            } else {
                if (s13.T(strB, "Pragma")) {
                }
                i4++;
                ox0Var2 = ox0Var;
                size = size;
            }
            z2 = false;
            i2 = 0;
            while (i2 < strD.length()) {
                length = strD.length();
                length2 = i2;
                while (true) {
                    if (length2 < length) {
                        i3 = size;
                        length2 = strD.length();
                        break;
                    }
                    i3 = size;
                    if (l13.d0("=,;", strD.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i3;
                }
                string = l13.D0(strD.substring(i2, length2)).toString();
                if (length2 != strD.length()) {
                    i2 = length2 + 1;
                    string2 = null;
                } else {
                    i2 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iW = bh3.w(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iW2 = bh3.w(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iW3 = bh3.w(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iW4 = bh3.w(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z9 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z10 = true;
                }
                size = i3;
            }
            i4++;
            ox0Var2 = ox0Var;
            size = size;
        }
        return new vu(z3, z4, iW, iW2, z5, z6, z7, iW3, iW4, z8, z9, z10, !z2 ? null : str);
    }

    public static String L(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        uu uuVar = uu.h;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        zm3.j(encoded.length, 0L, length);
        int i2 = 0;
        byte[] bArrQ0 = yo.q0(encoded, 0, length);
        uu uuVar2 = new uu(bArrQ0);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrQ0, 0, uuVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        new uu(bArrDigest);
        byte[] bArr = d.a;
        bArr.getClass();
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = bArrDigest[i2];
            int i4 = i2 + 2;
            byte b3 = bArrDigest[i2 + 1];
            i2 += 3;
            byte b4 = bArrDigest[i4];
            bArr2[i3] = bArr[(b2 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b4 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b5 = bArrDigest[i2];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[i3 + 1] = bArr[(b5 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b6 = bArrDigest[i2];
            byte b7 = bArrDigest[i6];
            bArr2[i3] = bArr[(b6 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        sb.append(new String(bArr2, sw.a));
        return sb.toString();
    }

    public static void M(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void N(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static final void Q(ul1 ul1Var, long j2, String str, String str2, boolean z2, au0 au0Var) {
        ul1Var.getClass();
        ul1 ul1Var2 = ul1Var;
        MutableStateFlow mutableStateFlow = ul1Var2.x;
        if (((AppState) mutableStateFlow.getValue()).isSavingCollectionInfo() || l13.k0(str)) {
            return;
        }
        while (true) {
            Object value = mutableStateFlow.getValue();
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, true, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -134217729, 134217727, null))) {
                BuildersKt__Builders_commonKt.launch$default(y(ul1Var2), null, null, new zl1(ul1Var2, au0Var, j2, str, str2, z2, null), 3, null);
                return;
            }
            ul1Var2 = ul1Var;
        }
    }

    public static final void R(ul1 ul1Var, long j2) {
        Object next;
        z60 z60Var;
        Object value;
        AppState appState;
        String strValueOf;
        String strValueOf2;
        ArrayList arrayList;
        ul1Var.getClass();
        Iterator it = ((Iterable) ul1Var.v.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CompleteCollectionRoute) next).getRoute().getId() != j2);
        CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) next;
        if (completeCollectionRoute == null || (z60Var = (z60) zy.o0(CollectionRouteGeometryKt.geometry(completeCollectionRoute.getRoute()))) == null) {
            return;
        }
        ul1Var.E = null;
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
            appState = (AppState) value;
            strValueOf = String.valueOf(z60Var.a);
            strValueOf2 = String.valueOf(z60Var.b);
            List<z60> listGeometry = CollectionRouteGeometryKt.geometry(completeCollectionRoute.getRoute());
            arrayList = new ArrayList(az.Y(listGeometry, 10));
            for (z60 z60Var2 : listGeometry) {
                arrayList.add(new RoutePoint(z60Var2.a, z60Var2.b, 0.0d, 4, (ca0) null));
            }
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, strValueOf2, strValueOf, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, arrayList, RoutePlanStage.READY, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, Long.valueOf(j2), 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -201326593, -66305, 33554430, null)));
        rm1.a(ul1Var);
    }

    public static final void S(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void T(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final void U(ul1 ul1Var, boolean z2) {
        Object value;
        AppState appState;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        if (((AppState) mutableStateFlow.getValue()).isContinuousScanning() || ((AppState) mutableStateFlow.getValue()).isStoppingCollection()) {
            return;
        }
        do {
            value = mutableStateFlow.getValue();
            appState = (AppState) value;
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, z2, z2 && appState.getCollectionRoutePoints().size() < 2, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -805306369, 134217727, null)));
    }

    public static jo V(float f2) {
        return new jo(f2, true, new fo(0));
    }

    public static void W() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void X() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ti a(int i2, float f2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new ti(o51.v0, Float.valueOf(0.0f), new ui(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(final ul1 ul1Var, final AppState appState, final boolean z2, final au0 au0Var, final au0 au0Var2, f30 f30Var, int i2) {
        ov0 ov0Var;
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-2064265656);
        int i3 = i2 | (ov0Var2.h(ul1Var) ? 4 : 2) | (ov0Var2.h(appState) ? 32 : 16) | (ov0Var2.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.h(au0Var2) ? 16384 : 8192);
        if (ov0Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            final long j2 = z2 ? bk.c : bk.f;
            ov0Var = ov0Var2;
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(945589303, new qu0() { // from class: v60
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    char c2;
                    char c3;
                    long j3;
                    float f2;
                    go goVar;
                    gh ghVar;
                    wa waVar;
                    gh ghVar2;
                    float f3;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    char c4;
                    char c5;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((zz) obj).getClass();
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        av1 av1Var = av1.a;
                        dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                        ho hoVar = am1.g;
                        nr nrVar = j9.r;
                        yz yzVarA = wz.a(hoVar, nrVar, ov0Var3, 0);
                        int iHashCode = Long.hashCode(ov0Var3.T);
                        l72 l72VarL = ov0Var3.l();
                        dv1 dv1VarH = xp1.H(ov0Var3, dv1VarE);
                        w20.b.getClass();
                        x30 x30Var = v20.b;
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        gh ghVar3 = v20.e;
                        q73.h(ov0Var3, ghVar3, yzVarA);
                        gh ghVar4 = v20.d;
                        q73.h(ov0Var3, ghVar4, l72VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        gh ghVar5 = v20.f;
                        q73.h(ov0Var3, ghVar5, numValueOf);
                        wa waVar2 = v20.g;
                        q73.g(ov0Var3, waVar2);
                        gh ghVar6 = v20.c;
                        q73.h(ov0Var3, ghVar6, dv1VarH);
                        or orVar = j9.p;
                        go goVar2 = am1.e;
                        kk2 kk2VarA = jk2.a(goVar2, orVar, ov0Var3, 48);
                        int iHashCode2 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL2 = ov0Var3.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var3, av1Var);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar3, kk2VarA);
                        q73.h(ov0Var3, ghVar4, l72VarL2);
                        az2.s(iHashCode2, ov0Var3, ghVar5, ov0Var3, waVar2);
                        q73.h(ov0Var3, ghVar6, dv1VarH2);
                        x01 x01VarB = ce0.c;
                        if (x01VarB != null) {
                            c2 = 26214;
                            c3 = 0;
                        } else {
                            w01 w01Var = new w01("Outlined.PinDrop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = nh3.a;
                            long j4 = hz.b;
                            qy2 qy2Var = new qy2(j4);
                            nx0 nx0Var = new nx0(3);
                            nx0Var.m(12.0f, 4.0f);
                            nx0Var.g(1.93f, 0.0f, 5.0f, 1.4f, 5.0f, 5.15f);
                            nx0Var.g(0.0f, 2.16f, -1.72f, 4.67f, -5.0f, 7.32f);
                            nx0Var.g(-3.28f, -2.65f, -5.0f, -5.17f, -5.0f, -7.32f);
                            nx0Var.f(7.0f, 5.4f, 10.07f, 4.0f, 12.0f, 4.0f);
                            y62 y62Var = new y62(0.0f, -2.0f);
                            ArrayList arrayList = nx0Var.a;
                            arrayList.add(y62Var);
                            nx0Var.f(8.73f, 2.0f, 5.0f, 4.46f, 5.0f, 9.15f);
                            nx0Var.g(0.0f, 3.12f, 2.33f, 6.41f, 7.0f, 9.85f);
                            nx0Var.g(4.67f, -3.44f, 7.0f, -6.73f, 7.0f, -9.85f);
                            nx0Var.f(19.0f, 4.46f, 15.27f, 2.0f, 12.0f, 2.0f);
                            nx0Var.e();
                            w01.a(w01Var, arrayList, qy2Var);
                            qy2 qy2Var2 = new qy2(j4);
                            nx0 nx0VarI = p91.i(12.0f, 7.0f);
                            nx0VarI.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            c2 = 26214;
                            nx0VarI.o(0.9f, 2.0f, 2.0f, 2.0f);
                            nx0VarI.b(2.0f, 2.0f, true, false, 0.0f, -4.0f);
                            nx0VarI.e();
                            c3 = 0;
                            nx0VarI.m(5.0f, 20.0f);
                            nx0VarI.i(14.0f);
                            nx0VarI.s(2.0f);
                            nx0VarI.h(5.0f);
                            nx0VarI.s(-2.0f);
                            nx0VarI.e();
                            w01.a(w01Var, nx0VarI.a, qy2Var2);
                            x01VarB = w01Var.b();
                            ce0.c = x01VarB;
                        }
                        String strN = ke0.N(2131625113, ov0Var3);
                        boolean z6 = z2;
                        ee0.l(x01VarB, strN, z6, ov0Var3, 0);
                        lk2 lk2Var = lk2.a;
                        gh0.h(ov0Var3, lk2.a(lk2Var, av1Var, 1.0f));
                        n51.j(au0Var2, null, false, null, null, new b52(10.0f, 4.0f, 10.0f, 4.0f), n51.s, ov0Var3, 817889280, 382);
                        gh0.h(ov0Var3, iw2.o(av1Var, 4.0f));
                        n51.j(au0Var, null, false, null, null, new b52(10.0f, 4.0f, 10.0f, 4.0f), n51.t, ov0Var3, 817889280, 382);
                        ov0Var3.p(true);
                        gh0.h(ov0Var3, iw2.g(av1Var, 10.0f));
                        jo joVar = new jo(10.0f, true, new fo(0));
                        dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                        kk2 kk2VarA2 = jk2.a(joVar, orVar, ov0Var3, 54);
                        int iHashCode3 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL3 = ov0Var3.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarE2);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar3, kk2VarA2);
                        q73.h(ov0Var3, ghVar4, l72VarL3);
                        az2.s(iHashCode3, ov0Var3, ghVar5, ov0Var3, waVar2);
                        q73.h(ov0Var3, ghVar6, dv1VarH3);
                        dv1 dv1VarN = xp1.n(lk2.a(lk2Var, av1Var, 1.0f), cj2.a(12.0f));
                        long jC = z6 ? hz.c(0.06f, hz.c) : hz.c(0.04f, hz.b);
                        iy0 iy0Var = o51.p0;
                        dv1 dv1VarE3 = zm3.E(xp1.k(dv1VarN, jC, iy0Var), 12.0f, 8.0f);
                        pr prVar = j9.f;
                        er1 er1VarC = ws.c(prVar, false);
                        int iHashCode4 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL4 = ov0Var3.l();
                        dv1 dv1VarH4 = xp1.H(ov0Var3, dv1VarE3);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar3, er1VarC);
                        q73.h(ov0Var3, ghVar4, l72VarL4);
                        az2.s(iHashCode4, ov0Var3, ghVar5, ov0Var3, waVar2);
                        q73.h(ov0Var3, ghVar6, dv1VarH4);
                        yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var3, 0);
                        int iHashCode5 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL5 = ov0Var3.l();
                        dv1 dv1VarH5 = xp1.H(ov0Var3, av1Var);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar3, yzVarA2);
                        q73.h(ov0Var3, ghVar4, l72VarL5);
                        az2.s(iHashCode5, ov0Var3, ghVar5, ov0Var3, waVar2);
                        q73.h(ov0Var3, ghVar6, dv1VarH5);
                        String strN2 = ke0.N(2131624591, ov0Var3);
                        long jC2 = v63.c(11);
                        long j5 = j2;
                        s83.b(strN2, null, j5, jC2, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                        AppState appState2 = appState;
                        String longitudeInput = appState2.getLongitudeInput();
                        if (longitudeInput.length() == 0) {
                            longitudeInput = "0.0";
                        }
                        hh0 hh0Var = mz.a;
                        long j6 = ((kz) ov0Var3.j(hh0Var)).q;
                        long jC3 = v63.c(14);
                        jr0 jr0Var = jr0.i;
                        s83.b(longitudeInput, null, j6, jC3, jr0Var, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var3, 1597440, 24576, 245674);
                        ov0Var3.p(true);
                        ov0Var3.p(true);
                        dv1 dv1VarN2 = xp1.n(lk2.a(lk2Var, av1Var, 1.0f), cj2.a(12.0f));
                        if (z6) {
                            j3 = hz.c;
                            f2 = 0.06f;
                        } else {
                            j3 = hz.b;
                            f2 = 0.04f;
                        }
                        dv1 dv1VarE4 = zm3.E(xp1.k(dv1VarN2, hz.c(f2, j3), iy0Var), 12.0f, 8.0f);
                        er1 er1VarC2 = ws.c(prVar, false);
                        int iHashCode6 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL6 = ov0Var3.l();
                        dv1 dv1VarH6 = xp1.H(ov0Var3, dv1VarE4);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar3, er1VarC2);
                        q73.h(ov0Var3, ghVar4, l72VarL6);
                        az2.s(iHashCode6, ov0Var3, ghVar5, ov0Var3, waVar2);
                        q73.h(ov0Var3, ghVar6, dv1VarH6);
                        yz yzVarA3 = wz.a(hoVar, nrVar, ov0Var3, 0);
                        int iHashCode7 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL7 = ov0Var3.l();
                        dv1 dv1VarH7 = xp1.H(ov0Var3, av1Var);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar3, yzVarA3);
                        q73.h(ov0Var3, ghVar4, l72VarL7);
                        az2.s(iHashCode7, ov0Var3, ghVar5, ov0Var3, waVar2);
                        q73.h(ov0Var3, ghVar6, dv1VarH7);
                        s83.b(ke0.N(2131624575, ov0Var3), null, j5, v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                        String latitudeInput = appState2.getLatitudeInput();
                        if (latitudeInput.length() == 0) {
                            latitudeInput = "0.0";
                        }
                        s83.b(latitudeInput, null, ((kz) ov0Var3.j(hh0Var)).q, v63.c(14), jr0Var, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var3, 1597440, 24576, 245674);
                        ov0 ov0Var4 = ov0Var3;
                        ov0Var4.p(true);
                        ov0Var4.p(true);
                        ov0Var4.p(true);
                        if (appState2.getPinnedCollectedLocationId() != null) {
                            ov0Var4.c0(420023634);
                            gh0.h(ov0Var4, iw2.g(av1Var, 10.0f));
                            dv1 dv1VarN3 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(10.0f));
                            long j7 = bk.g;
                            dv1 dv1VarE5 = zm3.E(ji2.w(xp1.k(dv1VarN3, hz.c(0.1f, j7), iy0Var), 0.8f, hz.c(0.35f, j7), cj2.a(10.0f)), 10.0f, 6.0f);
                            er1 er1VarC3 = ws.c(prVar, false);
                            int iHashCode8 = Long.hashCode(ov0Var4.T);
                            l72 l72VarL8 = ov0Var4.l();
                            dv1 dv1VarH8 = xp1.H(ov0Var4, dv1VarE5);
                            ov0Var4.g0();
                            if (ov0Var4.S) {
                                ov0Var4.k(x30Var);
                            } else {
                                ov0Var4.p0();
                            }
                            q73.h(ov0Var4, ghVar3, er1VarC3);
                            q73.h(ov0Var4, ghVar4, l72VarL8);
                            ghVar = ghVar5;
                            az2.s(iHashCode8, ov0Var4, ghVar, ov0Var4, waVar2);
                            q73.h(ov0Var4, ghVar6, dv1VarH8);
                            dv1 dv1VarE6 = iw2.e(av1Var, 1.0f);
                            kk2 kk2VarA3 = jk2.a(goVar2, orVar, ov0Var4, 48);
                            int iHashCode9 = Long.hashCode(ov0Var4.T);
                            l72 l72VarL9 = ov0Var4.l();
                            dv1 dv1VarH9 = xp1.H(ov0Var4, dv1VarE6);
                            ov0Var4.g0();
                            if (ov0Var4.S) {
                                ov0Var4.k(x30Var);
                            } else {
                                ov0Var4.p0();
                            }
                            q73.h(ov0Var4, ghVar3, kk2VarA3);
                            q73.h(ov0Var4, ghVar4, l72VarL9);
                            az2.s(iHashCode9, ov0Var4, ghVar, ov0Var4, waVar2);
                            q73.h(ov0Var4, ghVar6, dv1VarH9);
                            x01 x01VarB2 = vd0.e;
                            if (x01VarB2 != null) {
                                c4 = 0;
                                c5 = 0;
                            } else {
                                w01 w01Var2 = new w01("Rounded.PinDrop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i5 = nh3.a;
                                qy2 qy2Var3 = new qy2(hz.b);
                                nx0 nx0Var2 = new nx0(3);
                                nx0Var2.m(6.0f, 20.0f);
                                nx0Var2.i(12.0f);
                                nx0Var2.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                                nx0Var2.o(-0.45f, 1.0f, -1.0f, 1.0f);
                                nx0Var2.h(6.0f);
                                nx0Var2.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                                nx0Var2.n(5.45f, 20.0f, 6.0f, 20.0f);
                                nx0Var2.e();
                                c4 = 0;
                                nx0Var2.m(12.0f, 7.0f);
                                nx0Var2.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                nx0Var2.o(0.9f, 2.0f, 2.0f, 2.0f);
                                nx0Var2.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                nx0Var2.n(13.1f, 7.0f, 12.0f, 7.0f);
                                nx0Var2.e();
                                c5 = 0;
                                nx0Var2.m(12.0f, 2.0f);
                                nx0Var2.g(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f);
                                nx0Var2.g(0.0f, 2.98f, -2.13f, 6.12f, -6.39f, 9.39f);
                                nx0Var2.g(-0.36f, 0.28f, -0.86f, 0.28f, -1.22f, 0.0f);
                                nx0Var2.f(7.13f, 15.26f, 5.0f, 12.13f, 5.0f, 9.15f);
                                nx0Var2.f(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f);
                                nx0Var2.e();
                                w01.a(w01Var2, nx0Var2.a, qy2Var3);
                                x01VarB2 = w01Var2.b();
                                vd0.e = x01VarB2;
                            }
                            goVar = goVar2;
                            t01.a(x01VarB2, null, iw2.k(av1Var, 15.0f), j7, ov0Var4, 3504, 0);
                            gh0.h(ov0Var4, iw2.o(av1Var, 6.0f));
                            String pinnedLocationName = appState2.getPinnedLocationName();
                            if (pinnedLocationName == null) {
                                pinnedLocationName = "";
                            }
                            f3 = 20.0f;
                            s83.b(ke0.O(2131624816, new Object[]{pinnedLocationName}, ov0Var4), lk2.a(lk2Var, av1Var, 1.0f), j7, v63.c(12), jr0Var, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var4, 1597824, 24960, 241576);
                            ov0Var4 = ov0Var4;
                            dv1 dv1VarK = xp1.k(xp1.n(iw2.k(av1Var, 20.0f), cj2.a), hz.c(0.15f, j7), iy0Var);
                            ul1 ul1Var2 = ul1Var;
                            boolean zH = ov0Var4.h(ul1Var2);
                            Object objQ = ov0Var4.Q();
                            if (zH || objQ == d30.a) {
                                objQ = new m6(ul1Var2, 3);
                                ov0Var4.m0(objQ);
                            }
                            dv1 dv1VarA = bk.a(dv1VarK, (au0) objQ);
                            er1 er1VarC4 = ws.c(j9.j, false);
                            int iHashCode10 = Long.hashCode(ov0Var4.T);
                            l72 l72VarL10 = ov0Var4.l();
                            dv1 dv1VarH10 = xp1.H(ov0Var4, dv1VarA);
                            ov0Var4.g0();
                            if (ov0Var4.S) {
                                ov0Var4.k(x30Var);
                            } else {
                                ov0Var4.p0();
                            }
                            q73.h(ov0Var4, ghVar3, er1VarC4);
                            q73.h(ov0Var4, ghVar4, l72VarL10);
                            waVar = waVar2;
                            az2.s(iHashCode10, ov0Var4, ghVar, ov0Var4, waVar);
                            q73.h(ov0Var4, ghVar6, dv1VarH10);
                            ghVar2 = ghVar6;
                            t01.a(k22.u(), ke0.N(2131625125, ov0Var4), iw2.k(av1Var, 12.0f), j7, ov0Var4, 3456, 0);
                            ov0Var4.p(true);
                            ov0Var4.p(true);
                            ov0Var4.p(true);
                            z3 = false;
                        } else {
                            goVar = goVar2;
                            ghVar = ghVar5;
                            waVar = waVar2;
                            ghVar2 = ghVar6;
                            f3 = 20.0f;
                            z3 = false;
                            ov0Var4.c0(414183265);
                        }
                        ov0Var4.p(z3);
                        if (appState2.getShowCoordinateError()) {
                            ov0Var4.c0(422411967);
                            gh0.h(ov0Var4, iw2.g(av1Var, 10.0f));
                            kk2 kk2VarA4 = jk2.a(goVar, orVar, ov0Var4, 48);
                            int iHashCode11 = Long.hashCode(ov0Var4.T);
                            l72 l72VarL11 = ov0Var4.l();
                            dv1 dv1VarH11 = xp1.H(ov0Var4, av1Var);
                            ov0Var4.g0();
                            if (ov0Var4.S) {
                                ov0Var4.k(x30Var);
                            } else {
                                ov0Var4.p0();
                            }
                            q73.h(ov0Var4, ghVar3, kk2VarA4);
                            q73.h(ov0Var4, ghVar4, l72VarL11);
                            az2.s(iHashCode11, ov0Var4, ghVar, ov0Var4, waVar);
                            q73.h(ov0Var4, ghVar2, dv1VarH11);
                            x01 x01VarB3 = ld0.a;
                            if (x01VarB3 == null) {
                                w01 w01Var3 = new w01("Outlined.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i6 = nh3.a;
                                qy2 qy2Var4 = new qy2(hz.b);
                                nx0 nx0Var3 = new nx0(3);
                                nx0Var3.m(11.0f, 15.0f);
                                nx0Var3.i(2.0f);
                                nx0Var3.s(2.0f);
                                nx0Var3.i(-2.0f);
                                nx0Var3.s(-2.0f);
                                nx0Var3.e();
                                nx0Var3.m(11.0f, 7.0f);
                                nx0Var3.i(2.0f);
                                nx0Var3.s(6.0f);
                                nx0Var3.i(-2.0f);
                                nx0Var3.k(11.0f, 7.0f);
                                nx0Var3.e();
                                nx0Var3.m(11.99f, 2.0f);
                                nx0Var3.f(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                nx0Var3.o(4.47f, 10.0f, 9.99f, 10.0f);
                                nx0Var3.f(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                nx0Var3.n(17.52f, 2.0f, 11.99f, 2.0f);
                                nx0Var3.e();
                                nx0Var3.m(12.0f, f3);
                                nx0Var3.g(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                                nx0Var3.o(3.58f, -8.0f, 8.0f, -8.0f);
                                nx0Var3.o(8.0f, 3.58f, 8.0f, 8.0f);
                                nx0Var3.o(-3.58f, 8.0f, -8.0f, 8.0f);
                                nx0Var3.e();
                                w01.a(w01Var3, nx0Var3.a, qy2Var4);
                                x01VarB3 = w01Var3.b();
                                ld0.a = x01VarB3;
                            }
                            t01.a(x01VarB3, null, iw2.k(av1Var, 14.0f), ((kz) ov0Var4.j(hh0Var)).w, ov0Var4, 432, 0);
                            ov0 ov0Var5 = ov0Var4;
                            s83.b(az2.i(av1Var, 4.0f, ov0Var4, 2131624565, ov0Var4), null, ((kz) ov0Var4.j(hh0Var)).w, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                            ov0Var4 = ov0Var5;
                            z4 = true;
                            ov0Var4.p(true);
                            z5 = false;
                        } else {
                            z4 = true;
                            z5 = false;
                            ov0Var4.c0(414183265);
                        }
                        ov0Var4.p(z5);
                        ov0Var4.p(z4);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var2), ov0Var, 25014, 8);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new w4(ul1Var, appState, z2, au0Var, au0Var2, i2, 5);
        }
    }

    public static final dv1 c(dv1 dv1Var, float f2) {
        return f2 == 1.0f ? dv1Var : B(dv1Var, f2, null, null, 520187);
    }

    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lo(objArr, true));
    }

    public static int e(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            b81.e(size, size2, ") is greater than size (", "toIndex (");
            return 0;
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iV = ym3.v((Comparable) arrayList.get(i4), comparable);
            if (iV < 0) {
                i2 = i4 + 1;
            } else {
                if (iV <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static mg1 f(List list) {
        list.getClass();
        mg1 mg1Var = (mg1) list;
        mg1Var.f();
        mg1Var.g = true;
        return mg1Var.f > 0 ? mg1Var : mg1.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(bl2 bl2Var, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (bl2Var != 0) {
            if (th != null) {
                try {
                    az2.u(bl2Var);
                    return;
                } catch (Throwable th2) {
                    vd0.d(th, th2);
                    return;
                }
            }
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
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final t63 k(ov0 ov0Var) {
        long j2 = bk.g;
        hh0 hh0Var = mz.a;
        long j3 = ((kz) ov0Var.j(hh0Var)).A;
        long jC = hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).o);
        long j4 = ((kz) ov0Var.j(hh0Var)).o;
        long j5 = ((kz) ov0Var.j(hh0Var)).o;
        long j6 = hz.f;
        return j9.k(j4, j5, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).o), j6, j6, j6, j2, j2, j3, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).A), j2, jC, ov0Var, 2122303112);
    }

    public static ti l(ti tiVar, float f2) {
        float f3 = ((ui) tiVar.g).a;
        return new ti(tiVar.e, Float.valueOf(f2), new ui(f3), tiVar.h, tiVar.i, tiVar.j);
    }

    public static vq0 m(Context context) {
        ProviderInfo providerInfo;
        tq0 tq0Var;
        ApplicationInfo applicationInfo;
        int i2 = 14;
        c30 ia0Var = Build.VERSION.SDK_INT >= 28 ? new ia0(i2) : new c30(i2);
        PackageManager packageManager = context.getPackageManager();
        ig0.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            tq0Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrC = ia0Var.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrC) {
                    arrayList.add(signature.toByteArray());
                }
                tq0Var = new tq0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                tq0Var = null;
            }
        }
        if (tq0Var == null) {
            return null;
        }
        return new vq0(new uq0(context, tq0Var));
    }

    public static mg1 n() {
        return new mg1(10);
    }

    public static final List o(ul1 ul1Var, double d2, double d3) {
        z60 z60Var = new z60(d2, d3);
        List<CompleteCollectionRoute> list = (List) ul1Var.v.getValue();
        Long selectedCollectionRouteId = ((AppState) ul1Var.x.getValue()).getSelectedCollectionRouteId();
        CollectionRouteMatcher collectionRouteMatcher = CollectionRouteMatcher.INSTANCE;
        CompleteCollectionRoute completeCollectionRouteRouteAt = collectionRouteMatcher.routeAt(list, z60Var, selectedCollectionRouteId);
        if (completeCollectionRouteRouteAt != null) {
            return collectionRouteMatcher.samplesAt(completeCollectionRouteRouteAt, z60Var);
        }
        Iterable iterable = (Iterable) ul1Var.w.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            CompleteLocation completeLocation = (CompleteLocation) obj;
            if (completeLocation.getLocation().getCollectionRouteId() == null && vd0.o(z60Var, new z60(completeLocation.getLocation().getLat(), completeLocation.getLocation().getLng())) <= 50.0d) {
                arrayList.add(obj);
            }
        }
        return zy.C0(arrayList, new wl1(z60Var, 0));
    }

    public static final int p(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objF = q73.f(view);
            view = objF instanceof View ? (View) objF : null;
        }
        return i4;
    }

    public static final View q(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(p(view, 2131230945), p(view, 2131230948));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (w(view) == null) {
                i2++;
                Object objF = q73.f(view);
                View view4 = view2;
                view2 = view;
                view = objF instanceof View ? (View) objF : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final gx1 r(ms2 ms2Var, lu0 lu0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            js2 js2VarA = ms2Var.a();
            hb1 hb1Var = js2VarA.c;
            if (hb1Var.H() && hb1Var.G()) {
                pe2 pe2VarG = js2VarA.g();
                gx1 gx1Var = new gx1(48);
                us1 us1Var = new us1(9, (byte) 0);
                us1Var.u(mh0.X(pe2VarG));
                u(lu0Var, new us1(9, (byte) 0), us1Var, gx1Var, js2VarA, js2VarA);
                return gx1Var;
            }
            gx1 gx1Var2 = g41.a;
            gx1Var2.getClass();
            return gx1Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void s(lu0 lu0Var, us1 us1Var, us1 us1Var2, gx1 gx1Var, js2 js2Var, js2 js2Var2) {
        us1 us1Var3 = us1Var;
        Region region = (Region) us1Var3.f;
        us1 us1Var4 = us1Var2;
        Region region2 = (Region) us1Var4.f;
        hb1 hb1Var = js2Var2.c;
        hb1 hb1Var2 = js2Var2.c;
        if (!hb1Var.H() || !hb1Var2.G() || region2.isEmpty()) {
            if (js2Var2.n()) {
                t(gx1Var, js2Var, js2Var2);
                return;
            }
            return;
        }
        pe2 pe2VarM = js2Var2.m();
        if (pe2VarM.g()) {
            kb0 kb0VarF = js2Var2.f();
            if (kb0VarF == null) {
                v21 v21Var = hb1Var2.K.c;
                pe2VarM = wc0.F(v21Var).d0(v21Var, false);
            } else {
                cv1 cv1Var = ((cv1) kb0VarF).e;
                Object objG = js2Var2.d.e.g(ds2.b);
                if (objG == null) {
                    objG = null;
                }
                pe2VarM = ee0.u(cv1Var, objG != null, false);
            }
        }
        l41 l41VarX = mh0.X(pe2VarM);
        us1Var3.u(l41VarX);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = js2Var2.f;
            js2 js2Var3 = js2Var;
            if (i2 == js2Var3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            ls2 ls2Var = new ls2(js2Var2, new l41(bounds.left, bounds.top, bounds.right, bounds.bottom));
            gx1 gx1Var2 = gx1Var;
            gx1Var2.h(i2, ls2Var);
            List listJ = js2.j(4, js2Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) lu0Var.invoke(listJ.get(size))).booleanValue()) {
                    s(lu0Var, us1Var3, us1Var4, gx1Var2, js2Var3, (js2) listJ.get(size));
                }
                size--;
                us1Var3 = us1Var;
                us1Var4 = us1Var2;
                gx1Var2 = gx1Var;
                js2Var3 = js2Var;
            }
            if (D(js2Var2)) {
                region2.op(l41VarX.a, l41VarX.b, l41VarX.c, l41VarX.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void t(gx1 gx1Var, js2 js2Var, js2 js2Var2) {
        hb1 hb1Var;
        js2 js2VarL = js2Var2.l();
        pe2 pe2VarG = (js2VarL == null || (hb1Var = js2VarL.c) == null || !hb1Var.H()) ? K : js2VarL.g();
        int i2 = js2Var2.f;
        if (i2 == js2Var.f) {
            i2 = -1;
        }
        gx1Var.h(i2, new ls2(js2Var2, mh0.X(pe2VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    public static final void u(lu0 lu0Var, us1 us1Var, us1 us1Var2, gx1 gx1Var, js2 js2Var, js2 js2Var2) {
        int size;
        boolean z2;
        pe2 pe2VarU;
        lu0 lu0Var2 = lu0Var;
        js2 js2Var3 = js2Var;
        int i2 = js2Var3.f;
        Region region = (Region) us1Var.f;
        us1 us1Var3 = us1Var2;
        Region region2 = (Region) us1Var3.f;
        hb1 hb1Var = js2Var2.c;
        es2 es2Var = js2Var2.d;
        hb1 hb1Var2 = js2Var2.c;
        int i3 = js2Var2.f;
        boolean z3 = (hb1Var.H() && hb1Var2.G()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z3 || js2Var2.n()) {
                l41 l41VarX = mh0.X(js2Var2.m());
                us1Var.u(l41VarX);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (js2Var2.n()) {
                        t(gx1Var, js2Var, js2Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            gx1Var.h(i3, new ls2(js2Var2, new l41(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                gx1Var.h(i3, new ls2(js2Var2, new l41(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = js2.j(4, js2Var2);
                if (es2Var.g) {
                    js2 js2VarL = js2Var2.l();
                    while (true) {
                        if (js2VarL == null) {
                            js2VarL = null;
                            break;
                        }
                        zx1 zx1Var = js2VarL.d.e;
                        if (zx1Var.c(os2.w) || zx1Var.c(os2.v)) {
                            break;
                        } else {
                            js2VarL = js2VarL.l();
                        }
                    }
                    if (js2VarL == null) {
                        z2 = false;
                    } else {
                        xz1 xz1VarD = js2Var2.d();
                        if (xz1VarD == null) {
                            xz1VarD = null;
                        } else {
                            if (!xz1VarD.t1().r) {
                                xz1VarD = null;
                            }
                            if (xz1VarD == null) {
                                xz1VarD = null;
                            }
                        }
                        xz1 xz1VarD2 = js2VarL.d();
                        if (xz1VarD2 == null) {
                            xz1VarD2 = null;
                        } else {
                            if (!xz1VarD2.t1().r) {
                                xz1VarD2 = null;
                            }
                            if (xz1VarD2 == null) {
                                xz1VarD2 = null;
                            }
                        }
                        if (xz1VarD == null || xz1VarD2 == null) {
                            z2 = false;
                        } else {
                            pe2 pe2VarD0 = xz1VarD2.d0(xz1VarD, false);
                            z2 = !pe2VarD0.equals(pe2VarD0.f(ce0.d(0L, mc0.J(xz1VarD2.g))));
                        }
                    }
                    if (z2) {
                        us1 us1Var4 = new us1(9, (byte) 0);
                        kb0 kb0VarF = js2Var2.f();
                        if (kb0VarF == null) {
                            v21 v21Var = hb1Var2.K.c;
                            pe2VarU = wc0.F(v21Var).d0(v21Var, false);
                        } else {
                            cv1 cv1Var = ((cv1) kb0VarF).e;
                            Object objG = es2Var.e.g(ds2.b);
                            pe2VarU = ee0.u(cv1Var, (objG == null ? null : objG) != null, false);
                        }
                        us1Var4.u(mh0.X(pe2VarU));
                        int size2 = listJ.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) lu0Var2.invoke(listJ.get(size2))).booleanValue()) {
                                s(lu0Var2, new us1(9, (byte) 0), us1Var4, gx1Var, js2Var3, (js2) listJ.get(size2));
                            }
                            size2--;
                            js2Var3 = js2Var;
                        }
                    } else {
                        size = listJ.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) lu0Var2.invoke(listJ.get(size))).booleanValue()) {
                                u(lu0Var2, us1Var, us1Var3, gx1Var, js2Var, (js2) listJ.get(size));
                            }
                            size--;
                            lu0Var2 = lu0Var;
                            us1Var3 = us1Var2;
                        }
                    }
                } else {
                    size = listJ.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) lu0Var2.invoke(listJ.get(size))).booleanValue()) {
                            u(lu0Var2, us1Var, us1Var3, gx1Var, js2Var, (js2) listJ.get(size));
                        }
                        size--;
                        lu0Var2 = lu0Var;
                        us1Var3 = us1Var2;
                    }
                }
                if (D(js2Var2)) {
                    region2.op(l41VarX.a, l41VarX.b, l41VarX.c, l41VarX.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final x01 v() {
        x01 x01Var = N;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(17.0f, 7.0f);
        nx0Var.l(-4.29f, -4.29f);
        nx0Var.g(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f);
        nx0Var.s(6.18f);
        nx0Var.k(7.11f, 5.7f);
        nx0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        nx0Var.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0Var.k(10.59f, 12.0f);
        nx0Var.k(5.7f, 16.89f);
        nx0Var.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        nx0Var.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        nx0Var.k(11.0f, 14.41f);
        nx0Var.s(6.18f);
        nx0Var.g(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        nx0Var.k(17.0f, 17.0f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0Var.k(13.41f, 12.0f);
        nx0Var.k(17.0f, 8.42f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        nx0Var.e();
        nx0Var.m(13.0f, 5.83f);
        nx0Var.l(1.88f, 1.88f);
        nx0Var.k(13.0f, 9.59f);
        nx0Var.k(13.0f, 5.83f);
        nx0Var.e();
        nx0Var.m(14.88f, 16.29f);
        nx0Var.k(13.0f, 18.17f);
        nx0Var.s(-3.76f);
        nx0Var.l(1.88f, 1.88f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        N = x01VarB;
        return x01VarB;
    }

    public static final a30 w(View view) {
        Object tag = view.getTag(2131230784);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (a30) weakReference.get();
        }
        return null;
    }

    public static int x(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final ey y(hj3 hj3Var) {
        ey eyVar;
        hj3Var.getClass();
        synchronized (M) {
            eyVar = (ey) hj3Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (eyVar == null) {
                y70 immediate = sj0.e;
                try {
                    immediate = Dispatchers.getMain().getImmediate();
                } catch (g02 | IllegalStateException unused) {
                }
                ey eyVar2 = new ey(immediate.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                hj3Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", eyVar2);
                eyVar = eyVar2;
            }
        }
        return eyVar;
    }

    public static final dv1 z(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new sr(lu0Var));
    }

    public abstract void O(v0 v0Var, v0 v0Var2);

    public abstract void P(v0 v0Var, Thread thread);

    public abstract boolean g(w0 w0Var, s0 s0Var);

    public abstract boolean h(w0 w0Var, Object obj, Object obj2);

    public abstract boolean i(w0 w0Var, v0 v0Var, v0 v0Var2);
}
