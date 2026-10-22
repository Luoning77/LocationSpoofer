package defpackage;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class pl0 {
    public static /* bridge */ /* synthetic */ CellIdentityNr g(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr h(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr j(CellSignalStrength cellSignalStrength) {
        return (CellSignalStrengthNr) cellSignalStrength;
    }

    public static /* bridge */ /* synthetic */ boolean t(CellSignalStrength cellSignalStrength) {
        return cellSignalStrength instanceof CellSignalStrengthNr;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof CellIdentityNr;
    }
}
