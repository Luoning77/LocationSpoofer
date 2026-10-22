package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y71 implements y81 {
    public static final y71 a = new y71();
    public static final dt2 b;

    static {
        bc2 bc2Var = bc2.m;
        bt2[] bt2VarArr = new bt2[0];
        if (l13.k0("kotlinx.serialization.json.JsonPrimitive")) {
            fo.i("Blank serial names are prohibited");
        } else if (bc2Var == u13.e) {
            fo.i("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        } else {
            px pxVar = new px("kotlinx.serialization.json.JsonPrimitive");
            b = new dt2("kotlinx.serialization.json.JsonPrimitive", bc2Var, pxVar.b.size(), yo.F0(bt2VarArr), pxVar);
        }
    }

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        e13 e13VarE = vd0.e(w90Var);
        JsonElement jsonElementI0 = e13VarE.i0();
        if (jsonElementI0 instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementI0;
        }
        throw new c71(ce0.t("Unexpected JSON element, expected JsonPrimitive, had " + xe2.a(jsonElementI0.getClass()), null, -1, null, e13VarE.j0().a.k ? ce0.J(jsonElementI0.toString(), -1).toString() : null));
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        jsonPrimitive.getClass();
        vd0.f(ak0Var);
        if (jsonPrimitive instanceof JsonNull) {
            ak0Var.e(s71.a, JsonNull.INSTANCE);
        } else {
            ak0Var.e(p71.a, (o71) jsonPrimitive);
        }
    }
}
