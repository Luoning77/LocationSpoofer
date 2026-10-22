package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class ji2 {
    public static final kh3 A;
    public static final kh3 B;
    public static final float C = 24.0f;
    public static final float D = 24.0f;
    public static x01 E;
    public static final p10 b;
    public static final p10 c;
    public static final p10 d;
    public static final p10 e;
    public static final p10 g;
    public static final p10 h;
    public static final p10 l;
    public static final bf s;
    public static final bf t;
    public static final z92 u;
    public static final cu2 v;
    public static final float w;
    public static final float x;
    public static final kh3 y;
    public static final kh3 z;
    public static final p10 a = new p10(new s10(3), false, 782577377);
    public static final p10 f = new p10(new r10(9), false, -391992307);
    public static final p10 i = new p10(new a20(29), false, -866772274);
    public static final p10 j = new p10(new b20(24), false, 452591115);
    public static final p10 k = new p10(new b20(25), false, -4245139);
    public static final z70 m = z70.e;
    public static final int[] n = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] o = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] p = {3, 6};
    public static final int[] q = {1, 2, 4, 5, 7, 8};
    public static final bf r = new bf(1000);

    static {
        byte b2 = 0;
        int i2 = 5;
        b = new p10(new r10(i2), false, 1220597478);
        int i3 = 6;
        c = new p10(new r10(i3), false, -1442989321);
        int i4 = 7;
        d = new p10(new r10(i4), false, -1579016618);
        int i5 = 8;
        e = new p10(new r10(i5), false, 1481221230);
        int i6 = 28;
        g = new p10(new s10(i6), false, 2021761717);
        h = new p10(new a20(i6), false, 519429541);
        l = new p10(new d20(b2), false, -2115198499);
        new bf(1007);
        s = new bf(1008);
        t = new bf(1002);
        u = new z92(2, new v70(17, b2), new cm2(1));
        v = cu2.g;
        w = 8.0f;
        x = 24.0f;
        y = new kh3(i2);
        z = new kh3(i3);
        A = new kh3(i4);
        B = new kh3(i5);
    }

    public static final int A(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2144457962:
                return !str.equals("client_content_unavailable") ? 2131624258 : 2131624126;
            case -2126193703:
                return !str.equals("download_ticket_used") ? 2131624258 : 2131625131;
            case -2066879411:
                return !str.equals("wifi_scan_expired") ? 2131624258 : 2131624329;
            case -2018661140:
                return !str.equals("companion_binding_required") ? 2131624258 : 2131624139;
            case -2005545810:
                return !str.equals("device_already_bound") ? 2131624258 : 2131624165;
            case -1968888881:
                return !str.equals("route_too_complex") ? 2131624258 : 2131624192;
            case -1918889629:
                return !str.equals("artifact_unavailable") ? 2131624258 : 2131624126;
            case -1910919878:
                return !str.equals("quota_exceeded") ? 2131624258 : 2131624242;
            case -1895435135:
                return !str.equals("subscription_required") ? 2131624258 : 2131624327;
            case -1889480643:
                return !str.equals("pairing_changed") ? 2131624258 : 2131624135;
            case -1871825742:
                return !str.equals("invalid_wifi_contribution") ? 2131624258 : 2131624329;
            case -1834720214:
                return !str.equals("software_device_limit") ? 2131624258 : 2131625020;
            case -1769866950:
                return !str.equals("wifi_stop_simulation") ? 2131624258 : 2131624334;
            case -1684825972:
                return !str.equals("storage_unavailable") ? 2131624258 : 2131624266;
            case -1651946290:
                return !str.equals("invalid_timestamp") ? 2131624258 : 2131624127;
            case -1625724613:
                return !str.equals("rate_limited") ? 2131624258 : 2131624244;
            case -1515249877:
                return !str.equals("primary_device_required") ? 2131624258 : 2131624147;
            case -1489691417:
                return !str.equals("wifi_upload_limit") ? 2131624258 : 2131624322;
            case -1470480413:
                return !str.equals("invalid_password") ? 2131624258 : 2131624233;
            case -1439291502:
                return !str.equals("download_rate_limited") ? 2131624258 : 2131624244;
            case -1435160862:
                return !str.equals("device_binding_required") ? 2131624258 : 2131624176;
            case -1427689881:
                return !str.equals("username_unavailable") ? 2131624258 : 2131624212;
            case -1288293298:
                return !str.equals("invalid_session") ? 2131624258 : 2131624260;
            case -1175859205:
                return !str.equals("incorrect_current_password") ? 2131624258 : 2131624208;
            case -1172151021:
                return !str.equals("device_locked") ? 2131624258 : 2131624172;
            case -1081812144:
                return !str.equals("software_membership_required") ? 2131624258 : 2131625027;
            case -1003703371:
                return !str.equals("login_required") ? 2131624258 : 2131624218;
            case -978363618:
                return !str.equals("invalid_request_timestamp") ? 2131624258 : 2131624127;
            case -969633305:
                return !str.equals("software_identity_unavailable") ? 2131624258 : 2131625025;
            case -837717503:
                return !str.equals("invalid_route") ? 2131624258 : 2131624192;
            case -776670368:
                return !str.equals("device_recovery_required") ? 2131624258 : 2131624176;
            case -712049287:
                return !str.equals("device_migration_required") ? 2131624258 : 2131624176;
            case -693070394:
                return !str.equals("service_unavailable") ? 2131624258 : 2131624276;
            case -689407335:
                return !str.equals("guest_recovery_not_allowed") ? 2131624258 : 2131624198;
            case -617237321:
                return !str.equals("network_error") ? 2131624258 : 2131624224;
            case -599825100:
                return !str.equals("device_signed_out") ? 2131624258 : 2131623985;
            case -592169838:
                return !str.equals("device_limit") ? 2131624258 : 2131624171;
            case -499775056:
                return !str.equals("wifi_location_unavailable") ? 2131624258 : 2131624324;
            case -464930271:
                return !str.equals("recovery_completed") ? 2131624258 : 2131624247;
            case -458004911:
                return !str.equals("invalid_invite") ? 2131624258 : 2131624211;
            case -444618026:
                return !str.equals("access_denied") ? 2131624258 : 2131624117;
            case -420515447:
                return !str.equals("download_ticket_expired") ? 2131624258 : 2131625131;
            case -417602545:
                return !str.equals("invalid_recovery_code") ? 2131624258 : 2131624210;
            case -346741385:
                return !str.equals("companion_lease_required") ? 2131624258 : 2131624138;
            case -314244490:
                return !str.equals("wifi_database_unavailable") ? 2131624258 : 2131624336;
            case -261424297:
                return !str.equals("invalid_device_signature") ? 2131624258 : 2131624179;
            case -85992702:
                return !str.equals("provider_unavailable") ? 2131624258 : 2131624239;
            case -35071047:
                return !str.equals("session_replaced") ? 2131624258 : 2131623985;
            case 16868759:
                return !str.equals("device_mismatch") ? 2131624258 : 2131624165;
            case 128360767:
                return !str.equals("device_request_replayed") ? 2131624258 : 2131624179;
            case 130993342:
                return !str.equals("device_login_required") ? 2131624258 : 2131624419;
            case 167597818:
                return !str.equals("device_not_enrolled") ? 2131624258 : 2131624179;
            case 228877244:
                return !str.equals("invalid_run_signature") ? 2131624258 : 2131624138;
            case 237397377:
                return !str.equals("redirect_rejected") ? 2131624258 : 2131624252;
            case 262108164:
                return !str.equals("service_quota_exceeded") ? 2131624258 : 2131624259;
            case 264923259:
                return !str.equals("recovery_expired") ? 2131624258 : 2131624247;
            case 340179968:
                return !str.equals("companion_in_use") ? 2131624258 : 2131624137;
            case 357307566:
                return !str.equals("pairing_expired") ? 2131624258 : 2131624135;
            case 359542083:
                return !str.equals("service_busy") ? 2131624258 : 2131624244;
            case 378702618:
                return !str.equals("invalid_artifact") ? 2131624258 : 2131624277;
            case 401932818:
                return !str.equals("response_too_large") ? 2131624258 : 2131624252;
            case 469711028:
                return !str.equals("invalid_credentials") ? 2131624258 : 2131624209;
            case 520290921:
                return !str.equals("runtime_unavailable") ? 2131624258 : 2131624276;
            case 645362621:
                return !str.equals("route_too_long") ? 2131624258 : 2131624192;
            case 656573547:
                return !str.equals("device_key_changed") ? 2131624258 : 2131624165;
            case 680342597:
                return !str.equals("account_already_bound") ? 2131624258 : 2131624165;
            case 702139790:
                return !str.equals("registered_account_required") ? 2131624258 : 2131624325;
            case 732964698:
                return !str.equals("wifi_query_limit") ? 2131624258 : 2131624322;
            case 734652527:
                return !str.equals("wifi_location_permission") ? 2131624258 : 2131624323;
            case 809715016:
                return !str.equals("companion_login_required") ? 2131624258 : 2131624139;
            case 845523752:
                return !str.equals("export_failed") ? 2131624258 : 2131624451;
            case 909527416:
                return !str.equals("wifi_scan_unavailable") ? 2131624258 : 2131624330;
            case 923213984:
                return !str.equals("route_not_found") ? 2131624258 : 2131624193;
            case 983955232:
                return !str.equals("pairing_pending") ? 2131624258 : 2131624145;
            case 1028022428:
                return !str.equals("device_hardware_mismatch") ? 2131624258 : 2131624168;
            case 1032761521:
                return !str.equals("search_quota_exceeded") ? 2131624258 : 2131624242;
            case 1079803990:
                return !str.equals("client_upgrade_required") ? 2131624258 : 2131624278;
            case 1089486226:
                return !str.equals("capability_forbidden") ? 2131624258 : 2131624117;
            case 1090257998:
                return !str.equals("account_disabled") ? 2131624258 : 2131624166;
            case 1125980577:
                return !str.equals("wifi_batch_conflict") ? 2131624258 : 2131624329;
            case 1157640657:
                return !str.equals("download_quota_exceeded") ? 2131624258 : 2131625129;
            case 1203468236:
                return !str.equals("companion_slot_occupied") ? 2131624258 : 2131624157;
            case 1267177865:
                return !str.equals("invalid_response") ? 2131624258 : 2131624252;
            case 1289384564:
                return !str.equals("cloud_not_configured") ? 2131624258 : 2131624228;
            case 1341787678:
                return !str.equals("invalid_username") ? 2131624258 : 2131624212;
            case 1354599573:
                return !str.equals("device_switch_pending") ? 2131624258 : 2131623989;
            case 1376576164:
                return !str.equals("upstream_error") ? 2131624258 : 2131624276;
            case 1402806180:
                return !str.equals("member_required") ? 2131624258 : 2131624166;
            case 1468874839:
                return !str.equals("device_identity_required") ? 2131624258 : 2131624170;
            case 1516959308:
                return !str.equals("invalid_pairing_code") ? 2131624258 : 2131624135;
            case 1612710859:
                return !str.equals("beta_access_required") ? 2131624258 : 2131625126;
            case 1883122251:
                return !str.equals("provider_failed") ? 2131624258 : 2131624238;
            case 1952082121:
                return !str.equals("invalid_apk_identity") ? 2131624258 : 2131624277;
            case 1957884163:
                return !str.equals("device_blocked") ? 2131624258 : 2131624166;
            case 1968503539:
                return !str.equals("download_catalog_unavailable") ? 2131624258 : 2131624126;
            case 2025942333:
                return !str.equals("tee_device_required") ? 2131624258 : 2131624274;
            case 2040370449:
                return !str.equals("device_binding_mismatch") ? 2131624258 : 2131624165;
            case 2079822277:
                return !str.equals("outside_map_coverage") ? 2131624258 : 2131624189;
            default:
                return 2131624258;
        }
    }

    public static final Object B(q60 q60Var, lu0 lu0Var, ii2 ii2Var) {
        if (ii2Var.inCompatibilityMode() && ii2Var.isOpenInternal$room_runtime() && ii2Var.inTransaction()) {
            return lu0Var.invoke(q60Var);
        }
        return q60Var.getContext().get(uv.g) == null ? lu0Var.invoke(q60Var) : Y(q60Var, lu0Var, ii2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final td C(xu xuVar, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        td tdVarA = gh0.a;
        ga gaVar = gh0.b;
        xv xvVar = gh0.c;
        if (tdVarA == null || gaVar == null) {
            tdVarA = mh0.a(iCeil, iCeil, 1);
            gh0.a = tdVarA;
            Canvas canvas = ha.a;
            gaVar = new ga();
            gaVar.a = new Canvas(n51.l(tdVarA));
            gh0.b = gaVar;
        } else {
            Bitmap bitmap = tdVarA.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                tdVarA = mh0.a(iCeil, iCeil, 1);
                gh0.a = tdVarA;
                Canvas canvas2 = ha.a;
                gaVar = new ga();
                gaVar.a = new Canvas(n51.l(tdVarA));
                gh0.b = gaVar;
            }
        }
        td tdVar = tdVarA;
        ga gaVar2 = gaVar;
        if (xvVar == null) {
            xvVar = new xv();
            gh0.c = xvVar;
        }
        xv xvVar2 = xvVar;
        wv wvVar = xvVar2.e;
        qa1 layoutDirection = xuVar.e.getLayoutDirection();
        Bitmap bitmap2 = tdVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        xb0 xb0Var = wvVar.a;
        qa1 qa1Var = wvVar.b;
        vv vvVar = wvVar.c;
        long j2 = wvVar.d;
        wvVar.a = xuVar;
        wvVar.b = layoutDirection;
        wvVar.c = gaVar2;
        wvVar.d = jFloatToRawIntBits;
        gaVar2.l();
        jg0.c0(xvVar2, hz.b, 0L, xvVar2.a(), 0.0f, null, 0, 58);
        jg0.c0(xvVar2, xp1.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, null, 0, 120);
        jg0.Y(xvVar2, xp1.d(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        gaVar2.i();
        wvVar.a = xb0Var;
        wvVar.b = qa1Var;
        wvVar.c = vvVar;
        wvVar.d = j2;
        return tdVar;
    }

    public static final boolean D(long j2, long j3) {
        return j2 == j3;
    }

    public static final void E(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final x01 F() {
        x01 x01Var = E;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.DeleteOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(6.0f, 19.0f);
        nx0VarI.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nx0VarI.i(8.0f);
        nx0VarI.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0VarI.k(18.0f, 9.0f);
        nx0VarI.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nx0VarI.k(8.0f, 7.0f);
        nx0VarI.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nx0VarI.s(10.0f);
        nx0VarI.e();
        nx0VarI.m(9.0f, 9.0f);
        nx0VarI.i(6.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        nx0VarI.s(8.0f);
        nx0VarI.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        nx0VarI.k(9.0f, 19.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        nx0VarI.s(-8.0f);
        nx0VarI.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        nx0VarI.e();
        nx0VarI.m(15.5f, 4.0f);
        nx0VarI.l(-0.71f, -0.71f);
        nx0VarI.g(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f);
        nx0VarI.k(9.91f, 3.0f);
        nx0VarI.g(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        nx0VarI.k(8.5f, 4.0f);
        nx0VarI.k(6.0f, 4.0f);
        nx0VarI.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        nx0VarI.o(0.45f, 1.0f, 1.0f, 1.0f);
        nx0VarI.i(12.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0VarI.o(-0.45f, -1.0f, -1.0f, -1.0f);
        nx0VarI.i(-2.5f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        E = x01VarB;
        return x01VarB;
    }

    public static boolean G() {
        try {
            if (db.R0 == null) {
                db.R0 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = db.S0;
            if (declaredMethod == null) {
                Class cls = db.R0;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                db.S0 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return o51.f(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final dv1 H(dv1 dv1Var) {
        return dv1Var.d(new p43(A));
    }

    public static final dv1 I(hd1 hd1Var, dt dtVar, x32 x32Var) {
        return new dc1(hd1Var, dtVar, x32Var);
    }

    public static final dv1 J(dv1 dv1Var) {
        return dv1Var.d(new p43(B));
    }

    public static final dv1 K(dv1 dv1Var, lu0 lu0Var) {
        return dv1Var.d(new e22(lu0Var));
    }

    public static final d31 L(String str, String str2, int i2, lu0 lu0Var) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) lu0Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return M(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final d31 M(String str, String str2) {
        return new d31(19, str2 + " when parsing an Instant from \"" + W(64, str) + '\"', str);
    }

    public static final int N(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static void O(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static final Object P(l72 l72Var, cd2 cd2Var) {
        cd2Var.getClass();
        Object objB = l72Var.get(cd2Var);
        if (objB == null) {
            objB = cd2Var.b();
        }
        return ((gh3) objB).a(l72Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String Q(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(attributeValue));
                }
                return attributeValue;
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    public static final dv1 R(dv1 dv1Var) {
        return dv1Var.d(new p43(y));
    }

    public static final dv1 S(pu0 pu0Var) {
        return new a63(pu0Var);
    }

    public static final long T(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final dv1 U(dv1 dv1Var) {
        return dv1Var.d(new p43(z));
    }

    public static String V(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + ce0.W(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + ce0.W(Float.intBitsToFloat(i2)) + ", " + ce0.W(Float.intBitsToFloat(i3)) + ')';
    }

    public static final String W(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final l72 X(kk[] kkVarArr, l72 l72Var, l72 l72Var2) {
        l72 l72Var3 = l72.h;
        k72 k72Var = new k72(l72Var3);
        k72Var.k = l72Var3;
        for (kk kkVar : kkVarArr) {
            cd2 cd2Var = (cd2) kkVar.f;
            if (kkVar.e || !l72Var.containsKey(cd2Var)) {
                k72Var.put(cd2Var, cd2Var.c(kkVar, (gh3) l72Var2.get(cd2Var)));
            }
        }
        return k72Var.a();
    }

    public static final Object Y(q60 q60Var, lu0 lu0Var, ii2 ii2Var) {
        w80 w80Var = new w80(lu0Var, null);
        vb3 vb3Var = (vb3) q60Var.getContext().get(vb3.f);
        s60 s60Var = vb3Var != null ? vb3Var.e : null;
        if (s60Var != null) {
            return BuildersKt.withContext(s60Var, w80Var, q60Var);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            ii2Var.getTransactionExecutor().execute(new fg2(cancellableContinuationImpl, ii2Var, w80Var));
        } catch (RejectedExecutionException e2) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        return cancellableContinuationImpl.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [ov0] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v7, types: [f30, ov0] */
    /* JADX WARN: Type inference failed for: r12v8, types: [ov0] */
    /* JADX WARN: Type inference failed for: r12v9, types: [ov0] */
    /* JADX WARN: Type inference failed for: r16v5, types: [f30] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [f30] */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v2 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void a(final int r51, final defpackage.l6 r52, defpackage.f30 r53, final defpackage.au0 r54, final defpackage.au0 r55) {
        /*
            Method dump skipped, instruction units count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji2.a(int, l6, f30, au0, au0):void");
    }

    public static final boolean b(s03 s03Var) {
        return ((Boolean) s03Var.getValue()).booleanValue();
    }

    public static final boolean c(ey1 ey1Var) {
        return ((Boolean) ey1Var.getValue()).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:233:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0367  */
    /* JADX WARN: Code duplicated, block: B:98:0x041a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void d(l6 l6Var, boolean z2, String str, Context context, no1 no1Var, u4 u4Var, s03 s03Var, s03 s03Var2, ey1 ey1Var, ey1 ey1Var2, s03 s03Var3, ey1 ey1Var3, au0 au0Var, s03 s03Var4, ay ayVar, ey1 ey1Var4, s03 s03Var5, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7, ey1 ey1Var8, ey1 ey1Var9, ey1 ey1Var10, ey1 ey1Var11, ey1 ey1Var12, ey1 ey1Var13, ey1 ey1Var14, z42 z42Var, f30 f30Var, int i2) {
        wa waVar;
        ov0 ov0Var;
        boolean z3;
        c30 c30Var;
        ey1 ey1Var15;
        ey1 ey1Var16;
        ey1 ey1Var17;
        ey1 ey1Var18;
        ey1 ey1Var19;
        CloudAccount account;
        CloudAccount account2;
        ey1 ey1Var20;
        z42Var.getClass();
        int i3 = (i2 & 6) == 0 ? i2 | (((ov0) f30Var).f(z42Var) ? 4 : 2) : i2;
        int i4 = 0;
        ov0 ov0Var2 = (ov0) f30Var;
        if (!ov0Var2.T(i3 & 1, (i3 & 19) != 18)) {
            ov0Var2.W();
            return;
        }
        dv1 dv1VarD = zm3.D(zm3.W(zm3.C(iw2.d(), z42Var), zm3.O(ov0Var2)), 20.0f);
        jo joVar = new jo(16.0f, true, new fo(i4));
        nr nrVar = j9.r;
        yz yzVarA = wz.a(joVar, nrVar, ov0Var2, 6);
        int iHashCode = Long.hashCode(ks.U(ov0Var2));
        l72 l72VarZ = ov0Var2.z();
        dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
        w20.b.getClass();
        x30 x30Var = v20.b;
        ov0Var2.g0();
        if (ov0Var2.D()) {
            ov0Var2.k(x30Var);
        } else {
            ov0Var2.p0();
        }
        gh ghVar = v20.e;
        q73.h(ov0Var2, ghVar, yzVarA);
        gh ghVar2 = v20.d;
        q73.h(ov0Var2, ghVar2, l72VarZ);
        Integer numValueOf = Integer.valueOf(iHashCode);
        gh ghVar3 = v20.f;
        q73.h(ov0Var2, ghVar3, numValueOf);
        wa waVar2 = v20.g;
        q73.g(ov0Var2, waVar2);
        gh ghVar4 = v20.c;
        q73.h(ov0Var2, ghVar4, dv1VarH);
        boolean z4 = l6Var.d;
        if (z4) {
            waVar = waVar2;
            ov0Var = ov0Var2;
            ov0Var.c0(1782353572);
        } else {
            ov0Var2.c0(1720201978);
            waVar = waVar2;
            s83.b(ke0.N(2131624228, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262138);
            ov0Var = ov0Var2;
        }
        ov0Var.s();
        av1 av1Var = av1.a;
        if (z2) {
            ov0Var.c0(1720205614);
            ov0 ov0Var3 = ov0Var;
            vc2.c(iw2.e(av1Var, 1.0f), 0L, 0L, 0, 0.0f, ov0Var3, 6, 30);
            ov0Var = ov0Var3;
        } else {
            ov0Var.c0(1782353572);
        }
        ov0Var.s();
        String str2 = (str == null || (b(s03Var) && o51.f(str, "companion_login_required"))) ? null : str;
        if (str2 == null) {
            ov0Var.c0(1786904526);
        } else {
            ov0Var.c0(1786904527);
            ov0 ov0Var4 = ov0Var;
            s83.b(ke0.N((!b(s03Var) && o51.f(l(s03Var2), Boolean.FALSE) && o51.f(str2, "storage_unavailable")) ? 2131624275 : A(str2), ov0Var), null, ((kz) ov0Var.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262138);
            ov0Var = ov0Var4;
        }
        ov0Var.s();
        boolean zF = o51.f(str, "network_error");
        c30 c30Var2 = d30.a;
        if (!zF || Build.VERSION.SDK_INT < 37 || zm3.k(context, "android.permission.ACCESS_LOCAL_NETWORK") == 0) {
            z3 = z4;
            c30Var = c30Var2;
            ov0Var.c0(1782353572);
        } else {
            ov0Var.c0(1787361529);
            String strN = ke0.N(2131624217, ov0Var);
            hh0 hh0Var = le3.a;
            z3 = z4;
            c30Var = c30Var2;
            ov0 ov0Var5 = ov0Var;
            s83.b(strN, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(hh0Var)).l, ov0Var5, 0, 0, 131070);
            boolean zH = ov0Var5.h(no1Var);
            Object objQ = ov0Var5.Q();
            if (zH || objQ == c30Var) {
                objQ = new d5(no1Var, 0);
                ov0Var5.m0(objQ);
            }
            n51.h((au0) objQ, null, !z2, null, null, null, null, o51.e, ov0Var5, 805306368, 506);
            ov0Var = ov0Var5;
            if (j(ey1Var)) {
                ov0Var.c0(1787716665);
                s83.b(ke0.N(2131624216, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(hh0Var)).l, ov0Var, 0, 0, 131070);
                boolean zH2 = ov0Var.h(context);
                Object objQ2 = ov0Var.Q();
                if (zH2 || objQ2 == c30Var) {
                    objQ2 = new i5(context, 0);
                    ov0Var.m0(objQ2);
                }
                n51.j((au0) objQ2, null, false, null, null, null, o51.f, ov0Var, 805306368, 510);
                ov0Var = ov0Var;
                ov0Var.s();
            } else {
                ov0Var.c0(1782353572);
                ov0Var.s();
            }
        }
        ov0Var.s();
        if (zy.g0(yo.H0(new String[]{"device_key_changed", "device_recovery_required", "device_binding_required", "device_migration_required", "device_hardware_mismatch"}), str)) {
            ov0Var.c0(1788374020);
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new s2(ey1Var2, 8);
                ov0Var.m0(objQ3);
            }
            ov0 ov0Var6 = ov0Var;
            n51.j((au0) objQ3, null, !z2, null, null, null, o51.g, ov0Var6, 805306374, 506);
            ov0Var = ov0Var6;
        } else {
            ov0Var.c0(1782353572);
        }
        ov0Var.s();
        String str3 = (String) s03Var3.getValue();
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -2129280532:
                    if (!str3.equals("companion_confirmed")) {
                        ov0Var.c0(1782353572);
                        ov0Var.s();
                    } else {
                        ov0Var.c0(1720266397);
                        ov0 ov0Var7 = ov0Var;
                        s83.b(ke0.N(2131624130, ov0Var), null, ((kz) ov0Var.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262138);
                        ov0Var = ov0Var7;
                        ov0Var.s();
                    }
                    break;
                case -39856880:
                    if (str3.equals("companion_released")) {
                        ov0Var.c0(1720275136);
                        ov0 ov0Var8 = ov0Var;
                        s83.b(ke0.N(2131624150, ov0Var), null, ((kz) ov0Var.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262138);
                        ov0Var = ov0Var8;
                    } else {
                        ov0Var.c0(1782353572);
                    }
                    ov0Var.s();
                    break;
                case 974390923:
                    if (!str3.equals("companion_bound")) {
                        ov0Var.c0(1782353572);
                        ov0Var.s();
                    } else {
                        ov0Var.c0(1720266397);
                        ov0 ov0Var9 = ov0Var;
                        s83.b(ke0.N(2131624130, ov0Var), null, ((kz) ov0Var.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262138);
                        ov0Var = ov0Var9;
                        ov0Var.s();
                    }
                    break;
                case 1108334125:
                    if (!str3.equals("companion_removed")) {
                        ov0Var.c0(1782353572);
                        ov0Var.s();
                    } else {
                        ov0Var.c0(1720270719);
                        ov0 ov0Var10 = ov0Var;
                        s83.b(ke0.N(2131624153, ov0Var), null, ((kz) ov0Var.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 0, 0, 262138);
                        ov0Var = ov0Var10;
                        ov0Var.s();
                    }
                    break;
                default:
                    ov0Var.c0(1782353572);
                    ov0Var.s();
                    break;
            }
        } else {
            ov0Var.c0(1782353572);
            ov0Var.s();
        }
        if (o51.f((String) s03Var3.getValue(), "password_changed")) {
            ov0Var.c0(1720280254);
            ov0 ov0Var11 = ov0Var;
            s83.b(ke0.N(2131624232, ov0Var), null, ((kz) ov0Var.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262138);
            ov0Var = ov0Var11;
        } else {
            ov0Var.c0(1782353572);
        }
        ov0Var.s();
        String deviceId = i(ey1Var3).getDeviceId();
        if (l13.k0(deviceId)) {
            deviceId = null;
        }
        if (deviceId == null) {
            ov0Var.c0(1789232192);
        } else {
            ov0Var.c0(1789232193);
            ov0 ov0Var12 = ov0Var;
            s83.b(ke0.O(2131624283, new Object[]{deviceId}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var12, 0, 0, 131070);
            ov0Var = ov0Var12;
        }
        ov0Var.s();
        if (i(ey1Var3).getPasswordAuthenticated() && !i(ey1Var3).getValidated()) {
            ov0Var.c0(1789466429);
            sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(-1427370570, new j5(0, l6Var, ey1Var3, s03Var, z2), ov0Var), ov0Var, 196614, 30);
            ov0Var.s();
        } else if (!i(ey1Var3).getValidated() || (account2 = i(ey1Var3).getAccount()) == null || account2.isGuest()) {
            ov0Var.c0(1798072060);
            if (!i(ey1Var3).getValidated() || (account = i(ey1Var3).getAccount()) == null) {
                ov0Var.c0(1782353572);
            } else {
                int i5 = 1;
                if (account.isGuest()) {
                    ov0Var.c0(1798025653);
                    sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(1588818322, new h4(i5, ey1Var7, z2), ov0Var), ov0Var, 196614, 30);
                } else {
                    ov0Var.c0(1782353572);
                }
            }
            ov0Var.s();
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA = jk2.a(am1.i, j9.p, ov0Var, 54);
            int iHashCode2 = Long.hashCode(ks.U(ov0Var));
            l72 l72VarZ2 = ov0Var.z();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.D()) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA);
            q73.h(ov0Var, ghVar2, l72VarZ2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            wb1 wb1Var = new wb1(1.0f, true);
            yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var, 0);
            int iHashCode3 = Long.hashCode(ks.U(ov0Var));
            l72 l72VarZ3 = ov0Var.z();
            dv1 dv1VarH3 = xp1.H(ov0Var, wb1Var);
            ov0Var.g0();
            if (ov0Var.D()) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA2);
            q73.h(ov0Var, ghVar2, l72VarZ3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            String strN2 = ke0.N(2131625021, ov0Var);
            hh0 hh0Var2 = le3.a;
            ov0 ov0Var13 = ov0Var;
            s83.b(strN2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(hh0Var2)).i, ov0Var13, 0, 0, 131070);
            s83.b(ke0.N(2131625022, ov0Var13), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var13.j(hh0Var2)).l, ov0Var13, 0, 0, 131070);
            ov0Var13.r();
            boolean zB = b(s03Var);
            boolean zH3 = ov0Var13.h(l6Var);
            Object objQ4 = ov0Var13.Q();
            if (zH3 || objQ4 == c30Var) {
                objQ4 = new e5(l6Var, ey1Var8, ey1Var9, ey1Var10, ey1Var11, 0);
                ey1Var15 = ey1Var8;
                ey1Var16 = ey1Var9;
                ey1Var17 = ey1Var10;
                ey1Var18 = ey1Var11;
                ov0Var13.m0(objQ4);
            } else {
                ey1Var15 = ey1Var8;
                ey1Var16 = ey1Var9;
                ey1Var17 = ey1Var10;
                ey1Var18 = ey1Var11;
            }
            boolean z5 = !z2;
            b43.a(zB, (lu0) objQ4, null, z5, null, ov0Var13, 0, 108);
            ov0Var13.r();
            s83.b(ke0.N(b(s03Var) ? 2131625023 : 2131624202, ov0Var13), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 0, 0, 262142);
            ov0 ov0Var14 = ov0Var13;
            boolean zH4 = ov0Var14.h(l6Var);
            Object objQ5 = ov0Var14.Q();
            if (zH4 || objQ5 == c30Var) {
                objQ5 = new t4(l6Var, 6);
                ov0Var14.m0(objQ5);
            }
            n51.h((au0) ((o81) objQ5), null, !z2 && z3, null, null, null, null, o51.t, ov0Var14, 805306368, 506);
            if (b(s03Var)) {
                ov0Var14.c0(1782353572);
            } else {
                ov0Var14.c0(1720625942);
                s83.b(ke0.N(2131624262, ov0Var14), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var14, 0, 0, 262142);
                ov0Var14 = ov0Var14;
            }
            ov0Var14.s();
            String strE = e(ey1Var12);
            dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
            Object objQ6 = ov0Var14.Q();
            if (objQ6 == c30Var) {
                ey1Var19 = ey1Var12;
                objQ6 = new f4(ey1Var19, 2);
                ov0Var14.m0(objQ6);
            } else {
                ey1Var19 = ey1Var12;
            }
            ov0 ov0Var15 = ov0Var14;
            ee0.i(strE, (lu0) objQ6, dv1VarE2, z5, null, o51.u, null, null, null, o51.v, false, null, null, null, true, 0, 0, null, null, ov0Var15, 1573296, 12583296, 8253360);
            String strF = f(ey1Var16);
            boolean z6 = u4Var.a;
            j62 j62Var = new j62();
            n91 n91Var = new n91(7, 0, 123);
            dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
            Object objQ7 = ov0Var15.Q();
            if (objQ7 == c30Var) {
                objQ7 = new f4(ey1Var16, 3);
                ov0Var15.m0(objQ7);
            }
            ee0.i(strF, (lu0) objQ7, dv1VarE3, z5, null, o51.w, null, null, null, sb.a0(1038465697, new f5(u4Var, ey1Var16, ey1Var15, 0), ov0Var15), z6, j62Var, n91Var, null, true, 0, 0, null, null, ov0Var15, 1573296, 12779904, 8196016);
            ov0 ov0Var16 = ov0Var15;
            if (c(ey1Var15)) {
                ov0Var16.c0(1800805268);
                String strG = g(ey1Var17);
                j62 j62Var2 = new j62();
                n91 n91Var2 = new n91(7, 0, 123);
                boolean z7 = u4Var.b;
                dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                Object objQ8 = ov0Var16.Q();
                if (objQ8 == c30Var) {
                    objQ8 = new f4(ey1Var17, 4);
                    ov0Var16.m0(objQ8);
                }
                ee0.i(strG, (lu0) objQ8, dv1VarE4, z5, null, o51.x, null, null, null, sb.a0(-1864739579, new g4(u4Var, 1), ov0Var16), z7, j62Var2, n91Var2, null, true, 0, 0, null, null, ov0Var16, 1573296, 12779904, 8196016);
                ov0Var16 = ov0Var16;
            } else {
                ov0Var16.c0(1782353572);
            }
            ov0Var16.s();
            if (c(ey1Var15)) {
                ov0Var16.c0(1801352015);
                String strH = h(ey1Var18);
                dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                Object objQ9 = ov0Var16.Q();
                if (objQ9 == c30Var) {
                    objQ9 = new f4(ey1Var18, 5);
                    ov0Var16.m0(objQ9);
                }
                ov0 ov0Var17 = ov0Var16;
                ee0.i(strH, (lu0) objQ9, dv1VarE5, z5, null, o51.y, null, null, null, null, false, null, null, null, true, 0, 0, null, null, ov0Var17, 1573296, 12582912, 8257456);
                ov0Var16 = ov0Var17;
            } else {
                ov0Var16.c0(1782353572);
            }
            ov0Var16.s();
            boolean z8 = u4Var.c;
            dv1 dv1VarE6 = iw2.e(av1Var, 1.0f);
            boolean zH5 = ov0Var16.h(l6Var);
            Object objQ10 = ov0Var16.Q();
            if (zH5 || objQ10 == c30Var) {
                objQ10 = new g5(l6Var, ey1Var19, ey1Var16, ey1Var18, ey1Var15, 0);
                ov0Var16.m0(objQ10);
            }
            n51.a((au0) objQ10, dv1VarE6, z8, null, null, null, null, null, sb.a0(457941647, new h5(ey1Var15, 0), ov0Var16), ov0Var16, 805306416, 504);
            Object objQ11 = ov0Var16.Q();
            if (objQ11 == c30Var) {
                objQ11 = new q2(ey1Var15, ey1Var16, ey1Var17, ey1Var18);
                ov0Var16.m0(objQ11);
            }
            n51.j((au0) objQ11, null, z5, null, null, null, sb.a0(1007319202, new h5(ey1Var15, 1), ov0Var16), ov0Var16, 805306374, 506);
            ov0 ov0Var18 = ov0Var16;
            s83.b(ke0.N(2131624248, ov0Var16), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var16.j(hh0Var2)).l, ov0Var18, 0, 0, 131070);
            ov0Var = ov0Var18;
            Object objQ12 = ov0Var.Q();
            if (objQ12 == c30Var) {
                objQ12 = new h2(ey1Var13, ey1Var14, 5);
                ov0Var.m0(objQ12);
            }
            n51.j((au0) objQ12, null, (z2 || b(s03Var)) ? false : true, null, null, null, o51.z, ov0Var, 805306374, 506);
            ov0Var.s();
        } else {
            ov0Var.c0(1791077871);
            ey1 ey1Var21 = ey1Var3;
            sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(-749060115, new h5(ey1Var21, 2), ov0Var), ov0Var, 196614, 30);
            CloudAccount account3 = i(ey1Var21).getAccount();
            if (account3 == null) {
                ov0Var.c0(1791997485);
            } else {
                ov0Var.c0(1791997486);
                if (account3.getSoftwareMembershipRequired()) {
                    ov0Var.c0(567073228);
                } else {
                    ov0Var.c0(1404079207);
                    int i6 = o51.f(account3.getQuotaScope(), "device") ? 2131624173 : 2131624120;
                    Integer numValueOf2 = Integer.valueOf(account3.getSearchUsed());
                    Integer numValueOf3 = Integer.valueOf(account3.getSearchLimit());
                    int searchLimit = account3.getSearchLimit() - account3.getSearchUsed();
                    if (searchLimit < 0) {
                        searchLimit = 0;
                    }
                    ov0 ov0Var19 = ov0Var;
                    s83.b(ke0.O(i6, new Object[]{numValueOf2, numValueOf3, Integer.valueOf(account3.getExtraQuotaRemaining() + searchLimit)}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var19, 0, 0, 262142);
                    ov0Var = ov0Var19;
                }
                ov0Var.s();
                if (o51.f(account3.getQuotaScope(), "device")) {
                    ov0Var.c0(567073228);
                } else {
                    ov0Var.c0(1404090722);
                    Long deviceQuotaActivatesAt = account3.getDeviceQuotaActivatesAt();
                    if (deviceQuotaActivatesAt == null) {
                        ov0Var.c0(577139423);
                    } else {
                        ov0Var.c0(577139424);
                        String str4 = DateFormat.getDateTimeInstance().format(new Date(deviceQuotaActivatesAt.longValue()));
                        str4.getClass();
                        ov0 ov0Var20 = ov0Var;
                        s83.b(ke0.O(2131624174, new Object[]{str4}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var20, 0, 0, 131070);
                        ov0Var = ov0Var20;
                    }
                    ov0Var.s();
                }
                ov0Var.s();
            }
            ov0Var.s();
            ov0 ov0Var21 = ov0Var;
            s83.b(ke0.N(2131624118, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var21, 0, 0, 262142);
            ov0Var = ov0Var21;
            CloudAccount account4 = i(ey1Var21).getAccount();
            if (account4 == null) {
                ov0Var.c0(1792757884);
            } else {
                ov0Var.c0(1792757885);
                s83.b(ke0.O(2131625024, new Object[]{Integer.valueOf(account4.getSoftwareDeviceCount()), Integer.valueOf(account4.getSoftwareDeviceLimit())}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131070);
                if (o51.f(account4.getDeviceRole(), "software") || account4.getSoftwareMembershipRequired()) {
                    ov0Var = ov0Var;
                    ov0Var = ov0Var;
                    ov0Var.c0(1766652974);
                    s83.b(ke0.N(account4.getSoftwareMembershipRequired() ? 2131625027 : 2131625026, ov0Var), null, ((kz) ov0Var.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262138);
                    n51.h(au0Var, null, false, null, null, null, null, o51.k, ov0Var, 805306368, 510);
                    ov0Var = ov0Var;
                } else {
                    ov0Var = ov0Var;
                    ov0Var.c0(1755972451);
                }
                ov0Var.s();
            }
            ov0Var.s();
            CloudAccount account5 = i(ey1Var21).getAccount();
            if (o51.f(account5 != null ? account5.getDeviceRole() : null, "primary")) {
                ov0Var.c0(1720420935);
                da0.i(l6Var, z2, ov0Var, 0);
                ov0Var.s();
            } else {
                CloudAccount account6 = i(ey1Var21).getAccount();
                if (o51.f(account6 != null ? account6.getDeviceRole() : null, "companion")) {
                    ov0Var.c0(1720424484);
                    ov0 ov0Var22 = ov0Var;
                    s83.b(ke0.N(2131624156, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var22, 0, 0, 131070);
                    ov0Var = ov0Var22;
                } else {
                    ov0Var.c0(1782353572);
                }
                ov0Var.s();
            }
            sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(-600804394, new j5(l6Var, z2, s03Var4, ayVar), ov0Var), ov0Var, 196614, 30);
            boolean zH6 = ov0Var.h(l6Var);
            Object objQ13 = ov0Var.Q();
            if (zH6 || objQ13 == c30Var) {
                objQ13 = new t4(l6Var, 4);
                ov0Var.m0(objQ13);
            }
            n51.h((au0) ((o81) objQ13), iw2.e(av1Var, 1.0f), !z2 && z3, null, null, null, null, o51.n, ov0Var, 805306416, 504);
            boolean z9 = !z2;
            dv1 dv1VarE7 = iw2.e(av1Var, 1.0f);
            boolean zH7 = ov0Var.h(l6Var);
            Object objQ14 = ov0Var.Q();
            if (zH7 || objQ14 == c30Var) {
                ey1Var20 = ey1Var4;
                objQ14 = new k5(l6Var, ey1Var20, 0);
                ov0Var.m0(objQ14);
            } else {
                ey1Var20 = ey1Var4;
            }
            n51.h((au0) objQ14, dv1VarE7, z9, null, null, null, null, o51.o, ov0Var, 805306416, 504);
            if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                ov0Var.c0(1795333985);
                ov0 ov0Var23 = ov0Var;
                s83.b(ke0.N(2131624169, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var23, 0, 0, 131070);
                ov0Var = ov0Var23;
                Iterator it = k(s03Var5).iterator();
                while (it.hasNext()) {
                    sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(-1190521806, new j5(2, (CloudAccountDevice) it.next(), ey1Var5, ey1Var21, z2), ov0Var), ov0Var, 196614, 30);
                    ey1Var21 = ey1Var3;
                }
            } else {
                ov0Var.c0(1782353572);
            }
            ov0Var.s();
            Set setH0 = yo.H0(new String[]{"primary", "software"});
            CloudAccount account7 = i(ey1Var3).getAccount();
            if (zy.g0(setH0, account7 != null ? account7.getDeviceRole() : null)) {
                ov0Var.c0(1797573983);
                dv1 dv1VarE8 = iw2.e(av1Var, 1.0f);
                Object objQ15 = ov0Var.Q();
                if (objQ15 == c30Var) {
                    objQ15 = new s2(ey1Var6, 9);
                    ov0Var.m0(objQ15);
                }
                n51.h((au0) objQ15, dv1VarE8, z9, null, null, null, null, o51.q, ov0Var, 805306422, 504);
            } else {
                ov0Var.c0(1782353572);
            }
            ov0Var.s();
            boolean zH8 = ov0Var.h(l6Var);
            Object objQ16 = ov0Var.Q();
            if (zH8 || objQ16 == c30Var) {
                objQ16 = new t4(l6Var, 5);
                ov0Var.m0(objQ16);
            }
            n51.a((au0) ((o81) objQ16), iw2.e(av1Var, 1.0f), !z2 && z3, null, null, null, null, null, o51.r, ov0Var, 805306416, 504);
            ov0Var.s();
        }
        ov0Var.r();
    }

    public static final String e(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final String f(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final String g(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final String h(ey1 ey1Var) {
        return (String) ey1Var.getValue();
    }

    public static final CloudAccountState i(ey1 ey1Var) {
        return (CloudAccountState) ey1Var.getValue();
    }

    public static final boolean j(ey1 ey1Var) {
        return ((Boolean) ey1Var.getValue()).booleanValue();
    }

    public static final List k(s03 s03Var) {
        return (List) s03Var.getValue();
    }

    public static final Boolean l(s03 s03Var) {
        return (Boolean) s03Var.getValue();
    }

    public static final void m(mc3 mc3Var, dv1 dv1Var, lu0 lu0Var, lu0 lu0Var2, p10 p10Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        lu0 lu0Var3;
        fy2 fy2Var;
        ei eiVar;
        fy2 fy2Var2;
        hc3 hc3VarJ;
        ov0 ov0Var2;
        boolean z2;
        mc3 mc3Var2 = mc3Var;
        lu0 lu0Var4 = lu0Var;
        pr prVar = j9.f;
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(511725103);
        int i3 = (i2 & 6) == 0 ? (ov0Var3.f(mc3Var2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= ov0Var3.f(dv1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var3.h(lu0Var4) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var3.f(prVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ov0Var3.h(lu0Var2) ? 16384 : 8192;
        }
        p10 p10Var2 = p10Var;
        if ((196608 & i2) == 0) {
            i3 |= ov0Var3.h(p10Var2) ? 131072 : 65536;
        }
        if (ov0Var3.T(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objQ = ov0Var3.Q();
            c30 c30Var = d30.a;
            if (z3 || objQ == c30Var) {
                objQ = new ei(mc3Var2);
                ov0Var3.m0(objQ);
            }
            ei eiVar2 = (ei) objQ;
            boolean z4 = i4 == 4;
            Object objQ2 = ov0Var3.Q();
            Object obj = objQ2;
            if (z4 || objQ2 == c30Var) {
                Object[] objArr = {mc3Var2.c()};
                fy2 fy2Var3 = new fy2();
                fy2Var3.addAll(yo.F0(objArr));
                ov0Var3.m0(fy2Var3);
                obj = fy2Var3;
            }
            fy2 fy2Var4 = (fy2) obj;
            boolean z5 = i4 == 4;
            Object objQ3 = ov0Var3.Q();
            if (z5 || objQ3 == c30Var) {
                long[] jArr = hn2.a;
                objQ3 = new zx1();
                ov0Var3.m0(objQ3);
            }
            zx1 zx1Var = (zx1) objQ3;
            Object objC = mc3Var2.c();
            w52 w52Var = mc3Var2.d;
            if (!fy2Var4.contains(objC)) {
                fy2Var4.clear();
                fy2Var4.add(mc3Var2.c());
            }
            if (o51.f(mc3Var2.c(), w52Var.getValue())) {
                if (fy2Var4.size() != 1 || !o51.f(fy2Var4.get(0), mc3Var2.c())) {
                    fy2Var4.clear();
                    fy2Var4.add(mc3Var2.c());
                }
                if (zx1Var.e != 1 || zx1Var.c(mc3Var2.c())) {
                    zx1Var.a();
                }
                eiVar2.getClass();
            }
            if (!o51.f(mc3Var2.c(), w52Var.getValue()) && !fy2Var4.contains(w52Var.getValue())) {
                ListIterator listIterator = fy2Var4.listIterator();
                int i5 = 0;
                while (true) {
                    xx0 xx0Var = (xx0) listIterator;
                    if (!xx0Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (o51.f(lu0Var2.invoke(xx0Var.next()), lu0Var2.invoke(w52Var.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    fy2Var4.add(w52Var.getValue());
                } else {
                    fy2Var4.set(i5, w52Var.getValue());
                }
            }
            if (zx1Var.c(w52Var.getValue()) && zx1Var.c(mc3Var2.c())) {
                ov0Var3.c0(1968995539);
                ov0Var3.p(false);
                lu0Var3 = lu0Var4;
                fy2Var = fy2Var4;
                eiVar = eiVar2;
            } else {
                ov0Var3.c0(1966410449);
                zx1Var.a();
                int size = fy2Var4.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = fy2Var4.get(i6);
                    ei eiVar3 = eiVar2;
                    p10 p10Var3 = p10Var2;
                    fy2 fy2Var5 = fy2Var4;
                    zx1Var.m(obj2, sb.a0(-23915175, new uh(mc3Var2, obj2, lu0Var4, eiVar3, fy2Var5, p10Var3), ov0Var3));
                    i6++;
                    mc3Var2 = mc3Var;
                    lu0Var4 = lu0Var4;
                    eiVar2 = eiVar3;
                    fy2Var4 = fy2Var5;
                    p10Var2 = p10Var;
                }
                lu0Var3 = lu0Var4;
                fy2Var = fy2Var4;
                eiVar = eiVar2;
                ov0Var3.p(false);
            }
            boolean zF = ov0Var3.f(mc3Var.f()) | ov0Var3.f(eiVar);
            Object objQ4 = ov0Var3.Q();
            if (zF || objQ4 == c30Var) {
                objQ4 = (g60) lu0Var3.invoke(eiVar);
                ov0Var3.m0(objQ4);
            }
            g60 g60Var = (g60) objQ4;
            mc3 mc3Var3 = eiVar.a;
            boolean zF2 = ov0Var3.f(eiVar);
            Object objQ5 = ov0Var3.Q();
            if (zF2 || objQ5 == c30Var) {
                objQ5 = ke0.H(Boolean.FALSE);
                ov0Var3.m0(objQ5);
            }
            ey1 ey1Var = (ey1) objQ5;
            ey1 ey1VarL = ke0.L(g60Var.d, ov0Var3);
            if (o51.f(mc3Var3.c(), mc3Var3.d.getValue())) {
                ey1Var.setValue(Boolean.FALSE);
            } else if (ey1VarL.getValue() != null) {
                ey1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) ey1Var.getValue()).booleanValue();
            dv1 dv1Var2 = av1.a;
            if (zBooleanValue) {
                ov0Var3.c0(1353077497);
                fy2Var2 = fy2Var;
                ov0 ov0Var4 = ov0Var3;
                hc3VarJ = h73.j(eiVar.a, o51.C0, null, ov0Var4, 0, 2);
                boolean zF3 = ov0Var4.f(hc3VarJ);
                Object objQ6 = ov0Var4.Q();
                if (zF3 || objQ6 == c30Var) {
                    objQ6 = xp1.o(dv1Var2);
                    ov0Var4.m0(objQ6);
                }
                dv1Var2 = (dv1) objQ6;
                ov0Var4.p(false);
                ov0Var2 = ov0Var4;
            } else {
                ov0 ov0Var5 = ov0Var3;
                fy2Var2 = fy2Var;
                ov0Var5.c0(1353343539);
                ov0Var5.p(false);
                hc3VarJ = null;
                ov0Var2 = ov0Var5;
            }
            dv1 dv1VarD = dv1Var.d(dv1Var2.d(new ai(hc3VarJ, ey1VarL, eiVar)));
            Object objQ7 = ov0Var2.Q();
            if (objQ7 == c30Var) {
                objQ7 = new xh(eiVar);
                ov0Var2.m0(objQ7);
            }
            xh xhVar = (xh) objQ7;
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, v20.e, xhVar);
            q73.h(ov0Var2, v20.d, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar = v20.f;
            if (ov0Var2.S) {
                ov0Var2.b(numValueOf, ghVar);
            }
            q73.g(ov0Var2, v20.g);
            q73.h(ov0Var2, v20.c, dv1VarH);
            ov0Var2.c0(-860173498);
            int size2 = fy2Var2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = fy2Var2.get(i7);
                ov0Var2.a0(-2026002954, lu0Var2.invoke(obj3));
                pu0 pu0Var = (pu0) zx1Var.g(obj3);
                if (pu0Var == null) {
                    ov0Var2.c0(1618454323);
                    z2 = false;
                } else {
                    z2 = false;
                    ov0Var2.c0(-2026001778);
                    pu0Var.invoke(ov0Var2, 0);
                }
                ov0Var2.p(z2);
                ov0Var2.p(z2);
            }
            ov0Var2.p(false);
            ov0Var2.p(true);
            ov0Var = ov0Var2;
        } else {
            ov0 ov0Var6 = ov0Var3;
            ov0Var6.W();
            ov0Var = ov0Var6;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new vh(mc3Var, dv1Var, lu0Var, lu0Var2, p10Var, i2);
        }
    }

    public static final void n(Object obj, dv1 dv1Var, lu0 lu0Var, l9 l9Var, String str, lu0 lu0Var2, p10 p10Var, f30 f30Var, int i2) {
        dv1 dv1Var2;
        l9 l9Var2;
        lu0 lu0Var3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1501828832);
        int i3 = i2 | (ov0Var.f(obj) ? 4 : 2) | 199728;
        if (ov0Var.T(i3 & 1, (599187 & i3) != 599186)) {
            pr prVar = j9.f;
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = wa.t;
                ov0Var.m0(objQ);
            }
            lu0 lu0Var4 = (lu0) objQ;
            mc3 mc3VarQ = h73.q(obj, str, ov0Var, (i3 & 14) | 48, 0);
            av1 av1Var = av1.a;
            m(mc3VarQ, av1Var, lu0Var, lu0Var4, p10Var, ov0Var, 224688);
            dv1Var2 = av1Var;
            lu0Var3 = lu0Var4;
            l9Var2 = prVar;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
            l9Var2 = l9Var;
            lu0Var3 = lu0Var2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rh(obj, dv1Var2, lu0Var, l9Var2, str, lu0Var3, p10Var, i2);
        }
    }

    public static final void o(dv1 dv1Var, lu0 lu0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-932836462);
        int i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2 | (ov0Var.h(lu0Var) ? 32 : 16);
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            gh0.h(ov0Var, xp1.s(dv1Var, lu0Var));
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j2(i2, 3, dv1Var, lu0Var);
        }
    }

    public static final void p(ar2 ar2Var, p10 p10Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-614342087);
        int i3 = (ov0Var.h(ar2Var) ? 4 : 2) | i2;
        int i4 = 1;
        int i5 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            ov0Var.c0(-1009319487);
            q60 q60Var = null;
            ke0.m(zm3.S(S(new d6(ar2Var, q60Var, 19)), ar2Var.g, new in1(ar2Var, q60Var, i4), null, new dq2(ar2Var, i4)), p10Var, ov0Var, 48);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j00(ar2Var, p10Var, i2, i5);
        }
    }

    public static final void q(x73 x73Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        dv1 dv1VarS;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1533506138);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(x73Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        int i5 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            ov0Var.c0(-885604480);
            if (x73Var.i()) {
                q60 q60Var = null;
                dv1VarS = zm3.S(S(new s73(x73Var, q60Var, i5)), x73Var.y, new in1(x73Var, q60Var, i4), new t73(x73Var, q60Var, i5), new d70(x73Var, i4));
            } else {
                dv1VarS = av1.a;
            }
            ke0.m(dv1VarS, p10Var, ov0Var, i3 & 112);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new i00(x73Var, p10Var, i2, i5);
        }
    }

    public static final void r(final ul1 ul1Var, final AppState appState, final float f2, final au0 au0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, final au0 au0Var5, f30 f30Var, final int i2) {
        ov0 ov0Var;
        ey1 ey1Var;
        char c2;
        int i3;
        ov0 ov0Var2;
        boolean z2;
        ey1 ey1Var2;
        int i4;
        ul1Var.getClass();
        appState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        au0Var4.getClass();
        au0Var5.getClass();
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(-1832944688);
        int i5 = i2 | (ov0Var3.h(ul1Var) ? 4 : 2) | (ov0Var3.h(appState) ? 32 : 16) | (ov0Var3.c(f2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var3.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var3.h(au0Var2) ? 16384 : 8192) | (ov0Var3.h(au0Var3) ? 131072 : 65536) | (ov0Var3.h(au0Var4) ? 1048576 : 524288) | (ov0Var3.h(au0Var5) ? 8388608 : 4194304);
        if (ov0Var3.T(i5 & 1, (4793491 & i5) != 4793490)) {
            boolean zW = n51.w(ov0Var3);
            Context context = (Context) ov0Var3.j(AndroidCompositionLocals_androidKt.b);
            Object objQ = ov0Var3.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H(null);
                ov0Var3.m0(objQ);
            }
            ey1 ey1Var3 = (ey1) objQ;
            Object objQ2 = ov0Var3.Q();
            if (objQ2 == c30Var) {
                objQ2 = ke0.H(new ImportExportSelection(false, false, false, false, false, 31, null));
                ov0Var3.m0(objQ2);
            }
            ey1 ey1Var4 = (ey1) objQ2;
            Object objQ3 = ov0Var3.Q();
            if (objQ3 == c30Var) {
                objQ3 = ke0.H(null);
                ov0Var3.m0(objQ3);
            }
            ey1 ey1Var5 = (ey1) objQ3;
            int i6 = i5;
            v7 v7Var = new v7("application/json");
            boolean zH = ov0Var3.h(ul1Var) | ov0Var3.h(context);
            Object objQ4 = ov0Var3.Q();
            if (zH || objQ4 == c30Var) {
                objQ4 = new xm0(ul1Var, ey1Var4, context);
                ov0Var3.m0(objQ4);
            }
            no1 no1VarB0 = sb.b0(v7Var, (lu0) objQ4, ov0Var3);
            w7 w7Var = new w7(0);
            boolean zH2 = ov0Var3.h(ul1Var) | ov0Var3.h(context);
            Object objQ5 = ov0Var3.Q();
            if (zH2 || objQ5 == c30Var) {
                objQ5 = new xm0(ul1Var, context, ey1Var5);
                ov0Var3.m0(objQ5);
            }
            no1 no1VarB1 = sb.b0(w7Var, (lu0) objQ5, ov0Var3);
            ImportExportCounts importExportCounts = (ImportExportCounts) ey1Var3.getValue();
            if (importExportCounts == null) {
                ov0Var3.c0(960871274);
                z2 = false;
                ov0Var3.p(false);
                ey1Var = ey1Var3;
                i3 = 131072;
                c2 = 0;
                ov0Var2 = ov0Var3;
            } else {
                ov0Var3.c0(960871275);
                boolean zH3 = ov0Var3.h(no1VarB0);
                Object objQ6 = ov0Var3.Q();
                if (zH3 || objQ6 == c30Var) {
                    objQ6 = new ji1(no1VarB0, ey1Var4, ey1Var3, 9);
                    ov0Var3.m0(objQ6);
                }
                lu0 lu0Var = (lu0) objQ6;
                Object objQ7 = ov0Var3.Q();
                if (objQ7 == c30Var) {
                    objQ7 = new s2(ey1Var3, 28);
                    ov0Var3.m0(objQ7);
                }
                au0 au0Var6 = (au0) objQ7;
                ey1Var = ey1Var3;
                c2 = 0;
                i3 = 131072;
                hd0.d(true, importExportCounts, lu0Var, au0Var6, ov0Var3, 3078);
                ov0Var2 = ov0Var3;
                z2 = false;
                ov0Var2.p(false);
            }
            LocationSpooferDataPackage locationSpooferDataPackage = (LocationSpooferDataPackage) ey1Var5.getValue();
            if (locationSpooferDataPackage == null) {
                ov0Var2.c0(961426298);
                ov0Var2.p(z2);
                i3 = i3;
                i6 = i6;
                no1VarB1 = no1VarB1;
                i4 = 16384;
            } else {
                ov0Var2.c0(961426299);
                ImportExportCounts importExportCounts2 = new ImportExportCounts(locationSpooferDataPackage.getCollectionRoutes().size() + locationSpooferDataPackage.getLocations().size(), locationSpooferDataPackage.getSavedLocations().size(), locationSpooferDataPackage.getSavedRoutes().size(), locationSpooferDataPackage.getAppCoordinateSystems().size(), locationSpooferDataPackage.getSettings() != null ? 1 : 0);
                boolean zH4 = ov0Var2.h(ul1Var) | ov0Var2.h(locationSpooferDataPackage) | ov0Var2.h(context);
                Object objQ8 = ov0Var2.Q();
                if (zH4 || objQ8 == c30Var) {
                    ey1Var2 = ey1Var5;
                    i4 = 16384;
                    lh lhVar = new lh(ul1Var, locationSpooferDataPackage, ey1Var2, context, 5);
                    ov0Var2.m0(lhVar);
                    objQ8 = lhVar;
                } else {
                    ey1Var2 = ey1Var5;
                    i4 = 16384;
                }
                lu0 lu0Var2 = (lu0) objQ8;
                Object objQ9 = ov0Var2.Q();
                if (objQ9 == c30Var) {
                    objQ9 = new s2(ey1Var2, 29);
                    ov0Var2.m0(objQ9);
                }
                hd0.d(false, importExportCounts2, lu0Var2, (au0) objQ9, ov0Var2, 3078);
                z2 = false;
                ov0Var2.p(false);
            }
            fn0 fn0Var = iw2.c;
            long j2 = zW ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j2, iy0Var);
            er1 er1VarC = ws.c(j9.f, z2);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var2, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var2, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var2, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH);
            ho hoVar = am1.g;
            ey1 ey1Var6 = ey1Var;
            nr nrVar = j9.r;
            yz yzVarA = wz.a(hoVar, nrVar, ov0Var2, 0);
            int i7 = i6;
            no1 no1Var = no1VarB1;
            int iHashCode2 = Long.hashCode(ov0Var2.T);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, fn0Var);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, yzVarA);
            q73.h(ov0Var2, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH2);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(U(av1Var), 20.0f, 18.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
            int iHashCode3 = Long.hashCode(ov0Var2.T);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarE);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, kk2VarA);
            q73.h(ov0Var2, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH3);
            dv1 dv1VarN = xp1.n(iw2.k(av1Var, 42.0f), cj2.a(13.0f));
            long j3 = bk.g;
            dv1 dv1VarK2 = xp1.k(dv1VarN, hz.c(0.14f, j3), iy0Var);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iHashCode4 = Long.hashCode(ov0Var2.T);
            l72 l72VarL4 = ov0Var2.l();
            dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarK2);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, er1VarC2);
            q73.h(ov0Var2, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH4);
            ov0 ov0Var4 = ov0Var2;
            int i8 = i4;
            int i9 = i3;
            t01.a(ke0.x(), null, null, j3, ov0Var4, 3120, 4);
            az2.t(ov0Var4, true, av1Var, 12.0f, ov0Var4);
            yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var4, 0);
            int iHashCode5 = Long.hashCode(ov0Var4.T);
            l72 l72VarL5 = ov0Var4.l();
            dv1 dv1VarH5 = xp1.H(ov0Var4, av1Var);
            ov0Var4.g0();
            if (ov0Var4.S) {
                ov0Var4.k(x30Var);
            } else {
                ov0Var4.p0();
            }
            q73.h(ov0Var4, ghVar, yzVarA2);
            q73.h(ov0Var4, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var4, ghVar3, ov0Var4, waVar);
            q73.h(ov0Var4, ghVar4, dv1VarH5);
            String strN = ke0.N(2131624459, ov0Var4);
            hh0 hh0Var = le3.a;
            q93 q93Var = ((je3) ov0Var4.j(hh0Var)).f;
            jr0 jr0Var = jr0.j;
            hh0 hh0Var2 = mz.a;
            s83.b(strN, null, ((kz) ov0Var4.j(hh0Var2)).o, 0L, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var4, 1572864, 0, 131002);
            s83.b(ke0.N(2131624458, ov0Var4), null, hz.c(0.6f, ((kz) ov0Var4.j(hh0Var2)).o), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var)).l, ov0Var4, 0, 0, 131066);
            ov0Var4.p(true);
            ov0Var4.p(true);
            dv1 dv1VarF = zm3.F(fn0Var, 16.0f, 0.0f, 2);
            b52 b52VarF = zm3.f(7, f2 + 24.0f);
            jo joVar = new jo(14.0f, true, new fo(0));
            boolean zG = ((i7 & 29360128) == 8388608) | ov0Var4.g(zW) | ov0Var4.h(appState) | ((i7 & 57344) == i8) | ((i7 & 458752) == i9) | ((i7 & 7168) == 2048) | ((3670016 & i7) == 1048576) | ov0Var4.h(no1Var) | ov0Var4.h(ul1Var);
            Object objQ10 = ov0Var4.Q();
            if (zG || objQ10 == c30Var) {
                i70 i70Var = new i70(au0Var5, zW, appState, au0Var2, au0Var3, au0Var, au0Var4, no1Var, ul1Var, ey1Var6);
                ov0Var4.m0(i70Var);
                objQ10 = i70Var;
            }
            ke0.d(dv1VarF, null, b52VarF, joVar, null, null, false, null, (lu0) objQ10, ov0Var4, 24582, 490);
            ov0Var = ov0Var4;
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var = ov0Var3;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(appState, f2, au0Var, au0Var2, au0Var3, au0Var4, au0Var5, i2) { // from class: an0
                public final /* synthetic */ AppState f;
                public final /* synthetic */ float g;
                public final /* synthetic */ au0 h;
                public final /* synthetic */ au0 i;
                public final /* synthetic */ au0 j;
                public final /* synthetic */ au0 k;
                public final /* synthetic */ au0 l;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(1);
                    ji2.r(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void s(f12 f12Var, l9 l9Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ov0Var.f(f12Var) : ov0Var.h(f12Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.f(l9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(p10Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        boolean z2 = true;
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !ov0Var.f(f12Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objQ = ov0Var.Q();
            if (z4 || objQ == d30.a) {
                objQ = new cx0(l9Var, f12Var);
                ov0Var.m0(objQ);
            }
            jf.a((cx0) objQ, null, new db2(false, ip2.e, false, 0), p10Var, ov0Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(f12Var, l9Var, p10Var, i2, 0);
        }
    }

    public static final void t(boolean z2, String str, au0 au0Var, pu0 pu0Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-956069405);
        int i3 = i2 | (ov0Var2.g(z2) ? 4 : 2) | (ov0Var2.f(str) ? 32 : 16) | (ov0Var2.h(pu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H("");
                ov0Var2.m0(objQ);
            }
            ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                objQ2 = ke0.H("");
                ov0Var2.m0(objQ2);
            }
            ey1 ey1Var2 = (ey1) objQ2;
            Object objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                objQ3 = ke0.H("");
                ov0Var2.m0(objQ3);
            }
            ey1 ey1Var3 = (ey1) objQ3;
            boolean z3 = (i3 & 14) == 4;
            Object objQ4 = ov0Var2.Q();
            if (z3 || objQ4 == c30Var) {
                objQ4 = new n5(z2, au0Var, 0);
                ov0Var2.m0(objQ4);
            }
            ov0Var = ov0Var2;
            xq1.a((au0) objQ4, sb.a0(-1351087573, new w4(pu0Var, z2, ey1Var, ey1Var2, ey1Var3, 1), ov0Var2), null, sb.a0(-683705683, new o5(au0Var, z2), ov0Var2), o51.U, sb.a0(-1830116496, new w4(str, z2, ey1Var, ey1Var2, ey1Var3, 2), ov0Var2), null, 0L, 0L, 0L, 0L, null, ov0Var, 1772592, 16276);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(z2, str, au0Var, pu0Var, i2);
        }
    }

    public static final void u(final f12 f12Var, final boolean z2, final hg2 hg2Var, final boolean z3, long j2, final float f2, final dv1 dv1Var, f30 f30Var, final int i2) {
        int i3;
        final long j3;
        int i4;
        long j4;
        final boolean z4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ov0Var.f(f12Var) : ov0Var.h(f12Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.d(hg2Var.ordinal()) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var.g(z3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ov0Var.f(dv1Var) ? 1048576 : 524288;
        }
        if (ov0Var.T(i3 & 1, (533651 & i3) != 533650)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                ov0Var.W();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            ov0Var.q();
            hg2 hg2Var2 = hg2.f;
            hg2 hg2Var3 = hg2.e;
            if (z2) {
                rs2 rs2Var = tq2.a;
                z4 = (hg2Var == hg2Var3 && !z3) || (hg2Var == hg2Var2 && z3);
            } else {
                rs2 rs2Var2 = tq2.a;
                z4 = (hg2Var != hg2Var3 || z3) && !(hg2Var == hg2Var2 && z3);
            }
            mr mrVar = z4 ? n51.b : n51.a;
            int i5 = i4 & 14;
            boolean zG = ((i4 & 112) == 32) | (i5 == 4 || ((i4 & 8) != 0 && ov0Var.h(f12Var))) | ov0Var.g(z4);
            Object objQ = ov0Var.Q();
            if (zG || objQ == d30.a) {
                objQ = new lu0() { // from class: tf
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        ss2 ss2Var = (ss2) obj;
                        long jB = f12Var.b();
                        ss2Var.a(tq2.a, new sq2(z2 ? bx0.f : bx0.g, jB, z4 ? rq2.e : rq2.g, (9223372034707292159L & jB) != 9205357640488583168L));
                        return mf3.a;
                    }
                };
                ov0Var.m0(objQ);
            }
            final dv1 dv1VarA = gs2.a(dv1Var, false, (lu0) objQ);
            final aj3 aj3Var = (aj3) ov0Var.j(z30.u);
            long j5 = j4;
            mr mrVar2 = mrVar;
            j3 = j5;
            s(f12Var, mrVar2, sb.a0(1365123137, new pu0() { // from class: uf
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        k22.b(z30.u.a(aj3Var), sb.a0(1260045569, new wf(j3, z4, dv1VarA, f12Var), ov0Var2), ov0Var2, 56);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, i5 | 384);
        } else {
            ov0Var.W();
            j3 = j2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final long j6 = j3;
            ee2VarT.d = new pu0() { // from class: vf
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ji2.u(f12Var, z2, hg2Var, z3, j6, f2, dv1Var, (f30) obj, wc0.m0(i2 | 1));
                    return mf3.a;
                }
            };
        }
    }

    public static final void v(dv1 dv1Var, au0 au0Var, boolean z2, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (ov0Var.h(au0Var) ? 32 : 16) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i4 & 1, (i4 & 147) != 146)) {
            rs2 rs2Var = tq2.a;
            gh0.h(ov0Var, xp1.p(iw2.l(dv1Var, 25.0f, 25.0f), new zf(au0Var, z2)));
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yf(dv1Var, au0Var, z2, i2, 0);
        }
    }

    public static final dv1 w(dv1 dv1Var, float f2, long j2, au2 au2Var) {
        return dv1Var.d(new hs(f2, new qy2(j2), au2Var));
    }

    public static final dv1 x(dv1 dv1Var, gt gtVar) {
        return dv1Var.d(new et(gtVar));
    }

    public static final void y(long j2, x32 x32Var) {
        if (x32Var == x32.e) {
            if (l50.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            s21.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (l50.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            s21.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void z(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                vd0.d(th, th2);
            }
        }
    }
}
