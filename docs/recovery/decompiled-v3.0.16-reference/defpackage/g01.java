package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class g01 extends Binder implements h01 {
    public static final /* synthetic */ int e = 0;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = h01.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        e01 e01Var = null;
        e01 e01Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(e01.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e01)) {
                    d01 d01Var = new d01();
                    d01Var.e = strongBinder;
                    e01Var = d01Var;
                } else {
                    e01Var = (e01) iInterfaceQueryLocalInterface;
                }
            }
            int iB = ((qw1) this).b(e01Var, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iB);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            qw1 qw1Var = (qw1) this;
            qw1Var.d(parcel.createStringArray(), parcel.readInt());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(e01.a);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof e01)) {
                d01 d01Var2 = new d01();
                d01Var2.e = strongBinder2;
                e01Var2 = d01Var2;
            } else {
                e01Var2 = (e01) iInterfaceQueryLocalInterface2;
            }
        }
        ((qw1) this).c(e01Var2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
