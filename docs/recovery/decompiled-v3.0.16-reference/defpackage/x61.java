package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x61 implements y81 {
    public static final x61 a = new x61();
    public static final w61 b = w61.b;

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        vd0.e(w90Var);
        return new JsonArray((List) new oo(g71.a).e(w90Var));
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        jsonArray.getClass();
        vd0.f(ak0Var);
        g71 g71Var = g71.a;
        bt2 descriptor = g71Var.getDescriptor();
        descriptor.getClass();
        no noVar = new no(descriptor);
        int size = jsonArray.size();
        m30 m30VarB = ak0Var.b(noVar);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            m30VarB.r(noVar, i, g71Var, it.next());
        }
        m30VarB.a(noVar);
    }
}
