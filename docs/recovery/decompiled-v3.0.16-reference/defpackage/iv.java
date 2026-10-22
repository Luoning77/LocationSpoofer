package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class iv extends RuntimeException {
    public iv(String str) {
        super("Map detected an error that would fail silently otherwise: ".concat(str));
    }

    public iv() {
        super("\nUsing MapView requires calling MapLibre.getInstance(Context context, String apiKey, WellKnownTileServer wellKnownTileServer) before inflating or creating the view.");
    }
}
