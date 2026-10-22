package defpackage;

import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o71 extends JsonPrimitive {
    public final boolean e;
    public final bt2 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o71(Object obj, boolean z, bt2 bt2Var) {
        super(null);
        obj.getClass();
        this.e = z;
        this.f = bt2Var;
        this.g = obj.toString();
        if (bt2Var == null || bt2Var.isInline()) {
            return;
        }
        fo.i("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o71.class != obj.getClass()) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return this.e == o71Var.e && o51.f(this.g, o71Var.g);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + (Boolean.hashCode(this.e) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean isString() {
        return this.e;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.e;
        String str = this.g;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        i13.a(sb, str);
        return sb.toString();
    }
}
