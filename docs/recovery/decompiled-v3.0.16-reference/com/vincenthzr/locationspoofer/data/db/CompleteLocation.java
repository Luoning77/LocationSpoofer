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
import defpackage.p91;
import defpackage.uj0;
import defpackage.y81;
import defpackage.zb1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CompleteLocation {
    private static final zb1[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final List<LocationWithBluetooth> bluetooths;
    private final List<LocationWithCell> cells;
    private final LocationConnectedWifi connectedWifi;
    private final LocationRecord location;
    private final List<LocationWithWifi> wifis;

    static {
        p4 p4Var = new p4(21);
        ce1 ce1Var = ce1.f;
        $childSerializers = new zb1[]{null, null, ig0.A(ce1Var, p4Var), ig0.A(ce1Var, new p4(22)), ig0.A(ce1Var, new p4(23))};
    }

    public /* synthetic */ CompleteLocation(int i, LocationRecord locationRecord, LocationConnectedWifi locationConnectedWifi, List list, List list2, List list3, ht2 ht2Var) {
        if (1 != (i & 1)) {
            dh0.K(i, 1, CompleteLocation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.location = locationRecord;
        if ((i & 2) == 0) {
            this.connectedWifi = null;
        } else {
            this.connectedWifi = locationConnectedWifi;
        }
        int i2 = i & 4;
        uj0 uj0Var = uj0.e;
        if (i2 == 0) {
            this.wifis = uj0Var;
        } else {
            this.wifis = list;
        }
        if ((i & 8) == 0) {
            this.bluetooths = uj0Var;
        } else {
            this.bluetooths = list2;
        }
        if ((i & 16) == 0) {
            this.cells = uj0Var;
        } else {
            this.cells = list3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_() {
        return new oo(LocationWithWifi$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_$0() {
        return new oo(LocationWithBluetooth$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ y81 _childSerializers$_anonymous_$1() {
        return new oo(LocationWithCell$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompleteLocation copy$default(CompleteLocation completeLocation, LocationRecord locationRecord, LocationConnectedWifi locationConnectedWifi, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            locationRecord = completeLocation.location;
        }
        if ((i & 2) != 0) {
            locationConnectedWifi = completeLocation.connectedWifi;
        }
        if ((i & 4) != 0) {
            list = completeLocation.wifis;
        }
        if ((i & 8) != 0) {
            list2 = completeLocation.bluetooths;
        }
        if ((i & 16) != 0) {
            list3 = completeLocation.cells;
        }
        List list4 = list3;
        List list5 = list;
        return completeLocation.copy(locationRecord, locationConnectedWifi, list5, list2, list4);
    }

    public static final /* synthetic */ void write$Self$core_data_globalRelease(CompleteLocation completeLocation, m30 m30Var, bt2 bt2Var) {
        zb1[] zb1VarArr = $childSerializers;
        m30Var.r(bt2Var, 0, LocationRecord$$serializer.INSTANCE, completeLocation.location);
        if (m30Var.d(bt2Var) || completeLocation.connectedWifi != null) {
            m30Var.u(bt2Var, 1, LocationConnectedWifi$$serializer.INSTANCE, completeLocation.connectedWifi);
        }
        boolean zD = m30Var.d(bt2Var);
        uj0 uj0Var = uj0.e;
        if (zD || !o51.f(completeLocation.wifis, uj0Var)) {
            m30Var.r(bt2Var, 2, (y81) zb1VarArr[2].getValue(), completeLocation.wifis);
        }
        if (m30Var.d(bt2Var) || !o51.f(completeLocation.bluetooths, uj0Var)) {
            m30Var.r(bt2Var, 3, (y81) zb1VarArr[3].getValue(), completeLocation.bluetooths);
        }
        if (!m30Var.d(bt2Var) && o51.f(completeLocation.cells, uj0Var)) {
            return;
        }
        m30Var.r(bt2Var, 4, (y81) zb1VarArr[4].getValue(), completeLocation.cells);
    }

    public final LocationRecord component1() {
        return this.location;
    }

    public final LocationConnectedWifi component2() {
        return this.connectedWifi;
    }

    public final List<LocationWithWifi> component3() {
        return this.wifis;
    }

    public final List<LocationWithBluetooth> component4() {
        return this.bluetooths;
    }

    public final List<LocationWithCell> component5() {
        return this.cells;
    }

    public final CompleteLocation copy(LocationRecord locationRecord, LocationConnectedWifi locationConnectedWifi, List<LocationWithWifi> list, List<LocationWithBluetooth> list2, List<LocationWithCell> list3) {
        locationRecord.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new CompleteLocation(locationRecord, locationConnectedWifi, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompleteLocation)) {
            return false;
        }
        CompleteLocation completeLocation = (CompleteLocation) obj;
        return o51.f(this.location, completeLocation.location) && o51.f(this.connectedWifi, completeLocation.connectedWifi) && o51.f(this.wifis, completeLocation.wifis) && o51.f(this.bluetooths, completeLocation.bluetooths) && o51.f(this.cells, completeLocation.cells);
    }

    public final List<LocationWithBluetooth> getBluetooths() {
        return this.bluetooths;
    }

    public final List<LocationWithCell> getCells() {
        return this.cells;
    }

    public final LocationConnectedWifi getConnectedWifi() {
        return this.connectedWifi;
    }

    public final LocationRecord getLocation() {
        return this.location;
    }

    public final List<LocationWithWifi> getWifis() {
        return this.wifis;
    }

    public int hashCode() {
        int iHashCode = this.location.hashCode() * 31;
        LocationConnectedWifi locationConnectedWifi = this.connectedWifi;
        return this.cells.hashCode() + p91.g(this.bluetooths, p91.g(this.wifis, (iHashCode + (locationConnectedWifi == null ? 0 : locationConnectedWifi.hashCode())) * 31, 31), 31);
    }

    public String toString() {
        return "CompleteLocation(location=" + this.location + ", connectedWifi=" + this.connectedWifi + ", wifis=" + this.wifis + ", bluetooths=" + this.bluetooths + ", cells=" + this.cells + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        private Companion() {
        }

        public final y81 serializer() {
            return CompleteLocation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }
    }

    public CompleteLocation(LocationRecord locationRecord, LocationConnectedWifi locationConnectedWifi, List<LocationWithWifi> list, List<LocationWithBluetooth> list2, List<LocationWithCell> list3) {
        locationRecord.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.location = locationRecord;
        this.connectedWifi = locationConnectedWifi;
        this.wifis = list;
        this.bluetooths = list2;
        this.cells = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CompleteLocation(LocationRecord locationRecord, LocationConnectedWifi locationConnectedWifi, List list, List list2, List list3, int i, ca0 ca0Var) {
        LocationConnectedWifi locationConnectedWifi2 = (i & 2) != 0 ? null : locationConnectedWifi;
        int i2 = i & 4;
        uj0 uj0Var = uj0.e;
        this(locationRecord, locationConnectedWifi2, i2 != 0 ? uj0Var : list, (i & 8) != 0 ? uj0Var : list2, (i & 16) != 0 ? uj0Var : list3);
    }
}
