package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.GnssSatelliteCatalog;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleDelivery;
import com.vincenthzr.locationspoofer.xposed.utils.HotReloadHost;
import io.github.libxposed.api.XposedModuleInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ji1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ji1(ey1 ey1Var, ArrayList arrayList, List list, boolean z) {
        this.e = 11;
        this.f = ey1Var;
        this.g = arrayList;
        this.h = list;
    }

    private final Object f(Object obj) {
        return LocationHooker.onHotReloaded$lambda$17((LocationHooker) this.f, (Map) this.g, (XposedModuleInterface.HotReloadedParam) this.h, (HotReloadHost) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object g(Object obj) {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        x83 x83Var;
        x83 x83Var2;
        y83 y83Var;
        y83 y83Var2;
        x83 x83Var3;
        x83 x83Var4;
        y83 y83Var3;
        y83 y83Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        z92 z92Var;
        d91 d91Var = (d91) this.f;
        j73 j73Var = (j73) this.g;
        se2 se2Var = (se2) this.h;
        m73 m73Var = (m73) obj;
        int iOrdinal = d91Var.ordinal();
        int i = 6;
        int i2 = 1;
        mf3 mf3Var = mf3.a;
        int i3 = 0;
        f83 f83Var = null;
        switch (iOrdinal) {
            case 0:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    if (f93.c(m73Var.f)) {
                        m73Var.i();
                        return mf3Var;
                    }
                    boolean zF = m73Var.f();
                    long j = m73Var.f;
                    if (zF) {
                        int iF = f93.f(j);
                        m73Var.q(iF, iF);
                        return mf3Var;
                    }
                    int iE = f93.e(j);
                    m73Var.q(iE, iE);
                }
                return mf3Var;
            case 1:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    if (f93.c(m73Var.f)) {
                        m73Var.m();
                        return mf3Var;
                    }
                    boolean zF2 = m73Var.f();
                    long j2 = m73Var.f;
                    if (zF2) {
                        int iE2 = f93.e(j2);
                        m73Var.q(iE2, iE2);
                        return mf3Var;
                    }
                    int iF2 = f93.f(j2);
                    m73Var.q(iF2, iF2);
                    return mf3Var;
                }
                return mf3Var;
            case 2:
                e93 e93Var = m73Var.e;
                e93Var.a = null;
                dj djVar = m73Var.g;
                String str = djVar.f;
                String str2 = djVar.f;
                if (str.length() > 0) {
                    if (m73Var.f()) {
                        e93Var.a = null;
                        if (str2.length() > 0 && (numD = m73Var.d()) != null) {
                            int iIntValue = numD.intValue();
                            m73Var.q(iIntValue, iIntValue);
                            return mf3Var;
                        }
                    } else {
                        e93Var.a = null;
                        if (str2.length() > 0 && (numE = m73Var.e()) != null) {
                            int iIntValue2 = numE.intValue();
                            m73Var.q(iIntValue2, iIntValue2);
                            return mf3Var;
                        }
                    }
                }
                return mf3Var;
            case 3:
                e93 e93Var2 = m73Var.e;
                e93Var2.a = null;
                dj djVar2 = m73Var.g;
                String str3 = djVar2.f;
                String str4 = djVar2.f;
                if (str3.length() > 0) {
                    if (m73Var.f()) {
                        e93Var2.a = null;
                        if (str4.length() > 0 && (numE2 = m73Var.e()) != null) {
                            int iIntValue3 = numE2.intValue();
                            m73Var.q(iIntValue3, iIntValue3);
                            return mf3Var;
                        }
                    } else {
                        e93Var2.a = null;
                        if (str4.length() > 0 && (numD2 = m73Var.d()) != null) {
                            int iIntValue4 = numD2.intValue();
                            m73Var.q(iIntValue4, iIntValue4);
                            return mf3Var;
                        }
                    }
                }
                return mf3Var;
            case 4:
                m73Var.j();
                return mf3Var;
            case Logger.WARN /* 5 */:
                m73Var.l();
                return mf3Var;
            case Logger.ERROR /* 6 */:
                m73Var.o();
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                m73Var.n();
                return mf3Var;
            case 8:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    if (m73Var.f()) {
                        m73Var.o();
                        return mf3Var;
                    }
                    m73Var.n();
                    return mf3Var;
                }
                return mf3Var;
            case mc0.b /* 9 */:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    if (m73Var.f()) {
                        m73Var.n();
                        return mf3Var;
                    }
                    m73Var.o();
                    return mf3Var;
                }
                return mf3Var;
            case mc0.c /* 10 */:
                if (m73Var.g.f.length() > 0 && (x83Var = m73Var.c) != null) {
                    int iG = m73Var.g(x83Var, -1);
                    m73Var.q(iG, iG);
                    return mf3Var;
                }
                return mf3Var;
            case 11:
                if (m73Var.g.f.length() > 0 && (x83Var2 = m73Var.c) != null) {
                    int iG2 = m73Var.g(x83Var2, 1);
                    m73Var.q(iG2, iG2);
                    return mf3Var;
                }
                return mf3Var;
            case mc0.d /* 12 */:
            case 48:
                return mf3Var;
            case 13:
                if (m73Var.g.f.length() > 0 && (y83Var = m73Var.i) != null) {
                    int iH = m73Var.h(y83Var, -1);
                    m73Var.q(iH, iH);
                    return mf3Var;
                }
                return mf3Var;
            case 14:
                if (m73Var.g.f.length() > 0 && (y83Var2 = m73Var.i) != null) {
                    int iH2 = m73Var.h(y83Var2, 1);
                    m73Var.q(iH2, iH2);
                    return mf3Var;
                }
                return mf3Var;
            case a83.e /* 15 */:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    m73Var.q(0, 0);
                    return mf3Var;
                }
                return mf3Var;
            case 16:
                m73Var.e.a = null;
                dj djVar3 = m73Var.g;
                if (djVar3.f.length() > 0) {
                    int length = djVar3.f.length();
                    m73Var.q(length, length);
                    return mf3Var;
                }
                return mf3Var;
            case 17:
                j73Var.b.a(false);
                return mf3Var;
            case 18:
                j73Var.b.o();
                return mf3Var;
            case 19:
                j73Var.b.c();
                return mf3Var;
            case 20:
                List listA = m73Var.a(new ym2(28));
                if (listA != null) {
                    j73Var.a(listA);
                    return mf3Var;
                }
                return mf3Var;
            case 21:
                List listA2 = m73Var.a(new ym2(29));
                if (listA2 != null) {
                    j73Var.a(listA2);
                    return mf3Var;
                }
                return mf3Var;
            case 22:
                List listA3 = m73Var.a(new i73(i3));
                if (listA3 != null) {
                    j73Var.a(listA3);
                    return mf3Var;
                }
                return mf3Var;
            case 23:
                List listA4 = m73Var.a(new i73(i2));
                if (listA4 != null) {
                    j73Var.a(listA4);
                    return mf3Var;
                }
                return mf3Var;
            case 24:
                List listA5 = m73Var.a(new i73(2));
                if (listA5 != null) {
                    j73Var.a(listA5);
                    return mf3Var;
                }
                return mf3Var;
            case 25:
                List listA6 = m73Var.a(new i73(3));
                if (listA6 != null) {
                    j73Var.a(listA6);
                    return mf3Var;
                }
                return mf3Var;
            case 26:
                m73Var.e.a = null;
                dj djVar4 = m73Var.g;
                if (djVar4.f.length() > 0) {
                    m73Var.q(0, djVar4.f.length());
                    return mf3Var;
                }
                return mf3Var;
            case 27:
                m73Var.i();
                m73Var.p();
                return mf3Var;
            case 28:
                m73Var.m();
                m73Var.p();
                return mf3Var;
            case 29:
                if (m73Var.g.f.length() > 0 && (x83Var3 = m73Var.c) != null) {
                    int iG3 = m73Var.g(x83Var3, -1);
                    m73Var.q(iG3, iG3);
                }
                m73Var.p();
                return mf3Var;
            case 30:
                if (m73Var.g.f.length() > 0 && (x83Var4 = m73Var.c) != null) {
                    int iG4 = m73Var.g(x83Var4, 1);
                    m73Var.q(iG4, iG4);
                }
                m73Var.p();
                return mf3Var;
            case 31:
                if (m73Var.g.f.length() > 0 && (y83Var3 = m73Var.i) != null) {
                    int iH3 = m73Var.h(y83Var3, -1);
                    m73Var.q(iH3, iH3);
                }
                m73Var.p();
                return mf3Var;
            case GnssSatelliteCatalog.MAX_SATELLITES /* 32 */:
                if (m73Var.g.f.length() > 0 && (y83Var4 = m73Var.i) != null) {
                    int iH4 = m73Var.h(y83Var4, 1);
                    m73Var.q(iH4, iH4);
                }
                m73Var.p();
                return mf3Var;
            case 33:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    m73Var.q(0, 0);
                }
                m73Var.p();
                return mf3Var;
            case 34:
                m73Var.e.a = null;
                dj djVar5 = m73Var.g;
                if (djVar5.f.length() > 0) {
                    int length2 = djVar5.f.length();
                    m73Var.q(length2, length2);
                }
                m73Var.p();
                return mf3Var;
            case 35:
                e93 e93Var3 = m73Var.e;
                e93Var3.a = null;
                dj djVar6 = m73Var.g;
                String str5 = djVar6.f;
                String str6 = djVar6.f;
                if (str5.length() > 0) {
                    if (m73Var.f()) {
                        e93Var3.a = null;
                        if (str6.length() > 0 && (numE3 = m73Var.e()) != null) {
                            int iIntValue5 = numE3.intValue();
                            m73Var.q(iIntValue5, iIntValue5);
                        }
                    } else {
                        e93Var3.a = null;
                        if (str6.length() > 0 && (numD3 = m73Var.d()) != null) {
                            int iIntValue6 = numD3.intValue();
                            m73Var.q(iIntValue6, iIntValue6);
                        }
                    }
                }
                m73Var.p();
                return mf3Var;
            case 36:
                e93 e93Var4 = m73Var.e;
                e93Var4.a = null;
                dj djVar7 = m73Var.g;
                String str7 = djVar7.f;
                String str8 = djVar7.f;
                if (str7.length() > 0) {
                    if (m73Var.f()) {
                        e93Var4.a = null;
                        if (str8.length() > 0 && (numD4 = m73Var.d()) != null) {
                            int iIntValue7 = numD4.intValue();
                            m73Var.q(iIntValue7, iIntValue7);
                        }
                    } else {
                        e93Var4.a = null;
                        if (str8.length() > 0 && (numE4 = m73Var.e()) != null) {
                            int iIntValue8 = numE4.intValue();
                            m73Var.q(iIntValue8, iIntValue8);
                        }
                    }
                }
                m73Var.p();
                return mf3Var;
            case 37:
                m73Var.j();
                m73Var.p();
                return mf3Var;
            case 38:
                m73Var.l();
                m73Var.p();
                return mf3Var;
            case 39:
                m73Var.o();
                m73Var.p();
                return mf3Var;
            case 40:
                m73Var.n();
                m73Var.p();
                return mf3Var;
            case 41:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    if (m73Var.f()) {
                        m73Var.o();
                    } else {
                        m73Var.n();
                    }
                }
                m73Var.p();
                return mf3Var;
            case 42:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    if (m73Var.f()) {
                        m73Var.n();
                    } else {
                        m73Var.o();
                    }
                }
                m73Var.p();
                return mf3Var;
            case 43:
                m73Var.e.a = null;
                if (m73Var.g.f.length() > 0) {
                    long j3 = m73Var.f;
                    int i4 = f93.c;
                    int i5 = (int) (j3 & 4294967295L);
                    m73Var.q(i5, i5);
                    return mf3Var;
                }
                return mf3Var;
            case 44:
                if (!j73Var.e) {
                    j73Var.a(am1.F(new h00("\n", 1)));
                    return mf3Var;
                }
                se2Var.e = j73Var.a.x.f.r.b(j73Var.k);
                return mf3Var;
            case 45:
                if (j73Var.e) {
                    se2Var.e = false;
                    return mf3Var;
                }
                j73Var.a(am1.F(new h00("\t", 1)));
                return mf3Var;
            case 46:
                j73Var.h.a(f83.a(m73Var.h, m73Var.g, m73Var.f, 4));
                kf3 kf3Var = j73Var.h;
                z92 z92Var2 = kf3Var.a;
                if (z92Var2 != null && (z92Var = (z92) z92Var2.f) != null) {
                    kf3Var.a = z92Var;
                    kf3Var.c -= ((f83) z92Var2.g).a.f.length();
                    kf3Var.b = new z92(i, kf3Var.b, (f83) z92Var2.g);
                    f83Var = (f83) z92Var.g;
                }
                if (f83Var != null) {
                    j73Var.j.invoke(f83Var);
                    return mf3Var;
                }
                return mf3Var;
            case 47:
                kf3 kf3Var2 = j73Var.h;
                z92 z92Var3 = kf3Var2.b;
                if (z92Var3 != null) {
                    kf3Var2.b = (z92) z92Var3.f;
                    f83 f83Var2 = (f83) z92Var3.g;
                    kf3Var2.a = new z92(i, kf3Var2.a, f83Var2);
                    kf3Var2.c = f83Var2.a.f.length() + kf3Var2.c;
                    f83Var = (f83) z92Var3.g;
                }
                if (f83Var != null) {
                    j73Var.j.invoke(f83Var);
                    return mf3Var;
                }
                return mf3Var;
            default:
                b81.d();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [cf1, ic0] */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) throws Throwable {
        q60 q60Var;
        vv vvVar;
        int i;
        Sensor defaultSensor;
        boolean zSign$lambda$29;
        boolean z;
        cj cjVar;
        int i2 = this.e;
        int i3 = 28;
        int i4 = 15;
        int i5 = 3;
        final int i6 = 2;
        Sensor defaultSensor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        mf3 mf3Var = mf3.a;
        final int i7 = 1;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i2) {
            case 0:
                return f(obj);
            case 1:
                ey1 ey1Var = (ey1) obj3;
                ey1 ey1Var2 = (ey1) obj2;
                kd1 kd1Var = (kd1) obj;
                kd1Var.getClass();
                Map map = (Map) ((ey1) obj4).getValue();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Set setEntrySet = ((Map) entry.getValue()).entrySet();
                    ArrayList arrayList2 = new ArrayList(az.Y(setEntrySet, 10));
                    Iterator it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new i52(str, (Map.Entry) it.next()));
                    }
                    fz.b0(arrayList, arrayList2);
                }
                int i8 = 3;
                v1 v1Var = new v1(i8);
                int size = arrayList.size();
                l3 l3Var = new l3(i8, v1Var, arrayList);
                int i9 = 0;
                kd1Var.c(size, l3Var, new w3(arrayList, i9), new p10(new x3(arrayList, ey1Var, ey1Var2, i9), true, 802480018));
                return mf3Var;
            case 2:
                ul1 ul1Var = (ul1) obj4;
                ey1 ey1Var3 = (ey1) obj2;
                String str2 = (String) obj;
                str2.getClass();
                String packageName = ((AppInfoItem) obj3).getPackageName();
                ul1Var.getClass();
                packageName.getClass();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                LinkedHashMap linkedHashMapS = jq1.S(((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems());
                linkedHashMapS.put(packageName, str2);
                ul1Var.c.setAppCoordinateSystems(linkedHashMapS);
                while (true) {
                    Object value = mutableStateFlow.getValue();
                    LinkedHashMap linkedHashMap = linkedHashMapS;
                    if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, linkedHashMap, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -8388609, 134217727, null))) {
                        if (((AppState) mutableStateFlow.getValue()).isSpoofingActive()) {
                            q60Var = null;
                            BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new k(ul1Var, linkedHashMap, q60Var, 29), 3, null);
                        } else {
                            q60Var = null;
                        }
                        ey1Var3.setValue(q60Var);
                        return mf3Var;
                    }
                    linkedHashMapS = linkedHashMap;
                }
                break;
            case 3:
                lu0 lu0Var = (lu0) obj4;
                ey1 ey1Var4 = (ey1) obj2;
                f83 f83Var = (f83) obj;
                ((ey1) obj3).setValue(f83Var);
                boolean zF = o51.f((String) ey1Var4.getValue(), f83Var.a.f);
                dj djVar = f83Var.a;
                ey1Var4.setValue(djVar.f);
                if (!zF) {
                    lu0Var.invoke(djVar.f);
                }
                return mf3Var;
            case 4:
                a60 a60Var = (a60) obj4;
                Job job = (Job) obj3;
                uo2 uo2Var = (uo2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = a60Var.u ? 1.0f : -1.0f;
                wo2 wo2Var = a60Var.t;
                long jE = wo2Var.e(wo2Var.h(f * fFloatValue));
                wo2 wo2Var2 = uo2Var.a;
                float fG = wo2Var.g(wo2Var.e(wo2Var2.c(wo2Var2.k, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')', null, 2, null);
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                me1 me1Var = (me1) obj4;
                long j = ((f83) obj3).b;
                e12 e12Var = (e12) obj2;
                jg0 jg0Var = (jg0) obj;
                y83 y83VarD = me1Var.d();
                if (y83VarD != null) {
                    vv vvVarI = jg0Var.X().i();
                    long j2 = ((f93) me1Var.A.getValue()).a;
                    long j3 = ((f93) me1Var.B.getValue()).a;
                    x83 x83Var = y83VarD.a;
                    sw1 sw1Var = x83Var.b;
                    w83 w83Var = x83Var.a;
                    je jeVar = me1Var.y;
                    long j4 = me1Var.z;
                    if (!f93.c(j2)) {
                        jeVar.g(j4);
                        int iR = e12Var.r(f93.f(j2));
                        int iR2 = e12Var.r(f93.e(j2));
                        if (iR != iR2) {
                            vvVarI.h(x83Var.i(iR, iR2), jeVar);
                        }
                    } else if (!f93.c(j3)) {
                        long jB = w83Var.b.b();
                        hz hzVar = jB == 16 ? null : new hz(jB);
                        long j5 = hzVar != null ? hzVar.a : hz.b;
                        jeVar.g(hz.c(hz.d(j5) * 0.2f, j5));
                        int iR3 = e12Var.r(f93.f(j3));
                        int iR4 = e12Var.r(f93.e(j3));
                        if (iR3 != iR4) {
                            vvVarI.h(x83Var.i(iR3, iR4), jeVar);
                        }
                    } else if (!f93.c(j)) {
                        jeVar.g(j4);
                        int iR5 = e12Var.r(f93.f(j));
                        int iR6 = e12Var.r(f93.e(j));
                        if (iR5 != iR6) {
                            vvVarI.h(x83Var.i(iR5, iR6), jeVar);
                        }
                    }
                    i7 = (!x83Var.d() || w83Var.f == 3) ? 0 : 1;
                    if (i7 != 0) {
                        long j6 = x83Var.c;
                        pe2 pe2VarD = ce0.d(0L, (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L));
                        vvVarI.l();
                        vv.k(vvVarI, pe2VarD);
                    }
                    uy2 uy2Var = w83Var.b.a;
                    p63 p63Var = uy2Var.m;
                    i83 i83Var = uy2Var.a;
                    if (p63Var == null) {
                        p63Var = p63.b;
                    }
                    p63 p63Var2 = p63Var;
                    xt2 xt2Var = uy2Var.n;
                    if (xt2Var == null) {
                        xt2Var = xt2.d;
                    }
                    xt2 xt2Var2 = xt2Var;
                    kg0 kg0Var = uy2Var.p;
                    if (kg0Var == null) {
                        kg0Var = en0.a;
                    }
                    kg0 kg0Var2 = kg0Var;
                    try {
                        st stVarB = i83Var.b();
                        h83 h83Var = h83.a;
                        try {
                            if (stVarB != null) {
                                vvVar = vvVarI;
                                xp1.t(sw1Var, vvVar, stVarB, i83Var != h83Var ? i83Var.s() : 1.0f, xt2Var2, p63Var2, kg0Var2);
                            } else {
                                vvVar = vvVarI;
                                sw1Var.i(vvVar, i83Var != h83Var ? i83Var.a() : hz.b, xt2Var2, p63Var2, kg0Var2);
                            }
                            if (i7 != 0) {
                                vvVar.i();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i7 != 0) {
                                vvVarI.i();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                Context context = (Context) obj3;
                k63 k63Var = (k63) obj2;
                l60 l60Var = (l60) obj;
                List list = ((x53) obj4).a;
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    w53 w53Var = (w53) list.get(i10);
                    int i11 = 6;
                    if (w53Var instanceof e63) {
                        e63 e63Var = (e63) w53Var;
                        l60.b(l60Var, new s5(e63Var, i11), e63Var.c == 0 ? null : new p10(new db0(e63Var, 0), true, -1930700965), new m5(13, e63Var, k63Var), 6);
                    } else {
                        if (!(w53Var instanceof l63)) {
                            i = 11;
                            if (w53Var instanceof j63) {
                                l60Var.a.add(ks.C);
                            }
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            l63 l63Var = (l63) w53Var;
                            if (context != null) {
                                int i12 = l63Var.c;
                                TextClassification textClassification = l63Var.b;
                                if (i12 < 0) {
                                    iy2 iy2Var = new iy2(textClassification, i5);
                                    Drawable icon = textClassification.getIcon();
                                    l60.b(l60Var, iy2Var, icon != null ? new p10(new db0(icon, 2), true, -1123224187) : null, new qi2(context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i12);
                                    i = 11;
                                    l60.b(l60Var, new iy2(remoteAction, 4), ((i12 == 0) || remoteAction.shouldShowIcon()) ? new p10(new db0(remoteAction, i5), true, -1261173016) : null, new ol2(remoteAction, i), 6);
                                }
                            }
                        }
                    }
                    i = 11;
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                df1 df1Var = (df1) obj3;
                ey1 ey1Var5 = (ey1) obj2;
                ((ed0) obj).getClass();
                Object systemService = ((Context) obj4).getSystemService("sensor");
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(15)) != null) {
                    defaultSensor2 = defaultSensor;
                } else if (sensorManager != null) {
                    defaultSensor2 = sensorManager.getDefaultSensor(11);
                }
                if (sensorManager == null || defaultSensor2 == null) {
                    return new df(2);
                }
                te2 te2Var = new te2();
                te2 te2Var2 = new te2();
                te2 te2Var3 = new te2();
                te2 te2Var4 = new te2();
                final se2 se2Var = new se2();
                final se2 se2Var2 = new se2();
                final kc0 kc0Var = new kc0(new float[9], new float[3], se2Var, te2Var, te2Var2, te2Var3, te2Var4, ey1Var5);
                final Sensor sensor = defaultSensor2;
                final SensorManager sensorManager2 = sensorManager;
                ?? r15 = new bf1() { // from class: ic0
                    @Override // defpackage.bf1
                    public final void U(df1 df1Var2, ve1 ve1Var) {
                        int i13 = jc0.a[ve1Var.ordinal()];
                        se2 se2Var3 = se2Var2;
                        SensorManager sensorManager3 = sensorManager2;
                        kc0 kc0Var2 = kc0Var;
                        if (i13 == 1) {
                            if (se2Var3.e) {
                                return;
                            }
                            sensorManager3.registerListener(kc0Var2, sensor, 1);
                            se2Var3.e = true;
                            return;
                        }
                        if (i13 == 2 && se2Var3.e) {
                            sensorManager3.unregisterListener(kc0Var2);
                            se2Var3.e = false;
                            se2Var.e = false;
                        }
                    }
                };
                xe1 lifecycle = df1Var.getLifecycle();
                lifecycle.a(r15);
                return new lc0(lifecycle, r15, se2Var2, sensorManager2, kc0Var, se2Var);
            case 8:
                zSign$lambda$29 = EncryptedCloudSessionStore.sign$lambda$29((we2) obj4, (we2) obj3, (EncryptedCloudSessionStore) obj2, (Exception) obj);
                break;
            case mc0.b /* 9 */:
                ImportExportSelection importExportSelection = (ImportExportSelection) obj;
                importExportSelection.getClass();
                ((ey1) obj3).setValue(importExportSelection);
                ((ey1) obj2).setValue(null);
                ((no1) obj4).a("environment_data_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".json");
                return mf3Var;
            case mc0.c /* 10 */:
                zSign$lambda$29 = FrameworkBleDelivery.install$lambda$27$lambda$3((FrameworkBleDelivery) obj4, (we2) obj3, (LinkedHashMap) obj2, (Class) obj);
                break;
            case 11:
                ey1 ey1Var6 = (ey1) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                List list2 = (List) obj2;
                g82 g82Var = (g82) obj;
                g82Var.e = true;
                int size3 = arrayList3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((rd1) arrayList3.get(i13)).b(g82Var);
                }
                int size4 = list2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((rd1) list2.get(i14)).b(g82Var);
                }
                g82Var.e = false;
                ey1Var6.getValue();
                return mf3Var;
            case mc0.d /* 12 */:
                CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj;
                completeCollectionRoute.getClass();
                am1.R((ul1) obj4, completeCollectionRoute.getRoute().getId());
                ((au0) obj3).invoke();
                ((ey1) obj2).setValue(Boolean.FALSE);
                return mf3Var;
            case 13:
                z42 z42Var = (z42) obj3;
                k9 k9Var = (k9) obj2;
                jb1 jb1Var = (jb1) obj;
                long j7 = ((cw2) ((z63) obj4).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fR = jb1Var.R(4.0f);
                    xv xvVar = jb1Var.e;
                    float fR2 = jb1Var.R(z42Var.a(jb1Var.getLayoutDirection()));
                    float fA = k9Var.a(xq1.P(fIntBitsToFloat), xq1.P((Float.intBitsToFloat((int) (xvVar.a() >> 32)) - fR2) - jb1Var.R(z42Var.b(jb1Var.getLayoutDirection()))), jb1Var.getLayoutDirection()) + fR2;
                    float f2 = fIntBitsToFloat / 2.0f;
                    float f3 = fA + f2;
                    float f4 = (f3 - f2) - fR;
                    float f5 = f4 < 0.0f ? 0.0f : f4;
                    float f6 = f3 + f2 + fR;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() >> 32));
                    float f7 = f6 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f6;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    float f8 = (-fIntBitsToFloat3) / 2.0f;
                    float f9 = fIntBitsToFloat3 / 2.0f;
                    gn gnVar = xvVar.f;
                    long jR = gnVar.r();
                    gnVar.i().l();
                    try {
                        ((t1) gnVar.a).s(f5, f8, f7, f9, 0);
                        jb1Var.c();
                    } finally {
                        p91.v(gnVar, jR);
                    }
                } else {
                    jb1Var.c();
                }
                return mf3Var;
            case 14:
                Context context2 = (Context) obj4;
                List list3 = (List) obj;
                list3.getClass();
                ((ey1) obj3).setValue(list3);
                gk2.b((ey1) obj2, !list3.isEmpty());
                if (list3.isEmpty()) {
                    Toast.makeText(context2, context2.getString(2131624807), 0).show();
                }
                return mf3Var;
            case a83.e /* 15 */:
                rl2 rl2Var = (rl2) obj4;
                wl2 wl2Var = (wl2) obj2;
                zx1 zx1Var = rl2Var.f;
                if (zx1Var.b(obj3)) {
                    b81.r(obj3, "Key ", " was used multiple times ");
                    return null;
                }
                rl2Var.e.remove(obj3);
                zx1Var.m(obj3, wl2Var);
                return new sh(rl2Var, obj3, wl2Var, i6);
            case 16:
                List list4 = (List) obj4;
                kd1 kd1Var2 = (kd1) obj;
                kd1Var2.getClass();
                kd1Var2.c(list4.size(), new l3(19, new yk1(i3), list4), new u3(list4, 12), new p10(new x3(list4, (lu0) obj3, (lu0) obj2, i6), true, 802480018));
                return mf3Var;
            case 17:
                se2 se2Var3 = (se2) obj2;
                x92 x92Var = (x92) obj;
                if (((xv1) obj4).f(x92Var.c, (yp2) obj3)) {
                    x92Var.a();
                    se2Var3.e = true;
                }
                return mf3Var;
            case 18:
                ve2 ve2Var = (ve2) obj4;
                vz2 vz2Var = (vz2) obj3;
                lu0 lu0Var2 = (lu0) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j8 = ve2Var.e;
                if (j8 == -1) {
                    ve2Var.e = jLongValue;
                    z = false;
                } else {
                    float f10 = (jLongValue - j8) / 1.0E9f;
                    ve2Var.e = jLongValue;
                    wz2 wz2Var = vz2Var.a;
                    if (wz2Var == null) {
                        z = false;
                    } else {
                        float fU = mh0.u(f10, 0.001f, 0.016f);
                        double d = vz2Var.b;
                        double d2 = vz2Var.c;
                        double d3 = vz2Var.d;
                        double d4 = fU;
                        double d5 = (d * (1.0d - (wz2Var.a * d4))) + ((d3 - d2) * wz2Var.b * d4);
                        vz2Var.b = d5;
                        double d6 = (d4 * d5) + d2;
                        vz2Var.c = d6;
                        double d7 = vz2Var.e;
                        if ((d7 >= d3 || d6 <= d3) && ((d7 <= d3 || d6 >= d3) && ((d7 != d3 || Math.signum(vz2Var.f) == Math.signum(vz2Var.c)) && Math.abs(vz2Var.c - vz2Var.d) >= 1.0d))) {
                            z = false;
                        } else {
                            vz2Var.c = vz2Var.d;
                            vz2Var.b = 0.0d;
                            z = true;
                        }
                    }
                    lu0Var2.invoke(Float.valueOf((float) vz2Var.c));
                }
                return Boolean.valueOf(z);
            case 19:
                se2 se2Var4 = (se2) obj4;
                cj cjVar2 = (cj) obj3;
                uy2 uy2Var2 = (uy2) obj2;
                cj cjVar3 = (cj) obj;
                if (se2Var4.e) {
                    Object obj5 = cjVar3.a;
                    int i15 = cjVar3.c;
                    int i16 = cjVar3.b;
                    if ((obj5 instanceof uy2) && i16 == cjVar2.b && i15 == cjVar2.c) {
                        if (uy2Var2 == null) {
                            uy2Var2 = new uy2(0L, 0L, (jr0) null, (hr0) null, (ir0) null, (l43) null, (String) null, 0L, (qq) null, (j83) null, (sh1) null, 0L, (p63) null, (xt2) null, 65535);
                        }
                        cjVar = new cj(i16, i15, uy2Var2);
                    } else {
                        cjVar = cjVar3;
                    }
                } else {
                    cjVar = cjVar3;
                }
                se2Var4.e = cjVar2.equals(cjVar3);
                return cjVar;
            case 20:
                lu0 lu0Var3 = (lu0) obj3;
                p83 p83Var = (p83) ((we2) obj2).e;
                f83 f83VarM = ((d31) obj4).m((List) obj);
                if (p83Var != null) {
                    p83Var.a(null, f83VarM);
                }
                lu0Var3.invoke(f83VarM);
                return mf3Var;
            case 21:
                return g(obj);
            default:
                final x73 x73Var = (x73) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Context context3 = (Context) obj2;
                v53 v53Var = (v53) obj;
                v53Var.a();
                sx1 sx1Var = v53Var.a;
                f63 f63Var = f63.Autofill;
                boolean z2 = (f93.c(x73Var.l().b) || !x73Var.h() || (x73Var.f instanceof j62) || x73Var.h == null) ? false : true;
                qi2 qi2Var = new qi2(i4, coroutineScope, new t73(x73Var, objArr3 == true ? 1 : 0, i7));
                Resources resources = context3.getResources();
                cr2 cr2Var = new cr2(qi2Var, null, 1);
                if (z2) {
                    sx1Var.a(new e63(da0.X, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, cr2Var));
                }
                f63 f63Var2 = f63.Autofill;
                boolean z3 = (f93.c(x73Var.l().b) || (x73Var.f instanceof j62) || x73Var.h == null) ? false : true;
                qi2 qi2Var2 = new qi2(i4, coroutineScope, new t73(x73Var, objArr2 == true ? 1 : 0, i6));
                Resources resources2 = context3.getResources();
                cr2 cr2Var2 = new cr2(qi2Var2, null, 1);
                if (z3) {
                    sx1Var.a(new e63(da0.Y, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, cr2Var2));
                }
                f63 f63Var3 = f63.Autofill;
                boolean z4 = x73Var.h() && ((Boolean) x73Var.x.getValue()).booleanValue() && x73Var.h != null;
                qi2 qi2Var3 = new qi2(i4, coroutineScope, new t73(x73Var, objArr == true ? 1 : 0, i5));
                Resources resources3 = context3.getResources();
                cr2 cr2Var3 = new cr2(qi2Var3, null, 1);
                if (z4) {
                    sx1Var.a(new e63(da0.Z, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, cr2Var3));
                }
                f63 f63Var4 = f63.Autofill;
                boolean z5 = f93.d(x73Var.l().b) != x73Var.l().a.f.length();
                final int i17 = 0;
                au0 au0Var = new au0() { // from class: b83
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i18 = i17;
                        mf3 mf3Var2 = mf3.a;
                        x73 x73Var2 = x73Var;
                        switch (i18) {
                            case 0:
                                return Boolean.valueOf(!x73Var2.B);
                            case 1:
                                f83 f83VarB = x73.b(x73Var2.l().a, g93.a(0, x73Var2.l().a.f.length()));
                                x73Var2.c.invoke(f83VarB);
                                long j9 = f83VarB.b;
                                x73Var2.w = new f93(j9);
                                x73Var2.u = f83.a(x73Var2.u, null, j9, 5);
                                x73Var2.e(true);
                                return mf3Var2;
                            default:
                                au0 au0Var2 = x73Var2.g;
                                if (au0Var2 != null) {
                                    au0Var2.invoke();
                                }
                                return mf3Var2;
                        }
                    }
                };
                au0 au0Var2 = new au0() { // from class: b83
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i18 = i7;
                        mf3 mf3Var2 = mf3.a;
                        x73 x73Var2 = x73Var;
                        switch (i18) {
                            case 0:
                                return Boolean.valueOf(!x73Var2.B);
                            case 1:
                                f83 f83VarB = x73.b(x73Var2.l().a, g93.a(0, x73Var2.l().a.f.length()));
                                x73Var2.c.invoke(f83VarB);
                                long j9 = f83VarB.b;
                                x73Var2.w = new f93(j9);
                                x73Var2.u = f83.a(x73Var2.u, null, j9, 5);
                                x73Var2.e(true);
                                return mf3Var2;
                            default:
                                au0 au0Var3 = x73Var2.g;
                                if (au0Var3 != null) {
                                    au0Var3.invoke();
                                }
                                return mf3Var2;
                        }
                    }
                };
                Resources resources4 = context3.getResources();
                cr2 cr2Var4 = new cr2(au0Var2, au0Var, 1);
                if (z5) {
                    sx1Var.a(new e63(da0.a0, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, cr2Var4));
                }
                f63 f63Var5 = f63.Autofill;
                boolean z6 = x73Var.h() && f93.c(x73Var.l().b);
                au0 au0Var3 = new au0() { // from class: b83
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i18 = i6;
                        mf3 mf3Var2 = mf3.a;
                        x73 x73Var2 = x73Var;
                        switch (i18) {
                            case 0:
                                return Boolean.valueOf(!x73Var2.B);
                            case 1:
                                f83 f83VarB = x73.b(x73Var2.l().a, g93.a(0, x73Var2.l().a.f.length()));
                                x73Var2.c.invoke(f83VarB);
                                long j9 = f83VarB.b;
                                x73Var2.w = new f93(j9);
                                x73Var2.u = f83.a(x73Var2.u, null, j9, 5);
                                x73Var2.e(true);
                                return mf3Var2;
                            default:
                                au0 au0Var4 = x73Var2.g;
                                if (au0Var4 != null) {
                                    au0Var4.invoke();
                                }
                                return mf3Var2;
                        }
                    }
                };
                Resources resources5 = context3.getResources();
                cr2 cr2Var5 = new cr2(au0Var3, null, 1);
                if (z6) {
                    sx1Var.a(new e63(f63Var5.e, resources5.getString(f63Var5.f), f63Var5.g, cr2Var5));
                }
                v53Var.a();
                return mf3Var;
        }
        return Boolean.valueOf(zSign$lambda$29);
    }

    public /* synthetic */ ji1(a60 a60Var, dg3 dg3Var, Job job, uo2 uo2Var) {
        this.e = 4;
        this.f = a60Var;
        this.g = job;
        this.h = uo2Var;
    }

    public /* synthetic */ ji1(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
