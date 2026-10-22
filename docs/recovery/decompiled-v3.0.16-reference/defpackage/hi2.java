package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hi2 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ ii2 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi2(ii2 ii2Var, boolean z, String[] strArr, q60 q60Var) {
        super(2, q60Var);
        this.f = ii2Var;
        this.g = z;
        this.h = strArr;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new hi2(this.f, this.g, this.h, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((hi2) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            ii2 ii2Var = this.f;
            bi2 bi2Var = ii2Var.connectionManager;
            if (bi2Var == null) {
                o51.F("connectionManager");
                throw null;
            }
            gi2 gi2Var = new gi2(0, null, ii2Var, this.h, this.g);
            this.e = 1;
            Object objZ = bi2Var.f.z(false, gi2Var, this);
            z70 z70Var = z70.e;
            if (objZ == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return mf3.a;
    }
}
