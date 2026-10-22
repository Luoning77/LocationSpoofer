package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class fa {
    public static /* synthetic */ BlendModeColorFilter c(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession e(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void g() {
    }

    public static /* bridge */ /* synthetic */ boolean t(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}
