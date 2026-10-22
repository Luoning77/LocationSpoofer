package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.vincenthzr.locationspoofer.data.cloud.CloudMapResourceCallFactory;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class q2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ q2(AppState appState, Context context, no1 no1Var, ul1 ul1Var) {
        this.e = 10;
        this.f = appState;
        this.g = context;
        this.i = no1Var;
        this.h = ul1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        LocationRecord locationRecord;
        Object value;
        int i = this.e;
        int i2 = 1;
        mf3 mf3Var = mf3.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                no1 no1Var = (no1) obj4;
                ey1 ey1Var = (ey1) obj;
                ey1 ey1Var2 = (ey1) obj3;
                JSONObject jSONObjectPut = new JSONObject().put("format", "LocationSpooferCloudRecovery").put("version", 1);
                Map map = (Map) ((ey1) obj2).getValue();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    JSONObject jSONObjectPut2 = new JSONObject().put("id", str);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (((Set) ey1Var.getValue()).contains(str + "|" + str2)) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    arrayList.add(jSONObjectPut2.put("entries", new JSONObject(linkedHashMap)));
                }
                ey1Var2.setValue(jSONObjectPut.put("sources", new JSONArray((Collection) arrayList)).toString());
                no1Var.a("LocationSpoofer-backup.json");
                return mf3Var;
            case 1:
                ey1 ey1Var3 = (ey1) obj2;
                ey1Var3.setValue(Boolean.valueOf(!((Boolean) ey1Var3.getValue()).booleanValue()));
                ((ey1) obj).setValue("");
                ((ey1) obj3).setValue("");
                ((ey1) obj4).setValue("");
                return mf3Var;
            case 2:
                l6 l6Var = (l6) obj4;
                ((ey1) obj2).setValue(Boolean.FALSE);
                l6Var.g(new g6(new j(i2, (ay) obj, (Context) obj3), l6Var, null));
                return mf3Var;
            case 3:
                return CloudMapResourceCallFactory.ResourceCall.GuardedBody.guardedSource$lambda$2$lambda$1((Method) obj4, (du) obj2, (Object[]) obj, (CloudMapResourceCallFactory.ResourceCall.GuardedBody) obj3);
            case 4:
                ul1 ul1Var = (ul1) obj4;
                long id = ((LocationRecord) obj3).getId();
                String str3 = (String) ((ey1) obj2).getValue();
                String str4 = (String) ((ey1) obj).getValue();
                ul1Var.getClass();
                str3.getClass();
                str4.getClass();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                AppState appState = (AppState) mutableStateFlow.getValue();
                if (!appState.isSavingCollectionInfo() && (locationRecord = (LocationRecord) zy.o0(appState.getPendingCollectionLocations())) != null && locationRecord.getId() == id) {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, true, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -134217729, 134217727, null)));
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new yl1(ul1Var, id, str3, str4, null, 2), 3, null);
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                ProducerScope producerScope = (ProducerScope) obj4;
                BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new o70(producerScope, (ve2) obj2, (d31) obj, (ArrayList) obj3, (q60) null), 3, null);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                return Boolean.valueOf(FrameworkLocationDelivery.isTarget$lambda$35((JSONObject) obj4, (FrameworkLocationDelivery) obj2, obj, obj3));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return FrameworkLocationDelivery.deliver$lambda$34$lambda$33((FrameworkLocationDelivery) obj4, (List) obj2, obj, obj3);
            case 8:
                return FrameworkLocationDelivery.install$lambda$24$lambda$23((FrameworkLocationDelivery) obj4, obj2, (se2) obj, obj3);
            case mc0.b /* 9 */:
                Float f = (Float) obj4;
                e21 e21Var = (e21) obj2;
                Float f2 = (Float) obj;
                d21 d21Var = (d21) obj3;
                if (!f.equals(e21Var.e) || !f2.equals(e21Var.f)) {
                    e21Var.e = f;
                    e21Var.f = f2;
                    e21Var.h = new h53(d21Var, o51.v0, f, f2, null);
                    e21Var.l.b.setValue(Boolean.TRUE);
                    e21Var.i = false;
                    e21Var.j = true;
                }
                return mf3Var;
            case mc0.c /* 10 */:
                Context context = (Context) obj;
                no1 no1Var2 = (no1) obj4;
                ul1 ul1Var2 = (ul1) obj3;
                boolean fixedJoystickEnabled = ((AppState) obj2).getFixedJoystickEnabled();
                boolean z = !fixedJoystickEnabled;
                if (fixedJoystickEnabled || Settings.canDrawOverlays(context)) {
                    on1.e(ul1Var2, z);
                } else {
                    no1Var2.a(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())));
                }
                return mf3Var;
            default:
                ny2 ny2Var = (ny2) obj3;
                ((ey1) obj2).setValue(Boolean.FALSE);
                gk2.b((ey1) obj, false);
                op0.a((op0) obj4);
                if (ny2Var != null) {
                    ((nb0) ny2Var).a();
                }
                return mf3Var;
        }
    }

    public /* synthetic */ q2(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4) {
        this.e = 1;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
        this.i = ey1Var4;
    }

    public /* synthetic */ q2(Object obj, Object obj2, ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.i = obj;
        this.h = obj2;
        this.f = ey1Var;
        this.g = ey1Var2;
    }

    public /* synthetic */ q2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.i = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
