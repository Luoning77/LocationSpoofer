package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.fo;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BroadcastChannelKt {
    private static final Symbol NO_ELEMENT = new Symbol("NO_ELEMENT");

    @cc0
    public static final <E> BroadcastChannel<E> BroadcastChannel(int i) {
        if (i == -2) {
            return new BroadcastChannelImpl(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        }
        if (i == -1) {
            return new ConflatedBroadcastChannel();
        }
        if (i == 0) {
            fo.i("Unsupported 0 capacity for BroadcastChannel");
            return null;
        }
        if (i != Integer.MAX_VALUE) {
            return new BroadcastChannelImpl(i);
        }
        fo.i("Unsupported UNLIMITED capacity for BroadcastChannel");
        return null;
    }
}
