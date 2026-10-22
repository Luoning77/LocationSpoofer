package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n70 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ca2 g;
    public final /* synthetic */ s63 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n70(ca2 ca2Var, s63 s63Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ca2Var;
        this.h = s63Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new n70(this.g, this.h, q60Var, 0);
            case 1:
                return new n70(this.g, this.h, q60Var, 1);
            default:
                return new n70(this.g, this.h, q60Var, 2);
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
            case 1:
                break;
        }
        return ((n70) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        ca2 ca2Var = this.g;
        final s63 s63Var = this.h;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = null;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    if (vd0.n(ca2Var, s63Var, this) == z70Var) {
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
            case 1:
                int i4 = this.f;
                if (i4 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    Object objL = mh0.l(ca2Var, new nr0(s63Var, q60Var, i2), this);
                    if (objL != z70Var) {
                        objL = mf3Var;
                    }
                    if (objL == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i4 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    final int i6 = 0;
                    Object objG = df0.g(this.g, new tj1(s63Var, 0), new au0() { // from class: uj1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i7 = i6;
                            mf3 mf3Var2 = mf3.a;
                            s63 s63Var2 = s63Var;
                            switch (i7) {
                                case 0:
                                    s63Var2.b();
                                    break;
                                default:
                                    s63Var2.onCancel();
                                    break;
                            }
                            return mf3Var2;
                        }
                    }, new au0() { // from class: uj1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i7 = i2;
                            mf3 mf3Var2 = mf3.a;
                            s63 s63Var2 = s63Var;
                            switch (i7) {
                                case 0:
                                    s63Var2.b();
                                    break;
                                default:
                                    s63Var2.onCancel();
                                    break;
                            }
                            return mf3Var2;
                        }
                    }, new s5(s63Var, 12), this);
                    if (objG != z70Var) {
                        objG = mf3Var;
                    }
                    if (objG == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i5 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
        }
    }
}
