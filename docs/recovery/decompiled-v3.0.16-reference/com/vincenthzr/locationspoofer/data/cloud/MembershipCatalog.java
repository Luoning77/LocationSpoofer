package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;
import defpackage.p91;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipCatalog {
    private final List<MembershipBenefit> benefits;
    private final List<MembershipPlan> plans;
    private final boolean purchasingEnabled;
    private final String quotaNote;

    public MembershipCatalog(boolean z, List<MembershipPlan> list, List<MembershipBenefit> list2, String str) {
        list.getClass();
        list2.getClass();
        str.getClass();
        this.purchasingEnabled = z;
        this.plans = list;
        this.benefits = list2;
        this.quotaNote = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipCatalog copy$default(MembershipCatalog membershipCatalog, boolean z, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = membershipCatalog.purchasingEnabled;
        }
        if ((i & 2) != 0) {
            list = membershipCatalog.plans;
        }
        if ((i & 4) != 0) {
            list2 = membershipCatalog.benefits;
        }
        if ((i & 8) != 0) {
            str = membershipCatalog.quotaNote;
        }
        return membershipCatalog.copy(z, list, list2, str);
    }

    public final boolean component1() {
        return this.purchasingEnabled;
    }

    public final List<MembershipPlan> component2() {
        return this.plans;
    }

    public final List<MembershipBenefit> component3() {
        return this.benefits;
    }

    public final String component4() {
        return this.quotaNote;
    }

    public final MembershipCatalog copy(boolean z, List<MembershipPlan> list, List<MembershipBenefit> list2, String str) {
        list.getClass();
        list2.getClass();
        str.getClass();
        return new MembershipCatalog(z, list, list2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipCatalog)) {
            return false;
        }
        MembershipCatalog membershipCatalog = (MembershipCatalog) obj;
        return this.purchasingEnabled == membershipCatalog.purchasingEnabled && o51.f(this.plans, membershipCatalog.plans) && o51.f(this.benefits, membershipCatalog.benefits) && o51.f(this.quotaNote, membershipCatalog.quotaNote);
    }

    public final List<MembershipBenefit> getBenefits() {
        return this.benefits;
    }

    public final List<MembershipPlan> getPlans() {
        return this.plans;
    }

    public final boolean getPurchasingEnabled() {
        return this.purchasingEnabled;
    }

    public final String getQuotaNote() {
        return this.quotaNote;
    }

    public int hashCode() {
        return this.quotaNote.hashCode() + p91.g(this.benefits, p91.g(this.plans, Boolean.hashCode(this.purchasingEnabled) * 31, 31), 31);
    }

    public String toString() {
        return "MembershipCatalog(purchasingEnabled=" + this.purchasingEnabled + ", plans=" + this.plans + ", benefits=" + this.benefits + ", quotaNote=" + this.quotaNote + ")";
    }
}
