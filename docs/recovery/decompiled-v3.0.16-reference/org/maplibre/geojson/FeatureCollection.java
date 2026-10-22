package org.maplibre.geojson;

import defpackage.az2;
import defpackage.b81;
import defpackage.i81;
import defpackage.rd3;
import defpackage.u61;
import defpackage.xp;
import defpackage.z71;
import defpackage.zd3;
import defpackage.zw0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FeatureCollection implements GeoJson {
    private static final String TYPE = "FeatureCollection";

    @u61(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GsonTypeAdapter extends rd3 {
        private volatile rd3 boundingBoxAdapter;
        private final zw0 gson;
        private volatile rd3 listFeatureAdapter;
        private volatile rd3 stringAdapter;

        public GsonTypeAdapter(zw0 zw0Var) {
            this.gson = zw0Var;
        }

        @Override // defpackage.rd3
        public FeatureCollection read(z71 z71Var) throws IOException {
            String str = null;
            if (z71Var.u0() == 9) {
                z71Var.q0();
                return null;
            }
            z71Var.F();
            BoundingBox boundingBox = null;
            List list = null;
            while (z71Var.h0()) {
                String strO0 = z71Var.o0();
                if (z71Var.u0() != 9) {
                    strO0.getClass();
                    switch (strO0) {
                        case "features":
                            rd3 rd3VarC = this.listFeatureAdapter;
                            if (rd3VarC == null) {
                                rd3VarC = this.gson.c(zd3.a(Feature.class));
                                this.listFeatureAdapter = rd3VarC;
                            }
                            list = (List) rd3VarC.read(z71Var);
                            break;
                        case "bbox":
                            rd3 rd3VarF = this.boundingBoxAdapter;
                            if (rd3VarF == null) {
                                rd3VarF = az2.f(this.gson, BoundingBox.class);
                                this.boundingBoxAdapter = rd3VarF;
                            }
                            boundingBox = (BoundingBox) rd3VarF.read(z71Var);
                            break;
                        case "type":
                            rd3 rd3VarF2 = this.stringAdapter;
                            if (rd3VarF2 == null) {
                                rd3VarF2 = az2.f(this.gson, String.class);
                                this.stringAdapter = rd3VarF2;
                            }
                            str = (String) rd3VarF2.read(z71Var);
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
            return new FeatureCollection(str, boundingBox, list);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, FeatureCollection featureCollection) throws IOException {
            if (featureCollection == null) {
                i81Var.f0();
                return;
            }
            i81Var.O();
            i81Var.d0("type");
            if (featureCollection.type() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF = this.stringAdapter;
                if (rd3VarF == null) {
                    rd3VarF = az2.f(this.gson, String.class);
                    this.stringAdapter = rd3VarF;
                }
                rd3VarF.write(i81Var, featureCollection.type());
            }
            i81Var.d0("bbox");
            if (featureCollection.bbox() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF2 = this.boundingBoxAdapter;
                if (rd3VarF2 == null) {
                    rd3VarF2 = az2.f(this.gson, BoundingBox.class);
                    this.boundingBoxAdapter = rd3VarF2;
                }
                rd3VarF2.write(i81Var, featureCollection.bbox());
            }
            i81Var.d0("features");
            if (featureCollection.features() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarC = this.listFeatureAdapter;
                if (rd3VarC == null) {
                    rd3VarC = this.gson.c(zd3.a(Feature.class));
                    this.listFeatureAdapter = rd3VarC;
                }
                rd3VarC.write(i81Var, featureCollection.features());
            }
            i81Var.c0();
        }
    }

    public FeatureCollection(String str, BoundingBox boundingBox, List<Feature> list) {
        if (str == null) {
            b81.k("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        this.features = list;
    }

    public static FeatureCollection fromFeature(Feature feature) {
        return new FeatureCollection(TYPE, null, Arrays.asList(feature));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new FeatureCollection(TYPE, null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        xpVar.p(GeometryAdapterFactory.create());
        return (FeatureCollection) xpVar.g().b(FeatureCollection.class, str);
    }

    public static rd3 typeAdapter(zw0 zw0Var) {
        return new GsonTypeAdapter(zw0Var);
    }

    @Override // org.maplibre.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        List<Feature> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FeatureCollection) {
            FeatureCollection featureCollection = (FeatureCollection) obj;
            if (this.type.equals(featureCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(featureCollection.bbox()) : featureCollection.bbox() == null) && ((list = this.features) != null ? list.equals(featureCollection.features()) : featureCollection.features() == null)) {
                return true;
            }
        }
        return false;
    }

    public List<Feature> features() {
        return this.features;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = (iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        List<Feature> list = this.features;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // org.maplibre.geojson.GeoJson
    public String toJson() {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        xpVar.p(GeometryAdapterFactory.create());
        return xpVar.g().f(this);
    }

    public String toString() {
        return "FeatureCollection{type=" + this.type + ", bbox=" + this.bbox + ", features=" + this.features + "}";
    }

    @Override // org.maplibre.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new FeatureCollection(TYPE, null, list);
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(List<Feature> list, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, list);
    }

    public static FeatureCollection fromFeature(Feature feature, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(feature));
    }
}
