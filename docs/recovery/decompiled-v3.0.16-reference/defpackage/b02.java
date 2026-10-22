package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class b02 {
    public final gy1 a = new gy1(new qz1[16]);
    public final sx1 b = new sx1(10);

    public boolean a(zj1 zj1Var, pa1 pa1Var, c51 c51Var, boolean z) {
        gy1 gy1Var = this.a;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((qz1) objArr[i2]).a(zj1Var, pa1Var, c51Var, z) || z2;
        }
        return z2;
    }

    public void b(c51 c51Var) {
        gy1 gy1Var = this.a;
        int i = gy1Var.g;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((qz1) gy1Var.e[i]).d.b == 0) {
                gy1Var.k(i);
            }
        }
    }
}
