package kotlinx.coroutines.flow;

import defpackage.az2;
import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.ru0;
import defpackage.s90;
import defpackage.su0;
import defpackage.tu0;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__MigrationKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", l = {423}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, q60 q60Var) {
            super(2, q60Var);
            this.$timeMillis = j;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(this.$timeMillis, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(T t, q60 q60Var) {
            return ((AnonymousClass1) create(t, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                long j = this.$timeMillis;
                this.label = 1;
                Object objDelay = DelayKt.delay(j, this);
                z70 z70Var = z70.e;
                if (objDelay == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", l = {411}, m = "invokeSuspend")
    public static final class C01401 extends k33 implements pu0 {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01401(long j, q60 q60Var) {
            super(2, q60Var);
            this.$timeMillis = j;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new C01401(this.$timeMillis, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super T> flowCollector, q60 q60Var) {
            return ((C01401) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                long j = this.$timeMillis;
                this.label = 1;
                Object objDelay = DelayKt.delay(j, this);
                z70 z70Var = z70.e;
                if (objDelay == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", l = {302}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements qu0 {
        final /* synthetic */ T $fallback;
        final /* synthetic */ lu0 $predicate;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(lu0 lu0Var, T t, q60 q60Var) {
            super(3, q60Var);
            this.$predicate = lu0Var;
            this.$fallback = t;
        }

        @Override // defpackage.qu0
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$predicate, this.$fallback, q60Var);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th;
            return anonymousClass2.invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!((Boolean) this.$predicate.invoke(th)).booleanValue()) {
                    throw th;
                }
                T t = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                Object objEmit = flowCollector.emit(t, this);
                z70 z70Var = z70.e;
                if (objEmit == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            return mf3.a;
        }
    }

    @cc0
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        throw az2.d();
    }

    @cc0
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, qu0 qu0Var) {
        return FlowKt.combine(flow, flow2, qu0Var);
    }

    @cc0
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, lu0 lu0Var) {
        throw az2.d();
    }

    @cc0
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, lu0 lu0Var) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j) {
        return FlowKt.onEach(flow, new AnonymousClass1(j, null));
    }

    @cc0
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j) {
        return FlowKt.onStart(flow, new C01401(j, null));
    }

    @cc0
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, pu0 pu0Var) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        throw az2.d();
    }

    @cc0
    public static final <T> void forEach(Flow<? extends T> flow, pu0 pu0Var) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        throw az2.d();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @cc0
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, y70 y70Var) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t, lu0 lu0Var) {
        return FlowKt.m64catch(flow, new AnonymousClass2(lu0Var, t, null));
    }

    public static /* synthetic */ Flow onErrorReturn$default(Flow flow, Object obj, lu0 lu0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            lu0Var = new c(1);
        }
        return FlowKt.onErrorReturn(flow, obj, lu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onErrorReturn$lambda$0$FlowKt__MigrationKt(Throwable th) {
        return true;
    }

    @cc0
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, y70 y70Var) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        throw az2.d();
    }

    @cc0
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r, qu0 qu0Var) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, qu0 qu0Var) {
        return FlowKt.runningReduce(flow, qu0Var);
    }

    @cc0
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t) {
        throw az2.d();
    }

    @cc0
    public static final <T> void subscribe(Flow<? extends T> flow) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, y70 y70Var) {
        throw az2.d();
    }

    @cc0
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, pu0 pu0Var) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pu0Var, null));
    }

    @cc0
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, ru0 ru0Var) {
        return FlowKt.combine(flow, flow2, flow3, ru0Var);
    }

    @cc0
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw az2.d();
    }

    @cc0
    public static final <T> void subscribe(Flow<? extends T> flow, pu0 pu0Var) {
        throw az2.d();
    }

    @cc0
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, su0 su0Var) {
        return FlowKt.combine(flow, flow2, flow3, flow4, su0Var);
    }

    @cc0
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, tu0 tu0Var) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, tu0Var);
    }

    @cc0
    public static final <T> void subscribe(Flow<? extends T> flow, pu0 pu0Var, pu0 pu0Var2) {
        throw az2.d();
    }

    @cc0
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t) {
        throw az2.d();
    }
}
