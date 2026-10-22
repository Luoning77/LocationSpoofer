package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pi {
    public static final pi e;
    public static final pi f;
    public static final /* synthetic */ pi[] g;

    static {
        pi piVar = new pi("BoundReached", 0);
        e = piVar;
        pi piVar2 = new pi("Finished", 1);
        f = piVar2;
        g = new pi[]{piVar, piVar2};
    }

    public static pi valueOf(String str) {
        return (pi) Enum.valueOf(pi.class, str);
    }

    public static pi[] values() {
        return (pi[]) g.clone();
    }
}
