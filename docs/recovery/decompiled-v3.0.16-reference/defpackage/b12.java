package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b12 {
    public final d31 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public b12(d31 d31Var, int[] iArr, String[] strArr) {
        d31Var.getClass();
        iArr.getClass();
        strArr.getClass();
        this.a = d31Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? mc0.H(strArr[0]) : zj0.e;
        } else {
            fo.n("Check failed.");
            throw null;
        }
    }
}
