package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.r60;
import defpackage.ru0;
import defpackage.s90;
import defpackage.vd0;
import defpackage.we2;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__ErrorsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    public static final class AnonymousClass1<T> extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.catchImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ we2 $fromDownstream;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector, we2 we2Var) {
            this.$collector = flowCollector;
            this.$fromDownstream = we2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, q60 q60Var) {
            FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
            if (q60Var instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) q60Var;
                int i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, q60Var);
                }
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, q60Var);
            }
            Object obj = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
            int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
            try {
                if (i2 == 0) {
                    ee0.J(obj);
                    FlowCollector<T> flowCollector = this.$collector;
                    flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = this;
                    flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                    Object objEmit = flowCollector.emit(t, flowKt__ErrorsKt$catchImpl$2$emit$1);
                    z70 z70Var = z70.e;
                    if (objEmit == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                this = (AnonymousClass2<T>) mf3.a;
                return this;
            } catch (Throwable th) {
                this.$fromDownstream.e = th;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
    public static final class C01351 extends k33 implements pu0 {
        int label;

        public C01351(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new C01351(q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(Throwable th, q60 q60Var) {
            return ((C01351) create(th, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return Boolean.TRUE;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m75catch(Flow<? extends T> flow, qu0 qu0Var) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, qu0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, q60 q60Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        we2 we2Var;
        Throwable th;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(q60Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = (we2) anonymousClass1.L$0;
            try {
                ee0.J(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
                th = (Throwable) we2Var.e;
                if (isSameExceptionAs$FlowKt__ErrorsKt(th, th)) {
                }
                throw th;
            }
        }
        we2 we2VarJ = p91.j(obj);
        try {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(flowCollector, we2VarJ);
            anonymousClass1.L$0 = we2VarJ;
            anonymousClass1.label = 1;
            Object objCollect = flow.collect(anonymousClass2, anonymousClass1);
            z70 z70Var = z70.e;
            if (objCollect == z70Var) {
                return z70Var;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            we2Var = we2VarJ;
            th = (Throwable) we2Var.e;
            if (!isSameExceptionAs$FlowKt__ErrorsKt(th, th) || isCancellationCause$FlowKt__ErrorsKt(th, anonymousClass1.getContext())) {
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                vd0.d(th, th);
                throw th;
            }
            vd0.d(th, th);
            throw th;
        }
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th, y70 y70Var) {
        Job job = (Job) y70Var.get(Job.Key);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th, job.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th, Throwable th2) {
        return th2 != null && th2.equals(th);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j, pu0 pu0Var) {
        if (j > 0) {
            return FlowKt.retryWhen(flow, new AnonymousClass3(j, pu0Var, null));
        }
        fo.f(p91.o("Expected positive amount of retries, but had ", j));
        return null;
    }

    public static /* synthetic */ Flow retry$default(Flow flow, long j, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            pu0Var = new C01351(null);
        }
        return FlowKt.retry(flow, j, pu0Var);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, ru0 ru0Var) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(flow, ru0Var);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements ru0 {
        final /* synthetic */ pu0 $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j, pu0 pu0Var, q60 q60Var) {
            super(4, q60Var);
            this.$retries = j;
            this.$predicate = pu0Var;
        }

        @Override // defpackage.ru0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((FlowCollector) obj, (Throwable) obj2, ((Number) obj3).longValue(), (q60) obj4);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037  */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                Throwable th = (Throwable) this.L$0;
                if (this.J$0 < this.$retries) {
                    pu0 pu0Var = this.$predicate;
                    this.label = 1;
                    obj = pu0Var.invoke(th, this);
                    z70 z70Var = z70.e;
                    if (obj == z70Var) {
                        return z70Var;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
            boolean z = ((Boolean) obj).booleanValue();
            return Boolean.valueOf(z);
        }

        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, long j, q60 q60Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$retries, this.$predicate, q60Var);
            anonymousClass3.L$0 = th;
            anonymousClass3.J$0 = j;
            return anonymousClass3.invokeSuspend(mf3.a);
        }
    }
}
