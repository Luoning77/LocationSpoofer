package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.SavedRouteDao_Impl;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yk1 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ yk1(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        Object next;
        String str;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                List<String> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    Iterator it = ml1.w.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            ml1 ml1Var = (ml1) next;
                            if (!o51.f(ml1Var.name(), str2) || ml1Var == ml1.e || ml1Var == ml1.k) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ml1 ml1Var2 = (ml1) next;
                    if (ml1Var2 != null) {
                        arrayList.add(ml1Var2);
                    }
                }
                return arrayList;
            case 1:
                ei eiVar = (ei) obj;
                eiVar.getClass();
                int i2 = 4;
                int i3 = 2;
                if (((Number) eiVar.c()).intValue() > ((Number) eiVar.a()).intValue()) {
                    f80 f80Var = lh0.a;
                    return new g60(kk0.i(new yk1(i2), o51.I(300, 2, f80Var)), kk0.j(new yk1(i3), o51.I(300, 2, f80Var)));
                }
                f80 f80Var2 = lh0.a;
                return new g60(kk0.i(new yk1(3), o51.I(300, 2, f80Var2)), kk0.j(new yk1(i2), o51.I(300, 2, f80Var2)));
            case 2:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 3:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case Logger.WARN /* 5 */:
                y61 y61Var = (y61) obj;
                y61Var.getClass();
                y61Var.c = true;
                y61Var.d = true;
                y61Var.g = true;
                y61Var.a = true;
                return mf3Var;
            case Logger.ERROR /* 6 */:
                y61 y61Var2 = (y61) obj;
                y61Var2.e = true;
                y61Var2.a = true;
                y61Var2.c = true;
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return mf3Var;
            case 8:
                CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj;
                completeCollectionRoute.getClass();
                return p91.o("collection-route-", completeCollectionRoute.getRoute().getId());
            case mc0.b /* 9 */:
                CompleteLocation completeLocation = (CompleteLocation) obj;
                completeLocation.getClass();
                return Long.valueOf(completeLocation.getLocation().getId());
            case mc0.c /* 10 */:
                ((Long) obj).getClass();
                return mf3Var;
            case 11:
                double dDoubleValue = ((Double) obj).doubleValue();
                return Double.valueOf(((sv1.a(dDoubleValue, 0.42d, 0.09d) * 0.55d) + ((sv1.a(dDoubleValue, 0.0d, 0.045d) * 1.0d) - (sv1.a(dDoubleValue, 0.13d, 0.07d) * 0.45d))) - (sv1.a(dDoubleValue, 0.72d, 0.13d) * 0.65d));
            case mc0.d /* 12 */:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                return Double.valueOf(((sv1.a(dDoubleValue2, 0.03d, 0.05d) * (-0.5d)) + (sv1.a(dDoubleValue2, 0.4d, 0.09d) * 0.45d)) - (sv1.a(dDoubleValue2, 0.75d, 0.15d) * 0.15d));
            case 13:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                return Double.valueOf(((sv1.a(dDoubleValue3, 0.16d, 0.09d) * 0.55d) + (sv1.a(dDoubleValue3, 0.0d, 0.035d) * 1.0d)) - (sv1.a(dDoubleValue3, 0.62d, 0.18d) * 0.85d));
            case 14:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                return Double.valueOf((sv1.a(dDoubleValue4, 0.25d, 0.08d) * 0.5d) + (sv1.a(dDoubleValue4, 0.02d, 0.04d) * (-0.6d)));
            case a83.e /* 15 */:
                l52 l52Var = (l52) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(l52Var.b);
                sb.append(", ");
                return az2.o(sb, l52Var.c, ')');
            case 16:
                ye yeVar = ((nz1) obj).a;
                if (yeVar != null) {
                    yeVar.invoke();
                }
                return mf3Var;
            case 17:
                ((Long) obj).getClass();
                return mf3Var;
            case 18:
                return mf3Var;
            case 19:
                l72 l72Var = (l72) obj;
                int i4 = ie.a;
                hh0 hh0Var = AndroidCompositionLocals_androidKt.b;
                l72Var.getClass();
                Context context = (Context) ji2.P(l72Var, hh0Var);
                xb0 xb0Var = (xb0) ji2.P(l72Var, z30.h);
                m42 m42Var = (m42) ji2.P(l72Var, n42.a);
                if (m42Var == null) {
                    return null;
                }
                return new sc(context, xb0Var, m42Var.a, m42Var.b);
            case 20:
                Context context2 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList2 = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i5);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList2.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
                            arrayList2.add(resolveInfo);
                        }
                    }
                }
                return arrayList2;
            case 21:
                r91 r91Var = (r91) obj;
                r91Var.a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                r91Var.a(fValueOf, 300).b = wv1.b;
                r91Var.a(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                r91Var.a(fValueOf2, 1800);
                r91Var.a(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                r91Var.a(fValueOf3, 3300);
                r91Var.a(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                r91Var.a(fValueOf4, 4800);
                r91Var.a(fValueOf4, 6000);
                return mf3Var;
            case 22:
                oc2 oc2Var = oc2.d;
                x81[] x81VarArr = qs2.a;
                rs2 rs2Var = os2.c;
                x81 x81Var = qs2.a[1];
                ((ss2) obj).a(rs2Var, oc2Var);
                return mf3Var;
            case 23:
                AppInfoItem appInfoItem = (AppInfoItem) obj;
                appInfoItem.getClass();
                return appInfoItem.getAppName();
            case 24:
                ((ei) obj).getClass();
                return new g60(pk0.b, lm0.b);
            case 25:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 26:
                return new rl2((Map) obj);
            case 27:
                SavedLocation savedLocation = (SavedLocation) obj;
                savedLocation.getClass();
                return savedLocation.getSyncId();
            case 28:
                SavedLocation savedLocation2 = (SavedLocation) obj;
                savedLocation2.getClass();
                return savedLocation2.getSyncId();
            default:
                return SavedRouteDao_Impl.getAllSavedRoutes$lambda$2("SELECT * FROM saved_routes ORDER BY timestamp DESC", (zk2) obj);
        }
    }
}
