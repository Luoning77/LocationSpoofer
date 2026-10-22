package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dq implements Parcelable {
    public static final Parcelable.Creator<dq> CREATOR = new q7(2);
    public final int[] e;
    public final ArrayList f;
    public final int[] g;
    public final int[] h;
    public final int i;
    public final String j;
    public final int k;
    public final int l;
    public final CharSequence m;
    public final int n;
    public final CharSequence o;
    public final ArrayList p;
    public final ArrayList q;
    public final boolean r;

    public dq(cq cqVar) {
        int size = cqVar.a.size();
        this.e = new int[size * 6];
        if (!cqVar.g) {
            fo.n("Not on back stack");
            throw null;
        }
        this.f = new ArrayList(size);
        this.g = new int[size];
        this.h = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ms0 ms0Var = (ms0) cqVar.a.get(i2);
            this.e[i] = ms0Var.a;
            this.f.add(null);
            int[] iArr = this.e;
            iArr[i + 1] = ms0Var.b ? 1 : 0;
            iArr[i + 2] = ms0Var.c;
            iArr[i + 3] = ms0Var.d;
            int i3 = i + 5;
            iArr[i + 4] = ms0Var.e;
            i += 6;
            iArr[i3] = ms0Var.f;
            this.g[i2] = ms0Var.g.ordinal();
            this.h[i2] = ms0Var.h.ordinal();
        }
        this.i = cqVar.f;
        this.j = cqVar.h;
        this.k = cqVar.s;
        this.l = cqVar.i;
        this.m = cqVar.j;
        this.n = cqVar.k;
        this.o = cqVar.l;
        this.p = cqVar.m;
        this.q = cqVar.n;
        this.r = cqVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.e);
        parcel.writeStringList(this.f);
        parcel.writeIntArray(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public dq(Parcel parcel) {
        this.e = parcel.createIntArray();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createIntArray();
        this.h = parcel.createIntArray();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.m = (CharSequence) creator.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) creator.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }
}
