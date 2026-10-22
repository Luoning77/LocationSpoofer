package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k12 implements Cloneable, cv {
    public static final List G = bh3.j(bd2.i, bd2.g);
    public static final List H = bh3.j(v40.e, v40.f);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final us1 F;
    public final yc0 e;
    public final t1 f;
    public final List g;
    public final List h;
    public final yl0 i;
    public final boolean j;
    public final j9 k;
    public final boolean l;
    public final boolean m;
    public final j9 n;
    public final md0 o;
    public final Proxy p;
    public final ProxySelector q;
    public final j9 r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final HostnameVerifier x;
    public final jw y;
    public final o51 z;

    public k12(j12 j12Var) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        SSLSocketFactory sSLSocketFactoryL;
        X509TrustManager x509TrustManagerM;
        o51 o51VarB;
        this.e = j12Var.a;
        this.f = j12Var.b;
        this.g = bh3.v(j12Var.c);
        this.h = bh3.v(j12Var.d);
        this.i = j12Var.e;
        this.j = j12Var.f;
        this.k = j12Var.g;
        this.l = j12Var.h;
        this.m = j12Var.i;
        this.n = j12Var.j;
        this.o = j12Var.k;
        Proxy proxy = j12Var.l;
        this.p = proxy;
        if (proxy != null) {
            proxySelector = k02.a;
        } else {
            proxySelector = j12Var.m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = k02.a;
            }
        }
        this.q = proxySelector;
        this.r = j12Var.n;
        this.s = j12Var.o;
        List list = j12Var.r;
        this.v = list;
        this.w = j12Var.s;
        this.x = j12Var.t;
        this.A = j12Var.w;
        this.B = j12Var.x;
        this.C = j12Var.y;
        this.D = j12Var.z;
        this.E = j12Var.A;
        us1 us1Var = j12Var.B;
        this.F = us1Var == null ? new us1(8, (byte) 0) : us1Var;
        if (list != null && list.isEmpty()) {
            this.t = null;
            this.z = null;
            this.u = null;
            this.y = jw.c;
            sSLSocketFactoryL = null;
            o51VarB = null;
            x509TrustManagerM = null;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.t = null;
                this.z = null;
                this.u = null;
                this.y = jw.c;
                sSLSocketFactoryL = null;
                o51VarB = null;
                x509TrustManagerM = null;
                break;
            }
            if (((v40) it.next()).a) {
                sSLSocketFactoryL = j12Var.p;
                if (sSLSocketFactoryL == null) {
                    l82 l82Var = l82.a;
                    x509TrustManagerM = l82.a.m();
                    this.u = x509TrustManagerM;
                    sSLSocketFactoryL = l82.a.l(x509TrustManagerM);
                    this.t = sSLSocketFactoryL;
                    o51VarB = l82.a.b(x509TrustManagerM);
                    this.z = o51VarB;
                    jw jwVar = j12Var.u;
                    jwVar.getClass();
                    this.y = o51.f(jwVar.b, o51VarB) ? jwVar : new jw(jwVar.a, o51VarB);
                    break;
                }
                this.t = sSLSocketFactoryL;
                o51VarB = j12Var.v;
                o51VarB.getClass();
                this.z = o51VarB;
                x509TrustManagerM = j12Var.q;
                x509TrustManagerM.getClass();
                this.u = x509TrustManagerM;
                jw jwVar2 = j12Var.u;
                jwVar2.getClass();
                this.y = o51.f(jwVar2.b, o51VarB) ? jwVar2 : new jw(jwVar2.a, o51VarB);
                break;
            }
        }
        List list2 = this.h;
        List list3 = this.g;
        list3.getClass();
        if (list3.contains(null)) {
            b81.q(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            b81.q(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.v;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((v40) it2.next()).a) {
                    if (sSLSocketFactoryL == null) {
                        fo.n("sslSocketFactory == null");
                        throw null;
                    }
                    if (o51VarB == null) {
                        fo.n("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerM != null) {
                        return;
                    }
                    fo.n("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactoryL != null) {
            fo.n("Check failed.");
            throw null;
        }
        if (o51VarB != null) {
            fo.n("Check failed.");
            throw null;
        }
        if (x509TrustManagerM != null) {
            fo.n("Check failed.");
            throw null;
        }
        if (o51.f(this.y, jw.c)) {
            return;
        }
        fo.n("Check failed.");
        throw null;
    }

    public final j12 a() {
        j12 j12Var = new j12();
        j12Var.a = this.e;
        j12Var.b = this.f;
        fz.b0(j12Var.c, this.g);
        fz.b0(j12Var.d, this.h);
        j12Var.e = this.i;
        j12Var.f = this.j;
        j12Var.g = this.k;
        j12Var.h = this.l;
        j12Var.i = this.m;
        j12Var.j = this.n;
        j12Var.k = this.o;
        j12Var.l = this.p;
        j12Var.m = this.q;
        j12Var.n = this.r;
        j12Var.o = this.s;
        j12Var.p = this.t;
        j12Var.q = this.u;
        j12Var.r = this.v;
        j12Var.s = this.w;
        j12Var.t = this.x;
        j12Var.u = this.y;
        j12Var.v = this.z;
        j12Var.w = this.A;
        j12Var.x = this.B;
        j12Var.y = this.C;
        j12Var.z = this.D;
        j12Var.A = this.E;
        j12Var.B = this.F;
        return j12Var;
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // defpackage.cv
    public final dv newCall(yf2 yf2Var) {
        yf2Var.getClass();
        return new xd2(this, yf2Var);
    }
}
