package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.MembershipOrder;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class as1 {
    public final MembershipOrder a;

    public as1(MembershipOrder membershipOrder) {
        this.a = membershipOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as1) && this.a.equals(((as1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Checkout(order=" + this.a + ")";
    }
}
