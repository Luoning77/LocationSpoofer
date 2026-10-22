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
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class CompleteCollectionRoute$$serializer implements uv0 {
    public static final CompleteCollectionRoute$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        CompleteCollectionRoute$$serializer completeCollectionRoute$$serializer = new CompleteCollectionRoute$$serializer();
        INSTANCE = completeCollectionRoute$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute", completeCollectionRoute$$serializer, 2);
        n92Var.k("route", false);
        n92Var.k("samples", true);
        descriptor = n92Var;
    }

    private CompleteCollectionRoute$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        return new y81[]{CollectionRouteRecord$$serializer.INSTANCE, CompleteCollectionRoute.$childSerializers[1].getValue()};
    }

    @Override // defpackage.y81
    public final CompleteCollectionRoute deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        zb1[] zb1VarArr = CompleteCollectionRoute.$childSerializers;
        boolean z = true;
        int i = 0;
        CollectionRouteRecord collectionRouteRecord = null;
        List list = null;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                collectionRouteRecord = (CollectionRouteRecord) l30VarB.u(bt2Var, 0, CollectionRouteRecord$$serializer.INSTANCE, collectionRouteRecord);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new of3(iJ);
                }
                list = (List) l30VarB.u(bt2Var, 1, (y81) zb1VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        l30VarB.a(bt2Var);
        return new CompleteCollectionRoute(i, collectionRouteRecord, list, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, CompleteCollectionRoute completeCollectionRoute) {
        ak0Var.getClass();
        completeCollectionRoute.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        CompleteCollectionRoute.write$Self$core_data_globalRelease(completeCollectionRoute, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
