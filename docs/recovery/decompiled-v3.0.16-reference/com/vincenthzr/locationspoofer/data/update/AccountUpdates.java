package com.vincenthzr.locationspoofer.data.update;

import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import defpackage.a6;
import defpackage.au0;
import defpackage.b6;
import defpackage.b81;
import defpackage.fo;
import defpackage.o51;
import defpackage.xs2;
import defpackage.yo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AccountUpdates {
    public static final String CHECK_PATH = "/v2/client/updates";
    public static final AccountUpdates INSTANCE = new AccountUpdates();
    public static final String PREFERENCE_PATH = "/v2/account/beta";

    private AccountUpdates() {
    }

    private final <T> T decode(au0 au0Var) throws CloudException {
        try {
            return (T) au0Var.invoke();
        } catch (Exception unused) {
            b81.w("invalid_response");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountUpdateCatalog parse$lambda$1(JSONObject jSONObject, String str, Set set) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        if (!xs2.V(xs2.N(itKeys)).equals(yo.H0(new String[]{"schemaVersion", "betaEnabled", "catalog"}))) {
            fo.n("Check failed.");
            return null;
        }
        if (!o51.f(jSONObject.get("schemaVersion"), 1)) {
            fo.n("Check failed.");
            return null;
        }
        Object obj = jSONObject.get("betaEnabled");
        obj.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        SelfHostedUpdates.Companion companion = SelfHostedUpdates.Companion;
        JSONObject jSONObject2 = jSONObject.getJSONObject("catalog");
        jSONObject2.getClass();
        List<GithubRelease> catalog = companion.parseCatalog(jSONObject2, str, set);
        if (!zBooleanValue && (catalog == null || !catalog.isEmpty())) {
            Iterator<T> it = catalog.iterator();
            while (it.hasNext()) {
                if (((GithubRelease) it.next()).isPrerelease()) {
                    fo.n("Check failed.");
                    return null;
                }
            }
        }
        return new AccountUpdateCatalog(zBooleanValue, catalog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parsePreference$lambda$2(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        if (!xs2.V(xs2.N(itKeys)).equals(yo.H0(new String[]{"schemaVersion", "enabled"}))) {
            fo.n("Check failed.");
            return false;
        }
        if (!o51.f(jSONObject.get("schemaVersion"), 1)) {
            fo.n("Check failed.");
            return false;
        }
        Object obj = jSONObject.get("enabled");
        obj.getClass();
        return ((Boolean) obj).booleanValue();
    }

    public final AccountUpdateCatalog parse(JSONObject jSONObject, String str, Set<String> set) {
        jSONObject.getClass();
        str.getClass();
        set.getClass();
        return (AccountUpdateCatalog) decode(new a6(jSONObject, str, set, 0));
    }

    public final boolean parsePreference(JSONObject jSONObject) {
        jSONObject.getClass();
        return ((Boolean) decode(new b6(jSONObject, 0))).booleanValue();
    }
}
