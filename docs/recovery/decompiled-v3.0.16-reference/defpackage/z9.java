package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z9 extends l82 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = k91.q() && Build.VERSION.SDK_INT >= 29;
    }

    public z9() {
        int i = 0;
        ArrayList arrayListV0 = yo.v0(new ly2[]{(!k91.q() || Build.VERSION.SDK_INT < 29) ? null : new aa(), new ib0(bg.f), new ib0(j50.a), new ib0(ns.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListV0.size();
        while (i < size) {
            Object obj = arrayListV0.get(i);
            i++;
            if (((ly2) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.l82
    public final o51 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ia iaVar = x509TrustManagerExtensions != null ? new ia(x509TrustManager, x509TrustManagerExtensions) : null;
        return iaVar != null ? iaVar : new sq(c(x509TrustManager));
    }

    @Override // defpackage.l82
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((ly2) obj).c(sSLSocket));
        ly2 ly2Var = (ly2) obj;
        if (ly2Var != null) {
            ly2Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.l82
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((ly2) obj).c(sSLSocket));
        ly2 ly2Var = (ly2) obj;
        if (ly2Var != null) {
            return ly2Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.l82
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
