package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class o10 extends m8 implements pu0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o10(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.l;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                p10 p10Var = (p10) obj3;
                p10Var.f(((Number) obj2).intValue(), (f30) obj);
                break;
            case 1:
                po2 po2Var = (po2) obj3;
                BuildersKt__Builders_commonKt.launch$default(po2Var.P.c(), null, null, new no2(po2Var, ((yh3) obj).a, null, 2), 3, null);
                break;
            default:
                po2 po2Var2 = (po2) obj3;
                BuildersKt__Builders_commonKt.launch$default(po2Var2.P.c(), null, null, new no2(po2Var2, ((yh3) obj).a, null, 1), 3, null);
                break;
        }
        return mf3Var;
    }
}
