package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ie2 {
    public static final ie2 e;
    public static final ie2 f;
    public static final ie2 g;
    public static final ie2 h;
    public static final ie2 i;
    public static final ie2 j;
    public static final /* synthetic */ ie2[] k;

    static {
        ie2 ie2Var = new ie2("ShutDown", 0);
        e = ie2Var;
        ie2 ie2Var2 = new ie2("ShuttingDown", 1);
        f = ie2Var2;
        ie2 ie2Var3 = new ie2("Inactive", 2);
        g = ie2Var3;
        ie2 ie2Var4 = new ie2("InactivePendingWork", 3);
        h = ie2Var4;
        ie2 ie2Var5 = new ie2("Idle", 4);
        i = ie2Var5;
        ie2 ie2Var6 = new ie2("PendingWork", 5);
        j = ie2Var6;
        k = new ie2[]{ie2Var, ie2Var2, ie2Var3, ie2Var4, ie2Var5, ie2Var6};
    }

    public static ie2 valueOf(String str) {
        return (ie2) Enum.valueOf(ie2.class, str);
    }

    public static ie2[] values() {
        return (ie2[]) k.clone();
    }
}
