package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudClientContent;
import com.vincenthzr.locationspoofer.data.update.AccountUpdates;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class b6 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ JSONObject f;

    public /* synthetic */ b6(JSONObject jSONObject, int i) {
        this.e = i;
        this.f = jSONObject;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        JSONObject jSONObject = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(AccountUpdates.parsePreference$lambda$2(jSONObject));
            case 1:
                return CloudClientContent.Companion.parseAdaptation$lambda$7(jSONObject);
            default:
                return CloudClientContent.Companion.parseReleases$lambda$6(jSONObject);
        }
    }
}
