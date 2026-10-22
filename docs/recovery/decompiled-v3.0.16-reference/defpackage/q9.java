package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q9 extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(jb1 jb1Var, pe2 pe2Var, nu2 nu2Var) {
        super(1);
        this.f = 25;
        this.g = jb1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.f;
        int i2 = 0;
        q60 q60Var = null;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                r9 r9Var = (r9) obj;
                ib1 ib1Var = (ib1) obj2;
                if (r9Var.p0() != Integer.MAX_VALUE) {
                    if (r9Var.c().b) {
                        r9Var.I();
                    }
                    for (Map.Entry entry : r9Var.c().i.entrySet()) {
                        ib1Var.a((m9) entry.getKey(), ((Number) entry.getValue()).intValue(), r9Var.F());
                    }
                    xz1 xz1Var = r9Var.F().w;
                    xz1Var.getClass();
                    while (!xz1Var.equals(ib1Var.a.F())) {
                        for (m9 m9Var : ib1Var.b(xz1Var).keySet()) {
                            ib1Var.a(m9Var, ib1Var.c(xz1Var, m9Var), xz1Var);
                        }
                        xz1Var = xz1Var.w;
                        xz1Var.getClass();
                    }
                }
                return mf3Var;
            case 1:
                return Boolean.valueOf(((dq0) obj).t1(((ep0) obj2).a));
            case 2:
                ak1 ak1Var = (ak1) obj;
                db dbVar = ((pa) obj2).t;
                if (dbVar.getInsetsListener().k.g() > 0) {
                    gx1 gx1Var = yl3.a;
                    ak1Var.e = true;
                    ck1 ck1Var = ak1Var.h;
                    pa1 pa1VarV0 = ck1Var.V0();
                    if (h41.a(ak1Var.f, 9223372034707292159L)) {
                        ak1Var.f = gh0.O(pa1VarV0.h(0L));
                        ak1Var.g = pa1VarV0.f0();
                    }
                    ck1Var.a1().L.b();
                    long jF0 = pa1VarV0.f0();
                    zx1 zx1Var = dbVar.getInsetsListener().j;
                    int i3 = (int) (jF0 >> 32);
                    int i4 = (int) (jF0 & 4294967295L);
                    for (wl3 wl3Var : yl3.b) {
                        Object objG = zx1Var.g(wl3Var);
                        objG.getClass();
                        lm3 lm3Var = (lm3) objG;
                        yl3.a(ak1Var, ((xl3) wl3Var).c, lm3Var.h, i3, i4);
                        if (((Boolean) lm3Var.b.getValue()).booleanValue()) {
                            yl3.a(ak1Var, lm3Var.f, lm3Var.j, i3, i4);
                            yl3.a(ak1Var, lm3Var.g, lm3Var.k, i3, i4);
                        }
                        yl3.a(ak1Var, ((xl3) wl3Var).d, lm3Var.i, i3, i4);
                    }
                    sx1 sx1Var = dbVar.getInsetsListener().l;
                    if (sx1Var.i()) {
                        fy2 fy2Var = dbVar.getInsetsListener().m;
                        Object[] objArr = sx1Var.a;
                        int i5 = sx1Var.b;
                        while (i2 < i5) {
                            ey1 ey1Var = (ey1) objArr[i2];
                            w21 w21Var = (w21) fy2Var.get(i2);
                            Rect rect = (Rect) ey1Var.getValue();
                            ak1Var.c(w21Var.b(), rect.left);
                            ak1Var.c(w21Var.d(), rect.top);
                            ak1Var.c(w21Var.c(), rect.right);
                            ak1Var.c(w21Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return mf3Var;
            case 3:
                return Boolean.valueOf(((f41) obj2).a(((js2) obj).f));
            case 4:
                return Boolean.valueOf(ym3.F((js2) obj, (Resources) obj2));
            case Logger.WARN /* 5 */:
                ((hb1) obj2).Z((xb0) obj);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return Boolean.valueOf(o51.f(obj, obj2));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((ps) obj2).f;
            case 8:
                pe2 pe2Var = (pe2) obj;
                ct ctVar = (ct) obj2;
                if (ctVar.r) {
                    BuildersKt__Builders_commonKt.launch$default(ctVar.a1(), null, null, new k(ctVar, pe2Var, q60Var, 9), 3, null);
                }
                return mf3Var;
            case mc0.b /* 9 */:
                jb1 jb1Var = (jb1) obj;
                ((jl1) obj2).invoke(jb1Var);
                jb1Var.c();
                return mf3Var;
            case mc0.c /* 10 */:
                xi xiVar = (xi) obj;
                float f = xiVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = xiVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = xiVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = xiVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new hz(hz.b(xp1.b(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, qz.x), (oz) obj2));
            case 11:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                return new h8((fd0) obj2, 6);
            case 13:
                be0 be0Var = (be0) obj;
                if (!be0Var.e.r) {
                    return sc3.f;
                }
                be0 be0Var2 = be0Var.t;
                sc3 sc3Var = sc3.e;
                if (be0Var2 != null) {
                    q9 q9Var = new q9((t1) obj2, 13);
                    if (q9Var.invoke(be0Var2) == sc3Var) {
                        q73.l(be0Var2, q9Var);
                    }
                }
                be0Var.t = null;
                be0Var.s = null;
                return sc3Var;
            case 14:
                if (dw0.b.compareAndSet(false, true)) {
                    ((Channel) obj2).mo32trySendJP2dKIU(mf3Var);
                }
                return mf3Var;
            case a83.e /* 15 */:
                jg0 jg0Var = (jg0) obj;
                kw0 kw0Var = (kw0) obj2;
                re reVar = kw0Var.l;
                if (kw0Var.n && kw0Var.w && reVar != null) {
                    gn gnVarX = jg0Var.X();
                    long jR = gnVarX.r();
                    gnVarX.i().l();
                    try {
                        ((gn) ((t1) gnVarX.a).f).i().s(reVar);
                        kw0Var.c(jg0Var);
                    } finally {
                        p91.v(gnVarX, jR);
                    }
                } else {
                    kw0Var.c(jg0Var);
                }
                return mf3Var;
            case 16:
                jg0 jg0Var2 = (jg0) obj;
                vv vvVarI = jg0Var2.X().i();
                pu0 pu0Var = ((nw0) obj2).h;
                if (pu0Var != null) {
                    pu0Var.invoke(vvVarI, (kw0) jg0Var2.X().b);
                }
                return mf3Var;
            case 17:
                eh3 eh3Var = (eh3) obj;
                vw0 vw0Var = (vw0) obj2;
                vw0Var.g(eh3Var);
                lu0 lu0Var = vw0Var.i;
                if (lu0Var != null) {
                    lu0Var.invoke(eh3Var);
                }
                return mf3Var;
            case 18:
                l02 l02Var = (l02) obj;
                ne2 ne2Var = l02Var.b;
                if (ne2Var != null) {
                    ne2Var.closeConnection();
                    l02Var.b = null;
                }
                e31 e31Var = (e31) obj2;
                gy1 gy1Var = e31Var.d;
                Object[] objArr2 = gy1Var.e;
                int i6 = gy1Var.g;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!o51.f((dk3) objArr2[i2], l02Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    gy1Var.k(i2);
                }
                if (gy1Var.g == 0) {
                    e31Var.b.invoke();
                }
                return mf3Var;
            case 19:
                ((gy1) obj2).b((bv1) obj);
                return Boolean.TRUE;
            case 20:
                ((yg) ((ea2) obj2).f()).invoke((MotionEvent) obj);
                return mf3Var;
            case 21:
                qs2.c((ss2) obj, ((vh2) obj2).a);
                return mf3Var;
            case 22:
                x81[] x81VarArr = qs2.a;
                ((ss2) obj).a(os2.a, am1.F((String) obj2));
                return mf3Var;
            case 23:
                ((List) obj).add((Float) ((ed1) obj2).invoke());
                return true;
            case 24:
                ow0 ow0Var = (ow0) obj;
                yt2 yt2Var = (yt2) obj2;
                ow0Var.f(ow0Var.g() * yt2Var.a);
                ow0Var.N(yt2Var.b);
                ow0Var.n(yt2Var.c);
                ow0Var.k(yt2Var.d);
                ow0Var.q(yt2Var.e);
                return mf3Var;
            case 25:
                ((jb1) obj2).c();
                return mf3Var;
            case 26:
                ow0 ow0Var2 = (ow0) obj;
                uv2 uv2Var = (uv2) obj2;
                ow0Var2.l(uv2Var.s);
                ow0Var2.r(uv2Var.t);
                ow0Var2.d(uv2Var.u);
                ow0Var2.p(0.0f);
                ow0Var2.j(0.0f);
                ow0Var2.f(uv2Var.v);
                ow0Var2.b();
                ow0Var2.i();
                ow0Var2.o();
                ow0Var2.u(uv2Var.w);
                ow0Var2.o0(uv2Var.x);
                ow0Var2.N(uv2Var.y);
                ow0Var2.n(uv2Var.z);
                ow0Var2.M();
                ow0Var2.k(uv2Var.A);
                ow0Var2.q(uv2Var.B);
                ow0Var2.B0(0);
                ow0Var2.m(uv2Var.C);
                ow0Var2.t(uv2Var.D);
                return mf3Var;
            default:
                Throwable th = (Throwable) obj;
                p33 p33Var = (p33) obj2;
                CancellableContinuationImpl cancellableContinuationImpl = p33Var.g;
                if (cancellableContinuationImpl != null) {
                    cancellableContinuationImpl.cancel(th);
                }
                p33Var.g = null;
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9(Object obj, int i) {
        super(1);
        this.f = i;
        this.g = obj;
    }
}
