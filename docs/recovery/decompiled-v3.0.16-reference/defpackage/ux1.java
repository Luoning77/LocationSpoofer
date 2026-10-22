package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ux1 extends vg2 implements pu0 {
    public vv0 e;
    public vx1 f;
    public long[] g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vx1 k;
    public final /* synthetic */ vv0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux1(vx1 vx1Var, vv0 vv0Var, q60 q60Var) {
        super(2, q60Var);
        this.k = vx1Var;
        this.l = vv0Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        ux1 ux1Var = new ux1(this.k, this.l, q60Var);
        ux1Var.j = obj;
        return ux1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ux1) create((ws2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ws2 ws2Var;
        vx1 vx1Var;
        long[] jArr;
        int i;
        vv0 vv0Var;
        int i2 = this.i;
        if (i2 == 0) {
            ee0.J(obj);
            ws2Var = (ws2) this.j;
            vx1Var = this.k;
            tx1 tx1Var = vx1Var.f;
            jArr = tx1Var.c;
            i = tx1Var.e;
            vv0Var = this.l;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.h;
            jArr = this.g;
            vx1Var = this.f;
            vv0Var = this.e;
            ws2Var = (ws2) this.j;
            ee0.J(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return mf3.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        vv0Var.f = i;
        Object obj2 = vx1Var.f.b[i];
        this.j = ws2Var;
        this.e = vv0Var;
        this.f = vx1Var;
        this.g = jArr;
        this.h = i3;
        this.i = 1;
        ws2Var.a(obj2, this);
        return z70.e;
    }
}
