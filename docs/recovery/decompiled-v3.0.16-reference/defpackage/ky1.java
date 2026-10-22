package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ky1 {
    public static final ky1 e;
    public static final /* synthetic */ ky1[] f;

    static {
        ky1 ky1Var = new ky1("Default", 0);
        e = ky1Var;
        f = new ky1[]{ky1Var, new ky1("UserInput", 1), new ky1("PreventUserInput", 2)};
    }

    public static ky1 valueOf(String str) {
        return (ky1) Enum.valueOf(ky1.class, str);
    }

    public static ky1[] values() {
        return (ky1[]) f.clone();
    }
}
