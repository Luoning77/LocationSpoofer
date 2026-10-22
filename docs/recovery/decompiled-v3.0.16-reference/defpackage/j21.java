package defpackage;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j21 {
    public WeakReference a;
    public WeakReference b;
    public WeakReference c;
    public float d;
    public float e;
    public float f;
    public PointF g;
    public boolean h;

    public final void a() {
        g gVar = (g) this.b.get();
        if (!this.h || gVar == null) {
            return;
        }
        this.h = false;
        View view = (View) this.c.get();
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        WeakReference weakReference = this.a;
        if (weakReference != null) {
        }
        Object obj = gVar.j.d;
        this.a = new WeakReference(null);
    }

    public final void b(View view, g gVar) {
        this.b = new WeakReference(gVar);
        this.h = false;
        this.c = new WeakReference(view);
        view.setOnClickListener(new t6(this, 2));
        view.setOnLongClickListener(new i21(this));
    }
}
