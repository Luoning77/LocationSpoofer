package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x41 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ z41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x41(z41 z41Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = z41Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        z41 z41Var = this.g;
        switch (i) {
            case 0:
                return new x41(z41Var, q60Var, 0);
            case 1:
                return new x41(z41Var, q60Var, 1);
            case 2:
                return new x41(z41Var, q60Var, 2);
            case 3:
                return new x41(z41Var, q60Var, 3);
            case 4:
                return new x41(z41Var, q60Var, 4);
            default:
                return new x41(z41Var, q60Var, 5);
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
        }
        return ((x41) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        z41 z41Var = this.g;
        z70 z70Var = z70.e;
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
                oh ohVar = z41Var.e;
                Float f = new Float(1.0f);
                yz2 yz2Var = z41Var.c;
                this.f = 1;
                return oh.a(ohVar, f, yz2Var, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 1:
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
                oh ohVar2 = z41Var.f;
                c12 c12Var = new c12(z41Var.g);
                this.f = 1;
                return ohVar2.e(c12Var, this) == z70Var ? z70Var : mf3Var;
            case 2:
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
                oh ohVar3 = z41Var.e;
                Float f2 = new Float(0.0f);
                yz2 yz2Var2 = z41Var.c;
                this.f = 1;
                return oh.a(ohVar3, f2, yz2Var2, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 3:
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
                oh ohVar4 = z41Var.f;
                c12 c12Var2 = new c12(z41Var.g);
                yz2 yz2Var3 = z41Var.d;
                this.f = 1;
                return oh.a(ohVar4, c12Var2, yz2Var3, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 4:
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
                oh ohVar5 = z41Var.e;
                Float f3 = new Float(0.0f);
                yz2 yz2Var4 = z41Var.c;
                this.f = 1;
                return oh.a(ohVar5, f3, yz2Var4, null, this, 12) == z70Var ? z70Var : mf3Var;
            default:
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
                oh ohVar6 = z41Var.f;
                c12 c12Var3 = new c12(z41Var.g);
                yz2 yz2Var5 = z41Var.d;
                this.f = 1;
                return oh.a(ohVar6, c12Var3, yz2Var5, null, this, 12) == z70Var ? z70Var : mf3Var;
        }
    }
}
