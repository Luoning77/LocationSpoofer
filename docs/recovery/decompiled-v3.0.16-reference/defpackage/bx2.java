package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bx2 implements lu0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ fy g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;
    public final /* synthetic */ au0 k;

    public bx2(boolean z, lu0 lu0Var, fy fyVar, int i, boolean z2, float f, au0 au0Var) {
        this.e = z;
        this.f = lu0Var;
        this.g = fyVar;
        this.h = i;
        this.i = z2;
        this.j = f;
        this.k = au0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((e91) obj).a;
        fy fyVar = this.g;
        float f = fyVar.e;
        float f2 = fyVar.f;
        if (!this.e) {
            return Boolean.FALSE;
        }
        lu0 lu0Var = this.f;
        if (lu0Var == null) {
            return Boolean.FALSE;
        }
        int iL = mh0.L(keyEvent);
        boolean z = false;
        if (iL == 2) {
            float fAbs = Math.abs(Float.valueOf(f2).floatValue() - Float.valueOf(f).floatValue());
            int i = this.h;
            int i2 = i > 0 ? i + 1 : 100;
            float f3 = fAbs / i2;
            int i3 = this.i ? -1 : 1;
            long jE = hd0.e(keyEvent.getKeyCode());
            boolean zA = c91.a(jE, c91.d);
            float f4 = this.j;
            if (zA) {
                lu0Var.invoke(mh0.x(Float.valueOf((i3 * f3) + f4), fyVar));
            } else if (c91.a(jE, c91.e)) {
                lu0Var.invoke(mh0.x(Float.valueOf(f4 - (i3 * f3)), fyVar));
            } else if (c91.a(jE, c91.g)) {
                lu0Var.invoke(mh0.x(Float.valueOf((i3 * f3) + f4), fyVar));
            } else if (c91.a(jE, c91.f)) {
                lu0Var.invoke(mh0.x(Float.valueOf(f4 - (i3 * f3)), fyVar));
            } else if (c91.a(jE, c91.v)) {
                lu0Var.invoke(Float.valueOf(f));
            } else if (c91.a(jE, c91.w)) {
                lu0Var.invoke(Float.valueOf(f2));
            } else if (c91.a(jE, c91.C)) {
                lu0Var.invoke(mh0.x(Float.valueOf(f4 - (mh0.v(i2 / 10, 1, 10) * f3)), fyVar));
            } else if (c91.a(jE, c91.D)) {
                lu0Var.invoke(mh0.x(Float.valueOf((mh0.v(i2 / 10, 1, 10) * f3) + f4), fyVar));
            }
            z = true;
        } else if (iL == 1) {
            long jE2 = hd0.e(keyEvent.getKeyCode());
            if (c91.a(jE2, c91.d) || c91.a(jE2, c91.e) || c91.a(jE2, c91.g) || c91.a(jE2, c91.f) || c91.a(jE2, c91.v) || c91.a(jE2, c91.w) || c91.a(jE2, c91.C) || c91.a(jE2, c91.D)) {
                au0 au0Var = this.k;
                if (au0Var != null) {
                    au0Var.invoke();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
