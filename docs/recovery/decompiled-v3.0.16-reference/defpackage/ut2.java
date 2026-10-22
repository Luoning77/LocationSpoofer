package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ut2 extends st {
    public us1 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.st
    public final void a(float f, long j, je jeVar) {
        Paint paint = (Paint) jeVar.c;
        us1 us1Var = this.a;
        if (us1Var == null || !cw2.a(this.b, j)) {
            if (cw2.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                us1Var = null;
            } else {
                us1Var = this.a;
                if (us1Var == null) {
                    us1Var = new us1((char) 0, 20);
                    this.a = us1Var;
                }
                us1Var.f = b(j);
                this.a = us1Var;
                this.b = j;
            }
        }
        long jC = xp1.c(paint.getColor());
        long j2 = hz.b;
        if (!ye3.a(jC, j2)) {
            jeVar.g(j2);
        }
        if (!o51.f((Shader) jeVar.d, us1Var != null ? (Shader) us1Var.f : null)) {
            jeVar.k(us1Var != null ? (Shader) us1Var.f : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        jeVar.e(f);
    }

    public abstract Shader b(long j);
}
