package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p20 extends k33 implements pu0 {
    public final /* synthetic */ int e = 1;
    public int f;
    public /* synthetic */ float g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p20(oh ohVar, float f, q60 q60Var) {
        super(2, q60Var);
        this.h = ohVar;
        this.g = f;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                p20 p20Var = new p20((q20) obj2, q60Var);
                p20Var.g = ((Number) obj).floatValue();
                return p20Var;
            default:
                return new p20((oh) obj2, this.g, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((p20) create(Float.valueOf(((Number) obj).floatValue()), (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((p20) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        z70 z70Var = z70.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                q20 q20Var = (q20) obj2;
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    float f = this.g;
                    Object objG = q20Var.a.d.e.g(ds2.e);
                    pu0 pu0Var = (pu0) (objG != null ? objG : null);
                    if (pu0Var == null) {
                        throw az2.e("Required value was null.");
                    }
                    c12 c12Var = new c12((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
                    this.f = 1;
                    obj = pu0Var.invoke(c12Var, this);
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
                return new Float(Float.intBitsToFloat((int) (((c12) obj).a & 4294967295L)));
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    float fFloatValue = ((Number) ((oh) obj2).d()).floatValue();
                    float f2 = -this.g;
                    Float f3 = new Float(fFloatValue < 0.45f * f2 ? f2 : 0.0f);
                    yz2 yz2VarD = o51.D(0.8f, 450.0f, null, 4);
                    this.f = 1;
                    if (oh.a((oh) obj2, f3, yz2VarD, null, this, 12) == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p20(q20 q20Var, q60 q60Var) {
        super(2, q60Var);
        this.h = q20Var;
    }
}
