package defpackage;

import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f62 implements p40 {
    public final al2 e;
    public final String f;
    public final pu0 g;
    public final i43 h = new i43(new hd(this, 26));

    public f62(al2 al2Var, String str, pu0 pu0Var) {
        this.e = al2Var;
        this.f = str;
        this.g = pu0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        i43 i43Var = this.h;
        if (i43Var.a()) {
            ((zk2) i43Var.getValue()).close();
        }
    }

    @Override // defpackage.p40
    public final Object z(boolean z, pu0 pu0Var, q60 q60Var) {
        e62 e62Var = (e62) q60Var.getContext().get(e62.f);
        d62 d62Var = e62Var != null ? e62Var.e : null;
        if (d62Var != null) {
            return pu0Var.invoke(d62Var, q60Var);
        }
        d62 d62Var2 = new d62(this.g, (zk2) this.h.getValue());
        return BuildersKt.withContext(new e62(d62Var2), new wr1(pu0Var, d62Var2, null, 5), q60Var);
    }
}
