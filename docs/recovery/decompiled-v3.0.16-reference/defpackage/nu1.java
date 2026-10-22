package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class nu1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu1 f;

    public /* synthetic */ nu1(pu1 pu1Var, int i) {
        this.e = i;
        this.f = pu1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        pu1 pu1Var = this.f;
        switch (i) {
            case 0:
                pu0 pu0Var = (pu0) obj;
                pu0Var.getClass();
                return BuildersKt__Builders_commonKt.launch$default(pu1Var.a1(), null, null, pu0Var, 3, null);
            default:
                ow0 ow0Var = (ow0) obj;
                ow0Var.getClass();
                mu1 mu1Var = pu1Var.s;
                ow0Var.p((float) Math.rint(mu1Var.b));
                ow0Var.j((float) Math.rint(mu1Var.d));
                ow0Var.n(true);
                return mf3.a;
        }
    }
}
