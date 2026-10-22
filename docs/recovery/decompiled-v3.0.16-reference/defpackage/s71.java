package defpackage;

import kotlinx.serialization.json.JsonNull;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s71 implements y81 {
    public static final s71 a = new s71();
    public static final dt2 b;

    static {
        bt2[] bt2VarArr = new bt2[0];
        if (l13.k0("kotlinx.serialization.json.JsonNull")) {
            fo.i("Blank serial names are prohibited");
            return;
        }
        u13 u13Var = u13.e;
        ft2 ft2Var = ft2.e;
        if (ft2Var == u13Var) {
            fo.i("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        } else {
            px pxVar = new px("kotlinx.serialization.json.JsonNull");
            b = new dt2("kotlinx.serialization.json.JsonNull", ft2Var, pxVar.b.size(), yo.F0(bt2VarArr), pxVar);
        }
    }

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        vd0.e(w90Var);
        if (w90Var.g()) {
            throw new c71(ce0.t("Expected 'null' literal", null, -1, null, null));
        }
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        ((JsonNull) obj).getClass();
        vd0.f(ak0Var);
        ak0Var.c();
    }
}
