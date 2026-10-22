package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ae2 extends ez0 implements n40 {
    public final dj2 b;
    public Socket c;
    public Socket d;
    public gx0 e;
    public bd2 f;
    public lz0 g;
    public td2 h;
    public sd2 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public ae2(fg0 fg0Var, dj2 dj2Var) {
        dj2Var.getClass();
        this.b = dj2Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(k12 k12Var, dj2 dj2Var, IOException iOException) {
        dj2Var.getClass();
        iOException.getClass();
        if (dj2Var.b.type() != Proxy.Type.DIRECT) {
            q8 q8Var = dj2Var.a;
            q8Var.h.connectFailed(q8Var.i.k(), dj2Var.b.address(), iOException);
        }
        us1 us1Var = k12Var.F;
        synchronized (us1Var) {
            ((LinkedHashSet) us1Var.f).add(dj2Var);
        }
    }

    @Override // defpackage.ez0
    public final synchronized void a(lz0 lz0Var, qt2 qt2Var) {
        qt2Var.getClass();
        this.o = (qt2Var.a & 16) != 0 ? qt2Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.ez0
    public final void b(sz0 sz0Var) {
        sz0Var.c(8, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[LOOP:0: B:18:0x005d->B:102:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[PHI: r1
      0x0072: PHI (r1v6 java.lang.Object) = (r1v21 java.lang.Object), (r1v22 java.lang.Object) binds: [B:21:0x0064, B:23:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ae2] */
    /* JADX WARN: Type inference failed for: r1v10, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [dv] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [dv] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void c(int i, int i2, int i3, boolean z, dv dvVar, zl0 zl0Var) throws Throwable {
        ?? r1;
        IOException iOException;
        Socket socket;
        Socket socket2;
        boolean z2;
        Proxy.Type type;
        zl0Var.getClass();
        if (this.f != null) {
            fo.n("already connected");
            return;
        }
        q8 q8Var = this.b.a;
        List list = q8Var.k;
        w40 w40Var = new w40(list);
        ?? r2 = q8Var.c;
        if (r2 == 0) {
            if (!list.contains(v40.f)) {
                throw new oj2(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.i.d;
            l82 l82Var = l82.a;
            if (!l82.a.h(str)) {
                throw new oj2(new UnknownServiceException(az2.k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (q8Var.j.contains(bd2.j)) {
            throw new oj2(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        oj2 oj2Var = null;
        while (true) {
            try {
                dj2 dj2Var = this.b;
                try {
                    SSLSocketFactory sSLSocketFactory = dj2Var.a.c;
                    Object obj = sSLSocketFactory;
                    if (sSLSocketFactory != null) {
                        Proxy.Type type2 = dj2Var.b.type();
                        type = Proxy.Type.HTTP;
                        if (type2 == type) {
                            obj = type;
                            z2 = true;
                            r1 = type;
                        } else {
                            obj = type;
                            z2 = false;
                            r1 = obj;
                        }
                    } else {
                        obj = type;
                        z2 = false;
                        r1 = obj;
                    }
                    try {
                        if (z2) {
                            try {
                                f(i, i2, i3, dvVar, zl0Var);
                                r2 = dvVar;
                                r1 = zl0Var;
                                if (this.c != null) {
                                    break;
                                } else {
                                    break;
                                }
                            } catch (IOException e) {
                                e = e;
                                r2 = dvVar;
                                r1 = zl0Var;
                                iOException = e;
                                socket = this.d;
                                if (socket != null) {
                                    bh3.d(socket);
                                }
                                socket2 = this.c;
                                if (socket2 != null) {
                                    bh3.d(socket2);
                                }
                                this.d = null;
                                this.c = null;
                                this.h = null;
                                this.i = null;
                                this.e = null;
                                this.f = null;
                                this.g = null;
                                this.o = 1;
                                dj2 dj2Var2 = this.b;
                                r1.connectFailed(r2, dj2Var2.c, dj2Var2.b, null, iOException);
                                if (oj2Var == null) {
                                    oj2Var = new oj2(iOException);
                                } else {
                                    vd0.d(oj2Var.e, iOException);
                                    oj2Var.f = iOException;
                                }
                                if (z) {
                                    throw oj2Var;
                                }
                                w40Var.d = true;
                                if (w40Var.c) {
                                    throw oj2Var;
                                }
                                if (!(iOException instanceof ProtocolException)) {
                                    throw oj2Var;
                                }
                                if (!(iOException instanceof InterruptedIOException)) {
                                    throw oj2Var;
                                }
                                if (!(iOException instanceof SSLHandshakeException)) {
                                }
                                if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                    throw oj2Var;
                                }
                                if (iOException instanceof SSLException) {
                                    throw oj2Var;
                                }
                            }
                        } else {
                            dv dvVar2 = dvVar;
                            zl0 zl0Var2 = zl0Var;
                            e(i, i2, dvVar2, zl0Var2);
                            r1 = zl0Var2;
                            r2 = dvVar2;
                        }
                        g(w40Var, r2, r1);
                        dj2 dj2Var3 = this.b;
                        r1.connectEnd(r2, dj2Var3.c, dj2Var3.b, this.f);
                        break;
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r2 = dvVar;
                    r1 = zl0Var;
                    iOException = e;
                    socket = this.d;
                    if (socket != null) {
                        bh3.d(socket);
                    }
                    socket2 = this.c;
                    if (socket2 != null) {
                        bh3.d(socket2);
                    }
                    this.d = null;
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.o = 1;
                    dj2 dj2Var4 = this.b;
                    r1.connectFailed(r2, dj2Var4.c, dj2Var4.b, null, iOException);
                    if (oj2Var == null) {
                        oj2Var = new oj2(iOException);
                    } else {
                        vd0.d(oj2Var.e, iOException);
                        oj2Var.f = iOException;
                    }
                    if (z) {
                        throw oj2Var;
                    }
                    w40Var.d = true;
                    if (w40Var.c) {
                        throw oj2Var;
                    }
                    if (!(iOException instanceof ProtocolException)) {
                        throw oj2Var;
                    }
                    if (!(iOException instanceof InterruptedIOException)) {
                        throw oj2Var;
                    }
                    if (!(iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) {
                        throw oj2Var;
                    }
                    if (!(iOException instanceof SSLPeerUnverifiedException)) {
                        throw oj2Var;
                    }
                    if (iOException instanceof SSLException) {
                        throw oj2Var;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            }
        }
        dj2 dj2Var5 = this.b;
        if (dj2Var5.a.c != null && dj2Var5.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new oj2(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, dv dvVar, zl0 zl0Var) throws IOException {
        Socket socketCreateSocket;
        dj2 dj2Var = this.b;
        Proxy proxy = dj2Var.b;
        q8 q8Var = dj2Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : yd2.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = q8Var.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        zl0Var.connectStart(dvVar, this.b.c, proxy);
        socketCreateSocket.setSoTimeout(i2);
        try {
            l82 l82Var = l82.a;
            l82.a.e(socketCreateSocket, this.b.c, i);
            try {
                Logger logger = l12.a;
                my2 my2Var = new my2(socketCreateSocket);
                InputStream inputStream = socketCreateSocket.getInputStream();
                inputStream.getClass();
                this.h = new td2(new ep(0, my2Var, new ep(i4, inputStream, my2Var)));
                my2 my2Var2 = new my2(socketCreateSocket);
                OutputStream outputStream = socketCreateSocket.getOutputStream();
                outputStream.getClass();
                this.i = new sd2(new dp(my2Var2, new dp(outputStream, my2Var2)));
            } catch (NullPointerException e) {
                if (o51.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, dv dvVar, zl0 zl0Var) throws IOException {
        xp xpVar = new xp(4);
        dj2 dj2Var = this.b;
        xpVar.a = dj2Var.a.i;
        xpVar.n("CONNECT", null);
        ((nx0) xpVar.c).q("Host", bh3.u(dj2Var.a.i, true));
        ((nx0) xpVar.c).q("Proxy-Connection", "Keep-Alive");
        ((nx0) xpVar.c).q("User-Agent", "okhttp/4.12.0");
        yf2 yf2VarF = xpVar.f();
        nx0 nx0Var = new nx0(0);
        ce2 ce2Var = bh3.c;
        nx0Var.q("Proxy-Authenticate", "OkHttp-Preemptive");
        new qg2(yf2VarF, bd2.g, "Preemptive Authenticate", 407, null, nx0Var.c(), ce2Var, null, null, null, -1L, -1L, null);
        zz0 zz0Var = yf2VarF.a;
        e(i, i2, dvVar, zl0Var);
        String str = "CONNECT " + bh3.u(zz0Var, true) + " HTTP/1.1";
        td2 td2Var = this.h;
        td2Var.getClass();
        sd2 sd2Var = this.i;
        sd2Var.getClass();
        bz0 bz0Var = new bz0(null, this, td2Var, sd2Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        td2Var.e.d().g(i2, timeUnit);
        sd2Var.e.d().g(i3, timeUnit);
        bz0Var.j(yf2VarF.c, str);
        bz0Var.c();
        pg2 pg2VarG = bz0Var.g(false);
        pg2VarG.getClass();
        pg2VarG.a = yf2VarF;
        qg2 qg2VarA = pg2VarG.a();
        int i4 = qg2VarA.h;
        long jI = bh3.i(qg2VarA);
        if (jI != -1) {
            yy0 yy0VarI = bz0Var.i(jI);
            bh3.s(yy0VarI, Integer.MAX_VALUE);
            yy0VarI.close();
        }
        if (i4 != 200) {
            if (i4 == 407) {
                fo.r("Failed to authenticate with proxy");
                return;
            } else {
                fo.r(p91.l(i4, "Unexpected response code for CONNECT: "));
                return;
            }
        }
        if (td2Var.f.F() && sd2Var.f.F()) {
            return;
        }
        fo.r("TLS tunnel buffered too many bytes!");
    }

    public final void g(w40 w40Var, dv dvVar, zl0 zl0Var) throws Throwable {
        SSLSocket sSLSocket;
        String strF;
        bd2 bd2VarH = bd2.g;
        q8 q8Var = this.b.a;
        if (q8Var.c == null) {
            List list = q8Var.j;
            bd2 bd2Var = bd2.j;
            boolean zContains = list.contains(bd2Var);
            Socket socket = this.c;
            if (!zContains) {
                this.d = socket;
                this.f = bd2VarH;
                return;
            } else {
                this.d = socket;
                this.f = bd2Var;
                l();
                return;
            }
        }
        zl0Var.secureConnectStart(dvVar);
        q8 q8Var2 = this.b.a;
        SSLSocketFactory sSLSocketFactory = q8Var2.c;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            zz0 zz0Var = q8Var2.i;
            int i = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, zz0Var.d, zz0Var.e, true);
            socketCreateSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                v40 v40VarA = w40Var.a(sSLSocket2);
                if (v40VarA.b) {
                    l82 l82Var = l82.a;
                    l82.a.d(sSLSocket2, q8Var2.i.d, q8Var2.j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                gx0 gx0VarO = mc0.o(session);
                HostnameVerifier hostnameVerifier = q8Var2.d;
                hostnameVerifier.getClass();
                boolean zVerify = hostnameVerifier.verify(q8Var2.i.d, session);
                int i2 = 0;
                if (!zVerify) {
                    List listA = gx0VarO.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + q8Var2.i.d + " not verified (no certificates)");
                    }
                    Object obj = listA.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(q8Var2.i.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    jw jwVar = jw.c;
                    sb.append(am1.L(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(zy.x0(i12.a(x509Certificate, 7), i12.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(m13.P(sb.toString()));
                }
                jw jwVar2 = q8Var2.e;
                jwVar2.getClass();
                this.e = new gx0(gx0VarO.a, gx0VarO.b, gx0VarO.c, new zd2(jwVar2, gx0VarO, q8Var2, i2));
                q8Var2.i.d.getClass();
                Iterator it = jwVar2.a.iterator();
                if (it.hasNext()) {
                    p91.x(it.next());
                    throw null;
                }
                if (v40VarA.b) {
                    l82 l82Var2 = l82.a;
                    strF = l82.a.f(sSLSocket2);
                } else {
                    strF = null;
                }
                this.d = sSLSocket2;
                Logger logger = l12.a;
                my2 my2Var = new my2(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new td2(new ep(i2, my2Var, new ep(i, inputStream, my2Var)));
                my2 my2Var2 = new my2(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new sd2(new dp(my2Var2, new dp(outputStream, my2Var2)));
                if (strF != null) {
                    bd2VarH = wc0.H(strF);
                }
                this.f = bd2VarH;
                l82 l82Var3 = l82.a;
                l82.a.a(sSLSocket2);
                zl0Var.secureConnectEnd(dvVar, this.e);
                if (this.f == bd2.i) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    l82 l82Var4 = l82.a;
                    l82.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    bh3.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    public final boolean h(q8 q8Var, List list) {
        gx0 gx0Var;
        zz0 zz0Var = q8Var.i;
        String str = zz0Var.d;
        byte[] bArr = bh3.a;
        if (this.p.size() < this.o && !this.j) {
            dj2 dj2Var = this.b;
            q8 q8Var2 = dj2Var.a;
            q8 q8Var3 = dj2Var.a;
            if (q8Var2.a(q8Var)) {
                if (!o51.f(str, q8Var3.i.d)) {
                    if (this.g != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            dj2 dj2Var2 = (dj2) it.next();
                            Proxy.Type type = dj2Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && dj2Var.b.type() == type2 && o51.f(dj2Var.c, dj2Var2.c)) {
                                if (q8Var.d != i12.a) {
                                    break;
                                }
                                byte[] bArr2 = bh3.a;
                                zz0 zz0Var2 = q8Var3.i;
                                if (zz0Var.e != zz0Var2.e) {
                                    break;
                                }
                                if (!o51.f(str, zz0Var2.d)) {
                                    if (!this.k && (gx0Var = this.e) != null) {
                                        List listA = gx0Var.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!i12.c(str, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    jw jwVar = q8Var.e;
                                    jwVar.getClass();
                                    gx0 gx0Var2 = this.e;
                                    gx0Var2.getClass();
                                    List listA2 = gx0Var2.a();
                                    str.getClass();
                                    listA2.getClass();
                                    Iterator it2 = jwVar.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    p91.x(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = bh3.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        td2 td2Var = this.h;
        td2Var.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        lz0 lz0Var = this.g;
        if (lz0Var != null) {
            synchronized (lz0Var) {
                if (lz0Var.j) {
                    return false;
                }
                return lz0Var.r >= lz0Var.q || jNanoTime < lz0Var.s;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !td2Var.A();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final fm0 j(k12 k12Var, be2 be2Var) throws SocketException {
        int i = be2Var.g;
        Socket socket = this.d;
        socket.getClass();
        td2 td2Var = this.h;
        td2Var.getClass();
        sd2 sd2Var = this.i;
        sd2Var.getClass();
        lz0 lz0Var = this.g;
        if (lz0Var != null) {
            return new mz0(k12Var, this, be2Var, lz0Var);
        }
        socket.setSoTimeout(i);
        pa3 pa3VarD = td2Var.e.d();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pa3VarD.g(j, timeUnit);
        sd2Var.e.d().g(be2Var.h, timeUnit);
        return new bz0(k12Var, this, td2Var, sd2Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        int i;
        Socket socket = this.d;
        socket.getClass();
        td2 td2Var = this.h;
        td2Var.getClass();
        sd2 sd2Var = this.i;
        sd2Var.getClass();
        socket.setSoTimeout(0);
        k53 k53Var = k53.h;
        bl blVar = new bl(k53Var);
        String str = this.b.a.i.d;
        str.getClass();
        blVar.b = socket;
        blVar.c = bh3.h + ' ' + str;
        blVar.d = td2Var;
        blVar.e = sd2Var;
        blVar.f = this;
        lz0 lz0Var = new lz0(blVar);
        this.g = lz0Var;
        qt2 qt2Var = lz0.D;
        this.o = (qt2Var.a & 16) != 0 ? qt2Var.b[4] : Integer.MAX_VALUE;
        tz0 tz0Var = lz0Var.A;
        synchronized (tz0Var) {
            try {
                if (tz0Var.h) {
                    throw new IOException("closed");
                }
                Logger logger = tz0.j;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(bh3.g(">> CONNECTION " + cz0.a.b(), new Object[0]));
                }
                tz0Var.e.X(cz0.a);
                tz0Var.e.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        tz0 tz0Var2 = lz0Var.A;
        qt2 qt2Var2 = lz0Var.t;
        synchronized (tz0Var2) {
            try {
                qt2Var2.getClass();
                if (tz0Var2.h) {
                    throw new IOException("closed");
                }
                tz0Var2.O(0, Integer.bitCount(qt2Var2.a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & qt2Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        tz0Var2.e.writeShort(i);
                        tz0Var2.e.writeInt(qt2Var2.b[i2]);
                    }
                    i2++;
                }
                tz0Var2.e.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = lz0Var.t.a();
        if (iA != 65535) {
            lz0Var.A.e0(0, iA - 65535);
        }
        k53Var.d().c(new jz0(lz0Var.g, lz0Var.B, 2), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        dj2 dj2Var = this.b;
        sb.append(dj2Var.a.i.d);
        sb.append(':');
        sb.append(dj2Var.a.i.e);
        sb.append(", proxy=");
        sb.append(dj2Var.b);
        sb.append(" hostAddress=");
        sb.append(dj2Var.c);
        sb.append(" cipherSuite=");
        gx0 gx0Var = this.e;
        sb.append(gx0Var != null ? gx0Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
