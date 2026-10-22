package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ge2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ge2(ge2 ge2Var, l lVar) {
        this.e = 20;
        this.f = ge2Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Object value;
        int i = this.e;
        int i2 = 0;
        Object objInvoke = null;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ke2 ke2Var = (ke2) obj2;
                Throwable th = (Throwable) obj;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                synchronized (ke2Var.c) {
                    try {
                        Job job = ke2Var.d;
                        if (job != null) {
                            ke2Var.u.setValue(ie2.f);
                            job.cancel(CancellationException);
                            ke2Var.r = null;
                            job.invokeOnCompletion(new jl1(12, ke2Var, th));
                        } else {
                            ke2Var.e = CancellationException;
                            ke2Var.u.setValue(ie2.e);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return mf3.a;
            case 1:
                ((ne2) obj2).a((ei0) obj);
                return mf3.a;
            case 2:
                z92 z92Var = (z92) obj2;
                ey1 ey1Var = (ey1) obj;
                if (!(ey1Var instanceof yx2)) {
                    fo.i("Failed requirement.");
                    return null;
                }
                yx2 yx2Var = (yx2) ey1Var;
                if (yx2Var.getValue() != null) {
                    Object value2 = yx2Var.getValue();
                    value2.getClass();
                    objInvoke = ((lu0) z92Var.g).invoke(value2);
                }
                ay2 ay2VarD = yx2Var.d();
                ay2VarD.getClass();
                return new w52(objInvoke, ay2VarD);
            case 3:
                s23 s23Var = (s23) obj;
                s23Var.getClass();
                ((bi2) obj2).h = s23Var;
                return mf3.a;
            case 4:
                p90 p90Var = (p90) obj;
                p90Var.getClass();
                return ((ii2) obj2).createOpenHelper(p90Var);
            case Logger.WARN /* 5 */:
                tl2 tl2Var = ((rl2) obj2).g;
                return Boolean.valueOf(tl2Var != null ? tl2Var.b(obj) : true);
            case Logger.ERROR /* 6 */:
                co2 co2Var = (co2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                t52 t52Var = co2Var.a;
                float fG = t52Var.g() + fFloatValue + co2Var.f;
                float fU = mh0.u(fG, 0.0f, co2Var.e.g());
                boolean z = fG == fU;
                float fG2 = fU - t52Var.g();
                int iRound = Math.round(fG2);
                t52Var.h(t52Var.g() + iRound);
                co2Var.f = fG2 - iRound;
                if (!z) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                wo2 wo2Var = (wo2) obj2;
                return new c12(wo2Var.c(wo2Var.k, ((c12) obj).a, wo2Var.j));
            case 8:
                x92 x92Var = (x92) obj;
                if (((xv1) obj2).d(x92Var.c)) {
                    x92Var.a();
                }
                return mf3.a;
            case mc0.b /* 9 */:
                se2 se2Var = (se2) obj2;
                if (((qp2) obj).f.a.a.f.length() > 0) {
                    se2Var.e = false;
                }
                return mf3.a;
            case mc0.c /* 10 */:
                SavedLocation savedLocation = (SavedLocation) obj;
                savedLocation.getClass();
                return Boolean.valueOf(o51.f(savedLocation.getSyncId(), ((SavedLocation) obj2).getSyncId()));
            case 11:
                SavedRoute savedRoute = (SavedRoute) obj;
                savedRoute.getClass();
                return Boolean.valueOf(o51.f(savedRoute.getName(), ((SavedRoute) obj2).getName()));
            case mc0.d /* 12 */:
                zv2 zv2Var = (zv2) obj2;
                SendChannel sendChannel = zv2Var.f;
                sendChannel.getClass();
                if (!o51.f(zv2Var.f, sendChannel)) {
                    hb2.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                ay1 ay1Var = zv2Var.e;
                Object obj3 = zv2Var.c;
                if (ay1Var != null) {
                    if (obj3 != null) {
                        hb2.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    ay1Var.a(obj);
                } else if (obj3 == null) {
                    zv2Var.c = obj;
                } else {
                    ay1 ay1Var2 = in2.a;
                    ay1 ay1Var3 = new ay1();
                    ay1Var3.a(obj3);
                    ay1Var3.a(obj);
                    zv2Var.e = ay1Var3;
                    zv2Var.c = null;
                }
                return mf3.a;
            case 13:
                ky2 ky2Var = (ky2) obj2;
                synchronized (ky2Var.g) {
                    jy2 jy2Var = ky2Var.i;
                    jy2Var.getClass();
                    Object obj4 = jy2Var.b;
                    obj4.getClass();
                    int i3 = jy2Var.d;
                    ox1 ox1Var = jy2Var.c;
                    if (ox1Var == null) {
                        ox1Var = new ox1();
                        jy2Var.c = ox1Var;
                        jy2Var.f.m(obj4, ox1Var);
                    }
                    jy2Var.b(obj, i3, obj4, ox1Var);
                }
                return mf3.a;
            case 14:
                ((jg0) obj).getClass();
                ((jb1) obj2).c();
                return mf3.a;
            case a83.e /* 15 */:
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                kd1Var.a(null, null, new p10(new r03((GithubRelease) obj2, i2), true, -2114077096));
                return mf3.a;
            case 16:
                ri riVar = (ri) obj;
                ((pu0) obj2).invoke(riVar.e.getValue(), o51.v0.b.invoke(riVar.f));
                return mf3.a;
            case 17:
                ((xb0) obj).getClass();
                return new h41(((long) xq1.P(((Number) ((oh) obj2).d()).floatValue())) << 32);
            case 18:
                Drawable drawable = (Drawable) obj2;
                jg0 jg0Var = (jg0) obj;
                vv vvVarI = jg0Var.X().i();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (jg0Var.a() >> 32)), (int) Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)));
                drawable.draw(ha.a(vvVarI));
                return mf3.a;
            case 19:
                ((lu0) obj).invoke((v53) obj2);
                return mf3.a;
            case 20:
                ge2 ge2Var = (ge2) obj2;
                tc3 tc3Var = (tc3) obj;
                if (tc3Var instanceof n8) {
                    ge2Var.invoke(((n8) tc3Var).s);
                    return Boolean.TRUE;
                }
                fo.n("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 21:
                r73 r73Var = (r73) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                s52 s52Var = r73Var.a;
                float fG3 = s52Var.g() + fFloatValue2;
                s52 s52Var2 = r73Var.b;
                if (fG3 > s52Var2.g()) {
                    fFloatValue2 = s52Var2.g() - s52Var.g();
                } else if (fG3 < 0.0f) {
                    fFloatValue2 = -s52Var.g();
                }
                s52Var.h(s52Var.g() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 22:
                b93 b93Var = (b93) obj2;
                cj cjVar = (cj) obj;
                zi ziVar = (zi) cjVar.a;
                if (ziVar instanceof ag1) {
                    ag1 ag1Var = (ag1) ziVar;
                    if (ag1Var.b == null) {
                        return cj.a(cjVar, new ag1(ag1Var.a, b93Var), 0, 14);
                    }
                }
                if (!(ziVar instanceof zf1)) {
                    return cjVar;
                }
                zf1 zf1Var = (zf1) ziVar;
                return zf1Var.b == null ? cj.a(cjVar, new zf1(zf1Var.a, b93Var), 0, 14) : cjVar;
            default:
                xg3 xg3Var = (xg3) obj2;
                Uri uri = (Uri) obj;
                i52 i52Var = xg3Var.r;
                if (i52Var != null) {
                    xg3Var.r = null;
                    if (uri == null || xg3Var.q != i52Var) {
                        MutableStateFlow mutableStateFlow = xg3Var.c;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, og3.a((og3) value, false, null, null, null, null, 0, 0, 0L, null, false, false, false, null, false, null, 31743)));
                    } else {
                        xg3Var.p = BuildersKt__Builders_commonKt.launch$default(am1.y(xg3Var), Dispatchers.getIO(), null, new n(xg3Var, i52Var, uri, xg3Var.h.get(), (q60) null), 2, null);
                    }
                }
                return mf3.a;
        }
    }

    public /* synthetic */ ge2(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
