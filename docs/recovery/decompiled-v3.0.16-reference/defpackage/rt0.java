package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rt0 implements s23 {
    public static final String[] f = new String[0];
    public static final zb1 g;
    public static final zb1 h;
    public final SQLiteDatabase e;

    static {
        qe0 qe0Var = new qe0(7);
        ce1 ce1Var = ce1.f;
        g = ig0.A(ce1Var, qe0Var);
        h = ig0.A(ce1Var, new qe0(8));
    }

    public rt0(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    @Override // defpackage.s23
    public final boolean E() {
        return this.e.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.s23
    public final boolean H() {
        return this.e.enableWriteAheadLogging();
    }

    @Override // defpackage.s23
    public final void J() {
        this.e.setTransactionSuccessful();
    }

    @Override // defpackage.s23
    public final Cursor K(v23 v23Var, CancellationSignal cancellationSignal) {
        Cursor cursorRawQueryWithFactory = this.e.rawQueryWithFactory(new qt0(v23Var, 0), v23Var.d(), f, null, cancellationSignal);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.s23
    public final void L(String str, Object[] objArr) {
        this.e.execSQL(str, objArr);
    }

    @Override // defpackage.s23
    public final void N() {
        this.e.beginTransactionNonExclusive();
    }

    @Override // defpackage.s23
    public final Cursor W(String str) {
        return k(new z92(3, str, null));
    }

    @Override // defpackage.s23
    public final boolean c() {
        return this.e.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.s23
    public final void g() {
        this.e.endTransaction();
    }

    @Override // defpackage.s23
    public final void h() {
        this.e.beginTransaction();
    }

    @Override // defpackage.s23
    public final boolean isOpen() {
        return this.e.isOpen();
    }

    @Override // defpackage.s23
    public final Cursor k(v23 v23Var) {
        Cursor cursorRawQueryWithFactory = this.e.rawQueryWithFactory(new qt0(new oe(v23Var, 1), 1), v23Var.d(), f, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.s23
    public final void p() {
        this.e.disableWriteAheadLogging();
    }

    @Override // defpackage.s23
    public final void q(String str) {
        this.e.execSQL(str);
    }

    @Override // defpackage.s23
    public final a33 t(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new yt0(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.s23
    public final void w() throws IllegalAccessException, InvocationTargetException {
        zb1 zb1Var = h;
        if (((Method) zb1Var.getValue()) != null) {
            zb1 zb1Var2 = g;
            if (((Method) zb1Var2.getValue()) != null) {
                Method method = (Method) zb1Var.getValue();
                method.getClass();
                Method method2 = (Method) zb1Var2.getValue();
                method2.getClass();
                Object objInvoke = method2.invoke(this.e, null);
                if (objInvoke != null) {
                    method.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    fo.n("Required value was null.");
                    return;
                }
            }
        }
        h();
    }
}
