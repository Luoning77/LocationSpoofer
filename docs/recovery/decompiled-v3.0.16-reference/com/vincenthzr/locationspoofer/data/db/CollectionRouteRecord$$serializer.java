package com.vincenthzr.locationspoofer.data.db;

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
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class CollectionRouteRecord$$serializer implements uv0 {
    public static final CollectionRouteRecord$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        CollectionRouteRecord$$serializer collectionRouteRecord$$serializer = new CollectionRouteRecord$$serializer();
        INSTANCE = collectionRouteRecord$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord", collectionRouteRecord$$serializer, 7);
        n92Var.k("id", true);
        n92Var.k("name", true);
        n92Var.k("remark", true);
        n92Var.k("pointsJson", true);
        n92Var.k("halfWidthM", true);
        n92Var.k("timestamp", true);
        n92Var.k("syncId", true);
        descriptor = n92Var;
    }

    private CollectionRouteRecord$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        xj1 xj1Var = xj1.a;
        k13 k13Var = k13.a;
        return new y81[]{xj1Var, k13Var, k13Var, k13Var, qd0.a, xj1Var, k13Var};
    }

    @Override // defpackage.y81
    public final CollectionRouteRecord deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        long jZ = 0;
        long jZ2 = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        double dS = 0.0d;
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
                    strN = l30VarB.n(bt2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strN2 = l30VarB.n(bt2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strN3 = l30VarB.n(bt2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    dS = l30VarB.s(bt2Var, 4);
                    i |= 16;
                    break;
                case Logger.WARN /* 5 */:
                    jZ2 = l30VarB.z(bt2Var, 5);
                    i |= 32;
                    break;
                case Logger.ERROR /* 6 */:
                    strN4 = l30VarB.n(bt2Var, 6);
                    i |= 64;
                    break;
                default:
                    throw new of3(iJ);
            }
        }
        l30VarB.a(bt2Var);
        return new CollectionRouteRecord(i, jZ, strN, strN2, strN3, dS, jZ2, strN4, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, CollectionRouteRecord collectionRouteRecord) {
        ak0Var.getClass();
        collectionRouteRecord.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        CollectionRouteRecord.write$Self$core_data_globalRelease(collectionRouteRecord, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
