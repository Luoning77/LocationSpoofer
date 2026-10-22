package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class eh extends ViewGroup implements mz1, k20, u42, n12 {
    public int A;
    public final mm0 B;
    public boolean C;
    public final hb1 D;
    public final dz1 e;
    public final View f;
    public final t42 g;
    public au0 h;
    public boolean i;
    public au0 j;
    public au0 k;
    public dv1 l;
    public lu0 m;
    public xb0 n;
    public lu0 o;
    public df1 p;
    public tm2 q;
    public final int[] r;
    public long s;
    public ql3 t;
    public lu0 u;
    public final dh v;
    public final dh w;
    public lu0 x;
    public final int[] y;
    public int z;

    public eh(Context context, mv0 mv0Var, int i, dz1 dz1Var, View view, t42 t42Var) {
        super(context);
        this.e = dz1Var;
        this.f = view;
        this.g = t42Var;
        zx1 zx1Var = km3.a;
        setTag(2131230785, mv0Var);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        bj3 bj3Var = (bj3) this;
        wg wgVar = new wg(bj3Var, i2);
        WeakHashMap weakHashMap = yi3.a;
        al3.a(this, wgVar);
        ri3.h(this, this);
        this.h = c8.u;
        this.j = c8.t;
        this.k = c8.s;
        this.l = av1.a;
        this.n = ym3.i();
        int i3 = 2;
        this.r = new int[2];
        this.s = 0L;
        int i4 = 1;
        this.v = new dh(bj3Var, i4);
        this.w = new dh(bj3Var, i2);
        this.y = new int[2];
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = new mm0();
        hb1 hb1Var = new hb1(3);
        hb1Var.t = bj3Var;
        dv1 dv1VarA = gs2.a(xp1.I(dz1Var), true, wa.r);
        ea2 ea2Var = new ea2();
        ea2Var.a = new yg(bj3Var, i3);
        w3 w3Var = new w3();
        w3 w3Var2 = ea2Var.b;
        if (w3Var2 != null) {
            w3Var2.f = null;
        }
        ea2Var.b = w3Var;
        w3Var.f = ea2Var;
        setOnRequestDisallowInterceptTouchEvent$ui(w3Var);
        dv1 dv1VarD = k22.G(xp1.s(dv1VarA.d(ea2Var), new ah(bj3Var, hb1Var, bj3Var)), new xg(bj3Var, hb1Var, i3)).d(new at(new yg(bj3Var, i4)));
        hb1Var.d0(this.l.d(dv1VarD));
        int i5 = 5;
        this.m = new ze(i5, hb1Var, dv1VarD);
        hb1Var.Z(this.n);
        this.o = new q9(hb1Var, i5);
        hb1Var.R = new xg(bj3Var, hb1Var, i2);
        hb1Var.S = new yg(bj3Var, i2);
        hb1Var.c0(new zg(bj3Var, hb1Var));
        this.D = hb1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v42 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            p21.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((db) this.g).getSnapshotObserver();
    }

    public static j31 k(j31 j31Var, int i, int i2, int i3, int i4) {
        int i5 = j31Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = j31Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = j31Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = j31Var.d - i4;
        return j31.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    public static int m(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(mh0.v(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // defpackage.u42
    public final boolean S() {
        return isAttachedToWindow();
    }

    @Override // defpackage.lz1
    public final void a(View view, View view2, int i, int i2) {
        mm0 mm0Var = this.B;
        if (i2 == 1) {
            mm0Var.b = i;
        } else {
            mm0Var.a = i;
        }
    }

    @Override // defpackage.lz1
    public final void b(View view, int i) {
        mm0 mm0Var = this.B;
        if (i == 1) {
            mm0Var.b = 0;
        } else {
            mm0Var.a = 0;
        }
    }

    @Override // defpackage.mz1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            hz1 hz1Var = this.e.a;
            hz1 hz1VarN1 = hz1Var != null ? hz1Var.n1() : null;
            long jI0 = hz1VarN1 != null ? hz1VarN1.i0(i6, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = xq1.P(Float.intBitsToFloat((int) (jI0 >> 32))) * (-1);
            iArr[1] = xq1.P(Float.intBitsToFloat((int) (jI0 & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.lz1
    public final void d(int i, int i2, int[] iArr, int i3) {
        if (this.f.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            hz1 hz1Var = this.e.a;
            hz1 hz1VarN1 = hz1Var != null ? hz1Var.n1() : null;
            long jR0 = hz1VarN1 != null ? hz1VarN1.R0(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = xq1.P(Float.intBitsToFloat((int) (jR0 >> 32))) * (-1);
            iArr[1] = xq1.P(Float.intBitsToFloat((int) (jR0 & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.lz1
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (this.f.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            hz1 hz1Var = this.e.a;
            hz1 hz1VarN1 = hz1Var != null ? hz1Var.n1() : null;
            if (hz1VarN1 != null) {
                hz1VarN1.i0(i6, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.k20
    public final void f() {
        this.k.invoke();
    }

    @Override // defpackage.n12
    public final ql3 g(View view, ql3 ql3Var) {
        this.t = new ql3(ql3Var);
        return l(ql3Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.y;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final xb0 getDensity() {
        return this.n;
    }

    public final View getInteropView() {
        return this.f;
    }

    public final hb1 getLayoutNode() {
        return this.D;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final df1 getLifecycleOwner() {
        return this.p;
    }

    public final dv1 getModifier() {
        return this.l;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        mm0 mm0Var = this.B;
        return mm0Var.b | mm0Var.a;
    }

    public final lu0 getOnDensityChanged$ui() {
        return this.o;
    }

    public final lu0 getOnModifierChanged$ui() {
        return this.m;
    }

    public final lu0 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.x;
    }

    public final au0 getRelease() {
        return this.k;
    }

    public final au0 getReset() {
        return this.j;
    }

    public final tm2 getSavedStateRegistryOwner() {
        return this.q;
    }

    public final au0 getUpdate() {
        return this.h;
    }

    public final View getView() {
        return this.f;
    }

    @Override // defpackage.k20
    public final void h() {
        this.j.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.lz1
    public final boolean i(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.C) {
            this.D.B();
            return null;
        }
        this.f.postOnAnimation(new ma(3, this.w));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f.isNestedScrollingEnabled();
    }

    public final ql3 l(ql3 ql3Var) {
        nl3 nl3Var = ql3Var.a;
        j31 j31VarG = nl3Var.g(-1);
        j31 j31Var = j31.e;
        if (!j31VarG.equals(j31Var) || !nl3Var.h(-9).equals(j31Var) || nl3Var.f() != null) {
            v21 v21Var = this.D.K.c;
            if (v21Var.X.r) {
                long jO = gh0.O(v21Var.h0(0L));
                int i = (int) (jO >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jO & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jF0 = wc0.F(v21Var).f0();
                int i3 = (int) (jF0 >> 32);
                int i4 = (int) (jF0 & 4294967295L);
                long j = v21Var.g;
                long jO2 = gh0.O(v21Var.h0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jO2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jO2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return ql3Var.a.n(i, i2, i5, i7);
                }
            }
        }
        return ql3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.C) {
            this.D.B();
        } else {
            this.f.postOnAnimation(new ma(3, this.w));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: all -> 0x0096, LOOP:1: B:14:0x0035->B:25:0x007b, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:8:0x0018, B:26:0x0080, B:28:0x0088, B:33:0x0098, B:30:0x008d, B:11:0x0029, B:14:0x0035, B:16:0x004a, B:18:0x0056, B:20:0x0060, B:22:0x0070, B:25:0x007b, B:34:0x009c), top: B:39:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[EDGE_INSN: B:46:0x0080->B:26:0x0080 BREAK  A[LOOP:1: B:14:0x0035->B:25:0x007b], SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        ky2 ky2Var = getSnapshotObserver().a;
        synchronized (ky2Var.g) {
            try {
                gy1 gy1Var = ky2Var.f;
                int i2 = gy1Var.g;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = gy1Var.e;
                    if (i3 < i2) {
                        jy2 jy2Var = (jy2) objArr[i3];
                        ox1 ox1Var = (ox1) jy2Var.f.k(this);
                        if (ox1Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = ox1Var.b;
                            int[] iArr = ox1Var.c;
                            long[] jArr = ox1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i5 != length) {
                                            break;
                                            break;
                                        } else {
                                            i5++;
                                            i3 = i;
                                        }
                                    } else {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i5 << 3) + i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                jy2Var.c(this, obj);
                                            }
                                            j >>= i6;
                                            i8++;
                                            i6 = i6;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!jy2Var.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = gy1Var.e;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i11 = i2 - i4;
                        Arrays.fill(objArr, i11, i2, (Object) null);
                        gy1Var.g = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.z = i;
        this.A = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.e.c(), null, null, new bh(z, this, g93.c(f * (-1.0f), (-1.0f) * f2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.e.c(), null, null, new ch(this, g93.c(f * (-1.0f), f2 * (-1.0f)), null, 0), 3, null);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        lu0 lu0Var = this.u;
        if (lu0Var == null) {
            return true;
        }
        lu0Var.invoke(rect != null ? new pe2(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        lu0 lu0Var = this.x;
        if (lu0Var != null) {
            lu0Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(xb0 xb0Var) {
        if (xb0Var != this.n) {
            this.n = xb0Var;
            lu0 lu0Var = this.o;
            if (lu0Var != null) {
                lu0Var.invoke(xb0Var);
            }
        }
    }

    public final void setLifecycleOwner(df1 df1Var) {
        if (df1Var != this.p) {
            this.p = df1Var;
            setTag(2131230945, df1Var);
        }
    }

    public final void setModifier(dv1 dv1Var) {
        if (dv1Var != this.l) {
            this.l = dv1Var;
            lu0 lu0Var = this.m;
            if (lu0Var != null) {
                lu0Var.invoke(dv1Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(lu0 lu0Var) {
        this.o = lu0Var;
    }

    public final void setOnModifierChanged$ui(lu0 lu0Var) {
        this.m = lu0Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(lu0 lu0Var) {
        this.x = lu0Var;
    }

    public final void setRelease(au0 au0Var) {
        this.k = au0Var;
    }

    public final void setReset(au0 au0Var) {
        this.j = au0Var;
    }

    public final void setSavedStateRegistryOwner(tm2 tm2Var) {
        if (tm2Var != this.q) {
            this.q = tm2Var;
            setTag(2131230948, tm2Var);
        }
    }

    public final void setUpdate(au0 au0Var) {
        this.h = au0Var;
        this.i = true;
        this.v.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
