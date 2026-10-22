package defpackage;

import org.maplibre.android.MapLibre;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class se1 {
    public static volatile se1 a;
    public static boolean b;

    static {
        ((k91) MapLibre.getModuleProvider()).getClass();
        a = new se1();
    }

    public static synchronized void a() {
        try {
            if (!b) {
                b = true;
                a.getClass();
                System.loadLibrary("maplibre");
            }
        } catch (UnsatisfiedLinkError e) {
            b = false;
            Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e);
            xp1.R("Failed to load native shared library.", e);
            try {
                try {
                    try {
                        Class.forName("org.junit.Test");
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (ClassNotFoundException unused2) {
                    Class.forName("android.os.Build");
                    throw e;
                }
            } catch (ClassNotFoundException unused3) {
                Class.forName("org.robolectric.Robolectric");
            }
        }
    }
}
