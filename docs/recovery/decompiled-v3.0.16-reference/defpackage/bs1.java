package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.MembershipPlan;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bs1 {
    public final MembershipPlan a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public bs1(MembershipPlan membershipPlan, String str, String str2, String str3, String str4) {
        this.a = membershipPlan;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs1)) {
            return false;
        }
        bs1 bs1Var = (bs1) obj;
        return this.a.equals(bs1Var.a) && this.b.equals(bs1Var.b) && this.c.equals(bs1Var.c) && o51.f(this.d, bs1Var.d) && o51.f(this.e, bs1Var.e);
    }

    public final int hashCode() {
        int iD = p91.d(p91.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseAttempt(plan=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", mode=");
        p91.y(sb, this.c, ", couponId=", this.d, ", slotId=");
        return az2.p(sb, this.e, ")");
    }
}
