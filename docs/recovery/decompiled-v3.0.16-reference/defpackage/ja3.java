package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ja3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ka3 g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja3(ka3 ka3Var, float f, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ka3Var;
        this.h = f;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        float f = this.h;
        ka3 ka3Var = this.g;
        switch (i) {
            case 0:
                return new ja3(ka3Var, f, q60Var, 0);
            default:
                return new ja3(ka3Var, f, q60Var, 1);
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
        return ((ja3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        float f = this.h;
        z70 z70Var = z70.e;
        ka3 ka3Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    oh ohVar = ka3Var.x;
                    if (ohVar == null) {
                        return mf3Var;
                    }
                    Float f2 = new Float(f);
                    si siVar = ka3Var.v ? b43.f : ka3Var.u;
                    this.f = 1;
                    obj = oh.a(ohVar, f2, siVar, null, this, 12);
                    if (obj == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    oh ohVar2 = ka3Var.w;
                    if (ohVar2 == null) {
                        return mf3Var;
                    }
                    Float f3 = new Float(f);
                    si siVar2 = ka3Var.v ? b43.f : ka3Var.u;
                    this.f = 1;
                    obj = oh.a(ohVar2, f3, siVar2, null, this, 12);
                    if (obj == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
        }
    }
}
