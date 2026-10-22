package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xq0 implements r50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.r50
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                yq0 yq0Var = (yq0) obj;
                if (yq0Var == null) {
                    yq0Var = new yq0(-3);
                }
                ((d31) this.b).B(yq0Var);
                return;
            default:
                yq0 yq0Var2 = (yq0) obj;
                synchronized (zq0.c) {
                    try {
                        tv2 tv2Var = zq0.d;
                        ArrayList arrayList = (ArrayList) tv2Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        tv2Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((r50) arrayList.get(i)).accept(yq0Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
