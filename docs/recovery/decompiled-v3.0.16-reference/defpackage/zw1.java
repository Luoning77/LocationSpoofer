package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zw1 extends t20 {
    public final zx1 b;
    public final ArrayList c;
    public final ay1 d;
    public final zx1 e;
    public final g8 f;

    public zw1() {
        super(3);
        this.b = ce0.k();
        this.c = new ArrayList();
        ay1 ay1Var = in2.a;
        this.d = new ay1();
        this.e = new zx1();
        s5 s5Var = new s5(this, 19);
        tx2.b(tx2.a);
        synchronized (tx2.c) {
            tx2.h = zy.w0(tx2.h, s5Var);
        }
        this.f = new g8(s5Var);
    }

    @Override // defpackage.t20
    public final void d(SendChannel sendChannel) {
        this.c.add(new xw1(sendChannel));
    }

    @Override // defpackage.t20
    public final void e() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    yw1 yw1Var = (yw1) arrayList.get(i);
                    if (yw1Var instanceof ww1) {
                        ce0.f(this.b, ((ww1) yw1Var).a, ((ww1) yw1Var).b);
                    } else {
                        if (!(yw1Var instanceof xw1)) {
                            throw new iv();
                        }
                        ce0.T(this.b, ((xw1) yw1Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.t20
    public final void h() {
        this.f.c();
        this.c.clear();
        this.e.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.t20
    public final lu0 l(SendChannel sendChannel) {
        zx1 zx1Var = this.e;
        lu0 jl1Var = (lu0) zx1Var.g(sendChannel);
        if (jl1Var == null) {
            jl1Var = new jl1(6, this, sendChannel);
            int iF = zx1Var.f(sendChannel);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = zx1Var.c;
            Object obj = objArr[iF];
            zx1Var.b[iF] = sendChannel;
            objArr[iF] = jl1Var;
        }
        return jl1Var;
    }

    @Override // defpackage.t20
    public final void m(Channel channel) {
        this.e.k(channel);
        d(channel);
        e();
    }
}
