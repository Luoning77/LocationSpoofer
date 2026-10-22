package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import java.security.KeyPair;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class lh implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lh(ey1 ey1Var, ul1 ul1Var, lr2 lr2Var, lu0 lu0Var) {
        this.e = 10;
        this.f = ey1Var;
        this.g = ul1Var;
        this.i = lr2Var;
        this.h = lu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [cf1, or2] */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        float f;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                oh ohVar = (oh) obj5;
                ti tiVar = (ti) obj4;
                lu0 lu0Var = (lu0) obj3;
                se2 se2Var = (se2) obj2;
                ri riVar = (ri) obj;
                gh0.R(riVar, ohVar.c);
                w52 w52Var = riVar.e;
                Object objB = ohVar.b(w52Var.getValue());
                if (!o51.f(objB, w52Var.getValue())) {
                    ohVar.c.f.setValue(objB);
                    tiVar.f.setValue(objB);
                    if (lu0Var != null) {
                        lu0Var.invoke(ohVar);
                    }
                    riVar.a();
                    se2Var.e = true;
                } else if (lu0Var != null) {
                    lu0Var.invoke(ohVar);
                }
                return mf3Var;
            case 1:
                me1 me1Var = (me1) obj5;
                l83 l83Var = (l83) obj4;
                f83 f83Var = (f83) obj3;
                c11 c11Var = (c11) obj2;
                if (me1Var.b()) {
                    d31 d31Var = me1Var.d;
                    f70 f70Var = me1Var.v;
                    f70 f70Var2 = me1Var.w;
                    we2 we2Var = new we2();
                    ji1 ji1Var = new ji1(d31Var, f70Var, we2Var, 20);
                    j92 j92Var = l83Var.a;
                    j92Var.a(f83Var, c11Var, ji1Var, f70Var2);
                    p83 p83Var = new p83(l83Var, j92Var);
                    l83Var.b.set(p83Var);
                    we2Var.e = p83Var;
                    me1Var.e = p83Var;
                }
                return new df(1);
            case 2:
                te2 te2Var = (te2) obj5;
                ka0 ka0Var = (ka0) obj2;
                ri riVar2 = (ri) obj;
                float fFloatValue = ((Number) riVar2.e.getValue()).floatValue() - te2Var.e;
                float fA = ((sd1) obj4).a(fFloatValue);
                te2Var.e = ((Number) riVar2.e.getValue()).floatValue();
                ((te2) obj3).e = ((Number) riVar2.a.b.invoke(riVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    riVar2.a();
                }
                ka0Var.getClass();
                return mf3Var;
            case 3:
                return EncryptedCloudSessionStore.sign$lambda$31((EncryptedCloudSessionStore) obj5, (we2) obj4, (we2) obj3, (ue2) obj2, (Exception) obj);
            case 4:
                return EncryptedCloudSessionStore.prepareConfirmedReplacement$lambda$43((JSONObject) obj5, (EncryptedCloudSessionStore) obj4, (String) obj3, (String) obj2, (KeyPair) obj);
            case Logger.WARN /* 5 */:
                ImportExportSelection importExportSelection = (ImportExportSelection) obj;
                importExportSelection.getClass();
                ((ey1) obj3).setValue(null);
                ig0.j((ul1) obj5, (LocationSpooferDataPackage) obj4, importExportSelection, new i5((Context) obj2, 1));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                g21 g21Var = (g21) obj4;
                te2 te2Var2 = (te2) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                long jLongValue = ((Long) obj).longValue();
                s03 s03Var = (s03) ((ey1) obj5).getValue();
                long jLongValue2 = s03Var != null ? ((Number) s03Var.getValue()).longValue() : jLongValue;
                long j = g21Var.c;
                gy1 gy1Var = g21Var.a;
                if (j == Long.MIN_VALUE || te2Var2.e != gh0.A(coroutineScope.getCoroutineContext())) {
                    g21Var.c = jLongValue;
                    Object[] objArr = gy1Var.e;
                    int i2 = gy1Var.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((e21) objArr[i3]).j = true;
                    }
                    te2Var2.e = gh0.A(coroutineScope.getCoroutineContext());
                }
                float f2 = te2Var2.e;
                if (f2 == 0.0f) {
                    Object[] objArr2 = gy1Var.e;
                    int i4 = gy1Var.g;
                    for (int i5 = 0; i5 < i4; i5++) {
                        e21 e21Var = (e21) objArr2[i5];
                        e21Var.g.setValue(e21Var.h.c);
                        e21Var.j = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - g21Var.c) / f2);
                    Object[] objArr3 = gy1Var.e;
                    int i6 = gy1Var.g;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        e21 e21Var2 = (e21) objArr3[i7];
                        boolean zG = e21Var2.i;
                        if (!zG) {
                            e21Var2.l.b.setValue(Boolean.FALSE);
                            if (e21Var2.j) {
                                e21Var2.j = false;
                                e21Var2.k = j2;
                            }
                            long j3 = j2 - e21Var2.k;
                            e21Var2.g.setValue(e21Var2.h.b(j3));
                            zG = e21Var2.h.g(j3);
                            e21Var2.i = zG;
                        }
                        if (!zG) {
                            z = false;
                        }
                    }
                    g21Var.d.setValue(Boolean.valueOf(!z));
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                wc1 wc1Var = (wc1) obj5;
                wc1Var.c = new ha1((mc1) obj4, (g23) obj3, (nb2) obj2);
                return new h8(wc1Var, 9);
            case 8:
                return LocationRepository.updateEnvironment$lambda$5((LocationRepository) obj5, (String) obj4, (String) obj3, (String) obj2, (JSONObject) obj);
            case mc0.b /* 9 */:
                lr2 lr2Var = (lr2) obj4;
                lu0 lu0Var2 = (lu0) obj3;
                Context context = (Context) obj2;
                SavedLocation savedLocation = (SavedLocation) obj;
                savedLocation.getClass();
                an1.c((ul1) obj5, savedLocation);
                if (lr2Var != null) {
                    lr2Var.d(savedLocation.getLat(), savedLocation.getLng(), Float.valueOf(17.5f));
                }
                lu0Var2.invoke(new kz2(false));
                Toast.makeText(context, context.getString(2131624588, savedLocation.getName()), 0).show();
                return mf3Var;
            case mc0.c /* 10 */:
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                List list = ((uz2) ((ey1) obj5).getValue()).g;
                kd1Var.c(list.size(), null, new u3(list, 7), new p10(new fj1(list, (ul1) obj4, (lr2) obj2, (lu0) obj3), true, 802480018));
                return mf3Var;
            case 11:
                te2 te2Var3 = (te2) obj5;
                dw1 dw1Var = (dw1) obj4;
                uo2 uo2Var = (uo2) obj3;
                e5 e5Var = (e5) obj2;
                ri riVar3 = (ri) obj;
                float fFloatValue2 = ((Number) riVar3.e.getValue()).floatValue() - te2Var3.e;
                if (wc0.Q(fFloatValue2)) {
                    if (((Boolean) e5Var.invoke(Float.valueOf(te2Var3.e))).booleanValue()) {
                        riVar3.a();
                    }
                } else if (wc0.Q(fFloatValue2 - dw1Var.c(uo2Var, fFloatValue2))) {
                    te2Var3.e += fFloatValue2;
                    if (((Boolean) e5Var.invoke(Float.valueOf(te2Var3.e))).booleanValue()) {
                        riVar3.a();
                    }
                } else {
                    riVar3.a();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                final df1 df1Var = (df1) obj5;
                Context context2 = (Context) obj4;
                final k kVar = (k) obj3;
                final ey1 ey1Var = (ey1) obj2;
                ((ed0) obj).getClass();
                final se2 se2Var2 = new se2();
                final se2 se2Var3 = new se2();
                final se2 se2Var4 = new se2();
                ?? r4 = new bf1() { // from class: or2
                    @Override // defpackage.bf1
                    public final void U(df1 df1Var2, ve1 ve1Var) {
                        ve1 ve1Var2 = ve1.ON_DESTROY;
                        se2 se2Var5 = se2Var4;
                        k kVar2 = kVar;
                        se2 se2Var6 = se2Var3;
                        se2 se2Var7 = se2Var2;
                        if (ve1Var == ve1Var2) {
                            as2.b(se2Var5, kVar2, ey1Var, se2Var6, se2Var7);
                        } else {
                            as2.c(se2Var5, df1Var, se2Var7, kVar2, se2Var6);
                        }
                    }
                };
                wr2 wr2Var = new wr2(se2Var4, kVar);
                df1Var.getLifecycle().a(r4);
                context2.getApplicationContext().registerComponentCallbacks(wr2Var);
                as2.c(se2Var4, df1Var, se2Var2, kVar, se2Var3);
                return new xr2(df1Var, r4, context2, wr2Var, se2Var4, kVar, ey1Var, se2Var3, se2Var2);
            default:
                e03 e03Var = (e03) obj5;
                hz hzVar = (hz) obj4;
                kw0 kw0Var = (kw0) obj3;
                je jeVar = (je) obj2;
                jb1 jb1Var = (jb1) obj;
                jb1Var.getClass();
                xv xvVar = jb1Var.e;
                if (Math.max(Float.intBitsToFloat((int) (xvVar.a() >> 32)), Float.intBitsToFloat((int) (xvVar.a() & 4294967295L))) <= 2048.0f) {
                    jg0.c0(jb1Var, hzVar.a, 0L, 0L, 0.0f, null, 0, 126);
                    jb1Var.c();
                    d03.b(jb1Var, e03Var, true, true);
                } else {
                    jg0.C0(jb1Var, kw0Var, new ge2(jb1Var, 14));
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (xvVar.a() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L));
                    vv vvVarI = xvVar.f.i();
                    long jA = xvVar.a();
                    float fMax = Math.max(e03Var.c(0, jA), e03Var.c(1, jA));
                    long jA2 = xvVar.a();
                    float fMax2 = Math.max(e03Var.c(2, jA2), e03Var.c(3, jA2));
                    if (fIntBitsToFloat2 <= fMax + fMax2) {
                        d03.a(vvVarI, fIntBitsToFloat, jeVar, hzVar, jb1Var, kw0Var, e03Var, 0.0f, fIntBitsToFloat2, true, true, false);
                    } else {
                        float fCeil = (float) Math.ceil(fMax);
                        float fFloor = (float) Math.floor(fIntBitsToFloat2 - fMax2);
                        if (fMax > 0.0f) {
                            f = fCeil;
                            d03.a(vvVarI, fIntBitsToFloat, jeVar, hzVar, jb1Var, kw0Var, e03Var, 0.0f, f, true, false, true);
                        } else {
                            f = fCeil;
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (xvVar.a() >> 32));
                        gn gnVar = xvVar.f;
                        long jR = gnVar.r();
                        gnVar.i().l();
                        try {
                            ((t1) gnVar.a).s(0.0f, f, fIntBitsToFloat3, fFloor, 1);
                            jg0.c0(jb1Var, hzVar.a, 0L, 0L, 0.0f, null, 0, 126);
                            dh0.m(jb1Var, kw0Var);
                            p91.v(gnVar, jR);
                            if (fMax2 > 0.0f) {
                                d03.a(vvVarI, fIntBitsToFloat, jeVar, hzVar, jb1Var, kw0Var, e03Var, fFloor, fIntBitsToFloat2, false, true, true);
                            }
                        } catch (Throwable th) {
                            p91.v(gnVar, jR);
                            throw th;
                        }
                    }
                }
                return mf3Var;
        }
    }

    public /* synthetic */ lh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
