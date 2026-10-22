package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fo;
import defpackage.q7;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new q7(11);
    public final double e;
    private double latitude;
    private double longitude;

    public LatLng(Parcel parcel) {
        c(parcel.readDouble());
        d(parcel.readDouble());
        this.e = parcel.readDouble();
    }

    public final double a() {
        return this.latitude;
    }

    public final double b() {
        return this.longitude;
    }

    public final void c(double d) {
        if (Double.isNaN(d)) {
            fo.i("latitude must not be NaN");
        } else if (Math.abs(d) <= 90.0d) {
            this.latitude = d;
        } else {
            fo.i("latitude must be between -90 and 90");
        }
    }

    public final void d(double d) {
        if (Double.isNaN(d)) {
            fo.i("longitude must not be NaN");
        } else if (Double.isInfinite(d)) {
            fo.i("longitude must not be infinite");
        } else {
            this.longitude = d;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LatLng.class.equals(obj.getClass())) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.e, this.e) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.e);
        return (i * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3));
    }

    public final String toString() {
        return "LatLng [latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.e + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.e);
    }

    public LatLng(double d, double d2) {
        c(d);
        d(d2);
    }

    public LatLng() {
        c(0.0d);
        d(0.0d);
    }
}
