package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sq1 implements Parcelable {
    public static final Parcelable.Creator<sq1> CREATOR = new q7(16);
    public LatLng e;
    public String f;
    public String g;
    public n01 h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sq1.class == obj.getClass()) {
            sq1 sq1Var = (sq1) obj;
            LatLng latLng = this.e;
            LatLng latLng2 = sq1Var.e;
            if (latLng == null ? latLng2 != null : !latLng.equals(latLng2)) {
                return false;
            }
            String str = this.f;
            String str2 = sq1Var.f;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            n01 n01Var = this.h;
            n01 n01Var2 = sq1Var.h;
            if (n01Var == null ? n01Var2 != null : !n01Var.equals(n01Var2)) {
                return false;
            }
            String str3 = this.g;
            String str4 = sq1Var.g;
            if (str3 == null ? str4 == null : str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        LatLng latLng = this.e;
        int iHashCode = ((latLng != null ? latLng.hashCode() : 0) + 31) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        n01 n01Var = this.h;
        int iHashCode3 = (iHashCode2 + (n01Var != null ? n01Var.hashCode() : 0)) * 31;
        String str2 = this.g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        n01 n01Var = this.h;
        parcel.writeByte((byte) (n01Var != null ? 1 : 0));
        if (n01Var != null) {
            parcel.writeString(this.h.b);
            parcel.writeParcelable(this.h.a(), i);
        }
    }
}
