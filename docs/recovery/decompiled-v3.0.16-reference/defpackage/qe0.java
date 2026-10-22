package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.db.LocationSpooferDataPackage;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import java.lang.reflect.Method;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qe0 implements au0 {
    public final /* synthetic */ int e;

    public /* synthetic */ qe0(int i) {
        this.e = i;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        Class<?> returnType;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                return mf3Var;
            case 1:
                return Boolean.TRUE;
            case 2:
                return mf3Var;
            case 3:
                return mf3.a;
            case 4:
                return EncryptedCloudSessionStore._init_$lambda$0();
            case Logger.WARN /* 5 */:
                return EncryptedCloudSessionStore._init_$lambda$2();
            case Logger.ERROR /* 6 */:
                return EncryptedCloudSessionStore._init_$lambda$3();
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 8:
                try {
                    Method method = (Method) rt0.g.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case mc0.b /* 9 */:
                return HookStatus.writerDelegate$lambda$2();
            case mc0.c /* 10 */:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 11:
                hh0 hh0Var = m11.a;
                return fa0.a;
            case mc0.d /* 12 */:
                return null;
            case 13:
                return new td0(48.0f);
            case 14:
            case a83.e /* 15 */:
                return mf3Var;
            case 16:
                return y71.b;
            case 17:
                return s71.b;
            case 18:
                return p71.b;
            case 19:
                return v71.b;
            case 20:
                return x61.b;
            case 21:
                return new yd1(0, 0);
            case 22:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 23:
                hh0 hh0Var2 = nh1.a;
                return j9.M;
            case 24:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 25:
                return Boolean.TRUE;
            case 26:
                return null;
            case 27:
                return mf3Var;
            case 28:
                return LocationSpooferDataPackage._childSerializers$_anonymous_();
            default:
                return LocationSpooferDataPackage._childSerializers$_anonymous_$0();
        }
    }
}
