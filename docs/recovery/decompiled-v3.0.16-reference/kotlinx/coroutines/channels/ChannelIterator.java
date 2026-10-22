package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.q60;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ChannelIterator<E> {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @cc0
        public static Object next(ChannelIterator channelIterator, q60 q60Var) {
            ChannelIterator$next0$1 channelIterator$next0$1;
            if (q60Var instanceof ChannelIterator$next0$1) {
                channelIterator$next0$1 = (ChannelIterator$next0$1) q60Var;
                int i = channelIterator$next0$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelIterator$next0$1 = new ChannelIterator$next0$1(q60Var);
                }
            } else {
                channelIterator$next0$1 = new ChannelIterator$next0$1(q60Var);
            }
            Object objHasNext = channelIterator$next0$1.result;
            int i2 = channelIterator$next0$1.label;
            if (i2 == 0) {
                ee0.J(objHasNext);
                channelIterator$next0$1.L$0 = channelIterator;
                channelIterator$next0$1.label = 1;
                objHasNext = channelIterator.hasNext(channelIterator$next0$1);
                z70 z70Var = z70.e;
                if (objHasNext == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                channelIterator = (ChannelIterator) channelIterator$next0$1.L$0;
                ee0.J(objHasNext);
            }
            if (((Boolean) objHasNext).booleanValue()) {
                return channelIterator.next();
            }
            throw new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
    }

    Object hasNext(q60 q60Var);

    E next();

    @cc0
    /* synthetic */ Object next(q60 q60Var);
}
