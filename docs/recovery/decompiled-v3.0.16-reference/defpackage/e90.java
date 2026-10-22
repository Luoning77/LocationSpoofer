package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e90 extends k33 implements pu0 {
    public final /* synthetic */ int e = 1;
    public int f;
    public float g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(ax axVar, float f, si siVar, q60 q60Var) {
        super(2, q60Var);
        this.h = axVar;
        this.g = f;
        this.i = siVar;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                e90 e90Var = new e90((j90) obj2, this.g, q60Var);
                e90Var.h = obj;
                return e90Var;
            case 1:
                return new e90((ax) this.h, this.g, (si) obj2, q60Var);
            default:
                e90 e90Var2 = new e90((mc3) obj2, q60Var);
                e90Var2.h = obj;
                return e90Var2;
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
        return ((e90) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        final float fA;
        CoroutineScope coroutineScope;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.i;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.h;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                j90 j90Var = (j90) obj2;
                ry1 ry1Var = j90Var.q;
                d90 d90Var = new d90(j90Var, this.g, coroutineScope2, null);
                this.h = null;
                this.f = 1;
                return ry1.a(ry1Var, d90Var, this) == z70Var ? z70Var : mf3Var;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    return oh.a((oh) ((ax) this.h).c, new Float(this.g), (si) obj2, null, this, 12) == z70Var ? z70Var : mf3Var;
                }
                if (i3 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ee0.J(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.h;
                    fA = gh0.A(coroutineScope3.getCoroutineContext());
                    coroutineScope = coroutineScope3;
                } else {
                    if (i4 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fA = this.g;
                    coroutineScope = (CoroutineScope) this.h;
                    ee0.J(obj);
                }
                while (CoroutineScopeKt.isActive(coroutineScope)) {
                    final mc3 mc3Var = (mc3) obj2;
                    lu0 lu0Var = new lu0() { // from class: lc3
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            mc3 mc3Var2 = mc3Var;
                            boolean zG = mc3Var2.g();
                            u52 u52Var = mc3Var2.g;
                            if (!zG) {
                                if (u52Var.g() == Long.MIN_VALUE) {
                                    u52Var.h(jLongValue);
                                    mc3Var2.a.a.setValue(Boolean.TRUE);
                                }
                                long jG = jLongValue - u52Var.g();
                                float f = fA;
                                if (f != 0.0f) {
                                    jG = xq1.Q(jG / ((double) f));
                                }
                                if (mc3Var2.b == null) {
                                    mc3Var2.f.h(jG);
                                }
                                mc3Var2.h(jG, f == 0.0f);
                            }
                            return mf3.a;
                        }
                    };
                    this.h = coroutineScope;
                    this.g = fA;
                    this.f = 1;
                    if (mh0.K(getContext()).a(lu0Var, this) == z70Var) {
                        return z70Var;
                    }
                }
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(j90 j90Var, float f, q60 q60Var) {
        super(2, q60Var);
        this.i = j90Var;
        this.g = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(mc3 mc3Var, q60 q60Var) {
        super(2, q60Var);
        this.i = mc3Var;
    }
}
