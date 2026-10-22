package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yt0 extends xt0 implements a33 {
    public final SQLiteStatement f;

    public yt0(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f = sQLiteStatement;
    }

    @Override // defpackage.a33
    public final void execute() {
        this.f.execute();
    }
}
