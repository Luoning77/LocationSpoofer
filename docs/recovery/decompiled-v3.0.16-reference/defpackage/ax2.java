package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ax2 extends k33 implements qu0 {
    public final /* synthetic */ ex2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax2(ex2 ex2Var, q60 q60Var) {
        super(3, q60Var);
        this.e = ex2Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) throws PendingIntent.CanceledException {
        ((Number) obj2).floatValue();
        ax2 ax2Var = new ax2(this.e, (q60) obj3);
        mf3 mf3Var = mf3.a;
        ax2Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws PendingIntent.CanceledException {
        ee0.J(obj);
        this.e.o.invoke();
        return mf3.a;
    }
}
