package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fi0 {
    public static final fi0 e;
    public static final /* synthetic */ fi0[] f;

    static {
        fi0 fi0Var = new fi0("WIFI", 0);
        e = fi0Var;
        f = new fi0[]{fi0Var, new fi0("CELL", 1), new fi0("BLUETOOTH", 2)};
    }

    public static fi0 valueOf(String str) {
        return (fi0) Enum.valueOf(fi0.class, str);
    }

    public static fi0[] values() {
        return (fi0[]) f.clone();
    }
}
