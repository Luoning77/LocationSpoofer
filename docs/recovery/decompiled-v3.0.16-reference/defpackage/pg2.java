package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pg2 {
    public yf2 a;
    public bd2 b;
    public String d;
    public gx0 e;
    public tg2 g;
    public qg2 h;
    public qg2 i;
    public qg2 j;
    public long k;
    public long l;
    public em0 m;
    public int c = -1;
    public nx0 f = new nx0(0);

    public static void b(qg2 qg2Var, String str) {
        if (qg2Var != null) {
            if (qg2Var.k != null) {
                fo.f(str.concat(".body != null"));
                return;
            }
            if (qg2Var.l != null) {
                fo.f(str.concat(".networkResponse != null"));
            } else if (qg2Var.m != null) {
                fo.f(str.concat(".cacheResponse != null"));
            } else {
                if (qg2Var.n == null) {
                    return;
                }
                fo.f(str.concat(".priorResponse != null"));
            }
        }
    }

    public final qg2 a() {
        int i = this.c;
        if (i < 0) {
            b81.f(this.c, "code < 0: ");
            return null;
        }
        yf2 yf2Var = this.a;
        if (yf2Var == null) {
            fo.n("request == null");
            return null;
        }
        bd2 bd2Var = this.b;
        if (bd2Var == null) {
            fo.n("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new qg2(yf2Var, bd2Var, str, i, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        fo.n("message == null");
        return null;
    }
}
