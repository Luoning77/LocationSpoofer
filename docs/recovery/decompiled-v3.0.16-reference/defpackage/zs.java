package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zs implements b51 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public zs(j9 j9Var) {
        j9Var.getClass();
        this.b = j9Var;
    }

    public static int c(qg2 qg2Var, int i) {
        String strA = qg2.A(qg2Var, "Retry-After");
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    public yf2 a(qg2 qg2Var, em0 em0Var) throws ProtocolException {
        k12 k12Var;
        String strA;
        yf2 yf2Var;
        yz0 yz0Var;
        zz0 zz0VarA;
        xp xpVarA;
        boolean z;
        cg2 cg2Var;
        qg2 qg2Var2;
        ae2 ae2Var;
        dj2 dj2Var = (em0Var == null || (ae2Var = em0Var.g) == null) ? null : ae2Var.b;
        int i = qg2Var.h;
        yf2 yf2Var2 = qg2Var.e;
        String str = yf2Var2.b;
        if (i == 307 || i == 308) {
            k12Var = (k12) this.b;
            if (k12Var.l) {
                strA = qg2.A(qg2Var, "Location");
                yf2Var = qg2Var.e;
                if (strA != null) {
                    zz0 zz0Var = yf2Var.a;
                    zz0Var.getClass();
                    try {
                        yz0Var = new yz0();
                        yz0Var.f(zz0Var, strA);
                    } catch (IllegalArgumentException unused) {
                        yz0Var = null;
                    }
                    if (yz0Var != null) {
                        zz0VarA = yz0Var.a();
                    } else {
                        zz0VarA = null;
                    }
                    if (zz0VarA != null && (o51.f(zz0VarA.a, yf2Var.a.a) || k12Var.m)) {
                        xpVarA = yf2Var.a();
                        if (gh0.K(str)) {
                            int i2 = qg2Var.h;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                xpVarA.n(str, z ? yf2Var.d : null);
                            } else {
                                xpVarA.n("GET", null);
                            }
                            if (!z) {
                                ((nx0) xpVarA.c).p("Transfer-Encoding");
                                ((nx0) xpVarA.c).p("Content-Length");
                                ((nx0) xpVarA.c).p("Content-Type");
                            }
                        }
                        if (!bh3.a(yf2Var.a, zz0VarA)) {
                            ((nx0) xpVarA.c).p("Authorization");
                        }
                        xpVarA.a = zz0VarA;
                        return xpVarA.f();
                    }
                }
            }
        } else {
            if (i == 401) {
                ((k12) this.b).k.getClass();
                return null;
            }
            if (i == 421) {
                cg2 cg2Var2 = yf2Var2.d;
                if ((cg2Var2 == null || !cg2Var2.isOneShot()) && em0Var != null && !o51.f(em0Var.c.b.i.d, em0Var.g.b.a.i.d)) {
                    ae2 ae2Var2 = em0Var.g;
                    synchronized (ae2Var2) {
                        ae2Var2.k = true;
                    }
                    return qg2Var.e;
                }
            } else if (i == 503) {
                qg2 qg2Var3 = qg2Var.n;
                if ((qg2Var3 == null || qg2Var3.h != 503) && c(qg2Var, Integer.MAX_VALUE) == 0) {
                    return qg2Var.e;
                }
            } else {
                if (i == 407) {
                    dj2Var.getClass();
                    if (dj2Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((k12) this.b).r.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            k12Var = (k12) this.b;
                            if (k12Var.l) {
                                strA = qg2.A(qg2Var, "Location");
                                yf2Var = qg2Var.e;
                                if (strA != null) {
                                    zz0 zz0Var2 = yf2Var.a;
                                    zz0Var2.getClass();
                                    yz0Var = new yz0();
                                    yz0Var.f(zz0Var2, strA);
                                    if (yz0Var != null) {
                                        zz0VarA = yz0Var.a();
                                    } else {
                                        zz0VarA = null;
                                    }
                                    if (zz0VarA != null) {
                                        xpVarA = yf2Var.a();
                                        if (gh0.K(str)) {
                                            int i3 = qg2Var.h;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                xpVarA.n(str, z ? yf2Var.d : null);
                                            } else {
                                                xpVarA.n(str, z ? yf2Var.d : null);
                                            }
                                            if (!z) {
                                                ((nx0) xpVarA.c).p("Transfer-Encoding");
                                                ((nx0) xpVarA.c).p("Content-Length");
                                                ((nx0) xpVarA.c).p("Content-Type");
                                            }
                                        }
                                        if (!bh3.a(yf2Var.a, zz0VarA)) {
                                            ((nx0) xpVarA.c).p("Authorization");
                                        }
                                        xpVarA.a = zz0VarA;
                                        return xpVarA.f();
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((k12) this.b).j && (((cg2Var = yf2Var2.d) == null || !cg2Var.isOneShot()) && (((qg2Var2 = qg2Var.n) == null || qg2Var2.h != 408) && c(qg2Var, 0) <= 0))) {
                    return qg2Var.e;
                }
            }
        }
        return null;
    }

    public boolean b(IOException iOException, xd2 xd2Var, yf2 yf2Var, boolean z) {
        boolean zE;
        yz0 yz0Var;
        ae2 ae2Var;
        cg2 cg2Var;
        if (((k12) this.b).j && ((!z || (((cg2Var = yf2Var.d) == null || !cg2Var.isOneShot()) && !(iOException instanceof FileNotFoundException))) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            gm0 gm0Var = xd2Var.l;
            gm0Var.getClass();
            int i = gm0Var.g;
            if (i == 0 && gm0Var.h == 0 && gm0Var.i == 0) {
                zE = false;
            } else if (gm0Var.j != null) {
                zE = true;
            } else {
                dj2 dj2Var = null;
                if (i <= 1 && gm0Var.h <= 1 && gm0Var.i <= 0 && (ae2Var = gm0Var.c.m) != null) {
                    synchronized (ae2Var) {
                        if (ae2Var.l == 0 && bh3.a(ae2Var.b.a.i, gm0Var.b.i)) {
                            dj2Var = ae2Var.b;
                        }
                    }
                }
                if (dj2Var != null) {
                    gm0Var.j = dj2Var;
                } else {
                    x8 x8Var = gm0Var.e;
                    if ((x8Var == null || !x8Var.g()) && (yz0Var = gm0Var.f) != null) {
                        zE = yz0Var.e();
                    }
                }
                zE = true;
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b51
    public final qg2 intercept(a51 a51Var) {
        tg2 tg2Var;
        qg2 qg2VarB;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        jw jwVar;
        switch (this.a) {
            case 0:
                String str = "Content-Encoding";
                j9 j9Var = (j9) this.b;
                be2 be2Var = (be2) a51Var;
                yf2 yf2Var = be2Var.e;
                xp xpVarA = yf2Var.a();
                zz0 zz0Var = yf2Var.a;
                ox0 ox0Var = yf2Var.c;
                cg2 cg2Var = yf2Var.d;
                long j = -1;
                if (cg2Var != null) {
                    kr1 kr1VarContentType = cg2Var.contentType();
                    if (kr1VarContentType != null) {
                        String str2 = kr1VarContentType.a;
                        str2.getClass();
                        ((nx0) xpVarA.c).q("Content-Type", str2);
                    }
                    long jContentLength = cg2Var.contentLength();
                    if (jContentLength != -1) {
                        String strValueOf = String.valueOf(jContentLength);
                        strValueOf.getClass();
                        ((nx0) xpVarA.c).q("Content-Length", strValueOf);
                        ((nx0) xpVarA.c).p("Transfer-Encoding");
                    } else {
                        ((nx0) xpVarA.c).q("Transfer-Encoding", "chunked");
                        ((nx0) xpVarA.c).p("Content-Length");
                    }
                } else {
                    str = "Content-Encoding";
                }
                boolean z2 = false;
                if (ox0Var.a("Host") == null) {
                    ((nx0) xpVarA.c).q("Host", bh3.u(zz0Var, false));
                }
                if (ox0Var.a("Connection") == null) {
                    ((nx0) xpVarA.c).q("Connection", "Keep-Alive");
                }
                if (ox0Var.a("Accept-Encoding") == null && ox0Var.a("Range") == null) {
                    ((nx0) xpVarA.c).q("Accept-Encoding", "gzip");
                    z2 = true;
                }
                zz0Var.getClass();
                if (ox0Var.a("User-Agent") == null) {
                    ((nx0) xpVarA.c).q("User-Agent", "okhttp/4.12.0");
                }
                qg2 qg2VarB2 = be2Var.b(xpVarA.f());
                ox0 ox0Var2 = qg2VarB2.j;
                uz0.b(j9Var, zz0Var, ox0Var2);
                pg2 pg2VarO = qg2VarB2.O();
                pg2VarO.a = yf2Var;
                if (z2) {
                    String str3 = str;
                    if ("gzip".equalsIgnoreCase(qg2.A(qg2VarB2, str3)) && uz0.a(qg2VarB2) && (tg2Var = qg2VarB2.k) != null) {
                        ax0 ax0Var = new ax0(tg2Var.source());
                        nx0 nx0VarC = ox0Var2.c();
                        nx0VarC.p(str3);
                        nx0VarC.p("Content-Length");
                        pg2VarO.f = nx0VarC.c().c();
                        pg2VarO.g = new ce2(qg2.A(qg2VarB2, "Content-Type"), j, new td2(ax0Var), 0);
                    }
                }
                return pg2VarO.a();
            default:
                be2 be2Var2 = (be2) a51Var;
                yf2 yf2Var2 = be2Var2.e;
                xd2 xd2Var = be2Var2.a;
                List listW0 = uj0.e;
                qg2 qg2Var = null;
                int i = 0;
                yf2 yf2VarA = yf2Var2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        yf2VarA.getClass();
                        if (xd2Var.o != null) {
                            fo.n("Check failed.");
                            return null;
                        }
                        synchronized (xd2Var) {
                            try {
                                if (xd2Var.q) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (xd2Var.p) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            fg0 fg0Var = xd2Var.g;
                            zz0 zz0Var2 = yf2VarA.a;
                            k12 k12Var = xd2Var.e;
                            if (zz0Var2.i) {
                                SSLSocketFactory sSLSocketFactory2 = k12Var.t;
                                if (sSLSocketFactory2 == null) {
                                    fo.n("CLEARTEXT-only client");
                                    return null;
                                }
                                HostnameVerifier hostnameVerifier2 = k12Var.x;
                                jwVar = k12Var.y;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                jwVar = null;
                            }
                            xd2Var.l = new gm0(fg0Var, new q8(zz0Var2.d, zz0Var2.e, k12Var.o, k12Var.s, sSLSocketFactory, hostnameVerifier, jwVar, k12Var.r, k12Var.p, k12Var.w, k12Var.v, k12Var.q), xd2Var, xd2Var.h);
                        }
                        try {
                            if (xd2Var.s) {
                                throw new IOException("Canceled");
                            }
                            try {
                                qg2VarB = be2Var2.b(yf2VarA);
                            } catch (IOException e) {
                                if (!b(e, xd2Var, yf2VarA, !(e instanceof t40))) {
                                    Iterator it = listW0.iterator();
                                    while (it.hasNext()) {
                                        vd0.d(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                listW0 = zy.w0(listW0, e);
                                xd2Var.c(true);
                                z3 = false;
                            } catch (oj2 e2) {
                                boolean zB = b(e2.f, xd2Var, yf2VarA, false);
                                IOException iOException = e2.e;
                                if (!zB) {
                                    Iterator it2 = listW0.iterator();
                                    while (it2.hasNext()) {
                                        vd0.d(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                listW0 = zy.w0(listW0, iOException);
                                xd2Var.c(true);
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            xd2Var.c(true);
                            throw th2;
                        }
                        break;
                        z3 = false;
                    }
                    if (qg2Var != null) {
                        pg2 pg2VarO2 = qg2VarB.O();
                        pg2 pg2VarO3 = qg2Var.O();
                        pg2VarO3.g = null;
                        qg2 qg2VarA = pg2VarO3.a();
                        if (qg2VarA.k != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        pg2VarO2.j = qg2VarA;
                        qg2VarB = pg2VarO2.a();
                    }
                    qg2Var = qg2VarB;
                    em0 em0Var = xd2Var.o;
                    yf2VarA = a(qg2Var, em0Var);
                    if (yf2VarA == null) {
                        if (em0Var != null && em0Var.e) {
                            if (xd2Var.n) {
                                throw new IllegalStateException("Check failed.");
                            }
                            xd2Var.n = true;
                            xd2Var.i.j();
                        }
                        z = false;
                    } else {
                        z = false;
                        cg2 cg2Var2 = yf2VarA.d;
                        if (cg2Var2 == null || !cg2Var2.isOneShot()) {
                            tg2 tg2Var2 = qg2Var.k;
                            if (tg2Var2 != null) {
                                bh3.c(tg2Var2);
                            }
                            i++;
                            if (i > 20) {
                                throw new ProtocolException("Too many follow-up requests: " + i);
                            }
                            xd2Var.c(true);
                        }
                    }
                    xd2Var.c(z);
                    return qg2Var;
                }
        }
    }

    public zs(k12 k12Var) {
        this.b = k12Var;
    }
}
