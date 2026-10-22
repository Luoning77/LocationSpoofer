package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vi2 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ wi2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi2(wi2 wi2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = wi2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new vi2(this.f, q60Var, 0);
            default:
                return new vi2(this.f, q60Var, 1);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((vi2) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        wi2 wi2Var = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                wi2Var.getClass();
                return Boolean.valueOf(!wi2.a("appops set com.vincenthzr.locationspoofer android:mock_location allow", null).equals("ERROR"));
            default:
                ee0.J(obj);
                wi2Var.getClass();
                return Boolean.valueOf(!wi2.a("appops set com.vincenthzr.locationspoofer android:mock_location default", null).equals("ERROR"));
        }
    }
}
