package org.maplibre.geojson;

import defpackage.az2;
import defpackage.i81;
import defpackage.rd3;
import defpackage.z71;
import defpackage.zw0;
import java.io.IOException;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
abstract class BaseGeometryTypeAdapter<G, T> extends rd3 {
    private volatile rd3 boundingBoxAdapter = new BoundingBoxTypeAdapter();
    private volatile rd3 coordinatesAdapter;
    private final zw0 gson;
    private volatile rd3 stringAdapter;

    public BaseGeometryTypeAdapter(zw0 zw0Var, rd3 rd3Var) {
        this.gson = zw0Var;
        this.coordinatesAdapter = rd3Var;
    }

    public abstract CoordinateContainer<T> createCoordinateContainer(String str, BoundingBox boundingBox, T t);

    /* JADX WARN: Multi-variable type inference failed */
    public CoordinateContainer<T> readCoordinateContainer(z71 z71Var) throws IOException {
        String str = null;
        if (z71Var.u0() == 9) {
            z71Var.q0();
            return null;
        }
        z71Var.F();
        BoundingBox boundingBox = null;
        Object obj = null;
        while (z71Var.h0()) {
            String strO0 = z71Var.o0();
            if (z71Var.u0() != 9) {
                strO0.getClass();
                switch (strO0) {
                    case "bbox":
                        rd3 rd3VarF = this.boundingBoxAdapter;
                        if (rd3VarF == null) {
                            rd3VarF = az2.f(this.gson, BoundingBox.class);
                            this.boundingBoxAdapter = rd3VarF;
                        }
                        boundingBox = (BoundingBox) rd3VarF.read(z71Var);
                        break;
                    case "type":
                        rd3 rd3VarF2 = this.stringAdapter;
                        if (rd3VarF2 == null) {
                            rd3VarF2 = az2.f(this.gson, String.class);
                            this.stringAdapter = rd3VarF2;
                        }
                        str = (String) rd3VarF2.read(z71Var);
                        break;
                    case "coordinates":
                        rd3 rd3Var = this.coordinatesAdapter;
                        if (rd3Var == null) {
                            throw new GeoJsonException("Coordinates type adapter is null");
                        }
                        obj = rd3Var.read(z71Var);
                        break;
                        break;
                    default:
                        z71Var.A0();
                        break;
                }
            } else {
                z71Var.q0();
            }
        }
        z71Var.c0();
        return createCoordinateContainer(str, boundingBox, obj);
    }

    public void writeCoordinateContainer(i81 i81Var, CoordinateContainer<T> coordinateContainer) {
        if (coordinateContainer == null) {
            i81Var.f0();
            return;
        }
        i81Var.O();
        i81Var.d0("type");
        if (coordinateContainer.type() == null) {
            i81Var.f0();
        } else {
            rd3 rd3VarF = this.stringAdapter;
            if (rd3VarF == null) {
                rd3VarF = az2.f(this.gson, String.class);
                this.stringAdapter = rd3VarF;
            }
            rd3VarF.write(i81Var, coordinateContainer.type());
        }
        i81Var.d0("bbox");
        if (coordinateContainer.bbox() == null) {
            i81Var.f0();
        } else {
            rd3 rd3VarF2 = this.boundingBoxAdapter;
            if (rd3VarF2 == null) {
                rd3VarF2 = az2.f(this.gson, BoundingBox.class);
                this.boundingBoxAdapter = rd3VarF2;
            }
            rd3VarF2.write(i81Var, coordinateContainer.bbox());
        }
        i81Var.d0("coordinates");
        if (coordinateContainer.coordinates() == null) {
            i81Var.f0();
        } else {
            rd3 rd3Var = this.coordinatesAdapter;
            if (rd3Var == null) {
                throw new GeoJsonException("Coordinates type adapter is null");
            }
            rd3Var.write(i81Var, coordinateContainer.coordinates());
        }
        i81Var.c0();
    }
}
