package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class so0 extends k33 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(lu0 lu0Var, boolean z, q60 q60Var) {
        super(2, q60Var);
        this.g = lu0Var;
        this.f = z;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        boolean z = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new so0(z, (ey1) obj2, q60Var);
            default:
                return new so0((lu0) obj2, z, q60Var);
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
                ((so0) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((so0) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        boolean z = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ee0.J(obj);
                if (!z) {
                    j52 j52Var = wo0.a;
                    ((ey1) obj2).setValue(new c12(0L));
                }
                break;
            default:
                ee0.J(obj);
                ((lu0) obj2).invoke(Boolean.valueOf(z));
                break;
        }
        return mf3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(boolean z, ey1 ey1Var, q60 q60Var) {
        super(2, q60Var);
        this.f = z;
        this.g = ey1Var;
    }
}
