package defpackage;

import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class am0 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;

    public /* synthetic */ am0(int i, lu0 lu0Var) {
        this.e = i;
        this.f = lu0Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                return ExceptionsConstructorKt.safeCtor$lambda$9(lu0Var, (Throwable) obj);
            case 1:
                tc3 tc3Var = (tc3) obj;
                if (!(tc3Var instanceof zv0)) {
                    fo.n("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) lu0Var.invoke(((zv0) tc3Var).s);
                bool.getClass();
                return bool;
            case 2:
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                if (((int) (pa1Var.f0() & 4294967295L)) > 0) {
                    lu0Var.invoke(Integer.valueOf((int) (pa1Var.f0() & 4294967295L)));
                }
                return mf3.a;
            case 3:
                pa1 pa1Var2 = (pa1) obj;
                pa1Var2.getClass();
                if (((int) (pa1Var2.f0() & 4294967295L)) > 0) {
                    lu0Var.invoke(Integer.valueOf((int) (pa1Var2.f0() & 4294967295L)));
                }
                return mf3.a;
            case 4:
                String str = (String) obj;
                str.getClass();
                lu0Var.invoke(new oz2(str));
                return mf3.a;
            case Logger.WARN /* 5 */:
                String str2 = (String) obj;
                str2.getClass();
                lu0Var.invoke(new oz2(str2));
                return mf3.a;
            case Logger.ERROR /* 6 */:
                nx2 nx2Var = (nx2) lu0Var.invoke((rx2) obj);
                synchronized (tx2.c) {
                    tx2.d = tx2.d.e(nx2Var.g());
                }
                return nx2Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return lu0Var.invoke(l);
        }
    }
}
