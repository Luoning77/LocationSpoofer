package org.maplibre.android.offline;

import android.os.Parcelable;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface OfflineRegionDefinition extends Parcelable {
    LatLngBounds getBounds();

    boolean getIncludeIdeographs();

    double getMaxZoom();

    double getMinZoom();

    float getPixelRatio();

    String getStyleURL();

    String getType();
}
