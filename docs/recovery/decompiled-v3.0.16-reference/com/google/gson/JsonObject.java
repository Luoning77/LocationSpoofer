package com.google.gson;

import defpackage.gg1;
import defpackage.gq0;
import defpackage.ig1;
import defpackage.r71;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class JsonObject extends JsonElement {
    private final ig1 members;

    public JsonObject() {
        gq0 gq0Var = ig1.m;
        this.members = new ig1(false);
    }

    public void add(String str, JsonElement jsonElement) {
        ig1 ig1Var = this.members;
        if (jsonElement == null) {
            jsonElement = r71.e;
        }
        ig1Var.put(str, jsonElement);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? r71.e : new JsonPrimitive(str2));
    }

    public Map<String, JsonElement> asMap() {
        return this.members;
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : (gg1) this.members.entrySet()) {
            jsonObject.add((String) entry.getKey(), ((JsonElement) entry.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members);
        }
        return true;
    }

    public JsonElement get(String str) {
        return (JsonElement) this.members.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        return this.members.h == 0;
    }

    public Set<String> keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String str) {
        return (JsonElement) this.members.remove(str);
    }

    public int size() {
        return this.members.h;
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? r71.e : new JsonPrimitive(number));
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? r71.e : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch) {
        add(str, ch == null ? r71.e : new JsonPrimitive(ch));
    }
}
