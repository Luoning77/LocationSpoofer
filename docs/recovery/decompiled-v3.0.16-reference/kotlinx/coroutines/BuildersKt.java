package kotlinx.coroutines;

import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, y70Var, coroutineStart, pu0Var);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, pu0 pu0Var, q60 q60Var) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, pu0Var, q60Var);
    }

    public static final Job launch(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, y70Var, coroutineStart, pu0Var);
    }

    public static /* synthetic */ Job launch$default(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var, int i, Object obj) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, y70Var, coroutineStart, pu0Var, i, obj);
    }

    public static final <T> T runBlocking(y70 y70Var, pu0 pu0Var) {
        return (T) BuildersKt__BuildersKt.runBlocking(y70Var, pu0Var);
    }

    public static final <T> Object withContext(y70 y70Var, pu0 pu0Var, q60 q60Var) {
        return BuildersKt__Builders_commonKt.withContext(y70Var, pu0Var, q60Var);
    }
}
