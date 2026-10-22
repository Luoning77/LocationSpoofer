package com.vincenthzr.locationspoofer.data.model;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import defpackage.b81;
import defpackage.ld0;
import defpackage.vd0;
import defpackage.z60;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CollectionRouteMatcher {
    public static final CollectionRouteMatcher INSTANCE = new CollectionRouteMatcher();

    private CollectionRouteMatcher() {
    }

    public static /* synthetic */ CompleteCollectionRoute routeAt$default(CollectionRouteMatcher collectionRouteMatcher, List list, z60 z60Var, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return collectionRouteMatcher.routeAt(list, z60Var, l);
    }

    public final CompleteCollectionRoute routeAt(List<CompleteCollectionRoute> list, z60 z60Var, Long l) {
        Object obj;
        Object obj2;
        list.getClass();
        z60Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj3;
            List<z60> listGeometry = CollectionRouteGeometryKt.geometry(completeCollectionRoute.getRoute());
            if (!completeCollectionRoute.getSamples().isEmpty() && listGeometry.size() >= 2 && Math.abs(completeCollectionRoute.getRoute().getHalfWidthM()) <= Double.MAX_VALUE && ld0.p(z60Var, listGeometry) <= completeCollectionRoute.getRoute().getHalfWidthM()) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            obj = null;
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
            long id = ((CompleteCollectionRoute) obj2).getRoute().getId();
            if (l != null && id == l.longValue()) {
                break;
            }
        }
        CompleteCollectionRoute completeCollectionRoute2 = (CompleteCollectionRoute) obj2;
        if (completeCollectionRoute2 != null) {
            return completeCollectionRoute2;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Iterator<T> it2 = ((CompleteCollectionRoute) next).getSamples().iterator();
                if (!it2.hasNext()) {
                    b81.p();
                    return null;
                }
                CompleteLocation completeLocation = (CompleteLocation) it2.next();
                double dO = vd0.o(z60Var, new z60(completeLocation.getLocation().getLat(), completeLocation.getLocation().getLng()));
                while (it2.hasNext()) {
                    CompleteLocation completeLocation2 = (CompleteLocation) it2.next();
                    dO = Math.min(dO, vd0.o(z60Var, new z60(completeLocation2.getLocation().getLat(), completeLocation2.getLocation().getLng())));
                }
                do {
                    Object next2 = it.next();
                    Iterator<T> it3 = ((CompleteCollectionRoute) next2).getSamples().iterator();
                    if (!it3.hasNext()) {
                        b81.p();
                        return null;
                    }
                    CompleteLocation completeLocation3 = (CompleteLocation) it3.next();
                    double dO2 = vd0.o(z60Var, new z60(completeLocation3.getLocation().getLat(), completeLocation3.getLocation().getLng()));
                    while (it3.hasNext()) {
                        CompleteLocation completeLocation4 = (CompleteLocation) it3.next();
                        dO2 = Math.min(dO2, vd0.o(z60Var, new z60(completeLocation4.getLocation().getLat(), completeLocation4.getLocation().getLng())));
                    }
                    if (Double.compare(dO, dO2) > 0) {
                        next = next2;
                        dO = dO2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (CompleteCollectionRoute) obj;
    }

    public final List<CompleteLocation> samplesAt(CompleteCollectionRoute completeCollectionRoute, final z60 z60Var) {
        completeCollectionRoute.getClass();
        z60Var.getClass();
        return zy.D0(zy.C0(completeCollectionRoute.getSamples(), new Comparator() { // from class: com.vincenthzr.locationspoofer.data.model.CollectionRouteMatcher$samplesAt$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                CompleteLocation completeLocation = (CompleteLocation) t;
                CompleteLocation completeLocation2 = (CompleteLocation) t2;
                return Double.valueOf(vd0.o(z60Var, new z60(completeLocation.getLocation().getLat(), completeLocation.getLocation().getLng()))).compareTo(Double.valueOf(vd0.o(z60Var, new z60(completeLocation2.getLocation().getLat(), completeLocation2.getLocation().getLng()))));
            }
        }), 3);
    }
}
