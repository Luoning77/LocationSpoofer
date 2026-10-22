package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cx0 implements cb2 {
    public final l9 e;
    public final f12 f;
    public long g = 0;

    public cx0(l9 l9Var, f12 f12Var) {
        this.e = l9Var;
        this.f = f12Var;
    }

    @Override // defpackage.cb2
    public final long c(l41 l41Var, long j, qa1 qa1Var, long j2) {
        long jB = this.f.b();
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = this.g;
        }
        this.g = jB;
        return h41.c(h41.c(l41Var.c(), gh0.O(jB)), this.e.a(j2, 0L, qa1Var));
    }
}
