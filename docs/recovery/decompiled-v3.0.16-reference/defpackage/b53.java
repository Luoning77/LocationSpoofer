package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b53 extends vg2 implements pu0 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ tb2 h;
    public final /* synthetic */ lu0 i;
    public final /* synthetic */ lu0 j;
    public final /* synthetic */ qu0 k;
    public final /* synthetic */ lu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b53(CoroutineScope coroutineScope, tb2 tb2Var, lu0 lu0Var, lu0 lu0Var2, qu0 qu0Var, lu0 lu0Var3, q60 q60Var) {
        super(2, q60Var);
        this.g = coroutineScope;
        this.h = tb2Var;
        this.i = lu0Var;
        this.j = lu0Var2;
        this.k = qu0Var;
        this.l = lu0Var3;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        b53 b53Var = new b53(this.g, this.h, this.i, this.j, this.k, this.l, q60Var);
        b53Var.f = obj;
        return b53Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((b53) create((p33) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            p33 p33Var = (p33) this.f;
            this.e = 1;
            Object objH = g53.h(p33Var, this.g, this.h, this.i, this.j, this.k, this.l, this);
            z70 z70Var = z70.e;
            if (objH == z70Var) {
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
