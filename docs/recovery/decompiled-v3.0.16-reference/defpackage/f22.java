package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f22 extends cv1 implements hr1 {
    public lu0 s;
    public long t;

    @Override // defpackage.cv1
    public final boolean b1() {
        return true;
    }

    @Override // defpackage.hr1
    public final void h(long j) {
        if (p41.b(this.t, j)) {
            return;
        }
        this.s.invoke(new p41(j));
        this.t = j;
    }
}
