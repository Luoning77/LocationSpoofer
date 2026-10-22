package com.vincenthzr.locationspoofer.data.model;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k22;
import defpackage.l30;
import defpackage.m30;
import defpackage.n92;
import defpackage.of3;
import defpackage.qd0;
import defpackage.uv0;
import defpackage.w90;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class RoutePoint$$serializer implements uv0 {
    public static final RoutePoint$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        RoutePoint$$serializer routePoint$$serializer = new RoutePoint$$serializer();
        INSTANCE = routePoint$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.model.RoutePoint", routePoint$$serializer, 3);
        n92Var.k("lat", false);
        n92Var.k("lng", false);
        n92Var.k("waitSec", true);
        descriptor = n92Var;
    }

    private RoutePoint$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        qd0 qd0Var = qd0.a;
        return new y81[]{qd0Var, qd0Var, qd0Var};
    }

    @Override // defpackage.y81
    public final RoutePoint deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        double dS = 0.0d;
        double dS2 = 0.0d;
        double dS3 = 0.0d;
        boolean z = true;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                dS = l30VarB.s(bt2Var, 0);
                i |= 1;
            } else if (iJ == 1) {
                dS2 = l30VarB.s(bt2Var, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new of3(iJ);
                }
                dS3 = l30VarB.s(bt2Var, 2);
                i |= 4;
            }
        }
        l30VarB.a(bt2Var);
        return new RoutePoint(i, dS, dS2, dS3, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, RoutePoint routePoint) {
        ak0Var.getClass();
        routePoint.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        RoutePoint.write$Self$core_data_globalRelease(routePoint, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
