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
import defpackage.uv0;
import defpackage.w90;
import defpackage.xj1;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class SavedRouteEntity$$serializer implements uv0 {
    public static final SavedRouteEntity$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        SavedRouteEntity$$serializer savedRouteEntity$$serializer = new SavedRouteEntity$$serializer();
        INSTANCE = savedRouteEntity$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.SavedRouteEntity", savedRouteEntity$$serializer, 5);
        n92Var.k("id", true);
        n92Var.k("name", false);
        n92Var.k("pointsJson", true);
        n92Var.k("timestamp", true);
        n92Var.k("syncId", true);
        descriptor = n92Var;
    }

    private SavedRouteEntity$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        xj1 xj1Var = xj1.a;
        k13 k13Var = k13.a;
        return new y81[]{xj1Var, k13Var, k13Var, xj1Var, k13Var};
    }

    @Override // defpackage.y81
    public final SavedRouteEntity deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        long jZ = 0;
        long jZ2 = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
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
                strN2 = l30VarB.n(bt2Var, 2);
                i |= 4;
            } else if (iJ == 3) {
                jZ2 = l30VarB.z(bt2Var, 3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new of3(iJ);
                }
                strN3 = l30VarB.n(bt2Var, 4);
                i |= 16;
            }
        }
        l30VarB.a(bt2Var);
        return new SavedRouteEntity(i, jZ, strN, strN2, jZ2, strN3, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, SavedRouteEntity savedRouteEntity) {
        ak0Var.getClass();
        savedRouteEntity.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        SavedRouteEntity.write$Self$core_data_globalRelease(savedRouteEntity, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
