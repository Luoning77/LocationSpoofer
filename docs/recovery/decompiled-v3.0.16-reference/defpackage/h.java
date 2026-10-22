package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class h implements Parcelable {
    public final Parcelable e;
    public static final g f = new g();
    public static final Parcelable.Creator<h> CREATOR = new v52(1);

    public h(Parcelable parcelable) {
        if (parcelable != null) {
            this.e = parcelable == f ? null : parcelable;
        } else {
            fo.i("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }

    public h() {
        this.e = null;
    }

    public h(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.e = parcelable == null ? f : parcelable;
    }
}
