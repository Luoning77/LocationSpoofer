package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hi3;
import defpackage.ii3;
import defpackage.q7;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new q7(20);
    public final ii3 e;

    public ParcelImpl(Parcel parcel) {
        this.e = new hi3(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new hi3(parcel).i(this.e);
    }
}
