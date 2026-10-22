package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eq implements Parcelable {
    public static final Parcelable.Creator<eq> CREATOR = new q7(3);
    public final ArrayList e;
    public final ArrayList f;

    public eq(Parcel parcel) {
        this.e = parcel.createStringArrayList();
        this.f = parcel.createTypedArrayList(dq.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.e);
        parcel.writeTypedList(this.f);
    }
}
