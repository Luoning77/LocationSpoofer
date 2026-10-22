package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class db1 {
    public static final db1 e;
    public static final db1 f;
    public static final db1 g;
    public static final db1 h;
    public static final db1 i;
    public static final /* synthetic */ db1[] j;

    static {
        db1 db1Var = new db1("Measuring", 0);
        e = db1Var;
        db1 db1Var2 = new db1("LookaheadMeasuring", 1);
        f = db1Var2;
        db1 db1Var3 = new db1("LayingOut", 2);
        g = db1Var3;
        db1 db1Var4 = new db1("LookaheadLayingOut", 3);
        h = db1Var4;
        db1 db1Var5 = new db1("Idle", 4);
        i = db1Var5;
        j = new db1[]{db1Var, db1Var2, db1Var3, db1Var4, db1Var5};
    }

    public static db1 valueOf(String str) {
        return (db1) Enum.valueOf(db1.class, str);
    }

    public static db1[] values() {
        return (db1[]) j.clone();
    }
}
