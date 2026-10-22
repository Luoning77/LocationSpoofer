package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class je {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public je(a71 a71Var) {
        this.a = 1;
        this.c = a71Var;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof bt2) {
                bt2 bt2Var = (bt2) obj;
                boolean zF = o51.f(bt2Var.c(), u13.f);
                int[] iArr = (int[]) this.e;
                if (!zF) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(bt2Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == j9.R) {
                sb.append("[<debug info disabled>]");
            } else if (obj != j9.S) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int b() {
        Paint.Cap strokeCap = ((Paint) this.c).getStrokeCap();
        int i = strokeCap == null ? -1 : ke.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int c() {
        Paint.Join strokeJoin = ((Paint) this.c).getStrokeJoin();
        int i = strokeJoin == null ? -1 : ke.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void d() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        yo.o0(0, 0, 14, (int[]) this.e, iArr);
        this.e = iArr;
    }

    public void e(float f) {
        ((Paint) this.c).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void f(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        Paint paint = (Paint) this.c;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(k22.I(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(k22.J(i)));
        }
    }

    public void g(long j) {
        ((Paint) this.c).setColor(xp1.T(j));
    }

    public void h(rr rrVar) {
        this.e = rrVar;
        ((Paint) this.c).setColorFilter(rrVar != null ? rrVar.a : null);
    }

    public void i(int i) {
        ((Paint) this.c).setFilterBitmap(!(i == 0));
    }

    public void j(se seVar) {
        ((Paint) this.c).setPathEffect(null);
    }

    public void k(Shader shader) {
        this.d = shader;
        ((Paint) this.c).setShader(shader);
    }

    public void l(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.c;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void m(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.c;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void n(float f) {
        ((Paint) this.c).setStrokeWidth(f);
    }

    public void o(int i) {
        ((Paint) this.c).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return a();
            default:
                return super.toString();
        }
    }

    public je(Paint paint) {
        this.a = 0;
        this.c = paint;
        this.b = 3;
    }
}
