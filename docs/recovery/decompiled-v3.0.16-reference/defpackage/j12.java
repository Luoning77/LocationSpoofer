package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.Ipv4PreferredDns;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j12 {
    public long A;
    public us1 B;
    public yc0 a = new yc0();
    public t1 b = new t1(5, 5, TimeUnit.MINUTES);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public yl0 e;
    public boolean f;
    public j9 g;
    public boolean h;
    public boolean i;
    public j9 j;
    public md0 k;
    public Proxy l;
    public ProxySelector m;
    public j9 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public jw u;
    public o51 v;
    public int w;
    public int x;
    public int y;
    public int z;

    public j12() {
        zl0 zl0Var = zl0.NONE;
        zl0Var.getClass();
        this.e = new g8(zl0Var);
        this.f = true;
        j9 j9Var = j9.u;
        this.g = j9Var;
        this.h = true;
        this.i = true;
        this.j = j9.C;
        this.k = md0.d;
        this.n = j9Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.o = socketFactory;
        this.r = k12.H;
        this.s = k12.G;
        this.t = i12.a;
        this.u = jw.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = 1024L;
    }

    public final void a(long j) {
        TimeUnit.SECONDS.getClass();
        this.w = bh3.b(j);
    }

    public final void b(Ipv4PreferredDns ipv4PreferredDns) {
        if (ipv4PreferredDns != this.k) {
            this.B = null;
        }
        this.k = ipv4PreferredDns;
    }
}
