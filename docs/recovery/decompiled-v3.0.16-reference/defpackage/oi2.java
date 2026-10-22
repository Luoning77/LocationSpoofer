package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oi2 {
    public final t5 a;
    public final k b;
    public final t c;
    public final j2 d;
    public final long e;
    public final MutableStateFlow f;

    public oi2(t5 t5Var, k kVar, t tVar, j2 j2Var) {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        CoroutineScope.getClass();
        this.a = t5Var;
        this.b = kVar;
        this.c = tVar;
        this.d = j2Var;
        this.e = 15000L;
        this.f = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new d6(this, (q60) null, 17), 3, null);
    }

    public final synchronized void a(Long l) {
        try {
            ni2 ni2Var = (ni2) this.f.getValue();
            if (o51.f(ni2Var != null ? Long.valueOf(ni2Var.a) : null, l)) {
                this.f.setValue(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
