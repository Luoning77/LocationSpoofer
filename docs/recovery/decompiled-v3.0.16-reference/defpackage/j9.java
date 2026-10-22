package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j9 implements ss, x70, yb0, vc1, fu, yg2, ay2, j23 {
    public static gn O;
    public static j9 T;
    public final /* synthetic */ int e;
    public static final pr f = new pr(-1.0f, -1.0f);
    public static final pr g = new pr(0.0f, -1.0f);
    public static final pr h = new pr(1.0f, -1.0f);
    public static final pr i = new pr(-1.0f, 0.0f);
    public static final pr j = new pr(0.0f, 0.0f);
    public static final pr k = new pr(1.0f, 0.0f);
    public static final pr l = new pr(-1.0f, 1.0f);
    public static final pr m = new pr(0.0f, 1.0f);
    public static final pr n = new pr(1.0f, 1.0f);
    public static final or o = new or(-1.0f);
    public static final or p = new or(0.0f);
    public static final or q = new or(1.0f);
    public static final nr r = new nr(-1.0f);
    public static final nr s = new nr(0.0f);
    public static final nr t = new nr(1.0f);
    public static final j9 u = new j9(1);
    public static final j9 v = new j9(2);
    public static final j9 w = new j9(3);
    public static final j9 x = new j9(4);
    public static final fo y = new fo(7);
    public static final zb z = new zb(1);
    public static final zb A = new zb(2);
    public static final /* synthetic */ j9 B = new j9(7);
    public static final j9 C = new j9(8);
    public static final j9 D = new j9(9);
    public static final j9 E = new j9(10);
    public static final j9 F = new j9(11);
    public static final j9 G = new j9(12);
    public static final j9 H = new j9(13);
    public static final qa1 I = qa1.e;
    public static final ac0 J = new ac0(1.0f, 1.0f);
    public static final j9 K = new j9(14);
    public static final pe2 L = new pe2(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final j9 M = new j9(16);
    public static final j9 N = new j9(17);
    public static final /* synthetic */ j9 P = new j9(18);
    public static final /* synthetic */ j9 Q = new j9(19);
    public static final j9 R = new j9(20);
    public static final j9 S = new j9(21);
    public static final /* synthetic */ j9 U = new j9(23);
    public static final /* synthetic */ j9 V = new j9(24);
    public static final j9 W = new j9(25);
    public static final j9 X = new j9(26);
    public static final j9 Y = new j9(27);
    public static final j9 Z = new j9(28);
    public static final j9 a0 = new j9(29);

    public /* synthetic */ j9(int i2) {
        this.e = i2;
    }

    public static t63 j(int i2, f30 f30Var) {
        return m((kz) ((ov0) f30Var).j(mz.a), f30Var);
    }

    public static t63 k(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, f30 f30Var, int i2) {
        long j14 = (i2 & 1) != 0 ? hz.g : j2;
        long j15 = (i2 & 2) != 0 ? hz.g : j3;
        long j16 = (i2 & 4) != 0 ? hz.g : j4;
        long j17 = hz.g;
        return m((kz) ((ov0) f30Var).j(mz.a), f30Var).a(j14, j15, j16, j17, (i2 & 16) != 0 ? j17 : j5, (i2 & 32) != 0 ? j17 : j6, (i2 & 64) != 0 ? j17 : j7, j17, (i2 & 256) != 0 ? j17 : j8, j17, null, j9, (i2 & 4096) != 0 ? j17 : j10, (i2 & 8192) != 0 ? j17 : j11, j17, j17, j17, j17, j17, j17, j17, j17, j17, (8388608 & i2) != 0 ? j17 : j12, (i2 & 16777216) != 0 ? j17 : j13, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17);
    }

    public static t63 m(kz kzVar, f30 f30Var) {
        ov0 ov0Var;
        boolean z2;
        t63 t63VarA = kzVar.i0;
        if (t63VarA == null) {
            ov0 ov0Var2 = (ov0) f30Var;
            ov0Var2.c0(390452338);
            ov0Var2.p(false);
            t63VarA = null;
            z2 = false;
        } else {
            ov0 ov0Var3 = (ov0) f30Var;
            ov0Var3.c0(390452339);
            i93 i93Var = (i93) ov0Var3.j(j93.a);
            if (o51.f(t63VarA.k, i93Var)) {
                z2 = false;
                ov0Var = ov0Var3;
            } else {
                t63VarA = t63VarA.a(t63VarA.a, t63VarA.b, t63VarA.c, t63VarA.d, t63VarA.e, t63VarA.f, t63VarA.g, t63VarA.h, t63VarA.i, t63VarA.j, i93Var, t63VarA.l, t63VarA.m, t63VarA.n, t63VarA.o, t63VarA.p, t63VarA.q, t63VarA.r, t63VarA.s, t63VarA.t, t63VarA.u, t63VarA.v, t63VarA.w, t63VarA.x, t63VarA.y, t63VarA.z, t63VarA.A, t63VarA.B, t63VarA.C, t63VarA.D, t63VarA.E, t63VarA.F, t63VarA.G, t63VarA.H, t63VarA.I, t63VarA.J, t63VarA.K, t63VarA.L, t63VarA.M, t63VarA.N, t63VarA.O, t63VarA.P, t63VarA.Q);
                kzVar.i0 = t63VarA;
                ov0Var = ov0Var3;
                z2 = false;
            }
            ov0Var.p(z2);
        }
        if (t63VarA != null) {
            ov0 ov0Var4 = (ov0) f30Var;
            ov0Var4.c0(-1788515437);
            ov0Var4.p(z2);
            return t63VarA;
        }
        ov0 ov0Var5 = (ov0) f30Var;
        ov0Var5.c0(-1788321191);
        long jC = mz.c(kzVar, ym3.N);
        long jC2 = mz.c(kzVar, ym3.T);
        lz lzVar = ym3.A;
        long jC3 = hz.c(0.38f, mz.c(kzVar, lzVar));
        long jC4 = mz.c(kzVar, ym3.H);
        long j2 = hz.f;
        long jC5 = mz.c(kzVar, ym3.y);
        long jC6 = mz.c(kzVar, ym3.G);
        i93 i93Var2 = (i93) ov0Var5.j(j93.a);
        long jC7 = mz.c(kzVar, ym3.Q);
        long jC8 = mz.c(kzVar, ym3.Z);
        long jC9 = hz.c(0.12f, mz.c(kzVar, ym3.D));
        long jC10 = mz.c(kzVar, ym3.K);
        long jC11 = mz.c(kzVar, ym3.P);
        long jC12 = mz.c(kzVar, ym3.Y);
        long jC13 = hz.c(0.38f, mz.c(kzVar, ym3.C));
        long jC14 = mz.c(kzVar, ym3.J);
        long jC15 = mz.c(kzVar, ym3.S);
        long jC16 = mz.c(kzVar, ym3.b0);
        long jC17 = hz.c(0.38f, mz.c(kzVar, ym3.F));
        long jC18 = mz.c(kzVar, ym3.M);
        long jC19 = mz.c(kzVar, ym3.O);
        long jC20 = mz.c(kzVar, ym3.X);
        long jC21 = hz.c(0.38f, mz.c(kzVar, ym3.B));
        long jC22 = mz.c(kzVar, ym3.I);
        lz lzVar2 = ym3.U;
        long jC23 = mz.c(kzVar, lzVar2);
        long jC24 = mz.c(kzVar, lzVar2);
        long jC25 = hz.c(0.38f, mz.c(kzVar, lzVar));
        long jC26 = mz.c(kzVar, lzVar2);
        long jC27 = mz.c(kzVar, ym3.R);
        long jC28 = mz.c(kzVar, ym3.a0);
        long jC29 = hz.c(0.38f, mz.c(kzVar, ym3.E));
        long jC30 = mz.c(kzVar, ym3.L);
        lz lzVar3 = ym3.V;
        long jC31 = mz.c(kzVar, lzVar3);
        long jC32 = mz.c(kzVar, lzVar3);
        long jC33 = hz.c(0.38f, mz.c(kzVar, lzVar3));
        long jC34 = mz.c(kzVar, lzVar3);
        lz lzVar4 = ym3.W;
        t63 t63Var = new t63(jC, jC2, jC3, jC4, j2, j2, j2, j2, jC5, jC6, i93Var2, jC7, jC8, jC9, jC10, jC11, jC12, jC13, jC14, jC15, jC16, jC17, jC18, jC19, jC20, jC21, jC22, jC23, jC24, jC25, jC26, jC27, jC28, jC29, jC30, jC31, jC32, jC33, jC34, mz.c(kzVar, lzVar4), mz.c(kzVar, lzVar4), hz.c(0.38f, mz.c(kzVar, lzVar4)), mz.c(kzVar, lzVar4));
        kzVar.i0 = t63Var;
        ov0Var5.p(z2);
        return t63Var;
    }

    @Override // defpackage.fu
    public long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.ss
    public Rect c(Activity activity) throws Exception {
        int i2 = this.e;
        rs rsVar = ss.a;
        DisplayCutout displayCutoutD = null;
        switch (i2) {
            case 2:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        }
                    }
                }
                return rect;
            case 3:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    rsVar.getClass();
                    Log.w(rs.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i5 = rect2.bottom + dimensionPixelSize2;
                    if (i5 == point2.y) {
                        rect2.bottom = i5;
                    } else {
                        int i6 = rect2.right + dimensionPixelSize2;
                        if (i6 == point2.x) {
                            rect2.right = i6;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (j1.p(obj2)) {
                            displayCutoutD = j1.d(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        rsVar.getClass();
                        Log.w(rs.b, e2);
                    }
                    if (displayCutoutD != null) {
                        if (rect2.left == displayCutoutD.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutD.getSafeInsetRight()) {
                            rect2.right = displayCutoutD.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutD.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutD.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutD.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                    break;
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    rsVar.getClass();
                    Log.w(rs.b, e3);
                    return w.c(activity);
                }
        }
    }

    @Override // defpackage.ay2
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.j23
    public void e(i23 i23Var) {
        i23Var.clear();
    }

    @Override // defpackage.yb0
    public float f(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.fu
    public xb0 g() {
        return J;
    }

    @Override // defpackage.fu
    public qa1 getLayoutDirection() {
        return I;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0172  */
    /* JADX WARN: Code duplicated, block: B:103:0x019e  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:92:0x013b  */
    /* JADX WARN: Code duplicated, block: B:95:0x015a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    public void h(final boolean z2, final boolean z3, final ix1 ix1Var, dv1 dv1Var, final t63 t63Var, final au2 au2Var, float f2, float f3, f30 f30Var, final int i2, final int i3) {
        final dv1 dv1Var2;
        int i4;
        int i5;
        int i6;
        final float f4;
        final float f5;
        boolean z4;
        ee2 ee2VarT;
        boolean zBooleanValue;
        long j2;
        yz2 yz2VarK;
        ?? r0;
        s03 s03VarL;
        yz2 yz2VarK2;
        s03 s03VarL2;
        long j3;
        float f6;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1035477640);
        int i7 = (ov0Var.g(z2) ? 4 : 2) | i2 | (ov0Var.g(z3) ? 32 : 16) | (ov0Var.f(ix1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                dv1Var2 = dv1Var;
                i7 |= ov0Var.f(dv1Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (ov0Var.f(t63Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            int i9 = i7 | i4;
            if (ov0Var.f(au2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i9 | i5;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f4 = f2;
                    int i10 = ov0Var.c(f4) ? 1048576 : 524288;
                    i6 |= i10;
                } else {
                    f4 = f2;
                }
                i6 |= i10;
            } else {
                f4 = f2;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & WorkQueueKt.BUFFER_CAPACITY) == 0) {
                    f5 = f3;
                    int i11 = ov0Var.c(f5) ? 8388608 : 4194304;
                    i6 |= i11;
                } else {
                    f5 = f3;
                }
                i6 |= i11;
            } else {
                f5 = f3;
            }
            if ((38347923 & i6) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var.T(i6 & 1, z4)) {
                ov0Var.Y();
                if ((i2 & 1) != 0 || ov0Var.B()) {
                    if (i8 != 0) {
                        dv1Var2 = av1.a;
                    }
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                        f4 = 2.0f;
                    }
                    if ((i3 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                        i6 &= -29360129;
                        f5 = 1.0f;
                    }
                } else {
                    ov0Var.W();
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    if ((i3 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                        i6 &= -29360129;
                    }
                }
                ov0Var.q();
                zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var, (i6 >> 6) & 14).getValue()).booleanValue();
                if (!z2) {
                    j2 = t63Var.n;
                } else if (z3) {
                    j2 = t63Var.o;
                } else if (zBooleanValue) {
                    j2 = t63Var.l;
                } else {
                    j2 = t63Var.m;
                }
                vv1 vv1Var = vv1.h;
                yz2VarK = mc0.K(vv1Var, ov0Var);
                if (z2) {
                    ov0Var.c0(-1674507999);
                    r0 = 0;
                    s03VarL = aw2.a(j2, yz2VarK, ov0Var, 0, 12);
                    ov0Var.p(false);
                } else {
                    r0 = 0;
                    ov0Var.c0(-1674427244);
                    s03VarL = ke0.L(new hz(j2), ov0Var);
                    ov0Var.p(false);
                }
                s03 s03Var = s03VarL;
                yz2VarK2 = mc0.K(vv1.f, ov0Var);
                if (z2) {
                    ov0Var.c0(-1674245832);
                    if (zBooleanValue) {
                        f6 = f4;
                    } else {
                        f6 = f5;
                    }
                    s03VarL2 = qh.a(f6, yz2VarK2, null, ov0Var, 0, 12);
                    ov0Var.p(r0);
                } else {
                    ov0Var.c0(-1674063769);
                    s03VarL2 = ke0.L(new td0(f5), ov0Var);
                    ov0Var.p(r0);
                }
                ey1 ey1VarL = ke0.L(da0.h(((td0) s03VarL2.getValue()).e, ((hz) s03Var.getValue()).a), ov0Var);
                if (!z2) {
                    j3 = t63Var.g;
                } else if (z3) {
                    j3 = t63Var.h;
                } else if (zBooleanValue != 0) {
                    j3 = t63Var.e;
                } else {
                    j3 = t63Var.f;
                }
                s03 s03VarA = aw2.a(j3, mc0.K(vv1Var, ov0Var), ov0Var, 0, 12);
                is isVar = (is) ey1VarL.getValue();
                ws.a(xp1.v(dv1Var2.d(new hs(isVar.a, isVar.b, au2Var)), new jl1(24, au2Var, new u63(new md1(0, 1, s03.class, s03VarA, "value", "getValue()Ljava/lang/Object;")))), ov0Var, r0);
            } else {
                ov0Var.W();
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: c42
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.e.h(z2, z3, ix1Var, dv1Var2, t63Var, au2Var, f4, f5, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        i7 |= 3072;
        dv1Var2 = dv1Var;
        if (ov0Var.f(t63Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i12 = i7 | i4;
        if (ov0Var.f(au2Var)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i12 | i5;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f4 = f2;
                if (ov0Var.c(f4)) {
                }
                i6 |= i10;
            } else {
                f4 = f2;
            }
            i6 |= i10;
        } else {
            f4 = f2;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & WorkQueueKt.BUFFER_CAPACITY) == 0) {
                f5 = f3;
                if (ov0Var.c(f5)) {
                }
                i6 |= i11;
            } else {
                f5 = f3;
            }
            i6 |= i11;
        } else {
            f5 = f3;
        }
        if ((38347923 & i6) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ov0Var.T(i6 & 1, z4)) {
            ov0Var.Y();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    dv1Var2 = av1.a;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f4 = 2.0f;
                }
                if ((i3 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                    i6 &= -29360129;
                    f5 = 1.0f;
                }
            } else {
                if (i8 != 0) {
                    dv1Var2 = av1.a;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f4 = 2.0f;
                }
                if ((i3 & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                    i6 &= -29360129;
                    f5 = 1.0f;
                }
            }
            ov0Var.q();
            zBooleanValue = ((Boolean) hd0.o(ix1Var, ov0Var, (i6 >> 6) & 14).getValue()).booleanValue();
            if (!z2) {
                j2 = t63Var.n;
            } else if (z3) {
                j2 = t63Var.o;
            } else if (zBooleanValue) {
                j2 = t63Var.l;
            } else {
                j2 = t63Var.m;
            }
            vv1 vv1Var2 = vv1.h;
            yz2VarK = mc0.K(vv1Var2, ov0Var);
            if (z2) {
                ov0Var.c0(-1674507999);
                r0 = 0;
                s03VarL = aw2.a(j2, yz2VarK, ov0Var, 0, 12);
                ov0Var.p(false);
            } else {
                r0 = 0;
                ov0Var.c0(-1674427244);
                s03VarL = ke0.L(new hz(j2), ov0Var);
                ov0Var.p(false);
            }
            s03 s03Var2 = s03VarL;
            yz2VarK2 = mc0.K(vv1.f, ov0Var);
            if (z2) {
                ov0Var.c0(-1674245832);
                if (zBooleanValue) {
                    f6 = f4;
                } else {
                    f6 = f5;
                }
                s03VarL2 = qh.a(f6, yz2VarK2, null, ov0Var, 0, 12);
                ov0Var.p(r0);
            } else {
                ov0Var.c0(-1674063769);
                s03VarL2 = ke0.L(new td0(f5), ov0Var);
                ov0Var.p(r0);
            }
            ey1 ey1VarL2 = ke0.L(da0.h(((td0) s03VarL2.getValue()).e, ((hz) s03Var2.getValue()).a), ov0Var);
            if (!z2) {
                j3 = t63Var.g;
            } else if (z3) {
                j3 = t63Var.h;
            } else if (zBooleanValue != 0) {
                j3 = t63Var.e;
            } else {
                j3 = t63Var.f;
            }
            s03 s03VarA2 = aw2.a(j3, mc0.K(vv1Var2, ov0Var), ov0Var, 0, 12);
            is isVar2 = (is) ey1VarL2.getValue();
            ws.a(xp1.v(dv1Var2.d(new hs(isVar2.a, isVar2.b, au2Var)), new jl1(24, au2Var, new u63(new md1(0, 1, s03.class, s03VarA2, "value", "getValue()Ljava/lang/Object;")))), ov0Var, r0);
        } else {
            ov0Var.W();
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: c42
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.h(z2, z3, ix1Var, dv1Var2, t63Var, au2Var, f4, f5, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public void i(final String str, final pu0 pu0Var, final boolean z2, final boolean z3, final ak3 ak3Var, final ix1 ix1Var, final boolean z4, final pu0 pu0Var2, final pu0 pu0Var3, final pu0 pu0Var4, final pu0 pu0Var5, final pu0 pu0Var6, final t63 t63Var, z42 z42Var, final p10 p10Var, f30 f30Var, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        ov0 ov0Var;
        final z42 z42Var2;
        z42 b52Var;
        int i4;
        p10 p10Var2;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var2.h(pu0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z2;
            i3 |= ov0Var2.g(z5) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        } else {
            z5 = z2;
        }
        if ((i2 & 3072) == 0) {
            z6 = z3;
            i3 |= ov0Var2.g(z6) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            z6 = z3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ov0Var2.f(ak3Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ov0Var2.f(ix1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= ov0Var2.g(z4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= ov0Var2.h(pu0Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= ov0Var2.h(pu0Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= ov0Var2.h(pu0Var4) ? 536870912 : 268435456;
        }
        int i5 = 14155776 | (ov0Var2.h(pu0Var5) ? 4 : 2) | (ov0Var2.h(null) ? 32 : 16) | (ov0Var2.h(null) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(pu0Var6) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.f(t63Var) ? 16384 : 8192) | 65536;
        if (ov0Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            ov0Var2.Y();
            if ((i2 & 1) == 0 || ov0Var2.B()) {
                b52Var = new b52(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i5 & (-458753);
            } else {
                ov0Var2.W();
                i4 = i5 & (-458753);
                b52Var = z42Var;
            }
            ov0Var2.q();
            int i6 = i4;
            boolean z7 = ((i3 & 57344) == 16384) | ((i3 & 14) == 4);
            Object objQ = ov0Var2.Q();
            if (z7 || objQ == d30.a) {
                objQ = ak3Var.a(new dj(str));
                ov0Var2.m0(objQ);
            }
            String str2 = ((bc3) objQ).a.f;
            l73 l73Var = new l73();
            if (pu0Var2 == null) {
                ov0Var2.c0(1927058812);
                ov0Var2.p(false);
                p10Var2 = null;
            } else {
                ov0Var2.c0(1927058813);
                p10 p10VarA0 = sb.a0(-1459717586, new db0(pu0Var2, 1), ov0Var2);
                ov0Var2.p(false);
                p10Var2 = p10VarA0;
            }
            int i7 = i3 >> 9;
            int i8 = i6 << 21;
            ov0Var = ov0Var2;
            h73.d(str2, pu0Var, l73Var, p10Var2, pu0Var3, pu0Var4, pu0Var5, pu0Var6, z6, z5, z4, ix1Var, b52Var, t63Var, p10Var, ov0Var, ((i3 << 3) & 896) | 6 | (i7 & 458752) | (i7 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), (i3 & 896) | ((i6 >> 9) & 14) | ((i3 >> 6) & 112) | (i7 & 7168) | ((i3 >> 3) & 57344) | ((i6 << 6) & 3670016) | 12582912);
            z42Var2 = b52Var;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            z42Var2 = z42Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: d42
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i2 | 1);
                    this.e.i(str, pu0Var, z2, z3, ak3Var, ix1Var, z4, pu0Var2, pu0Var3, pu0Var4, pu0Var5, pu0Var6, t63Var, z42Var2, p10Var, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    @Override // defpackage.j23
    public boolean l(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.e) {
            case 25:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vc1
    public void b() {
    }

    @Override // defpackage.vc1
    public void cancel() {
    }
}
