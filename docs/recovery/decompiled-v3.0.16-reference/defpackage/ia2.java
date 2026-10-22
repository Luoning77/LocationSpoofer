package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ia2 implements Parcelable {
    public static final Parcelable.Creator<ia2> CREATOR = new q7(25);
    public Polyline e = new Polyline();

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.e.a((LatLng) obj);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Polyline polyline = this.e;
        if (this == obj) {
            return true;
        }
        if (obj == null || ia2.class != obj.getClass()) {
            return false;
        }
        Polyline polyline2 = ((ia2) obj).e;
        if (Float.compare(polyline2.b(), polyline.b()) != 0 || polyline.f() != polyline2.f() || Float.compare(polyline2.g(), polyline.g()) != 0) {
            return false;
        }
        polyline.c();
        return polyline.c().equals(polyline2.c());
    }

    public final int hashCode() {
        Polyline polyline = this.e;
        int iF = (polyline.f() + (((polyline.b() != 0.0f ? Float.floatToIntBits(polyline.b()) : 0) + 31) * 31)) * 31;
        int iFloatToIntBits = polyline.g() != 0.0f ? Float.floatToIntBits(polyline.g()) : 0;
        polyline.c();
        return polyline.c().hashCode() + ((iF + iFloatToIntBits) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Polyline polyline = this.e;
        parcel.writeList(polyline.c());
        parcel.writeFloat(polyline.b());
        parcel.writeInt(polyline.f());
        parcel.writeFloat(polyline.g());
    }
}
