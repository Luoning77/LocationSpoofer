package defpackage;

import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.service.SpoofingControlReceiver;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dz2 extends r60 {
    public SavedLocation e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SpoofingControlReceiver g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz2(SpoofingControlReceiver spoofingControlReceiver, r60 r60Var) {
        super(r60Var);
        this.g = spoofingControlReceiver;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        int i = SpoofingControlReceiver.c;
        return this.g.c(null, null, this);
    }
}
