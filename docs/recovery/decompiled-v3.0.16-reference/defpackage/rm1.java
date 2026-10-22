package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.EnvironmentAvailabilityKt;
import com.vincenthzr.locationspoofer.data.model.WifiLoadStatus;
import com.vincenthzr.locationspoofer.data.repository.WifiRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class rm1 {
    public static final void a(ul1 ul1Var) {
        Object value;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        Job job = ul1Var.q;
        q60 q60Var = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        AppState appState = (AppState) mutableStateFlow.getValue();
        Double dR = r13.R(appState.getLatitudeInput());
        Double dR2 = r13.R(appState.getLongitudeInput());
        if (dR != null && dR2 != null) {
            ul1Var.q = BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new m(ul1Var, dR, dR2, q60Var, 15), 3, null);
        } else {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, WifiLoadStatus.IDLE, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, "[]", "[]", "[]", false, false, false, false, false, null, 0, null, false, false, false, null, null, Integer.MAX_VALUE, -4, 104843263, null)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0128, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r5, r6, r2) == r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r5, r6, r2) == r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019a, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r0, r12, r2) == r11) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ul1 r26, double r27, double r29, defpackage.r60 r31) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm1.b(ul1, double, double, r60):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0058: MOVE (r1 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:89), block:B:25:0x0058 */
    public static final Object c(ul1 ul1Var, double d, double d2, r60 r60Var) {
        km1 km1Var;
        ul1 ul1Var2;
        double d3;
        double d4;
        double d5;
        ul1 ul1Var3;
        double d6;
        double d7;
        ul1 ul1Var4;
        int i;
        double d8;
        ul1 ul1Var5 = ul1Var;
        if (r60Var instanceof km1) {
            km1Var = (km1) r60Var;
            int i2 = km1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                km1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                km1Var = new km1(r60Var);
            }
        } else {
            km1Var = new km1(r60Var);
        }
        km1 km1Var2 = km1Var;
        Object objCells = km1Var2.j;
        int i3 = km1Var2.k;
        mf3 mf3Var = mf3.a;
        q60 q60Var = null;
        z70 z70Var = z70.e;
        try {
            try {
                try {
                    if (i3 == 0) {
                        ee0.J(objCells);
                        z60 z60VarE = xq1.E(d, d2);
                        double d9 = z60VarE.a;
                        d6 = z60VarE.b;
                        j22 j22Var = ul1Var5.h;
                        km1Var2.e = ul1Var5;
                        km1Var2.f = d;
                        km1Var2.g = d2;
                        km1Var2.h = d9;
                        km1Var2.i = d6;
                        km1Var2.k = 1;
                        objCells = j22Var.a.cells(d9, d6, km1Var2);
                        if (objCells != z70Var) {
                            d3 = d9;
                            d4 = d2;
                            d5 = d;
                            ul1Var3 = ul1Var5;
                        }
                    }
                    try {
                        if (i3 == 1) {
                            double d10 = km1Var2.i;
                            d3 = km1Var2.h;
                            double d11 = km1Var2.g;
                            double d12 = km1Var2.f;
                            ul1 ul1Var6 = km1Var2.e;
                            ee0.J(objCells);
                            d4 = d11;
                            d5 = d12;
                            ul1Var3 = ul1Var6;
                            d6 = d10;
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    fo.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ul1 ul1Var7 = km1Var2.e;
                                ee0.J(objCells);
                                return mf3Var;
                            }
                            double d13 = km1Var2.i;
                            d3 = km1Var2.h;
                            double d14 = km1Var2.g;
                            d7 = km1Var2.f;
                            ul1 ul1Var8 = km1Var2.e;
                            ee0.J(objCells);
                            ul1Var4 = ul1Var8;
                            i = 2;
                            d8 = d14;
                            d6 = d13;
                        }
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        im1 im1Var = new im1(ul1Var4, q60Var, i);
                        km1Var2.e = ul1Var4;
                        km1Var2.f = d7;
                        km1Var2.g = d8;
                        km1Var2.h = d3;
                        km1Var2.i = d6;
                        km1Var2.k = 3;
                        return BuildersKt.withContext(main, im1Var, km1Var2) == z70Var ? z70Var : mf3Var;
                    } catch (Exception e) {
                        e = e;
                        ul1Var5 = ul1Var2;
                        on1.f(ul1Var5, e);
                        return mf3Var;
                    }
                    JSONArray jSONArray = new JSONArray((String) objCells);
                    if (jSONArray.length() > 0) {
                        JSONArray jSONArrayD = hn1.d(ul1Var3, jSONArray);
                        if (jSONArrayD.length() != 0) {
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            lm1 lm1Var = new lm1(ul1Var3, d5, d4, jSONArrayD, null, 0);
                            ul1Var4 = ul1Var3;
                            d7 = d5;
                            d8 = d4;
                            km1Var2.e = ul1Var4;
                            km1Var2.f = d7;
                            km1Var2.g = d8;
                            km1Var2.h = d3;
                            km1Var2.i = d6;
                            i = 2;
                            km1Var2.k = 2;
                            if (BuildersKt.withContext(io2, lm1Var, km1Var2) != z70Var) {
                                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                                im1 im1Var2 = new im1(ul1Var4, q60Var, i);
                                km1Var2.e = ul1Var4;
                                km1Var2.f = d7;
                                km1Var2.g = d8;
                                km1Var2.h = d3;
                                km1Var2.i = d6;
                                km1Var2.k = 3;
                                if (BuildersKt.withContext(main2, im1Var2, km1Var2) == z70Var) {
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    ul1Var5 = ul1Var3;
                    on1.f(ul1Var5, e);
                    return mf3Var;
                }
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static final void d(ul1 ul1Var, Context context, pu0 pu0Var) {
        ul1Var.getClass();
        context.getClass();
        Job job = ul1Var.s;
        q60 q60Var = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        ul1Var.s = BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getMain(), null, new m(context, ul1Var, pu0Var, q60Var, 16), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:188:0x042a  */
    /* JADX WARN: Code duplicated, block: B:236:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:59:0x0174 A[Catch: Exception -> 0x0184, CancellationException -> 0x018e, TryCatch #21 {CancellationException -> 0x018e, Exception -> 0x0184, blocks: (B:56:0x016d, B:59:0x0174, B:61:0x0180), top: B:236:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0180 A[Catch: Exception -> 0x0184, CancellationException -> 0x018e, TRY_LEAVE, TryCatch #21 {CancellationException -> 0x018e, Exception -> 0x0184, blocks: (B:56:0x016d, B:59:0x0174, B:61:0x0180), top: B:236:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2 A[Catch: Exception -> 0x03a8, CancellationException -> 0x03ac, TRY_LEAVE, TryCatch #27 {CancellationException -> 0x03ac, Exception -> 0x03a8, blocks: (B:52:0x0158, B:69:0x019c, B:71:0x01a2), top: B:224:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0223  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:83:0x023f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0242  */
    public static final Object e(ul1 ul1Var, double d, double d2, r60 r60Var) {
        mm1 mm1Var;
        double d3;
        z70 z70Var;
        double d4;
        ul1 ul1Var2;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        z70 z70Var2;
        double d11;
        ul1 ul1Var3;
        double d12;
        double d13;
        double d14;
        ul1 ul1Var4;
        double d15;
        double d16;
        mm1 mm1Var2;
        double d17;
        ul1 ul1Var5;
        double d18;
        CancellationException cancellationException;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        int length;
        int i;
        MainCoroutineDispatcher main;
        nm1 nm1Var;
        JSONArray jSONArray3;
        int length2;
        int i2;
        mm1 mm1Var3;
        double d19;
        CoroutineDispatcher io2;
        lm1 lm1Var;
        double d20;
        int i3;
        double d21;
        int i4;
        mm1 mm1Var4;
        JSONObject jSONObjectOptJSONObject;
        double d22;
        ul1 ul1Var6;
        MainCoroutineDispatcher main2;
        om1 om1Var;
        MainCoroutineDispatcher main3;
        nm1 nm1Var2;
        y70 y70VarPlus;
        nm1 nm1Var3;
        if (r60Var instanceof mm1) {
            mm1Var = (mm1) r60Var;
            int i5 = mm1Var.l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mm1Var.l = i5 - Integer.MIN_VALUE;
            } else {
                mm1Var = new mm1(r60Var);
            }
        } else {
            mm1Var = new mm1(r60Var);
        }
        Object objFetchWifiData = mm1Var.k;
        int i6 = mm1Var.l;
        z70 z70Var3 = z70.e;
        switch (i6) {
            case 0:
                ee0.J(objFetchWifiData);
                MainCoroutineDispatcher main4 = Dispatchers.getMain();
                nm1 nm1Var4 = new nm1(ul1Var, d, d2, null, 0);
                mm1Var.e = ul1Var;
                d3 = d;
                mm1Var.g = d3;
                mm1Var.h = d2;
                mm1Var.l = 1;
                z70Var = z70Var3;
                if (BuildersKt.withContext(main4, nm1Var4, mm1Var) != z70Var) {
                    d4 = d2;
                    ul1Var2 = ul1Var;
                    z60 z60VarE = xq1.E(d3, d4);
                    d5 = z60VarE.a;
                    d6 = z60VarE.b;
                    try {
                        WifiRepository wifiRepository = ul1Var2.g;
                        mm1Var.e = ul1Var2;
                        mm1Var.g = d3;
                        mm1Var.h = d4;
                        mm1Var.i = d5;
                        mm1Var.j = d6;
                        mm1Var.l = 2;
                        mm1Var2 = mm1Var;
                        try {
                            objFetchWifiData = wifiRepository.fetchWifiData(d5, d6, mm1Var2);
                            d8 = d6;
                            mm1Var = mm1Var2;
                            if (objFetchWifiData != z70Var) {
                                d17 = d3;
                                ul1Var5 = ul1Var2;
                                d18 = d4;
                                d12 = d5;
                                try {
                                    jSONArray = new JSONArray((String) objFetchWifiData);
                                    jSONArray2 = new JSONArray();
                                    length = jSONArray.length();
                                    for (i = 0; i < length; i++) {
                                        try {
                                            jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                                            if (jSONObjectOptJSONObject != null) {
                                                vl0 vl0Var = vl0.a;
                                                if (vl0.c(jSONObjectOptJSONObject.optString("bssid"))) {
                                                    jSONArray2.put(jSONObjectOptJSONObject);
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (CancellationException e) {
                                            e = e;
                                            d16 = d8;
                                            z70Var2 = z70Var;
                                            ul1Var4 = ul1Var5;
                                            d14 = d17;
                                            d15 = d18;
                                            cancellationException = e;
                                            y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                            nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                            mm1Var.e = null;
                                            mm1Var.f = cancellationException;
                                            mm1Var.g = d14;
                                            mm1Var.h = d15;
                                            mm1Var.i = d12;
                                            mm1Var.j = d16;
                                            mm1Var.l = 6;
                                            if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                return z70Var2;
                                            }
                                            throw cancellationException;
                                        } catch (Exception e2) {
                                            e = e2;
                                            z70Var2 = z70Var;
                                            ul1Var3 = ul1Var5;
                                            d11 = d17;
                                            d13 = d18;
                                            if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                on1.f(ul1Var3, e);
                                            }
                                            main3 = Dispatchers.getMain();
                                            ul1 ul1Var7 = ul1Var3;
                                            double d23 = d11;
                                            nm1Var2 = new nm1(ul1Var7, d23, d13, null, 3);
                                            mm1Var.e = null;
                                            mm1Var.f = null;
                                            mm1Var.g = d11;
                                            mm1Var.h = d13;
                                            mm1Var.i = d12;
                                            mm1Var.j = d8;
                                            mm1Var.l = 7;
                                            if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                return z70Var2;
                                            }
                                            return mf3.a;
                                        }
                                    }
                                    if (jSONArray2.length() > 0) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("isConnected", true);
                                        JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                        String strOptString = jSONObject2.optString("bssid");
                                        String strOptString2 = jSONObject2.optString("ssid");
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("bssid", strOptString);
                                        jSONObject3.put("ssid", strOptString2);
                                        jSONObject3.put("vendor", ok1.b(strOptString));
                                        jSONObject3.put("level", -45);
                                        z70Var2 = z70Var;
                                        try {
                                            int iOptInt = jSONObject2.optInt("frequency", 2412);
                                            jSONObject3.put("frequency", iOptInt);
                                            jSONObject3.put("channel", ok1.a(iOptInt));
                                            d16 = d8;
                                            try {
                                                jSONObject3.put("capabilities", jSONObject2.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
                                                jSONObject3.put("macAddress", "02:00:00:00:00:00");
                                                jSONObject3.put("linkSpeed", 150);
                                                jSONObject3.put("networkId", 1);
                                                jSONObject3.put("wifiStandard", 4);
                                                jSONObject.put("connectedWifi", jSONObject3);
                                                jSONArray3 = new JSONArray();
                                                length2 = jSONArray2.length();
                                                i2 = 0;
                                                while (i2 < length2) {
                                                    int i7 = length2;
                                                    try {
                                                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                                                        JSONArray jSONArray4 = jSONArray2;
                                                        String strOptString3 = jSONObject4.optString("bssid");
                                                        i3 = i2;
                                                        String strOptString4 = jSONObject4.optString("ssid");
                                                        d21 = d12;
                                                        int i8 = (-50) - (i3 * 2);
                                                        try {
                                                            if (i3 % 2 == 0) {
                                                                i4 = 2412;
                                                            } else {
                                                                i4 = 5180;
                                                            }
                                                            int iOptInt2 = jSONObject4.optInt("frequency", i4);
                                                            mm1Var4 = mm1Var;
                                                            try {
                                                                JSONObject jSONObject5 = new JSONObject();
                                                                jSONObject5.put("bssid", strOptString3);
                                                                jSONObject5.put("ssid", strOptString4);
                                                                jSONObject5.put("vendor", ok1.b(strOptString3));
                                                                jSONObject5.put("level", i8);
                                                                jSONObject5.put("capabilities", jSONObject4.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
                                                                jSONObject5.put("frequency", iOptInt2);
                                                                jSONObject5.put("channel", ok1.a(iOptInt2));
                                                                jSONArray3.put(jSONObject5);
                                                                i2 = i3 + 1;
                                                                length2 = i7;
                                                                jSONArray2 = jSONArray4;
                                                                d12 = d21;
                                                                mm1Var = mm1Var4;
                                                            } catch (CancellationException e3) {
                                                                d12 = d21;
                                                                cancellationException = e3;
                                                                mm1Var = mm1Var4;
                                                                ul1Var4 = ul1Var5;
                                                                d14 = d17;
                                                                d15 = d18;
                                                                y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                                nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                                mm1Var.e = null;
                                                                mm1Var.f = cancellationException;
                                                                mm1Var.g = d14;
                                                                mm1Var.h = d15;
                                                                mm1Var.i = d12;
                                                                mm1Var.j = d16;
                                                                mm1Var.l = 6;
                                                                if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                                    return z70Var2;
                                                                }
                                                                throw cancellationException;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                d12 = d21;
                                                                z70Var2 = z70Var2;
                                                                d8 = d16;
                                                                mm1Var = mm1Var4;
                                                                ul1Var3 = ul1Var5;
                                                                d11 = d17;
                                                                d13 = d18;
                                                                if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                                    on1.f(ul1Var3, e);
                                                                }
                                                                main3 = Dispatchers.getMain();
                                                                ul1 ul1Var8 = ul1Var3;
                                                                double d24 = d11;
                                                                nm1Var2 = new nm1(ul1Var8, d24, d13, null, 3);
                                                                mm1Var.e = null;
                                                                mm1Var.f = null;
                                                                mm1Var.g = d11;
                                                                mm1Var.h = d13;
                                                                mm1Var.i = d12;
                                                                mm1Var.j = d8;
                                                                mm1Var.l = 7;
                                                                if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                                    return z70Var2;
                                                                }
                                                                return mf3.a;
                                                            }
                                                        } catch (CancellationException e5) {
                                                            e = e5;
                                                            d12 = d21;
                                                            cancellationException = e;
                                                            ul1Var4 = ul1Var5;
                                                            d14 = d17;
                                                            d15 = d18;
                                                            y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                            nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                            mm1Var.e = null;
                                                            mm1Var.f = cancellationException;
                                                            mm1Var.g = d14;
                                                            mm1Var.h = d15;
                                                            mm1Var.i = d12;
                                                            mm1Var.j = d16;
                                                            mm1Var.l = 6;
                                                            if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                                return z70Var2;
                                                            }
                                                            throw cancellationException;
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            d12 = d21;
                                                            z70Var2 = z70Var2;
                                                            d8 = d16;
                                                            ul1Var3 = ul1Var5;
                                                            d11 = d17;
                                                            d13 = d18;
                                                            if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                                on1.f(ul1Var3, e);
                                                            }
                                                            main3 = Dispatchers.getMain();
                                                            ul1 ul1Var9 = ul1Var3;
                                                            double d25 = d11;
                                                            nm1Var2 = new nm1(ul1Var9, d25, d13, null, 3);
                                                            mm1Var.e = null;
                                                            mm1Var.f = null;
                                                            mm1Var.g = d11;
                                                            mm1Var.h = d13;
                                                            mm1Var.i = d12;
                                                            mm1Var.j = d8;
                                                            mm1Var.l = 7;
                                                            if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                                return z70Var2;
                                                            }
                                                            return mf3.a;
                                                        }
                                                    } catch (CancellationException e7) {
                                                        e = e7;
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                    }
                                                }
                                                mm1Var3 = mm1Var;
                                                d19 = d12;
                                                try {
                                                    jSONObject.put("nearbyWifi", jSONArray3);
                                                    String string = jSONObject.toString();
                                                    string.getClass();
                                                    io2 = Dispatchers.getIO();
                                                    lm1Var = new lm1(ul1Var5, d17, d18, string, null, 1);
                                                    ul1Var3 = ul1Var5;
                                                    d11 = d17;
                                                    d13 = d18;
                                                    mm1Var = mm1Var3;
                                                    try {
                                                        mm1Var.e = ul1Var3;
                                                        mm1Var.f = null;
                                                        mm1Var.g = d11;
                                                        mm1Var.h = d13;
                                                        d12 = d19;
                                                        try {
                                                            mm1Var.i = d12;
                                                            d16 = d16;
                                                            try {
                                                                mm1Var.j = d16;
                                                                mm1Var.l = 3;
                                                                z70Var2 = z70Var2;
                                                                if (BuildersKt.withContext(io2, lm1Var, mm1Var) == z70Var2) {
                                                                    return z70Var2;
                                                                }
                                                                d20 = d11;
                                                                d8 = d16;
                                                                d22 = d13;
                                                                ul1Var6 = ul1Var3;
                                                                try {
                                                                    main2 = Dispatchers.getMain();
                                                                    om1Var = new om1(ul1Var6, d20, d22, null);
                                                                    ul1Var3 = ul1Var6;
                                                                    d11 = d20;
                                                                    d13 = d22;
                                                                    try {
                                                                        mm1Var.e = ul1Var3;
                                                                        mm1Var.f = null;
                                                                        mm1Var.g = d11;
                                                                        mm1Var.h = d13;
                                                                        mm1Var.i = d12;
                                                                        mm1Var.j = d8;
                                                                        mm1Var.l = 4;
                                                                        if (BuildersKt.withContext(main2, om1Var, mm1Var) == z70Var2) {
                                                                            return z70Var2;
                                                                        }
                                                                    } catch (CancellationException e9) {
                                                                        e = e9;
                                                                        d16 = d8;
                                                                        d15 = d13;
                                                                        ul1Var4 = ul1Var3;
                                                                        d14 = d11;
                                                                        cancellationException = e;
                                                                        y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                                        nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                                        mm1Var.e = null;
                                                                        mm1Var.f = cancellationException;
                                                                        mm1Var.g = d14;
                                                                        mm1Var.h = d15;
                                                                        mm1Var.i = d12;
                                                                        mm1Var.j = d16;
                                                                        mm1Var.l = 6;
                                                                        if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                                            return z70Var2;
                                                                        }
                                                                        throw cancellationException;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                                            on1.f(ul1Var3, e);
                                                                        }
                                                                        main3 = Dispatchers.getMain();
                                                                        ul1 ul1Var10 = ul1Var3;
                                                                        double d26 = d11;
                                                                        nm1Var2 = new nm1(ul1Var10, d26, d13, null, 3);
                                                                        mm1Var.e = null;
                                                                        mm1Var.f = null;
                                                                        mm1Var.g = d11;
                                                                        mm1Var.h = d13;
                                                                        mm1Var.i = d12;
                                                                        mm1Var.j = d8;
                                                                        mm1Var.l = 7;
                                                                        if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                                            return z70Var2;
                                                                        }
                                                                    }
                                                                } catch (CancellationException e11) {
                                                                    e = e11;
                                                                    ul1Var3 = ul1Var6;
                                                                    d11 = d20;
                                                                    d13 = d22;
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    ul1Var3 = ul1Var6;
                                                                    d11 = d20;
                                                                    d13 = d22;
                                                                }
                                                            } catch (CancellationException e13) {
                                                                e = e13;
                                                                z70Var2 = z70Var2;
                                                                cancellationException = e;
                                                                d15 = d13;
                                                                ul1Var4 = ul1Var3;
                                                                d14 = d11;
                                                                y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                                nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                                mm1Var.e = null;
                                                                mm1Var.f = cancellationException;
                                                                mm1Var.g = d14;
                                                                mm1Var.h = d15;
                                                                mm1Var.i = d12;
                                                                mm1Var.j = d16;
                                                                mm1Var.l = 6;
                                                                if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                                    return z70Var2;
                                                                }
                                                                throw cancellationException;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                z70Var2 = z70Var2;
                                                                d8 = d16;
                                                                if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                                    on1.f(ul1Var3, e);
                                                                }
                                                                main3 = Dispatchers.getMain();
                                                                ul1 ul1Var11 = ul1Var3;
                                                                double d27 = d11;
                                                                nm1Var2 = new nm1(ul1Var11, d27, d13, null, 3);
                                                                mm1Var.e = null;
                                                                mm1Var.f = null;
                                                                mm1Var.g = d11;
                                                                mm1Var.h = d13;
                                                                mm1Var.i = d12;
                                                                mm1Var.j = d8;
                                                                mm1Var.l = 7;
                                                                if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                                    return z70Var2;
                                                                }
                                                                return mf3.a;
                                                            }
                                                        } catch (CancellationException e15) {
                                                            e = e15;
                                                            z70Var2 = z70Var2;
                                                            d16 = d16;
                                                            cancellationException = e;
                                                            d15 = d13;
                                                            ul1Var4 = ul1Var3;
                                                            d14 = d11;
                                                            y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                            nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                            mm1Var.e = null;
                                                            mm1Var.f = cancellationException;
                                                            mm1Var.g = d14;
                                                            mm1Var.h = d15;
                                                            mm1Var.i = d12;
                                                            mm1Var.j = d16;
                                                            mm1Var.l = 6;
                                                            if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                                return z70Var2;
                                                            }
                                                            throw cancellationException;
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            z70Var2 = z70Var2;
                                                            d16 = d16;
                                                            d8 = d16;
                                                            if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                                on1.f(ul1Var3, e);
                                                            }
                                                            main3 = Dispatchers.getMain();
                                                            ul1 ul1Var12 = ul1Var3;
                                                            double d28 = d11;
                                                            nm1Var2 = new nm1(ul1Var12, d28, d13, null, 3);
                                                            mm1Var.e = null;
                                                            mm1Var.f = null;
                                                            mm1Var.g = d11;
                                                            mm1Var.h = d13;
                                                            mm1Var.i = d12;
                                                            mm1Var.j = d8;
                                                            mm1Var.l = 7;
                                                            if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                                return z70Var2;
                                                            }
                                                            return mf3.a;
                                                        }
                                                    } catch (CancellationException e17) {
                                                        e = e17;
                                                        d12 = d19;
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        d12 = d19;
                                                    }
                                                } catch (CancellationException e19) {
                                                    e = e19;
                                                    d12 = d19;
                                                    z70Var2 = z70Var2;
                                                    d16 = d16;
                                                    mm1Var = mm1Var3;
                                                    ul1Var3 = ul1Var5;
                                                    d11 = d17;
                                                    d13 = d18;
                                                    cancellationException = e;
                                                    d15 = d13;
                                                    ul1Var4 = ul1Var3;
                                                    d14 = d11;
                                                    y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                    nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                    mm1Var.e = null;
                                                    mm1Var.f = cancellationException;
                                                    mm1Var.g = d14;
                                                    mm1Var.h = d15;
                                                    mm1Var.i = d12;
                                                    mm1Var.j = d16;
                                                    mm1Var.l = 6;
                                                    if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                        return z70Var2;
                                                    }
                                                    throw cancellationException;
                                                } catch (Exception e20) {
                                                    e = e20;
                                                    d12 = d19;
                                                    z70Var2 = z70Var2;
                                                    d16 = d16;
                                                    mm1Var = mm1Var3;
                                                    ul1Var3 = ul1Var5;
                                                    d11 = d17;
                                                    d13 = d18;
                                                    d8 = d16;
                                                    if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                        on1.f(ul1Var3, e);
                                                    }
                                                    main3 = Dispatchers.getMain();
                                                    ul1 ul1Var13 = ul1Var3;
                                                    double d29 = d11;
                                                    nm1Var2 = new nm1(ul1Var13, d29, d13, null, 3);
                                                    mm1Var.e = null;
                                                    mm1Var.f = null;
                                                    mm1Var.g = d11;
                                                    mm1Var.h = d13;
                                                    mm1Var.i = d12;
                                                    mm1Var.j = d8;
                                                    mm1Var.l = 7;
                                                    if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                        return z70Var2;
                                                    }
                                                    return mf3.a;
                                                }
                                            } catch (CancellationException e21) {
                                                e = e21;
                                                z70Var2 = z70Var2;
                                                d16 = d16;
                                            } catch (Exception e22) {
                                                e = e22;
                                                z70Var2 = z70Var2;
                                                d16 = d16;
                                            }
                                        } catch (CancellationException e23) {
                                            e = e23;
                                            z70Var2 = z70Var2;
                                            d16 = d8;
                                        } catch (Exception e24) {
                                            e = e24;
                                            z70Var2 = z70Var2;
                                        }
                                    } else {
                                        d16 = d8;
                                        z70Var2 = z70Var;
                                        ul1Var3 = ul1Var5;
                                        d11 = d17;
                                        d13 = d18;
                                        try {
                                            main = Dispatchers.getMain();
                                            d18 = d13;
                                            ul1Var5 = ul1Var3;
                                            d17 = d11;
                                            try {
                                                nm1Var = new nm1(ul1Var5, d17, d18, null, 1);
                                                mm1Var.e = ul1Var3;
                                                mm1Var.f = null;
                                                mm1Var.g = d11;
                                                mm1Var.h = d13;
                                                mm1Var.i = d12;
                                                mm1Var.j = d16;
                                                mm1Var.l = 5;
                                                if (BuildersKt.withContext(main, nm1Var, mm1Var) == z70Var2) {
                                                    return z70Var2;
                                                }
                                            } catch (CancellationException e25) {
                                                e = e25;
                                                ul1Var3 = ul1Var5;
                                                d11 = d17;
                                                d13 = d18;
                                                cancellationException = e;
                                                d15 = d13;
                                                ul1Var4 = ul1Var3;
                                                d14 = d11;
                                                y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                                nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                                mm1Var.e = null;
                                                mm1Var.f = cancellationException;
                                                mm1Var.g = d14;
                                                mm1Var.h = d15;
                                                mm1Var.i = d12;
                                                mm1Var.j = d16;
                                                mm1Var.l = 6;
                                                if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                    return z70Var2;
                                                }
                                                throw cancellationException;
                                            } catch (Exception e26) {
                                                e = e26;
                                                ul1Var3 = ul1Var5;
                                                d11 = d17;
                                                d13 = d18;
                                                d8 = d16;
                                                if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                    on1.f(ul1Var3, e);
                                                }
                                                main3 = Dispatchers.getMain();
                                                ul1 ul1Var14 = ul1Var3;
                                                double d210 = d11;
                                                nm1Var2 = new nm1(ul1Var14, d210, d13, null, 3);
                                                mm1Var.e = null;
                                                mm1Var.f = null;
                                                mm1Var.g = d11;
                                                mm1Var.h = d13;
                                                mm1Var.i = d12;
                                                mm1Var.j = d8;
                                                mm1Var.l = 7;
                                                if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                    return z70Var2;
                                                }
                                            }
                                        } catch (CancellationException e27) {
                                            e = e27;
                                            cancellationException = e;
                                            d15 = d13;
                                            ul1Var4 = ul1Var3;
                                            d14 = d11;
                                            y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                                            nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                                            mm1Var.e = null;
                                            mm1Var.f = cancellationException;
                                            mm1Var.g = d14;
                                            mm1Var.h = d15;
                                            mm1Var.i = d12;
                                            mm1Var.j = d16;
                                            mm1Var.l = 6;
                                            if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                                return z70Var2;
                                            }
                                            throw cancellationException;
                                        } catch (Exception e28) {
                                            e = e28;
                                            d8 = d16;
                                            if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                                on1.f(ul1Var3, e);
                                            }
                                            main3 = Dispatchers.getMain();
                                            ul1 ul1Var15 = ul1Var3;
                                            double d211 = d11;
                                            nm1Var2 = new nm1(ul1Var15, d211, d13, null, 3);
                                            mm1Var.e = null;
                                            mm1Var.f = null;
                                            mm1Var.g = d11;
                                            mm1Var.h = d13;
                                            mm1Var.i = d12;
                                            mm1Var.j = d8;
                                            mm1Var.l = 7;
                                            if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                                return z70Var2;
                                            }
                                        }
                                    }
                                } catch (CancellationException e29) {
                                    e = e29;
                                    d16 = d8;
                                    z70Var2 = z70Var;
                                } catch (Exception e30) {
                                    e = e30;
                                }
                                return mf3.a;
                            }
                        } catch (CancellationException e31) {
                            e = e31;
                            d9 = d5;
                            d10 = d6;
                            mm1Var = mm1Var2;
                            z70Var2 = z70Var;
                            d14 = d3;
                            ul1Var4 = ul1Var2;
                            d15 = d4;
                            d16 = d10;
                            d12 = d9;
                            cancellationException = e;
                            y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                            nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                            mm1Var.e = null;
                            mm1Var.f = cancellationException;
                            mm1Var.g = d14;
                            mm1Var.h = d15;
                            mm1Var.i = d12;
                            mm1Var.j = d16;
                            mm1Var.l = 6;
                            if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                                return z70Var2;
                            }
                            throw cancellationException;
                        } catch (Exception e32) {
                            e = e32;
                            d7 = d5;
                            d8 = d6;
                            mm1Var = mm1Var2;
                            z70Var2 = z70Var;
                            d11 = d3;
                            ul1Var3 = ul1Var2;
                            d12 = d7;
                            d13 = d4;
                            if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                                on1.f(ul1Var3, e);
                            }
                            main3 = Dispatchers.getMain();
                            ul1 ul1Var16 = ul1Var3;
                            double d212 = d11;
                            nm1Var2 = new nm1(ul1Var16, d212, d13, null, 3);
                            mm1Var.e = null;
                            mm1Var.f = null;
                            mm1Var.g = d11;
                            mm1Var.h = d13;
                            mm1Var.i = d12;
                            mm1Var.j = d8;
                            mm1Var.l = 7;
                            if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                                return z70Var2;
                            }
                            return mf3.a;
                        }
                    } catch (CancellationException e33) {
                        e = e33;
                        d9 = d5;
                        d10 = d6;
                    } catch (Exception e34) {
                        e = e34;
                        d7 = d5;
                        d8 = d6;
                    }
                }
                return z70Var;
            case 1:
                double d30 = mm1Var.h;
                d3 = mm1Var.g;
                ul1Var2 = mm1Var.e;
                ee0.J(objFetchWifiData);
                d4 = d30;
                z70Var = z70Var3;
                z60 z60VarE2 = xq1.E(d3, d4);
                d5 = z60VarE2.a;
                d6 = z60VarE2.b;
                WifiRepository wifiRepository2 = ul1Var2.g;
                mm1Var.e = ul1Var2;
                mm1Var.g = d3;
                mm1Var.h = d4;
                mm1Var.i = d5;
                mm1Var.j = d6;
                mm1Var.l = 2;
                mm1Var2 = mm1Var;
                objFetchWifiData = wifiRepository2.fetchWifiData(d5, d6, mm1Var2);
                d8 = d6;
                mm1Var = mm1Var2;
                if (objFetchWifiData != z70Var) {
                    d17 = d3;
                    ul1Var5 = ul1Var2;
                    d18 = d4;
                    d12 = d5;
                    jSONArray = new JSONArray((String) objFetchWifiData);
                    jSONArray2 = new JSONArray();
                    length = jSONArray.length();
                    while (i < length) {
                        jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            vl0 vl0Var2 = vl0.a;
                            if (vl0.c(jSONObjectOptJSONObject.optString("bssid"))) {
                                jSONArray2.put(jSONObjectOptJSONObject);
                            } else {
                                continue;
                            }
                        }
                    }
                    if (jSONArray2.length() > 0) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("isConnected", true);
                        JSONObject jSONObject7 = jSONArray2.getJSONObject(0);
                        String strOptString5 = jSONObject7.optString("bssid");
                        String strOptString6 = jSONObject7.optString("ssid");
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("bssid", strOptString5);
                        jSONObject8.put("ssid", strOptString6);
                        jSONObject8.put("vendor", ok1.b(strOptString5));
                        jSONObject8.put("level", -45);
                        z70Var2 = z70Var;
                        int iOptInt3 = jSONObject7.optInt("frequency", 2412);
                        jSONObject8.put("frequency", iOptInt3);
                        jSONObject8.put("channel", ok1.a(iOptInt3));
                        d16 = d8;
                        jSONObject8.put("capabilities", jSONObject7.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
                        jSONObject8.put("macAddress", "02:00:00:00:00:00");
                        jSONObject8.put("linkSpeed", 150);
                        jSONObject8.put("networkId", 1);
                        jSONObject8.put("wifiStandard", 4);
                        jSONObject6.put("connectedWifi", jSONObject8);
                        jSONArray3 = new JSONArray();
                        length2 = jSONArray2.length();
                        i2 = 0;
                        while (i2 < length2) {
                            int i9 = length2;
                            JSONObject jSONObject9 = jSONArray2.getJSONObject(i2);
                            JSONArray jSONArray5 = jSONArray2;
                            String strOptString7 = jSONObject9.optString("bssid");
                            i3 = i2;
                            String strOptString8 = jSONObject9.optString("ssid");
                            d21 = d12;
                            int i10 = (-50) - (i3 * 2);
                            if (i3 % 2 == 0) {
                                i4 = 2412;
                            } else {
                                i4 = 5180;
                            }
                            int iOptInt4 = jSONObject9.optInt("frequency", i4);
                            mm1Var4 = mm1Var;
                            JSONObject jSONObject10 = new JSONObject();
                            jSONObject10.put("bssid", strOptString7);
                            jSONObject10.put("ssid", strOptString8);
                            jSONObject10.put("vendor", ok1.b(strOptString7));
                            jSONObject10.put("level", i10);
                            jSONObject10.put("capabilities", jSONObject9.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
                            jSONObject10.put("frequency", iOptInt4);
                            jSONObject10.put("channel", ok1.a(iOptInt4));
                            jSONArray3.put(jSONObject10);
                            i2 = i3 + 1;
                            length2 = i9;
                            jSONArray2 = jSONArray5;
                            d12 = d21;
                            mm1Var = mm1Var4;
                        }
                        mm1Var3 = mm1Var;
                        d19 = d12;
                        jSONObject6.put("nearbyWifi", jSONArray3);
                        String string2 = jSONObject6.toString();
                        string2.getClass();
                        io2 = Dispatchers.getIO();
                        lm1Var = new lm1(ul1Var5, d17, d18, string2, null, 1);
                        ul1Var3 = ul1Var5;
                        d11 = d17;
                        d13 = d18;
                        mm1Var = mm1Var3;
                        mm1Var.e = ul1Var3;
                        mm1Var.f = null;
                        mm1Var.g = d11;
                        mm1Var.h = d13;
                        d12 = d19;
                        mm1Var.i = d12;
                        d16 = d16;
                        mm1Var.j = d16;
                        mm1Var.l = 3;
                        z70Var2 = z70Var2;
                        if (BuildersKt.withContext(io2, lm1Var, mm1Var) == z70Var2) {
                            return z70Var2;
                        }
                        d20 = d11;
                        d8 = d16;
                        d22 = d13;
                        ul1Var6 = ul1Var3;
                        main2 = Dispatchers.getMain();
                        om1Var = new om1(ul1Var6, d20, d22, null);
                        ul1Var3 = ul1Var6;
                        d11 = d20;
                        d13 = d22;
                        mm1Var.e = ul1Var3;
                        mm1Var.f = null;
                        mm1Var.g = d11;
                        mm1Var.h = d13;
                        mm1Var.i = d12;
                        mm1Var.j = d8;
                        mm1Var.l = 4;
                        if (BuildersKt.withContext(main2, om1Var, mm1Var) == z70Var2) {
                            return z70Var2;
                        }
                    } else {
                        d16 = d8;
                        z70Var2 = z70Var;
                        ul1Var3 = ul1Var5;
                        d11 = d17;
                        d13 = d18;
                        main = Dispatchers.getMain();
                        d18 = d13;
                        ul1Var5 = ul1Var3;
                        d17 = d11;
                        nm1Var = new nm1(ul1Var5, d17, d18, null, 1);
                        mm1Var.e = ul1Var3;
                        mm1Var.f = null;
                        mm1Var.g = d11;
                        mm1Var.h = d13;
                        mm1Var.i = d12;
                        mm1Var.j = d16;
                        mm1Var.l = 5;
                        if (BuildersKt.withContext(main, nm1Var, mm1Var) == z70Var2) {
                            return z70Var2;
                        }
                    }
                    return mf3.a;
                }
                return z70Var;
            case 2:
                d16 = mm1Var.j;
                d12 = mm1Var.i;
                double d31 = mm1Var.h;
                d11 = mm1Var.g;
                ul1 ul1Var17 = mm1Var.e;
                try {
                    ee0.J(objFetchWifiData);
                    d18 = d31;
                    d17 = d11;
                    ul1Var5 = ul1Var17;
                    z70Var = z70Var3;
                    d8 = d16;
                    jSONArray = new JSONArray((String) objFetchWifiData);
                    jSONArray2 = new JSONArray();
                    length = jSONArray.length();
                    while (i < length) {
                        jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            vl0 vl0Var3 = vl0.a;
                            if (vl0.c(jSONObjectOptJSONObject.optString("bssid"))) {
                                jSONArray2.put(jSONObjectOptJSONObject);
                            } else {
                                continue;
                            }
                        }
                    }
                    if (jSONArray2.length() > 0) {
                        JSONObject jSONObject11 = new JSONObject();
                        jSONObject11.put("isConnected", true);
                        JSONObject jSONObject12 = jSONArray2.getJSONObject(0);
                        String strOptString9 = jSONObject12.optString("bssid");
                        String strOptString10 = jSONObject12.optString("ssid");
                        JSONObject jSONObject13 = new JSONObject();
                        jSONObject13.put("bssid", strOptString9);
                        jSONObject13.put("ssid", strOptString10);
                        jSONObject13.put("vendor", ok1.b(strOptString9));
                        jSONObject13.put("level", -45);
                        z70Var2 = z70Var;
                        int iOptInt5 = jSONObject12.optInt("frequency", 2412);
                        jSONObject13.put("frequency", iOptInt5);
                        jSONObject13.put("channel", ok1.a(iOptInt5));
                        d16 = d8;
                        jSONObject13.put("capabilities", jSONObject12.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
                        jSONObject13.put("macAddress", "02:00:00:00:00:00");
                        jSONObject13.put("linkSpeed", 150);
                        jSONObject13.put("networkId", 1);
                        jSONObject13.put("wifiStandard", 4);
                        jSONObject11.put("connectedWifi", jSONObject13);
                        jSONArray3 = new JSONArray();
                        length2 = jSONArray2.length();
                        i2 = 0;
                        while (i2 < length2) {
                            int i11 = length2;
                            JSONObject jSONObject14 = jSONArray2.getJSONObject(i2);
                            JSONArray jSONArray6 = jSONArray2;
                            String strOptString11 = jSONObject14.optString("bssid");
                            i3 = i2;
                            String strOptString12 = jSONObject14.optString("ssid");
                            d21 = d12;
                            int i12 = (-50) - (i3 * 2);
                            if (i3 % 2 == 0) {
                                i4 = 2412;
                            } else {
                                i4 = 5180;
                            }
                            int iOptInt6 = jSONObject14.optInt("frequency", i4);
                            mm1Var4 = mm1Var;
                            JSONObject jSONObject15 = new JSONObject();
                            jSONObject15.put("bssid", strOptString11);
                            jSONObject15.put("ssid", strOptString12);
                            jSONObject15.put("vendor", ok1.b(strOptString11));
                            jSONObject15.put("level", i12);
                            jSONObject15.put("capabilities", jSONObject14.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
                            jSONObject15.put("frequency", iOptInt6);
                            jSONObject15.put("channel", ok1.a(iOptInt6));
                            jSONArray3.put(jSONObject15);
                            i2 = i3 + 1;
                            length2 = i11;
                            jSONArray2 = jSONArray6;
                            d12 = d21;
                            mm1Var = mm1Var4;
                        }
                        mm1Var3 = mm1Var;
                        d19 = d12;
                        jSONObject11.put("nearbyWifi", jSONArray3);
                        String string3 = jSONObject11.toString();
                        string3.getClass();
                        io2 = Dispatchers.getIO();
                        lm1Var = new lm1(ul1Var5, d17, d18, string3, null, 1);
                        ul1Var3 = ul1Var5;
                        d11 = d17;
                        d13 = d18;
                        mm1Var = mm1Var3;
                        mm1Var.e = ul1Var3;
                        mm1Var.f = null;
                        mm1Var.g = d11;
                        mm1Var.h = d13;
                        d12 = d19;
                        mm1Var.i = d12;
                        d16 = d16;
                        mm1Var.j = d16;
                        mm1Var.l = 3;
                        z70Var2 = z70Var2;
                        if (BuildersKt.withContext(io2, lm1Var, mm1Var) == z70Var2) {
                            return z70Var2;
                        }
                        d20 = d11;
                        d8 = d16;
                        d22 = d13;
                        ul1Var6 = ul1Var3;
                        main2 = Dispatchers.getMain();
                        om1Var = new om1(ul1Var6, d20, d22, null);
                        ul1Var3 = ul1Var6;
                        d11 = d20;
                        d13 = d22;
                        mm1Var.e = ul1Var3;
                        mm1Var.f = null;
                        mm1Var.g = d11;
                        mm1Var.h = d13;
                        mm1Var.i = d12;
                        mm1Var.j = d8;
                        mm1Var.l = 4;
                        if (BuildersKt.withContext(main2, om1Var, mm1Var) == z70Var2) {
                            return z70Var2;
                        }
                    } else {
                        d16 = d8;
                        z70Var2 = z70Var;
                        ul1Var3 = ul1Var5;
                        d11 = d17;
                        d13 = d18;
                        main = Dispatchers.getMain();
                        d18 = d13;
                        ul1Var5 = ul1Var3;
                        d17 = d11;
                        nm1Var = new nm1(ul1Var5, d17, d18, null, 1);
                        mm1Var.e = ul1Var3;
                        mm1Var.f = null;
                        mm1Var.g = d11;
                        mm1Var.h = d13;
                        mm1Var.i = d12;
                        mm1Var.j = d16;
                        mm1Var.l = 5;
                        if (BuildersKt.withContext(main, nm1Var, mm1Var) == z70Var2) {
                            return z70Var2;
                        }
                    }
                } catch (CancellationException e35) {
                    d15 = d31;
                    z70Var2 = z70Var3;
                    cancellationException = e35;
                    d14 = d11;
                    ul1Var4 = ul1Var17;
                    y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                    nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                    mm1Var.e = null;
                    mm1Var.f = cancellationException;
                    mm1Var.g = d14;
                    mm1Var.h = d15;
                    mm1Var.i = d12;
                    mm1Var.j = d16;
                    mm1Var.l = 6;
                    if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                    throw cancellationException;
                } catch (Exception e36) {
                    e = e36;
                    d13 = d31;
                    z70Var2 = z70Var3;
                    ul1Var3 = ul1Var17;
                    d8 = d16;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                        on1.f(ul1Var3, e);
                    }
                    main3 = Dispatchers.getMain();
                    ul1 ul1Var18 = ul1Var3;
                    double d213 = d11;
                    nm1Var2 = new nm1(ul1Var18, d213, d13, null, 3);
                    mm1Var.e = null;
                    mm1Var.f = null;
                    mm1Var.g = d11;
                    mm1Var.h = d13;
                    mm1Var.i = d12;
                    mm1Var.j = d8;
                    mm1Var.l = 7;
                    if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                    return mf3.a;
                }
                return mf3.a;
            case 3:
                d8 = mm1Var.j;
                double d32 = mm1Var.i;
                d13 = mm1Var.h;
                double d33 = mm1Var.g;
                ul1Var3 = mm1Var.e;
                try {
                    ee0.J(objFetchWifiData);
                    z70Var2 = z70Var3;
                    d12 = d32;
                    d20 = d33;
                    d22 = d13;
                    ul1Var6 = ul1Var3;
                    main2 = Dispatchers.getMain();
                    om1Var = new om1(ul1Var6, d20, d22, null);
                    ul1Var3 = ul1Var6;
                    d11 = d20;
                    d13 = d22;
                    mm1Var.e = ul1Var3;
                    mm1Var.f = null;
                    mm1Var.g = d11;
                    mm1Var.h = d13;
                    mm1Var.i = d12;
                    mm1Var.j = d8;
                    mm1Var.l = 4;
                    if (BuildersKt.withContext(main2, om1Var, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                } catch (CancellationException e37) {
                    e = e37;
                    z70Var2 = z70Var3;
                    d12 = d32;
                    d15 = d13;
                    ul1Var4 = ul1Var3;
                    d14 = d33;
                    d16 = d8;
                    cancellationException = e;
                    y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                    nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                    mm1Var.e = null;
                    mm1Var.f = cancellationException;
                    mm1Var.g = d14;
                    mm1Var.h = d15;
                    mm1Var.i = d12;
                    mm1Var.j = d16;
                    mm1Var.l = 6;
                    if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                    throw cancellationException;
                } catch (Exception e38) {
                    e = e38;
                    z70Var2 = z70Var3;
                    d12 = d32;
                    d11 = d33;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                        on1.f(ul1Var3, e);
                    }
                    main3 = Dispatchers.getMain();
                    ul1 ul1Var19 = ul1Var3;
                    double d214 = d11;
                    nm1Var2 = new nm1(ul1Var19, d214, d13, null, 3);
                    mm1Var.e = null;
                    mm1Var.f = null;
                    mm1Var.g = d11;
                    mm1Var.h = d13;
                    mm1Var.i = d12;
                    mm1Var.j = d8;
                    mm1Var.l = 7;
                    if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                    return mf3.a;
                }
                return mf3.a;
            case 4:
            case Logger.WARN /* 5 */:
                d8 = mm1Var.j;
                double d34 = mm1Var.i;
                d13 = mm1Var.h;
                d11 = mm1Var.g;
                ul1Var3 = mm1Var.e;
                try {
                    ee0.J(objFetchWifiData);
                    break;
                } catch (CancellationException e39) {
                    e = e39;
                    z70Var2 = z70Var3;
                    d12 = d34;
                    d16 = d8;
                    d15 = d13;
                    ul1Var4 = ul1Var3;
                    d14 = d11;
                    cancellationException = e;
                    y70VarPlus = NonCancellable.INSTANCE.plus(Dispatchers.getMain());
                    nm1Var3 = new nm1(ul1Var4, d14, d15, null, 2);
                    mm1Var.e = null;
                    mm1Var.f = cancellationException;
                    mm1Var.g = d14;
                    mm1Var.h = d15;
                    mm1Var.i = d12;
                    mm1Var.j = d16;
                    mm1Var.l = 6;
                    if (BuildersKt.withContext(y70VarPlus, nm1Var3, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                    throw cancellationException;
                } catch (Exception e40) {
                    e = e40;
                    z70Var2 = z70Var3;
                    d12 = d34;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint((AppState) ul1Var3.x.getValue(), d11, d13)) {
                        on1.f(ul1Var3, e);
                    }
                    main3 = Dispatchers.getMain();
                    ul1 ul1Var110 = ul1Var3;
                    double d215 = d11;
                    nm1Var2 = new nm1(ul1Var110, d215, d13, null, 3);
                    mm1Var.e = null;
                    mm1Var.f = null;
                    mm1Var.g = d11;
                    mm1Var.h = d13;
                    mm1Var.i = d12;
                    mm1Var.j = d8;
                    mm1Var.l = 7;
                    if (BuildersKt.withContext(main3, nm1Var2, mm1Var) == z70Var2) {
                        return z70Var2;
                    }
                }
                return mf3.a;
            case Logger.ERROR /* 6 */:
                CancellationException cancellationException2 = mm1Var.f;
                ee0.J(objFetchWifiData);
                throw cancellationException2;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ee0.J(objFetchWifiData);
                return mf3.a;
            default:
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static final Object f(Context context, m mVar) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new d6(context, (q60) null, 9), mVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(ul1 ul1Var, double d, double d2, r60 r60Var) {
        pm1 pm1Var;
        if (r60Var instanceof pm1) {
            pm1Var = (pm1) r60Var;
            int i = pm1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm1Var.f = i - Integer.MIN_VALUE;
            } else {
                pm1Var = new pm1(r60Var);
            }
        } else {
            pm1Var = new pm1(r60Var);
        }
        Object objO = pm1Var.e;
        int i2 = pm1Var.f;
        boolean z = true;
        if (i2 == 0) {
            ee0.J(objO);
            pm1Var.f = 1;
            objO = am1.o(ul1Var, d, d2);
            Object obj = z70.e;
            if (objO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objO);
        }
        Iterable iterable = (Iterable) objO;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!((CompleteLocation) it.next()).getCells().isEmpty()) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(ul1 ul1Var, double d, double d2, r60 r60Var) {
        qm1 qm1Var;
        vl0 vl0Var;
        if (r60Var instanceof qm1) {
            qm1Var = (qm1) r60Var;
            int i = qm1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm1Var.j = i - Integer.MIN_VALUE;
            } else {
                qm1Var = new qm1(r60Var);
            }
        } else {
            qm1Var = new qm1(r60Var);
        }
        Object obj = qm1Var.i;
        int i2 = qm1Var.j;
        if (i2 == 0) {
            ee0.J(obj);
            vl0 vl0Var2 = vl0.a;
            qm1Var.e = vl0Var2;
            qm1Var.f = ul1Var;
            qm1Var.g = d;
            qm1Var.h = d2;
            qm1Var.j = 1;
            List listO = am1.o(ul1Var, d, d2);
            z70 z70Var = z70.e;
            if (listO == z70Var) {
                return z70Var;
            }
            vl0Var = vl0Var2;
            obj = listO;
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = qm1Var.h;
            d = qm1Var.g;
            ul1Var = qm1Var.f;
            vl0Var = qm1Var.e;
            ee0.J(obj);
        }
        String str = (String) ig0.D(ul1Var, (List) obj, d, d2).e;
        vl0Var.getClass();
        return Boolean.valueOf(vl0.e(str) > 0);
    }

    public static final void i(ul1 ul1Var, long j) {
        ul1Var.getClass();
        BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new vl1(ul1Var, j, null, 2), 3, null);
    }

    public static final void j(ul1 ul1Var, String str) {
        ul1Var.getClass();
        str.getClass();
        if (str.length() != 0 && !str.equals("-") && r13.R(str) == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = ul1Var.x;
        while (true) {
            Object value = mutableStateFlow.getValue();
            MutableStateFlow mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, str, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -402653185, -1, 134217727, null))) {
                a(ul1Var);
                return;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }

    public static final void k(ul1 ul1Var, String str) {
        ul1Var.getClass();
        str.getClass();
        if (str.length() != 0 && !str.equals("-") && r13.R(str) == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = ul1Var.x;
        while (true) {
            Object value = mutableStateFlow.getValue();
            MutableStateFlow mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, str, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -335544321, -1, 134217727, null))) {
                a(ul1Var);
                return;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }
}
