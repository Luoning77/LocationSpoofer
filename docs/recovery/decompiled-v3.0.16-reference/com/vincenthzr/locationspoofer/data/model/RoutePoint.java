package com.vincenthzr.locationspoofer.data.model;

import defpackage.bt2;
import defpackage.ca0;
import defpackage.dh0;
import defpackage.ht2;
import defpackage.m30;
import defpackage.p91;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RoutePoint {
    public static final Companion Companion = new Companion(null);
    private final double lat;
    private final double lng;
    private final double waitSec;

    public /* synthetic */ RoutePoint(int i, double d, double d2, double d3, ht2 ht2Var) {
        if (3 != (i & 3)) {
            dh0.K(i, 3, RoutePoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lat = d;
        this.lng = d2;
        if ((i & 4) == 0) {
            this.waitSec = 0.0d;
        } else {
            this.waitSec = d3;
        }
    }

    public static /* synthetic */ RoutePoint copy$default(RoutePoint routePoint, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = routePoint.lat;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = routePoint.lng;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = routePoint.waitSec;
        }
        return routePoint.copy(d4, d5, d3);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(RoutePoint routePoint, m30 m30Var, bt2 bt2Var) {
        m30Var.t(bt2Var, 0, routePoint.lat);
        m30Var.t(bt2Var, 1, routePoint.lng);
        if (!m30Var.d(bt2Var) && Double.compare(routePoint.waitSec, 0.0d) == 0) {
            return;
        }
        m30Var.t(bt2Var, 2, routePoint.waitSec);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lng;
    }

    public final double component3() {
        return this.waitSec;
    }

    public final RoutePoint copy(double d, double d2, double d3) {
        return new RoutePoint(d, d2, d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePoint)) {
            return false;
        }
        RoutePoint routePoint = (RoutePoint) obj;
        return Double.compare(this.lat, routePoint.lat) == 0 && Double.compare(this.lng, routePoint.lng) == 0 && Double.compare(this.waitSec, routePoint.waitSec) == 0;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final double getWaitSec() {
        return this.waitSec;
    }

    public int hashCode() {
        return Double.hashCode(this.waitSec) + p91.a(this.lng, Double.hashCode(this.lat) * 31, 31);
    }

    public String toString() {
        return "RoutePoint(lat=" + this.lat + ", lng=" + this.lng + ", waitSec=" + this.waitSec + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return RoutePoint$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public RoutePoint(double d, double d2, double d3) {
        this.lat = d;
        this.lng = d2;
        this.waitSec = d3;
    }

    public /* synthetic */ RoutePoint(double d, double d2, double d3, int i, ca0 ca0Var) {
        this(d, d2, (i & 4) != 0 ? 0.0d : d3);
    }
}
