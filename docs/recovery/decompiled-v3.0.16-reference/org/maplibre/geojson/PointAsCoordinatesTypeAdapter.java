package org.maplibre.geojson;

import defpackage.i81;
import defpackage.z71;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class PointAsCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<Point> {
    @Override // defpackage.rd3
    public Point read(z71 z71Var) {
        return readPoint(z71Var);
    }

    @Override // defpackage.rd3
    public void write(i81 i81Var, Point point) {
        writePoint(i81Var, point);
    }
}
