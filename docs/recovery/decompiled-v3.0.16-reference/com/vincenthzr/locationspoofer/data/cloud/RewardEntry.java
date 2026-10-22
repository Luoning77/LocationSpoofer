package com.vincenthzr.locationspoofer.data.cloud;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RewardEntry {
    private final long createdAt;
    private final int delta;
    private final String id;
    private final String kind;

    public RewardEntry(String str, int i, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.delta = i;
        this.kind = str2;
        this.createdAt = j;
    }

    public static /* synthetic */ RewardEntry copy$default(RewardEntry rewardEntry, String str, int i, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rewardEntry.id;
        }
        if ((i2 & 2) != 0) {
            i = rewardEntry.delta;
        }
        if ((i2 & 4) != 0) {
            str2 = rewardEntry.kind;
        }
        if ((i2 & 8) != 0) {
            j = rewardEntry.createdAt;
        }
        String str3 = str2;
        return rewardEntry.copy(str, i, str3, j);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.delta;
    }

    public final String component3() {
        return this.kind;
    }

    public final long component4() {
        return this.createdAt;
    }

    public final RewardEntry copy(String str, int i, String str2, long j) {
        str.getClass();
        str2.getClass();
        return new RewardEntry(str, i, str2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardEntry)) {
            return false;
        }
        RewardEntry rewardEntry = (RewardEntry) obj;
        return o51.f(this.id, rewardEntry.id) && this.delta == rewardEntry.delta && o51.f(this.kind, rewardEntry.kind) && this.createdAt == rewardEntry.createdAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getDelta() {
        return this.delta;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + p91.d(p91.b(this.delta, this.id.hashCode() * 31, 31), 31, this.kind);
    }

    public String toString() {
        return "RewardEntry(id=" + this.id + ", delta=" + this.delta + ", kind=" + this.kind + ", createdAt=" + this.createdAt + ")";
    }
}
