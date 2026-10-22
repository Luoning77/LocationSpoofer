package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o43 {
    public static final o43 e;
    public static final /* synthetic */ o43[] f;

    static {
        o43 o43Var = new o43("All", 0);
        e = o43Var;
        f = new o43[]{o43Var, new o43("Selected", 1), new o43("UserApps", 2), new o43("SystemApps", 3)};
    }

    public static o43 valueOf(String str) {
        return (o43) Enum.valueOf(o43.class, str);
    }

    public static o43[] values() {
        return (o43[]) f.clone();
    }
}
