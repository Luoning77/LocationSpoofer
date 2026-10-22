package org.maplibre.android;

import android.content.Context;
import defpackage.fo;
import defpackage.tf2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RenderingEngine {
    private static volatile tf2 currentType = tf2.VULKAN;

    private RenderingEngine() {
    }

    public static tf2 getCurrentType() {
        return currentType;
    }

    public static tf2 getDefaultRenderingEngine(Context context) {
        return tf2.VULKAN;
    }

    public static void setCurrentType(tf2 tf2Var) {
        if (MapLibre.hasInstance()) {
            fo.n("RenderingEngine.setCurrentType() must be called before MapLibre.getInstance().");
            return;
        }
        tf2 tf2Var2 = tf2.VULKAN;
        if (tf2Var == tf2Var2) {
            currentType = tf2Var;
            return;
        }
        throw new UnsupportedOperationException("This MapLibre Android build supports only " + tf2Var2 + ". Use the multiBackend flavor to switch backends at runtime.");
    }
}
