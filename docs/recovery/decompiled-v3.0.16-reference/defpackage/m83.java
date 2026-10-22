package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m83 {
    public static final m83 e;
    public static final m83 f;
    public static final m83 g;
    public static final m83 h;
    public static final /* synthetic */ m83[] i;

    static {
        m83 m83Var = new m83("StartInput", 0);
        e = m83Var;
        m83 m83Var2 = new m83("StopInput", 1);
        f = m83Var2;
        m83 m83Var3 = new m83("ShowKeyboard", 2);
        g = m83Var3;
        m83 m83Var4 = new m83("HideKeyboard", 3);
        h = m83Var4;
        i = new m83[]{m83Var, m83Var2, m83Var3, m83Var4};
    }

    public static m83 valueOf(String str) {
        return (m83) Enum.valueOf(m83.class, str);
    }

    public static m83[] values() {
        return (m83[]) i.clone();
    }
}
