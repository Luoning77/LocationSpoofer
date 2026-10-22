package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nc3 {
    public final om0 a;
    public final lw2 b;
    public final lw c;
    public final boolean d;
    public final Map e;

    public /* synthetic */ nc3(om0 om0Var, lw2 lw2Var, lw lwVar, hd0 hd0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : om0Var, (i & 2) != 0 ? null : lw2Var, (i & 4) != 0 ? null : lwVar, (i & 8) != 0 ? null : hd0Var, (i & 32) == 0, (i & 64) != 0 ? vj0.e : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc3)) {
            return false;
        }
        nc3 nc3Var = (nc3) obj;
        return o51.f(this.a, nc3Var.a) && o51.f(this.b, nc3Var.b) && o51.f(this.c, nc3Var.c) && o51.f(null, null) && this.d == nc3Var.d && o51.f(this.e, nc3Var.e);
    }

    public final int hashCode() {
        om0 om0Var = this.a;
        int iHashCode = (om0Var == null ? 0 : om0Var.hashCode()) * 31;
        lw2 lw2Var = this.b;
        int iHashCode2 = (iHashCode + (lw2Var == null ? 0 : lw2Var.hashCode())) * 31;
        lw lwVar = this.c;
        return this.e.hashCode() + p91.e((((iHashCode2 + (lwVar == null ? 0 : lwVar.hashCode())) * 31) + 0) * 961, 31, this.d);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + ((Object) null) + ", veil=null, hold=" + this.d + ", effectsMap=" + this.e + ')';
    }

    public nc3(om0 om0Var, lw2 lw2Var, lw lwVar, hd0 hd0Var, boolean z, Map map) {
        this.a = om0Var;
        this.b = lw2Var;
        this.c = lwVar;
        this.d = z;
        this.e = map;
    }
}
