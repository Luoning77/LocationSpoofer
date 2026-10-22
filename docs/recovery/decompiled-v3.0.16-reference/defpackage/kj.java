package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import org.maplibre.android.MapLibre;
import org.maplibre.android.maps.g;
import org.maplibre.android.maps.l;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kj {
    public final l a;
    public final int b;
    public Bitmap c;
    public int d;
    public int e;
    public PointF f;
    public final RectF g;
    public RectF h;
    public long i;

    public kj(g gVar) {
        new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = -1L;
        this.a = gVar.c;
        this.b = (int) (MapLibre.getApplicationContext().getResources().getDisplayMetrics().density * 32.0f);
    }
}
