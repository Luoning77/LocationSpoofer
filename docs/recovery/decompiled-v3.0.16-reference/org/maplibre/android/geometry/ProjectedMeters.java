package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q7;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ProjectedMeters implements Parcelable {
    public static final Parcelable.Creator<ProjectedMeters> CREATOR = new q7(26);
    public double e;
    public double f;

    public ProjectedMeters(double d, double d2) {
        this.e = d;
        this.f = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProjectedMeters.class.equals(obj.getClass())) {
            ProjectedMeters projectedMeters = (ProjectedMeters) obj;
            if (Double.compare(projectedMeters.f, this.f) == 0 && Double.compare(projectedMeters.e, this.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "ProjectedMeters [northing=" + this.e + ", easting=" + this.f + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
    }
}
