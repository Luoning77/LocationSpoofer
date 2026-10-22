package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.RootSolution;
import com.vincenthzr.locationspoofer.data.model.RouteTravelMode;
import com.vincenthzr.locationspoofer.data.model.SimMode;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemBluetoothServiceHookerKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qi2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qi2(a93 a93Var, cj cjVar, tg tgVar) {
        this.e = 16;
        this.f = cjVar;
        this.g = tgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [no1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [q60] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.au0
    public final Object invoke() throws PendingIntent.CanceledException, IOException {
        Object value;
        Object value2;
        long j;
        y83 y83VarD;
        me1 me1Var;
        dj djVar;
        Job job;
        Job job2;
        Object value3;
        int i = this.e;
        long jV = 9205357640488583168L;
        int i2 = 3;
        ?? Y0 = 0;
        Y0 = 0;
        Y0 = 0;
        Y0 = 0;
        mf3 mf3Var = mf3.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ul1 ul1Var = (ul1) obj2;
                l90 l90Var = new l90((Context) obj, i2);
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                List<AppInfoItem> hookedAppsToRestart = ((AppState) mutableStateFlow.getValue()).getHookedAppsToRestart();
                if (hookedAppsToRestart != null) {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, true, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -25165825, -1, 134217727, null)));
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new m(ul1Var, hookedAppsToRestart, l90Var, null, 18), 2, null);
                }
                return mf3Var;
            case 1:
                ul1 ul1Var2 = (ul1) obj2;
                RootSolution rootSolution = (RootSolution) obj;
                ul1Var2.getClass();
                rootSolution.getClass();
                ul1Var2.c.setRootSolution(rootSolution.name());
                MutableStateFlow mutableStateFlow2 = ul1Var2.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, rootSolution, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -129, -1, 134217727, null)));
                return mf3Var;
            case 2:
                we2 we2Var = (we2) obj2;
                InputStream inputStream = ((Process) obj).getInputStream();
                inputStream.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, sw.a), 8192);
                try {
                    String strF = l93.f(bufferedReader);
                    bufferedReader.close();
                    we2Var.e = strF;
                    return mf3Var;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ji2.z(bufferedReader, th);
                        throw th2;
                    }
                }
            case 3:
                ((lu0) obj2).invoke((RouteTravelMode) obj);
                return mf3Var;
            case 4:
                ((lu0) obj2).invoke((SimMode) obj);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((lu0) obj2).invoke(Integer.valueOf(((qv1) obj).e));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((lu0) obj2).invoke(Integer.valueOf(xq1.P(((s52) obj).g())));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ar2 ar2Var = (ar2) obj2;
                long j2 = ((p41) ((ey1) obj).getValue()).a;
                xp2 xp2VarF = ar2Var.f();
                if (xp2VarF != null) {
                    bx0 bx0VarE = ar2Var.e();
                    int i3 = bx0VarE == null ? -1 : br2.a[bx0VarE.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            jV = n51.v(ar2Var, j2, xp2VarF.a);
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    b81.d();
                                    return null;
                                }
                                fo.n("SelectionContainer does not support cursor");
                                return null;
                            }
                            jV = n51.v(ar2Var, j2, xp2VarF.b);
                        }
                    }
                }
                return new c12(jV);
            case 8:
                ((tt2) obj2).b.unregisterOnSharedPreferenceChangeListener((dt0) obj);
                return mf3Var;
            case mc0.b /* 9 */:
                ((tt2) obj2).b.unregisterOnSharedPreferenceChangeListener((st2) obj);
                return mf3Var;
            case mc0.c /* 10 */:
                ((ey1) obj).setValue(Boolean.FALSE);
                ((RadioSharingManager) obj2).withdraw();
                return mf3Var;
            case 11:
                ((au0) obj2).invoke();
                ((au0) obj).invoke();
                return mf3Var;
            case mc0.d /* 12 */:
                return SystemBluetoothServiceHookerKt.registerTargetScanner$lambda$8((IBinder) obj2, (String) obj);
            case 13:
                Context context = (Context) obj;
                TextClassification textClassification = (TextClassification) obj2;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                    break;
                } else {
                    activity.send();
                }
                return mf3Var;
            case 14:
                x73 x73Var = (x73) obj2;
                long j3 = ((p41) ((ey1) obj).getValue()).a;
                c12 c12VarG = x73Var.g();
                if (c12VarG != null) {
                    long j4 = c12VarG.a;
                    dj djVarK = x73Var.k();
                    if (djVarK != null && djVarK.f.length() != 0) {
                        bx0 bx0Var = (bx0) x73Var.r.getValue();
                        int i4 = bx0Var == null ? -1 : z73.a[bx0Var.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1 || i4 == 2) {
                                long j5 = x73Var.l().b;
                                int i5 = f93.c;
                                j = j5 >> 32;
                            } else {
                                if (i4 != 3) {
                                    b81.d();
                                    return null;
                                }
                                long j6 = x73Var.l().b;
                                int i6 = f93.c;
                                j = j6 & 4294967295L;
                            }
                            int i7 = (int) j;
                            me1 me1Var2 = x73Var.d;
                            if (me1Var2 != null && (y83VarD = me1Var2.d()) != null && (me1Var = x73Var.d) != null && (djVar = (dj) me1Var.a.b) != null) {
                                int iV = mh0.v(x73Var.b.r(i7), 0, djVar.f.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (y83VarD.d(j4) >> 32));
                                x83 x83Var = y83VarD.a;
                                sw1 sw1Var = x83Var.b;
                                int iD = sw1Var.d(iV);
                                float fE = x83Var.e(iD);
                                float f = x83Var.f(iD);
                                float fU = mh0.u(fIntBitsToFloat, Math.min(fE, f), Math.max(fE, f));
                                if (p41.b(j3, 0L) || Math.abs(fIntBitsToFloat - fU) <= ((int) (j3 >> 32)) / 2) {
                                    float f2 = sw1Var.f(iD);
                                    jV = (((long) Float.floatToRawIntBits(fU)) << 32) | (((long) Float.floatToRawIntBits(((sw1Var.b(iD) - f2) / 2.0f) + f2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new c12(jV);
            case a83.e /* 15 */:
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj2, null, CoroutineStart.UNDISPATCHED, new d6((lu0) obj, (q60) Y0, 23), 1, null);
                return mf3Var;
            case 16:
                tg tgVar = (tg) obj;
                bg1 bg1Var = (bg1) ((cj) obj2).a;
                if (bg1Var instanceof ag1) {
                    try {
                        tgVar.a(((ag1) bg1Var).a);
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return mf3Var;
            case 17:
                xg3 xg3Var = (xg3) obj2;
                ?? r11 = (no1) obj;
                MutableStateFlow mutableStateFlow3 = xg3Var.c;
                i52 i52Var = xg3Var.q;
                if (i52Var != null && !((og3) mutableStateFlow3.getValue()).k && (((job = xg3Var.o) == null || !job.isActive()) && ((job2 = xg3Var.n) == null || !job2.isActive()))) {
                    xg3Var.r = i52Var;
                    do {
                        value3 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value3, og3.a((og3) value3, false, null, null, null, null, 0, 0, 0L, null, false, true, false, null, false, null, 29693)));
                    Y0 = l13.y0(((UpdateArtifact) i52Var.f).getPath());
                }
                if (Y0 != 0) {
                    r11.a(Y0);
                }
                return mf3Var;
            default:
                ((lu0) obj2).invoke(((GithubRelease) obj).getVersionName());
                return mf3Var;
        }
    }

    public /* synthetic */ qi2(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ qi2(Context context, TextClassification textClassification) {
        this.e = 13;
        this.g = context;
        this.f = textClassification;
    }
}
