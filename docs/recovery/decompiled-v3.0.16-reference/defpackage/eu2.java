package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eu2 {
    public qa1 a;
    public long b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public eu2(qa1 qa1Var, xb0 xb0Var, lq0 lq0Var, q93 q93Var, Object obj) {
        this.a = qa1Var;
        this.c = xb0Var;
        this.d = lq0Var;
        this.e = q93Var;
        this.f = obj;
        this.g = ke0.H(Boolean.TRUE);
        this.b = w63.a((q93) this.e, (xb0) this.c, (lq0) this.d, w63.a, 1);
    }

    public static void a(eu2 eu2Var, qa1 qa1Var, xb0 xb0Var, q93 q93Var, int i) {
        if ((i & 1) != 0) {
            qa1Var = eu2Var.a;
        }
        if ((i & 2) != 0) {
            xb0Var = (xb0) eu2Var.c;
        }
        lq0 lq0Var = (lq0) eu2Var.d;
        if ((i & 8) != 0) {
            q93Var = (q93) eu2Var.e;
        }
        Object obj = eu2Var.f;
        qa1 qa1Var2 = eu2Var.a;
        w52 w52Var = (w52) eu2Var.g;
        if (qa1Var == qa1Var2 && o51.f(xb0Var, (xb0) eu2Var.c) && o51.f(lq0Var, (lq0) eu2Var.d) && o51.f(q93Var, (q93) eu2Var.e)) {
            if (o51.f(obj, eu2Var.f)) {
                return;
            }
            eu2Var.f = obj;
            w52Var.setValue(Boolean.TRUE);
            return;
        }
        eu2Var.a = qa1Var;
        eu2Var.c = xb0Var;
        eu2Var.d = lq0Var;
        eu2Var.e = q93Var;
        w52Var.setValue(Boolean.TRUE);
    }

    public eu2(au0 au0Var) {
        au0Var.getClass();
        this.c = au0Var;
        this.b = 9205357640488583168L;
        this.g = new du2(this, 0);
    }
}
