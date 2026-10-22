package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hn1 {
    public static final int a(ul1 ul1Var, JSONObject jSONObject, int i) {
        ul1Var.getClass();
        int iOptInt = jSONObject.optInt("dbm", Integer.MIN_VALUE);
        if (-140 <= iOptInt && iOptInt < -39) {
            return iOptInt;
        }
        int iOptInt2 = jSONObject.optInt("averageSignalStrength", Integer.MIN_VALUE);
        if (-140 <= iOptInt2 && iOptInt2 < -39) {
            return iOptInt2;
        }
        int iOptInt3 = jSONObject.optInt("signal", Integer.MIN_VALUE);
        if (-140 <= iOptInt3 && iOptInt3 < -39) {
            return iOptInt3;
        }
        int i2 = (-70) - (i * 3);
        if (i2 < -110) {
            return -110;
        }
        return i2;
    }

    public static final void b(ul1 ul1Var, pz2 pz2Var) {
        Object value;
        uz2 uz2Var;
        List list;
        String str;
        boolean z;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        AppState appState;
        Object value7;
        Object value8;
        Object value9;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        SettingsRepository settingsRepository = ul1Var.c;
        MutableStateFlow mutableStateFlow2 = ul1Var.z;
        if (pz2Var instanceof jz2) {
            do {
                value9 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value9, uz2.a((uz2) value9, ((jz2) pz2Var).a, false, false, false, false, null, null, false, null, 0L, 8190)));
            return;
        }
        if (pz2Var instanceof kz2) {
            do {
                value8 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value8, uz2.a((uz2) value8, false, ((kz2) pz2Var).a, false, false, false, null, null, false, null, 0L, 8189)));
            return;
        }
        if (pz2Var instanceof iz2) {
            do {
                value7 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value7, uz2.a((uz2) value7, false, false, ((iz2) pz2Var).a, false, false, null, null, false, null, 0L, 8187)));
            return;
        }
        if (pz2Var instanceof nz2) {
            nz2 nz2Var = (nz2) pz2Var;
            if (nz2Var.a && !((uz2) mutableStateFlow2.getValue()).d) {
                do {
                    value6 = mutableStateFlow.getValue();
                    appState = (AppState) value6;
                } while (!mutableStateFlow.compareAndSet(value6, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, appState.getCanMockWifi() || appState.getMockWifi(), appState.getCanMockCell() || appState.getMockCell(), appState.getCanMockBluetooth() || appState.getMockBluetooth(), false, false, null, 0, null, false, false, false, null, null, -1, -1, 134103039, null)));
                AppState appState2 = (AppState) mutableStateFlow.getValue();
                settingsRepository.setMockWifi(appState2.getMockWifi());
                settingsRepository.setMockCell(appState2.getMockCell());
                settingsRepository.setMockBluetooth(appState2.getMockBluetooth());
            }
            do {
                value5 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value5, uz2.a((uz2) value5, false, false, false, nz2Var.a, false, null, null, false, null, 0L, 8183)));
            return;
        }
        if (pz2Var instanceof lz2) {
            do {
                value4 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value4, uz2.a((uz2) value4, false, false, false, false, ((lz2) pz2Var).a, null, null, false, null, 0L, 8127)));
            return;
        }
        if (pz2Var.equals(gz2.a)) {
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, uz2.a((uz2) value3, false, false, false, false, false, null, null, false, null, 0L, 7679)));
            return;
        }
        if (pz2Var instanceof oz2) {
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, uz2.a((uz2) value2, false, false, false, false, false, ((oz2) pz2Var).a, null, false, null, 0L, 8063)));
            return;
        }
        if (pz2Var instanceof mz2) {
            do {
                value = mutableStateFlow2.getValue();
                uz2Var = (uz2) value;
                mz2 mz2Var = (mz2) pz2Var;
                list = mz2Var.a;
                str = mz2Var.c;
                if (l13.k0(str)) {
                    str = uz2Var.f;
                }
                z = mz2Var.b;
                if (list.isEmpty()) {
                    str = uz2Var.i;
                }
            } while (!mutableStateFlow2.compareAndSet(value, uz2.a(uz2Var, false, false, false, false, false, null, list, z, str, !list.isEmpty() ? System.currentTimeMillis() : uz2Var.j, 4351)));
            return;
        }
        if (pz2Var instanceof fz2) {
            fz2 fz2Var = (fz2) pz2Var;
            an1.b(ul1Var, fz2Var.a, fz2Var.b);
            return;
        }
        if (!(pz2Var instanceof hz2)) {
            b81.d();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - ul1Var.n > 500) {
            ul1Var.n = jCurrentTimeMillis;
            hz2 hz2Var = (hz2) pz2Var;
            an1.b(ul1Var, hz2Var.a, hz2Var.b);
        } else {
            Job job = ul1Var.o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            ul1Var.o = BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new tf0(jCurrentTimeMillis, ul1Var, pz2Var, (q60) null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x035b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0191  */
    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    /* JADX WARN: Code duplicated, block: B:52:0x019e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01f7 -> B:68:0x01fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0357 -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.ul1 r31, defpackage.r60 r32) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn1.c(ul1, r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public static final JSONArray d(ul1 ul1Var, JSONArray jSONArray) throws JSONException {
        int i;
        ul1Var.getClass();
        JSONArray jSONArray2 = new JSONArray();
        int i2 = 0;
        int i3 = 0;
        for (int length = jSONArray.length(); i3 < length; length = length) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject == null) {
                i = i2;
            } else {
                int iG = g(ul1Var, jSONObjectOptJSONObject, new String[]{"tac", "lac", "area"}, i2);
                int iG2 = g(ul1Var, jSONObjectOptJSONObject, new String[]{"ci", "cid", "cellid", "cell"}, i2);
                if (iG <= 0 || iG2 <= 0) {
                    i = i2;
                } else {
                    String strOptString = jSONObjectOptJSONObject.optString("type", jSONObjectOptJSONObject.optString("radio", "LTE"));
                    strOptString.getClass();
                    String strE = e(ul1Var, strOptString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", strE);
                    jSONObject.put("radio", jSONObjectOptJSONObject.optString("radio", strE));
                    jSONObject.put("mcc", g(ul1Var, jSONObjectOptJSONObject, new String[]{"mcc"}, 460));
                    jSONObject.put("mnc", g(ul1Var, jSONObjectOptJSONObject, new String[]{"mnc", "net"}, 0));
                    jSONObject.put("tac", iG);
                    jSONObject.put("lac", iG);
                    jSONObject.put("ci", iG2);
                    jSONObject.put("cid", iG2);
                    jSONObject.put("cellid", iG2);
                    i = 0;
                    jSONObject.put("pci", g(ul1Var, jSONObjectOptJSONObject, new String[]{"pci"}, mh0.v(iG2 % 504, 0, 503)));
                    jSONObject.put("dbm", a(ul1Var, jSONObjectOptJSONObject, i3));
                    jSONObject.put("isRegistered", jSONObjectOptJSONObject.optBoolean("isRegistered", i3 == 0));
                    jSONArray2.put(jSONObject);
                }
            }
            i3++;
            i2 = i;
        }
        return jSONArray2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public static final String e(ul1 ul1Var, String str) {
        ul1Var.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case 1714:
                if (upperCase.equals("5G")) {
                    return "NR";
                }
                return "LTE";
            case 2500:
                if (upperCase.equals("NR")) {
                    return "NR";
                }
                return "LTE";
            case 70881:
                return !upperCase.equals("GSM") ? "LTE" : "GSM";
            case 2404214:
                if (upperCase.equals("NR5G")) {
                    return "NR";
                }
                return "LTE";
            case 2608919:
                if (upperCase.equals("UMTS")) {
                    return "WCDMA";
                }
                return "LTE";
            case 82410124:
                if (upperCase.equals("WCDMA")) {
                    return "WCDMA";
                }
                return "LTE";
            default:
                return "LTE";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable f(ul1 ul1Var, r60 r60Var) {
        gn1 gn1Var;
        String string;
        ul1 ul1Var2 = ul1Var;
        if (r60Var instanceof gn1) {
            gn1Var = (gn1) r60Var;
            int i = gn1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn1Var.g = i - Integer.MIN_VALUE;
            } else {
                gn1Var = new gn1(r60Var);
            }
        } else {
            gn1Var = new gn1(r60Var);
        }
        Object allCompleteLocations = gn1Var.f;
        int i2 = gn1Var.g;
        int i3 = 1;
        if (i2 == 0) {
            ee0.J(allCompleteLocations);
            EnvironmentDao environmentDao = ul1Var2.f;
            gn1Var.e = ul1Var2;
            gn1Var.g = 1;
            allCompleteLocations = environmentDao.getAllCompleteLocations(gn1Var);
            z70 z70Var = z70.e;
            if (allCompleteLocations == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ul1Var2 = gn1Var.e;
            ee0.J(allCompleteLocations);
        }
        List<CompleteLocation> list = (List) allCompleteLocations;
        if (list.isEmpty()) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList();
        for (CompleteLocation completeLocation : list) {
            LocationRecord location = completeLocation.getLocation();
            boolean zIsEmpty = completeLocation.getWifis().isEmpty();
            boolean z = !zIsEmpty;
            boolean zIsEmpty2 = completeLocation.getBluetooths().isEmpty();
            boolean z2 = !zIsEmpty2;
            boolean zIsEmpty3 = completeLocation.getCells().isEmpty();
            boolean z3 = !zIsEmpty3;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    arrayList.add(new tl1(location, z, z2, z3));
                    break;
                }
                tl1 tl1Var = (tl1) arrayList.get(i4);
                LocationRecord locationRecord = tl1Var.a;
                double radians = Math.toRadians(locationRecord.getLat() - location.getLat());
                double radians2 = Math.toRadians(locationRecord.getLng() - location.getLng());
                double dSin = Math.sin(radians / 2.0d);
                double dCos = Math.cos(Math.toRadians(locationRecord.getLat())) * Math.cos(Math.toRadians(location.getLat()));
                double dSin2 = Math.sin(radians2 / 2.0d);
                double d = (dSin2 * dSin2 * dCos) + (dSin * dSin);
                int i5 = i3;
                double dSqrt = Math.sqrt(d);
                double d2 = 1.0d - d;
                int i6 = size;
                int i7 = i4;
                if (Math.atan2(dSqrt, Math.sqrt(d2)) * 1.2756274E7d <= 150.0d) {
                    tl1Var.b++;
                    tl1Var.c = (tl1Var.c || !zIsEmpty) ? i5 : 0;
                    tl1Var.d = (tl1Var.d || !zIsEmpty2) ? i5 : 0;
                    tl1Var.e = (tl1Var.e || !zIsEmpty3) ? i5 : 0;
                    i3 = i5;
                    break;
                }
                i4 = i7 + 1;
                i3 = i5;
                size = i6;
            }
        }
        if (arrayList.size() > i3) {
            ez.Z(arrayList, new gq0(13));
        }
        ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj = arrayList.get(i8);
            i8++;
            tl1 tl1Var2 = (tl1) obj;
            ArrayList arrayList3 = new ArrayList();
            boolean z4 = tl1Var2.c;
            LocationRecord locationRecord2 = tl1Var2.a;
            if (z4) {
                arrayList3.add("Wi-Fi");
            }
            if (tl1Var2.d) {
                String string2 = ul1Var2.j.getString(2131625110);
                string2.getClass();
                arrayList3.add(string2);
            }
            if (tl1Var2.e) {
                String string3 = ul1Var2.j.getString(2131625111);
                string3.getClass();
                arrayList3.add(string3);
            }
            String strK = !arrayList3.isEmpty() ? az2.k(" [", zy.s0(arrayList3, ", ", null, null, null, 62), "]") : "";
            if (locationRecord2.getRemark().length() > 0) {
                string = locationRecord2.getRemark();
            } else if (locationRecord2.getPlaceName().length() > 0) {
                string = locationRecord2.getPlaceName();
            } else {
                string = ul1Var2.j.getString(2131624582);
                string.getClass();
            }
            String string4 = ul1Var2.j.getString(2131624346, new Integer(tl1Var2.b));
            string4.getClass();
            String strY = az2.y(string, strK);
            StringBuilder sbT = p91.t(string4, " (", String.format("%.4f", Arrays.copyOf(new Object[]{new Double(locationRecord2.getLat())}, 1)), ", ", String.format("%.4f", Arrays.copyOf(new Object[]{new Double(locationRecord2.getLng())}, 1)));
            sbT.append(")");
            arrayList2.add(new sn(strY, sbT.toString(), locationRecord2.getLat(), locationRecord2.getLng(), ""));
        }
        return arrayList2;
    }

    public static final int g(ul1 ul1Var, JSONObject jSONObject, String[] strArr, int i) {
        ul1Var.getClass();
        for (String str : strArr) {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                int iOptInt = jSONObject.optInt(str, Integer.MIN_VALUE);
                if (iOptInt > 0) {
                    return iOptInt;
                }
                String strOptString = jSONObject.optString(str);
                strOptString.getClass();
                Integer numA0 = s13.a0(strOptString);
                if (numA0 != null && numA0.intValue() > 0) {
                    return numA0.intValue();
                }
            }
        }
        return i;
    }

    public static final void h(ul1 ul1Var) {
        if (((AppState) ul1Var.x.getValue()).isSpoofingActive()) {
            BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new sl1(ul1Var, null, 11), 3, null);
        }
    }

    public static final void i(ul1 ul1Var, String str) {
        ul1Var.getClass();
        str.getClass();
        SettingsRepository settingsRepository = ul1Var.c;
        String str2 = str;
        settingsRepository.setLanguage(str2);
        settingsRepository.setLanguageSet(true);
        MutableStateFlow mutableStateFlow = ul1Var.x;
        while (true) {
            Object value = mutableStateFlow.getValue();
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, true, str2, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -49, -1, 134217727, null))) {
                return;
            } else {
                str2 = str;
            }
        }
    }

    public static final void j(ul1 ul1Var, String str) {
        Object value;
        ul1Var.getClass();
        ul1Var.c.setAltitude(str);
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, str, 0, null, false, false, false, null, null, -1, -1, 133693439, null)));
    }

    public static final void k(ul1 ul1Var, int i) {
        ul1Var.getClass();
        int iV = mh0.v(i, 0, 100);
        ul1Var.c.setAltitudeVariationM(iV);
        MutableStateFlow mutableStateFlow = ul1Var.x;
        while (true) {
            Object value = mutableStateFlow.getValue();
            int i2 = iV;
            if (mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, i2, null, false, false, false, null, null, -1, -1, 133169151, null))) {
                return;
            } else {
                iV = i2;
            }
        }
    }

    public static final void l(ul1 ul1Var, String str) {
        Object value;
        ul1Var.getClass();
        ul1Var.c.setSatelliteCount(str);
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, str, false, false, false, null, null, -1, -1, 132120575, null)));
    }

    public static final void m(ul1 ul1Var, SearchMode searchMode) {
        Object value;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, searchMode, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -17, 134217727, null)));
    }
}
