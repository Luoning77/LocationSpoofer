package com.vincenthzr.locationspoofer.data.db;

import defpackage.bt2;
import defpackage.ca0;
import defpackage.ce1;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.ig0;
import defpackage.m30;
import defpackage.o51;
import defpackage.oo;
import defpackage.p4;
import defpackage.uj0;
import defpackage.y81;
import defpackage.zb1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CompleteCollectionRoute {
    private final CollectionRouteRecord route;
    private final List<CompleteLocation> samples;
    public static final Companion Companion = new Companion(null);
    private static final zb1[] $childSerializers = {null, ig0.A(ce1.f, new p4(20))};

    public /* synthetic */ CompleteCollectionRoute(int i, CollectionRouteRecord collectionRouteRecord, List list, ht2 ht2Var) {
        if (1 != (i & 1)) {
            dh0.K(i, 1, CompleteCollectionRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.route = collectionRouteRecord;
        if ((i & 2) == 0) {
            this.samples = uj0.e;
        } else {
            this.samples = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_() {
        return new oo(CompleteLocation$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompleteCollectionRoute copy$default(CompleteCollectionRoute completeCollectionRoute, CollectionRouteRecord collectionRouteRecord, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            collectionRouteRecord = completeCollectionRoute.route;
        }
        if ((i & 2) != 0) {
            list = completeCollectionRoute.samples;
        }
        return completeCollectionRoute.copy(collectionRouteRecord, list);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(CompleteCollectionRoute completeCollectionRoute, m30 m30Var, bt2 bt2Var) {
        zb1[] zb1VarArr = $childSerializers;
        m30Var.r(bt2Var, 0, CollectionRouteRecord$$serializer.INSTANCE, completeCollectionRoute.route);
        if (!m30Var.d(bt2Var) && o51.f(completeCollectionRoute.samples, uj0.e)) {
            return;
        }
        m30Var.r(bt2Var, 1, (y81) zb1VarArr[1].getValue(), completeCollectionRoute.samples);
    }

    public final CollectionRouteRecord component1() {
        return this.route;
    }

    public final List<CompleteLocation> component2() {
        return this.samples;
    }

    public final CompleteCollectionRoute copy(CollectionRouteRecord collectionRouteRecord, List<CompleteLocation> list) {
        collectionRouteRecord.getClass();
        list.getClass();
        return new CompleteCollectionRoute(collectionRouteRecord, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteCollectionRoute)) {
            return false;
        }
        CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj;
        return o51.f(this.route, completeCollectionRoute.route) && o51.f(this.samples, completeCollectionRoute.samples);
    }

    public final CollectionRouteRecord getRoute() {
        return this.route;
    }

    public final List<CompleteLocation> getSamples() {
        return this.samples;
    }

    public int hashCode() {
        return this.samples.hashCode() + (this.route.hashCode() * 31);
    }

    public String toString() {
        return "CompleteCollectionRoute(route=" + this.route + ", samples=" + this.samples + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return CompleteCollectionRoute$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public CompleteCollectionRoute(CollectionRouteRecord collectionRouteRecord, List<CompleteLocation> list) {
        collectionRouteRecord.getClass();
        list.getClass();
        this.route = collectionRouteRecord;
        this.samples = list;
    }

    public /* synthetic */ CompleteCollectionRoute(CollectionRouteRecord collectionRouteRecord, List list, int i, ca0 ca0Var) {
        this(collectionRouteRecord, (i & 2) != 0 ? uj0.e : list);
    }
}
