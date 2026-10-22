package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nx {
    public static final nx e;
    public static final nx f;
    public static final nx g;
    public static final /* synthetic */ nx[] h;

    static {
        nx nxVar = new nx("NONE", 0);
        e = nxVar;
        nx nxVar2 = new nx("ALL_JSON_OBJECTS", 1);
        f = nxVar2;
        nx nxVar3 = new nx("POLYMORPHIC", 2);
        g = nxVar3;
        h = new nx[]{nxVar, nxVar2, nxVar3};
    }

    public static nx valueOf(String str) {
        return (nx) Enum.valueOf(nx.class, str);
    }

    public static nx[] values() {
        return (nx[]) h.clone();
    }
}
