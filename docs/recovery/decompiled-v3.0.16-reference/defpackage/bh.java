package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bh extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ eh g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(boolean z, eh ehVar, long j, q60 q60Var) {
        super(2, q60Var);
        this.f = z;
        this.g = ehVar;
        this.h = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new bh(this.f, this.g, this.h, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((bh) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            dz1 dz1Var = this.g.e;
            z70 z70Var = z70.e;
            if (this.f) {
                this.e = 2;
                Object objA = dz1Var.a(this.h, 0L, this);
                if (objA != z70Var) {
                    obj = objA;
                    long j = ((yh3) obj).a;
                }
            } else {
                this.e = 1;
                Object objA2 = dz1Var.a(0L, this.h, this);
                if (objA2 != z70Var) {
                    obj = objA2;
                    long j2 = ((yh3) obj).a;
                }
            }
            return z70Var;
        }
        if (i == 1) {
            ee0.J(obj);
            long j3 = ((yh3) obj).a;
        } else {
            if (i != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            long j4 = ((yh3) obj).a;
        }
        return mf3.a;
    }
}
