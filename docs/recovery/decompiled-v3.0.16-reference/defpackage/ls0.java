package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ls0 implements Parcelable {
    public static final Parcelable.Creator<ls0> CREATOR = new q7(9);
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final String q;
    public final int r;
    public final boolean s;

    public ls0(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.p = parcel.readInt();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(WorkQueueKt.BUFFER_CAPACITY);
        sb.append("FragmentState{");
        sb.append(this.e);
        sb.append(" (");
        sb.append(this.f);
        sb.append(")}:");
        if (this.g) {
            sb.append(" fromLayout");
        }
        if (this.h) {
            sb.append(" dynamicContainer");
        }
        int i = this.j;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.l) {
            sb.append(" retainInstance");
        }
        if (this.m) {
            sb.append(" removing");
        }
        if (this.n) {
            sb.append(" detached");
        }
        if (this.o) {
            sb.append(" hidden");
        }
        String str2 = this.q;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.r);
        }
        if (this.s) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }
}
