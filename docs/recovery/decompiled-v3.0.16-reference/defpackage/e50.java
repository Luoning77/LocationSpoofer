package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class e50 {
    public static final gx1 a;

    static {
        jh2 jh2Var = qz.e;
        int i = jh2Var.c;
        b50 b50Var = new b50(jh2Var, jh2Var, 1);
        int i2 = jh2Var.c;
        m12 m12Var = qz.x;
        int i3 = (m12Var.c << 6) | i2;
        d50 d50Var = new d50(jh2Var, m12Var, 0);
        int i4 = (i2 << 6) | m12Var.c;
        d50 d50Var2 = new d50(m12Var, jh2Var, 0);
        gx1 gx1Var = g41.a;
        gx1 gx1Var2 = new gx1();
        gx1Var2.h(i | (i << 6), b50Var);
        gx1Var2.h(i3, d50Var);
        gx1Var2.h(i4, d50Var2);
        a = gx1Var2;
    }
}
