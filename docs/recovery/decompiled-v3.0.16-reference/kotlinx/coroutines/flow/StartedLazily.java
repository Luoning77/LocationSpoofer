package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.se2;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class StartedLazily implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.flow(new AnonymousClass1(stateFlow, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ StateFlow<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlow<Integer> stateFlow, q60 q60Var) {
            super(2, q60Var);
            this.$subscriptionCount = stateFlow;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$subscriptionCount, q60Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, q60 q60Var) {
            return ((AnonymousClass1) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                se2 se2Var = new se2();
                StateFlow<Integer> stateFlow = this.$subscriptionCount;
                C00031 c00031 = new C00031(se2Var, flowCollector);
                this.label = 1;
                Object objCollect = stateFlow.collect(c00031, this);
                z70 z70Var = z70.e;
                if (objCollect == z70Var) {
                    return z70Var;
                }
            } else {
                if (i != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
            }
            fo.d();
            return null;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public static final class C00031<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<SharingCommand> $$this$flow;
            final /* synthetic */ se2 $started;

            /* JADX WARN: Multi-variable type inference failed */
            public C00031(se2 se2Var, FlowCollector<? super SharingCommand> flowCollector) {
                this.$started = se2Var;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object emit(int i, q60 q60Var) {
                StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
                if (q60Var instanceof StartedLazily$command$1$1$emit$1) {
                    startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) q60Var;
                    int i2 = startedLazily$command$1$1$emit$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        startedLazily$command$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    } else {
                        startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, q60Var);
                    }
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, q60Var);
                }
                Object obj = startedLazily$command$1$1$emit$1.result;
                int i3 = startedLazily$command$1$1$emit$1.label;
                mf3 mf3Var = mf3.a;
                if (i3 == 0) {
                    ee0.J(obj);
                    if (i > 0) {
                        se2 se2Var = this.$started;
                        if (!se2Var.e) {
                            se2Var.e = true;
                            FlowCollector<SharingCommand> flowCollector = this.$$this$flow;
                            SharingCommand sharingCommand = SharingCommand.START;
                            startedLazily$command$1$1$emit$1.label = 1;
                            Object objEmit = flowCollector.emit(sharingCommand, startedLazily$command$1$1$emit$1);
                            z70 z70Var = z70.e;
                            if (objEmit == z70Var) {
                                return z70Var;
                            }
                        }
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, q60 q60Var) {
                return emit(((Number) obj).intValue(), q60Var);
            }
        }
    }
}
