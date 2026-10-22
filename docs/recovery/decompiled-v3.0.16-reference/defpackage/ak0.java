package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ak0 {
    void A(String str);

    m30 b(bt2 bt2Var);

    void c();

    default void e(y81 y81Var, Object obj) {
        y81Var.getClass();
        y81Var.serialize(this, obj);
    }

    void g(double d);

    void h(short s);

    void k(byte b);

    void l(boolean z);

    ak0 m(bt2 bt2Var);

    void q(int i);

    void s(float f);

    void v(long j);

    void x(char c);
}
