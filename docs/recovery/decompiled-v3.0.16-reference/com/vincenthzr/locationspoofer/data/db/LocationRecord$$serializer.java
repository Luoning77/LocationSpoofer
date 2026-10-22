package com.vincenthzr.locationspoofer.data.db;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k13;
import defpackage.k22;
import defpackage.l30;
import defpackage.m30;
import defpackage.mc0;
import defpackage.n92;
import defpackage.of3;
import defpackage.qd0;
import defpackage.uv0;
import defpackage.w90;
import defpackage.xj1;
import defpackage.y81;
import defpackage.zm3;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class LocationRecord$$serializer implements uv0 {
    public static final LocationRecord$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        LocationRecord$$serializer locationRecord$$serializer = new LocationRecord$$serializer();
        INSTANCE = locationRecord$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.LocationRecord", locationRecord$$serializer, 11);
        n92Var.k("id", true);
        n92Var.k("lat", false);
        n92Var.k("lng", false);
        n92Var.k("timestamp", true);
        n92Var.k("placeName", true);
        n92Var.k("remark", true);
        n92Var.k("selectedWifiBssid", true);
        n92Var.k("selectedBluetoothAddress", true);
        n92Var.k("selectedCellKey", true);
        n92Var.k("collectionRouteId", true);
        n92Var.k("syncId", true);
        descriptor = n92Var;
    }

    private LocationRecord$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        xj1 xj1Var = xj1.a;
        k13 k13Var = k13.a;
        y81 y81VarV = zm3.v(k13Var);
        y81 y81VarV2 = zm3.v(k13Var);
        y81 y81VarV3 = zm3.v(k13Var);
        y81 y81VarV4 = zm3.v(xj1Var);
        qd0 qd0Var = qd0.a;
        return new y81[]{xj1Var, qd0Var, qd0Var, xj1Var, k13Var, k13Var, y81VarV, y81VarV2, y81VarV3, y81VarV4, k13Var};
    }

    @Override // defpackage.y81
    public final LocationRecord deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        String str = null;
        long jZ = 0;
        long jZ2 = 0;
        double dS = 0.0d;
        double dS2 = 0.0d;
        String str2 = null;
        String str3 = null;
        Long l = null;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jZ = l30VarB.z(bt2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    dS = l30VarB.s(bt2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    dS2 = l30VarB.s(bt2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jZ2 = l30VarB.z(bt2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN = l30VarB.n(bt2Var, 4);
                    i |= 16;
                    break;
                case Logger.WARN /* 5 */:
                    strN2 = l30VarB.n(bt2Var, 5);
                    i |= 32;
                    break;
                case Logger.ERROR /* 6 */:
                    str = (String) l30VarB.i(bt2Var, 6, k13.a, str);
                    i |= 64;
                    break;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    str2 = (String) l30VarB.i(bt2Var, 7, k13.a, str2);
                    i |= WorkQueueKt.BUFFER_CAPACITY;
                    break;
                case 8:
                    str3 = (String) l30VarB.i(bt2Var, 8, k13.a, str3);
                    i |= 256;
                    break;
                case mc0.b /* 9 */:
                    l = (Long) l30VarB.i(bt2Var, 9, xj1.a, l);
                    i |= 512;
                    break;
                case mc0.c /* 10 */:
                    strN3 = l30VarB.n(bt2Var, 10);
                    i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    break;
                default:
                    throw new of3(iJ);
            }
        }
        l30VarB.a(bt2Var);
        return new LocationRecord(i, jZ, dS, dS2, jZ2, strN, strN2, str, str2, str3, l, strN3, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, LocationRecord locationRecord) {
        ak0Var.getClass();
        locationRecord.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        LocationRecord.write$Self$core_data_globalRelease(locationRecord, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
