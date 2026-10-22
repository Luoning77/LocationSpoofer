package org.maplibre.geojson;

import defpackage.i81;
import defpackage.z71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
class ListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Point>> {
    @Override // defpackage.rd3
    public List<Point> read(z71 z71Var) {
        if (z71Var.u0() == 9) {
            throw null;
        }
        if (z71Var.u0() != 1) {
            throw new GeoJsonException("coordinates should be non-null array of array of double");
        }
        ArrayList arrayList = new ArrayList();
        z71Var.A();
        while (z71Var.u0() == 1) {
            arrayList.add(readPoint(z71Var));
        }
        z71Var.U();
        return arrayList;
    }

    @Override // defpackage.rd3
    public void write(i81 i81Var, List<Point> list) {
        if (list == null) {
            i81Var.f0();
            return;
        }
        i81Var.F();
        Iterator<Point> it = list.iterator();
        while (it.hasNext()) {
            writePoint(i81Var, it.next());
        }
        i81Var.U();
    }
}
