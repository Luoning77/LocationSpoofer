package defpackage;

import com.vincenthzr.locationspoofer.data.db.EnvironmentDao_Impl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ec implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ ec(int i, long j) {
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl;
        Object wg2Var;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        long j = this.f;
        switch (i) {
            case 0:
                xu xuVar = (xu) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xuVar.e.a() >> 32)) / 2.0f;
                return xuVar.c(new fc(fIntBitsToFloat, ji2.C(xuVar, fIntBitsToFloat), new rr(5, j), 0));
            case 1:
                jg0 jg0Var = (jg0) obj;
                jg0Var.getClass();
                jg0.c0(jg0Var, this.f, 0L, 0L, 0.0f, null, 0, 126);
                return mf3Var;
            case 2:
                jg0 jg0Var2 = (jg0) obj;
                jg0Var2.getClass();
                jg0.c0(jg0Var2, this.f, 0L, 0L, 0.0f, null, 0, 126);
                return mf3Var;
            case 3:
                rt rtVar = (rt) obj;
                lu0 lu0Var = rtVar.b;
                if (lu0Var != null && (cancellableContinuationImpl = rtVar.a) != null) {
                    try {
                        wg2Var = lu0Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        wg2Var = new wg2(th);
                    }
                    cancellableContinuationImpl.resumeWith(wg2Var);
                    break;
                }
                return mf3Var;
            case 4:
                ((ss2) obj).a(tq2.a, new sq2(bx0.e, this.f, rq2.f, true));
                return mf3Var;
            case Logger.WARN /* 5 */:
                return EnvironmentDao_Impl.deleteCollectionRoute$lambda$27("DELETE FROM collection_routes WHERE id = ?", j, (zk2) obj);
            case Logger.ERROR /* 6 */:
                return EnvironmentDao_Impl.clearSyncBluetooth$lambda$25("DELETE FROM location_bluetooth WHERE locationId = ?", j, (zk2) obj);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return EnvironmentDao_Impl.clearSyncCells$lambda$24("DELETE FROM location_cells WHERE locationId = ?", j, (zk2) obj);
            case 8:
                return EnvironmentDao_Impl.deleteConnectedWifi$lambda$35("DELETE FROM location_connected_wifi WHERE locationId = ?", j, (zk2) obj);
            case mc0.b /* 9 */:
                return EnvironmentDao_Impl.clearSyncWifi$lambda$23("DELETE FROM location_wifi WHERE locationId = ?", j, (zk2) obj);
            case mc0.c /* 10 */:
                return EnvironmentDao_Impl.deleteLocation$lambda$32("DELETE FROM location_records WHERE id = ?", j, (zk2) obj);
            case 11:
                jg0 jg0Var3 = (jg0) obj;
                jg0Var3.getClass();
                float fR = jg0Var3.R(11.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() >> 32)) - fR)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() & 4294967295L)))) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() >> 32)) + fR)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() & 4294967295L)))) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jg0Var3.v0() >> 32));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() & 4294967295L)) - fR)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jg0Var3.v0() & 4294967295L)) + fR)) & 4294967295L);
                for (i52 i52Var : am1.G(new i52(new hz(hz.c), Float.valueOf(jg0Var3.R(4.0f))), new i52(new hz(j), Float.valueOf(jg0Var3.R(2.0f))))) {
                    long j2 = ((hz) i52Var.e).a;
                    float fFloatValue = ((Number) i52Var.f).floatValue();
                    jg0.k0(jg0Var3, j2, jFloatToRawIntBits, jFloatToRawIntBits2, fFloatValue, 0, 496);
                    jg0.k0(jg0Var3, j2, jFloatToRawIntBits3, jFloatToRawIntBits4, fFloatValue, 0, 496);
                    jFloatToRawIntBits = jFloatToRawIntBits;
                    jFloatToRawIntBits2 = jFloatToRawIntBits2;
                }
                return mf3Var;
            default:
                jg0 jg0Var4 = (jg0) obj;
                float fMin = Math.min(jg0Var4.R(4.0f), Float.intBitsToFloat((int) (jg0Var4.a() & 4294967295L)));
                float fR2 = jg0Var4.R(6.0f);
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (4294967295L & jg0Var4.a())) - fMin) / 2.0f;
                if (fIntBitsToFloat3 <= fR2) {
                    fR2 = fIntBitsToFloat3;
                }
                if (jg0Var4.getLayoutDirection() == qa1.f) {
                    long jV0 = jg0Var4.v0();
                    gn gnVarX = jg0Var4.X();
                    long jR = gnVarX.r();
                    gnVarX.i().l();
                    try {
                        ((t1) gnVarX.a).B(-1.0f, 1.0f, jV0);
                        mh0.C(jg0Var4, j, fMin, fR2);
                    } finally {
                        p91.v(gnVarX, jR);
                    }
                } else {
                    mh0.C(jg0Var4, j, fMin, fR2);
                }
                return mf3Var;
        }
    }
}
