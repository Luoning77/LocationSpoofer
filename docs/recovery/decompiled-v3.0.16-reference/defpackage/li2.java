package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class li2 implements mi2 {
    private final String identityHash;
    private final String legacyIdentityHash;
    private final int version;

    public li2(int i, String str, String str2) {
        this.version = i;
        this.identityHash = str;
        this.legacyIdentityHash = str2;
    }

    public abstract void createAllTables(zk2 zk2Var);

    public abstract void dropAllTables(zk2 zk2Var);

    public final String getIdentityHash() {
        return this.identityHash;
    }

    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    public final int getVersion() {
        return this.version;
    }

    public abstract void onCreate(zk2 zk2Var);

    public abstract void onOpen(zk2 zk2Var);

    public abstract void onPostMigrate(zk2 zk2Var);

    public abstract void onPreMigrate(zk2 zk2Var);

    public abstract ki2 onValidateSchema(zk2 zk2Var);
}
