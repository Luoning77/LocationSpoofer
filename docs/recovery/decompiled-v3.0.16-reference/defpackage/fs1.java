package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudEntitlements;
import com.vincenthzr.locationspoofer.data.cloud.MembershipOrder;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fs1 extends r60 {
    public MembershipOrder e;
    public String f;
    public CloudEntitlements g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ is1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs1(is1 is1Var, r60 r60Var) {
        super(r60Var);
        this.j = is1Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(null, null, 0L, this);
    }
}
