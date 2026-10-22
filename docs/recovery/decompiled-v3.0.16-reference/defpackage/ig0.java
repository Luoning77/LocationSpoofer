package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.ExportedSettings;
import com.vincenthzr.locationspoofer.data.db.LocationConnectedWifi;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.db.LocationWithBluetooth;
import com.vincenthzr.locationspoofer.data.db.LocationWithCell;
import com.vincenthzr.locationspoofer.data.db.LocationWithWifi;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ig0 {
    public static x01 a;
    public static x01 b;
    public static x01 c;
    public static x01 d;
    public static x01 e;
    public static x01 f;

    public static zb1 A(ce1 ce1Var, au0 au0Var) {
        u92 u92Var = u92.v;
        int iOrdinal = ce1Var.ordinal();
        if (iOrdinal == 0) {
            return new i43(au0Var);
        }
        if (iOrdinal == 1) {
            hl2 hl2Var = new hl2();
            hl2Var.e = au0Var;
            hl2Var.f = u92Var;
            return hl2Var;
        }
        if (iOrdinal != 2) {
            b81.d();
            return null;
        }
        xf3 xf3Var = new xf3();
        xf3Var.e = au0Var;
        xf3Var.f = u92Var;
        return xf3Var;
    }

    public static i43 B(au0 au0Var) {
        au0Var.getClass();
        return new i43(au0Var);
    }

    public static int C(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        fo.r(p91.n("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:104:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x03df  */
    /* JADX WARN: Code duplicated, block: B:108:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x040e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0413  */
    /* JADX WARN: Code duplicated, block: B:121:0x0441  */
    /* JADX WARN: Code duplicated, block: B:125:0x045b  */
    /* JADX WARN: Code duplicated, block: B:127:0x053e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0543  */
    /* JADX WARN: Code duplicated, block: B:131:0x0552  */
    /* JADX WARN: Code duplicated, block: B:132:0x0557  */
    /* JADX WARN: Code duplicated, block: B:136:0x0565 A[LOOP:8: B:135:0x0563->B:136:0x0565, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x058b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0593  */
    /* JADX WARN: Code duplicated, block: B:145:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:147:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x0627  */
    /* JADX WARN: Code duplicated, block: B:169:0x0641  */
    /* JADX WARN: Code duplicated, block: B:177:0x06b6 A[LOOP:12: B:176:0x06b4->B:177:0x06b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x023e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0246  */
    /* JADX WARN: Code duplicated, block: B:68:0x0256  */
    /* JADX WARN: Code duplicated, block: B:70:0x026e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0279  */
    /* JADX WARN: Code duplicated, block: B:74:0x027e  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:78:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x02ea A[LOOP:4: B:84:0x02e4->B:86:0x02ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0370  */
    /* JADX WARN: Code duplicated, block: B:89:0x0372  */
    /* JADX WARN: Code duplicated, block: B:92:0x037f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0382  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b0  */
    public static final md3 D(ul1 ul1Var, List list, double d2, double d3) throws JSONException {
        LocationWithWifi locationWithWifi;
        CompleteLocation completeLocation;
        JSONObject jSONObject;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        int i;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        Iterator it;
        boolean z;
        Object obj;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        int i2;
        String selectedCellKey;
        JSONArray jSONArray2;
        ArrayList arrayList;
        Iterator it2;
        int size;
        int i3;
        LinkedHashMap linkedHashMap7;
        LinkedHashMap linkedHashMap8;
        LinkedHashMap linkedHashMap9;
        Iterator it3;
        int i4;
        String selectedBluetoothAddress;
        JSONArray jSONArray3;
        ArrayList arrayList2;
        int i5;
        int size2;
        JSONObject jSONObject3;
        LocationRecord location;
        Object next;
        int i6;
        String address;
        Double d4;
        double dDoubleValue;
        Double d5;
        double dDoubleValue2;
        String str;
        LocationWithCell locationWithCell;
        JSONObject jSONObject4;
        boolean zIsRegistered;
        LocationRecord location2;
        int i7;
        String cellKey;
        Double d6;
        double dDoubleValue3;
        Double d7;
        double dDoubleValue4;
        int i8;
        String bssid;
        Double d8;
        double dDoubleValue5;
        Double d9;
        double dDoubleValue6;
        Object next2;
        LocationRecord location3;
        double d10;
        ul1Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return new md3("{}", "[]", "[]");
        }
        ArrayList arrayList3 = new ArrayList(az.Y(list, 10));
        int i9 = 0;
        for (Object obj2 : list) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                am1.X();
                throw null;
            }
            CompleteLocation completeLocation2 = (CompleteLocation) obj2;
            if (i9 == 0) {
                long id = completeLocation2.getLocation().getId();
                Long l = ul1Var.E;
                if ((l != null && id == l.longValue()) || completeLocation2.getLocation().getSelectedWifiBssid() != null) {
                    d10 = 1000.0d;
                }
                arrayList3.add(Double.valueOf(d10));
                i9 = i10;
            }
            double radians = Math.toRadians(completeLocation2.getLocation().getLat() - d2);
            double radians2 = Math.toRadians(completeLocation2.getLocation().getLng() - d3);
            double dSin = Math.sin(radians / 2.0d);
            double dCos = Math.cos(Math.toRadians(completeLocation2.getLocation().getLat())) * Math.cos(Math.toRadians(d2));
            double dSin2 = Math.sin(radians2 / 2.0d);
            double d11 = (dSin2 * dSin2 * dCos) + (dSin * dSin);
            double dMax = Math.max(Math.atan2(Math.sqrt(d11), Math.sqrt(1.0d - d11)) * 1.2756274E7d, 1.0d);
            d10 = 1.0d / (dMax * dMax);
            arrayList3.add(Double.valueOf(d10));
            i9 = i10;
        }
        CompleteLocation completeLocation3 = (CompleteLocation) zy.o0(list);
        String selectedWifiBssid = (completeLocation3 == null || (location3 = completeLocation3.getLocation()) == null) ? null : location3.getSelectedWifiBssid();
        if (selectedWifiBssid == null || selectedWifiBssid.equals("__NONE__")) {
            locationWithWifi = null;
        } else {
            Iterator<T> it4 = completeLocation3.getWifis().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!s13.T(((LocationWithWifi) next2).getDevice().getBssid(), selectedWifiBssid));
            locationWithWifi = (LocationWithWifi) next2;
        }
        LocationConnectedWifi connectedWifi = completeLocation3 != null ? completeLocation3.getConnectedWifi() : null;
        if (!o51.f(selectedWifiBssid, "__NONE__")) {
            completeLocation = completeLocation3;
            if (locationWithWifi != null) {
                jSONObject = new JSONObject();
                jSONObject.put("ssid", locationWithWifi.getDevice().getSsid());
                jSONObject.put("bssid", locationWithWifi.getDevice().getBssid());
                jSONObject.put("vendor", locationWithWifi.getDevice().getVendor());
                jSONObject.put("macAddress", locationWithWifi.getDevice().getBssid());
                jSONObject.put("frequency", locationWithWifi.getDevice().getFrequency());
                Map map = ok1.a;
                jSONObject.put("channel", ok1.a(locationWithWifi.getDevice().getFrequency()));
                jSONObject.put("linkSpeed", 65);
                jSONObject.put("level", locationWithWifi.getLocationWifi().getLevel());
                jSONObject.put("capabilities", locationWithWifi.getDevice().getCapabilities());
                jSONObject.put("networkId", 1);
                jSONObject.put("wifiStandard", 6);
            } else if (connectedWifi != null && (selectedWifiBssid == null || selectedWifiBssid.equalsIgnoreCase(connectedWifi.getBssid()))) {
                jSONObject = new JSONObject();
                jSONObject.put("ssid", connectedWifi.getSsid());
                jSONObject.put("bssid", connectedWifi.getBssid());
                jSONObject.put("vendor", connectedWifi.getVendor());
                jSONObject.put("macAddress", connectedWifi.getMacAddress());
                jSONObject.put("frequency", connectedWifi.getFrequency());
                Map map2 = ok1.a;
                jSONObject.put("channel", ok1.a(connectedWifi.getFrequency()));
                jSONObject.put("linkSpeed", connectedWifi.getLinkSpeed());
                jSONObject.put("level", connectedWifi.getLevel());
                jSONObject.put("capabilities", connectedWifi.getCapabilities());
                jSONObject.put("networkId", connectedWifi.getNetworkId());
                jSONObject.put("wifiStandard", connectedWifi.getWifiStandard());
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap3 = new LinkedHashMap();
            i = 0;
            for (Object obj3 : list) {
                i8 = i + 1;
                if (i >= 0) {
                    am1.X();
                    throw null;
                }
                for (LocationWithWifi locationWithWifi2 : ((CompleteLocation) obj3).getWifis()) {
                    JSONObject jSONObject5 = jSONObject;
                    bssid = locationWithWifi2.getDevice().getBssid();
                    if (!linkedHashMap.containsKey(bssid)) {
                        linkedHashMap.put(bssid, locationWithWifi2);
                    }
                    d8 = (Double) linkedHashMap2.get(bssid);
                    if (d8 != null) {
                        dDoubleValue5 = d8.doubleValue();
                    } else {
                        dDoubleValue5 = 0.0d;
                    }
                    LinkedHashMap linkedHashMap10 = linkedHashMap;
                    linkedHashMap2.put(bssid, Double.valueOf((((Number) arrayList3.get(i)).doubleValue() * ((double) locationWithWifi2.getLocationWifi().getLevel())) + dDoubleValue5));
                    d9 = (Double) linkedHashMap3.get(bssid);
                    if (d9 != null) {
                        dDoubleValue6 = d9.doubleValue();
                    } else {
                        dDoubleValue6 = 0.0d;
                    }
                    linkedHashMap3.put(bssid, Double.valueOf(((Number) arrayList3.get(i)).doubleValue() + dDoubleValue6));
                    jSONObject = jSONObject5;
                    linkedHashMap = linkedHashMap10;
                }
                i = i8;
            }
            LinkedHashMap linkedHashMap11 = linkedHashMap;
            jSONObject2 = jSONObject;
            jSONArray = new JSONArray();
            it = linkedHashMap11.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                LocationWithWifi locationWithWifi3 = (LocationWithWifi) entry.getValue();
                Object obj4 = linkedHashMap3.get(str2);
                obj4.getClass();
                double dDoubleValue7 = ((Number) obj4).doubleValue();
                Object obj5 = linkedHashMap2.get(str2);
                obj5.getClass();
                Iterator it5 = it;
                LinkedHashMap linkedHashMap12 = linkedHashMap2;
                int iDoubleValue = (int) (((Number) obj5).doubleValue() / dDoubleValue7);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("bssid", str2);
                jSONObject6.put("ssid", locationWithWifi3.getDevice().getSsid());
                jSONObject6.put("vendor", locationWithWifi3.getDevice().getVendor());
                jSONObject6.put("frequency", locationWithWifi3.getDevice().getFrequency());
                Map map3 = ok1.a;
                jSONObject6.put("channel", ok1.a(locationWithWifi3.getDevice().getFrequency()));
                jSONObject6.put("capabilities", locationWithWifi3.getDevice().getCapabilities());
                jSONObject6.put("level", iDoubleValue);
                jSONArray.put(jSONObject6);
                linkedHashMap2 = linkedHashMap12;
                it = it5;
            }
            if (jSONObject2 != null) {
                z = true;
            } else {
                z = false;
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("isConnected", z);
            if (jSONObject2 == null) {
                obj = JSONObject.NULL;
            } else {
                obj = jSONObject2;
            }
            jSONObject7.put("connectedWifi", obj);
            jSONObject7.put("nearbyWifi", jSONArray);
            linkedHashMap4 = new LinkedHashMap();
            linkedHashMap5 = new LinkedHashMap();
            linkedHashMap6 = new LinkedHashMap();
            i2 = 0;
            for (Object obj6 : list) {
                i7 = i2 + 1;
                if (i2 >= 0) {
                    am1.X();
                    throw null;
                }
                for (LocationWithCell locationWithCell2 : ((CompleteLocation) obj6).getCells()) {
                    cellKey = locationWithCell2.getDevice().getCellKey();
                    if (!linkedHashMap4.containsKey(cellKey)) {
                        linkedHashMap4.put(cellKey, locationWithCell2);
                    }
                    d6 = (Double) linkedHashMap5.get(cellKey);
                    if (d6 != null) {
                        dDoubleValue3 = d6.doubleValue();
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    int i11 = i7;
                    linkedHashMap5.put(cellKey, Double.valueOf((((Number) arrayList3.get(i2)).doubleValue() * ((double) locationWithCell2.getLocationCell().getDbm())) + dDoubleValue3));
                    d7 = (Double) linkedHashMap6.get(cellKey);
                    if (d7 != null) {
                        dDoubleValue4 = d7.doubleValue();
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    linkedHashMap6.put(cellKey, Double.valueOf(((Number) arrayList3.get(i2)).doubleValue() + dDoubleValue4));
                    i7 = i11;
                }
                i2 = i7;
            }
            if (completeLocation != null || (location2 = completeLocation.getLocation()) == null) {
                selectedCellKey = null;
            } else {
                selectedCellKey = location2.getSelectedCellKey();
            }
            jSONArray2 = new JSONArray();
            arrayList = new ArrayList();
            it2 = linkedHashMap4.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                str = (String) entry2.getKey();
                locationWithCell = (LocationWithCell) entry2.getValue();
                Object obj7 = linkedHashMap6.get(str);
                obj7.getClass();
                double dDoubleValue8 = ((Number) obj7).doubleValue();
                Object obj8 = linkedHashMap5.get(str);
                obj8.getClass();
                int iDoubleValue2 = (int) (((Number) obj8).doubleValue() / dDoubleValue8);
                jSONObject4 = new JSONObject();
                jSONObject4.put("type", locationWithCell.getDevice().getType());
                jSONObject4.put("mcc", locationWithCell.getDevice().getMcc());
                jSONObject4.put("mnc", locationWithCell.getDevice().getMnc());
                jSONObject4.put("tac", locationWithCell.getDevice().getTac());
                jSONObject4.put("ci", locationWithCell.getDevice().getCi());
                jSONObject4.put("pci", locationWithCell.getDevice().getPci());
                jSONObject4.put("lac", locationWithCell.getDevice().getLac());
                jSONObject4.put("cid", locationWithCell.getDevice().getCid());
                jSONObject4.put("psc", locationWithCell.getDevice().getPsc());
                Iterator it6 = it2;
                jSONObject4.put("nci", locationWithCell.getDevice().getNci());
                jSONObject4.put("networkId", locationWithCell.getDevice().getNetworkId());
                jSONObject4.put("systemId", locationWithCell.getDevice().getSystemId());
                jSONObject4.put("basestationId", locationWithCell.getDevice().getBasestationId());
                jSONObject4.put("dbm", iDoubleValue2);
                if (selectedCellKey != null) {
                    zIsRegistered = s13.T(str, selectedCellKey);
                } else {
                    zIsRegistered = locationWithCell.getLocationCell().isRegistered();
                }
                jSONObject4.put("isRegistered", zIsRegistered);
                if (zIsRegistered) {
                    arrayList.add(0, jSONObject4);
                } else {
                    arrayList.add(jSONObject4);
                }
                it2 = it6;
            }
            size = arrayList.size();
            i3 = 0;
            while (i3 < size) {
                Object obj9 = arrayList.get(i3);
                i3++;
                jSONArray2.put((JSONObject) obj9);
            }
            linkedHashMap7 = new LinkedHashMap();
            linkedHashMap8 = new LinkedHashMap();
            linkedHashMap9 = new LinkedHashMap();
            it3 = list.iterator();
            i4 = 0;
            while (it3.hasNext()) {
                next = it3.next();
                i6 = i4 + 1;
                if (i4 >= 0) {
                    am1.X();
                    throw null;
                }
                for (LocationWithBluetooth locationWithBluetooth : ((CompleteLocation) next).getBluetooths()) {
                    address = locationWithBluetooth.getDevice().getAddress();
                    if (!linkedHashMap7.containsKey(address)) {
                        linkedHashMap7.put(address, locationWithBluetooth);
                    }
                    d4 = (Double) linkedHashMap8.get(address);
                    if (d4 != null) {
                        dDoubleValue = d4.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    Iterator it7 = it3;
                    JSONArray jSONArray4 = jSONArray2;
                    linkedHashMap8.put(address, Double.valueOf((((Number) arrayList3.get(i4)).doubleValue() * ((double) locationWithBluetooth.getLocationBluetooth().getRssi())) + dDoubleValue));
                    d5 = (Double) linkedHashMap9.get(address);
                    if (d5 != null) {
                        dDoubleValue2 = d5.doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    linkedHashMap9.put(address, Double.valueOf(((Number) arrayList3.get(i4)).doubleValue() + dDoubleValue2));
                    it3 = it7;
                    jSONArray2 = jSONArray4;
                }
                i4 = i6;
            }
            JSONArray jSONArray5 = jSONArray2;
            if (completeLocation != null || (location = completeLocation.getLocation()) == null) {
                selectedBluetoothAddress = null;
            } else {
                selectedBluetoothAddress = location.getSelectedBluetoothAddress();
            }
            jSONArray3 = new JSONArray();
            arrayList2 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap7.entrySet()) {
                String str3 = (String) entry3.getKey();
                LocationWithBluetooth locationWithBluetooth2 = (LocationWithBluetooth) entry3.getValue();
                Object obj10 = linkedHashMap9.get(str3);
                obj10.getClass();
                double dDoubleValue9 = ((Number) obj10).doubleValue();
                Object obj11 = linkedHashMap8.get(str3);
                obj11.getClass();
                int iDoubleValue3 = (int) (((Number) obj11).doubleValue() / dDoubleValue9);
                jSONObject3 = new JSONObject();
                jSONObject3.put("address", str3);
                jSONObject3.put("name", locationWithBluetooth2.getDevice().getName());
                jSONObject3.put("scanRecordHex", locationWithBluetooth2.getDevice().getScanRecordHex());
                jSONObject3.put("rssi", iDoubleValue3);
                if (selectedBluetoothAddress == null && selectedBluetoothAddress.equalsIgnoreCase(str3)) {
                    jSONObject3.put("isConnected", true);
                    arrayList2.add(0, jSONObject3);
                } else {
                    arrayList2.add(jSONObject3);
                }
            }
            i5 = 0;
            size2 = arrayList2.size();
            while (i5 < size2) {
                Object obj12 = arrayList2.get(i5);
                i5++;
                jSONArray3.put((JSONObject) obj12);
            }
            return new md3(jSONObject7.toString(), jSONArray5.toString(), jSONArray3.toString());
        }
        completeLocation = completeLocation3;
        jSONObject = null;
        linkedHashMap = new LinkedHashMap();
        linkedHashMap2 = new LinkedHashMap();
        linkedHashMap3 = new LinkedHashMap();
        i = 0;
        while (r7.hasNext()) {
            i8 = i + 1;
            if (i >= 0) {
                am1.X();
                throw null;
            }
            while (r17.hasNext()) {
                JSONObject jSONObject8 = jSONObject;
                bssid = locationWithWifi2.getDevice().getBssid();
                if (!linkedHashMap.containsKey(bssid)) {
                    linkedHashMap.put(bssid, locationWithWifi2);
                }
                d8 = (Double) linkedHashMap2.get(bssid);
                if (d8 != null) {
                    dDoubleValue5 = d8.doubleValue();
                } else {
                    dDoubleValue5 = 0.0d;
                }
                LinkedHashMap linkedHashMap13 = linkedHashMap;
                linkedHashMap2.put(bssid, Double.valueOf((((Number) arrayList3.get(i)).doubleValue() * ((double) locationWithWifi2.getLocationWifi().getLevel())) + dDoubleValue5));
                d9 = (Double) linkedHashMap3.get(bssid);
                if (d9 != null) {
                    dDoubleValue6 = d9.doubleValue();
                } else {
                    dDoubleValue6 = 0.0d;
                }
                linkedHashMap3.put(bssid, Double.valueOf(((Number) arrayList3.get(i)).doubleValue() + dDoubleValue6));
                jSONObject = jSONObject8;
                linkedHashMap = linkedHashMap13;
            }
            i = i8;
        }
        LinkedHashMap linkedHashMap14 = linkedHashMap;
        jSONObject2 = jSONObject;
        jSONArray = new JSONArray();
        it = linkedHashMap14.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it.next();
            String str4 = (String) entry4.getKey();
            LocationWithWifi locationWithWifi4 = (LocationWithWifi) entry4.getValue();
            Object obj13 = linkedHashMap3.get(str4);
            obj13.getClass();
            double dDoubleValue10 = ((Number) obj13).doubleValue();
            Object obj14 = linkedHashMap2.get(str4);
            obj14.getClass();
            Iterator it8 = it;
            LinkedHashMap linkedHashMap15 = linkedHashMap2;
            int iDoubleValue4 = (int) (((Number) obj14).doubleValue() / dDoubleValue10);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("bssid", str4);
            jSONObject9.put("ssid", locationWithWifi4.getDevice().getSsid());
            jSONObject9.put("vendor", locationWithWifi4.getDevice().getVendor());
            jSONObject9.put("frequency", locationWithWifi4.getDevice().getFrequency());
            Map map4 = ok1.a;
            jSONObject9.put("channel", ok1.a(locationWithWifi4.getDevice().getFrequency()));
            jSONObject9.put("capabilities", locationWithWifi4.getDevice().getCapabilities());
            jSONObject9.put("level", iDoubleValue4);
            jSONArray.put(jSONObject9);
            linkedHashMap2 = linkedHashMap15;
            it = it8;
        }
        if (jSONObject2 != null) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put("isConnected", z);
        if (jSONObject2 == null) {
            obj = JSONObject.NULL;
        } else {
            obj = jSONObject2;
        }
        jSONObject10.put("connectedWifi", obj);
        jSONObject10.put("nearbyWifi", jSONArray);
        linkedHashMap4 = new LinkedHashMap();
        linkedHashMap5 = new LinkedHashMap();
        linkedHashMap6 = new LinkedHashMap();
        i2 = 0;
        while (r6.hasNext()) {
            i7 = i2 + 1;
            if (i2 >= 0) {
                am1.X();
                throw null;
            }
            while (r8.hasNext()) {
                cellKey = locationWithCell2.getDevice().getCellKey();
                if (!linkedHashMap4.containsKey(cellKey)) {
                    linkedHashMap4.put(cellKey, locationWithCell2);
                }
                d6 = (Double) linkedHashMap5.get(cellKey);
                if (d6 != null) {
                    dDoubleValue3 = d6.doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                int i12 = i7;
                linkedHashMap5.put(cellKey, Double.valueOf((((Number) arrayList3.get(i2)).doubleValue() * ((double) locationWithCell2.getLocationCell().getDbm())) + dDoubleValue3));
                d7 = (Double) linkedHashMap6.get(cellKey);
                if (d7 != null) {
                    dDoubleValue4 = d7.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                linkedHashMap6.put(cellKey, Double.valueOf(((Number) arrayList3.get(i2)).doubleValue() + dDoubleValue4));
                i7 = i12;
            }
            i2 = i7;
        }
        if (completeLocation != null) {
            selectedCellKey = null;
        } else {
            selectedCellKey = null;
        }
        jSONArray2 = new JSONArray();
        arrayList = new ArrayList();
        it2 = linkedHashMap4.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry5 = (Map.Entry) it2.next();
            str = (String) entry5.getKey();
            locationWithCell = (LocationWithCell) entry5.getValue();
            Object obj15 = linkedHashMap6.get(str);
            obj15.getClass();
            double dDoubleValue11 = ((Number) obj15).doubleValue();
            Object obj16 = linkedHashMap5.get(str);
            obj16.getClass();
            int iDoubleValue5 = (int) (((Number) obj16).doubleValue() / dDoubleValue11);
            jSONObject4 = new JSONObject();
            jSONObject4.put("type", locationWithCell.getDevice().getType());
            jSONObject4.put("mcc", locationWithCell.getDevice().getMcc());
            jSONObject4.put("mnc", locationWithCell.getDevice().getMnc());
            jSONObject4.put("tac", locationWithCell.getDevice().getTac());
            jSONObject4.put("ci", locationWithCell.getDevice().getCi());
            jSONObject4.put("pci", locationWithCell.getDevice().getPci());
            jSONObject4.put("lac", locationWithCell.getDevice().getLac());
            jSONObject4.put("cid", locationWithCell.getDevice().getCid());
            jSONObject4.put("psc", locationWithCell.getDevice().getPsc());
            Iterator it9 = it2;
            jSONObject4.put("nci", locationWithCell.getDevice().getNci());
            jSONObject4.put("networkId", locationWithCell.getDevice().getNetworkId());
            jSONObject4.put("systemId", locationWithCell.getDevice().getSystemId());
            jSONObject4.put("basestationId", locationWithCell.getDevice().getBasestationId());
            jSONObject4.put("dbm", iDoubleValue5);
            if (selectedCellKey != null) {
                zIsRegistered = s13.T(str, selectedCellKey);
            } else {
                zIsRegistered = locationWithCell.getLocationCell().isRegistered();
            }
            jSONObject4.put("isRegistered", zIsRegistered);
            if (zIsRegistered) {
                arrayList.add(0, jSONObject4);
            } else {
                arrayList.add(jSONObject4);
            }
            it2 = it9;
        }
        size = arrayList.size();
        i3 = 0;
        while (i3 < size) {
            Object obj17 = arrayList.get(i3);
            i3++;
            jSONArray2.put((JSONObject) obj17);
        }
        linkedHashMap7 = new LinkedHashMap();
        linkedHashMap8 = new LinkedHashMap();
        linkedHashMap9 = new LinkedHashMap();
        it3 = list.iterator();
        i4 = 0;
        while (it3.hasNext()) {
            next = it3.next();
            i6 = i4 + 1;
            if (i4 >= 0) {
                am1.X();
                throw null;
            }
            while (r9.hasNext()) {
                address = locationWithBluetooth.getDevice().getAddress();
                if (!linkedHashMap7.containsKey(address)) {
                    linkedHashMap7.put(address, locationWithBluetooth);
                }
                d4 = (Double) linkedHashMap8.get(address);
                if (d4 != null) {
                    dDoubleValue = d4.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                Iterator it10 = it3;
                JSONArray jSONArray6 = jSONArray2;
                linkedHashMap8.put(address, Double.valueOf((((Number) arrayList3.get(i4)).doubleValue() * ((double) locationWithBluetooth.getLocationBluetooth().getRssi())) + dDoubleValue));
                d5 = (Double) linkedHashMap9.get(address);
                if (d5 != null) {
                    dDoubleValue2 = d5.doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                linkedHashMap9.put(address, Double.valueOf(((Number) arrayList3.get(i4)).doubleValue() + dDoubleValue2));
                it3 = it10;
                jSONArray2 = jSONArray6;
            }
            i4 = i6;
        }
        JSONArray jSONArray7 = jSONArray2;
        if (completeLocation != null) {
            selectedBluetoothAddress = null;
        } else {
            selectedBluetoothAddress = null;
        }
        jSONArray3 = new JSONArray();
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            String str5 = (String) entry3.getKey();
            LocationWithBluetooth locationWithBluetooth3 = (LocationWithBluetooth) entry3.getValue();
            Object obj18 = linkedHashMap9.get(str5);
            obj18.getClass();
            double dDoubleValue12 = ((Number) obj18).doubleValue();
            Object obj19 = linkedHashMap8.get(str5);
            obj19.getClass();
            int iDoubleValue6 = (int) (((Number) obj19).doubleValue() / dDoubleValue12);
            jSONObject3 = new JSONObject();
            jSONObject3.put("address", str5);
            jSONObject3.put("name", locationWithBluetooth3.getDevice().getName());
            jSONObject3.put("scanRecordHex", locationWithBluetooth3.getDevice().getScanRecordHex());
            jSONObject3.put("rssi", iDoubleValue6);
            if (selectedBluetoothAddress == null) {
            }
            arrayList2.add(jSONObject3);
        }
        i5 = 0;
        size2 = arrayList2.size();
        while (i5 < size2) {
            Object obj110 = arrayList2.get(i5);
            i5++;
            jSONArray3.put((JSONObject) obj110);
        }
        return new md3(jSONObject10.toString(), jSONArray7.toString(), jSONArray3.toString());
    }

    public static fr1 E(hk2 hk2Var, int i, int i2, int i3, int i4, int i5, gr1 gr1Var, List list, h82[] h82VarArr, int i6) {
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        while (i11 < i6) {
            zq1 zq1Var = (zq1) list2.get(i11);
            float fD = ke0.D(ke0.z(zq1Var));
            if (fD > 0.0f) {
                f3 += fD;
                i12++;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                h82 h82VarS = h82VarArr[i11];
                if (h82VarS == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    h82VarS = zq1Var.s(hk2Var.e(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                h82 h82Var = h82VarS;
                int i15 = hk2Var.i(h82Var);
                int iF = hk2Var.f(h82Var);
                iArr[i8] = i15;
                int i16 = i14 - i15;
                if (i16 < 0) {
                    i16 = 0;
                }
                iMin = Math.min(i5, i16);
                i13 += i15 + iMin;
                iMax = Math.max(iMax, iF);
                h82VarArr[i8] = h82Var;
                i12 = i9;
            }
            i11 = i8 + 1;
            j = j;
        }
        long j2 = j;
        int i17 = i12;
        if (i17 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j3 = ((long) (i17 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i18 = 0; i18 < i6; i18++) {
                jRound -= (long) Math.round(ke0.D(ke0.z((zq1) list2.get(i18))) * f4);
            }
            int i19 = iMax;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i6) {
                if (h82VarArr[i20] == null) {
                    zq1 zq1Var2 = (zq1) list2.get(i20);
                    ik2 ik2VarZ = ke0.z(zq1Var2);
                    float fD2 = ke0.D(ik2VarZ);
                    if (fD2 <= 0.0f) {
                        n21.b("All weights <= 0 should have placeables");
                    }
                    f2 = f4;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fD2 * f2) + iSignum);
                    h82 h82VarS2 = zq1Var2.s(hk2Var.e((!(ik2VarZ != null ? ik2VarZ.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int i22 = hk2Var.i(h82VarS2);
                    int iF2 = hk2Var.f(h82VarS2);
                    iArr[i20] = i22;
                    i21 += i22;
                    int iMax3 = Math.max(i19, iF2);
                    h82VarArr[i20] = h82VarS2;
                    i19 = iMax3;
                } else {
                    f2 = f4;
                }
                i20++;
                list2 = list;
                f4 = f2;
            }
            i7 = (int) (((long) i21) + j3);
            int i23 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i23) {
                i7 = i23;
            }
            iMax = i19;
        }
        int i24 = i7 + i13;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax4 = Math.max(i24, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        hk2Var.c(iMax4, gr1Var, iArr, iArr2);
        return hk2Var.a(h82VarArr, gr1Var, iArr2, iMax4, iMax5);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:180:0x043b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0440  */
    /* JADX WARN: Code duplicated, block: B:186:0x045c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x045e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0467  */
    /* JADX WARN: Code duplicated, block: B:194:0x0482 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x0484  */
    /* JADX WARN: Code duplicated, block: B:196:0x048c  */
    /* JADX WARN: Code duplicated, block: B:199:0x049c  */
    /* JADX WARN: Code duplicated, block: B:200:0x049f  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    public static final f52 F(int i, f30 f30Var) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        int i2;
        long jC;
        int i3;
        XmlResourceParser xmlResourceParser;
        char c2;
        int i4;
        TypedArray typedArrayObtainStyledAttributes;
        int i5;
        int i6;
        TypedArray typedArrayObtainStyledAttributes2;
        int i7;
        int i8;
        int i9;
        int i10;
        Shader shader;
        int i11;
        st qy2Var;
        Shader shader2;
        int i12;
        st qy2Var2;
        int i13;
        ColorStateList colorStateListA;
        ov0 ov0Var = (ov0) f30Var;
        Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) ov0Var.j(AndroidCompositionLocals_androidKt.c);
        ig2 ig2Var = (ig2) ov0Var.j(AndroidCompositionLocals_androidKt.e);
        synchronized (ig2Var) {
            typedValue = (TypedValue) ig2Var.a.b(i);
            i2 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                gx1 gx1Var = ig2Var.a;
                int iD = gx1Var.d(i);
                Object[] objArr = gx1Var.c;
                Object obj = objArr[iD];
                gx1Var.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !l13.f0(charSequence, ".xml")) {
            ov0Var.c0(-1771643000);
            boolean zF = ov0Var.f(context.getTheme()) | ov0Var.f(charSequence) | ov0Var.d(i);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objQ = new td(((BitmapDrawable) drawable).getBitmap());
                    ov0Var.m0(objQ);
                } catch (Exception e2) {
                    throw new iv("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            td tdVar = (td) objQ;
            qr qrVar = new qr(tdVar, (((long) tdVar.a.getHeight()) & 4294967295L) | (((long) tdVar.a.getWidth()) << 32));
            ov0Var.p(false);
            return qrVar;
        }
        ov0Var.c0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i14 = typedValue.changingConfigurations;
        a11 a11Var = (a11) ov0Var.j(AndroidCompositionLocals_androidKt.d);
        z01 z01Var = new z01(theme, i);
        WeakReference weakReference = (WeakReference) a11Var.a.get(z01Var);
        y01 y01Var = weakReference != null ? (y01) weakReference.get() : null;
        if (y01Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!o51.f(xml.getName(), "vector")) {
                fo.i("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            ug ugVar = new ug(xml);
            int[] iArr = am1.a;
            TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
            ugVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
            ugVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            float fB = ugVar.b(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
            float fB2 = ugVar.b(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
            if (fB <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fB2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
            ugVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
            ugVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (typedArrayObtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = hz.g;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue3);
                        int i15 = typedValue3.type;
                        if (i15 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i15 < 28 || i15 > 31) {
                            Resources resources2 = typedArrayObtainAttributes.getResources();
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = rz.a;
                            try {
                                colorStateListA = rz.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e3) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    ugVar.c(typedArrayObtainAttributes.getChangingConfigurations());
                    jC = colorStateListA != null ? xp1.c(colorStateListA.getDefaultColor()) : hz.g;
                }
            } else {
                jC = hz.g;
            }
            long j = jC;
            int i16 = typedArrayObtainAttributes.getInt(6, -1);
            ugVar.c(typedArrayObtainAttributes.getChangingConfigurations());
            if (i16 == -1) {
                i3 = 5;
            } else if (i16 == 3) {
                i3 = 3;
            } else if (i16 == 5) {
                i3 = 5;
            } else if (i16 != 9) {
                switch (i16) {
                    case 14:
                        i3 = 13;
                        break;
                    case a83.e /* 15 */:
                        i3 = 14;
                        break;
                    case 16:
                        i3 = 12;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
            } else {
                i3 = 9;
            }
            float f2 = dimension / resources.getDisplayMetrics().density;
            float f3 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayObtainAttributes.recycle();
            w01 w01Var = new w01(null, f2, f3, fB, fB2, j, i3, z, 1);
            int i17 = 0;
            for (int i18 = 3; xml.getEventType() != i2 && (xml.getDepth() >= i2 || xml.getEventType() != i18); i18 = 3) {
                List listA = uj0.e;
                XmlPullParser xmlPullParser = ugVar.a;
                int i19 = i2;
                k8 k8Var = ugVar.c;
                int eventType = xmlPullParser.getEventType();
                int i20 = i14;
                if (eventType != 2) {
                    if (eventType == i18 && "group".equals(xmlPullParser.getName())) {
                        int i21 = i17 + 1;
                        for (int i22 = 0; i22 < i21; i22++) {
                            ArrayList arrayList = w01Var.i;
                            if (w01Var.k) {
                                p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            v01 v01Var = (v01) arrayList.remove(arrayList.size() - 1);
                            ((v01) arrayList.get(arrayList.size() - 1)).j.add(new mh3(v01Var.a, v01Var.b, v01Var.c, v01Var.d, v01Var.e, v01Var.f, v01Var.g, v01Var.h, v01Var.i, v01Var.j));
                        }
                        z01Var = z01Var;
                        xmlResourceParser = xml;
                        i5 = i19;
                        i17 = 0;
                    }
                    c2 = '\t';
                    xmlResourceParser.next();
                    i2 = i5;
                    z01Var = z01Var;
                    i14 = i20;
                    xml = xmlResourceParser;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            xmlResourceParser = xml;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    int[] iArr2 = am1.b;
                                    TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                    ugVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB3 = ugVar.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                    float f4 = typedArrayObtainAttributes2.getFloat(i19, 0.0f);
                                    ugVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f5 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                    ugVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float fB4 = ugVar.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                    float fB5 = ugVar.b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                    float fB6 = ugVar.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                    float fB7 = ugVar.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                    String string = typedArrayObtainAttributes2.getString(0);
                                    ugVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayObtainAttributes2.recycle();
                                    int i23 = nh3.a;
                                    if (w01Var.k) {
                                        p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    w01Var.i.add(new v01(str, fB3, f4, f5, fB4, fB5, fB6, fB7, listA, 512));
                                }
                            } else if (name.equals("path")) {
                                int[] iArr3 = am1.c;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                    i6 = 0;
                                } else {
                                    i6 = 0;
                                    typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                }
                                ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    fo.i("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayObtainStyledAttributes2.getString(i6);
                                ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayObtainStyledAttributes2.getString(2);
                                ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (string3 == null) {
                                    int i24 = nh3.a;
                                } else {
                                    listA = k8.a(k8Var, string3);
                                }
                                List list = listA;
                                x8 x8VarA = ugVar.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                float fB8 = ugVar.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                int i25 = !g93.e(ugVar.a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i25 == 0) {
                                    i7 = 0;
                                } else if (i25 == 1) {
                                    i7 = 1;
                                } else if (i25 != 2) {
                                    i7 = 0;
                                } else {
                                    i7 = 2;
                                }
                                if (g93.e(ugVar.a, "strokeLineJoin")) {
                                    c2 = '\t';
                                    i8 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                } else {
                                    i8 = -1;
                                    c2 = '\t';
                                }
                                ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i8 != 0) {
                                    if (i8 == 1) {
                                        i9 = 1;
                                    } else if (i8 == 2) {
                                        i9 = 2;
                                    }
                                    float fB9 = ugVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    x8 x8VarA2 = ugVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                    float fB10 = ugVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float fB11 = ugVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float fB12 = ugVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float fB13 = ugVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float fB14 = ugVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (g93.e(ugVar.a, "fillType")) {
                                        i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                    } else {
                                        i10 = 0;
                                    }
                                    ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                    typedArrayObtainStyledAttributes2.recycle();
                                    shader = (Shader) x8VarA.c;
                                    i11 = x8VarA.b;
                                    if (shader == null && i11 == 0) {
                                        qy2Var = null;
                                    } else if (shader != null) {
                                        qy2Var = new tt(shader);
                                    } else {
                                        qy2Var = new qy2(xp1.c(i11));
                                    }
                                    shader2 = (Shader) x8VarA2.c;
                                    i12 = x8VarA2.b;
                                    if (shader2 == null && i12 == 0) {
                                        qy2Var2 = null;
                                    } else if (shader2 != null) {
                                        qy2Var2 = new tt(shader2);
                                    } else {
                                        qy2Var2 = new qy2(xp1.c(i12));
                                    }
                                    if (i10 == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = 1;
                                    }
                                    if (w01Var.k) {
                                        p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ArrayList arrayList2 = w01Var.i;
                                    ((v01) arrayList2.get(arrayList2.size() - 1)).j.add(new qh3(str2, list, i13, qy2Var, fB8, qy2Var2, fB10, fB11, i7, i9, fB9, fB14, fB12, fB13));
                                    i5 = 1;
                                }
                                i9 = 0;
                                float fB15 = ugVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                x8 x8VarA3 = ugVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                float fB16 = ugVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                float fB17 = ugVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                float fB18 = ugVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                float fB19 = ugVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                float fB110 = ugVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                if (g93.e(ugVar.a, "fillType")) {
                                    i10 = 0;
                                } else {
                                    i10 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                }
                                ugVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                typedArrayObtainStyledAttributes2.recycle();
                                shader = (Shader) x8VarA.c;
                                i11 = x8VarA.b;
                                if (shader == null) {
                                    qy2Var = null;
                                } else if (shader != null) {
                                    qy2Var = new tt(shader);
                                } else {
                                    qy2Var = new qy2(xp1.c(i11));
                                }
                                shader2 = (Shader) x8VarA3.c;
                                i12 = x8VarA3.b;
                                if (shader2 == null) {
                                    qy2Var2 = null;
                                } else if (shader2 != null) {
                                    qy2Var2 = new tt(shader2);
                                } else {
                                    qy2Var2 = new qy2(xp1.c(i12));
                                }
                                if (i10 == 0) {
                                    i13 = 0;
                                } else {
                                    i13 = 1;
                                }
                                if (w01Var.k) {
                                    p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ArrayList arrayList3 = w01Var.i;
                                ((v01) arrayList3.get(arrayList3.size() - 1)).j.add(new qh3(str2, list, i13, qy2Var, fB8, qy2Var2, fB16, fB17, i7, i9, fB15, fB110, fB18, fB19));
                                i5 = 1;
                            }
                            z01Var = z01Var;
                            i5 = 1;
                            c2 = '\t';
                        } else {
                            z01Var = z01Var;
                            xmlResourceParser = xml;
                            c2 = '\t';
                            if (name.equals("clip-path")) {
                                int[] iArr4 = am1.d;
                                if (theme == null) {
                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                    i4 = 0;
                                } else {
                                    i4 = 0;
                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                }
                                ugVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String string4 = typedArrayObtainStyledAttributes.getString(i4);
                                ugVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i5 = 1;
                                String string5 = typedArrayObtainStyledAttributes.getString(1);
                                ugVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                if (string5 == null) {
                                    int i26 = nh3.a;
                                } else {
                                    listA = k8.a(k8Var, string5);
                                }
                                List list2 = listA;
                                typedArrayObtainStyledAttributes.recycle();
                                if (w01Var.k) {
                                    p21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                w01Var.i.add(new v01(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i17++;
                            } else {
                                i5 = 1;
                            }
                        }
                        xmlResourceParser.next();
                        i2 = i5;
                        z01Var = z01Var;
                        i14 = i20;
                        xml = xmlResourceParser;
                    }
                    i5 = i19;
                    c2 = '\t';
                    xmlResourceParser.next();
                    i2 = i5;
                    z01Var = z01Var;
                    i14 = i20;
                    xml = xmlResourceParser;
                }
                xmlResourceParser = xml;
                i5 = i19;
                c2 = '\t';
                xmlResourceParser.next();
                i2 = i5;
                z01Var = z01Var;
                i14 = i20;
                xml = xmlResourceParser;
            }
            z01 z01Var2 = z01Var;
            y01Var = new y01(w01Var.b(), i14 | ugVar.b);
            a11Var.a.put(z01Var2, new WeakReference(y01Var));
        }
        ph3 ph3VarN = v83.n(y01Var.a, ov0Var);
        ov0Var.p(false);
        return ph3VarN;
    }

    public static final LocationSpooferDataPackage G(ul1 ul1Var, Uri uri) throws IOException {
        LocationSpooferDataPackage locationSpooferDataPackage;
        InputStream inputStreamOpenInputStream = ul1Var.j.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, sw.a), 8192);
            try {
                String strF = l93.f(bufferedReader);
                bufferedReader.close();
                inputStreamOpenInputStream.close();
                n71 n71VarD = ee0.d(new yk1(5));
                try {
                    locationSpooferDataPackage = (LocationSpooferDataPackage) n71VarD.a(LocationSpooferDataPackage.Companion.serializer(), strF);
                } catch (Exception unused) {
                    locationSpooferDataPackage = null;
                }
                if (locationSpooferDataPackage != null && (!locationSpooferDataPackage.getLocations().isEmpty() || !locationSpooferDataPackage.getCollectionRoutes().isEmpty() || !locationSpooferDataPackage.getSavedLocations().isEmpty() || !locationSpooferDataPackage.getSavedRoutes().isEmpty() || !locationSpooferDataPackage.getAppCoordinateSystems().isEmpty() || locationSpooferDataPackage.getSettings() != null)) {
                    return locationSpooferDataPackage;
                }
                try {
                    try {
                        List list = (List) n71VarD.a(new oo(CompleteLocation.Companion.serializer()), strF);
                        if (!list.isEmpty()) {
                            return new LocationSpooferDataPackage(0, 0L, (String) null, list, (List) null, (List) null, (List) null, (Map) null, (ExportedSettings) null, 503, (ca0) null);
                        }
                    } catch (Exception unused2) {
                        List list2 = (List) n71VarD.a(new oo(SavedLocation.Companion.serializer()), strF);
                        if (!list2.isEmpty()) {
                            return new LocationSpooferDataPackage(0, 0L, (String) null, (List) null, (List) null, list2, (List) null, (Map) null, (ExportedSettings) null, 479, (ca0) null);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return locationSpooferDataPackage;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ji2.z(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                ji2.z(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x062e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0645  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v38 */
    /* JADX WARN: Type inference failed for: r18v39 */
    /* JADX WARN: Type inference failed for: r18v41 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r18v47 */
    /* JADX WARN: Type inference failed for: r18v48 */
    /* JADX WARN: Type inference failed for: r18v49 */
    /* JADX WARN: Type inference failed for: r18v50 */
    /* JADX WARN: Type inference failed for: r18v51 */
    /* JADX WARN: Type inference failed for: r18v52 */
    /* JADX WARN: Type inference failed for: r18v53 */
    /* JADX WARN: Type inference failed for: r18v54 */
    /* JADX WARN: Type inference failed for: r18v55 */
    /* JADX WARN: Type inference failed for: r18v56 */
    /* JADX WARN: Type inference failed for: r18v57 */
    /* JADX WARN: Type inference failed for: r18v58 */
    /* JADX WARN: Type inference failed for: r18v59 */
    /* JADX WARN: Type inference failed for: r18v60 */
    /* JADX WARN: Type inference failed for: r18v61 */
    /* JADX WARN: Type inference failed for: r18v62 */
    /* JADX WARN: Type inference failed for: r18v63 */
    /* JADX WARN: Type inference failed for: r18v64 */
    /* JADX WARN: Type inference failed for: r18v65 */
    /* JADX WARN: Type inference failed for: r18v66 */
    /* JADX WARN: Type inference failed for: r18v67 */
    /* JADX WARN: Type inference failed for: r18v68 */
    /* JADX WARN: Type inference failed for: r18v69 */
    /* JADX WARN: Type inference failed for: r18v70 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [long] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80, types: [long] */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76, types: [long] */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0645 -> B:109:0x0657). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0749 -> B:132:0x0751). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0937 -> B:239:0x094d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:278:0x0b1d -> B:279:0x0b26). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:312:0x0c10 -> B:313:0x0c13). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:323:0x0cc3 -> B:324:0x0ccc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object H(defpackage.ul1 r61, double r62, double r64, java.lang.String r66, java.lang.String r67, java.lang.String r68, boolean r69, java.lang.Long r70, defpackage.r60 r71) {
        /*
            Method dump skipped, instruction units count: 3324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.H(ul1, double, double, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Long, r60):java.lang.Object");
    }

    public static final eh I(jh jhVar, int i) {
        Object next;
        Iterator<T> it = jhVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hb1) ((Map.Entry) next).getKey()).f != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (eh) entry.getValue();
        }
        return null;
    }

    public static final String J(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final long K(long j, long j2) {
        int iD;
        int iF = f93.f(j);
        int iE = f93.e(j);
        if ((f93.f(j2) < f93.e(j)) && (f93.f(j) < f93.e(j2))) {
            if ((f93.f(j2) <= f93.f(j)) && (f93.e(j) <= f93.e(j2))) {
                iF = f93.f(j2);
                iE = iF;
            } else {
                if ((f93.f(j) <= f93.f(j2)) && (f93.e(j2) <= f93.e(j))) {
                    iD = f93.d(j2);
                } else {
                    int iF2 = f93.f(j2);
                    if (iF >= f93.e(j2) || iF2 > iF) {
                        iE = f93.f(j2);
                    } else {
                        iF = f93.f(j2);
                        iD = f93.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > f93.f(j2)) {
            iF -= f93.d(j2);
            iD = f93.d(j2);
            iE -= iD;
        }
        return g93.a(iF, iE);
    }

    public static final void a(au0 au0Var, f30 f30Var, int i) {
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2025803417);
        int i2 = (ov0Var.h(au0Var) ? 4 : 2) | i;
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(12.0f, 4.0f, 12.0f, 4.0f), sb.a0(-1489905656, new ak(i3, au0Var), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new u2(i, 3, au0Var);
        }
    }

    public static final l21 b(y81 y81Var, String str) {
        return new l21(str, new m21(y81Var));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void c(final boolean z, dv1 dv1Var, boolean z2, ld2 ld2Var, f30 f30Var, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        final ld2 ld2Var2;
        int i5;
        boolean z4;
        final dv1 dv1Var2;
        final boolean z5;
        ee2 ee2VarT;
        int i6;
        av1 av1Var;
        boolean z6;
        ld2 ld2Var3;
        dv1 dv1Var3;
        kz kzVar;
        ld2 ld2Var4;
        float f2;
        s03 s03VarA;
        long j;
        Object objL;
        boolean zF;
        Object objQ;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(408580840);
        if ((i & 6) == 0) {
            i3 = i | (ov0Var.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i3 | 384;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3456;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i7 | (ov0Var.g(z3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        if ((i2 & 16) == 0) {
            ld2Var2 = ld2Var;
            int i9 = ov0Var.f(ld2Var2) ? 16384 : 8192;
            i5 = i4 | i9 | 196608;
            if ((74899 & i5) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var.T(i5 & 1, z4)) {
                ov0Var.Y();
                i6 = i & 1;
                av1Var = av1.a;
                if (i6 != 0 || ov0Var.B()) {
                    z6 = i8 == 0 ? z3 : true;
                    if ((i2 & 16) != 0) {
                        kzVar = (kz) ov0Var.j(mz.a);
                        ld2Var4 = kzVar.f0;
                        if (ld2Var4 == null) {
                            ld2Var3 = new ld2(mz.c(kzVar, n51.M), mz.c(kzVar, n51.N), hz.c(0.38f, mz.c(kzVar, n51.J)), hz.c(0.38f, mz.c(kzVar, n51.K)));
                            kzVar.f0 = ld2Var3;
                        } else {
                            ld2Var3 = ld2Var4;
                        }
                    } else {
                        ld2Var3 = ld2Var2;
                    }
                    dv1Var3 = av1Var;
                } else {
                    ov0Var.W();
                    z6 = z3;
                    ld2Var3 = ld2Var2;
                    dv1Var3 = dv1Var;
                }
                ov0Var.q();
                if (z) {
                    f2 = 6.0f;
                } else {
                    f2 = 0.0f;
                }
                s03VarA = qh.a(f2, mc0.K(vv1.f, ov0Var), null, ov0Var, 0, 12);
                ld2Var3.getClass();
                if (!z6 && z) {
                    j = ld2Var3.a;
                } else if (!z6 && !z) {
                    j = ld2Var3.b;
                } else if (z6 && z) {
                    j = ld2Var3.c;
                } else {
                    j = ld2Var3.d;
                }
                if (z6) {
                    ov0Var.c0(1194696477);
                    objL = aw2.a(j, mc0.K(vv1.g, ov0Var), ov0Var, 0, 12);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(1194874138);
                    objL = ke0.L(new hz(j), ov0Var);
                    ov0Var.p(false);
                }
                dv1 dv1VarI = iw2.i(zm3.D(iw2.r(dv1Var3.d(av1Var).d(av1Var)), 2.0f), n51.L);
                zF = ov0Var.f(objL) | ov0Var.f(s03VarA);
                objQ = ov0Var.Q();
                if (zF || objQ == d30.a) {
                    objQ = new jl1(10, objL, s03VarA);
                    ov0Var.m0(objQ);
                }
                ji2.o(dv1VarI, (lu0) objQ, ov0Var, 0);
                dv1Var2 = dv1Var3;
                z5 = z6;
                ld2Var2 = ld2Var3;
            } else {
                ov0Var.W();
                dv1Var2 = dv1Var;
                z5 = z3;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: md2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ig0.c(z, dv1Var2, z5, ld2Var2, (f30) obj, wc0.m0(i | 1), i2);
                        return mf3.a;
                    }
                };
            }
        }
        ld2Var2 = ld2Var;
        i5 = i4 | i9 | 196608;
        if ((74899 & i5) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ov0Var.T(i5 & 1, z4)) {
            ov0Var.Y();
            i6 = i & 1;
            av1Var = av1.a;
            if (i6 != 0) {
                if (i8 == 0) {
                }
                if ((i2 & 16) != 0) {
                    kzVar = (kz) ov0Var.j(mz.a);
                    ld2Var4 = kzVar.f0;
                    if (ld2Var4 == null) {
                        ld2Var3 = new ld2(mz.c(kzVar, n51.M), mz.c(kzVar, n51.N), hz.c(0.38f, mz.c(kzVar, n51.J)), hz.c(0.38f, mz.c(kzVar, n51.K)));
                        kzVar.f0 = ld2Var3;
                    } else {
                        ld2Var3 = ld2Var4;
                    }
                } else {
                    ld2Var3 = ld2Var2;
                }
                dv1Var3 = av1Var;
            } else {
                if (i8 == 0) {
                }
                if ((i2 & 16) != 0) {
                    kzVar = (kz) ov0Var.j(mz.a);
                    ld2Var4 = kzVar.f0;
                    if (ld2Var4 == null) {
                        ld2Var3 = new ld2(mz.c(kzVar, n51.M), mz.c(kzVar, n51.N), hz.c(0.38f, mz.c(kzVar, n51.J)), hz.c(0.38f, mz.c(kzVar, n51.K)));
                        kzVar.f0 = ld2Var3;
                    } else {
                        ld2Var3 = ld2Var4;
                    }
                } else {
                    ld2Var3 = ld2Var2;
                }
                dv1Var3 = av1Var;
            }
            ov0Var.q();
            if (z) {
                f2 = 6.0f;
            } else {
                f2 = 0.0f;
            }
            s03VarA = qh.a(f2, mc0.K(vv1.f, ov0Var), null, ov0Var, 0, 12);
            ld2Var3.getClass();
            if (!z6) {
                if (!z6) {
                    if (z6) {
                        j = ld2Var3.d;
                    } else {
                        j = ld2Var3.d;
                    }
                } else if (z6) {
                    j = ld2Var3.d;
                } else {
                    j = ld2Var3.d;
                }
            } else if (!z6) {
                if (z6) {
                    j = ld2Var3.d;
                } else {
                    j = ld2Var3.d;
                }
            } else if (z6) {
                j = ld2Var3.d;
            } else {
                j = ld2Var3.d;
            }
            if (z6) {
                ov0Var.c0(1194696477);
                objL = aw2.a(j, mc0.K(vv1.g, ov0Var), ov0Var, 0, 12);
                ov0Var.p(false);
            } else {
                ov0Var.c0(1194874138);
                objL = ke0.L(new hz(j), ov0Var);
                ov0Var.p(false);
            }
            dv1 dv1VarI2 = iw2.i(zm3.D(iw2.r(dv1Var3.d(av1Var).d(av1Var)), 2.0f), n51.L);
            zF = ov0Var.f(objL) | ov0Var.f(s03VarA);
            objQ = ov0Var.Q();
            if (zF) {
                objQ = new jl1(10, objL, s03VarA);
                ov0Var.m0(objQ);
            } else {
                objQ = new jl1(10, objL, s03VarA);
                ov0Var.m0(objQ);
            }
            ji2.o(dv1VarI2, (lu0) objQ, ov0Var, 0);
            dv1Var2 = dv1Var3;
            z5 = z6;
            ld2Var2 = ld2Var3;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            z5 = z3;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: md2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ig0.c(z, dv1Var2, z5, ld2Var2, (f30) obj, wc0.m0(i | 1), i2);
                    return mf3.a;
                }
            };
        }
    }

    public static final void d(SavedLocation savedLocation, boolean z, au0 au0Var, au0 au0Var2, f30 f30Var, int i) {
        long j;
        float f2;
        savedLocation.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1998115774);
        int i2 = i | (ov0Var.h(savedLocation) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av1 av1Var = av1.a;
            dv1 dv1VarN = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(12.0f));
            if (z) {
                j = hz.c;
                f2 = 0.05f;
            } else {
                j = hz.b;
                f2 = 0.03f;
            }
            long jC = hz.c(f2, j);
            iy0 iy0Var = o51.p0;
            dv1 dv1VarE = zm3.E(bk.a(xp1.k(dv1VarN, jC, iy0Var), au0Var), 12.0f, 8.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, kk2VarA);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarN2 = xp1.n(iw2.k(av1Var, 30.0f), cj2.a(8.0f));
            long j2 = bk.g;
            dv1 dv1VarK = xp1.k(dv1VarN2, hz.c(0.12f, j2), iy0Var);
            er1 er1VarC = ws.c(j9.j, false);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            t01.a(ee0.z(), null, iw2.k(av1Var, 16.0f), j2, ov0Var, 3504, 0);
            ov0Var.p(true);
            gh0.h(ov0Var, iw2.o(av1Var, 10.0f));
            wb1 wb1Var = new wb1(1.0f, true);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, wb1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            String name = savedLocation.getName();
            long jC2 = v63.c(13);
            jr0 jr0Var = jr0.i;
            hh0 hh0Var = mz.a;
            s83.b(name, null, ((kz) ov0Var.j(hh0Var)).q, jC2, jr0Var, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var, 1597440, 24960, 241578);
            Locale locale = Locale.US;
            s83.b(az2.k(String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLat())}, 1)), ", ", String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLng())}, 1))), null, hz.c(0.45f, ((kz) ov0Var.j(hh0Var)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
            ov0Var = ov0Var;
            ov0Var.p(true);
            xq1.l(au0Var2, iw2.k(av1Var, 28.0f), false, null, null, xq1.z, ov0Var, ((i2 >> 9) & 14) | 1572912, 60);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2((Object) savedLocation, z, au0Var, (Object) au0Var2, i, 12);
        }
    }

    public static final void e(dv1 dv1Var, List list, mi1 mi1Var, boolean z, lu0 lu0Var, lu0 lu0Var2, au0 au0Var, au0 au0Var2, dv1 dv1Var2, f30 f30Var, int i) {
        ov0 ov0Var;
        list.getClass();
        mi1Var.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(1460279128);
        int i2 = (ov0Var2.f(dv1Var) ? 4 : 2) | i | (ov0Var2.h(list) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ov0Var2.d(mi1Var.ordinal()) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var2.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var2.h(lu0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var2.h(lu0Var2) ? 131072 : 65536;
        }
        int i3 = i2 | (ov0Var2.h(au0Var) ? 1048576 : 524288) | (ov0Var2.h(au0Var2) ? 8388608 : 4194304) | (ov0Var2.f(dv1Var2) ? 67108864 : 33554432);
        if (ov0Var2.T(i3 & 1, (38347923 & i3) != 38347922)) {
            ov0Var = ov0Var2;
            zm3.b(iw2.e(dv1Var, 1.0f), 20.0f, new b52(14.0f, 14.0f, 14.0f, 14.0f), sb.a0(-48998135, new xl2(dv1Var2, list, z, lu0Var, lu0Var2, au0Var2, au0Var, mi1Var, z ? bk.c : bk.f), ov0Var2), ov0Var, 25008, 8);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yl2(dv1Var, list, mi1Var, z, lu0Var, lu0Var2, au0Var, au0Var2, dv1Var2, i);
        }
    }

    public static final void f(int i, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1164216876);
        if (ov0Var.T(i & 1, i != 0)) {
            ws.a(xp1.k(iw2.g(iw2.e(av1.a, 1.0f), 0.6f), hz.c(0.06f, ((kz) ov0Var.j(mz.a)).q), o51.p0), ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new v70(i);
        }
    }

    public static final void g(final x01 x01Var, final long j, final String str, final au0 au0Var, String str2, f30 f30Var, final int i, final int i2) {
        final String str3;
        int i3;
        String str4;
        boolean z;
        boolean z2;
        str.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(886290026);
        int i4 = i | (ov0Var.f(x01Var) ? 4 : 2) | (ov0Var.f(str) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (ov0Var.f(str3) ? 16384 : 8192);
        }
        int i6 = i3;
        if (ov0Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            String str5 = i5 != 0 ? null : str3;
            av1 av1Var = av1.a;
            dv1 dv1VarF = zm3.F(bk.a(iw2.e(av1Var, 1.0f), au0Var), 0.0f, 11.0f, 1);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarF);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, kk2VarA);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarN = xp1.n(iw2.k(av1Var, 34.0f), cj2.a(11.0f));
            long jC = hz.c(0.12f, j);
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(dv1VarN, jC, iy0Var);
            er1 er1VarC = ws.c(j9.j, false);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            t01.a(x01Var, null, iw2.k(av1Var, 18.0f), j, ov0Var, (i6 & 14) | 3504, 0);
            az2.t(ov0Var, true, av1Var, 12.0f, ov0Var);
            long jB = v63.b(14.5d);
            jr0 jr0Var = jr0.h;
            hh0 hh0Var = mz.a;
            av1 av1Var2 = av1Var;
            s83.b(str, new wb1(1.0f, true), ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i6 >> 6) & 14) | 1597440, 0, 262056);
            if (str5 != null) {
                ov0Var.c0(-1585508174);
                dv1 dv1VarE = zm3.E(xp1.k(xp1.n(av1Var2, cj2.a(6.0f)), hz.c(0.1f, j), iy0Var), 7.0f, 2.5f);
                er1 er1VarC2 = ws.c(j9.f, false);
                int iHashCode3 = Long.hashCode(ov0Var.T);
                l72 l72VarL3 = ov0Var.l();
                dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarE);
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, ghVar, er1VarC2);
                q73.h(ov0Var, ghVar2, l72VarL3);
                az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                q73.h(ov0Var, ghVar4, dv1VarH3);
                String str6 = str5;
                s83.b(str6, null, j, v63.c(11), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i6 >> 12) & 14) | 1597824, 0, 262058);
                str4 = str6;
                ov0Var = ov0Var;
                av1Var2 = av1Var2;
                z = true;
                az2.t(ov0Var, true, av1Var2, 8.0f, ov0Var);
                z2 = false;
            } else {
                ov0Var = ov0Var;
                str4 = str5;
                z = true;
                z2 = false;
                ov0Var.c0(-1588860204);
            }
            ov0Var.p(z2);
            t01.a(sb.S(), null, iw2.k(av1Var2, 18.0f), hz.c(0.3f, ((kz) ov0Var.j(hh0Var)).q), ov0Var, 432, 0);
            ov0Var.p(z);
            str3 = str4;
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(j, str, au0Var, str3, i, i2) { // from class: wm0
                public final /* synthetic */ long f;
                public final /* synthetic */ String g;
                public final /* synthetic */ au0 h;
                public final /* synthetic */ String i;
                public final /* synthetic */ int j;

                {
                    this.j = i2;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(49);
                    ig0.g(this.e, this.f, this.g, this.h, this.i, (f30) obj, iM0, this.j);
                    return mf3.a;
                }
            };
        }
    }

    public static final void h(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }

    public static final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final void j(ul1 ul1Var, LocationSpooferDataPackage locationSpooferDataPackage, ImportExportSelection importExportSelection, au0 au0Var) {
        ul1Var.getClass();
        BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new cm1(ul1Var, importExportSelection, locationSpooferDataPackage, au0Var, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(defpackage.p33 r6, defpackage.oq r7) {
        /*
            boolean r0 = r7 instanceof defpackage.kh2
            if (r0 == 0) goto L13
            r0 = r7
            kh2 r0 = (defpackage.kh2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            kh2 r0 = new kh2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p33 r6 = r0.e
            defpackage.ee0.J(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ee0.J(r7)
        L31:
            r0.e = r6
            r0.g = r2
            q92 r7 = defpackage.q92.f
            java.lang.Object r7 = r6.c(r7, r0)
            z70 r1 = defpackage.z70.e
            if (r7 != r1) goto L40
            return r1
        L40:
            p92 r7 = (defpackage.p92) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            x92 r5 = (defpackage.x92) r5
            boolean r5 = defpackage.mh0.o(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.k(p33, oq):java.lang.Object");
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        b81.k(str);
    }

    public static final mq0 n(Context context) {
        u92 u92Var = new u92(18);
        context.getApplicationContext();
        return new mq0(u92Var, new od(Build.VERSION.SDK_INT >= 31 ? kr0.a.a(context) : 0));
    }

    public static final void o(ul1 ul1Var, Uri uri, ImportExportSelection importExportSelection, lu0 lu0Var) {
        ul1Var.getClass();
        importExportSelection.getClass();
        BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new em1(importExportSelection, ul1Var, uri, lu0Var, null), 2, null);
    }

    public static ka0 p(f30 f30Var) {
        float f2 = cz2.a;
        ov0 ov0Var = (ov0) f30Var;
        xb0 xb0Var = (xb0) ov0Var.j(z30.h);
        boolean zC = ov0Var.c(xb0Var.g());
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (zC || objQ == c30Var) {
            objQ = new u90(new us1(xb0Var));
            ov0Var.m0(objQ);
        }
        u90 u90Var = (u90) objQ;
        boolean zF = ov0Var.f(u90Var);
        Object objQ2 = ov0Var.Q();
        if (zF || objQ2 == c30Var) {
            objQ2 = new ka0(u90Var);
            ov0Var.m0(objQ2);
        }
        return (ka0) objQ2;
    }

    public static final Class r(l81 l81Var) {
        l81Var.getClass();
        Class clsA = ((mx) l81Var).a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class s(l81 l81Var) {
        Class clsA = ((mx) l81Var).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final ye1 t(FloatingJoystickService floatingJoystickService) {
        xe1 lifecycle = floatingJoystickService.getLifecycle();
        lifecycle.getClass();
        t1 t1Var = lifecycle.a;
        while (true) {
            ye1 ye1Var = (ye1) ((AtomicReference) t1Var.f).get();
            if (ye1Var != null) {
                return ye1Var;
            }
            q60 q60Var = null;
            ye1 ye1Var2 = new ye1(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
            AtomicReference atomicReference = (AtomicReference) t1Var.f;
            do {
                if (atomicReference.compareAndSet(null, ye1Var2)) {
                    BuildersKt__Builders_commonKt.launch$default(ye1Var2, Dispatchers.getMain().getImmediate(), null, new l80(ye1Var2, q60Var, 4), 2, null);
                    return ye1Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final x01 u() {
        x01 x01Var = c;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q62(8.0f, 6.82f));
        arrayList.add(new c72(10.36f));
        arrayList.add(new v62(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f));
        arrayList.add(new x62(8.14f, -5.18f));
        arrayList.add(new v62(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f));
        arrayList.add(new p62(9.54f, 5.98f));
        arrayList.add(new n62(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f));
        arrayList.add(m62.c);
        w01.a(w01Var, arrayList, qy2Var);
        x01 x01VarB = w01Var.b();
        c = x01VarB;
        return x01VarB;
    }

    public static final x01 v() {
        x01 x01Var = d;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(17.65f, 6.35f);
        nx0VarI.g(-1.63f, -1.63f, -3.94f, -2.57f, -6.48f, -2.31f);
        nx0VarI.g(-3.67f, 0.37f, -6.69f, 3.35f, -7.1f, 7.02f);
        nx0VarI.f(3.52f, 15.91f, 7.27f, 20.0f, 12.0f, 20.0f);
        nx0VarI.g(3.19f, 0.0f, 5.93f, -1.87f, 7.21f, -4.56f);
        nx0VarI.g(0.32f, -0.67f, -0.16f, -1.44f, -0.9f, -1.44f);
        nx0VarI.g(-0.37f, 0.0f, -0.72f, 0.2f, -0.88f, 0.53f);
        nx0VarI.g(-1.13f, 2.43f, -3.84f, 3.97f, -6.8f, 3.31f);
        nx0VarI.g(-2.22f, -0.49f, -4.01f, -2.3f, -4.48f, -4.52f);
        nx0VarI.f(5.31f, 9.44f, 8.26f, 6.0f, 12.0f, 6.0f);
        nx0VarI.g(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        nx0VarI.l(-1.51f, 1.51f);
        nx0VarI.g(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        nx0VarI.h(19.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0VarI.r(6.41f);
        nx0VarI.g(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        nx0VarI.l(-0.64f, 0.65f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        d = x01VarB;
        return x01VarB;
    }

    public static final x01 w() {
        x01 x01Var = f;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.StarOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(19.65f, 9.04f);
        nx0Var.l(-4.84f, -0.42f);
        nx0Var.l(-1.89f, -4.45f);
        nx0Var.g(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        nx0Var.k(9.19f, 8.63f);
        nx0Var.l(-4.83f, 0.41f);
        nx0Var.g(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        nx0Var.l(3.67f, 3.18f);
        nx0Var.l(-1.1f, 4.72f);
        nx0Var.g(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        nx0Var.l(4.15f, -2.5f);
        nx0Var.l(4.15f, 2.51f);
        nx0Var.g(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        nx0Var.l(-1.1f, -4.73f);
        nx0Var.l(3.67f, -3.18f);
        nx0Var.g(0.67f, -0.58f, 0.32f, -1.68f, -0.56f, -1.75f);
        nx0Var.e();
        nx0Var.m(12.0f, 15.4f);
        nx0Var.l(-3.76f, 2.27f);
        nx0Var.l(1.0f, -4.28f);
        nx0Var.l(-3.32f, -2.88f);
        nx0Var.l(4.38f, -0.38f);
        nx0Var.k(12.0f, 6.1f);
        nx0Var.l(1.71f, 4.04f);
        nx0Var.l(4.38f, 0.38f);
        nx0Var.l(-3.32f, 2.88f);
        nx0Var.l(1.0f, 4.28f);
        nx0Var.k(12.0f, 15.4f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        f = x01VarB;
        return x01VarB;
    }

    public static final x83 x(es2 es2Var) {
        lu0 lu0Var;
        ArrayList arrayList = new ArrayList();
        Object objG = es2Var.e.g(ds2.a);
        if (objG == null) {
            objG = null;
        }
        z0 z0Var = (z0) objG;
        if (z0Var == null || (lu0Var = (lu0) z0Var.b) == null || !((Boolean) lu0Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (x83) arrayList.get(0);
    }

    public static final boolean y(dj djVar) {
        int length = djVar.f.length();
        List list = djVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cj cjVar = (cj) list.get(i);
                if ((cjVar.a instanceof bg1) && ej.b(0, length, cjVar.b, cjVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(hg0 hg0Var) {
        if (((cv1) hg0Var).e.r) {
            xp1.L(hg0Var, 1).A1();
        }
    }

    public abstract boolean m(k91 k91Var);

    public abstract Object q(k91 k91Var);
}
