package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u92 implements ay2, dm3, ot1, kq0, hb0, az1, u6, io, ko, x70 {
    public static final /* synthetic */ u92 f = new u92(0);
    public static final u92 g = new u92(1);
    public static final u92 h = new u92(2);
    public static final u92 i = new u92(3);
    public static final u92 j = new u92(4);
    public static final u92 k = new u92(5);
    public static final yp2 l = new yp2(0);
    public static final yp2 m = new yp2(1);
    public static final yp2 n = new yp2(2);
    public static final yp2 o = new yp2(3);
    public static final /* synthetic */ u92 p = new u92(7);
    public static final u92 q = new u92(8);
    public static final u92 r = new u92(9);
    public static final u92 s = new u92(10);
    public static final b81 t = new b81(19);
    public static final b81 u = new b81(20);
    public static final u92 v = new u92(12);
    public static final b81 w = new b81(28);
    public static final u92 x = new u92(14);
    public static final em3 y = new em3();
    public final /* synthetic */ int e;

    public u92() {
        this.e = 25;
        new mk1(16);
        long[] jArr = hn2.a;
        new zx1();
    }

    public static uu k(String str) {
        if (str.length() % 2 != 0) {
            fo.f("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (ks.M(str.charAt(i3 + 1)) + (ks.M(str.charAt(i3)) << 4));
        }
        return new uu(bArr);
    }

    public static uu l(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(sw.a);
        bytes.getClass();
        uu uuVar = new uu(bytes);
        uuVar.g = str;
        return uuVar;
    }

    public static lx n(String str) {
        lx lxVar = new lx(str);
        lx.d.put(str, lxVar);
        return lxVar;
    }

    public static vf1 p(List list) {
        return new vf1(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    @Override // defpackage.io, defpackage.ko
    public float a() {
        switch (this.e) {
        }
        return 0.0f;
    }

    @Override // defpackage.hb0
    public boolean c(SSLSocket sSLSocket) {
        return s13.Z(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.ay2
    public boolean d(Object obj, Object obj2) {
        switch (this.e) {
            case 2:
                return obj == obj2;
            default:
                return o51.f(obj, obj2);
        }
    }

    @Override // defpackage.dm3
    public zl3 e(ContextWrapper contextWrapper, yb0 yb0Var) {
        ss ssVar;
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            ss.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                ssVar = ts.e;
            } else if (i2 >= 29) {
                ssVar = j9.x;
            } else {
                ssVar = i2 >= 28 ? j9.w : j9.v;
            }
            return new zl3(new os(ssVar.c(activity)), yb0Var.f(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            fo.i("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new zl3(new Rect(0, 0, point.x, point.y), yb0Var.f(contextWrapper));
    }

    @Override // defpackage.hb0
    public ly2 f(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new bg(superclass);
    }

    @Override // defpackage.io
    public void g(gr1 gr1Var, int i2, int[] iArr, qa1 qa1Var, int[] iArr2) {
        int i3 = this.e;
        qa1 qa1Var2 = qa1.e;
        switch (i3) {
            case 23:
                if (qa1Var != qa1Var2) {
                    am1.M(i2, iArr, iArr2, true);
                } else {
                    am1.M(i2, iArr, iArr2, false);
                }
                break;
            default:
                if (qa1Var != qa1Var2) {
                    am1.N(i2, iArr, iArr2, true);
                } else {
                    am1.N(i2, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // defpackage.ko
    public void h(int i2, gr1 gr1Var, int[] iArr, int[] iArr2) {
        switch (this.e) {
            case 23:
                am1.M(i2, iArr, iArr2, false);
                break;
            default:
                am1.N(i2, iArr, iArr2, false);
                break;
        }
    }

    public void i(Drawable drawable, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(257732500);
        int i3 = (ov0Var.h(drawable) ? 4 : 2) | i2;
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            dv1 dv1VarK = iw2.k(av1.a, m60.e);
            boolean zH = ov0Var.h(drawable);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                objQ = new ge2(drawable, 18);
                ov0Var.m0(objQ);
            }
            ws.a(xp1.s(dv1VarK, (lu0) objQ), ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i2, 23, this, drawable);
        }
    }

    public void j(final Icon icon, f30 f30Var, final int i2) {
        ee2 ee2VarT;
        pu0 pu0Var;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2116504409);
        int i3 = (ov0Var.h(icon) ? 4 : 2) | i2;
        final int i4 = 0;
        final int i5 = 1;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            boolean zF = ov0Var.f(icon) | ov0Var.f(context);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                objQ = icon.loadDrawable(context);
                ov0Var.m0(objQ);
            }
            Drawable drawable = (Drawable) objQ;
            if (drawable == null) {
                ee2VarT = ov0Var.t();
                if (ee2VarT == null) {
                    return;
                } else {
                    pu0Var = new pu0(this, icon, i2, i4) { // from class: d63
                        public final /* synthetic */ int e;
                        public final /* synthetic */ u92 f;
                        public final /* synthetic */ Icon g;

                        {
                            this.e = i4;
                            this.f = this;
                        }

                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.e;
                            mf3 mf3Var = mf3.a;
                            Icon icon2 = this.g;
                            u92 u92Var = this.f;
                            f30 f30Var2 = (f30) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    u92Var.j(icon2, f30Var2, wc0.m0(49));
                                    break;
                                default:
                                    u92Var.j(icon2, f30Var2, wc0.m0(49));
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                }
            } else {
                i(drawable, ov0Var, 48);
            }
            ee2VarT.d = pu0Var;
        }
        ov0Var.W();
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            pu0Var = new pu0(this, icon, i2, i5) { // from class: d63
                public final /* synthetic */ int e;
                public final /* synthetic */ u92 f;
                public final /* synthetic */ Icon g;

                {
                    this.e = i5;
                    this.f = this;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = this.e;
                    mf3 mf3Var = mf3.a;
                    Icon icon2 = this.g;
                    u92 u92Var = this.f;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            u92Var.j(icon2, f30Var2, wc0.m0(49));
                            break;
                        default:
                            u92Var.j(icon2, f30Var2, wc0.m0(49));
                            break;
                    }
                    return mf3Var;
                }
            };
            ee2VarT.d = pu0Var;
        }
    }

    public synchronized lx m(String str) {
        lx lxVar;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = lx.d;
            lxVar = (lx) linkedHashMap.get(str);
            if (lxVar == null) {
                if (s13.Z(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = s13.Z(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                lxVar = (lx) linkedHashMap.get(strConcat);
                if (lxVar == null) {
                    lxVar = new lx(str);
                }
                linkedHashMap.put(str, lxVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lxVar;
    }

    @Override // defpackage.ot1
    public boolean o(ms1 ms1Var) {
        return false;
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return "ReferentialEqualityPolicy";
            case 8:
                return "StructuralEqualityPolicy";
            case 23:
                return "Arrangement#Center";
            case 24:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u92(int i2) {
        this.e = i2;
    }

    @Override // defpackage.ot1
    public void b(ms1 ms1Var, boolean z) {
    }
}
