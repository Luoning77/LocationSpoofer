package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kd extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ j90 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(j90 j90Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = j90Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        j90 j90Var = this.g;
        switch (i) {
            case 0:
                return new kd(j90Var, q60Var, 0);
            case 1:
                return new kd(j90Var, q60Var, 1);
            case 2:
                return new kd(j90Var, q60Var, 2);
            case 3:
                return new kd(j90Var, q60Var, 3);
            case 4:
                return new kd(j90Var, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new kd(j90Var, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new kd(j90Var, q60Var, 6);
            default:
                return new kd(j90Var, q60Var, 7);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case Logger.WARN /* 5 */:
                break;
            case Logger.ERROR /* 6 */:
                break;
        }
        return ((kd) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        j90 j90Var = this.g;
        q60 q60Var = null;
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
                int i3 = 2;
                Flow flowI = ee0.I(new zc(j90Var, i3));
                jd jdVar = new jd(i3, q60Var, 0);
                this.f = 1;
                return FlowKt.collectLatest(flowI, jdVar, this) == z70Var ? z70Var : mf3Var;
            case 1:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                oh ohVar = j90Var.m;
                Float f = new Float(0.0f);
                yz2 yz2Var = j90Var.h;
                this.f = 1;
                return oh.a(ohVar, f, yz2Var, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 2:
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
                oh ohVar2 = j90Var.n;
                Float f2 = new Float(1.0f);
                yz2 yz2Var2 = j90Var.i;
                this.f = 1;
                return oh.a(ohVar2, f2, yz2Var2, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 3:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                oh ohVar3 = j90Var.o;
                Float f3 = new Float(1.3928572f);
                yz2 yz2Var3 = j90Var.j;
                this.f = 1;
                return oh.a(ohVar3, f3, yz2Var3, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 4:
                int i7 = this.f;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                oh ohVar4 = j90Var.p;
                Float f4 = new Float(1.3928572f);
                yz2 yz2Var4 = j90Var.k;
                this.f = 1;
                return oh.a(ohVar4, f4, yz2Var4, null, this, 12) == z70Var ? z70Var : mf3Var;
            case Logger.WARN /* 5 */:
                int i8 = this.f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                oh ohVar5 = j90Var.n;
                Float f5 = new Float(0.0f);
                yz2 yz2Var5 = j90Var.i;
                this.f = 1;
                return oh.a(ohVar5, f5, yz2Var5, null, this, 12) == z70Var ? z70Var : mf3Var;
            case Logger.ERROR /* 6 */:
                int i9 = this.f;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                oh ohVar6 = j90Var.o;
                Float f6 = new Float(1.0f);
                yz2 yz2Var6 = j90Var.j;
                this.f = 1;
                return oh.a(ohVar6, f6, yz2Var6, null, this, 12) == z70Var ? z70Var : mf3Var;
            default:
                int i10 = this.f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                oh ohVar7 = j90Var.p;
                Float f7 = new Float(1.0f);
                yz2 yz2Var7 = j90Var.k;
                this.f = 1;
                return oh.a(ohVar7, f7, yz2Var7, null, this, 12) == z70Var ? z70Var : mf3Var;
        }
    }
}
