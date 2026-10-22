package org.maplibre.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q7;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class DefaultStyle implements Parcelable {
    public static final Parcelable.Creator<DefaultStyle> CREATOR = new q7(6);
    private String name;
    private String url;
    private int version;

    public DefaultStyle(Parcel parcel) {
        this.url = parcel.readString();
        this.name = parcel.readString();
        this.version = parcel.readInt();
    }

    public final String a() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeInt(this.version);
    }

    public DefaultStyle(String str, String str2, int i) {
        this.url = str;
        this.name = str2;
        this.version = i;
    }
}
