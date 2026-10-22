package org.maplibre.android.offline;

import android.os.Handler;
import android.os.Looper;
import defpackage.se1;
import org.maplibre.android.MapLibre;
import org.maplibre.android.storage.FileSource;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class OfflineRegion {
    public final FileSource a;
    public final OfflineRegionDefinition b;
    private final long nativePtr;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public interface OfflineRegionInvalidateCallback {
        void onError(String str);

        void onInvalidate();
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    static {
        se1.a();
    }

    private OfflineRegion(long j, FileSource fileSource, long j2, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        new Handler(Looper.getMainLooper());
        MapLibre.getApplicationContext().getClass();
        this.a = fileSource;
        this.b = offlineRegionDefinition;
        initialize(j, fileSource);
    }

    private final native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    private final native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    private final native void initialize(long j, FileSource fileSource);

    private final native void invalidateOfflineRegion(OfflineRegionInvalidateCallback offlineRegionInvalidateCallback);

    private final native void setOfflineRegionDownloadState(int i);

    private final native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    private final native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    public final native void finalize();
}
