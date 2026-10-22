package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z80 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ ii2 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ lu0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(q60 q60Var, lu0 lu0Var, ii2 ii2Var, boolean z, boolean z2) {
        super(2, q60Var);
        this.f = ii2Var;
        this.g = z;
        this.h = z2;
        this.i = lu0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new z80(q60Var, this.i, this.f, this.g, this.h);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((z80) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                ee0.J(obj);
                return obj;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        lu0 lu0Var = this.i;
        ii2 ii2Var = this.f;
        boolean z = this.h;
        boolean z2 = this.g;
        b90 b90Var = new b90(null, lu0Var, ii2Var, z, z2);
        this.e = 1;
        Object objUseConnection = ii2Var.useConnection(z2, b90Var, this);
        z70 z70Var = z70.e;
        return objUseConnection == z70Var ? z70Var : objUseConnection;
    }
}
