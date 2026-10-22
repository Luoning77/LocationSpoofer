package org.maplibre.geojson.gson;

import defpackage.rd3;
import defpackage.sd3;
import defpackage.zd3;
import defpackage.zw0;
import org.maplibre.geojson.BoundingBox;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.GeometryCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiLineString;
import org.maplibre.geojson.MultiPoint;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class GeoJsonAdapterFactory implements sd3 {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class GeoJsonAdapterFactoryIml extends GeoJsonAdapterFactory {
        @Override // org.maplibre.geojson.gson.GeoJsonAdapterFactory, defpackage.sd3
        public <T> rd3 create(zw0 zw0Var, zd3 zd3Var) {
            Class cls = zd3Var.a;
            if (BoundingBox.class.isAssignableFrom(cls)) {
                return BoundingBox.typeAdapter(zw0Var);
            }
            if (Feature.class.isAssignableFrom(cls)) {
                return Feature.typeAdapter(zw0Var);
            }
            if (FeatureCollection.class.isAssignableFrom(cls)) {
                return FeatureCollection.typeAdapter(zw0Var);
            }
            if (GeometryCollection.class.isAssignableFrom(cls)) {
                return GeometryCollection.typeAdapter(zw0Var);
            }
            if (LineString.class.isAssignableFrom(cls)) {
                return LineString.typeAdapter(zw0Var);
            }
            if (MultiLineString.class.isAssignableFrom(cls)) {
                return MultiLineString.typeAdapter(zw0Var);
            }
            if (MultiPoint.class.isAssignableFrom(cls)) {
                return MultiPoint.typeAdapter(zw0Var);
            }
            if (MultiPolygon.class.isAssignableFrom(cls)) {
                return MultiPolygon.typeAdapter(zw0Var);
            }
            if (Polygon.class.isAssignableFrom(cls)) {
                return Polygon.typeAdapter(zw0Var);
            }
            if (Point.class.isAssignableFrom(cls)) {
                return Point.typeAdapter(zw0Var);
            }
            return null;
        }
    }

    public static sd3 create() {
        return new GeoJsonAdapterFactoryIml();
    }

    @Override // defpackage.sd3
    public abstract /* synthetic */ rd3 create(zw0 zw0Var, zd3 zd3Var);
}
