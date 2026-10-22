package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.HandwritingGesture;
import android.widget.EdgeEffect;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudDeviceSlot;
import com.vincenthzr.locationspoofer.data.cloud.CloudEntitlements;
import com.vincenthzr.locationspoofer.data.cloud.MembershipCatalog;
import com.vincenthzr.locationspoofer.data.cloud.MembershipOrder;
import com.vincenthzr.locationspoofer.data.cloud.MembershipPaymentUrls;
import com.vincenthzr.locationspoofer.data.cloud.MembershipPlan;
import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.model.RouteTravelMode;
import com.vincenthzr.locationspoofer.data.model.SimMode;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wc0 {
    public static x01 a;
    public static x01 b;
    public static x01 c;
    public static x01 d;

    public static final String A(long j) {
        return DateFormat.getDateInstance(2).format(new Date(j));
    }

    public static hv0 B(String str) {
        if (str == null || l13.k0(str)) {
            return null;
        }
        try {
            List listU0 = l13.u0(str, new char[]{';'}, 6);
            if (listU0.size() == 6 && o51.f(listU0.get(0), "v1")) {
                List listSubList = listU0.subList(3, 6);
                ArrayList arrayList = new ArrayList(az.Y(listSubList, 10));
                Iterator it = listSubList.iterator();
                while (it.hasNext()) {
                    List listU1 = l13.u0((String) it.next(), new char[]{','}, 6);
                    ArrayList arrayList2 = new ArrayList(az.Y(listU1, 10));
                    Iterator it2 = listU1.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Float.valueOf(Float.parseFloat((String) it2.next())));
                    }
                    arrayList.add(zy.H0(arrayList2));
                }
                return new hv0((float[]) arrayList.get(0), (float[]) arrayList.get(1), (float[]) arrayList.get(2), Integer.parseInt((String) listU0.get(1)), Integer.parseInt((String) listU0.get(2)));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean C(long j, long j2) {
        return j == j2;
    }

    public static final float[] D(ArrayList arrayList, float[] fArr) {
        float[] fArr2 = new float[64];
        for (int i = 0; i < 64; i++) {
            ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                k41 k41Var = (k41) obj;
                int i3 = k41Var.e;
                double d2 = ((((double) ((k41Var.f + 1) - i3)) * ((double) i)) / 64.0d) + ((double) i3);
                int iV = mh0.v((int) d2, 0, fArr.length - 1);
                int i4 = iV + 1;
                int length = fArr.length - 1;
                if (i4 > length) {
                    i4 = length;
                }
                double d3 = d2 - ((double) iV);
                arrayList2.add(Double.valueOf((((double) fArr[i4]) * d3) + ((1.0d - d3) * ((double) fArr[iV]))));
            }
            fArr2[i] = (float) zy.e0(arrayList2);
        }
        return fArr2;
    }

    public static int E(HandwritingGesture handwritingGesture, ge2 ge2Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ge2Var.invoke(new h00(fallbackText, 1));
        return 5;
    }

    public static final pa1 F(pa1 pa1Var) {
        pa1 pa1Var2;
        pa1 pa1VarB = pa1Var.B();
        while (true) {
            pa1 pa1Var3 = pa1VarB;
            pa1Var2 = pa1Var;
            pa1Var = pa1Var3;
            if (pa1Var == null) {
                break;
            }
            pa1VarB = pa1Var.B();
        }
        xz1 xz1Var = pa1Var2 instanceof xz1 ? (xz1) pa1Var2 : null;
        if (xz1Var == null) {
            return pa1Var2;
        }
        xz1 xz1Var2 = xz1Var.w;
        while (true) {
            xz1 xz1Var3 = xz1Var2;
            xz1 xz1Var4 = xz1Var;
            xz1Var = xz1Var3;
            if (xz1Var == null) {
                return xz1Var4;
            }
            xz1Var2 = xz1Var.w;
        }
    }

    public static final String G(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static bd2 H(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return bd2.f;
        }
        if (str.equals("http/1.1")) {
            return bd2.g;
        }
        if (str.equals("h2_prior_knowledge")) {
            return bd2.j;
        }
        if (str.equals("h2")) {
            return bd2.i;
        }
        if (str.equals("spdy/3.1")) {
            return bd2.h;
        }
        if (str.equals("quic")) {
            return bd2.k;
        }
        fo.r("Unexpected protocol: ".concat(str));
        return null;
    }

    public static final int I(bl2 bl2Var, String str) {
        bl2Var.getClass();
        return hd0.p(bl2Var, str);
    }

    public static final int J(bl2 bl2Var, String str) {
        bl2Var.getClass();
        int iP = hd0.p(bl2Var, str);
        if (iP >= 0) {
            return iP;
        }
        int columnCount = bl2Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(bl2Var.getColumnName(i));
        }
        fo.j("Column '", str, "' does not exist. Available columns: [", zy.s0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static nx2 K() {
        return (nx2) tx2.b.h();
    }

    public static final View L(cv1 cv1Var) {
        bj3 bj3Var = xp1.O(cv1Var.e).t;
        View interopView = bj3Var != null ? bj3Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        fo.n("Could not fetch interop view");
        return null;
    }

    public static final x01 M() {
        x01 x01Var = b;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.ImportExport", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(8.65f, 3.35f);
        nx0Var.k(5.86f, 6.14f);
        nx0Var.g(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f);
        nx0Var.h(8.0f);
        nx0Var.r(13.0f);
        nx0Var.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        nx0Var.o(1.0f, -0.45f, 1.0f, -1.0f);
        nx0Var.r(6.99f);
        nx0Var.i(1.79f);
        nx0Var.g(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        nx0Var.k(9.35f, 3.35f);
        nx0Var.g(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        nx0Var.e();
        nx0Var.m(16.0f, 17.01f);
        nx0Var.r(11.0f);
        nx0Var.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        nx0Var.o(-1.0f, 0.45f, -1.0f, 1.0f);
        nx0Var.s(6.01f);
        nx0Var.i(-1.79f);
        nx0Var.g(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        nx0Var.l(2.79f, 2.78f);
        nx0Var.g(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        nx0Var.l(2.79f, -2.78f);
        nx0Var.g(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        nx0Var.h(16.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        b = x01VarB;
        return x01VarB;
    }

    public static final int N(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final x01 O() {
        x01 x01Var = d;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.StopCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 2.0f);
        nx0VarI.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        nx0VarI.g(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        nx0VarI.o(10.0f, -4.48f, 10.0f, -10.0f);
        nx0VarI.f(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        nx0VarI.e();
        nx0VarI.m(15.0f, 16.0f);
        nx0VarI.h(9.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.r(9.0f);
        nx0VarI.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        nx0VarI.i(6.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        nx0VarI.s(6.0f);
        nx0VarI.f(16.0f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        d = x01VarB;
        return x01VarB;
    }

    public static final boolean P(sd1 sd1Var, int i) {
        return i <= sd1Var.d() && sd1Var.c() <= i;
    }

    public static final boolean Q(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final xt2 R(xt2 xt2Var, xt2 xt2Var2, float f) {
        long jF = xp1.F(xt2Var.a, xt2Var2.a, f);
        long j = xt2Var.b;
        long j2 = xt2Var2.b;
        float fE = gh0.E(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fE2 = gh0.E(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new xt2(jF, (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L), gh0.E(xt2Var.c, xt2Var2.c, f));
    }

    public static nx2 S(nx2 nx2Var) {
        if (nx2Var instanceof qc3) {
            qc3 qc3Var = (qc3) nx2Var;
            if (qc3Var.t == a83.b()) {
                qc3Var.r = null;
                return nx2Var;
            }
        }
        if (nx2Var instanceof rc3) {
            rc3 rc3Var = (rc3) nx2Var;
            if (rc3Var.i == a83.b()) {
                rc3Var.h = null;
                return nx2Var;
            }
        }
        nx2 nx2VarE = tx2.e(nx2Var, null, false);
        nx2VarE.j();
        return nx2VarE;
    }

    public static final String T(int i) {
        return String.format(Locale.ROOT, "¥%d.%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 100), Integer.valueOf(i % 100)}, 2));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e4, B:56:0x00ec, B:58:0x00f0, B:60:0x00fc, B:62:0x0108, B:50:0x00bd), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0108 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e4, B:56:0x00ec, B:58:0x00f0, B:60:0x00fc, B:62:0x0108, B:50:0x00bd), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object U(p33 p33Var, xv1 xv1Var, q01 q01Var, p92 p92Var, oq oqVar) {
        mq2 mq2Var;
        yp2 yp2Var;
        p33 p33Var2;
        se2 se2Var;
        List list;
        int size;
        x92 x92Var;
        List list2;
        int size2;
        x92 x92Var2;
        yp2 yp2Var2 = u92.l;
        if (oqVar instanceof mq2) {
            mq2Var = (mq2) oqVar;
            int i = mq2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq2Var.i = i - Integer.MIN_VALUE;
            } else {
                mq2Var = new mq2(oqVar);
            }
        } else {
            mq2Var = new mq2(oqVar);
        }
        Object objI = mq2Var.h;
        int i2 = mq2Var.i;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    ee0.J(objI);
                    x92 x92Var3 = (x92) p92Var.a.get(0);
                    int i4 = p92Var.e & 1;
                    z70 z70Var = z70.e;
                    if (i4 == 0) {
                        int i5 = q01Var.b;
                        if (i5 != 1) {
                            yp2Var = i5 != 2 ? u92.n : u92.m;
                        } else {
                            yp2Var = yp2Var2;
                        }
                        if (xv1Var.e(x92Var3.c, yp2Var, i5)) {
                            se2 se2Var2 = new se2();
                            se2Var2.e = !yp2Var.equals(yp2Var2);
                            long j = x92Var3.a;
                            ji1 ji1Var = new ji1(xv1Var, yp2Var, se2Var2, 17);
                            mq2Var.e = p33Var;
                            mq2Var.f = xv1Var;
                            mq2Var.g = se2Var2;
                            mq2Var.i = 2;
                            objI = df0.i(p33Var, j, ji1Var, mq2Var);
                            if (objI != z70Var) {
                                p33Var2 = p33Var;
                                se2Var = se2Var2;
                                if (((Boolean) objI).booleanValue()) {
                                    list2 = p33Var2.i.w.a;
                                    size2 = list2.size();
                                    while (i3 < size2) {
                                        x92Var2 = (x92) list2.get(i3);
                                        if (mh0.q(x92Var2)) {
                                            x92Var2.a();
                                        }
                                        i3++;
                                    }
                                }
                                xv1Var.c();
                            }
                            return z70Var;
                        }
                    } else if (xv1Var.g(x92Var3.c)) {
                        x92Var3.a();
                        long j2 = x92Var3.a;
                        ge2 ge2Var = new ge2(xv1Var, 8);
                        mq2Var.e = p33Var;
                        mq2Var.f = xv1Var;
                        mq2Var.i = 1;
                        objI = df0.i(p33Var, j2, ge2Var, mq2Var);
                        if (objI == z70Var) {
                            return z70Var;
                        }
                        if (((Boolean) objI).booleanValue()) {
                            list = p33Var.i.w.a;
                            size = list.size();
                            while (i3 < size) {
                                x92Var = (x92) list.get(i3);
                                if (mh0.q(x92Var)) {
                                    x92Var.a();
                                }
                                i3++;
                            }
                        }
                        xv1Var.c();
                    }
                } else if (i2 == 1) {
                    xv1Var = mq2Var.f;
                    p33Var = mq2Var.e;
                    ee0.J(objI);
                    if (((Boolean) objI).booleanValue()) {
                        list = p33Var.i.w.a;
                        size = list.size();
                        while (i3 < size) {
                            x92Var = (x92) list.get(i3);
                            if (mh0.q(x92Var)) {
                                x92Var.a();
                            }
                            i3++;
                        }
                    }
                    xv1Var.c();
                } else {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    se2Var = mq2Var.g;
                    xv1Var = mq2Var.f;
                    p33Var2 = mq2Var.e;
                    ee0.J(objI);
                    if (((Boolean) objI).booleanValue() && se2Var.e) {
                        list2 = p33Var2.i.w.a;
                        size2 = list2.size();
                        while (i3 < size2) {
                            x92Var2 = (x92) list2.get(i3);
                            if (mh0.q(x92Var2)) {
                                x92Var2.a();
                            }
                            i3++;
                        }
                    }
                    xv1Var.c();
                }
                return mf3.a;
            } catch (Throwable th) {
                xv1Var.c();
                throw th;
            }
        } catch (Throwable th2) {
            xv1Var.c();
            throw th2;
        }
    }

    public static double[] V(double[] dArr, int i) {
        int i2 = i / 2;
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 - i2;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = i3 + i2;
            int length2 = dArr.length - 1;
            if (i5 > length2) {
                i5 = length2;
            }
            double d2 = 0.0d;
            if (i4 <= i5) {
                int i6 = i4;
                while (true) {
                    d2 += dArr[i6];
                    if (i6 != i5) {
                        i6++;
                    }
                }
            }
            dArr2[i3] = d2 / ((double) ((i5 - i4) + 1));
        }
        return dArr2;
    }

    public static Object W(f9 f9Var, au0 au0Var) {
        nx2 qc3Var;
        nx2 nx2Var = (nx2) tx2.b.h();
        if (nx2Var instanceof qc3) {
            qc3 qc3Var2 = (qc3) nx2Var;
            if (qc3Var2.t == a83.b()) {
                lu0 lu0Var = qc3Var2.r;
                lu0 lu0Var2 = qc3Var2.s;
                try {
                    ((qc3) nx2Var).r = tx2.i(f9Var, lu0Var, true);
                    ((qc3) nx2Var).s = lu0Var2;
                    return au0Var.invoke();
                } finally {
                    qc3Var2.r = lu0Var;
                    qc3Var2.s = lu0Var2;
                }
            }
        }
        if (nx2Var == null || (nx2Var instanceof dy1)) {
            qc3Var = new qc3(nx2Var instanceof dy1 ? (dy1) nx2Var : null, f9Var, null, true, false);
        } else {
            qc3Var = nx2Var.u(f9Var);
        }
        try {
            nx2 nx2VarJ = qc3Var.j();
            try {
                Object objInvoke = au0Var.invoke();
                nx2.q(nx2VarJ);
                qc3Var.c();
                return objInvoke;
            } catch (Throwable th) {
                nx2.q(nx2VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            qc3Var.c();
            throw th2;
        }
    }

    public static final int X(String str) {
        switch (str.hashCode()) {
            case -1979189942:
                return !str.equals("REFUNDING") ? 2131624763 : 2131624754;
            case -1691918663:
                return str.equals("CREATING") ? 2131624711 : 2131624763;
            case -1631383509:
                return !str.equals("PAID_REVIEW") ? 2131624763 : 2131624758;
            case -1031784143:
                return !str.equals("CANCELLED") ? 2131624763 : 2131624702;
            case -591252731:
                return !str.equals("EXPIRED") ? 2131624763 : 2131624717;
            case 2448076:
                return !str.equals("PAID") ? 2131624763 : 2131624739;
            case 35394935:
                return !str.equals("PENDING") ? 2131624763 : 2131624766;
            case 74702359:
                return !str.equals("REFUNDED") ? 2131624763 : 2131624753;
            case 755522276:
                return !str.equals("REFUND_FAILED") ? 2131624763 : 2131624752;
            case 2066319421:
                return !str.equals("FAILED") ? 2131624763 : 2131624718;
            default:
                return 2131624763;
        }
    }

    public static void Y(long j, dj djVar, boolean z, ge2 ge2Var) {
        if (z) {
            int i = f93.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(djVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < djVar.f.length() ? Character.codePointAt(djVar, iCharCount2) : 10;
            if (hd0.M(iCodePointBefore) && (hd0.L(iCodePointAt) || hd0.K(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(djVar, iCharCount);
                    }
                } while (hd0.M(iCodePointBefore));
                j = g93.a(iCharCount, iCharCount2);
            } else if (hd0.M(iCodePointAt) && (hd0.L(iCodePointBefore) || hd0.K(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == djVar.f.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(djVar, iCharCount2);
                    }
                } while (hd0.M(iCodePointAt));
                j = g93.a(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        ge2Var.invoke(new ix0(new ei0[]{new ot2(i2, i2), new sb0(f93.d(j), 0)}));
    }

    public static byte[] Z(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                fo.n(p91.l(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x0709  */
    /* JADX WARN: Code duplicated, block: B:149:0x070d  */
    /* JADX WARN: Code duplicated, block: B:152:0x071e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0724  */
    /* JADX WARN: Code duplicated, block: B:156:0x072b  */
    /* JADX WARN: Code duplicated, block: B:158:0x073f  */
    /* JADX WARN: Code duplicated, block: B:161:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:162:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:165:0x0803  */
    /* JADX WARN: Code duplicated, block: B:166:0x0807  */
    /* JADX WARN: Code duplicated, block: B:169:0x0820  */
    /* JADX WARN: Code duplicated, block: B:172:0x0892  */
    /* JADX WARN: Code duplicated, block: B:174:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:175:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:178:0x093d  */
    /* JADX WARN: Code duplicated, block: B:181:0x094a  */
    /* JADX WARN: Code duplicated, block: B:183:0x098f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0993  */
    /* JADX WARN: Code duplicated, block: B:186:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:189:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:194:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:197:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:198:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:202:0x0b27  */
    /* JADX WARN: Code duplicated, block: B:203:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0b98 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:213:0x0bd2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List list, String str, boolean z, final lu0 lu0Var, au0 au0Var, final lu0 lu0Var2, final lu0 lu0Var3, f30 f30Var, int i) {
        hh0 hh0Var;
        jr0 jr0Var;
        long jC;
        long jC2;
        long jC3;
        c30 c30Var;
        boolean z2;
        pr prVar;
        c30 c30Var2;
        x30 x30Var;
        gh ghVar;
        gh ghVar2;
        gh ghVar3;
        wa waVar;
        gh ghVar4;
        boolean z3;
        x01 x01VarR;
        float f;
        long jC4;
        String str2;
        jr0 jr0Var2;
        hh0 hh0Var2;
        ov0 ov0Var;
        pr prVar2;
        int i2;
        li0 li0Var;
        final li0 li0Var2;
        boolean zF;
        Object objQ;
        c30 c30Var3;
        boolean zF2;
        Object objQ2;
        final int i3;
        pr prVar3 = j9.j;
        pr prVar4 = j9.f;
        go goVar = am1.e;
        or orVar = j9.p;
        nr nrVar = j9.r;
        list.getClass();
        lu0Var.getClass();
        au0Var.getClass();
        lu0Var2.getClass();
        lu0Var3.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(1104819684);
        int i4 = i | (ov0Var2.h(list) ? 4 : 2) | (ov0Var2.f(str) ? 32 : 16) | (ov0Var2.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            av1 av1Var = av1.a;
            dv1 dv1VarN = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(16.0f));
            long jC5 = z ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b);
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(dv1VarN, jC5, iy0Var);
            hh0 hh0Var3 = mz.a;
            dv1 dv1VarD = zm3.D(ji2.w(dv1VarK, 0.8f, hz.c(z ? 0.12f : 0.06f, ((kz) ov0Var2.j(hh0Var3)).A), cj2.a(16.0f)), 14.0f);
            yz yzVarA = wz.a(new jo(10.0f, true, new fo(0)), nrVar, ov0Var2, 6);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            gh ghVar5 = v20.e;
            q73.h(ov0Var2, ghVar5, yzVarA);
            gh ghVar6 = v20.d;
            q73.h(ov0Var2, ghVar6, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar7 = v20.f;
            q73.h(ov0Var2, ghVar7, numValueOf);
            wa waVar2 = v20.g;
            q73.g(ov0Var2, waVar2);
            gh ghVar8 = v20.c;
            q73.h(ov0Var2, ghVar8, dv1VarH);
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA = jk2.a(am1.i, orVar, ov0Var2, 54);
            int iHashCode2 = Long.hashCode(ov0Var2.T);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA);
            q73.h(ov0Var2, ghVar6, l72VarL2);
            az2.s(iHashCode2, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH2);
            kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode3 = Long.hashCode(ov0Var2.T);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA2);
            q73.h(ov0Var2, ghVar6, l72VarL3);
            az2.s(iHashCode3, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH3);
            x01 x01VarI = k93.i();
            long j = bk.g;
            t01.a(x01VarI, null, iw2.k(av1Var, 18.0f), j, ov0Var2, 3504, 0);
            s83.b(az2.i(av1Var, 8.0f, ov0Var2, 2131624672, ov0Var2), null, ((kz) ov0Var2.j(hh0Var3)).q, v63.b(14.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
            ov0Var2.p(true);
            dv1 dv1VarE2 = zm3.E(bk.a(xp1.k(xp1.n(av1Var, cj2.a(8.0f)), hz.c(0.12f, j), iy0Var), au0Var), 10.0f, 5.0f);
            er1 er1VarC = ws.c(prVar4, false);
            int iHashCode4 = Long.hashCode(ov0Var2.T);
            l72 l72VarL4 = ov0Var2.l();
            dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarE2);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, er1VarC);
            q73.h(ov0Var2, ghVar6, l72VarL4);
            az2.s(iHashCode4, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH4);
            kk2 kk2VarA3 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode5 = Long.hashCode(ov0Var2.T);
            l72 l72VarZ = ov0Var2.z();
            pr prVar5 = prVar4;
            dv1 dv1VarH5 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA3);
            q73.h(ov0Var2, ghVar6, l72VarZ);
            az2.s(iHashCode5, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH5);
            t01.a(n51.t(), null, iw2.k(av1Var, 14.0f), j, ov0Var2, 3504, 0);
            String strI = az2.i(av1Var, 3.0f, ov0Var2, 2131624004, ov0Var2);
            long jC6 = v63.c(12);
            jr0 jr0Var3 = jr0.i;
            s83.b(strI, null, j, jC6, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597824, 0, 262058);
            ov0Var2.r();
            ov0Var2.r();
            ov0Var2.r();
            long jC7 = j;
            s83.b(ke0.N(2131624391, ov0Var2), null, hz.c(0.48f, ((kz) ov0Var2.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var2, 24576, 48, 260074);
            boolean z4 = str == null;
            dv1 dv1VarW = ji2.w(xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(10.0f)), z4 ? hz.c(0.08f, jC7) : hz.f), 0.8f, z4 ? hz.c(0.35f, jC7) : hz.f, cj2.a(10.0f));
            int i5 = i4 & 7168;
            boolean z5 = i5 == 2048;
            Object objQ3 = ov0Var2.Q();
            c30 c30Var4 = d30.a;
            if (z5 || objQ3 == c30Var4) {
                objQ3 = new hl1(6, lu0Var);
                ov0Var2.m0(objQ3);
            }
            dv1 dv1VarE3 = zm3.E(bk.a(dv1VarW, (au0) objQ3), 10.0f, 8.0f);
            kk2 kk2VarA4 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode6 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ2 = ov0Var2.z();
            dv1 dv1VarH6 = xp1.H(ov0Var2, dv1VarE3);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, kk2VarA4);
            q73.h(ov0Var2, ghVar6, l72VarZ2);
            az2.s(iHashCode6, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH6);
            x01 x01VarB = z4 ? ee0.B() : dh0.r();
            if (z4) {
                ov0Var2.c0(2144361597);
                ov0Var2.s();
                hh0Var = hh0Var3;
            } else {
                ov0Var2.c0(2144363307);
                jC7 = hz.c(0.4f, ((kz) ov0Var2.j(hh0Var3)).q);
                ov0Var2.s();
                hh0Var = hh0Var3;
            }
            go goVar2 = goVar;
            int i6 = i5;
            c30 c30Var5 = c30Var4;
            or orVar2 = orVar;
            hh0 hh0Var4 = hh0Var;
            t01.a(x01VarB, null, iw2.k(av1Var, 17.0f), jC7, ov0Var2, 432, 0);
            String strI2 = az2.i(av1Var, 8.0f, ov0Var2, 2131624798, ov0Var2);
            long jC8 = v63.c(13);
            if (!z4) {
                jr0Var = jr0.g;
            }
            if (z4) {
                jr0Var = jr0Var3;
                ov0Var2.c0(2144376637);
                ov0Var2.s();
                jC = jC7;
            } else {
                jr0Var = jr0Var3;
                ov0Var2.c0(2144378347);
                jC = hz.c(0.8f, ((kz) ov0Var2.j(hh0Var4)).q);
                ov0Var2.s();
            }
            s83.b(strI2, null, jC, jC8, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262058);
            ov0Var2 = ov0Var2;
            ov0Var2.r();
            if (list.isEmpty()) {
                ov0Var2.c0(-1970609759);
                dv1 dv1VarF = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 12.0f, 1);
                er1 er1VarC2 = ws.c(prVar3, false);
                int iHashCode7 = Long.hashCode(ks.U(ov0Var2));
                l72 l72VarZ3 = ov0Var2.z();
                dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarF);
                ov0Var2.g0();
                if (ov0Var2.D()) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar5, er1VarC2);
                q73.h(ov0Var2, ghVar6, l72VarZ3);
                az2.s(iHashCode7, ov0Var2, ghVar7, ov0Var2, waVar2);
                q73.h(ov0Var2, ghVar8, dv1VarH7);
                s83.b(ke0.N(2131624809, ov0Var2), null, hz.c(0.4f, ((kz) ov0Var2.j(hh0Var4)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                ov0Var2 = ov0Var2;
                ov0Var2.r();
                ov0Var2.s();
            } else {
                pr prVar6 = prVar3;
                float f2 = 0.4f;
                ov0Var2.c0(-1969920164);
                nr nrVar2 = nrVar;
                yz yzVarA2 = wz.a(new jo(8.0f, true, new fo(0)), nrVar2, ov0Var2, 6);
                int iHashCode8 = Long.hashCode(ks.U(ov0Var2));
                l72 l72VarZ4 = ov0Var2.z();
                float f3 = 12.0f;
                dv1 dv1VarH8 = xp1.H(ov0Var2, av1Var);
                ov0Var2.g0();
                if (ov0Var2.D()) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar5, yzVarA2);
                q73.h(ov0Var2, ghVar6, l72VarZ4);
                az2.s(iHashCode8, ov0Var2, ghVar7, ov0Var2, waVar2);
                q73.h(ov0Var2, ghVar8, dv1VarH8);
                ov0Var2.c0(1431811282);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final li0 li0Var3 = (li0) it.next();
                    boolean z6 = str != null && s13.T(str, li0Var3.a);
                    dv1 dv1VarN2 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(f3));
                    if (z6) {
                        jC2 = hz.c(0.09f, bk.g);
                    } else {
                        jC2 = z ? hz.c(0.03f, hz.c) : hz.c(0.02f, hz.b);
                    }
                    dv1 dv1VarL = xp1.l(dv1VarN2, jC2);
                    if (z6) {
                        ov0Var2.c0(-1579271141);
                        ov0Var2.s();
                        jC3 = hz.c(f2, bk.g);
                    } else {
                        ov0Var2.c0(-1579268237);
                        jC3 = hz.c(z ? 0.08f : 0.04f, ((kz) ov0Var2.j(mz.a)).A);
                        ov0Var2.s();
                    }
                    dv1 dv1VarW2 = ji2.w(dv1VarL, 0.8f, jC3, cj2.a(f3));
                    int i7 = i6;
                    boolean zF3 = (i7 == 2048) | ov0Var2.f(li0Var3);
                    Object objQ4 = ov0Var2.Q();
                    if (zF3) {
                        c30Var = c30Var5;
                    } else {
                        c30Var = c30Var5;
                        if (objQ4 != c30Var) {
                            z2 = false;
                        }
                        i6 = i7;
                        dv1 dv1VarE4 = zm3.E(bk.a(dv1VarW2, (au0) objQ4), 10.0f, 9.0f);
                        prVar = prVar5;
                        er1 er1VarC3 = ws.c(prVar, z2);
                        int iHashCode9 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ5 = ov0Var2.z();
                        dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarE4);
                        w20.b.getClass();
                        c30Var2 = c30Var;
                        x30Var = v20.b;
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        ghVar = v20.e;
                        q73.h(ov0Var2, ghVar, er1VarC3);
                        ghVar2 = v20.d;
                        q73.h(ov0Var2, ghVar2, l72VarZ5);
                        Integer numValueOf2 = Integer.valueOf(iHashCode9);
                        ghVar3 = v20.f;
                        q73.h(ov0Var2, ghVar3, numValueOf2);
                        waVar = v20.g;
                        q73.g(ov0Var2, waVar);
                        Iterator it2 = it;
                        ghVar4 = v20.c;
                        q73.h(ov0Var2, ghVar4, dv1VarH9);
                        dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                        z3 = z6;
                        pr prVar7 = prVar6;
                        go goVar3 = goVar2;
                        or orVar3 = orVar2;
                        kk2 kk2VarA5 = jk2.a(goVar3, orVar3, ov0Var2, 48);
                        int iHashCode10 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ6 = ov0Var2.z();
                        dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE5);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA5);
                        q73.h(ov0Var2, ghVar2, l72VarZ6);
                        az2.s(iHashCode10, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH10);
                        if (z3) {
                            x01VarR = ee0.B();
                        } else {
                            x01VarR = dh0.r();
                        }
                        x01 x01Var = x01VarR;
                        if (z3) {
                            ov0Var2.c0(73282589);
                            ov0Var2.s();
                            jC4 = bk.g;
                            f = 0.4f;
                        } else {
                            ov0Var2.c0(73284331);
                            f = 0.4f;
                            jC4 = hz.c(0.4f, ((kz) ov0Var2.j(mz.a)).q);
                            ov0Var2.s();
                        }
                        float f4 = f;
                        float f5 = f3;
                        nr nrVar3 = nrVar2;
                        t01.a(x01Var, null, iw2.k(av1Var, 17.0f), jC4, ov0Var2, 432, 0);
                        gh0.h(ov0Var2, iw2.o(av1Var, 8.0f));
                        wb1 wb1Var = new wb1(1.0f, true);
                        yz yzVarA3 = wz.a(am1.g, nrVar3, ov0Var2, 0);
                        int iHashCode11 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ7 = ov0Var2.z();
                        dv1 dv1VarH11 = xp1.H(ov0Var2, wb1Var);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, yzVarA3);
                        q73.h(ov0Var2, ghVar2, l72VarZ7);
                        az2.s(iHashCode11, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH11);
                        kk2 kk2VarA6 = jk2.a(new jo(6.0f, true, new fo(0)), orVar3, ov0Var2, 54);
                        int iHashCode12 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ8 = ov0Var2.z();
                        dv1 dv1VarH12 = xp1.H(ov0Var2, av1Var);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA6);
                        q73.h(ov0Var2, ghVar2, l72VarZ8);
                        az2.s(iHashCode12, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH12);
                        str2 = li0Var3.b;
                        if (l13.k0(str2)) {
                            str2 = "<Hidden SSID>";
                        }
                        long jB = v63.b(13.5d);
                        jr0Var2 = jr0.j;
                        hh0Var2 = mz.a;
                        orVar2 = orVar3;
                        ov0 ov0Var3 = ov0Var2;
                        s83.b(str2, null, ((kz) ov0Var2.j(hh0Var2)).q, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                        ov0Var = ov0Var3;
                        if (z3) {
                            ov0Var.c0(-1034769151);
                            dv1 dv1VarN3 = xp1.n(av1Var, cj2.a(4.0f));
                            long j2 = bk.g;
                            dv1 dv1VarE6 = zm3.E(xp1.l(dv1VarN3, hz.c(0.15f, j2)), 5.0f, 1.0f);
                            er1 er1VarC4 = ws.c(prVar, false);
                            int iHashCode13 = Long.hashCode(ks.U(ov0Var));
                            l72 l72VarZ9 = ov0Var.z();
                            dv1 dv1VarH13 = xp1.H(ov0Var, dv1VarE6);
                            ov0Var.g0();
                            if (ov0Var.D()) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, er1VarC4);
                            q73.h(ov0Var, ghVar2, l72VarZ9);
                            az2.s(iHashCode13, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH13);
                            jr0Var2 = jr0Var2;
                            i2 = -1043383307;
                            prVar2 = prVar;
                            s83.b(ke0.N(2131624390, ov0Var), null, j2, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                            ov0Var = ov0Var;
                            ov0Var.r();
                        } else {
                            prVar2 = prVar;
                            i2 = -1043383307;
                            ov0Var.c0(-1043383307);
                        }
                        ov0Var.s();
                        li0Var = li0Var3;
                        if (li0Var.g) {
                            ov0Var.c0(-1033801114);
                            dv1 dv1VarN4 = xp1.n(av1Var, cj2.a(4.0f));
                            long j3 = bk.h;
                            dv1 dv1VarE7 = zm3.E(xp1.l(dv1VarN4, hz.c(0.15f, j3)), 5.0f, 1.0f);
                            pr prVar8 = prVar2;
                            er1 er1VarC5 = ws.c(prVar8, false);
                            int iHashCode14 = Long.hashCode(ks.U(ov0Var));
                            l72 l72VarZ10 = ov0Var.z();
                            dv1 dv1VarH14 = xp1.H(ov0Var, dv1VarE7);
                            ov0Var.g0();
                            if (ov0Var.D()) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, er1VarC5);
                            q73.h(ov0Var, ghVar2, l72VarZ10);
                            az2.s(iHashCode14, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH14);
                            prVar5 = prVar8;
                            ov0 ov0Var4 = ov0Var;
                            s83.b(ke0.N(2131624345, ov0Var), null, j3, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597824, 0, 262058);
                            ov0Var = ov0Var4;
                            ov0Var.r();
                            ov0Var.s();
                            li0Var = li0Var;
                        } else {
                            prVar5 = prVar2;
                            ov0Var.c0(i2);
                            ov0Var.s();
                        }
                        ov0Var.r();
                        gh0.h(ov0Var, iw2.g(av1Var, 3.0f));
                        li0Var2 = li0Var;
                        ov0 ov0Var5 = ov0Var;
                        s83.b(li0Var.a + "  •  " + li0Var.d + " dBm  •  " + li0Var.c + " MHz", null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                        ov0Var2 = ov0Var5;
                        if (l13.k0(li0Var2.e)) {
                            ov0Var2.c0(2105074009);
                        } else {
                            ov0Var2.c0(2116043948);
                            s83.b(li0Var2.e, null, hz.c(0.38f, ((kz) ov0Var2.j(hh0Var2)).q), v63.c(10), null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var2, 24576, 24576, 245738);
                            ov0Var2 = ov0Var2;
                        }
                        ov0Var2.s();
                        ov0Var2.r();
                        dv1 dv1VarK2 = iw2.k(av1Var, 28.0f);
                        bj2 bj2Var = cj2.a;
                        dv1 dv1VarL2 = xp1.l(xp1.n(dv1VarK2, bj2Var), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var2)).q));
                        zF = ov0Var2.f(li0Var2);
                        objQ = ov0Var2.Q();
                        if (zF) {
                            c30Var3 = c30Var2;
                        } else {
                            c30Var3 = c30Var2;
                            if (objQ == c30Var3) {
                            }
                            dv1 dv1VarA = bk.a(dv1VarL2, (au0) objQ);
                            er1 er1VarC6 = ws.c(prVar7, false);
                            int iHashCode15 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ11 = ov0Var2.z();
                            dv1 dv1VarH15 = xp1.H(ov0Var2, dv1VarA);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC6);
                            q73.h(ov0Var2, ghVar2, l72VarZ11);
                            az2.s(iHashCode15, ov0Var2, ghVar3, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar4, dv1VarH15);
                            c30 c30Var6 = c30Var3;
                            t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.g, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            gh0.h(ov0Var2, iw2.o(av1Var, 6.0f));
                            dv1 dv1VarL3 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(li0Var2);
                            objQ2 = ov0Var2.Q();
                            if (!zF2 || objQ2 == c30Var6) {
                                i3 = 2;
                                objQ2 = new au0() { // from class: mo1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i8 = i3;
                                        mf3 mf3Var = mf3.a;
                                        li0 li0Var4 = li0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i8) {
                                            case 0:
                                                lu0Var4.invoke(li0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(li0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(li0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i3 = 2;
                            }
                            dv1 dv1VarA2 = bk.a(dv1VarL3, (au0) objQ2);
                            er1 er1VarC7 = ws.c(prVar7, false);
                            int iHashCode16 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ12 = ov0Var2.z();
                            dv1 dv1VarH16 = xp1.H(ov0Var2, dv1VarA2);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC7);
                            q73.h(ov0Var2, ghVar2, l72VarZ12);
                            az2.s(iHashCode16, ov0Var2, ghVar3, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar4, dv1VarH16);
                            t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            prVar6 = prVar7;
                            c30Var5 = c30Var6;
                            nrVar2 = nrVar3;
                            it = it2;
                            f3 = f5;
                            goVar2 = goVar3;
                            f2 = f4;
                        }
                        final int i8 = 1;
                        objQ = new au0() { // from class: mo1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i9 = i8;
                                mf3 mf3Var = mf3.a;
                                li0 li0Var4 = li0Var2;
                                lu0 lu0Var4 = lu0Var2;
                                switch (i9) {
                                    case 0:
                                        lu0Var4.invoke(li0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(li0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(li0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ);
                        dv1 dv1VarA3 = bk.a(dv1VarL2, (au0) objQ);
                        er1 er1VarC8 = ws.c(prVar7, false);
                        int iHashCode17 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ13 = ov0Var2.z();
                        dv1 dv1VarH17 = xp1.H(ov0Var2, dv1VarA3);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC8);
                        q73.h(ov0Var2, ghVar2, l72VarZ13);
                        az2.s(iHashCode17, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH17);
                        c30 c30Var7 = c30Var3;
                        t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.g, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        gh0.h(ov0Var2, iw2.o(av1Var, 6.0f));
                        dv1 dv1VarL4 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(li0Var2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i3 = 2;
                            objQ2 = new au0() { // from class: mo1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i9 = i3;
                                    mf3 mf3Var = mf3.a;
                                    li0 li0Var4 = li0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i9) {
                                        case 0:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(li0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i3 = 2;
                            objQ2 = new au0() { // from class: mo1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i9 = i3;
                                    mf3 mf3Var = mf3.a;
                                    li0 li0Var4 = li0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i9) {
                                        case 0:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(li0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA4 = bk.a(dv1VarL4, (au0) objQ2);
                        er1 er1VarC9 = ws.c(prVar7, false);
                        int iHashCode18 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ14 = ov0Var2.z();
                        dv1 dv1VarH18 = xp1.H(ov0Var2, dv1VarA4);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC9);
                        q73.h(ov0Var2, ghVar2, l72VarZ14);
                        az2.s(iHashCode18, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH18);
                        t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        prVar6 = prVar7;
                        c30Var5 = c30Var7;
                        nrVar2 = nrVar3;
                        it = it2;
                        f3 = f5;
                        goVar2 = goVar3;
                        f2 = f4;
                    }
                    z2 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objQ4 = new au0() { // from class: mo1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i9 = objArr;
                            mf3 mf3Var = mf3.a;
                            li0 li0Var4 = li0Var3;
                            lu0 lu0Var4 = lu0Var;
                            switch (i9) {
                                case 0:
                                    lu0Var4.invoke(li0Var4.a);
                                    break;
                                case 1:
                                    lu0Var4.invoke(li0Var4);
                                    break;
                                default:
                                    lu0Var4.invoke(li0Var4.a);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ4);
                    i6 = i7;
                    dv1 dv1VarE8 = zm3.E(bk.a(dv1VarW2, (au0) objQ4), 10.0f, 9.0f);
                    prVar = prVar5;
                    er1 er1VarC10 = ws.c(prVar, z2);
                    int iHashCode19 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ15 = ov0Var2.z();
                    dv1 dv1VarH19 = xp1.H(ov0Var2, dv1VarE8);
                    w20.b.getClass();
                    c30Var2 = c30Var;
                    x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    ghVar = v20.e;
                    q73.h(ov0Var2, ghVar, er1VarC10);
                    ghVar2 = v20.d;
                    q73.h(ov0Var2, ghVar2, l72VarZ15);
                    Integer numValueOf3 = Integer.valueOf(iHashCode19);
                    ghVar3 = v20.f;
                    q73.h(ov0Var2, ghVar3, numValueOf3);
                    waVar = v20.g;
                    q73.g(ov0Var2, waVar);
                    Iterator it3 = it;
                    ghVar4 = v20.c;
                    q73.h(ov0Var2, ghVar4, dv1VarH19);
                    dv1 dv1VarE9 = iw2.e(av1Var, 1.0f);
                    z3 = z6;
                    pr prVar9 = prVar6;
                    go goVar4 = goVar2;
                    or orVar4 = orVar2;
                    kk2 kk2VarA7 = jk2.a(goVar4, orVar4, ov0Var2, 48);
                    int iHashCode110 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ16 = ov0Var2.z();
                    dv1 dv1VarH110 = xp1.H(ov0Var2, dv1VarE9);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA7);
                    q73.h(ov0Var2, ghVar2, l72VarZ16);
                    az2.s(iHashCode110, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH110);
                    if (z3) {
                        x01VarR = ee0.B();
                    } else {
                        x01VarR = dh0.r();
                    }
                    x01 x01Var2 = x01VarR;
                    if (z3) {
                        ov0Var2.c0(73282589);
                        ov0Var2.s();
                        jC4 = bk.g;
                        f = 0.4f;
                    } else {
                        ov0Var2.c0(73284331);
                        f = 0.4f;
                        jC4 = hz.c(0.4f, ((kz) ov0Var2.j(mz.a)).q);
                        ov0Var2.s();
                    }
                    float f6 = f;
                    float f7 = f3;
                    nr nrVar4 = nrVar2;
                    t01.a(x01Var2, null, iw2.k(av1Var, 17.0f), jC4, ov0Var2, 432, 0);
                    gh0.h(ov0Var2, iw2.o(av1Var, 8.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA4 = wz.a(am1.g, nrVar4, ov0Var2, 0);
                    int iHashCode111 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ17 = ov0Var2.z();
                    dv1 dv1VarH111 = xp1.H(ov0Var2, wb1Var2);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, yzVarA4);
                    q73.h(ov0Var2, ghVar2, l72VarZ17);
                    az2.s(iHashCode111, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH111);
                    kk2 kk2VarA8 = jk2.a(new jo(6.0f, true, new fo(0)), orVar4, ov0Var2, 54);
                    int iHashCode112 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ18 = ov0Var2.z();
                    dv1 dv1VarH112 = xp1.H(ov0Var2, av1Var);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA8);
                    q73.h(ov0Var2, ghVar2, l72VarZ18);
                    az2.s(iHashCode112, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH112);
                    str2 = li0Var3.b;
                    if (l13.k0(str2)) {
                        str2 = "<Hidden SSID>";
                    }
                    long jB2 = v63.b(13.5d);
                    jr0Var2 = jr0.j;
                    hh0Var2 = mz.a;
                    orVar2 = orVar4;
                    ov0 ov0Var6 = ov0Var2;
                    s83.b(str2, null, ((kz) ov0Var2.j(hh0Var2)).q, jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                    ov0Var = ov0Var6;
                    if (z3) {
                        ov0Var.c0(-1034769151);
                        dv1 dv1VarN5 = xp1.n(av1Var, cj2.a(4.0f));
                        long j4 = bk.g;
                        dv1 dv1VarE10 = zm3.E(xp1.l(dv1VarN5, hz.c(0.15f, j4)), 5.0f, 1.0f);
                        er1 er1VarC11 = ws.c(prVar, false);
                        int iHashCode113 = Long.hashCode(ks.U(ov0Var));
                        l72 l72VarZ19 = ov0Var.z();
                        dv1 dv1VarH113 = xp1.H(ov0Var, dv1VarE10);
                        ov0Var.g0();
                        if (ov0Var.D()) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, er1VarC11);
                        q73.h(ov0Var, ghVar2, l72VarZ19);
                        az2.s(iHashCode113, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH113);
                        jr0Var2 = jr0Var2;
                        i2 = -1043383307;
                        prVar2 = prVar;
                        s83.b(ke0.N(2131624390, ov0Var), null, j4, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                        ov0Var = ov0Var;
                        ov0Var.r();
                    } else {
                        prVar2 = prVar;
                        i2 = -1043383307;
                        ov0Var.c0(-1043383307);
                    }
                    ov0Var.s();
                    li0Var = li0Var3;
                    if (li0Var.g) {
                        ov0Var.c0(-1033801114);
                        dv1 dv1VarN6 = xp1.n(av1Var, cj2.a(4.0f));
                        long j5 = bk.h;
                        dv1 dv1VarE11 = zm3.E(xp1.l(dv1VarN6, hz.c(0.15f, j5)), 5.0f, 1.0f);
                        pr prVar10 = prVar2;
                        er1 er1VarC12 = ws.c(prVar10, false);
                        int iHashCode114 = Long.hashCode(ks.U(ov0Var));
                        l72 l72VarZ110 = ov0Var.z();
                        dv1 dv1VarH114 = xp1.H(ov0Var, dv1VarE11);
                        ov0Var.g0();
                        if (ov0Var.D()) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, er1VarC12);
                        q73.h(ov0Var, ghVar2, l72VarZ110);
                        az2.s(iHashCode114, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH114);
                        prVar5 = prVar10;
                        ov0 ov0Var7 = ov0Var;
                        s83.b(ke0.N(2131624345, ov0Var), null, j5, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597824, 0, 262058);
                        ov0Var = ov0Var7;
                        ov0Var.r();
                        ov0Var.s();
                        li0Var = li0Var;
                    } else {
                        prVar5 = prVar2;
                        ov0Var.c0(i2);
                        ov0Var.s();
                    }
                    ov0Var.r();
                    gh0.h(ov0Var, iw2.g(av1Var, 3.0f));
                    li0Var2 = li0Var;
                    ov0 ov0Var8 = ov0Var;
                    s83.b(li0Var.a + "  •  " + li0Var.d + " dBm  •  " + li0Var.c + " MHz", null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 24576, 0, 262122);
                    ov0Var2 = ov0Var8;
                    if (l13.k0(li0Var2.e)) {
                        ov0Var2.c0(2116043948);
                        s83.b(li0Var2.e, null, hz.c(0.38f, ((kz) ov0Var2.j(hh0Var2)).q), v63.c(10), null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var2, 24576, 24576, 245738);
                        ov0Var2 = ov0Var2;
                    } else {
                        ov0Var2.c0(2105074009);
                    }
                    ov0Var2.s();
                    ov0Var2.r();
                    dv1 dv1VarK3 = iw2.k(av1Var, 28.0f);
                    bj2 bj2Var2 = cj2.a;
                    dv1 dv1VarL5 = xp1.l(xp1.n(dv1VarK3, bj2Var2), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var2)).q));
                    zF = ov0Var2.f(li0Var2);
                    objQ = ov0Var2.Q();
                    if (zF) {
                        c30Var3 = c30Var2;
                        if (objQ == c30Var3) {
                        }
                        dv1 dv1VarA5 = bk.a(dv1VarL5, (au0) objQ);
                        er1 er1VarC13 = ws.c(prVar9, false);
                        int iHashCode115 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ111 = ov0Var2.z();
                        dv1 dv1VarH115 = xp1.H(ov0Var2, dv1VarA5);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC13);
                        q73.h(ov0Var2, ghVar2, l72VarZ111);
                        az2.s(iHashCode115, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH115);
                        c30 c30Var8 = c30Var3;
                        t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.g, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        gh0.h(ov0Var2, iw2.o(av1Var, 6.0f));
                        dv1 dv1VarL6 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var2), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(li0Var2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i3 = 2;
                            objQ2 = new au0() { // from class: mo1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i9 = i3;
                                    mf3 mf3Var = mf3.a;
                                    li0 li0Var4 = li0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i9) {
                                        case 0:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(li0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i3 = 2;
                            objQ2 = new au0() { // from class: mo1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i9 = i3;
                                    mf3 mf3Var = mf3.a;
                                    li0 li0Var4 = li0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i9) {
                                        case 0:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(li0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(li0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA6 = bk.a(dv1VarL6, (au0) objQ2);
                        er1 er1VarC14 = ws.c(prVar9, false);
                        int iHashCode116 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ112 = ov0Var2.z();
                        dv1 dv1VarH116 = xp1.H(ov0Var2, dv1VarA6);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC14);
                        q73.h(ov0Var2, ghVar2, l72VarZ112);
                        az2.s(iHashCode116, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH116);
                        t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        prVar6 = prVar9;
                        c30Var5 = c30Var8;
                        nrVar2 = nrVar4;
                        it = it3;
                        f3 = f7;
                        goVar2 = goVar4;
                        f2 = f6;
                    } else {
                        c30Var3 = c30Var2;
                    }
                    final int i9 = 1;
                    objQ = new au0() { // from class: mo1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i10 = i9;
                            mf3 mf3Var = mf3.a;
                            li0 li0Var4 = li0Var2;
                            lu0 lu0Var4 = lu0Var2;
                            switch (i10) {
                                case 0:
                                    lu0Var4.invoke(li0Var4.a);
                                    break;
                                case 1:
                                    lu0Var4.invoke(li0Var4);
                                    break;
                                default:
                                    lu0Var4.invoke(li0Var4.a);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ);
                    dv1 dv1VarA7 = bk.a(dv1VarL5, (au0) objQ);
                    er1 er1VarC15 = ws.c(prVar9, false);
                    int iHashCode117 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ113 = ov0Var2.z();
                    dv1 dv1VarH117 = xp1.H(ov0Var2, dv1VarA7);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC15);
                    q73.h(ov0Var2, ghVar2, l72VarZ113);
                    az2.s(iHashCode117, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH117);
                    c30 c30Var9 = c30Var3;
                    t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.g, ov0Var2, 3504, 0);
                    ov0Var2.r();
                    gh0.h(ov0Var2, iw2.o(av1Var, 6.0f));
                    dv1 dv1VarL7 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var2), hz.c(0.08f, xp1.d(4293212469L)));
                    zF2 = ov0Var2.f(li0Var2);
                    objQ2 = ov0Var2.Q();
                    if (zF2) {
                        i3 = 2;
                        objQ2 = new au0() { // from class: mo1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i10 = i3;
                                mf3 mf3Var = mf3.a;
                                li0 li0Var4 = li0Var2;
                                lu0 lu0Var4 = lu0Var3;
                                switch (i10) {
                                    case 0:
                                        lu0Var4.invoke(li0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(li0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(li0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ2);
                    } else {
                        i3 = 2;
                        objQ2 = new au0() { // from class: mo1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i10 = i3;
                                mf3 mf3Var = mf3.a;
                                li0 li0Var4 = li0Var2;
                                lu0 lu0Var4 = lu0Var3;
                                switch (i10) {
                                    case 0:
                                        lu0Var4.invoke(li0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(li0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(li0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ2);
                    }
                    dv1 dv1VarA8 = bk.a(dv1VarL7, (au0) objQ2);
                    er1 er1VarC16 = ws.c(prVar9, false);
                    int iHashCode118 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ114 = ov0Var2.z();
                    dv1 dv1VarH118 = xp1.H(ov0Var2, dv1VarA8);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC16);
                    q73.h(ov0Var2, ghVar2, l72VarZ114);
                    az2.s(iHashCode118, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH118);
                    t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                    ov0Var2.r();
                    ov0Var2.r();
                    ov0Var2.r();
                    prVar6 = prVar9;
                    c30Var5 = c30Var9;
                    nrVar2 = nrVar4;
                    it = it3;
                    f3 = f7;
                    goVar2 = goVar4;
                    f2 = f6;
                }
                ov0Var2.s();
                ov0Var2.r();
                ov0Var2.s();
            }
            ov0Var2.r();
        } else {
            ov0Var2.W();
        }
        ee2 ee2VarT = ov0Var2.t();
        if (ee2VarT != null) {
            ee2VarT.e(new sn1(list, str, z, lu0Var, au0Var, lu0Var2, lu0Var3, i, 2));
        }
    }

    public static byte[] a0(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static final void b(is1 is1Var, au0 au0Var, au0 au0Var2, f30 f30Var, int i) {
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-288744847);
        int i2 = 4;
        int i3 = (ov0Var.h(is1Var) ? 4 : 2) | i | (ov0Var.h(au0Var) ? 32 : 16) | (ov0Var.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ey1 ey1VarS = ee0.s(is1Var.d, ov0Var);
            boolean zH = ov0Var.h(is1Var);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                objQ = new p00(is1Var, null, i2);
                ov0Var.m0(objQ);
            }
            oi0.e(ov0Var, (pu0) objQ, is1Var);
            g(sb.a0(-463964455, new lr1(au0Var, is1Var, au0Var2, ey1VarS), ov0Var), ov0Var, 6);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new f5(is1Var, au0Var, au0Var2, i, 6);
        }
    }

    public static long b0(InputStream inputStream, int i) throws IOException {
        byte[] bArrZ = Z(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrZ[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final void c(String str, au0 au0Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1113578407);
        int i2 = i | (ov0Var.f(str) ? 4 : 2) | (ov0Var.h(au0Var) ? 32 : 16);
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            dv1 dv1VarF = zm3.F(ji2.U(iw2.e(av1.a, 1.0f)), 0.0f, 8.0f, 1);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarF);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, kk2VarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            xq1.l(au0Var, null, false, null, null, xq1.d, ov0Var, ((i2 >> 3) & 14) | 1572864, 62);
            s83.b(str, null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).g, ov0Var, (i2 & 14) | 1572864, 0, 131006);
            ov0Var = ov0Var;
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i, 18, str, au0Var);
        }
    }

    public static final Object c0(Object[] objArr, au0 au0Var, f30 f30Var, int i) {
        return e0(Arrays.copyOf(objArr, objArr.length), ji2.u, au0Var, f30Var, ((i << 6) & 7168) | 384, 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x0220  */
    /* JADX WARN: Code duplicated, block: B:88:0x0255  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:93:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void d(final is1 is1Var, final au0 au0Var, final au0 au0Var2, final au0 au0Var3, boolean z, f30 f30Var, final int i, final int i2) {
        boolean z2;
        int i3;
        boolean z3;
        final boolean z4;
        ee2 ee2VarT;
        ey1 ey1VarS;
        Context context;
        Object objQ;
        c30 c30Var;
        Object wg2Var;
        final boolean zBooleanValue;
        Object objQ2;
        final co2 co2VarO;
        Object objQ3;
        s52 s52Var;
        Object objQ4;
        s52 s52Var2;
        Object objQ5;
        ey1 ey1Var;
        Object objQ6;
        ey1 ey1Var2;
        final boolean z5;
        CloudEntitlements cloudEntitlements;
        String tier;
        boolean z6;
        boolean zF;
        Object objQ7;
        ey1 ey1Var3;
        ey1 ey1Var4;
        s52 s52Var3;
        s52 s52Var4;
        int i4;
        boolean zF2;
        Object objQ8;
        xe1 lifecycle;
        boolean zH;
        Object objQ9;
        boolean zH2;
        Object objQ10;
        is1 is1Var2 = is1Var;
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(567030117);
        int i5 = (ov0Var.h(is1Var2) ? 4 : 2) | i | (ov0Var.h(au0Var) ? 32 : 16) | (ov0Var.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i5 |= ov0Var.g(z2) ? 16384 : 8192;
            }
            i3 = i5;
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var.T(i3 & 1, z3)) {
                if (i6 != 0) {
                    z2 = false;
                }
                ey1VarS = ee0.s(is1Var2.d, ov0Var);
                final ey1 ey1VarS2 = ee0.s(is1Var2.e, ov0Var);
                context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
                objQ = ov0Var.Q();
                c30Var = d30.a;
                if (objQ == c30Var) {
                    try {
                        wg2Var = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 0);
                    } catch (Throwable th) {
                        wg2Var = new wg2(th);
                    }
                    objQ = Boolean.valueOf(!(wg2Var instanceof wg2));
                    ov0Var.m0(objQ);
                }
                zBooleanValue = ((Boolean) objQ).booleanValue();
                Object[] objArr = new Object[0];
                objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    objQ2 = new au0() { // from class: pr1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            return ke0.H(zBooleanValue ? "alipay_app" : "qr");
                        }
                    };
                    ov0Var.m0(objQ2);
                }
                final ey1 ey1Var5 = (ey1) c0(objArr, (au0) objQ2, ov0Var, 48);
                co2VarO = zm3.O(ov0Var);
                objQ3 = ov0Var.Q();
                if (objQ3 == c30Var) {
                    objQ3 = new s52(0.0f);
                    ov0Var.m0(objQ3);
                }
                s52Var = (s52) objQ3;
                objQ4 = ov0Var.Q();
                if (objQ4 == c30Var) {
                    objQ4 = new s52(0.0f);
                    ov0Var.m0(objQ4);
                }
                s52Var2 = (s52) objQ4;
                objQ5 = ov0Var.Q();
                if (objQ5 == c30Var) {
                    objQ5 = ke0.H(Boolean.FALSE);
                    ov0Var.m0(objQ5);
                }
                ey1Var = (ey1) objQ5;
                objQ6 = ov0Var.Q();
                if (objQ6 == c30Var) {
                    objQ6 = ke0.H(Boolean.FALSE);
                    ov0Var.m0(objQ6);
                }
                ey1Var2 = (ey1) objQ6;
                Boolean boolValueOf = Boolean.valueOf(z2);
                MembershipCatalog membershipCatalog = ((cs1) ey1VarS.getValue()).a;
                z5 = z2;
                cloudEntitlements = ((cs1) ey1VarS.getValue()).j;
                if (cloudEntitlements != null) {
                    tier = cloudEntitlements.getTier();
                } else {
                    tier = null;
                }
                Boolean boolValueOf2 = Boolean.valueOf(((cs1) ey1VarS.getValue()).d);
                Boolean bool = (Boolean) ey1Var.getValue();
                bool.getClass();
                Object[] objArr2 = {boolValueOf, membershipCatalog, tier, boolValueOf2, bool};
                if ((i3 & 57344) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF = z6 | ov0Var.f(ey1VarS) | ov0Var.h(is1Var2) | ov0Var.f(co2VarO);
                objQ7 = ov0Var.Q();
                if (!zF || objQ7 == c30Var) {
                    ey1Var3 = ey1VarS;
                    ey1Var4 = ey1Var;
                    s52Var3 = s52Var;
                    s52Var4 = s52Var2;
                    i4 = 0;
                    vr1 vr1Var = new vr1(z5, co2VarO, ey1Var2, ey1Var4, ey1Var3, is1Var2, s52Var3, s52Var4, null);
                    is1Var2 = is1Var2;
                    ov0Var.m0(vr1Var);
                    objQ7 = vr1Var;
                } else {
                    ey1Var4 = ey1Var;
                    s52Var3 = s52Var;
                    ey1Var3 = ey1VarS;
                    s52Var4 = s52Var2;
                    i4 = 0;
                }
                oi0.h(objArr2, (pu0) objQ7, ov0Var);
                String str = ((cs1) ey1Var3.getValue()).g;
                zF2 = ov0Var.f(ey1Var3) | ov0Var.f(co2VarO);
                objQ8 = ov0Var.Q();
                if (zF2 || objQ8 == c30Var) {
                    objQ8 = new wr1(co2VarO, ey1Var3, null, i4);
                    ov0Var.m0(objQ8);
                }
                oi0.e(ov0Var, (pu0) objQ8, str);
                lifecycle = ((df1) ov0Var.j(kh1.a)).getLifecycle();
                zH = ov0Var.h(is1Var2) | ov0Var.h(lifecycle);
                objQ9 = ov0Var.Q();
                if (zH || objQ9 == c30Var) {
                    objQ9 = new jl1(3, lifecycle, is1Var2);
                    ov0Var.m0(objQ9);
                }
                oi0.b(lifecycle, is1Var2, (lu0) objQ9, ov0Var);
                zH2 = ov0Var.h(is1Var2) | ov0Var.h(r7);
                objQ10 = ov0Var.Q();
                if (zH2 || objQ10 == c30Var) {
                    objQ10 = new wr1(is1Var2, context, null, 1);
                    ov0Var.m0(objQ10);
                }
                oi0.e(ov0Var, (pu0) objQ10, is1Var2);
                final ey1 ey1Var6 = ey1Var4;
                final ey1 ey1Var7 = ey1Var3;
                final s52 s52Var5 = s52Var3;
                final s52 s52Var6 = s52Var4;
                final is1 is1Var3 = is1Var2;
                g(sb.a0(-1426052147, new pu0() { // from class: tr1
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        wc0.e(au0Var, co2VarO, s52Var6, is1Var3, zBooleanValue, ey1Var5, ey1VarS2, au0Var3, ey1Var7, au0Var2, z5, s52Var5, ey1Var6, (f30) obj, iIntValue);
                        return mf3.a;
                    }
                }, ov0Var), ov0Var, 6);
                z4 = z5;
            } else {
                ov0Var.W();
                z4 = z2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: ur1
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wc0.d(is1Var, au0Var, au0Var2, au0Var3, z4, (f30) obj, wc0.m0(i | 1), i2);
                        return mf3.a;
                    }
                };
            }
        }
        i5 |= 24576;
        z2 = z;
        i3 = i5;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ov0Var.T(i3 & 1, z3)) {
            if (i6 != 0) {
                z2 = false;
            }
            ey1VarS = ee0.s(is1Var2.d, ov0Var);
            final ey1 ey1VarS3 = ee0.s(is1Var2.e, ov0Var);
            context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            objQ = ov0Var.Q();
            c30Var = d30.a;
            if (objQ == c30Var) {
                wg2Var = context.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 0);
                objQ = Boolean.valueOf(!(wg2Var instanceof wg2));
                ov0Var.m0(objQ);
            }
            zBooleanValue = ((Boolean) objQ).booleanValue();
            Object[] objArr3 = new Object[0];
            objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new au0() { // from class: pr1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        return ke0.H(zBooleanValue ? "alipay_app" : "qr");
                    }
                };
                ov0Var.m0(objQ2);
            }
            final ey1 ey1Var8 = (ey1) c0(objArr3, (au0) objQ2, ov0Var, 48);
            co2VarO = zm3.O(ov0Var);
            objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new s52(0.0f);
                ov0Var.m0(objQ3);
            }
            s52Var = (s52) objQ3;
            objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                objQ4 = new s52(0.0f);
                ov0Var.m0(objQ4);
            }
            s52Var2 = (s52) objQ4;
            objQ5 = ov0Var.Q();
            if (objQ5 == c30Var) {
                objQ5 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ5);
            }
            ey1Var = (ey1) objQ5;
            objQ6 = ov0Var.Q();
            if (objQ6 == c30Var) {
                objQ6 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ6);
            }
            ey1Var2 = (ey1) objQ6;
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            MembershipCatalog membershipCatalog2 = ((cs1) ey1VarS.getValue()).a;
            z5 = z2;
            cloudEntitlements = ((cs1) ey1VarS.getValue()).j;
            if (cloudEntitlements != null) {
                tier = cloudEntitlements.getTier();
            } else {
                tier = null;
            }
            Boolean boolValueOf4 = Boolean.valueOf(((cs1) ey1VarS.getValue()).d);
            Boolean bool2 = (Boolean) ey1Var.getValue();
            bool2.getClass();
            Object[] objArr4 = {boolValueOf3, membershipCatalog2, tier, boolValueOf4, bool2};
            if ((i3 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            zF = z6 | ov0Var.f(ey1VarS) | ov0Var.h(is1Var2) | ov0Var.f(co2VarO);
            objQ7 = ov0Var.Q();
            if (zF) {
                ey1Var3 = ey1VarS;
                ey1Var4 = ey1Var;
                s52Var3 = s52Var;
                s52Var4 = s52Var2;
                i4 = 0;
                vr1 vr1Var2 = new vr1(z5, co2VarO, ey1Var2, ey1Var4, ey1Var3, is1Var2, s52Var3, s52Var4, null);
                is1Var2 = is1Var2;
                ov0Var.m0(vr1Var2);
                objQ7 = vr1Var2;
            } else {
                ey1Var3 = ey1VarS;
                ey1Var4 = ey1Var;
                s52Var3 = s52Var;
                s52Var4 = s52Var2;
                i4 = 0;
                vr1 vr1Var3 = new vr1(z5, co2VarO, ey1Var2, ey1Var4, ey1Var3, is1Var2, s52Var3, s52Var4, null);
                is1Var2 = is1Var2;
                ov0Var.m0(vr1Var3);
                objQ7 = vr1Var3;
            }
            oi0.h(objArr4, (pu0) objQ7, ov0Var);
            String str2 = ((cs1) ey1Var3.getValue()).g;
            zF2 = ov0Var.f(ey1Var3) | ov0Var.f(co2VarO);
            objQ8 = ov0Var.Q();
            if (zF2) {
                objQ8 = new wr1(co2VarO, ey1Var3, null, i4);
                ov0Var.m0(objQ8);
            } else {
                objQ8 = new wr1(co2VarO, ey1Var3, null, i4);
                ov0Var.m0(objQ8);
            }
            oi0.e(ov0Var, (pu0) objQ8, str2);
            lifecycle = ((df1) ov0Var.j(kh1.a)).getLifecycle();
            zH = ov0Var.h(is1Var2) | ov0Var.h(lifecycle);
            objQ9 = ov0Var.Q();
            if (zH) {
                objQ9 = new jl1(3, lifecycle, is1Var2);
                ov0Var.m0(objQ9);
            } else {
                objQ9 = new jl1(3, lifecycle, is1Var2);
                ov0Var.m0(objQ9);
            }
            oi0.b(lifecycle, is1Var2, (lu0) objQ9, ov0Var);
            zH2 = ov0Var.h(is1Var2) | ov0Var.h(r7);
            objQ10 = ov0Var.Q();
            if (zH2) {
                objQ10 = new wr1(is1Var2, context, null, 1);
                ov0Var.m0(objQ10);
            } else {
                objQ10 = new wr1(is1Var2, context, null, 1);
                ov0Var.m0(objQ10);
            }
            oi0.e(ov0Var, (pu0) objQ10, is1Var2);
            final ey1 ey1Var9 = ey1Var4;
            final ey1 ey1Var10 = ey1Var3;
            final s52 s52Var7 = s52Var3;
            final s52 s52Var8 = s52Var4;
            final is1 is1Var4 = is1Var2;
            g(sb.a0(-1426052147, new pu0() { // from class: tr1
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    wc0.e(au0Var, co2VarO, s52Var8, is1Var4, zBooleanValue, ey1Var8, ey1VarS3, au0Var3, ey1Var10, au0Var2, z5, s52Var7, ey1Var9, (f30) obj, iIntValue);
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 6);
            z4 = z5;
        } else {
            ov0Var.W();
            z4 = z2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: ur1
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wc0.d(is1Var, au0Var, au0Var2, au0Var3, z4, (f30) obj, wc0.m0(i | 1), i2);
                    return mf3.a;
                }
            };
        }
    }

    public static final Object d0(Object[] objArr, wm2 wm2Var, au0 au0Var, f30 f30Var, int i) {
        return e0(Arrays.copyOf(objArr, objArr.length), wm2Var, au0Var, f30Var, 384 | ((i << 3) & 7168), 0);
    }

    /* JADX WARN: Code duplicated, block: B:321:0x0d4a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [uj0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    public static final void e(au0 au0Var, co2 co2Var, s52 s52Var, final is1 is1Var, boolean z, ey1 ey1Var, s03 s03Var, au0 au0Var2, ey1 ey1Var2, au0 au0Var3, boolean z2, s52 s52Var2, ey1 ey1Var3, f30 f30Var, int i) {
        Object next;
        int i2;
        int i3;
        Object next2;
        Object next3;
        av1 av1Var;
        ?? arrayList;
        Object next4;
        boolean z3;
        ey1 ey1Var4;
        MembershipCatalog membershipCatalog;
        CloudAccount account;
        List<CloudDeviceSlot> slots;
        ArrayList arrayList2;
        List<CloudDeviceSlot> slots2;
        dv1 dv1VarE;
        String str;
        int i4;
        or orVar;
        lk2 lk2Var;
        Iterator it;
        or orVar2 = j9.o;
        nr nrVar = j9.r;
        ov0 ov0Var = (ov0) f30Var;
        if (!ov0Var.T(i & 1, (i & 3) != 2)) {
            ov0Var.W();
            return;
        }
        dv1 dv1VarD = iw2.d();
        hh0 hh0Var = mz.a;
        dv1 dv1VarL = xp1.l(dv1VarD, ((kz) ov0Var.j(hh0Var)).n);
        yz yzVarA = wz.a(am1.g, nrVar, ov0Var, 0);
        int iHashCode = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ = ov0Var.z();
        dv1 dv1VarH = xp1.H(ov0Var, dv1VarL);
        w20.b.getClass();
        x30 x30Var = v20.b;
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var);
        } else {
            ov0Var.p0();
        }
        gh ghVar = v20.e;
        q73.h(ov0Var, ghVar, yzVarA);
        gh ghVar2 = v20.d;
        q73.h(ov0Var, ghVar2, l72VarZ);
        Integer numValueOf = Integer.valueOf(iHashCode);
        gh ghVar3 = v20.f;
        q73.h(ov0Var, ghVar3, numValueOf);
        wa waVar = v20.g;
        q73.g(ov0Var, waVar);
        gh ghVar4 = v20.c;
        q73.h(ov0Var, ghVar4, dv1VarH);
        c(ke0.N(2131624761, ov0Var), au0Var, ov0Var, 0);
        dv1 dv1VarD2 = iw2.d();
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = new ci1(s52Var, 1);
            ov0Var.m0(objQ);
        }
        dv1 dv1VarG = zm3.G(ji2.J(zm3.F(zm3.W(k22.G(dv1VarD2, (lu0) objQ), co2Var), 16.0f, 0.0f, 2)), 0.0f, 0.0f, 0.0f, 24.0f, 7);
        or orVar3 = orVar2;
        yz yzVarA2 = wz.a(new jo(16.0f, true, new fo(0)), nrVar, ov0Var, 6);
        int iHashCode2 = Long.hashCode(ks.U(ov0Var));
        l72 l72VarZ2 = ov0Var.z();
        dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarG);
        ov0Var.g0();
        if (ov0Var.D()) {
            ov0Var.k(x30Var);
        } else {
            ov0Var.p0();
        }
        q73.h(ov0Var, ghVar, yzVarA2);
        q73.h(ov0Var, ghVar2, l72VarZ2);
        az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
        q73.h(ov0Var, ghVar4, dv1VarH2);
        av1 av1Var2 = av1.a;
        sb.C(iw2.e(av1Var2, 1.0f), cj2.a(22.0f), ym3.t(((kz) ov0Var.j(hh0Var)).p, 0L, ov0Var, 0, 14), null, sb.a0(2091150895, new bu(5, s03Var, au0Var2), ov0Var), ov0Var, 196614, 24);
        ov0 ov0Var2 = ov0Var;
        Iterator it2 = f(ey1Var2).b.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!o51.f(((MembershipOrder) next).getId(), f(ey1Var2).g));
        final MembershipOrder membershipOrder = (MembershipOrder) next;
        if (membershipOrder == null) {
            ov0Var2.c0(1205185);
        } else {
            ov0Var2.c0(1205186);
            boolean z4 = f(ey1Var2).d;
            boolean zH = ov0Var2.h(is1Var);
            Object objQ2 = ov0Var2.Q();
            if (zH || objQ2 == c30Var) {
                objQ2 = new t4(is1Var);
                ov0Var2.m0(objQ2);
            }
            au0 au0Var4 = (au0) ((o81) objQ2);
            boolean zH2 = ov0Var2.h(is1Var);
            Object objQ3 = ov0Var2.Q();
            if (zH2 || objQ3 == c30Var) {
                final int i5 = 0;
                objQ3 = new au0() { // from class: nr1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i6 = i5;
                        mf3 mf3Var = mf3.a;
                        is1 is1Var2 = is1Var;
                        switch (i6) {
                            case 0:
                                is1Var2.e();
                                break;
                            case 1:
                                is1Var2.m(null);
                                break;
                            default:
                                is1Var2.l(null);
                                break;
                        }
                        return mf3Var;
                    }
                };
                ov0Var2.m0(objQ3);
            }
            au0 au0Var5 = (au0) objQ3;
            boolean zH3 = ov0Var2.h(is1Var) | ov0Var2.h(membershipOrder);
            Object objQ4 = ov0Var2.Q();
            if (zH3 || objQ4 == c30Var) {
                final int i6 = 1;
                objQ4 = new au0() { // from class: mr1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        CloudAccount account2;
                        List<MembershipOrder> list;
                        int i7 = i6;
                        mf3 mf3Var = mf3.a;
                        MembershipOrder membershipOrder2 = membershipOrder;
                        is1 is1Var2 = is1Var;
                        switch (i7) {
                            case 0:
                                is1Var2.i(membershipOrder2.getId());
                                break;
                            case 1:
                                String id = membershipOrder2.getId();
                                StateFlow stateFlow = is1Var2.e;
                                id.getClass();
                                MutableStateFlow mutableStateFlow = is1Var2.c;
                                if (!((cs1) mutableStateFlow.getValue()).d && ((CloudAccountState) stateFlow.getValue()).getValidated() && (account2 = ((CloudAccountState) stateFlow.getValue()).getAccount()) != null && !account2.isGuest() && ((list = ((cs1) mutableStateFlow.getValue()).b) == null || !list.isEmpty())) {
                                    for (MembershipOrder membershipOrder3 : list) {
                                        if (o51.f(membershipOrder3.getId(), id) && membershipOrder3.getWaiting()) {
                                            is1Var2.j(new es1(is1Var2, id, null));
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                is1Var2.i(membershipOrder2.getId());
                                break;
                        }
                        return mf3Var;
                    }
                };
                ov0Var2.m0(objQ4);
            }
            h(membershipOrder, z4, au0Var4, au0Var5, (au0) objQ4, ov0Var2, 0);
            ov0Var2 = ov0Var2;
        }
        ov0Var2.s();
        CloudAccount account2 = ((CloudAccountState) s03Var.getValue()).getAccount();
        int i7 = 4;
        if (account2 == null || account2.isGuest() || !((CloudAccountState) s03Var.getValue()).getValidated()) {
            ov0Var2.c0(1439763);
            ov0 ov0Var3 = ov0Var2;
            i2 = -6688127;
            sb.C(null, null, null, null, sb.a0(223871540, new ak(i7, au0Var3), ov0Var2), ov0Var3, 196608, 31);
            ov0Var2 = ov0Var3;
            ov0Var2.s();
        } else {
            ov0Var2.c0(-6688127);
            ov0Var2.s();
            i2 = -6688127;
        }
        if (f(ey1Var2).a == null) {
            ov0Var2.c0(1804819);
            if (f(ey1Var2).d) {
                ov0Var2.c0(-969772007);
                ov0 ov0Var4 = ov0Var2;
                vc2.a(new by0(j9.s), bk.g, 0.0f, 0L, 0, 0.0f, ov0Var4, 48, 60);
                ov0Var2 = ov0Var4;
            } else {
                ov0Var2.c0(i2);
            }
            ov0Var2.s();
            ov0Var2.s();
            ey1Var4 = ey1Var2;
            av1Var = av1Var2;
            i3 = 0;
        } else {
            ov0Var2.c0(2180105);
            ov0Var2.c0(-969761855);
            String str2 = "membership";
            String str3 = "device_slot";
            Iterator it3 = am1.G(g83.g("membership", 2131624704), g83.g("device_slot", 2131624413), g83.g("quota", 2131624412)).iterator();
            while (it3.hasNext()) {
                i52 i52Var = (i52) it3.next();
                String str4 = (String) i52Var.e;
                int iIntValue = ((Number) i52Var.f).intValue();
                MembershipCatalog membershipCatalog2 = f(ey1Var2).a;
                membershipCatalog2.getClass();
                List<MembershipPlan> plans = membershipCatalog2.getPlans();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = plans.iterator();
                while (it4.hasNext()) {
                    Object next5 = it4.next();
                    MembershipPlan membershipPlan = (MembershipPlan) next5;
                    if (o51.f(membershipPlan.getProductKind(), str4)) {
                        if (o51.f(str4, "quota")) {
                            String tier = membershipPlan.getTier();
                            it = it4;
                            CloudEntitlements cloudEntitlements = f(ey1Var2).j;
                            if (o51.f(tier, cloudEntitlements != null ? cloudEntitlements.getTier() : null)) {
                            }
                        } else {
                            it = it4;
                        }
                        arrayList3.add(next5);
                    } else {
                        it = it4;
                    }
                    it4 = it;
                }
                if (!arrayList3.isEmpty() || (o51.f(str4, "quota") && z2)) {
                    ov0Var2.c0(670083614);
                    if (o51.f(str4, "quota")) {
                        ov0Var2.c0(-394024009);
                        dv1 dv1VarE2 = iw2.e(av1Var2, 1.0f);
                        Object objQ5 = ov0Var2.Q();
                        if (objQ5 == c30Var) {
                            objQ5 = new jl1(2, s52Var2, ey1Var3);
                            ov0Var2.m0(objQ5);
                        }
                        dv1VarE = k22.G(dv1VarE2, (lu0) objQ5);
                        ov0Var2.s();
                    } else {
                        it3 = it3;
                        str2 = str2;
                        ov0Var2.c0(-394021221);
                        ov0Var2.s();
                        dv1VarE = iw2.e(av1Var2, 1.0f);
                    }
                    yz yzVarA3 = wz.a(new jo(12.0f, true, new fo(0)), nrVar, ov0Var2, 6);
                    int iHashCode3 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ3 = ov0Var2.z();
                    dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA3);
                    q73.h(ov0Var2, v20.d, l72VarZ3);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode3));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH3);
                    String strN = ke0.N(iIntValue, ov0Var2);
                    hh0 hh0Var2 = le3.a;
                    ov0 ov0Var5 = ov0Var2;
                    str = str2;
                    s83.b(strN, null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var2)).h, ov0Var5, 1572864, 0, 131006);
                    ov0Var2 = ov0Var5;
                    if (o51.f(str4, "quota")) {
                        ov0Var2.c0(124593108);
                        i4 = 115076356;
                        s83.b(ke0.N(2131623979, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var2)).l, ov0Var2, 0, 0, 131066);
                        ov0Var2 = ov0Var2;
                    } else {
                        i4 = 115076356;
                        ov0Var2.c0(115076356);
                    }
                    ov0Var2.s();
                    if (arrayList3.isEmpty()) {
                        ov0Var2.c0(1666594466);
                        ov0 ov0Var6 = ov0Var2;
                        s83.b(ke0.N(2131624833, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262138);
                        ov0Var2 = ov0Var6;
                    } else {
                        ov0Var2.c0(i4);
                    }
                    ov0Var2.s();
                    ov0Var2.c0(1666599612);
                    ArrayList arrayListF0 = zy.f0(arrayList3, 2);
                    int size = arrayListF0.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayListF0.get(i8);
                        i8++;
                        List list = (List) obj;
                        dv1 dv1VarE3 = iw2.e(av1Var2, 1.0f);
                        ArrayList arrayList4 = arrayListF0;
                        or orVar4 = orVar3;
                        kk2 kk2VarA = jk2.a(new jo(12.0f, true, new fo(0)), orVar4, ov0Var2, 6);
                        int iHashCode4 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ4 = ov0Var2.z();
                        dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarE3);
                        w20.b.getClass();
                        int i9 = size;
                        x30 x30Var3 = v20.b;
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var3);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, v20.e, kk2VarA);
                        q73.h(ov0Var2, v20.d, l72VarZ4);
                        q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode4));
                        q73.g(ov0Var2, v20.g);
                        q73.h(ov0Var2, v20.c, dv1VarH4);
                        ov0Var2.c0(-1299032418);
                        Iterator it5 = list.iterator();
                        while (true) {
                            boolean zHasNext = it5.hasNext();
                            lk2Var = lk2.a;
                            if (!zHasNext) {
                                break;
                            }
                            MembershipPlan membershipPlan2 = (MembershipPlan) it5.next();
                            boolean zF = o51.f(f(ey1Var2).c, membershipPlan2.getId());
                            boolean zH4 = ov0Var2.h(is1Var) | ov0Var2.h(membershipPlan2);
                            Iterator it6 = it5;
                            Object objQ6 = ov0Var2.Q();
                            if (zH4 || objQ6 == c30Var) {
                                objQ6 = new m5(24, is1Var, membershipPlan2);
                                ov0Var2.m0(objQ6);
                            }
                            j(membershipPlan2, zF, (au0) objQ6, lk2.a(lk2Var, av1Var2, 1.0f), ov0Var2, 0);
                            it5 = it6;
                        }
                        ov0Var2.s();
                        if (list.size() == 1) {
                            ov0Var2.c0(-1299027534);
                            gh0.h(ov0Var2, lk2.a(lk2Var, av1Var2, 1.0f));
                        } else {
                            ov0Var2.c0(-1625327637);
                        }
                        ov0Var2.s();
                        ov0Var2.r();
                        orVar3 = orVar4;
                        size = i9;
                        arrayListF0 = arrayList4;
                    }
                    orVar = orVar3;
                    ov0Var2.s();
                    ov0Var2.r();
                    ov0Var2.s();
                } else {
                    ov0Var2.c0(661009077);
                    ov0Var2.s();
                    it3 = it3;
                    str = str2;
                    orVar = orVar3;
                }
                orVar3 = orVar;
                str3 = str3;
                str2 = str;
                it3 = it3;
            }
            String str5 = str2;
            String str6 = str3;
            or orVar5 = orVar3;
            ov0Var2.s();
            CloudEntitlements cloudEntitlements2 = f(ey1Var2).j;
            if (cloudEntitlements2 == null) {
                ov0Var2.c0(3708094);
                ov0Var2.s();
                i3 = 0;
            } else {
                ov0Var2.c0(3708095);
                ov0 ov0Var7 = ov0Var2;
                s83.b(ke0.O(2131623968, new Object[]{Integer.valueOf(cloudEntitlements2.getLoginLimit())}, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).k, ov0Var7, 0, 0, 131070);
                ov0Var2 = ov0Var7;
                ov0Var2.c0(-969705562);
                List<CloudDeviceSlot> slots3 = cloudEntitlements2.getSlots();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : slots3) {
                    if (o51.f(((CloudDeviceSlot) obj2).getOrigin(), "addon")) {
                        arrayList5.add(obj2);
                    }
                }
                int size2 = arrayList5.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ov0 ov0Var8 = ov0Var2;
                    sb.C(null, null, ym3.t(((kz) ov0Var2.j(mz.a)).p, 0L, ov0Var2, 0, 14), null, sb.a0(-1886102996, new au((CloudDeviceSlot) arrayList5.get(i10), 5), ov0Var2), ov0Var8, 196608, 27);
                    ov0Var2 = ov0Var8;
                }
                i3 = 0;
                ov0Var2.s();
                ov0Var2.s();
            }
            Iterator it7 = f(ey1Var2).b.iterator();
            do {
                if (!it7.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it7.next();
            } while (!((MembershipOrder) next2).getWaiting());
            final MembershipOrder membershipOrder2 = (MembershipOrder) next2;
            if (membershipOrder2 != null) {
                ov0Var2.c0(4994750);
                ov0 ov0Var9 = ov0Var2;
                s83.b(ke0.N(2131624755, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262138);
                boolean zH5 = ov0Var9.h(is1Var) | ov0Var9.h(membershipOrder2);
                Object objQ7 = ov0Var9.Q();
                if (zH5 || objQ7 == c30Var) {
                    final int i11 = 2;
                    objQ7 = new au0() { // from class: mr1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            CloudAccount account3;
                            List<MembershipOrder> list2;
                            int i12 = i11;
                            mf3 mf3Var = mf3.a;
                            MembershipOrder membershipOrder3 = membershipOrder2;
                            is1 is1Var2 = is1Var;
                            switch (i12) {
                                case 0:
                                    is1Var2.i(membershipOrder3.getId());
                                    break;
                                case 1:
                                    String id = membershipOrder3.getId();
                                    StateFlow stateFlow = is1Var2.e;
                                    id.getClass();
                                    MutableStateFlow mutableStateFlow = is1Var2.c;
                                    if (!((cs1) mutableStateFlow.getValue()).d && ((CloudAccountState) stateFlow.getValue()).getValidated() && (account3 = ((CloudAccountState) stateFlow.getValue()).getAccount()) != null && !account3.isGuest() && ((list2 = ((cs1) mutableStateFlow.getValue()).b) == null || !list2.isEmpty())) {
                                        for (MembershipOrder membershipOrder4 : list2) {
                                            if (o51.f(membershipOrder4.getId(), id) && membershipOrder4.getWaiting()) {
                                                is1Var2.j(new es1(is1Var2, id, null));
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    is1Var2.i(membershipOrder3.getId());
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var9.m0(objQ7);
                }
                n51.h((au0) objQ7, iw2.e(av1Var2, 1.0f), false, null, null, null, null, xq1.g, ov0Var9, 805306416, 508);
                ov0Var2 = ov0Var9;
            } else {
                ov0Var2.c0(-6688127);
            }
            ov0Var2.s();
            MembershipCatalog membershipCatalog3 = f(ey1Var2).a;
            membershipCatalog3.getClass();
            Iterator it8 = membershipCatalog3.getPlans().iterator();
            do {
                if (!it8.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it8.next();
            } while (!o51.f(((MembershipPlan) next3).getId(), f(ey1Var2).c));
            MembershipPlan membershipPlan3 = (MembershipPlan) next3;
            if (o51.f(membershipPlan3 != null ? membershipPlan3.getProductKind() : null, "quota")) {
                ov0Var2.c0(5460122);
                ov0 ov0Var10 = ov0Var2;
                s83.b(ke0.N(2131623980, ov0Var2), null, 0L, 0L, jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 1572864, 0, 262078);
                s83.b(ke0.N(2131623979, ov0Var10), null, ((kz) ov0Var10.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var10.j(le3.a)).l, ov0Var10, 0, 0, 131066);
                ov0Var2 = ov0Var10;
            } else {
                ov0Var2.c0(-6688127);
            }
            ov0Var2.s();
            if (o51.f(membershipPlan3 != null ? membershipPlan3.getProductKind() : null, str6)) {
                ov0Var2.c0(5833331);
                boolean z5 = f(ey1Var2).k == null;
                final int i12 = 1;
                boolean z6 = !f(ey1Var2).d;
                boolean zH6 = ov0Var2.h(is1Var);
                Object objQ8 = ov0Var2.Q();
                if (zH6 || objQ8 == c30Var) {
                    objQ8 = new au0() { // from class: nr1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i13 = i12;
                            mf3 mf3Var = mf3.a;
                            is1 is1Var2 = is1Var;
                            switch (i13) {
                                case 0:
                                    is1Var2.e();
                                    break;
                                case 1:
                                    is1Var2.m(null);
                                    break;
                                default:
                                    is1Var2.l(null);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ8);
                }
                ov0 ov0Var11 = ov0Var2;
                ix.b(z5, (au0) objQ8, xq1.h, null, z6, null, null, null, null, ov0Var11, 384, 4072);
                ov0 ov0Var12 = ov0Var11;
                CloudEntitlements cloudEntitlements3 = f(ey1Var2).j;
                if (cloudEntitlements3 == null || (slots2 = cloudEntitlements3.getSlots()) == null) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : slots2) {
                        if (o51.f(((CloudDeviceSlot) obj3).getOrigin(), "addon")) {
                            arrayList6.add(obj3);
                        }
                    }
                    arrayList2 = arrayList6;
                }
                if (arrayList2 == null) {
                    ov0Var12.c0(6080617);
                    ov0Var12.s();
                    av1Var = av1Var2;
                } else {
                    ov0Var12.c0(6080618);
                    int size3 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        int i14 = i13 + 1;
                        CloudDeviceSlot cloudDeviceSlot = (CloudDeviceSlot) arrayList2.get(i13);
                        boolean zF2 = o51.f(f(ey1Var2).k, cloudDeviceSlot.getId());
                        boolean z7 = !f(ey1Var2).d;
                        boolean zH7 = ov0Var12.h(is1Var) | ov0Var12.h(cloudDeviceSlot);
                        Object objQ9 = ov0Var12.Q();
                        if (zH7 || objQ9 == c30Var) {
                            objQ9 = new m5(25, is1Var, cloudDeviceSlot);
                            ov0Var12.m0(objQ9);
                        }
                        ov0 ov0Var13 = ov0Var12;
                        ix.b(zF2, (au0) objQ9, sb.a0(1611896077, new s5(cloudDeviceSlot, 18), ov0Var12), null, z7, null, null, null, null, ov0Var13, 384, 4072);
                        av1Var2 = av1Var2;
                        ov0Var12 = ov0Var13;
                        i13 = i14;
                    }
                    av1Var = av1Var2;
                    ov0Var12.s();
                }
                String strN2 = ke0.N(2131623993, ov0Var12);
                hh0 hh0Var3 = le3.a;
                q93 q93Var = ((je3) ov0Var12.j(hh0Var3)).l;
                hh0 hh0Var4 = mz.a;
                ov0 ov0Var14 = ov0Var12;
                s83.b(strN2, null, ((kz) ov0Var12.j(hh0Var4)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var14, 0, 0, 131066);
                CloudEntitlements cloudEntitlements4 = f(ey1Var2).j;
                s83.b(ke0.O(2131624418, new Object[]{Integer.valueOf(cloudEntitlements4 != null ? cloudEntitlements4.getSoftwareMaximum() : 5)}, ov0Var14), null, ((kz) ov0Var14.j(hh0Var4)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var14.j(hh0Var3)).l, ov0Var14, 0, 0, 131066);
                ov0Var2 = ov0Var14;
            } else {
                av1Var = av1Var2;
                ov0Var2.c0(-6688127);
            }
            ov0Var2.s();
            if (o51.f(membershipPlan3 != null ? membershipPlan3.getProductKind() : null, str5)) {
                List list2 = f(ey1Var2).h;
                arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    if (((RewardCoupon) obj4).getMinimumCents() <= membershipPlan3.getPriceCents()) {
                        arrayList.add(obj4);
                    }
                }
            } else {
                arrayList = uj0.e;
            }
            Iterator it9 = arrayList.iterator();
            do {
                if (!it9.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it9.next();
            } while (!o51.f(((RewardCoupon) next4).getId(), f(ey1Var2).i));
            RewardCoupon rewardCoupon = (RewardCoupon) next4;
            int i15 = 17;
            if (arrayList.isEmpty()) {
                ov0Var2.c0(-6688127);
            } else {
                ov0Var2.c0(7058792);
                boolean z8 = rewardCoupon == null;
                boolean z9 = !f(ey1Var2).d;
                boolean zH8 = ov0Var2.h(is1Var);
                Object objQ10 = ov0Var2.Q();
                if (zH8 || objQ10 == c30Var) {
                    final int i16 = 2;
                    objQ10 = new au0() { // from class: nr1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i17 = i16;
                            mf3 mf3Var = mf3.a;
                            is1 is1Var2 = is1Var;
                            switch (i17) {
                                case 0:
                                    is1Var2.e();
                                    break;
                                case 1:
                                    is1Var2.m(null);
                                    break;
                                default:
                                    is1Var2.l(null);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ10);
                }
                ov0 ov0Var15 = ov0Var2;
                ix.b(z8, (au0) objQ10, xq1.i, null, z9, null, null, null, null, ov0Var15, 384, 4072);
                ov0Var2 = ov0Var15;
                for (RewardCoupon rewardCoupon2 : arrayList) {
                    boolean zF3 = o51.f(f(ey1Var2).i, rewardCoupon2.getId());
                    boolean z10 = !f(ey1Var2).d;
                    boolean zH9 = ov0Var2.h(is1Var) | ov0Var2.h(rewardCoupon2);
                    Object objQ11 = ov0Var2.Q();
                    if (zH9 || objQ11 == c30Var) {
                        objQ11 = new m5(22, is1Var, rewardCoupon2);
                        ov0Var2.m0(objQ11);
                    }
                    ov0 ov0Var16 = ov0Var2;
                    ix.b(zF3, (au0) objQ11, sb.a0(2011207697, new s5(rewardCoupon2, i15), ov0Var2), null, z10, null, null, null, null, ov0Var16, 384, 4072);
                    ov0Var2 = ov0Var16;
                }
            }
            ov0Var2.s();
            String strN3 = ke0.N(2131624740, ov0Var2);
            hh0 hh0Var5 = le3.a;
            ov0 ov0Var17 = ov0Var2;
            s83.b(strN3, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var5)).h, ov0Var17, 0, 0, 131070);
            dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA2 = jk2.a(new jo(12.0f, true, new fo(0)), orVar5, ov0Var17, 6);
            int iHashCode5 = Long.hashCode(ks.U(ov0Var17));
            l72 l72VarZ5 = ov0Var17.z();
            dv1 dv1VarH5 = xp1.H(ov0Var17, dv1VarE4);
            w20.b.getClass();
            x30 x30Var4 = v20.b;
            ov0Var17.g0();
            if (ov0Var17.D()) {
                ov0Var17.k(x30Var4);
            } else {
                ov0Var17.p0();
            }
            q73.h(ov0Var17, v20.e, kk2VarA2);
            q73.h(ov0Var17, v20.d, l72VarZ5);
            q73.h(ov0Var17, v20.f, Integer.valueOf(iHashCode5));
            q73.g(ov0Var17, v20.g);
            q73.h(ov0Var17, v20.c, dv1VarH5);
            boolean zF4 = o51.f((String) ey1Var.getValue(), "alipay_app");
            boolean z11 = z && !f(ey1Var2).d;
            boolean zF5 = ov0Var17.f(ey1Var);
            Object objQ12 = ov0Var17.Q();
            int i17 = 3;
            if (zF5 || objQ12 == c30Var) {
                objQ12 = new sy(z, ey1Var, i17);
                ov0Var17.m0(objQ12);
            }
            ix.b(zF4, (au0) objQ12, xq1.j, null, z11, null, null, null, null, ov0Var17, 384, 4072);
            boolean zF6 = o51.f((String) ey1Var.getValue(), "qr");
            boolean z12 = !f(ey1Var2).d;
            boolean zF7 = ov0Var17.f(ey1Var);
            Object objQ13 = ov0Var17.Q();
            if (zF7 || objQ13 == c30Var) {
                objQ13 = new mo0(ey1Var, i15);
                ov0Var17.m0(objQ13);
            }
            ix.b(zF6, (au0) objQ13, xq1.k, null, z12, null, null, null, null, ov0Var17, 384, 4072);
            ov0 ov0Var18 = ov0Var17;
            ov0Var18.r();
            if (z) {
                ov0Var18.c0(-6688127);
            } else {
                ov0Var18.c0(8131764);
                s83.b(ke0.N(2131624731, ov0Var18), null, ((kz) ov0Var18.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var18.j(hh0Var5)).l, ov0Var18, 0, 0, 131066);
                ov0Var18 = ov0Var18;
            }
            ov0Var18.s();
            if (f(ey1Var2).d || membershipOrder2 != null || membershipPlan3 == null || !membershipPlan3.getAvailable()) {
                z3 = false;
            } else if (o51.f(membershipPlan3.getProductKind(), "quota")) {
                CloudEntitlements cloudEntitlements5 = f(ey1Var2).j;
                if (cloudEntitlements5 != null && (slots = cloudEntitlements5.getSlots()) != null && !slots.isEmpty()) {
                    Iterator it10 = slots.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            CloudDeviceSlot cloudDeviceSlot2 = (CloudDeviceSlot) it10.next();
                            String id = cloudDeviceSlot2.getId();
                            String slotId = f(ey1Var2).k;
                            if (slotId == null) {
                                CloudAccount account3 = ((CloudAccountState) s03Var.getValue()).getAccount();
                                slotId = account3 != null ? account3.getSlotId() : null;
                            }
                            if (o51.f(id, slotId) && cloudDeviceSlot2.getEligible()) {
                                membershipCatalog = f(ey1Var2).a;
                                membershipCatalog.getClass();
                                if (membershipCatalog.getPurchasingEnabled()) {
                                }
                            }
                        }
                    }
                }
                z3 = false;
            } else {
                membershipCatalog = f(ey1Var2).a;
                membershipCatalog.getClass();
                if (membershipCatalog.getPurchasingEnabled() || !((CloudAccountState) s03Var.getValue()).getValidated() || (account = ((CloudAccountState) s03Var.getValue()).getAccount()) == null || account.isGuest()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            dv1 dv1VarH6 = iw2.h(iw2.e(av1Var, 1.0f), 52.0f, 0.0f, 2);
            bj2 bj2VarA = cj2.a(16.0f);
            boolean zH10 = ov0Var18.h(is1Var) | ov0Var18.f(ey1Var);
            Object objQ14 = ov0Var18.Q();
            if (zH10 || objQ14 == c30Var) {
                objQ14 = new m5(23, is1Var, ey1Var);
                ov0Var18.m0(objQ14);
            }
            ey1Var4 = ey1Var2;
            ov0 ov0Var19 = ov0Var18;
            n51.a((au0) objQ14, dv1VarH6, z3, bj2VarA, null, null, null, null, sb.a0(1471211894, new zt(membershipPlan3, rewardCoupon, ey1Var4, i17), ov0Var18), ov0Var19, 805306416, 496);
            ov0 ov0Var20 = ov0Var19;
            MembershipCatalog membershipCatalog4 = f(ey1Var4).a;
            membershipCatalog4.getClass();
            if (membershipCatalog4.getPurchasingEnabled()) {
                ov0Var20.c0(-6688127);
            } else {
                ov0Var20.c0(-969537060);
                s83.b(ke0.N(2131624762, ov0Var20), null, ((kz) ov0Var20.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var20, 0, 0, 262138);
                ov0Var20 = ov0Var20;
            }
            ov0Var20.s();
            ov0 ov0Var21 = ov0Var20;
            s83.b(ke0.N(o51.f(membershipPlan3 != null ? membershipPlan3.getProductKind() : null, str5) ? 2131624733 : 2131624421, ov0Var20), null, ((kz) ov0Var20.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var20.j(le3.a)).l, ov0Var21, 0, 0, 131066);
            ov0Var2 = ov0Var21;
            ov0Var2.s();
        }
        String str7 = f(ey1Var4).e;
        if (str7 == null) {
            ov0Var2.c0(9505962);
        } else {
            ov0Var2.c0(9505963);
            ov0 ov0Var22 = ov0Var2;
            sb.C(null, null, ym3.t(((kz) ov0Var2.j(mz.a)).y, 0L, ov0Var2, i3, 14), null, sb.a0(1486512058, new zt(str7, is1Var, ey1Var4, 4), ov0Var2), ov0Var22, 196608, 27);
            ov0Var2 = ov0Var22;
        }
        ov0Var2.s();
        ov0 ov0Var23 = ov0Var2;
        s83.b(ke0.N(2131624724, ov0Var2), null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).h, ov0Var23, 1572864, 0, 131006);
        ov0 ov0Var24 = ov0Var23;
        if (f(ey1Var4).b.isEmpty()) {
            ov0Var24.c0(-969503291);
            s83.b(ke0.N(2131624732, ov0Var24), null, ((kz) ov0Var24.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var24, 0, 0, 262138);
            ov0Var24 = ov0Var24;
        } else {
            ov0Var24.c0(-6688127);
        }
        ov0Var24.s();
        ov0Var24.c0(-969498442);
        for (final MembershipOrder membershipOrder3 : f(ey1Var4).b) {
            boolean zH11 = ov0Var24.h(is1Var) | ov0Var24.h(membershipOrder3);
            Object objQ15 = ov0Var24.Q();
            if (zH11 || objQ15 == c30Var) {
                final int i18 = 0;
                objQ15 = new au0() { // from class: mr1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        CloudAccount account4;
                        List<MembershipOrder> list3;
                        int i19 = i18;
                        mf3 mf3Var = mf3.a;
                        MembershipOrder membershipOrder4 = membershipOrder3;
                        is1 is1Var2 = is1Var;
                        switch (i19) {
                            case 0:
                                is1Var2.i(membershipOrder4.getId());
                                break;
                            case 1:
                                String id2 = membershipOrder4.getId();
                                StateFlow stateFlow = is1Var2.e;
                                id2.getClass();
                                MutableStateFlow mutableStateFlow = is1Var2.c;
                                if (!((cs1) mutableStateFlow.getValue()).d && ((CloudAccountState) stateFlow.getValue()).getValidated() && (account4 = ((CloudAccountState) stateFlow.getValue()).getAccount()) != null && !account4.isGuest() && ((list3 = ((cs1) mutableStateFlow.getValue()).b) == null || !list3.isEmpty())) {
                                    for (MembershipOrder membershipOrder5 : list3) {
                                        if (o51.f(membershipOrder5.getId(), id2) && membershipOrder5.getWaiting()) {
                                            is1Var2.j(new es1(is1Var2, id2, null));
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                is1Var2.i(membershipOrder4.getId());
                                break;
                        }
                        return mf3Var;
                    }
                };
                ov0Var24.m0(objQ15);
            }
            sb.B((au0) objQ15, iw2.e(av1Var, 1.0f), false, null, null, null, null, sb.a0(83540651, new au(membershipOrder3, 4), ov0Var24), ov0Var24, 100663344, 252);
        }
        ov0Var24.s();
        ov0Var24.r();
        ov0Var24.r();
    }

    public static final Object e0(Object[] objArr, wm2 wm2Var, au0 au0Var, f30 f30Var, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object objD;
        if ((i2 & 2) != 0) {
            wm2Var = ji2.u;
        }
        wm2 wm2Var2 = wm2Var;
        ov0 ov0Var = (ov0) f30Var;
        long j = ov0Var.T;
        xp1.m(36);
        String string = Long.toString(j, 36);
        string.getClass();
        wm2Var2.getClass();
        tl2 tl2Var = (tl2) ov0Var.j(vl2.a);
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            Object objC = (tl2Var == null || (objD = tl2Var.d(string)) == null) ? null : wm2Var2.c(objD);
            if (objC == null) {
                objC = au0Var.invoke();
            }
            objArr2 = objArr;
            pl2 pl2Var = new pl2(wm2Var2, tl2Var, string, objC, objArr2);
            ov0Var.m0(pl2Var);
            objQ = pl2Var;
        } else {
            objArr2 = objArr;
        }
        pl2 pl2Var2 = (pl2) objQ;
        Object objInvoke = Arrays.equals(objArr2, pl2Var2.i) ? pl2Var2.h : null;
        if (objInvoke == null) {
            objInvoke = au0Var.invoke();
        }
        boolean zH = ov0Var.h(pl2Var2) | ((((i & 112) ^ 48) > 32 && ov0Var.h(wm2Var2)) || (i & 48) == 32) | ov0Var.h(tl2Var) | ov0Var.f(string) | ov0Var.h(objInvoke) | ov0Var.h(objArr2);
        Object objQ2 = ov0Var.Q();
        if (zH || objQ2 == c30Var) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            d3 d3Var = new d3(pl2Var2, wm2Var2, tl2Var, string, obj, objArr3);
            ov0Var.m0(d3Var);
            objQ2 = d3Var;
        } else {
            obj = objInvoke;
        }
        oi0.i((au0) objQ2, ov0Var);
        return obj;
    }

    public static final cs1 f(ey1 ey1Var) {
        return (cs1) ey1Var.getValue();
    }

    public static float[] f0(List list, int i, lu0 lu0Var) {
        long j = ((y0) zy.n0(list)).a;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = ((long) ((((double) i3) / 50.0d) * 1.0E9d)) + j;
            while (i2 < list.size() - 2) {
                int i4 = i2 + 1;
                if (((y0) list.get(i4)).a >= j2) {
                    break;
                }
                i2 = i4;
            }
            y0 y0Var = (y0) list.get(i2);
            y0 y0Var2 = (y0) list.get(i2 + 1);
            long j3 = y0Var2.a;
            long j4 = y0Var.a;
            long j5 = j3 - j4;
            if (j5 < 1) {
                j5 = 1;
            }
            float fT = (float) mh0.t((j2 - j4) / j5, 0.0d, 1.0d);
            fArr[i3] = (((Number) lu0Var.invoke(y0Var2)).floatValue() * fT) + ((1.0f - fT) * ((Number) lu0Var.invoke(y0Var)).floatValue());
        }
        return fArr;
    }

    public static final void g(p10 p10Var, f30 f30Var, int i) {
        p10 p10Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1463146515);
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            p10Var2 = p10Var;
            wq1.b(n51.w(ov0Var) ? bk.k : bk.j, null, null, p10Var2, ov0Var, 3072, 6);
        } else {
            p10Var2 = p10Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new c9(p10Var2, i, 3);
        }
    }

    public static void g0(nx2 nx2Var, nx2 nx2Var2, lu0 lu0Var) {
        if (nx2Var != nx2Var2) {
            nx2Var2.getClass();
            nx2.q(nx2Var);
            nx2Var2.c();
        } else if (nx2Var instanceof qc3) {
            ((qc3) nx2Var).r = lu0Var;
        } else if (nx2Var instanceof rc3) {
            ((rc3) nx2Var).h = lu0Var;
        } else {
            fo.o(nx2Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void h(final MembershipOrder membershipOrder, final boolean z, final au0 au0Var, final au0 au0Var2, au0 au0Var3, f30 f30Var, int i) {
        boolean z2;
        ov0 ov0Var;
        boolean z3;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1371170459);
        int i2 = i | (ov0Var2.h(membershipOrder) ? 4 : 2) | (ov0Var2.g(z) ? 32 : 16) | (ov0Var2.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.h(au0Var3) ? 16384 : 8192);
        if (ov0Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            final Context context = (Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b);
            final String payUrl = membershipOrder.getPayUrl();
            final String qrUrl = membershipOrder.getQrUrl();
            boolean zF = ov0Var2.f(membershipOrder.getId());
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = new u52(System.currentTimeMillis());
                ov0Var2.m0(objQ);
            }
            final u52 u52Var = (u52) objQ;
            Object[] objArr = {membershipOrder.getId()};
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                objQ2 = new oi1(8);
                ov0Var2.m0(objQ2);
            }
            final ey1 ey1Var = (ey1) c0(objArr, (au0) objQ2, ov0Var2, 48);
            String id = membershipOrder.getId();
            boolean zF2 = ov0Var2.f(u52Var);
            Object objQ3 = ov0Var2.Q();
            if (zF2 || objQ3 == c30Var) {
                objQ3 = new d6(u52Var, (q60) null, 11);
                ov0Var2.m0(objQ3);
            }
            oi0.e(ov0Var2, (pu0) objQ3, id);
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            bj2 bj2VarA = cj2.a(20.0f);
            z2 = z;
            p10 p10VarA0 = sb.a0(1084548567, new qu0() { // from class: qr1
                /* JADX WARN: Code duplicated, block: B:54:0x0327  */
                /* JADX WARN: Code duplicated, block: B:59:0x0355  */
                /* JADX WARN: Code duplicated, block: B:61:0x0364  */
                /* JADX WARN: Code duplicated, block: B:63:0x03a1  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v17 */
                /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r5v23 */
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j;
                    boolean z4;
                    c30 c30Var2;
                    boolean z5;
                    ?? r5;
                    ov0 ov0Var3;
                    boolean z6;
                    final String str;
                    c30 c30Var3;
                    boolean zH;
                    Object objQ4;
                    String str2;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((zz) obj).getClass();
                    final int i3 = 0;
                    ov0 ov0Var4 = (ov0) f30Var2;
                    if (ov0Var4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        av1 av1Var = av1.a;
                        dv1 dv1VarD = zm3.D(av1Var, 20.0f);
                        yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.s, ov0Var4, 54);
                        int iHashCode = Long.hashCode(ov0Var4.T);
                        l72 l72VarL = ov0Var4.l();
                        dv1 dv1VarH = xp1.H(ov0Var4, dv1VarD);
                        w20.b.getClass();
                        x30 x30Var = v20.b;
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var);
                        } else {
                            ov0Var4.p0();
                        }
                        gh ghVar = v20.e;
                        q73.h(ov0Var4, ghVar, yzVarA);
                        gh ghVar2 = v20.d;
                        q73.h(ov0Var4, ghVar2, l72VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        gh ghVar3 = v20.f;
                        q73.h(ov0Var4, ghVar3, numValueOf);
                        wa waVar = v20.g;
                        q73.g(ov0Var4, waVar);
                        gh ghVar4 = v20.c;
                        q73.h(ov0Var4, ghVar4, dv1VarH);
                        MembershipOrder membershipOrder2 = membershipOrder;
                        String strN = ke0.N(wc0.X(membershipOrder2.getStatus()), ov0Var4);
                        jr0 jr0Var = jr0.j;
                        q93 q93Var = dh0.t(ov0Var4).h;
                        if (o51.f(membershipOrder2.getStatus(), "PAID")) {
                            ov0Var4.c0(543208887);
                            ov0Var4.p(false);
                            j = bk.g;
                        } else {
                            ov0Var4.c0(543210230);
                            long j2 = dh0.p(ov0Var4).q;
                            ov0Var4.p(false);
                            j = j2;
                        }
                        s83.b(strN, null, j, 0L, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var4, 1572864, 0, 131002);
                        s83.b(membershipOrder2.getTitle() + " · " + wc0.T(membershipOrder2.getAmountCents()), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var4).g, ov0Var4, 0, 0, 131070);
                        ov0 ov0Var5 = ov0Var4;
                        if (o51.f(membershipOrder2.getStatus(), "PAID")) {
                            ov0Var5.c0(543215812);
                            Long grantedUntil = membershipOrder2.getGrantedUntil();
                            if (grantedUntil == null) {
                                ov0Var5.c0(-340179011);
                                ov0Var5.p(false);
                            } else {
                                ov0Var5.c0(-340179010);
                                long jLongValue = grantedUntil.longValue();
                                int i4 = o51.f(membershipOrder2.getProductKind(), "membership") ? 2131624764 : 2131624435;
                                String strA = wc0.A(jLongValue);
                                strA.getClass();
                                s83.b(ke0.O(i4, new Object[]{strA}, ov0Var5), null, bk.g, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 384, 0, 262138);
                                ov0Var5 = ov0Var5;
                                ov0Var5.p(false);
                            }
                        } else {
                            ov0Var5.c0(-361446219);
                        }
                        ov0Var5.p(false);
                        boolean zF3 = o51.f(membershipOrder2.getStatus(), "PENDING");
                        boolean z7 = z;
                        c30 c30Var4 = d30.a;
                        if (zF3) {
                            u52 u52Var2 = u52Var;
                            if (u52Var2.g() < membershipOrder2.getExpiresAt()) {
                                ov0Var5.c0(-339938171);
                                if (!o51.f(membershipOrder2.getCheckoutMode(), "qr") || (str2 = qrUrl) == null) {
                                    z4 = z7;
                                    if (!o51.f(membershipOrder2.getCheckoutMode(), "alipay_app") || (str = payUrl) == null) {
                                        z6 = false;
                                        c30Var2 = c30Var4;
                                        ov0Var5.c0(-361446219);
                                    } else {
                                        ov0Var5.c0(-339409094);
                                        boolean z8 = !z4;
                                        dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                                        final Context context2 = context;
                                        boolean zH2 = ov0Var5.h(context2) | ov0Var5.f(str);
                                        Object objQ5 = ov0Var5.Q();
                                        if (zH2) {
                                            c30Var3 = c30Var4;
                                        } else {
                                            if (objQ5 == c30Var3) {
                                            }
                                            c30Var3 = c30Var4;
                                            ov0 ov0Var6 = ov0Var5;
                                            c30Var2 = c30Var3;
                                            n51.a((au0) objQ5, dv1VarE2, z8, null, null, null, null, null, xq1.m, ov0Var6, 805306416, 504);
                                            ov0Var5 = ov0Var6;
                                            zH = ov0Var5.h(context2) | ov0Var5.f(str);
                                            objQ4 = ov0Var5.Q();
                                            if (zH || objQ4 == c30Var2) {
                                                final int i5 = 1;
                                                objQ4 = new au0() { // from class: sr1
                                                    @Override // defpackage.au0
                                                    public final Object invoke() {
                                                        Object wg2Var;
                                                        Object wg2Var2;
                                                        int i6 = i5;
                                                        mf3 mf3Var = mf3.a;
                                                        String str3 = str;
                                                        Context context3 = context2;
                                                        switch (i6) {
                                                            case 0:
                                                                context3.getClass();
                                                                str3.getClass();
                                                                try {
                                                                    MembershipPaymentUrls.INSTANCE.validate(str3);
                                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + Uri.encode(str3))).setPackage("com.eg.android.AlipayGphone");
                                                                    intent.getClass();
                                                                    context3.startActivity(intent.addFlags(268435456));
                                                                    wg2Var = mf3Var;
                                                                } catch (Throwable th) {
                                                                    wg2Var = new wg2(th);
                                                                }
                                                                Throwable thA = xg2.a(wg2Var);
                                                                if (thA != null) {
                                                                    Log.w("MembershipPayment", "launch_failed type=".concat(thA.getClass().getSimpleName()));
                                                                }
                                                                if (wg2Var instanceof wg2) {
                                                                    Toast.makeText(context3, 2131624734, 0).show();
                                                                }
                                                                break;
                                                            default:
                                                                context3.getClass();
                                                                str3.getClass();
                                                                try {
                                                                    MembershipPaymentUrls.INSTANCE.validate(str3);
                                                                    context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(268435456));
                                                                    wg2Var2 = mf3Var;
                                                                } catch (Throwable th2) {
                                                                    wg2Var2 = new wg2(th2);
                                                                }
                                                                Throwable thA2 = xg2.a(wg2Var2);
                                                                if (thA2 != null) {
                                                                    Log.w("MembershipPayment", "launch_failed type=".concat(thA2.getClass().getSimpleName()));
                                                                }
                                                                if (wg2Var2 instanceof wg2) {
                                                                    Toast.makeText(context3, 2131624734, 0).show();
                                                                }
                                                                break;
                                                        }
                                                        return mf3Var;
                                                    }
                                                };
                                                ov0Var5.m0(objQ4);
                                            }
                                            n51.j((au0) objQ4, null, z8, null, null, null, xq1.n, ov0Var5, 805306368, 506);
                                            z6 = false;
                                        }
                                        c30Var3 = c30Var4;
                                        objQ5 = new au0() { // from class: sr1
                                            @Override // defpackage.au0
                                            public final Object invoke() {
                                                Object wg2Var;
                                                Object wg2Var2;
                                                int i6 = i3;
                                                mf3 mf3Var = mf3.a;
                                                String str3 = str;
                                                Context context3 = context2;
                                                switch (i6) {
                                                    case 0:
                                                        context3.getClass();
                                                        str3.getClass();
                                                        try {
                                                            MembershipPaymentUrls.INSTANCE.validate(str3);
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + Uri.encode(str3))).setPackage("com.eg.android.AlipayGphone");
                                                            intent.getClass();
                                                            context3.startActivity(intent.addFlags(268435456));
                                                            wg2Var = mf3Var;
                                                        } catch (Throwable th) {
                                                            wg2Var = new wg2(th);
                                                        }
                                                        Throwable thA = xg2.a(wg2Var);
                                                        if (thA != null) {
                                                            Log.w("MembershipPayment", "launch_failed type=".concat(thA.getClass().getSimpleName()));
                                                        }
                                                        if (wg2Var instanceof wg2) {
                                                            Toast.makeText(context3, 2131624734, 0).show();
                                                        }
                                                        break;
                                                    default:
                                                        context3.getClass();
                                                        str3.getClass();
                                                        try {
                                                            MembershipPaymentUrls.INSTANCE.validate(str3);
                                                            context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(268435456));
                                                            wg2Var2 = mf3Var;
                                                        } catch (Throwable th2) {
                                                            wg2Var2 = new wg2(th2);
                                                        }
                                                        Throwable thA2 = xg2.a(wg2Var2);
                                                        if (thA2 != null) {
                                                            Log.w("MembershipPayment", "launch_failed type=".concat(thA2.getClass().getSimpleName()));
                                                        }
                                                        if (wg2Var2 instanceof wg2) {
                                                            Toast.makeText(context3, 2131624734, 0).show();
                                                        }
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        };
                                        ov0Var5.m0(objQ5);
                                        c30Var3 = c30Var4;
                                        ov0 ov0Var7 = ov0Var5;
                                        c30Var2 = c30Var3;
                                        n51.a((au0) objQ5, dv1VarE2, z8, null, null, null, null, null, xq1.m, ov0Var7, 805306416, 504);
                                        ov0Var5 = ov0Var7;
                                        zH = ov0Var5.h(context2) | ov0Var5.f(str);
                                        objQ4 = ov0Var5.Q();
                                        if (zH) {
                                            final int i6 = 1;
                                            objQ4 = new au0() { // from class: sr1
                                                @Override // defpackage.au0
                                                public final Object invoke() {
                                                    Object wg2Var;
                                                    Object wg2Var2;
                                                    int i7 = i6;
                                                    mf3 mf3Var = mf3.a;
                                                    String str3 = str;
                                                    Context context3 = context2;
                                                    switch (i7) {
                                                        case 0:
                                                            context3.getClass();
                                                            str3.getClass();
                                                            try {
                                                                MembershipPaymentUrls.INSTANCE.validate(str3);
                                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + Uri.encode(str3))).setPackage("com.eg.android.AlipayGphone");
                                                                intent.getClass();
                                                                context3.startActivity(intent.addFlags(268435456));
                                                                wg2Var = mf3Var;
                                                            } catch (Throwable th) {
                                                                wg2Var = new wg2(th);
                                                            }
                                                            Throwable thA = xg2.a(wg2Var);
                                                            if (thA != null) {
                                                                Log.w("MembershipPayment", "launch_failed type=".concat(thA.getClass().getSimpleName()));
                                                            }
                                                            if (wg2Var instanceof wg2) {
                                                                Toast.makeText(context3, 2131624734, 0).show();
                                                            }
                                                            break;
                                                        default:
                                                            context3.getClass();
                                                            str3.getClass();
                                                            try {
                                                                MembershipPaymentUrls.INSTANCE.validate(str3);
                                                                context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(268435456));
                                                                wg2Var2 = mf3Var;
                                                            } catch (Throwable th2) {
                                                                wg2Var2 = new wg2(th2);
                                                            }
                                                            Throwable thA2 = xg2.a(wg2Var2);
                                                            if (thA2 != null) {
                                                                Log.w("MembershipPayment", "launch_failed type=".concat(thA2.getClass().getSimpleName()));
                                                            }
                                                            if (wg2Var2 instanceof wg2) {
                                                                Toast.makeText(context3, 2131624734, 0).show();
                                                            }
                                                            break;
                                                    }
                                                    return mf3Var;
                                                }
                                            };
                                            ov0Var5.m0(objQ4);
                                        } else {
                                            final int i7 = 1;
                                            objQ4 = new au0() { // from class: sr1
                                                @Override // defpackage.au0
                                                public final Object invoke() {
                                                    Object wg2Var;
                                                    Object wg2Var2;
                                                    int i8 = i7;
                                                    mf3 mf3Var = mf3.a;
                                                    String str3 = str;
                                                    Context context3 = context2;
                                                    switch (i8) {
                                                        case 0:
                                                            context3.getClass();
                                                            str3.getClass();
                                                            try {
                                                                MembershipPaymentUrls.INSTANCE.validate(str3);
                                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + Uri.encode(str3))).setPackage("com.eg.android.AlipayGphone");
                                                                intent.getClass();
                                                                context3.startActivity(intent.addFlags(268435456));
                                                                wg2Var = mf3Var;
                                                            } catch (Throwable th) {
                                                                wg2Var = new wg2(th);
                                                            }
                                                            Throwable thA = xg2.a(wg2Var);
                                                            if (thA != null) {
                                                                Log.w("MembershipPayment", "launch_failed type=".concat(thA.getClass().getSimpleName()));
                                                            }
                                                            if (wg2Var instanceof wg2) {
                                                                Toast.makeText(context3, 2131624734, 0).show();
                                                            }
                                                            break;
                                                        default:
                                                            context3.getClass();
                                                            str3.getClass();
                                                            try {
                                                                MembershipPaymentUrls.INSTANCE.validate(str3);
                                                                context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)).addFlags(268435456));
                                                                wg2Var2 = mf3Var;
                                                            } catch (Throwable th2) {
                                                                wg2Var2 = new wg2(th2);
                                                            }
                                                            Throwable thA2 = xg2.a(wg2Var2);
                                                            if (thA2 != null) {
                                                                Log.w("MembershipPayment", "launch_failed type=".concat(thA2.getClass().getSimpleName()));
                                                            }
                                                            if (wg2Var2 instanceof wg2) {
                                                                Toast.makeText(context3, 2131624734, 0).show();
                                                            }
                                                            break;
                                                    }
                                                    return mf3Var;
                                                }
                                            };
                                            ov0Var5.m0(objQ4);
                                        }
                                        n51.j((au0) objQ4, null, z8, null, null, null, xq1.n, ov0Var5, 805306368, 506);
                                        z6 = false;
                                    }
                                    ov0Var5.p(z6);
                                } else {
                                    ov0Var5.c0(-339901312);
                                    wc0.i(str2, ov0Var5, 0);
                                    long expiresAt = (membershipOrder2.getExpiresAt() - u52Var2.g()) / 1000;
                                    if (expiresAt < 0) {
                                        expiresAt = 0;
                                    }
                                    ov0 ov0Var8 = ov0Var5;
                                    z4 = z7;
                                    s83.b(ke0.O(2131624746, new Object[]{Long.valueOf(expiresAt / 60), Long.valueOf(expiresAt % 60)}, ov0Var5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var5).l, ov0Var8, 0, 0, 131070);
                                    s83.b(ke0.N(2131624748, ov0Var8), null, dh0.p(ov0Var8).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var8).l, ov0Var8, 0, 0, 131066);
                                    ov0Var5 = ov0Var8;
                                    ov0Var5.p(false);
                                    membershipOrder2 = membershipOrder2;
                                    z6 = false;
                                    c30Var2 = c30Var4;
                                }
                                ov0Var5.p(z6);
                            } else {
                                membershipOrder2 = membershipOrder2;
                                z4 = z7;
                                c30Var2 = c30Var4;
                                if (o51.f(membershipOrder2.getStatus(), "PENDING")) {
                                    ov0Var5.c0(543259919);
                                    ov0 ov0Var9 = ov0Var5;
                                    s83.b(ke0.N(2131624717, ov0Var5), null, dh0.p(ov0Var5).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262138);
                                    ov0Var5 = ov0Var9;
                                    z5 = false;
                                } else {
                                    z5 = false;
                                    ov0Var5.c0(-361446219);
                                }
                                ov0Var5.p(z5);
                            }
                        } else {
                            membershipOrder2 = membershipOrder2;
                            z4 = z7;
                            c30Var2 = c30Var4;
                            if (o51.f(membershipOrder2.getStatus(), "PENDING")) {
                                ov0Var5.c0(543259919);
                                ov0 ov0Var10 = ov0Var5;
                                s83.b(ke0.N(2131624717, ov0Var5), null, dh0.p(ov0Var5).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 0, 0, 262138);
                                ov0Var5 = ov0Var10;
                                z5 = false;
                            } else {
                                z5 = false;
                                ov0Var5.c0(-361446219);
                            }
                            ov0Var5.p(z5);
                        }
                        ov0 ov0Var11 = ov0Var5;
                        s83.b(ke0.O(2131624736, new Object[]{membershipOrder2.getId()}, ov0Var5), null, dh0.p(ov0Var5).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, dh0.t(ov0Var5).o, ov0Var11, 0, 0, 131066);
                        ov0 ov0Var12 = ov0Var11;
                        if (membershipOrder2.getWaiting()) {
                            ov0Var12.c0(-338520386);
                            boolean z9 = !z4;
                            dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                            ey1 ey1Var2 = ey1Var;
                            boolean zF4 = ov0Var12.f(ey1Var2);
                            Object objQ6 = ov0Var12.Q();
                            if (zF4 || objQ6 == c30Var2) {
                                objQ6 = new mo0(ey1Var2, 19);
                                ov0Var12.m0(objQ6);
                            }
                            n51.h((au0) objQ6, dv1VarE3, z9, null, null, null, null, xq1.o, ov0Var12, 805306416, 504);
                            ov0Var3 = ov0Var12;
                            r5 = 0;
                        } else {
                            r5 = 0;
                            ov0Var12.c0(-361446219);
                            ov0Var3 = ov0Var12;
                        }
                        ov0Var3.p(r5);
                        kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var3, r5);
                        int iHashCode2 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL2 = ov0Var3.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var3, av1Var);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar, kk2VarA);
                        q73.h(ov0Var3, ghVar2, l72VarL2);
                        az2.s(iHashCode2, ov0Var3, ghVar3, ov0Var3, waVar);
                        q73.h(ov0Var3, ghVar4, dv1VarH2);
                        n51.j(au0Var, null, !z4, null, null, null, xq1.p, ov0Var3, 805306368, 506);
                        n51.j(au0Var2, null, false, null, null, null, xq1.q, ov0Var3, 805306368, 510);
                        ov0Var3.p(true);
                        ov0Var3.p(true);
                    } else {
                        ov0Var4.W();
                    }
                    return mf3.a;
                }
            }, ov0Var2);
            ov0Var = ov0Var2;
            sb.C(dv1VarE, bj2VarA, null, null, p10VarA0, ov0Var, 196614, 28);
            if (((Boolean) ey1Var.getValue()).booleanValue() && membershipOrder.getWaiting()) {
                ov0Var.c0(860250390);
                boolean zF3 = ov0Var.f(ey1Var);
                Object objQ4 = ov0Var.Q();
                if (zF3 || objQ4 == c30Var) {
                    objQ4 = new mo0(ey1Var, 18);
                    ov0Var.m0(objQ4);
                }
                z3 = false;
                xq1.a((au0) objQ4, sb.a0(909236344, new o2(ey1Var, au0Var3, z2), ov0Var), null, sb.a0(-1056750410, new i3(ey1Var, 13), ov0Var), xq1.t, xq1.u, null, 0L, 0L, 0L, 0L, null, ov0Var, 1772592, 16276);
            } else {
                z3 = false;
                ov0Var.c0(874590237);
            }
            ov0Var.p(z3);
        } else {
            z2 = z;
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new w4(membershipOrder, z2, au0Var, au0Var2, au0Var3, i);
        }
    }

    public static final void h0(u32 u32Var, int i, Object obj) {
        u32Var.j[(u32Var.k - u32Var.f[u32Var.g - 1].b) + i] = obj;
    }

    public static final void i(String str, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1692073924);
        int i2 = (ov0Var.f(str) ? 4 : 2) | i;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (z || objQ == c30Var) {
                objQ = new t52(0);
                ov0Var.m0(objQ);
            }
            t52 t52Var = (t52) objQ;
            boolean zD = ov0Var.d(t52Var.g()) | (i3 == 4);
            Object objQ2 = ov0Var.Q();
            if (zD || objQ2 == c30Var) {
                objQ2 = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ2);
            }
            ey1 ey1Var = (ey1) objQ2;
            Integer numValueOf = Integer.valueOf(t52Var.g());
            boolean zF = ov0Var.f(ey1Var) | (i3 == 4);
            Object objQ3 = ov0Var.Q();
            if (zF || objQ3 == c30Var) {
                objQ3 = new t3(str, ey1Var, null, 9);
                ov0Var.m0(objQ3);
            }
            ey1 ey1VarR = ce0.R(null, str, numValueOf, (pu0) objQ3, ov0Var, ((i2 << 3) & 112) | 6);
            if (((Bitmap) ey1VarR.getValue()) != null) {
                ov0Var.c0(-1456375920);
                Bitmap bitmap = (Bitmap) ey1VarR.getValue();
                bitmap.getClass();
                td tdVar = new td(bitmap);
                String strN = ke0.N(2131624745, ov0Var);
                dv1 dv1VarD = zm3.D(xp1.k(iw2.k(av1.a, 256.0f), hz.c, o51.p0), 8.0f);
                pr prVar = j9.j;
                boolean zF2 = ov0Var.f(tdVar);
                Object objQ4 = ov0Var.Q();
                if (zF2 || objQ4 == c30Var) {
                    qr qrVar = new qr(tdVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
                    qrVar.g = 0;
                    ov0Var.m0(qrVar);
                    objQ4 = qrVar;
                }
                mc0.a((qr) objQ4, strN, dv1VarD, prVar, f60.a, ov0Var, 392);
                ov0Var.p(false);
            } else if (((Boolean) ey1Var.getValue()).booleanValue()) {
                ov0Var.c0(-1456181829);
                s83.b(ke0.N(2131624747, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                boolean zF3 = ov0Var.f(t52Var);
                Object objQ5 = ov0Var.Q();
                if (zF3 || objQ5 == c30Var) {
                    ov0Var = ov0Var;
                    objQ5 = new id(t52Var, 5);
                    ov0Var.m0(objQ5);
                }
                n51.j((au0) objQ5, null, false, null, null, null, xq1.v, ov0Var, 805306368, 510);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-1456043972);
                vc2.a(null, bk.g, 0.0f, 0L, 0, 0.0f, ov0Var, 48, 61);
                s83.b(ke0.N(2131624749, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                ov0Var = ov0Var;
                ov0Var.p(false);
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new t2(str, i);
        }
    }

    public static final void i0(u32 u32Var, int i, Object obj, int i2, Object obj2) {
        int i3 = u32Var.k - u32Var.f[u32Var.g - 1].b;
        Object[] objArr = u32Var.j;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void j(MembershipPlan membershipPlan, boolean z, au0 au0Var, dv1 dv1Var, f30 f30Var, int i) {
        long j;
        long jC;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-268595936);
        int i2 = i | (ov0Var.h(membershipPlan) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(dv1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            float f = z ? 2.0f : 1.0f;
            if (z) {
                ov0Var.c0(-422650038);
                ov0Var.p(false);
                j = bk.g;
            } else {
                ov0Var.c0(-422648690);
                j = ((kz) ov0Var.j(mz.a)).B;
                ov0Var.p(false);
            }
            is isVarH = da0.h(f, j);
            if (z) {
                ov0Var.c0(-422645679);
                ov0Var.p(false);
                jC = hz.c(0.08f, bk.g);
            } else {
                ov0Var.c0(-422644121);
                jC = ((kz) ov0Var.j(mz.a)).p;
                ov0Var.p(false);
            }
            int i4 = i2 >> 6;
            sb.B(au0Var, dv1Var, false, cj2.a(18.0f), ym3.t(jC, 0L, ov0Var, 0, 14), null, isVarH, sb.a0(-666637803, new da1(membershipPlan, z, i3), ov0Var), ov0Var, (i4 & 14) | 100663296 | (i4 & 112), 164);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(membershipPlan, z, au0Var, dv1Var, i, 8);
        }
    }

    public static String j0(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final void k(final AppState appState, final au0 au0Var, final au0 au0Var2, final lu0 lu0Var, final lu0 lu0Var2, final lu0 lu0Var3, final lu0 lu0Var4, final lu0 lu0Var5, final lu0 lu0Var6, final lu0 lu0Var7, final lu0 lu0Var8, final lu0 lu0Var9, final au0 au0Var3, final au0 au0Var4, final au0 au0Var5, final au0 au0Var6, final lu0 lu0Var10, final lu0 lu0Var11, final lu0 lu0Var12, final lu0 lu0Var13, final p10 p10Var, f30 f30Var, final int i) {
        int i2;
        au0 au0Var7;
        lu0 lu0Var14;
        lu0 lu0Var15;
        ov0 ov0Var;
        appState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1855276366);
        if ((i & 6) == 0) {
            i2 = (ov0Var2.h(appState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var2.h(au0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            au0Var7 = au0Var2;
            i2 |= ov0Var2.h(au0Var7) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        } else {
            au0Var7 = au0Var2;
        }
        if ((i & 3072) == 0) {
            lu0Var14 = lu0Var;
            i2 |= ov0Var2.h(lu0Var14) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            lu0Var14 = lu0Var;
        }
        if ((i & 24576) == 0) {
            lu0Var15 = lu0Var2;
            i2 |= ov0Var2.h(lu0Var15) ? 16384 : 8192;
        } else {
            lu0Var15 = lu0Var2;
        }
        if ((i & 196608) == 0) {
            i2 |= ov0Var2.h(lu0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= ov0Var2.h(lu0Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= ov0Var2.h(lu0Var5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= ov0Var2.h(lu0Var6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= ov0Var2.h(lu0Var7) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (ov0Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((((ov0Var2.h(lu0Var8) ? (char) 4 : (char) 2) | (ov0Var2.h(lu0Var9) ? ' ' : (char) 16)) | (ov0Var2.h(au0Var3) ? 256 : WorkQueueKt.BUFFER_CAPACITY)) | (ov0Var2.h(au0Var4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) | (ov0Var2.h(au0Var5) ? (char) 16384 : (char) 8192)) | (ov0Var2.h(au0Var6) ? (char) 0 : (char) 0)) | (ov0Var2.h(lu0Var10) ? (char) 0 : (char) 0)) | (ov0Var2.h(lu0Var11) ? (char) 0 : (char) 0)) | (ov0Var2.h(lu0Var12) ? (char) 0 : (char) 0)) | (ov0Var2.h(lu0Var13) ? (char) 0 : (char) 0)) & 306783379) == 306783378) ? false : true)) {
            final au0 au0Var8 = au0Var7;
            final lu0 lu0Var16 = lu0Var15;
            final lu0 lu0Var17 = lu0Var14;
            ov0Var = ov0Var2;
            sb.H(au0Var, new qc0(3), sb.a0(1169213288, new pu0() { // from class: hj2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bj2 bj2VarA = cj2.a(24.0f);
                        aw awVarT = ym3.t(((kz) ov0Var3.j(mz.a)).p, 0L, ov0Var3, 0, 14);
                        dv1 dv1VarH = ji2.H(zm3.F(iw2.e(av1.a, 0.92f), 0.0f, 20.0f, 1));
                        cw cwVarU = ym3.u(62, 10.0f);
                        final au0 au0Var9 = au0Var8;
                        final AppState appState2 = appState;
                        final lu0 lu0Var18 = lu0Var10;
                        final lu0 lu0Var19 = lu0Var11;
                        final lu0 lu0Var20 = lu0Var13;
                        final p10 p10Var2 = p10Var;
                        final au0 au0Var10 = au0Var3;
                        final au0 au0Var11 = au0Var4;
                        final au0 au0Var12 = au0Var5;
                        final au0 au0Var13 = au0Var6;
                        final lu0 lu0Var21 = lu0Var12;
                        final au0 au0Var14 = au0Var;
                        final lu0 lu0Var22 = lu0Var17;
                        final lu0 lu0Var23 = lu0Var16;
                        final lu0 lu0Var24 = lu0Var3;
                        final lu0 lu0Var25 = lu0Var7;
                        final lu0 lu0Var26 = lu0Var9;
                        final lu0 lu0Var27 = lu0Var8;
                        final lu0 lu0Var28 = lu0Var6;
                        final lu0 lu0Var29 = lu0Var4;
                        final lu0 lu0Var30 = lu0Var5;
                        sb.C(dv1VarH, bj2VarA, awVarT, cwVarU, sb.a0(654886326, new qu0() { // from class: nj2
                            /* JADX WARN: Code duplicated, block: B:102:0x092d  */
                            /* JADX WARN: Code duplicated, block: B:105:0x0947  */
                            /* JADX WARN: Code duplicated, block: B:106:0x0954  */
                            /* JADX WARN: Code duplicated, block: B:112:0x0990  */
                            /* JADX WARN: Code duplicated, block: B:115:0x09ce  */
                            /* JADX WARN: Code duplicated, block: B:118:0x0a98  */
                            /* JADX WARN: Code duplicated, block: B:120:0x0b0f  */
                            /* JADX WARN: Code duplicated, block: B:121:0x0b13  */
                            /* JADX WARN: Code duplicated, block: B:125:0x0b47  */
                            /* JADX WARN: Code duplicated, block: B:127:0x0b53  */
                            /* JADX WARN: Code duplicated, block: B:128:0x0b55  */
                            /* JADX WARN: Code duplicated, block: B:131:0x0b73  */
                            /* JADX WARN: Code duplicated, block: B:132:0x0b78  */
                            /* JADX WARN: Code duplicated, block: B:135:0x0b82  */
                            /* JADX WARN: Code duplicated, block: B:136:0x0b85  */
                            /* JADX WARN: Code duplicated, block: B:139:0x0b8d  */
                            /* JADX WARN: Code duplicated, block: B:140:0x0b92  */
                            /* JADX WARN: Code duplicated, block: B:142:0x0b9a  */
                            /* JADX WARN: Code duplicated, block: B:143:0x0b9d  */
                            /* JADX WARN: Code duplicated, block: B:146:0x0ba5  */
                            /* JADX WARN: Code duplicated, block: B:147:0x0ba8  */
                            /* JADX WARN: Code duplicated, block: B:150:0x0bb0  */
                            /* JADX WARN: Code duplicated, block: B:151:0x0bb3  */
                            /* JADX WARN: Code duplicated, block: B:154:0x0bbb  */
                            /* JADX WARN: Code duplicated, block: B:155:0x0bbe  */
                            /* JADX WARN: Code duplicated, block: B:158:0x0bc6  */
                            /* JADX WARN: Code duplicated, block: B:159:0x0bc9  */
                            /* JADX WARN: Code duplicated, block: B:163:0x0bd4  */
                            /* JADX WARN: Code duplicated, block: B:166:0x0bdb  */
                            /* JADX WARN: Code duplicated, block: B:167:0x0bde  */
                            /* JADX WARN: Code duplicated, block: B:171:0x0be9  */
                            /* JADX WARN: Code duplicated, block: B:174:0x0bf0  */
                            /* JADX WARN: Code duplicated, block: B:175:0x0bf3  */
                            /* JADX WARN: Code duplicated, block: B:178:0x0bfb  */
                            /* JADX WARN: Code duplicated, block: B:179:0x0bfe  */
                            /* JADX WARN: Code duplicated, block: B:183:0x0c28  */
                            /* JADX WARN: Code duplicated, block: B:187:0x0c68  */
                            /* JADX WARN: Code duplicated, block: B:190:0x0cdd  */
                            /* JADX WARN: Code duplicated, block: B:193:0x0d02  */
                            /* JADX WARN: Code duplicated, block: B:196:0x0d18  */
                            /* JADX WARN: Code duplicated, block: B:199:0x0d27  */
                            /* JADX WARN: Code duplicated, block: B:202:0x0d46  */
                            /* JADX WARN: Code duplicated, block: B:205:0x0d5e  */
                            /* JADX WARN: Code duplicated, block: B:208:0x0d6b  */
                            /* JADX WARN: Code duplicated, block: B:211:0x0d8a  */
                            /* JADX WARN: Code duplicated, block: B:214:0x0da2  */
                            /* JADX WARN: Code duplicated, block: B:218:0x0dc9  */
                            /* JADX WARN: Code duplicated, block: B:61:0x06f0  */
                            /* JADX WARN: Code duplicated, block: B:62:0x06f4  */
                            /* JADX WARN: Code duplicated, block: B:65:0x0784  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0788  */
                            /* JADX WARN: Code duplicated, block: B:70:0x0821  */
                            /* JADX WARN: Code duplicated, block: B:72:0x0839  */
                            /* JADX WARN: Code duplicated, block: B:73:0x083b  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0842  */
                            /* JADX WARN: Code duplicated, block: B:77:0x0855  */
                            /* JADX WARN: Code duplicated, block: B:79:0x086e  */
                            /* JADX WARN: Code duplicated, block: B:81:0x087b  */
                            /* JADX WARN: Code duplicated, block: B:84:0x089c  */
                            /* JADX WARN: Code duplicated, block: B:87:0x08a1  */
                            /* JADX WARN: Code duplicated, block: B:88:0x08a4  */
                            /* JADX WARN: Code duplicated, block: B:93:0x08ff  */
                            /* JADX WARN: Code duplicated, block: B:98:0x091d  */
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                char c2;
                                c30 c30Var;
                                c30 c30Var2;
                                ov0 ov0Var4;
                                or orVar;
                                Iterator it;
                                av1 av1Var;
                                or orVar2;
                                int i4;
                                hh0 hh0Var;
                                final AppState appState3;
                                ov0 ov0Var5;
                                AppState appState4;
                                ov0 ov0Var6;
                                AppState appState5;
                                au0 au0Var15;
                                boolean zF;
                                Object objQ;
                                au0 au0Var16;
                                boolean zF2;
                                Object objQ2;
                                au0 au0Var17;
                                boolean zF3;
                                Object objQ3;
                                au0 au0Var18;
                                boolean zF4;
                                Object objQ4;
                                x30 x30Var;
                                boolean z;
                                long j;
                                long jC;
                                long j2;
                                np2 np2VarG;
                                long j3;
                                long j4;
                                long j5;
                                long j6;
                                long j7;
                                long j8;
                                long j9;
                                long j10;
                                long j11;
                                long j12;
                                long j13;
                                lu0 lu0Var31;
                                boolean zF5;
                                Object objQ5;
                                double customSpeedMs;
                                Object objI;
                                boolean z2;
                                Object objQ6;
                                s52 s52Var;
                                int iG;
                                String str;
                                SimMode simMode;
                                boolean z3;
                                long jC2;
                                is isVarH;
                                boolean zF6;
                                Object objQ7;
                                c30 c30Var3;
                                f30 f30Var3 = (f30) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                or orVar3 = j9.o;
                                ((zz) obj3).getClass();
                                ov0 ov0Var7 = (ov0) f30Var3;
                                if (ov0Var7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    av1 av1Var2 = av1.a;
                                    dv1 dv1VarH2 = iw2.h(zm3.D(iw2.e(av1Var2, 1.0f), 20.0f), 0.0f, 720.0f, 1);
                                    jo joVarV = am1.V(16.0f);
                                    nr nrVar = j9.r;
                                    yz yzVarA = wz.a(joVarV, nrVar, ov0Var7, 6);
                                    int iHashCode = Long.hashCode(ov0Var7.T);
                                    l72 l72VarL = ov0Var7.l();
                                    dv1 dv1VarH3 = xp1.H(ov0Var7, dv1VarH2);
                                    w20.b.getClass();
                                    x30 x30Var2 = v20.b;
                                    ov0Var7.g0();
                                    if (ov0Var7.S) {
                                        ov0Var7.k(x30Var2);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    gh ghVar = v20.e;
                                    q73.h(ov0Var7, ghVar, yzVarA);
                                    gh ghVar2 = v20.d;
                                    q73.h(ov0Var7, ghVar2, l72VarL);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    gh ghVar3 = v20.f;
                                    q73.h(ov0Var7, ghVar3, numValueOf);
                                    wa waVar = v20.g;
                                    q73.g(ov0Var7, waVar);
                                    gh ghVar4 = v20.c;
                                    q73.h(ov0Var7, ghVar4, dv1VarH3);
                                    dv1 dv1VarP = zm3.P(new wb1(1.0f, false), zm3.O(ov0Var7), true);
                                    yz yzVarA2 = wz.a(am1.V(16.0f), nrVar, ov0Var7, 6);
                                    int iHashCode2 = Long.hashCode(ov0Var7.T);
                                    l72 l72VarL2 = ov0Var7.l();
                                    dv1 dv1VarH4 = xp1.H(ov0Var7, dv1VarP);
                                    ov0Var7.g0();
                                    if (ov0Var7.S) {
                                        ov0Var7.k(x30Var2);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar, yzVarA2);
                                    q73.h(ov0Var7, ghVar2, l72VarL2);
                                    az2.s(iHashCode2, ov0Var7, ghVar3, ov0Var7, waVar);
                                    q73.h(ov0Var7, ghVar4, dv1VarH4);
                                    dv1 dv1VarE = iw2.e(av1Var2, 1.0f);
                                    kk2 kk2VarA = jk2.a(am1.i, j9.p, ov0Var7, 54);
                                    int iHashCode3 = Long.hashCode(ov0Var7.T);
                                    l72 l72VarL3 = ov0Var7.l();
                                    dv1 dv1VarH5 = xp1.H(ov0Var7, dv1VarE);
                                    ov0Var7.g0();
                                    if (ov0Var7.S) {
                                        ov0Var7.k(x30Var2);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar, kk2VarA);
                                    q73.h(ov0Var7, ghVar2, l72VarL3);
                                    az2.s(iHashCode3, ov0Var7, ghVar3, ov0Var7, waVar);
                                    q73.h(ov0Var7, ghVar4, dv1VarH5);
                                    String strN = ke0.N(2131624912, ov0Var7);
                                    long jC3 = v63.c(18);
                                    jr0 jr0Var = jr0.j;
                                    hh0 hh0Var2 = mz.a;
                                    s83.b(strN, null, ((kz) ov0Var7.j(hh0Var2)).q, jC3, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262058);
                                    xq1.l(au0Var14, iw2.k(av1Var2, 28.0f), false, null, null, ks.E, ov0Var7, 1572912, 60);
                                    ov0Var7.p(true);
                                    yz yzVarA3 = wz.a(am1.V(8.0f), nrVar, ov0Var7, 6);
                                    int iHashCode4 = Long.hashCode(ov0Var7.T);
                                    l72 l72VarL4 = ov0Var7.l();
                                    dv1 dv1VarH6 = xp1.H(ov0Var7, av1Var2);
                                    ov0Var7.g0();
                                    if (ov0Var7.S) {
                                        ov0Var7.k(x30Var2);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar, yzVarA3);
                                    q73.h(ov0Var7, ghVar2, l72VarL4);
                                    az2.s(iHashCode4, ov0Var7, ghVar3, ov0Var7, waVar);
                                    q73.h(ov0Var7, ghVar4, dv1VarH6);
                                    s83.b(ke0.N(2131624916, ov0Var7), null, hz.c(0.6f, ((kz) ov0Var7.j(hh0Var2)).q), v63.c(13), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262058);
                                    dv1 dv1VarE2 = iw2.e(av1Var2, 1.0f);
                                    kk2 kk2VarA2 = jk2.a(am1.V(10.0f), orVar3, ov0Var7, 6);
                                    int iHashCode5 = Long.hashCode(ov0Var7.T);
                                    l72 l72VarL5 = ov0Var7.l();
                                    dv1 dv1VarH7 = xp1.H(ov0Var7, dv1VarE2);
                                    ov0Var7.g0();
                                    if (ov0Var7.S) {
                                        ov0Var7.k(x30Var2);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar, kk2VarA2);
                                    q73.h(ov0Var7, ghVar2, l72VarL5);
                                    az2.s(iHashCode5, ov0Var7, ghVar3, ov0Var7, waVar);
                                    q73.h(ov0Var7, ghVar4, dv1VarH7);
                                    String strN2 = ke0.N(2131624593, ov0Var7);
                                    String strN3 = ke0.N(2131624594, ov0Var7);
                                    x01 x01VarB = xp1.P;
                                    if (x01VarB == null) {
                                        w01 w01Var = new w01("Rounded.Autorenew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        int i5 = nh3.a;
                                        qy2 qy2Var = new qy2(hz.b);
                                        nx0 nx0Var = new nx0(3);
                                        nx0Var.m(12.0f, 6.0f);
                                        nx0Var.s(1.79f);
                                        nx0Var.g(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
                                        nx0Var.l(2.79f, -2.79f);
                                        nx0Var.g(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
                                        nx0Var.l(-2.79f, -2.79f);
                                        nx0Var.g(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
                                        nx0Var.k(12.0f, 4.0f);
                                        nx0Var.g(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
                                        nx0Var.g(0.0f, 1.04f, 0.2f, 2.04f, 0.57f, 2.95f);
                                        nx0Var.g(0.27f, 0.67f, 1.13f, 0.85f, 1.64f, 0.34f);
                                        nx0Var.g(0.27f, -0.27f, 0.38f, -0.68f, 0.23f, -1.04f);
                                        nx0Var.f(6.15f, 13.56f, 6.0f, 12.79f, 6.0f, 12.0f);
                                        nx0Var.g(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
                                        nx0Var.e();
                                        nx0Var.m(17.79f, 8.71f);
                                        nx0Var.g(-0.27f, 0.27f, -0.38f, 0.69f, -0.23f, 1.04f);
                                        nx0Var.g(0.28f, 0.7f, 0.44f, 1.46f, 0.44f, 2.25f);
                                        nx0Var.g(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
                                        nx0Var.s(-1.79f);
                                        nx0Var.g(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
                                        nx0Var.l(-2.79f, 2.79f);
                                        nx0Var.g(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
                                        nx0Var.l(2.79f, 2.79f);
                                        nx0Var.g(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
                                        nx0Var.k(12.0f, 20.0f);
                                        nx0Var.g(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
                                        nx0Var.g(0.0f, -1.04f, -0.2f, -2.04f, -0.57f, -2.95f);
                                        nx0Var.g(-0.27f, -0.67f, -1.13f, -0.85f, -1.64f, -0.34f);
                                        nx0Var.e();
                                        w01.a(w01Var, nx0Var.a, qy2Var);
                                        x01VarB = w01Var.b();
                                        xp1.P = x01VarB;
                                    }
                                    AppState appState6 = appState2;
                                    boolean z4 = appState6.getRouteRunMode() == RouteRunMode.LOOP;
                                    lu0 lu0Var32 = lu0Var22;
                                    boolean zF7 = ov0Var7.f(lu0Var32);
                                    Object objQ8 = ov0Var7.Q();
                                    c30 c30Var4 = d30.a;
                                    if (zF7 || objQ8 == c30Var4) {
                                        objQ8 = new hl1(11, lu0Var32);
                                        ov0Var7.m0(objQ8);
                                    }
                                    lk2 lk2Var = lk2.a;
                                    wc0.m(strN2, strN3, x01VarB, z4, (au0) objQ8, lk2.a(lk2Var, av1Var2, 1.0f), ov0Var7, 0);
                                    String strN4 = ke0.N(2131624569, ov0Var7);
                                    String strN5 = ke0.N(2131624570, ov0Var7);
                                    x01 x01VarB2 = hd0.d;
                                    if (x01VarB2 != null) {
                                        c2 = 0;
                                    } else {
                                        w01 w01Var2 = new w01("Rounded.SportsEsports", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        int i6 = nh3.a;
                                        qy2 qy2Var2 = new qy2(hz.b);
                                        nx0 nx0Var2 = new nx0(3);
                                        nx0Var2.m(21.58f, 16.09f);
                                        nx0Var2.l(-1.09f, -7.66f);
                                        nx0Var2.f(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
                                        nx0Var2.h(7.47f);
                                        nx0Var2.f(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
                                        nx0Var2.l(-1.09f, 7.66f);
                                        nx0Var2.f(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
                                        nx0Var2.i(0.0f);
                                        nx0Var2.g(0.68f, 0.0f, 1.32f, -0.27f, 1.8f, -0.75f);
                                        c2 = 0;
                                        nx0Var2.k(9.0f, 16.0f);
                                        nx0Var2.i(6.0f);
                                        nx0Var2.l(2.25f, 2.25f);
                                        nx0Var2.g(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
                                        nx0Var2.i(0.0f);
                                        nx0Var2.f(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
                                        nx0Var2.e();
                                        nx0Var2.m(11.0f, 11.0f);
                                        nx0Var2.h(9.0f);
                                        nx0Var2.s(2.0f);
                                        nx0Var2.h(8.0f);
                                        nx0Var2.s(-2.0f);
                                        nx0Var2.h(6.0f);
                                        nx0Var2.s(-1.0f);
                                        nx0Var2.i(2.0f);
                                        nx0Var2.r(8.0f);
                                        nx0Var2.i(1.0f);
                                        nx0Var2.s(2.0f);
                                        nx0Var2.i(2.0f);
                                        nx0Var2.r(11.0f);
                                        nx0Var2.e();
                                        nx0Var2.m(15.0f, 10.0f);
                                        nx0Var2.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                                        nx0Var2.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                                        nx0Var2.o(1.0f, 0.45f, 1.0f, 1.0f);
                                        nx0Var2.f(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
                                        nx0Var2.e();
                                        nx0Var2.m(17.0f, 13.0f);
                                        nx0Var2.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                                        nx0Var2.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                                        nx0Var2.o(1.0f, 0.45f, 1.0f, 1.0f);
                                        nx0Var2.f(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
                                        nx0Var2.e();
                                        w01.a(w01Var2, nx0Var2.a, qy2Var2);
                                        x01VarB2 = w01Var2.b();
                                        hd0.d = x01VarB2;
                                    }
                                    boolean z5 = appState6.getRouteRunMode() == RouteRunMode.MANUAL;
                                    boolean zF8 = ov0Var7.f(lu0Var32);
                                    Object objQ9 = ov0Var7.Q();
                                    if (zF8) {
                                        c30Var = c30Var4;
                                    } else {
                                        c30Var = c30Var4;
                                        if (objQ9 == c30Var) {
                                        }
                                        c30 c30Var5 = c30Var;
                                        wc0.m(strN4, strN5, x01VarB2, z5, (au0) objQ9, lk2.a(lk2Var, av1Var2, 1.0f), ov0Var7, 0);
                                        ov0Var7.r();
                                        ov0Var7.r();
                                        yz yzVarA4 = wz.a(am1.V(8.0f), nrVar, ov0Var7, 6);
                                        int iHashCode6 = Long.hashCode(ks.U(ov0Var7));
                                        l72 l72VarL6 = ov0Var7.l();
                                        dv1 dv1VarH8 = xp1.H(ov0Var7, av1Var2);
                                        ov0Var7.g0();
                                        if (ov0Var7.D()) {
                                            ov0Var7.k(x30Var2);
                                        } else {
                                            ov0Var7.p0();
                                        }
                                        q73.h(ov0Var7, ghVar, yzVarA4);
                                        q73.h(ov0Var7, ghVar2, l72VarL6);
                                        az2.s(iHashCode6, ov0Var7, ghVar3, ov0Var7, waVar);
                                        q73.h(ov0Var7, ghVar4, dv1VarH8);
                                        c30Var2 = c30Var5;
                                        s83.b(ke0.N(2131624357, ov0Var7), null, hz.c(0.6f, ((kz) ov0Var7.j(hh0Var2)).q), v63.c(13), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262058);
                                        ov0Var4 = ov0Var7;
                                        dv1 dv1VarE3 = iw2.e(av1Var2, 1.0f);
                                        orVar = orVar3;
                                        kk2 kk2VarA3 = jk2.a(am1.V(6.0f), orVar, ov0Var4, 6);
                                        int iHashCode7 = Long.hashCode(ks.U(ov0Var4));
                                        l72 l72VarZ = ov0Var4.z();
                                        dv1 dv1VarH9 = xp1.H(ov0Var4, dv1VarE3);
                                        ov0Var4.g0();
                                        if (ov0Var4.D()) {
                                            ov0Var4.k(x30Var2);
                                        } else {
                                            ov0Var4.p0();
                                        }
                                        q73.h(ov0Var4, ghVar, kk2VarA3);
                                        q73.h(ov0Var4, ghVar2, l72VarZ);
                                        az2.s(iHashCode7, ov0Var4, ghVar3, ov0Var4, waVar);
                                        q73.h(ov0Var4, ghVar4, dv1VarH9);
                                        ov0Var4.c0(1764195148);
                                        it = am1.G(new md3(SimMode.WALKING, ke0.N(2131625163, ov0Var4), "1.4m/s"), new md3(SimMode.RUNNING, ke0.N(2131624917, ov0Var4), "3.0m/s"), new md3(SimMode.CYCLING, ke0.N(2131624371, ov0Var4), "5.5m/s"), new md3(SimMode.DRIVING, ke0.N(2131624400, ov0Var4), "15m/s"), new md3(SimMode.CUSTOM, ke0.N(2131624364, ov0Var4), String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(appState6.getCustomSpeedMs())}, 1)).concat("m/s"))).iterator();
                                        while (it.hasNext()) {
                                            md3 md3Var = (md3) it.next();
                                            simMode = (SimMode) md3Var.e;
                                            String str2 = (String) md3Var.f;
                                            String str3 = (String) md3Var.g;
                                            if (appState6.getRouteSimMode() == simMode) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            bj2 bj2VarA2 = cj2.a(14.0f);
                                            if (z3) {
                                                ov0Var4.c0(1798370543);
                                                ov0Var4.s();
                                                jC2 = hz.c(0.12f, bk.g);
                                            } else {
                                                ov0Var4.c0(1798372733);
                                                jC2 = hz.c(0.35f, ((kz) ov0Var4.j(mz.a)).r);
                                                ov0Var4.s();
                                            }
                                            if (z3) {
                                                isVarH = da0.h(1.5f, bk.g);
                                            } else {
                                                isVarH = null;
                                            }
                                            dv1 dv1VarA = lk2.a(lk2Var, av1Var2, 1.0f);
                                            lu0 lu0Var33 = lu0Var23;
                                            zF6 = ov0Var4.f(lu0Var33) | ov0Var4.d(simMode.ordinal());
                                            Iterator it2 = it;
                                            objQ7 = ov0Var4.Q();
                                            if (zF6) {
                                                c30Var3 = c30Var2;
                                            } else {
                                                c30Var3 = c30Var2;
                                                if (objQ7 == c30Var3) {
                                                }
                                                ov0 ov0Var8 = ov0Var4;
                                                e33.a(zm3.m(dv1VarA, false, null, (au0) objQ7, 15), bj2VarA2, jC2, 0L, 0.0f, 0.0f, isVarH, sb.a0(675891383, new o2(6, str3, str2, z3), ov0Var4), ov0Var8, 12582912, 56);
                                                orVar = orVar;
                                                c30Var2 = c30Var3;
                                                ov0Var4 = ov0Var8;
                                                it = it2;
                                                av1Var2 = av1Var2;
                                            }
                                            objQ7 = new qi2(4, lu0Var33, simMode);
                                            ov0Var4.m0(objQ7);
                                            ov0 ov0Var9 = ov0Var4;
                                            e33.a(zm3.m(dv1VarA, false, null, (au0) objQ7, 15), bj2VarA2, jC2, 0L, 0.0f, 0.0f, isVarH, sb.a0(675891383, new o2(6, str3, str2, z3), ov0Var4), ov0Var9, 12582912, 56);
                                            orVar = orVar;
                                            c30Var2 = c30Var3;
                                            ov0Var4 = ov0Var9;
                                            it = it2;
                                            av1Var2 = av1Var2;
                                        }
                                        av1Var = av1Var2;
                                        orVar2 = orVar;
                                        c30 c30Var6 = c30Var2;
                                        ov0Var4.s();
                                        ov0Var4.r();
                                        i4 = 9;
                                        if (appState6.getRouteSimMode() == SimMode.CUSTOM) {
                                            ov0Var4.c0(-1135669909);
                                            customSpeedMs = appState6.getCustomSpeedMs();
                                            objI = ov0Var4.I();
                                            if ((objI instanceof Double) || customSpeedMs != ((Number) objI).doubleValue()) {
                                                ov0Var4.n0(Double.valueOf(customSpeedMs));
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            objQ6 = ov0Var4.Q();
                                            if (z2 || objQ6 == c30Var6) {
                                                objQ6 = new s52((float) appState6.getCustomSpeedMs());
                                                ov0Var4.m0(objQ6);
                                            }
                                            s52Var = (s52) objQ6;
                                            if (s52Var.g() > 0.2f) {
                                                iG = (int) (1000.0d / ((double) s52Var.g()));
                                            } else {
                                                iG = 0;
                                            }
                                            int i7 = iG / 60;
                                            int i8 = iG % 60;
                                            if (60 <= iG || iG >= 3600) {
                                                str = "--";
                                            } else {
                                                str = i7 + "'" + String.format(Locale.US, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1)) + "\"/km";
                                            }
                                            ov0 ov0Var10 = ov0Var4;
                                            e33.a(iw2.e(av1Var, 1.0f), cj2.a(14.0f), hz.c(0.35f, ((kz) ov0Var4.j(mz.a)).r), 0L, 0.0f, 0.0f, null, sb.a0(-298435001, new f5(s52Var, lu0Var24, str, i4), ov0Var4), ov0Var10, 12582918, 120);
                                            ov0Var4 = ov0Var10;
                                        } else {
                                            ov0Var4.c0(-1146183931);
                                        }
                                        ov0Var4.s();
                                        ov0Var4.r();
                                        bj2 bj2VarA3 = cj2.a(c2);
                                        hh0Var = mz.a;
                                        appState3 = appState6;
                                        ov0 ov0Var11 = ov0Var4;
                                        e33.a(iw2.e(av1Var, 1.0f), bj2VarA3, hz.c(0.35f, ((kz) ov0Var4.j(hh0Var)).r), 0L, 0.0f, 0.0f, null, sb.a0(-911872369, new lr1(appState6, lu0Var25, lu0Var26, lu0Var27, 7), ov0Var4), ov0Var11, 12582918, 120);
                                        bj2 bj2VarA4 = cj2.a(c2);
                                        long jC4 = hz.c(0.35f, ((kz) ov0Var11.j(hh0Var)).r);
                                        dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                                        final lu0 lu0Var34 = lu0Var28;
                                        final int i9 = 0;
                                        e33.a(dv1VarE4, bj2VarA4, jC4, 0L, 0.0f, 0.0f, null, sb.a0(-1594656648, new pu0() { // from class: ij2
                                            @Override // defpackage.pu0
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i10;
                                                int i11;
                                                int i12 = i9;
                                                mf3 mf3Var = mf3.a;
                                                av1 av1Var3 = av1.a;
                                                AppState appState7 = appState3;
                                                switch (i12) {
                                                    case 0:
                                                        f30 f30Var4 = (f30) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ov0 ov0Var12 = (ov0) f30Var4;
                                                        if (!ov0Var12.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            ov0Var12.W();
                                                        } else {
                                                            dv1 dv1VarE5 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                            kk2 kk2VarA4 = jk2.a(am1.i, j9.p, ov0Var12, 54);
                                                            int iHashCode8 = Long.hashCode(ov0Var12.T);
                                                            l72 l72VarL7 = ov0Var12.l();
                                                            dv1 dv1VarH10 = xp1.H(ov0Var12, dv1VarE5);
                                                            w20.b.getClass();
                                                            x30 x30Var3 = v20.b;
                                                            ov0Var12.g0();
                                                            if (ov0Var12.S) {
                                                                ov0Var12.k(x30Var3);
                                                            } else {
                                                                ov0Var12.p0();
                                                            }
                                                            gh ghVar5 = v20.e;
                                                            q73.h(ov0Var12, ghVar5, kk2VarA4);
                                                            gh ghVar6 = v20.d;
                                                            q73.h(ov0Var12, ghVar6, l72VarL7);
                                                            Integer numValueOf2 = Integer.valueOf(iHashCode8);
                                                            gh ghVar7 = v20.f;
                                                            q73.h(ov0Var12, ghVar7, numValueOf2);
                                                            wa waVar2 = v20.g;
                                                            q73.g(ov0Var12, waVar2);
                                                            gh ghVar8 = v20.c;
                                                            q73.h(ov0Var12, ghVar8, dv1VarH10);
                                                            wb1 wb1Var = new wb1(1.0f, true);
                                                            yz yzVarA5 = wz.a(am1.g, j9.r, ov0Var12, 0);
                                                            int iHashCode9 = Long.hashCode(ov0Var12.T);
                                                            l72 l72VarL8 = ov0Var12.l();
                                                            dv1 dv1VarH11 = xp1.H(ov0Var12, wb1Var);
                                                            ov0Var12.g0();
                                                            if (ov0Var12.S) {
                                                                ov0Var12.k(x30Var3);
                                                            } else {
                                                                ov0Var12.p0();
                                                            }
                                                            q73.h(ov0Var12, ghVar5, yzVarA5);
                                                            q73.h(ov0Var12, ghVar6, l72VarL8);
                                                            az2.s(iHashCode9, ov0Var12, ghVar7, ov0Var12, waVar2);
                                                            q73.h(ov0Var12, ghVar8, dv1VarH11);
                                                            String strN6 = ke0.N(2131625058, ov0Var12);
                                                            long jC5 = v63.c(14);
                                                            jr0 jr0Var2 = jr0.j;
                                                            hh0 hh0Var3 = mz.a;
                                                            s83.b(strN6, null, ((kz) ov0Var12.j(hh0Var3)).q, jC5, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 1597440, 0, 262058);
                                                            if (appState7.getStopAtDestination()) {
                                                                i10 = -1770330906;
                                                                i11 = 2131625057;
                                                            } else {
                                                                i10 = -1770329049;
                                                                i11 = 2131625056;
                                                            }
                                                            s83.b(az2.h(ov0Var12, i10, i11, ov0Var12, false), null, hz.c(0.55f, ((kz) ov0Var12.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 24576, 0, 262122);
                                                            ov0Var12.p(true);
                                                            b43.a(appState7.getStopAtDestination(), lu0Var34, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var12, 65532), ov0Var12, 0, 92);
                                                            ov0Var12.p(true);
                                                        }
                                                        break;
                                                    default:
                                                        f30 f30Var5 = (f30) obj6;
                                                        int iIntValue4 = ((Integer) obj7).intValue();
                                                        ov0 ov0Var13 = (ov0) f30Var5;
                                                        if (!ov0Var13.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                            ov0Var13.W();
                                                        } else {
                                                            dv1 dv1VarE6 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                            kk2 kk2VarA5 = jk2.a(am1.i, j9.p, ov0Var13, 54);
                                                            int iHashCode10 = Long.hashCode(ov0Var13.T);
                                                            l72 l72VarL9 = ov0Var13.l();
                                                            dv1 dv1VarH12 = xp1.H(ov0Var13, dv1VarE6);
                                                            w20.b.getClass();
                                                            x30 x30Var4 = v20.b;
                                                            ov0Var13.g0();
                                                            if (ov0Var13.S) {
                                                                ov0Var13.k(x30Var4);
                                                            } else {
                                                                ov0Var13.p0();
                                                            }
                                                            gh ghVar9 = v20.e;
                                                            q73.h(ov0Var13, ghVar9, kk2VarA5);
                                                            gh ghVar10 = v20.d;
                                                            q73.h(ov0Var13, ghVar10, l72VarL9);
                                                            Integer numValueOf3 = Integer.valueOf(iHashCode10);
                                                            gh ghVar11 = v20.f;
                                                            q73.h(ov0Var13, ghVar11, numValueOf3);
                                                            wa waVar3 = v20.g;
                                                            q73.g(ov0Var13, waVar3);
                                                            gh ghVar12 = v20.c;
                                                            q73.h(ov0Var13, ghVar12, dv1VarH12);
                                                            wb1 wb1Var2 = new wb1(1.0f, true);
                                                            yz yzVarA6 = wz.a(am1.g, j9.r, ov0Var13, 0);
                                                            int iHashCode11 = Long.hashCode(ov0Var13.T);
                                                            l72 l72VarL10 = ov0Var13.l();
                                                            dv1 dv1VarH13 = xp1.H(ov0Var13, wb1Var2);
                                                            ov0Var13.g0();
                                                            if (ov0Var13.S) {
                                                                ov0Var13.k(x30Var4);
                                                            } else {
                                                                ov0Var13.p0();
                                                            }
                                                            q73.h(ov0Var13, ghVar9, yzVarA6);
                                                            q73.h(ov0Var13, ghVar10, l72VarL10);
                                                            az2.s(iHashCode11, ov0Var13, ghVar11, ov0Var13, waVar3);
                                                            q73.h(ov0Var13, ghVar12, dv1VarH13);
                                                            String strN7 = ke0.N(2131624840, ov0Var13);
                                                            long jC6 = v63.c(14);
                                                            jr0 jr0Var3 = jr0.j;
                                                            hh0 hh0Var4 = mz.a;
                                                            s83.b(strN7, null, ((kz) ov0Var13.j(hh0Var4)).q, jC6, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 1597440, 0, 262058);
                                                            s83.b(ke0.N(2131624986, ov0Var13), null, hz.c(0.55f, ((kz) ov0Var13.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 24576, 0, 262122);
                                                            ov0Var13.p(true);
                                                            b43.a(appState7.getUseRealRoute(), lu0Var34, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var13, 65532), ov0Var13, 0, 92);
                                                            ov0Var13.p(true);
                                                        }
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        }, ov0Var11), ov0Var11, 12582918, 120);
                                        xp1.a(appState3.getAltitudeInput(), appState3.getAltitudeVariationM(), lu0Var18, lu0Var19, null, ov0Var11, 0);
                                        bj2 bj2VarA5 = cj2.a(c2);
                                        long jC5 = hz.c(0.35f, ((kz) ov0Var11.j(hh0Var)).r);
                                        dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                                        final lu0 lu0Var35 = lu0Var29;
                                        final int i10 = 1;
                                        e33.a(dv1VarE5, bj2VarA5, jC5, 0L, 0.0f, 0.0f, null, sb.a0(1149341399, new pu0() { // from class: ij2
                                            @Override // defpackage.pu0
                                            public final Object invoke(Object obj6, Object obj7) {
                                                int i11;
                                                int i12;
                                                int i13 = i10;
                                                mf3 mf3Var = mf3.a;
                                                av1 av1Var3 = av1.a;
                                                AppState appState7 = appState3;
                                                switch (i13) {
                                                    case 0:
                                                        f30 f30Var4 = (f30) obj6;
                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                        ov0 ov0Var12 = (ov0) f30Var4;
                                                        if (!ov0Var12.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            ov0Var12.W();
                                                        } else {
                                                            dv1 dv1VarE6 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                            kk2 kk2VarA4 = jk2.a(am1.i, j9.p, ov0Var12, 54);
                                                            int iHashCode8 = Long.hashCode(ov0Var12.T);
                                                            l72 l72VarL7 = ov0Var12.l();
                                                            dv1 dv1VarH10 = xp1.H(ov0Var12, dv1VarE6);
                                                            w20.b.getClass();
                                                            x30 x30Var3 = v20.b;
                                                            ov0Var12.g0();
                                                            if (ov0Var12.S) {
                                                                ov0Var12.k(x30Var3);
                                                            } else {
                                                                ov0Var12.p0();
                                                            }
                                                            gh ghVar5 = v20.e;
                                                            q73.h(ov0Var12, ghVar5, kk2VarA4);
                                                            gh ghVar6 = v20.d;
                                                            q73.h(ov0Var12, ghVar6, l72VarL7);
                                                            Integer numValueOf2 = Integer.valueOf(iHashCode8);
                                                            gh ghVar7 = v20.f;
                                                            q73.h(ov0Var12, ghVar7, numValueOf2);
                                                            wa waVar2 = v20.g;
                                                            q73.g(ov0Var12, waVar2);
                                                            gh ghVar8 = v20.c;
                                                            q73.h(ov0Var12, ghVar8, dv1VarH10);
                                                            wb1 wb1Var = new wb1(1.0f, true);
                                                            yz yzVarA5 = wz.a(am1.g, j9.r, ov0Var12, 0);
                                                            int iHashCode9 = Long.hashCode(ov0Var12.T);
                                                            l72 l72VarL8 = ov0Var12.l();
                                                            dv1 dv1VarH11 = xp1.H(ov0Var12, wb1Var);
                                                            ov0Var12.g0();
                                                            if (ov0Var12.S) {
                                                                ov0Var12.k(x30Var3);
                                                            } else {
                                                                ov0Var12.p0();
                                                            }
                                                            q73.h(ov0Var12, ghVar5, yzVarA5);
                                                            q73.h(ov0Var12, ghVar6, l72VarL8);
                                                            az2.s(iHashCode9, ov0Var12, ghVar7, ov0Var12, waVar2);
                                                            q73.h(ov0Var12, ghVar8, dv1VarH11);
                                                            String strN6 = ke0.N(2131625058, ov0Var12);
                                                            long jC6 = v63.c(14);
                                                            jr0 jr0Var2 = jr0.j;
                                                            hh0 hh0Var3 = mz.a;
                                                            s83.b(strN6, null, ((kz) ov0Var12.j(hh0Var3)).q, jC6, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 1597440, 0, 262058);
                                                            if (appState7.getStopAtDestination()) {
                                                                i11 = -1770330906;
                                                                i12 = 2131625057;
                                                            } else {
                                                                i11 = -1770329049;
                                                                i12 = 2131625056;
                                                            }
                                                            s83.b(az2.h(ov0Var12, i11, i12, ov0Var12, false), null, hz.c(0.55f, ((kz) ov0Var12.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 24576, 0, 262122);
                                                            ov0Var12.p(true);
                                                            b43.a(appState7.getStopAtDestination(), lu0Var35, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var12, 65532), ov0Var12, 0, 92);
                                                            ov0Var12.p(true);
                                                        }
                                                        break;
                                                    default:
                                                        f30 f30Var5 = (f30) obj6;
                                                        int iIntValue4 = ((Integer) obj7).intValue();
                                                        ov0 ov0Var13 = (ov0) f30Var5;
                                                        if (!ov0Var13.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                            ov0Var13.W();
                                                        } else {
                                                            dv1 dv1VarE7 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                            kk2 kk2VarA5 = jk2.a(am1.i, j9.p, ov0Var13, 54);
                                                            int iHashCode10 = Long.hashCode(ov0Var13.T);
                                                            l72 l72VarL9 = ov0Var13.l();
                                                            dv1 dv1VarH12 = xp1.H(ov0Var13, dv1VarE7);
                                                            w20.b.getClass();
                                                            x30 x30Var4 = v20.b;
                                                            ov0Var13.g0();
                                                            if (ov0Var13.S) {
                                                                ov0Var13.k(x30Var4);
                                                            } else {
                                                                ov0Var13.p0();
                                                            }
                                                            gh ghVar9 = v20.e;
                                                            q73.h(ov0Var13, ghVar9, kk2VarA5);
                                                            gh ghVar10 = v20.d;
                                                            q73.h(ov0Var13, ghVar10, l72VarL9);
                                                            Integer numValueOf3 = Integer.valueOf(iHashCode10);
                                                            gh ghVar11 = v20.f;
                                                            q73.h(ov0Var13, ghVar11, numValueOf3);
                                                            wa waVar3 = v20.g;
                                                            q73.g(ov0Var13, waVar3);
                                                            gh ghVar12 = v20.c;
                                                            q73.h(ov0Var13, ghVar12, dv1VarH12);
                                                            wb1 wb1Var2 = new wb1(1.0f, true);
                                                            yz yzVarA6 = wz.a(am1.g, j9.r, ov0Var13, 0);
                                                            int iHashCode11 = Long.hashCode(ov0Var13.T);
                                                            l72 l72VarL10 = ov0Var13.l();
                                                            dv1 dv1VarH13 = xp1.H(ov0Var13, wb1Var2);
                                                            ov0Var13.g0();
                                                            if (ov0Var13.S) {
                                                                ov0Var13.k(x30Var4);
                                                            } else {
                                                                ov0Var13.p0();
                                                            }
                                                            q73.h(ov0Var13, ghVar9, yzVarA6);
                                                            q73.h(ov0Var13, ghVar10, l72VarL10);
                                                            az2.s(iHashCode11, ov0Var13, ghVar11, ov0Var13, waVar3);
                                                            q73.h(ov0Var13, ghVar12, dv1VarH13);
                                                            String strN7 = ke0.N(2131624840, ov0Var13);
                                                            long jC7 = v63.c(14);
                                                            jr0 jr0Var3 = jr0.j;
                                                            hh0 hh0Var4 = mz.a;
                                                            s83.b(strN7, null, ((kz) ov0Var13.j(hh0Var4)).q, jC7, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 1597440, 0, 262058);
                                                            s83.b(ke0.N(2131624986, ov0Var13), null, hz.c(0.55f, ((kz) ov0Var13.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 24576, 0, 262122);
                                                            ov0Var13.p(true);
                                                            b43.a(appState7.getUseRealRoute(), lu0Var35, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var13, 65532), ov0Var13, 0, 92);
                                                            ov0Var13.p(true);
                                                        }
                                                        break;
                                                }
                                                return mf3Var;
                                            }
                                        }, ov0Var11), ov0Var11, 12582918, 120);
                                        ov0Var5 = ov0Var11;
                                        if (appState3.getUseRealRoute()) {
                                            ov0Var5.c0(-1483184363);
                                            s83.b(ke0.N(2131624915, ov0Var5), null, ((kz) ov0Var5.j(hh0Var)).q, v63.c(13), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                                            dv1 dv1VarE6 = iw2.e(av1Var, 1.0f);
                                            kk2 kk2VarA4 = jk2.a(new jo(8.0f, true, new fo(0)), orVar2, ov0Var5, 6);
                                            int iHashCode8 = Long.hashCode(ks.U(ov0Var5));
                                            l72 l72VarZ2 = ov0Var5.z();
                                            dv1 dv1VarH10 = xp1.H(ov0Var5, dv1VarE6);
                                            w20.b.getClass();
                                            x30Var = v20.b;
                                            ov0Var5.g0();
                                            if (ov0Var5.D()) {
                                                ov0Var5 = ov0Var5;
                                                ov0Var5.k(x30Var);
                                            } else {
                                                ov0Var5 = ov0Var5;
                                                ov0Var5.p0();
                                            }
                                            q73.h(ov0Var5, v20.e, kk2VarA4);
                                            q73.h(ov0Var5, v20.d, l72VarZ2);
                                            q73.h(ov0Var5, v20.f, Integer.valueOf(iHashCode8));
                                            q73.g(ov0Var5, v20.g);
                                            q73.h(ov0Var5, v20.c, dv1VarH10);
                                            ov0Var5.c0(1682509979);
                                            for (RouteTravelMode routeTravelMode : RouteTravelMode.getEntries()) {
                                                if (appState3.getRouteTravelMode() == routeTravelMode) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                j = bk.g;
                                                jC = hz.c(0.15f, j);
                                                j2 = hz.g;
                                                np2VarG = mh0.G((kz) ov0Var5.j(mz.a));
                                                if (j2 != 16) {
                                                    j3 = j2;
                                                } else {
                                                    j3 = np2VarG.a;
                                                }
                                                if (j2 != 16) {
                                                    j4 = j2;
                                                } else {
                                                    j4 = np2VarG.b;
                                                }
                                                if (j2 != 16) {
                                                    j5 = j2;
                                                } else {
                                                    j5 = np2VarG.c;
                                                }
                                                if (j2 != 16) {
                                                    j6 = j2;
                                                } else {
                                                    j6 = np2VarG.d;
                                                }
                                                if (j2 != 16) {
                                                    j7 = j2;
                                                } else {
                                                    j7 = np2VarG.e;
                                                }
                                                if (j2 != 16) {
                                                    j8 = j2;
                                                } else {
                                                    j8 = np2VarG.f;
                                                }
                                                if (j2 != 16) {
                                                    j9 = j2;
                                                } else {
                                                    j9 = np2VarG.g;
                                                }
                                                if (j2 != 16) {
                                                    j10 = j2;
                                                } else {
                                                    j10 = np2VarG.h;
                                                }
                                                if (jC == 16) {
                                                    jC = np2VarG.i;
                                                }
                                                long j14 = jC;
                                                if (j2 != 16) {
                                                    j11 = j2;
                                                } else {
                                                    j11 = np2VarG.j;
                                                }
                                                if (j == 16) {
                                                    j = np2VarG.k;
                                                }
                                                long j15 = j;
                                                if (j2 != 16) {
                                                    j12 = j2;
                                                } else {
                                                    j12 = np2VarG.l;
                                                }
                                                if (j2 != 16) {
                                                    j13 = j2;
                                                } else {
                                                    j13 = np2VarG.m;
                                                }
                                                np2 np2Var = new np2(j3, j4, j5, j6, j7, j8, j9, j10, j14, j11, j15, j12, j13);
                                                wb1 wb1Var = new wb1(1.0f, true);
                                                lu0Var31 = lu0Var30;
                                                zF5 = ov0Var5.f(lu0Var31) | ov0Var5.d(routeTravelMode.ordinal());
                                                objQ5 = ov0Var5.Q();
                                                if (zF5 || objQ5 == c30Var6) {
                                                    objQ5 = new qi2(3, lu0Var31, routeTravelMode);
                                                    ov0Var5.m0(objQ5);
                                                }
                                                ov0 ov0Var12 = ov0Var5;
                                                ix.b(z, (au0) objQ5, sb.a0(-363746935, new s5(routeTravelMode, 22), ov0Var5), wb1Var, false, null, np2Var, null, null, ov0Var12, 384, 3824);
                                                ov0Var5 = ov0Var12;
                                                appState3 = appState3;
                                            }
                                            appState4 = appState3;
                                            ov0Var5.s();
                                            ov0Var5.r();
                                        } else {
                                            appState4 = appState3;
                                            ov0Var5.c0(-1514167592);
                                        }
                                        ov0Var5.s();
                                        wc0.l(ke0.N(2131624901, ov0Var5), appState4.getRouteLateralDeviation(), lu0Var20, ke0.N(2131624902, ov0Var5), ov0Var5, 0, 0);
                                        p10Var2.invoke(ov0Var5, 0);
                                        ov0Var6 = ov0Var5;
                                        s83.b(ke0.N(2131624440, ov0Var5), null, hz.c(0.6f, ((kz) ov0Var5.j(mz.a)).q), v63.c(13), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                                        if (appState4.getCanMockWifi()) {
                                            ov0Var6.c0(-1481336019);
                                            String strN6 = ke0.N(2131624442, ov0Var6);
                                            appState5 = appState4;
                                            String strG = r93.g(appState5, ov0Var6);
                                            boolean mockWifi = appState5.getMockWifi();
                                            au0Var18 = au0Var10;
                                            zF4 = ov0Var6.f(au0Var18);
                                            objQ4 = ov0Var6.Q();
                                            if (zF4 || objQ4 == c30Var6) {
                                                objQ4 = new m4(8, au0Var18);
                                                ov0Var6.m0(objQ4);
                                            }
                                            wc0.l(strN6, mockWifi, (lu0) objQ4, strG, ov0Var6, 0, 0);
                                        } else {
                                            appState5 = appState4;
                                            ov0Var6.c0(-1514167592);
                                        }
                                        ov0Var6.s();
                                        if (appState5.getCanMockCell()) {
                                            ov0Var6.c0(2030435916);
                                            String strN7 = ke0.N(2131624772, ov0Var6);
                                            boolean mockCell = appState5.getMockCell();
                                            au0Var17 = au0Var11;
                                            zF3 = ov0Var6.f(au0Var17);
                                            objQ3 = ov0Var6.Q();
                                            if (zF3 || objQ3 == c30Var6) {
                                                objQ3 = new m4(9, au0Var17);
                                                ov0Var6.m0(objQ3);
                                            }
                                            wc0.l(strN7, mockCell, (lu0) objQ3, null, ov0Var6, 0, 8);
                                        } else {
                                            ov0Var6.c0(-1514167592);
                                        }
                                        ov0Var6.s();
                                        if (appState5.getCanMockBluetooth()) {
                                            ov0Var6.c0(2030444795);
                                            String strN8 = ke0.N(2131624771, ov0Var6);
                                            boolean mockBluetooth = appState5.getMockBluetooth();
                                            au0Var16 = au0Var12;
                                            zF2 = ov0Var6.f(au0Var16);
                                            objQ2 = ov0Var6.Q();
                                            if (zF2 || objQ2 == c30Var6) {
                                                objQ2 = new m4(10, au0Var16);
                                                ov0Var6.m0(objQ2);
                                            }
                                            wc0.l(strN8, mockBluetooth, (lu0) objQ2, null, ov0Var6, 0, 8);
                                        } else {
                                            ov0Var6.c0(-1514167592);
                                        }
                                        ov0Var6.s();
                                        String strN9 = ke0.N(2131624409, ov0Var6);
                                        String strN10 = ke0.N(2131624410, ov0Var6);
                                        boolean enableJitter = appState5.getEnableJitter();
                                        au0Var15 = au0Var13;
                                        zF = ov0Var6.f(au0Var15);
                                        objQ = ov0Var6.Q();
                                        if (zF || objQ == c30Var6) {
                                            objQ = new m4(11, au0Var15);
                                            ov0Var6.m0(objQ);
                                        }
                                        wc0.l(strN9, enableJitter, (lu0) objQ, strN10, ov0Var6, 0, 0);
                                        String satelliteCountInput = appState5.getSatelliteCountInput();
                                        dv1 dv1VarE7 = iw2.e(av1Var, 1.0f);
                                        n91 n91Var = new n91(3, 0, 123);
                                        long j16 = bk.g;
                                        ee0.i(satelliteCountInput, lu0Var21, dv1VarE7, false, null, ks.F, null, null, null, null, false, null, n91Var, null, true, 0, 0, null, j9.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, j16, 0L, 0L, j16, 0L, ov0Var6, 2139092991), ov0Var6, 1573248, 12779520, 4030392);
                                        ov0Var6.r();
                                        n51.a(au0Var9, iw2.g(iw2.e(av1Var, 1.0f), 48.0f), false, cj2.a(c2), hu.a(j16, 0L, 0L, 0L, ov0Var6, 14), null, null, null, ks.G, ov0Var6, 805306416, 484);
                                        ov0Var6.r();
                                    }
                                    objQ9 = new hl1(12, lu0Var32);
                                    ov0Var7.m0(objQ9);
                                    c30 c30Var7 = c30Var;
                                    wc0.m(strN4, strN5, x01VarB2, z5, (au0) objQ9, lk2.a(lk2Var, av1Var2, 1.0f), ov0Var7, 0);
                                    ov0Var7.r();
                                    ov0Var7.r();
                                    yz yzVarA5 = wz.a(am1.V(8.0f), nrVar, ov0Var7, 6);
                                    int iHashCode9 = Long.hashCode(ks.U(ov0Var7));
                                    l72 l72VarL7 = ov0Var7.l();
                                    dv1 dv1VarH11 = xp1.H(ov0Var7, av1Var2);
                                    ov0Var7.g0();
                                    if (ov0Var7.D()) {
                                        ov0Var7.k(x30Var2);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar, yzVarA5);
                                    q73.h(ov0Var7, ghVar2, l72VarL7);
                                    az2.s(iHashCode9, ov0Var7, ghVar3, ov0Var7, waVar);
                                    q73.h(ov0Var7, ghVar4, dv1VarH11);
                                    c30Var2 = c30Var7;
                                    s83.b(ke0.N(2131624357, ov0Var7), null, hz.c(0.6f, ((kz) ov0Var7.j(hh0Var2)).q), v63.c(13), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262058);
                                    ov0Var4 = ov0Var7;
                                    dv1 dv1VarE8 = iw2.e(av1Var2, 1.0f);
                                    orVar = orVar3;
                                    kk2 kk2VarA5 = jk2.a(am1.V(6.0f), orVar, ov0Var4, 6);
                                    int iHashCode10 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ3 = ov0Var4.z();
                                    dv1 dv1VarH12 = xp1.H(ov0Var4, dv1VarE8);
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, kk2VarA5);
                                    q73.h(ov0Var4, ghVar2, l72VarZ3);
                                    az2.s(iHashCode10, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH12);
                                    ov0Var4.c0(1764195148);
                                    it = am1.G(new md3(SimMode.WALKING, ke0.N(2131625163, ov0Var4), "1.4m/s"), new md3(SimMode.RUNNING, ke0.N(2131624917, ov0Var4), "3.0m/s"), new md3(SimMode.CYCLING, ke0.N(2131624371, ov0Var4), "5.5m/s"), new md3(SimMode.DRIVING, ke0.N(2131624400, ov0Var4), "15m/s"), new md3(SimMode.CUSTOM, ke0.N(2131624364, ov0Var4), String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(appState6.getCustomSpeedMs())}, 1)).concat("m/s"))).iterator();
                                    while (it.hasNext()) {
                                        md3 md3Var2 = (md3) it.next();
                                        simMode = (SimMode) md3Var2.e;
                                        String str4 = (String) md3Var2.f;
                                        String str5 = (String) md3Var2.g;
                                        if (appState6.getRouteSimMode() == simMode) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        bj2 bj2VarA6 = cj2.a(14.0f);
                                        if (z3) {
                                            ov0Var4.c0(1798370543);
                                            ov0Var4.s();
                                            jC2 = hz.c(0.12f, bk.g);
                                        } else {
                                            ov0Var4.c0(1798372733);
                                            jC2 = hz.c(0.35f, ((kz) ov0Var4.j(mz.a)).r);
                                            ov0Var4.s();
                                        }
                                        if (z3) {
                                            isVarH = da0.h(1.5f, bk.g);
                                        } else {
                                            isVarH = null;
                                        }
                                        dv1 dv1VarA2 = lk2.a(lk2Var, av1Var2, 1.0f);
                                        lu0 lu0Var36 = lu0Var23;
                                        zF6 = ov0Var4.f(lu0Var36) | ov0Var4.d(simMode.ordinal());
                                        Iterator it3 = it;
                                        objQ7 = ov0Var4.Q();
                                        if (zF6) {
                                            c30Var3 = c30Var2;
                                            if (objQ7 == c30Var3) {
                                            }
                                            ov0 ov0Var13 = ov0Var4;
                                            e33.a(zm3.m(dv1VarA2, false, null, (au0) objQ7, 15), bj2VarA6, jC2, 0L, 0.0f, 0.0f, isVarH, sb.a0(675891383, new o2(6, str5, str4, z3), ov0Var4), ov0Var13, 12582912, 56);
                                            orVar = orVar;
                                            c30Var2 = c30Var3;
                                            ov0Var4 = ov0Var13;
                                            it = it3;
                                            av1Var2 = av1Var2;
                                        } else {
                                            c30Var3 = c30Var2;
                                        }
                                        objQ7 = new qi2(4, lu0Var36, simMode);
                                        ov0Var4.m0(objQ7);
                                        ov0 ov0Var14 = ov0Var4;
                                        e33.a(zm3.m(dv1VarA2, false, null, (au0) objQ7, 15), bj2VarA6, jC2, 0L, 0.0f, 0.0f, isVarH, sb.a0(675891383, new o2(6, str5, str4, z3), ov0Var4), ov0Var14, 12582912, 56);
                                        orVar = orVar;
                                        c30Var2 = c30Var3;
                                        ov0Var4 = ov0Var14;
                                        it = it3;
                                        av1Var2 = av1Var2;
                                    }
                                    av1Var = av1Var2;
                                    orVar2 = orVar;
                                    c30 c30Var8 = c30Var2;
                                    ov0Var4.s();
                                    ov0Var4.r();
                                    i4 = 9;
                                    if (appState6.getRouteSimMode() == SimMode.CUSTOM) {
                                        ov0Var4.c0(-1135669909);
                                        customSpeedMs = appState6.getCustomSpeedMs();
                                        objI = ov0Var4.I();
                                        if (objI instanceof Double) {
                                            ov0Var4.n0(Double.valueOf(customSpeedMs));
                                            z2 = true;
                                        } else {
                                            ov0Var4.n0(Double.valueOf(customSpeedMs));
                                            z2 = true;
                                        }
                                        objQ6 = ov0Var4.Q();
                                        if (z2) {
                                            objQ6 = new s52((float) appState6.getCustomSpeedMs());
                                            ov0Var4.m0(objQ6);
                                        } else {
                                            objQ6 = new s52((float) appState6.getCustomSpeedMs());
                                            ov0Var4.m0(objQ6);
                                        }
                                        s52Var = (s52) objQ6;
                                        if (s52Var.g() > 0.2f) {
                                            iG = (int) (1000.0d / ((double) s52Var.g()));
                                        } else {
                                            iG = 0;
                                        }
                                        int i11 = iG / 60;
                                        int i12 = iG % 60;
                                        if (60 <= iG) {
                                            str = "--";
                                        } else {
                                            str = "--";
                                        }
                                        ov0 ov0Var15 = ov0Var4;
                                        e33.a(iw2.e(av1Var, 1.0f), cj2.a(14.0f), hz.c(0.35f, ((kz) ov0Var4.j(mz.a)).r), 0L, 0.0f, 0.0f, null, sb.a0(-298435001, new f5(s52Var, lu0Var24, str, i4), ov0Var4), ov0Var15, 12582918, 120);
                                        ov0Var4 = ov0Var15;
                                    } else {
                                        ov0Var4.c0(-1146183931);
                                    }
                                    ov0Var4.s();
                                    ov0Var4.r();
                                    bj2 bj2VarA7 = cj2.a(c2);
                                    hh0Var = mz.a;
                                    appState3 = appState6;
                                    ov0 ov0Var16 = ov0Var4;
                                    e33.a(iw2.e(av1Var, 1.0f), bj2VarA7, hz.c(0.35f, ((kz) ov0Var4.j(hh0Var)).r), 0L, 0.0f, 0.0f, null, sb.a0(-911872369, new lr1(appState6, lu0Var25, lu0Var26, lu0Var27, 7), ov0Var4), ov0Var16, 12582918, 120);
                                    bj2 bj2VarA8 = cj2.a(c2);
                                    long jC6 = hz.c(0.35f, ((kz) ov0Var16.j(hh0Var)).r);
                                    dv1 dv1VarE9 = iw2.e(av1Var, 1.0f);
                                    final lu0 lu0Var37 = lu0Var28;
                                    final int i13 = 0;
                                    e33.a(dv1VarE9, bj2VarA8, jC6, 0L, 0.0f, 0.0f, null, sb.a0(-1594656648, new pu0() { // from class: ij2
                                        @Override // defpackage.pu0
                                        public final Object invoke(Object obj6, Object obj7) {
                                            int i14;
                                            int i15;
                                            int i16 = i13;
                                            mf3 mf3Var = mf3.a;
                                            av1 av1Var3 = av1.a;
                                            AppState appState7 = appState3;
                                            switch (i16) {
                                                case 0:
                                                    f30 f30Var4 = (f30) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ov0 ov0Var17 = (ov0) f30Var4;
                                                    if (!ov0Var17.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        ov0Var17.W();
                                                    } else {
                                                        dv1 dv1VarE10 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                        kk2 kk2VarA6 = jk2.a(am1.i, j9.p, ov0Var17, 54);
                                                        int iHashCode11 = Long.hashCode(ov0Var17.T);
                                                        l72 l72VarL8 = ov0Var17.l();
                                                        dv1 dv1VarH13 = xp1.H(ov0Var17, dv1VarE10);
                                                        w20.b.getClass();
                                                        x30 x30Var3 = v20.b;
                                                        ov0Var17.g0();
                                                        if (ov0Var17.S) {
                                                            ov0Var17.k(x30Var3);
                                                        } else {
                                                            ov0Var17.p0();
                                                        }
                                                        gh ghVar5 = v20.e;
                                                        q73.h(ov0Var17, ghVar5, kk2VarA6);
                                                        gh ghVar6 = v20.d;
                                                        q73.h(ov0Var17, ghVar6, l72VarL8);
                                                        Integer numValueOf2 = Integer.valueOf(iHashCode11);
                                                        gh ghVar7 = v20.f;
                                                        q73.h(ov0Var17, ghVar7, numValueOf2);
                                                        wa waVar2 = v20.g;
                                                        q73.g(ov0Var17, waVar2);
                                                        gh ghVar8 = v20.c;
                                                        q73.h(ov0Var17, ghVar8, dv1VarH13);
                                                        wb1 wb1Var2 = new wb1(1.0f, true);
                                                        yz yzVarA6 = wz.a(am1.g, j9.r, ov0Var17, 0);
                                                        int iHashCode12 = Long.hashCode(ov0Var17.T);
                                                        l72 l72VarL9 = ov0Var17.l();
                                                        dv1 dv1VarH14 = xp1.H(ov0Var17, wb1Var2);
                                                        ov0Var17.g0();
                                                        if (ov0Var17.S) {
                                                            ov0Var17.k(x30Var3);
                                                        } else {
                                                            ov0Var17.p0();
                                                        }
                                                        q73.h(ov0Var17, ghVar5, yzVarA6);
                                                        q73.h(ov0Var17, ghVar6, l72VarL9);
                                                        az2.s(iHashCode12, ov0Var17, ghVar7, ov0Var17, waVar2);
                                                        q73.h(ov0Var17, ghVar8, dv1VarH14);
                                                        String strN11 = ke0.N(2131625058, ov0Var17);
                                                        long jC7 = v63.c(14);
                                                        jr0 jr0Var2 = jr0.j;
                                                        hh0 hh0Var3 = mz.a;
                                                        s83.b(strN11, null, ((kz) ov0Var17.j(hh0Var3)).q, jC7, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 1597440, 0, 262058);
                                                        if (appState7.getStopAtDestination()) {
                                                            i14 = -1770330906;
                                                            i15 = 2131625057;
                                                        } else {
                                                            i14 = -1770329049;
                                                            i15 = 2131625056;
                                                        }
                                                        s83.b(az2.h(ov0Var17, i14, i15, ov0Var17, false), null, hz.c(0.55f, ((kz) ov0Var17.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 24576, 0, 262122);
                                                        ov0Var17.p(true);
                                                        b43.a(appState7.getStopAtDestination(), lu0Var37, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var17, 65532), ov0Var17, 0, 92);
                                                        ov0Var17.p(true);
                                                    }
                                                    break;
                                                default:
                                                    f30 f30Var5 = (f30) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ov0 ov0Var18 = (ov0) f30Var5;
                                                    if (!ov0Var18.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                        ov0Var18.W();
                                                    } else {
                                                        dv1 dv1VarE11 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                        kk2 kk2VarA7 = jk2.a(am1.i, j9.p, ov0Var18, 54);
                                                        int iHashCode13 = Long.hashCode(ov0Var18.T);
                                                        l72 l72VarL10 = ov0Var18.l();
                                                        dv1 dv1VarH15 = xp1.H(ov0Var18, dv1VarE11);
                                                        w20.b.getClass();
                                                        x30 x30Var4 = v20.b;
                                                        ov0Var18.g0();
                                                        if (ov0Var18.S) {
                                                            ov0Var18.k(x30Var4);
                                                        } else {
                                                            ov0Var18.p0();
                                                        }
                                                        gh ghVar9 = v20.e;
                                                        q73.h(ov0Var18, ghVar9, kk2VarA7);
                                                        gh ghVar10 = v20.d;
                                                        q73.h(ov0Var18, ghVar10, l72VarL10);
                                                        Integer numValueOf3 = Integer.valueOf(iHashCode13);
                                                        gh ghVar11 = v20.f;
                                                        q73.h(ov0Var18, ghVar11, numValueOf3);
                                                        wa waVar3 = v20.g;
                                                        q73.g(ov0Var18, waVar3);
                                                        gh ghVar12 = v20.c;
                                                        q73.h(ov0Var18, ghVar12, dv1VarH15);
                                                        wb1 wb1Var3 = new wb1(1.0f, true);
                                                        yz yzVarA7 = wz.a(am1.g, j9.r, ov0Var18, 0);
                                                        int iHashCode14 = Long.hashCode(ov0Var18.T);
                                                        l72 l72VarL11 = ov0Var18.l();
                                                        dv1 dv1VarH16 = xp1.H(ov0Var18, wb1Var3);
                                                        ov0Var18.g0();
                                                        if (ov0Var18.S) {
                                                            ov0Var18.k(x30Var4);
                                                        } else {
                                                            ov0Var18.p0();
                                                        }
                                                        q73.h(ov0Var18, ghVar9, yzVarA7);
                                                        q73.h(ov0Var18, ghVar10, l72VarL11);
                                                        az2.s(iHashCode14, ov0Var18, ghVar11, ov0Var18, waVar3);
                                                        q73.h(ov0Var18, ghVar12, dv1VarH16);
                                                        String strN12 = ke0.N(2131624840, ov0Var18);
                                                        long jC8 = v63.c(14);
                                                        jr0 jr0Var3 = jr0.j;
                                                        hh0 hh0Var4 = mz.a;
                                                        s83.b(strN12, null, ((kz) ov0Var18.j(hh0Var4)).q, jC8, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 1597440, 0, 262058);
                                                        s83.b(ke0.N(2131624986, ov0Var18), null, hz.c(0.55f, ((kz) ov0Var18.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 24576, 0, 262122);
                                                        ov0Var18.p(true);
                                                        b43.a(appState7.getUseRealRoute(), lu0Var37, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var18, 65532), ov0Var18, 0, 92);
                                                        ov0Var18.p(true);
                                                    }
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    }, ov0Var16), ov0Var16, 12582918, 120);
                                    xp1.a(appState3.getAltitudeInput(), appState3.getAltitudeVariationM(), lu0Var18, lu0Var19, null, ov0Var16, 0);
                                    bj2 bj2VarA9 = cj2.a(c2);
                                    long jC7 = hz.c(0.35f, ((kz) ov0Var16.j(hh0Var)).r);
                                    dv1 dv1VarE10 = iw2.e(av1Var, 1.0f);
                                    final lu0 lu0Var38 = lu0Var29;
                                    final int i14 = 1;
                                    e33.a(dv1VarE10, bj2VarA9, jC7, 0L, 0.0f, 0.0f, null, sb.a0(1149341399, new pu0() { // from class: ij2
                                        @Override // defpackage.pu0
                                        public final Object invoke(Object obj6, Object obj7) {
                                            int i15;
                                            int i16;
                                            int i17 = i14;
                                            mf3 mf3Var = mf3.a;
                                            av1 av1Var3 = av1.a;
                                            AppState appState7 = appState3;
                                            switch (i17) {
                                                case 0:
                                                    f30 f30Var4 = (f30) obj6;
                                                    int iIntValue3 = ((Integer) obj7).intValue();
                                                    ov0 ov0Var17 = (ov0) f30Var4;
                                                    if (!ov0Var17.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        ov0Var17.W();
                                                    } else {
                                                        dv1 dv1VarE11 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                        kk2 kk2VarA6 = jk2.a(am1.i, j9.p, ov0Var17, 54);
                                                        int iHashCode11 = Long.hashCode(ov0Var17.T);
                                                        l72 l72VarL8 = ov0Var17.l();
                                                        dv1 dv1VarH13 = xp1.H(ov0Var17, dv1VarE11);
                                                        w20.b.getClass();
                                                        x30 x30Var3 = v20.b;
                                                        ov0Var17.g0();
                                                        if (ov0Var17.S) {
                                                            ov0Var17.k(x30Var3);
                                                        } else {
                                                            ov0Var17.p0();
                                                        }
                                                        gh ghVar5 = v20.e;
                                                        q73.h(ov0Var17, ghVar5, kk2VarA6);
                                                        gh ghVar6 = v20.d;
                                                        q73.h(ov0Var17, ghVar6, l72VarL8);
                                                        Integer numValueOf2 = Integer.valueOf(iHashCode11);
                                                        gh ghVar7 = v20.f;
                                                        q73.h(ov0Var17, ghVar7, numValueOf2);
                                                        wa waVar2 = v20.g;
                                                        q73.g(ov0Var17, waVar2);
                                                        gh ghVar8 = v20.c;
                                                        q73.h(ov0Var17, ghVar8, dv1VarH13);
                                                        wb1 wb1Var2 = new wb1(1.0f, true);
                                                        yz yzVarA6 = wz.a(am1.g, j9.r, ov0Var17, 0);
                                                        int iHashCode12 = Long.hashCode(ov0Var17.T);
                                                        l72 l72VarL9 = ov0Var17.l();
                                                        dv1 dv1VarH14 = xp1.H(ov0Var17, wb1Var2);
                                                        ov0Var17.g0();
                                                        if (ov0Var17.S) {
                                                            ov0Var17.k(x30Var3);
                                                        } else {
                                                            ov0Var17.p0();
                                                        }
                                                        q73.h(ov0Var17, ghVar5, yzVarA6);
                                                        q73.h(ov0Var17, ghVar6, l72VarL9);
                                                        az2.s(iHashCode12, ov0Var17, ghVar7, ov0Var17, waVar2);
                                                        q73.h(ov0Var17, ghVar8, dv1VarH14);
                                                        String strN11 = ke0.N(2131625058, ov0Var17);
                                                        long jC8 = v63.c(14);
                                                        jr0 jr0Var2 = jr0.j;
                                                        hh0 hh0Var3 = mz.a;
                                                        s83.b(strN11, null, ((kz) ov0Var17.j(hh0Var3)).q, jC8, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 1597440, 0, 262058);
                                                        if (appState7.getStopAtDestination()) {
                                                            i15 = -1770330906;
                                                            i16 = 2131625057;
                                                        } else {
                                                            i15 = -1770329049;
                                                            i16 = 2131625056;
                                                        }
                                                        s83.b(az2.h(ov0Var17, i15, i16, ov0Var17, false), null, hz.c(0.55f, ((kz) ov0Var17.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 24576, 0, 262122);
                                                        ov0Var17.p(true);
                                                        b43.a(appState7.getStopAtDestination(), lu0Var38, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var17, 65532), ov0Var17, 0, 92);
                                                        ov0Var17.p(true);
                                                    }
                                                    break;
                                                default:
                                                    f30 f30Var5 = (f30) obj6;
                                                    int iIntValue4 = ((Integer) obj7).intValue();
                                                    ov0 ov0Var18 = (ov0) f30Var5;
                                                    if (!ov0Var18.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                        ov0Var18.W();
                                                    } else {
                                                        dv1 dv1VarE12 = zm3.E(iw2.e(av1Var3, 1.0f), 14.0f, 10.0f);
                                                        kk2 kk2VarA7 = jk2.a(am1.i, j9.p, ov0Var18, 54);
                                                        int iHashCode13 = Long.hashCode(ov0Var18.T);
                                                        l72 l72VarL10 = ov0Var18.l();
                                                        dv1 dv1VarH15 = xp1.H(ov0Var18, dv1VarE12);
                                                        w20.b.getClass();
                                                        x30 x30Var4 = v20.b;
                                                        ov0Var18.g0();
                                                        if (ov0Var18.S) {
                                                            ov0Var18.k(x30Var4);
                                                        } else {
                                                            ov0Var18.p0();
                                                        }
                                                        gh ghVar9 = v20.e;
                                                        q73.h(ov0Var18, ghVar9, kk2VarA7);
                                                        gh ghVar10 = v20.d;
                                                        q73.h(ov0Var18, ghVar10, l72VarL10);
                                                        Integer numValueOf3 = Integer.valueOf(iHashCode13);
                                                        gh ghVar11 = v20.f;
                                                        q73.h(ov0Var18, ghVar11, numValueOf3);
                                                        wa waVar3 = v20.g;
                                                        q73.g(ov0Var18, waVar3);
                                                        gh ghVar12 = v20.c;
                                                        q73.h(ov0Var18, ghVar12, dv1VarH15);
                                                        wb1 wb1Var3 = new wb1(1.0f, true);
                                                        yz yzVarA7 = wz.a(am1.g, j9.r, ov0Var18, 0);
                                                        int iHashCode14 = Long.hashCode(ov0Var18.T);
                                                        l72 l72VarL11 = ov0Var18.l();
                                                        dv1 dv1VarH16 = xp1.H(ov0Var18, wb1Var3);
                                                        ov0Var18.g0();
                                                        if (ov0Var18.S) {
                                                            ov0Var18.k(x30Var4);
                                                        } else {
                                                            ov0Var18.p0();
                                                        }
                                                        q73.h(ov0Var18, ghVar9, yzVarA7);
                                                        q73.h(ov0Var18, ghVar10, l72VarL11);
                                                        az2.s(iHashCode14, ov0Var18, ghVar11, ov0Var18, waVar3);
                                                        q73.h(ov0Var18, ghVar12, dv1VarH16);
                                                        String strN12 = ke0.N(2131624840, ov0Var18);
                                                        long jC9 = v63.c(14);
                                                        jr0 jr0Var3 = jr0.j;
                                                        hh0 hh0Var4 = mz.a;
                                                        s83.b(strN12, null, ((kz) ov0Var18.j(hh0Var4)).q, jC9, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 1597440, 0, 262058);
                                                        s83.b(ke0.N(2131624986, ov0Var18), null, hz.c(0.55f, ((kz) ov0Var18.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 24576, 0, 262122);
                                                        ov0Var18.p(true);
                                                        b43.a(appState7.getUseRealRoute(), lu0Var38, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var18, 65532), ov0Var18, 0, 92);
                                                        ov0Var18.p(true);
                                                    }
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    }, ov0Var16), ov0Var16, 12582918, 120);
                                    ov0Var5 = ov0Var16;
                                    if (appState3.getUseRealRoute()) {
                                        ov0Var5.c0(-1483184363);
                                        s83.b(ke0.N(2131624915, ov0Var5), null, ((kz) ov0Var5.j(hh0Var)).q, v63.c(13), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                                        dv1 dv1VarE11 = iw2.e(av1Var, 1.0f);
                                        kk2 kk2VarA6 = jk2.a(new jo(8.0f, true, new fo(0)), orVar2, ov0Var5, 6);
                                        int iHashCode11 = Long.hashCode(ks.U(ov0Var5));
                                        l72 l72VarZ4 = ov0Var5.z();
                                        dv1 dv1VarH13 = xp1.H(ov0Var5, dv1VarE11);
                                        w20.b.getClass();
                                        x30Var = v20.b;
                                        ov0Var5.g0();
                                        if (ov0Var5.D()) {
                                            ov0Var5 = ov0Var5;
                                            ov0Var5.k(x30Var);
                                        } else {
                                            ov0Var5 = ov0Var5;
                                            ov0Var5.p0();
                                        }
                                        q73.h(ov0Var5, v20.e, kk2VarA6);
                                        q73.h(ov0Var5, v20.d, l72VarZ4);
                                        q73.h(ov0Var5, v20.f, Integer.valueOf(iHashCode11));
                                        q73.g(ov0Var5, v20.g);
                                        q73.h(ov0Var5, v20.c, dv1VarH13);
                                        ov0Var5.c0(1682509979);
                                        while (r1.hasNext()) {
                                            if (appState3.getRouteTravelMode() == routeTravelMode) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            j = bk.g;
                                            jC = hz.c(0.15f, j);
                                            j2 = hz.g;
                                            np2VarG = mh0.G((kz) ov0Var5.j(mz.a));
                                            if (j2 != 16) {
                                                j3 = j2;
                                            } else {
                                                j3 = np2VarG.a;
                                            }
                                            if (j2 != 16) {
                                                j4 = j2;
                                            } else {
                                                j4 = np2VarG.b;
                                            }
                                            if (j2 != 16) {
                                                j5 = j2;
                                            } else {
                                                j5 = np2VarG.c;
                                            }
                                            if (j2 != 16) {
                                                j6 = j2;
                                            } else {
                                                j6 = np2VarG.d;
                                            }
                                            if (j2 != 16) {
                                                j7 = j2;
                                            } else {
                                                j7 = np2VarG.e;
                                            }
                                            if (j2 != 16) {
                                                j8 = j2;
                                            } else {
                                                j8 = np2VarG.f;
                                            }
                                            if (j2 != 16) {
                                                j9 = j2;
                                            } else {
                                                j9 = np2VarG.g;
                                            }
                                            if (j2 != 16) {
                                                j10 = j2;
                                            } else {
                                                j10 = np2VarG.h;
                                            }
                                            if (jC == 16) {
                                                jC = np2VarG.i;
                                            }
                                            long j17 = jC;
                                            if (j2 != 16) {
                                                j11 = j2;
                                            } else {
                                                j11 = np2VarG.j;
                                            }
                                            if (j == 16) {
                                                j = np2VarG.k;
                                            }
                                            long j18 = j;
                                            if (j2 != 16) {
                                                j12 = j2;
                                            } else {
                                                j12 = np2VarG.l;
                                            }
                                            if (j2 != 16) {
                                                j13 = j2;
                                            } else {
                                                j13 = np2VarG.m;
                                            }
                                            np2 np2Var2 = new np2(j3, j4, j5, j6, j7, j8, j9, j10, j17, j11, j18, j12, j13);
                                            wb1 wb1Var2 = new wb1(1.0f, true);
                                            lu0Var31 = lu0Var30;
                                            zF5 = ov0Var5.f(lu0Var31) | ov0Var5.d(routeTravelMode.ordinal());
                                            objQ5 = ov0Var5.Q();
                                            if (zF5) {
                                                objQ5 = new qi2(3, lu0Var31, routeTravelMode);
                                                ov0Var5.m0(objQ5);
                                            } else {
                                                objQ5 = new qi2(3, lu0Var31, routeTravelMode);
                                                ov0Var5.m0(objQ5);
                                            }
                                            ov0 ov0Var17 = ov0Var5;
                                            ix.b(z, (au0) objQ5, sb.a0(-363746935, new s5(routeTravelMode, 22), ov0Var5), wb1Var2, false, null, np2Var2, null, null, ov0Var17, 384, 3824);
                                            ov0Var5 = ov0Var17;
                                            appState3 = appState3;
                                        }
                                        appState4 = appState3;
                                        ov0Var5.s();
                                        ov0Var5.r();
                                    } else {
                                        appState4 = appState3;
                                        ov0Var5.c0(-1514167592);
                                    }
                                    ov0Var5.s();
                                    wc0.l(ke0.N(2131624901, ov0Var5), appState4.getRouteLateralDeviation(), lu0Var20, ke0.N(2131624902, ov0Var5), ov0Var5, 0, 0);
                                    p10Var2.invoke(ov0Var5, 0);
                                    ov0Var6 = ov0Var5;
                                    s83.b(ke0.N(2131624440, ov0Var5), null, hz.c(0.6f, ((kz) ov0Var5.j(mz.a)).q), v63.c(13), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                                    if (appState4.getCanMockWifi()) {
                                        ov0Var6.c0(-1481336019);
                                        String strN11 = ke0.N(2131624442, ov0Var6);
                                        appState5 = appState4;
                                        String strG2 = r93.g(appState5, ov0Var6);
                                        boolean mockWifi2 = appState5.getMockWifi();
                                        au0Var18 = au0Var10;
                                        zF4 = ov0Var6.f(au0Var18);
                                        objQ4 = ov0Var6.Q();
                                        if (zF4) {
                                            objQ4 = new m4(8, au0Var18);
                                            ov0Var6.m0(objQ4);
                                        } else {
                                            objQ4 = new m4(8, au0Var18);
                                            ov0Var6.m0(objQ4);
                                        }
                                        wc0.l(strN11, mockWifi2, (lu0) objQ4, strG2, ov0Var6, 0, 0);
                                    } else {
                                        appState5 = appState4;
                                        ov0Var6.c0(-1514167592);
                                    }
                                    ov0Var6.s();
                                    if (appState5.getCanMockCell()) {
                                        ov0Var6.c0(2030435916);
                                        String strN12 = ke0.N(2131624772, ov0Var6);
                                        boolean mockCell2 = appState5.getMockCell();
                                        au0Var17 = au0Var11;
                                        zF3 = ov0Var6.f(au0Var17);
                                        objQ3 = ov0Var6.Q();
                                        if (zF3) {
                                            objQ3 = new m4(9, au0Var17);
                                            ov0Var6.m0(objQ3);
                                        } else {
                                            objQ3 = new m4(9, au0Var17);
                                            ov0Var6.m0(objQ3);
                                        }
                                        wc0.l(strN12, mockCell2, (lu0) objQ3, null, ov0Var6, 0, 8);
                                    } else {
                                        ov0Var6.c0(-1514167592);
                                    }
                                    ov0Var6.s();
                                    if (appState5.getCanMockBluetooth()) {
                                        ov0Var6.c0(2030444795);
                                        String strN13 = ke0.N(2131624771, ov0Var6);
                                        boolean mockBluetooth2 = appState5.getMockBluetooth();
                                        au0Var16 = au0Var12;
                                        zF2 = ov0Var6.f(au0Var16);
                                        objQ2 = ov0Var6.Q();
                                        if (zF2) {
                                            objQ2 = new m4(10, au0Var16);
                                            ov0Var6.m0(objQ2);
                                        } else {
                                            objQ2 = new m4(10, au0Var16);
                                            ov0Var6.m0(objQ2);
                                        }
                                        wc0.l(strN13, mockBluetooth2, (lu0) objQ2, null, ov0Var6, 0, 8);
                                    } else {
                                        ov0Var6.c0(-1514167592);
                                    }
                                    ov0Var6.s();
                                    String strN14 = ke0.N(2131624409, ov0Var6);
                                    String strN15 = ke0.N(2131624410, ov0Var6);
                                    boolean enableJitter2 = appState5.getEnableJitter();
                                    au0Var15 = au0Var13;
                                    zF = ov0Var6.f(au0Var15);
                                    objQ = ov0Var6.Q();
                                    if (zF) {
                                        objQ = new m4(11, au0Var15);
                                        ov0Var6.m0(objQ);
                                    } else {
                                        objQ = new m4(11, au0Var15);
                                        ov0Var6.m0(objQ);
                                    }
                                    wc0.l(strN14, enableJitter2, (lu0) objQ, strN15, ov0Var6, 0, 0);
                                    String satelliteCountInput2 = appState5.getSatelliteCountInput();
                                    dv1 dv1VarE12 = iw2.e(av1Var, 1.0f);
                                    n91 n91Var2 = new n91(3, 0, 123);
                                    long j19 = bk.g;
                                    ee0.i(satelliteCountInput2, lu0Var21, dv1VarE12, false, null, ks.F, null, null, null, null, false, null, n91Var2, null, true, 0, 0, null, j9.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, j19, 0L, 0L, j19, 0L, ov0Var6, 2139092991), ov0Var6, 1573248, 12779520, 4030392);
                                    ov0Var6.r();
                                    n51.a(au0Var9, iw2.g(iw2.e(av1Var, 1.0f), 48.0f), false, cj2.a(c2), hu.a(j19, 0L, 0L, 0L, ov0Var6, 14), null, null, null, ks.G, ov0Var6, 805306416, 484);
                                    ov0Var6.r();
                                } else {
                                    ov0Var7.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var3), ov0Var3, 196608, 16);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, ((i3 >> 3) & 14) | 432);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: kj2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    wc0.k(appState, au0Var, au0Var2, lu0Var, lu0Var2, lu0Var3, lu0Var4, lu0Var5, lu0Var6, lu0Var7, lu0Var8, lu0Var9, au0Var3, au0Var4, au0Var5, au0Var6, lu0Var10, lu0Var11, lu0Var12, lu0Var13, p10Var, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k0(defpackage.p33 r12, defpackage.s63 r13, defpackage.p92 r14, defpackage.oq r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc0.k0(p33, s63, p92, oq):java.lang.Object");
    }

    public static final void l(String str, boolean z, lu0 lu0Var, String str2, f30 f30Var, int i, int i2) {
        String str3;
        int i3;
        String str4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1611021062);
        int i4 = i | (ov0Var.f(str) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (ov0Var.f(str3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            String str5 = i5 != 0 ? null : str3;
            e33.a(iw2.e(av1.a, 1.0f), cj2.a(16.0f), hz.c(0.35f, ((kz) ov0Var.j(mz.a)).r), 0L, 0.0f, 0.0f, null, sb.a0(-1969481205, new p2(z, lu0Var, str, str5), ov0Var), ov0Var, 12582918, 120);
            str4 = str5;
        } else {
            ov0Var.W();
            str4 = str3;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(str, z, lu0Var, str4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l0(defpackage.p33 r11, defpackage.s63 r12, defpackage.p92 r13, int r14, defpackage.oq r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc0.l0(p33, s63, p92, int, oq):java.lang.Object");
    }

    public static final void m(String str, String str2, x01 x01Var, boolean z, au0 au0Var, dv1 dv1Var, f30 f30Var, int i) {
        ov0 ov0Var;
        long jC;
        str.getClass();
        str2.getClass();
        au0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(1759635089);
        int i2 = i | (ov0Var2.f(str) ? 4 : 2) | (ov0Var2.f(str2) ? 32 : 16) | (ov0Var2.f(x01Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.h(au0Var) ? 16384 : 8192) | (ov0Var2.f(dv1Var) ? 131072 : 65536);
        if (ov0Var2.T(i2 & 1, (74899 & i2) != 74898)) {
            bj2 bj2VarA = cj2.a(16.0f);
            if (z) {
                ov0Var2.c0(-1207784028);
                ov0Var2.p(false);
                jC = hz.c(0.08f, bk.g);
            } else {
                ov0Var2.c0(-1207781894);
                jC = hz.c(0.35f, ((kz) ov0Var2.j(mz.a)).r);
                ov0Var2.p(false);
            }
            ov0Var = ov0Var2;
            e33.b(au0Var, iw2.g(dv1Var, 90.0f), false, bj2VarA, jC, 0L, 0.0f, z ? da0.h(1.5f, bk.g) : null, null, sb.a0(1711449126, new jj2(z, x01Var, str, str2), ov0Var2), ov0Var, (i2 >> 12) & 14, 740);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new w5(str, str2, x01Var, z, au0Var, dv1Var, i);
        }
    }

    public static final int m0(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void n(dv1 dv1Var, pu0 pu0Var, pu0 pu0Var2, pu0 pu0Var3, pu0 pu0Var4, int i, long j, long j2, sk3 sk3Var, final p10 p10Var, f30 f30Var, final int i2, final int i3) {
        final pu0 pu0Var5;
        int i4;
        pu0 pu0Var6;
        int i5;
        int i6;
        long j3;
        boolean z;
        final dv1 dv1Var2;
        final sk3 sk3Var2;
        final pu0 pu0Var7;
        final long j4;
        final pu0 pu0Var8;
        final pu0 pu0Var9;
        final int i7;
        final long j5;
        ee2 ee2VarT;
        pu0 pu0Var10;
        pu0 pu0Var11;
        pu0 pu0Var12;
        pu0 pu0Var13;
        int i8;
        int i9;
        sk3 lf3Var;
        long j6;
        dv1 dv1Var3;
        boolean zF;
        Object objQ;
        iy1 iy1Var;
        boolean zF2;
        Object objQ2;
        int i10;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1211482744);
        int i11 = i2 | 6;
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                pu0Var5 = pu0Var;
                i11 |= ov0Var.h(pu0Var5) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i2 & 384) == 0) {
                    pu0Var6 = pu0Var2;
                    if (ov0Var.h(pu0Var6)) {
                        i5 = 256;
                    } else {
                        i5 = WorkQueueKt.BUFFER_CAPACITY;
                    }
                    i11 |= i5;
                }
                i6 = i11 | 224256;
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        j3 = j;
                        int i13 = ov0Var.e(j3) ? 1048576 : 524288;
                        i6 |= i13;
                    } else {
                        j3 = j;
                    }
                    i6 |= i13;
                } else {
                    j3 = j;
                }
                if ((i2 & 12582912) == 0) {
                    i6 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i6 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    if (ov0Var.h(p10Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i6 |= i10;
                }
                if ((306783379 & i6) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (ov0Var.T(i6 & 1, z)) {
                    ov0Var.Y();
                    if ((i2 & 1) != 0 || ov0Var.B()) {
                        if (i12 != 0) {
                            pu0Var10 = e20.a;
                        } else {
                            pu0Var10 = pu0Var5;
                        }
                        if (i4 != 0) {
                            pu0Var11 = e20.b;
                        } else {
                            pu0Var11 = pu0Var6;
                        }
                        pu0Var12 = e20.c;
                        pu0Var13 = e20.d;
                        if ((i3 & 64) != 0) {
                            j3 = ((kz) ov0Var.j(mz.a)).n;
                            i6 &= -3670017;
                        }
                        long jB = mz.b(j3, ov0Var);
                        WeakHashMap weakHashMap = ul3.w;
                        i8 = 2;
                        i9 = i6 & (-264241153);
                        lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                        j6 = jB;
                        dv1Var3 = av1.a;
                    } else {
                        ov0Var.W();
                        if ((i3 & 64) != 0) {
                            i6 &= -3670017;
                        }
                        dv1Var3 = dv1Var;
                        pu0Var12 = pu0Var3;
                        i8 = i;
                        j6 = j2;
                        pu0Var10 = pu0Var5;
                        pu0Var11 = pu0Var6;
                        pu0Var13 = pu0Var4;
                        i9 = i6 & (-264241153);
                        lf3Var = sk3Var;
                    }
                    ov0Var.q();
                    zF = ov0Var.f(lf3Var);
                    objQ = ov0Var.Q();
                    pu0 pu0Var14 = pu0Var10;
                    c30 c30Var = d30.a;
                    if (zF || objQ == c30Var) {
                        objQ = new iy1(lf3Var);
                        ov0Var.m0(objQ);
                    }
                    iy1Var = (iy1) objQ;
                    zF2 = ov0Var.f(iy1Var) | ov0Var.f(lf3Var);
                    pu0 pu0Var15 = pu0Var11;
                    objQ2 = ov0Var.Q();
                    if (zF2 || objQ2 == c30Var) {
                        objQ2 = new jl1(14, iy1Var, lf3Var);
                        ov0Var.m0(objQ2);
                    }
                    pu0 pu0Var16 = pu0Var12;
                    pu0 pu0Var17 = pu0Var13;
                    int i14 = i8;
                    long j7 = j3;
                    long j8 = j6;
                    e33.a(k22.F(dv1Var3, (lu0) objQ2), null, j7, j8, 0.0f, 0.0f, null, sb.a0(848889571, new dn2(i14, pu0Var14, p10Var, pu0Var16, pu0Var17, iy1Var, pu0Var15), ov0Var), ov0Var, ((i9 >> 12) & 896) | 12582912, 114);
                    j4 = j7;
                    dv1Var2 = dv1Var3;
                    sk3Var2 = lf3Var;
                    pu0Var5 = pu0Var14;
                    pu0Var7 = pu0Var15;
                    i7 = i14;
                    j5 = j8;
                    pu0Var8 = pu0Var16;
                    pu0Var9 = pu0Var17;
                } else {
                    ov0Var.W();
                    dv1Var2 = dv1Var;
                    sk3Var2 = sk3Var;
                    pu0Var7 = pu0Var6;
                    j4 = j3;
                    pu0Var8 = pu0Var3;
                    pu0Var9 = pu0Var4;
                    i7 = i;
                    j5 = j2;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: bn2
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM0 = wc0.m0(i2 | 1);
                            wc0.n(dv1Var2, pu0Var5, pu0Var7, pu0Var8, pu0Var9, i7, j4, j5, sk3Var2, p10Var, (f30) obj, iM0, i3);
                            return mf3.a;
                        }
                    };
                }
            }
            i11 |= 384;
            pu0Var6 = pu0Var2;
            i6 = i11 | 224256;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    j3 = j;
                    if (ov0Var.e(j3)) {
                    }
                    i6 |= i13;
                } else {
                    j3 = j;
                }
                i6 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 12582912) == 0) {
                i6 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i6 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                if (ov0Var.h(p10Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i6 |= i10;
            }
            if ((306783379 & i6) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (ov0Var.T(i6 & 1, z)) {
                ov0Var.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        pu0Var10 = e20.a;
                    } else {
                        pu0Var10 = pu0Var5;
                    }
                    if (i4 != 0) {
                        pu0Var11 = e20.b;
                    } else {
                        pu0Var11 = pu0Var6;
                    }
                    pu0Var12 = e20.c;
                    pu0Var13 = e20.d;
                    if ((i3 & 64) != 0) {
                        j3 = ((kz) ov0Var.j(mz.a)).n;
                        i6 &= -3670017;
                    }
                    long jB2 = mz.b(j3, ov0Var);
                    WeakHashMap weakHashMap2 = ul3.w;
                    i8 = 2;
                    i9 = i6 & (-264241153);
                    lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                    j6 = jB2;
                    dv1Var3 = av1.a;
                } else {
                    if (i12 != 0) {
                        pu0Var10 = e20.a;
                    } else {
                        pu0Var10 = pu0Var5;
                    }
                    if (i4 != 0) {
                        pu0Var11 = e20.b;
                    } else {
                        pu0Var11 = pu0Var6;
                    }
                    pu0Var12 = e20.c;
                    pu0Var13 = e20.d;
                    if ((i3 & 64) != 0) {
                        j3 = ((kz) ov0Var.j(mz.a)).n;
                        i6 &= -3670017;
                    }
                    long jB3 = mz.b(j3, ov0Var);
                    WeakHashMap weakHashMap3 = ul3.w;
                    i8 = 2;
                    i9 = i6 & (-264241153);
                    lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                    j6 = jB3;
                    dv1Var3 = av1.a;
                }
                ov0Var.q();
                zF = ov0Var.f(lf3Var);
                objQ = ov0Var.Q();
                pu0 pu0Var18 = pu0Var10;
                c30 c30Var2 = d30.a;
                if (zF) {
                    objQ = new iy1(lf3Var);
                    ov0Var.m0(objQ);
                } else {
                    objQ = new iy1(lf3Var);
                    ov0Var.m0(objQ);
                }
                iy1Var = (iy1) objQ;
                zF2 = ov0Var.f(iy1Var) | ov0Var.f(lf3Var);
                pu0 pu0Var19 = pu0Var11;
                objQ2 = ov0Var.Q();
                if (zF2) {
                    objQ2 = new jl1(14, iy1Var, lf3Var);
                    ov0Var.m0(objQ2);
                } else {
                    objQ2 = new jl1(14, iy1Var, lf3Var);
                    ov0Var.m0(objQ2);
                }
                pu0 pu0Var110 = pu0Var12;
                pu0 pu0Var111 = pu0Var13;
                int i15 = i8;
                long j9 = j3;
                long j10 = j6;
                e33.a(k22.F(dv1Var3, (lu0) objQ2), null, j9, j10, 0.0f, 0.0f, null, sb.a0(848889571, new dn2(i15, pu0Var18, p10Var, pu0Var110, pu0Var111, iy1Var, pu0Var19), ov0Var), ov0Var, ((i9 >> 12) & 896) | 12582912, 114);
                j4 = j9;
                dv1Var2 = dv1Var3;
                sk3Var2 = lf3Var;
                pu0Var5 = pu0Var18;
                pu0Var7 = pu0Var19;
                i7 = i15;
                j5 = j10;
                pu0Var8 = pu0Var110;
                pu0Var9 = pu0Var111;
            } else {
                ov0Var.W();
                dv1Var2 = dv1Var;
                sk3Var2 = sk3Var;
                pu0Var7 = pu0Var6;
                j4 = j3;
                pu0Var8 = pu0Var3;
                pu0Var9 = pu0Var4;
                i7 = i;
                j5 = j2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: bn2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(i2 | 1);
                        wc0.n(dv1Var2, pu0Var5, pu0Var7, pu0Var8, pu0Var9, i7, j4, j5, sk3Var2, p10Var, (f30) obj, iM0, i3);
                        return mf3.a;
                    }
                };
            }
        }
        i11 = i2 | 54;
        pu0Var5 = pu0Var;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i2 & 384) == 0) {
                pu0Var6 = pu0Var2;
                if (ov0Var.h(pu0Var6)) {
                    i5 = 256;
                } else {
                    i5 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i11 |= i5;
            }
            i6 = i11 | 224256;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    j3 = j;
                    if (ov0Var.e(j3)) {
                    }
                    i6 |= i13;
                } else {
                    j3 = j;
                }
                i6 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 12582912) == 0) {
                i6 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i6 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                if (ov0Var.h(p10Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i6 |= i10;
            }
            if ((306783379 & i6) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (ov0Var.T(i6 & 1, z)) {
                ov0Var.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        pu0Var10 = e20.a;
                    } else {
                        pu0Var10 = pu0Var5;
                    }
                    if (i4 != 0) {
                        pu0Var11 = e20.b;
                    } else {
                        pu0Var11 = pu0Var6;
                    }
                    pu0Var12 = e20.c;
                    pu0Var13 = e20.d;
                    if ((i3 & 64) != 0) {
                        j3 = ((kz) ov0Var.j(mz.a)).n;
                        i6 &= -3670017;
                    }
                    long jB4 = mz.b(j3, ov0Var);
                    WeakHashMap weakHashMap4 = ul3.w;
                    i8 = 2;
                    i9 = i6 & (-264241153);
                    lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                    j6 = jB4;
                    dv1Var3 = av1.a;
                } else {
                    if (i12 != 0) {
                        pu0Var10 = e20.a;
                    } else {
                        pu0Var10 = pu0Var5;
                    }
                    if (i4 != 0) {
                        pu0Var11 = e20.b;
                    } else {
                        pu0Var11 = pu0Var6;
                    }
                    pu0Var12 = e20.c;
                    pu0Var13 = e20.d;
                    if ((i3 & 64) != 0) {
                        j3 = ((kz) ov0Var.j(mz.a)).n;
                        i6 &= -3670017;
                    }
                    long jB5 = mz.b(j3, ov0Var);
                    WeakHashMap weakHashMap5 = ul3.w;
                    i8 = 2;
                    i9 = i6 & (-264241153);
                    lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                    j6 = jB5;
                    dv1Var3 = av1.a;
                }
                ov0Var.q();
                zF = ov0Var.f(lf3Var);
                objQ = ov0Var.Q();
                pu0 pu0Var112 = pu0Var10;
                c30 c30Var3 = d30.a;
                if (zF) {
                    objQ = new iy1(lf3Var);
                    ov0Var.m0(objQ);
                } else {
                    objQ = new iy1(lf3Var);
                    ov0Var.m0(objQ);
                }
                iy1Var = (iy1) objQ;
                zF2 = ov0Var.f(iy1Var) | ov0Var.f(lf3Var);
                pu0 pu0Var113 = pu0Var11;
                objQ2 = ov0Var.Q();
                if (zF2) {
                    objQ2 = new jl1(14, iy1Var, lf3Var);
                    ov0Var.m0(objQ2);
                } else {
                    objQ2 = new jl1(14, iy1Var, lf3Var);
                    ov0Var.m0(objQ2);
                }
                pu0 pu0Var114 = pu0Var12;
                pu0 pu0Var115 = pu0Var13;
                int i16 = i8;
                long j11 = j3;
                long j12 = j6;
                e33.a(k22.F(dv1Var3, (lu0) objQ2), null, j11, j12, 0.0f, 0.0f, null, sb.a0(848889571, new dn2(i16, pu0Var112, p10Var, pu0Var114, pu0Var115, iy1Var, pu0Var113), ov0Var), ov0Var, ((i9 >> 12) & 896) | 12582912, 114);
                j4 = j11;
                dv1Var2 = dv1Var3;
                sk3Var2 = lf3Var;
                pu0Var5 = pu0Var112;
                pu0Var7 = pu0Var113;
                i7 = i16;
                j5 = j12;
                pu0Var8 = pu0Var114;
                pu0Var9 = pu0Var115;
            } else {
                ov0Var.W();
                dv1Var2 = dv1Var;
                sk3Var2 = sk3Var;
                pu0Var7 = pu0Var6;
                j4 = j3;
                pu0Var8 = pu0Var3;
                pu0Var9 = pu0Var4;
                i7 = i;
                j5 = j2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: bn2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(i2 | 1);
                        wc0.n(dv1Var2, pu0Var5, pu0Var7, pu0Var8, pu0Var9, i7, j4, j5, sk3Var2, p10Var, (f30) obj, iM0, i3);
                        return mf3.a;
                    }
                };
            }
        }
        i11 |= 384;
        pu0Var6 = pu0Var2;
        i6 = i11 | 224256;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                j3 = j;
                if (ov0Var.e(j3)) {
                }
                i6 |= i13;
            } else {
                j3 = j;
            }
            i6 |= i13;
        } else {
            j3 = j;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            if (ov0Var.h(p10Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i6 |= i10;
        }
        if ((306783379 & i6) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (ov0Var.T(i6 & 1, z)) {
            ov0Var.Y();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    pu0Var10 = e20.a;
                } else {
                    pu0Var10 = pu0Var5;
                }
                if (i4 != 0) {
                    pu0Var11 = e20.b;
                } else {
                    pu0Var11 = pu0Var6;
                }
                pu0Var12 = e20.c;
                pu0Var13 = e20.d;
                if ((i3 & 64) != 0) {
                    j3 = ((kz) ov0Var.j(mz.a)).n;
                    i6 &= -3670017;
                }
                long jB6 = mz.b(j3, ov0Var);
                WeakHashMap weakHashMap6 = ul3.w;
                i8 = 2;
                i9 = i6 & (-264241153);
                lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                j6 = jB6;
                dv1Var3 = av1.a;
            } else {
                if (i12 != 0) {
                    pu0Var10 = e20.a;
                } else {
                    pu0Var10 = pu0Var5;
                }
                if (i4 != 0) {
                    pu0Var11 = e20.b;
                } else {
                    pu0Var11 = pu0Var6;
                }
                pu0Var12 = e20.c;
                pu0Var13 = e20.d;
                if ((i3 & 64) != 0) {
                    j3 = ((kz) ov0Var.j(mz.a)).n;
                    i6 &= -3670017;
                }
                long jB7 = mz.b(j3, ov0Var);
                WeakHashMap weakHashMap7 = ul3.w;
                i8 = 2;
                i9 = i6 & (-264241153);
                lf3Var = new lf3(q73.b(ov0Var).g, q73.b(ov0Var).b);
                j6 = jB7;
                dv1Var3 = av1.a;
            }
            ov0Var.q();
            zF = ov0Var.f(lf3Var);
            objQ = ov0Var.Q();
            pu0 pu0Var116 = pu0Var10;
            c30 c30Var4 = d30.a;
            if (zF) {
                objQ = new iy1(lf3Var);
                ov0Var.m0(objQ);
            } else {
                objQ = new iy1(lf3Var);
                ov0Var.m0(objQ);
            }
            iy1Var = (iy1) objQ;
            zF2 = ov0Var.f(iy1Var) | ov0Var.f(lf3Var);
            pu0 pu0Var117 = pu0Var11;
            objQ2 = ov0Var.Q();
            if (zF2) {
                objQ2 = new jl1(14, iy1Var, lf3Var);
                ov0Var.m0(objQ2);
            } else {
                objQ2 = new jl1(14, iy1Var, lf3Var);
                ov0Var.m0(objQ2);
            }
            pu0 pu0Var118 = pu0Var12;
            pu0 pu0Var119 = pu0Var13;
            int i17 = i8;
            long j13 = j3;
            long j14 = j6;
            e33.a(k22.F(dv1Var3, (lu0) objQ2), null, j13, j14, 0.0f, 0.0f, null, sb.a0(848889571, new dn2(i17, pu0Var116, p10Var, pu0Var118, pu0Var119, iy1Var, pu0Var117), ov0Var), ov0Var, ((i9 >> 12) & 896) | 12582912, 114);
            j4 = j13;
            dv1Var2 = dv1Var3;
            sk3Var2 = lf3Var;
            pu0Var5 = pu0Var116;
            pu0Var7 = pu0Var117;
            i7 = i17;
            j5 = j14;
            pu0Var8 = pu0Var118;
            pu0Var9 = pu0Var119;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            sk3Var2 = sk3Var;
            pu0Var7 = pu0Var6;
            j4 = j3;
            pu0Var8 = pu0Var3;
            pu0Var9 = pu0Var4;
            i7 = i;
            j5 = j2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: bn2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i2 | 1);
                    wc0.n(dv1Var2, pu0Var5, pu0Var7, pu0Var8, pu0Var9, i7, j4, j5, sk3Var2, p10Var, (f30) obj, iM0, i3);
                    return mf3.a;
                }
            };
        }
    }

    public static Context n0(Context context, String str) {
        Locale localeForLanguageTag;
        context.getClass();
        str.getClass();
        if (str.length() == 0) {
            localeForLanguageTag = new Configuration(context.getResources().getConfiguration()).getLocales().get(0);
            if (localeForLanguageTag == null) {
                localeForLanguageTag = Locale.getDefault();
            }
        } else {
            localeForLanguageTag = Locale.forLanguageTag(str);
        }
        Locale.setDefault(localeForLanguageTag);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeForLanguageTag);
        configuration.setLocales(new LocaleList(localeForLanguageTag));
        configuration.setLayoutDirection(localeForLanguageTag);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    public static final void o(int i, pu0 pu0Var, p10 p10Var, pu0 pu0Var2, pu0 pu0Var3, sk3 sk3Var, pu0 pu0Var4, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-280287501);
        int i4 = i2 | (ov0Var.d(i) ? 4 : 2) | (ov0Var.h(pu0Var) ? 32 : 16) | (ov0Var.h(p10Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(pu0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(pu0Var3) ? 16384 : 8192) | (ov0Var.f(sk3Var) ? 131072 : 65536) | (ov0Var.h(pu0Var4) ? 1048576 : 524288);
        if (ov0Var.T(i4 & 1, (599187 & i4) != 599186)) {
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new en2();
                ov0Var.m0(objQ);
            }
            en2 en2Var = (en2) objQ;
            boolean z = (i4 & 112) == 32;
            Object objQ2 = ov0Var.Q();
            if (z || objQ2 == c30Var) {
                objQ2 = new p10(new d9(5, pu0Var), true, 605195056);
                ov0Var.m0(objQ2);
            }
            pu0 pu0Var5 = (pu0) objQ2;
            boolean z2 = (i4 & 7168) == 2048;
            Object objQ3 = ov0Var.Q();
            if (z2 || objQ3 == c30Var) {
                objQ3 = new p10(new d9(4, pu0Var2), true, 418899191);
                ov0Var.m0(objQ3);
            }
            pu0 pu0Var6 = (pu0) objQ3;
            boolean z3 = (57344 & i4) == 16384;
            Object objQ4 = ov0Var.Q();
            if (z3 || objQ4 == c30Var) {
                objQ4 = new p10(new d9(3, pu0Var3), true, 338600263);
                ov0Var.m0(objQ4);
            }
            pu0 pu0Var7 = (pu0) objQ4;
            boolean z4 = (i4 & 896) == 256;
            Object objQ5 = ov0Var.Q();
            if (z4 || objQ5 == c30Var) {
                objQ5 = new p10(new pu(4, p10Var, en2Var), true, -1776388365);
                ov0Var.m0(objQ5);
            }
            pu0 pu0Var8 = (pu0) objQ5;
            boolean z5 = (i4 & 3670016) == 1048576;
            Object objQ6 = ov0Var.Q();
            if (z5 || objQ6 == c30Var) {
                objQ6 = new p10(new d9(2, pu0Var4), true, -1731662488);
                ov0Var.m0(objQ6);
            }
            pu0 pu0Var9 = (pu0) objQ6;
            boolean zF = ((i4 & 458752) == 131072) | ov0Var.f(pu0Var5) | ov0Var.f(pu0Var6) | ov0Var.f(pu0Var7) | ((i4 & 14) == 4) | ov0Var.f(pu0Var9) | ov0Var.f(pu0Var8);
            Object objQ7 = ov0Var.Q();
            if (zF || objQ7 == c30Var) {
                i3 = 0;
                l10 l10Var = new l10(sk3Var, pu0Var5, pu0Var6, pu0Var7, i, pu0Var9, en2Var, pu0Var8);
                ov0Var.m0(l10Var);
                objQ7 = l10Var;
            } else {
                i3 = 0;
            }
            o51.c(null, (pu0) objQ7, ov0Var, i3);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new n10(i, pu0Var, p10Var, pu0Var2, pu0Var3, sk3Var, pu0Var4, i2);
        }
    }

    public static void o0(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    public static final void p(final boolean z, lu0 lu0Var, dv1 dv1Var, v33 v33Var, boolean z2, f30 f30Var, int i) {
        dv1 dv1Var2;
        v33 v33Var2;
        ov0 ov0Var;
        hh0 hh0Var;
        long j;
        long jC;
        long j2;
        v33 v33Var3;
        int i2;
        dv1 dv1Var3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        float f;
        Object obj5;
        boolean z3;
        long j3;
        long j4;
        dv1 dv1Var4;
        ix1 ix1Var;
        final boolean z4;
        dv1 dv1VarA;
        v33 v33Var4;
        ?? r12;
        ov0 ov0Var2;
        boolean z5;
        jx0 jx0Var;
        ey1 ey1Var;
        ey1 ey1Var2;
        s52 s52Var;
        ov0 ov0Var3;
        Object obj6;
        Object obj7;
        ov0 ov0Var4 = (ov0) f30Var;
        ov0Var4.e0(-2068316749);
        int i3 = i | (ov0Var4.g(z) ? 4 : 2) | (ov0Var4.h(lu0Var) ? 32 : 16) | 1408 | (ov0Var4.g(z2) ? 16384 : 8192);
        if (ov0Var4.T(i3 & 1, (i3 & 9363) != 9362)) {
            ov0Var4.Y();
            int i4 = i & 1;
            av1 av1Var = av1.a;
            c30 c30Var = d30.a;
            if (i4 == 0 || ov0Var4.B()) {
                hh0 hh0Var2 = ba3.a;
                nz nzVar = (nz) ov0Var4.j(hh0Var2);
                int i5 = nzVar == null ? -1 : ru1.a[nzVar.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    ov0Var4.c0(-437740186);
                    hh0Var = vz.a;
                    j = ((hz) ((uz) ov0Var4.j(hh0Var)).b.getValue()).a;
                } else {
                    ov0Var4.c0(-437738970);
                    hh0Var = vz.a;
                    j = ((hz) ((uz) ov0Var4.j(hh0Var)).b.getValue()).a;
                }
                ov0Var4.p(false);
                nz nzVar2 = (nz) ov0Var4.j(hh0Var2);
                int i6 = nzVar2 == null ? -1 : ru1.a[nzVar2.ordinal()];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    ov0Var4.c0(-437735832);
                    jC = hz.c(0.38f, ((hz) ((uz) ov0Var4.j(hh0Var)).I.getValue()).a);
                } else {
                    ov0Var4.c0(-437734552);
                    jC = ((hz) ((uz) ov0Var4.j(hh0Var)).q.getValue()).a;
                }
                ov0Var4.p(false);
                nz nzVar3 = (nz) ov0Var4.j(hh0Var2);
                int i7 = nzVar3 == null ? -1 : ru1.a[nzVar3.ordinal()];
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    ov0Var4.c0(-437731484);
                    j2 = ((hz) ((uz) ov0Var4.j(hh0Var)).H.getValue()).a;
                } else {
                    ov0Var4.c0(-437730322);
                    j2 = ((hz) ((uz) ov0Var4.j(hh0Var)).j.getValue()).a;
                }
                ov0Var4.p(false);
                long j5 = ((hz) ((uz) ov0Var4.j(hh0Var)).u.getValue()).a;
                long j6 = ((hz) ((uz) ov0Var4.j(hh0Var)).a.getValue()).a;
                long j7 = ((hz) ((uz) ov0Var4.j(hh0Var)).p.getValue()).a;
                long j8 = ((hz) ((uz) ov0Var4.j(hh0Var)).i.getValue()).a;
                long j9 = ((hz) ((uz) ov0Var4.j(hh0Var)).t.getValue()).a;
                boolean zE = ov0Var4.e(j) | ov0Var4.e(jC) | ov0Var4.e(j2) | ov0Var4.e(j5) | ov0Var4.e(j6) | ov0Var4.e(j7) | ov0Var4.e(j8) | ov0Var4.e(j9);
                Object objQ = ov0Var4.Q();
                if (zE || objQ == c30Var) {
                    objQ = new v33(j, jC, j2, j5, j6, j7, j8, j9);
                    ov0Var4.m0(objQ);
                }
                v33Var3 = (v33) objQ;
                i2 = i3 & (-7169);
                dv1Var3 = av1Var;
            } else {
                ov0Var4.W();
                dv1Var3 = dv1Var;
                v33Var3 = v33Var;
                i2 = i3 & (-7169);
            }
            ov0Var4.q();
            ey1 ey1VarL = ke0.L(lu0Var, ov0Var4);
            Object objQ2 = ov0Var4.Q();
            Object obj8 = objQ2;
            if (objQ2 == c30Var) {
                ix1 ix1Var2 = new ix1();
                ov0Var4.m0(ix1Var2);
                obj8 = ix1Var2;
            }
            ix1 ix1Var3 = (ix1) obj8;
            Object objQ3 = ov0Var4.Q();
            Object obj9 = objQ3;
            if (objQ3 == c30Var) {
                w52 w52VarH = ke0.H(Boolean.FALSE);
                ov0Var4.m0(w52VarH);
                obj9 = w52VarH;
            }
            ey1 ey1Var3 = (ey1) obj9;
            Object objQ4 = ov0Var4.Q();
            q60 q60Var = null;
            if (objQ4 == c30Var) {
                pf0 pf0Var = new pf0(ix1Var3, ey1Var3, q60Var, 3);
                ov0Var4.m0(pf0Var);
                obj = pf0Var;
            } else {
                obj = objQ4;
            }
            oi0.e(ov0Var4, (pu0) obj, ix1Var3);
            Object objQ5 = ov0Var4.Q();
            Object obj10 = objQ5;
            if (objQ5 == c30Var) {
                w52 w52VarH2 = ke0.H(Boolean.FALSE);
                ov0Var4.m0(w52VarH2);
                obj10 = w52VarH2;
            }
            ey1 ey1Var4 = (ey1) obj10;
            Object objQ6 = ov0Var4.Q();
            Object obj11 = objQ6;
            if (objQ6 == c30Var) {
                pf0 pf0Var2 = new pf0(ix1Var3, ey1Var4, q60Var, 0);
                ov0Var4.m0(pf0Var2);
                obj11 = pf0Var2;
            }
            oi0.e(ov0Var4, (pu0) obj11, ix1Var3);
            Object objQ7 = ov0Var4.Q();
            Object obj12 = objQ7;
            if (objQ7 == c30Var) {
                w52 w52VarH3 = ke0.H(Boolean.FALSE);
                ov0Var4.m0(w52VarH3);
                obj12 = w52VarH3;
            }
            ey1 ey1Var5 = (ey1) obj12;
            Object objQ8 = ov0Var4.Q();
            if (objQ8 == c30Var) {
                pf0 pf0Var3 = new pf0(ix1Var3, ey1Var5, q60Var, 2);
                ov0Var4.m0(pf0Var3);
                obj2 = pf0Var3;
            } else {
                obj2 = objQ8;
            }
            oi0.e(ov0Var4, (pu0) obj2, ix1Var3);
            jx0 jx0Var2 = (jx0) ov0Var4.j(z30.l);
            ey1 ey1VarL2 = ke0.L(jx0Var2, ov0Var4);
            Object objQ9 = ov0Var4.Q();
            Object obj13 = objQ9;
            if (objQ9 == c30Var) {
                w52 w52VarH4 = ke0.H(Boolean.FALSE);
                ov0Var4.m0(w52VarH4);
                obj13 = w52VarH4;
            }
            ey1 ey1Var6 = (ey1) obj13;
            Object objQ10 = ov0Var4.Q();
            Object obj14 = objQ10;
            if (objQ10 == c30Var) {
                w52 w52VarH5 = ke0.H(Boolean.FALSE);
                ov0Var4.m0(w52VarH5);
                obj14 = w52VarH5;
            }
            ey1 ey1Var7 = (ey1) obj14;
            Object objQ11 = ov0Var4.Q();
            Object obj15 = objQ11;
            if (objQ11 == c30Var) {
                s52 s52Var2 = new s52(0.0f);
                ov0Var4.m0(s52Var2);
                obj15 = s52Var2;
            }
            s52 s52Var3 = (s52) obj15;
            Object objQ12 = ov0Var4.Q();
            Object obj16 = objQ12;
            if (objQ12 == c30Var) {
                w52 w52VarH6 = ke0.H(null);
                ov0Var4.m0(w52VarH6);
                obj16 = w52VarH6;
            }
            ey1 ey1Var8 = (ey1) obj16;
            bj2 bj2Var = cj2.a;
            Object objQ13 = ov0Var4.Q();
            if (objQ13 == c30Var) {
                yz2 yz2VarD = o51.D(0.7f, 987.0f, null, 4);
                ov0Var4.m0(yz2VarD);
                obj3 = yz2VarD;
            } else {
                obj3 = objQ13;
            }
            yz2 yz2Var = (yz2) obj3;
            Object objQ14 = ov0Var4.Q();
            if (objQ14 == c30Var) {
                yz2 yz2VarD2 = o51.D(0.6f, 987.0f, null, 4);
                ov0Var4.m0(yz2VarD2);
                obj4 = yz2VarD2;
            } else {
                obj4 = objQ14;
            }
            yz2 yz2Var2 = (yz2) obj4;
            Object objQ15 = ov0Var4.Q();
            if (objQ15 == c30Var) {
                f = 0.0f;
                s52 s52Var4 = new s52(0.0f);
                ov0Var4.m0(s52Var4);
                obj5 = s52Var4;
            } else {
                f = 0.0f;
                obj5 = objQ15;
            }
            s52 s52Var5 = (s52) obj5;
            float f2 = f;
            jx0 jx0Var3 = jx0Var2;
            s03 s03VarA = qh.a(s52Var5.g() + (z ? 25.0f : 4.0f), yz2Var, null, ov0Var4, 48, 12);
            float f3 = 1.0f;
            if (z2 && (((Boolean) ey1Var3.getValue()).booleanValue() || ((Boolean) ey1Var4.getValue()).booleanValue() || ((Boolean) ey1Var5.getValue()).booleanValue())) {
                f3 = 1.127f;
            }
            if (yz2Var2 == qh.a) {
                ov0Var4.c0(1144115775);
                boolean zC = ov0Var4.c(0.01f);
                Object objQ16 = ov0Var4.Q();
                if (zC || objQ16 == c30Var) {
                    obj7 = objQ16;
                    yz2 yz2VarD3 = o51.D(f2, f2, Float.valueOf(0.01f), 3);
                    ov0Var4.m0(yz2VarD3);
                    obj7 = yz2VarD3;
                }
                yz2Var2 = (yz2) obj7;
                z3 = false;
                ov0Var4.p(false);
            } else {
                z3 = false;
                ov0Var4.c0(1144225701);
                ov0Var4.p(false);
            }
            s03 s03VarB = qh.b(Float.valueOf(f3), o51.v0, yz2Var2, null, "FloatAnimation", ov0Var4, 0, 0);
            if (z) {
                j3 = z2 ? v33Var3.a : v33Var3.c;
            } else {
                j3 = z2 ? v33Var3.b : v33Var3.d;
            }
            s03 s03VarA2 = aw2.a(j3, null, ov0Var4, 0, 14);
            if (z) {
                j4 = z2 ? v33Var3.e : v33Var3.g;
            } else {
                j4 = z2 ? v33Var3.f : v33Var3.h;
            }
            s03 s03VarA3 = aw2.a(j4, o51.D(0.99f, 438.6f, null, 4), ov0Var4, 48, 12);
            int i8 = 6;
            if (lu0Var != null) {
                ov0Var4.c0(-1621301421);
                boolean z6 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
                Object objQ17 = ov0Var4.Q();
                if (z6 || objQ17 == c30Var) {
                    dv1Var4 = av1Var;
                    ix1Var = ix1Var3;
                    z4 = z2;
                    dv1 dv1VarD0 = ks.d0(dv1Var4, z, z4, new vh2(2), ix1Var, new kn(ey1VarL, ey1VarL2, i8));
                    ov0Var4.m0(dv1VarD0);
                    obj6 = dv1VarD0;
                } else {
                    dv1Var4 = av1Var;
                    ix1Var = ix1Var3;
                    z4 = z2;
                    obj6 = objQ17;
                }
                dv1VarA = (dv1) obj6;
                ov0Var4.p(false);
            } else {
                jx0Var3 = jx0Var3;
                dv1Var4 = av1Var;
                ix1Var = ix1Var3;
                z4 = z2;
                ov0Var4.c0(-1620740538);
                boolean z7 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
                Object objQ18 = ov0Var4.Q();
                Object obj17 = objQ18;
                if (z7 || objQ18 == c30Var) {
                    lu0 lu0Var2 = new lu0() { // from class: x33
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj18) {
                            ss2 ss2Var = (ss2) obj18;
                            ss2Var.getClass();
                            qs2.c(ss2Var, 2);
                            qs2.e(ss2Var, g93.b(z));
                            mf3 mf3Var = mf3.a;
                            if (!z4) {
                                ss2Var.a(os2.j, mf3Var);
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var4.m0(lu0Var2);
                    obj17 = lu0Var2;
                }
                dv1VarA = gs2.a(dv1Var4, false, (lu0) obj17);
                ov0Var4.p(false);
            }
            dv1 dv1VarN = xp1.n(iw2.l(iw2.r(dv1Var3), 49.0f, 28.0f), bj2Var);
            boolean zF = ov0Var4.f(s03VarA3);
            Object objQ19 = ov0Var4.Q();
            Object obj18 = objQ19;
            if (zF || objQ19 == c30Var) {
                fd fdVar = new fd(s03VarA3, 3);
                ov0Var4.m0(fdVar);
                obj18 = fdVar;
            }
            dv1 dv1VarD = xp1.A(xp1.s(dv1VarN, (lu0) obj18), ix1Var, z4).d(dv1VarA);
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var4.T);
            l72 l72VarL = ov0Var4.l();
            dv1 dv1VarH = xp1.H(ov0Var4, dv1VarD);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var4.g0();
            if (ov0Var4.S) {
                ov0Var4.k(x30Var);
            } else {
                ov0Var4.p0();
            }
            q73.h(ov0Var4, v20.e, er1VarC);
            q73.h(ov0Var4, v20.d, l72VarL);
            q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var4, v20.g);
            q73.h(ov0Var4, v20.c, dv1VarH);
            dv1 dv1VarK = k22.k(iw2.k(dv1Var4, 20.0f), j9.i);
            boolean zF2 = ov0Var4.f(s03VarA);
            Object objQ20 = ov0Var4.Q();
            Object obj19 = objQ20;
            if (zF2 || objQ20 == c30Var) {
                fd fdVar2 = new fd(s03VarA, 4);
                ov0Var4.m0(fdVar2);
                obj19 = fdVar2;
            }
            dv1 dv1VarK2 = xq1.K(dv1VarK, (lu0) obj19);
            boolean zF3 = ov0Var4.f(s03VarB);
            Object objQ21 = ov0Var4.Q();
            Object obj20 = objQ21;
            if (zF3 || objQ21 == c30Var) {
                fd fdVar3 = new fd(s03VarB, 5);
                ov0Var4.m0(fdVar3);
                obj20 = fdVar3;
            }
            dv1 dv1VarZ = am1.z(dv1VarK2, (lu0) obj20);
            boolean zF4 = ov0Var4.f(s03VarA2);
            Object objQ22 = ov0Var4.Q();
            Object obj21 = objQ22;
            if (zF4 || objQ22 == c30Var) {
                fd fdVar4 = new fd(s03VarA2, 6);
                ov0Var4.m0(fdVar4);
                obj21 = fdVar4;
            }
            dv1 dv1VarS = xp1.s(dv1VarZ, (lu0) obj21);
            if (z4) {
                ov0Var4.c0(1717560674);
                int i9 = i2 & 14;
                jx0 jx0Var4 = jx0Var3;
                boolean zH = (i9 == 4) | ov0Var4.h(jx0Var4);
                Object objQ23 = ov0Var4.Q();
                if (zH || objQ23 == c30Var) {
                    z5 = false;
                    jx0Var = jx0Var4;
                    ey1Var = ey1Var6;
                    ey1Var2 = ey1Var7;
                    j70 j70Var = new j70(z, jx0Var, s52Var3, s52Var5, ey1Var2, ey1Var);
                    s52Var = s52Var5;
                    ov0Var4.m0(j70Var);
                    objQ23 = j70Var;
                } else {
                    jx0Var = jx0Var4;
                    s52Var = s52Var5;
                    ey1Var = ey1Var6;
                    ey1Var2 = ey1Var7;
                    z5 = false;
                }
                rf0 rf0Var = sf0.a;
                ey1 ey1VarL3 = ke0.L((lu0) objQ23, ov0Var4);
                Object objQ24 = ov0Var4.Q();
                if (objQ24 == c30Var) {
                    ha0 ha0Var = new ha0(new f4(ey1VarL3, 22));
                    ov0Var4.m0(ha0Var);
                    objQ24 = ha0Var;
                }
                vf0 vf0Var = (vf0) objQ24;
                Object objQ25 = ov0Var4.Q();
                if (objQ25 == c30Var) {
                    objQ25 = new z33(ix1Var, ey1Var8, ey1Var, ey1Var2, s52Var3, null);
                    ov0Var4.m0(objQ25);
                }
                qu0 qu0Var = (qu0) objQ25;
                boolean z8 = (ov0Var4.f(ey1VarL) ? 1 : 0) | (i9 == 4 ? true : z5 ? 1 : 0) | (ov0Var4.h(jx0Var) ? 1 : 0);
                Object objQ26 = ov0Var4.Q();
                if (z8 || objQ26 == c30Var) {
                    ov0 ov0Var5 = ov0Var4;
                    v33Var4 = v33Var3;
                    a43 a43Var = new a43(z, jx0Var, s52Var, ey1VarL, ey1Var2, ey1Var8, ix1Var, s52Var3, null);
                    ov0Var5.m0(a43Var);
                    objQ26 = a43Var;
                    ov0Var3 = ov0Var5;
                } else {
                    ov0Var3 = ov0Var4;
                    v33Var4 = v33Var3;
                }
                dv1 dv1VarA2 = sf0.a(vf0Var, x32.f, false, null, false, qu0Var, (qu0) objQ26, false, 156);
                ov0Var3.p(z5);
                dv1Var4 = dv1VarA2;
                r12 = z5;
                ov0Var2 = ov0Var3;
            } else {
                ov0 ov0Var6 = ov0Var4;
                v33Var4 = v33Var3;
                r12 = 0;
                ov0Var6.c0(1720499133);
                ov0Var6.p(false);
                ov0Var2 = ov0Var6;
            }
            ws.a(dv1VarS.d(dv1Var4), ov0Var2, r12);
            ov0Var2.p(true);
            dv1Var2 = dv1Var3;
            v33Var2 = v33Var4;
            ov0Var = ov0Var2;
        } else {
            ov0 ov0Var7 = ov0Var4;
            ov0Var7.W();
            dv1Var2 = dv1Var;
            v33Var2 = v33Var;
            ov0Var = ov0Var7;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new zp1(z, lu0Var, dv1Var2, v33Var2, z2, i);
        }
    }

    public static void p0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        o0(byteArrayOutputStream, i, 2);
    }

    public static float q(EdgeEffect edgeEffect, float f, float f2, xb0 xb0Var) {
        float f3 = ph0.a;
        double dG = xb0Var.g() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d2 = ((double) ph0.a) * dG;
        float fExp = (float) (Math.exp((ph0.b / ph0.c) * Math.log(dAbs / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? vb.d(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iP = xq1.P(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iP);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iP);
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[Catch: c61 -> 0x0198, TryCatch #2 {c61 -> 0x0198, blocks: (B:35:0x00be, B:37:0x00c2, B:39:0x00ce, B:52:0x00f4, B:56:0x0123, B:60:0x012b), top: B:99:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0174 -> B:18:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object r(defpackage.sd1 r27, int r28, int r29, defpackage.xb0 r30, defpackage.r60 r31) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc0.r(sd1, int, int, xb0, r60):java.lang.Object");
    }

    public static final boolean s(boolean z, sd1 sd1Var, int i) {
        yd1 yd1Var = (yd1) sd1Var.c;
        if (z) {
            if (sd1Var.c() > i) {
                return true;
            }
            return sd1Var.c() == i && ((t52) yd1Var.e.c).g() > 0;
        }
        if (sd1Var.c() < i) {
            return true;
        }
        return sd1Var.c() == i && ((t52) yd1Var.e.c).g() < 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object t(defpackage.p33 r6, defpackage.oq r7) {
        /*
            boolean r0 = r7 instanceof defpackage.kq2
            if (r0 == 0) goto L13
            r0 = r7
            kq2 r0 = (defpackage.kq2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            kq2 r0 = new kq2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p33 r6 = r0.e
            defpackage.ee0.J(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ee0.J(r7)
        L31:
            r0.e = r6
            r0.g = r2
            q92 r7 = defpackage.q92.f
            java.lang.Object r7 = r6.c(r7, r0)
            z70 r1 = defpackage.z70.e
            if (r7 != r1) goto L40
            return r1
        L40:
            p92 r7 = (defpackage.p92) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            x92 r5 = (defpackage.x92) r5
            boolean r5 = defpackage.mh0.o(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc0.t(p33, oq):java.lang.Object");
    }

    public static final Object u(ca2 ca2Var, xv1 xv1Var, s63 s63Var, q60 q60Var) {
        q33 q33Var = (q33) ca2Var;
        q33Var.getClass();
        Object objL = mh0.l(ca2Var, new lq2(new q01(xp1.O(q33Var).F), xv1Var, s63Var, null), q60Var);
        return objL == z70.e ? objL : mf3.a;
    }

    public static final int v(int i, gy1 gy1Var) {
        int i2 = gy1Var.g - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = gy1Var.e;
            int i5 = ((d51) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((d51) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final pe2 w(pa1 pa1Var) {
        pa1 pa1VarB = pa1Var.B();
        return pa1VarB != null ? pa1VarB.d0(pa1Var, true) : new pe2(0.0f, 0.0f, (int) (pa1Var.f0() >> 32), (int) (pa1Var.f0() & 4294967295L));
    }

    public static final pe2 x(pa1 pa1Var, boolean z) {
        pa1 pa1VarF = F(pa1Var);
        float fF0 = (int) (pa1VarF.f0() >> 32);
        float fF1 = (int) (pa1VarF.f0() & 4294967295L);
        pe2 pe2VarD0 = pa1VarF.d0(pa1Var, z);
        float f = pe2VarD0.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fF0) {
                f = fF0;
            }
        }
        float f2 = pe2VarD0.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fF1) {
                f2 = fF1;
            }
        }
        float f3 = pe2VarD0.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fF0) {
                fF0 = f3;
            }
            f3 = fF0;
        }
        float f4 = pe2VarD0.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fF1) {
                fF1 = f5;
            }
            f4 = fF1;
        }
        if (f == f3 || f2 == f4) {
            return pe2.e;
        }
        long jZ = pa1VarF.z((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jZ2 = pa1VarF.z((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jZ3 = pa1VarF.z((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jZ4 = pa1VarF.z((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jZ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jZ4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jZ3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jZ & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jZ2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jZ4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jZ3 & 4294967295L));
        return new pe2(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static int y(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, rn.b(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static byte[] z(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }
}
