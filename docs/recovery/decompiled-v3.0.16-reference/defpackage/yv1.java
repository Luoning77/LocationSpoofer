package defpackage;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yv1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Channel f;

    public /* synthetic */ yv1(Channel channel, int i) {
        this.e = i;
        this.f = channel;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        Channel channel = this.f;
        switch (i) {
            case 0:
                return (zv1) ChannelResult.m51getOrNullimpl(channel.mo39tryReceivePtdJZtk());
            default:
                return (sb3) ChannelResult.m51getOrNullimpl(channel.mo39tryReceivePtdJZtk());
        }
    }
}
