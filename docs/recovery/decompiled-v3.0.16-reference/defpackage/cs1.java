package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudEntitlements;
import com.vincenthzr.locationspoofer.data.cloud.MembershipCatalog;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cs1 {
    public final MembershipCatalog a;
    public final List b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final CloudEntitlements j;
    public final String k;

    public cs1(MembershipCatalog membershipCatalog, List list, String str, boolean z, String str2, String str3, String str4, List list2, String str5, CloudEntitlements cloudEntitlements, String str6) {
        this.a = membershipCatalog;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list2;
        this.i = str5;
        this.j = cloudEntitlements;
        this.k = str6;
    }

    public static cs1 a(cs1 cs1Var, MembershipCatalog membershipCatalog, List list, String str, boolean z, String str2, String str3, List list2, String str4, CloudEntitlements cloudEntitlements, String str5, int i) {
        if ((i & 1) != 0) {
            membershipCatalog = cs1Var.a;
        }
        MembershipCatalog membershipCatalog2 = membershipCatalog;
        if ((i & 2) != 0) {
            list = cs1Var.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            str = cs1Var.c;
        }
        String str6 = str;
        boolean z2 = (i & 8) != 0 ? cs1Var.d : z;
        String str7 = (i & 16) != 0 ? cs1Var.e : str2;
        String str8 = cs1Var.f;
        String str9 = (i & 64) != 0 ? cs1Var.g : str3;
        List list4 = (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? cs1Var.h : list2;
        String str10 = (i & 256) != 0 ? cs1Var.i : str4;
        CloudEntitlements cloudEntitlements2 = (i & 512) != 0 ? cs1Var.j : cloudEntitlements;
        String str11 = (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? cs1Var.k : str5;
        cs1Var.getClass();
        list3.getClass();
        str6.getClass();
        list4.getClass();
        return new cs1(membershipCatalog2, list3, str6, z2, str7, str8, str9, list4, str10, cloudEntitlements2, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return o51.f(this.a, cs1Var.a) && o51.f(this.b, cs1Var.b) && o51.f(this.c, cs1Var.c) && this.d == cs1Var.d && o51.f(this.e, cs1Var.e) && o51.f(this.f, cs1Var.f) && o51.f(this.g, cs1Var.g) && o51.f(this.h, cs1Var.h) && o51.f(this.i, cs1Var.i) && o51.f(this.j, cs1Var.j) && o51.f(this.k, cs1Var.k);
    }

    public final int hashCode() {
        MembershipCatalog membershipCatalog = this.a;
        int iE = p91.e(p91.d(p91.g(this.b, (membershipCatalog == null ? 0 : membershipCatalog.hashCode()) * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iG = p91.g(this.h, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.i;
        int iHashCode3 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        CloudEntitlements cloudEntitlements = this.j;
        int iHashCode4 = (iHashCode3 + (cloudEntitlements == null ? 0 : cloudEntitlements.hashCode())) * 31;
        String str5 = this.k;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(catalog=");
        sb.append(this.a);
        sb.append(", orders=");
        sb.append(this.b);
        sb.append(", selectedId=");
        sb.append(this.c);
        sb.append(", busy=");
        sb.append(this.d);
        sb.append(", error=");
        p91.y(sb, this.e, ", identity=", this.f, ", openedOrderId=");
        sb.append(this.g);
        sb.append(", coupons=");
        sb.append(this.h);
        sb.append(", selectedCouponId=");
        sb.append(this.i);
        sb.append(", entitlements=");
        sb.append(this.j);
        sb.append(", selectedSlotId=");
        return az2.p(sb, this.k, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cs1(String str, int i) {
        str = (i & 32) != 0 ? null : str;
        uj0 uj0Var = uj0.e;
        this(null, uj0Var, "month", false, null, str, null, uj0Var, null, null, null);
    }
}
