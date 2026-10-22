package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudMemberInvite {
    private final String code;
    private final int invitedCount;

    public CloudMemberInvite(String str, int i) {
        str.getClass();
        this.code = str;
        this.invitedCount = i;
    }

    public static /* synthetic */ CloudMemberInvite copy$default(CloudMemberInvite cloudMemberInvite, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cloudMemberInvite.code;
        }
        if ((i2 & 2) != 0) {
            i = cloudMemberInvite.invitedCount;
        }
        return cloudMemberInvite.copy(str, i);
    }

    public final String component1() {
        return this.code;
    }

    public final int component2() {
        return this.invitedCount;
    }

    public final CloudMemberInvite copy(String str, int i) {
        str.getClass();
        return new CloudMemberInvite(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudMemberInvite)) {
            return false;
        }
        CloudMemberInvite cloudMemberInvite = (CloudMemberInvite) obj;
        return o51.f(this.code, cloudMemberInvite.code) && this.invitedCount == cloudMemberInvite.invitedCount;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getInvitedCount() {
        return this.invitedCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.invitedCount) + (this.code.hashCode() * 31);
    }

    public String toString() {
        return "CloudMemberInvite(code=" + this.code + ", invitedCount=" + this.invitedCount + ")";
    }
}
