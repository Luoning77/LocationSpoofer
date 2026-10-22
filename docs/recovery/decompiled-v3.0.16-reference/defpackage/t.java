package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AtomicFile;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleDelivery;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleReflection;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.channels.BroadcastKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.serialization.json.JsonElement;
import org.json.JSONException;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class t implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(ei0 ei0Var, d31 d31Var) {
        this.e = 13;
        this.f = ei0Var;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0433  */
    /* JADX WARN: Code duplicated, block: B:178:0x046e  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) throws JSONException {
        int i;
        rr rrVar;
        re reVar;
        td tdVarA;
        String strConcat;
        StringBuilder sb;
        int i2;
        qd1 qd1Var;
        int i3 = this.e;
        float f = 0.0f;
        int i4 = 5;
        boolean z = false;
        qd1 qd1Var2 = null;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.f;
        switch (i3) {
            case 0:
                return obj == ((u) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                x71 x71Var = (x71) obj2;
                JsonElement jsonElement = (JsonElement) obj;
                jsonElement.getClass();
                x71Var.I((String) zy.t0(x71Var.a), jsonElement);
                return mf3Var;
            case 2:
                m72 m72Var = (m72) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb2 = new StringBuilder(key == m72Var ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != m72Var ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 3:
                p8 p8Var = (p8) obj2;
                p8Var.u.invoke((v53) obj, xq1.C(p8Var, AndroidCompositionLocals_androidKt.b));
                return mf3Var;
            case 4:
                ((ss2) obj).a(tq2.a, new sq2(bx0.e, ((f12) obj2).b(), rq2.f, true));
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((ag0) obj).getClass();
                return ux0.a((ux0) obj2, 0.75f, null, 5);
            case Logger.ERROR /* 6 */:
                return new h8((vq) obj2, i4);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                gs gsVar = (gs) obj2;
                xu xuVar = (xu) obj;
                if (xuVar.g() * gsVar.v < 0.0f || cw2.b(xuVar.e.a()) <= 0.0f) {
                    return xuVar.c(new v1(18));
                }
                final float fMin = Math.min(td0.b(gsVar.v, 0.0f) ? 1.0f : (float) Math.ceil(xuVar.g() * gsVar.v), (float) Math.ceil(cw2.b(xuVar.e.a()) / 2.0f));
                final float f2 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xuVar.e.a() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xuVar.e.a() & 4294967295L)) - fMin)) & 4294967295L);
                float f3 = fMin * 2.0f;
                boolean z2 = f3 > cw2.b(xuVar.e.a());
                vd0 vd0VarA = gsVar.x.a(xuVar.e.a(), xuVar.e.getLayoutDirection(), xuVar);
                if (!(vd0VarA instanceof z32)) {
                    if (!(vd0VarA instanceof b42)) {
                        boolean z3 = z2;
                        if (!(vd0VarA instanceof a42)) {
                            b81.d();
                            return null;
                        }
                        final qy2 qy2Var = gsVar.w;
                        if (z3) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j = jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = xuVar.e.a();
                        }
                        final long j2 = jFloatToRawIntBits2;
                        final kg0 t13Var = z3 ? en0.a : new t13(fMin, 0.0f, 0, 0, null, 30);
                        return xuVar.c(new lu0() { // from class: ds
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj3) {
                                jb1 jb1Var = (jb1) obj3;
                                jb1Var.c();
                                jg0.P0(jb1Var, qy2Var, j, j2, 0.0f, t13Var, 0, 104);
                                return mf3.a;
                            }
                        });
                    }
                    final qy2 qy2Var2 = gsVar.w;
                    aj2 aj2Var = ((b42) vd0VarA).i;
                    if (mh0.O(aj2Var)) {
                        final long j3 = aj2Var.e;
                        final t13 t13Var2 = new t13(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z4 = z2;
                        return xuVar.c(new lu0() { // from class: es
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj3) throws Throwable {
                                long j4;
                                jb1 jb1Var = (jb1) obj3;
                                jb1Var.c();
                                xv xvVar = jb1Var.e;
                                boolean z5 = z4;
                                st stVar = qy2Var2;
                                long j5 = j3;
                                if (z5) {
                                    jg0.a0(jb1Var, stVar, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f4 = f2;
                                    if (fIntBitsToFloat < f4) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() >> 32));
                                        float f5 = fMin;
                                        float f6 = fIntBitsToFloat2 - f5;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)) - f5;
                                        gn gnVar = xvVar.f;
                                        long jR = gnVar.r();
                                        gnVar.i().l();
                                        try {
                                            ((t1) gnVar.a).s(f5, f5, f6, fIntBitsToFloat3, 0);
                                            j4 = jR;
                                            try {
                                                jg0.a0(jb1Var, stVar, 0L, 0L, j5, null, 246);
                                                p91.v(gnVar, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                p91.v(gnVar, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = jR;
                                        }
                                    } else {
                                        jg0.a0(jb1Var, stVar, jFloatToRawIntBits, jFloatToRawIntBits2, ji2.T(f4, j5), t13Var2, 208);
                                    }
                                }
                                return mf3.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    cs csVar = gsVar.u;
                    if (csVar == null) {
                        csVar = new cs();
                        gsVar.u = csVar;
                    }
                    re reVarA = csVar.d;
                    if (reVarA == null) {
                        reVarA = ue.a();
                        csVar.d = reVarA;
                    }
                    reVarA.g();
                    re.c(reVarA, aj2Var);
                    if (!z5) {
                        re reVarA2 = ue.a();
                        re.c(reVarA2, new aj2(fMin, fMin, (aj2Var.c - aj2Var.a) - fMin, (aj2Var.d - aj2Var.b) - fMin, ji2.T(fMin, aj2Var.e), ji2.T(fMin, aj2Var.f), ji2.T(fMin, aj2Var.g), ji2.T(fMin, aj2Var.h)));
                        reVarA.f(reVarA, reVarA2, 0);
                    }
                    return xuVar.c(new j(i4, reVarA, qy2Var2));
                }
                qy2 qy2Var3 = gsVar.w;
                z32 z32Var = (z32) vd0VarA;
                re reVar2 = z32Var.i;
                if (z2) {
                    return xuVar.c(new j(6, z32Var, qy2Var3));
                }
                if (qy2Var3 != null) {
                    rrVar = new rr(5, hz.c(1.0f, qy2Var3.a));
                    i = 1;
                } else {
                    i = 0;
                    rrVar = null;
                }
                pe2 pe2VarD = reVar2.d();
                float f4 = pe2VarD.b;
                float f5 = pe2VarD.a;
                cs csVar2 = gsVar.u;
                if (csVar2 == null) {
                    csVar2 = new cs();
                    gsVar.u = csVar2;
                }
                re reVarA3 = csVar2.d;
                if (reVarA3 == null) {
                    reVarA3 = ue.a();
                    csVar2.d = reVarA3;
                }
                reVarA3.g();
                re.b(reVarA3, pe2VarD);
                reVarA3.f(reVarA3, reVar2, 0);
                we2 we2Var = new we2();
                long jCeil = (((long) ((int) Math.ceil(pe2VarD.c - f5))) << 32) | (((long) ((int) Math.ceil(pe2VarD.d - f4))) & 4294967295L);
                cs csVar3 = gsVar.u;
                csVar3.getClass();
                td tdVar = csVar3.a;
                ga gaVar = csVar3.b;
                u01 u01Var = tdVar != null ? new u01(tdVar.a()) : null;
                if (u01Var != null && u01Var.a == 0) {
                    z = true;
                } else {
                    u01 u01Var2 = tdVar != null ? new u01(tdVar.a()) : null;
                    if (u01Var2 != null && i == u01Var2.a) {
                        z = true;
                    }
                }
                if (tdVar == null || gaVar == null) {
                    reVar = reVarA3;
                    tdVarA = mh0.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    csVar3.a = tdVarA;
                    Canvas canvas = ha.a;
                    gaVar = new ga();
                    gaVar.a = new Canvas(n51.l(tdVarA));
                    csVar3.b = gaVar;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (xuVar.e.a() >> 32));
                    Bitmap bitmap = tdVar.a;
                    if (fIntBitsToFloat <= bitmap.getWidth()) {
                        reVar = reVarA3;
                        if (Float.intBitsToFloat((int) (xuVar.e.a() & 4294967295L)) <= bitmap.getHeight() && z) {
                            tdVarA = tdVar;
                        }
                    } else {
                        reVar = reVarA3;
                    }
                    tdVarA = mh0.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    csVar3.a = tdVarA;
                    Canvas canvas2 = ha.a;
                    gaVar = new ga();
                    gaVar.a = new Canvas(n51.l(tdVarA));
                    csVar3.b = gaVar;
                }
                xv xvVar = csVar3.c;
                if (xvVar == null) {
                    xvVar = new xv();
                    csVar3.c = xvVar;
                }
                gn gnVar = xvVar.f;
                wv wvVar = xvVar.e;
                long J = mc0.J(jCeil);
                qa1 layoutDirection = xuVar.e.getLayoutDirection();
                xb0 xb0Var = wvVar.a;
                qa1 qa1Var = wvVar.b;
                vv vvVar = wvVar.c;
                xv xvVar2 = xvVar;
                long j4 = wvVar.d;
                wvVar.a = xuVar;
                wvVar.b = layoutDirection;
                wvVar.c = gaVar;
                wvVar.d = J;
                gaVar.l();
                jg0.c0(xvVar2, hz.b, 0L, J, 0.0f, null, 0, 58);
                float f6 = -f5;
                float f7 = -f4;
                ((t1) gnVar.a).D(f6, f7);
                try {
                    jg0.K(xvVar2, z32Var.i, qy2Var3, 0.0f, new t13(f3, 0.0f, 0, 0, null, 30), 52);
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (xvVar2.a() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (xvVar2.a() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (xvVar2.a() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (xvVar2.a() & 4294967295L));
                    long jV0 = xvVar2.v0();
                    td tdVar2 = tdVarA;
                    ga gaVar2 = gaVar;
                    long jR = gnVar.r();
                    gnVar.i().l();
                    try {
                        ((t1) gnVar.a).B(fIntBitsToFloat2, fIntBitsToFloat3, jV0);
                        jg0.K(xvVar2, reVar, qy2Var3, 0.0f, null, 28);
                        gnVar.i().i();
                        gnVar.F(jR);
                        ((t1) gnVar.a).D(-f6, -f7);
                        gaVar2.i();
                        wvVar.a = xb0Var;
                        wvVar.b = qa1Var;
                        wvVar.c = vvVar;
                        wvVar.d = j4;
                        tdVar2.a.prepareToDraw();
                        we2Var.e = tdVar2;
                        return xuVar.c(new fs(pe2VarD, we2Var, jCeil, rrVar));
                    } catch (Throwable th) {
                        gnVar.i().i();
                        gnVar.F(jR);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((t1) gnVar.a).D(-f6, -f7);
                    throw th2;
                }
            case 8:
                return BroadcastKt.broadcast$lambda$1((ReceiveChannel) obj2, (Throwable) obj);
            case mc0.b /* 9 */:
                RuntimeAuthorizationManager runtimeAuthorizationManager = (RuntimeAuthorizationManager) obj2;
                long jLongValue = ((Long) obj).longValue();
                RuntimeAuthorization value2 = runtimeAuthorizationManager.getAuthorization().getValue();
                if (value2 != null && value2.getRunGeneration() == jLongValue && RuntimeAuthorizationManager.isAuthorized$default(runtimeAuthorizationManager, null, 1, null)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case mc0.c /* 10 */:
                x92 x92Var = (x92) obj;
                ((uo0) obj2).invoke(x92Var, Float.valueOf(Float.intBitsToFloat((int) (mh0.T(x92Var, false) >> 32))));
                x92Var.a();
                return mf3Var;
            case 11:
                x92 x92Var2 = (x92) obj;
                ((s5) obj2).invoke(x92Var2, Float.valueOf(Float.intBitsToFloat((int) (mh0.T(x92Var2, false) & 4294967295L))));
                x92Var2.a();
                return mf3Var;
            case mc0.d /* 12 */:
                ow0 ow0Var = (ow0) obj;
                ow0Var.getClass();
                ow0Var.n(true);
                ow0Var.N((du2) ((cg0) obj2).A.g);
                ow0Var.B0(1);
                return mf3Var;
            case 13:
                ei0 ei0Var = (ei0) obj;
                String str = ((ei0) obj2) == ei0Var ? " > " : "   ";
                if (!(ei0Var instanceof h00)) {
                    if (ei0Var instanceof nt2) {
                        sb = new StringBuilder("SetComposingTextCommand(text.length=");
                        nt2 nt2Var = (nt2) ei0Var;
                        sb.append(nt2Var.a.f.length());
                        sb.append(", newCursorPosition=");
                        i2 = nt2Var.b;
                    } else if (ei0Var instanceof mt2) {
                        strConcat = ((mt2) ei0Var).toString();
                    } else if (ei0Var instanceof sb0) {
                        strConcat = ((sb0) ei0Var).toString();
                    } else if (ei0Var instanceof tb0) {
                        strConcat = ((tb0) ei0Var).toString();
                    } else if (ei0Var instanceof ot2) {
                        strConcat = ((ot2) ei0Var).toString();
                    } else if (ei0Var instanceof kn0) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (ei0Var instanceof rb0) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = xe2.a(ei0Var.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    return str.concat(strConcat);
                }
                sb = new StringBuilder("CommitTextCommand(text.length=");
                h00 h00Var = (h00) ei0Var;
                sb.append(h00Var.a.f.length());
                sb.append(", newCursorPosition=");
                i2 = h00Var.b;
                strConcat = az2.o(sb, i2, ')');
                return str.concat(strConcat);
            case 14:
                return EncryptedCloudSessionStore.diagnostics_delegate$lambda$8$lambda$7((AtomicFile) obj2, (String) obj);
            case a83.e /* 15 */:
                return EncryptedCloudSessionStore.loadIdentityMetadata$lambda$27$lambda$26((EncryptedCloudSessionStore) obj2, (KeyPair) obj);
            case 16:
                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20((x20) obj2, ((Boolean) obj).booleanValue());
            case 17:
                ge3 ge3Var = (ge3) obj;
                return ((mq0) obj2).a(new ge3(null, ge3Var.b, ge3Var.c, ge3Var.d, ge3Var.e)).e;
            case 18:
                return FrameworkBleDelivery.install$lambda$27$lambda$5((FrameworkBleDelivery) obj2, (String) obj);
            case 19:
                return Boolean.valueOf(FrameworkBleReflection.resolve$lambda$13((Class) obj2, (Method) obj));
            case 20:
                return FutureKt.asCompletableFuture$lambda$2((CompletableFuture) obj2, (Throwable) obj);
            case 21:
                return new h8((lc1) obj2, 8);
            case 22:
                return new h8((rc1) obj2, 10);
            case 23:
                yd1 yd1Var = (yd1) obj2;
                float f8 = -((Float) obj).floatValue();
                if ((f8 >= 0.0f || yd1Var.c()) && (f8 <= 0.0f || yd1Var.a())) {
                    if (Math.abs(yd1Var.h) > 0.5f) {
                        s21.c("entered drag with non-zero pending scroll");
                    }
                    yd1Var.d = true;
                    float f9 = yd1Var.h + f8;
                    yd1Var.h = f9;
                    if (Math.abs(f9) > 0.5f) {
                        float f10 = yd1Var.h;
                        int iRound = Math.round(f10);
                        qd1 qd1VarF = ((qd1) yd1Var.f.getValue()).f(iRound, !yd1Var.b);
                        if (qd1VarF == null || (qd1Var = yd1Var.c) == null) {
                            qd1Var2 = qd1VarF;
                        } else {
                            qd1 qd1VarF2 = qd1Var.f(iRound, true);
                            if (qd1VarF2 != null) {
                                yd1Var.c = qd1VarF2;
                                qd1Var2 = qd1VarF;
                            }
                        }
                        if (qd1Var2 != null) {
                            yd1Var.g(qd1Var2, yd1Var.b, true);
                            yd1Var.w.setValue(mf3Var);
                            yd1Var.i(f10 - yd1Var.h, qd1Var2);
                        } else {
                            hb1 hb1Var = yd1Var.l;
                            if (hb1Var != null) {
                                hb1Var.k();
                            }
                            yd1Var.i(f10 - yd1Var.h, yd1Var.h());
                        }
                    }
                    if (Math.abs(yd1Var.h) > 0.5f) {
                        f8 -= yd1Var.h;
                        yd1Var.h = 0.0f;
                    }
                    f = f8;
                }
                return Float.valueOf(-f);
            case 24:
                tl2 tl2Var = (tl2) obj2;
                return Boolean.valueOf(tl2Var != null ? tl2Var.b(obj) : true);
            case 25:
                ((JSONObject) obj).put("app_coordinate_systems", new JSONObject((LinkedHashMap) obj2));
                return mf3Var;
            case 26:
                AppState appState = (AppState) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                vl0 vl0Var = vl0.a;
                boolean mockWifi = appState.getMockWifi();
                boolean mockCell = appState.getMockCell();
                boolean mockBluetooth = appState.getMockBluetooth();
                jSONObject.getClass();
                jSONObject.put("mock_wifi_requested", mockWifi);
                jSONObject.put("mock_cell_requested", mockCell);
                jSONObject.put("mock_bluetooth_requested", mockBluetooth);
                vl0.d(jSONObject);
                jSONObject.put("enable_jitter", appState.getEnableJitter());
                return mf3Var;
            case 27:
                Boolean bool = (Boolean) obj2;
                ss2 ss2Var = (ss2) obj;
                ss2Var.getClass();
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    qs2.c(ss2Var, 2);
                    qs2.e(ss2Var, g93.b(zBooleanValue));
                }
                return mf3Var;
            case 28:
                bt2 bt2Var = (bt2) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return bt2Var.e(iIntValue) + ": " + bt2Var.i(iIntValue).b();
            default:
                ((t30) obj2).y(obj);
                return mf3Var;
        }
    }

    public /* synthetic */ t(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
