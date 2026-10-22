package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pk implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ zk f;

    public /* synthetic */ pk(zk zkVar, int i) {
        this.e = i;
        this.f = zkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.e;
        zk zkVar = this.f;
        switch (i) {
            case 0:
                if ((zkVar.d0 & 1) != 0) {
                    zkVar.A(0);
                }
                if ((zkVar.d0 & 4096) != 0) {
                    zkVar.A(108);
                }
                zkVar.c0 = false;
                zkVar.d0 = 0;
                break;
            default:
                zkVar.A.showAtLocation(zkVar.z, 55, 0, 0);
                sj3 sj3Var = zkVar.C;
                if (sj3Var != null) {
                    sj3Var.b();
                }
                if (zkVar.D && (viewGroup = zkVar.E) != null) {
                    WeakHashMap weakHashMap = yi3.a;
                    if (viewGroup.isLaidOut()) {
                        zkVar.z.setAlpha(0.0f);
                        sj3 sj3VarA = yi3.a(zkVar.z);
                        sj3VarA.a(1.0f);
                        zkVar.C = sj3VarA;
                        sj3VarA.d(new rk(this, 0));
                    }
                }
                zkVar.z.setAlpha(1.0f);
                zkVar.z.setVisibility(0);
                break;
        }
    }
}
