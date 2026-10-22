package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.maplibre.android.maps.k;
import org.maplibre.android.maps.l;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jf3 {
    public double B;
    public final bp0 a;
    public final k b;
    public final l c;
    public r00 d;
    public ImageView f;
    public ImageView h;
    public final float j;
    public final int[] e = new int[4];
    public final int[] g = new int[4];
    public final int[] i = new int[4];
    public boolean k = true;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    public boolean r = true;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public float w = 1.0f;
    public boolean x = true;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;

    public jf3(l lVar, bp0 bp0Var, float f, k kVar) {
        this.c = lVar;
        this.a = bp0Var;
        this.j = f;
        this.b = kVar;
    }

    public static void g(int i, int i2, int i3, int i4, View view, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i3);
        view.setLayoutParams(layoutParams);
    }

    public final void a(Context context, jp1 jp1Var) {
        int color;
        this.z = true;
        this.f = this.b.a();
        d(jp1Var.p);
        int i = jp1Var.q;
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = i;
            imageView.setLayoutParams(layoutParams);
        }
        int[] iArr = jp1Var.r;
        int[] iArr2 = this.g;
        if (iArr != null) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            ImageView imageView2 = this.f;
            if (imageView2 != null) {
                g(i2, i3, i4, i5, imageView2, iArr2);
            }
        } else {
            Resources resources = context.getResources();
            int dimension = (int) resources.getDimension(2131099753);
            int dimension2 = (int) resources.getDimension(2131099765);
            ImageView imageView3 = this.f;
            if (imageView3 != null) {
                g(dimension2, dimension, dimension, dimension, imageView3, iArr2);
            }
        }
        int i6 = jp1Var.o;
        if (i6 == -1) {
            try {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(context.getResources().getIdentifier("colorPrimary", "attrs", context.getPackageName()), typedValue, true);
                color = typedValue.data;
            } catch (Exception unused) {
                color = context.getResources().getColor(2131034172, context.getTheme());
            }
            i6 = color;
        }
        if (this.f == null) {
            return;
        }
        int iAlpha = Color.alpha(i6);
        ImageView imageView4 = this.f;
        if (iAlpha != 0) {
            imageView4.setImageTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i6, i6}));
        } else {
            int color2 = imageView4.getContext().getColor(2131034172);
            imageView4.setImageTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{color2, color2}));
        }
    }

    public final void b(jp1 jp1Var, Resources resources) {
        this.y = true;
        this.d = this.b.b();
        e(jp1Var.g);
        int i = jp1Var.i;
        r00 r00Var = this.d;
        if (r00Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r00Var.getLayoutParams();
            layoutParams.gravity = i;
            r00Var.setLayoutParams(layoutParams);
        }
        int[] iArr = jp1Var.j;
        int[] iArr2 = this.e;
        if (iArr != null) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            r00 r00Var2 = this.d;
            if (r00Var2 != null) {
                g(i2, i3, i4, i5, r00Var2, iArr2);
            }
        } else {
            int dimension = (int) resources.getDimension(2131099753);
            r00 r00Var3 = this.d;
            if (r00Var3 != null) {
                g(dimension, dimension, dimension, dimension, r00Var3, iArr2);
            }
        }
        boolean z = jp1Var.h;
        r00 r00Var4 = this.d;
        if (r00Var4 != null) {
            r00Var4.f = z;
        }
        Drawable drawable = jp1Var.k;
        if (drawable == null) {
            ThreadLocal threadLocal = ng2.a;
            drawable = resources.getDrawable(2131165282, null);
            jp1Var.k = drawable;
        }
        r00 r00Var5 = this.d;
        if (r00Var5 != null) {
            r00Var5.setCompassImage(drawable);
        }
    }

    public final void c(jp1 jp1Var, Resources resources) {
        this.A = true;
        this.h = this.b.c();
        f(jp1Var.l);
        int i = jp1Var.m;
        ImageView imageView = this.h;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = i;
            imageView.setLayoutParams(layoutParams);
        }
        int[] iArr = jp1Var.n;
        int[] iArr2 = this.i;
        if (iArr == null) {
            int dimension = (int) resources.getDimension(2131099753);
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                g(dimension, dimension, dimension, dimension, imageView2, iArr2);
                return;
            }
            return;
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        ImageView imageView3 = this.h;
        if (imageView3 != null) {
            g(i2, i3, i4, i5, imageView3, iArr2);
        }
    }

    public final void d(boolean z) {
        if (z && !this.z) {
            k kVar = this.b;
            a(kVar.getContext(), kVar.l);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void e(boolean z) {
        if (z && !this.y) {
            k kVar = this.b;
            b(kVar.l, kVar.getContext().getResources());
        }
        r00 r00Var = this.d;
        if (r00Var != null) {
            r00Var.setEnabled(z);
            this.d.c(this.B);
        }
    }

    public final void f(boolean z) {
        if (z && !this.A) {
            k kVar = this.b;
            c(kVar.l, kVar.getContext().getResources());
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }
}
