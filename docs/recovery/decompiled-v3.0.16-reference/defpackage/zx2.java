package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zx2 extends z03 {
    public Object c;

    public zx2(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.z03
    public final void a(z03 z03Var) {
        z03Var.getClass();
        this.c = ((zx2) z03Var).c;
    }

    @Override // defpackage.z03
    public final z03 b(long j) {
        return new zx2(tx2.h().g(), this.c);
    }
}
