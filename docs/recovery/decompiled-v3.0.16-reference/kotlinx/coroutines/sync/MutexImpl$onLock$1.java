package kotlinx.coroutines.sync;

import defpackage.bv0;
import defpackage.mf3;
import defpackage.qu0;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public /* synthetic */ class MutexImpl$onLock$1 extends bv0 implements qu0 {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.qu0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((MutexImpl) obj, (SelectInstance<?>) obj2, obj3);
        return mf3.a;
    }

    public final void invoke(MutexImpl mutexImpl, SelectInstance<?> selectInstance, Object obj) {
        mutexImpl.onLockRegFunction(selectInstance, obj);
    }
}
