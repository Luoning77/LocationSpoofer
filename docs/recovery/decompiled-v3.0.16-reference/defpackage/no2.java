package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class no2 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ po2 g;
    public /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no2(po2 po2Var, long j, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = po2Var;
        this.h = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new no2(this.g, this.h, q60Var, 0);
            case 1:
                return new no2(this.g, this.h, q60Var, 1);
            case 2:
                return new no2(this.g, this.h, q60Var, 2);
            default:
                no2 no2Var = new no2(this.g, q60Var);
                no2Var.h = ((c12) obj).a;
                return no2Var;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((no2) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 1:
                return ((no2) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            case 2:
                return ((no2) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                long j = ((c12) obj).a;
                no2 no2Var = new no2(this.g, (q60) obj2);
                no2Var.h = j;
                return no2Var.invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        po2 po2Var = this.g;
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
                wo2 wo2Var = po2Var.R;
                mo2 mo2Var = new mo2(this.h, null);
                this.f = 1;
                return wo2Var.f(jy1.f, mo2Var, this) == z70Var ? z70Var : mf3Var;
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
                wo2 wo2Var2 = po2Var.R;
                long j = this.h;
                this.f = 1;
                return wo2Var2.b(j, false, this) == z70Var ? z70Var : mf3Var;
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
                wo2 wo2Var3 = po2Var.R;
                long j2 = this.h;
                this.f = 1;
                return wo2Var3.b(j2, true, this) == z70Var ? z70Var : mf3Var;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ee0.J(obj);
                        return obj;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                long j3 = this.h;
                wo2 wo2Var4 = po2Var.R;
                this.f = 1;
                Object objB = jo2.b(wo2Var4, j3, this);
                return objB == z70Var ? z70Var : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no2(po2 po2Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 3;
        this.g = po2Var;
    }
}
