package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.vendor.VendorRegistry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class h63 implements au0 {
    public final /* synthetic */ int e;

    public /* synthetic */ h63(int i) {
        this.e = i;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        switch (this.e) {
            case 0:
            case 1:
                return null;
            case 2:
                return ne3.a;
            case 3:
                return new h41(0L);
            case 4:
                return new h41(0L);
            case Logger.WARN /* 5 */:
                return fb0.a;
            case Logger.ERROR /* 6 */:
                return new s93(new q93(0L, v63.c(17), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(17), null, 0L, 0L, 0, v63.e(1.2f, 8589934592L), 16646141), new q93(0L, v63.c(16), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(14), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(17), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(13), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(11), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(17), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(16), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(14), jr0.j, 0L, 0L, 0, 0L, 16777209), new q93(0L, v63.c(32), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(24), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(20), null, 0L, 0L, 0, 0L, 16777213), new q93(0L, v63.c(18), null, 0L, 0L, 0, 0L, 16777213));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return null;
            case 8:
                return new je3();
            case mc0.b /* 9 */:
                return ke0.H(null);
            case mc0.c /* 10 */:
                i43 i43Var = di3.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = yh2.a.iterator();
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        Object objA = l93.a("android.os.Build", "MANUFACTURER");
                        String str2 = objA instanceof String ? (String) objA : null;
                        String str3 = str2 == null ? "" : str2;
                        Object objA2 = l93.a("android.os.Build", "BRAND");
                        String str4 = objA2 instanceof String ? (String) objA2 : null;
                        String str5 = str4 == null ? "" : str4;
                        Object objA3 = l93.a("android.os.Build", "MODEL");
                        String str6 = objA3 instanceof String ? (String) objA3 : null;
                        String str7 = str6 == null ? "" : str6;
                        Object objA4 = l93.a("android.os.Build", "DEVICE");
                        String str8 = objA4 instanceof String ? (String) objA4 : null;
                        String str9 = str8 == null ? "" : str8;
                        Object objA5 = l93.a("android.os.Build$VERSION", "SDK_INT");
                        Integer num = objA5 instanceof Integer ? (Integer) objA5 : null;
                        int iIntValue = num != null ? num.intValue() : 0;
                        Object objA6 = l93.a("android.os.Build$VERSION", "RELEASE");
                        String str10 = objA6 instanceof String ? (String) objA6 : null;
                        return new di3(str3, str5, str7, str9, iIntValue, str10 == null ? "" : str10, linkedHashMap);
                    }
                    String str11 = (String) it.next();
                    try {
                        Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str11);
                        String str12 = objInvoke instanceof String ? (String) objInvoke : null;
                        if (str12 != null) {
                            str = str12;
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    if (!l13.k0(str)) {
                        linkedHashMap.put(str11, str);
                    }
                }
                break;
            case 11:
                return VendorRegistry.active_delegate$lambda$0();
            default:
                return VendorRegistry.additionalExemptPackages_delegate$lambda$7();
        }
    }
}
