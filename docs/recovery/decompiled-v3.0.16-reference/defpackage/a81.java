package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a81 extends x71 {
    public String i;
    public boolean j;

    @Override // defpackage.x71
    public final JsonElement F() {
        return new JsonObject((LinkedHashMap) this.h);
    }

    @Override // defpackage.x71
    public final void I(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                o51.F("tag");
                throw null;
            }
            linkedHashMap.put(str2, jsonElement);
            this.j = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.i = ((JsonPrimitive) jsonElement).getContent();
            this.j = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw ce0.b(v71.b);
            }
            if (jsonElement instanceof JsonArray) {
                throw ce0.b(x61.b);
            }
            b81.d();
        }
    }
}
