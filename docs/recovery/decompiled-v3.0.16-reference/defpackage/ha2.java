package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.maplibre.android.annotations.Polygon;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ha2 implements Parcelable {
    public static final Parcelable.Creator<ha2> CREATOR = new q7(24);
    public Polygon e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Polygon polygon = this.e;
        if (this == obj) {
            return true;
        }
        if (obj == null || ha2.class != obj.getClass()) {
            return false;
        }
        Polygon polygon2 = ((ha2) obj).e;
        if (Float.compare(polygon2.b(), polygon.b()) == 0 && polygon.g() == polygon2.g() && polygon.i() == polygon2.i() && polygon.c().equals(polygon2.c())) {
            return polygon.h().equals(polygon2.h());
        }
        return false;
    }

    public final int hashCode() {
        Polygon polygon = this.e;
        return polygon.h().hashCode() + ((polygon.c().hashCode() + ((polygon.i() + ((polygon.g() + (((polygon.b() != 0.0f ? Float.floatToIntBits(polygon.b()) : 0) + 31) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Polygon polygon = this.e;
        parcel.writeList(polygon.c());
        parcel.writeList(polygon.h());
        parcel.writeFloat(polygon.b());
        parcel.writeInt(polygon.g());
        parcel.writeInt(polygon.i());
    }
}
