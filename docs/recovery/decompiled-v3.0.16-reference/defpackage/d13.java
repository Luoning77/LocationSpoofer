package defpackage;

import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d13 extends IOException {
    public final int e;

    /* JADX WARN: Illegal instructions before constructor call */
    public d13(int i) {
        String str;
        if (i == 0) {
            throw null;
        }
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case Logger.WARN /* 5 */:
                str = "SETTINGS_TIMEOUT";
                break;
            case Logger.ERROR /* 6 */:
                str = "STREAM_CLOSED";
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                str = "FRAME_SIZE_ERROR";
                break;
            case 8:
                str = "REFUSED_STREAM";
                break;
            case mc0.b /* 9 */:
                str = "CANCEL";
                break;
            case mc0.c /* 10 */:
                str = "COMPRESSION_ERROR";
                break;
            case 11:
                str = "CONNECT_ERROR";
                break;
            case mc0.d /* 12 */:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 13:
                str = "INADEQUATE_SECURITY";
                break;
            case 14:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.e = i;
    }
}
