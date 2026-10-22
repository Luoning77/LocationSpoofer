package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fk3 {
    private static final /* synthetic */ fk3[] $VALUES;
    public static final fk3 MapLibre;
    public static final fk3 MapTiler;
    public static final fk3 Mapbox;

    static {
        fk3 fk3Var = new fk3("Mapbox", 0);
        Mapbox = fk3Var;
        fk3 fk3Var2 = new fk3("MapTiler", 1);
        MapTiler = fk3Var2;
        fk3 fk3Var3 = new fk3("MapLibre", 2);
        MapLibre = fk3Var3;
        $VALUES = new fk3[]{fk3Var, fk3Var2, fk3Var3};
    }

    public static fk3 valueOf(String str) {
        return (fk3) Enum.valueOf(fk3.class, str);
    }

    public static fk3[] values() {
        return (fk3[]) $VALUES.clone();
    }
}
