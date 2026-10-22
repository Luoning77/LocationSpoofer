package com.vincenthzr.locationspoofer.data.model;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k13;
import defpackage.k22;
import defpackage.l30;
import defpackage.m30;
import defpackage.n92;
import defpackage.of3;
import defpackage.qd0;
import defpackage.uv0;
import defpackage.w90;
import defpackage.xj1;
import defpackage.y81;
import defpackage.zm3;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class SavedLocation$$serializer implements uv0 {
    public static final SavedLocation$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        SavedLocation$$serializer savedLocation$$serializer = new SavedLocation$$serializer();
        INSTANCE = savedLocation$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.model.SavedLocation", savedLocation$$serializer, 9);
        n92Var.k("name", false);
        n92Var.k("lat", false);
        n92Var.k("lng", false);
        n92Var.k("wifiJson", true);
        n92Var.k("cellJson", true);
        n92Var.k("bluetoothJson", true);
        n92Var.k("sourceLocationId", true);
        n92Var.k("syncId", true);
        n92Var.k("sourceLocationSyncId", true);
        descriptor = n92Var;
    }

    private SavedLocation$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        k13 k13Var = k13.a;
        y81 y81VarV = zm3.v(xj1.a);
        y81 y81VarV2 = zm3.v(k13Var);
        qd0 qd0Var = qd0.a;
        return new y81[]{k13Var, qd0Var, qd0Var, k13Var, k13Var, k13Var, y81VarV, k13Var, y81VarV2};
    }

    @Override // defpackage.y81
    public final SavedLocation deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        String str = null;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        String strN5 = null;
        double dS = 0.0d;
        double dS2 = 0.0d;
        int i = 0;
        boolean z = true;
        Long l = null;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strN = l30VarB.n(bt2Var, 0);
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
                    strN2 = l30VarB.n(bt2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN3 = l30VarB.n(bt2Var, 4);
                    i |= 16;
                    break;
                case Logger.WARN /* 5 */:
                    strN4 = l30VarB.n(bt2Var, 5);
                    i |= 32;
                    break;
                case Logger.ERROR /* 6 */:
                    l = (Long) l30VarB.i(bt2Var, 6, xj1.a, l);
                    i |= 64;
                    break;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    strN5 = l30VarB.n(bt2Var, 7);
                    i |= WorkQueueKt.BUFFER_CAPACITY;
                    break;
                case 8:
                    str = (String) l30VarB.i(bt2Var, 8, k13.a, str);
                    i |= 256;
                    break;
                default:
                    throw new of3(iJ);
            }
        }
        l30VarB.a(bt2Var);
        return new SavedLocation(i, strN, dS, dS2, strN2, strN3, strN4, l, strN5, str, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, SavedLocation savedLocation) {
        ak0Var.getClass();
        savedLocation.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        SavedLocation.write$Self$core_data_globalRelease(savedLocation, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
