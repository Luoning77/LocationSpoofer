package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface s23 extends Closeable {
    boolean E();

    boolean H();

    void J();

    Cursor K(v23 v23Var, CancellationSignal cancellationSignal);

    void L(String str, Object[] objArr);

    void N();

    Cursor W(String str);

    boolean c();

    void g();

    void h();

    boolean isOpen();

    Cursor k(v23 v23Var);

    void p();

    void q(String str);

    a33 t(String str);

    void w();
}
