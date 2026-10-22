package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bl {
    public final Object a;
    public Object b;
    public Serializable c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    public bl() {
        this.a = new int[]{2131165261, 2131165259, 2131165185};
        this.b = new int[]{2131165209, 2131165244, 2131165216, 2131165211, 2131165212, 2131165215, 2131165214};
        this.c = new int[]{2131165258, 2131165260, 2131165202, 2131165254, 2131165255, 2131165256, 2131165257};
        this.d = new int[]{2131165234, 2131165200, 2131165233};
        this.e = new int[]{2131165252, 2131165262};
        this.f = new int[]{2131165188, 2131165194, 2131165189, 2131165195};
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int iC = ca3.c(context, 2130903130);
        int iB = ca3.b(context, 2130903128);
        int[] iArr = ca3.b;
        int[] iArr2 = ca3.d;
        int iB2 = tz.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, ca3.c, ca3.f}, new int[]{iB, iB2, tz.b(iC, i), i});
    }

    public static LayerDrawable c(kg2 kg2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = kg2Var.d(context, 2131165248);
        Drawable drawableD2 = kg2Var.d(context, 2131165249);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        int[] iArr = pg0.a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = cl.b;
        }
        PorterDuff.Mode mode2 = cl.b;
        synchronized (cl.class) {
            porterDuffColorFilterF = kg2.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public ColorStateList d(Context context, int i) {
        if (i == 2131165205) {
            return zm3.r(context, 2131034133);
        }
        if (i == 2131165251) {
            return zm3.r(context, 2131034136);
        }
        if (i != 2131165250) {
            if (i == 2131165193) {
                return b(context, ca3.c(context, 2130903128));
            }
            if (i == 2131165187) {
                return b(context, 0);
            }
            if (i == 2131165192) {
                return b(context, ca3.c(context, 2130903126));
            }
            if (i == 2131165246 || i == 2131165247) {
                return zm3.r(context, 2131034135);
            }
            if (a((int[]) this.b, i)) {
                return ca3.d(context, 2130903131);
            }
            if (a((int[]) this.e, i)) {
                return zm3.r(context, 2131034132);
            }
            if (a((int[]) this.f, i)) {
                return zm3.r(context, 2131034131);
            }
            if (i == 2131165243) {
                return zm3.r(context, 2131034134);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = ca3.d(context, 2130903135);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = ca3.b;
            iArr2[0] = ca3.b(context, 2130903135);
            iArr[1] = ca3.e;
            iArr2[1] = ca3.c(context, 2130903129);
            iArr[2] = ca3.f;
            iArr2[2] = ca3.c(context, 2130903135);
        } else {
            int[] iArr3 = ca3.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = ca3.e;
            iArr2[1] = ca3.c(context, 2130903129);
            iArr[2] = ca3.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public bl(k53 k53Var) {
        k53Var.getClass();
        this.a = k53Var;
        this.f = ez0.a;
    }
}
