package defpackage;

import com.google.gson.JsonElement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r71 extends JsonElement {
    public static final r71 e = new r71();

    @Override // com.google.gson.JsonElement
    public final JsonElement deepCopy() {
        return e;
    }

    public final boolean equals(Object obj) {
        return obj instanceof r71;
    }

    public final int hashCode() {
        return r71.class.hashCode();
    }
}
