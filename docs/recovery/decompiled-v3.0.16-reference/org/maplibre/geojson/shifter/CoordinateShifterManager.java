package org.maplibre.geojson.shifter;

import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.Point;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CoordinateShifterManager {
    private static final CoordinateShifter DEFAULT;
    private static volatile CoordinateShifter coordinateShifter;

    static {
        CoordinateShifter coordinateShifter2 = new CoordinateShifter() { // from class: org.maplibre.geojson.shifter.CoordinateShifterManager.1
            @Override // org.maplibre.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLat(double d, double d2) {
                return Arrays.asList(Double.valueOf(d), Double.valueOf(d2));
            }

            @Override // org.maplibre.geojson.shifter.CoordinateShifter
            public List<Double> shiftLonLatAlt(double d, double d2, double d3) {
                return Double.isNaN(d3) ? Arrays.asList(Double.valueOf(d), Double.valueOf(d2)) : Arrays.asList(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3));
            }

            @Override // org.maplibre.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(Point point) {
                return point.coordinates();
            }

            @Override // org.maplibre.geojson.shifter.CoordinateShifter
            public List<Double> unshiftPoint(List<Double> list) {
                return list;
            }
        };
        DEFAULT = coordinateShifter2;
        coordinateShifter = coordinateShifter2;
    }

    public static CoordinateShifter getCoordinateShifter() {
        return coordinateShifter;
    }

    public static boolean isUsingDefaultShifter() {
        return coordinateShifter == DEFAULT;
    }

    public static void setCoordinateShifter(CoordinateShifter coordinateShifter2) {
        if (coordinateShifter2 == null) {
            coordinateShifter2 = DEFAULT;
        }
        coordinateShifter = coordinateShifter2;
    }
}
