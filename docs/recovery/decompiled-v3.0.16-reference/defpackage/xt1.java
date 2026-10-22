package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class xt1 {
    public final int endVersion;
    public final int startVersion;

    public xt1(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public abstract void migrate(s23 s23Var);

    public void migrate(zk2 zk2Var) {
        zk2Var.getClass();
        if (!(zk2Var instanceof r23)) {
            throw new g02("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        migrate(((r23) zk2Var).e);
    }
}
