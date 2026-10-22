package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w52 extends y03 implements Parcelable, yx2 {
    public static final Parcelable.Creator<w52> CREATOR = new v52(0);
    public final ay2 f;
    public zx2 g;

    public w52(Object obj, ay2 ay2Var) {
        this.f = ay2Var;
        nx2 nx2VarH = tx2.h();
        zx2 zx2Var = new zx2(nx2VarH.g(), obj);
        if (!(nx2VarH instanceof cw0)) {
            zx2Var.b = new zx2(1L, obj);
        }
        this.g = zx2Var;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.g;
    }

    @Override // defpackage.x03
    public final z03 b(z03 z03Var, z03 z03Var2, z03 z03Var3) {
        if (this.f.d(((zx2) z03Var2).c, ((zx2) z03Var3).c)) {
            return z03Var2;
        }
        return null;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        this.g = (zx2) z03Var;
    }

    @Override // defpackage.yx2
    public final ay2 d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return ((zx2) tx2.s(this.g, this)).c;
    }

    @Override // defpackage.ey1
    public final void setValue(Object obj) {
        nx2 nx2VarH;
        zx2 zx2Var = (zx2) tx2.f(this.g);
        if (this.f.d(zx2Var.c, obj)) {
            return;
        }
        zx2 zx2Var2 = this.g;
        synchronized (tx2.c) {
            nx2VarH = tx2.h();
            ((zx2) tx2.n(zx2Var2, this, nx2VarH, zx2Var)).c = obj;
        }
        tx2.l(nx2VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((zx2) tx2.f(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        j9 j9Var = j9.W;
        ay2 ay2Var = this.f;
        if (ay2Var.equals(j9Var)) {
            i2 = 0;
        } else if (ay2Var.equals(u92.q)) {
            i2 = 1;
        } else {
            if (!ay2Var.equals(u92.h)) {
                fo.n("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
