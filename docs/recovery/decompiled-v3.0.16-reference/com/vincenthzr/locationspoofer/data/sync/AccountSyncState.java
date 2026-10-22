package com.vincenthzr.locationspoofer.data.sync;

import defpackage.ca0;
import defpackage.o51;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AccountSyncState {
    private final String accessDeniedCode;
    private final String error;
    private final Long lastSyncedAt;
    private final boolean syncing;

    public /* synthetic */ AccountSyncState(boolean z, Long l, String str, String str2, int i, ca0 ca0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ AccountSyncState copy$default(AccountSyncState accountSyncState, boolean z, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountSyncState.syncing;
        }
        if ((i & 2) != 0) {
            l = accountSyncState.lastSyncedAt;
        }
        if ((i & 4) != 0) {
            str = accountSyncState.error;
        }
        if ((i & 8) != 0) {
            str2 = accountSyncState.accessDeniedCode;
        }
        return accountSyncState.copy(z, l, str, str2);
    }

    public final boolean component1() {
        return this.syncing;
    }

    public final Long component2() {
        return this.lastSyncedAt;
    }

    public final String component3() {
        return this.error;
    }

    public final String component4() {
        return this.accessDeniedCode;
    }

    public final AccountSyncState copy(boolean z, Long l, String str, String str2) {
        return new AccountSyncState(z, l, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSyncState)) {
            return false;
        }
        AccountSyncState accountSyncState = (AccountSyncState) obj;
        return this.syncing == accountSyncState.syncing && o51.f(this.lastSyncedAt, accountSyncState.lastSyncedAt) && o51.f(this.error, accountSyncState.error) && o51.f(this.accessDeniedCode, accountSyncState.accessDeniedCode);
    }

    public final String getAccessDeniedCode() {
        return this.accessDeniedCode;
    }

    public final String getError() {
        return this.error;
    }

    public final Long getLastSyncedAt() {
        return this.lastSyncedAt;
    }

    public final boolean getSyncing() {
        return this.syncing;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.syncing) * 31;
        Long l = this.lastSyncedAt;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.error;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessDeniedCode;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AccountSyncState(syncing=" + this.syncing + ", lastSyncedAt=" + this.lastSyncedAt + ", error=" + this.error + ", accessDeniedCode=" + this.accessDeniedCode + ")";
    }

    public AccountSyncState(boolean z, Long l, String str, String str2) {
        this.syncing = z;
        this.lastSyncedAt = l;
        this.error = str;
        this.accessDeniedCode = str2;
    }

    public AccountSyncState() {
        this(false, null, null, null, 15, null);
    }
}
