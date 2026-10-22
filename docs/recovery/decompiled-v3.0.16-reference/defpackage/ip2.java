package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ip2 {
    public static final ip2 e;
    public static final ip2 f;
    public static final /* synthetic */ ip2[] g;

    static {
        ip2 ip2Var = new ip2("Inherit", 0);
        e = ip2Var;
        ip2 ip2Var2 = new ip2("SecureOn", 1);
        f = ip2Var2;
        g = new ip2[]{ip2Var, ip2Var2, new ip2("SecureOff", 2)};
    }

    public static ip2 valueOf(String str) {
        return (ip2) Enum.valueOf(ip2.class, str);
    }

    public static ip2[] values() {
        return (ip2[]) g.clone();
    }
}
