package defpackage;

import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zv2 extends t20 {
    public Object b;
    public Object c;
    public ay1 d;
    public ay1 e;
    public SendChannel f;
    public final ge2 g;
    public final g8 h;

    public zv2() {
        super(3);
        this.g = new ge2(this, 12);
        s5 s5Var = new s5(this, 29);
        tx2.b(tx2.a);
        synchronized (tx2.c) {
            tx2.h = zy.w0(tx2.h, s5Var);
        }
        this.h = new g8(s5Var);
    }

    @Override // defpackage.t20
    public final void d(SendChannel sendChannel) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.t20
    public final void e() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    ay1 ay1Var = this.d;
                    if (ay1Var == null) {
                        ay1 ay1Var2 = in2.a;
                        ay1Var = new ay1();
                        this.d = ay1Var;
                    }
                    this.d = this.e;
                    this.e = ay1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t20
    public final void h() {
        this.h.c();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.t20
    public final lu0 l(SendChannel sendChannel) {
        SendChannel sendChannel2 = this.f;
        if (sendChannel2 != null && !sendChannel2.equals(sendChannel)) {
            hb2.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = sendChannel;
        return this.g;
    }

    @Override // defpackage.t20
    public final void m(Channel channel) {
        this.f = null;
        this.c = null;
        this.e = null;
        e();
    }
}
