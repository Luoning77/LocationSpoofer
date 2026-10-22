package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.model.AppMapType;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ym3 {
    public static final lz A;
    public static final lz B;
    public static final lz C;
    public static final lz D;
    public static final lz E;
    public static final lz F;
    public static final lz G;
    public static final lz H;
    public static final lz I;
    public static final lz J;
    public static final lz K;
    public static final lz L;
    public static final lz M;
    public static final lz N;
    public static final lz O;
    public static final lz P;
    public static final lz Q;
    public static final lz R;
    public static final lz S;
    public static final lz T;
    public static final lz U;
    public static final lz V;
    public static final lz W;
    public static final lz X;
    public static final lz Y;
    public static final lz Z;
    public static final lz a0;
    public static final lz b0;
    public static final k91 c0;
    public static final Object d0;
    public static final lz y;
    public static final cu2 z;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final p10 e = new p10(new s10(8), false, -724272378);
    public static final p10 f = new p10(new r10(12), false, -1267947615);
    public static final p10 g = new p10(new r10(13), false, -998749776);
    public static final p10 h = new p10(new r10(14), false, -1630426343);
    public static final p10 i = new p10(new r10(25), false, 1693009180);
    public static final p10 j = new p10(new c20(11), false, 1083281033);
    public static final p10 k = new p10(new d20(3), false, -1798333039);
    public static final p10 l = new p10(new d20(4), false, 577556559);
    public static final p10 m = new p10(new d20(5), false, 1325349275);
    public static final p10 n = new p10(new d20(6), false, 509302045);
    public static final p10 o = new p10(new b20(26), false, 53274210);
    public static final p10 p = new p10(new b20(27), false, -354749405);
    public static final k92 q = new k92(null, new w82());
    public static final lz r = lz.s;
    public static final cu2 s = cu2.h;
    public static final lz t = lz.t;
    public static final float u = 0.38f;
    public static final float v = 6.0f;
    public static final float w = 1.0f;
    public static final c30 x = new c30(15);

    static {
        lz lzVar = lz.m;
        y = lzVar;
        z = cu2.f;
        lz lzVar2 = lz.i;
        A = lzVar2;
        B = lzVar2;
        C = lzVar2;
        D = lzVar2;
        E = lzVar2;
        F = lzVar2;
        lz lzVar3 = lz.e;
        G = lzVar3;
        H = lzVar2;
        I = lzVar3;
        lz lzVar4 = lz.j;
        J = lzVar4;
        K = lzVar3;
        L = lzVar3;
        M = lzVar3;
        N = lzVar2;
        O = lzVar;
        P = lzVar4;
        Q = lzVar;
        R = lzVar4;
        S = lzVar4;
        T = lzVar2;
        U = lzVar4;
        V = lzVar4;
        W = lzVar4;
        X = lzVar4;
        Y = lzVar4;
        Z = lz.k;
        a0 = lzVar4;
        b0 = lzVar4;
        c0 = new k91(20);
        d0 = new Object();
    }

    public static final String A(js2 js2Var, Resources resources) {
        int iV;
        es2 es2Var = js2Var.d;
        es2 es2Var2 = js2Var.d;
        Object objG = es2Var.e.g(os2.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        zx1 zx1Var = es2Var2.e;
        Object objG2 = zx1Var.g(os2.K);
        if (objG2 == null) {
            objG2 = null;
        }
        xa3 xa3Var = (xa3) objG2;
        Object objG3 = zx1Var.g(os2.z);
        if (objG3 == null) {
            objG3 = null;
        }
        vh2 vh2Var = (vh2) objG3;
        if (xa3Var != null) {
            int iOrdinal = xa3Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b81.d();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(2131624560);
                    }
                } else if (vh2Var != null && vh2Var.a == 2 && objG == null) {
                    objG = resources.getString(2131625050);
                }
            } else if (vh2Var != null && vh2Var.a == 2 && objG == null) {
                objG = resources.getString(2131625051);
            }
        }
        Object objG4 = zx1Var.g(os2.J);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((vh2Var == null || vh2Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2131624972) : resources.getString(2131624810);
            }
        }
        Object objG5 = zx1Var.g(os2.c);
        if (objG5 == null) {
            objG5 = null;
        }
        oc2 oc2Var = (oc2) objG5;
        if (oc2Var != null) {
            if (oc2Var != oc2.d) {
                if (objG == null) {
                    fy fyVar = oc2Var.b;
                    float f2 = fyVar.f;
                    float f3 = fyVar.e;
                    float fFloatValue = Float.valueOf(f2).floatValue() - Float.valueOf(f3).floatValue() == 0.0f ? 0.0f : (oc2Var.a - Float.valueOf(f3).floatValue()) / (Float.valueOf(fyVar.f).floatValue() - Float.valueOf(f3).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iV = 0;
                    } else {
                        iV = fFloatValue == 1.0f ? 100 : mh0.v(Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objG = resources.getString(2131625114, Integer.valueOf(iV));
                }
            } else if (objG == null) {
                objG = resources.getString(2131624559);
            }
        }
        rs2 rs2Var = os2.G;
        if (zx1Var.c(rs2Var)) {
            zx1 zx1Var2 = new js2(js2Var.a, true, js2Var.c, es2Var2).k().e;
            Object objG6 = zx1Var2.g(os2.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = zx1Var2.g(os2.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = zx1Var2.g(rs2Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(2131625049);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final dj B(js2 js2Var) {
        Object objG = js2Var.d.e.g(os2.G);
        if (objG == null) {
            objG = null;
        }
        dj djVar = (dj) objG;
        Object objG2 = js2Var.d.e.g(os2.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return djVar == null ? list != null ? (dj) zy.o0(list) : null : djVar;
    }

    public static final int C(bt2 bt2Var, t61 t61Var, String str) {
        bt2Var.getClass();
        str.getClass();
        J(t61Var, bt2Var);
        int iA = bt2Var.a(str);
        if (iA != -3 || !t61Var.a.i) {
            return iA;
        }
        t1 t1Var = t61Var.c;
        m5 m5Var = new m5(16, bt2Var, t61Var);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) t1Var.f;
        Map map = (Map) concurrentHashMap.get(bt2Var);
        c30 c30Var = x;
        Object obj = map != null ? map.get(c30Var) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = m5Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(bt2Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(bt2Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c30Var, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean D(t61 t61Var, bt2 bt2Var) {
        bt2Var.getClass();
        if (t61Var.a.b) {
            return true;
        }
        List annotations = bt2Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof m71) {
                return true;
            }
        }
        return false;
    }

    public static int E(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return tz.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean F(js2 js2Var, Resources resources) {
        Object objG = js2Var.d.e.g(os2.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !am1.C(js2Var) && (js2Var.d.g || (js2Var.p() && ((list != null ? (String) zy.o0(list) : null) != null || B(js2Var) != null || A(js2Var, resources) != null || z(js2Var))));
    }

    public static final dv1 G(dv1 dv1Var, w81 w81Var, bd1 bd1Var, x32 x32Var, boolean z2) {
        return dv1Var.d(new cd1(w81Var, bd1Var, x32Var, z2));
    }

    public static float H(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final ArrayList I(List list, au0 au0Var) {
        a01 a01Var;
        if (!((Boolean) au0Var.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zq1 zq1Var = (zq1) list.get(i2);
            Object objA = zq1Var.A();
            objA.getClass();
            kb2 kb2Var = ((h93) objA).a;
            a93 a93Var = (a93) kb2Var.e;
            cj cjVar = (cj) kb2Var.f;
            x83 x83Var = (x83) a93Var.a.getValue();
            if (x83Var == null) {
                a01Var = new a01(0, 0, new h63(3));
            } else {
                cj cjVarC = a93.c(cjVar, x83Var);
                if (cjVarC == null) {
                    a01Var = new a01(0, 0, new h63(4));
                } else {
                    l41 l41VarX = mh0.X(x83Var.i(cjVarC.b, cjVarC.c).d());
                    a01Var = new a01(l41VarX.d(), l41VarX.b(), new ol2(l41VarX, 13));
                }
            }
            int i3 = a01Var.e;
            int i4 = a01Var.f;
            arrayList.add(new i52(zq1Var.s(da0.t(i3, i3, i4, i4)), (au0) a01Var.g));
        }
        return arrayList;
    }

    public static final void J(t61 t61Var, bt2 bt2Var) {
        bt2Var.getClass();
        t61Var.getClass();
        o51.f(bt2Var.c(), u13.e);
    }

    public static void K(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static final jg L(au0 au0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        View view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
        boolean zF = ov0Var.f(view);
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (zF || objQ == c30Var) {
            objQ = new jg(view, null, au0Var);
            ov0Var.m0(objQ);
        }
        jg jgVar = (jg) objQ;
        boolean zH = ov0Var.h(jgVar);
        Object objQ2 = ov0Var.Q();
        if (zH || objQ2 == c30Var) {
            objQ2 = new cg(jgVar, 3);
            ov0Var.m0(objQ2);
        }
        oi0.a(jgVar, (lu0) objQ2, ov0Var);
        return jgVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int M(mp2 mp2Var, int i2) {
        int i3;
        int[] iArr = mp2Var.j;
        int i4 = i2 + 1;
        int length = mp2Var.i.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            i3 = (i5 + length) >>> 1;
            int i6 = iArr[i3];
            if (i6 < i4) {
                i5 = i3 + 1;
            } else {
                if (i6 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                length = i3 - 1;
            }
        }
        i3 = (-i5) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final dv1 N(dv1 dv1Var, dj djVar, q93 q93Var, lu0 lu0Var, int i2, boolean z2, int i3, int i4, lq0 lq0Var, List list, lu0 lu0Var2, hq2 hq2Var, lu0 lu0Var3) {
        if (hq2Var == null) {
            return dv1Var.d(av1.a).d(new p53(djVar, q93Var, lq0Var, lu0Var, i2, z2, i3, i4, list, lu0Var2, lu0Var3));
        }
        return dv1Var.d(hq2Var.j).d(new tp2(djVar, q93Var, lq0Var, lu0Var, i2, z2, i3, i4, list, lu0Var2, hq2Var));
    }

    public static final void O() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188 A[Catch: all -> 0x0185, TRY_ENTER, TryCatch #24 {all -> 0x0185, blocks: (B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d), top: B:273:0x0164, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0199 A[Catch: IllegalStateException -> 0x017f, IOException -> 0x0181, FileNotFoundException -> 0x0183, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0183, IOException -> 0x0181, IllegalStateException -> 0x017f, blocks: (B:86:0x015c, B:91:0x017a, B:109:0x0199, B:107:0x0196, B:106:0x0193, B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d, B:103:0x018e), top: B:293:0x015c, inners: #24, #31 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01af  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d9 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #8 {all -> 0x01e7, blocks: (B:124:0x01cd, B:126:0x01d9, B:135:0x01ea), top: B:256:0x01cd, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x01e7, blocks: (B:124:0x01cd, B:126:0x01d9, B:135:0x01ea), top: B:256:0x01cd, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x0211  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237 A[Catch: all -> 0x0275, TryCatch #18 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:268:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0241 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #18 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:268:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02de  */
    /* JADX WARN: Code duplicated, block: B:267:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0246 A[EDGE_INSN: B:294:0x0246->B:165:0x0246 BREAK  A[LOOP:0: B:161:0x023b->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #16 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:267:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #16 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:267:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0170 A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #24 {all -> 0x0185, blocks: (B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d), top: B:273:0x0164, outer: #34 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.io.Serializable, nc0[]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    public static void P(Context context, Executor executor, lc2 lc2Var, boolean z2) {
        boolean z3;
        ?? B2;
        ?? r9;
        nc0[] nc0VarArrL;
        nc0[] nc0VarArr;
        lc2 lc2Var2;
        nc0[] nc0VarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z4;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i2;
        ?? r10;
        boolean z5;
        ?? byteArrayOutputStream;
        ?? r11;
        gc0 gc0Var;
        ?? r12;
        FileInputStream fileInputStreamB;
        ?? r13;
        ?? r14;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j2 == packageInfo.lastUpdateTime;
                            if (z6) {
                                lc2Var.g(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    nc2.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = zm3.G;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            gc0 gc0Var2 = new gc0(assets, executor, lc2Var, name, file2);
            byte[] bArr5 = (byte[]) gc0Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            gc0Var2.a = true;
                            B2 = gc0Var2.b(assets, "dexopt/baseline.prof");
                            if (B2 != 0) {
                                if (Arrays.equals(bArr4, wc0.Z(B2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                nc0VarArrL = zm3.L(B2, wc0.Z(B2, 4), (String) gc0Var2.g);
                                B2.close();
                                r9 = nc0VarArrL;
                                gc0Var2.h = r9;
                            }
                            nc0VarArr = (nc0[]) gc0Var2.h;
                            if (nc0VarArr != null) {
                                B2 = "dexopt/baseline.profm";
                                fileInputStreamB = gc0Var2.b(assets, "dexopt/baseline.profm");
                                r12 = B2;
                                if (fileInputStreamB == null) {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r12 = B2;
                                    }
                                    gc0Var = null;
                                    B2 = r12;
                                } else {
                                    if (Arrays.equals(zm3.H, wc0.Z(fileInputStreamB, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrZ = wc0.Z(fileInputStreamB, 4);
                                    gc0Var2.h = zm3.I(fileInputStreamB, bArrZ, bArr5, nc0VarArr);
                                    fileInputStreamB.close();
                                    gc0Var = gc0Var2;
                                    B2 = bArrZ;
                                }
                                if (gc0Var != null) {
                                    gc0Var2 = gc0Var;
                                }
                            }
                            lc2Var2 = (lc2) gc0Var2.c;
                            nc0VarArr2 = (nc0[]) gc0Var2.h;
                            bArr = (byte[]) gc0Var2.d;
                            r7 = B2;
                            r7 = B2;
                            if (nc0VarArr2 != null) {
                                byteArrayOutputStream = gc0Var2.a;
                                if (byteArrayOutputStream != 0) {
                                    fo.n("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (zm3.U(byteArrayOutputStream, bArr, nc0VarArr2)) {
                                    gc0Var2.e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r11 = byteArrayOutputStream;
                                    gc0Var2.h = null;
                                    r7 = r11;
                                } else {
                                    lc2Var2.g(5, null);
                                    gc0Var2.h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = (byte[]) gc0Var2.e;
                            if (bArr2 != null) {
                                if (gc0Var2.a) {
                                    fo.n("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream((File) gc0Var2.f);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr3);
                                            if (i2 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i2);
                                        }
                                        r10 = 1;
                                        gc0Var2.c(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        gc0Var2.e = null;
                                        gc0Var2.h = null;
                                        z4 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z4 = false;
                            r10 = 1;
                            if (z4) {
                                K(packageInfo, filesDir);
                            }
                            z5 = z4;
                            r13 = r10;
                        } else {
                            gc0Var2.c(4, null);
                        }
                    } catch (IOException unused2) {
                        z3 = true;
                        gc0Var2.c(4, null);
                    }
                } else if (file2.canWrite()) {
                    gc0Var2.a = true;
                    try {
                        B2 = gc0Var2.b(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        lc2Var.g(6, e2);
                        B2 = 0;
                    } catch (IOException e3) {
                        lc2Var.g(7, e3);
                        B2 = 0;
                    }
                    try {
                        if (B2 != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, wc0.Z(B2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    nc0VarArrL = zm3.L(B2, wc0.Z(B2, 4), (String) gc0Var2.g);
                                    try {
                                        B2.close();
                                        r9 = nc0VarArrL;
                                    } catch (IOException e4) {
                                        lc2Var.g(7, e4);
                                        r9 = nc0VarArrL;
                                    }
                                    gc0Var2.h = r9;
                                } catch (IOException e5) {
                                    lc2Var.g(7, e5);
                                    try {
                                        B2.close();
                                    } catch (IOException e6) {
                                        lc2Var.g(7, e6);
                                    }
                                    r9 = 0;
                                }
                            } catch (IllegalStateException e7) {
                                lc2Var.g(8, e7);
                                B2.close();
                                r9 = 0;
                            }
                        }
                        nc0VarArr = (nc0[]) gc0Var2.h;
                        if (nc0VarArr != null && (B2 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                B2 = "dexopt/baseline.profm";
                                fileInputStreamB = gc0Var2.b(assets, "dexopt/baseline.profm");
                                r12 = B2;
                                if (fileInputStreamB == null) {
                                    try {
                                        if (Arrays.equals(zm3.H, wc0.Z(fileInputStreamB, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrZ2 = wc0.Z(fileInputStreamB, 4);
                                        gc0Var2.h = zm3.I(fileInputStreamB, bArrZ2, bArr5, nc0VarArr);
                                        fileInputStreamB.close();
                                        gc0Var = gc0Var2;
                                        B2 = bArrZ2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamB.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r12 = B2;
                                    }
                                    gc0Var = null;
                                    B2 = r12;
                                }
                            } catch (FileNotFoundException e8) {
                                lc2Var.g(9, e8);
                                r12 = B2;
                                gc0Var = null;
                                B2 = r12;
                            } catch (IOException e9) {
                                lc2Var.g(7, e9);
                                r12 = B2;
                                gc0Var = null;
                                B2 = r12;
                            } catch (IllegalStateException e10) {
                                gc0Var2.h = null;
                                lc2Var.g(8, e10);
                                r12 = B2;
                                gc0Var = null;
                                B2 = r12;
                            }
                            if (gc0Var != null) {
                                gc0Var2 = gc0Var;
                            }
                        }
                        lc2Var2 = (lc2) gc0Var2.c;
                        nc0VarArr2 = (nc0[]) gc0Var2.h;
                        bArr = (byte[]) gc0Var2.d;
                        r7 = B2;
                        r7 = B2;
                        if (nc0VarArr2 != null && bArr != null) {
                            byteArrayOutputStream = gc0Var2.a;
                            if (byteArrayOutputStream != 0) {
                                fo.n("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (zm3.U(byteArrayOutputStream, bArr, nc0VarArr2)) {
                                        lc2Var2.g(5, null);
                                        gc0Var2.h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        gc0Var2.e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r11 = byteArrayOutputStream;
                                        gc0Var2.h = null;
                                        r7 = r11;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e11) {
                                lc2Var2.g(7, e11);
                                r11 = byteArrayOutputStream;
                            } catch (IllegalStateException e12) {
                                lc2Var2.g(8, e12);
                                r11 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = (byte[]) gc0Var2.e;
                        if (bArr2 != null) {
                            z4 = false;
                            r10 = 1;
                        } else {
                            try {
                                if (gc0Var2.a) {
                                    fo.n("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) gc0Var2.f);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i2 = byteArrayInputStream.read(bArr3);
                                                                                    if (i2 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i2);
                                                                                    }
                                                                                }
                                                                                r10 = 1;
                                                                                gc0Var2.c(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                gc0Var2.e = null;
                                                                                gc0Var2.h = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        gc0Var2.c(6, e);
                                        r8 = r7;
                                        gc0Var2.e = null;
                                        gc0Var2.h = null;
                                        z4 = false;
                                        r10 = r8;
                                    } catch (IOException e14) {
                                        e = e14;
                                        gc0Var2.c(7, e);
                                        r8 = r7;
                                        gc0Var2.e = null;
                                        gc0Var2.h = null;
                                        z4 = false;
                                        r10 = r8;
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    r7 = 1;
                                    gc0Var2.c(6, e);
                                    r8 = r7;
                                    gc0Var2.e = null;
                                    gc0Var2.h = null;
                                    z4 = false;
                                    r10 = r8;
                                } catch (IOException e16) {
                                    e = e16;
                                    r7 = 1;
                                    gc0Var2.c(7, e);
                                    r8 = r7;
                                    gc0Var2.e = null;
                                    gc0Var2.h = null;
                                    z4 = false;
                                    r10 = r8;
                                }
                            } catch (Throwable th23) {
                                gc0Var2.e = null;
                                gc0Var2.h = null;
                                throw th23;
                            }
                        }
                        if (z4) {
                            K(packageInfo, filesDir);
                        }
                        z5 = z4;
                        r13 = r10;
                    } catch (Throwable th24) {
                        try {
                            B2.close();
                            throw th24;
                        } catch (IOException e17) {
                            lc2Var.g(7, e17);
                            throw th24;
                        }
                    }
                } else {
                    gc0Var2.c(4, null);
                }
                if (z5 || !z2) {
                    r14 = 0;
                } else {
                    r14 = r13;
                }
                nc2.c(context, r14);
            }
            gc0Var2.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z3 = true;
            z5 = false;
            r13 = z3;
            if (z5) {
                r14 = 0;
            } else {
                r14 = 0;
            }
            nc2.c(context, r14);
        } catch (PackageManager.NameNotFoundException e18) {
            lc2Var.g(7, e18);
            nc2.c(context, false);
        }
    }

    public static float Q() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(ul1 ul1Var, AppState appState, au0 au0Var, au0 au0Var2, f30 f30Var, int i2) {
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1886138992);
        int i3 = i2 | (ov0Var.h(ul1Var) ? 4 : 2) | (ov0Var.h(appState) ? 32 : 16) | (ov0Var.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 1043) != 1042)) {
            boolean zIsSpoofingActive = appState.isSpoofingActive();
            av1 av1Var = av1.a;
            if (zIsSpoofingActive) {
                ov0Var.c0(1090631683);
                s03 s03VarA = aw2.a(((kz) ov0Var.j(mz.a)).w, o51.I(300, 6, null), ov0Var, 432, 8);
                boolean zH = ov0Var.h(ul1Var);
                Object objQ = ov0Var.Q();
                if (zH || objQ == d30.a) {
                    objQ = new m6(ul1Var, i4);
                    ov0Var.m0(objQ);
                }
                dv1 dv1VarG = iw2.g(iw2.e(av1Var, 1.0f), 50.0f);
                bj2 bj2VarA = cj2.a(14.0f);
                b52 b52Var = hu.a;
                n51.a((au0) objQ, dv1VarG, false, bj2VarA, hu.a(((hz) s03VarA.getValue()).a, 0L, 0L, 0L, ov0Var, 14), null, null, null, xp1.c, ov0Var, 805306416, 484);
                ov0Var = ov0Var;
                ov0Var.p(false);
            } else {
                ov0Var.c0(1091425407);
                boolean z2 = !appState.isSavingConfig();
                dv1 dv1VarG2 = iw2.g(iw2.e(av1Var, 1.0f), 50.0f);
                bj2 bj2VarA2 = cj2.a(14.0f);
                b52 b52Var2 = hu.a;
                n51.a(au0Var2, dv1VarG2, z2, bj2VarA2, hu.a(bk.g, 0L, 0L, 0L, ov0Var, 14), null, null, null, sb.a0(-1002656988, new n6(appState, i4), ov0Var), ov0Var, ((i3 >> 9) & 14) | 805306416, 480);
                ov0Var = ov0Var;
                ov0Var.p(false);
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lr1(ul1Var, appState, au0Var, au0Var2, i2);
        }
    }

    public static final void b(String str, x01 x01Var, au0 au0Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        au0 au0Var2;
        str.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1866436746);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.f(x01Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var.h(p10Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            au0Var2 = au0Var;
            sb.F(au0Var2, null, sb.a0(-1879574529, new qn(str, p10Var, x01Var, i4), ov0Var), ov0Var, ((i3 >> 6) & 14) | 384, 2);
        } else {
            au0Var2 = au0Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(str, x01Var, au0Var2, p10Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[PHI: r1 r2
      0x00b9: PHI (r1v18 int) = (r1v12 int), (r1v10 int), (r1v19 int) binds: [B:58:0x00c2, B:52:0x00b6, B:53:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r2v20 au0) = (r2v15 au0), (r2v13 au0), (r2v13 au0) binds: [B:58:0x00c2, B:52:0x00b6, B:53:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void c(final String str, final String str2, final x01 x01Var, final String str3, final au0 au0Var, au0 au0Var2, String str4, f30 f30Var, final int i2, final int i3) {
        au0 au0Var3;
        int i4;
        int i5;
        String str5;
        int i6;
        int i7;
        boolean z2;
        final String str6;
        final au0 au0Var4;
        ee2 ee2VarT;
        au0 au0Var5;
        String str7;
        str.getClass();
        str2.getClass();
        str3.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(547897931);
        int i8 = (ov0Var.f(str) ? 4 : 2) | i2 | (ov0Var.f(str2) ? 32 : 16) | (ov0Var.f(x01Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(str3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if ((i2 & 24576) == 0) {
            i8 |= ov0Var.h(au0Var) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            au0Var3 = au0Var2;
            int i9 = ov0Var.h(au0Var3) ? 131072 : 65536;
            i4 = i8 | i9;
            i5 = i3 & 64;
            if (i5 != 0) {
                i7 = i4 | 1572864;
                str5 = str4;
            } else {
                str5 = str4;
                if (ov0Var.f(str5)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i7 = i4 | i6;
            }
            if ((599187 & i7) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var.T(i7 & 1, z2)) {
                ov0Var.Y();
                if ((i2 & 1) != 0 || ov0Var.B()) {
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                        au0Var3 = au0Var;
                    }
                    if (i5 != 0) {
                        au0Var5 = au0Var3;
                        str7 = null;
                    }
                    ov0Var.q();
                    b(str, x01Var, au0Var, sb.a0(-1610565706, new b3(str2, au0Var5, str7, au0Var, str3, 1), ov0Var), ov0Var, (i7 & 14) | 3072 | ((i7 >> 3) & 112) | ((i7 >> 6) & 896));
                    au0Var4 = au0Var5;
                    str6 = str7;
                } else {
                    ov0Var.W();
                    if ((i3 & 32) != 0) {
                        i7 &= -458753;
                    }
                }
                au0Var5 = au0Var3;
                str7 = str5;
                ov0Var.q();
                b(str, x01Var, au0Var, sb.a0(-1610565706, new b3(str2, au0Var5, str7, au0Var, str3, 1), ov0Var), ov0Var, (i7 & 14) | 3072 | ((i7 >> 3) & 112) | ((i7 >> 6) & 896));
                au0Var4 = au0Var5;
                str6 = str7;
            } else {
                ov0Var.W();
                str6 = str5;
                au0Var4 = au0Var3;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: pn
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ym3.c(str, str2, x01Var, str3, au0Var, au0Var4, str6, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        au0Var3 = au0Var2;
        i4 = i8 | i9;
        i5 = i3 & 64;
        if (i5 != 0) {
            i7 = i4 | 1572864;
            str5 = str4;
        } else {
            str5 = str4;
            if (ov0Var.f(str5)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i7 = i4 | i6;
        }
        if ((599187 & i7) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ov0Var.T(i7 & 1, z2)) {
            ov0Var.Y();
            if ((i2 & 1) != 0) {
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    au0Var3 = au0Var;
                }
                if (i5 != 0) {
                    au0Var5 = au0Var3;
                    str7 = null;
                } else {
                    au0Var5 = au0Var3;
                    str7 = str5;
                }
            } else {
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                    au0Var3 = au0Var;
                }
                if (i5 != 0) {
                    au0Var5 = au0Var3;
                    str7 = null;
                } else {
                    au0Var5 = au0Var3;
                    str7 = str5;
                }
            }
            ov0Var.q();
            b(str, x01Var, au0Var, sb.a0(-1610565706, new b3(str2, au0Var5, str7, au0Var, str3, 1), ov0Var), ov0Var, (i7 & 14) | 3072 | ((i7 >> 3) & 112) | ((i7 >> 6) & 896));
            au0Var4 = au0Var5;
            str6 = str7;
        } else {
            ov0Var.W();
            str6 = str5;
            au0Var4 = au0Var3;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: pn
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ym3.c(str, str2, x01Var, str3, au0Var, au0Var4, str6, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public static final void d(final dj djVar, final dv1 dv1Var, final q93 q93Var, final lu0 lu0Var, final int i2, final boolean z2, final int i3, final int i4, final Map map, f30 f30Var, final int i5, final int i6) {
        int i7;
        int i8;
        ov0 ov0Var;
        hq2 hq2Var;
        boolean z3;
        boolean z4;
        int i9;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1343466571);
        if ((i5 & 6) == 0) {
            i7 = (ov0Var2.f(djVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= ov0Var2.f(dv1Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= ov0Var2.f(q93Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i5 & 3072) == 0) {
            i7 |= ov0Var2.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i5 & 24576) == 0) {
            i7 |= ov0Var2.d(i2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= ov0Var2.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= ov0Var2.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= ov0Var2.d(i4) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= ov0Var2.h(map) ? 67108864 : 33554432;
        }
        int i10 = i7 | 805306368;
        if ((i6 & 6) == 0) {
            i8 = i6 | ((i6 & 8) == 0 ? ov0Var2.f(null) : ov0Var2.h(null) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if (ov0Var2.T(i10 & 1, ((i10 & 306783379) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            vd0.K(i4, i3);
            er2 er2Var = (er2) ov0Var2.j(fr2.a);
            c30 c30Var = d30.a;
            if (er2Var != null) {
                ov0Var2.c0(1588268245);
                long j2 = ((i93) ov0Var2.j(j93.a)).b;
                Object[] objArr = {er2Var};
                z92 z92Var = new z92(2, new s5(er2Var, 3), new v1(17));
                boolean zH = ov0Var2.h(er2Var);
                Object objQ = ov0Var2.Q();
                if (zH || objQ == c30Var) {
                    i9 = 0;
                    objQ = new yq(er2Var, i9);
                    ov0Var2.m0(objQ);
                } else {
                    i9 = 0;
                }
                long jLongValue = ((Number) wc0.d0(objArr, z92Var, (au0) objQ, ov0Var2, i9)).longValue();
                boolean zE = ov0Var2.e(jLongValue) | ov0Var2.f(er2Var) | ov0Var2.e(j2);
                Object objQ2 = ov0Var2.Q();
                if (zE || objQ2 == c30Var) {
                    objQ2 = new hq2(jLongValue, er2Var, j2);
                    ov0Var2.m0(objQ2);
                }
                hq2Var = (hq2) objQ2;
                ov0Var2.p(false);
            } else {
                ov0Var2.c0(1588759409);
                ov0Var2.p(false);
                hq2Var = null;
            }
            i52 i52Var = hj.a;
            int length = djVar.f.length();
            List list = djVar.e;
            if (list == null) {
                z3 = false;
                z4 = false;
                break;
            }
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z3 = false;
                    z4 = false;
                    break;
                }
                cj cjVar = (cj) list.get(i11);
                if ((cjVar.a instanceof h13) && "androidx.compose.foundation.text.inlineContent".equals(cjVar.d)) {
                    z3 = false;
                    if (ej.b(0, length, cjVar.b, cjVar.c)) {
                        z4 = true;
                        break;
                    }
                }
                i11++;
            }
            boolean zY = ig0.y(djVar);
            lq0 lq0Var = (lq0) ov0Var2.j(z30.k);
            if (z4 || zY) {
                boolean z5 = z3;
                int i12 = i8;
                hq2 hq2Var2 = hq2Var;
                ov0Var2.c0(1590022070);
                boolean z6 = (i10 & 14) == 4 ? true : z5;
                Object objQ3 = ov0Var2.Q();
                if (z6 || objQ3 == c30Var) {
                    objQ3 = ke0.H(djVar);
                    ov0Var2.m0(objQ3);
                }
                ey1 ey1Var = (ey1) objQ3;
                dj djVar2 = (dj) ey1Var.getValue();
                boolean zF = ov0Var2.f(ey1Var);
                Object objQ4 = ov0Var2.Q();
                if (zF || objQ4 == c30Var) {
                    objQ4 = new f4(ey1Var, 13);
                    ov0Var2.m0(objQ4);
                }
                int i13 = i10 << 6;
                ov0Var = ov0Var2;
                j(dv1Var, djVar2, lu0Var, z4, map, q93Var, i2, z2, i3, i4, lq0Var, hq2Var2, (lu0) objQ4, ov0Var, ((i10 >> 3) & 910) | ((i10 >> 12) & 57344) | ((i10 << 9) & 458752) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), ((i12 << 12) & 57344) | ((i10 >> 21) & 896));
                ov0Var.p(false);
            } else {
                ov0Var2.c0(1589006262);
                gr.a(djVar, q93Var, lq0Var, null, ov0Var2);
                dv1 dv1VarN = N(dv1Var, djVar, q93Var, lu0Var, i2, z2, i3, i4, lq0Var, null, null, hq2Var, null);
                lc lcVar = lc.f;
                int iHashCode = Long.hashCode(ov0Var2.T);
                dv1 dv1VarH = xp1.H(ov0Var2, dv1VarN);
                l72 l72VarL = ov0Var2.l();
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, v20.e, lcVar);
                q73.h(ov0Var2, v20.d, l72VarL);
                q73.g(ov0Var2, v20.g);
                q73.h(ov0Var2, v20.c, dv1VarH);
                q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                ov0Var2.p(true);
                ov0Var2.p(false);
                ov0Var = ov0Var2;
            }
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: zq
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ym3.d(djVar, dv1Var, q93Var, lu0Var, i2, z2, i3, i4, map, (f30) obj, wc0.m0(i5 | 1), wc0.m0(i6));
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:101:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x015b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0187  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:133:0x020a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0229  */
    /* JADX WARN: Code duplicated, block: B:137:0x0275  */
    /* JADX WARN: Code duplicated, block: B:138:0x0279  */
    /* JADX WARN: Code duplicated, block: B:140:0x029e  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x010d  */
    public static final void e(final String str, final dv1 dv1Var, final q93 q93Var, int i2, boolean z2, final int i3, int i4, f30 f30Var, final int i5, final int i6) {
        int i7;
        q93 q93Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zH;
        int i15;
        boolean z3;
        final boolean z4;
        final int i16;
        final int i17;
        ee2 ee2VarT;
        boolean z5;
        er2 er2Var;
        hq2 hq2Var;
        final lq0 lq0Var;
        Executor executor;
        lq0 lq0Var2;
        boolean z6;
        dv1 dv1VarN;
        x30 x30Var;
        long j2;
        boolean zH2;
        Object objQ;
        long jLongValue;
        boolean zE;
        Object objQ2;
        int i18;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (ov0Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            q93Var2 = q93Var;
            i7 |= ov0Var.f(q93Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        } else {
            q93Var2 = q93Var;
        }
        hq2 hq2Var2 = null;
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i7 |= ov0Var.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i19 = i6 & 16;
        if (i19 == 0) {
            if ((i5 & 24576) == 0) {
                i8 = i2;
                i7 |= ov0Var.d(i8) ? 16384 : 8192;
            }
            i9 = i6 & 32;
            if (i9 != 0) {
                if ((196608 & i5) == 0) {
                    if (ov0Var.g(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i7 |= i10;
                }
                if ((1572864 & i5) == 0) {
                    if (ov0Var.d(i3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i7 |= i18;
                }
                i11 = i6 & WorkQueueKt.BUFFER_CAPACITY;
                if (i11 != 0) {
                    if ((12582912 & i5) == 0) {
                        i12 = i4;
                        if (ov0Var.d(i12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i7 |= i13;
                    }
                    i14 = i7 | 100663296;
                    if ((i6 & 512) != 0) {
                        i14 = i7 | 905969664;
                    } else if ((805306368 & i5) == 0) {
                        if ((1073741824 & i5) == 0) {
                            zH = ov0Var.f(null);
                        } else {
                            zH = ov0Var.h(null);
                        }
                        if (zH) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i14 |= i15;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (ov0Var.T(i14 & 1, z3)) {
                        if (i19 != 0) {
                            i8 = 1;
                        }
                        if (i9 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i11 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i12;
                        }
                        vd0.K(i17, i3);
                        er2Var = (er2) ov0Var.j(fr2.a);
                        if (er2Var != null) {
                            ov0Var.c0(356423075);
                            j2 = ((i93) ov0Var.j(j93.a)).b;
                            Object[] objArr = {er2Var};
                            z92 z92Var = new z92(2, new s5(er2Var, 3), new v1(17));
                            zH2 = ov0Var.h(er2Var);
                            objQ = ov0Var.Q();
                            c30 c30Var = d30.a;
                            if (zH2 || objQ == c30Var) {
                                objQ = new yq(er2Var, 1);
                                ov0Var.m0(objQ);
                            }
                            jLongValue = ((Number) wc0.d0(objArr, z92Var, (au0) objQ, ov0Var, 0)).longValue();
                            zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                            objQ2 = ov0Var.Q();
                            if (zE || objQ2 == c30Var) {
                                objQ2 = new hq2(jLongValue, er2Var, j2);
                                ov0Var.m0(objQ2);
                            }
                            hq2Var2 = (hq2) objQ2;
                            ov0Var.p(false);
                        } else {
                            ov0Var.c0(356914239);
                            ov0Var.p(false);
                        }
                        hq2Var = hq2Var2;
                        lq0Var = (lq0) ov0Var.j(z30.k);
                        executor = (Executor) ov0Var.j(gr.a);
                        if (executor == null && gr.b(str.length())) {
                            ov0Var.c0(1254298614);
                            final qa1 qa1Var = (qa1) ov0Var.j(z30.n);
                            final xb0 xb0Var = (xb0) ov0Var.j(z30.h);
                            try {
                                final q93 q93Var3 = q93Var2;
                                try {
                                    lq0Var2 = lq0Var;
                                    try {
                                        executor.execute(new Runnable() { // from class: fr
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                dy1 dy1VarC;
                                                q93 q93Var4 = q93Var3;
                                                qa1 qa1Var2 = qa1Var;
                                                String str2 = str;
                                                xb0 xb0Var2 = xb0Var;
                                                lq0 lq0Var3 = lq0Var;
                                                Trace.beginSection("BackgroundTextMeasurement");
                                                try {
                                                    nx2 nx2VarH = tx2.h();
                                                    dy1 dy1Var = nx2VarH instanceof dy1 ? (dy1) nx2VarH : null;
                                                    if (dy1Var == null || (dy1VarC = dy1Var.C(null, null)) == null) {
                                                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                    }
                                                    try {
                                                        nx2 nx2VarJ = dy1VarC.j();
                                                        try {
                                                            q93 q93VarC = r93.c(q93Var4, qa1Var2);
                                                            uj0 uj0Var = uj0.e;
                                                            pe peVar = new pe(str2, q93VarC, uj0Var, uj0Var, lq0Var3, xb0Var2);
                                                            peVar.c();
                                                            peVar.a();
                                                            nx2.q(nx2VarJ);
                                                            dy1VarC.w().n();
                                                            dy1VarC.c();
                                                            Trace.endSection();
                                                        } catch (Throwable th) {
                                                            nx2.q(nx2VarJ);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            dy1VarC.c();
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    Trace.endSection();
                                                    throw th4;
                                                }
                                            }
                                        });
                                    } catch (RejectedExecutionException unused) {
                                    }
                                } catch (RejectedExecutionException unused2) {
                                    lq0Var2 = lq0Var;
                                }
                            } catch (RejectedExecutionException unused3) {
                                lq0Var2 = lq0Var;
                            }
                            z6 = false;
                            ov0Var.p(false);
                        } else {
                            lq0Var2 = lq0Var;
                            z6 = false;
                            ov0Var.c0(1255914055);
                            ov0Var.p(false);
                        }
                        if (hq2Var == null) {
                            ov0Var.c0(357875859);
                            ov0Var.p(z6);
                            i16 = i8;
                            z4 = z5;
                            dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                        } else {
                            i16 = i8;
                            z4 = z5;
                            ov0Var.c0(357232113);
                            boolean z7 = z6;
                            dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                            ov0Var.p(z7);
                        }
                        lc lcVar = lc.f;
                        int iHashCode = Long.hashCode(ov0Var.T);
                        dv1 dv1VarH = xp1.H(ov0Var, dv1VarN);
                        l72 l72VarL = ov0Var.l();
                        w20.b.getClass();
                        x30Var = v20.b;
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, v20.e, lcVar);
                        q73.h(ov0Var, v20.d, l72VarL);
                        q73.g(ov0Var, v20.g);
                        q73.h(ov0Var, v20.c, dv1VarH);
                        q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                        ov0Var.p(true);
                    } else {
                        ov0Var.W();
                        z4 = z2;
                        i16 = i8;
                        i17 = i12;
                    }
                    ee2VarT = ov0Var.t();
                    if (ee2VarT != null) {
                        ee2VarT.d = new pu0() { // from class: dr
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                                return mf3.a;
                            }
                        };
                    }
                }
                i7 |= 12582912;
                i12 = i4;
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = ov0Var.f(null);
                    } else {
                        zH = ov0Var.h(null);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ov0Var.T(i14 & 1, z3)) {
                    if (i19 != 0) {
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i11 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i12;
                    }
                    vd0.K(i17, i3);
                    er2Var = (er2) ov0Var.j(fr2.a);
                    if (er2Var != null) {
                        ov0Var.c0(356423075);
                        j2 = ((i93) ov0Var.j(j93.a)).b;
                        Object[] objArr2 = {er2Var};
                        z92 z92Var2 = new z92(2, new s5(er2Var, 3), new v1(17));
                        zH2 = ov0Var.h(er2Var);
                        objQ = ov0Var.Q();
                        c30 c30Var2 = d30.a;
                        if (zH2) {
                            objQ = new yq(er2Var, 1);
                            ov0Var.m0(objQ);
                        } else {
                            objQ = new yq(er2Var, 1);
                            ov0Var.m0(objQ);
                        }
                        jLongValue = ((Number) wc0.d0(objArr2, z92Var2, (au0) objQ, ov0Var, 0)).longValue();
                        zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                        objQ2 = ov0Var.Q();
                        if (zE) {
                            objQ2 = new hq2(jLongValue, er2Var, j2);
                            ov0Var.m0(objQ2);
                        } else {
                            objQ2 = new hq2(jLongValue, er2Var, j2);
                            ov0Var.m0(objQ2);
                        }
                        hq2Var2 = (hq2) objQ2;
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(356914239);
                        ov0Var.p(false);
                    }
                    hq2Var = hq2Var2;
                    lq0Var = (lq0) ov0Var.j(z30.k);
                    executor = (Executor) ov0Var.j(gr.a);
                    if (executor == null) {
                        lq0Var2 = lq0Var;
                        z6 = false;
                        ov0Var.c0(1255914055);
                        ov0Var.p(false);
                    } else {
                        lq0Var2 = lq0Var;
                        z6 = false;
                        ov0Var.c0(1255914055);
                        ov0Var.p(false);
                    }
                    if (hq2Var == null) {
                        ov0Var.c0(357875859);
                        ov0Var.p(z6);
                        i16 = i8;
                        z4 = z5;
                        dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                    } else {
                        i16 = i8;
                        z4 = z5;
                        ov0Var.c0(357232113);
                        boolean z8 = z6;
                        dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                        ov0Var.p(z8);
                    }
                    lc lcVar2 = lc.f;
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarN);
                    l72 l72VarL2 = ov0Var.l();
                    w20.b.getClass();
                    x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, lcVar2);
                    q73.h(ov0Var, v20.d, l72VarL2);
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH2);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode2));
                    ov0Var.p(true);
                } else {
                    ov0Var.W();
                    z4 = z2;
                    i16 = i8;
                    i17 = i12;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: dr
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                            return mf3.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            if ((1572864 & i5) == 0) {
                if (ov0Var.d(i3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i7 |= i18;
            }
            i11 = i6 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((12582912 & i5) == 0) {
                    i12 = i4;
                    if (ov0Var.d(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = ov0Var.f(null);
                    } else {
                        zH = ov0Var.h(null);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ov0Var.T(i14 & 1, z3)) {
                    if (i19 != 0) {
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i11 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i12;
                    }
                    vd0.K(i17, i3);
                    er2Var = (er2) ov0Var.j(fr2.a);
                    if (er2Var != null) {
                        ov0Var.c0(356423075);
                        j2 = ((i93) ov0Var.j(j93.a)).b;
                        Object[] objArr3 = {er2Var};
                        z92 z92Var3 = new z92(2, new s5(er2Var, 3), new v1(17));
                        zH2 = ov0Var.h(er2Var);
                        objQ = ov0Var.Q();
                        c30 c30Var3 = d30.a;
                        if (zH2) {
                            objQ = new yq(er2Var, 1);
                            ov0Var.m0(objQ);
                        } else {
                            objQ = new yq(er2Var, 1);
                            ov0Var.m0(objQ);
                        }
                        jLongValue = ((Number) wc0.d0(objArr3, z92Var3, (au0) objQ, ov0Var, 0)).longValue();
                        zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                        objQ2 = ov0Var.Q();
                        if (zE) {
                            objQ2 = new hq2(jLongValue, er2Var, j2);
                            ov0Var.m0(objQ2);
                        } else {
                            objQ2 = new hq2(jLongValue, er2Var, j2);
                            ov0Var.m0(objQ2);
                        }
                        hq2Var2 = (hq2) objQ2;
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(356914239);
                        ov0Var.p(false);
                    }
                    hq2Var = hq2Var2;
                    lq0Var = (lq0) ov0Var.j(z30.k);
                    executor = (Executor) ov0Var.j(gr.a);
                    if (executor == null) {
                        lq0Var2 = lq0Var;
                        z6 = false;
                        ov0Var.c0(1255914055);
                        ov0Var.p(false);
                    } else {
                        lq0Var2 = lq0Var;
                        z6 = false;
                        ov0Var.c0(1255914055);
                        ov0Var.p(false);
                    }
                    if (hq2Var == null) {
                        ov0Var.c0(357875859);
                        ov0Var.p(z6);
                        i16 = i8;
                        z4 = z5;
                        dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                    } else {
                        i16 = i8;
                        z4 = z5;
                        ov0Var.c0(357232113);
                        boolean z9 = z6;
                        dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                        ov0Var.p(z9);
                    }
                    lc lcVar3 = lc.f;
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarN);
                    l72 l72VarL3 = ov0Var.l();
                    w20.b.getClass();
                    x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, lcVar3);
                    q73.h(ov0Var, v20.d, l72VarL3);
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH3);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode3));
                    ov0Var.p(true);
                } else {
                    ov0Var.W();
                    z4 = z2;
                    i16 = i8;
                    i17 = i12;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: dr
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                            return mf3.a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i12 = i4;
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = ov0Var.f(null);
                } else {
                    zH = ov0Var.h(null);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var.T(i14 & 1, z3)) {
                if (i19 != 0) {
                    i8 = 1;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i11 != 0) {
                    i17 = 1;
                } else {
                    i17 = i12;
                }
                vd0.K(i17, i3);
                er2Var = (er2) ov0Var.j(fr2.a);
                if (er2Var != null) {
                    ov0Var.c0(356423075);
                    j2 = ((i93) ov0Var.j(j93.a)).b;
                    Object[] objArr4 = {er2Var};
                    z92 z92Var4 = new z92(2, new s5(er2Var, 3), new v1(17));
                    zH2 = ov0Var.h(er2Var);
                    objQ = ov0Var.Q();
                    c30 c30Var4 = d30.a;
                    if (zH2) {
                        objQ = new yq(er2Var, 1);
                        ov0Var.m0(objQ);
                    } else {
                        objQ = new yq(er2Var, 1);
                        ov0Var.m0(objQ);
                    }
                    jLongValue = ((Number) wc0.d0(objArr4, z92Var4, (au0) objQ, ov0Var, 0)).longValue();
                    zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                    objQ2 = ov0Var.Q();
                    if (zE) {
                        objQ2 = new hq2(jLongValue, er2Var, j2);
                        ov0Var.m0(objQ2);
                    } else {
                        objQ2 = new hq2(jLongValue, er2Var, j2);
                        ov0Var.m0(objQ2);
                    }
                    hq2Var2 = (hq2) objQ2;
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(356914239);
                    ov0Var.p(false);
                }
                hq2Var = hq2Var2;
                lq0Var = (lq0) ov0Var.j(z30.k);
                executor = (Executor) ov0Var.j(gr.a);
                if (executor == null) {
                    lq0Var2 = lq0Var;
                    z6 = false;
                    ov0Var.c0(1255914055);
                    ov0Var.p(false);
                } else {
                    lq0Var2 = lq0Var;
                    z6 = false;
                    ov0Var.c0(1255914055);
                    ov0Var.p(false);
                }
                if (hq2Var == null) {
                    ov0Var.c0(357875859);
                    ov0Var.p(z6);
                    i16 = i8;
                    z4 = z5;
                    dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                } else {
                    i16 = i8;
                    z4 = z5;
                    ov0Var.c0(357232113);
                    boolean z10 = z6;
                    dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                    ov0Var.p(z10);
                }
                lc lcVar4 = lc.f;
                int iHashCode4 = Long.hashCode(ov0Var.T);
                dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarN);
                l72 l72VarL4 = ov0Var.l();
                w20.b.getClass();
                x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, v20.e, lcVar4);
                q73.h(ov0Var, v20.d, l72VarL4);
                q73.g(ov0Var, v20.g);
                q73.h(ov0Var, v20.c, dv1VarH4);
                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode4));
                ov0Var.p(true);
            } else {
                ov0Var.W();
                z4 = z2;
                i16 = i8;
                i17 = i12;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: dr
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                        return mf3.a;
                    }
                };
            }
        }
        i7 |= 24576;
        i8 = i2;
        i9 = i6 & 32;
        if (i9 != 0) {
            if ((196608 & i5) == 0) {
                if (ov0Var.g(z2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i7 |= i10;
            }
            if ((1572864 & i5) == 0) {
                if (ov0Var.d(i3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i7 |= i18;
            }
            i11 = i6 & WorkQueueKt.BUFFER_CAPACITY;
            if (i11 != 0) {
                if ((12582912 & i5) == 0) {
                    i12 = i4;
                    if (ov0Var.d(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = ov0Var.f(null);
                    } else {
                        zH = ov0Var.h(null);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ov0Var.T(i14 & 1, z3)) {
                    if (i19 != 0) {
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i11 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i12;
                    }
                    vd0.K(i17, i3);
                    er2Var = (er2) ov0Var.j(fr2.a);
                    if (er2Var != null) {
                        ov0Var.c0(356423075);
                        j2 = ((i93) ov0Var.j(j93.a)).b;
                        Object[] objArr5 = {er2Var};
                        z92 z92Var5 = new z92(2, new s5(er2Var, 3), new v1(17));
                        zH2 = ov0Var.h(er2Var);
                        objQ = ov0Var.Q();
                        c30 c30Var5 = d30.a;
                        if (zH2) {
                            objQ = new yq(er2Var, 1);
                            ov0Var.m0(objQ);
                        } else {
                            objQ = new yq(er2Var, 1);
                            ov0Var.m0(objQ);
                        }
                        jLongValue = ((Number) wc0.d0(objArr5, z92Var5, (au0) objQ, ov0Var, 0)).longValue();
                        zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                        objQ2 = ov0Var.Q();
                        if (zE) {
                            objQ2 = new hq2(jLongValue, er2Var, j2);
                            ov0Var.m0(objQ2);
                        } else {
                            objQ2 = new hq2(jLongValue, er2Var, j2);
                            ov0Var.m0(objQ2);
                        }
                        hq2Var2 = (hq2) objQ2;
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(356914239);
                        ov0Var.p(false);
                    }
                    hq2Var = hq2Var2;
                    lq0Var = (lq0) ov0Var.j(z30.k);
                    executor = (Executor) ov0Var.j(gr.a);
                    if (executor == null) {
                        lq0Var2 = lq0Var;
                        z6 = false;
                        ov0Var.c0(1255914055);
                        ov0Var.p(false);
                    } else {
                        lq0Var2 = lq0Var;
                        z6 = false;
                        ov0Var.c0(1255914055);
                        ov0Var.p(false);
                    }
                    if (hq2Var == null) {
                        ov0Var.c0(357875859);
                        ov0Var.p(z6);
                        i16 = i8;
                        z4 = z5;
                        dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                    } else {
                        i16 = i8;
                        z4 = z5;
                        ov0Var.c0(357232113);
                        boolean z11 = z6;
                        dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                        ov0Var.p(z11);
                    }
                    lc lcVar5 = lc.f;
                    int iHashCode5 = Long.hashCode(ov0Var.T);
                    dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarN);
                    l72 l72VarL5 = ov0Var.l();
                    w20.b.getClass();
                    x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, lcVar5);
                    q73.h(ov0Var, v20.d, l72VarL5);
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH5);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode5));
                    ov0Var.p(true);
                } else {
                    ov0Var.W();
                    z4 = z2;
                    i16 = i8;
                    i17 = i12;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: dr
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                            return mf3.a;
                        }
                    };
                }
            }
            i7 |= 12582912;
            i12 = i4;
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = ov0Var.f(null);
                } else {
                    zH = ov0Var.h(null);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var.T(i14 & 1, z3)) {
                if (i19 != 0) {
                    i8 = 1;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i11 != 0) {
                    i17 = 1;
                } else {
                    i17 = i12;
                }
                vd0.K(i17, i3);
                er2Var = (er2) ov0Var.j(fr2.a);
                if (er2Var != null) {
                    ov0Var.c0(356423075);
                    j2 = ((i93) ov0Var.j(j93.a)).b;
                    Object[] objArr6 = {er2Var};
                    z92 z92Var6 = new z92(2, new s5(er2Var, 3), new v1(17));
                    zH2 = ov0Var.h(er2Var);
                    objQ = ov0Var.Q();
                    c30 c30Var6 = d30.a;
                    if (zH2) {
                        objQ = new yq(er2Var, 1);
                        ov0Var.m0(objQ);
                    } else {
                        objQ = new yq(er2Var, 1);
                        ov0Var.m0(objQ);
                    }
                    jLongValue = ((Number) wc0.d0(objArr6, z92Var6, (au0) objQ, ov0Var, 0)).longValue();
                    zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                    objQ2 = ov0Var.Q();
                    if (zE) {
                        objQ2 = new hq2(jLongValue, er2Var, j2);
                        ov0Var.m0(objQ2);
                    } else {
                        objQ2 = new hq2(jLongValue, er2Var, j2);
                        ov0Var.m0(objQ2);
                    }
                    hq2Var2 = (hq2) objQ2;
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(356914239);
                    ov0Var.p(false);
                }
                hq2Var = hq2Var2;
                lq0Var = (lq0) ov0Var.j(z30.k);
                executor = (Executor) ov0Var.j(gr.a);
                if (executor == null) {
                    lq0Var2 = lq0Var;
                    z6 = false;
                    ov0Var.c0(1255914055);
                    ov0Var.p(false);
                } else {
                    lq0Var2 = lq0Var;
                    z6 = false;
                    ov0Var.c0(1255914055);
                    ov0Var.p(false);
                }
                if (hq2Var == null) {
                    ov0Var.c0(357875859);
                    ov0Var.p(z6);
                    i16 = i8;
                    z4 = z5;
                    dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                } else {
                    i16 = i8;
                    z4 = z5;
                    ov0Var.c0(357232113);
                    boolean z12 = z6;
                    dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                    ov0Var.p(z12);
                }
                lc lcVar6 = lc.f;
                int iHashCode6 = Long.hashCode(ov0Var.T);
                dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarN);
                l72 l72VarL6 = ov0Var.l();
                w20.b.getClass();
                x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, v20.e, lcVar6);
                q73.h(ov0Var, v20.d, l72VarL6);
                q73.g(ov0Var, v20.g);
                q73.h(ov0Var, v20.c, dv1VarH6);
                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode6));
                ov0Var.p(true);
            } else {
                ov0Var.W();
                z4 = z2;
                i16 = i8;
                i17 = i12;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: dr
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                        return mf3.a;
                    }
                };
            }
        }
        i7 |= 196608;
        if ((1572864 & i5) == 0) {
            if (ov0Var.d(i3)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i7 |= i18;
        }
        i11 = i6 & WorkQueueKt.BUFFER_CAPACITY;
        if (i11 != 0) {
            if ((12582912 & i5) == 0) {
                i12 = i4;
                if (ov0Var.d(i12)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i7 |= i13;
            }
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = ov0Var.f(null);
                } else {
                    zH = ov0Var.h(null);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var.T(i14 & 1, z3)) {
                if (i19 != 0) {
                    i8 = 1;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i11 != 0) {
                    i17 = 1;
                } else {
                    i17 = i12;
                }
                vd0.K(i17, i3);
                er2Var = (er2) ov0Var.j(fr2.a);
                if (er2Var != null) {
                    ov0Var.c0(356423075);
                    j2 = ((i93) ov0Var.j(j93.a)).b;
                    Object[] objArr7 = {er2Var};
                    z92 z92Var7 = new z92(2, new s5(er2Var, 3), new v1(17));
                    zH2 = ov0Var.h(er2Var);
                    objQ = ov0Var.Q();
                    c30 c30Var7 = d30.a;
                    if (zH2) {
                        objQ = new yq(er2Var, 1);
                        ov0Var.m0(objQ);
                    } else {
                        objQ = new yq(er2Var, 1);
                        ov0Var.m0(objQ);
                    }
                    jLongValue = ((Number) wc0.d0(objArr7, z92Var7, (au0) objQ, ov0Var, 0)).longValue();
                    zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                    objQ2 = ov0Var.Q();
                    if (zE) {
                        objQ2 = new hq2(jLongValue, er2Var, j2);
                        ov0Var.m0(objQ2);
                    } else {
                        objQ2 = new hq2(jLongValue, er2Var, j2);
                        ov0Var.m0(objQ2);
                    }
                    hq2Var2 = (hq2) objQ2;
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(356914239);
                    ov0Var.p(false);
                }
                hq2Var = hq2Var2;
                lq0Var = (lq0) ov0Var.j(z30.k);
                executor = (Executor) ov0Var.j(gr.a);
                if (executor == null) {
                    lq0Var2 = lq0Var;
                    z6 = false;
                    ov0Var.c0(1255914055);
                    ov0Var.p(false);
                } else {
                    lq0Var2 = lq0Var;
                    z6 = false;
                    ov0Var.c0(1255914055);
                    ov0Var.p(false);
                }
                if (hq2Var == null) {
                    ov0Var.c0(357875859);
                    ov0Var.p(z6);
                    i16 = i8;
                    z4 = z5;
                    dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
                } else {
                    i16 = i8;
                    z4 = z5;
                    ov0Var.c0(357232113);
                    boolean z13 = z6;
                    dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                    ov0Var.p(z13);
                }
                lc lcVar7 = lc.f;
                int iHashCode7 = Long.hashCode(ov0Var.T);
                dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarN);
                l72 l72VarL7 = ov0Var.l();
                w20.b.getClass();
                x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, v20.e, lcVar7);
                q73.h(ov0Var, v20.d, l72VarL7);
                q73.g(ov0Var, v20.g);
                q73.h(ov0Var, v20.c, dv1VarH7);
                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode7));
                ov0Var.p(true);
            } else {
                ov0Var.W();
                z4 = z2;
                i16 = i8;
                i17 = i12;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: dr
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                        return mf3.a;
                    }
                };
            }
        }
        i7 |= 12582912;
        i12 = i4;
        i14 = i7 | 100663296;
        if ((i6 & 512) != 0) {
            i14 = i7 | 905969664;
        } else if ((805306368 & i5) == 0) {
            if ((1073741824 & i5) == 0) {
                zH = ov0Var.f(null);
            } else {
                zH = ov0Var.h(null);
            }
            if (zH) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i14 |= i15;
        }
        if ((i14 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ov0Var.T(i14 & 1, z3)) {
            if (i19 != 0) {
                i8 = 1;
            }
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i11 != 0) {
                i17 = 1;
            } else {
                i17 = i12;
            }
            vd0.K(i17, i3);
            er2Var = (er2) ov0Var.j(fr2.a);
            if (er2Var != null) {
                ov0Var.c0(356423075);
                j2 = ((i93) ov0Var.j(j93.a)).b;
                Object[] objArr8 = {er2Var};
                z92 z92Var8 = new z92(2, new s5(er2Var, 3), new v1(17));
                zH2 = ov0Var.h(er2Var);
                objQ = ov0Var.Q();
                c30 c30Var8 = d30.a;
                if (zH2) {
                    objQ = new yq(er2Var, 1);
                    ov0Var.m0(objQ);
                } else {
                    objQ = new yq(er2Var, 1);
                    ov0Var.m0(objQ);
                }
                jLongValue = ((Number) wc0.d0(objArr8, z92Var8, (au0) objQ, ov0Var, 0)).longValue();
                zE = ov0Var.e(jLongValue) | ov0Var.f(er2Var) | ov0Var.e(j2);
                objQ2 = ov0Var.Q();
                if (zE) {
                    objQ2 = new hq2(jLongValue, er2Var, j2);
                    ov0Var.m0(objQ2);
                } else {
                    objQ2 = new hq2(jLongValue, er2Var, j2);
                    ov0Var.m0(objQ2);
                }
                hq2Var2 = (hq2) objQ2;
                ov0Var.p(false);
            } else {
                ov0Var.c0(356914239);
                ov0Var.p(false);
            }
            hq2Var = hq2Var2;
            lq0Var = (lq0) ov0Var.j(z30.k);
            executor = (Executor) ov0Var.j(gr.a);
            if (executor == null) {
                lq0Var2 = lq0Var;
                z6 = false;
                ov0Var.c0(1255914055);
                ov0Var.p(false);
            } else {
                lq0Var2 = lq0Var;
                z6 = false;
                ov0Var.c0(1255914055);
                ov0Var.p(false);
            }
            if (hq2Var == null) {
                ov0Var.c0(357875859);
                ov0Var.p(z6);
                i16 = i8;
                z4 = z5;
                dv1VarN = dv1Var.d(new m93(str, q93Var, lq0Var2, i16, z4, i3, i17));
            } else {
                i16 = i8;
                z4 = z5;
                ov0Var.c0(357232113);
                boolean z14 = z6;
                dv1VarN = N(dv1Var, new dj(str), q93Var, null, i16, z4, i3, i17, (lq0) ov0Var.j(z30.k), null, null, hq2Var, null);
                ov0Var.p(z14);
            }
            lc lcVar8 = lc.f;
            int iHashCode8 = Long.hashCode(ov0Var.T);
            dv1 dv1VarH8 = xp1.H(ov0Var, dv1VarN);
            l72 l72VarL8 = ov0Var.l();
            w20.b.getClass();
            x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, lcVar8);
            q73.h(ov0Var, v20.d, l72VarL8);
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH8);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode8));
            ov0Var.p(true);
        } else {
            ov0Var.W();
            z4 = z2;
            i16 = i8;
            i17 = i12;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: dr
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ym3.e(str, dv1Var, q93Var, i16, z4, i3, i17, (f30) obj, wc0.m0(i5 | 1), i6);
                    return mf3.a;
                }
            };
        }
    }

    public static final void f(boolean z2, lu0 lu0Var, dv1 dv1Var, boolean z3, uw uwVar, f30 f30Var, int i2, int i3) {
        boolean z4;
        int i4;
        dv1 dv1Var2;
        boolean z5;
        dv1 dv1Var3;
        au0 au0Var;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1406741137);
        int i5 = i2 | (ov0Var.g(z2) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= ov0Var.h(lu0Var) ? 32 : 16;
        }
        int i6 = i5 | 384;
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i5 | 3456;
            z4 = z3;
        } else {
            z4 = z3;
            i4 = i6 | (ov0Var.g(z4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        int i8 = i4 | (ov0Var.f(uwVar) ? 16384 : 8192) | 196608;
        if (ov0Var.T(i8 & 1, (74899 & i8) != 74898)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                if (i7 != 0) {
                    z4 = true;
                }
                dv1Var3 = av1.a;
            } else {
                ov0Var.W();
                dv1Var3 = dv1Var;
            }
            boolean z6 = z4;
            ov0Var.q();
            float fFloor = (float) Math.floor(((xb0) ov0Var.j(z30.h)).R(2.0f));
            xa3 xa3VarB = g93.b(z2);
            if (lu0Var != null) {
                ov0Var.c0(2066152950);
                boolean z7 = ((i8 & 112) == 32) | ((i8 & 14) == 4);
                Object objQ = ov0Var.Q();
                if (z7 || objQ == d30.a) {
                    objQ = new xw(lu0Var, z2, 0);
                    ov0Var.m0(objQ);
                }
                au0Var = (au0) objQ;
                ov0Var.p(false);
            } else {
                ov0Var.c0(2066218639);
                ov0Var.p(false);
                au0Var = null;
            }
            n(xa3VarB, au0Var, new t13(fFloor, 0.0f, 2, 0, null, 26), new t13(fFloor, 0.0f, 0, 0, null, 30), dv1Var3, z6, uwVar, ov0Var, (i8 << 6) & 33546240);
            dv1Var2 = dv1Var3;
            z5 = z6;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            z5 = z4;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yw(z2, lu0Var, dv1Var2, z5, uwVar, i2, i3, 0);
        }
    }

    public static final void g(boolean z2, xa3 xa3Var, dv1 dv1Var, uw uwVar, final t13 t13Var, final t13 t13Var2, f30 f30Var, int i2) {
        int i3;
        dv1 dv1Var2;
        ov0 ov0Var;
        float f2;
        float f3;
        float f4;
        long j2;
        s03 s03VarL;
        long j3;
        s03 s03VarL2;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-891330208);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var2.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var2.d(xa3Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            dv1Var2 = dv1Var;
            i3 |= ov0Var2.f(dv1Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        } else {
            dv1Var2 = dv1Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var2.f(uwVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ov0Var2.h(t13Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ov0Var2.h(t13Var2) ? 131072 : 65536;
        }
        if (ov0Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            mc3 mc3VarQ = h73.q(xa3Var, null, ov0Var2, (i3 >> 3) & 14, 2);
            w52 w52Var = mc3VarQ.d;
            ln0 ln0VarK = mc0.K(vv1.e, ov0Var2);
            qd3 qd3Var = o51.v0;
            xa3 xa3Var2 = (xa3) mc3VarQ.c();
            ov0Var2.c0(-768316570);
            int iOrdinal = xa3Var2.ordinal();
            float f5 = 0.0f;
            if (iOrdinal == 0) {
                f2 = 1.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    b81.d();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ov0Var2.p(false);
            Float fValueOf = Float.valueOf(f2);
            xa3 xa3Var3 = (xa3) w52Var.getValue();
            ov0Var2.c0(-768316570);
            int iOrdinal2 = xa3Var3.ordinal();
            if (iOrdinal2 == 0) {
                f3 = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    b81.d();
                    return;
                }
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ov0Var2.p(false);
            Float fValueOf2 = Float.valueOf(f3);
            ic3 ic3VarF = mc3VarQ.f();
            ov0Var2.c0(1780794470);
            Object objA = ic3VarF.a();
            xa3 xa3Var4 = xa3.f;
            ln0 mx2Var = (objA != xa3Var4 && ic3VarF.c() == xa3Var4) ? new mx2(100) : ln0VarK;
            ov0Var2.p(false);
            final kc3 kc3VarK = h73.k(mc3VarQ, fValueOf, fValueOf2, mx2Var, qd3Var, ov0Var2, 0);
            xa3 xa3Var5 = (xa3) mc3VarQ.c();
            ov0Var2.c0(1840054703);
            int iOrdinal3 = xa3Var5.ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                f4 = 0.0f;
            } else {
                if (iOrdinal3 != 2) {
                    b81.d();
                    return;
                }
                f4 = 1.0f;
            }
            ov0Var2.p(false);
            Float fValueOf3 = Float.valueOf(f4);
            xa3 xa3Var6 = (xa3) w52Var.getValue();
            ov0Var2.c0(1840054703);
            int iOrdinal4 = xa3Var6.ordinal();
            if (iOrdinal4 != 0 && iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    b81.d();
                    return;
                }
                f5 = 1.0f;
            }
            ov0Var2.p(false);
            Float fValueOf4 = Float.valueOf(f5);
            ic3 ic3VarF2 = mc3VarQ.f();
            ov0Var2.c0(630790831);
            if (ic3VarF2.a() == xa3Var4) {
                ln0VarK = o51.C();
            } else if (ic3VarF2.c() == xa3Var4) {
                ln0VarK = new mx2(100);
            }
            ln0 ln0Var = ln0VarK;
            ov0Var2.p(false);
            final kc3 kc3VarK2 = h73.k(mc3VarQ, fValueOf3, fValueOf4, ln0Var, qd3Var, ov0Var2, 0);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new tw();
                ov0Var2.m0(objQ);
            }
            final tw twVar = (tw) objQ;
            final s03 s03VarA = aw2.a(xa3Var == xa3Var4 ? uwVar.b : uwVar.a, uw.a(xa3Var, ov0Var2), ov0Var2, 0, 12);
            ov0 ov0Var3 = ov0Var2;
            if (z2) {
                int iOrdinal5 = xa3Var.ordinal();
                if (iOrdinal5 == 0) {
                    j2 = uwVar.c;
                } else if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        b81.d();
                        return;
                    }
                    j2 = uwVar.c;
                } else {
                    j2 = uwVar.d;
                }
            } else {
                int iOrdinal6 = xa3Var.ordinal();
                if (iOrdinal6 == 0) {
                    j2 = uwVar.e;
                } else if (iOrdinal6 == 1) {
                    j2 = uwVar.f;
                } else {
                    if (iOrdinal6 != 2) {
                        b81.d();
                        return;
                    }
                    j2 = uwVar.g;
                }
            }
            if (z2) {
                ov0Var3.c0(496051715);
                s03VarL = aw2.a(j2, uw.a(xa3Var, ov0Var3), ov0Var3, 0, 12);
                ov0Var3.p(false);
            } else {
                ov0Var3.c0(496141925);
                s03VarL = ke0.L(new hz(j2), ov0Var3);
                ov0Var3.p(false);
            }
            if (z2) {
                int iOrdinal7 = xa3Var.ordinal();
                if (iOrdinal7 == 0) {
                    ov0Var3 = ov0Var3;
                    ov0Var3 = ov0Var3;
                    j3 = uwVar.h;
                } else if (iOrdinal7 != 1) {
                    if (iOrdinal7 != 2) {
                        ov0Var3 = ov0Var3;
                        b81.d();
                        return;
                    }
                    ov0Var3 = ov0Var3;
                    ov0Var3 = ov0Var3;
                    j3 = uwVar.h;
                } else {
                    j3 = uwVar.i;
                }
            } else {
                int iOrdinal8 = xa3Var.ordinal();
                if (iOrdinal8 == 0) {
                    j3 = uwVar.j;
                } else if (iOrdinal8 == 1) {
                    j3 = uwVar.k;
                } else {
                    if (iOrdinal8 != 2) {
                        ov0Var3 = ov0Var3;
                        b81.d();
                        return;
                    }
                    j3 = uwVar.l;
                }
            }
            if (z2) {
                ov0Var3 = ov0Var3;
                ov0Var3 = ov0Var3;
                ov0Var3 = ov0Var3;
                ov0Var3 = ov0Var3;
                ov0Var3.c0(633231558);
                ov0 ov0Var4 = ov0Var3;
                s03VarL2 = aw2.a(j3, uw.a(xa3Var, ov0Var3), ov0Var4, 0, 12);
                ov0Var = ov0Var4;
                ov0Var.p(false);
            } else {
                ov0Var3 = ov0Var3;
                ov0Var3 = ov0Var3;
                ov0Var3 = ov0Var3;
                ov0Var3 = ov0Var3;
                long j4 = j3;
                ov0Var = ov0Var3;
                ov0Var.c0(633321768);
                s03VarL2 = ke0.L(new hz(j4), ov0Var);
                ov0Var.p(false);
            }
            dv1 dv1VarI = iw2.i(iw2.r(dv1Var2), 20.0f);
            boolean zF = ov0Var.f(s03VarL) | ov0Var.f(s03VarL2) | ov0Var.h(t13Var2) | ov0Var.f(s03VarA) | ov0Var.f(kc3VarK) | ov0Var.f(kc3VarK2) | ov0Var.h(t13Var);
            Object objQ2 = ov0Var.Q();
            if (zF || objQ2 == c30Var) {
                final s03 s03Var = s03VarL;
                final s03 s03Var2 = s03VarL2;
                lu0 lu0Var = new lu0() { // from class: ww
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        float f6;
                        jg0 jg0Var = (jg0) obj;
                        long j5 = ((hz) s03Var.getValue()).a;
                        long j6 = ((hz) s03Var2.getValue()).a;
                        float fR = jg0Var.R(2.0f);
                        t13 t13Var3 = t13Var2;
                        float f7 = t13Var3.a;
                        float f8 = f7 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jg0Var.a() >> 32));
                        int i4 = hz.h;
                        boolean zA = ye3.a(j5, j6);
                        en0 en0Var = en0.a;
                        if (zA) {
                            f6 = 0.0f;
                            jg0.y0(jg0Var, j5, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR)) & 4294967295L), en0Var, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
                            float f9 = fIntBitsToFloat - (f7 * 2.0f);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
                            float fMax = Math.max(0.0f, fR - f7);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                            jg0Var = jg0Var;
                            f6 = 0.0f;
                            jg0.y0(jg0Var, j5, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, en0Var, 224);
                            float f10 = fIntBitsToFloat - f7;
                            float f11 = fR - f8;
                            jg0.y0(jg0Var, j6, (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), t13Var3, 224);
                        }
                        long j7 = ((hz) s03VarA.getValue()).a;
                        float fFloatValue = ((Number) kc3VarK.getValue()).floatValue();
                        float fFloatValue2 = ((Number) kc3VarK2.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jg0Var.a() >> 32));
                        float fE = gh0.E(0.4f, 0.5f, fFloatValue2);
                        float fE2 = gh0.E(0.7f, 0.5f, fFloatValue2);
                        float fE3 = gh0.E(0.5f, 0.5f, fFloatValue2);
                        float fE4 = gh0.E(0.3f, 0.5f, fFloatValue2);
                        tw twVar2 = twVar;
                        re reVar = twVar2.a;
                        jg0 jg0Var2 = jg0Var;
                        re reVar2 = twVar2.c;
                        reVar.h();
                        re reVar3 = twVar2.a;
                        Path path = reVar3.a;
                        path.moveTo(0.2f * fIntBitsToFloat2, fE3 * fIntBitsToFloat2);
                        reVar3.e(fE * fIntBitsToFloat2, fE2 * fIntBitsToFloat2);
                        reVar3.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fE4);
                        te teVar = twVar2.b;
                        PathMeasure pathMeasure = teVar.a;
                        pathMeasure.setPath(path, false);
                        reVar2.h();
                        teVar.a(f6, pathMeasure.getLength() * fFloatValue, reVar2);
                        jg0.O0(jg0Var2, reVar2, j7, t13Var, 52);
                        return mf3.a;
                    }
                };
                ov0Var.m0(lu0Var);
                objQ2 = lu0Var;
            }
            ji2.o(dv1VarI, (lu0) objQ2, ov0Var, 0);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new bd(z2, xa3Var, dv1Var, uwVar, t13Var, t13Var2, i2);
        }
    }

    public static final void h(ul1 ul1Var, final AppState appState, f30 f30Var, final int i2) {
        int i3;
        final AppState appState2;
        ov0 ov0Var;
        final ul1 ul1Var2 = ul1Var;
        ul1Var2.getClass();
        appState.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1308719462);
        final int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ov0Var2.h(ul1Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var2.h(appState) ? 32 : 16;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (ov0Var2.T(i3 & 1, (i3 & 19) != 18)) {
            CollectionRouteRecord pendingCollectionRoute = appState.getPendingCollectionRoute();
            c30 c30Var = d30.a;
            if (pendingCollectionRoute != null) {
                ov0Var2.c0(1651785971);
                boolean zIsSavingCollectionInfo = appState.isSavingCollectionInfo();
                boolean zH = ov0Var2.h(ul1Var2);
                Object objQ = ov0Var2.Q();
                if (zH || objQ == c30Var) {
                    t4 t4Var = new t4(0, ul1Var2, am1.class, "skipCollectionRouteInfo", "skipCollectionRouteInfo(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 10);
                    ov0Var2.m0(t4Var);
                    objQ = t4Var;
                }
                au0 au0Var = (au0) ((o81) objQ);
                boolean zH2 = ov0Var2.h(ul1Var2) | ov0Var2.h(pendingCollectionRoute);
                Object objQ2 = ov0Var2.Q();
                if (zH2 || objQ2 == c30Var) {
                    objQ2 = new j2(5, ul1Var2, pendingCollectionRoute);
                    ov0Var2.m0(objQ2);
                }
                ks.E(pendingCollectionRoute, zIsSavingCollectionInfo, au0Var, (pu0) objQ2, ov0Var2, 0);
                ov0Var2.p(false);
                ee2 ee2VarT = ov0Var2.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new pu0() { // from class: qy
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i5;
                            mf3 mf3Var = mf3.a;
                            int i8 = i2;
                            AppState appState3 = appState;
                            ul1 ul1Var3 = ul1Var2;
                            f30 f30Var2 = (f30) obj;
                            ((Integer) obj2).intValue();
                            switch (i7) {
                                case 0:
                                    ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                                    break;
                                case 1:
                                    ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                                    break;
                                default:
                                    ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    return;
                }
                return;
            }
            ov0Var2.c0(1650682216);
            ov0Var2.p(false);
            final LocationRecord locationRecord = (LocationRecord) zy.o0(appState.getPendingCollectionLocations());
            if (locationRecord == null) {
                ee2 ee2VarT2 = ov0Var2.t();
                if (ee2VarT2 != null) {
                    ee2VarT2.d = new pu0() { // from class: qy
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            mf3 mf3Var = mf3.a;
                            int i8 = i2;
                            AppState appState3 = appState;
                            ul1 ul1Var3 = ul1Var2;
                            f30 f30Var2 = (f30) obj;
                            ((Integer) obj2).intValue();
                            switch (i7) {
                                case 0:
                                    ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                                    break;
                                case 1:
                                    ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                                    break;
                                default:
                                    ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    return;
                }
                return;
            }
            Object[] objArr = {Long.valueOf(locationRecord.getId())};
            boolean zH3 = ov0Var2.h(locationRecord);
            Object objQ3 = ov0Var2.Q();
            if (zH3 || objQ3 == c30Var) {
                objQ3 = new au0() { // from class: ry
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i7 = i5;
                        LocationRecord locationRecord2 = locationRecord;
                        switch (i7) {
                            case 0:
                                return ke0.H(locationRecord2.getPlaceName());
                            default:
                                return ke0.H(locationRecord2.getRemark());
                        }
                    }
                };
                ov0Var2.m0(objQ3);
            }
            ey1 ey1Var = (ey1) wc0.c0(objArr, (au0) objQ3, ov0Var2, 0);
            Object[] objArr2 = {Long.valueOf(locationRecord.getId())};
            boolean zH4 = ov0Var2.h(locationRecord);
            Object objQ4 = ov0Var2.Q();
            if (zH4 || objQ4 == c30Var) {
                objQ4 = new au0() { // from class: ry
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i7 = i6;
                        LocationRecord locationRecord2 = locationRecord;
                        switch (i7) {
                            case 0:
                                return ke0.H(locationRecord2.getPlaceName());
                            default:
                                return ke0.H(locationRecord2.getRemark());
                        }
                    }
                };
                ov0Var2.m0(objQ4);
            }
            ey1 ey1Var2 = (ey1) wc0.c0(objArr2, (au0) objQ4, ov0Var2, 0);
            boolean zIsSavingCollectionInfo2 = appState.isSavingCollectionInfo();
            dv1 dv1VarH = ji2.H(av1.a);
            boolean zG = ov0Var2.g(zIsSavingCollectionInfo2) | ov0Var2.h(ul1Var2);
            Object objQ5 = ov0Var2.Q();
            if (zG || objQ5 == c30Var) {
                objQ5 = new sy(zIsSavingCollectionInfo2, ul1Var2, i5);
                ov0Var2.m0(objQ5);
            }
            p10 p10VarA0 = sb.a0(448872674, new w4(zIsSavingCollectionInfo2, ul1Var2, locationRecord, ey1Var, ey1Var2), ov0Var2);
            p10 p10VarA1 = sb.a0(834735076, new ty(zIsSavingCollectionInfo2, ul1Var2, i5), ov0Var2);
            p10 p10Var = ji2.b;
            appState2 = appState;
            p10 p10VarA2 = sb.a0(1413528679, new w4(appState2, locationRecord, zIsSavingCollectionInfo2, ey1Var, ey1Var2, 4), ov0Var2);
            ul1Var2 = ul1Var;
            xq1.a((au0) objQ5, p10VarA0, dv1VarH, p10VarA1, p10Var, p10VarA2, null, 0L, 0L, 0L, 0L, null, ov0Var2, 1772592, 16272);
            ov0Var = ov0Var2;
        } else {
            appState2 = appState;
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT3 = ov0Var.t();
        if (ee2VarT3 != null) {
            ee2VarT3.d = new pu0() { // from class: qy
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i4;
                    mf3 mf3Var = mf3.a;
                    int i8 = i2;
                    AppState appState3 = appState2;
                    ul1 ul1Var3 = ul1Var2;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                            break;
                        case 1:
                            ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                            break;
                        default:
                            ym3.h(ul1Var3, appState3, f30Var2, wc0.m0(i8 | 1));
                            break;
                    }
                    return mf3Var;
                }
            };
        }
    }

    public static ac0 i() {
        return new ac0(1.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [a93, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ey1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ov0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ov0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [f30, ov0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [f30, ov0] */
    /* JADX WARN: Type inference failed for: r9v20, types: [uj0] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [ey1, java.lang.Object] */
    public static final void j(final dv1 dv1Var, dj djVar, final lu0 lu0Var, final boolean z2, final Map map, final q93 q93Var, final int i2, final boolean z3, final int i3, final int i4, final lq0 lq0Var, final hq2 hq2Var, final lu0 lu0Var2, f30 f30Var, final int i5, final int i6) {
        ?? r3;
        ?? r0;
        au0 au0Var;
        i52 i52Var;
        lu0 lu0Var3;
        ?? r9;
        int i7;
        Object obj;
        Object obj2;
        Object ffVar;
        Object obj3;
        Object obj4;
        Object obj5;
        ?? arrayList;
        final dj djVar2 = djVar;
        ?? r7 = (ov0) f30Var;
        r7.e0(-2118572703);
        int i8 = (i5 & 6) == 0 ? (r7.f(dv1Var) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i8 |= r7.f(djVar2) ? 32 : 16;
        }
        int i9 = i5 & 384;
        int i10 = WorkQueueKt.BUFFER_CAPACITY;
        if (i9 == 0) {
            i8 |= r7.h(lu0Var) ? 256 : 128;
        }
        int i11 = i5 & 3072;
        int i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i11 == 0) {
            i8 |= r7.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= r7.h(map) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i8 |= r7.f(q93Var) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i8 |= r7.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i8 |= r7.g(z3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i8 |= r7.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i8 |= r7.d(i4) ? 536870912 : 268435456;
        }
        int i13 = (i6 & 6) == 0 ? i6 | (r7.h(lq0Var) ? 4 : 2) : i6;
        if ((i6 & 48) == 0) {
            i13 |= r7.h(hq2Var) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            if (r7.h(null)) {
                i10 = 256;
            }
            i13 |= i10;
        }
        if ((i6 & 3072) == 0) {
            if (r7.h(lu0Var2)) {
                i12 = 2048;
            }
            i13 |= i12;
        }
        if ((i6 & 24576) == 0) {
            i13 |= (32768 & i6) == 0 ? r7.f(null) : r7.h(null) ? 16384 : 8192;
        }
        if (r7.T(i8 & 1, ((i8 & 306783379) == 306783378 && (i13 & 9363) == 9362) ? false : true)) {
            boolean zY = ig0.y(djVar2);
            c30 c30Var = d30.a;
            if (zY) {
                r7.c0(145641571);
                boolean z4 = (i8 & 112) == 32;
                Object objQ = r7.Q();
                Object obj6 = objQ;
                if (z4 || objQ == c30Var) {
                    a93 a93Var = new a93(djVar2);
                    r7.m0(a93Var);
                    obj6 = a93Var;
                }
                r7.p(false);
                r0 = (a93) obj6;
            } else {
                r7.c0(145707228);
                r7.p(false);
                r0 = 0;
            }
            if (ig0.y(djVar2)) {
                r7.c0(145905443);
                boolean zF = ((i8 & 112) == 32) | r7.f(r0);
                Object objQ2 = r7.Q();
                Object obj7 = objQ2;
                if (zF || objQ2 == c30Var) {
                    m5 m5Var = new m5(8, r0, djVar2);
                    r7.m0(m5Var);
                    obj7 = m5Var;
                }
                au0Var = (au0) obj7;
                r7.p(false);
            } else {
                r7.c0(146002721);
                boolean z5 = (i8 & 112) == 32;
                Object objQ3 = r7.Q();
                Object obj8 = objQ3;
                if (z5 || objQ3 == c30Var) {
                    hd hdVar = new hd(djVar2, 4);
                    r7.m0(hdVar);
                    obj8 = hdVar;
                }
                au0Var = (au0) obj8;
                r7.p(false);
            }
            if (z2) {
                if (map != null) {
                    i52 i52Var2 = hj.a;
                    if (map.isEmpty()) {
                        i52Var = hj.a;
                    } else {
                        int length = djVar2.f.length();
                        List list = djVar2.e;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i14 = 0;
                            while (i14 < size) {
                                List list2 = list;
                                cj cjVar = (cj) list.get(i14);
                                int i15 = size;
                                Object obj9 = cjVar.a;
                                int i16 = i14;
                                int i17 = cjVar.c;
                                int i18 = cjVar.b;
                                String str = cjVar.d;
                                if ((obj9 instanceof h13) && "androidx.compose.foundation.text.inlineContent".equals(str) && ej.b(0, length, i18, i17)) {
                                    Object obj10 = cjVar.a;
                                    obj10.getClass();
                                    arrayList.add(new cj(i18, i17, ((h13) obj10).a, str));
                                }
                                i14 = i16 + 1;
                                size = i15;
                                list = list2;
                            }
                        } else {
                            arrayList = uj0.e;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            if (map.get(((cj) arrayList.get(i19)).a) != null) {
                                b81.u();
                                return;
                            }
                        }
                        i52Var = new i52(arrayList2, arrayList3);
                    }
                } else {
                    i52Var = hj.a;
                }
                lu0Var3 = null;
            } else {
                au0Var = au0Var;
                lu0Var3 = null;
                i52Var = new i52(null, null);
            }
            List list3 = (List) i52Var.e;
            List list4 = (List) i52Var.f;
            if (z2) {
                r7.c0(146318828);
                Object objQ4 = r7.Q();
                if (objQ4 == c30Var) {
                    obj5 = objQ4;
                    w52 w52VarH = ke0.H(lu0Var3);
                    r7.m0(w52VarH);
                    obj5 = w52VarH;
                }
                obj5 = objQ4;
                r7.p(false);
                r9 = (ey1) obj5;
            } else {
                r7.c0(146406588);
                r7.p(false);
                r9 = lu0Var3;
            }
            int i20 = 14;
            if (z2) {
                r7.c0(146499837);
                boolean zF2 = r7.f(r9);
                Object objQ5 = r7.Q();
                if (zF2 || objQ5 == c30Var) {
                    obj4 = objQ5;
                    f4 f4Var = new f4(r9, i20);
                    r7.m0(f4Var);
                    obj4 = f4Var;
                }
                lu0Var3 = (lu0) obj4;
                r7.p(false);
            } else {
                r7.c0(146571260);
                r7.p(false);
            }
            lu0 lu0Var4 = lu0Var3;
            int i21 = (i8 >> 3) & 14;
            gr.a(djVar2, q93Var, lq0Var, list3, r7);
            dj djVar3 = (dj) au0Var.invoke();
            boolean zH = ((i8 & 896) == 256) | r7.h(r0);
            Object objQ6 = r7.Q();
            if (zH || objQ6 == c30Var) {
                i7 = 0;
                ar arVar = new ar(r0, lu0Var, i7);
                r7.m0(arVar);
                obj = arVar;
            } else {
                i7 = 0;
                obj = objQ6;
            }
            ?? r4 = r7;
            ?? r2 = r9;
            ?? r5 = i7;
            dv1 dv1VarN = N(dv1Var, djVar3, q93Var, (lu0) obj, i2, z3, i3, i4, lq0Var, list3, lu0Var4, hq2Var, lu0Var2);
            if (z2) {
                r4.c0(147927697);
                boolean zH2 = r4.h(r0);
                Object objQ7 = r4.Q();
                if (zH2 || objQ7 == c30Var) {
                    obj2 = objQ7;
                    br brVar = new br(r0, 1);
                    r4.m0(brVar);
                    obj2 = brVar;
                }
                au0 au0Var2 = (au0) obj2;
                boolean zF3 = r4.f(r2);
                Object objQ8 = r4.Q();
                Object obj11 = objQ8;
                if (zF3 || objQ8 == c30Var) {
                    s2 s2Var = new s2(r2, 20);
                    r4.m0(s2Var);
                    obj11 = s2Var;
                }
                ffVar = new ff(1, au0Var2, (au0) obj11);
                r4.p(r5);
            } else {
                r4.c0(147750935);
                boolean zH3 = r4.h(r0);
                Object objQ9 = r4.Q();
                if (zH3 || objQ9 == c30Var) {
                    obj3 = objQ9;
                    br brVar2 = new br(r0, r5 == true ? 1 : 0);
                    r4.m0(brVar2);
                    obj3 = brVar2;
                }
                ffVar = new kg1((au0) obj3, r5 == true ? 1 : 0);
                r4.p(r5);
            }
            int iHashCode = Long.hashCode(r4.T);
            l72 l72VarL = r4.l();
            dv1 dv1VarH = xp1.H(r4, dv1VarN);
            w20.b.getClass();
            x30 x30Var = v20.b;
            r4.g0();
            if (r4.S) {
                r4.k(x30Var);
            } else {
                r4.p0();
            }
            q73.h(r4, v20.e, ffVar);
            q73.h(r4, v20.d, l72VarL);
            q73.h(r4, v20.f, Integer.valueOf(iHashCode));
            q73.g(r4, v20.g);
            q73.h(r4, v20.c, dv1VarH);
            if (r0 == 0) {
                r4.c0(-433557001);
            } else {
                r4.c0(-291080374);
                r0.a(r5 == true ? 1 : 0, r4);
            }
            r4.p(r5);
            if (list4 == null) {
                r4.c0(-433506223);
                r4.p(r5);
                djVar2 = djVar;
            } else {
                r4.c0(-433506222);
                djVar2 = djVar;
                hj.a(djVar2, list4, r4, i21);
                r4.p(r5);
            }
            r4.p(true);
            r3 = r4;
        } else {
            ?? r6 = r7;
            r6.W();
            r3 = r6;
        }
        ee2 ee2VarT = r3.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: cr
                @Override // defpackage.pu0
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).getClass();
                    int iM0 = wc0.m0(i5 | 1);
                    int iM1 = wc0.m0(i6);
                    ym3.j(dv1Var, djVar2, lu0Var, z2, map, q93Var, i2, z3, i3, i4, lq0Var, hq2Var, lu0Var2, (f30) obj12, iM0, iM1);
                    return mf3.a;
                }
            };
        }
    }

    public static final void k(dv1 dv1Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            l(dv1Var, p10Var, ov0Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kg(dv1Var, p10Var, i2, i4);
        }
    }

    public static final void l(dv1 dv1Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(771959668);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(p10Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        int i4 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                w52 w52Var = new w52(null, j9.W);
                ov0Var.m0(w52Var);
                objQ = w52Var;
            }
            ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new s2(ey1Var, 16);
                ov0Var.m0(objQ2);
            }
            k22.b(i63.b.a(L((au0) objQ2, ov0Var, 0)), sb.a0(-291176396, new f5(dv1Var, ey1Var, p10Var, i4), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kg(dv1Var, p10Var, i2, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v28 */
    public static final void m(ul1 ul1Var, AppState appState, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        int i3;
        Object obj;
        ?? r11;
        long jC;
        String strH;
        boolean z3;
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-538208662);
        int i4 = i2 | (ov0Var2.h(ul1Var) ? 4 : 2) | (ov0Var2.h(appState) ? 32 : 16) | (ov0Var2.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i5 = 0;
        if (ov0Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            xq1.g(false, au0Var, ov0Var2, (i4 >> 6) & 112, 1);
            Context context = (Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b);
            Object objQ = ov0Var2.Q();
            Object obj2 = d30.a;
            q60 q60Var = null;
            if (objQ == obj2) {
                objQ = ke0.H(null);
                ov0Var2.m0(objQ);
            }
            ey1 ey1Var = (ey1) objQ;
            ey1 ey1VarS = ee0.s(ul1Var.w, ov0Var2);
            ey1 ey1VarS2 = ee0.s(ul1Var.v, ov0Var2);
            boolean zF = ov0Var2.f((List) ey1VarS.getValue());
            Object objQ2 = ov0Var2.Q();
            Object obj3 = objQ2;
            if (zF || objQ2 == obj2) {
                List list = (List) ey1VarS.getValue();
                ArrayList arrayList = new ArrayList(az.Y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CompleteLocation) it.next()).getLocation());
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj4 = arrayList.get(i5);
                    i5++;
                    if (((LocationRecord) obj4).getCollectionRouteId() == null) {
                        arrayList2.add(obj4);
                    }
                }
                ov0Var2.m0(arrayList2);
                obj3 = arrayList2;
            }
            List list2 = (List) obj3;
            boolean zH = ov0Var2.h(ul1Var) | ov0Var2.h(context);
            Object objQ3 = ov0Var2.Q();
            if (zH || objQ3 == obj2) {
                objQ3 = new s3(ul1Var, context, ey1Var, null);
                ov0Var2.m0(objQ3);
            }
            oi0.e(ov0Var2, (pu0) objQ3, mf3.a);
            lr2 lr2Var = (lr2) ey1Var.getValue();
            AppMapType mapType = appState.getMapType();
            boolean zH2 = ov0Var2.h(appState);
            Object objQ4 = ov0Var2.Q();
            if (zH2 || objQ4 == obj2) {
                i3 = 2;
                objQ4 = new cj1(appState, ey1Var, q60Var, i3);
                ov0Var2.m0(objQ4);
            } else {
                i3 = 2;
            }
            oi0.f(lr2Var, mapType, (pu0) objQ4, ov0Var2);
            Object[] objArr = {(lr2) ey1Var.getValue(), list2, (List) ey1VarS2.getValue(), appState.getCollectionRoutePoints(), appState.getDeviceLocation()};
            boolean zH3 = ov0Var2.h(appState) | ov0Var2.h(context) | ov0Var2.h(list2) | ov0Var2.f(ey1VarS2);
            Object objQ5 = ov0Var2.Q();
            if (zH3 || objQ5 == obj2) {
                obj = null;
                kt ktVar = new kt(appState, list2, ey1Var, context, ey1VarS2, (q60) null);
                ov0Var2.m0(ktVar);
                objQ5 = ktVar;
            } else {
                obj = null;
            }
            oi0.h(objArr, (pu0) objQ5, ov0Var2);
            fn0 fn0Var = iw2.c;
            long j2 = z2 ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j2, iy0Var);
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var2, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var2, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var2, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH);
            Object objQ6 = ov0Var2.Q();
            if (objQ6 == obj2) {
                objQ6 = new xj2(ey1Var, 9);
                ov0Var2.m0(objQ6);
            }
            au0 au0Var2 = (au0) objQ6;
            boolean zH4 = ov0Var2.h(appState);
            Object objQ7 = ov0Var2.Q();
            if (zH4 || objQ7 == obj2) {
                objQ7 = new jl1(15, appState, ey1Var);
                ov0Var2.m0(objQ7);
            }
            da0.g(fn0Var, au0Var2, null, null, (lu0) objQ7, ov0Var2, 54, 12);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(ji2.U(iw2.e(av1Var, 1.0f)), 16.0f, 10.0f);
            u92 u92Var = am1.i;
            or orVar = j9.p;
            kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var2, 54);
            int iHashCode2 = Long.hashCode(ov0Var2.T);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, kk2VarA);
            q73.h(ov0Var2, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH2);
            dv1 dv1VarK2 = iw2.k(av1Var, 44.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarA = bk.a(ji2.w(xp1.k(xp1.n(hd0.O(dv1VarK2, 6.0f, bj2Var, 0L, 0L, 24), bj2Var), z2 ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, z2 ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), bj2Var), au0Var);
            pr prVar = j9.j;
            er1 er1VarC2 = ws.c(prVar, false);
            int iHashCode3 = Long.hashCode(ov0Var2.T);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarA);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, er1VarC2);
            q73.h(ov0Var2, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH3);
            t01.a(n51.u(), ke0.N(2131624056, ov0Var2), iw2.k(av1Var, 21.0f), z2 ? hz.c : xp1.d(4279901472L), ov0Var2, 384, 0);
            ov0Var2.p(true);
            dv1 dv1VarF = zm3.F(ji2.w(xp1.k(xp1.n(hd0.O(iw2.g(av1Var, 44.0f), 6.0f, cj2.a(22.0f), 0L, 0L, 24), cj2.a(22.0f)), z2 ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, z2 ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), cj2.a(22.0f)), 16.0f, 0.0f, 2);
            er1 er1VarC3 = ws.c(prVar, false);
            int iHashCode4 = Long.hashCode(ov0Var2.T);
            l72 l72VarL4 = ov0Var2.l();
            dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarF);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, er1VarC3);
            q73.h(ov0Var2, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH4);
            kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var2, 48);
            int iHashCode5 = Long.hashCode(ov0Var2.T);
            l72 l72VarL5 = ov0Var2.l();
            dv1 dv1VarH5 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, kk2VarA2);
            q73.h(ov0Var2, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH5);
            dv1 dv1VarN = xp1.n(iw2.k(av1Var, 9.0f), bj2Var);
            if (appState.isContinuousScanning()) {
                ov0Var2.c0(2109415658);
                r11 = 0;
                ov0Var2.p(false);
                jC = bk.h;
            } else {
                r11 = 0;
                ov0Var2.c0(2109417432);
                jC = hz.c(0.35f, ((kz) ov0Var2.j(mz.a)).q);
                ov0Var2.p(false);
            }
            ws.a(xp1.k(dv1VarN, jC, iy0Var), ov0Var2, r11);
            gh0.h(ov0Var2, iw2.o(av1Var, 8.0f));
            if (appState.isStoppingCollection()) {
                strH = az2.h(ov0Var2, 967721951, 2131624313, ov0Var2, r11);
            } else if (appState.isContinuousScanning()) {
                ov0Var2.c0(967864830);
                strH = ke0.O(2131624952, new Object[]{Integer.valueOf(appState.getEnvironmentRecordCount())}, ov0Var2);
                ov0Var2.p(r11);
            } else {
                strH = az2.h(ov0Var2, 968094106, 2131624953, ov0Var2, r11);
            }
            s83.b(strH, null, ((kz) ov0Var2.j(mz.a)).q, v63.c(13), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
            ov0Var2.p(true);
            ov0Var2.p(true);
            ov0Var2.p(true);
            da0.d(appState.isContinuousScanning() || appState.getScannedWifiCount() > 0 || appState.getScannedCellCount() > 0 || appState.getScannedBluetoothCount() > 0, zm3.G(ji2.U(k22.k(av1Var, j9.h)), 0.0f, 64.0f, 16.0f, 0.0f, 9), kk0.d(null, 3), kk0.e(null, 3), null, sb.a0(-163875124, new n6(appState, 3), ov0Var2), ov0Var2, 200064, 16);
            ov0 ov0Var3 = ov0Var2;
            if (appState.isDrawingCollectionRoute()) {
                ov0Var3.c0(-1701250395);
                t01.a(vd0.y(), ke0.N(2131624296, ov0Var3), iw2.k(k22.k(av1Var, prVar), 32.0f), bk.g, ov0Var3, 3072, 0);
                z3 = false;
            } else {
                z3 = false;
                ov0Var3.c0(-1711830850);
            }
            ov0Var3.p(z3);
            sb.D(ul1Var, appState, (lr2) ey1Var.getValue(), zm3.G(ji2.J(k22.k(av1Var, j9.m)), 0.0f, 0.0f, 0.0f, 16.0f, 7), ov0Var3, i4 & 126);
            ov0Var3.p(true);
            ov0Var = ov0Var3;
        } else {
            ov0Var2.W();
            ov0Var = ov0Var2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ea1(ul1Var, appState, z2, au0Var, i2, 2);
        }
    }

    public static final void n(xa3 xa3Var, au0 au0Var, t13 t13Var, t13 t13Var2, dv1 dv1Var, boolean z2, uw uwVar, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-406243761);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.d(xa3Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(t13Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var.h(t13Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ov0Var.f(dv1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ov0Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ov0Var.f(uwVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ov0Var.f(null) ? 8388608 : 4194304;
        }
        if (ov0Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            ov0Var.Y();
            if ((i2 & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            dv1 dv1Var2 = av1.a;
            dv1 dv1VarF0 = au0Var != null ? ks.f0(xa3Var, sh2.a(false, zw.d / 2.0f, 4), z2, new vh2(1), au0Var) : dv1Var2;
            if (au0Var != null) {
                dy0 dy0Var = v41.a;
                dv1Var2 = au1.a;
            }
            dv1 dv1VarD = zm3.D(dv1Var.d(dv1Var2).d(dv1VarF0), 2.0f);
            int i4 = ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168);
            int i5 = i3 << 6;
            g(z2, xa3Var, dv1VarD, uwVar, t13Var, t13Var2, ov0Var, i4 | (57344 & i5) | (i5 & 458752));
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new vw(xa3Var, au0Var, t13Var, t13Var2, dv1Var, z2, uwVar, i2);
        }
    }

    public static final void o(boolean z2, final boolean z3, String str, au0 au0Var, f30 f30Var, int i2) {
        String string;
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-425354088);
        int i3 = (ov0Var.g(z2) ? 4 : 2) | i2 | (ov0Var.g(z3) ? 32 : 16) | (ov0Var.f(str) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            final long j2 = z2 ? bk.c : bk.f;
            boolean z4 = (i3 & 896) == 256;
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (z4 || objQ == c30Var) {
                objQ = (str == null || (string = l13.D0(str).toString()) == null) ? null : l13.q0(l13.q0(string, "v"), "V");
                ov0Var.m0(objQ);
            }
            final String str2 = (String) objQ;
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            boolean z5 = (i3 & 7168) == 2048;
            Object objQ2 = ov0Var.Q();
            if (z5 || objQ2 == c30Var) {
                objQ2 = new o6(0, au0Var);
                ov0Var.m0(objQ2);
            }
            zm3.b(bk.a(dv1VarE, (au0) objQ2), 16.0f, new b52(16.0f, 14.0f, 16.0f, 14.0f), sb.a0(-1544607927, new qu0() { // from class: p6
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    iy0 iy0Var;
                    boolean z6;
                    long j3;
                    String str3;
                    iy0 iy0Var2;
                    gh ghVar;
                    ov0 ov0Var2;
                    float f2;
                    boolean z7;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((zz) obj).getClass();
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        av1 av1Var = av1.a;
                        dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                        or orVar = j9.p;
                        kk2 kk2VarA = jk2.a(am1.e, orVar, ov0Var3, 48);
                        int iHashCode = Long.hashCode(ov0Var3.T);
                        l72 l72VarL = ov0Var3.l();
                        dv1 dv1VarH = xp1.H(ov0Var3, dv1VarE2);
                        w20.b.getClass();
                        x30 x30Var = v20.b;
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        gh ghVar2 = v20.e;
                        q73.h(ov0Var3, ghVar2, kk2VarA);
                        gh ghVar3 = v20.d;
                        q73.h(ov0Var3, ghVar3, l72VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        gh ghVar4 = v20.f;
                        q73.h(ov0Var3, ghVar4, numValueOf);
                        wa waVar = v20.g;
                        q73.g(ov0Var3, waVar);
                        gh ghVar5 = v20.c;
                        q73.h(ov0Var3, ghVar5, dv1VarH);
                        dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(11.0f));
                        boolean z8 = z3;
                        long jC = z8 ? hz.c(0.12f, xp1.d(4293212469L)) : hz.c(0.12f, bk.g);
                        iy0 iy0Var3 = o51.p0;
                        dv1 dv1VarK = xp1.k(dv1VarN, jC, iy0Var3);
                        er1 er1VarC = ws.c(j9.j, false);
                        int iHashCode2 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL2 = ov0Var3.l();
                        dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarK);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar2, er1VarC);
                        q73.h(ov0Var3, ghVar3, l72VarL2);
                        az2.s(iHashCode2, ov0Var3, ghVar4, ov0Var3, waVar);
                        q73.h(ov0Var3, ghVar5, dv1VarH2);
                        x01 x01VarB = ld0.i;
                        if (x01VarB == null) {
                            w01 w01Var = new w01("Rounded.SystemUpdateAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = nh3.a;
                            qy2 qy2Var = new qy2(hz.b);
                            nx0 nx0Var = new nx0(3);
                            nx0Var.m(12.35f, 15.65f);
                            nx0Var.l(2.79f, -2.79f);
                            nx0Var.g(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
                            nx0Var.h(13.0f);
                            nx0Var.r(4.0f);
                            nx0Var.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                            nx0Var.o(-1.0f, 0.45f, -1.0f, 1.0f);
                            nx0Var.s(8.0f);
                            nx0Var.h(9.21f);
                            nx0Var.g(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
                            nx0Var.l(2.79f, 2.79f);
                            nx0Var.g(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f);
                            nx0Var.e();
                            nx0Var.m(21.0f, 3.0f);
                            nx0Var.i(-5.01f);
                            nx0Var.g(-0.54f, 0.0f, -0.99f, 0.45f, -0.99f, 0.99f);
                            nx0Var.g(0.0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f);
                            nx0Var.h(20.0f);
                            nx0Var.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                            nx0Var.s(12.03f);
                            nx0Var.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                            nx0Var.h(4.0f);
                            nx0Var.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                            nx0Var.r(5.99f);
                            nx0Var.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                            nx0Var.i(4.01f);
                            nx0Var.g(0.54f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f);
                            nx0Var.g(0.0f, -0.55f, -0.45f, -1.0f, -0.99f, -1.0f);
                            nx0Var.h(3.0f);
                            nx0Var.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            nx0Var.s(14.0f);
                            nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            nx0Var.i(18.0f);
                            nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            nx0Var.r(5.0f);
                            nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            nx0Var.e();
                            w01.a(w01Var, nx0Var.a, qy2Var);
                            x01VarB = w01Var.b();
                            ld0.i = x01VarB;
                        }
                        t01.a(x01VarB, null, iw2.k(av1Var, 20.0f), z8 ? xp1.d(4293212469L) : bk.g, ov0Var3, 432, 0);
                        ov0Var3.p(true);
                        gh0.h(ov0Var3, iw2.o(av1Var, 14.0f));
                        wb1 wb1Var = new wb1(1.0f, true);
                        yz yzVarA = wz.a(am1.g, j9.r, ov0Var3, 0);
                        int iHashCode3 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL3 = ov0Var3.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var3, wb1Var);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar2, yzVarA);
                        q73.h(ov0Var3, ghVar3, l72VarL3);
                        az2.s(iHashCode3, ov0Var3, ghVar4, ov0Var3, waVar);
                        q73.h(ov0Var3, ghVar5, dv1VarH3);
                        kk2 kk2VarA2 = jk2.a(new jo(6.0f, true, new fo(0)), orVar, ov0Var3, 54);
                        int iHashCode4 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL4 = ov0Var3.l();
                        dv1 dv1VarH4 = xp1.H(ov0Var3, av1Var);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar2, kk2VarA2);
                        q73.h(ov0Var3, ghVar3, l72VarL4);
                        az2.s(iHashCode4, ov0Var3, ghVar4, ov0Var3, waVar);
                        q73.h(ov0Var3, ghVar5, dv1VarH4);
                        String strN = ke0.N(2131624108, ov0Var3);
                        long j4 = ((kz) ov0Var3.j(mz.a)).o;
                        long jC2 = v63.c(15);
                        jr0 jr0Var = jr0.h;
                        s83.b(strN, null, j4, jC2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                        if (z8) {
                            ov0Var3.c0(1298730783);
                            iy0Var = iy0Var3;
                            z6 = false;
                            ws.a(xp1.k(xp1.n(iw2.k(av1Var, 8.0f), cj2.a), xp1.d(4293212469L), iy0Var), ov0Var3, 0);
                        } else {
                            iy0Var = iy0Var3;
                            z6 = false;
                            ov0Var3.c0(1293295739);
                        }
                        ov0Var3.p(z6);
                        ov0Var3.p(true);
                        gh0.h(ov0Var3, iw2.g(av1Var, 2.0f));
                        String str4 = str2;
                        long j5 = j2;
                        if (!z8 || str4 == null) {
                            j3 = j5;
                            ov0Var3.c0(-669222529);
                            str3 = str4;
                            iy0Var2 = iy0Var;
                            ghVar = ghVar5;
                            s83.b(ke0.N(2131624109, ov0Var3), null, j3, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                            ov0Var2 = ov0Var3;
                            ov0Var2.p(false);
                        } else {
                            ov0Var3.c0(-669540062);
                            j3 = j5;
                            s83.b(ke0.O(2131624787, new Object[]{str4}, ov0Var3), null, xp1.d(4293212469L), v63.c(12), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597824, 0, 262058);
                            ov0Var2 = ov0Var3;
                            ov0Var2.p(false);
                            str3 = str4;
                            iy0Var2 = iy0Var;
                            ghVar = ghVar5;
                        }
                        ov0Var2.p(true);
                        if (!z8 || str3 == null) {
                            f2 = 6.0f;
                            z7 = false;
                            ov0Var2.c0(-643523531);
                        } else {
                            ov0Var2.c0(-637055722);
                            dv1 dv1VarE3 = zm3.E(xp1.k(xp1.n(av1Var, cj2.a(6.0f)), hz.c(0.12f, xp1.d(4293212469L)), iy0Var2), 7.0f, 3.0f);
                            er1 er1VarC2 = ws.c(j9.f, false);
                            int iHashCode5 = Long.hashCode(ov0Var2.T);
                            l72 l72VarL5 = ov0Var2.l();
                            dv1 dv1VarH5 = xp1.H(ov0Var2, dv1VarE3);
                            ov0Var2.g0();
                            if (ov0Var2.S) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar2, er1VarC2);
                            q73.h(ov0Var2, ghVar3, l72VarL5);
                            az2.s(iHashCode5, ov0Var2, ghVar4, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar, dv1VarH5);
                            ov0 ov0Var4 = ov0Var2;
                            s83.b("v".concat(str3), null, xp1.d(4293212469L), v63.b(11.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597824, 0, 262058);
                            ov0Var2 = ov0Var4;
                            f2 = 6.0f;
                            az2.t(ov0Var2, true, av1Var, 6.0f, ov0Var2);
                            z7 = false;
                        }
                        ov0Var2.p(z7);
                        x01 x01VarB2 = ks.P;
                        if (x01VarB2 == null) {
                            w01 w01Var2 = new w01("Outlined.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i5 = nh3.a;
                            qy2 qy2Var2 = new qy2(hz.b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new q62(10.0f, f2));
                            arrayList.add(new p62(8.59f, 7.41f));
                            arrayList.add(new p62(13.17f, 12.0f));
                            arrayList.add(new x62(-4.58f, 4.59f));
                            arrayList.add(new p62(10.0f, 18.0f));
                            arrayList.add(new x62(f2, -6.0f));
                            arrayList.add(new x62(-6.0f, -6.0f));
                            arrayList.add(m62.c);
                            w01.a(w01Var2, arrayList, qy2Var2);
                            x01VarB2 = w01Var2.b();
                            ks.P = x01VarB2;
                        }
                        t01.a(x01VarB2, null, iw2.k(av1Var, 18.0f), hz.c(0.7f, j3), ov0Var2, 432, 0);
                        ov0Var2.p(true);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new q6(z2, z3, str, au0Var, i2);
        }
    }

    public static final dv1 p(dv1 dv1Var, pu0 pu0Var) {
        return dv1Var.d(new o8(pu0Var));
    }

    public static dv1 q(dv1 dv1Var, yz2 yz2Var, int i2) {
        if ((i2 & 1) != 0) {
            pe2 pe2Var = zj3.a;
            yz2Var = o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        return xp1.o(dv1Var).d(new dw2(yz2Var));
    }

    public static final StackTraceElement r(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final Object s(kb0 kb0Var, au0 au0Var, r60 r60Var) {
        Object obj;
        xz1 xz1VarN;
        Object objE0;
        tz1 tz1Var;
        if (((cv1) kb0Var).e.r) {
            cv1 cv1Var = (cv1) kb0Var;
            if (!cv1Var.e.r) {
                p21.c("visitAncestors called on an unattached node");
            }
            cv1 cv1Var2 = cv1Var.e.i;
            hb1 hb1VarO = xp1.O(kb0Var);
            loop0: while (true) {
                obj = null;
                if (hb1VarO == null) {
                    break;
                }
                if ((hb1VarO.K.f.h & 524288) != 0) {
                    while (cv1Var2 != null) {
                        if ((cv1Var2.g & 524288) != 0) {
                            cv1 cv1VarJ = cv1Var2;
                            gy1 gy1Var = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof bt) {
                                    obj = cv1VarJ;
                                    break loop0;
                                }
                                if ((cv1VarJ.g & 524288) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i2 = 0;
                                    for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                        if ((cv1Var3.g & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cv1VarJ = cv1Var3;
                                            } else {
                                                if (gy1Var == null) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var.b(cv1Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var);
                            }
                        }
                        cv1Var2 = cv1Var2.i;
                    }
                }
                hb1VarO = hb1VarO.u();
                cv1Var2 = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
            }
            bt btVar = (bt) obj;
            if (btVar != null && (objE0 = btVar.E0((xz1VarN = xp1.N(kb0Var)), new ta(2, au0Var, xz1VarN), r60Var)) == z70.e) {
                return objE0;
            }
        }
        return mf3.a;
    }

    public static aw t(long j2, long j3, f30 f30Var, int i2, int i3) {
        long j4 = j2;
        long jB = (i3 & 2) != 0 ? mz.b(j4, f30Var) : j3;
        long j5 = hz.g;
        long jC = hz.c(0.38f, jB);
        aw awVarY = y((kz) ((ov0) f30Var).j(mz.a));
        if (j4 == 16) {
            j4 = awVarY.a;
        }
        long j6 = j4;
        if (jB == 16) {
            jB = awVarY.b;
        }
        long j7 = jB;
        if (j5 == 16) {
            j5 = awVarY.c;
        }
        long j8 = j5;
        if (jC == 16) {
            jC = awVarY.d;
        }
        return new aw(j6, j7, j8, jC);
    }

    public static cw u(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new cw(f2, w, v);
    }

    public static int v(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final float w(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final boolean x(js2 js2Var) {
        return !js2Var.k().e.c(os2.j);
    }

    public static aw y(kz kzVar) {
        aw awVar = kzVar.Z;
        if (awVar != null) {
            return awVar;
        }
        lz lzVar = r;
        aw awVar2 = new aw(mz.c(kzVar, lzVar), mz.a(kzVar, mz.c(kzVar, lzVar)), xp1.q(hz.c(u, mz.c(kzVar, t)), mz.c(kzVar, lzVar)), hz.c(0.38f, mz.a(kzVar, mz.c(kzVar, lzVar))));
        kzVar.Z = awVar2;
        return awVar2;
    }

    public static final boolean z(js2 js2Var) {
        Object objG = js2Var.d.e.g(os2.K);
        if (objG == null) {
            objG = null;
        }
        xa3 xa3Var = (xa3) objG;
        zx1 zx1Var = js2Var.d.e;
        Object objG2 = zx1Var.g(os2.z);
        if (objG2 == null) {
            objG2 = null;
        }
        vh2 vh2Var = (vh2) objG2;
        boolean z2 = xa3Var != null;
        Object objG3 = zx1Var.g(os2.J);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (vh2Var != null && vh2Var.a == 4)) {
            return z2;
        }
        return true;
    }
}
