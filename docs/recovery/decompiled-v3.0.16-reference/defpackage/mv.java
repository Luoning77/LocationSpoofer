package defpackage;

import java.util.Arrays;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mv implements lv {
    public final LatLngBounds a;
    public final Double b;
    public final Double c;
    public final int[] d;

    public mv(LatLngBounds latLngBounds, Double d, Double d2, int i, int i2, int i3, int i4) {
        this.a = latLngBounds;
        this.b = d;
        this.c = d2;
        this.d = new int[]{i, i2, i3, i4};
    }

    @Override // defpackage.lv
    public final CameraPosition a(g gVar) {
        gVar.getClass();
        return gVar.g(this.a, this.d, this.b.doubleValue(), this.c.doubleValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !mv.class.equals(obj.getClass())) {
            return false;
        }
        mv mvVar = (mv) obj;
        if (this.a.equals(mvVar.a)) {
            return Arrays.equals(this.d, mvVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        string.getClass();
        return "CameraBoundsUpdate{bounds=" + this.a + ", padding=" + string + "}";
    }
}
