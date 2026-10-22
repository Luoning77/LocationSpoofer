package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gm0 {
    public final fg0 a;
    public final q8 b;
    public final xd2 c;
    public final zl0 d;
    public x8 e;
    public yz0 f;
    public int g;
    public int h;
    public int i;
    public dj2 j;

    public gm0(fg0 fg0Var, q8 q8Var, xd2 xd2Var, zl0 zl0Var) {
        zl0Var.getClass();
        this.a = fg0Var;
        this.b = q8Var;
        this.c = xd2Var;
        this.d = zl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0253  */
    /* JADX WARN: Code duplicated, block: B:118:0x026c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288  */
    /* JADX WARN: Code duplicated, block: B:123:0x028e  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0152  */
    public final ae2 a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        dj2 dj2Var;
        x8 x8Var;
        yz0 yz0Var;
        ArrayList arrayList;
        x8 x8Var2;
        q8 q8Var;
        Proxy proxy;
        String hostAddress;
        int port;
        List listF;
        boolean zContains;
        ae2 ae2Var;
        us1 us1Var;
        Socket socketG;
        while (!this.c.s) {
            ae2 ae2Var2 = this.c.m;
            if (ae2Var2 != null) {
                synchronized (ae2Var2) {
                    try {
                        if (!ae2Var2.j) {
                            zz0 zz0Var = ae2Var2.b.a.i;
                            zz0 zz0Var2 = this.b.i;
                            socketG = !(zz0Var.e == zz0Var2.e && o51.f(zz0Var.d, zz0Var2.d)) ? this.c.g() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.m == null) {
                    if (socketG != null) {
                        bh3.d(socketG);
                    }
                    this.d.connectionReleased(this.c, ae2Var2);
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        ae2Var2 = this.c.m;
                        ae2Var2.getClass();
                        this.d.connectionAcquired(this.c, ae2Var2);
                    } else {
                        dj2Var = this.j;
                        try {
                            if (dj2Var != null) {
                                this.j = null;
                            } else {
                                x8Var = this.e;
                                if (x8Var == null && x8Var.g()) {
                                    x8 x8Var3 = this.e;
                                    x8Var3.getClass();
                                    if (!x8Var3.g()) {
                                        b81.p();
                                        return null;
                                    }
                                    ArrayList arrayList2 = (ArrayList) x8Var3.c;
                                    int i4 = x8Var3.b;
                                    x8Var3.b = i4 + 1;
                                    dj2Var = (dj2) arrayList2.get(i4);
                                } else {
                                    yz0Var = this.f;
                                    if (yz0Var == null) {
                                        q8 q8Var2 = this.b;
                                        xd2 xd2Var = this.c;
                                        yz0Var = new yz0(q8Var2, xd2Var.e.F, xd2Var, this.d);
                                        this.f = yz0Var;
                                    }
                                    if (yz0Var.e()) {
                                        b81.p();
                                        return null;
                                    }
                                    arrayList = new ArrayList();
                                    while (yz0Var.b < ((List) yz0Var.h).size()) {
                                        q8Var = (q8) yz0Var.d;
                                        if (yz0Var.b < ((List) yz0Var.h).size()) {
                                            throw new SocketException("No route to " + q8Var.i.d + "; exhausted proxy configurations: " + ((List) yz0Var.h));
                                        }
                                        List list = (List) yz0Var.h;
                                        int i5 = yz0Var.b;
                                        yz0Var.b = i5 + 1;
                                        proxy = (Proxy) list.get(i5);
                                        dv dvVar = (dv) yz0Var.f;
                                        zl0 zl0Var = (zl0) yz0Var.g;
                                        ArrayList arrayList3 = new ArrayList();
                                        yz0Var.i = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            zz0 zz0Var3 = q8Var.i;
                                            hostAddress = zz0Var3.d;
                                            port = zz0Var3.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                b81.z(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                                return null;
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                hostAddress.getClass();
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                hostAddress.getClass();
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = bh3.a;
                                            hostAddress.getClass();
                                            if (bh3.g.b(hostAddress)) {
                                                listF = am1.F(InetAddress.getByName(hostAddress));
                                            } else {
                                                zl0Var.dnsStart(dvVar, hostAddress);
                                                List listLookup = q8Var.a.lookup(hostAddress);
                                                if (listLookup.isEmpty()) {
                                                    throw new UnknownHostException(q8Var.a + " returned no addresses for " + hostAddress);
                                                }
                                                zl0Var.dnsEnd(dvVar, hostAddress, listLookup);
                                                listF = listLookup;
                                            }
                                            Iterator it = listF.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = yz0Var.i.iterator();
                                        while (it2.hasNext()) {
                                            dj2 dj2Var2 = new dj2((q8) yz0Var.d, proxy, (InetSocketAddress) it2.next());
                                            us1 us1Var2 = (us1) yz0Var.e;
                                            synchronized (us1Var2) {
                                                zContains = ((LinkedHashSet) us1Var2.f).contains(dj2Var2);
                                            }
                                            if (zContains) {
                                                yz0Var.c.add(dj2Var2);
                                            } else {
                                                arrayList.add(dj2Var2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        fz.b0(arrayList, yz0Var.c);
                                        yz0Var.c.clear();
                                    }
                                    x8Var2 = new x8(8, arrayList);
                                    this.e = x8Var2;
                                    if (!this.c.s) {
                                        fo.r("Canceled");
                                        return null;
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, false)) {
                                        ae2Var2 = this.c.m;
                                        ae2Var2.getClass();
                                        this.d.connectionAcquired(this.c, ae2Var2);
                                    } else {
                                        if (x8Var2.g()) {
                                            b81.p();
                                            return null;
                                        }
                                        int i6 = x8Var2.b;
                                        x8Var2.b = i6 + 1;
                                        dj2Var = (dj2) arrayList.get(i6);
                                        ae2Var = new ae2(this.a, dj2Var);
                                        this.c.u = ae2Var;
                                        ae2Var.c(i, i2, i3, z, this.c, this.d);
                                        this.c.u = null;
                                        us1Var = this.c.e.F;
                                        synchronized (us1Var) {
                                            ((LinkedHashSet) us1Var.f).remove(dj2Var);
                                        }
                                        if (this.a.a(this.b, this.c, arrayList, true)) {
                                            ae2 ae2Var3 = this.c.m;
                                            ae2Var3.getClass();
                                            this.j = dj2Var;
                                            Socket socket = ae2Var.d;
                                            socket.getClass();
                                            bh3.d(socket);
                                            this.d.connectionAcquired(this.c, ae2Var3);
                                            ae2Var2 = ae2Var3;
                                        } else {
                                            synchronized (ae2Var) {
                                                fg0 fg0Var = this.a;
                                                byte[] bArr2 = bh3.a;
                                                ((ConcurrentLinkedQueue) fg0Var.e).add(ae2Var);
                                                ((j53) fg0Var.c).c((jz0) fg0Var.d, 0L);
                                                this.c.a(ae2Var);
                                            }
                                            this.d.connectionAcquired(this.c, ae2Var);
                                            ae2Var2 = ae2Var;
                                        }
                                    }
                                }
                            }
                            ae2Var.c(i, i2, i3, z, this.c, this.d);
                            this.c.u = null;
                            us1Var = this.c.e.F;
                            synchronized (us1Var) {
                                ((LinkedHashSet) us1Var.f).remove(dj2Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    ae2 ae2Var4 = this.c.m;
                                    ae2Var4.getClass();
                                    this.j = dj2Var;
                                    Socket socket2 = ae2Var.d;
                                    socket2.getClass();
                                    bh3.d(socket2);
                                    this.d.connectionAcquired(this.c, ae2Var4);
                                    ae2Var2 = ae2Var4;
                                } else {
                                    synchronized (ae2Var) {
                                        fg0 fg0Var2 = this.a;
                                        byte[] bArr3 = bh3.a;
                                        ((ConcurrentLinkedQueue) fg0Var2.e).add(ae2Var);
                                        ((j53) fg0Var2.c).c((jz0) fg0Var2.d, 0L);
                                        this.c.a(ae2Var);
                                        this.d.connectionAcquired(this.c, ae2Var);
                                        ae2Var2 = ae2Var;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.u = null;
                            throw th2;
                        }
                        arrayList = null;
                        ae2Var = new ae2(this.a, dj2Var);
                        this.c.u = ae2Var;
                    }
                } else if (socketG != null) {
                    fo.n("Check failed.");
                    return null;
                }
            } else {
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    ae2Var2 = this.c.m;
                    ae2Var2.getClass();
                    this.d.connectionAcquired(this.c, ae2Var2);
                } else {
                    dj2Var = this.j;
                    if (dj2Var != null) {
                        this.j = null;
                    } else {
                        x8Var = this.e;
                        if (x8Var == null) {
                        }
                        yz0Var = this.f;
                        if (yz0Var == null) {
                            q8 q8Var3 = this.b;
                            xd2 xd2Var2 = this.c;
                            yz0Var = new yz0(q8Var3, xd2Var2.e.F, xd2Var2, this.d);
                            this.f = yz0Var;
                        }
                        if (yz0Var.e()) {
                            b81.p();
                            return null;
                        }
                        arrayList = new ArrayList();
                        while (yz0Var.b < ((List) yz0Var.h).size()) {
                            q8Var = (q8) yz0Var.d;
                            if (yz0Var.b < ((List) yz0Var.h).size()) {
                                throw new SocketException("No route to " + q8Var.i.d + "; exhausted proxy configurations: " + ((List) yz0Var.h));
                            }
                            List list2 = (List) yz0Var.h;
                            int i7 = yz0Var.b;
                            yz0Var.b = i7 + 1;
                            proxy = (Proxy) list2.get(i7);
                            dv dvVar2 = (dv) yz0Var.f;
                            zl0 zl0Var2 = (zl0) yz0Var.g;
                            ArrayList arrayList4 = new ArrayList();
                            yz0Var.i = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                zz0 zz0Var4 = q8Var.i;
                                hostAddress = zz0Var4.d;
                                port = zz0Var4.e;
                            } else {
                                zz0 zz0Var5 = q8Var.i;
                                hostAddress = zz0Var5.d;
                                port = zz0Var5.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            fz.b0(arrayList, yz0Var.c);
                            yz0Var.c.clear();
                        }
                        x8Var2 = new x8(8, arrayList);
                        this.e = x8Var2;
                        if (!this.c.s) {
                            fo.r("Canceled");
                            return null;
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            ae2Var2 = this.c.m;
                            ae2Var2.getClass();
                            this.d.connectionAcquired(this.c, ae2Var2);
                        } else {
                            if (x8Var2.g()) {
                                b81.p();
                                return null;
                            }
                            int i8 = x8Var2.b;
                            x8Var2.b = i8 + 1;
                            dj2Var = (dj2) arrayList.get(i8);
                            ae2Var = new ae2(this.a, dj2Var);
                            this.c.u = ae2Var;
                            ae2Var.c(i, i2, i3, z, this.c, this.d);
                            this.c.u = null;
                            us1Var = this.c.e.F;
                            synchronized (us1Var) {
                                ((LinkedHashSet) us1Var.f).remove(dj2Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    ae2 ae2Var5 = this.c.m;
                                    ae2Var5.getClass();
                                    this.j = dj2Var;
                                    Socket socket3 = ae2Var.d;
                                    socket3.getClass();
                                    bh3.d(socket3);
                                    this.d.connectionAcquired(this.c, ae2Var5);
                                    ae2Var2 = ae2Var5;
                                } else {
                                    synchronized (ae2Var) {
                                        fg0 fg0Var3 = this.a;
                                        byte[] bArr4 = bh3.a;
                                        ((ConcurrentLinkedQueue) fg0Var3.e).add(ae2Var);
                                        ((j53) fg0Var3.c).c((jz0) fg0Var3.d, 0L);
                                        this.c.a(ae2Var);
                                        this.d.connectionAcquired(this.c, ae2Var);
                                        ae2Var2 = ae2Var;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    ae2Var = new ae2(this.a, dj2Var);
                    this.c.u = ae2Var;
                    ae2Var.c(i, i2, i3, z, this.c, this.d);
                    this.c.u = null;
                    us1Var = this.c.e.F;
                    synchronized (us1Var) {
                        ((LinkedHashSet) us1Var.f).remove(dj2Var);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            ae2 ae2Var6 = this.c.m;
                            ae2Var6.getClass();
                            this.j = dj2Var;
                            Socket socket4 = ae2Var.d;
                            socket4.getClass();
                            bh3.d(socket4);
                            this.d.connectionAcquired(this.c, ae2Var6);
                            ae2Var2 = ae2Var6;
                        } else {
                            synchronized (ae2Var) {
                                fg0 fg0Var4 = this.a;
                                byte[] bArr5 = bh3.a;
                                ((ConcurrentLinkedQueue) fg0Var4.e).add(ae2Var);
                                ((j53) fg0Var4.c).c((jz0) fg0Var4.d, 0L);
                                this.c.a(ae2Var);
                                this.d.connectionAcquired(this.c, ae2Var);
                                ae2Var2 = ae2Var;
                            }
                        }
                    }
                }
            }
            if (ae2Var2.i(z2)) {
                return ae2Var2;
            }
            ae2Var2.k();
            if (this.j == null) {
                x8 x8Var4 = this.e;
                if (x8Var4 != null ? x8Var4.g() : true) {
                    continue;
                } else {
                    yz0 yz0Var2 = this.f;
                    if (!(yz0Var2 != null ? yz0Var2.e() : true)) {
                        fo.r("exhausted all routes");
                        return null;
                    }
                }
            }
        }
        fo.r("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.j = null;
        if ((iOException instanceof d13) && ((d13) iOException).e == 8) {
            this.g++;
        } else if (iOException instanceof t40) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
