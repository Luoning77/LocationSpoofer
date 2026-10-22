package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jj0 {
    public int a = 1;
    public final wt1 b;
    public wt1 c;
    public wt1 d;
    public int e;
    public int f;

    public jj0(wt1 wt1Var) {
        this.b = wt1Var;
        this.c = wt1Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        ut1 ut1VarB = this.c.b.b();
        int iA = ut1VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) ut1VarB.h).get(iA + ut1VarB.e) == 0) || this.e == 65039;
    }
}
