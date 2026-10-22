package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nw1 extends Binder implements e01 {
    public final /* synthetic */ pw1 e;

    public nw1(pw1 pw1Var) {
        this.e = pw1Var;
        attachInterface(this, e01.a);
    }

    @Override // defpackage.e01
    public final void a(String[] strArr) {
        strArr.getClass();
        pw1 pw1Var = this.e;
        BuildersKt__Builders_commonKt.launch$default(pw1Var.d, null, null, new m(strArr, pw1Var, null, 19), 3, null);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = e01.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a(parcel.createStringArray());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
