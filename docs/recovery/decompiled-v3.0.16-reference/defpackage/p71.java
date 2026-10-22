package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p71 implements y81 {
    public static final p71 a = new p71();
    public static final cc2 b;

    static {
        bc2 bc2Var = bc2.m;
        if (l13.k0("kotlinx.serialization.json.JsonLiteral")) {
            fo.i("Blank serial names are prohibited");
            return;
        }
        Object it = ((uo1) dc2.a.values()).iterator();
        while (((ro1) it).hasNext()) {
            y81 y81Var = (y81) ((po1) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(y81Var.getDescriptor().b())) {
                fo.i(m13.O("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + xe2.a(y81Var.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        b = new cc2("kotlinx.serialization.json.JsonLiteral", bc2Var);
    }

    @Override // defpackage.y81
    public final Object deserialize(w90 w90Var) {
        e13 e13VarE = vd0.e(w90Var);
        JsonElement jsonElementI0 = e13VarE.i0();
        if (jsonElementI0 instanceof o71) {
            return (o71) jsonElementI0;
        }
        throw new c71(ce0.t("Unexpected JSON element, expected JsonLiteral, had " + xe2.a(jsonElementI0.getClass()), null, -1, null, e13VarE.j0().a.k ? ce0.J(jsonElementI0.toString(), -1).toString() : null));
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return b;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, Object obj) {
        Boolean bool;
        o71 o71Var = (o71) obj;
        o71Var.getClass();
        String str = o71Var.g;
        vd0.f(ak0Var);
        if (o71Var.e) {
            ak0Var.A(str);
            return;
        }
        bt2 bt2Var = o71Var.f;
        if (bt2Var != null) {
            ak0Var.m(bt2Var).A(str);
            return;
        }
        Long lB0 = s13.b0(str);
        if (lB0 != null) {
            ak0Var.v(lB0.longValue());
            return;
        }
        ye3 ye3VarE = r93.e(str);
        if (ye3VarE != null) {
            ak0Var.m(cf3.b).v(ye3VarE.e);
            return;
        }
        Double dR = r13.R(str);
        if (dR != null) {
            ak0Var.g(dR.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            ak0Var.l(bool.booleanValue());
        } else {
            ak0Var.A(str);
        }
    }
}
