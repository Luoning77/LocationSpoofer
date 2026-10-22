package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tb {
    public static final tb e;
    public static final tb f;
    public static final /* synthetic */ tb[] g;

    static {
        tb tbVar = new tb("SHOW_ORIGINAL", 0);
        e = tbVar;
        tb tbVar2 = new tb("SHOW_TRANSLATED", 1);
        f = tbVar2;
        g = new tb[]{tbVar, tbVar2};
    }

    public static tb valueOf(String str) {
        return (tb) Enum.valueOf(tb.class, str);
    }

    public static tb[] values() {
        return (tb[]) g.clone();
    }
}
