package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kf3 {
    public z92 a;
    public z92 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    public final void a(f83 f83Var) {
        z92 z92Var;
        dj djVar = f83Var.a;
        this.e = false;
        z92 z92Var2 = this.a;
        if (f83Var.equals(z92Var2 != null ? (f83) z92Var2.g : null)) {
            return;
        }
        String str = djVar.f;
        z92 z92Var3 = this.a;
        boolean zF = o51.f(str, z92Var3 != null ? ((f83) z92Var3.g).a.f : null);
        z92 z92Var4 = this.a;
        if (zF) {
            if (z92Var4 != null) {
                z92Var4.g = f83Var;
                return;
            }
            return;
        }
        this.a = new z92(6, z92Var4, f83Var);
        this.b = null;
        int length = djVar.f.length() + this.c;
        this.c = length;
        if (length > 100000) {
            z92 z92Var5 = this.a;
            if ((z92Var5 != null ? (z92) z92Var5.f : null) == null) {
                return;
            }
            while (true) {
                if (z92Var5 == null) {
                    z92Var = null;
                } else {
                    z92 z92Var6 = (z92) z92Var5.f;
                    if (z92Var6 != null) {
                        z92Var = (z92) z92Var6.f;
                    } else {
                        z92Var = null;
                    }
                }
                if (z92Var == null) {
                    break;
                } else {
                    z92Var5 = (z92) z92Var5.f;
                }
            }
            if (z92Var5 != null) {
                z92Var5.f = null;
            }
        }
    }
}
