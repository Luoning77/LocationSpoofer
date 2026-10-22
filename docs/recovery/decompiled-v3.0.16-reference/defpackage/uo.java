package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class uo {
    public static final int a;

    static {
        Object wg2Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            wg2Var = property != null ? s13.a0(property) : null;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        Integer num = (Integer) (wg2Var instanceof wg2 ? null : wg2Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
