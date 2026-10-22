package org.maplibre.android.offline;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fa1;
import defpackage.q7;
import defpackage.u83;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OfflineGeometryRegionDefinition implements OfflineRegionDefinition {
    public static final Parcelable.Creator<?> CREATOR = new q7(18);
    private Geometry geometry;
    private boolean includeIdeographs;
    private double maxZoom;
    private double minZoom;
    private float pixelRatio;
    private String styleURL;

    public OfflineGeometryRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        String string = parcel.readString();
        string.getClass();
        this.geometry = Feature.fromJson(string).geometry();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
        this.includeIdeographs = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final LatLngBounds getBounds() {
        Geometry geometry = this.geometry;
        if (geometry == null) {
            return null;
        }
        double[] dArrA = u83.a(geometry);
        fa1 fa1Var = LatLngBounds.Companion;
        double d = dArrA[3];
        double d2 = dArrA[2];
        double d3 = dArrA[1];
        double d4 = dArrA[0];
        fa1Var.getClass();
        fa1.a(d, d2, d3, d4);
        return new LatLngBounds(d, d2, d3, d4);
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final boolean getIncludeIdeographs() {
        return this.includeIdeographs;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final double getMaxZoom() {
        return this.maxZoom;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final double getMinZoom() {
        return this.minZoom;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final String getStyleURL() {
        return this.styleURL;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final String getType() {
        return "shaperegion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.styleURL);
        parcel.writeString(Feature.fromGeometry(this.geometry).toJson());
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
        parcel.writeByte(this.includeIdeographs ? (byte) 1 : (byte) 0);
    }

    public OfflineGeometryRegionDefinition(String str, Geometry geometry, double d, double d2, float f, boolean z) {
        this.styleURL = str;
        this.geometry = geometry;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
        this.includeIdeographs = z;
    }

    public OfflineGeometryRegionDefinition(String str, Geometry geometry, double d, double d2, float f) {
        this(str, geometry, d, d2, f, false);
    }
}
