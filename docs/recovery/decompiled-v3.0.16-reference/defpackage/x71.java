package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class x71 implements i71, ak0, m30 {
    public final ArrayList a;
    public final t61 b;
    public final lu0 c;
    public final a71 d;
    public String e;
    public String f;
    public final /* synthetic */ int g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x71(t61 t61Var, lu0 lu0Var, int i) {
        this(t61Var, lu0Var, (char) 0);
        this.g = i;
        lu0Var.getClass();
        switch (i) {
            case 1:
                this(t61Var, lu0Var, (char) 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(t61Var, lu0Var, (char) 0);
                this.h = new ArrayList();
                break;
            default:
                this.a.add("primitive");
                break;
        }
    }

    @Override // defpackage.ak0
    public final void A(String str) {
        str.getClass();
        String str2 = (String) H();
        str2.getClass();
        I(str2, e71.b(str));
    }

    public final void B(bt2 bt2Var, int i, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        this.a.add(G(bt2Var, i));
        if (y81Var.getDescriptor().g()) {
            e(y81Var, obj);
        } else if (obj == null) {
            c();
        } else {
            e(y81Var, obj);
        }
    }

    public final void C(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        I(str, e71.a(Double.valueOf(d)));
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw ce0.a(str, Double.valueOf(d));
        }
    }

    public final void D(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        I(str, e71.a(Float.valueOf(f)));
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw ce0.a(str, Float.valueOf(f));
        }
    }

    public final ak0 E(Object obj, bt2 bt2Var) {
        String str = (String) obj;
        str.getClass();
        bt2Var.getClass();
        if (g13.a(bt2Var)) {
            return new c0(this, str);
        }
        if (bt2Var.isInline() && bt2Var.equals(e71.a)) {
            return new b0(this, str, bt2Var);
        }
        this.a.add(str);
        return this;
    }

    public JsonElement F() {
        switch (this.g) {
            case 0:
                JsonElement jsonElement = (JsonElement) this.h;
                if (jsonElement != null) {
                    return jsonElement;
                }
                fo.i("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new JsonObject((LinkedHashMap) this.h);
            default:
                return new JsonArray((ArrayList) this.h);
        }
    }

    public final String G(bt2 bt2Var, int i) {
        String strValueOf;
        bt2Var.getClass();
        int i2 = this.g;
        bt2Var.getClass();
        switch (i2) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                ym3.J(this.b, bt2Var);
                strValueOf = bt2Var.e(i);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public final Object H() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new x31("No tag in stack for requested element");
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public void I(String str, JsonElement jsonElement) {
        int i = this.g;
        str.getClass();
        jsonElement.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    fo.i("This output can only consume primitives with 'primitive' tag");
                } else if (((JsonElement) this.h) != null) {
                    fo.i("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.h = jsonElement;
                    this.c.invoke(jsonElement);
                }
                break;
            case 1:
                ((LinkedHashMap) this.h).put(str, jsonElement);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), jsonElement);
                break;
        }
    }

    @Override // defpackage.m30
    public final void a(bt2 bt2Var) {
        bt2Var.getClass();
        if (!this.a.isEmpty()) {
            H();
        }
        this.c.invoke(F());
    }

    @Override // defpackage.ak0
    public final m30 b(bt2 bt2Var) {
        x71 x71Var;
        bt2Var.getClass();
        lu0 tVar = zy.u0(this.a) == null ? this.c : new t(this, 1);
        mh0 mh0VarC = bt2Var.c();
        boolean zF = o51.f(mh0VarC, u13.f);
        t61 t61Var = this.b;
        if (zF || (mh0VarC instanceof ja2)) {
            x71Var = new x71(t61Var, tVar, 2);
        } else if (o51.f(mh0VarC, u13.g)) {
            bt2 bt2VarC = v83.c(bt2Var.i(0), t61Var.b);
            mh0 mh0VarC2 = bt2VarC.c();
            if (!(mh0VarC2 instanceof bc2) && !o51.f(mh0VarC2, ft2.e)) {
                throw ce0.b(bt2VarC);
            }
            tVar.getClass();
            a81 a81Var = new a81(t61Var, tVar, 1);
            a81Var.j = true;
            x71Var = a81Var;
        } else {
            x71Var = new x71(t61Var, tVar, 1);
        }
        String str = this.e;
        if (str != null) {
            if (x71Var instanceof a81) {
                a81 a81Var2 = (a81) x71Var;
                a81Var2.I("key", e71.b(str));
                String strB = this.f;
                if (strB == null) {
                    strB = bt2Var.b();
                }
                a81Var2.I("value", e71.b(strB));
            } else {
                String strB2 = this.f;
                if (strB2 == null) {
                    strB2 = bt2Var.b();
                }
                x71Var.I(str, e71.b(strB2));
            }
            this.e = null;
            this.f = null;
        }
        return x71Var;
    }

    @Override // defpackage.ak0
    public final void c() {
        String str = (String) zy.u0(this.a);
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            I(str, JsonNull.INSTANCE);
        }
    }

    @Override // defpackage.m30
    public final boolean d(bt2 bt2Var) {
        bt2Var.getClass();
        return this.d.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    @Override // defpackage.ak0
    public final void e(y81 y81Var, Object obj) {
        String strL;
        y81Var.getClass();
        Object objU0 = zy.u0(this.a);
        t61 t61Var = this.b;
        if (objU0 == null) {
            bt2 bt2VarC = v83.c(y81Var.getDescriptor(), t61Var.b);
            if ((bt2VarC.c() instanceof bc2) || bt2VarC.c() == ft2.e) {
                new x71(t61Var, this.c, 0).e(y81Var, obj);
                return;
            }
        }
        boolean z = y81Var instanceof p0;
        nx nxVar = t61Var.a.j;
        if (!z) {
            int iOrdinal = nxVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    mh0 mh0VarC = y81Var.getDescriptor().c();
                    if (o51.f(mh0VarC, u13.e) || o51.f(mh0VarC, u13.h)) {
                        strL = vd0.l(t61Var, y81Var.getDescriptor());
                    }
                } else if (iOrdinal != 2) {
                    b81.d();
                    return;
                }
            }
            strL = null;
        } else if (nxVar != nx.e) {
            strL = vd0.l(t61Var, y81Var.getDescriptor());
        } else {
            strL = null;
        }
        if (z) {
            p91.x(y81Var);
            obj.getClass();
            throw null;
        }
        if (strL != null) {
            vd0.j(t61Var, y81Var, y81Var, strL);
            vd0.k(y81Var.getDescriptor().c());
            String strB = y81Var.getDescriptor().b();
            this.e = strL;
            this.f = strB;
        }
        y81Var.serialize(this, obj);
    }

    @Override // defpackage.m30
    public final void f(zb2 zb2Var, int i, short s) {
        I(G(zb2Var, i), e71.a(Short.valueOf(s)));
    }

    @Override // defpackage.ak0
    public final void g(double d) {
        C(H(), d);
    }

    @Override // defpackage.ak0
    public final void h(short s) {
        String str = (String) H();
        str.getClass();
        I(str, e71.a(Short.valueOf(s)));
    }

    @Override // defpackage.m30
    public final void i(int i, int i2, bt2 bt2Var) {
        bt2Var.getClass();
        I(G(bt2Var, i), e71.a(Integer.valueOf(i2)));
    }

    @Override // defpackage.m30
    public final void j(bt2 bt2Var, int i, long j) {
        bt2Var.getClass();
        I(G(bt2Var, i), e71.a(Long.valueOf(j)));
    }

    @Override // defpackage.ak0
    public final void k(byte b) {
        String str = (String) H();
        str.getClass();
        I(str, e71.a(Byte.valueOf(b)));
    }

    @Override // defpackage.ak0
    public final void l(boolean z) {
        String str = (String) H();
        str.getClass();
        Boolean boolValueOf = Boolean.valueOf(z);
        l21 l21Var = e71.a;
        I(str, new o71(boolValueOf, false, null));
    }

    @Override // defpackage.ak0
    public final ak0 m(bt2 bt2Var) {
        bt2Var.getClass();
        if (zy.u0(this.a) == null) {
            return new x71(this.b, this.c, 0).m(bt2Var);
        }
        if (this.e != null) {
            this.f = bt2Var.b();
        }
        return E(H(), bt2Var);
    }

    @Override // defpackage.m30
    public final void n(bt2 bt2Var, int i, String str) {
        bt2Var.getClass();
        str.getClass();
        I(G(bt2Var, i), e71.b(str));
    }

    @Override // defpackage.m30
    public final void o(bt2 bt2Var, int i, boolean z) {
        bt2Var.getClass();
        String strG = G(bt2Var, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        l21 l21Var = e71.a;
        I(strG, new o71(boolValueOf, false, null));
    }

    @Override // defpackage.m30
    public final void p(zb2 zb2Var, int i, char c) {
        I(G(zb2Var, i), e71.b(String.valueOf(c)));
    }

    @Override // defpackage.ak0
    public final void q(int i) {
        String str = (String) H();
        str.getClass();
        I(str, e71.a(Integer.valueOf(i)));
    }

    @Override // defpackage.m30
    public final void r(bt2 bt2Var, int i, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        this.a.add(G(bt2Var, i));
        e(y81Var, obj);
    }

    @Override // defpackage.ak0
    public final void s(float f) {
        D(H(), f);
    }

    @Override // defpackage.m30
    public final void t(bt2 bt2Var, int i, double d) {
        bt2Var.getClass();
        C(G(bt2Var, i), d);
    }

    @Override // defpackage.m30
    public void u(bt2 bt2Var, int i, y81 y81Var, Object obj) {
        switch (this.g) {
            case 1:
                bt2Var.getClass();
                y81Var.getClass();
                if (obj != null || this.d.e) {
                    B(bt2Var, i, y81Var, obj);
                }
                break;
            default:
                B(bt2Var, i, y81Var, obj);
                break;
        }
    }

    @Override // defpackage.ak0
    public final void v(long j) {
        String str = (String) H();
        str.getClass();
        I(str, e71.a(Long.valueOf(j)));
    }

    @Override // defpackage.m30
    public final void w(zb2 zb2Var, int i, byte b) {
        I(G(zb2Var, i), e71.a(Byte.valueOf(b)));
    }

    @Override // defpackage.ak0
    public final void x(char c) {
        String str = (String) H();
        str.getClass();
        I(str, e71.b(String.valueOf(c)));
    }

    @Override // defpackage.m30
    public final ak0 y(zb2 zb2Var, int i) {
        return E(G(zb2Var, i), zb2Var.i(i));
    }

    @Override // defpackage.m30
    public final void z(zb2 zb2Var, int i, float f) {
        D(G(zb2Var, i), f);
    }

    public x71(t61 t61Var, lu0 lu0Var, char c) {
        this.a = new ArrayList();
        this.b = t61Var;
        this.c = lu0Var;
        this.d = t61Var.a;
    }
}
