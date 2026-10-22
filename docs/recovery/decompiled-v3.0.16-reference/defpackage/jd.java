package defpackage;

import android.view.Choreographer;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jd extends k33 implements pu0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd(int i, q60 q60Var, int i2) {
        super(i, q60Var);
        this.e = i2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                jd jdVar = new jd(2, q60Var, 0);
                ((Number) obj).floatValue();
                return jdVar;
            default:
                return new jd(2, q60Var, 1);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((jd) create(Float.valueOf(((Number) obj).floatValue()), (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            default:
                return ((jd) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                ee0.J(obj);
                return mf3.a;
            default:
                ee0.J(obj);
                return Choreographer.getInstance();
        }
    }
}
