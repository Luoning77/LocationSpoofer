package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class gm1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ we2 f;

    public /* synthetic */ gm1(int i, we2 we2Var) {
        this.e = i;
        this.f = we2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        we2 we2Var = this.f;
        switch (i) {
            case 0:
                CompleteLocation completeLocation = (CompleteLocation) obj;
                completeLocation.getClass();
                return Boolean.valueOf(completeLocation.getLocation().getId() == ((CompleteLocation) we2Var.e).getLocation().getId());
            case 1:
                tc3 tc3Var = (tc3) obj;
                tc3Var.getClass();
                wc1 wc1Var = ((vc3) tc3Var).s;
                List listI = (List) we2Var.e;
                if (listI != null) {
                    listI.add(wc1Var);
                } else {
                    listI = am1.I(wc1Var);
                }
                we2Var.e = listI;
                return sc3.f;
            default:
                JsonElement jsonElement = (JsonElement) obj;
                jsonElement.getClass();
                we2Var.e = jsonElement;
                return mf3.a;
        }
    }
}
