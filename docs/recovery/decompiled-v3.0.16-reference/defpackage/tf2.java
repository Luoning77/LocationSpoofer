package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tf2 {
    private static final /* synthetic */ tf2[] $VALUES;
    public static final tf2 OPENGL;
    public static final tf2 VULKAN;

    static {
        tf2 tf2Var = new tf2("OPENGL", 0);
        OPENGL = tf2Var;
        tf2 tf2Var2 = new tf2("VULKAN", 1);
        VULKAN = tf2Var2;
        $VALUES = new tf2[]{tf2Var, tf2Var2};
    }

    public static tf2 valueOf(String str) {
        return (tf2) Enum.valueOf(tf2.class, str);
    }

    public static tf2[] values() {
        return (tf2[]) $VALUES.clone();
    }
}
