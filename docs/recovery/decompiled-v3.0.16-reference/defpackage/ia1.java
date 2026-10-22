package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ia1 implements mf2, CoroutineExceptionHandler {
    public final y70 e;
    public final pu0 f;
    public final CoroutineScope g;
    public Job h;

    public ia1(y70 y70Var, pu0 pu0Var) {
        this.e = y70Var;
        this.f = pu0Var;
        this.g = CoroutineScopeKt.CoroutineScope(y70Var.plus(this));
    }

    @Override // defpackage.mf2
    public final void a() {
        Job job = this.h;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.h = BuildersKt__Builders_commonKt.launch$default(this.g, null, null, this.f, 3, null);
    }

    @Override // defpackage.mf2
    public final void b() {
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) new pr0(1));
        }
        this.h = null;
    }

    @Override // defpackage.mf2
    public final void c() {
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) new pr0(1));
        }
        this.h = null;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, defpackage.y70
    public final /* bridge */ Object fold(Object obj, pu0 pu0Var) {
        return CoroutineExceptionHandler.DefaultImpls.fold(this, obj, pu0Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, defpackage.y70
    public final /* bridge */ w70 get(x70 x70Var) {
        return CoroutineExceptionHandler.DefaultImpls.get(this, x70Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, defpackage.w70
    public final x70 getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(y70 y70Var, Throwable th) throws Throwable {
        r30 r30Var = (r30) y70Var.get(r30.f);
        if (r30Var != null) {
            o51.H(th, new m5(10, r30Var, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.e.get(CoroutineExceptionHandler.Key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(y70Var, th);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, defpackage.y70
    public final /* bridge */ y70 minusKey(x70 x70Var) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, x70Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, defpackage.y70
    public final /* bridge */ y70 plus(y70 y70Var) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, y70Var);
    }
}
