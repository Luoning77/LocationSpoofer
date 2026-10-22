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

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class LocationWithBluetooth$$serializer implements uv0 {
    public static final LocationWithBluetooth$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        LocationWithBluetooth$$serializer locationWithBluetooth$$serializer = new LocationWithBluetooth$$serializer();
        INSTANCE = locationWithBluetooth$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.LocationWithBluetooth", locationWithBluetooth$$serializer, 2);
        n92Var.k("locationBluetooth", false);
        n92Var.k("device", false);
        descriptor = n92Var;
    }

    private LocationWithBluetooth$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        return new y81[]{LocationBluetooth$$serializer.INSTANCE, BluetoothDevice$$serializer.INSTANCE};
    }

    @Override // defpackage.y81
    public final LocationWithBluetooth deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        ht2 ht2Var = null;
        boolean z = true;
        int i = 0;
        LocationBluetooth locationBluetooth = null;
        BluetoothDevice bluetoothDevice = null;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                locationBluetooth = (LocationBluetooth) l30VarB.u(bt2Var, 0, LocationBluetooth$$serializer.INSTANCE, locationBluetooth);
                i |= 1;
            } else {
                if (iJ != 1) {
                    throw new of3(iJ);
                }
                bluetoothDevice = (BluetoothDevice) l30VarB.u(bt2Var, 1, BluetoothDevice$$serializer.INSTANCE, bluetoothDevice);
                i |= 2;
            }
        }
        l30VarB.a(bt2Var);
        return new LocationWithBluetooth(i, locationBluetooth, bluetoothDevice, ht2Var);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, LocationWithBluetooth locationWithBluetooth) {
        ak0Var.getClass();
        locationWithBluetooth.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        LocationWithBluetooth.write$Self$core_data_globalRelease(locationWithBluetooth, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
