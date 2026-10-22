package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class is0 implements Parcelable {
    public static final Parcelable.Creator<is0> CREATOR = new q7(8);
    public ArrayList e;
    public ArrayList f;
    public dq[] g;
    public int h;
    public String i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedArray(this.g, i);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeStringList(this.j);
        parcel.writeTypedList(this.k);
        parcel.writeTypedList(this.l);
    }
}
