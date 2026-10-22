package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gy2 extends z03 {
    public m72 c;
    public int d;

    public gy2(long j, m72 m72Var) {
        super(j);
        this.c = m72Var;
    }

    @Override // defpackage.z03
    public final void a(z03 z03Var) {
        z03Var.getClass();
        gy2 gy2Var = (gy2) z03Var;
        synchronized (ym3.d0) {
            this.c = gy2Var.c;
            this.d = gy2Var.d;
        }
    }

    @Override // defpackage.z03
    public final z03 b(long j) {
        return new gy2(j, this.c);
    }
}
