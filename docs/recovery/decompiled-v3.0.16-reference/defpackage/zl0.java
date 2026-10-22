package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class zl0 {
    public static final xl0 Companion = new xl0();
    public static final zl0 NONE = new wl0();

    public void cacheConditionalHit(dv dvVar, qg2 qg2Var) {
        dvVar.getClass();
        qg2Var.getClass();
    }

    public void cacheHit(dv dvVar, qg2 qg2Var) {
        dvVar.getClass();
        qg2Var.getClass();
    }

    public void cacheMiss(dv dvVar) {
        dvVar.getClass();
    }

    public void canceled(dv dvVar) {
        dvVar.getClass();
    }

    public void connectEnd(dv dvVar, InetSocketAddress inetSocketAddress, Proxy proxy, bd2 bd2Var) {
        inetSocketAddress.getClass();
    }

    public void connectFailed(dv dvVar, InetSocketAddress inetSocketAddress, Proxy proxy, bd2 bd2Var, IOException iOException) {
        dvVar.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        iOException.getClass();
    }

    public void connectStart(dv dvVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        inetSocketAddress.getClass();
    }

    public void connectionAcquired(dv dvVar, n40 n40Var) {
        n40Var.getClass();
    }

    public void connectionReleased(dv dvVar, n40 n40Var) {
        dvVar.getClass();
        n40Var.getClass();
    }

    public void proxySelectEnd(dv dvVar, zz0 zz0Var, List<Proxy> list) {
        dvVar.getClass();
        zz0Var.getClass();
        list.getClass();
    }

    public void proxySelectStart(dv dvVar, zz0 zz0Var) {
        dvVar.getClass();
        zz0Var.getClass();
    }

    public void requestBodyEnd(dv dvVar, long j) {
        dvVar.getClass();
    }

    public void requestBodyStart(dv dvVar) {
        dvVar.getClass();
    }

    public void requestFailed(dv dvVar, IOException iOException) {
        dvVar.getClass();
        iOException.getClass();
    }

    public void requestHeadersEnd(dv dvVar, yf2 yf2Var) {
        yf2Var.getClass();
    }

    public void requestHeadersStart(dv dvVar) {
        dvVar.getClass();
    }

    public void responseBodyEnd(dv dvVar, long j) {
        dvVar.getClass();
    }

    public void responseBodyStart(dv dvVar) {
        dvVar.getClass();
    }

    public void responseFailed(dv dvVar, IOException iOException) {
        dvVar.getClass();
        iOException.getClass();
    }

    public void responseHeadersStart(dv dvVar) {
        dvVar.getClass();
    }

    public void satisfactionFailure(dv dvVar, qg2 qg2Var) {
        dvVar.getClass();
        qg2Var.getClass();
    }

    public void callEnd(dv dvVar) {
    }

    public void callStart(dv dvVar) {
    }

    public void secureConnectStart(dv dvVar) {
    }

    public void callFailed(dv dvVar, IOException iOException) {
    }

    public void dnsStart(dv dvVar, String str) {
    }

    public void responseHeadersEnd(dv dvVar, qg2 qg2Var) {
    }

    public void secureConnectEnd(dv dvVar, gx0 gx0Var) {
    }

    public void dnsEnd(dv dvVar, String str, List list) {
    }
}
