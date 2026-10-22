package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i90 extends k33 implements pu0 {
    public /* synthetic */ Object e;
    public final /* synthetic */ j90 f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(j90 j90Var, float f, q60 q60Var) {
        super(2, q60Var);
        this.f = j90Var;
        this.g = f;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        i90 i90Var = new i90(this.f, this.g, q60Var);
        i90Var.e = obj;
        return i90Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        i90 i90Var = (i90) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        i90Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.e;
        ee0.J(obj);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c90(this.f, this.g, null, 1), 3, null);
        return mf3.a;
    }
}
