package org.maplibre.geojson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import defpackage.az2;
import defpackage.b81;
import defpackage.i81;
import defpackage.rd3;
import defpackage.u61;
import defpackage.xp;
import defpackage.z71;
import defpackage.zw0;
import java.io.IOException;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Feature implements GeoJson {
    private static final String TYPE = "Feature";

    @u61(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final Geometry geometry;
    private final String id;
    private final JsonObject properties;
    private final String type;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GsonTypeAdapter extends rd3 {
        private volatile rd3 boundingBoxTypeAdapter;
        private volatile rd3 geometryTypeAdapter;
        private final zw0 gson;
        private volatile rd3 jsonObjectTypeAdapter;
        private volatile rd3 stringTypeAdapter;

        public GsonTypeAdapter(zw0 zw0Var) {
            this.gson = zw0Var;
        }

        @Override // defpackage.rd3
        public Feature read(z71 z71Var) throws IOException {
            if (z71Var.u0() == 9) {
                z71Var.q0();
                return null;
            }
            z71Var.F();
            String str = null;
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            JsonObject jsonObject = null;
            while (z71Var.h0()) {
                String strO0 = z71Var.o0();
                if (z71Var.u0() != 9) {
                    strO0.getClass();
                    switch (strO0) {
                        case "properties":
                            rd3 rd3VarF = this.jsonObjectTypeAdapter;
                            if (rd3VarF == null) {
                                rd3VarF = az2.f(this.gson, JsonObject.class);
                                this.jsonObjectTypeAdapter = rd3VarF;
                            }
                            jsonObject = (JsonObject) rd3VarF.read(z71Var);
                            break;
                        case "id":
                            rd3 rd3VarF2 = this.stringTypeAdapter;
                            if (rd3VarF2 == null) {
                                rd3VarF2 = az2.f(this.gson, String.class);
                                this.stringTypeAdapter = rd3VarF2;
                            }
                            str2 = (String) rd3VarF2.read(z71Var);
                            break;
                        case "bbox":
                            rd3 rd3VarF3 = this.boundingBoxTypeAdapter;
                            if (rd3VarF3 == null) {
                                rd3VarF3 = az2.f(this.gson, BoundingBox.class);
                                this.boundingBoxTypeAdapter = rd3VarF3;
                            }
                            boundingBox = (BoundingBox) rd3VarF3.read(z71Var);
                            break;
                        case "type":
                            rd3 rd3VarF4 = this.stringTypeAdapter;
                            if (rd3VarF4 == null) {
                                rd3VarF4 = az2.f(this.gson, String.class);
                                this.stringTypeAdapter = rd3VarF4;
                            }
                            str = (String) rd3VarF4.read(z71Var);
                            break;
                        case "geometry":
                            rd3 rd3VarF5 = this.geometryTypeAdapter;
                            if (rd3VarF5 == null) {
                                rd3VarF5 = az2.f(this.gson, Geometry.class);
                                this.geometryTypeAdapter = rd3VarF5;
                            }
                            geometry = (Geometry) rd3VarF5.read(z71Var);
                            break;
                        default:
                            z71Var.A0();
                            break;
                    }
                } else {
                    z71Var.q0();
                }
            }
            z71Var.c0();
            return new Feature(str, boundingBox, str2, geometry, jsonObject);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, Feature feature) throws IOException {
            if (feature == null) {
                i81Var.f0();
                return;
            }
            i81Var.O();
            i81Var.d0("type");
            rd3 rd3VarF = this.stringTypeAdapter;
            if (rd3VarF == null) {
                rd3VarF = az2.f(this.gson, String.class);
                this.stringTypeAdapter = rd3VarF;
            }
            rd3VarF.write(i81Var, feature.type());
            i81Var.d0("bbox");
            if (feature.bbox() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF2 = this.boundingBoxTypeAdapter;
                if (rd3VarF2 == null) {
                    rd3VarF2 = az2.f(this.gson, BoundingBox.class);
                    this.boundingBoxTypeAdapter = rd3VarF2;
                }
                rd3VarF2.write(i81Var, feature.bbox());
            }
            i81Var.d0("id");
            if (feature.id() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF3 = this.stringTypeAdapter;
                if (rd3VarF3 == null) {
                    rd3VarF3 = az2.f(this.gson, String.class);
                    this.stringTypeAdapter = rd3VarF3;
                }
                rd3VarF3.write(i81Var, feature.id());
            }
            i81Var.d0("geometry");
            if (feature.geometry() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF4 = this.geometryTypeAdapter;
                if (rd3VarF4 == null) {
                    rd3VarF4 = az2.f(this.gson, Geometry.class);
                    this.geometryTypeAdapter = rd3VarF4;
                }
                rd3VarF4.write(i81Var, feature.geometry());
            }
            i81Var.d0("properties");
            if (feature.properties == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF5 = this.jsonObjectTypeAdapter;
                if (rd3VarF5 == null) {
                    rd3VarF5 = az2.f(this.gson, JsonObject.class);
                    this.jsonObjectTypeAdapter = rd3VarF5;
                }
                rd3VarF5.write(i81Var, feature.properties());
            }
            i81Var.c0();
        }
    }

    public Feature(String str, BoundingBox boundingBox, String str2, Geometry geometry, JsonObject jsonObject) {
        if (str == null) {
            b81.k("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        this.id = str2;
        this.geometry = geometry;
        this.properties = jsonObject;
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, null, geometry, jsonObject);
    }

    public static Feature fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        xpVar.p(GeometryAdapterFactory.create());
        Feature feature = (Feature) xpVar.g().b(Feature.class, str);
        return feature.properties != null ? feature : new Feature(TYPE, feature.bbox(), feature.id(), feature.geometry(), new JsonObject());
    }

    public static rd3 typeAdapter(zw0 zw0Var) {
        return new GsonTypeAdapter(zw0Var);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        properties().addProperty(str, ch);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    @Override // org.maplibre.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        String str;
        Geometry geometry;
        JsonObject jsonObject;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (this.type.equals(feature.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(feature.bbox()) : feature.bbox() == null) && ((str = this.id) != null ? str.equals(feature.id()) : feature.id() == null) && ((geometry = this.geometry) != null ? geometry.equals(feature.geometry()) : feature.geometry() == null) && ((jsonObject = this.properties) != null ? jsonObject.equals(feature.properties()) : feature.properties == null)) {
                return true;
            }
        }
        return false;
    }

    public Geometry geometry() {
        return this.geometry;
    }

    public Boolean getBooleanProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Boolean.valueOf(jsonElement.getAsBoolean());
    }

    @Deprecated
    public Character getCharacterProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Character.valueOf(jsonElement.getAsCharacter());
    }

    public Number getNumberProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = (iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        String str = this.id;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Geometry geometry = this.geometry;
        int iHashCode4 = (iHashCode3 ^ (geometry == null ? 0 : geometry.hashCode())) * 1000003;
        JsonObject jsonObject = this.properties;
        return iHashCode4 ^ (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String id() {
        return this.id;
    }

    public JsonObject properties() {
        return this.properties;
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    @Override // org.maplibre.geojson.GeoJson
    public String toJson() {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        xpVar.p(GeometryAdapterFactory.create());
        zw0 zw0VarG = xpVar.g();
        if (properties().size() == 0) {
            this = new Feature(TYPE, bbox(), id(), geometry(), null);
        }
        return zw0VarG.f(this);
    }

    public String toString() {
        return "Feature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.id + ", geometry=" + this.geometry + ", properties=" + this.properties + "}";
    }

    @Override // org.maplibre.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static Feature fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new Feature(TYPE, boundingBox, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(Geometry geometry) {
        return new Feature(TYPE, null, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, str, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, str, geometry, jsonObject);
    }
}
