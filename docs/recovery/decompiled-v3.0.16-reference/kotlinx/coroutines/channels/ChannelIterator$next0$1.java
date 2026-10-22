package kotlinx.coroutines.channels;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", l = {1092}, m = "next")
public final class ChannelIterator$next0$1<E> extends r60 {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ChannelIterator$next0$1(q60 q60Var) {
        super(q60Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelIterator.DefaultImpls.next(null, this);
    }
}
