package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h72 implements mf2 {
    public final Set e;
    public final gy1 f = new gy1(new sv0[16]);

    public h72(Set set) {
        this.e = set;
    }

    @Override // defpackage.mf2
    public final void a() {
        gy1 gy1Var = this.f;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            mf2 mf2Var = ((sv0) objArr[i2]).a;
            this.e.remove(mf2Var);
            mf2Var.a();
        }
    }

    @Override // defpackage.mf2
    public final void b() {
    }

    @Override // defpackage.mf2
    public final void c() {
    }
}
