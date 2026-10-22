package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RewardDevice;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x3 implements ru0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ List h;

    public /* synthetic */ x3(List list, Object obj, Object obj2, int i) {
        this.e = i;
        this.h = list;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? wg2Var;
        String strK;
        String strOptString;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj5 = this.g;
        c30 c30Var = d30.a;
        av1 av1Var = av1.a;
        List list = this.h;
        Object obj6 = this.f;
        int i2 = 4;
        int i3 = 1;
        int i4 = 2;
        switch (i) {
            case 0:
                bc1 bc1Var = (bc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                f30 f30Var = (f30) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ey1 ey1Var = (ey1) obj6;
                int i5 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((ov0) f30Var).f(bc1Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i5 |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(i5 & 1, (i5 & 147) != 146)) {
                    ov0Var.W();
                } else {
                    i52 i52Var = (i52) ((ArrayList) list).get(iIntValue);
                    ov0Var.c0(1479605312);
                    String str = (String) i52Var.e;
                    Map.Entry entry = (Map.Entry) i52Var.f;
                    String str2 = str + "|" + entry.getKey();
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    boolean zContains = ((Set) ey1Var.getValue()).contains(str2);
                    boolean z = !xq1.e((ey1) obj5);
                    vh2 vh2Var = new vh2(1);
                    boolean zF = ov0Var.f(str2);
                    Object objQ = ov0Var.Q();
                    if (zF || objQ == c30Var) {
                        objQ = new l3(i3, str2, ey1Var);
                        ov0Var.m0(objQ);
                    }
                    dv1 dv1VarF = zm3.F(ks.d0(dv1VarE, zContains, z, vh2Var, null, (lu0) objQ), 0.0f, 4.0f, 1);
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
                    q73.h(ov0Var, v20.e, kk2VarA);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    ym3.f(((Set) ey1Var.getValue()).contains(str2), null, null, false, da0.q(bk.g, 0L, 0L, 0L, 0L, ov0Var, 62), ov0Var, 48, 44);
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    String strZ0 = l13.z0(str3, ':');
                    if (strZ0.equals("setting")) {
                        String strU = xq1.u(strZ0);
                        String str5 = (String) jq1.N(new i52("map_type", "地图类型"), new i52("map_engine", "地图来源"), new i52("wifi_source", "WiFi 来源"), new i52("mock_wifi", "WiFi 模拟"), new i52("mock_cell", "基站模拟"), new i52("mock_bluetooth", "蓝牙模拟"), new i52("enable_jitter", "定位波动"), new i52("restart_apps_on_spoof", "启动时重启应用"), new i52("altitude", "海拔"), new i52("altitude_variation_m", "海拔波动"), new i52("satellite_count", "卫星数量"), new i52("barometer_fluctuation", "气压计波动"), new i52("fixed_joystick_enabled", "悬浮摇杆"), new i52("route_lateral_deviation", "路线横向偏移"), new i52("realism_level", "运动真实度"), new i52("speed_fluctuation_pct", "速度波动"), new i52("gait_template", "步态模板"), new i52("use_gait_template", "使用步态模板"), new i52("keep_last_map_position", "记住地图位置"), new i52("app_coordinate_systems", "应用坐标系"), new i52("system_hook_packages", "系统模拟应用"), new i52("force_location_enabled", "强制定位"), new i52("is_dark_mode", "深色模式"), new i52("language", "语言"), new i52("is_language_set", "语言选择")).get(l13.x0(str3, ':'));
                        if (str5 == null) {
                            str5 = "软件设置";
                        }
                        strK = az2.k(strU, " · ", str5);
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(str4);
                            if (strZ0.equals("location")) {
                                jSONObject = jSONObject.getJSONObject("location");
                            } else if (strZ0.equals("collection")) {
                                jSONObject = jSONObject.getJSONObject("route");
                            }
                            strOptString = jSONObject.optString("name");
                            strOptString.getClass();
                            if (l13.k0(strOptString)) {
                                wg2Var = 0;
                            }
                            if (wg2Var == 0) {
                                wg2Var = jSONObject.optString("address");
                                wg2Var.getClass();
                                if (l13.k0(wg2Var)) {
                                    wg2Var = strOptString;
                                    wg2Var = 0;
                                }
                            }
                        } catch (Throwable th) {
                            wg2Var = new wg2(th);
                        }
                        wg2Var = strOptString;
                        wg2Var = strOptString;
                        String strC0 = (String) (wg2Var instanceof wg2 ? 0 : wg2Var);
                        String strU2 = xq1.u(strZ0);
                        if (strC0 == null) {
                            strC0 = l13.C0(8, l13.x0(str3, ':'));
                        }
                        strK = az2.k(strU2, " · ", strC0);
                    }
                    s83.b(strK, new wb1(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, ov0Var, 0, 24576, 245756);
                    ov0Var.p(true);
                    ov0Var.p(false);
                }
                break;
            case 1:
                bc1 bc1Var2 = (bc1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                f30 f30Var2 = (f30) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ey1 ey1Var2 = (ey1) obj6;
                int i6 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((ov0) f30Var2).f(bc1Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i6 |= ((ov0) f30Var2).d(iIntValue3) ? 32 : 16;
                }
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(i6 & 1, (i6 & 147) != 146)) {
                    ov0Var2.W();
                } else {
                    RewardDevice rewardDevice = (RewardDevice) list.get(iIntValue3);
                    ov0Var2.c0(-2058786279);
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    boolean zF2 = o51.f((String) ey1Var2.getValue(), rewardDevice.getId());
                    boolean z2 = !xq1.p((ey1) obj5);
                    vh2 vh2Var2 = new vh2(3);
                    boolean zH = ov0Var2.h(rewardDevice);
                    Object objQ2 = ov0Var2.Q();
                    if (zH || objQ2 == c30Var) {
                        objQ2 = new l3(i2, rewardDevice, ey1Var2);
                        ov0Var2.m0(objQ2);
                    }
                    dv1 dv1VarD = zm3.D(ks.d0(dv1VarE2, zF2, z2, vh2Var2, null, (lu0) objQ2), 6.0f);
                    kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var2, 48);
                    int iHashCode2 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, kk2VarA2);
                    q73.h(ov0Var2, v20.d, l72VarL2);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH2);
                    ig0.c(o51.f((String) ey1Var2.getValue(), rewardDevice.getId()), null, false, ke0.q(bk.g, ov0Var2), ov0Var2, 48, 44);
                    s83.b(rewardDevice.getName(), new wb1(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262140);
                    s83.b(l13.C0(8, rewardDevice.getId()), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).l, ov0Var2, 0, 0, 131070);
                    ov0Var2.p(true);
                    ov0Var2.p(false);
                }
                break;
            default:
                bc1 bc1Var3 = (bc1) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                f30 f30Var3 = (f30) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                lu0 lu0Var = (lu0) obj6;
                int i7 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((ov0) f30Var3).f(bc1Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i7 |= ((ov0) f30Var3).d(iIntValue5) ? 32 : 16;
                }
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(i7 & 1, (i7 & 147) != 146)) {
                    ov0Var3.W();
                } else {
                    SavedLocation savedLocation = (SavedLocation) list.get(iIntValue5);
                    ov0Var3.c0(-1909873327);
                    bj2 bj2VarA = cj2.a(16.0f);
                    long jC = hz.c(0.4f, ((kz) ov0Var3.j(mz.a)).r);
                    dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                    boolean zF3 = ov0Var3.f(lu0Var) | ov0Var3.h(savedLocation);
                    Object objQ3 = ov0Var3.Q();
                    if (zF3 || objQ3 == c30Var) {
                        objQ3 = new zl2(lu0Var, savedLocation, 2);
                        ov0Var3.m0(objQ3);
                    }
                    e33.b((au0) objQ3, dv1VarE3, false, bj2VarA, jC, 0L, 0.0f, null, null, sb.a0(433863430, new pu(i4, (lu0) obj5, savedLocation), ov0Var3), ov0Var3, 48, 996);
                    ov0Var3.p(false);
                }
                break;
        }
        return mf3Var;
    }
}
