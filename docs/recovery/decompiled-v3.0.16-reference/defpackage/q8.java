package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q8 {
    public final md0 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final jw e;
    public final j9 f;
    public final Proxy g;
    public final ProxySelector h;
    public final zz0 i;
    public final List j;
    public final List k;

    public q8(String str, int i, md0 md0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, jw jwVar, j9 j9Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        md0Var.getClass();
        socketFactory.getClass();
        j9Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = md0Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = jwVar;
        this.f = j9Var;
        this.g = proxy;
        this.h = proxySelector;
        yz0 yz0Var = new yz0();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            yz0Var.d = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                fo.i("unexpected scheme: ".concat(str2));
                throw null;
            }
            yz0Var.d = "https";
        }
        String strP = ke0.P(c30.e(str, 0, 0, 7));
        if (strP == null) {
            fo.i("unexpected host: ".concat(str));
            throw null;
        }
        yz0Var.g = strP;
        if (1 > i || i >= 65536) {
            fo.f(p91.l(i, "unexpected port: "));
            throw null;
        }
        yz0Var.b = i;
        this.i = yz0Var.a();
        this.j = bh3.v(list);
        this.k = bh3.v(list2);
    }

    public final boolean a(q8 q8Var) {
        return o51.f(this.a, q8Var.a) && this.f.equals(q8Var.f) && this.j.equals(q8Var.j) && this.k.equals(q8Var.k) && o51.f(this.h, q8Var.h) && o51.f(this.g, q8Var.g) && o51.f(this.c, q8Var.c) && o51.f(this.d, q8Var.d) && o51.f(this.e, q8Var.e) && this.i.e == q8Var.i.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return this.i.equals(q8Var.i) && a(q8Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + p91.g(this.k, p91.g(this.j, (this.f.hashCode() + ((this.a.hashCode() + p91.d(527, 31, this.i.h)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        zz0 zz0Var = this.i;
        sb.append(zz0Var.d);
        sb.append(':');
        sb.append(zz0Var.e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        return p91.q(sb, str, '}');
    }
}
