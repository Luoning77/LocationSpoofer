package org.maplibre.geojson.utils;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = (long) (9.223372036854776E18d / 1.0E7d);
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d) {
        long j = MAX_DOUBLE_TO_ROUND;
        return (d > ((double) j) || d < ((double) (-j))) ? d : Math.round(d * ROUND_PRECISION) / ROUND_PRECISION;
    }
}
