package com.vincenthzr.locationspoofer.data.db;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k22;
import defpackage.l30;
import defpackage.m30;
import defpackage.n92;
import defpackage.of3;
import defpackage.uv0;
import defpackage.w90;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class LocationWithCell$$serializer implements uv0 {
    public static final LocationWithCell$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        LocationWithCell$$serializer locationWithCell$$serializer = new LocationWithCell$$serializer();
        INSTANCE = locationWithCell$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.LocationWithCell", locationWithCell$$serializer, 2);
        n92Var.k("locationCell", false);
        n92Var.k("device", false);
        descriptor = n92Var;
    }

    private LocationWithCell$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        return new y81[]{LocationCell$$serializer.INSTANCE, CellDevice$$serializer.INSTANCE};
    }

    @Override // defpackage.y81
    public final LocationWithCell deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        ht2 ht2Var = null;
        boolean z = true;
        int i = 0;
        LocationCell locationCell = null;
        CellDevice cellDevice = null;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                locationCell = (LocationCell) l30VarB.u(bt2Var, 0, LocationCell$$serializer.INSTANCE, locationCell);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new of3(iJ);
                }
                cellDevice = (CellDevice) l30VarB.u(bt2Var, 1, CellDevice$$serializer.INSTANCE, cellDevice);
                i |= 2;
            }
        }
        l30VarB.a(bt2Var);
        return new LocationWithCell(i, locationCell, cellDevice, ht2Var);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, LocationWithCell locationWithCell) {
        ak0Var.getClass();
        locationWithCell.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        LocationWithCell.write$Self$core_data_globalRelease(locationWithCell, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
