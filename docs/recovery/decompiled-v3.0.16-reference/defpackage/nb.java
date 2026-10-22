package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nb implements ViewTranslationCallback {
    public static final nb a = new nb();

    public final boolean onClearTranslation(View view) {
        au0 au0Var;
        view.getClass();
        yb contentCaptureManager$ui = ((db) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = tb.e;
        f41 f41VarC = contentCaptureManager$ui.c();
        Object[] objArr = f41VarC.c;
        long[] jArr = f41VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zx1 zx1Var = ((ls2) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = zx1Var.g(os2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = zx1Var.g(ds2.n);
                            z0 z0Var = (z0) (objG2 != null ? objG2 : null);
                            if (z0Var != null && (au0Var = (au0) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        lu0 lu0Var;
        view.getClass();
        yb contentCaptureManager$ui = ((db) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = tb.e;
        f41 f41VarC = contentCaptureManager$ui.c();
        Object[] objArr = f41VarC.c;
        long[] jArr = f41VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zx1 zx1Var = ((ls2) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = zx1Var.g(os2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (o51.f(objG, Boolean.TRUE)) {
                            Object objG2 = zx1Var.g(ds2.m);
                            z0 z0Var = (z0) (objG2 != null ? objG2 : null);
                            if (z0Var != null && (lu0Var = (lu0) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        lu0 lu0Var;
        view.getClass();
        yb contentCaptureManager$ui = ((db) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.i = tb.f;
        f41 f41VarC = contentCaptureManager$ui.c();
        Object[] objArr = f41VarC.c;
        long[] jArr = f41VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zx1 zx1Var = ((ls2) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = zx1Var.g(os2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (o51.f(objG, Boolean.FALSE)) {
                            Object objG2 = zx1Var.g(ds2.m);
                            z0 z0Var = (z0) (objG2 != null ? objG2 : null);
                            if (z0Var != null && (lu0Var = (lu0) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
