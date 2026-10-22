package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z43 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ tb2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z43(tb2 tb2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = tb2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        tb2 tb2Var = this.f;
        switch (i) {
            case 0:
                return new z43(tb2Var, q60Var, 0);
            case 1:
                return new z43(tb2Var, q60Var, 1);
            case 2:
                return new z43(tb2Var, q60Var, 2);
            case 3:
                return new z43(tb2Var, q60Var, 3);
            case 4:
                return new z43(tb2Var, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new z43(tb2Var, q60Var, 5);
            case Logger.ERROR /* 6 */:
                return new z43(tb2Var, q60Var, 6);
            default:
                return new z43(tb2Var, q60Var, 7);
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
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 2:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 3:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 4:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case Logger.WARN /* 5 */:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case Logger.ERROR /* 6 */:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((z43) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        tb2 tb2Var = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                tb2Var.g = true;
                Mutex mutex = tb2Var.h;
                if (mutex.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                }
                break;
            case 1:
                ee0.J(obj);
                tb2Var.c();
                break;
            case 2:
                ee0.J(obj);
                tb2Var.c();
                break;
            case 3:
                ee0.J(obj);
                tb2Var.g = true;
                Mutex mutex2 = tb2Var.h;
                if (mutex2.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                }
                break;
            case 4:
                ee0.J(obj);
                tb2Var.c();
                break;
            case Logger.WARN /* 5 */:
                ee0.J(obj);
                tb2Var.c();
                break;
            case Logger.ERROR /* 6 */:
                ee0.J(obj);
                tb2Var.g = true;
                Mutex mutex3 = tb2Var.h;
                if (mutex3.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex3, null, 1, null);
                }
                break;
            default:
                ee0.J(obj);
                tb2Var.c();
                break;
        }
        return mf3Var;
    }
}
