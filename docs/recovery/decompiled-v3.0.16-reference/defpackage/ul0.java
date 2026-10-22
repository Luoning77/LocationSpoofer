package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.WifiManager;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ul0 {
    public final Context a;

    public ul0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WifiManager wifiManager, r60 r60Var) throws Throwable {
        ll0 ll0Var;
        Throwable th;
        we2 we2Var;
        BroadcastReceiver broadcastReceiver;
        if (r60Var instanceof ll0) {
            ll0Var = (ll0) r60Var;
            int i = ll0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll0Var.h = i - Integer.MIN_VALUE;
            } else {
                ll0Var = new ll0(this, r60Var);
            }
        } else {
            ll0Var = new ll0(this, r60Var);
        }
        Object objWithTimeoutOrNull = ll0Var.f;
        int i2 = ll0Var.h;
        Context context = this.a;
        if (i2 == 0) {
            we2 we2VarJ = p91.j(objWithTimeoutOrNull);
            try {
                t3 t3Var = new t3(we2VarJ, this, wifiManager, (q60) null, 6);
                ll0Var.e = we2VarJ;
                ll0Var.h = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(8000L, t3Var, ll0Var);
                z70 z70Var = z70.e;
                if (objWithTimeoutOrNull == z70Var) {
                    return z70Var;
                }
                we2Var = we2VarJ;
            } catch (Throwable th2) {
                th = th2;
                we2Var = we2VarJ;
                broadcastReceiver = (BroadcastReceiver) we2Var.e;
                if (broadcastReceiver != null) {
                    throw th;
                }
                context.unregisterReceiver(broadcastReceiver);
                throw th;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = ll0Var.e;
            try {
                ee0.J(objWithTimeoutOrNull);
            } catch (Throwable th3) {
                th = th3;
                broadcastReceiver = (BroadcastReceiver) we2Var.e;
                if (broadcastReceiver != null) {
                    throw th;
                }
                try {
                    context.unregisterReceiver(broadcastReceiver);
                    throw th;
                } catch (Throwable unused) {
                    throw th;
                }
            }
        }
        BroadcastReceiver broadcastReceiver2 = (BroadcastReceiver) we2Var.e;
        if (broadcastReceiver2 != null) {
            try {
                context.unregisterReceiver(broadcastReceiver2);
            } catch (Throwable unused2) {
            }
        }
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(r60 r60Var) {
        ml0 ml0Var;
        if (r60Var instanceof ml0) {
            ml0Var = (ml0) r60Var;
            int i = ml0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml0Var.g = i - Integer.MIN_VALUE;
            } else {
                ml0Var = new ml0(this, r60Var);
            }
        } else {
            ml0Var = new ml0(this, r60Var);
        }
        Object objWithContext = ml0Var.e;
        int i2 = ml0Var.g;
        q60 q60Var = null;
        if (i2 == 0) {
            ee0.J(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            k kVar = new k(this, q60Var, 22);
            ml0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, kVar, ml0Var);
            z70 z70Var = z70.e;
            if (objWithContext == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objWithContext);
        }
        objWithContext.getClass();
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r60 r60Var) {
        ol0 ol0Var;
        if (r60Var instanceof ol0) {
            ol0Var = (ol0) r60Var;
            int i = ol0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ol0Var.g = i - Integer.MIN_VALUE;
            } else {
                ol0Var = new ol0(this, r60Var);
            }
        } else {
            ol0Var = new ol0(this, r60Var);
        }
        Object objWithContext = ol0Var.e;
        int i2 = ol0Var.g;
        q60 q60Var = null;
        if (i2 == 0) {
            ee0.J(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            m mVar = new m(this, q60Var, 10);
            ol0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, mVar, ol0Var);
            z70 z70Var = z70.e;
            if (objWithContext == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objWithContext);
        }
        objWithContext.getClass();
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(boolean z, r60 r60Var) {
        sl0 sl0Var;
        if (r60Var instanceof sl0) {
            sl0Var = (sl0) r60Var;
            int i = sl0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sl0Var.g = i - Integer.MIN_VALUE;
            } else {
                sl0Var = new sl0(this, r60Var);
            }
        } else {
            sl0Var = new sl0(this, r60Var);
        }
        Object objWithContext = sl0Var.e;
        int i2 = sl0Var.g;
        if (i2 == 0) {
            ee0.J(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            tl0 tl0Var = new tl0(this, z, null);
            sl0Var.g = 1;
            objWithContext = BuildersKt.withContext(io2, tl0Var, sl0Var);
            z70 z70Var = z70.e;
            if (objWithContext == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(objWithContext);
        }
        objWithContext.getClass();
        return objWithContext;
    }
}
