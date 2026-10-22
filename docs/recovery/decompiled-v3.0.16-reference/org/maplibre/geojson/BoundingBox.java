package org.maplibre.geojson;

import defpackage.b81;
import defpackage.rd3;
import defpackage.xp;
import defpackage.zw0;
import java.io.Serializable;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            b81.k("Null southwest");
            throw null;
        }
        this.southwest = point;
        if (point2 != null) {
            this.northeast = point2;
        } else {
            b81.k("Null northeast");
            throw null;
        }
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d, double d2, double d3, double d4) {
        return fromLngLats(d, d2, d3, d4);
    }

    public static BoundingBox fromJson(String str) {
        xp xpVar = new xp(1);
        xpVar.o(new BoundingBoxTypeAdapter());
        return (BoundingBox) xpVar.g().b(BoundingBox.class, str);
    }

    public static BoundingBox fromLngLats(double d, double d2, double d3, double d4) {
        return new BoundingBox(Point.fromLngLat(d, d2), Point.fromLngLat(d3, d4));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new BoundingBox(point, point2);
    }

    public static rd3 typeAdapter(zw0 zw0Var) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingBox) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.northeast.hashCode() ^ ((this.southwest.hashCode() ^ 1000003) * 1000003);
    }

    public final double north() {
        return northeast().latitude();
    }

    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        xp xpVar = new xp(1);
        xpVar.o(new BoundingBoxTypeAdapter());
        return xpVar.g().e(this, BoundingBox.class);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d, double d2, double d3, double d4, double d5, double d6) {
        return fromLngLats(d, d2, d3, d4, d5, d6);
    }

    public static BoundingBox fromLngLats(double d, double d2, double d3, double d4, double d5, double d6) {
        return new BoundingBox(Point.fromLngLat(d, d2, d3), Point.fromLngLat(d4, d5, d6));
    }
}
