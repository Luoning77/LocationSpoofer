package org.maplibre.android.style.sources;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CustomVectorSource extends Source {
    private final void cancelTile(int i, int i2, int i3) {
        throw null;
    }

    private final void fetchTile(int i, int i2, int i3) {
        throw null;
    }

    private final native void initialize(String str, int i, int i2);

    private final native void nativeInvalidateTile(int i, int i2, int i3);

    private final native void nativeSetTileData(int i, int i2, int i3, byte[] bArr, int i4);

    private final native void nativeSetTileError(int i, int i2, int i3, String str);

    private final void onRemovedFromMap() {
        throw null;
    }

    public final native void finalize();

    private final void onAddedToMap() {
    }
}
