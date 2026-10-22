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
import defpackage.zb1;
import defpackage.zm3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class CompleteLocation$$serializer implements uv0 {
    public static final CompleteLocation$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        CompleteLocation$$serializer completeLocation$$serializer = new CompleteLocation$$serializer();
        INSTANCE = completeLocation$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.CompleteLocation", completeLocation$$serializer, 5);
        n92Var.k("location", false);
        n92Var.k("connectedWifi", true);
        n92Var.k("wifis", true);
        n92Var.k("bluetooths", true);
        n92Var.k("cells", true);
        descriptor = n92Var;
    }

    private CompleteLocation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        zb1[] zb1VarArr = CompleteLocation.$childSerializers;
        return new y81[]{LocationRecord$$serializer.INSTANCE, zm3.v(LocationConnectedWifi$$serializer.INSTANCE), zb1VarArr[2].getValue(), zb1VarArr[3].getValue(), zb1VarArr[4].getValue()};
    }

    @Override // defpackage.y81
    public final CompleteLocation deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        zb1[] zb1VarArr = CompleteLocation.$childSerializers;
        int i = 0;
        LocationRecord locationRecord = null;
        LocationConnectedWifi locationConnectedWifi = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = true;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                locationRecord = (LocationRecord) l30VarB.u(bt2Var, 0, LocationRecord$$serializer.INSTANCE, locationRecord);
                i |= 1;
            } else if (iJ == 1) {
                locationConnectedWifi = (LocationConnectedWifi) l30VarB.i(bt2Var, 1, LocationConnectedWifi$$serializer.INSTANCE, locationConnectedWifi);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) l30VarB.u(bt2Var, 2, (y81) zb1VarArr[2].getValue(), list);
                i |= 4;
            } else if (iJ == 3) {
                list2 = (List) l30VarB.u(bt2Var, 3, (y81) zb1VarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new of3(iJ);
                }
                list3 = (List) l30VarB.u(bt2Var, 4, (y81) zb1VarArr[4].getValue(), list3);
                i |= 16;
            }
        }
        l30VarB.a(bt2Var);
        return new CompleteLocation(i, locationRecord, locationConnectedWifi, list, list2, list3, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, CompleteLocation completeLocation) {
        ak0Var.getClass();
        completeLocation.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        CompleteLocation.write$Self$core_data_globalRelease(completeLocation, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
