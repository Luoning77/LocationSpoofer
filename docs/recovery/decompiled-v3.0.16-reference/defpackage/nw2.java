package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nw2 {
    public static final nw2 e;
    public static final nw2 f;
    public static final /* synthetic */ nw2[] g;

    static {
        nw2 nw2Var = new nw2("THUMB", 0);
        e = nw2Var;
        nw2 nw2Var2 = new nw2("TRACK", 1);
        f = nw2Var2;
        g = new nw2[]{nw2Var, nw2Var2};
    }

    public static nw2 valueOf(String str) {
        return (nw2) Enum.valueOf(nw2.class, str);
    }

    public static nw2[] values() {
        return (nw2[]) g.clone();
    }
}
