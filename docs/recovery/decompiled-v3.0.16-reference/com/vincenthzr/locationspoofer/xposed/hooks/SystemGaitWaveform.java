package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.fo;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemGaitWaveform {
    private static final double GRAVITY = 9.80665d;
    public static final SystemGaitWaveform INSTANCE = new SystemGaitWaveform();
    private static final int SAMPLES = 64;

    private SystemGaitWaveform() {
    }

    public final float[] create(double d) {
        if (Math.abs(d) > Double.MAX_VALUE || d < 0.0d) {
            fo.i("Failed requirement.");
            return null;
        }
        double d2 = (d >= 2.2d ? (d * 1.5d) + 6.0d : d + 2.0d) * 0.65d;
        if (d2 > 8.0d) {
            d2 = 8.0d;
        }
        float[] fArr = new float[192];
        for (int i = 0; i < SAMPLES; i++) {
            double d3 = (((double) i) * 6.283185307179586d) / 64.0d;
            fArr[i] = (float) (Math.sin(d3) * 0.12d * d2);
            double d4 = d3 * 2.0d;
            fArr[i + SAMPLES] = (float) (Math.sin(d4) * 0.18d * d2);
            fArr[i + WorkQueueKt.BUFFER_CAPACITY] = (float) ((Math.cos(d4) * d2) + GRAVITY);
        }
        return fArr;
    }
}
