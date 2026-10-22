package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.maplibre.android.camera.CameraPosition;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jp1 implements Parcelable {
    public static final Parcelable.Creator<jp1> CREATOR = new q7(15);
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public String H;
    public String[] I;
    public String J;
    public boolean K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public boolean P;
    public String Q;
    public long R;
    public long S;
    public int T;
    public boolean U;
    public boolean V;
    public CameraPosition e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int[] j;
    public Drawable k;
    public boolean l;
    public int m;
    public int[] n;
    public int o;
    public boolean p;
    public int q;
    public int[] r;
    public double s;
    public double t;
    public double u;
    public double v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jp1.class == obj.getClass()) {
            jp1 jp1Var = (jp1) obj;
            if (this.f != jp1Var.f || this.g != jp1Var.g || this.h != jp1Var.h) {
                return false;
            }
            Drawable drawable = this.k;
            Drawable drawable2 = jp1Var.k;
            if (drawable == null ? drawable2 != null : !drawable.equals(drawable2)) {
                return false;
            }
            if (this.i != jp1Var.i || this.l != jp1Var.l || this.m != jp1Var.m || this.o != jp1Var.o || this.p != jp1Var.p || this.q != jp1Var.q || Double.compare(jp1Var.s, this.s) != 0 || Double.compare(jp1Var.t, this.t) != 0 || Double.compare(jp1Var.u, this.u) != 0 || Double.compare(jp1Var.v, this.v) != 0 || this.w != jp1Var.w || this.x != jp1Var.x || this.y != jp1Var.y || this.z != jp1Var.z || this.A != jp1Var.A || this.B != jp1Var.B || this.C != jp1Var.C) {
                return false;
            }
            CameraPosition cameraPosition = this.e;
            CameraPosition cameraPosition2 = jp1Var.e;
            if (cameraPosition == null ? cameraPosition2 != null : !cameraPosition.equals(cameraPosition2)) {
                return false;
            }
            if (!Arrays.equals(this.j, jp1Var.j) || !Arrays.equals(this.n, jp1Var.n) || !Arrays.equals(this.r, jp1Var.r)) {
                return false;
            }
            String str = this.J;
            String str2 = jp1Var.J;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (this.D != jp1Var.D || this.E != jp1Var.E || this.F != jp1Var.F || this.G != jp1Var.G || !this.H.equals(jp1Var.H) || !Arrays.equals(this.I, jp1Var.I) || this.N != jp1Var.N || this.O != jp1Var.O || this.P != jp1Var.P) {
                return false;
            }
            this.Q.equals(jp1Var.Q);
        }
        return false;
    }

    public final int hashCode() {
        CameraPosition cameraPosition = this.e;
        int iHashCode = (((((((((cameraPosition != null ? cameraPosition.hashCode() : 0) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + this.i) * 31;
        Drawable drawable = this.k;
        int iHashCode2 = Arrays.hashCode(this.r) + ((((((((Arrays.hashCode(this.n) + ((((((Arrays.hashCode(this.j) + ((iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31)) * 31) + (this.l ? 1 : 0)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + (this.p ? 1 : 0)) * 31) + this.q) * 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.s);
        int i = (iHashCode2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.t);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.u);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.v);
        int i4 = ((((((((((((((((i3 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31;
        String str = this.J;
        int iHashCode3 = (((((((((((((i4 + (str != null ? str.hashCode() : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + this.E) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31;
        String str2 = this.H;
        int iHashCode4 = (((((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.I)) * 31) + ((int) this.N)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31;
        String str3 = this.Q;
        return ((((((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + ((int) this.R)) * 31) + ((int) this.S)) * 31) + this.T) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        Drawable drawable = this.k;
        Bitmap bitmapCreateBitmap = null;
        if (drawable != null && drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    Drawable drawableMutate = constantState.newDrawable().mutate();
                    bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableMutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawableMutate.draw(canvas);
                }
            }
        }
        parcel.writeParcelable(bitmapCreateBitmap, i);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.m);
        parcel.writeIntArray(this.n);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.q);
        parcel.writeIntArray(this.r);
        parcel.writeInt(this.o);
        parcel.writeDouble(this.s);
        parcel.writeDouble(this.t);
        parcel.writeDouble(this.u);
        parcel.writeDouble(this.v);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeString(this.J);
        parcel.writeByte(this.K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.E);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeString(this.H);
        parcel.writeStringArray(this.I);
        parcel.writeFloat(this.N);
        parcel.writeInt(this.M);
        parcel.writeByte(this.O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Q);
        parcel.writeLong(this.R);
        parcel.writeLong(this.S);
        parcel.writeInt(this.T);
        parcel.writeByte(this.U ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.V ? (byte) 1 : (byte) 0);
    }
}
