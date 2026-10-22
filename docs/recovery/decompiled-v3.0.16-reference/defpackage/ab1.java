package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ab1 implements fr1 {
    public final /* synthetic */ fr1 a;
    public final int b;
    public final int c;

    public ab1(fr1 fr1Var, bb1 bb1Var) {
        this.a = fr1Var;
        za1 za1Var = bb1Var.Z;
        za1Var.getClass();
        this.b = za1Var.e;
        za1 za1Var2 = bb1Var.Z;
        za1Var2.getClass();
        this.c = za1Var2.f;
    }

    @Override // defpackage.fr1
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.fr1
    public final int b() {
        return this.c;
    }

    @Override // defpackage.fr1
    public final Map c() {
        return this.a.c();
    }

    @Override // defpackage.fr1
    public final lu0 d() {
        return this.a.d();
    }

    @Override // defpackage.fr1
    public final int e() {
        return this.b;
    }
}
