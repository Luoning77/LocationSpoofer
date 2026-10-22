package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xx2 extends z03 {
    public long c;

    public xx2(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.z03
    public final void a(z03 z03Var) {
        z03Var.getClass();
        this.c = ((xx2) z03Var).c;
    }

    @Override // defpackage.z03
    public final z03 b(long j) {
        return new xx2(j, this.c);
    }
}
