package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eg3 extends k33 implements pu0 {
    public final /* synthetic */ z92 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ au0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg3(z92 z92Var, long j, au0 au0Var, q60 q60Var) {
        super(2, q60Var);
        this.e = z92Var;
        this.f = j;
        this.g = au0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new eg3(this.e, this.f, this.g, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((eg3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ee0.J(obj);
        JobKt.ensureActive(getContext());
        if (((Number) ((w12) this.e.f).invoke()).longValue() != this.f) {
            z = false;
        } else {
            this.g.invoke();
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
