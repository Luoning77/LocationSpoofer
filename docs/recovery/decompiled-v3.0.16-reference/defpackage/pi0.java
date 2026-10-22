package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pi0 {
    public static final long[] e = new long[0];
    public final bt2 a;
    public final t5 b;
    public long c;
    public final long[] d;

    public pi0(bt2 bt2Var, t5 t5Var) {
        bt2Var.getClass();
        this.a = bt2Var;
        this.b = t5Var;
        int iD = bt2Var.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }
}
