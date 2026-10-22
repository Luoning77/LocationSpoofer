package defpackage;

import android.content.AttributionSource;
import android.content.ClipData;
import android.os.VibratorManager;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract /* synthetic */ class ob {
    public static /* bridge */ /* synthetic */ AttributionSource e(Object obj) {
        return (AttributionSource) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager h(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession l(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse o(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return AttributionSource.class;
    }
}
