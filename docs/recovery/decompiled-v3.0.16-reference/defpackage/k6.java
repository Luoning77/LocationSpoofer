package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k6 extends k33 implements lu0 {
    public int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, String str, String str2, String str3, boolean z, q60 q60Var) {
        super(1, q60Var);
        this.f = l6Var;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new k6(this.f, this.g, this.h, this.i, this.j, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        return ((k6) create((q60) obj)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Exception {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            CloudRepository cloudRepository = this.f.b;
            this.e = 1;
            Object objSignIn = cloudRepository.signIn(this.g, this.h, this.i, this.j, this);
            z70 z70Var = z70.e;
            if (objSignIn == z70Var) {
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
