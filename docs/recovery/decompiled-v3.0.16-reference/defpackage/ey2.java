package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ey2 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static fy2 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ey2.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new fy2();
        }
        y72 y72VarE = lx2.f.e();
        for (int i2 = 0; i2 < i; i2++) {
            y72VarE.add(parcel.readValue(classLoader));
        }
        return new fy2(y72VarE.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return new gp2(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fy2[i];
            default:
                return new gp2[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return new gp2(parcel, classLoader);
        }
    }
}
