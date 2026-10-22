package org.maplibre.geojson;

import defpackage.b81;
import defpackage.i81;
import defpackage.rd3;
import defpackage.xp;
import defpackage.z71;
import defpackage.zw0;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;
import org.maplibre.geojson.shifter.CoordinateShifterManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class Point implements CoordinateContainer<List<Double>> {
    private static final String TYPE = "Point";
    private final BoundingBox bbox;
    private final List<Double> coordinates;
    private final String type;

    public Point(String str, BoundingBox boundingBox, List<Double> list) {
        if (str == null) {
            b81.k("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null || list.size() == 0) {
            b81.k("Null coordinates");
            throw null;
        }
        this.coordinates = list;
    }

    public static Point fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        return (Point) xpVar.g().b(Point.class, str);
    }

    public static Point fromLngLat(double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }

    public static rd3 typeAdapter(zw0 zw0Var) {
        return new GsonTypeAdapter(zw0Var);
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return coordinates().get(2).doubleValue();
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
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (this.type.equals(point.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(point.bbox()) : point.bbox() == null) && this.coordinates.equals(point.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return this.coordinates.hashCode() ^ ((iHashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003);
    }

    public double latitude() {
        return coordinates().get(1).doubleValue();
    }

    public double longitude() {
        return coordinates().get(0).doubleValue();
    }

    @Override // org.maplibre.geojson.GeoJson
    public String toJson() {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        return xpVar.g().f(this);
    }

    public String toString() {
        return "Point{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    @Override // org.maplibre.geojson.GeoJson
    public String type() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>> {
        public GsonTypeAdapter(zw0 zw0Var) {
            super(zw0Var, new ListOfDoublesCoordinatesTypeAdapter());
        }

        @Override // org.maplibre.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Double> list) {
            if (str == null) {
                str = Point.TYPE;
            }
            return new Point(str, boundingBox, list);
        }

        @Override // defpackage.rd3
        public Point read(z71 z71Var) {
            return (Point) readCoordinateContainer(z71Var);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, Point point) {
            writeCoordinateContainer(i81Var, point);
        }
    }

    @Override // org.maplibre.geojson.CoordinateContainer
    public List<Double> coordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double d, double d2, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d, d2));
    }

    public static Point fromLngLat(double d, double d2, double d3) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2, double d3, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d, d2));
    }
}
