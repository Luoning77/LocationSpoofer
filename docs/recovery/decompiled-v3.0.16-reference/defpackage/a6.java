package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.core.content.FileProvider;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;
import com.vincenthzr.locationspoofer.data.update.AccountUpdateCatalog;
import com.vincenthzr.locationspoofer.data.update.AccountUpdates;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import com.vincenthzr.locationspoofer.data.update.UpdatePackagePolicy;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class a6 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a6(ov0 ov0Var, kw kwVar, gx2 gx2Var, fw1 fw1Var) {
        this.e = 8;
        this.f = ov0Var;
        this.g = kwVar;
        this.h = gx2Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i;
        pe2 pe2Var;
        Object value;
        AppState appStateCopy$default;
        Object value2;
        Object value3;
        UpdatePackagePolicy updatePackagePolicy;
        long j;
        String[] strArr;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i2) {
            case 0:
                return AccountUpdates.parse$lambda$1((JSONObject) obj3, (String) obj2, (Set) obj);
            case 1:
                ((wp) obj3).a();
                gp gpVar = (gp) ((xp) obj2).c;
                int i3 = ((ue2) obj).e;
                do {
                    i = gpVar.get();
                } while (!gpVar.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return mf3Var;
            case 2:
                return BluetoothScanDispatcherKt.deliverBleScanResults$lambda$39$lambda$38((LocationHooker) obj3, obj2, obj);
            case 3:
                return BluetoothScanDispatcherKt.deliverBleScanResults$lambda$41$lambda$40((LocationHooker) obj3, obj2, (ArrayList) obj);
            case 4:
                lt ltVar = (lt) obj3;
                pe2 pe2VarM1 = lt.m1(ltVar, (xz1) obj2, (ta) obj);
                if (pe2VarM1 == null) {
                    return null;
                }
                a60 a60Var = ltVar.s;
                if (p41.b(a60Var.y, -1L)) {
                    s21.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return pe2VarM1.j(a60Var.q1(pe2VarM1, a60Var.n1(), 0L) ^ (-9223372034707292160L));
            case Logger.WARN /* 5 */:
                a60 a60Var2 = (a60) obj3;
                dg3 dg3Var = (dg3) obj2;
                ot otVar = (ot) obj;
                dt dtVar = a60Var2.w;
                while (true) {
                    gy1 gy1Var = dtVar.a;
                    int i4 = gy1Var.g;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            b81.y("MutableVector is empty.");
                            return null;
                        }
                        pe2 pe2Var2 = (pe2) ((x50) gy1Var.e[i4 - 1]).a.invoke();
                        if (pe2Var2 == null ? true : a60.o1(a60Var2, pe2Var2, 0L, 0L, 3)) {
                            gy1 gy1Var2 = dtVar.a;
                            ((x50) gy1Var2.k(gy1Var2.g - 1)).b.resumeWith(mf3Var);
                        }
                    }
                }
                if (a60Var2.x && (pe2Var = (pe2) a60Var2.v.invoke()) != null && a60.o1(a60Var2, pe2Var, 0L, 0L, 3)) {
                    a60Var2.x = false;
                }
                dg3Var.e = a60Var2.m1(otVar, 0L);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                Context context = (Context) obj3;
                no1 no1Var = (no1) obj2;
                ey1 ey1Var = (ey1) obj;
                ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
                List<String> list = (List) ey1Var.getValue();
                if (list == null || !list.isEmpty()) {
                    for (String str : list) {
                        if (componentActivity != null && !componentActivity.shouldShowRequestPermissionRationale(str)) {
                            try {
                                context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName())));
                                break;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    no1Var.a(((List) ey1Var.getValue()).toArray(new String[0]));
                } else {
                    no1Var.a(((List) ey1Var.getValue()).toArray(new String[0]));
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return EncryptedCloudSessionStore.readKey$lambda$23((ue2) obj3, (EncryptedCloudSessionStore) obj, (String) obj2);
            case 8:
                ov0 ov0Var = (ov0) obj3;
                kw kwVar = (kw) obj2;
                gx2 gx2Var = (gx2) obj;
                g30 g30Var = ov0Var.M;
                kw kwVar2 = g30Var.b;
                try {
                    g30Var.b = kwVar;
                    gx2 gx2Var2 = ov0Var.G;
                    int[] iArr = ov0Var.o;
                    gx1 gx1Var = ov0Var.v;
                    ov0Var.o = null;
                    ov0Var.v = null;
                    try {
                        ov0Var.G = gx2Var;
                        boolean z = g30Var.e;
                        try {
                            g30Var.e = false;
                            ov0Var.G(null, null);
                            g30Var.e = z;
                            ov0Var.G = gx2Var2;
                            ov0Var.o = iArr;
                            ov0Var.v = gx1Var;
                            g30Var.b = kwVar2;
                            return mf3Var;
                        } catch (Throwable th) {
                            g30Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ov0Var.G = gx2Var2;
                        ov0Var.o = iArr;
                        ov0Var.v = gx1Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    g30Var.b = kwVar2;
                    throw th3;
                }
            case mc0.b /* 9 */:
                yd1 yd1Var = (yd1) obj2;
                kd1 kd1Var = (kd1) ((fc0) obj3).getValue();
                return new ld1(yd1Var, kd1Var, (bc1) obj, new q01((k41) ((qc1) yd1Var.e.e).getValue(), kd1Var));
            case mc0.c /* 10 */:
                mi1 mi1Var = (mi1) obj3;
                lu0 lu0Var = (lu0) obj2;
                s52 s52Var = (s52) obj;
                float fG = s52Var.g();
                mi1 mi1Var2 = mi1.f;
                if (fG > 28.0f) {
                    int iOrdinal = mi1Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            lu0Var.invoke(mi1.e);
                        } else {
                            if (iOrdinal != 2) {
                                b81.d();
                                return null;
                            }
                            lu0Var.invoke(mi1Var2);
                        }
                    }
                } else if (s52Var.g() < -28.0f) {
                    int iOrdinal2 = mi1Var.ordinal();
                    if (iOrdinal2 == 0) {
                        lu0Var.invoke(mi1Var2);
                    } else if (iOrdinal2 == 1) {
                        lu0Var.invoke(mi1.g);
                    } else if (iOrdinal2 != 2) {
                        b81.d();
                        return null;
                    }
                }
                s52Var.h(0.0f);
                return mf3Var;
            case 11:
                ny2 ny2Var = (ny2) obj2;
                lu0 lu0Var2 = (lu0) obj;
                op0.a((op0) obj3);
                if (ny2Var != null) {
                    ((nb0) ny2Var).a();
                }
                lu0Var2.invoke(new lz2(false));
                return mf3Var;
            case mc0.d /* 12 */:
                is1 is1Var = (is1) obj2;
                ey1 ey1Var2 = (ey1) obj;
                if (!yo.H0(new ml1[]{ml1.g, ml1.i}).contains((ml1) obj3) || ((cs1) is1Var.d.getValue()).g == null) {
                    ey1Var2.setValue(zy.j0((List) ey1Var2.getValue()));
                } else {
                    is1Var.e();
                }
                return mf3Var;
            case 13:
                ul1 ul1Var = (ul1) obj3;
                ey1 ey1Var3 = (ey1) obj;
                long id = ((CollectionRouteRecord) obj2).getId();
                ul1Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new vl1(ul1Var, id, null, 0), 2, null);
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                    appStateCopy$default = (AppState) value;
                    Long selectedCollectionRouteId = appStateCopy$default.getSelectedCollectionRouteId();
                    if (selectedCollectionRouteId != null && selectedCollectionRouteId.longValue() == id) {
                        appStateCopy$default = AppState.copy$default(appStateCopy$default, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217726, null);
                    }
                } while (!mutableStateFlow.compareAndSet(value, appStateCopy$default));
                ey1Var3.setValue(null);
                return mf3Var;
            case 14:
                lo1 lo1Var = (lo1) obj3;
                BuildersKt__Builders_commonKt.launch$default(am1.y(lo1Var), Dispatchers.getIO(), null, new ch(lo1Var, ((CompleteLocation) obj2).getLocation().getId(), null, 1), 2, null);
                ((ey1) obj).setValue(null);
                return mf3Var;
            case a83.e /* 15 */:
                iv0 iv0Var = (iv0) obj3;
                kx2 kx2Var = (kx2) obj2;
                t32 t32Var = (t32) obj;
                if (iv0Var != null) {
                    kx2Var.a(kx2Var.c(iv0Var) - kx2Var.t);
                }
                List listM = n51.m(kx2Var, null, kx2Var.t, null);
                u20 u20Var = (u20) zy.u0(listM);
                Integer num = u20Var != null ? u20Var.b : null;
                List listB = t32Var.b(num);
                if (num != null && !listB.isEmpty()) {
                    listB = zy.x0(am1.F(new u20(((u20) zy.n0(listB)).a, null, num)), zy.i0(listB, 1));
                }
                return new s20(zy.x0(listM, listB), t32Var.h());
            case 16:
                Context context2 = (Context) obj2;
                RootSetupTestResult rootSetupTestResult = (RootSetupTestResult) obj;
                StringBuilder sb = new StringBuilder("solution=" + rootSetupTestResult.getSolution());
                sb.append('\n');
                sb.append("hasRoot=" + rootSetupTestResult.getHasRoot());
                sb.append('\n');
                sb.append("idOutput=" + rootSetupTestResult.getIdOutput());
                sb.append('\n');
                sb.append("frameworkConnected=" + rootSetupTestResult.getFrameworkConnected());
                sb.append('\n');
                sb.append("remoteConfigAccessible=" + rootSetupTestResult.getRemoteConfigAccessible());
                sb.append('\n');
                sb.append("configPublished=" + rootSetupTestResult.getConfigPublished());
                sb.append('\n');
                sb.append("frameworkDetail=" + rootSetupTestResult.getFrameworkDetail());
                sb.append('\n');
                ((ka) ((ay) obj3)).b(new dj(sb.toString()));
                Toast.makeText(context2, context2.getString(2131624354), 0).show();
                return mf3Var;
            case 17:
                ((lu0) obj3).invoke(((GithubRelease) obj2).getVersionName());
                ((au0) obj).invoke();
                return mf3Var;
            case 18:
                ((ey1) obj).setValue(Boolean.FALSE);
                ((lu0) obj3).invoke((GithubRelease) obj2);
                return mf3Var;
            case 19:
                xg3 xg3Var = (xg3) obj3;
                AccountUpdateCatalog accountUpdateCatalog = (AccountUpdateCatalog) obj;
                if (xg3Var.h((String) obj2)) {
                    MutableStateFlow mutableStateFlow2 = xg3Var.c;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, og3.a((og3) value2, false, null, accountUpdateCatalog.getReleases(), null, null, 0, 0, 0L, null, false, false, false, Boolean.valueOf(accountUpdateCatalog.getBetaEnabled()), false, null, 28666)));
                }
                return mf3Var;
            case 20:
                xg3 xg3Var2 = (xg3) obj3;
                z92 z92Var = (z92) obj;
                if (xg3Var2.q == ((i52) obj2)) {
                    fg3 fg3Var = xg3Var2.g;
                    fg3Var.getClass();
                    String str2 = (String) z92Var.g;
                    Context context3 = fg3Var.a;
                    if (!str2.equals(context3.getPackageName())) {
                        b81.w("invalid_apk_identity");
                        return null;
                    }
                    Uri uriForFile = FileProvider.getUriForFile(context3, az2.y(context3.getPackageName(), ".updates"), (File) z92Var.f);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                    intent.setFlags(268435457);
                    context3.startActivity(intent);
                }
                return mf3Var;
            default:
                xg3 xg3Var3 = (xg3) obj3;
                UpdateArtifact updateArtifact = (UpdateArtifact) obj;
                xg3Var3.q = new i52((File) obj2, updateArtifact);
                MutableStateFlow mutableStateFlow3 = xg3Var3.c;
                do {
                    value3 = mutableStateFlow3.getValue();
                    updatePackagePolicy = UpdatePackagePolicy.INSTANCE;
                    j = xg3Var3.f;
                    strArr = Build.SUPPORTED_ABIS;
                    strArr.getClass();
                } while (!mutableStateFlow3.compareAndSet(value3, og3.a((og3) value3, false, null, null, null, null, 100, 8, 0L, null, updatePackagePolicy.canInstall(updateArtifact, j, yo.H0(strArr), true), false, false, null, false, null, 32159)));
                return mf3Var;
        }
    }

    public /* synthetic */ a6(ue2 ue2Var, EncryptedCloudSessionStore encryptedCloudSessionStore, String str) {
        this.e = 7;
        this.f = ue2Var;
        this.h = encryptedCloudSessionStore;
        this.g = str;
    }

    public /* synthetic */ a6(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
