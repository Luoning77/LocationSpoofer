package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u60 {
    public static final u60 e;
    public static final /* synthetic */ u60[] f;

    static {
        u60 u60Var = new u60("All", 0);
        e = u60Var;
        f = new u60[]{u60Var, new u60("Customized", 1), new u60("UserApps", 2), new u60("SystemApps", 3)};
    }

    public static u60 valueOf(String str) {
        return (u60) Enum.valueOf(u60.class, str);
    }

    public static u60[] values() {
        return (u60[]) f.clone();
    }
}
