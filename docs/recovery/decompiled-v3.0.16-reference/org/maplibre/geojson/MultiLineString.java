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
public final class MultiLineString implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = "MultiLineString";
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    public MultiLineString(String str, BoundingBox boundingBox, List<List<Point>> list) {
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

    public static MultiLineString fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.p(GeoJsonAdapterFactory.create());
        return (MultiLineString) xpVar.g().b(MultiLineString.class, str);
    }

    public static MultiLineString fromLineString(LineString lineString) {
        return new MultiLineString(TYPE, null, Arrays.asList(lineString.coordinates()));
    }

    public static MultiLineString fromLineStrings(List<LineString> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<LineString> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiLineString(TYPE, null, arrayList);
    }

    public static MultiLineString fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            int i2 = 0;
            while (true) {
                double[][] dArr2 = dArr[i];
                if (i2 < dArr2.length) {
                    arrayList2.add(Point.fromLngLat(dArr2[i2]));
                    i2++;
                }
            }
            arrayList.add(arrayList2);
        }
        return new MultiLineString(TYPE, null, arrayList);
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
        if (obj instanceof MultiLineString) {
            MultiLineString multiLineString = (MultiLineString) obj;
            if (this.type.equals(multiLineString.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(multiLineString.bbox()) : multiLineString.bbox() == null) && this.coordinates.equals(multiLineString.coordinates())) {
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

    public List<LineString> lineStrings() {
        List<List<Point>> listCoordinates = coordinates();
        ArrayList arrayList = new ArrayList(listCoordinates.size());
        Iterator<List<Point>> it = listCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(LineString.fromLngLats(it.next()));
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
        return "MultiLineString{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    @Override // org.maplibre.geojson.GeoJson
    public String type() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiLineString, List<List<Point>>> {
        public GsonTypeAdapter(zw0 zw0Var) {
            super(zw0Var, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        @Override // org.maplibre.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = MultiLineString.TYPE;
            }
            return new MultiLineString(str, boundingBox, list);
        }

        @Override // defpackage.rd3
        public MultiLineString read(z71 z71Var) {
            return (MultiLineString) readCoordinateContainer(z71Var);
        }

        @Override // defpackage.rd3
        public void write(i81 i81Var, MultiLineString multiLineString) {
            writeCoordinateContainer(i81Var, multiLineString);
        }
    }

    @Override // org.maplibre.geojson.CoordinateContainer
    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    public static MultiLineString fromLineString(LineString lineString, BoundingBox boundingBox) {
        return new MultiLineString(TYPE, boundingBox, Arrays.asList(lineString.coordinates()));
    }

    public static MultiLineString fromLineStrings(List<LineString> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<LineString> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().coordinates());
        }
        return new MultiLineString(TYPE, boundingBox, arrayList);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new MultiLineString(TYPE, boundingBox, list);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list) {
        return new MultiLineString(TYPE, null, list);
    }
}
