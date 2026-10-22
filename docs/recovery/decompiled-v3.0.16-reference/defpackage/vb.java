package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.location.Location;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class vb {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void b(yb ybVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        ls2 ls2Var;
        js2 js2Var;
        lu0 lu0Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseO = ob.o(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseO != null && (value = viewTranslationResponseO.getValue("android:text")) != null && (text = value.getText()) != null && (ls2Var = (ls2) ybVar.c().b((int) jKeyAt)) != null && (js2Var = ls2Var.a) != null) {
                Object objG = js2Var.d.e.g(ds2.l);
                if (objG == null) {
                    objG = null;
                }
                z0 z0Var = (z0) objG;
                if (z0Var != null && (lu0Var = (lu0) z0Var.b) != null) {
                }
            }
        }
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static boolean e(Location location) {
        return location.isMock();
    }

    public static void f(yb ybVar, long[] jArr, Consumer consumer) {
        js2 js2Var;
        for (long j : jArr) {
            ls2 ls2Var = (ls2) ybVar.c().b((int) j);
            if (ls2Var != null && (js2Var = ls2Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(ybVar.e.getAutofillId(), js2Var.f);
                Object objG = js2Var.d.e.g(os2.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new dj(xg1.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float g(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
