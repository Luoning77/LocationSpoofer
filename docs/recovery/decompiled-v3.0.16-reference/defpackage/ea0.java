package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ea0 extends cv1 implements hg0 {
    public final ix1 s;
    public boolean t;
    public boolean u;
    public boolean v;

    public ea0(ix1 ix1Var) {
        this.s = ix1Var;
    }

    @Override // defpackage.cv1
    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new d6(this, (q60) null, 4), 3, null);
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        jb1Var.c();
        xv xvVar = jb1Var.e;
        if (this.t) {
            jg0.c0(jb1Var, hz.c(0.3f, hz.b), 0L, xvVar.a(), 0.0f, null, 0, 122);
        } else if (this.u || this.v) {
            jg0.c0(jb1Var, hz.c(0.1f, hz.b), 0L, xvVar.a(), 0.0f, null, 0, 122);
        }
    }
}
