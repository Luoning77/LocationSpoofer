package org.maplibre.geojson.gson;

import defpackage.i81;
import defpackage.rd3;
import defpackage.z71;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.BoundingBox;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.shifter.CoordinateShifterManager;
import org.maplibre.geojson.utils.GeoJsonUtils;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class BoundingBoxTypeAdapter extends rd3 {
    @Override // defpackage.rd3
    public BoundingBox read(z71 z71Var) {
        ArrayList arrayList = new ArrayList();
        z71Var.A();
        while (z71Var.h0()) {
            arrayList.add(Double.valueOf(z71Var.l0()));
        }
        z71Var.U();
        if (arrayList.size() == 6) {
            return BoundingBox.fromLngLats(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue(), ((Double) arrayList.get(3)).doubleValue(), ((Double) arrayList.get(4)).doubleValue(), ((Double) arrayList.get(5)).doubleValue());
        }
        if (arrayList.size() == 4) {
            return BoundingBox.fromLngLats(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue(), ((Double) arrayList.get(3)).doubleValue());
        }
        throw new GeoJsonException("The value of the bbox member MUST be an array of length 2*n where n is the number of dimensions represented in the contained geometries,with all axes of the most southwesterly point followed  by all axes of the more northeasterly point. The axes order of a bbox follows the axes order of geometries.");
    }

    @Override // defpackage.rd3
    public void write(i81 i81Var, BoundingBox boundingBox) {
        if (boundingBox == null) {
            i81Var.f0();
            return;
        }
        i81Var.F();
        Point pointSouthwest = boundingBox.southwest();
        List<Double> listUnshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(pointSouthwest);
        i81Var.i0(GeoJsonUtils.trim(listUnshiftPoint.get(0).doubleValue()));
        i81Var.i0(GeoJsonUtils.trim(listUnshiftPoint.get(1).doubleValue()));
        if (pointSouthwest.hasAltitude()) {
            i81Var.l0(listUnshiftPoint.get(2));
        }
        Point pointNortheast = boundingBox.northeast();
        List<Double> listUnshiftPoint2 = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(pointNortheast);
        i81Var.i0(GeoJsonUtils.trim(listUnshiftPoint2.get(0).doubleValue()));
        i81Var.i0(GeoJsonUtils.trim(listUnshiftPoint2.get(1).doubleValue()));
        if (pointNortheast.hasAltitude()) {
            i81Var.l0(listUnshiftPoint2.get(2));
        }
        i81Var.U();
    }
}
