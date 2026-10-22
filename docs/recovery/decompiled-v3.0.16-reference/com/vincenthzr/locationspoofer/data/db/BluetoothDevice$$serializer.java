package com.vincenthzr.locationspoofer.data.db;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k13;
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
public final /* synthetic */ class BluetoothDevice$$serializer implements uv0 {
    public static final BluetoothDevice$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        BluetoothDevice$$serializer bluetoothDevice$$serializer = new BluetoothDevice$$serializer();
        INSTANCE = bluetoothDevice$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.BluetoothDevice", bluetoothDevice$$serializer, 3);
        n92Var.k("address", false);
        n92Var.k("name", true);
        n92Var.k("scanRecordHex", true);
        descriptor = n92Var;
    }

    private BluetoothDevice$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        k13 k13Var = k13.a;
        return new y81[]{k13Var, k13Var, k13Var};
    }

    @Override // defpackage.y81
    public final BluetoothDevice deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        boolean z = true;
        while (z) {
            int iJ = l30VarB.j(bt2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strN = l30VarB.n(bt2Var, 0);
                i |= 1;
            } else if (iJ == 1) {
                strN2 = l30VarB.n(bt2Var, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    throw new of3(iJ);
                }
                strN3 = l30VarB.n(bt2Var, 2);
                i |= 4;
            }
        }
        l30VarB.a(bt2Var);
        return new BluetoothDevice(i, strN, strN2, strN3, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, BluetoothDevice bluetoothDevice) {
        ak0Var.getClass();
        bluetoothDevice.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        BluetoothDevice.write$Self$core_data_globalRelease(bluetoothDevice, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
