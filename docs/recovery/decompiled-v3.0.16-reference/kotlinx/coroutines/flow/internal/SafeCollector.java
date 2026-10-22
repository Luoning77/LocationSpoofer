package kotlinx.coroutines.flow.internal;

import defpackage.a80;
import defpackage.m13;
import defpackage.mf3;
import defpackage.o51;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.sj0;
import defpackage.v70;
import defpackage.w70;
import defpackage.xg2;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SafeCollector<T> extends r60 implements FlowCollector<T> {
    public final y70 collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private q60 completion_;
    private y70 lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, y70 y70Var) {
        super(NoOpContinuation.INSTANCE, sj0.e);
        this.collector = flowCollector;
        this.collectContext = y70Var;
        this.collectContextSize = ((Number) y70Var.fold(0, new v70(15, (byte) 0))).intValue();
    }

    private final void checkContext(y70 y70Var, y70 y70Var2, T t) {
        if (y70Var2 instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) y70Var2, t);
        }
        SafeCollector_commonKt.checkContext(this, y70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, w70 w70Var) {
        return i + 1;
    }

    private final Object emit(q60 q60Var, T t) {
        y70 context = q60Var.getContext();
        JobKt.ensureActive(context);
        y70 y70Var = this.lastEmissionContext;
        if (y70Var != context) {
            checkContext(context, y70Var, t);
            this.lastEmissionContext = context;
        }
        this.completion_ = q60Var;
        qu0 qu0Var = SafeCollectorKt.emitFun;
        FlowCollector<T> flowCollector = this.collector;
        flowCollector.getClass();
        Object objInvoke = qu0Var.invoke(flowCollector, t, this);
        if (!o51.f(objInvoke, z70.e)) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(m13.O("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // defpackage.oq, defpackage.a80
    public a80 getCallerFrame() {
        q60 q60Var = this.completion_;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    @Override // defpackage.r60, defpackage.q60
    public y70 getContext() {
        y70 y70Var = this.lastEmissionContext;
        return y70Var == null ? sj0.e : y70Var;
    }

    @Override // defpackage.oq, defpackage.a80
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.oq
    public Object invokeSuspend(Object obj) {
        Throwable thA = xg2.a(obj);
        if (thA != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(thA, getContext());
        }
        q60 q60Var = this.completion_;
        if (q60Var != null) {
            q60Var.resumeWith(obj);
        }
        return z70.e;
    }

    @Override // defpackage.r60, defpackage.oq
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, q60 q60Var) {
        try {
            Object objEmit = emit(q60Var, t);
            z70 z70Var = z70.e;
            if (objEmit == z70Var) {
                q60Var.getClass();
            }
            return objEmit == z70Var ? objEmit : mf3.a;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, q60Var.getContext());
            throw th;
        }
    }
}
