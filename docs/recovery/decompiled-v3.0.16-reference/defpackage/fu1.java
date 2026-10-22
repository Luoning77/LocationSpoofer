package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fu1 extends cv1 implements hg0 {
    public final ix1 s;
    public final long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final oh x;
    public Job y;
    public Job z;

    public fu1(ix1 ix1Var, long j) {
        ix1Var.getClass();
        this.s = ix1Var;
        this.t = j;
        this.x = k22.a(0.0f, 0.01f);
    }

    @Override // defpackage.cv1
    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new d6(this, (q60) null, 13), 3, null);
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        jb1Var.c();
        float fFloatValue = ((Number) this.x.d()).floatValue();
        if (fFloatValue > 0.0f) {
            jg0.c0(jb1Var, this.t, 0L, jb1Var.e.a(), fFloatValue, null, 0, 114);
        }
    }
}
