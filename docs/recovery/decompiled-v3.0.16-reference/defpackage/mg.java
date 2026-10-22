package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mg extends TextPaint {
    public je a;
    public p63 b;
    public int c;
    public xt2 d;
    public hz e;
    public st f;
    public fc0 g;
    public cw2 h;
    public kg0 i;

    public final je a() {
        je jeVar = this.a;
        if (jeVar != null) {
            return jeVar;
        }
        je jeVar2 = new je(this);
        this.a = jeVar2;
        return jeVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().f(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void c(st stVar, long j, float f) {
        if (stVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (stVar instanceof qy2) {
            d(mh0.Q(f, ((qy2) stVar).a));
            return;
        }
        if (!(stVar instanceof ut2)) {
            b81.d();
            return;
        }
        int i = 0;
        if (o51.f(this.f, stVar)) {
            cw2 cw2Var = this.h;
            if (!(cw2Var == null ? false : cw2.a(cw2Var.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = stVar;
                    this.h = new cw2(j);
                    this.g = by2.b(new lg(i, j, stVar));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = stVar;
            this.h = new cw2(j);
            this.g = by2.b(new lg(i, j, stVar));
        }
        je jeVarA = a();
        fc0 fc0Var = this.g;
        jeVarA.k(fc0Var != null ? (Shader) fc0Var.getValue() : null);
        this.e = null;
        zm3.Q(this, f);
    }

    public final void d(long j) {
        hz hzVar = this.e;
        if ((hzVar == null ? false : ye3.a(hzVar.a, j)) || j == 16) {
            return;
        }
        this.e = new hz(j);
        setColor(xp1.T(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(kg0 kg0Var) {
        if (kg0Var == null || o51.f(this.i, kg0Var)) {
            return;
        }
        this.i = kg0Var;
        if (kg0Var.equals(en0.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(kg0Var instanceof t13)) {
            b81.d();
            return;
        }
        a().o(1);
        t13 t13Var = (t13) kg0Var;
        a().n(t13Var.a);
        je jeVarA = a();
        ((Paint) jeVarA.c).setStrokeMiter(t13Var.b);
        a().m(t13Var.d);
        a().l(t13Var.c);
        a().j(null);
    }

    public final void f(xt2 xt2Var) {
        if (xt2Var == null || o51.f(this.d, xt2Var)) {
            return;
        }
        this.d = xt2Var;
        if (xt2Var.equals(xt2.d)) {
            clearShadowLayer();
            return;
        }
        xt2 xt2Var2 = this.d;
        float f = xt2Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (xt2Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), xp1.T(this.d.a));
    }

    public final void g(p63 p63Var) {
        if (p63Var == null || o51.f(this.b, p63Var)) {
            return;
        }
        this.b = p63Var;
        int i = p63Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
