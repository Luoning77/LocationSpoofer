package org.maplibre.geojson;

import defpackage.rd3;
import defpackage.sd3;
import defpackage.zd3;
import defpackage.zw0;
import org.maplibre.geojson.internal.typeadapters.RuntimeTypeAdapterFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class GeometryAdapterFactory implements sd3 {
    private static sd3 geometryTypeFactory;

    public static sd3 create() {
        sd3 sd3Var = geometryTypeFactory;
        if (sd3Var != null) {
            return sd3Var;
        }
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = RuntimeTypeAdapterFactory.of(Geometry.class, "type", true).registerSubtype(GeometryCollection.class, "GeometryCollection").registerSubtype(Point.class, "Point").registerSubtype(MultiPoint.class, "MultiPoint").registerSubtype(LineString.class, "LineString").registerSubtype(MultiLineString.class, "MultiLineString").registerSubtype(Polygon.class, "Polygon").registerSubtype(MultiPolygon.class, "MultiPolygon");
        geometryTypeFactory = runtimeTypeAdapterFactoryRegisterSubtype;
        return runtimeTypeAdapterFactoryRegisterSubtype;
    }

    @Override // defpackage.sd3
    public abstract /* synthetic */ rd3 create(zw0 zw0Var, zd3 zd3Var);
}
