package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nz {
    public static final /* synthetic */ nz[] e = {new nz("System", 0), new nz("Light", 1), new nz("Dark", 2), new nz("MonetSystem", 3), new nz("MonetLight", 4), new nz("MonetDark", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    nz EF5;

    public static nz valueOf(String str) {
        return (nz) Enum.valueOf(nz.class, str);
    }

    public static nz[] values() {
        return (nz[]) e.clone();
    }
}
