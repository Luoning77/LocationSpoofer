package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sb3 {
    public final long a;
    public final long b;
    public final boolean c;

    public sb3(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final sb3 a(sb3 sb3Var) {
        return new sb3(c12.e(this.a, sb3Var.a), Math.max(this.b, sb3Var.b), this.c || sb3Var.c);
    }
}
