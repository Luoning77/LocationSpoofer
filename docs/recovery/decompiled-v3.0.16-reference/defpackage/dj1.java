package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dj1 extends vg2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public x92 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(lu0 lu0Var, ey1 ey1Var, ey1 ey1Var2, q60 q60Var) {
        super(2, q60Var);
        this.k = lu0Var;
        this.i = ey1Var;
        this.j = ey1Var2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                dj1 dj1Var = new dj1((lu0) this.k, this.i, this.j, q60Var);
                dj1Var.h = obj;
                return dj1Var;
            default:
                dj1 dj1Var2 = new dj1(this.i, this.j, (ey1) this.k, q60Var);
                dj1Var2.h = obj;
                return dj1Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        p33 p33Var = (p33) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((dj1) create(p33Var, q60Var)).invokeSuspend(mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        x92 x92Var;
        x92 x92Var2;
        long j;
        x92 x92Var3;
        x92 x92Var4;
        long j2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.k;
        ey1 ey1Var = this.j;
        ey1 ey1Var2 = this.i;
        q92 q92Var = q92.f;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                p33 p33Var = (p33) this.h;
                int i2 = this.g;
                if (i2 == 0) {
                    ee0.J(obj);
                    this.h = p33Var;
                    this.g = 1;
                    obj = g53.b(p33Var, this, 2);
                    if (obj != z70Var) {
                    }
                    return z70Var;
                }
                if (i2 == 1) {
                    ee0.J(obj);
                } else {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x92Var = this.f;
                    ee0.J(obj);
                }
                x92Var2 = (x92) obj;
                if (x92Var2 != null) {
                    return mf3Var;
                }
                j = x92Var2.c;
                if (c12.c(c12.d(j, x92Var.c)) < p33Var.s().d() || ((pe2) ey1Var2.getValue()).a(j) || ((pe2) ey1Var.getValue()).a(j)) {
                    return mf3Var;
                }
                ((lu0) obj2).invoke(gz2.a);
                return mf3Var;
                x92 x92Var5 = (x92) obj;
                this.h = p33Var;
                this.f = x92Var5;
                this.g = 2;
                Object objJ = g53.j(p33Var, q92Var, this);
                if (objJ != z70Var) {
                    obj = objJ;
                    x92Var = x92Var5;
                    x92Var2 = (x92) obj;
                    if (x92Var2 != null) {
                        return mf3Var;
                    }
                    j = x92Var2.c;
                    return c12.c(c12.d(j, x92Var.c)) < p33Var.s().d() ? mf3Var : mf3Var;
                }
                return z70Var;
            default:
                p33 p33Var2 = (p33) this.h;
                int i3 = this.g;
                if (i3 == 0) {
                    ee0.J(obj);
                    this.h = p33Var2;
                    this.g = 1;
                    obj = g53.b(p33Var2, this, 2);
                    if (obj != z70Var) {
                    }
                    return z70Var;
                }
                if (i3 == 1) {
                    ee0.J(obj);
                } else {
                    if (i3 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x92Var3 = this.f;
                    ee0.J(obj);
                }
                x92Var4 = (x92) obj;
                if (x92Var4 != null) {
                    return mf3Var;
                }
                j2 = x92Var4.c;
                if (c12.c(c12.d(j2, x92Var3.c)) < p33Var2.s().d() || ((pe2) ey1Var2.getValue()).a(j2) || ((pe2) ey1Var.getValue()).a(j2)) {
                    return mf3Var;
                }
                gk2.b((ey1) obj2, false);
                return mf3Var;
                x92 x92Var6 = (x92) obj;
                this.h = p33Var2;
                this.f = x92Var6;
                this.g = 2;
                Object objJ2 = g53.j(p33Var2, q92Var, this);
                if (objJ2 != z70Var) {
                    obj = objJ2;
                    x92Var3 = x92Var6;
                    x92Var4 = (x92) obj;
                    if (x92Var4 != null) {
                        return mf3Var;
                    }
                    j2 = x92Var4.c;
                    return c12.c(c12.d(j2, x92Var3.c)) < p33Var2.s().d() ? mf3Var : mf3Var;
                }
                return z70Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.i = ey1Var;
        this.j = ey1Var2;
        this.k = ey1Var3;
    }
}
