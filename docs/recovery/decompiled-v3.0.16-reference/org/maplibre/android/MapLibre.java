package org.maplibre.android;

import android.content.Context;
import android.content.res.AssetManager;
import defpackage.az2;
import defpackage.dn0;
import defpackage.fk3;
import defpackage.fp1;
import defpackage.iv;
import defpackage.jv1;
import defpackage.k91;
import defpackage.ma3;
import defpackage.na3;
import defpackage.q73;
import defpackage.tf2;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.net.a;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.util.DefaultStyle;
import org.maplibre.android.util.TileServerOptions;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MapLibre {
    private static MapLibre INSTANCE = null;
    private static final String TAG = "Mbgl-MapLibre";
    private static jv1 moduleProvider;
    private String apiKey;
    private Context context;
    private TileServerOptions tileServerOptions;

    public MapLibre(Context context, String str, TileServerOptions tileServerOptions) {
        this.context = context;
        this.apiKey = str;
        this.tileServerOptions = tileServerOptions;
    }

    public static String getApiKey() {
        validateMapLibre();
        return INSTANCE.apiKey;
    }

    public static Context getApplicationContext() {
        validateMapLibre();
        return INSTANCE.context;
    }

    private static AssetManager getAssetManager() {
        return getApplicationContext().getResources().getAssets();
    }

    public static synchronized MapLibre getInstance(Context context, String str, fk3 fk3Var, tf2 tf2Var) {
        try {
            q73.a = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
            q73.a(TAG);
            MapLibre mapLibre = INSTANCE;
            if (mapLibre == null) {
                na3.a(new ma3[0]);
                Context applicationContext = context.getApplicationContext();
                if (tf2Var == null) {
                    tf2Var = RenderingEngine.getDefaultRenderingEngine(applicationContext);
                }
                RenderingEngine.setCurrentType(tf2Var);
                ReentrantLock reentrantLock = FileSource.a;
                q73.a("Mbgl-FileSource");
                new dn0().execute(applicationContext);
                INSTANCE = new MapLibre(applicationContext, str);
                a.a(applicationContext);
            } else {
                mapLibre.apiKey = str;
            }
            TileServerOptions tileServerOptionsA = TileServerOptions.a(fk3Var);
            INSTANCE.tileServerOptions = tileServerOptionsA;
            FileSource fileSourceB = FileSource.b(context);
            fileSourceB.setTileServerOptions(tileServerOptionsA);
            fileSourceB.setApiKey(str);
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    public static jv1 getModuleProvider() {
        jv1 jv1Var = moduleProvider;
        if (jv1Var != null) {
            return jv1Var;
        }
        k91 k91Var = new k91(7);
        moduleProvider = k91Var;
        return k91Var;
    }

    public static DefaultStyle getPredefinedStyle(String str) {
        validateMapLibre();
        TileServerOptions tileServerOptions = INSTANCE.tileServerOptions;
        if (tileServerOptions == null) {
            return null;
        }
        for (DefaultStyle defaultStyle : tileServerOptions.b()) {
            if (defaultStyle.a().equalsIgnoreCase(str)) {
                return defaultStyle;
            }
        }
        return null;
    }

    public static DefaultStyle[] getPredefinedStyles() {
        validateMapLibre();
        TileServerOptions tileServerOptions = INSTANCE.tileServerOptions;
        if (tileServerOptions != null) {
            return tileServerOptions.b();
        }
        return null;
    }

    public static TileServerOptions getTileServerOptions() {
        validateMapLibre();
        return INSTANCE.tileServerOptions;
    }

    public static boolean hasInstance() {
        return INSTANCE != null;
    }

    public static boolean isApiKeyValid(String str) {
        if (str == null) {
            return false;
        }
        return !str.trim().toLowerCase(fp1.a).isEmpty();
    }

    public static synchronized Boolean isConnected() {
        a aVarA;
        Boolean bool;
        validateMapLibre();
        aVarA = a.a(INSTANCE.context);
        bool = aVarA.d;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : aVarA.b());
    }

    public static void setApiKey(String str) {
        validateMapLibre();
        throwIfApiKeyInvalid(str);
        INSTANCE.apiKey = str;
        FileSource.b(getApplicationContext()).setApiKey(str);
    }

    public static synchronized void setConnected(Boolean bool) {
        validateMapLibre();
        a aVarA = a.a(INSTANCE.context);
        aVarA.d = bool;
        aVarA.c(bool != null ? bool.booleanValue() : aVarA.b());
    }

    public static void setModuleProvider(jv1 jv1Var) {
        moduleProvider = jv1Var;
    }

    public static void throwIfApiKeyInvalid(String str) {
        if (!isApiKeyValid(str)) {
            throw new iv(az2.j("A valid API key is required, currently provided key is: ", str));
        }
    }

    private static void validateMapLibre() {
        if (INSTANCE == null) {
            throw new iv();
        }
    }

    public MapLibre(Context context, String str) {
        this.context = context;
        this.apiKey = str;
    }

    public static synchronized MapLibre getInstance(Context context) {
        return getInstance(context, null, fk3.MapLibre);
    }

    public static synchronized MapLibre getInstance(Context context, String str, fk3 fk3Var) {
        return getInstance(context, str, fk3Var, null);
    }
}
