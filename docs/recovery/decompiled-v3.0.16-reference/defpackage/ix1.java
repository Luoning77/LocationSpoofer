package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ix1 {
    public final MutableSharedFlow a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    public final Object a(s41 s41Var, q60 q60Var) {
        Object objEmit = this.a.emit(s41Var, q60Var);
        return objEmit == z70.e ? objEmit : mf3.a;
    }

    public final boolean b(s41 s41Var) {
        return this.a.tryEmit(s41Var);
    }
}
