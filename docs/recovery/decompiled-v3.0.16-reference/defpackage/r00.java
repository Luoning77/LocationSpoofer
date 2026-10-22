package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r00 extends ImageView implements Runnable {
    public float e;
    public boolean f;
    public sj3 g;
    public d31 h;
    public boolean i;

    public final boolean a() {
        if (this.f) {
            return ((double) Math.abs(this.e)) >= 359.0d || ((double) Math.abs(this.e)) <= 1.0d;
        }
        return false;
    }

    public final void b() {
        sj3 sj3Var = this.g;
        if (sj3Var != null) {
            sj3Var.b();
        }
        this.g = null;
    }

    public final void c(double d) {
        this.e = (float) d;
        if (isEnabled()) {
            if (a()) {
                if (getVisibility() == 4 || this.g != null) {
                    return;
                }
                postDelayed(this, 500L);
                return;
            }
            b();
            setAlpha(1.0f);
            setVisibility(0);
            if (this.i) {
                ((kv) this.h.f).a();
            }
            setRotation(this.e);
        }
    }

    public Drawable getCompassImage() {
        return getDrawable();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (a()) {
            d31 d31Var = this.h;
            r00 r00Var = ((k) d31Var.g).o;
            if (r00Var != null) {
                r00Var.i = false;
            }
            ((kv) d31Var.f).b();
            b();
            setLayerType(2, null);
            sj3 sj3VarA = yi3.a(this);
            sj3VarA.a(0.0f);
            sj3VarA.c(500L);
            this.g = sj3VarA;
            sj3VarA.d(new rk(this, 3));
        }
    }

    public void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z || a()) {
            b();
            setAlpha(0.0f);
            setVisibility(4);
        } else {
            b();
            setAlpha(1.0f);
            setVisibility(0);
            c(this.e);
        }
    }
}
