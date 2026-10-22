package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.maplibre.android.http.NativeHttpRequest;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wz0 implements gv {
    public NativeHttpRequest a;

    public void a(dv dvVar, Exception exc) {
        int i;
        int i2;
        String str;
        String message = exc.getMessage() != null ? exc.getMessage() : "Error processing the request";
        if ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) {
            i = 0;
        } else {
            i = exc instanceof InterruptedIOException ? 1 : 2;
        }
        if (dh0.b && dvVar != null && dvVar.request() != null) {
            String str2 = dvVar.request().a.h;
            if (i == 1) {
                i2 = 3;
            } else {
                i2 = i == 0 ? 4 : 5;
            }
            if (i == 1) {
                str = "temporary";
            } else {
                str = i == 0 ? "connection" : "permanent";
            }
            StringBuilder sbT = p91.t("Request failed due to a ", str, " error: ", message, " ");
            sbT.append("");
            dh0.w(i2, sbT.toString());
        }
        this.a.handleFailure(i, message);
    }

    @Override // defpackage.gv
    public void onFailure(dv dvVar, IOException iOException) {
        a(dvVar, iOException);
    }

    @Override // defpackage.gv
    public void onResponse(dv dvVar, qg2 qg2Var) {
        boolean zF = qg2Var.F();
        String str = qg2Var.g;
        int i = qg2Var.h;
        if (zF) {
            dh0.w(2, "[HTTP] Request was successful (code = " + i + ").");
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "No additional information";
            }
            dh0.w(3, "[HTTP] Request with response = " + i + ": " + str);
        }
        tg2 tg2Var = qg2Var.k;
        try {
            if (tg2Var == null) {
                dh0.w(6, "[HTTP] Received empty response body");
                return;
            }
            try {
                byte[] bArrBytes = tg2Var.bytes();
                qg2Var.close();
                this.a.onResponse(qg2Var.h, qg2.A(qg2Var, "ETag"), qg2.A(qg2Var, "Last-Modified"), qg2.A(qg2Var, "Cache-Control"), qg2.A(qg2Var, "Expires"), qg2.A(qg2Var, "Retry-After"), qg2.A(qg2Var, "x-rate-limit-reset"), bArrBytes);
            } catch (IOException e) {
                a(dvVar, e);
                qg2Var.close();
            }
        } catch (Throwable th) {
            qg2Var.close();
            throw th;
        }
    }
}
