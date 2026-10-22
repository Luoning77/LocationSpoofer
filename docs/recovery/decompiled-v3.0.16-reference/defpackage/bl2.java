package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface bl2 extends AutoCloseable {
    void D(int i, String str);

    default boolean I() {
        return getLong(0) != 0;
    }

    boolean R();

    void a(double d, int i);

    void b(int i);

    void e(int i, long j);

    void f();

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    String m(int i);

    void reset();
}
