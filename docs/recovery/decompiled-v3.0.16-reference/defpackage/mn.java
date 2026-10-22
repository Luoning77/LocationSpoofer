package defpackage;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mn extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn(int i, q60 q60Var, Object obj, Object obj2, boolean z) {
        super(2, q60Var);
        this.e = i;
        this.f = z;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                return new mn(0, q60Var, (Context) obj3, (ey1) obj2, this.f);
            case 1:
                return new mn(1, q60Var, (Context) obj3, (ey1) obj2, this.f);
            default:
                return new mn(2, q60Var, (vp0) obj3, (ny2) obj2, this.f);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((mn) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((mn) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((mn) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                lr2 lr2Var = (lr2) ((ey1) obj2).getValue();
                if (lr2Var != null) {
                    lr2Var.k((Context) obj3, z);
                }
                break;
            case 1:
                ee0.J(obj);
                lr2 lr2Var2 = (lr2) ((ey1) obj2).getValue();
                if (lr2Var2 != null) {
                    lr2Var2.k((Context) obj3, z);
                }
                break;
            default:
                ee0.J(obj);
                if (z) {
                    vp0.a((vp0) obj3);
                    ny2 ny2Var = (ny2) obj2;
                    if (ny2Var != null) {
                        ((nb0) ny2Var).b();
                    }
                }
                break;
        }
        return mf3Var;
    }
}
