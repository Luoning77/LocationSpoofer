package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class we extends l82 {
    public static final boolean e;
    public final ArrayList c;
    public final dy d;

    static {
        boolean z = false;
        if (k91.q() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public we() throws NoSuchMethodException {
        g03 g03Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            g03Var = new g03(cls);
        } catch (Exception e2) {
            l82.a.getClass();
            l82.i("unable to load android socket classes", 5, e2);
            g03Var = null;
        }
        int i = 0;
        ArrayList arrayListV0 = yo.v0(new ly2[]{g03Var, new ib0(bg.f), new ib0(j50.a), new ib0(ns.a)});
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
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new dy(method3, method2, method);
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
    public final nd3 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new ve(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final Object g() {
        dy dyVar = this.d;
        dyVar.getClass();
        Method method = dyVar.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = dyVar.b;
                method2.getClass();
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.l82
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.l82
    public final void j(Object obj, String str) {
        dy dyVar = this.d;
        dyVar.getClass();
        if (obj != null) {
            try {
                Method method = dyVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        l82.i(str, 5, null);
    }
}
