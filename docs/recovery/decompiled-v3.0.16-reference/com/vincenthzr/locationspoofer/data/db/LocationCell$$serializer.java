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
import defpackage.xj1;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class LocationCell$$serializer implements uv0 {
    public static final LocationCell$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        LocationCell$$serializer locationCell$$serializer = new LocationCell$$serializer();
        INSTANCE = locationCell$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.LocationCell", locationCell$$serializer, 4);
        n92Var.k("locationId", true);
        n92Var.k("cellKey", false);
        n92Var.k("dbm", true);
        n92Var.k("isRegistered", true);
        descriptor = n92Var;
    }

    private LocationCell$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        return new y81[]{xj1.a, k13.a, n41.a, bs.a};
    }

    @Override // defpackage.y81
    public final LocationCell deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        int iV = 0;
        boolean zQ = false;
        long jZ = 0;
        String strN = null;
        boolean z = true;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                jZ = l30VarB.z(bt2Var, 0);
                i |= 1;
            } else if (iJ == 1) {
                strN = l30VarB.n(bt2Var, 1);
                i |= 2;
            } else if (iJ == 2) {
                iV = l30VarB.v(bt2Var, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    throw new of3(iJ);
                }
                zQ = l30VarB.q(bt2Var, 3);
                i |= 8;
            }
        }
        l30VarB.a(bt2Var);
        return new LocationCell(i, jZ, strN, iV, zQ, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, LocationCell locationCell) {
        ak0Var.getClass();
        locationCell.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        LocationCell.write$Self$core_data_globalRelease(locationCell, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
