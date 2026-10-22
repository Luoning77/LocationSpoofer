package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kg2 {
    public static kg2 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public bl e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final jg2 h = new jg2(6);

    public static synchronized kg2 c() {
        kg2 kg2Var;
        kg2Var = g;
        if (kg2Var == null) {
            kg2Var = new kg2();
            g = kg2Var;
        }
        return kg2Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        jg2 jg2Var = h;
        jg2Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) jg2Var.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, u40 u40Var, int[] iArr) {
        int[] state = drawable.getState();
        int[] iArr2 = pg0.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = u40Var.b;
        if (!z && !u40Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? (ColorStateList) u40Var.c : null;
        PorterDuff.Mode mode = u40Var.a ? (PorterDuff.Mode) u40Var.d : f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        yy2 yy2Var = (yy2) weakHashMap.get(context);
        if (yy2Var == null) {
            yy2Var = new yy2(0);
            this.a.put(context, yy2Var);
        }
        int i2 = yy2Var.g;
        if (i2 != 0 && i <= yy2Var.e[i2 - 1]) {
            yy2Var.b(i, colorStateList);
            return;
        }
        if (i2 >= yy2Var.e.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            yy2Var.e = Arrays.copyOf(yy2Var.e, i6);
            yy2Var.f = Arrays.copyOf(yy2Var.f, i6);
        }
        yy2Var.e[i2] = i;
        yy2Var.f[i2] = colorStateList;
        yy2Var.g = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final Drawable b(Context context, int i) {
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableC;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            zj1 zj1Var = (zj1) this.b.get(context);
            if (zj1Var != null && (weakReference = (WeakReference) zj1Var.c(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    zj1Var.h(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableC = null;
        } else if (i == 2131165201) {
            layerDrawableC = new LayerDrawable(new Drawable[]{d(context, 2131165200), d(context, 2131165202)});
        } else if (i == 2131165236) {
            layerDrawableC = bl.c(this, context, 2131099707);
        } else if (i == 2131165235) {
            layerDrawableC = bl.c(this, context, 2131099708);
        } else if (i == 2131165237) {
            layerDrawableC = bl.c(this, context, 2131099709);
        } else {
            layerDrawableC = null;
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                zj1 zj1Var2 = (zj1) this.b.get(context);
                if (zj1Var2 == null) {
                    zj1Var2 = new zj1((Object) null);
                    this.b.put(context, zj1Var2);
                }
                zj1Var2.g(j, new WeakReference(constantState2));
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, 2131165263);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                pg0.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        yy2 yy2Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (yy2Var = (yy2) weakHashMap.get(context)) == null) ? null : (ColorStateList) sb.L(yy2Var, i);
        if (colorStateList == null) {
            bl blVar = this.e;
            if (blVar != null) {
                colorStateListD = blVar.d(context, i);
            }
            if (colorStateListD != null) {
                a(context, i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            int[] iArr = pg0.a;
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == 2131165250) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        int i2 = 2130903131;
        if (this.e != null) {
            if (i == 2131165245) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iC = ca3.c(context, 2130903131);
                PorterDuff.Mode mode2 = cl.b;
                bl.e(drawableFindDrawableByLayerId, iC, mode2);
                bl.e(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ca3.c(context, 2130903131), mode2);
                bl.e(layerDrawable.findDrawableByLayerId(R.id.progress), ca3.c(context, 2130903129), mode2);
                return drawable;
            }
            if (i == 2131165236 || i == 2131165235 || i == 2131165237) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iB = ca3.b(context, 2130903131);
                PorterDuff.Mode mode3 = cl.b;
                bl.e(drawableFindDrawableByLayerId2, iB, mode3);
                bl.e(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), ca3.c(context, 2130903129), mode3);
                bl.e(layerDrawable2.findDrawableByLayerId(R.id.progress), ca3.c(context, 2130903129), mode3);
                return drawable;
            }
        }
        bl blVar = this.e;
        boolean z3 = false;
        if (blVar != null) {
            PorterDuff.Mode mode4 = cl.b;
            if (bl.a((int[]) blVar.a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (bl.a((int[]) blVar.c, i)) {
                    i2 = 2130903129;
                } else {
                    boolean zA = bl.a((int[]) blVar.d, i);
                    i2 = R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165222) {
                        iRound = Math.round(40.8f);
                        i2 = R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != 2131165204) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                int[] iArr2 = pg0.a;
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = ca3.c(context, i2);
                synchronized (cl.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterF);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
