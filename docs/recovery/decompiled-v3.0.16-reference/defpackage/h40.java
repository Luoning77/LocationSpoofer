package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAddress;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h40 extends k33 implements pu0 {
    public CloudAddress e;
    public Mutex f;
    public ConfigManager g;
    public String h;
    public bh2 i;
    public double j;
    public double k;
    public int l;
    public final /* synthetic */ ConfigManager m;
    public final /* synthetic */ double n;
    public final /* synthetic */ double o;
    public final /* synthetic */ String p;
    public final /* synthetic */ bh2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(ConfigManager configManager, double d, double d2, String str, bh2 bh2Var, q60 q60Var) {
        super(2, q60Var);
        this.m = configManager;
        this.n = d;
        this.o = d2;
        this.p = str;
        this.q = bh2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new h40(this.m, this.n, this.o, this.p, this.q, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((h40) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #0 {all -> 0x0122, blocks: (B:21:0x0078, B:58:0x011b, B:60:0x011e, B:66:0x0128, B:67:0x0129, B:22:0x0079, B:24:0x0083, B:26:0x008d, B:28:0x009e, B:30:0x00a6, B:32:0x00b2, B:35:0x00be, B:37:0x00c8, B:43:0x00d6, B:54:0x0100, B:46:0x00eb, B:48:0x00ef), top: B:83:0x0078, outer: #5, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object objReverse;
        String str;
        double d;
        bh2 bh2Var;
        Mutex mutex;
        CloudAddress cloudAddress;
        ConfigManager configManager;
        double d2;
        JSONObject jSONObject;
        CloudAddress cloudAddress2;
        z70 z70Var = z70.e;
        int i = this.l;
        try {
            if (i == 0) {
                ee0.J(obj);
                CloudGeoRepository cloudGeoRepository = this.m.cloudGeo;
                double d3 = this.n;
                double d4 = this.o;
                String str2 = this.p;
                this.l = 1;
                objReverse = cloudGeoRepository.reverse(d3, d4, str2, this);
                if (objReverse == z70Var) {
                }
                return z70Var;
            }
            if (i == 1) {
                ee0.J(obj);
                objReverse = obj;
            } else {
                if (i != 2) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d2 = this.k;
                d = this.j;
                bh2Var = this.i;
                str = this.h;
                ConfigManager configManager2 = this.g;
                mutex = this.f;
                CloudAddress cloudAddress3 = this.e;
                ee0.J(obj);
                configManager = configManager2;
                cloudAddress = cloudAddress3;
            }
            try {
                synchronized (configManager) {
                    if (RuntimeAuthorizationManager.isAuthorized$default(configManager.runtimeAuthorization, null, 1, null) || !o51.f(str, configManager.geoEngine(d, d2))) {
                        jSONObject = null;
                    } else {
                        ch2 ch2Var = configManager.geocodeState;
                        ch2Var.getClass();
                        bh2Var.getClass();
                        cloudAddress.getClass();
                        Double d5 = ch2Var.e;
                        if (d5 != null) {
                            double dDoubleValue = d5.doubleValue();
                            Double d6 = ch2Var.f;
                            if (d6 != null) {
                                double dDoubleValue2 = d6.doubleValue();
                                if (bh2Var.a == ch2Var.b && ch2Var.a(bh2Var.b, bh2Var.c, dDoubleValue, dDoubleValue2)) {
                                    ch2Var.d = bh2Var;
                                    ch2Var.g = cloudAddress;
                                    JSONObject jSONObject2 = configManager.lastJson;
                                    if (jSONObject2 == null) {
                                        jSONObject = null;
                                    } else {
                                        if (!jSONObject2.optBoolean("active", false)) {
                                            jSONObject2 = null;
                                        }
                                        if (jSONObject2 != null) {
                                            ch2 ch2Var2 = configManager.geocodeState;
                                            double dOptDouble = jSONObject2.optDouble("lat");
                                            double dOptDouble2 = jSONObject2.optDouble("lng");
                                            bh2 bh2Var2 = ch2Var2.d;
                                            if (bh2Var2 == null || (cloudAddress2 = ch2Var2.g) == null || !ch2Var2.a(bh2Var2.b, bh2Var2.c, dOptDouble, dOptDouble2)) {
                                                cloudAddress2 = null;
                                            }
                                            if (cloudAddress2 != null) {
                                                jSONObject = new JSONObject(jSONObject2.toString());
                                                configManager.putCachedAddress(jSONObject, jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
                                            }
                                        }
                                        jSONObject = null;
                                    }
                                } else {
                                    jSONObject = null;
                                }
                            } else {
                                jSONObject = null;
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    configManager.writeLocked(jSONObject);
                }
                mutex.unlock(null);
                return mf3.a;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
            CloudAddress cloudAddress4 = (CloudAddress) objReverse;
            Mutex mutex2 = this.m.writeMutex;
            ConfigManager configManager3 = this.m;
            str = this.p;
            d = this.n;
            double d7 = this.o;
            bh2Var = this.q;
            this.e = cloudAddress4;
            this.f = mutex2;
            this.g = configManager3;
            this.h = str;
            this.i = bh2Var;
            this.j = d;
            this.k = d7;
            this.l = 2;
            if (mutex2.lock(null, this) != z70Var) {
                mutex = mutex2;
                cloudAddress = cloudAddress4;
                configManager = configManager3;
                d2 = d7;
                synchronized (configManager) {
                    if (RuntimeAuthorizationManager.isAuthorized$default(configManager.runtimeAuthorization, null, 1, null)) {
                        jSONObject = null;
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        configManager.writeLocked(jSONObject);
                    }
                    mutex.unlock(null);
                    return mf3.a;
                }
            }
            return z70Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            ConfigManager configManager4 = this.m;
            bh2 bh2Var3 = this.q;
            synchronized (configManager4) {
                ch2 ch2Var3 = configManager4.geocodeState;
                ch2Var3.getClass();
                if (bh2Var3.a == ch2Var3.b) {
                    ch2Var3.d = null;
                    ch2Var3.g = null;
                }
            }
        }
    }
}
