package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lu1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ mu1 g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu1(mu1 mu1Var, float f, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = mu1Var;
        this.h = f;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        float f = this.h;
        mu1 mu1Var = this.g;
        switch (i) {
            case 0:
                return new lu1(mu1Var, f, q60Var, 0);
            default:
                return new lu1(mu1Var, f, q60Var, 1);
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
        return ((lu1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        final mu1 mu1Var = this.g;
        z70 z70Var = z70.e;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                vz2 vz2Var = mu1Var.j;
                float f = mu1Var.b;
                final int i4 = 0;
                lu0 lu0Var = new lu0() { // from class: ju1
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj2) {
                        int i5 = i4;
                        mf3 mf3Var2 = mf3.a;
                        mu1 mu1Var2 = mu1Var;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i5) {
                            case 0:
                                mu1Var2.g(fFloatValue);
                                break;
                            default:
                                mu1Var2.h(fFloatValue);
                                break;
                        }
                        return mf3Var2;
                    }
                };
                au0 au0Var = new au0() { // from class: ku1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i5 = i4;
                        mf3 mf3Var2 = mf3.a;
                        mu1 mu1Var2 = mu1Var;
                        switch (i5) {
                            case 0:
                                if (Math.abs(mu1Var2.b) <= 1.0f) {
                                    mu1Var2.g(0.0f);
                                    mu1Var2.f = 0.0f;
                                }
                                break;
                            default:
                                if (Math.abs(mu1Var2.d) <= 1.0f) {
                                    mu1Var2.h(0.0f);
                                    mu1Var2.g = 0.0f;
                                }
                                break;
                        }
                        return mf3Var2;
                    }
                };
                this.f = 1;
                return vd0.G(vz2Var, f, this.h, lu0Var, au0Var, this) == z70Var ? z70Var : mf3Var;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                vz2 vz2Var2 = mu1Var.k;
                float f2 = mu1Var.d;
                lu0 lu0Var2 = new lu0() { // from class: ju1
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj2) {
                        int i6 = i2;
                        mf3 mf3Var2 = mf3.a;
                        mu1 mu1Var2 = mu1Var;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i6) {
                            case 0:
                                mu1Var2.g(fFloatValue);
                                break;
                            default:
                                mu1Var2.h(fFloatValue);
                                break;
                        }
                        return mf3Var2;
                    }
                };
                au0 au0Var2 = new au0() { // from class: ku1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i6 = i2;
                        mf3 mf3Var2 = mf3.a;
                        mu1 mu1Var2 = mu1Var;
                        switch (i6) {
                            case 0:
                                if (Math.abs(mu1Var2.b) <= 1.0f) {
                                    mu1Var2.g(0.0f);
                                    mu1Var2.f = 0.0f;
                                }
                                break;
                            default:
                                if (Math.abs(mu1Var2.d) <= 1.0f) {
                                    mu1Var2.h(0.0f);
                                    mu1Var2.g = 0.0f;
                                }
                                break;
                        }
                        return mf3Var2;
                    }
                };
                this.f = 1;
                return vd0.G(vz2Var2, f2, this.h, lu0Var2, au0Var2, this) == z70Var ? z70Var : mf3Var;
        }
    }
}
