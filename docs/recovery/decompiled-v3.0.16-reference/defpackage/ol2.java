package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import java.util.Arrays;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ol2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ol2(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x010b A[Catch: all -> 0x0118, LOOP:2: B:39:0x00c9->B:50:0x010b, LOOP_END, TryCatch #0 {all -> 0x0118, blocks: (B:34:0x00ae, B:36:0x00b7, B:39:0x00c9, B:41:0x00dc, B:43:0x00e8, B:45:0x00f2, B:47:0x0100, B:50:0x010b, B:51:0x010f), top: B:108:0x00ae, outer: #2 }] */
    @Override // defpackage.au0
    public final Object invoke() throws PendingIntent.CanceledException {
        au0 au0Var;
        int i = this.e;
        boolean z = true;
        Object obj = this.f;
        switch (i) {
            case 0:
                pl2 pl2Var = (pl2) obj;
                wm2 wm2Var = pl2Var.e;
                Object obj2 = pl2Var.h;
                if (obj2 != null) {
                    return wm2Var.h(pl2Var, obj2);
                }
                fo.i("Value should be initialized");
                return null;
            case 1:
                rm2 rm2Var = ((wl2) obj).g;
                if (rm2Var == null) {
                    return null;
                }
                Bundle bundleJ = ks.J((i52[]) Arrays.copyOf(new i52[0], 0));
                rm2Var.b(bundleJ);
                if (bundleJ.isEmpty()) {
                    return null;
                }
                return bundleJ;
            case 2:
                return k22.y((ComponentActivity) obj);
            case 3:
                tm2 tm2Var = (tm2) obj;
                tm2Var.getLifecycle().a(new oe2(tm2Var, 0));
                return mf3.a;
            case 4:
                eo2 eo2Var = (eo2) obj;
                p42 p42Var = (p42) xq1.C(eo2Var, r42.a);
                eo2Var.D = p42Var;
                eo2Var.E = p42Var != null ? p42Var.a() : null;
                return mf3.a;
            case Logger.WARN /* 5 */:
                return obj;
            case Logger.ERROR /* 6 */:
                dt2 dt2Var = (dt2) obj;
                return Integer.valueOf(gh0.C(dt2Var, dt2Var.j));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                vt2 vt2Var = (vt2) obj;
                w52 w52Var = vt2Var.g;
                if (((cw2) w52Var.getValue()).a == 9205357640488583168L || cw2.c(((cw2) w52Var.getValue()).a)) {
                    return null;
                }
                return vt2Var.e.b(((cw2) w52Var.getValue()).a);
            case 8:
                ex2 ex2Var = (ex2) obj;
                if (!((Boolean) ex2Var.n.getValue()).booleanValue() && (au0Var = ex2Var.b) != null) {
                    au0Var.invoke();
                }
                return mf3.a;
            case mc0.b /* 9 */:
                ky2 ky2Var = (ky2) obj;
                while (true) {
                    synchronized (ky2Var.g) {
                        try {
                            if (!ky2Var.c) {
                                ky2Var.c = z;
                                try {
                                    gy1 gy1Var = ky2Var.f;
                                    Object[] objArr = gy1Var.e;
                                    int i2 = gy1Var.g;
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        jy2 jy2Var = (jy2) objArr[i3];
                                        ay1 ay1Var = jy2Var.g;
                                        lu0 lu0Var = jy2Var.a;
                                        Object[] objArr2 = ay1Var.b;
                                        long[] jArr = ay1Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j = jArr[i4];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = 0;
                                                    while (i7 < i6) {
                                                        if ((j & 255) < 128) {
                                                            lu0Var.invoke(objArr2[(i4 << 3) + i7]);
                                                        }
                                                        j >>= i5;
                                                        i7++;
                                                        i5 = i5;
                                                    }
                                                    if (i6 == i5) {
                                                        if (i4 != length) {
                                                            i4++;
                                                        }
                                                    }
                                                } else if (i4 != length) {
                                                    i4++;
                                                }
                                            }
                                        }
                                        ay1Var.b();
                                    }
                                    ky2Var.c = false;
                                } catch (Throwable th) {
                                    ky2Var.c = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!ky2Var.b()) {
                        return mf3.a;
                    }
                    z = true;
                }
                break;
            case mc0.c /* 10 */:
                s53 s53Var = (s53) obj;
                s53Var.H = null;
                ee0.C(s53Var);
                ld0.z(s53Var);
                ig0.z(s53Var);
                return Boolean.TRUE;
            case 11:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return mf3.a;
            case mc0.d /* 12 */:
                o63 o63Var = (o63) obj;
                return o63Var.r ? dh0.k(o63Var) : x53.b;
            case 13:
                return new h41(((l41) obj).c());
            case 14:
                p93 p93Var = (p93) obj;
                p93Var.C = null;
                ee0.C(p93Var);
                ld0.z(p93Var);
                ig0.z(p93Var);
                return Boolean.TRUE;
            case a83.e /* 15 */:
                wa3 wa3Var = (wa3) obj;
                wa3Var.S.invoke(Boolean.valueOf(!wa3Var.R));
                return mf3.a;
            default:
                return Float.valueOf(((og3) obj).f / 100.0f);
        }
    }
}
