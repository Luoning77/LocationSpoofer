package defpackage;

import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class to2 extends k33 implements pu0 {
    public wo2 e;
    public ve2 f;
    public long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ wo2 j;
    public final /* synthetic */ ve2 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to2(wo2 wo2Var, ve2 ve2Var, long j, q60 q60Var) {
        super(2, q60Var);
        this.j = wo2Var;
        this.k = ve2Var;
        this.l = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        to2 to2Var = new to2(this.j, this.k, this.l, q60Var);
        to2Var.i = obj;
        return to2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((to2) create((uo2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        wo2 wo2Var;
        ve2 ve2Var;
        wo2 wo2Var2;
        long j;
        int i = this.h;
        x32 x32Var = x32.f;
        int i2 = 1;
        if (i == 0) {
            ee0.J(obj);
            uo2 uo2Var = (uo2) this.i;
            wo2Var = this.j;
            sd1 sd1Var = new sd1(i2, wo2Var, uo2Var);
            ka0 ka0Var = wo2Var.c;
            ve2Var = this.k;
            long j2 = ve2Var.e;
            x32 x32Var2 = wo2Var.d;
            long j3 = this.l;
            float fD = wo2Var.d(x32Var2 == x32Var ? yh3.b(j3) : yh3.c(j3));
            this.i = wo2Var;
            this.e = wo2Var;
            this.f = ve2Var;
            this.g = j2;
            this.h = 1;
            ka0Var.getClass();
            obj = BuildersKt.withContext(ka0Var.b, new ja0(fD, ka0Var, sd1Var, null), this);
            z70 z70Var = z70.e;
            if (obj == z70Var) {
                return z70Var;
            }
            wo2Var2 = wo2Var;
            j = j2;
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.g;
            ve2Var = this.f;
            wo2Var = this.e;
            wo2Var2 = (wo2) this.i;
            ee0.J(obj);
        }
        float fD2 = wo2Var2.d(((Number) obj).floatValue());
        ve2Var.e = wo2Var.d == x32Var ? yh3.a(fD2, 0.0f, 2, j) : yh3.a(0.0f, fD2, 1, j);
        return mf3.a;
    }
}
