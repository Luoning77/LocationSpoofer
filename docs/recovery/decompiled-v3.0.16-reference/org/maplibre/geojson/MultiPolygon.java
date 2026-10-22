package org.maplibre.geojson;

import defpackage.b81;
import defpackage.i81;
import defpackage.rd3;
import defpackage.xp;
import defpackage.z71;
import defpackage.zw0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MultiPolygon implements CoordinateContainer<List<List<List<Point>>>> {
    private static final String TYPE = "MultiPolygon";
    private final BoundingBox bbox;
    private final List<List<List<Point>>> coordinates;
    private final String type;

    public MultiPolygon(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
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

    public static MultiPolygon fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        return (MultiPolygon) xpVar.g().b(MultiPolygon.class, str);
    }

    public static MultiPolygon fromLngLats(double[][][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            for (int i2 = 0; i2 < dArr[i].length; i2++) {
                ArrayList arrayList3 = new ArrayList(dArr[i][i2].length);
                int i3 = 0;
                while (true) {
                    double[][] dArr2 = dArr[i][i2];
                    if (i3 < dArr2.length) {
                        arrayList3.add(Point.fromLngLat(dArr2[i3]));
                        i3++;
                    }
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return new MultiPolygon(TYPE, null, arrayList);
    }

    public static MultiPolygon fromPolygon(Polygon polygon) {
        return new MultiPolygon(TYPE, null, Arrays.asList(polygon.coordinates()));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Polygon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiPolygon(TYPE, null, arrayList);
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
        if (obj instanceof MultiPolygon) {
            MultiPolygon multiPolygon = (MultiPolygon) obj;
            if (this.type.equals(multiPolygon.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiPolygon.bbox()) : multiPolygon.bbox() == null) && this.coordinates.equals(multiPolygon.coordinates())) {
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

    public List<Polygon> polygons() {
        List<List<List<Point>>> listCoordinates = coordinates();
        ArrayList arrayList = new ArrayList(listCoordinates.size());
        Iterator<List<List<Point>>> it = listCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(Polygon.fromLngLats(it.next()));
        }
        return arrayList;
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
    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPolygon, List<List<List<Point>>>> {
        public GsonTypeAdapter(zw0 zw0Var) {
            super(zw0Var, new ListofListofListOfPointCoordinatesTypeAdapter());
        }

        @Override // org.maplibre.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<List<Point>>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
            if (str == null) {
                str = MultiPolygon.TYPE;
            }
            return new MultiPolygon(str, boundingBox, list);
        }

        @Override // defpackage.rd3
        public MultiPolygon read(z71 z71Var) {
            return (MultiPolygon) readCoordinateContainer(z71Var);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, MultiPolygon multiPolygon) {
            writeCoordinateContainer(i81Var, multiPolygon);
        }
    }

    @Override // org.maplibre.geojson.CoordinateContainer
    public List<List<List<Point>>> coordinates() {
        return this.coordinates;
    }

    public static MultiPolygon fromPolygon(Polygon polygon, BoundingBox boundingBox) {
        return new MultiPolygon(TYPE, boundingBox, Arrays.asList(polygon.coordinates()));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Polygon> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiPolygon(TYPE, boundingBox, arrayList);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list, BoundingBox boundingBox) {
        return new MultiPolygon(TYPE, boundingBox, list);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list) {
        return new MultiPolygon(TYPE, null, list);
    }
}
