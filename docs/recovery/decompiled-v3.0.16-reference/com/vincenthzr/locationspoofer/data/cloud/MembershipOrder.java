package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.az2;
import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import defpackage.yo;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipOrder {
    private final int amountCents;
    private final String checkoutMode;
    private final int durationDays;
    private final long expiresAt;
    private final Long grantedUntil;
    private final String id;
    private final Long paidAt;
    private final String payUrl;
    private final String planId;
    private final String productKind;
    private final String qrUrl;
    private final String slotId;
    private final String status;
    private final String title;

    public /* synthetic */ MembershipOrder(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, Long l, Long l2, String str6, String str7, String str8, String str9, int i3, ca0 ca0Var) {
        this(str, str2, str3, i, i2, str4, str5, j, l, l2, str6, str7, (i3 & 4096) != 0 ? "membership" : str8, (i3 & 8192) != 0 ? null : str9);
    }

    public final String component1() {
        return this.id;
    }

    public final Long component10() {
        return this.grantedUntil;
    }

    public final String component11() {
        return this.payUrl;
    }

    public final String component12() {
        return this.qrUrl;
    }

    public final String component13() {
        return this.productKind;
    }

    public final String component14() {
        return this.slotId;
    }

    public final String component2() {
        return this.planId;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.durationDays;
    }

    public final int component5() {
        return this.amountCents;
    }

    public final String component6() {
        return this.checkoutMode;
    }

    public final String component7() {
        return this.status;
    }

    public final long component8() {
        return this.expiresAt;
    }

    public final Long component9() {
        return this.paidAt;
    }

    public final MembershipOrder copy(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, Long l, Long l2, String str6, String str7, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str8.getClass();
        return new MembershipOrder(str, str2, str3, i, i2, str4, str5, j, l, l2, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipOrder)) {
            return false;
        }
        MembershipOrder membershipOrder = (MembershipOrder) obj;
        return o51.f(this.id, membershipOrder.id) && o51.f(this.planId, membershipOrder.planId) && o51.f(this.title, membershipOrder.title) && this.durationDays == membershipOrder.durationDays && this.amountCents == membershipOrder.amountCents && o51.f(this.checkoutMode, membershipOrder.checkoutMode) && o51.f(this.status, membershipOrder.status) && this.expiresAt == membershipOrder.expiresAt && o51.f(this.paidAt, membershipOrder.paidAt) && o51.f(this.grantedUntil, membershipOrder.grantedUntil) && o51.f(this.payUrl, membershipOrder.payUrl) && o51.f(this.qrUrl, membershipOrder.qrUrl) && o51.f(this.productKind, membershipOrder.productKind) && o51.f(this.slotId, membershipOrder.slotId);
    }

    public final int getAmountCents() {
        return this.amountCents;
    }

    public final String getCheckoutMode() {
        return this.checkoutMode;
    }

    public final int getDurationDays() {
        return this.durationDays;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Long getGrantedUntil() {
        return this.grantedUntil;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getPaidAt() {
        return this.paidAt;
    }

    public final String getPayUrl() {
        return this.payUrl;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final String getProductKind() {
        return this.productKind;
    }

    public final String getQrUrl() {
        return this.qrUrl;
    }

    public final String getSlotId() {
        return this.slotId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getWaiting() {
        return yo.H0(new String[]{"CREATING", "PENDING", "CREATE_UNKNOWN"}).contains(this.status);
    }

    public int hashCode() {
        int iC = p91.c(p91.d(p91.d(p91.b(this.amountCents, p91.b(this.durationDays, p91.d(p91.d(this.id.hashCode() * 31, 31, this.planId), 31, this.title), 31), 31), 31, this.checkoutMode), 31, this.status), 31, this.expiresAt);
        Long l = this.paidAt;
        int iHashCode = (iC + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.grantedUntil;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.payUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.qrUrl;
        int iD = p91.d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.productKind);
        String str3 = this.slotId;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return az2.k("MembershipOrder(status=", this.status, ", 支付地址已隐藏)");
    }

    public MembershipOrder(String str, String str2, String str3, int i, int i2, String str4, String str5, long j, Long l, Long l2, String str6, String str7, String str8, String str9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str8.getClass();
        this.id = str;
        this.planId = str2;
        this.title = str3;
        this.durationDays = i;
        this.amountCents = i2;
        this.checkoutMode = str4;
        this.status = str5;
        this.expiresAt = j;
        this.paidAt = l;
        this.grantedUntil = l2;
        this.payUrl = str6;
        this.qrUrl = str7;
        this.productKind = str8;
        this.slotId = str9;
    }
}
