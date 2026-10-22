package org.maplibre.geojson;

import defpackage.b81;
import defpackage.i81;
import defpackage.rd3;
import defpackage.xp;
import defpackage.z71;
import defpackage.zw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Polygon implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = "Polygon";
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    public Polygon(String str, BoundingBox boundingBox, List<List<Point>> list) {
        if (str == null) {
            b81.k("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list != null) {
            this.coordinates = list;
        } else {
            b81.k("Null coordinates");
            throw null;
        }
    }

    private static void ensureIsLinearRing(LineString lineString) {
        if (lineString.coordinates().size() < 4) {
            throw new GeoJsonException("LinearRings need to be made up of 4 or more coordinates.");
        }
        if (!lineString.coordinates().get(0).equals(lineString.coordinates().get(lineString.coordinates().size() - 1))) {
            throw new GeoJsonException("LinearRings require first and last coordinate to be identical.");
        }
    }

    public static Polygon fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        return (Polygon) xpVar.g().b(Polygon.class, str);
    }

    public static Polygon fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[][] dArr2 : dArr) {
            ArrayList arrayList2 = new ArrayList(dArr2.length);
            for (double[] dArr3 : dArr2) {
                arrayList2.add(Point.fromLngLat(dArr3));
            }
            arrayList.add(arrayList2);
        }
        return new Polygon(TYPE, null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, List<LineString> list) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (list == null || list.isEmpty()) {
            return new Polygon(TYPE, null, arrayList);
        }
        for (LineString lineString2 : list) {
            ensureIsLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(TYPE, null, arrayList);
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
        if (obj instanceof Polygon) {
            Polygon polygon = (Polygon) obj;
            if (this.type.equals(polygon.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(polygon.bbox()) : polygon.bbox() == null) && this.coordinates.equals(polygon.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return this.coordinates.hashCode() ^ ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003);
    }

    public List<LineString> inner() {
        List<List<Point>> listCoordinates = coordinates();
        if (listCoordinates.size() <= 1) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(listCoordinates.size() - 1);
        Iterator<List<Point>> it = listCoordinates.subList(1, listCoordinates.size()).iterator();
        while (it.hasNext()) {
            arrayList.add(LineString.fromLngLats(it.next()));
        }
        return arrayList;
    }

    public LineString outer() {
        return LineString.fromLngLats(coordinates().get(0));
    }

    @Override // org.maplibre.geojson.GeoJson
    public String toJson() {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        return xpVar.g().f(this);
    }

    public String toString() {
        return "Polygon{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    @Override // org.maplibre.geojson.GeoJson
    public String type() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Polygon, List<List<Point>>> {
        public GsonTypeAdapter(zw0 zw0Var) {
            super(zw0Var, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        @Override // org.maplibre.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = Polygon.TYPE;
            }
            return new Polygon(str, boundingBox, list);
        }

        @Override // defpackage.rd3
        public Polygon read(z71 z71Var) {
            return (Polygon) readCoordinateContainer(z71Var);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, Polygon polygon) {
            writeCoordinateContainer(i81Var, polygon);
        }
    }

    @Override // org.maplibre.geojson.CoordinateContainer
    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    public static Polygon fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new Polygon(TYPE, boundingBox, list);
    }

    public static Polygon fromLngLats(List<List<Point>> list) {
        return new Polygon(TYPE, null, list);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, LineString... lineStringArr) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (lineStringArr == null) {
            return new Polygon(TYPE, boundingBox, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            ensureIsLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(TYPE, boundingBox, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, LineString... lineStringArr) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (lineStringArr == null) {
            return new Polygon(TYPE, null, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            ensureIsLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(TYPE, null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, List<LineString> list) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (list == null) {
            return new Polygon(TYPE, boundingBox, arrayList);
        }
        for (LineString lineString2 : list) {
            ensureIsLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(TYPE, boundingBox, arrayList);
    }
}
