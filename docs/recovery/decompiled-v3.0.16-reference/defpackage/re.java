package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class re {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public re(Path path) {
        this.a = path;
    }

    public static void a(re reVar, re reVar2) {
        Path path = reVar.a;
        if (reVar2 instanceof re) {
            path.addPath(reVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            b81.s("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(re reVar, pe2 pe2Var) {
        reVar.getClass();
        float f = pe2Var.a;
        float f2 = pe2Var.d;
        float f3 = pe2Var.c;
        float f4 = pe2Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            ue.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = reVar.b;
        if (rectF == null) {
            rectF = new RectF();
            reVar.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = reVar.a;
        RectF rectF2 = reVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(re reVar, aj2 aj2Var) {
        RectF rectF = reVar.b;
        if (rectF == null) {
            rectF = new RectF();
            reVar.b = rectF;
        }
        float f = aj2Var.a;
        long j = aj2Var.h;
        long j2 = aj2Var.g;
        long j3 = aj2Var.f;
        long j4 = aj2Var.e;
        rectF.set(f, aj2Var.b, aj2Var.c, aj2Var.d);
        float[] fArr = reVar.c;
        if (fArr == null) {
            fArr = new float[8];
            reVar.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = reVar.a;
        RectF rectF2 = reVar.b;
        rectF2.getClass();
        float[] fArr2 = reVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final pe2 d() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new pe2(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean f(re reVar, re reVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(reVar instanceof re)) {
            b81.s("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = reVar.a;
        if (reVar2 instanceof re) {
            return this.a.op(path, reVar2.a, op);
        }
        b81.s("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void g() {
        this.a.reset();
    }

    public final void h() {
        this.a.rewind();
    }

    public final void i(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
