package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ns implements ly2 {
    public static final ms a = new ms();

    @Override // defpackage.ly2
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.ly2
    public final boolean b() {
        boolean z = ls.d;
        return ls.d;
    }

    @Override // defpackage.ly2
    public final boolean c(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.ly2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (c(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            l82 l82Var = l82.a;
            parameters.setApplicationProtocols((String[]) k91.i(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
