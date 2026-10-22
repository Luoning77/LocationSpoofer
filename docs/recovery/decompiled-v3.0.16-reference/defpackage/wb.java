package defpackage;

import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wb extends r60 {
    public ChannelIterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(yb ybVar, r60 r60Var) {
        super(r60Var);
        this.g = ybVar;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
