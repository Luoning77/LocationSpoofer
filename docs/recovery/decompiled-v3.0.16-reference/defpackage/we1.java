package defpackage;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class we1 {
    public static final we1 e;
    public static final we1 f;
    public static final we1 g;
    public static final we1 h;
    public static final we1 i;
    public static final /* synthetic */ we1[] j;

    static {
        we1 we1Var = new we1("DESTROYED", 0);
        e = we1Var;
        we1 we1Var2 = new we1("INITIALIZED", 1);
        f = we1Var2;
        we1 we1Var3 = new we1(DebugCoroutineInfoImplKt.CREATED, 2);
        g = we1Var3;
        we1 we1Var4 = new we1("STARTED", 3);
        h = we1Var4;
        we1 we1Var5 = new we1("RESUMED", 4);
        i = we1Var5;
        j = new we1[]{we1Var, we1Var2, we1Var3, we1Var4, we1Var5};
    }

    public static we1 valueOf(String str) {
        return (we1) Enum.valueOf(we1.class, str);
    }

    public static we1[] values() {
        return (we1[]) j.clone();
    }
}
