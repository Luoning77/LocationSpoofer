package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.z70;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", l = {58}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends k33 implements pu0 {
        final /* synthetic */ Object $element;
        final /* synthetic */ SendChannel $this_sendBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendChannel sendChannel, Object obj, q60 q60Var) {
            super(2, q60Var);
            this.$this_sendBlocking = sendChannel;
            this.$element = obj;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass1(this.$this_sendBlocking, this.$element, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                SendChannel sendChannel = this.$this_sendBlocking;
                Object obj2 = this.$element;
                this.label = 1;
                Object objSend = sendChannel.send(obj2, this);
                z70 z70Var = z70.e;
                if (objSend == z70Var) {
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

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ E $element;
        final /* synthetic */ SendChannel<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SendChannel<? super E> sendChannel, E e, q60 q60Var) {
            super(2, q60Var);
            this.$this_trySendBlocking = sendChannel;
            this.$element = e;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_trySendBlocking, this.$element, q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
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
            Object wg2Var;
            int i = this.label;
            mf3 mf3Var = mf3.a;
            try {
                if (i == 0) {
                    ee0.J(obj);
                    SendChannel<E> sendChannel = this.$this_trySendBlocking;
                    E e = this.$element;
                    this.label = 1;
                    Object objSend = sendChannel.send(e, this);
                    z70 z70Var = z70.e;
                    if (objSend == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                wg2Var = mf3Var;
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            return ChannelResult.m46boximpl(!(wg2Var instanceof wg2) ? ChannelResult.Companion.m61successJP2dKIU(mf3Var) : ChannelResult.Companion.m59closedJP2dKIU(xg2.a(wg2Var)));
        }
    }

    @cc0
    public static final /* synthetic */ void sendBlocking(SendChannel sendChannel, Object obj) {
        if (ChannelResult.m56isSuccessimpl(sendChannel.mo32trySendJP2dKIU(obj))) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(sendChannel, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e) {
        Object objMo32trySendJP2dKIU = sendChannel.mo32trySendJP2dKIU(e);
        if (objMo32trySendJP2dKIU instanceof ChannelResult.Failed) {
            return ((ChannelResult) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass2(sendChannel, e, null), 1, null)).m58unboximpl();
        }
        return ChannelResult.Companion.m61successJP2dKIU(mf3.a);
    }
}
