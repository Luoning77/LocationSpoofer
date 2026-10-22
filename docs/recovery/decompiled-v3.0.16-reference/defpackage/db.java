package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class db extends ViewGroup implements t42, ti2, ra0, y32, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, np0 {
    public static Class R0;
    public static Method S0;
    public static Method T0;
    public static final sx1 U0 = new sx1();
    public static na V0;
    public static Method W0;
    public final gx1 A;
    public MotionEvent A0;
    public final re2 B;
    public long B0;
    public final ms2 C;
    public final z92 C0;
    public final jb D;
    public final sx1 D0;
    public yb E;
    public float E0;
    public final ba F;
    public float F0;
    public final sd G;
    public final ab G0;
    public final sp H;
    public final la H0;
    public final sx1 I;
    public boolean I0;
    public sx1 J;
    public final c21 J0;
    public boolean K;
    public final sa K0;
    public boolean L;
    public final zu L0;
    public final ov1 M;
    public boolean M0;
    public final ax N;
    public boolean N0;
    public final w52 O;
    public final qn2 O0;
    public final fc0 P;
    public View P0;
    public final mn2 Q;
    public final ya Q0;
    public final ea R;
    public boolean S;
    public final ka T;
    public final ja U;
    public final v42 V;
    public boolean W;
    public jh a0;
    public l50 b0;
    public boolean c0;
    public final br1 d0;
    public final w52 e;
    public long e0;
    public long f;
    public final int[] f0;
    public final boolean g;
    public final float[] g0;
    public r11 h;
    public final float[] h0;
    public final jb1 i;
    public final float[] i0;
    public gf1 j;
    public long j0;
    public hf1 k;
    public boolean k0;
    public yg2 l;
    public long l0;
    public final mo m;
    public final w52 m0;
    public final la n;
    public final fc0 n0;
    public final w52 o;
    public lu0 o0;
    public final View p;
    public n83 p0;
    public final rp0 q;
    public l83 q0;
    public y70 r;
    public final AtomicReference r0;
    public final oc s;
    public nb0 s0;
    public final ee1 t;
    public final kq0 t0;
    public final w52 u;
    public final ey1 u0;
    public final fc0 v;
    public final w52 v0;
    public final yv w;
    public final jx0 w0;
    public final vg x;
    public final h31 x0;
    public final m31 y;
    public final ev1 y0;
    public final hb1 z;
    public final ng z0;

    public db(Context context, a30 a30Var) {
        qa1 qa1Var;
        super(context);
        this.e = ke0.H(a30Var);
        this.f = 9205357640488583168L;
        int i = 1;
        this.g = true;
        this.i = a30Var.r;
        this.l = j9.M;
        this.m = new mo();
        int i2 = 0;
        this.n = new la(this, i2);
        this.o = new w52(zm3.d(context), u92.h);
        this.q = new rp0(this, this);
        this.r = a30Var.b.j();
        this.s = new oc();
        this.t = new ee1();
        this.u = ke0.H(Boolean.FALSE);
        this.v = by2.b(new sa(this, i2));
        this.w = a30Var.t;
        this.x = a30Var.q;
        this.y = new m31();
        int i3 = 3;
        hb1 hb1Var = new hb1(3);
        hb1Var.c0(xi2.c);
        hb1Var.Z(getDensity());
        hb1Var.e0(getViewConfiguration());
        hb1Var.d0(new bb(this).d(((rp0) getFocusOwner()).e).d(m17getDragAndDropManager().c));
        this.z = hb1Var;
        gx1 gx1Var = g41.a;
        this.A = new gx1();
        getLayoutNodes();
        this.B = new re2(this);
        this.C = new ms2(getRoot(), new xj0(), getLayoutNodes());
        jb jbVar = new jb(this);
        this.D = jbVar;
        this.E = new yb(this, new t4(0, this, sb.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 9));
        this.F = a30Var.j;
        this.G = new sd(this);
        this.H = new sp();
        this.I = new sx1();
        this.M = new ov1();
        hb1 root = getRoot();
        ax axVar = new ax();
        axVar.b = root;
        axVar.c = new wx0(root.K.c);
        axVar.d = new us1(5, (byte) 0);
        axVar.e = new zx0();
        this.N = axVar;
        this.O = ke0.H(new Configuration(context.getResources().getConfiguration()));
        this.P = by2.b(new sa(this, i));
        sp autofillTree = getAutofillTree();
        mn2 mn2Var = new mn2();
        mn2Var.e = this;
        mn2Var.f = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            fo.n("Autofill service could not be located.");
            throw null;
        }
        mn2Var.g = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw az2.e("Required value was null.");
        }
        mn2Var.h = autofillId;
        this.Q = mn2Var;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw az2.e("Autofill service could not be located.");
        }
        this.R = new ea(new us1(autofillManager2, i3), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.T = a30Var.l;
        this.U = a30Var.m;
        this.V = new v42(new xa(this, i));
        this.d0 = new br1(getRoot());
        this.e0 = 9223372034707292159L;
        this.f0 = new int[]{0, 0};
        float[] fArrA = yq1.a();
        this.g0 = fArrA;
        this.h0 = yq1.a();
        this.i0 = yq1.a();
        this.j0 = -1L;
        this.l0 = 9187343241974906880L;
        this.m0 = ke0.H(null);
        this.n0 = by2.b(new sa(this, i3));
        this.r0 = new AtomicReference(null);
        this.t0 = a30Var.n;
        this.u0 = a30Var.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = lp0.a;
        qa1 qa1Var2 = qa1.e;
        if (layoutDirection != 0) {
            qa1Var = layoutDirection != 1 ? null : qa1.f;
        } else {
            qa1Var = qa1Var2;
        }
        this.v0 = ke0.H(qa1Var != null ? qa1Var : qa1Var2);
        this.w0 = a30Var.p;
        int i4 = 2;
        this.x0 = new h31(isInTouchMode() ? 1 : 2);
        ev1 ev1Var = new ev1();
        new gy1(new iq[16]);
        new gy1(new k91[16]);
        new gy1(new hb1[16]);
        new gy1(new k91[16]);
        this.y0 = ev1Var;
        ng ngVar = new ng();
        new gt2(new ye(ngVar, i));
        this.z0 = ngVar;
        this.C0 = new z92(9);
        this.D0 = new sx1();
        this.G0 = new ab(this, i2);
        this.H0 = new la(this, i);
        this.J0 = new c21(context, new xa(this, i2));
        this.K0 = new sa(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.L0 = i5 < 29 ? new av(fArrA) : new bv();
        addOnAttachStateChangeListener(this.E);
        setWillNotDraw(false);
        setFocusable(true);
        rb.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        yi3.j(this, jbVar);
        setOnDragListener(m17getDragAndDropManager());
        getRoot().b(this);
        if (i5 >= 29) {
            lb.a.a(this);
        }
        if (l()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(2131230831, Boolean.TRUE);
            this.p = view;
            addView(view, -1);
        }
        this.O0 = i5 >= 31 ? new qn2() : null;
        this.Q0 = new ya(this);
    }

    public static void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof db) {
                ((db) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public static long f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View g(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (o51.f(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewG = g(viewGroup.getChildAt(i2), i);
                    if (viewG != null) {
                        return viewG;
                    }
                }
            }
        }
        return null;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    private final n83 getLegacyTextInputServiceAndroid() {
        n83 n83Var = this.p0;
        if (n83Var != null) {
            return n83Var;
        }
        n83 n83Var2 = new n83(getView(), this);
        this.p0 = n83Var2;
        return n83Var2;
    }

    private final a30 get_composeViewContext() {
        return (a30) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qa get_viewTreeOwners() {
        p91.x(this.m0.getValue());
        return null;
    }

    public static void j(hb1 hb1Var) {
        hb1Var.C();
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            j((hb1) objArr[i2]);
        }
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !pv1.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.u.setValue(Boolean.valueOf(z));
    }

    private void setDensity(xb0 xb0Var) {
        this.o.setValue(xb0Var);
    }

    private void setFontFamilyResolver(lq0 lq0Var) {
        this.u0.setValue(lq0Var);
    }

    private void setLayoutDirection(qa1 qa1Var) {
        this.v0.setValue(qa1Var);
    }

    private final void set_composeViewContext(a30 a30Var) {
        this.e.setValue(a30Var);
    }

    private final void set_viewTreeOwners(qa qaVar) {
        this.m0.setValue(qaVar);
    }

    @Override // defpackage.ra0
    public final void A(df1 df1Var) {
        hf1 hf1Var = this.k;
        if (hf1Var != null) {
            oo1 oo1Var = (oo1) hf1Var.a.f;
            if (oo1Var.e && !oo1Var.g) {
                tv tvVar = hf1Var.d;
                if (tvVar != null) {
                    tvVar.cancel();
                }
                hf1Var.d = null;
                return;
            }
            if (oo1Var.f) {
                return;
            }
            if (!oo1Var.g) {
                ib2.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!oo1Var.h.i()) {
                ib2.a("Attempted to start retaining exited values with pending exited values");
            }
            oo1Var.g = false;
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.j0 = AnimationUtils.currentAnimationTimeMillis();
        zu zuVar = this.L0;
        float[] fArr = this.h0;
        zuVar.a(this, fArr);
        ld0.A(fArr, this.i0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = yq1.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.l0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean C() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void D(hb1 hb1Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (hb1Var != null) {
            while (hb1Var != null && hb1Var.r() == fb1.e) {
                if (!this.c0) {
                    hb1 hb1VarU = hb1Var.u();
                    if (hb1VarU == null) {
                        break;
                    }
                    long j = hb1VarU.K.c.h;
                    if (l50.f(j) && l50.e(j)) {
                        break;
                    }
                }
                hb1Var = hb1Var.u();
            }
            if (hb1Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long E(long j) {
        z();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.l0 >> 32));
        return yq1.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.l0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.i0);
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        if (this.M0) {
            this.M0 = false;
            ee1 ee1Var = getComposeViewContext().s;
            rk3.a.setValue(new fa2(motionEvent.getMetaState()));
        }
        ov1 ov1Var = this.M;
        z92 z92VarC = ov1Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ax axVar = this.N;
        if (z92VarC == null) {
            if (!axVar.a) {
                ((zj1) ((us1) axVar.d).f).a();
                ((wx0) axVar.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) z92VarC.f;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((aa2) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        aa2 aa2Var = (aa2) obj;
        if (aa2Var != null) {
            this.f = aa2Var.d;
        }
        int iC = axVar.c(z92VarC, this, n(motionEvent));
        z92VarC.g = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iC & 1) != 0) {
            return iC;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ov1Var.c.delete(pointerId);
        ov1Var.b.delete(pointerId);
        return iC;
    }

    public final void H(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jQ = q((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jQ >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jQ & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        z92 z92VarC = this.M.c(motionEventObtain, this);
        z92VarC.getClass();
        this.N.c(z92VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void I(pu0 pu0Var, r60 r60Var) {
        cb cbVar;
        if (r60Var instanceof cb) {
            cbVar = (cb) r60Var;
            int i = cbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbVar.g = i - Integer.MIN_VALUE;
            } else {
                cbVar = new cb(this, r60Var);
            }
        } else {
            cbVar = new cb(this, r60Var);
        }
        Object obj = cbVar.e;
        int i2 = cbVar.g;
        if (i2 == 0) {
            ee0.J(obj);
            xa xaVar = new xa(this, 2);
            cbVar.g = 1;
            if (CoroutineScopeKt.coroutineScope(new t3(xaVar, this.r0, pu0Var, (q60) null, 15), cbVar) == z70.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ee0.J(obj);
        }
        fo.d();
    }

    public final void J(Configuration configuration) {
        w52 w52Var;
        Configuration configuration2 = getConfiguration();
        if (o51.f(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(zm3.d(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (w52Var = this.t.b) == null) {
            return;
        }
        w52Var.setValue(n51.n(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void K() {
        boolean z;
        int i;
        int[] iArr = this.f0;
        getLocationOnScreen(iArr);
        long j = this.e0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.j0 >= 0) {
            z = false;
        } else {
            this.e0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                gy1 gy1VarY = getRoot().y();
                Object[] objArr = gy1VarY.e;
                int i5 = gy1VarY.g;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((hb1) objArr[i6]).L.p.a1();
                }
                z = true;
            }
        }
        z();
        View rootView = this.P0;
        if (rootView == null) {
            rootView = getRootView();
            this.P0 = rootView;
        }
        re2 rectManager = getRectManager();
        long j2 = this.e0;
        long jO = gh0.O(this.l0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.h0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        ha3 ha3Var = rectManager.c;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f = ha3Var.b(j2, jO, fArr, width, height) || rectManager.f;
        this.d0.a(z);
        getRectManager().a();
    }

    public final void L(float f) {
        if (l()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.E0) || f > this.E0) {
                    this.E0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.F0) || f < this.F0) {
                    this.F0 = f;
                }
            }
        }
    }

    @Override // defpackage.ra0
    public final void P(df1 df1Var) {
        tv tvVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ji2.G());
        }
        hf1 hf1Var = this.k;
        if (hf1Var != null) {
            gf1 gf1Var = this.j;
            gf1Var.getClass();
            oo1 oo1Var = (oo1) hf1Var.a.f;
            if (!oo1Var.e || oo1Var.g) {
                return;
            }
            try {
                tvVarS = ((rm3) gf1Var).a.s(new ye(hf1Var, 16));
            } catch (CancellationException unused) {
                if (!oo1Var.f) {
                    if (oo1Var.g) {
                        ib2.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    oo1Var.a();
                    oo1Var.g = true;
                }
                tvVarS = null;
            }
            tv tvVar = hf1Var.d;
            if (tvVar != null) {
                tvVar.cancel();
            }
            hf1Var.d = tvVarS;
        }
    }

    @Override // defpackage.np0
    public final void a(dq0 dq0Var, dq0 dq0Var2) {
        tz1 tz1Var;
        boolean z;
        tz1 tz1Var2;
        boolean z2;
        if (dq0Var != null) {
            dq0 dq0Var3 = dq0Var;
            if (!dq0Var3.e.r) {
                p21.c("visitAncestors called on an unattached node");
            }
            cv1 cv1Var = dq0Var3.e;
            hb1 hb1VarO = xp1.O(dq0Var);
            ay1 ay1Var = null;
            ArrayList arrayList = null;
            while (hb1VarO != null) {
                if ((hb1VarO.K.f.h & 2097152) != 0) {
                    while (cv1Var != null) {
                        if ((cv1Var.g & 2097152) != 0) {
                            cv1 cv1VarJ = cv1Var;
                            gy1 gy1Var = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof a21) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cv1VarJ);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cv1VarJ.g & 2097152) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i = 0;
                                    for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                        if ((cv1Var2.g & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cv1VarJ = cv1Var2;
                                            } else {
                                                if (gy1Var == null) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var.b(cv1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var);
                            }
                        }
                        cv1Var = cv1Var.i;
                    }
                }
                hb1VarO = hb1VarO.u();
                cv1Var = (hb1VarO == null || (tz1Var2 = hb1VarO.K) == null) ? null : tz1Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (dq0Var2 != null) {
                if (!dq0Var2.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1 cv1Var3 = dq0Var2.e;
                hb1 hb1VarO2 = xp1.O(dq0Var2);
                ay1 ay1Var2 = null;
                while (hb1VarO2 != null) {
                    if ((hb1VarO2.K.f.h & 2097152) != 0) {
                        while (cv1Var3 != null) {
                            if ((cv1Var3.g & 2097152) != 0) {
                                cv1 cv1VarJ2 = cv1Var3;
                                gy1 gy1Var2 = null;
                                while (cv1VarJ2 != null) {
                                    if (cv1VarJ2 instanceof a21) {
                                        if (ay1Var2 == null) {
                                            ay1 ay1Var3 = in2.a;
                                            ay1Var2 = new ay1();
                                        }
                                        ay1Var2.a(cv1VarJ2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cv1VarJ2.g & 2097152) != 0 && (cv1VarJ2 instanceof lb0)) {
                                        int i2 = 0;
                                        for (cv1 cv1Var4 = ((lb0) cv1VarJ2).t; cv1Var4 != null; cv1Var4 = cv1Var4.j) {
                                            if ((cv1Var4.g & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cv1VarJ2 = cv1Var4;
                                                } else {
                                                    if (gy1Var2 == null) {
                                                        gy1Var2 = new gy1(new cv1[16]);
                                                    }
                                                    if (cv1VarJ2 != null) {
                                                        gy1Var2.b(cv1VarJ2);
                                                        cv1VarJ2 = null;
                                                    }
                                                    gy1Var2.b(cv1Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cv1VarJ2 = xp1.J(gy1Var2);
                                }
                            }
                            cv1Var3 = cv1Var3.i;
                        }
                    }
                    hb1VarO2 = hb1VarO2.u();
                    cv1Var3 = (hb1VarO2 == null || (tz1Var = hb1VarO2.K) == null) ? null : tz1Var.e;
                }
                ay1Var = ay1Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                a21 a21Var = (a21) arrayList.get(i3);
                if (!(ay1Var != null ? ay1Var.c(a21Var) : false)) {
                    a21Var.U();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        dq0 dq0Var = ((rp0) getFocusOwner()).c;
        if (!dq0Var.r) {
            return;
        }
        if (!dq0Var.e.r) {
            p21.c("visitSubtreeIf called on an unattached node");
        }
        gy1 gy1Var = new gy1(new cv1[16]);
        cv1 cv1Var = dq0Var.e;
        cv1 cv1Var2 = cv1Var.j;
        if (cv1Var2 == null) {
            xp1.h(gy1Var, cv1Var);
        } else {
            gy1Var.b(cv1Var2);
        }
        while (true) {
            int i3 = gy1Var.g;
            if (i3 == 0) {
                return;
            }
            cv1 cv1Var3 = (cv1) gy1Var.k(i3 - 1);
            if ((cv1Var3.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                for (cv1 cv1Var4 = cv1Var3; cv1Var4 != null && cv1Var4.r; cv1Var4 = cv1Var4.j) {
                    if ((cv1Var4.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        cv1 cv1VarJ = cv1Var4;
                        gy1 gy1Var2 = null;
                        while (cv1VarJ != null) {
                            int i4 = 0;
                            if (cv1VarJ instanceof dq0) {
                                dq0 dq0Var2 = (dq0) cv1VarJ;
                                if (dq0Var2.r && dq0Var2.o1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    dq0 dq0Var3 = ((rp0) getFocusOwner()).c;
                                    if (dq0Var3.r) {
                                        if (!dq0Var3.e.r) {
                                            p21.c("visitSubtreeIf called on an unattached node");
                                        }
                                        gy1 gy1Var3 = new gy1(new cv1[16]);
                                        cv1 cv1Var5 = dq0Var3.e;
                                        cv1 cv1Var6 = cv1Var5.j;
                                        if (cv1Var6 == null) {
                                            xp1.h(gy1Var3, cv1Var5);
                                        } else {
                                            gy1Var3.b(cv1Var6);
                                        }
                                        while (true) {
                                            int i5 = gy1Var3.g;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            cv1 cv1Var7 = (cv1) gy1Var3.k(i5 - 1);
                                            if ((cv1Var7.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                for (cv1 cv1Var8 = cv1Var7; cv1Var8 != null && cv1Var8.r; cv1Var8 = cv1Var8.j) {
                                                    if ((cv1Var8.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                        cv1 cv1VarJ2 = cv1Var8;
                                                        gy1 gy1Var4 = null;
                                                        while (cv1VarJ2 != null) {
                                                            if (cv1VarJ2 instanceof dq0) {
                                                                dq0 dq0Var4 = (dq0) cv1VarJ2;
                                                                if (dq0Var4.r) {
                                                                    tp0 tp0VarO1 = dq0Var4.o1();
                                                                    if (dq0Var4.r && !dq0Var4.s && tp0VarO1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((cv1VarJ2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ2 instanceof lb0)) {
                                                                int i6 = 0;
                                                                for (cv1 cv1Var9 = ((lb0) cv1VarJ2).t; cv1Var9 != null; cv1Var9 = cv1Var9.j) {
                                                                    if ((cv1Var9.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            cv1VarJ2 = cv1Var9;
                                                                        } else {
                                                                            if (gy1Var4 == null) {
                                                                                gy1Var4 = new gy1(new cv1[16]);
                                                                            }
                                                                            if (cv1VarJ2 != null) {
                                                                                gy1Var4.b(cv1VarJ2);
                                                                                cv1VarJ2 = null;
                                                                            }
                                                                            gy1Var4.b(cv1Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            cv1VarJ2 = xp1.J(gy1Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            xp1.h(gy1Var3, cv1Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                for (cv1 cv1Var10 = ((lb0) cv1VarJ).t; cv1Var10 != null; cv1Var10 = cv1Var10.j) {
                                    if ((cv1Var10.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cv1VarJ = cv1Var10;
                                        } else {
                                            if (gy1Var2 == null) {
                                                gy1Var2 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var2.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var2.b(cv1Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var2);
                        }
                    }
                }
            }
            xp1.h(gy1Var, cv1Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        es2 es2VarW;
        lu0 lu0Var;
        lu0 lu0Var2;
        ea eaVar = this.R;
        if (eaVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                hb1 hb1Var = (hb1) eaVar.f.c.b(iKeyAt);
                if (hb1Var != null && (es2VarW = hb1Var.w()) != null) {
                    zx1 zx1Var = es2VarW.e;
                    Object objG = zx1Var.g(ds2.g);
                    if (objG == null) {
                        objG = null;
                    }
                    z0 z0Var = (z0) objG;
                    if (z0Var != null && (lu0Var2 = (lu0) z0Var.b) != null) {
                    }
                    Object objG2 = zx1Var.g(ds2.h);
                    z0 z0Var2 = (z0) (objG2 != null ? objG2 : null);
                    if (z0Var2 != null && (lu0Var = (lu0) z0Var2.b) != null) {
                    }
                }
            }
        }
        mn2 mn2Var = this.Q;
        if (mn2Var != null) {
            sp spVar = (sp) mn2Var.f;
            if (spVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (spVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        b81.u();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new g02("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new g02("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new g02("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.D.h(i, this.f, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.D.h(i, this.f, true);
    }

    public final void d(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        jb jbVar = this.D;
        if (o51.f(str, jbVar.H)) {
            int iD2 = jbVar.F.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!o51.f(str, jbVar.I) || (iD = jbVar.G.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sx1 sx1Var = this.I;
        if (!isAttachedToWindow()) {
            j(getRoot());
        }
        r(true);
        tx2.h().m();
        this.K = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            yv yvVar = this.w;
            ga gaVar = yvVar.a;
            Canvas canvas2 = gaVar.a;
            gaVar.a = canvas;
            getRoot().i(gaVar, null);
            yvVar.a.a = canvas2;
            if (sx1Var.i()) {
                int i = sx1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((nw0) ((s42) sx1Var.f(i2))).g();
                }
            }
            int i3 = ej3.e;
            sx1Var.d();
            this.K = false;
            Trace.endSection();
            sx1 sx1Var2 = this.J;
            if (sx1Var2 != null) {
                sx1Var.b(sx1Var2);
                sx1Var2.d();
            }
            if (l()) {
                vj.a(this, this.E0);
                View view = this.p;
                if (view != null) {
                    vj.a(view, this.F0);
                    if (!Float.isNaN(this.F0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.E0 = Float.NaN;
                this.F0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.I0;
        la laVar = this.H0;
        if (z) {
            removeCallbacks(laVar);
            laVar.run();
        }
        if (!m(motionEvent) && isAttachedToWindow()) {
            jb jbVar = this.D;
            db dbVar = jbVar.h;
            AccessibilityManager accessibilityManager = jbVar.k;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    dbVar.r(true);
                    zx0 zx0Var = new zx0();
                    hb1 root = dbVar.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    tz1 tz1Var = root.K;
                    xz1 xz1Var = tz1Var.d;
                    ah2 ah2Var = xz1.S;
                    tz1Var.d.y1(xz1.W, xz1Var.q1(jFloatToRawIntBits, true), zx0Var, 1, true);
                    sx1 sx1Var = zx0Var.e;
                    int i2 = sx1Var.b - 1;
                    while (true) {
                        if (-1 < i2) {
                            Object objF = sx1Var.f(i2);
                            objF.getClass();
                            hb1 hb1VarO = xp1.O((cv1) objF);
                            if (dbVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(hb1VarO) == null) {
                                if (hb1VarO.K.c(8)) {
                                    int iV = jbVar.v(hb1VarO.f);
                                    js2 js2VarN = ke0.n(hb1VarO, false);
                                    if (am1.D(js2VarN)) {
                                        if (!js2VarN.k().e.c(os2.B)) {
                                            i = iV;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i2--;
                            }
                        }
                        i = Integer.MIN_VALUE;
                        break;
                    }
                    dbVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = jbVar.i;
                    if (i3 != i) {
                        jbVar.i = i;
                        jb.z(jbVar, i, WorkQueueKt.BUFFER_CAPACITY, null, 12);
                        jb.z(jbVar, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = jbVar.i;
                    if (i4 == Integer.MIN_VALUE) {
                        dbVar.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        jbVar.i = Integer.MIN_VALUE;
                        jb.z(jbVar, Integer.MIN_VALUE, WorkQueueKt.BUFFER_CAPACITY, null, 12);
                        jb.z(jbVar, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && n(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.A0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.A0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.I0 = true;
                        postDelayed(laVar, 8L);
                        return false;
                    }
                } else if ((i(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (o(motionEvent)) {
                if ((i(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((rp0) getFocusOwner()).e(keyEvent, new ta(i, this, keyEvent));
        }
        ee1 ee1Var = getComposeViewContext().s;
        rk3.a.setValue(new fa2(keyEvent.getMetaState()));
        return ((rp0) getFocusOwner()).e(keyEvent, x30.r) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        tz1 tz1Var;
        if (isFocused()) {
            rp0 rp0Var = (rp0) getFocusOwner();
            if (rp0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                dq0 dq0VarP = vd0.p(rp0Var.c);
                if (dq0VarP != null) {
                    if (!dq0VarP.e.r) {
                        p21.c("visitAncestors called on an unattached node");
                    }
                    cv1 cv1Var = dq0VarP.e;
                    hb1 hb1VarO = xp1.O(dq0VarP);
                    while (hb1VarO != null) {
                        if ((hb1VarO.K.f.h & 131072) != 0) {
                            while (cv1Var != null) {
                                if ((cv1Var.g & 131072) != 0) {
                                    cv1 cv1VarJ = cv1Var;
                                    gy1 gy1Var = null;
                                    while (cv1VarJ != null) {
                                        if ((cv1VarJ.g & 131072) != 0 && (cv1VarJ instanceof lb0)) {
                                            int i = 0;
                                            for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                                if ((cv1Var2.g & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        cv1VarJ = cv1Var2;
                                                    } else {
                                                        if (gy1Var == null) {
                                                            gy1Var = new gy1(new cv1[16]);
                                                        }
                                                        if (cv1VarJ != null) {
                                                            gy1Var.b(cv1VarJ);
                                                            cv1VarJ = null;
                                                        }
                                                        gy1Var.b(cv1Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        cv1VarJ = xp1.J(gy1Var);
                                    }
                                }
                                cv1Var = cv1Var.i;
                            }
                        }
                        hb1VarO = hb1VarO.u();
                        cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            kb.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object ipVar;
        dq0 dq0VarG;
        if (this.I0) {
            la laVar = this.H0;
            removeCallbacks(laVar);
            MotionEvent motionEvent2 = this.A0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.I0 = false;
            } else {
                laVar.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int i = i(motionEvent);
            if ((i & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (ipVar = view.getTag(2131230788)) == null) {
                    ipVar = new ip(1);
                }
                if (ipVar.equals(new ip(1)) && (dq0VarG = ((rp0) getFocusOwner()).g()) != null) {
                    xz1 xz1VarN = xp1.N(dq0VarG);
                    if (!wc0.F(xz1VarN).d0(xz1VarN, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        op0.a(getFocusOwner());
                    }
                }
            }
            if ((i & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return g(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        pe2 pe2VarA;
        if (view == null || this.d0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !sb.M(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            dq0 dq0VarP = vd0.p(((rp0) getFocusOwner()).c);
            pe2VarA = dq0VarP != null ? vd0.s(dq0VarP) : null;
            if (pe2VarA == null) {
                pe2VarA = lp0.a(view, this);
            }
        } else {
            pe2VarA = lp0.a(view, this);
        }
        ep0 ep0VarD = lp0.d(i);
        int i2 = ep0VarD != null ? ep0VarD.a : 6;
        we2 we2Var = new we2();
        if (((rp0) getFocusOwner()).f(i2, pe2VarA, new va(0, we2Var)) == null) {
            return view;
        }
        Object obj = we2Var.e;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || v83.k(vd0.s((dq0) obj), lp0.a(viewFindNextFocus, this), pe2VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final jh getAndroidViewsHandler$ui() {
        if (this.a0 == null) {
            jh jhVar = new jh(getContext());
            this.a0 = jhVar;
            addView(jhVar, -1);
            requestLayout();
        }
        jh jhVar2 = this.a0;
        jhVar2.getClass();
        return jhVar2;
    }

    public mp getAutofill() {
        return this.Q;
    }

    public rp getAutofillManager() {
        return this.R;
    }

    public sp getAutofillTree() {
        return this.H;
    }

    public final a30 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.N0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.O.getValue();
    }

    public final yb getContentCaptureManager$ui() {
        return this.E;
    }

    public y70 getCoroutineContext() {
        return this.r;
    }

    public xb0 getDensity() {
        return (xb0) this.o.getValue();
    }

    public pe2 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            dq0 dq0VarP = vd0.p(((rp0) getFocusOwner()).c);
            if (dq0VarP != null) {
                return vd0.s(dq0VarP);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return lp0.a(viewFindFocus, this);
        }
        return null;
    }

    public op0 getFocusOwner() {
        return this.q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        pe2 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (o51.f(((rp0) getFocusOwner()).f(6, null, wa.g), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public lq0 getFontFamilyResolver() {
        return (lq0) this.u0.getValue();
    }

    public kq0 getFontLoader() {
        return this.t0;
    }

    public final gf1 getFrameEndScheduler$ui() {
        return this.j;
    }

    public iw0 getGraphicsContext() {
        return this.G;
    }

    public jx0 getHapticFeedBack() {
        return this.w0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.d0.b.v() || !this.m.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public g31 getInputModeManager() {
        return this.x0;
    }

    public final m31 getInsetsListener() {
        return this.y;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.j0;
    }

    @Override // android.view.View, android.view.ViewParent
    public qa1 getLayoutDirection() {
        return (qa1) this.v0.getValue();
    }

    public sh1 getLocaleList() {
        return (sh1) this.P.getValue();
    }

    public long getMeasureIteration() {
        if (this.d0.c) {
            return 1L;
        }
        p21.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public ev1 getModifierLocalManager() {
        return this.y0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public db m19getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public g82 getPlacementScope() {
        int i = i82.b;
        return new dk1(this, 1);
    }

    public w92 getPointerIconService() {
        return this.Q0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final r11 m12getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.h;
    }

    public re2 getRectManager() {
        return this.B;
    }

    public yg2 getRetainedValuesStore() {
        return this.l;
    }

    public hb1 getRoot() {
        return this.z;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        qn2 qn2Var;
        if (Build.VERSION.SDK_INT < 31 || (qn2Var = this.O0) == null) {
            return false;
        }
        return ((Boolean) qn2Var.a.getValue()).booleanValue();
    }

    public ms2 getSemanticsOwner() {
        return this.C;
    }

    public jb1 getSharedDrawScope() {
        return this.i;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? qj.a.a(this) : this.W;
    }

    public v42 getSnapshotObserver() {
        return this.V;
    }

    public ny2 getSoftwareKeyboardController() {
        nb0 nb0Var = this.s0;
        if (nb0Var != null) {
            return nb0Var;
        }
        nb0 nb0Var2 = new nb0(getTextInputService());
        this.s0 = nb0Var2;
        return nb0Var2;
    }

    public l83 getTextInputService() {
        l83 l83Var = this.q0;
        if (l83Var != null) {
            return l83Var;
        }
        l83 l83Var2 = new l83(getLegacyTextInputServiceAndroid());
        this.q0 = l83Var2;
        return l83Var2;
    }

    public u93 getTextToolbar() {
        return this.z0;
    }

    public final si2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public aj3 getViewConfiguration() {
        return this.x;
    }

    public final qa getViewTreeOwners() {
        p91.x(this.n0.getValue());
        return null;
    }

    public qk3 getWindowInfo() {
        return getComposeViewContext().s;
    }

    public final ea get_autofillManager$ui() {
        return this.R;
    }

    public final void h(hb1 hb1Var, boolean z) {
        this.d0.f(hb1Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int i(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        db dbVar;
        removeCallbacks(this.G0);
        try {
            B(motionEvent);
            this.k0 = true;
            r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.A0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                ax axVar = this.N;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!axVar.a) {
                                ((zj1) ((us1) axVar.d).f).a();
                                ((wx0) axVar.c).c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            H(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !n(motionEvent)) {
                    dbVar = this;
                } else {
                    dbVar = this;
                    dbVar.H(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = dbVar.A0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = dbVar.A0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    ov1 ov1Var = dbVar.M;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ov1Var.c.delete(pointerId);
                            ov1Var.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = dbVar.A0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = dbVar.A0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = dbVar.A0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                ov1Var.c.delete(pointerId);
                                ov1Var.b.delete(pointerId);
                            }
                            wx0 wx0Var = (wx0) axVar.c;
                            if (wx0Var.d) {
                                wx0Var.d = true;
                            } else {
                                wx0Var.g.a.g();
                            }
                        }
                    }
                }
                dbVar.A0 = MotionEvent.obtainNoHistory(motionEvent);
                int iG = G(motionEvent);
                Trace.endSection();
                dbVar.k0 = false;
                return iG;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.k0 = false;
            throw th3;
        }
    }

    public final void k(hb1 hb1Var) {
        this.d0.r(hb1Var, false);
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            k((hb1) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        yg2 yg2Var;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(ji2.G());
        }
        this.y.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (V0 == null) {
                na naVar = new na(i2);
                V0 = naVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (R0 == null) {
                        R0 = Class.forName("android.os.SystemProperties");
                    }
                    Method declaredMethod = T0;
                    if (declaredMethod == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = R0;
                        declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        T0 = declaredMethod;
                    }
                    if (declaredMethod != null) {
                        declaredMethod.invoke(null, naVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            sx1 sx1Var = U0;
            synchronized (sx1Var) {
                sx1Var.a(this);
            }
        }
        if (!this.N0) {
            getComposeViewContext().c();
        }
        this.N0 = false;
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().a.d();
        mn2 mn2Var = this.Q;
        if (mn2Var != null) {
            op opVar = op.a;
            opVar.getClass();
            ((AutofillManager) mn2Var.g).registerCallback(opVar);
        }
        df1 df1Var = getComposeViewContext().c;
        pj3 pj3Var = getComposeViewContext().e;
        gf1 gf1Var = this.j;
        if (df1Var == null || pj3Var == null || gf1Var == null) {
            yg2Var = null;
        } else {
            oj3 viewModelStore = pj3Var.getViewModelStore();
            nj3 nj3Var = new nj3();
            b80 b80Var = b80.b;
            viewModelStore.getClass();
            b80Var.getClass();
            mn2 mn2Var2 = new mn2(viewModelStore, nj3Var, b80Var);
            ox oxVarA = xe2.a(if1.class);
            String strB = oxVarA.b();
            if (strB == null) {
                fo.i("Local and anonymous classes can not be ViewModels");
                return;
            }
            if1 if1Var = (if1) mn2Var2.r(oxVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            gx1 gx1Var = if1Var.b;
            Object objB = gx1Var.b(id);
            if (objB == null) {
                objB = new sx1(1);
                gx1Var.h(id, objB);
            }
            sx1 sx1Var2 = (sx1) objB;
            Object[] objArr = sx1Var2.a;
            int i3 = sx1Var2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((hf1) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            hf1 hf1Var = (hf1) obj;
            if (hf1Var == null) {
                hf1Var = new hf1();
                sx1Var2.a(hf1Var);
            }
            hf1Var.c = true;
            this.k = hf1Var;
            yg2Var = hf1Var.b;
        }
        if (yg2Var == null) {
            yg2Var = j9.M;
        }
        this.l = yg2Var;
        lu0 lu0Var = this.o0;
        if (lu0Var != null) {
            lu0Var.invoke(getComposeViewContext());
            this.o0 = null;
        }
        xe1 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.E);
        this.x0.a.setValue(new f31(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            pb.a.b(this);
        }
        ea eaVar = this.R;
        if (eaVar != null) {
            ((rp0) getFocusOwner()).g.a(eaVar);
            getSemanticsOwner().d.a(eaVar);
        }
        ((rp0) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        kt2 kt2Var = (kt2) this.r0.get();
        af afVar = (af) (kt2Var != null ? kt2Var.b : null);
        if (afVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        kt2 kt2Var2 = (kt2) afVar.h.get();
        e31 e31Var = (e31) (kt2Var2 != null ? kt2Var2.b : null);
        return e31Var != null && (e31Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        kt2 kt2Var = (kt2) this.r0.get();
        af afVar = (af) (kt2Var != null ? kt2Var.b : null);
        int i4 = 18;
        if (afVar != null) {
            kt2 kt2Var2 = (kt2) afVar.h.get();
            e31 e31Var = (e31) (kt2Var2 != null ? kt2Var2.b : null);
            if (e31Var == null) {
                return null;
            }
            synchronized (e31Var.c) {
                if (e31Var.e) {
                    return null;
                }
                ne2 ne2VarA = e31Var.a.a(editorInfo);
                q9 q9Var = new q9(e31Var, i4);
                InputConnection m02Var = Build.VERSION.SDK_INT >= 34 ? new m02(ne2VarA, q9Var) : new l02(ne2VarA, q9Var);
                e31Var.d.b(new dk3(m02Var));
                return m02Var;
            }
        }
        n83 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        c11 c11Var = legacyTextInputServiceAndroid.h;
        f83 f83Var = legacyTextInputServiceAndroid.g;
        int i5 = c11Var.e;
        boolean z = c11Var.a;
        if (i5 == 1) {
            i = z ? 6 : 0;
        } else if (i5 == 0) {
            i = 1;
        } else if (i5 == 2) {
            i = 2;
        } else if (i5 == 6) {
            i = 5;
        } else if (i5 == 5) {
            i = 7;
        } else if (i5 == 3) {
            i = 3;
        } else if (i5 == 4) {
            i = 4;
        } else {
            if (i5 != 7) {
                fo.n("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i6 = c11Var.d;
        if (i6 != 1) {
            if (i6 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else {
                if (i6 == 3) {
                    editorInfo.inputType = 2;
                    i2 = 2;
                } else if (i6 == 4) {
                    editorInfo.inputType = 3;
                    i2 = 3;
                } else {
                    if (i6 == 5) {
                        i4 = 17;
                        editorInfo.inputType = 17;
                    } else if (i6 == 6) {
                        i4 = 33;
                        editorInfo.inputType = 33;
                    } else if (i6 == 7) {
                        i4 = 129;
                        editorInfo.inputType = 129;
                    } else if (i6 == 8) {
                        editorInfo.inputType = 18;
                    } else {
                        if (i6 != 9) {
                            fo.n("Invalid Keyboard Type");
                            return null;
                        }
                        i4 = 8194;
                        editorInfo.inputType = 8194;
                    }
                    i2 = i4;
                }
                i4 = i2;
            }
            if (!z && (i4 & 1) == 1) {
                i2 |= 131072;
                editorInfo.inputType = i2;
                if (i5 == 1) {
                    editorInfo.imeOptions = 1073741824 | i;
                }
            }
            if ((i2 & 1) == 1) {
                i3 = c11Var.b;
                if (i3 == 1) {
                    i2 |= 4096;
                    editorInfo.inputType = i2;
                } else if (i3 == 2) {
                    i2 |= 8192;
                    editorInfo.inputType = i2;
                } else if (i3 == 3) {
                    i2 |= 16384;
                    editorInfo.inputType = i2;
                }
                if (c11Var.c) {
                    editorInfo.inputType = 32768 | i2;
                }
            }
            long j = f83Var.b;
            int i7 = f93.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            dh0.F(editorInfo, f83Var.a.f);
            editorInfo.imeOptions |= 33554432;
            if (wi0.d()) {
                wi0.a().i(editorInfo);
            }
            me2 me2Var = new me2(legacyTextInputServiceAndroid.g, new us1(legacyTextInputServiceAndroid, 19), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(me2Var));
            return me2Var;
        }
        editorInfo.inputType = 1;
        i2 = 1;
        i4 = i2;
        if (!z) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (i5 == 1) {
                editorInfo.imeOptions = 1073741824 | i;
            }
        }
        if ((i2 & 1) == 1) {
            i3 = c11Var.b;
            if (i3 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i3 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i3 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (c11Var.c) {
                editorInfo.inputType = 32768 | i2;
            }
        }
        long j2 = f83Var.b;
        int i8 = f93.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        dh0.F(editorInfo, f83Var.a.f);
        editorInfo.imeOptions |= 33554432;
        if (wi0.d()) {
            wi0.a().i(editorInfo);
        }
        me2 me2Var2 = new me2(legacyTextInputServiceAndroid.g, new us1(legacyTextInputServiceAndroid, 19), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(me2Var2));
        return me2Var2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        yb ybVar = this.E;
        ybVar.getClass();
        vb.f(ybVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.y.onViewDetachedFromWindow(this);
        View view = this.p;
        if (l() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            sx1 sx1Var = U0;
            synchronized (sx1Var) {
                sx1Var.j(this);
            }
        }
        getComposeViewContext().b();
        ky2 ky2Var = getSnapshotObserver().a;
        g8 g8Var = ky2Var.h;
        if (g8Var != null) {
            g8Var.c();
        }
        ky2Var.a();
        xe1 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.b(this.E);
        lifecycle.b(this);
        mn2 mn2Var = this.Q;
        if (mn2Var != null) {
            op opVar = op.a;
            opVar.getClass();
            ((AutofillManager) mn2Var.g).unregisterCallback(opVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        hf1 hf1Var = this.k;
        if (hf1Var != null) {
            hf1Var.c = false;
        }
        this.k = null;
        if (i >= 31) {
            pb.a.a(this);
        }
        ea eaVar = this.R;
        if (eaVar != null) {
            getSemanticsOwner().d.j(eaVar);
            ((rp0) getFocusOwner()).g.j(eaVar);
        }
        re2 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        re2 rectManager2 = getRectManager();
        ma maVar = rectManager2.h;
        if (maVar != null) {
            rectManager2.a.removeCallbacks(maVar);
            rectManager2.h = null;
        }
        ((rp0) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        rp0 rp0Var = (rp0) getFocusOwner();
        ld0.o(rp0Var.c, true);
        if (rp0Var.g() != null) {
            dq0 dq0VarG = rp0Var.g();
            rp0Var.j(null);
            if (dq0VarG != null) {
                dq0VarG.n1(zp0.e, zp0.g);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.j0 = 0L;
        K();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        J(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.j0 = 0L;
            this.d0.k(this.K0);
            this.b0 = null;
            K();
            if (this.a0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        br1 br1Var = this.d0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jF = f(i);
            long jF2 = f(i2);
            long jS = da0.s((int) (jF >>> 32), (int) (jF & 4294967295L), (int) (jF2 >>> 32), (int) (4294967295L & jF2));
            l50 l50Var = this.b0;
            if (l50Var == null) {
                this.b0 = new l50(jS);
                this.c0 = false;
            } else if (!l50.b(l50Var.a, jS)) {
                this.c0 = true;
            }
            br1Var.s(jS);
            br1Var.m();
            setMeasuredDimension(getRoot().L.p.e, getRoot().L.p.f);
            if (this.a0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().L.p.e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().L.p.f, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            ea eaVar = this.R;
            if (eaVar != null) {
                hb1 hb1Var = eaVar.f.a;
                AutofillId autofillId = eaVar.k;
                String str = eaVar.i;
                re2 re2Var = eaVar.h;
                ee0.D(viewStructure, hb1Var, autofillId, str, re2Var);
                Object[] objArr = s02.a;
                sx1 sx1Var = new sx1(2);
                sx1Var.a(hb1Var);
                sx1Var.a(viewStructure);
                while (sx1Var.i()) {
                    Object objK = sx1Var.k(sx1Var.b - 1);
                    objK.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objK;
                    Object objK2 = sx1Var.k(sx1Var.b - 1);
                    objK2.getClass();
                    qx1 qx1Var = (qx1) ((hb1) objK2).n();
                    int i2 = ((gy1) qx1Var.f).g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        hb1 hb1Var2 = (hb1) qx1Var.get(i3);
                        if (!hb1Var2.V && hb1Var2.G() && hb1Var2.H()) {
                            es2 es2VarW = hb1Var2.w();
                            if (es2VarW != null) {
                                zx1 zx1Var = es2VarW.e;
                                if (zx1Var.b(ds2.g) || zx1Var.b(ds2.h) || zx1Var.b(os2.r) || zx1Var.b(os2.s)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    ee0.D(viewStructureNewChild, hb1Var2, autofillId, str, re2Var);
                                    sx1Var.a(hb1Var2);
                                    sx1Var.a(viewStructureNewChild);
                                } else {
                                    sx1Var.a(hb1Var2);
                                    sx1Var.a(viewStructure2);
                                }
                            } else {
                                sx1Var.a(hb1Var2);
                                sx1Var.a(viewStructure2);
                            }
                        }
                    }
                }
            }
            mn2 mn2Var = this.Q;
            if (mn2Var != null) {
                sp spVar = (sp) mn2Var.f;
                LinkedHashMap linkedHashMap = spVar.a;
                LinkedHashMap linkedHashMap2 = spVar.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        b81.u();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) mn2Var.h, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((db) mn2Var.e).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        v92 v92Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (v92Var = ((ya) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return v92Var instanceof bf ? PointerIcon.getSystemIcon(context, ((bf) v92Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        qa1 qa1Var;
        if (this.g) {
            int[] iArr = lp0.a;
            qa1 qa1Var2 = qa1.e;
            if (i != 0) {
                qa1Var = i != 1 ? null : qa1.f;
            } else {
                qa1Var = qa1Var2;
            }
            if (qa1Var != null) {
                qa1Var2 = qa1Var;
            }
            setLayoutDirection(qa1Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        qn2 qn2Var;
        if (Build.VERSION.SDK_INT < 31 || (qn2Var = this.O0) == null) {
            return;
        }
        qn2Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        K();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.x0.a.setValue(new f31(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        yb ybVar = this.E;
        ybVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (o51.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            vb.b(ybVar, longSparseArray);
        } else {
            ybVar.e.post(new ub(0, ybVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zG;
        this.M0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zG = ji2.G())) {
            return;
        }
        setShowLayoutBounds(zG);
        j(getRoot());
    }

    public final void p(float[] fArr) {
        z();
        yq1.e(fArr, this.h0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.l0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.l0 & 4294967295L));
        float[] fArr2 = this.g0;
        yq1.d(fArr2);
        yq1.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        sb.Z(fArr, fArr2);
    }

    public final long q(long j) {
        z();
        long jB = yq1.b(j, this.h0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.l0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.l0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void r(boolean z) {
        sa saVar;
        br1 br1Var = this.d0;
        if (br1Var.b.v() || ((gy1) br1Var.e.f).g != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    saVar = this.K0;
                } finally {
                    Trace.endSection();
                }
            } else {
                saVar = null;
            }
            if (br1Var.k(saVar)) {
                requestLayout();
            }
            br1Var.a(false);
            getRectManager().a();
            if (this.L) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.L = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            ep0 ep0VarD = lp0.d(i);
            int i3 = ep0VarD != null ? ep0VarD.a : 7;
            Boolean boolF = ((rp0) getFocusOwner()).f(i3, rect != null ? new pe2(rect.left, rect.top, rect.right, rect.bottom) : null, new za(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!o51.f(boolF, bool)) {
                if (!o51.f(((rp0) getFocusOwner()).f(i3, null, new za(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((rp0) getFocusOwner()).i(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(hb1 hb1Var, long j) {
        br1 br1Var = this.d0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            br1Var.l(hb1Var, j);
            if (!br1Var.b.v()) {
                br1Var.a(false);
                getRectManager().a();
                if (this.L) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.L = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.D.l = j;
    }

    public final void setComposeViewContext(a30 a30Var) {
        if (getCoroutineContext() != a30Var.b.j() && !((qx1) getRoot().n()).isEmpty()) {
            p21.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            a30 a30Var2 = get_composeViewContext();
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            if (a30Var != a30Var2) {
                if (isAttachedToWindow()) {
                    a30Var2.b();
                    a30Var.c();
                }
                set_composeViewContext(a30Var);
                setCoroutineContext(a30Var.b.j());
            }
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.N0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.O.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(yb ybVar) {
        this.E = ybVar;
    }

    public void setCoroutineContext(y70 y70Var) {
        this.r = y70Var;
    }

    public final void setFrameEndScheduler$ui(gf1 gf1Var) {
        this.j = gf1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.j0 = j;
    }

    public final void setOnReadyForComposition(lu0 lu0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.N0) {
            lu0Var.invoke(getComposeViewContext());
        } else {
            this.o0 = lu0Var;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m13setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(r11 r11Var) {
        this.h = r11Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.W = z;
    }

    public void setUncaughtExceptionHandler(si2 si2Var) {
        this.d0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(int i) {
        if (i != 7 && i != 8) {
            Integer numC = lp0.c(i);
            if (numC == null) {
                throw az2.e("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            dq0 dq0VarG = ((rp0) getFocusOwner()).g();
            if (dq0VarG == null) {
                fo.n("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = lp0.c(i);
            if (numC2 == null) {
                throw az2.e("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            bj3 bj3Var = xp1.O(dq0VarG).t;
            View interopView = bj3Var != null ? bj3Var.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !sb.M(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return lp0.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void u() {
        sx1 sx1Var;
        Object[] objArr;
        if (this.S) {
            ky2 ky2Var = getSnapshotObserver().a;
            synchronized (ky2Var.g) {
                try {
                    gy1 gy1Var = ky2Var.f;
                    int i = gy1Var.g;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = gy1Var.e;
                        if (i2 >= i) {
                            break;
                        }
                        jy2 jy2Var = (jy2) objArr[i2];
                        jy2Var.d();
                        if (!jy2Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = gy1Var.e;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    gy1Var.g = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.S = false;
        }
        jh jhVar = this.a0;
        if (jhVar != null) {
            e(jhVar);
        }
        ea eaVar = this.R;
        if (eaVar != null) {
            hx1 hx1Var = eaVar.l;
            if (hx1Var.d == 0 && eaVar.m) {
                ((AutofillManager) eaVar.e.f).commit();
                eaVar.m = false;
            }
            if (hx1Var.d != 0) {
                eaVar.m = true;
            }
        }
        while (this.D0.i() && this.D0.f(0) != null) {
            int i5 = this.D0.b;
            int i6 = 0;
            while (true) {
                sx1Var = this.D0;
                if (i6 < i5) {
                    au0 au0Var = (au0) sx1Var.f(i6);
                    this.D0.n(i6, null);
                    if (au0Var != null) {
                        au0Var.invoke();
                    }
                    i6++;
                }
            }
            sx1Var.l(0, i5);
        }
    }

    public final void v(hb1 hb1Var) {
        jb jbVar = this.D;
        jbVar.B = true;
        if (jbVar.q()) {
            jbVar.r(hb1Var);
        }
        yb ybVar = this.E;
        ybVar.j = true;
        if (ybVar.d()) {
            ybVar.k.mo32trySendJP2dKIU(mf3.a);
        }
    }

    public final void w(hb1 hb1Var, boolean z, boolean z2, boolean z3) {
        hb1 hb1VarU;
        hb1 hb1VarU2;
        br1 br1Var = this.d0;
        if (!z) {
            if (br1Var.r(hb1Var, z2) && z3) {
                D(hb1Var);
                return;
            }
            return;
        }
        gn gnVar = br1Var.b;
        hb1 hb1Var2 = hb1Var.m;
        lb1 lb1Var = hb1Var.L;
        if (hb1Var2 == null) {
            p21.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = lb1Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    b81.d();
                    return;
                }
                if (!lb1Var.e || z2) {
                    lb1Var.e = true;
                    lb1Var.p.y = true;
                    if (hb1Var.V) {
                        return;
                    }
                    if ((o51.f(hb1Var.I(), Boolean.TRUE) || br1.h(hb1Var)) && ((hb1VarU = hb1Var.u()) == null || !hb1VarU.L.e)) {
                        gnVar.a(hb1Var, w51.e);
                    } else if ((hb1Var.H() || br1.i(hb1Var)) && ((hb1VarU2 = hb1Var.u()) == null || !hb1VarU2.q())) {
                        gnVar.a(hb1Var, w51.g);
                    }
                    if (br1Var.d || !z3) {
                        return;
                    }
                    D(hb1Var);
                    return;
                }
                return;
            }
        }
        br1Var.g.b(new ar1(hb1Var, true, z2));
    }

    public final void x(hb1 hb1Var, boolean z, boolean z2) {
        lb1 lb1Var = hb1Var.L;
        w51 w51Var = w51.h;
        br1 br1Var = this.d0;
        if (!z) {
            br1Var.getClass();
            int iOrdinal = lb1Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                b81.d();
                return;
            }
            hb1 hb1VarU = hb1Var.u();
            boolean z3 = hb1VarU == null || hb1VarU.H();
            if (!z2) {
                if (hb1Var.q()) {
                    return;
                }
                if (hb1Var.p() && hb1Var.H() == z3 && hb1Var.H() == lb1Var.p.x) {
                    return;
                }
            }
            dr1 dr1Var = lb1Var.p;
            dr1Var.z = true;
            dr1Var.A = true;
            if (!hb1Var.V && dr1Var.x && z3) {
                if ((hb1VarU == null || !hb1VarU.p()) && (hb1VarU == null || !hb1VarU.q())) {
                    br1Var.b.a(hb1Var, w51Var);
                }
                if (br1Var.d) {
                    return;
                }
                D(null);
                return;
            }
            return;
        }
        gn gnVar = br1Var.b;
        int iOrdinal2 = lb1Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    b81.d();
                    return;
                }
            }
        }
        if ((lb1Var.e || lb1Var.f) && !z2) {
            return;
        }
        lb1Var.f = true;
        lb1Var.g = true;
        dr1 dr1Var2 = lb1Var.p;
        dr1Var2.z = true;
        dr1Var2.A = true;
        if (hb1Var.V) {
            return;
        }
        hb1 hb1VarU2 = hb1Var.u();
        if (o51.f(hb1Var.I(), Boolean.TRUE) && ((hb1VarU2 == null || !hb1VarU2.L.e) && (hb1VarU2 == null || !hb1VarU2.L.f))) {
            gnVar.a(hb1Var, w51.f);
        } else if (hb1Var.H() && ((hb1VarU2 == null || !hb1VarU2.p()) && (hb1VarU2 == null || !hb1VarU2.q()))) {
            gnVar.a(hb1Var, w51Var);
        }
        if (br1Var.d) {
            return;
        }
        D(null);
    }

    public final void y() {
        jb jbVar = this.D;
        jbVar.B = true;
        Handler handler = jbVar.h.getHandler();
        if (jbVar.q() && !jbVar.M && handler != null) {
            jbVar.M = true;
            handler.post(jbVar.O);
        }
        yb ybVar = this.E;
        ybVar.j = true;
        Handler handler2 = ybVar.e.getHandler();
        if (!ybVar.d() || ybVar.p || handler2 == null) {
            return;
        }
        ybVar.p = true;
        handler2.post(ybVar.q);
    }

    public final void z() {
        if (this.k0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.j0) {
            this.j0 = jCurrentAnimationTimeMillis;
            zu zuVar = this.L0;
            float[] fArr = this.h0;
            zuVar.a(this, fArr);
            ld0.A(fArr, this.i0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.l0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public ba m14getAccessibilityManager() {
        return this.F;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public ja m15getClipboard() {
        return this.U;
    }

    public ka getClipboardManager() {
        return this.T;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public oc m17getDragAndDropManager() {
        return this.s;
    }

    public gx1 getLayoutNodes() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @cc0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m11getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @cc0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public ti2 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(si2 si2Var) {
    }
}
