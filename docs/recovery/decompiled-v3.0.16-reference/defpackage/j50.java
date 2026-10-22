package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j50 implements ly2 {
    public static final i50 a = new i50();

    @Override // defpackage.ly2
    public final String a(SSLSocket sSLSocket) {
        if (c(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ly2
    public final boolean b() {
        boolean z = h50.d;
        return h50.d;
    }

    @Override // defpackage.ly2
    public final boolean c(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.ly2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (c(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            l82 l82Var = l82.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) k91.i(list).toArray(new String[0]));
        }
    }
}
