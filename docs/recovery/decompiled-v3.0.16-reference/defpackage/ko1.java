package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ko1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ lo1 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ double h;
    public final /* synthetic */ double i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko1(lo1 lo1Var, long j, double d, double d2, String str, String str2, String str3, String str4, String str5, q60 q60Var) {
        super(2, q60Var);
        this.f = lo1Var;
        this.g = j;
        this.h = d;
        this.i = d2;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new ko1(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ko1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            EnvironmentDao environmentDao = this.f.b;
            this.e = 1;
            Object objUpdateMetadata = environmentDao.updateMetadata(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this);
            z70 z70Var = z70.e;
            if (objUpdateMetadata == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return mf3.a;
    }
}
