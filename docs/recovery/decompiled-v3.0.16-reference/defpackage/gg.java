package defpackage;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gg implements k63 {
    public final Channel a = ChannelKt.Channel$default(0, null, null, 7, null);

    @Override // defpackage.k63
    public final void close() {
        this.a.mo32trySendJP2dKIU(mf3.a);
    }
}
