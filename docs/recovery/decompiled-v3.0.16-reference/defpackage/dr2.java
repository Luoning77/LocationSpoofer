package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dr2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xb0 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ dr2(xb0 xb0Var, ey1 ey1Var, int i) {
        this.e = i;
        this.f = xb0Var;
        this.g = ey1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        q82 q82Var = u82.a;
        s82 s82Var = s82.a;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        xb0 xb0Var = this.f;
        switch (i) {
            case 0:
                m4 m4Var = new m4(12, (au0) obj);
                dr2 dr2Var = new dr2(xb0Var, ey1Var, 1);
                if (!sk1.a()) {
                    b81.s("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    q82Var = s82Var;
                }
                return sk1.b(m4Var, dr2Var, q82Var);
            case 1:
                xd0 xd0Var = (xd0) obj;
                int iN0 = xb0Var.n0(xd0.b(xd0Var.a));
                ey1Var.setValue(new p41((((long) xb0Var.n0(xd0.a(xd0Var.a))) & 4294967295L) | (((long) iN0) << 32)));
                return mf3Var;
            case 2:
                m4 m4Var2 = new m4(20, (au0) obj);
                dr2 dr2Var2 = new dr2(xb0Var, ey1Var, 3);
                if (!sk1.a()) {
                    b81.s("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    q82Var = s82Var;
                }
                return sk1.b(m4Var2, dr2Var2, q82Var);
            default:
                xd0 xd0Var2 = (xd0) obj;
                int iN1 = xb0Var.n0(xd0.b(xd0Var2.a));
                ey1Var.setValue(new p41((((long) xb0Var.n0(xd0.a(xd0Var2.a))) & 4294967295L) | (((long) iN1) << 32)));
                return mf3Var;
        }
    }
}
