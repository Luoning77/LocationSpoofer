package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ow1 implements ServiceConnection {
    public final /* synthetic */ pw1 a;

    public ow1(pw1 pw1Var) {
        this.a = pw1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h01 h01Var;
        componentName.getClass();
        iBinder.getClass();
        int i = g01.e;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(h01.b);
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h01)) {
            f01 f01Var = new f01();
            f01Var.e = iBinder;
            h01Var = f01Var;
        } else {
            h01Var = (h01) iInterfaceQueryLocalInterface;
        }
        pw1 pw1Var = this.a;
        pw1Var.g = h01Var;
        try {
            pw1Var.f = h01Var.b(pw1Var.j, pw1Var.a);
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.a.g = null;
    }
}
