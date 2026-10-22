package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class xt0 implements u23 {
    public final SQLiteProgram e;

    public xt0(SQLiteProgram sQLiteProgram) {
        this.e = sQLiteProgram;
    }

    @Override // defpackage.u23
    public final void Q(int i, byte[] bArr) {
        this.e.bindBlob(i, bArr);
    }

    @Override // defpackage.u23
    public final void a(double d, int i) {
        this.e.bindDouble(i, d);
    }

    @Override // defpackage.u23
    public final void b(int i) {
        this.e.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.u23
    public final void e(int i, long j) {
        this.e.bindLong(i, j);
    }

    @Override // defpackage.u23
    public final void f() {
        this.e.clearBindings();
    }

    @Override // defpackage.u23
    public final void r(int i, String str) {
        str.getClass();
        this.e.bindString(i, str);
    }
}
