package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eb3 extends h {
    public static final Parcelable.Creator<eb3> CREATOR = new v52(2);
    public int g;
    public boolean h;

    public eb3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.g = parcel.readInt();
        this.h = parcel.readInt() != 0;
    }

    @Override // defpackage.h, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
