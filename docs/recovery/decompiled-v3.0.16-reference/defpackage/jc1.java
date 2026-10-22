package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jc1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ q01 b;

    public /* synthetic */ jc1(q01 q01Var, int i) {
        this.a = i;
        this.b = q01Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        q01 q01Var = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(q01Var.e(((rd1) obj).i)).compareTo(Integer.valueOf(q01Var.e(((rd1) obj2).i)));
            case 1:
                return Integer.valueOf(q01Var.e(((rd1) obj).i)).compareTo(Integer.valueOf(q01Var.e(((rd1) obj2).i)));
            case 2:
                return Integer.valueOf(q01Var.e(((rd1) obj2).i)).compareTo(Integer.valueOf(q01Var.e(((rd1) obj).i)));
            default:
                return Integer.valueOf(q01Var.e(((rd1) obj2).i)).compareTo(Integer.valueOf(q01Var.e(((rd1) obj).i)));
        }
    }
}
