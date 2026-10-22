package org.maplibre.android.offline;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nx0;
import defpackage.q7;
import java.util.ArrayList;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OfflineTilePyramidRegionDefinition implements OfflineRegionDefinition {
    public static final Parcelable.Creator<?> CREATOR = new q7(19);
    private final LatLngBounds bounds;
    private boolean includeIdeographs;
    private double maxZoom;
    private double minZoom;
    private float pixelRatio;
    private String styleURL;

    public OfflineTilePyramidRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        nx0 nx0Var = new nx0(2);
        LatLng latLng = new LatLng(parcel.readDouble(), parcel.readDouble());
        ArrayList arrayList = nx0Var.a;
        arrayList.add(latLng);
        arrayList.add(new LatLng(parcel.readDouble(), parcel.readDouble()));
        this.bounds = nx0Var.d();
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
        return this.bounds;
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
        return "tileregion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.styleURL);
        LatLngBounds latLngBounds = this.bounds;
        if (latLngBounds != null) {
            parcel.writeDouble(latLngBounds.latitudeNorth);
            parcel.writeDouble(this.bounds.longitudeEast);
            parcel.writeDouble(this.bounds.latitudeSouth);
            parcel.writeDouble(this.bounds.longitudeWest);
        }
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
        parcel.writeByte(this.includeIdeographs ? (byte) 1 : (byte) 0);
    }

    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d, double d2, float f, boolean z) {
        latLngBounds.getClass();
        this.styleURL = str;
        this.bounds = latLngBounds;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
        this.includeIdeographs = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d, double d2, float f) {
        this(str, latLngBounds, d, d2, f, false);
        latLngBounds.getClass();
    }
}
