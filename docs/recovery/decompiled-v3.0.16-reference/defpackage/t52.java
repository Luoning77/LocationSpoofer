package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t52 extends y03 implements Parcelable, yx2, ey1, s03 {
    public static final Parcelable.Creator<t52> CREATOR = new q7(22);
    public wx2 f;

    public t52(int i) {
        nx2 nx2VarH = tx2.h();
        wx2 wx2Var = new wx2(i, nx2VarH.g());
        if (!(nx2VarH instanceof cw0)) {
            wx2Var.b = new wx2(i, 1L);
        }
        this.f = wx2Var;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.f;
    }

    @Override // defpackage.x03
    public final z03 b(z03 z03Var, z03 z03Var2, z03 z03Var3) {
        if (((wx2) z03Var2).c == ((wx2) z03Var3).c) {
            return z03Var2;
        }
        return null;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        this.f = (wx2) z03Var;
    }

    @Override // defpackage.yx2
    public final ay2 d() {
        return u92.q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((wx2) tx2.s(this.f, this)).c;
    }

    @Override // defpackage.s03
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        nx2 nx2VarH;
        wx2 wx2Var = (wx2) tx2.f(this.f);
        if (wx2Var.c != i) {
            wx2 wx2Var2 = this.f;
            synchronized (tx2.c) {
                nx2VarH = tx2.h();
                ((wx2) tx2.n(wx2Var2, this, nx2VarH, wx2Var)).c = i;
            }
            tx2.l(nx2VarH, this);
        }
    }

    @Override // defpackage.ey1
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((wx2) tx2.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
