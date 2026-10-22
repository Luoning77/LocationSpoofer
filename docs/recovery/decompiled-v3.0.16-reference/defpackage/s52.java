package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s52 extends y03 implements Parcelable, yx2, ey1, s03 {
    public static final Parcelable.Creator<s52> CREATOR = new q7(21);
    public vx2 f;

    public s52(float f) {
        nx2 nx2VarH = tx2.h();
        vx2 vx2Var = new vx2(f, nx2VarH.g());
        if (!(nx2VarH instanceof cw0)) {
            vx2Var.b = new vx2(f, 1L);
        }
        this.f = vx2Var;
    }

    @Override // defpackage.x03
    public final z03 a() {
        return this.f;
    }

    @Override // defpackage.x03
    public final z03 b(z03 z03Var, z03 z03Var2, z03 z03Var3) {
        if (((vx2) z03Var2).c == ((vx2) z03Var3).c) {
            return z03Var2;
        }
        return null;
    }

    @Override // defpackage.x03
    public final void c(z03 z03Var) {
        this.f = (vx2) z03Var;
    }

    @Override // defpackage.yx2
    public final ay2 d() {
        return u92.q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((vx2) tx2.s(this.f, this)).c;
    }

    @Override // defpackage.s03
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        nx2 nx2VarH;
        vx2 vx2Var = (vx2) tx2.f(this.f);
        if (vx2Var.c == f) {
            return;
        }
        vx2 vx2Var2 = this.f;
        synchronized (tx2.c) {
            nx2VarH = tx2.h();
            ((vx2) tx2.n(vx2Var2, this, nx2VarH, vx2Var)).c = f;
        }
        tx2.l(nx2VarH, this);
    }

    @Override // defpackage.ey1
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((vx2) tx2.f(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
