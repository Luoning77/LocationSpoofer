package org.maplibre.geojson;

import defpackage.i81;
import defpackage.rd3;
import defpackage.z71;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.shifter.CoordinateShifterManager;
import org.maplibre.geojson.utils.GeoJsonUtils;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
abstract class BaseCoordinatesTypeAdapter<T> extends rd3 {
    public Point readPoint(z71 z71Var) {
        List<Double> pointList = readPointList(z71Var);
        if (pointList == null || pointList.size() <= 1) {
            throw new GeoJsonException(" Point coordinates should be non-null double array");
        }
        return new Point("Point", null, pointList);
    }

    public List<Double> readPointList(z71 z71Var) {
        if (z71Var.u0() == 9) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        z71Var.A();
        while (z71Var.h0()) {
            arrayList.add(Double.valueOf(z71Var.l0()));
        }
        z71Var.U();
        return arrayList.size() > 2 ? CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue()) : CoordinateShifterManager.getCoordinateShifter().shiftLonLat(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
    }

    public void writePoint(i81 i81Var, Point point) {
        if (point == null) {
            return;
        }
        writePointList(i81Var, point.coordinates());
    }

    public void writePointList(i81 i81Var, List<Double> list) {
        if (list == null) {
            return;
        }
        i81Var.F();
        List<Double> listUnshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(list);
        i81Var.i0(GeoJsonUtils.trim(listUnshiftPoint.get(0).doubleValue()));
        i81Var.i0(GeoJsonUtils.trim(listUnshiftPoint.get(1).doubleValue()));
        if (list.size() > 2) {
            i81Var.l0(listUnshiftPoint.get(2));
        }
        i81Var.U();
    }
}
