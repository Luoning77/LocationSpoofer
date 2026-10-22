package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oo2 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo2(Object obj, float f, float f2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.i = obj;
        this.g = f;
        this.h = f2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new oo2((po2) obj2, this.g, this.h, q60Var, 0);
            default:
                return new oo2((oh) obj2, this.g, this.h, q60Var, 1);
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
        return ((oo2) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        float fAbs;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        float f = this.h;
        Object obj2 = this.i;
        float f2 = this.g;
        switch (i) {
            case 0:
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
                wo2 wo2Var = ((po2) obj2).R;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                this.f = 1;
                return jo2.b(wo2Var, jFloatToRawIntBits, this) == z70Var ? z70Var : mf3Var;
            default:
                oh ohVar = (oh) obj2;
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
                float fFloatValue = ((Number) ohVar.d()).floatValue();
                if (f2 < 0.0f) {
                    if (fFloatValue < (-f)) {
                        fAbs = ((1.0f / (((Math.abs(fFloatValue) - f) / 60.0f) + 1.0f)) * f2) + fFloatValue;
                    } else {
                        fAbs = fFloatValue + f2;
                    }
                } else if (fFloatValue > 0.0f) {
                    fAbs = (f2 * 0.15f) + fFloatValue;
                } else {
                    fAbs = fFloatValue + f2;
                }
                float f3 = (-f) * 1.35f;
                if (fAbs < f3) {
                    fAbs = f3;
                }
                Float f4 = new Float(fAbs);
                this.f = 1;
                return ohVar.e(f4, this) == z70Var ? z70Var : mf3Var;
        }
    }
}
