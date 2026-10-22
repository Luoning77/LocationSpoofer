package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qg2 implements Closeable {
    public final yf2 e;
    public final bd2 f;
    public final String g;
    public final int h;
    public final gx0 i;
    public final ox0 j;
    public final tg2 k;
    public final qg2 l;
    public final qg2 m;
    public final qg2 n;
    public final long o;
    public final long p;
    public final em0 q;

    public qg2(yf2 yf2Var, bd2 bd2Var, String str, int i, gx0 gx0Var, ox0 ox0Var, tg2 tg2Var, qg2 qg2Var, qg2 qg2Var2, qg2 qg2Var3, long j, long j2, em0 em0Var) {
        yf2Var.getClass();
        bd2Var.getClass();
        str.getClass();
        this.e = yf2Var;
        this.f = bd2Var;
        this.g = str;
        this.h = i;
        this.i = gx0Var;
        this.j = ox0Var;
        this.k = tg2Var;
        this.l = qg2Var;
        this.m = qg2Var2;
        this.n = qg2Var3;
        this.o = j;
        this.p = j2;
        this.q = em0Var;
    }

    public static String A(qg2 qg2Var, String str) {
        qg2Var.getClass();
        String strA = qg2Var.j.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final boolean F() {
        int i = this.h;
        return 200 <= i && i < 300;
    }

    public final pg2 O() {
        pg2 pg2Var = new pg2();
        pg2Var.a = this.e;
        pg2Var.b = this.f;
        pg2Var.c = this.h;
        pg2Var.d = this.g;
        pg2Var.e = this.i;
        pg2Var.f = this.j.c();
        pg2Var.g = this.k;
        pg2Var.h = this.l;
        pg2Var.i = this.m;
        pg2Var.j = this.n;
        pg2Var.k = this.o;
        pg2Var.l = this.p;
        pg2Var.m = this.q;
        return pg2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tg2 tg2Var = this.k;
        if (tg2Var != null) {
            tg2Var.close();
        } else {
            fo.n("response is not eligible for a body and must not be closed");
        }
    }

    public final String toString() {
        return "Response{protocol=" + this.f + ", code=" + this.h + ", message=" + this.g + ", url=" + this.e.a + '}';
    }
}
