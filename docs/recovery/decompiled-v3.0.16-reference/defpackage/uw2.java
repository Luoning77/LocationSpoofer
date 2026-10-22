package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class uw2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ex2 f;

    public /* synthetic */ uw2(ex2 ex2Var, int i) {
        this.e = i;
        this.f = ex2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) throws PendingIntent.CanceledException {
        int i;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        ex2 ex2Var = this.f;
        switch (i2) {
            case 0:
                p41 p41Var = (p41) obj;
                ex2Var.k.h((int) (p41Var.a >> 32));
                ex2Var.l.h((int) (p41Var.a & 4294967295L));
                return mf3Var;
            case 1:
                s52 s52Var = ex2Var.d;
                float fFloatValue = ((Float) obj).floatValue();
                fy fyVar = ex2Var.c;
                float fFloatValue2 = Float.valueOf(fyVar.e).floatValue();
                float f = fyVar.f;
                float fU = mh0.u(fFloatValue, fFloatValue2, Float.valueOf(f).floatValue());
                int i3 = ex2Var.a;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fU;
                    float f2 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float fE = gh0.E(Float.valueOf(fyVar.e).floatValue(), Float.valueOf(f).floatValue(), i4 / i);
                        float f3 = fE - fU;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = fE;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fU = f2;
                        }
                    }
                }
                if (fU != s52Var.g()) {
                    if (fU != s52Var.g()) {
                        lu0 lu0Var = ex2Var.e;
                        if (lu0Var != null) {
                            lu0Var.invoke(Float.valueOf(fU));
                        } else {
                            ex2Var.d(fU);
                        }
                    }
                    au0 au0Var = ex2Var.b;
                    if (au0Var != null) {
                        au0Var.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                ex2Var.b(0.0f);
                ex2Var.o.invoke();
                return mf3Var;
        }
    }
}
