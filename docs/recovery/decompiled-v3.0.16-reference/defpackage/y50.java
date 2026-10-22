package defpackage;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y50 extends k33 implements pu0 {
    public final /* synthetic */ int e = 0;
    public int f;
    public final /* synthetic */ long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(z82 z82Var, String str, long j, f93 f93Var, x73 x73Var, e12 e12Var, q60 q60Var) {
        super(2, q60Var);
        this.h = z82Var;
        this.i = str;
        this.g = j;
        this.j = f93Var;
        this.k = x73Var;
        this.l = e12Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                y50 y50Var = new y50((dg3) obj5, (a60) obj4, (ot) obj3, this.g, (Job) obj2, q60Var);
                y50Var.h = obj;
                return y50Var;
            default:
                return new y50((z82) this.h, (String) obj5, this.g, (f93) obj4, (x73) obj3, (e12) obj2, q60Var);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return ((y50) create((uo2) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((y50) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object objWithContext;
        int i = this.e;
        Object obj2 = this.j;
        z70 z70Var = z70.e;
        Object obj3 = this.k;
        Object obj4 = this.i;
        Object obj5 = this.l;
        mf3 mf3Var = mf3.a;
        q60 q60Var = null;
        switch (i) {
            case 0:
                ot otVar = (ot) obj3;
                a60 a60Var = (a60) obj2;
                dg3 dg3Var = (dg3) obj4;
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    uo2 uo2Var = (uo2) this.h;
                    dg3Var.e = a60Var.m1(otVar, this.g);
                    ji1 ji1Var = new ji1(a60Var, dg3Var, (Job) obj5, uo2Var);
                    a6 a6Var = new a6(a60Var, dg3Var, otVar, 5);
                    this.f = 1;
                    if (dg3Var.a(ji1Var, a6Var, this) == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            default:
                e12 e12Var = (e12) obj5;
                String str = (String) obj4;
                x73 x73Var = (x73) obj3;
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    z82 z82Var = (z82) this.h;
                    this.f = 1;
                    d92 d92Var = (d92) z82Var;
                    d92Var.getClass();
                    if (str.length() == 0) {
                        objWithContext = null;
                    } else {
                        long j = this.g;
                        if (f93.c(j)) {
                            objWithContext = null;
                        } else {
                            objWithContext = BuildersKt.withContext(d92Var.a, new t3(d92Var, new c92(j, null, d92Var, str), q60Var, 10), this);
                        }
                    }
                    if (objWithContext == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                    objWithContext = obj;
                    str = str;
                }
                f93 f93Var = (f93) objWithContext;
                if (f93Var != null) {
                    long j2 = f93Var.a;
                    long jA = g93.a(e12Var.n((int) (j2 >> 32)), e12Var.n((int) (j2 & 4294967295L)));
                    if (!f93.a(jA, (f93) obj2) && o51.f(x73Var.l().a.f, str) && e12Var == x73Var.b) {
                        x73Var.c.invoke(x73.b(x73Var.l().a, jA));
                        x73Var.w = new f93(jA);
                    }
                }
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y50(dg3 dg3Var, a60 a60Var, ot otVar, long j, Job job, q60 q60Var) {
        super(2, q60Var);
        this.i = dg3Var;
        this.j = a60Var;
        this.k = otVar;
        this.g = j;
        this.l = job;
    }
}
