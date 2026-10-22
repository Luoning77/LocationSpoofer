package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mz0 implements fm0 {
    public static final List g = bh3.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = bh3.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final ae2 a;
    public final be2 b;
    public final lz0 c;
    public volatile sz0 d;
    public final bd2 e;
    public volatile boolean f;

    public mz0(k12 k12Var, ae2 ae2Var, be2 be2Var, lz0 lz0Var) {
        lz0Var.getClass();
        this.a = ae2Var;
        this.b = be2Var;
        this.c = lz0Var;
        List list = k12Var.w;
        bd2 bd2Var = bd2.j;
        this.e = list.contains(bd2Var) ? bd2Var : bd2.i;
    }

    @Override // defpackage.fm0
    public final void a(yf2 yf2Var) throws IOException {
        int i;
        sz0 sz0Var;
        boolean z;
        yf2Var.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = yf2Var.d != null;
        ox0 ox0Var = yf2Var.c;
        ArrayList arrayList = new ArrayList(ox0Var.size() + 4);
        arrayList.add(new mx0(mx0.f, yf2Var.b));
        uu uuVar = mx0.g;
        zz0 zz0Var = yf2Var.a;
        zz0Var.getClass();
        String strB = zz0Var.b();
        String strD = zz0Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new mx0(uuVar, strB));
        String strA = ox0Var.a("Host");
        if (strA != null) {
            arrayList.add(new mx0(mx0.i, strA));
        }
        arrayList.add(new mx0(mx0.h, zz0Var.a));
        int size = ox0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = ox0Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strB2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && o51.f(ox0Var.d(i2), "trailers"))) {
                arrayList.add(new mx0(lowerCase, ox0Var.d(i2)));
            }
        }
        lz0 lz0Var = this.c;
        lz0Var.getClass();
        boolean z3 = !z2;
        synchronized (lz0Var.A) {
            synchronized (lz0Var) {
                try {
                    if (lz0Var.i > 1073741823) {
                        lz0Var.P(8);
                    }
                    if (lz0Var.j) {
                        throw new t40();
                    }
                    i = lz0Var.i;
                    lz0Var.i = i + 2;
                    sz0Var = new sz0(i, lz0Var, z3, false, null);
                    z = !z2 || lz0Var.x >= lz0Var.y || sz0Var.e >= sz0Var.f;
                    if (sz0Var.h()) {
                        lz0Var.f.put(Integer.valueOf(i), sz0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lz0Var.A.U(z3, i, arrayList);
        }
        if (z) {
            lz0Var.A.flush();
        }
        this.d = sz0Var;
        boolean z4 = this.f;
        sz0 sz0Var2 = this.d;
        if (z4) {
            sz0Var2.getClass();
            sz0Var2.e(9);
            fo.r("Canceled");
            return;
        }
        sz0Var2.getClass();
        rz0 rz0Var = sz0Var2.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rz0Var.g(j, timeUnit);
        sz0 sz0Var3 = this.d;
        sz0Var3.getClass();
        sz0Var3.l.g(this.b.h, timeUnit);
    }

    @Override // defpackage.fm0
    public final sy2 b(qg2 qg2Var) {
        sz0 sz0Var = this.d;
        sz0Var.getClass();
        return sz0Var.i;
    }

    @Override // defpackage.fm0
    public final void c() {
        sz0 sz0Var = this.d;
        sz0Var.getClass();
        sz0Var.f().close();
    }

    @Override // defpackage.fm0
    public final void cancel() {
        this.f = true;
        sz0 sz0Var = this.d;
        if (sz0Var != null) {
            sz0Var.e(9);
        }
    }

    @Override // defpackage.fm0
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.fm0
    public final bw2 e(yf2 yf2Var, long j) {
        yf2Var.getClass();
        sz0 sz0Var = this.d;
        sz0Var.getClass();
        return sz0Var.f();
    }

    @Override // defpackage.fm0
    public final long f(qg2 qg2Var) {
        if (uz0.a(qg2Var)) {
            return bh3.i(qg2Var);
        }
        return 0L;
    }

    @Override // defpackage.fm0
    public final pg2 g(boolean z) throws IOException {
        ox0 ox0Var;
        sz0 sz0Var = this.d;
        if (sz0Var == null) {
            fo.r("stream wasn't created");
            return null;
        }
        synchronized (sz0Var) {
            sz0Var.k.i();
            while (sz0Var.g.isEmpty() && sz0Var.m == 0) {
                try {
                    try {
                        sz0Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    sz0Var.k.l();
                    throw th;
                }
            }
            sz0Var.k.l();
            if (sz0Var.g.isEmpty()) {
                IOException iOException = sz0Var.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = sz0Var.m;
                if (i != 0) {
                    throw new d13(i);
                }
                throw null;
            }
            Object objRemoveFirst = sz0Var.g.removeFirst();
            objRemoveFirst.getClass();
            ox0Var = (ox0) objRemoveFirst;
        }
        bd2 bd2Var = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = ox0Var.size();
        q01 q01VarB = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strB = ox0Var.b(i2);
            String strD = ox0Var.d(i2);
            if (o51.f(strB, ":status")) {
                q01VarB = mc0.B("HTTP/1.1 " + strD);
            } else if (!h.contains(strB)) {
                strB.getClass();
                strD.getClass();
                arrayList.add(strB);
                arrayList.add(l13.D0(strD).toString());
            }
        }
        if (q01VarB == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        pg2 pg2Var = new pg2();
        pg2Var.b = bd2Var;
        pg2Var.c = q01VarB.b;
        pg2Var.d = (String) q01VarB.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        nx0 nx0Var = new nx0(0);
        fz.a0(nx0Var.a, strArr);
        pg2Var.f = nx0Var;
        if (z && pg2Var.c == 100) {
            return null;
        }
        return pg2Var;
    }

    @Override // defpackage.fm0
    public final ae2 h() {
        return this.a;
    }
}
