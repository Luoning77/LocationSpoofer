package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class om1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ double g;
    public final /* synthetic */ double h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om1(ul1 ul1Var, double d, double d2, q60 q60Var) {
        super(2, q60Var);
        this.f = ul1Var;
        this.g = d;
        this.h = d2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new om1(this.f, this.g, this.h, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((om1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        om1 om1Var;
        int i = this.e;
        q60 q60Var = null;
        if (i == 0) {
            ee0.J(obj);
            this.e = 1;
            om1Var = this;
            Object objB = rm1.b(this.f, this.g, this.h, om1Var);
            z70 z70Var = z70.e;
            if (objB == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            om1Var = this;
        }
        ul1 ul1Var = om1Var.f;
        return BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new sl1(ul1Var, q60Var, 2), 2, null);
    }
}
