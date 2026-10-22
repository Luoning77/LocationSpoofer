package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uf2 {
    public static final uf2 e;
    public static final /* synthetic */ uf2[] f;

    static {
        uf2 uf2Var = new uf2("Restart", 0);
        e = uf2Var;
        f = new uf2[]{uf2Var, new uf2("Reverse", 1)};
    }

    public static uf2 valueOf(String str) {
        return (uf2) Enum.valueOf(uf2.class, str);
    }

    public static uf2[] values() {
        return (uf2[]) f.clone();
    }
}
