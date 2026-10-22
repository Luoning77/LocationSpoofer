package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ze extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze(int i, Object obj, Object obj2) {
        super(1);
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        ne2 ne2Var;
        gn gnVarX;
        int i = 0;
        switch (this.f) {
            case 0:
                return new e31((ne1) this.h, new ye((af) this.g, i));
            case 1:
                e31 e31Var = (e31) this.h;
                synchronized (e31Var.c) {
                    try {
                        e31Var.e = true;
                        gy1 gy1Var = e31Var.d;
                        Object[] objArr = gy1Var.e;
                        int i2 = gy1Var.g;
                        while (i < i2) {
                            l02 l02Var = (l02) ((dk3) objArr[i]).get();
                            if (l02Var != null && (ne2Var = l02Var.b) != null) {
                                ne2Var.closeConnection();
                                l02Var.b = null;
                            }
                            i++;
                        }
                        e31Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                l83 l83Var = ((af) this.g).f;
                l83Var.b.set(null);
                l83Var.a.f();
                return mf3.a;
            case 2:
                ya2 ya2Var = (ya2) this.h;
                ya2Var.setPositionProvider((cb2) this.g);
                ya2Var.r();
                return new df(0);
            case 3:
                qg qgVar = (qg) this.h;
                rg rgVar = (rg) this.g;
                synchronized (qgVar.g) {
                    qgVar.i.remove(rgVar);
                }
                return mf3.a;
            case 4:
                ((Choreographer) ((sg) this.h).f).removeFrameCallback((rg) this.g);
                return mf3.a;
            case Logger.WARN /* 5 */:
                ((hb1) this.h).d0(((dv1) obj).d((dv1) this.g));
                return mf3.a;
            case Logger.ERROR /* 6 */:
                h82 h82Var = (h82) this.h;
                float fG = ((g60) this.g).c.g();
                ((g82) obj).x(h82Var);
                h82Var.I0(h41.c(0L, h82Var.i), fG, null);
                return mf3.a;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                g82.E((g82) obj, (h82) this.h, 0, 0, ((tr) this.g).s, 4);
                return mf3.a;
            case 8:
                jg0 jg0Var = (jg0) obj;
                jg0 jg0Var2 = (jg0) this.h;
                xb0 xb0VarL = jg0Var.X().l();
                qa1 qa1VarQ = jg0Var.X().q();
                vv vvVarI = jg0Var.X().i();
                long jR = jg0Var.X().r();
                kw0 kw0Var = (kw0) jg0Var.X().b;
                lu0 lu0Var = (lu0) this.g;
                xb0 xb0VarL2 = jg0Var2.X().l();
                qa1 qa1VarQ2 = jg0Var2.X().q();
                vv vvVarI2 = jg0Var2.X().i();
                long jR2 = jg0Var2.X().r();
                kw0 kw0Var2 = (kw0) jg0Var2.X().b;
                gn gnVarX2 = jg0Var2.X();
                gnVarX2.D(xb0VarL);
                gnVarX2.E(qa1VarQ);
                gnVarX2.C(vvVarI);
                gnVarX2.F(jR);
                gnVarX2.b = kw0Var;
                vvVarI.l();
                try {
                    lu0Var.invoke(jg0Var2);
                    return mf3.a;
                } finally {
                    vvVarI.i();
                    gnVarX = jg0Var2.X();
                    gnVarX.D(xb0VarL2);
                    gnVarX.E(qa1VarQ2);
                    gnVarX.C(vvVarI2);
                    gnVarX.F(jR2);
                    gnVarX.b = kw0Var2;
                }
            case mc0.b /* 9 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                ea2 ea2Var = (ea2) this.g;
                if (motionEvent.getActionMasked() == 0) {
                    ((mn2) this.h).f = ((Boolean) ((yg) ea2Var.f()).invoke(motionEvent)).booleanValue() ? da2.f : da2.g;
                } else {
                    ((yg) ea2Var.f()).invoke(motionEvent);
                }
                return mf3.a;
            case mc0.c /* 10 */:
                g82.E((g82) obj, (h82) this.h, 0, 0, ((uv2) this.g).E, 4);
                return mf3.a;
            default:
                a30 a30Var = (a30) obj;
                p10 p10Var = (p10) this.g;
                qm3 qm3Var = (qm3) this.h;
                if (!qm3Var.g) {
                    df1 df1Var = a30Var.c;
                    View view = a30Var.a;
                    xe1 lifecycle = df1Var.getLifecycle();
                    qm3Var.i = p10Var;
                    if (qm3Var.h == null) {
                        if (o51.f(Looper.myLooper(), view.getHandler().getLooper())) {
                            qm3Var.h = lifecycle;
                            lifecycle.a(qm3Var);
                        } else {
                            view.post(new ub(11, qm3Var, lifecycle));
                        }
                    } else if (((ff1) lifecycle).d.compareTo(we1.g) >= 0) {
                        qm3Var.f.A(new p10(new y30(qm3Var, a30Var, p10Var), true, -1723985096));
                    }
                }
                return mf3.a;
        }
    }
}
