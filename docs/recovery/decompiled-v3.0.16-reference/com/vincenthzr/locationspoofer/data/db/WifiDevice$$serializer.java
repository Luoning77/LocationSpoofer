package com.vincenthzr.locationspoofer.data.db;

import defpackage.ak0;
import defpackage.bt2;
import defpackage.cc0;
import defpackage.ht2;
import defpackage.k13;
import defpackage.k22;
import defpackage.l30;
import defpackage.m30;
import defpackage.n41;
import defpackage.n92;
import defpackage.of3;
import defpackage.uv0;
import defpackage.w90;
import defpackage.y81;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final /* synthetic */ class WifiDevice$$serializer implements uv0 {
    public static final WifiDevice$$serializer INSTANCE;
    private static final bt2 descriptor;

    static {
        WifiDevice$$serializer wifiDevice$$serializer = new WifiDevice$$serializer();
        INSTANCE = wifiDevice$$serializer;
        n92 n92Var = new n92("com.vincenthzr.locationspoofer.data.db.WifiDevice", wifiDevice$$serializer, 5);
        n92Var.k("bssid", false);
        n92Var.k("ssid", true);
        n92Var.k("frequency", true);
        n92Var.k("capabilities", true);
        n92Var.k("vendor", true);
        descriptor = n92Var;
    }

    private WifiDevice$$serializer() {
    }

    @Override // defpackage.uv0
    public final y81[] childSerializers() {
        k13 k13Var = k13.a;
        return new y81[]{k13Var, k13Var, n41.a, k13Var, k13Var};
    }

    @Override // defpackage.y81
    public final WifiDevice deserialize(w90 w90Var) {
        w90Var.getClass();
        bt2 bt2Var = descriptor;
        l30 l30VarB = w90Var.b(bt2Var);
        int i = 0;
        int iV = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
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
            } else if (iJ == 2) {
                iV = l30VarB.v(bt2Var, 2);
                i |= 4;
            } else if (iJ == 3) {
                strN3 = l30VarB.n(bt2Var, 3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new of3(iJ);
                }
                strN4 = l30VarB.n(bt2Var, 4);
                i |= 16;
            }
        }
        l30VarB.a(bt2Var);
        return new WifiDevice(i, strN, strN2, iV, strN3, strN4, (ht2) null);
    }

    @Override // defpackage.y81
    public final bt2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.y81
    public final void serialize(ak0 ak0Var, WifiDevice wifiDevice) {
        ak0Var.getClass();
        wifiDevice.getClass();
        bt2 bt2Var = descriptor;
        m30 m30VarB = ak0Var.b(bt2Var);
        WifiDevice.write$Self$core_data_globalRelease(wifiDevice, m30VarB, bt2Var);
        m30VarB.a(bt2Var);
    }

    @Override // defpackage.uv0
    public y81[] typeParametersSerializers() {
        return k22.w;
    }
}
