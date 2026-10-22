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
import defpackage.n41;
import defpackage.n92;
import defpackage.of3;
import defpackage.uv0;
import defpackage.w90;
import defpackage.xj1;
import defpackage.y81;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class CellDevice$$serializer implements uv0 {
    public static final CellDevice$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        CellDevice$$serializer cellDevice$$serializer = new CellDevice$$serializer();
        INSTANCE = cellDevice$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.CellDevice", cellDevice$$serializer, 14);
        n92Var.k("cellKey", false);
        n92Var.k("type", true);
        n92Var.k("mcc", true);
        n92Var.k("mnc", true);
        n92Var.k("tac", true);
        n92Var.k("ci", true);
        n92Var.k("pci", true);
        n92Var.k("lac", true);
        n92Var.k("cid", true);
        n92Var.k("psc", true);
        n92Var.k("nci", true);
        n92Var.k("networkId", true);
        n92Var.k("systemId", true);
        n92Var.k("basestationId", true);
        descriptor = n92Var;
    }

    private CellDevice$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        k13 k13Var = k13.a;
        n41 n41Var = n41.a;
        return new y81[]{k13Var, k13Var, n41Var, n41Var, n41Var, n41Var, n41Var, n41Var, n41Var, n41Var, xj1.a, n41Var, n41Var, n41Var};
    }

    @Override // defpackage.y81
    public final CellDevice deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        int iV7 = 0;
        int iV8 = 0;
        int iV9 = 0;
        int iV10 = 0;
        int iV11 = 0;
        String strN = null;
        String strN2 = null;
        long jZ = 0;
        boolean z = true;
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
                    strN2 = l30VarB.n(bt2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iV = l30VarB.v(bt2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iV2 = l30VarB.v(bt2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iV3 = l30VarB.v(bt2Var, 4);
                    i |= 16;
                    break;
                case Logger.WARN /* 5 */:
                    iV4 = l30VarB.v(bt2Var, 5);
                    i |= 32;
                    break;
                case Logger.ERROR /* 6 */:
                    iV5 = l30VarB.v(bt2Var, 6);
                    i |= 64;
                    break;
                case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                    iV6 = l30VarB.v(bt2Var, 7);
                    i |= WorkQueueKt.BUFFER_CAPACITY;
                    break;
                case 8:
                    iV7 = l30VarB.v(bt2Var, 8);
                    i |= 256;
                    break;
                case mc0.b /* 9 */:
                    iV8 = l30VarB.v(bt2Var, 9);
                    i |= 512;
                    break;
                case mc0.c /* 10 */:
                    jZ = l30VarB.z(bt2Var, 10);
                    i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    break;
                case 11:
                    iV9 = l30VarB.v(bt2Var, 11);
                    i |= 2048;
                    break;
                case mc0.d /* 12 */:
                    iV10 = l30VarB.v(bt2Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    iV11 = l30VarB.v(bt2Var, 13);
                    i |= 8192;
                    break;
                default:
                    throw new of3(iJ);
            }
        }
        l30VarB.a(bt2Var);
        return new CellDevice(i, strN, strN2, iV, iV2, iV3, iV4, iV5, iV6, iV7, iV8, jZ, iV9, iV10, iV11, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, CellDevice cellDevice) {
        ak0Var.getClass();
        cellDevice.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        CellDevice.write$Self$core_data_globalRelease(cellDevice, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
