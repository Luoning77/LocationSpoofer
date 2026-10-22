package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f implements uj3 {
    public boolean a;
    public int b;
    public final Object c;

    public f(a71 a71Var, fk fkVar) {
        this.c = fkVar;
        this.a = a71Var.c;
    }

    @Override // defpackage.uj3
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.j = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.uj3
    public void b() {
        this.a = true;
    }

    @Override // defpackage.uj3
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    public JsonElement d() {
        JsonElement jsonObject;
        Object obj;
        fk fkVar = (fk) this.c;
        byte bU = fkVar.u();
        if (bU == 1) {
            return g(true);
        }
        if (bU == 0) {
            return g(false);
        }
        if (bU != 6) {
            if (bU == 8) {
                return e();
            }
            fk.n(fkVar, "Cannot read Json element because of unexpected ".concat(n51.y(bU)), 0, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            d81 d81Var = new d81(this, null);
            y90 y90Var = new y90();
            y90Var.e = d81Var;
            y90Var.f = y90Var;
            z70 z70Var = ji2.m;
            y90Var.g = z70Var;
            while (true) {
                obj = y90Var.g;
                q60 q60Var = y90Var.f;
                if (q60Var == null) {
                    break;
                }
                if (o51.f(z70Var, obj)) {
                    try {
                        d81 d81Var2 = y90Var.e;
                        da0.o(3, d81Var2);
                        d81 d81Var3 = new d81(d81Var2.g, q60Var);
                        d81Var3.f = y90Var;
                        Object objInvokeSuspend = d81Var3.invokeSuspend(mf3.a);
                        if (objInvokeSuspend != z70.e) {
                            q60Var.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        q60Var.resumeWith(new wg2(th));
                    }
                } else {
                    y90Var.g = z70Var;
                    q60Var.resumeWith(obj);
                }
            }
            ee0.J(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bG = fkVar.g((byte) 6);
            if (fkVar.u() == 4) {
                fk.n(fkVar, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (fkVar.c()) {
                String strK = this.a ? fkVar.k() : fkVar.j();
                fkVar.g((byte) 5);
                linkedHashMap.put(strK, d());
                bG = fkVar.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    fk.n(fkVar, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                fkVar.g((byte) 7);
            } else if (bG == 4) {
                ce0.F(fkVar, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.b--;
        return jsonObject;
    }

    public JsonArray e() {
        fk fkVar = (fk) this.c;
        byte bF = fkVar.f();
        if (fkVar.u() == 4) {
            fk.n(fkVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (fkVar.c()) {
            arrayList.add(d());
            bF = fkVar.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = fkVar.b;
                if (!z) {
                    fk.n(fkVar, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            fkVar.g((byte) 9);
        } else if (bF == 4) {
            ce0.F(fkVar, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f(y90 y90Var, oq oqVar) {
        e81 e81Var;
        LinkedHashMap linkedHashMap;
        y90 y90Var2;
        byte bF;
        f fVar;
        fk fkVar;
        fk fkVar2 = (fk) this.c;
        if (oqVar instanceof e81) {
            e81Var = (e81) oqVar;
            int i = e81Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                e81Var.l = i - Integer.MIN_VALUE;
            } else {
                e81Var = new e81(this, oqVar);
            }
        } else {
            e81Var = new e81(this, oqVar);
        }
        Object obj = e81Var.j;
        int i2 = e81Var.l;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = e81Var.i;
            String str = e81Var.h;
            linkedHashMap = e81Var.g;
            fVar = e81Var.f;
            y90Var2 = e81Var.e;
            ee0.J(obj);
            linkedHashMap.put(str, (JsonElement) obj);
            bF = ((fk) fVar.c).f();
            if (bF == 4) {
                i3 = i4;
                this = fVar;
            } else if (bF != 7) {
                fk.n((fk) fVar.c, "Expected end of the object or comma", 0, 6);
                throw null;
            }
            fkVar = (fk) fVar.c;
            if (bF == 6) {
                fkVar.g((byte) 7);
            } else if (bF == 4) {
                ce0.F(fkVar, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap);
        }
        ee0.J(obj);
        byte bG = fkVar2.g((byte) 6);
        if (fkVar2.u() == 4) {
            fk.n(fkVar2, "Unexpected leading comma", 0, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        y90Var2 = y90Var;
        bF = bG;
        fk fkVar3 = (fk) this.c;
        if (!fkVar3.c()) {
            fVar = this;
            fkVar = (fk) fVar.c;
            if (bF == 6) {
                fkVar.g((byte) 7);
            } else if (bF == 4) {
                ce0.F(fkVar, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap);
        }
        String strK = this.a ? fkVar3.k() : fkVar3.j();
        fkVar3.g((byte) 5);
        e81Var.e = y90Var2;
        e81Var.f = this;
        e81Var.g = linkedHashMap;
        e81Var.h = strK;
        e81Var.i = i3;
        e81Var.l = 1;
        y90Var2.getClass();
        y90Var2.f = e81Var;
        return z70.e;
    }

    public JsonPrimitive g(boolean z) {
        fk fkVar = (fk) this.c;
        String strK = (this.a || !z) ? fkVar.k() : fkVar.j();
        return (z || !o51.f(strK, "null")) ? new o71(strK, z, null) : JsonNull.INSTANCE;
    }

    public f(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.a = false;
    }
}
