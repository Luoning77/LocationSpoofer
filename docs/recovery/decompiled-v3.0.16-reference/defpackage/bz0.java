package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bz0 implements fm0 {
    public final k12 a;
    public final ae2 b;
    public final du c;
    public final cu d;
    public int e;
    public final px0 f;
    public ox0 g;

    public bz0(k12 k12Var, ae2 ae2Var, td2 td2Var, sd2 sd2Var) {
        td2Var.getClass();
        sd2Var.getClass();
        this.a = k12Var;
        this.b = ae2Var;
        this.c = td2Var;
        this.d = sd2Var;
        px0 px0Var = new px0();
        px0Var.b = td2Var;
        px0Var.a = 262144L;
        this.f = px0Var;
    }

    @Override // defpackage.fm0
    public final void a(yf2 yf2Var) {
        yf2Var.getClass();
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(yf2Var.b);
        sb.append(' ');
        zz0 zz0Var = yf2Var.a;
        if (zz0Var.i || type != Proxy.Type.HTTP) {
            String strB = zz0Var.b();
            String strD = zz0Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(zz0Var);
        }
        sb.append(" HTTP/1.1");
        j(yf2Var.c, sb.toString());
    }

    @Override // defpackage.fm0
    public final sy2 b(qg2 qg2Var) {
        if (!uz0.a(qg2Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(qg2.A(qg2Var, "Transfer-Encoding"))) {
            zz0 zz0Var = qg2Var.e.a;
            if (this.e == 4) {
                this.e = 5;
                return new xy0(this, zz0Var);
            }
            b81.f(this.e, "state: ");
            return null;
        }
        long jI = bh3.i(qg2Var);
        if (jI != -1) {
            return i(jI);
        }
        if (this.e != 4) {
            b81.f(this.e, "state: ");
            return null;
        }
        this.e = 5;
        this.b.k();
        return new az0(this);
    }

    @Override // defpackage.fm0
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.fm0
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            bh3.d(socket);
        }
    }

    @Override // defpackage.fm0
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.fm0
    public final bw2 e(yf2 yf2Var, long j) throws ProtocolException {
        yf2Var.getClass();
        cg2 cg2Var = yf2Var.d;
        if (cg2Var != null && cg2Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(yf2Var.c.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new wy0(this);
            }
            b81.f(this.e, "state: ");
            return null;
        }
        if (j == -1) {
            fo.n("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.e == 1) {
            this.e = 2;
            return new zy0(this);
        }
        b81.f(this.e, "state: ");
        return null;
    }

    @Override // defpackage.fm0
    public final long f(qg2 qg2Var) {
        if (!uz0.a(qg2Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(qg2.A(qg2Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return bh3.i(qg2Var);
    }

    @Override // defpackage.fm0
    public final pg2 g(boolean z) {
        px0 px0Var = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            b81.f(this.e, "state: ");
            return null;
        }
        try {
            String strG = ((du) px0Var.b).G(px0Var.a);
            px0Var.a -= (long) strG.length();
            q01 q01VarB = mc0.B(strG);
            int i2 = q01VarB.b;
            pg2 pg2Var = new pg2();
            pg2Var.b = (bd2) q01VarB.c;
            pg2Var.c = i2;
            pg2Var.d = (String) q01VarB.d;
            pg2Var.f = px0Var.c().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return pg2Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return pg2Var;
            }
            this.e = 3;
            return pg2Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.i.j()), e);
        }
    }

    @Override // defpackage.fm0
    public final ae2 h() {
        return this.b;
    }

    public final yy0 i(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new yy0(this, j);
        }
        b81.f(this.e, "state: ");
        return null;
    }

    public final void j(ox0 ox0Var, String str) {
        if (this.e != 0) {
            b81.f(this.e, "state: ");
            return;
        }
        cu cuVar = this.d;
        cuVar.T(str).T("\r\n");
        int size = ox0Var.size();
        for (int i = 0; i < size; i++) {
            cuVar.T(ox0Var.b(i)).T(": ").T(ox0Var.d(i)).T("\r\n");
        }
        cuVar.T("\r\n");
        this.e = 1;
    }
}
