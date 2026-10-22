package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class e71 {
    public static final l21 a = ig0.b(k13.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final JsonPrimitive a(Number number) {
        return new o71(number, false, null);
    }

    public static final JsonPrimitive b(String str) {
        return str == null ? JsonNull.INSTANCE : new o71(str, true, null);
    }

    public static final void c(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + xe2.a(jsonElement.getClass()) + " is not a " + str);
    }

    public static final JsonArray d(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        c("JsonArray", jsonElement);
        throw null;
    }

    public static final JsonObject e(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        c("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive f(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        c("JsonPrimitive", jsonElement);
        throw null;
    }

    public static final long g(JsonPrimitive jsonPrimitive) {
        try {
            return h(jsonPrimitive);
        } catch (c71 e) {
            throw new NumberFormatException(e.e);
        }
    }

    public static final long h(JsonPrimitive jsonPrimitive) {
        fk fkVarN = ee0.n(t61.d, jsonPrimitive.getContent());
        String str = (String) fkVarN.g;
        long jI = fkVarN.i();
        if (fkVarN.f() == 10) {
            return jI;
        }
        int i = fkVarN.b;
        int i2 = i > 0 ? i - 1 : i;
        fk.n(fkVarN, az2.k("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, 4);
        throw null;
    }
}
