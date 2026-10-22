package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ob1 implements fr1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ lu0 d;
    public final /* synthetic */ pb1 e;
    public final /* synthetic */ vb1 f;
    public final /* synthetic */ lu0 g;

    public ob1(int i, int i2, Map map, lu0 lu0Var, pb1 pb1Var, vb1 vb1Var, lu0 lu0Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = lu0Var;
        this.e = pb1Var;
        this.f = vb1Var;
        this.g = lu0Var2;
    }

    @Override // defpackage.fr1
    public final void a() {
        u21 u21Var;
        hb1 hb1Var = this.f.e;
        boolean zJ = this.e.J();
        lu0 lu0Var = this.g;
        if (!zJ || (u21Var = hb1Var.K.c.Y) == null) {
            lu0Var.invoke(hb1Var.K.c.p);
        } else {
            lu0Var.invoke(u21Var.p);
        }
    }

    @Override // defpackage.fr1
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fr1
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.fr1
    public final lu0 d() {
        return this.d;
    }

    @Override // defpackage.fr1
    public final int e() {
        return this.a;
    }
}
