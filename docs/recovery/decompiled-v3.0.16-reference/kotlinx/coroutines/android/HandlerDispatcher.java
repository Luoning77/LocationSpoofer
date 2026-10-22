package kotlinx.coroutines.android;

import defpackage.ca0;
import defpackage.cc0;
import defpackage.q60;
import defpackage.y70;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements Delay {
    public /* synthetic */ HandlerDispatcher(ca0 ca0Var) {
        this();
    }

    @Override // kotlinx.coroutines.Delay
    @cc0
    public Object delay(long j, q60 q60Var) {
        return Delay.DefaultImpls.delay(this, j, q60Var);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract HandlerDispatcher getImmediate();

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, y70 y70Var) {
        return Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, y70Var);
    }

    private HandlerDispatcher() {
    }
}
