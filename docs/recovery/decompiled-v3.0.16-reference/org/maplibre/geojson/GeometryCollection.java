package org.maplibre.geojson;

import defpackage.az2;
import defpackage.b81;
import defpackage.i81;
import defpackage.rd3;
import defpackage.xp;
import defpackage.z71;
import defpackage.zd3;
import defpackage.zw0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class GeometryCollection implements Geometry {
    private static final String TYPE = "GeometryCollection";
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GsonTypeAdapter extends rd3 {
        private volatile rd3 boundingBoxTypeAdapter;
        private final zw0 gson;
        private volatile rd3 listGeometryAdapter;
        private volatile rd3 stringTypeAdapter;

        public GsonTypeAdapter(zw0 zw0Var) {
            this.gson = zw0Var;
        }

        @Override // defpackage.rd3
        public GeometryCollection read(z71 z71Var) throws IOException {
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
                        case "bbox":
                            rd3 rd3VarF = this.boundingBoxTypeAdapter;
                            if (rd3VarF == null) {
                                rd3VarF = az2.f(this.gson, BoundingBox.class);
                                this.boundingBoxTypeAdapter = rd3VarF;
                            }
                            boundingBox = (BoundingBox) rd3VarF.read(z71Var);
                            break;
                        case "type":
                            rd3 rd3VarF2 = this.stringTypeAdapter;
                            if (rd3VarF2 == null) {
                                rd3VarF2 = az2.f(this.gson, String.class);
                                this.stringTypeAdapter = rd3VarF2;
                            }
                            str = (String) rd3VarF2.read(z71Var);
                            break;
                        case "geometries":
                            rd3 rd3VarC = this.listGeometryAdapter;
                            if (rd3VarC == null) {
                                rd3VarC = this.gson.c(zd3.a(Geometry.class));
                                this.listGeometryAdapter = rd3VarC;
                            }
                            list = (List) rd3VarC.read(z71Var);
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
            if (str == null) {
                str = GeometryCollection.TYPE;
            }
            return new GeometryCollection(str, boundingBox, list);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, GeometryCollection geometryCollection) throws IOException {
            if (geometryCollection == null) {
                i81Var.f0();
                return;
            }
            i81Var.O();
            i81Var.d0("type");
            if (geometryCollection.type() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF = this.stringTypeAdapter;
                if (rd3VarF == null) {
                    rd3VarF = az2.f(this.gson, String.class);
                    this.stringTypeAdapter = rd3VarF;
                }
                rd3VarF.write(i81Var, geometryCollection.type());
            }
            i81Var.d0("bbox");
            if (geometryCollection.bbox() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarF2 = this.boundingBoxTypeAdapter;
                if (rd3VarF2 == null) {
                    rd3VarF2 = az2.f(this.gson, BoundingBox.class);
                    this.boundingBoxTypeAdapter = rd3VarF2;
                }
                rd3VarF2.write(i81Var, geometryCollection.bbox());
            }
            i81Var.d0("geometries");
            if (geometryCollection.geometries() == null) {
                i81Var.f0();
            } else {
                rd3 rd3VarC = this.listGeometryAdapter;
                if (rd3VarC == null) {
                    rd3VarC = this.gson.c(zd3.a(Geometry.class));
                    this.listGeometryAdapter = rd3VarC;
                }
                rd3VarC.write(i81Var, geometryCollection.geometries());
            }
            i81Var.c0();
        }
    }

    public GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        if (str == null) {
            b81.k("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list != null) {
            this.geometries = list;
        } else {
            b81.k("Null geometries");
            throw null;
        }
    }

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new GeometryCollection(TYPE, null, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry) {
        return new GeometryCollection(TYPE, null, Arrays.asList(geometry));
    }

    public static GeometryCollection fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        xpVar.p(GeometryAdapterFactory.create());
        return (GeometryCollection) xpVar.g().b(GeometryCollection.class, str);
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof GeometryCollection) {
            GeometryCollection geometryCollection = (GeometryCollection) obj;
            if (this.type.equals(geometryCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(geometryCollection.bbox()) : geometryCollection.bbox() == null) && this.geometries.equals(geometryCollection.geometries())) {
                return true;
            }
        }
        return false;
    }

    public List<Geometry> geometries() {
        return this.geometries;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return this.geometries.hashCode() ^ ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003);
    }

    @Override // org.maplibre.geojson.GeoJson
    public String toJson() {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        xpVar.p(GeometryAdapterFactory.create());
        return xpVar.g().f(this);
    }

    public String toString() {
        return "GeometryCollection{type=" + this.type + ", bbox=" + this.bbox + ", geometries=" + this.geometries + "}";
    }

    @Override // org.maplibre.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static GeometryCollection fromGeometries(List<Geometry> list, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, Arrays.asList(geometry));
    }
}
