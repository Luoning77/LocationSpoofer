package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ib0 implements ly2 {
    public final hb0 a;
    public ly2 b;

    public ib0(hb0 hb0Var) {
        this.a = hb0Var;
    }

    @Override // defpackage.ly2
    public final String a(SSLSocket sSLSocket) {
        ly2 ly2VarE = e(sSLSocket);
        if (ly2VarE != null) {
            return ly2VarE.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ly2
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ly2
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.c(sSLSocket);
    }

    @Override // defpackage.ly2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        ly2 ly2VarE = e(sSLSocket);
        if (ly2VarE != null) {
            ly2VarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized ly2 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.c(sSLSocket)) {
                this.b = this.a.f(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
