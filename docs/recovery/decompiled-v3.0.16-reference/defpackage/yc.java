package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yc implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yc(Object obj, boolean z, int i) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        long j;
        float f;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                jg0 jg0Var = (jg0) obj;
                jg0Var.getClass();
                float fA = ((j90) obj2).a();
                if (z) {
                    j = hz.c;
                    f = 0.12f;
                } else {
                    j = hz.b;
                    f = 0.08f;
                }
                jg0.c0(jg0Var, hz.c(f, j), 0L, 0L, 1.0f - fA, null, 0, 118);
                jg0.c0(jg0Var, hz.c(fA * 0.03f, hz.b), 0L, 0L, 0.0f, null, 0, 126);
                return mf3Var;
            case 1:
                lu0 lu0Var = (lu0) obj2;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (z) {
                    lu0Var.invoke(bool);
                }
                return mf3Var;
            case 2:
                View view = (View) obj2;
                ((ed0) obj).getClass();
                view.setKeepScreenOn(z);
                return new h8(view, 11);
            default:
                ex2 ex2Var = (ex2) obj2;
                ss2 ss2Var = (ss2) obj;
                if (!z) {
                    x81[] x81VarArr = qs2.a;
                    ss2Var.a(os2.j, mf3Var);
                }
                String strValueOf = String.valueOf(xq1.P(ex2Var.d.g() * 100.0f) / 100.0f);
                x81[] x81VarArr2 = qs2.a;
                rs2 rs2Var = os2.b;
                x81 x81Var = qs2.a[0];
                ss2Var.a(rs2Var, strValueOf);
                ss2Var.a(ds2.i, new z0(null, new uw2(ex2Var, 1)));
                return mf3Var;
        }
    }

    public /* synthetic */ yc(boolean z, Object obj, int i) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }
}
