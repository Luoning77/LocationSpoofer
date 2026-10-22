package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lq {
    public static final /* synthetic */ lq[] e = {new lq("PRESENT", 0), new lq("ABSENT", 1), new lq("PRESENT_OPTIONAL", 2), new lq("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    lq EF5;

    public static lq valueOf(String str) {
        return (lq) Enum.valueOf(lq.class, str);
    }

    public static lq[] values() {
        return (lq[]) e.clone();
    }
}
