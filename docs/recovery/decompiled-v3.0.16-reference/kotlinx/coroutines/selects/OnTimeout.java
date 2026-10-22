package kotlinx.coroutines.selects;

import defpackage.da0;
import defpackage.mf3;
import defpackage.y70;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class OnTimeout {
    private final long timeMillis;

    public OnTimeout(long j) {
        this.timeMillis = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(final SelectInstance<?> selectInstance, Object obj) {
        if (this.timeMillis <= 0) {
            selectInstance.selectInRegistrationPhase(mf3.a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.a
            @Override // java.lang.Runnable
            public final void run() {
                OnTimeout.register$lambda$0(selectInstance, this);
            }
        };
        selectInstance.getClass();
        SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
        y70 context = selectImplementation.getContext();
        selectImplementation.disposeOnCompletion(DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(SelectInstance selectInstance, OnTimeout onTimeout) {
        selectInstance.trySelect(onTimeout, mf3.a);
    }

    public final SelectClause0 getSelectClause() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        onTimeout$selectClause$1.getClass();
        da0.o(3, onTimeout$selectClause$1);
        return new SelectClause0Impl(this, onTimeout$selectClause$1, null, 4, null);
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }
}
