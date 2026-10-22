package defpackage;

import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ex2 implements vf0 {
    public final int a;
    public au0 b;
    public final fy c;
    public final s52 d;
    public lu0 e;
    public final boolean f = true;
    public final float[] g;
    public final t52 h;
    public final t52 i;
    public boolean j;
    public final t52 k;
    public final t52 l;
    public final x32 m;
    public final w52 n;
    public final ol2 o;
    public final s52 p;
    public final s52 q;
    public final ga0 r;
    public final ry1 s;

    public ex2(float f, int i, au0 au0Var, fy fyVar) {
        float[] fArr;
        this.a = i;
        this.b = au0Var;
        this.c = fyVar;
        this.d = new s52(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.g = fArr;
        this.h = new t52(0);
        this.i = new t52(0);
        this.k = new t52(0);
        this.l = new t52(0);
        this.m = x32.f;
        this.n = ke0.H(Boolean.FALSE);
        this.o = new ol2(this, 8);
        fy fyVar2 = this.c;
        float fFloatValue = Float.valueOf(fyVar2.e).floatValue();
        float fFloatValue2 = Float.valueOf(fyVar2.f).floatValue() - fFloatValue;
        this.p = new s52(gh0.E(0.0f, 0.0f, mh0.u(fFloatValue2 == 0.0f ? 0.0f : (f - fFloatValue) / fFloatValue2, 0.0f, 1.0f)));
        this.q = new s52(0.0f);
        this.r = new ga0(this, 1);
        this.s = new ry1();
    }

    @Override // defpackage.vf0
    public final Object a(m mVar, jf0 jf0Var) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new wr1(this, mVar, null, 12), jf0Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }

    public final void b(float f) {
        float fMax;
        float fMin;
        if (this.m == x32.e) {
            float fG = this.i.g();
            t52 t52Var = this.l;
            fMax = Math.max(fG - (t52Var.g() / 2.0f), 0.0f);
            fMin = Math.min(t52Var.g() / 2.0f, fMax);
        } else {
            float fG2 = this.h.g();
            t52 t52Var2 = this.k;
            fMax = Math.max(fG2 - (t52Var2.g() / 2.0f), 0.0f);
            fMin = Math.min(t52Var2.g() / 2.0f, fMax);
        }
        s52 s52Var = this.p;
        float fG3 = s52Var.g() + f;
        s52 s52Var2 = this.q;
        s52Var.h(s52Var2.g() + fG3);
        s52Var2.h(0.0f);
        float fE = dx2.e(s52Var.g(), this.g, fMin, fMax);
        fy fyVar = this.c;
        float f2 = fMax - fMin;
        float fE2 = gh0.E(Float.valueOf(fyVar.e).floatValue(), Float.valueOf(fyVar.f).floatValue(), mh0.u(f2 == 0.0f ? 0.0f : (fE - fMin) / f2, 0.0f, 1.0f));
        if (fE2 == this.d.g()) {
            return;
        }
        lu0 lu0Var = this.e;
        if (lu0Var != null) {
            lu0Var.invoke(Float.valueOf(fE2));
        } else {
            d(fE2);
        }
    }

    public final float c() {
        fy fyVar = this.c;
        float f = fyVar.e;
        float fFloatValue = Float.valueOf(f).floatValue();
        float f2 = fyVar.f;
        float fFloatValue2 = Float.valueOf(f2).floatValue() - fFloatValue;
        return mh0.u(fFloatValue2 == 0.0f ? 0.0f : (mh0.u(this.d.g(), Float.valueOf(f).floatValue(), Float.valueOf(f2).floatValue()) - fFloatValue) / fFloatValue2, 0.0f, 1.0f);
    }

    public final void d(float f) {
        if (this.f) {
            fy fyVar = this.c;
            float f2 = fyVar.f;
            float f3 = fyVar.e;
            f = dx2.e(mh0.u(f, Float.valueOf(f3).floatValue(), Float.valueOf(f2).floatValue()), this.g, Float.valueOf(f3).floatValue(), Float.valueOf(f2).floatValue());
        }
        this.d.h(f);
    }
}
