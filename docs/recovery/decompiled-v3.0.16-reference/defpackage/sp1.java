package defpackage;

import android.content.Context;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.maplibre.android.MapLibre;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sp1 {
    public static final sp1 a = new sp1();
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);
    public static cv c;
    public static boolean d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, cv cvVar, r60 r60Var) throws Throwable {
        rp1 rp1Var;
        Mutex mutex;
        cv cvVar2;
        int i;
        Mutex mutex2;
        Throwable th;
        boolean zBooleanValue;
        if (r60Var instanceof rp1) {
            rp1Var = (rp1) r60Var;
            int i2 = rp1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rp1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                rp1Var = new rp1(this, r60Var);
            }
        } else {
            rp1Var = new rp1(this, r60Var);
        }
        Object obj = rp1Var.i;
        z70 z70Var = z70.e;
        int i3 = rp1Var.k;
        try {
            if (i3 == 0) {
                ee0.J(obj);
                mutex = b;
                rp1Var.e = context;
                rp1Var.f = cvVar;
                rp1Var.g = mutex;
                rp1Var.h = 0;
                rp1Var.k = 1;
                if (mutex.lock(null, rp1Var) != z70Var) {
                    cvVar2 = cvVar;
                    i = 0;
                }
                return z70Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = rp1Var.g;
                try {
                    ee0.J(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    d = zBooleanValue;
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    mutex2.unlock(null);
                    return boolValueOf;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            int i4 = rp1Var.h;
            Mutex mutex3 = rp1Var.g;
            cvVar2 = rp1Var.f;
            Context context2 = rp1Var.e;
            ee0.J(obj);
            mutex = mutex3;
            i = i4;
            context = context2;
            MapLibre.getInstance(context);
            if (c != cvVar2) {
                String str = xz0.b;
                dh0.b = false;
                xz0.d = cvVar2 != null ? cvVar2 : xz0.a();
                c = cvVar2;
            }
            zBooleanValue = d;
            if (!zBooleanValue) {
                rp1Var.e = null;
                rp1Var.f = null;
                rp1Var.g = mutex;
                rp1Var.h = i;
                rp1Var.k = 2;
                Object objF = as2.f(context, rp1Var);
                if (objF != z70Var) {
                    mutex2 = mutex;
                    obj = objF;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    d = zBooleanValue;
                }
                return z70Var;
            }
            mutex2 = mutex;
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            mutex2.unlock(null);
            return boolValueOf2;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
