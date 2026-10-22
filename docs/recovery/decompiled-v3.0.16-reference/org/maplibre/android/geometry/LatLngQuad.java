package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.o51;
import defpackage.q7;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LatLngQuad implements Parcelable {
    public static final Parcelable.Creator<LatLngQuad> CREATOR = new q7(13);
    private final LatLng bottomLeft;
    private final LatLng bottomRight;
    private final LatLng topLeft;
    private final LatLng topRight;

    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        latLng.getClass();
        latLng2.getClass();
        latLng3.getClass();
        latLng4.getClass();
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LatLngQuad.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LatLngQuad latLngQuad = (LatLngQuad) obj;
        return o51.f(this.topLeft, latLngQuad.topLeft) && o51.f(this.topRight, latLngQuad.topRight) && o51.f(this.bottomRight, latLngQuad.bottomRight) && o51.f(this.bottomLeft, latLngQuad.bottomLeft);
    }

    public final int hashCode() {
        return this.bottomLeft.hashCode() + ((this.bottomRight.hashCode() + ((this.topRight.hashCode() + (this.topLeft.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.topLeft.writeToParcel(parcel, i);
        this.topRight.writeToParcel(parcel, i);
        this.bottomRight.writeToParcel(parcel, i);
        this.bottomLeft.writeToParcel(parcel, i);
    }
}
