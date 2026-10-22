package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vo2 extends k33 implements pu0 {
    public long e;
    public int f;
    public /* synthetic */ long g;
    public final /* synthetic */ wo2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo2(wo2 wo2Var, q60 q60Var) {
        super(2, q60Var);
        this.h = wo2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        vo2 vo2Var = new vo2(this.h, q60Var);
        vo2Var.g = ((yh3) obj).a;
        return vo2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        long j = ((yh3) obj).a;
        vo2 vo2Var = new vo2(this.h, (q60) obj2);
        vo2Var.g = j;
        return vo2Var.invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.f;
        wo2 wo2Var = this.h;
        z70 z70Var = z70.e;
        if (i == 0) {
            ee0.J(obj);
            j = this.g;
            dz1 dz1Var = wo2Var.f;
            this.g = j;
            this.f = 1;
            obj = dz1Var.b(j, this);
            if (obj != z70Var) {
            }
            return z70Var;
        }
        if (i == 1) {
            j = this.g;
            ee0.J(obj);
        } else {
            if (i == 2) {
                j2 = this.e;
                j = this.g;
                ee0.J(obj);
                j3 = ((yh3) obj).a;
                dz1 dz1Var2 = wo2Var.f;
                long jD = yh3.d(j2, j3);
                this.g = j;
                this.e = j3;
                this.f = 3;
                obj = dz1Var2.a(jD, j3, this);
                if (obj != z70Var) {
                    j4 = j;
                    j5 = j3;
                }
                return z70Var;
            }
            if (i != 3) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.e;
            j4 = this.g;
            ee0.J(obj);
        }
        return new yh3(yh3.d(j4, yh3.d(j5, ((yh3) obj).a)));
        long jD2 = yh3.d(j, ((yh3) obj).a);
        this.g = j;
        this.e = jD2;
        this.f = 2;
        obj = wo2Var.a(jD2, this);
        if (obj != z70Var) {
            j2 = jD2;
            j3 = ((yh3) obj).a;
            dz1 dz1Var3 = wo2Var.f;
            long jD3 = yh3.d(j2, j3);
            this.g = j;
            this.e = j3;
            this.f = 3;
            obj = dz1Var3.a(jD3, j3, this);
            if (obj != z70Var) {
                j4 = j;
                j5 = j3;
                return new yh3(yh3.d(j4, yh3.d(j5, ((yh3) obj).a)));
            }
        }
        return z70Var;
    }
}
