package kotlinx.coroutines.flow;

import defpackage.b81;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
public final class FlowKt__ShareKt$launchSharing$1 extends k33 implements pu0 {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ MutableSharedFlow<T> $shared;
    final /* synthetic */ SharingStarted $started;
    final /* synthetic */ Flow<T> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ MutableSharedFlow<T> $shared;
        final /* synthetic */ Flow<T> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, T t, q60 q60Var) {
            super(2, q60Var);
            this.$upstream = flow;
            this.$shared = mutableSharedFlow;
            this.$initialValue = t;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(SharingCommand sharingCommand, q60 q60Var) {
            return ((AnonymousClass2) create(sharingCommand, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i2 == 1) {
                    Flow<T> flow = this.$upstream;
                    SharedFlow sharedFlow = this.$shared;
                    this.label = 1;
                    Object objCollect = flow.collect(sharedFlow, this);
                    z70 z70Var = z70.e;
                    if (objCollect == z70Var) {
                        return z70Var;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        b81.d();
                        return null;
                    }
                    T t = this.$initialValue;
                    Symbol symbol = SharedFlowKt.NO_VALUE;
                    MutableSharedFlow<T> mutableSharedFlow = this.$shared;
                    if (t == symbol) {
                        mutableSharedFlow.resetReplayCache();
                    } else {
                        mutableSharedFlow.tryEmit(t);
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, T t, q60 q60Var) {
        super(2, q60Var);
        this.$started = sharingStarted;
        this.$upstream = flow;
        this.$shared = mutableSharedFlow;
        this.$initialValue = t;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
        return ((FlowKt__ShareKt$launchSharing$1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r9.collect(r0, r8) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r9.collect(r0, r8) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r9, r0, r8) == r6) goto L28;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            z70 r6 = defpackage.z70.e
            if (r0 == 0) goto L22
            if (r0 == r5) goto L1e
            if (r0 == r4) goto L1a
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L14
            goto L1e
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r8)
            return r1
        L1a:
            defpackage.ee0.J(r9)
            goto L58
        L1e:
            defpackage.ee0.J(r9)
            goto L89
        L22:
            defpackage.ee0.J(r9)
            kotlinx.coroutines.flow.SharingStarted r9 = r8.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r0 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r7 = r0.getEagerly()
            if (r9 != r7) goto L3c
            kotlinx.coroutines.flow.Flow<T> r9 = r8.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r8.$shared
            r8.label = r5
            java.lang.Object r8 = r9.collect(r0, r8)
            if (r8 != r6) goto L89
            goto L88
        L3c:
            kotlinx.coroutines.flow.SharingStarted r9 = r8.$started
            kotlinx.coroutines.flow.SharingStarted r0 = r0.getLazily()
            if (r9 != r0) goto L65
            kotlinx.coroutines.flow.MutableSharedFlow<T> r9 = r8.$shared
            kotlinx.coroutines.flow.StateFlow r9 = r9.getSubscriptionCount()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r0.<init>(r1)
            r8.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r0, r8)
            if (r9 != r6) goto L58
            goto L88
        L58:
            kotlinx.coroutines.flow.Flow<T> r9 = r8.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r8.$shared
            r8.label = r3
            java.lang.Object r8 = r9.collect(r0, r8)
            if (r8 != r6) goto L89
            goto L88
        L65:
            kotlinx.coroutines.flow.SharingStarted r9 = r8.$started
            kotlinx.coroutines.flow.MutableSharedFlow<T> r0 = r8.$shared
            kotlinx.coroutines.flow.StateFlow r0 = r0.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r9 = r9.command(r0)
            kotlinx.coroutines.flow.Flow r9 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r9)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.Flow<T> r3 = r8.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r4 = r8.$shared
            T r5 = r8.$initialValue
            r0.<init>(r3, r4, r5, r1)
            r8.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.collectLatest(r9, r0, r8)
            if (r8 != r6) goto L89
        L88:
            return r6
        L89:
            mf3 r8 = defpackage.mf3.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1(q60 q60Var) {
            super(2, q60Var);
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(q60Var);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i, q60 q60Var) {
            return ((AnonymousClass1) create(Integer.valueOf(i), q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ee0.J(obj);
                return Boolean.valueOf(this.I$0 > 0);
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // defpackage.pu0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (q60) obj2);
        }
    }
}
