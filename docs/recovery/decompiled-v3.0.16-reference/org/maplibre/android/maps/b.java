package org.maplibre.android.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.fo;
import defpackage.n01;
import defpackage.q01;
import defpackage.ty1;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.maplibre.android.MapLibre;
import org.maplibre.android.annotations.Marker;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b {
    public final HashMap a = new HashMap();
    public final ty1 b;
    public int c;
    public int d;

    public b(ty1 ty1Var) {
        this.b = ty1Var;
    }

    public final void a(n01 n01Var) {
        HashMap map = this.a;
        if (map.keySet().contains(n01Var)) {
            map.put(n01Var, Integer.valueOf(((Integer) map.get(n01Var)).intValue() + 1));
        } else {
            map.put(n01Var, 1);
            d(n01Var);
        }
    }

    public final int b(n01 n01Var) {
        String str = n01Var.b;
        NativeMapView nativeMapView = (NativeMapView) this.b;
        return (int) (nativeMapView.t(str) * ((double) nativeMapView.e));
    }

    public final n01 c(Marker marker) {
        q01 q01VarF = q01.f(MapLibre.getApplicationContext());
        n01 n01VarC = (n01) q01VarF.d;
        if (n01VarC == null) {
            Drawable drawable = ((Context) q01VarF.c).getDrawable(2131165288);
            if (drawable == null) {
                drawable = null;
            }
            if (!(drawable instanceof BitmapDrawable)) {
                fo.i("Failed to decode image. The resource provided must be a Bitmap.");
                return null;
            }
            n01VarC = q01VarF.c(((BitmapDrawable) drawable).getBitmap());
            q01VarF.d = n01VarC;
        }
        Bitmap bitmapA = n01VarC.a();
        int width = bitmapA.getWidth();
        int height = bitmapA.getHeight() / 2;
        if (width > this.c) {
            this.c = width;
        }
        if (height > this.d) {
            this.d = height;
        }
        marker.b(n01VarC);
        return n01VarC;
    }

    public final void d(n01 n01Var) {
        Bitmap bitmapA = n01Var.a();
        String str = n01Var.b;
        int width = bitmapA.getWidth();
        int height = bitmapA.getHeight();
        Bitmap bitmap = n01Var.a;
        if (bitmap == null) {
            fo.n("Required to set a Icon before calling getScale");
            return;
        }
        float density = bitmap.getDensity();
        if (density == 0.0f) {
            density = 160.0f;
        }
        float f = density / 160.0f;
        Bitmap bitmap2 = n01Var.a;
        if (bitmap2 == null) {
            fo.n("Required to set a Icon before calling toBytes");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(n01Var.a.getHeight() * bitmap2.getRowBytes());
        n01Var.a.copyPixelsToBuffer(byteBufferAllocate);
        ((NativeMapView) this.b).a(str, width, height, f, byteBufferAllocate.array());
    }
}
