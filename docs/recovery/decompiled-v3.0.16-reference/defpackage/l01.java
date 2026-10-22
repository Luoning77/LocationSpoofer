package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class l01 extends Binder implements m01 {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        k01 k01Var;
        String str = m01.d;
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
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            k01Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(k01.c);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k01)) {
                j01 j01Var = new j01();
                j01Var.e = strongBinder;
                k01Var = j01Var;
            } else {
                k01Var = (k01) iInterfaceQueryLocalInterface;
            }
        }
        bg3 bg3Var = (bg3) this;
        if (k01Var == null) {
            return true;
        }
        bg3Var.e.isPermissionRevocationEnabled(new ag3());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
