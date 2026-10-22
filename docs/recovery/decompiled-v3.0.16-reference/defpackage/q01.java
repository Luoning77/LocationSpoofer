package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q01 {
    public static q01 e;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    public q01(k41 k41Var, kd1 kd1Var) {
        Object pa0Var;
        this.a = 5;
        q01 q01Var = kd1Var.a;
        int i = k41Var.e;
        if (i < 0) {
            s21.c("negative nearestRange.first");
        }
        int iMin = Math.min(k41Var.f, q01Var.b - 1);
        if (iMin < i) {
            ox1 ox1Var = r02.a;
            ox1Var.getClass();
            this.c = ox1Var;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        ox1 ox1Var2 = new ox1(i2);
        gy1 gy1Var = (gy1) q01Var.c;
        if (i < 0 || i >= q01Var.b) {
            StringBuilder sbR = p91.r(i, "Index ", ", size ");
            sbR.append(q01Var.b);
            s21.e(sbR.toString());
        }
        if (iMin < 0 || iMin >= q01Var.b) {
            StringBuilder sbR2 = p91.r(iMin, "Index ", ", size ");
            sbR2.append(q01Var.b);
            s21.e(sbR2.toString());
        }
        if (iMin < i) {
            s21.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iV = wc0.v(i, gy1Var);
        int i3 = ((d51) gy1Var.e[iV]).a;
        while (i3 <= iMin) {
            d51 d51Var = (d51) gy1Var.e[iV];
            lu0 lu0Var = (lu0) d51Var.c.a;
            int i4 = d51Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (d51Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (lu0Var != null) {
                        pa0Var = lu0Var.invoke(Integer.valueOf(iMax - i4));
                        pa0Var = pa0Var == null ? new pa0(iMax) : pa0Var;
                    }
                    ox1Var2.g(iMax, pa0Var);
                    ((Object[]) this.d)[iMax - this.b] = pa0Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += d51Var.b;
            iV++;
        }
        this.c = ox1Var2;
    }

    public static synchronized q01 f(Context context) {
        q01 q01Var;
        q01Var = e;
        if (q01Var == null) {
            q01Var = new q01(context.getApplicationContext());
            e = q01Var;
        }
        return q01Var;
    }

    public void a(int i, gn gnVar) {
        if (i < 0) {
            s21.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        d51 d51Var = new d51(this.b, i, gnVar);
        this.b += i;
        ((gy1) this.c).b(d51Var);
    }

    public void b() {
        u40 u40Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            pg0.a(drawable);
        }
        if (drawable == null || (u40Var = (u40) this.d) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = cl.b;
        kg2.i(drawable, u40Var, drawableState);
    }

    public n01 c(Bitmap bitmap) {
        if (this.b < 0) {
            throw new iv("Cannot create an Icon because there are already too many. Try reusing Icon objects whenever possible.");
        }
        StringBuilder sb = new StringBuilder("com.mapbox.icons.icon_");
        int i = this.b + 1;
        this.b = i;
        sb.append(i);
        return new n01(sb.toString(), bitmap);
    }

    public d51 d(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sbR = p91.r(i, "Index ", ", size ");
            sbR.append(this.b);
            s21.e(sbR.toString());
        }
        d51 d51Var = (d51) this.d;
        if (d51Var != null) {
            int i2 = d51Var.a;
            if (i < d51Var.b + i2 && i2 <= i) {
                return d51Var;
            }
        }
        gy1 gy1Var = (gy1) this.c;
        d51 d51Var2 = (d51) gy1Var.e[wc0.v(i, gy1Var)];
        this.d = d51Var2;
        return d51Var2;
    }

    public int e(Object obj) {
        ox1 ox1Var = (ox1) this.c;
        int iD = ox1Var.d(obj);
        if (iD >= 0) {
            return ox1Var.c[iD];
        }
        return -1;
    }

    public void g(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.c;
        int i8 = this.b;
        int i9 = i8 + 3;
        this.b = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | LockFreeTaskQueueCore.FROZEN_MASK | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = qe2.b;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    public void i(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = jd2.f;
        gn gnVarY = gn.y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        yi3.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) gnVarY.a, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = k22.v(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                pg0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(gnVarY.j(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(pg0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            gnVarY.A();
        }
    }

    public void j(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (LockFreeTaskQueueCore.FROZEN_MASK * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void k(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.c;
        long[] jArr2 = (long[]) this.d;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.b : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = qe2.b;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void l(int i, ru0 ru0Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                ru0Var.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((bd2) this.c) == bd2.f) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public q01(bd2 bd2Var, int i, String str) {
        this.a = 8;
        this.c = bd2Var;
        this.b = i;
        this.d = str;
    }

    public q01(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = 1;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            fo.i("changes cannot be empty");
            throw null;
        }
    }

    public q01(ImageView imageView) {
        this.a = 2;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ q01(int i) {
        this.a = i;
    }

    public q01(Context context) {
        this.a = 0;
        this.b = 0;
        this.c = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        options.inTargetDensity = displayMetrics.densityDpi;
        options.inScreenDensity = displayMetrics2.densityDpi;
    }

    public q01() {
        this.a = 4;
        this.c = new gy1(new d51[16]);
    }

    public q01(aj3 aj3Var) {
        this.a = 3;
        this.c = aj3Var;
    }
}
