package org.maplibre.geojson.internal.typeadapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.fo;
import defpackage.i81;
import defpackage.iv;
import defpackage.l71;
import defpackage.p02;
import defpackage.qn1;
import defpackage.r71;
import defpackage.rd3;
import defpackage.sd3;
import defpackage.wd3;
import defpackage.z71;
import defpackage.zd3;
import defpackage.zw0;
import java.io.EOFException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements sd3 {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    @Override // defpackage.sd3
    public <R> rd3 create(zw0 zw0Var, zd3 zd3Var) {
        if (zd3Var.a != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            rd3 rd3VarD = zw0Var.d(this, new zd3(entry.getValue()));
            linkedHashMap.put(entry.getKey(), rd3VarD);
            linkedHashMap2.put(entry.getValue(), rd3VarD);
        }
        return new rd3() { // from class: org.maplibre.geojson.internal.typeadapters.RuntimeTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r3v13, types: [R, java.lang.Object] */
            @Override // defpackage.rd3
            public R read(z71 z71Var) {
                boolean z;
                JsonElement jsonElement;
                try {
                    try {
                        z71Var.u0();
                        z = false;
                        try {
                            jsonElement = (JsonElement) wd3.z.read(z71Var);
                        } catch (EOFException e) {
                            e = e;
                            if (!z) {
                                throw new l71(e);
                            }
                            jsonElement = r71.e;
                        }
                    } catch (EOFException e2) {
                        e = e2;
                        z = true;
                    }
                    JsonElement jsonElementRemove = RuntimeTypeAdapterFactory.this.maintainType ? jsonElement.getAsJsonObject().get(RuntimeTypeAdapterFactory.this.typeFieldName) : jsonElement.getAsJsonObject().remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                    if (jsonElementRemove == null) {
                        StringBuilder sb = new StringBuilder("cannot deserialize ");
                        sb.append(RuntimeTypeAdapterFactory.this.baseType);
                        String str = RuntimeTypeAdapterFactory.this.typeFieldName;
                        sb.append(" because it does not define a field named ");
                        sb.append(str);
                        throw new iv(sb.toString());
                    }
                    String asString = jsonElementRemove.getAsString();
                    rd3 rd3Var = (rd3) linkedHashMap.get(asString);
                    if (rd3Var != null) {
                        return rd3Var.fromJsonTree(jsonElement);
                    }
                    throw new iv("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + asString + "; did you forget to register a subtype?");
                } catch (qn1 e3) {
                    throw new l71(e3);
                } catch (IOException e4) {
                    throw new l71(e4);
                } catch (NumberFormatException e5) {
                    throw new l71(e5);
                }
            }

            @Override // defpackage.rd3
            public void write(i81 i81Var, R r) {
                Class<?> cls = r.getClass();
                rd3 rd3Var = (rd3) linkedHashMap2.get(cls);
                if (rd3Var == null) {
                    throw new iv("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                JsonObject asJsonObject = rd3Var.toJsonTree(r).getAsJsonObject();
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    wd3.z.getClass();
                    p02.b(i81Var, asJsonObject);
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (asJsonObject.has(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    throw new iv("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                jsonObject.add(RuntimeTypeAdapterFactory.this.typeFieldName, new JsonPrimitive((String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls)));
                for (Map.Entry<String, JsonElement> entry2 : asJsonObject.entrySet()) {
                    jsonObject.add(entry2.getKey(), entry2.getValue());
                }
                wd3.z.getClass();
                p02.b(i81Var, jsonObject);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            fo.i("types and labels must be unique");
            return null;
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
