package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ay0 {
    public static final LinkedHashMap a;

    static {
        i52[] i52VarArr = {new i52("SYSTEM_SERVER", am1.F("/data/system/locationspoofer_status.json")), new i52("PHONE", am1.G("/data/user_de/0/com.android.phone/files/locationspoofer_status.json", "/data/user_de/0/com.android.phone/locationspoofer_status.json")), new i52("BLUETOOTH", am1.G("/data/user_de/0/com.android.bluetooth/files/locationspoofer_status.json", "/data/user_de/0/com.android.bluetooth/locationspoofer_status.json"))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(jq1.M(3));
        jq1.P(linkedHashMap, i52VarArr);
        a = linkedHashMap;
    }
}
