package defpackage;

import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v71 implements y81 {
    public static final v71 a = new v71();
    public static final u71 b = u71.b;

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        vd0.e(w90Var);
        k13 k13Var = k13.a;
        return new JsonObject((Map) new eg1(g71.a).e(w90Var));
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        jsonObject.getClass();
        vd0.f(ak0Var);
        k13 k13Var = k13.a;
        new eg1(g71.a).serialize(ak0Var, jsonObject);
    }
}
