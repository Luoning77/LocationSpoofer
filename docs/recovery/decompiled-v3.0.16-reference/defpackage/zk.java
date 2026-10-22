package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zk extends ok implements ks1, LayoutInflater.Factory2 {
    public static final tv2 l0 = new tv2(0);
    public static final int[] m0 = {R.attr.windowBackground};
    public static final boolean n0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean o0 = true;
    public PopupWindow A;
    public pk B;
    public boolean D;
    public ViewGroup E;
    public TextView F;
    public View G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public yk[] P;
    public yk Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Configuration V;
    public final int W;
    public int X;
    public int Y;
    public boolean Z;
    public wk a0;
    public wk b0;
    public boolean c0;
    public int d0;
    public boolean f0;
    public Rect g0;
    public Rect h0;
    public wm i0;
    public OnBackInvokedDispatcher j0;
    public OnBackInvokedCallback k0;
    public final Object n;
    public final Context o;
    public Window p;
    public vk q;
    public final hk r;
    public r6 s;
    public p23 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public qk w;
    public qk x;
    public l7 y;
    public ActionBarContextView z;
    public sj3 C = null;
    public final pk e0 = new pk(this, 0);

    public zk(Context context, Window window, hk hkVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.W = -100;
        this.o = context;
        this.r = hkVar;
        this.n = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.W = ((zk) appCompatActivity.getDelegate()).W;
            }
        }
        if (this.W == -100) {
            String name = this.n.getClass().getName();
            tv2 tv2Var = l0;
            Integer num = (Integer) tv2Var.get(name);
            if (num != null) {
                this.W = num.intValue();
                tv2Var.remove(this.n.getClass().getName());
            }
        }
        if (window != null) {
            t(window);
        }
        cl.c();
    }

    public static uh1 u(Context context) {
        uh1 uh1Var;
        uh1 uh1Var2;
        if (Build.VERSION.SDK_INT >= 33 || (uh1Var = ok.g) == null) {
            return null;
        }
        vh1 vh1Var = uh1Var.a;
        uh1 uh1VarB = sk.b(context.getApplicationContext().getResources().getConfiguration());
        if (uh1Var.b()) {
            uh1Var2 = uh1.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < uh1VarB.a.a.size() + vh1Var.a.size()) {
                Locale locale = i < vh1Var.a.size() ? vh1Var.a.get(i) : uh1VarB.a.a.get(i - vh1Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            uh1Var2 = new uh1(new vh1(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return uh1Var2.b() ? uh1VarB : uh1Var2;
    }

    public static Configuration y(Context context, int i, uh1 uh1Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (uh1Var != null) {
            sk.d(configuration2, uh1Var);
        }
        return configuration2;
    }

    public final void A(int i) {
        yk ykVarE = E(i);
        if (ykVarE.h != null) {
            Bundle bundle = new Bundle();
            ykVarE.h.t(bundle);
            if (bundle.size() > 0) {
                ykVarE.p = bundle;
            }
            ykVarE.h.w();
            ykVarE.h.clear();
        }
        ykVarE.o = true;
        ykVarE.n = true;
        if ((i == 108 || i == 0) && this.v != null) {
            yk ykVarE2 = E(0);
            ykVarE2.k = false;
            L(ykVarE2, null);
        }
    }

    public final void B() {
        ViewGroup viewGroup;
        if (this.D) {
            return;
        }
        Context context = this.o;
        int[] iArr = jd2.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            fo.n("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            k(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            k(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            k(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            k(10);
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        C();
        this.p.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.N) {
            viewGroup = this.L ? (ViewGroup) layoutInflaterFrom.inflate(2131427350, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131427349, (ViewGroup) null);
        } else if (this.M) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131427340, (ViewGroup) null);
            this.K = false;
            this.J = false;
        } else if (this.J) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903049, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p60(context, typedValue.resourceId) : context).inflate(2131427351, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(2131230810);
            this.v = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.p.getCallback());
            if (this.K) {
                this.v.j(109);
            }
            if (this.H) {
                this.v.j(2);
            }
            if (this.I) {
                this.v.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.J + ", windowActionBarOverlay: " + this.K + ", android:windowIsFloating: " + this.M + ", windowActionModeOverlay: " + this.L + ", windowNoTitle: " + this.N + " }");
        }
        qk qkVar = new qk(this, i);
        WeakHashMap weakHashMap = yi3.a;
        ri3.h(viewGroup, qkVar);
        if (this.v == null) {
            this.F = (TextView) viewGroup.findViewById(2131230926);
        }
        Method method = xj3.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131230760);
        ViewGroup viewGroup2 = (ViewGroup) this.p.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.p.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new qk(this, i2));
        this.E = viewGroup;
        Object obj = this.n;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                r6 r6Var = this.s;
                if (r6Var != null) {
                    r6Var.n(title);
                } else {
                    TextView textView = this.F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(R.id.content);
        View decorView = this.p.getDecorView();
        contentFrameLayout2.k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = yi3.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.D = true;
        yk ykVarE = E(0);
        if (this.U || ykVarE.h != null) {
            return;
        }
        G(108);
    }

    public final void C() {
        if (this.p == null) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                t(((Activity) obj).getWindow());
            }
        }
        if (this.p != null) {
            return;
        }
        fo.n("We have not been given a Window");
    }

    public final e1 D(Context context) {
        wk wkVar = this.a0;
        if (wkVar == null) {
            gn gnVar = gn.f;
            if (gnVar == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                gnVar = new gn();
                gnVar.b = new lf();
                gnVar.c = applicationContext;
                gnVar.a = locationManager;
                gn.f = gnVar;
            }
            wkVar = new wk(this, gnVar);
            this.a0 = wkVar;
        }
        return wkVar;
    }

    public final yk E(int i) {
        yk[] ykVarArr = this.P;
        if (ykVarArr == null || ykVarArr.length <= i) {
            yk[] ykVarArr2 = new yk[i + 1];
            if (ykVarArr != null) {
                System.arraycopy(ykVarArr, 0, ykVarArr2, 0, ykVarArr.length);
            }
            this.P = ykVarArr2;
            ykVarArr = ykVarArr2;
        }
        yk ykVar = ykVarArr[i];
        if (ykVar != null) {
            return ykVar;
        }
        yk ykVar2 = new yk();
        ykVar2.a = i;
        ykVar2.n = false;
        ykVarArr[i] = ykVar2;
        return ykVar2;
    }

    public final void F() {
        r6 pk3Var;
        B();
        if (this.J && (pk3Var = this.s) == null) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                pk3Var = new pk3((Activity) obj, this.K);
                this.s = pk3Var;
            } else if (obj instanceof Dialog) {
                pk3Var = new pk3((Dialog) obj);
                this.s = pk3Var;
            }
            if (pk3Var != null) {
                pk3Var.l(this.f0);
            }
        }
    }

    public final void G(int i) {
        this.d0 = (1 << i) | this.d0;
        if (this.c0) {
            return;
        }
        View decorView = this.p.getDecorView();
        WeakHashMap weakHashMap = yi3.a;
        decorView.postOnAnimation(this.e0);
        this.c0 = true;
    }

    public final int H(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            fo.n("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        wk wkVar = this.b0;
                        if (wkVar == null) {
                            wkVar = new wk(this, context);
                            this.b0 = wkVar;
                        }
                        return wkVar.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return D(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean I() {
        boolean z = this.R;
        this.R = false;
        yk ykVarE = E(0);
        if (!ykVarE.m) {
            l7 l7Var = this.y;
            if (l7Var != null) {
                l7Var.a();
                return true;
            }
            F();
            r6 r6Var = this.s;
            if (r6Var == null || !r6Var.b()) {
                return false;
            }
        } else if (!z) {
            x(ykVarE, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(defpackage.yk r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk.J(yk, android.view.KeyEvent):void");
    }

    public final boolean K(yk ykVar, int i, KeyEvent keyEvent) {
        ms1 ms1Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((ykVar.k || L(ykVar, keyEvent)) && (ms1Var = ykVar.h) != null) {
            return ms1Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6 A[PHI: r6
      0x00d6: PHI (r6v2 ms1) = (r6v1 ms1), (r6v8 ms1) binds: [B:34:0x0054, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    public final boolean L(yk ykVar, KeyEvent keyEvent) {
        ms1 ms1Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        qk qkVar;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.U) {
            boolean z = ykVar.k;
            int i = ykVar.a;
            if (z) {
                return true;
            }
            yk ykVar2 = this.Q;
            if (ykVar2 != null && ykVar2 != ykVar) {
                x(ykVar2, false);
            }
            Window.Callback callback = this.p.getCallback();
            if (callback != null) {
                ykVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((jb3) actionBarOverlayLayout4.i).l = true;
            }
            if (ykVar.g == null && (!z2 || !(this.s instanceof gb3))) {
                ms1 ms1Var2 = ykVar.h;
                if (ms1Var2 == null || ykVar.o) {
                    if (ms1Var2 == null) {
                        Context context = this.o;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130903049, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(2130903050, typedValue, true);
                            } else {
                                theme.resolveAttribute(2130903050, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                p60 p60Var = new p60(context, 0);
                                p60Var.getTheme().setTo(themeNewTheme);
                                context = p60Var;
                            }
                        }
                        ms1 ms1Var3 = new ms1(context);
                        ms1Var3.e = this;
                        ms1 ms1Var4 = ykVar.h;
                        if (ms1Var3 != ms1Var4) {
                            if (ms1Var4 != null) {
                                ms1Var4.r(ykVar.i);
                            }
                            ykVar.h = ms1Var3;
                            pg1 pg1Var = ykVar.i;
                            if (pg1Var != null) {
                                ms1Var3.b(pg1Var, ms1Var3.a);
                            }
                        }
                        ms1Var2 = ykVar.h;
                        if (ms1Var2 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                                qkVar = this.w;
                                if (qkVar == null) {
                                    qkVar = new qk(this, 2);
                                    this.w = qkVar;
                                }
                                actionBarOverlayLayout2.l(ms1Var2, qkVar);
                            }
                            ykVar.h.w();
                            if (callback.onCreatePanelMenu(i, ykVar.h)) {
                                ykVar.o = false;
                            } else {
                                ms1Var = ykVar.h;
                                if (ms1Var != null) {
                                    if (ms1Var != null) {
                                        ms1Var.r(ykVar.i);
                                    }
                                    ykVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.v) != null) {
                                    actionBarOverlayLayout.l(null, this.w);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            qkVar = this.w;
                            if (qkVar == null) {
                                qkVar = new qk(this, 2);
                                this.w = qkVar;
                            }
                            actionBarOverlayLayout2.l(ms1Var2, qkVar);
                        }
                        ykVar.h.w();
                        if (callback.onCreatePanelMenu(i, ykVar.h)) {
                            ms1Var = ykVar.h;
                            if (ms1Var != null) {
                                if (ms1Var != null) {
                                    ms1Var.r(ykVar.i);
                                }
                                ykVar.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.w);
                            }
                        } else {
                            ykVar.o = false;
                        }
                    }
                }
                ykVar.h.w();
                Bundle bundle = ykVar.p;
                if (bundle != null) {
                    ykVar.h.s(bundle);
                    ykVar.p = null;
                }
                if (!callback.onPreparePanel(0, ykVar.g, ykVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    ykVar.h.v();
                    return false;
                }
                ykVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                ykVar.h.v();
            }
            ykVar.k = true;
            ykVar.l = false;
            this.Q = ykVar;
            return true;
        }
        return false;
    }

    public final void M() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void N() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.j0 != null && (E(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.k0 == null) {
                this.k0 = uk.b(this.j0, this);
            } else {
                if (z || (onBackInvokedCallback = this.k0) == null) {
                    return;
                }
                uk.c(this.j0, onBackInvokedCallback);
            }
        }
    }

    @Override // defpackage.ok
    public final void c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.o);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof zk) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.ok
    public final void d() {
        if (this.s != null) {
            F();
            if (this.s.f()) {
                return;
            }
            G(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.ks1
    public final boolean e(ms1 ms1Var, MenuItem menuItem) {
        yk ykVar;
        Window.Callback callback = this.p.getCallback();
        if (callback != null && !this.U) {
            ms1 ms1VarK = ms1Var.k();
            yk[] ykVarArr = this.P;
            int length = ykVarArr != null ? ykVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                ykVar = ykVarArr[i];
                if (ykVar != null && ykVar.h == ms1VarK) {
                    if (ykVar != null) {
                        return callback.onMenuItemSelected(ykVar.a, menuItem);
                    }
                }
            }
            ykVar = null;
            if (ykVar != null) {
                return callback.onMenuItemSelected(ykVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.ok
    public final void g() {
        String strB;
        this.S = true;
        s(false, true);
        C();
        Object obj = this.n;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strB = ce0.B(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strB = null;
            }
            if (strB != null) {
                r6 r6Var = this.s;
                if (r6Var == null) {
                    this.f0 = true;
                } else {
                    r6Var.l(true);
                }
            }
            synchronized (ok.l) {
                ok.i(this);
                ok.k.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.o.getResources().getConfiguration());
        this.T = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.ok
    public final void h() {
        if (this.n instanceof Activity) {
            synchronized (ok.l) {
                ok.i(this);
            }
        }
        if (this.c0) {
            this.p.getDecorView().removeCallbacks(this.e0);
        }
        this.U = true;
        if (this.W != -100) {
            Object obj = this.n;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                l0.put(this.n.getClass().getName(), Integer.valueOf(this.W));
            } else {
                l0.remove(this.n.getClass().getName());
            }
        } else {
            l0.remove(this.n.getClass().getName());
        }
        r6 r6Var = this.s;
        if (r6Var != null) {
            r6Var.h();
        }
        wk wkVar = this.a0;
        if (wkVar != null) {
            wkVar.c();
        }
        wk wkVar2 = this.b0;
        if (wkVar2 != null) {
            wkVar2.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.ks1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.ms1 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk.j(ms1):void");
    }

    @Override // defpackage.ok
    public final boolean k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.N && i == 108) {
            return false;
        }
        if (this.J && i == 1) {
            this.J = false;
        }
        if (i == 1) {
            M();
            this.N = true;
            return true;
        }
        if (i == 2) {
            M();
            this.H = true;
            return true;
        }
        if (i == 5) {
            M();
            this.I = true;
            return true;
        }
        if (i == 10) {
            M();
            this.L = true;
            return true;
        }
        if (i == 108) {
            M();
            this.J = true;
            return true;
        }
        if (i != 109) {
            return this.p.requestFeature(i);
        }
        M();
        this.K = true;
        return true;
    }

    @Override // defpackage.ok
    public final void m(int i) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.o).inflate(i, viewGroup);
        this.q.a(this.p.getCallback());
    }

    @Override // defpackage.ok
    public final void n(View view) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.q.a(this.p.getCallback());
    }

    @Override // defpackage.ok
    public final void o(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.q.a(this.p.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View llVar;
        wm wmVar = this.i0;
        View view2 = null;
        if (wmVar == null) {
            int[] iArr = jd2.j;
            Context context2 = this.o;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                wmVar = new wm();
                this.i0 = wmVar;
            } else {
                try {
                    wm wmVar2 = (wm) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.i0 = wmVar2;
                    wmVar = wmVar2;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    wmVar = new wm();
                    this.i0 = wmVar;
                }
            }
        }
        int i = lh3.a;
        wmVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context p60Var = (resourceId == 0 || ((context instanceof p60) && ((p60) context).a == resourceId)) ? context : new p60(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                llVar = new ll(p60Var, attributeSet);
                break;
            case 1:
                llVar = new jk(p60Var, attributeSet);
                break;
            case 2:
                llVar = new il(p60Var, attributeSet);
                break;
            case 3:
                llVar = new mm(p60Var, attributeSet);
                break;
            case 4:
                llVar = new gl(p60Var, attributeSet, 2130903205);
                break;
            case Logger.WARN /* 5 */:
                llVar = new nl(p60Var, attributeSet);
                break;
            case Logger.ERROR /* 6 */:
                llVar = new bm(p60Var, attributeSet);
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                llVar = new kl(p60Var, attributeSet);
                break;
            case 8:
                llVar = new um(p60Var, attributeSet);
                break;
            case mc0.b /* 9 */:
                llVar = new hl(p60Var, attributeSet, 0);
                break;
            case mc0.c /* 10 */:
                llVar = new ek(p60Var, attributeSet);
                break;
            case 11:
                llVar = new ik(p60Var, attributeSet);
                break;
            case mc0.d /* 12 */:
                llVar = new el(p60Var, attributeSet);
                break;
            case 13:
                llVar = new gk(p60Var, attributeSet);
                break;
            default:
                llVar = null;
                break;
        }
        if (llVar == null && context != p60Var) {
            Object[] objArr = wmVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = p60Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = wm.g;
                        if (i2 < 3) {
                            View viewA = wmVar.a(p60Var, str, strArr[i2]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = wmVar.a(p60Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            llVar = view2;
        }
        if (llVar != null) {
            Context context3 = llVar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = yi3.a;
                if (llVar.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, wm.c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        llVar.setOnClickListener(new vm(llVar, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = p60Var.obtainStyledAttributes(attributeSet, wm.d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = yi3.a;
                    new ni3(2131230908, Boolean.class, 0, 28, 2).f(llVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = p60Var.obtainStyledAttributes(attributeSet, wm.e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    yi3.k(llVar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = p60Var.obtainStyledAttributes(attributeSet, wm.f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = yi3.a;
                    new ni3(2131230914, Boolean.class, 0, 28, 0).f(llVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return llVar;
    }

    @Override // defpackage.ok
    public final void p(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        r6 r6Var = this.s;
        if (r6Var != null) {
            r6Var.n(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    @Override // defpackage.ok
    public final l7 q(k7 k7Var) {
        l7 l7VarOnWindowStartingSupportActionMode;
        boolean z;
        ViewGroup viewGroup;
        if (k7Var == null) {
            fo.i("ActionMode callback can not be null.");
            return null;
        }
        l7 l7Var = this.y;
        if (l7Var != null) {
            l7Var.a();
        }
        d31 d31Var = new d31(4, this, k7Var, false);
        F();
        r6 r6Var = this.s;
        hk hkVar = this.r;
        if (r6Var != null) {
            l7 l7VarO = r6Var.o(d31Var);
            this.y = l7VarO;
            if (l7VarO != null) {
                hkVar.onSupportActionModeStarted(l7VarO);
            }
        }
        if (this.y == null) {
            sj3 sj3Var = this.C;
            if (sj3Var != null) {
                sj3Var.b();
            }
            l7 l7Var2 = this.y;
            if (l7Var2 != null) {
                l7Var2.a();
            }
            if (this.U) {
                l7VarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    l7VarOnWindowStartingSupportActionMode = hkVar.onWindowStartingSupportActionMode(d31Var);
                } catch (AbstractMethodError unused) {
                    l7VarOnWindowStartingSupportActionMode = null;
                }
            }
            if (l7VarOnWindowStartingSupportActionMode != null) {
                this.y = l7VarOnWindowStartingSupportActionMode;
            } else {
                int i = 1;
                if (this.z == null) {
                    boolean z2 = this.M;
                    Context context = this.o;
                    if (z2) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(2130903049, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            p60 p60Var = new p60(context, 0);
                            p60Var.getTheme().setTo(themeNewTheme);
                            context = p60Var;
                        }
                        this.z = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130903064);
                        this.A = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.A.setContentView(this.z);
                        this.A.setWidth(-1);
                        context.getTheme().resolveAttribute(2130903043, typedValue, true);
                        this.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.A.setHeight(-2);
                        this.B = new pk(this, i);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.E.findViewById(2131230773);
                        if (viewStubCompat != null) {
                            F();
                            r6 r6Var2 = this.s;
                            Context contextE = r6Var2 != null ? r6Var2.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.z = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.z != null) {
                    sj3 sj3Var2 = this.C;
                    if (sj3Var2 != null) {
                        sj3Var2.b();
                    }
                    this.z.e();
                    Context context2 = this.z.getContext();
                    ActionBarContextView actionBarContextView = this.z;
                    f03 f03Var = new f03();
                    f03Var.g = context2;
                    f03Var.h = actionBarContextView;
                    f03Var.i = d31Var;
                    ms1 ms1Var = new ms1(actionBarContextView.getContext());
                    ms1Var.l = 1;
                    f03Var.l = ms1Var;
                    ms1Var.e = f03Var;
                    if (((k7) d31Var.f).i(f03Var, ms1Var)) {
                        f03Var.h();
                        this.z.c(f03Var);
                        this.y = f03Var;
                        if (!this.D || (viewGroup = this.E) == null) {
                            z = false;
                        } else {
                            WeakHashMap weakHashMap = yi3.a;
                            if (viewGroup.isLaidOut()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        ActionBarContextView actionBarContextView2 = this.z;
                        if (z) {
                            actionBarContextView2.setAlpha(0.0f);
                            sj3 sj3VarA = yi3.a(this.z);
                            sj3VarA.a(1.0f);
                            this.C = sj3VarA;
                            sj3VarA.d(new rk(this, i));
                        } else {
                            actionBarContextView2.setAlpha(1.0f);
                            this.z.setVisibility(0);
                            if (this.z.getParent() instanceof View) {
                                View view = (View) this.z.getParent();
                                WeakHashMap weakHashMap2 = yi3.a;
                                pi3.c(view);
                            }
                        }
                        if (this.A != null) {
                            this.p.getDecorView().post(this.B);
                        }
                    } else {
                        this.y = null;
                    }
                }
            }
            l7 l7Var3 = this.y;
            if (l7Var3 != null) {
                hkVar.onSupportActionModeStarted(l7Var3);
            }
            N();
            this.y = this.y;
        }
        N();
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.U) {
            return false;
        }
        int i2 = this.W;
        if (i2 == -100) {
            i2 = ok.f;
        }
        Context context = this.o;
        int iH = H(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        uh1 uh1VarU = i3 < 33 ? u(context) : null;
        if (!z2 && uh1VarU != null) {
            uh1VarU = sk.b(context.getResources().getConfiguration());
        }
        Configuration configurationY = y(context, iH, uh1VarU, null, false);
        boolean z4 = this.Z;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj = this.n;
        if (z4 || !(obj instanceof Activity)) {
            this.Z = true;
            i = this.Y;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Y = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.Y = 0;
                }
                this.Z = true;
                i = this.Y;
            }
        }
        Configuration configuration = this.V;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationY.uiMode & 48;
        uh1 uh1VarB = sk.b(configuration);
        uh1 uh1VarB2 = uh1VarU == null ? null : sk.b(configurationY);
        int i6 = i4 != i5 ? 512 : 0;
        if (uh1VarB2 != null && !uh1VarB.equals(uh1VarB2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.S && ((n0 || this.T) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new w(activity, z5 ? 1 : 0));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (uh1VarB2 != null) {
                sk.d(configuration2, uh1VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.X;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.X, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof df1) {
                    if (((ff1) ((df1) activity2).getLifecycle()).d.compareTo(we1.g) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.T && !this.U) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof AppCompatActivity)) {
            if ((i6 & 512) != 0) {
                ((AppCompatActivity) obj).onNightModeChanged(iH);
            }
            if ((i6 & 4) != 0) {
                ((AppCompatActivity) obj).onLocalesChanged(uh1VarU);
            }
        }
        if (z5 && uh1VarB2 != null) {
            sk.c(sk.b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            D(context).l();
        } else {
            wk wkVar = this.a0;
            if (wkVar != null) {
                wkVar.c();
            }
        }
        wk wkVar2 = this.b0;
        if (i2 == 3) {
            if (wkVar2 == null) {
                wkVar2 = new wk(this, context);
                this.b0 = wkVar2;
            }
            wkVar2.l();
        } else if (wkVar2 != null) {
            wkVar2.c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void t(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.p != null) {
            fo.n("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof vk) {
            fo.n("AppCompat has already installed itself into the Window");
            return;
        }
        vk vkVar = new vk(this, callback);
        this.q = vkVar;
        window.setCallback(vkVar);
        Context context = this.o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, m0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            cl clVarA = cl.a();
            synchronized (clVarA) {
                drawableE = clVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.p = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.j0) != null) {
            return;
        }
        Object obj = this.n;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.k0) != null) {
            uk.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.k0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.j0 = uk.a(activity);
            } else {
                this.j0 = null;
            }
        } else {
            this.j0 = null;
        }
        N();
    }

    public final void v(int i, yk ykVar, ms1 ms1Var) {
        if (ms1Var == null) {
            if (ykVar == null && i >= 0) {
                yk[] ykVarArr = this.P;
                if (i < ykVarArr.length) {
                    ykVar = ykVarArr[i];
                }
            }
            if (ykVar != null) {
                ms1Var = ykVar.h;
            }
        }
        if ((ykVar == null || ykVar.m) && !this.U) {
            vk vkVar = this.q;
            Window.Callback callback = this.p.getCallback();
            vkVar.getClass();
            try {
                vkVar.i = true;
                callback.onPanelClosed(i, ms1Var);
            } finally {
                vkVar.i = false;
            }
        }
    }

    public final void w(ms1 ms1Var) {
        g7 g7Var;
        if (this.O) {
            return;
        }
        this.O = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((jb3) actionBarOverlayLayout.i).a.e;
        if (actionMenuView != null && (g7Var = actionMenuView.x) != null) {
            g7Var.c();
            c7 c7Var = g7Var.x;
            if (c7Var != null && c7Var.b()) {
                c7Var.i.dismiss();
            }
        }
        Window.Callback callback = this.p.getCallback();
        if (callback != null && !this.U) {
            callback.onPanelClosed(108, ms1Var);
        }
        this.O = false;
    }

    public final void x(yk ykVar, boolean z) {
        xk xkVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && ykVar.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            if (((jb3) actionBarOverlayLayout.i).a.o()) {
                w(ykVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.o.getSystemService("window");
        if (windowManager != null && ykVar.m && (xkVar = ykVar.e) != null) {
            windowManager.removeView(xkVar);
            if (z) {
                v(ykVar.a, ykVar, null);
            }
        }
        ykVar.k = false;
        ykVar.l = false;
        ykVar.m = false;
        ykVar.f = null;
        ykVar.n = true;
        if (this.Q == ykVar) {
            this.Q = null;
        }
        if (ykVar.a == 0) {
            N();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134 A[RETURN] */
    public final boolean z(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        yk ykVarE;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zU;
        boolean zL;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        g7 g7Var;
        yk ykVarE2;
        Object obj = this.n;
        if ((!(obj instanceof f91) && !(obj instanceof y8)) || (decorView = this.p.getDecorView()) == null || !yi3.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                vk vkVar = this.q;
                Window.Callback callback = this.p.getCallback();
                vkVar.getClass();
                try {
                    vkVar.h = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    vkVar.h = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.R = (keyEvent.getFlags() & WorkQueueKt.BUFFER_CAPACITY) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    ykVarE2 = E(0);
                                    if (!ykVarE2.m) {
                                        L(ykVarE2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.y == null) {
                                    ykVarE = E(0);
                                    actionBarOverlayLayout = this.v;
                                    context = this.o;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((jb3) actionBarOverlayLayout.i).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.e) == null || !actionMenuView.w || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = ykVarE.m;
                                            if (!z || ykVarE.l) {
                                                x(ykVarE, true);
                                                zU = z;
                                            } else {
                                                if (ykVarE.k) {
                                                    if (ykVarE.o) {
                                                        ykVarE.k = false;
                                                        zL = L(ykVarE, keyEvent);
                                                    } else {
                                                        zL = true;
                                                    }
                                                    if (zL) {
                                                        J(ykVarE, keyEvent);
                                                        zU = true;
                                                    }
                                                }
                                                zU = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                            actionBarOverlayLayout2.k();
                                            if (((jb3) actionBarOverlayLayout2.i).a.o()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((jb3) actionBarOverlayLayout3.i).a.e;
                                                if (actionMenuView2 != null && (g7Var = actionMenuView2.x) != null && g7Var.c()) {
                                                    zU = true;
                                                }
                                            } else if (!this.U && L(ykVarE, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                                actionBarOverlayLayout4.k();
                                                zU = ((jb3) actionBarOverlayLayout4.i).a.u();
                                            }
                                            zU = false;
                                        }
                                    } else {
                                        z = ykVarE.m;
                                        if (z) {
                                        }
                                        x(ykVarE, true);
                                        zU = z;
                                    }
                                    if (zU) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (I()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    vkVar.h = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.R = (keyEvent.getFlags() & WorkQueueKt.BUFFER_CAPACITY) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            ykVarE2 = E(0);
                            if (!ykVarE2.m) {
                                L(ykVarE2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.y == null) {
                            ykVarE = E(0);
                            actionBarOverlayLayout = this.v;
                            context = this.o;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((jb3) actionBarOverlayLayout.i).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = ykVarE.m;
                                    if (z) {
                                    }
                                    x(ykVarE, true);
                                    zU = z;
                                } else {
                                    z = ykVarE.m;
                                    if (z) {
                                    }
                                    x(ykVarE, true);
                                    zU = z;
                                }
                            } else {
                                z = ykVarE.m;
                                if (z) {
                                }
                                x(ykVarE, true);
                                zU = z;
                            }
                            if (zU) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (I()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
