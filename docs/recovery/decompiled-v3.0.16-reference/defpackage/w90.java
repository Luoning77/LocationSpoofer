package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface w90 {
    double A();

    l30 b(bt2 bt2Var);

    default Object c(y81 y81Var) {
        y81Var.getClass();
        return y81Var.deserialize(this);
    }

    long d();

    boolean f();

    boolean g();

    char h();

    int o();

    byte r();

    w90 t(bt2 bt2Var);

    short w();

    String x();

    float y();
}
