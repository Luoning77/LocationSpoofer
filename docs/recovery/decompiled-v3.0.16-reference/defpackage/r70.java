package defpackage;

import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class r70 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ t70 f;

    public /* synthetic */ r70(t70 t70Var, int i) {
        this.e = i;
        this.f = t70Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        t70 t70Var = this.f;
        switch (i) {
            case 0:
                xp1.K(t70Var);
                return mf3Var;
            case 1:
                t70Var.A.e(true);
                break;
            case 2:
                t70Var.A.a(true);
                break;
            case 3:
                t70Var.A.c();
                break;
            case 4:
                xp1.K(t70Var);
                return mf3Var;
            case Logger.WARN /* 5 */:
                t70Var.A.o();
                break;
            case Logger.ERROR /* 6 */:
                f70 f70Var = t70Var.w.w;
                f70Var.f.r.b(t70Var.B.e);
                break;
            default:
                me1 me1Var = t70Var.w;
                vp0 vp0Var = t70Var.C;
                if (me1Var.b()) {
                    ny2 ny2Var = me1Var.c;
                    if (ny2Var != null) {
                        ((nb0) ny2Var).b();
                    }
                } else {
                    vp0.a(vp0Var);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
