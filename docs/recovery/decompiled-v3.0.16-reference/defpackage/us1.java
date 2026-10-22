package defpackage;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class us1 implements lc2, al2, v23, kp1, uh3 {
    public final /* synthetic */ int e;
    public Object f;

    public us1(int i, byte b) {
        this.e = i;
        switch (i) {
            case Logger.WARN /* 5 */:
                this.f = new zj1((Object) null);
                break;
            case 8:
                this.f = new LinkedHashSet();
                break;
            case mc0.b /* 9 */:
                this.f = new Region();
                break;
            case 26:
                this.f = new gb0();
                break;
            default:
                this.f = Build.VERSION.SDK_INT >= 28 ? new k91(17) : new k91(18);
                break;
        }
    }

    @Override // defpackage.uh3, defpackage.rh3
    public boolean a() {
        return false;
    }

    @Override // defpackage.rh3
    public long b(yi yiVar, yi yiVar2, yi yiVar3) {
        return ((mn2) this.f).b(yiVar, yiVar2, yiVar3);
    }

    @Override // defpackage.al2
    public zk2 c(String str) {
        str.getClass();
        t23 t23Var = (t23) this.f;
        String databaseName = t23Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                fo.f(az2.k("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !l13.y0(databaseName).equals(l13.y0(str))) {
            b81.t("This driver is configured to open a database named '", t23Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new r23(t23Var.V());
    }

    @Override // defpackage.v23
    public String d() {
        return ((y23) this.f).f;
    }

    @Override // defpackage.v23
    public void e(u23 u23Var) {
        y23 y23Var = (y23) this.f;
        int length = y23Var.h.length;
        for (int i = 1; i < length; i++) {
            int i2 = y23Var.h[i];
            if (i2 == 1) {
                u23Var.e(i, y23Var.i[i]);
            } else if (i2 == 2) {
                u23Var.a(y23Var.j[i], i);
            } else if (i2 == 3) {
                String str = y23Var.k[i];
                str.getClass();
                u23Var.r(i, str);
            } else if (i2 == 4) {
                byte[] bArr = y23Var.l[i];
                bArr.getClass();
                u23Var.Q(i, bArr);
            } else if (i2 == 5) {
                u23Var.b(i);
            }
        }
    }

    @Override // defpackage.lc2
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lc2
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case Logger.WARN /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case Logger.ERROR /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case mc0.b /* 9 */:
            default:
                str = "";
                break;
            case mc0.c /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    public long h(long j) {
        gb0 gb0Var = (gb0) this.f;
        if (yh3.b(j) <= 0.0f || yh3.c(j) <= 0.0f) {
            p21.c("maximumVelocity should be a positive value. You specified=" + ((Object) yh3.g(j)));
        }
        return g93.c(gb0Var.a.b(yh3.b(j)), gb0Var.b.b(yh3.c(j)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void i(k70 k70Var, r60 r60Var) {
        y02 y02Var;
        if (r60Var instanceof y02) {
            y02Var = (y02) r60Var;
            int i = y02Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                y02Var.g = i - Integer.MIN_VALUE;
            } else {
                y02Var = new y02(this, r60Var);
            }
        } else {
            y02Var = new y02(this, r60Var);
        }
        Object obj = y02Var.e;
        int i2 = y02Var.g;
        if (i2 == 0) {
            ee0.J(obj);
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f;
            y02Var.g = 1;
            if (mutableStateFlow.collect(k70Var, y02Var) == z70.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ee0.J(obj);
        }
        fo.d();
    }

    public wn0 j(int i) {
        switch (this.e) {
            case 22:
                return ((bo0[]) this.f)[i];
            case 23:
                return (bo0) this.f;
            default:
                return (wn0) this.f;
        }
    }

    @Override // defpackage.al2
    public boolean k() {
        return true;
    }

    @Override // defpackage.rh3
    public yi m(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        return ((mn2) this.f).m(j, yiVar, yiVar2, yiVar3);
    }

    public void n() {
        View view = (View) this.f;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.rh3
    public yi p(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        return ((mn2) this.f).p(j, yiVar, yiVar2, yiVar3);
    }

    @Override // defpackage.rh3
    public yi q(yi yiVar, yi yiVar2, yi yiVar3) {
        return ((mn2) this.f).q(yiVar, yiVar2, yiVar3);
    }

    public void r(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public c51 s(z92 z92Var, db dbVar) {
        long j;
        boolean z;
        long jE;
        zj1 zj1Var = (zj1) this.f;
        ArrayList arrayList = (ArrayList) z92Var.f;
        zj1 zj1Var2 = new zj1(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            aa2 aa2Var = (aa2) arrayList.get(i);
            long j2 = aa2Var.a;
            y92 y92Var = (y92) zj1Var.c(j2);
            if (y92Var == null) {
                j = aa2Var.b;
                jE = aa2Var.d;
                z = false;
            } else {
                long j3 = y92Var.a;
                j = j3;
                z = y92Var.c;
                jE = dbVar.E(y92Var.b);
            }
            long j4 = aa2Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            zj1Var2.g(j4, new x92(j4, aa2Var.b, aa2Var.d, aa2Var.e, aa2Var.f, j, jE, z, aa2Var.g, aa2Var.i, aa2Var.j, aa2Var.k, aa2Var.l, aa2Var.m));
            boolean z2 = aa2Var.e;
            if (z2) {
                zj1Var.g(j2, new y92(aa2Var.b, aa2Var.c, z2));
            } else {
                zj1Var.h(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new c51(zj1Var2, z92Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[LOOP:0: B:22:0x0051->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EDGE_INSN: B:53:0x0099->B:35:0x0099 BREAK  A[LOOP:0: B:22:0x0051->B:34:0x0096], SYNTHETIC] */
    public Object t(Channel channel, au0 au0Var) {
        zv2 zv2Var;
        SendChannel sendChannel;
        if (((t20) this.f) == null) {
            hb2.b("Called runAndWatch on a manager that has been disposed of");
        }
        t20 t20Var = (t20) this.f;
        if ((t20Var instanceof zv2) && (sendChannel = (zv2Var = (zv2) t20Var).f) != null && !sendChannel.equals(channel)) {
            zw1 zw1Var = new zw1();
            SendChannel sendChannel2 = zv2Var.f;
            if (sendChannel2 == null) {
                hb2.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            ay1 ay1Var = zv2Var.d;
            ArrayList arrayList = zw1Var.c;
            if (ay1Var != null) {
                Object[] objArr = ay1Var.b;
                long[] jArr = ay1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new ww1(sendChannel2, objArr[(i << 3) + i4]));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = zv2Var.b;
                obj.getClass();
                arrayList.add(new ww1(sendChannel2, obj));
            }
            zw1Var.e();
            zv2Var.h();
            this.f = zw1Var;
        }
        t20 t20Var2 = (t20) this.f;
        t20Var2.getClass();
        nx2 nx2VarU = tx2.h().u(t20Var2.l(channel));
        t20Var2.d(channel);
        try {
            nx2 nx2VarJ = nx2VarU.j();
            try {
                Object objInvoke = au0Var.invoke();
                nx2.q(nx2VarJ);
                nx2VarU.c();
                t20Var2.e();
                return objInvoke;
            } catch (Throwable th) {
                nx2.q(nx2VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            nx2VarU.c();
            throw th2;
        }
    }

    public void u(l41 l41Var) {
        ((Region) this.f).set(l41Var.a, l41Var.b, l41Var.c, l41Var.d);
    }

    public void v() {
        View viewFindViewById;
        View view = (View) this.f;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new w(viewFindViewById, 14));
    }

    public /* synthetic */ us1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    public us1(float f, float f2, yi yiVar) {
        us1 us1Var;
        this.e = 25;
        int[] iArr = sh3.a;
        if (yiVar != null) {
            us1Var = new us1(yiVar, f, f2);
        } else {
            us1Var = new us1(f, f2);
        }
        this.f = new mn2(us1Var);
    }

    public /* synthetic */ us1(char c, int i) {
        this.e = i;
    }

    public us1(xb0 xb0Var) {
        this.e = 14;
        this.f = new sn0(cz2.a, xb0Var);
    }

    public us1(t23 t23Var) {
        this.e = 15;
        t23Var.getClass();
        this.f = t23Var;
    }

    public us1(View view) {
        this.e = 13;
        if (Build.VERSION.SDK_INT >= 30) {
            py2 py2Var = new py2(view, 12);
            py2Var.g = view;
            this.f = py2Var;
            return;
        }
        this.f = new us1(view, 12);
    }

    public us1(long[] jArr) {
        kx1 kx1Var;
        this.e = 11;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            kx1Var = new kx1(jArrCopyOf.length);
            int i = kx1Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArrCopyOf2 = kx1Var.a;
                    if (jArrCopyOf2.length < length) {
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                        kx1Var.a = jArrCopyOf2;
                    }
                    int i2 = kx1Var.b;
                    if (i != i2) {
                        yo.m0(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                    }
                    yo.m0(jArrCopyOf, jArrCopyOf2, i, 0, jArrCopyOf.length);
                    kx1Var.b += jArrCopyOf.length;
                }
            } else {
                fo.p("");
                throw null;
            }
        } else {
            kx1Var = new kx1();
        }
        this.f = kx1Var;
    }

    public us1(ah3 ah3Var) {
        this.e = 18;
        this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ah3Var);
    }

    public us1(int i) {
        this.e = 2;
        this.f = StateFlowKt.MutableStateFlow(new int[i]);
    }

    public us1(yi yiVar, float f, float f2) {
        this.e = 22;
        int iB = yiVar.b();
        bo0[] bo0VarArr = new bo0[iB];
        for (int i = 0; i < iB; i++) {
            bo0VarArr[i] = new bo0(f, f2, yiVar.a(i));
        }
        this.f = bo0VarArr;
    }

    public us1(float f, float f2) {
        this.e = 23;
        this.f = new bo0(f, f2, 0.01f);
    }
}
