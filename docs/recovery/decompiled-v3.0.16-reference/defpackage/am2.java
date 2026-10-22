package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class am2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ List f;
    public final /* synthetic */ au0 g;
    public final /* synthetic */ lu0 h;
    public final /* synthetic */ lu0 i;

    public /* synthetic */ am2(List list, au0 au0Var, lu0 lu0Var, lu0 lu0Var2, int i) {
        this.f = list;
        this.g = au0Var;
        this.h = lu0Var;
        this.i = lu0Var2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    sb.C(zm3.F(iw2.e(av1.a, 0.92f), 0.0f, 20.0f, 1), cj2.a(24.0f), ym3.t(((kz) ov0Var.j(mz.a)).p, 0L, ov0Var, 0, 14), ym3.u(62, 10.0f), sb.a0(435772854, new oc1(this.f, this.h, this.i, this.g, 4), ov0Var), ov0Var, 196614, 16);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                dh0.c(this.f, this.g, this.h, this.i, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ am2(List list, lu0 lu0Var, lu0 lu0Var2, au0 au0Var) {
        this.f = list;
        this.h = lu0Var;
        this.i = lu0Var2;
        this.g = au0Var;
    }
}
