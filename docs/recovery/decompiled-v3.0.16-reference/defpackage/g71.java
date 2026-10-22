package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g71 implements y81 {
    public static final g71 a = new g71();
    public static final dt2 b;

    static {
        bt2[] bt2VarArr = new bt2[0];
        zs0 zs0Var = new zs0(14);
        dt2 dt2Var = null;
        if (l13.k0("kotlinx.serialization.json.JsonElement")) {
            fo.i("Blank serial names are prohibited");
        } else {
            u13 u13Var = u13.e;
            ja2 ja2Var = ja2.e;
            if (ja2Var.equals(u13Var)) {
                fo.i("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            } else {
                px pxVar = new px("kotlinx.serialization.json.JsonElement");
                zs0Var.invoke(pxVar);
                dt2Var = new dt2("kotlinx.serialization.json.JsonElement", ja2Var, pxVar.b.size(), yo.F0(bt2VarArr), pxVar);
            }
        }
        b = dt2Var;
    }

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        return vd0.e(w90Var).i0();
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        jsonElement.getClass();
        vd0.f(ak0Var);
        if (jsonElement instanceof JsonPrimitive) {
            ak0Var.e(y71.a, jsonElement);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            ak0Var.e(v71.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            ak0Var.e(x61.a, jsonElement);
        } else {
            b81.d();
        }
    }
}
