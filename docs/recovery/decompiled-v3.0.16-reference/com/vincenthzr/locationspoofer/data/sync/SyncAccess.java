package com.vincenthzr.locationspoofer.data.sync;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import defpackage.o51;
import defpackage.p91;
import defpackage.yo;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SyncAccess {
    public static final SyncAccess INSTANCE = new SyncAccess();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AccountKey {
        private final Long expiresAt;
        private final boolean guest;
        private final String id;
        private final String plan;
        private final String session;
        private final boolean softwareRestricted;

        public AccountKey(String str, String str2, boolean z, String str3, Long l, boolean z2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.id = str;
            this.session = str2;
            this.guest = z;
            this.plan = str3;
            this.expiresAt = l;
            this.softwareRestricted = z2;
        }

        public static /* synthetic */ AccountKey copy$default(AccountKey accountKey, String str, String str2, boolean z, String str3, Long l, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountKey.id;
            }
            if ((i & 2) != 0) {
                str2 = accountKey.session;
            }
            if ((i & 4) != 0) {
                z = accountKey.guest;
            }
            if ((i & 8) != 0) {
                str3 = accountKey.plan;
            }
            if ((i & 16) != 0) {
                l = accountKey.expiresAt;
            }
            if ((i & 32) != 0) {
                z2 = accountKey.softwareRestricted;
            }
            Long l2 = l;
            boolean z3 = z2;
            return accountKey.copy(str, str2, z, str3, l2, z3);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.session;
        }

        public final boolean component3() {
            return this.guest;
        }

        public final String component4() {
            return this.plan;
        }

        public final Long component5() {
            return this.expiresAt;
        }

        public final boolean component6() {
            return this.softwareRestricted;
        }

        public final AccountKey copy(String str, String str2, boolean z, String str3, Long l, boolean z2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new AccountKey(str, str2, z, str3, l, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountKey)) {
                return false;
            }
            AccountKey accountKey = (AccountKey) obj;
            return o51.f(this.id, accountKey.id) && o51.f(this.session, accountKey.session) && this.guest == accountKey.guest && o51.f(this.plan, accountKey.plan) && o51.f(this.expiresAt, accountKey.expiresAt) && this.softwareRestricted == accountKey.softwareRestricted;
        }

        public final Long getExpiresAt() {
            return this.expiresAt;
        }

        public final boolean getGuest() {
            return this.guest;
        }

        public final String getId() {
            return this.id;
        }

        public final String getPlan() {
            return this.plan;
        }

        public final String getSession() {
            return this.session;
        }

        public final boolean getSoftwareRestricted() {
            return this.softwareRestricted;
        }

        public int hashCode() {
            int iD = p91.d(p91.e(p91.d(this.id.hashCode() * 31, 31, this.session), 31, this.guest), 31, this.plan);
            Long l = this.expiresAt;
            return Boolean.hashCode(this.softwareRestricted) + ((iD + (l == null ? 0 : l.hashCode())) * 31);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.session;
            boolean z = this.guest;
            String str3 = this.plan;
            Long l = this.expiresAt;
            boolean z2 = this.softwareRestricted;
            StringBuilder sbT = p91.t("AccountKey(id=", str, ", session=", str2, ", guest=");
            sbT.append(z);
            sbT.append(", plan=");
            sbT.append(str3);
            sbT.append(", expiresAt=");
            sbT.append(l);
            sbT.append(", softwareRestricted=");
            sbT.append(z2);
            sbT.append(")");
            return sbT.toString();
        }
    }

    private SyncAccess() {
    }

    public final AccountKey accountKey(CloudAccountState cloudAccountState) {
        cloudAccountState.getClass();
        CloudAccount account = cloudAccountState.getAccount();
        if (account != null) {
            if (!cloudAccountState.getValidated()) {
                account = null;
            }
            if (account != null) {
                return new AccountKey(account.getId(), account.getSessionId(), account.isGuest(), account.getPlan(), account.getSubscriptionExpiresAt(), account.getSoftwareMembershipRequired());
            }
        }
        return null;
    }

    public final boolean allowed(CloudAccountState cloudAccountState) {
        CloudAccount account;
        cloudAccountState.getClass();
        return (!cloudAccountState.getValidated() || (account = cloudAccountState.getAccount()) == null || account.isGuest() || !o51.f(account.getPlan(), "pro") || account.getSoftwareMembershipRequired()) ? false : true;
    }

    public final boolean denied(Exception exc) {
        CloudException cloudException;
        Integer httpStatus;
        exc.getClass();
        return (exc instanceof CloudException) && (httpStatus = (cloudException = (CloudException) exc).getHttpStatus()) != null && httpStatus.intValue() == 403 && yo.H0(new String[]{"subscription_required", "software_membership_required", "registered_account_required", "member_required"}).contains(cloudException.getCode());
    }

    public final SyncSelection selection(CloudAccountState cloudAccountState, SyncSelection syncSelection) {
        cloudAccountState.getClass();
        syncSelection.getClass();
        return allowed(cloudAccountState) ? syncSelection : SyncSelection.copy$default(syncSelection, false, null, 2, null);
    }
}
