package com.vincenthzr.locationspoofer.data.model;

import defpackage.o51;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SavedRoute {
    private final String name;
    private final List<RoutePoint> points;

    public SavedRoute(String str, List<RoutePoint> list) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.points = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedRoute copy$default(SavedRoute savedRoute, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedRoute.name;
        }
        if ((i & 2) != 0) {
            list = savedRoute.points;
        }
        return savedRoute.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<RoutePoint> component2() {
        return this.points;
    }

    public final SavedRoute copy(String str, List<RoutePoint> list) {
        str.getClass();
        list.getClass();
        return new SavedRoute(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedRoute)) {
            return false;
        }
        SavedRoute savedRoute = (SavedRoute) obj;
        return o51.f(this.name, savedRoute.name) && o51.f(this.points, savedRoute.points);
    }

    public final String getName() {
        return this.name;
    }

    public final List<RoutePoint> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return this.points.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "SavedRoute(name=" + this.name + ", points=" + this.points + ")";
    }
}
