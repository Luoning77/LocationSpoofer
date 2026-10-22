package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class q00 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (lu0 lu0Var : (lu0[]) obj3) {
                    int iV = ym3.v((Comparable) lu0Var.invoke(obj), (Comparable) lu0Var.invoke(obj2));
                    if (iV != 0) {
                        return iV;
                    }
                }
                return 0;
            case 1:
                return ((Number) ((s5) obj3).invoke(obj, obj2)).intValue();
            default:
                return ((Number) ((pu0) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
