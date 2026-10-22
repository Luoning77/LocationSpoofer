package kotlinx.serialization.json;

import defpackage.ca0;
import defpackage.w71;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final w71 Companion = new w71();

    private JsonPrimitive() {
        super(null);
    }

    public abstract String getContent();

    public abstract boolean isString();

    public String toString() {
        return getContent();
    }

    public /* synthetic */ JsonPrimitive(ca0 ca0Var) {
        this();
    }
}
