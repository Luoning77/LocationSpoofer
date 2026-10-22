package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class bw {
    static {
        new b52(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static zv a(f30 f30Var) {
        hh0 hh0Var = vz.a;
        long j = ((hz) ((uz) ((ov0) f30Var).j(hh0Var)).O.getValue()).a;
        long j2 = ((hz) ((uz) ((ov0) f30Var).j(hh0Var)).P.getValue()).a;
        boolean zE = ((ov0) f30Var).e(j) | ((ov0) f30Var).e(j2);
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (zE || objQ == d30.a) {
            objQ = new zv(j, j2);
            ov0Var.m0(objQ);
        }
        return (zv) objQ;
    }
}
