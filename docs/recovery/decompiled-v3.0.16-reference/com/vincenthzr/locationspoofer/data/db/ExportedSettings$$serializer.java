package com.vincenthzr.locationspoofer.data.db;

import defpackage.ak0;
import defpackage.bs;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k13;
import defpackage.k22;
import defpackage.l30;
import defpackage.m30;
import defpackage.n41;
import defpackage.n92;
import defpackage.of3;
import defpackage.uv0;
import defpackage.w90;
import defpackage.y81;
import defpackage.zm3;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class ExportedSettings$$serializer implements uv0 {
    public static final ExportedSettings$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        ExportedSettings$$serializer exportedSettings$$serializer = new ExportedSettings$$serializer();
        INSTANCE = exportedSettings$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.ExportedSettings", exportedSettings$$serializer, 9);
        n92Var.k("mockWifi", true);
        n92Var.k("mockCell", true);
        n92Var.k("mockBluetooth", true);
        n92Var.k("enableJitter", true);
        n92Var.k("altitude", true);
        n92Var.k("altitudeVariationM", true);
        n92Var.k("satelliteCount", true);
        n92Var.k("mapType", true);
        n92Var.k("mapEngine", true);
        descriptor = n92Var;
    }

    private ExportedSettings$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        y81 y81VarV = zm3.v(n41.a);
        bs bsVar = bs.a;
        k13 k13Var = k13.a;
        return new y81[]{bsVar, bsVar, bsVar, bsVar, k13Var, y81VarV, k13Var, k13Var, k13Var};
    }

    @Override // defpackage.y81
    public final ExportedSettings deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        String strN = null;
        Integer num = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        int i = 0;
        boolean zQ = false;
        boolean zQ2 = false;
        boolean zQ3 = false;
        boolean zQ4 = false;
        boolean z = true;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zQ = l30VarB.q(bt2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zQ2 = l30VarB.q(bt2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zQ3 = l30VarB.q(bt2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zQ4 = l30VarB.q(bt2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strN = l30VarB.n(bt2Var, 4);
                    i |= 16;
                    break;
                case Logger.WARN /* 5 */:
                    num = (Integer) l30VarB.i(bt2Var, 5, n41.a, num);
                    i |= 32;
                    break;
                case Logger.ERROR /* 6 */:
                    strN2 = l30VarB.n(bt2Var, 6);
                    i |= 64;
                    break;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    strN3 = l30VarB.n(bt2Var, 7);
                    i |= WorkQueueKt.BUFFER_CAPACITY;
                    break;
                case 8:
                    strN4 = l30VarB.n(bt2Var, 8);
                    i |= 256;
                    break;
                default:
                    throw new of3(iJ);
            }
        }
        l30VarB.a(bt2Var);
        return new ExportedSettings(i, zQ, zQ2, zQ3, zQ4, strN, num, strN2, strN3, strN4, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, ExportedSettings exportedSettings) {
        ak0Var.getClass();
        exportedSettings.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        ExportedSettings.write$Self$core_data_globalRelease(exportedSettings, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
