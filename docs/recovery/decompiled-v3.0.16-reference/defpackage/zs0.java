package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.sharing.LocalSharingConsentStore;
import com.vincenthzr.locationspoofer.data.sync.LocalSyncData;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.GnssNmea;
import com.vincenthzr.locationspoofer.xposed.hooks.GnssSatelliteCatalog;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleReflection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.serialization.json.JsonObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zs0 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ zs0(int i, qd1 qd1Var) {
        this.e = 19;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.e) {
            case 0:
                return FrameworkBleReflection.hierarchy$lambda$0((Class) obj);
            case 1:
                return FrameworkBleReflection.method$lambda$5((Class) obj);
            case 2:
                y0 y0Var = (y0) obj;
                y0Var.getClass();
                return Float.valueOf(y0Var.b);
            case 3:
                y0 y0Var2 = (y0) obj;
                y0Var2.getClass();
                return Float.valueOf(y0Var2.c);
            case 4:
                y0 y0Var3 = (y0) obj;
                y0Var3.getClass();
                return Float.valueOf(y0Var3.d);
            case Logger.WARN /* 5 */:
                synchronized (tx2.c) {
                    List list = tx2.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((lu0) list.get(i)).invoke(obj);
                    }
                }
                return mf3.a;
            case Logger.ERROR /* 6 */:
                return GnssNmea.build$lambda$9$lambda$8((GnssSatelliteCatalog.Signal) obj);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return mf3.a;
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case mc0.b /* 9 */:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case mc0.c /* 10 */:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case mc0.d /* 12 */:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 13:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 14:
                px pxVar = (px) obj;
                pxVar.getClass();
                px.a(pxVar, "JsonPrimitive", new h71(new qe0(16)));
                px.a(pxVar, "JsonNull", new h71(new qe0(17)));
                px.a(pxVar, "JsonLiteral", new h71(new qe0(18)));
                px.a(pxVar, "JsonObject", new h71(new qe0(19)));
                px.a(pxVar, "JsonArray", new h71(new qe0(20)));
                return mf3.a;
            case a83.e /* 15 */:
                return JsonObject.toString$lambda$0((Map.Entry) obj);
            case 16:
                jb1 jb1Var = (jb1) obj;
                jb1Var.getClass();
                jb1Var.c();
                return mf3.a;
            case 17:
                return mf3.a;
            case 18:
                List list2 = (List) obj;
                return new yd1(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 19:
                return mf3.a;
            case 20:
                return mf3.a;
            case 21:
                return mf3.a;
            case 22:
                return mf3.a;
            case 23:
                CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj;
                completeCollectionRoute.getClass();
                return p91.o("collection-route-", completeCollectionRoute.getRoute().getId());
            case 24:
                CompleteLocation completeLocation = (CompleteLocation) obj;
                completeLocation.getClass();
                return Long.valueOf(completeLocation.getLocation().getId());
            case 25:
                return LocalSharingConsentStore.key$lambda$0(((Byte) obj).byteValue());
            case 26:
                return LocalSyncData.json$lambda$0((y61) obj);
            case 27:
                return LocationHooker.startFrameworkConfigReceiver$lambda$45((Exception) obj);
            case 28:
                ((ei) obj).getClass();
                return new g60(pk0.b, lm0.b);
            default:
                ((Long) obj).getClass();
                return mf3.a;
        }
    }

    public /* synthetic */ zs0(int i) {
        this.e = i;
    }
}
