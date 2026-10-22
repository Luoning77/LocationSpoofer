package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u03 extends z03 {
    public n0 c;
    public int d;
    public int e;

    public u03(long j, n0 n0Var) {
        super(j);
        this.c = n0Var;
    }

    @Override // defpackage.z03
    public final void a(z03 z03Var) {
        synchronized (da0.W) {
            z03Var.getClass();
            this.c = ((u03) z03Var).c;
            this.d = ((u03) z03Var).d;
            this.e = ((u03) z03Var).e;
        }
    }

    @Override // defpackage.z03
    public final z03 b(long j) {
        return new u03(j, this.c);
    }
}
