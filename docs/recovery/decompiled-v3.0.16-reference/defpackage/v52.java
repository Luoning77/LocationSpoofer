package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v52 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ v52(int i) {
        this.a = i;
    }

    public static w52 a(Parcel parcel, ClassLoader classLoader) {
        ay2 ay2Var;
        if (classLoader == null) {
            classLoader = v52.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            ay2Var = j9.W;
        } else if (i == 1) {
            ay2Var = u92.q;
        } else {
            if (i != 2) {
                fo.n(p91.m(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            ay2Var = u92.h;
        }
        return new w52(value, ay2Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return h.f;
                }
                fo.n("superState must be null");
                return null;
            default:
                return new eb3(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w52[i];
            case 1:
                return new h[i];
            default:
                return new eb3[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return h.f;
                }
                fo.n("superState must be null");
                return null;
            default:
                return new eb3(parcel, null);
        }
    }
}
