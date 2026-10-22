package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u52 extends y03 implements Parcelable, yx2, s03, ey1 {
    public static final Parcelable.Creator<u52> CREATOR = new q7(23);
    public xx2 f;

    public u52(long j) {
        nx2 nx2VarH = tx2.h();
        xx2 xx2Var = new xx2(nx2VarH.g(), j);
        if (!(nx2VarH instanceof cw0)) {
            xx2Var.b = new xx2(1L, j);
        }
        this.f = xx2Var;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.f;
    }

    @Override // defpackage.x03
    public final z03 b(z03 z03Var, z03 z03Var2, z03 z03Var3) {
        if (((xx2) z03Var2).c == ((xx2) z03Var3).c) {
            return z03Var2;
        }
        return null;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        this.f = (xx2) z03Var;
    }

    @Override // defpackage.yx2
    public final ay2 d() {
        return u92.q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((xx2) tx2.s(this.f, this)).c;
    }

    @Override // defpackage.s03
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        nx2 nx2VarH;
        xx2 xx2Var = (xx2) tx2.f(this.f);
        if (xx2Var.c != j) {
            xx2 xx2Var2 = this.f;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                ((xx2) tx2.n(xx2Var2, this, nx2VarH, xx2Var)).c = j;
            }
            tx2.l(nx2VarH, this);
        }
    }

    @Override // defpackage.ey1
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((xx2) tx2.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
