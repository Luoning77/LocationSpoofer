package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class q52 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        x93[] x93VarArr = w93.b;
        a = w93.c;
    }

    public static final p52 a(p52 p52Var, int i, int i2, long j, k83 k83Var, w82 w82Var, sf1 sf1Var, int i3, int i4, d93 d93Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        k83 k83Var2 = k83Var;
        w82 w82Var2 = w82Var;
        sf1 sf1Var2 = sf1Var;
        int i7 = i3;
        int i8 = i4;
        d93 d93Var2 = d93Var;
        if (i5 == 0 || i5 == p52Var.a) {
            x93[] x93VarArr = w93.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (w93.a(j3, p52Var.c)) {
                }
            }
            if ((k83Var2 == null || k83Var2.equals(p52Var.d)) && ((i6 == 0 || i6 == p52Var.b) && ((w82Var2 == null || w82Var2.equals(p52Var.e)) && ((sf1Var2 == null || sf1Var2.equals(p52Var.f)) && ((i7 == 0 || i7 == p52Var.g) && ((i8 == 0 || i8 == p52Var.h) && (d93Var2 == null || d93Var2.equals(p52Var.i)))))))) {
                return p52Var;
            }
        } else {
            j2 = 0;
        }
        x93[] x93VarArr2 = w93.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = p52Var.c;
        }
        if (k83Var2 == null) {
            k83Var2 = p52Var.d;
        }
        if (i5 == 0) {
            i5 = p52Var.a;
        }
        if (i6 == 0) {
            i6 = p52Var.b;
        }
        w82 w82Var3 = p52Var.e;
        if (w82Var3 != null && w82Var2 == null) {
            w82Var2 = w82Var3;
        }
        if (sf1Var2 == null) {
            sf1Var2 = p52Var.f;
        }
        if (i7 == 0) {
            i7 = p52Var.g;
        }
        if (i8 == 0) {
            i8 = p52Var.h;
        }
        if (d93Var2 == null) {
            d93Var2 = p52Var.i;
        }
        return new p52(i5, i6, j3, k83Var2, w82Var2, sf1Var2, i7, i8, d93Var2);
    }
}
