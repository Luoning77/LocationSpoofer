package com.vincenthzr.locationspoofer;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;
import defpackage.a83;
import defpackage.ac0;
import defpackage.am1;
import defpackage.bk;
import defpackage.c30;
import defpackage.cd2;
import defpackage.ce1;
import defpackage.ch1;
import defpackage.d30;
import defpackage.e33;
import defpackage.ee0;
import defpackage.eu;
import defpackage.ey1;
import defpackage.f30;
import defpackage.g83;
import defpackage.gh0;
import defpackage.hh0;
import defpackage.hz;
import defpackage.ig0;
import defpackage.ik0;
import defpackage.in;
import defpackage.iw2;
import defpackage.j10;
import defpackage.j43;
import defpackage.k22;
import defpackage.ke0;
import defpackage.kk;
import defpackage.kz;
import defpackage.l6;
import defpackage.l80;
import defpackage.mf3;
import defpackage.mz;
import defpackage.n51;
import defpackage.nk;
import defpackage.o51;
import defpackage.oi0;
import defpackage.ok;
import defpackage.ov0;
import defpackage.p10;
import defpackage.p2;
import defpackage.pu0;
import defpackage.rh0;
import defpackage.s03;
import defpackage.sb;
import defpackage.sh0;
import defpackage.th0;
import defpackage.tk1;
import defpackage.u83;
import defpackage.uh0;
import defpackage.uh1;
import defpackage.uk1;
import defpackage.ul1;
import defpackage.uz;
import defpackage.vh0;
import defpackage.vh1;
import defpackage.vk1;
import defpackage.vz;
import defpackage.wc0;
import defpackage.wq1;
import defpackage.x20;
import defpackage.xb0;
import defpackage.xp1;
import defpackage.z30;
import defpackage.zb1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;
    private final zb1 accountViewModel$delegate;
    private final zb1 viewModel$delegate;

    public MainActivity() {
        vk1 vk1Var = new vk1(this, 0);
        ce1 ce1Var = ce1.g;
        this.viewModel$delegate = ig0.A(ce1Var, vk1Var);
        this.accountViewModel$delegate = ig0.A(ce1Var, new vk1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndRequestPermissions() {
        ArrayList arrayListI = am1.I("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_PHONE_STATE");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            arrayListI.add("android.permission.BLUETOOTH_SCAN");
            arrayListI.add("android.permission.BLUETOOTH_CONNECT");
        }
        if (i >= 33) {
            arrayListI.add("android.permission.POST_NOTIFICATIONS");
        }
        ArrayList arrayList = new ArrayList();
        int size = arrayListI.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListI.get(i2);
            i2++;
            if (checkSelfPermission((String) obj) != 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            requestPermissions((String[]) arrayList.toArray(new String[0]), 100);
        } else {
            checkBackgroundLocation();
            requestIgnoreBatteryOptimizations();
        }
    }

    private final void checkBackgroundLocation() {
        if (Build.VERSION.SDK_INT < 29 || checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return;
        }
        requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 101);
    }

    private final l6 getAccountViewModel() {
        return (l6) this.accountViewModel$delegate.getValue();
    }

    private final ul1 getViewModel() {
        return (ul1) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCreate$lambda$10(MainActivity mainActivity, f30 f30Var, int i) {
        int i2 = 1;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            k22.b(ch1.a.a(mainActivity), sb.a0(1344475077, new uk1(mainActivity, i2), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCreate$lambda$10$lambda$9(MainActivity mainActivity, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            ey1 ey1VarS = ee0.s(mainActivity.getAccountViewModel().c, ov0Var);
            Boolean boolValueOf = Boolean.valueOf(onCreate$lambda$10$lambda$9$lambda$0(ey1VarS).getValidated());
            boolean zF = ov0Var.f(ey1VarS) | ov0Var.h(mainActivity);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = new l80(mainActivity, ey1VarS, null, 5);
                ov0Var.m0(objQ);
            }
            oi0.e(ov0Var, (pu0) objQ, boolValueOf);
            ey1 ey1VarS2 = ee0.s(mainActivity.getViewModel().y, ov0Var);
            boolean zW = n51.w(ov0Var);
            kz kzVar = zW ? bk.k : bk.j;
            hh0 hh0Var = z30.h;
            xb0 xb0Var = (xb0) ov0Var.j(hh0Var);
            boolean zC = ov0Var.c(xb0Var.g()) | ov0Var.c(xb0Var.D());
            Object objQ2 = ov0Var.Q();
            if (zC || objQ2 == c30Var) {
                float fG = xb0Var.g();
                float fD = xb0Var.D();
                if (fD > 1.15f) {
                    fD = 1.15f;
                }
                objQ2 = new ac0(fG, fD);
                ov0Var.m0(objQ2);
            }
            xb0 xb0Var2 = (xb0) objQ2;
            cd2 cd2Var = AndroidCompositionLocals_androidKt.b;
            Context contextN0 = (Context) ov0Var.j(cd2Var);
            boolean zF2 = ov0Var.f(onCreate$lambda$10$lambda$9$lambda$2(ey1VarS2).getCurrentLanguage());
            Object objQ3 = ov0Var.Q();
            if (zF2 || objQ3 == c30Var) {
                if (onCreate$lambda$10$lambda$9$lambda$2(ey1VarS2).getCurrentLanguage().length() > 0) {
                    contextN0 = wc0.n0(contextN0, onCreate$lambda$10$lambda$9$lambda$2(ey1VarS2).getCurrentLanguage());
                }
                ov0Var.m0(contextN0);
                objQ3 = contextN0;
            }
            Context context = (Context) objQ3;
            Configuration configuration = context.getResources().getConfiguration();
            kk kkVarA = cd2Var.a(context);
            hh0 hh0Var2 = AndroidCompositionLocals_androidKt.a;
            configuration.getClass();
            k22.c(new kk[]{kkVarA, hh0Var2.a(configuration), hh0Var.a(xb0Var2)}, sb.a0(-1907587963, new p2(kzVar, zW, mainActivity, ey1VarS2), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CloudAccountState onCreate$lambda$10$lambda$9$lambda$0(s03 s03Var) {
        return (CloudAccountState) s03Var.getValue();
    }

    private static final AppState onCreate$lambda$10$lambda$9$lambda$2(s03 s03Var) {
        return (AppState) s03Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCreate$lambda$10$lambda$9$lambda$8(kz kzVar, boolean z, MainActivity mainActivity, s03 s03Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            wq1.b(kzVar, null, null, sb.a0(-828284839, new tk1(z, mainActivity, s03Var), ov0Var), ov0Var, 3072, 6);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCreate$lambda$10$lambda$9$lambda$8$lambda$7(boolean z, MainActivity mainActivity, s03 s03Var, f30 f30Var, int i) {
        uz uzVarA;
        int i2 = 1;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            if (z) {
                hh0 hh0Var = vz.a;
                long jD = xp1.d(4280777463L);
                long j = hz.c;
                long jD2 = xp1.d(4278219741L);
                long jD3 = xp1.d(4288268273L);
                long jD4 = xp1.d(4293993762L);
                long jD5 = xp1.d(4281206275L);
                long jD6 = xp1.d(4294957782L);
                long jD7 = xp1.d(4280630884L);
                long jD8 = xp1.d(4284971411L);
                long jD9 = xp1.d(4280630884L);
                long jD10 = xp1.d(4284971155L);
                long jD11 = xp1.d(4282669180L);
                long jD12 = xp1.d(4281569252L);
                long jD13 = xp1.d(4283453520L);
                long jD14 = xp1.d(4282598211L);
                long jD15 = xp1.d(4292467161L);
                long jD16 = xp1.d(4282335039L);
                long jD17 = xp1.d(4286151033L);
                long jD18 = xp1.d(4282400832L);
                long jD19 = xp1.d(4285559152L);
                long jD20 = xp1.d(4282598211L);
                long jD21 = xp1.d(4286348412L);
                long jD22 = xp1.d(4283387727L);
                long jD23 = xp1.d(4287993237L);
                long jD24 = xp1.d(4281023316L);
                long jD25 = xp1.d(4282878207L);
                long jD26 = xp1.d(4283453520L);
                long jD27 = xp1.d(4280558628L);
                long jD28 = xp1.d(3875536895L);
                long jD29 = xp1.d(4286086806L);
                long j2 = hz.b;
                uzVarA = new uz(jD, j, jD2, jD3, jD4, j, jD5, jD6, jD7, jD8, jD9, jD10, jD11, jD12, j, jD13, j, jD14, jD15, jD16, jD17, jD18, jD19, jD20, jD21, jD22, jD23, jD24, jD25, jD26, jD27, jD28, jD29, j2, xp1.d(4294111986L), xp1.d(4280558628L), xp1.d(3439329279L), xp1.d(2164260863L), xp1.c(1728053247), xp1.d(4284900966L), xp1.d(4280558628L), xp1.d(3875536895L), xp1.d(4285756275L), xp1.d(4280558628L), xp1.d(4284900966L), xp1.d(4281150765L), xp1.d(4293519849L), xp1.d(4282400832L), xp1.d(4281940281L), hz.c(0.6f, j2), xp1.c(1299876518), xp1.d(4284328703L), xp1.c(654311423));
            } else {
                uzVarA = vz.a();
            }
            ee0.h(uzVarA, null, sb.a0(2089232489, new tk1(mainActivity, z, s03Var, i2), ov0Var), ov0Var, 384);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCreate$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(MainActivity mainActivity, boolean z, s03 s03Var, f30 f30Var, int i) {
        int i2 = 0;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            e33.a(iw2.c, null, ((kz) ov0Var.j(mz.a)).n, 0L, 0.0f, 0.0f, null, sb.a0(955594798, new tk1(mainActivity, z, s03Var, i2), ov0Var), ov0Var, 12582918, 122);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCreate$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(MainActivity mainActivity, boolean z, s03 s03Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 3) != 2)) {
            ke0.h(mainActivity.getViewModel(), onCreate$lambda$10$lambda$9$lambda$2(s03Var), z, mainActivity.getAccountViewModel(), ov0Var, (AppState.$stable << 3) | 4104);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    private final void requestIgnoreBatteryOptimizations() {
        Object systemService = getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null || powerManager.isIgnoringBatteryOptimizations(getPackageName())) {
            return;
        }
        try {
            try {
                Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                intent.setData(Uri.parse("package:" + getPackageName()));
                startActivity(intent);
            } catch (Exception unused) {
                startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        String string;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_settings", 0);
        String str = "";
        if (gh0.D(context) && (string = sharedPreferences.getString("language", "")) != null) {
            str = string;
        }
        if (str.length() > 0) {
            context = wc0.n0(context, str);
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        sh0 th0Var;
        uh1 uh1Var;
        int i = rh0.a;
        ik0 ik0Var = ik0.D;
        int i2 = 0;
        j43 j43Var = new j43(0, 0, ik0Var);
        j43 j43Var2 = new j43(rh0.a, rh0.b, ik0Var);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) ik0Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) ik0Var.invoke(resources2)).booleanValue();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            th0Var = new vh0();
        } else if (i3 >= 29) {
            th0Var = new uh0();
        } else {
            th0Var = i3 >= 28 ? new th0() : new sh0();
        }
        sh0 sh0Var = th0Var;
        Window window = getWindow();
        window.getClass();
        sh0Var.b(j43Var, j43Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        sh0Var.a(window2);
        super.onCreate(bundle);
        ul1 viewModel = getViewModel();
        viewModel.getClass();
        String language = viewModel.c.getLanguage();
        in inVar = ok.e;
        if (eu.a()) {
            Object objB = ok.b();
            if (objB != null) {
                uh1Var = new uh1(new vh1(nk.a(objB)));
            } else {
                uh1Var = uh1.b;
            }
        } else {
            uh1Var = ok.g;
            if (uh1Var == null) {
                uh1Var = uh1.b;
            }
        }
        uh1Var.getClass();
        if (language.length() > 0 && (uh1Var.b() || !o51.f(uh1Var.a.a.toLanguageTags(), language))) {
            ok.l(uh1.a(language));
        }
        p10 p10Var = new p10(new uk1(this, i2), true, 1269705477);
        ViewGroup.LayoutParams layoutParams = j10.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        x20 x20Var = childAt instanceof x20 ? (x20) childAt : null;
        if (x20Var != null) {
            x20Var.setParentCompositionContext(null);
            x20Var.setContent(p10Var);
            return;
        }
        x20 x20Var2 = new x20(this);
        x20Var2.setParentCompositionContext(null);
        x20Var2.setContent(p10Var);
        View decorView2 = getWindow().getDecorView();
        if (a83.c(decorView2) == null) {
            decorView2.setTag(2131230945, this);
        }
        if (u83.d(decorView2) == null) {
            decorView2.setTag(2131230949, this);
        }
        if (g83.b(decorView2) == null) {
            decorView2.setTag(2131230948, this);
        }
        setContentView(x20Var2, j10.a);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((CloudAccountState) getAccountViewModel().c.getValue()).getValidated() && i == 100) {
            boolean z = !(iArr.length == 0) && iArr[0] == 0;
            if (z) {
                checkBackgroundLocation();
            }
            if (z) {
                requestIgnoreBatteryOptimizations();
            }
        }
    }
}
