package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import defpackage.vj0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MembershipBenefit {
    private final String free;
    private final String id;
    private final String member;
    private final String name;
    private final Map<String, String> values;

    public MembershipBenefit(String str, String str2, String str3, String str4, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        this.id = str;
        this.name = str2;
        this.free = str3;
        this.member = str4;
        this.values = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipBenefit copy$default(MembershipBenefit membershipBenefit, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = membershipBenefit.id;
        }
        if ((i & 2) != 0) {
            str2 = membershipBenefit.name;
        }
        if ((i & 4) != 0) {
            str3 = membershipBenefit.free;
        }
        if ((i & 8) != 0) {
            str4 = membershipBenefit.member;
        }
        if ((i & 16) != 0) {
            map = membershipBenefit.values;
        }
        Map map2 = map;
        String str5 = str3;
        return membershipBenefit.copy(str, str2, str5, str4, map2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.free;
    }

    public final String component4() {
        return this.member;
    }

    public final Map<String, String> component5() {
        return this.values;
    }

    public final MembershipBenefit copy(String str, String str2, String str3, String str4, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        return new MembershipBenefit(str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipBenefit)) {
            return false;
        }
        MembershipBenefit membershipBenefit = (MembershipBenefit) obj;
        return o51.f(this.id, membershipBenefit.id) && o51.f(this.name, membershipBenefit.name) && o51.f(this.free, membershipBenefit.free) && o51.f(this.member, membershipBenefit.member) && o51.f(this.values, membershipBenefit.values);
    }

    public final String getFree() {
        return this.free;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMember() {
        return this.member;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + p91.d(p91.d(p91.d(this.id.hashCode() * 31, 31, this.name), 31, this.free), 31, this.member);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.free;
        String str4 = this.member;
        Map<String, String> map = this.values;
        StringBuilder sbT = p91.t("MembershipBenefit(id=", str, ", name=", str2, ", free=");
        p91.y(sbT, str3, ", member=", str4, ", values=");
        sbT.append(map);
        sbT.append(")");
        return sbT.toString();
    }

    public /* synthetic */ MembershipBenefit(String str, String str2, String str3, String str4, Map map, int i, ca0 ca0Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? vj0.e : map);
    }
}
