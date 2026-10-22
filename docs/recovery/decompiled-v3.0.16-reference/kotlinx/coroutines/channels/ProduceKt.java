package kotlinx.coroutines.channels;

import defpackage.au0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.oi1;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.sj0;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProduceKt.awaitClose(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitClose(ProducerScope<?> producerScope, au0 au0Var, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
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
        try {
            if (i2 == 0) {
                ee0.J(obj);
                if (anonymousClass1.getContext().get(Job.Key) != producerScope) {
                    fo.n("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                anonymousClass1.L$0 = producerScope;
                anonymousClass1.L$1 = au0Var;
                anonymousClass1.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(anonymousClass1), 1);
                cancellableContinuationImpl.initCancellability();
                producerScope.invokeOnClose(new lu0() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                    @Override // defpackage.lu0
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return mf3.a;
                    }

                    public final void invoke(Throwable th) {
                        cancellableContinuationImpl.resumeWith(mf3.a);
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                z70 z70Var = z70.e;
                if (result == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                au0Var = (au0) anonymousClass1.L$1;
                ee0.J(obj);
            }
            au0Var.invoke();
            return mf3.a;
        } catch (Throwable th) {
            au0Var.invoke();
            throw th;
        }
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope producerScope, au0 au0Var, q60 q60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            au0Var = new oi1(14);
        }
        return awaitClose(producerScope, au0Var, q60Var);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, y70 y70Var, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, y70Var), ChannelKt.Channel$default(i, bufferOverflow, null, 4, null));
        if (lu0Var != null) {
            producerCoroutine.invokeOnCompletion(lu0Var);
        }
        producerCoroutine.start(coroutineStart, producerCoroutine, pu0Var);
        return producerCoroutine;
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, y70 y70Var, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            lu0Var = null;
        }
        lu0 lu0Var2 = lu0Var;
        return produce(coroutineScope, y70Var, i, bufferOverflow, coroutineStart, lu0Var2, pu0Var);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, y70 y70Var, int i, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var) {
        return produce(coroutineScope, y70Var, i, BufferOverflow.SUSPEND, coroutineStart, lu0Var, pu0Var);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, y70 y70Var, int i, pu0 pu0Var) {
        return produce(coroutineScope, y70Var, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pu0Var);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, y70 y70Var, int i, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            lu0Var = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return produce(coroutineScope, y70Var, i, coroutineStart2, lu0Var, pu0Var);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, y70 y70Var, int i, pu0 pu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return produce(coroutineScope, y70Var, i, pu0Var);
    }
}
