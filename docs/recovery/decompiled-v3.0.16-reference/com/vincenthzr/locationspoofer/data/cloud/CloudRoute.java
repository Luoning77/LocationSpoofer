package com.vincenthzr.locationspoofer.data.cloud;

import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import defpackage.o51;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CloudRoute {
    private final List<RoutePoint> points;
    private final String source;

    public CloudRoute(List<RoutePoint> list, String str) {
        list.getClass();
        str.getClass();
        this.points = list;
        this.source = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloudRoute copy$default(CloudRoute cloudRoute, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cloudRoute.points;
        }
        if ((i & 2) != 0) {
            str = cloudRoute.source;
        }
        return cloudRoute.copy(list, str);
    }

    public final List<RoutePoint> component1() {
        return this.points;
    }

    public final String component2() {
        return this.source;
    }

    public final CloudRoute copy(List<RoutePoint> list, String str) {
        list.getClass();
        str.getClass();
        return new CloudRoute(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudRoute)) {
            return false;
        }
        CloudRoute cloudRoute = (CloudRoute) obj;
        return o51.f(this.points, cloudRoute.points) && o51.f(this.source, cloudRoute.source);
    }

    public final List<RoutePoint> getPoints() {
        return this.points;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() + (this.points.hashCode() * 31);
    }

    public String toString() {
        return "CloudRoute(points=" + this.points + ", source=" + this.source + ")";
    }
}
